package ch11.sec06;

public class Account {
    private int balance;

    public Account() { }

    public long getBalance() {
        return balance;
    }

    public void deposit(int mopney) {
        balance += mopney;
    }

//     잔고보다 인출 금액이 클 경우 우리가 정의한 InsufficientException을 발생시킴
    public void withdraw(int mopney) throws InsufficientException {
        if (balance < mopney) {
//            해당 생성자 내에서 Exception의 생성자로 메시지를 전달함
            throw new InsufficientException("잔고 부족: "+(mopney-balance)+" 모자람");
        }
        balance -= mopney;
    }
}

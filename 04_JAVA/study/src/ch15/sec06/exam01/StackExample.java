package ch15.sec06.exam01;

import  java.util.Stack;

public class StackExample {
    public static void main(String[] args) {
        //Stack 컬렉션 생성
        Stack<Coin> CoinBox = new Stack<Coin>();

        //동전 넣기
//        Stack은 한쪽이 막혀있는 박스라고 생각한다
//        아래쪽부터 차곡차곡 쌓인다
        CoinBox.push(new Coin(100));
        CoinBox.push(new Coin(50));
        CoinBox.push(new Coin(500));
        CoinBox.push(new Coin(10));

        //동전 하나씩 꺼내기
//        LIFO기 때문에 마지막에 넣은 10원부터 춣력된다
//        Last In, First Out
        while (!CoinBox.isEmpty()) {
            Coin coin = CoinBox.pop();
            System.out.println("꺼내온 동전 : " + coin.getValue() + "원");
        }
    }
}

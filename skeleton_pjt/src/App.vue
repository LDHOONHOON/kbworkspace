<template>
  <div class="container">
    <h1>최근 거래 목록</h1>
    <div class="filter">
      <label>조회기간 설정</label>
      <div class="period-options">
        <button onclick="hideCustomInput()">
          오늘
        </button>
        <button onclick="hideCustomInput()">
          1개월
        </button>
        <button onclick="hideCustomInput()">
          3개월
        </button>
        <button onclick="hideCustomInput()">
          6개월
        </button>
        <button onclick="showCustomInput()">
          직접입력
        </button>
      </div>
      <div class="category-filter">
        <label for="category">카테고리</label>
        <select id="category">
          <option value="">카테고리</option>
          <option value="shopping">쇼핑</option>
          <option value="salary">급여</option>
          <option value="transfer">이체</option>
        </select>
      </div>
      <div
        class="custom-input"
        id="customInput"
        style="display: none"
      >
        <label for="startDate">시작 날짜:</label>
        <input type="date" id="startDate" />
        <label for="endDate">종료 날짜:</label>
        <input type="date" id="endDate" />
        <button onclick="applyCustomInput()">
          적용
        </button>
      </div>
    </div>
    <div class="transactions">
      <div class="transaction-date">
        <span>6월 8일</span>
      </div>
      <div class="transaction">
        <div class="icon">
          <i class="fa-solid fa-dollar-sign"></i>
        </div>
        <div class="details">
          <p>출금</p>
          <p>동준씨에게 입금함</p>
        </div>
        <div class="amount">-10,000원</div>
        <div class="balance">60,000원</div>
        <div class="category">이체</div>
      </div>
      <div class="transaction">
        <div class="icon">
          <i class="fa-solid fa-dollar-sign"></i>
        </div>
        <div class="details">
          <p>출금</p>
          <p>동준씨에게 입금함</p>
        </div>
        <div class="amount">-10,000원</div>
        <div class="balance">70,000원</div>
        <div class="category">이체</div>
      </div>
      <div class="transaction-date">
        <span>6월 7일</span>
      </div>
      <div class="transaction">
        <div class="icon">
          <i class="fa-solid fa-dollar-sign"></i>
        </div>
        <div class="details">
          <p>출금</p>
          <p>동준씨에게 입금함</p>
        </div>
        <div class="amount">-10,000원</div>
        <div class="balance">80,000원</div>
        <div class="category">이체</div>
      </div>
      <div class="transaction">
        <div class="icon">
          <i class="fa-solid fa-dollar-sign"></i>
        </div>
        <div class="details">
          <p>출금</p>
          <p>동준씨에게 입금함</p>
        </div>
        <div class="amount">-10,000원</div>
        <div class="balance">90,000원</div>
        <div class="category">이체</div>
      </div>
      <div class="transaction">
        <div class="icon">
          <i class="fa-solid fa-dollar-sign"></i>
        </div>
        <div class="details">
          <p>장보기</p>
          <p>치커리, 샐러드, 토마토 구매함</p>
        </div>
        <div class="amount">-10,000원</div>
        <div class="balance">110,000원</div>
        <div class="category">쇼핑</div>
      </div>
      <div class="transaction">
        <div class="icon">
          <i class="fa-solid fa-dollar-sign"></i>
        </div>
        <div class="details">
          <p>입금</p>
          <p>용돈 받음</p>
        </div>
        <div class="amount">+10,000원</div>
        <div class="balance">120,000원</div>
        <div class="category">급여</div>
      </div>
    </div>
  </div>
  <button class="edit-btn">✎</button>

  <script>
    function showCustomInput() {
      document.getElementById(
        'customInput'
      ).style.display = 'block';
    }

    function hideCustomInput() {
      document.getElementById(
        'customInput'
      ).style.display = 'none';
    }

    function applyCustomInput() {
      const startDate =
        document.getElementById(
          'startDate'
        ).value;
      const endDate =
        document.getElementById('endDate').value;
      alert(
        `Custom date range applied: ${startDate} to ${endDate}`
      );
      // 여기에 필요한 로직 추가
    }
  </script>
</template>

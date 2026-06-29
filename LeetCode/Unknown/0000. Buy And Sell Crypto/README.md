# 🧩 Buy And Sell Crypto

## 📌 문제 정보

| 항목 | 내용 |
| --- | --- |
| 플랫폼 | NeetCode |
| 문제 번호 | - |
| 난이도 | LeetCode |
| 분류 | 수집되지 않음 |
| 언어 | Java |
| 제출 일자 | 2026년 06월 29일 17:40:42 |
| 문제 링크 | [Buy And Sell Crypto](https://leetcode.com/problems/buy-and-sell-crypto/) |
| 원본 경로 | `Data Structures & Algorithms/buy-and-sell-crypto/submission-0.java` |
<!-- AI_ANALYSIS: version=v1 model=gemini-3.1-flash-lite hash=e9e4be10514ba884 -->

## 📝 문제 설명

You are given an integer array `prices` where `prices[i]` is the price of NeetCoin on the `ith` day.

You may choose a **single day** to buy one NeetCoin and choose a **different day in the future** to sell it.

Return the maximum profit you can achieve. You may choose to **not make any transactions**, in which case the profit would be `0`.

**Example 1:**

```text
Input: prices = [10,1,5,6,7,1]

Output: 6
```

Explanation: Buy `prices[1]` and sell `prices[4]`, `profit = 7 - 1 = 6`.

**Example 2:**

```text
Input: prices = [10,8,7,5,2]

Output: 0
```

Explanation: No profitable transactions can be made, thus the max profit is 0.

**Constraints:**

- `1 <= prices.length <= 100`

- `0 <= prices[i] <= 100`

## 📥 입력

```text
prices = [10,1,5,6,7,1]
```

## 📤 출력

```text
6
```

## 💡 핵심 아이디어

- 투 포인터 기법을 사용하여 배열을 한 번만 순회하며 최대 이익을 계산합니다.
- 현재까지의 최저 가격을 유지하면서, 더 낮은 가격을 발견하면 구매 시점을 갱신합니다.
- 현재 가격이 최저 가격보다 높을 경우, 판매 시점의 차익을 계산하여 최대 이익을 갱신합니다.

## 🧮 정답 계산식

최대 이익은 max(현재까지의 최대 이익, 현재 가격 - 현재까지의 최저 가격)으로 갱신하며, 최저 가격보다 낮은 가격이 나오면 구매 시점을 해당 가격으로 변경합니다.

## 🔍 구현 흐름

1. 구매 시점을 가리키는 left 포인터와 판매 시점을 가리키는 right 포인터를 초기화합니다.
2. 배열의 끝까지 right 포인터를 이동하며 반복문을 수행합니다.
3. 현재 가격이 구매 가격보다 낮으면 구매 시점을 현재 위치로 갱신합니다.
4. 현재 가격이 구매 가격보다 높으면 차익을 계산하여 최대 이익 변수를 업데이트합니다.
5. 최종적으로 계산된 최대 이익 값을 반환합니다.

## ⚠️ 주의할 점

- 배열의 길이가 1인 경우 반복문이 실행되지 않으므로 초기값 0이 올바르게 반환되는지 확인해야 합니다.
- 가격이 계속 하락하는 경우 이익이 발생하지 않으므로 0을 반환하도록 초기값을 설정해야 합니다.

## 📁 제출 코드

- 풀이 파일: [solution.java](./solution.java)
- 수집 위치: `Data Structures & Algorithms/buy-and-sell-crypto/submission-0.java`

## ⏱️ 복잡도 분석

- 시간 복잡도: O(n)
- 공간 복잡도: O(1)

## ✅ 한 줄 요약

투 포인터를 활용하여 최저 매수 시점을 추적하며 배열을 한 번 순회함으로써 최대 수익을 구하는 효율적인 알고리즘입니다.

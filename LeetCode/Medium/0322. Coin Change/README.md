# 🧩 Coin Change

## 📌 문제 정보

| 항목 | 내용 |
| --- | --- |
| 플랫폼 | NeetCode |
| 문제 번호 | 322 |
| 난이도 | Medium |
| 분류 | Array, Dynamic Programming, Breadth-First Search |
| 언어 | Java |
| 제출 일자 | 2026년 05월 13일 13:31:02 |
| 문제 링크 | [Coin Change](https://leetcode.com/problems/coin-change/) |
| 원본 경로 | `Data Structures & Algorithms/coin-change/submission-0.java` |
<!-- AI_ANALYSIS: version=v1 model=gemini-3.1-flash-lite hash=a60202641be53a0f -->

## 📝 문제 설명

You are given an integer array `coins` representing coins of different denominations (e.g. 1 dollar, 5 dollars, etc) and an integer `amount` representing a target amount of money.

Return the fewest number of coins that you need to make up the *exact* target amount. If it is impossible to make up the amount, return `-1`.

You may assume that you have an unlimited number of each coin.

**Example 1:**

```text
Input: coins = [1,5,10], amount = 12

Output: 3
```

Explanation: 12 = 10 + 1 + 1. Note that we do not have to use every kind coin available.

**Example 2:**

```text
Input: coins = [2], amount = 3

Output: -1
```

Explanation: The amount of 3 cannot be made up with coins of 2.

**Example 3:**

```text
Input: coins = [1], amount = 0

Output: 0
```

Explanation: Choosing 0 coins is a valid way to make up 0.

**Constraints:**

- `1 <= coins.length <= 10`

- `1 <= coins[i] <= 2^31 - 1`

- `0 <= amount <= 10000`

## 📥 입력

```text
coins = [1,5,10], amount = 12
```

## 📤 출력

```text
3
```

## 💡 핵심 아이디어

- 동적 계획법을 사용하여 0부터 목표 금액까지 각 금액을 만드는 최소 동전 개수를 상향식으로 계산합니다.
- dp[i]는 금액 i를 만드는 데 필요한 최소 동전 개수를 저장하며, dp[0]은 0으로 초기화합니다.
- 각 금액에 대해 사용 가능한 모든 동전을 확인하며 이전 상태의 최솟값을 갱신합니다.

## 🧮 정답 계산식

dp[i] = min(dp[i], dp[i - coin] + 1) 관계식을 사용하여 각 금액에 도달하는 최소 동전 개수를 갱신합니다.

## 🔍 구현 흐름

1. 목표 금액보다 1 큰 값으로 dp 배열을 초기화하여 불가능한 경우를 구분합니다.
2. dp[0]을 0으로 설정하여 기저 사례를 처리합니다.
3. 1부터 목표 금액까지 반복문을 수행하며 각 금액별로 동전 조합을 탐색합니다.
4. 현재 금액에서 동전 값을 뺀 인덱스의 dp 값에 1을 더한 값과 현재 dp 값을 비교하여 최솟값을 저장합니다.
5. 최종적으로 dp[amount]가 초기값과 같다면 -1을, 아니면 해당 값을 반환합니다.

## ⚠️ 주의할 점

- dp 배열을 초기화할 때 amount + 1과 같은 충분히 큰 값을 사용하여 불가능한 경우를 명확히 식별해야 합니다.
- 동전 값이 현재 금액보다 큰 경우 인덱스 범위를 벗어나지 않도록 조건문을 확인해야 합니다.
- amount가 0일 때의 예외 처리가 올바르게 수행되는지 확인해야 합니다.

## 📁 제출 코드

- 풀이 파일: [solution.java](./solution.java)
- 수집 위치: `Data Structures & Algorithms/coin-change/submission-0.java`

## ⏱️ 복잡도 분석

- 시간 복잡도: O(amount * coins.length)
- 공간 복잡도: O(amount)

## ✅ 한 줄 요약

상향식 동적 계획법을 통해 각 금액별 최소 동전 개수를 누적 계산하여 목표 금액의 최적해를 구합니다.

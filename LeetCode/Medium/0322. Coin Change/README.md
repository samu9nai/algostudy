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
<!-- AI_ANALYSIS: version=v1 model=gemini-2.5-flash hash=a60202641be53a0f -->

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

- 동적 계획법(Dynamic Programming)을 사용하여 주어진 금액을 만드는 데 필요한 최소 동전 수를 계산합니다.
- 각 금액 `i`에 대해 `dp[i]`는 `i`원을 만드는 데 필요한 최소 동전 수를 저장하며, 바텀업 방식으로 채워나갑니다.
- 현재 금액 `cur`을 만들기 위해 각 동전을 사용했을 때의 경우를 고려하여 최소값을 갱신하는 점화식을 적용합니다.

## 🧮 정답 계산식

dp[cur] = min(dp[cur], dp[cur - coin] + 1) 이며, 이는 현재 금액 `cur`을 만들기 위해 `coin`을 사용했을 때의 동전 수(`dp[cur - coin] + 1`)와 기존에 계산된 `dp[cur]` 값 중 더 작은 값을 선택한다는 의미입니다.

## 🔍 구현 흐름

1. `amount + 1` 크기의 정수 배열 `dp`를 생성하고, 모든 요소를 `amount + 1`로 초기화하여 도달 불가능한 상태를 나타냅니다.
2. `dp[0]`을 0으로 설정하여 0원을 만드는 데 필요한 동전은 0개임을 기본값으로 설정합니다.
3. 1부터 `amount`까지의 각 금액 `cur`에 대해 반복합니다.
4. 각 `cur`에 대해 사용 가능한 모든 동전 `coin`을 반복합니다.
5. 만약 `cur`이 `coin`보다 크거나 같으면, `dp[cur]` 값을 `dp[cur]`과 `dp[cur - coin] + 1` 중 더 작은 값으로 갱신합니다.
6. 모든 계산이 완료된 후, `dp[amount]` 값이 초기화 값(`amount + 1`)과 같으면 -1을 반환하고, 그렇지 않으면 `dp[amount]`를 반환합니다.

## ⚠️ 주의할 점

- `dp` 배열의 초기값을 `amount + 1`과 같이 충분히 큰 값으로 설정하여, 특정 금액을 만들 수 없는 경우를 올바르게 처리해야 합니다.
- 0원을 만드는 데 필요한 동전은 0개이므로 `dp[0]`을 0으로 정확히 초기화해야 합니다.
- 동전을 사용하여 금액을 만들 때 `cur - coin`이 음수가 되지 않도록 조건을 확인해야 합니다.

## 📁 제출 코드

- 풀이 파일: [solution.java](./solution.java)
- 수집 위치: `Data Structures & Algorithms/coin-change/submission-0.java`

## ⏱️ 복잡도 분석

- 시간 복잡도: O(amount * coins.length)
- 공간 복잡도: O(amount)

## ✅ 한 줄 요약

동적 계획법을 활용하여 각 금액을 만드는 데 필요한 최소 동전 수를 바텀업 방식으로 계산하여 목표 금액에 대한 최소 동전 수를 찾습니다.

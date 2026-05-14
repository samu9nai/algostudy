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

- 배열을 한 번 이상 순회하면서 필요한 상태를 누적한다.
- 중복되는 부분 문제의 답을 저장해 더 큰 상태의 답을 만든다.
- BFS로 같은 거리의 상태를 차례대로 확장한다.

## 🧮 정답 계산식

`dp[state]`를 이전 상태에서 전이해 최적값을 갱신합니다.

## 🔍 구현 흐름

1. 입력으로 주어진 값과 예외 케이스를 먼저 정리한다.
2. 큐를 사용해 가까운 상태부터 방문하고, 방문 여부를 함께 관리한다.
3. 정답 조건을 만족하면 결과를 갱신하거나 즉시 반환한다.
4. 모든 입력을 처리한 뒤 최종 결과를 반환한다.

## ⚠️ 주의할 점

- 제약 조건: 1 <= coins.length <= 10 / 1 <= coins[i] <= 2^31 - 1 / 0 <= amount <= 10000
- 방문 처리 시점이 늦으면 중복 방문이나 무한 탐색이 생길 수 있다.
- 초기값과 불가능한 상태를 구분해 오답 전이를 막는다.

## 📁 제출 코드

- 풀이 파일: [solution.java](./solution.java)
- 수집 위치: `Data Structures & Algorithms/coin-change/submission-0.java`

## ⏱️ 복잡도 분석

- 시간 복잡도: O(n * t)
- 공간 복잡도: O(t)

## ✅ 한 줄 요약

Coin Change은 Array, Dynamic Programming 관점에서 핵심 조건을 빠르게 판별하는 문제입니다. 목표 시간 복잡도는 O(n * t)입니다.

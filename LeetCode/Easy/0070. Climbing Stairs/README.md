# 🧩 Climbing Stairs

## 📌 문제 정보

| 항목 | 내용 |
| --- | --- |
| 플랫폼 | NeetCode |
| 문제 번호 | 70 |
| 난이도 | Easy |
| 분류 | Math, Dynamic Programming, Memoization |
| 언어 | Java |
| 제출 일자 | 2026년 05월 26일 17:34:23 |
| 문제 링크 | [Climbing Stairs](https://leetcode.com/problems/climbing-stairs/) |
| 원본 경로 | `Data Structures & Algorithms/climbing-stairs/submission-0.java` |
<!-- AI_ANALYSIS: version=v1 model=gemini-3.1-flash-lite hash=6f3bba3884564655 -->

## 📝 문제 설명

You are given an integer `n` representing the number of steps to reach the top of a staircase. You can climb with either `1` or `2` steps at a time.

Return the number of distinct ways to climb to the top of the staircase.

**Example 1:**

```text
Input: n = 2

Output: 2
```

Explanation:

- `1 + 1 = 2`

- `2 = 2`

**Example 2:**

```text
Input: n = 3

Output: 3
```

Explanation:

- `1 + 1 + 1 = 3`

- `1 + 2 = 3`

- `2 + 1 = 3`

**Constraints:**

- `1 <= n <= 45`

## 📥 입력

```text
n = 2
```

## 📤 출력

```text
2
```

## 💡 핵심 아이디어

- 계단 오르기 문제는 현재 계단에 도달하는 방법의 수가 이전 두 계단에서 올라오는 방법의 합과 같다는 점을 이용합니다.
- 피보나치 수열의 점화식과 동일한 구조를 가짐을 파악합니다.
- 동적 계획법을 사용하여 중복 계산을 방지하고 이전 상태 값을 저장합니다.

## 🧮 정답 계산식

dp[i] = dp[i-1] + dp[i-2] (단, dp[1]=1, dp[2]=2)

## 🔍 구현 흐름

1. 입력값 n이 2 이하인 경우 즉시 n을 반환하여 예외 처리를 수행합니다.
2. 계단 수에 따른 경우의 수를 저장할 크기 n+1의 정수 배열을 생성합니다.
3. 기본값인 dp[1]과 dp[2]를 각각 1과 2로 초기화합니다.
4. 3부터 n까지 반복문을 수행하며 점화식을 통해 배열의 값을 채웁니다.
5. 최종적으로 배열의 n번째 인덱스 값을 반환합니다.

## ⚠️ 주의할 점

- n이 1 또는 2일 때 배열 인덱스 범위를 벗어나지 않도록 초기 조건 처리가 필요합니다.
- n이 45까지 주어지므로 int 자료형의 범위 내에서 충분히 계산 가능합니다.

## 📁 제출 코드

- 풀이 파일: [solution.java](./solution.java)
- 수집 위치: `Data Structures & Algorithms/climbing-stairs/submission-0.java`

## ⏱️ 복잡도 분석

- 시간 복잡도: O(n)
- 공간 복잡도: O(n)

## ✅ 한 줄 요약

계단 오르기 문제는 피보나치 수열의 점화식을 활용한 동적 계획법으로 해결할 수 있습니다.

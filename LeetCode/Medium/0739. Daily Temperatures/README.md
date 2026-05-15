# 🧩 Daily Temperatures

## 📌 문제 정보

| 항목 | 내용 |
| --- | --- |
| 플랫폼 | NeetCode |
| 문제 번호 | 739 |
| 난이도 | Medium |
| 분류 | Array, Stack, Monotonic Stack |
| 언어 | Java |
| 제출 일자 | 2026년 05월 11일 16:33:18 |
| 문제 링크 | [Daily Temperatures](https://leetcode.com/problems/daily-temperatures/) |
| 원본 경로 | `Data Structures & Algorithms/daily-temperatures/submission-0.java` |
<!-- AI_ANALYSIS: version=v1 model=gemini-3.1-flash-lite hash=dedb41fd376cf29b -->

## 📝 문제 설명

You are given an array of integers `temperatures` where `temperatures[i]` represents the daily temperatures on the `ith` day.

Return an array `result` where `result[i]` is the number of days after the `ith` day before a warmer temperature appears on a future day. If there is no day in the future where a warmer temperature will appear for the `ith` day, set `result[i]` to `0` instead.

**Example 1:**

```text
Input: temperatures = [30,38,30,36,35,40,28]

Output: [1,4,1,2,1,0,0]
```

**Example 2:**

```text
Input: temperatures = [22,21,20]

Output: [0,0,0]
```

**Constraints:**

- `1 <= temperatures.length <= 1000`.

- `1 <= temperatures[i] <= 100`

## 📥 입력

```text
temperatures = [30,38,30,36,35,40,28]
```

## 📤 출력

```text
[1,4,1,2,1,0,0]
```

## 💡 핵심 아이디어

- 단조 감소 스택을 사용하여 현재 온도보다 높은 온도가 나타나는 첫 번째 시점을 찾습니다.
- 스택에는 아직 더 따뜻한 날을 찾지 못한 인덱스를 저장합니다.
- 현재 온도가 스택 상단의 온도보다 높으면, 스택에서 인덱스를 꺼내어 날짜 차이를 계산합니다.

## 🧮 정답 계산식

현재 인덱스 i와 스택에서 꺼낸 인덱스 prev의 차이인 (i - prev)를 결과 배열의 prev 위치에 저장합니다.

## 🔍 구현 흐름

1. 결과를 저장할 배열과 인덱스를 담을 스택을 초기화합니다.
2. 온도 배열을 순회하며 현재 온도와 스택 상단의 온도를 비교합니다.
3. 현재 온도가 더 높으면 스택에서 인덱스를 꺼내고 결과 배열에 차이를 기록합니다.
4. 현재 인덱스를 스택에 삽입합니다.
5. 모든 순회가 끝나면 더 따뜻한 날이 없는 인덱스는 기본값 0으로 남습니다.

## ⚠️ 주의할 점

- 스택에는 온도 값이 아닌 인덱스를 저장해야 날짜 차이를 계산할 수 있습니다.
- 스택이 비어있지 않은지 확인하는 조건을 반드시 먼저 체크해야 합니다.

## 📁 제출 코드

- 풀이 파일: [solution.java](./solution.java)
- 수집 위치: `Data Structures & Algorithms/daily-temperatures/submission-0.java`

## ⏱️ 복잡도 분석

- 시간 복잡도: O(n)
- 공간 복잡도: O(n)

## ✅ 한 줄 요약

단조 감소 스택을 활용하여 각 날짜마다 더 따뜻한 날까지의 거리를 효율적으로 계산하는 문제입니다.

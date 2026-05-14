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
<!-- AI_ANALYSIS: version=v1 model=gemini-2.5-flash hash=dedb41fd376cf29b -->

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

- 모노톤 스택(Monotonic Stack)을 사용하여 아직 더 따뜻한 날을 찾지 못한 날짜들의 인덱스를 저장합니다.
- 스택에는 온도가 내림차순으로 유지되도록 인덱스를 저장하며, 현재 날짜의 온도가 스택의 맨 위 인덱스에 해당하는 온도보다 높으면 해당 인덱스의 답을 계산합니다.

## 🧮 정답 계산식

result[이전_날짜_인덱스] = 현재_날짜_인덱스 - 이전_날짜_인덱스

## 🔍 구현 흐름

1. 결과를 저장할 `result` 배열을 `temperatures` 배열과 동일한 크기로 초기화합니다.
2. 날짜 인덱스를 저장할 스택(Deque)을 생성합니다.
3. 0부터 `temperatures` 배열의 끝까지 각 날짜 `i`에 대해 반복합니다.
4. 스택이 비어있지 않고, 스택의 맨 위 인덱스에 해당하는 온도가 현재 날짜 `i`의 온도보다 낮으면, 스택에서 인덱스 `prev`를 꺼내 `result[prev]`에 `i - prev`를 저장합니다.
5. 현재 날짜의 인덱스 `i`를 스택에 푸시합니다.
6. 모든 날짜를 처리한 후 `result` 배열을 반환합니다.

## ⚠️ 주의할 점

- 스택에는 온도가 아닌 날짜의 인덱스를 저장해야 합니다.
- 스택에서 인덱스를 꺼내는 `while` 루프의 조건은 현재 온도가 스택 맨 위 인덱스의 온도보다 '높을' 때만 해당합니다.
- 스택에 남아있는 인덱스들은 미래에 더 따뜻한 날이 없으므로, `result` 배열의 기본값인 0으로 유지됩니다.

## 📁 제출 코드

- 풀이 파일: [solution.java](./solution.java)
- 수집 위치: `Data Structures & Algorithms/daily-temperatures/submission-0.java`

## ⏱️ 복잡도 분석

- 시간 복잡도: O(N)
- 공간 복잡도: O(N)

## ✅ 한 줄 요약

모노톤 스택을 사용하여 각 날짜별로 다음으로 기온이 높아지는 날까지 며칠이 걸리는지 계산하는 문제.

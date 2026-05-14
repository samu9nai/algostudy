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

## 📝 문제 설명

- You are given an array of integers temperatures where temperatures[i] represents the daily temperatures on the ith day. Return an array result where result[i] is the number of days after the ith day before a warmer temperature appears on a future day. If there is no day in the future where a warmer temperature will ap…
- 주요 제약: 1 <= temperatures.length <= 1000. / 1 <= temperatures[i] <= 100
- 핵심 분류: Array, Stack, Monotonic Stack
- 문제 원문 전체는 저장하지 않고, 링크와 요약 정보만 보관합니다.

## 📥 입력

```text
temperatures = [30,38,30,36,35,40,28]
```

## 📤 출력

```text
[1,4,1,2,1,0,0]
```

## 💡 핵심 아이디어

- 배열을 한 번 이상 순회하면서 필요한 상태를 누적한다.
- 최근에 열린 상태를 스택에 저장하고 닫히는 조건과 매칭한다.
- 단조 스택으로 다음에 조건을 만족하는 위치를 빠르게 찾는다.

## 🧮 정답 계산식

`answer[i] = nextWarmerIndex - i`이며, 더 따뜻한 날이 없으면 `0`입니다.

## 🔍 구현 흐름

1. 입력으로 주어진 값과 예외 케이스를 먼저 정리한다.
2. 스택에 아직 처리되지 않은 후보를 유지하며 현재 값과 비교한다.
3. 정답 조건을 만족하면 결과를 갱신하거나 즉시 반환한다.
4. 모든 입력을 처리한 뒤 최종 결과를 반환한다.

## ⚠️ 주의할 점

- 제약 조건: 1 <= temperatures.length <= 1000. / 1 <= temperatures[i] <= 100
- 스택이 비어 있는 상태에서 top을 참조하지 않도록 처리한다.

## 📁 제출 코드

- 풀이 파일: [solution.java](./solution.java)
- 수집 위치: `Data Structures & Algorithms/daily-temperatures/submission-0.java`

## ⏱️ 복잡도 분석

- 시간 복잡도: O(n)
- 공간 복잡도: O(n)

## ✅ 한 줄 요약

Daily Temperatures은 Array, Stack 관점에서 핵심 조건을 빠르게 판별하는 문제입니다. 목표 시간 복잡도는 O(n)입니다.

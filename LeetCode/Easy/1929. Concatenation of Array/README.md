# 🧩 Concatenation of Array

## 📌 문제 정보

| 항목 | 내용 |
| --- | --- |
| 플랫폼 | NeetCode |
| 문제 번호 | 1929 |
| 난이도 | Easy |
| 분류 | Array, Simulation |
| 언어 | Java |
| 제출 일자 | 2026년 05월 11일 16:40:50 |
| 문제 링크 | [Concatenation of Array](https://leetcode.com/problems/concatenation-of-array/) |
| 원본 경로 | `Data Structures & Algorithms/concatenation-of-array/submission-0.java` |

## 📝 문제 설명

- You are given an integer array nums of length n. Create an array ans of length 2n where ans[i] == nums[i] and ans[i + n] == nums[i] for 0 <= i < n (0-indexed). Specifically, ans is the concatenation of two nums arrays. Return the array ans.
- 주요 제약: 1 <= nums.length <= 1000. / 1 <= nums[i] <= 1000
- 핵심 분류: Array, Simulation
- 문제 원문 전체는 저장하지 않고, 링크와 요약 정보만 보관합니다.

## 📥 입력

```text
nums = [1,4,1,2]
```

## 📤 출력

```text
[1,4,1,2,1,4,1,2]
```

## 💡 핵심 아이디어

- 배열을 한 번 이상 순회하면서 필요한 상태를 누적한다.
- 문제에서 요구하는 규칙을 순서대로 그대로 적용한다.

## 🧮 정답 계산식

`ans[i] = nums[i % n]` 형태로 원 배열을 두 번 이어 붙입니다.

## 🔍 구현 흐름

1. 입력으로 주어진 값과 예외 케이스를 먼저 정리한다.
2. 문제 조건에 맞는 자료구조를 선택해 순회한다.
3. 정답 조건을 만족하면 결과를 갱신하거나 즉시 반환한다.
4. 모든 입력을 처리한 뒤 최종 결과를 반환한다.

## ⚠️ 주의할 점

- 제약 조건: 1 <= nums.length <= 1000. / 1 <= nums[i] <= 1000

## 📁 제출 코드

- 풀이 파일: [solution.java](./solution.java)
- 수집 위치: `Data Structures & Algorithms/concatenation-of-array/submission-0.java`

## ⏱️ 복잡도 분석

- 시간 복잡도: 직접 분석 필요
- 공간 복잡도: 직접 분석 필요

## ✅ 한 줄 요약

Concatenation of Array은 Array, Simulation 관점에서 핵심 조건을 빠르게 판별하는 문제입니다.

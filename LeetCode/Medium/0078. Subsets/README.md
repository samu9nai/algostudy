# 🧩 Subsets

## 📌 문제 정보

| 항목 | 내용 |
| --- | --- |
| 플랫폼 | NeetCode |
| 문제 번호 | 78 |
| 난이도 | Medium |
| 분류 | Array, Backtracking, Bit Manipulation |
| 언어 | Java |
| 제출 일자 | 2026년 05월 18일 15:03:36 |
| 문제 링크 | [Subsets](https://leetcode.com/problems/subsets/) |
| 원본 경로 | `Data Structures & Algorithms/subsets/submission-0.java` |
<!-- AI_ANALYSIS: version=v1 model=gemini-3.1-flash-lite hash=d23564f8d8f5e360 -->

## 📝 문제 설명

Given an array `nums` of **unique** integers, return all possible subsets of `nums`.

The solution set must **not** contain duplicate subsets. You may return the solution in **any order**.

**Example 1:**

```text
Input: nums = [1,2,3]

Output: [[],[1],[2],[1,2],[3],[1,3],[2,3],[1,2,3]]
```

**Example 2:**

```text
Input: nums = [7]

Output: [[],[7]]
```

**Constraints:**

- `1 <= nums.length <= 10`

- `-10 <= nums[i] <= 10`

## 📥 입력

```text
nums = [1,2,3]
```

## 📤 출력

```text
[[],[1],[2],[1,2],[3],[1,3],[2,3],[1,2,3]]
```

## 💡 핵심 아이디어

- 모든 부분 집합을 생성하기 위해 백트래킹을 사용하여 각 원소를 포함하거나 포함하지 않는 경우의 수를 탐색합니다.
- 재귀 호출 시 현재 인덱스 이후의 원소들만 고려하여 중복 없는 조합을 생성합니다.
- 매 단계마다 현재까지 구성된 경로를 결과 리스트에 추가하여 모든 부분 집합을 수집합니다.

## 🧮 정답 계산식

부분 집합의 총 개수는 2^n개이며, 각 단계에서 현재 경로를 결과에 추가한 뒤 다음 원소를 선택하는 재귀 구조를 가집니다.

## 🔍 구현 흐름

1. 결과를 담을 리스트와 현재 경로를 추적할 리스트를 초기화합니다.
2. 백트래킹 함수를 호출하여 현재 경로를 결과 리스트에 추가합니다.
3. 현재 인덱스부터 배열 끝까지 반복문을 수행하며 원소를 경로에 추가합니다.
4. 다음 원소를 탐색하기 위해 인덱스를 1 증가시켜 재귀 호출합니다.
5. 재귀 호출이 끝나면 마지막에 추가한 원소를 제거하여 상태를 복구합니다.

## ⚠️ 주의할 점

- 결과 리스트에 경로를 추가할 때 반드시 새로운 리스트 객체를 생성하여 복사본을 저장해야 합니다.
- 백트래킹 과정에서 원소를 추가한 후 반드시 제거하는 백트래킹(backtracking) 단계를 잊지 않아야 합니다.

## 📁 제출 코드

- 풀이 파일: [solution.java](./solution.java)
- 수집 위치: `Data Structures & Algorithms/subsets/submission-0.java`

## ⏱️ 복잡도 분석

- 시간 복잡도: O(n * 2^n)
- 공간 복잡도: O(n)

## ✅ 한 줄 요약

백트래킹을 사용하여 주어진 배열의 모든 가능한 부분 집합을 중복 없이 생성하는 문제입니다.

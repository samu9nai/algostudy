# 🧩 Contains Duplicate

## 📌 문제 정보

| 항목 | 내용 |
| --- | --- |
| 플랫폼 | NeetCode |
| 문제 번호 | 217 |
| 난이도 | Easy |
| 분류 | Array, Hash Table, Sorting |
| 언어 | Java |
| 제출 일자 | 2026년 05월 11일 17:17:56 |
| 문제 링크 | [Contains Duplicate](https://leetcode.com/problems/contains-duplicate/) |
| 원본 경로 | `Data Structures & Algorithms/duplicate-integer/submission-1.java` |

## 📝 문제 설명

Given an integer array `nums`, return `true` if any value appears **more than once** in the array, otherwise return `false`.

**Example 1:**

```text
Input: nums = [1, 2, 3, 3]

Output: true
```

**Example 2:**

```text
Input: nums = [1, 2, 3, 4]

Output: false
```

**Constraints:**

- `0 <= nums.length <= 10^5`

- `-10^9 <= nums[i] <= 10^9`

## 📥 입력

```text
nums = [1, 2, 3, 3]
```

## 📤 출력

```text
true
```

## 💡 핵심 아이디어

- 배열을 한 번 이상 순회하면서 필요한 상태를 누적한다.
- 해시 기반 조회로 이미 본 값이나 필요한 보완 값을 빠르게 찾는다.
- 정렬을 이용해 비교 기준을 단순화하거나 같은 그룹을 모은다.

## 🧮 정답 계산식

현재 값과 이미 처리한 값 사이의 관계를 빠르게 조회해 정답 조건을 판별합니다.

## 🔍 구현 흐름

1. 입력으로 주어진 값과 예외 케이스를 먼저 정리한다.
2. 빠른 조회가 필요한 값을 해시맵 또는 해시셋에 저장한다.
3. 정답 조건을 만족하면 결과를 갱신하거나 즉시 반환한다.
4. 모든 입력을 처리한 뒤 최종 결과를 반환한다.

## ⚠️ 주의할 점

- 제약 조건: 0 <= nums.length <= 10^5 / -10^9 <= nums[i] <= 10^9
- 같은 값을 여러 번 사용할 수 있는지, 인덱스 중복이 허용되는지 확인한다.

## 📁 제출 코드

- 풀이 파일: [solution.java](./solution.java)
- 수집 위치: `Data Structures & Algorithms/duplicate-integer/submission-1.java`

## ⏱️ 복잡도 분석

- 시간 복잡도: O(n)
- 공간 복잡도: O(n)

## ✅ 한 줄 요약

Contains Duplicate은 Array, Hash Table 관점에서 핵심 조건을 빠르게 판별하는 문제입니다. 목표 시간 복잡도는 O(n)입니다.

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
<!-- AI_ANALYSIS: version=v1 model=gemini-2.5-flash hash=eff6e054171d0c4b -->

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

- 해시 셋을 사용하여 요소의 존재 여부를 효율적으로 확인합니다.
- 배열을 순회하며 각 요소를 해시 셋에 추가하고, 추가하기 전에 이미 존재하는지 확인합니다.

## 🧮 정답 계산식

배열의 요소를 순회하며 해시 셋에 현재 요소가 이미 포함되어 있다면 중복이 존재한다고 판정합니다.

## 🔍 구현 흐름

1. 정수형 해시 셋을 초기화합니다.
2. 입력 배열의 각 숫자에 대해 반복합니다.
3. 현재 숫자가 해시 셋에 이미 존재하는지 확인합니다.
4. 만약 존재한다면, 중복이 발견되었으므로 즉시 true를 반환합니다.
5. 존재하지 않는다면, 현재 숫자를 해시 셋에 추가합니다.
6. 모든 숫자를 확인한 후에도 중복이 발견되지 않았다면 false를 반환합니다.

## ⚠️ 주의할 점

- 빈 배열이 입력될 경우, 루프가 실행되지 않고 false가 반환되어 올바르게 처리됩니다.
- 배열의 길이가 1인 경우에도 중복이 없으므로 false가 반환되어 올바르게 처리됩니다.

## 📁 제출 코드

- 풀이 파일: [solution.java](./solution.java)
- 수집 위치: `Data Structures & Algorithms/duplicate-integer/submission-1.java`

## ⏱️ 복잡도 분석

- 시간 복잡도: O(N)
- 공간 복잡도: O(N)

## ✅ 한 줄 요약

해시 셋을 사용하여 배열의 각 요소를 저장하고 중복 여부를 O(N) 시간 복잡도로 효율적으로 확인하는 문제입니다.

# 🧩 Two Sum

## 📌 문제 정보

| 항목 | 내용 |
| --- | --- |
| 플랫폼 | NeetCode |
| 문제 번호 | 1 |
| 난이도 | Easy |
| 분류 | Array, Hash Table |
| 언어 | Java |
| 제출 일자 | 2026년 05월 12일 11:12:14 |
| 문제 링크 | [Two Sum](https://leetcode.com/problems/two-sum/) |
| 원본 경로 | `Data Structures & Algorithms/two-integer-sum/submission-1.java` |
<!-- AI_ANALYSIS: version=v1 model=gemini-2.5-flash hash=3fd2511b16fcc3b0 -->

## 📝 문제 설명

Given an array of integers `nums` and an integer `target`, return the indices `i` and `j` such that `nums[i] + nums[j] == target` and `i != j`.

You may assume that *every* input has exactly one pair of indices `i` and `j` that satisfy the condition.

Return the answer with the smaller index first.

**Example 1:**

```text
Input:
nums = [3,4,5,6], target = 7

Output: [0,1]
```

Explanation: `nums[0] + nums[1] == 7`, so we return `[0, 1]`.

**Example 2:**

```text
Input: nums = [4,5,6], target = 10

Output: [0,2]
```

**Example 3:**

```text
Input: nums = [5,5], target = 10

Output: [0,1]
```

**Constraints:**

- `2 <= nums.length <= 1000`

- `-10,000,000 <= nums[i] <= 10,000,000`

- `-10,000,000 <= target <= 10,000,000`

- **Only one valid answer exists.**

## 📥 입력

```text
nums = [3,4,5,6], target = 7
```

## 📤 출력

```text
[0,1]
```

## 💡 핵심 아이디어

- 배열을 한 번만 순회하면서 각 숫자에 대해 목표값에서 현재 숫자를 뺀 '보수'를 계산합니다.
- 해시 맵을 사용하여 이미 방문한 숫자들과 그 인덱스를 저장하여 보수가 존재하는지 효율적으로 확인합니다.
- 보수가 해시 맵에 존재하면, 해당 보수의 인덱스와 현재 숫자의 인덱스를 찾아 반환합니다.

## 🧮 정답 계산식

nums[i] + nums[j] == target 이 되는 두 인덱스 i, j를 찾으며, 이는 nums[j] == target - nums[i] 와 동일합니다.

## 🔍 구현 흐름

1. 정수와 해당 인덱스를 저장할 해시 맵을 초기화합니다.
2. 주어진 숫자 배열을 처음부터 끝까지 순회합니다.
3. 현재 숫자에 대해 목표값에서 현재 숫자를 뺀 보수(diff)를 계산합니다.
4. 해시 맵에 계산된 보수(diff)가 키로 존재하는지 확인합니다.
5. 만약 보수가 해시 맵에 존재한다면, 해시 맵에 저장된 보수의 인덱스와 현재 숫자의 인덱스를 배열로 반환합니다.
6. 만약 보수가 해시 맵에 존재하지 않는다면, 현재 숫자와 그 인덱스를 해시 맵에 저장합니다.

## ⚠️ 주의할 점

- 문제에서 항상 하나의 유효한 답이 존재한다고 명시되어 있으므로, 답을 찾지 못하는 경우는 고려하지 않아도 됩니다.
- 해시 맵에 값을 추가하기 전에 보수를 확인하므로, 동일한 인덱스를 두 번 사용하는 경우는 발생하지 않습니다.
- 반환 시 해시 맵에서 가져온 인덱스가 항상 현재 인덱스보다 작으므로, 작은 인덱스를 먼저 반환하는 조건이 자연스럽게 충족됩니다.

## 📁 제출 코드

- 풀이 파일: [solution.java](./solution.java)
- 수집 위치: `Data Structures & Algorithms/two-integer-sum/submission-1.java`

## ⏱️ 복잡도 분석

- 시간 복잡도: O(N)
- 공간 복잡도: O(N)

## ✅ 한 줄 요약

해시 맵을 사용하여 배열을 한 번 순회하며 각 숫자의 보수를 효율적으로 찾아 목표 합계를 만족하는 두 인덱스를 반환하는 문제입니다.

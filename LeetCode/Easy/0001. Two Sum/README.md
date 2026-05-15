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
<!-- AI_ANALYSIS: version=v1 model=gemini-3.1-flash-lite hash=3fd2511b16fcc3b0 -->

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

- 배열을 한 번만 순회하면서 각 요소에 대해 필요한 보수(target - 현재 값)를 찾는다.
- 해시 맵을 사용하여 이전에 방문한 숫자와 그 인덱스를 저장함으로써 탐색 시간을 단축한다.
- 현재 숫자의 보수가 맵에 존재하면 즉시 해당 인덱스와 현재 인덱스를 반환한다.

## 🧮 정답 계산식

현재 요소 nums[i]에 대하여 target - nums[i] 값이 맵에 존재하는지 확인하고, 존재한다면 {map.get(target - nums[i]), i}를 결과로 반환한다.

## 🔍 구현 흐름

1. 정수와 인덱스를 매핑할 HashMap을 생성한다.
2. 배열을 처음부터 끝까지 순회하며 현재 값과 target의 차이(diff)를 계산한다.
3. 맵에 diff가 존재하는지 확인하여 존재하면 즉시 인덱스 쌍을 반환한다.
4. 존재하지 않으면 현재 값과 인덱스를 맵에 저장하고 다음 순회로 넘어간다.

## ⚠️ 주의할 점

- 문제에서 정확히 하나의 해답이 존재한다고 보장하므로, 루프 종료 후의 예외 처리는 크게 고려하지 않아도 된다.
- 동일한 숫자가 배열에 여러 번 등장할 수 있으므로, 맵에 값을 넣기 전에 먼저 확인하는 순서가 중요하다.

## 📁 제출 코드

- 풀이 파일: [solution.java](./solution.java)
- 수집 위치: `Data Structures & Algorithms/two-integer-sum/submission-1.java`

## ⏱️ 복잡도 분석

- 시간 복잡도: O(n)
- 공간 복잡도: O(n)

## ✅ 한 줄 요약

해시 맵을 활용하여 배열 내의 두 수의 합이 타겟이 되는 인덱스를 선형 시간 내에 찾는 알고리즘입니다.

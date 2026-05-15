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
<!-- AI_ANALYSIS: version=v1 model=gemini-3.1-flash-lite hash=eff6e054171d0c4b -->

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

- 배열 내의 중복 요소를 효율적으로 찾기 위해 해시셋 자료구조를 활용합니다.
- 배열을 순회하면서 각 요소가 이미 해시셋에 존재하는지 확인하여 중복 여부를 즉시 판별합니다.
- 추가적인 정렬 과정 없이 단일 순회만으로 문제를 해결하여 성능을 최적화합니다.

## 🧮 정답 계산식

해시셋에 현재 요소를 추가하기 전, 이미 해당 요소가 포함되어 있다면 중복으로 간주하여 true를 반환합니다.

## 🔍 구현 흐름

1. 정수형 데이터를 저장할 HashSet 객체를 생성합니다.
2. 입력받은 배열의 각 요소를 순차적으로 반복합니다.
3. 현재 요소가 해시셋에 이미 존재하는지 확인합니다.
4. 존재한다면 즉시 true를 반환하고, 그렇지 않다면 해시셋에 요소를 추가합니다.
5. 배열 순회가 끝날 때까지 중복이 발견되지 않으면 false를 반환합니다.

## ⚠️ 주의할 점

- 배열의 길이가 0이거나 1인 경우 중복이 발생할 수 없으므로 false가 반환되는지 확인해야 합니다.
- 해시셋의 평균 시간 복잡도는 O(1)이지만, 최악의 경우 해시 충돌로 인해 O(n)이 될 수 있음을 고려해야 합니다.

## 📁 제출 코드

- 풀이 파일: [solution.java](./solution.java)
- 수집 위치: `Data Structures & Algorithms/duplicate-integer/submission-1.java`

## ⏱️ 복잡도 분석

- 시간 복잡도: O(n)
- 공간 복잡도: O(n)

## ✅ 한 줄 요약

HashSet을 사용하여 배열 내 중복 요소를 선형 시간 내에 효율적으로 탐색하는 알고리즘입니다.

# 🧩 Group Anagrams

## 📌 문제 정보

| 항목 | 내용 |
| --- | --- |
| 플랫폼 | NeetCode |
| 문제 번호 | 49 |
| 난이도 | Medium |
| 분류 | Array, Hash Table, String, Sorting |
| 언어 | Java |
| 제출 일자 | 2026년 05월 12일 16:01:24 |
| 문제 링크 | [Group Anagrams](https://leetcode.com/problems/group-anagrams/) |
| 원본 경로 | `Data Structures & Algorithms/anagram-groups/submission-1.java` |
<!-- AI_ANALYSIS: version=v1 model=gemini-2.5-flash hash=9ae8c7de5dc0b954 -->

## 📝 문제 설명

Given an array of strings `strs`, group all *anagrams* together into sublists. You may return the output in **any order**.

An **anagram** is a string that contains the exact same characters as another string, but the order of the characters can be different.

**Example 1:**

```text
Input: strs = ["act","pots","tops","cat","stop","hat"]

Output: [["hat"],["act", "cat"],["stop", "pots", "tops"]]
```

**Example 2:**

```text
Input: strs = ["x"]

Output: [["x"]]
```

**Example 3:**

```text
Input: strs = [""]

Output: [[""]]
```

**Constraints:**

- `1 <= strs.length <= 1000`.

- `0 <= strs[i].length <= 100`

- `strs[i]` is made up of lowercase English letters.

## 📥 입력

```text
strs = ["act","pots","tops","cat","stop","hat"]
```

## 📤 출력

```text
[["hat"],["act", "cat"],["stop", "pots", "tops"]]
```

## 💡 핵심 아이디어

- 아나그램은 문자를 정렬했을 때 동일한 문자열이 된다는 특성을 활용합니다.
- 정렬된 문자열을 고유한 키로 사용하여 해시 맵에 아나그램들을 그룹화합니다.
- 각 원본 문자열을 정렬된 형태의 키에 해당하는 리스트에 추가하여 그룹을 형성합니다.

## 🧮 정답 계산식

두 문자열이 아나그램인지 판별하는 기준은 각 문자열의 문자를 알파벳 순으로 정렬했을 때 두 결과 문자열이 동일한지 여부입니다.

## 🔍 구현 흐름

1. 문자열을 키로, 문자열 리스트를 값으로 가지는 해시 맵을 초기화합니다.
2. 주어진 문자열 배열의 각 문자열에 대해 반복합니다.
3. 현재 문자열을 문자 배열로 변환하고 알파벳 순으로 정렬합니다.
4. 정렬된 문자 배열을 다시 문자열로 변환하여 해시 맵의 키로 사용합니다.
5. 해당 키가 해시 맵에 없으면 새로운 빈 리스트를 값으로 추가합니다.
6. 원본 문자열을 해당 키에 매핑된 리스트에 추가합니다.

## ⚠️ 주의할 점

- 빈 문자열("")도 유효한 입력이며, 자기 자신과 아나그램이므로 올바르게 그룹화되어야 합니다.
- 모든 입력 문자열은 소문자 영어 알파벳으로만 구성된다는 제약 조건을 고려합니다.

## 📁 제출 코드

- 풀이 파일: [solution.java](./solution.java)
- 수집 위치: `Data Structures & Algorithms/anagram-groups/submission-1.java`

## ⏱️ 복잡도 분석

- 시간 복잡도: O(N * K log K)
- 공간 복잡도: O(N * K)

## ✅ 한 줄 요약

각 문자열을 정렬하여 아나그램의 고유 키로 사용하고, 이 키를 기준으로 해시 맵에 원본 문자열들을 그룹화하는 문제입니다.

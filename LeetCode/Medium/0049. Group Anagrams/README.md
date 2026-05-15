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
<!-- AI_ANALYSIS: version=v1 model=gemini-3.1-flash-lite hash=9ae8c7de5dc0b954 -->

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

- 애너그램 관계인 문자열들은 정렬했을 때 동일한 문자열이 된다는 점을 이용합니다.
- 정렬된 문자열을 해시 맵의 키로 사용하여 동일한 애너그램 그룹을 식별합니다.
- 해시 맵의 값으로 해당 키에 해당하는 원본 문자열들의 리스트를 저장합니다.

## 🧮 정답 계산식

문자열을 문자 배열로 변환 후 정렬한 결과를 키로 삼아 해시 맵에 그룹화합니다.

## 🔍 구현 흐름

1. 문자열을 저장할 해시 맵을 초기화합니다.
2. 입력 배열의 각 문자열을 순회하며 문자 배열로 변환합니다.
3. 변환된 문자 배열을 정렬하여 고유한 키를 생성합니다.
4. 해시 맵에 키가 존재하지 않으면 새로운 리스트를 생성하고 원본 문자열을 추가합니다.
5. 최종적으로 해시 맵의 모든 값들을 리스트 형태로 반환합니다.

## ⚠️ 주의할 점

- 빈 문자열도 유효한 입력이므로 정렬 시 빈 문자열이 키가 되는 경우를 고려해야 합니다.
- 문자열의 길이가 길어질수록 정렬 비용이 증가하므로 문자열 길이에 따른 성능 변화를 유의해야 합니다.

## 📁 제출 코드

- 풀이 파일: [solution.java](./solution.java)
- 수집 위치: `Data Structures & Algorithms/anagram-groups/submission-1.java`

## ⏱️ 복잡도 분석

- 시간 복잡도: O(N * K log K) (N은 문자열 개수, K는 문자열의 최대 길이)
- 공간 복잡도: O(N * K)

## ✅ 한 줄 요약

문자열을 정렬하여 얻은 고유 키를 해시 맵의 인덱스로 활용해 애너그램을 효율적으로 그룹화하는 알고리즘입니다.

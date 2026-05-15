# 🧩 Is Anagram

## 📌 문제 정보

| 항목 | 내용 |
| --- | --- |
| 플랫폼 | NeetCode |
| 문제 번호 | - |
| 난이도 | LeetCode |
| 분류 | 수집되지 않음 |
| 언어 | Java |
| 제출 일자 | 2026년 05월 15일 10:48:55 |
| 문제 링크 | [Is Anagram](https://leetcode.com/problems/is-anagram/) |
| 원본 경로 | `Data Structures & Algorithms/is-anagram/submission-0.java` |
<!-- AI_ANALYSIS: version=v1 model=gemini-3.1-flash-lite hash=3e926d1e23fa5db5 -->

## 📝 문제 설명

Given two strings `s` and `t`, return `true` if the two strings are anagrams of each other, otherwise return `false`.

An **anagram** is a string that contains the exact same characters as another string, but the order of the characters can be different.

**Example 1:**

```text
Input: s = "racecar", t = "carrace"

Output: true
```

**Example 2:**

```text
Input: s = "jar", t = "jam"

Output: false
```

**Constraints:**

- `1 <= s.length, t.length <= 5 * 10^4`

- `s` and `t` consist of lowercase English letters.

## 📥 입력

```text
s = "racecar", t = "carrace"
```

## 📤 출력

```text
true
```

## 💡 핵심 아이디어

- 두 문자열의 길이가 다르면 아나그램이 될 수 없으므로 즉시 false를 반환한다.
- 알파벳 소문자 26개를 저장할 수 있는 정수 배열을 사용하여 각 문자의 빈도수를 기록한다.
- 첫 번째 문자열의 문자는 빈도수를 증가시키고, 두 번째 문자열의 문자는 빈도수를 감소시켜 최종적으로 모든 값이 0인지 확인한다.

## 🧮 정답 계산식

두 문자열의 길이가 동일하고, 각 알파벳의 등장 횟수 차이가 모든 문자에 대해 0이어야 한다.

## 🔍 구현 흐름

1. 두 문자열의 길이를 비교하여 다르면 false를 반환한다.
2. 크기가 26인 정수 배열을 생성하여 초기화한다.
3. 문자열을 순회하며 s의 문자는 배열 인덱스 값을 1 증가시키고 t의 문자는 1 감소시킨다.
4. 배열을 다시 순회하며 모든 요소가 0인지 확인하고, 하나라도 0이 아니면 false를 반환한다.
5. 모든 검사를 통과하면 true를 반환한다.

## ⚠️ 주의할 점

- 문자열의 길이가 다를 경우를 먼저 처리하지 않으면 배열 인덱스 범위를 벗어날 수 있다.
- 입력 문자열이 소문자 알파벳으로만 구성되어 있다는 제약 조건을 활용하여 배열 크기를 26으로 고정해야 한다.

## 📁 제출 코드

- 풀이 파일: [solution.java](./solution.java)
- 수집 위치: `Data Structures & Algorithms/is-anagram/submission-0.java`

## ⏱️ 복잡도 분석

- 시간 복잡도: O(n)
- 공간 복잡도: O(1)

## ✅ 한 줄 요약

알파벳 빈도수 배열을 활용하여 두 문자열의 구성 요소가 동일한지 선형 시간 내에 판별하는 문제이다.

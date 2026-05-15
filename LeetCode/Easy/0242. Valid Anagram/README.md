# 🧩 Valid Anagram

## 📌 문제 정보

| 항목 | 내용 |
| --- | --- |
| 플랫폼 | NeetCode |
| 문제 번호 | 242 |
| 난이도 | Easy |
| 분류 | Hash Table, String, Sorting |
| 언어 | Java |
| 제출 일자 | 2026년 05월 15일 10:48:55 |
| 문제 링크 | [Valid Anagram](https://leetcode.com/problems/valid-anagram/) |
| 원본 경로 | `Data Structures & Algorithms/is-anagram/submission-0.java` |
<!-- AI_ANALYSIS: version=v1 model=gemini-3.1-flash-lite hash=ceaab131f75c9292 -->

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

- 두 문자열이 아나그램 관계라면 구성하는 문자의 종류와 개수가 정확히 일치해야 합니다.
- 알파벳 소문자만 사용된다는 점을 활용하여 크기가 26인 정수 배열을 빈도 카운터로 사용합니다.
- 첫 번째 문자열의 문자는 빈도를 증가시키고, 두 번째 문자열의 문자는 빈도를 감소시켜 최종적으로 모든 값이 0인지 확인합니다.

## 🧮 정답 계산식

두 문자열의 길이가 같고, 모든 알파벳에 대해 (s에서의 빈도 - t에서의 빈도)의 합이 0이 되어야 합니다.

## 🔍 구현 흐름

1. 두 문자열의 길이가 다르면 즉시 false를 반환합니다.
2. 크기가 26인 정수 배열을 생성하여 초기화합니다.
3. 문자열을 순회하며 s의 문자는 배열 인덱스 값을 1 증가시키고 t의 문자는 1 감소시킵니다.
4. 배열을 다시 순회하며 모든 요소가 0인지 확인하여 결과를 반환합니다.

## ⚠️ 주의할 점

- 두 문자열의 길이가 다를 경우를 먼저 체크하지 않으면 인덱스 범위를 벗어날 수 있습니다.
- 입력 문자열이 소문자 알파벳으로만 구성된다는 제약 조건을 확인해야 합니다.

## 📁 제출 코드

- 풀이 파일: [solution.java](./solution.java)
- 수집 위치: `Data Structures & Algorithms/is-anagram/submission-0.java`

## ⏱️ 복잡도 분석

- 시간 복잡도: O(n)
- 공간 복잡도: O(1)

## ✅ 한 줄 요약

고정 크기 배열을 이용한 빈도 카운팅 기법으로 두 문자열의 구성 요소가 동일한지 효율적으로 판별합니다.

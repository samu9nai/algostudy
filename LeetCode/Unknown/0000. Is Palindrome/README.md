# 🧩 Is Palindrome

## 📌 문제 정보

| 항목 | 내용 |
| --- | --- |
| 플랫폼 | NeetCode |
| 문제 번호 | - |
| 난이도 | LeetCode |
| 분류 | 수집되지 않음 |
| 언어 | Java |
| 제출 일자 | 2026년 06월 10일 11:43:37 |
| 문제 링크 | [Is Palindrome](https://leetcode.com/problems/is-palindrome/) |
| 원본 경로 | `Data Structures & Algorithms/is-palindrome/submission-0.java` |
<!-- AI_ANALYSIS: version=v1 model=gemini-3.1-flash-lite hash=3b01e3fc01b31683 -->

## 📝 문제 설명

Given a string `s`, return `true` if it is a **palindrome**, otherwise return `false`.

A **palindrome** is a string that reads the same forward and backward. It is also case-insensitive and ignores all non-alphanumeric characters.

**Note:** Alphanumeric characters consist of letters `(A-Z, a-z)` and numbers `(0-9)`.

**Example 1:**

```text
Input: s = "Was it a car or a cat I saw?"

Output: true
```

Explanation: After considering only alphanumerical characters we have "wasitacaroracatisaw", which is a palindrome.

**Example 2:**

```text
Input: s = "tab a cat"

Output: false
```

Explanation: "tabacat" is not a palindrome.

**Constraints:**

- `1 <= s.length <= 1000`

- `s` is made up of only printable ASCII characters.

## 📥 입력

```text
s = "Was it a car or a cat I saw?"
```

## 📤 출력

```text
true
```

## 💡 핵심 아이디어

- 문자열의 양 끝에서 시작하는 두 개의 포인터를 사용하여 중앙으로 이동하며 비교한다.
- 영문자와 숫자가 아닌 문자는 무시하고 건너뛰도록 포인터를 조정한다.
- 대소문자를 구분하지 않기 위해 비교 시 모든 문자를 소문자로 변환한다.

## 🧮 정답 계산식

양 끝 포인터가 가리키는 유효한 문자가 서로 일치하는지 확인하며, 모든 문자를 검사할 때까지 불일치가 발생하지 않으면 회문으로 판정한다.

## 🔍 구현 흐름

1. 문자열의 시작과 끝을 가리키는 left와 right 포인터를 초기화한다.
2. left가 right보다 작은 동안 반복문을 수행한다.
3. left 포인터가 가리키는 문자가 영문자나 숫자가 아니면 left를 증가시킨다.
4. right 포인터가 가리키는 문자가 영문자나 숫자가 아니면 right를 감소시킨다.
5. 두 포인터가 가리키는 문자를 소문자로 변환하여 비교하고, 다르면 false를 반환한다.
6. 모든 검사를 통과하면 true를 반환한다.

## ⚠️ 주의할 점

- 문자열 내에 영문자와 숫자가 아닌 문자가 섞여 있을 때 포인터가 범위를 벗어나지 않도록 주의해야 한다.
- 비교 시 대소문자 차이를 무시하기 위해 반드시 동일한 케이스로 변환 후 비교해야 한다.

## 📁 제출 코드

- 풀이 파일: [solution.java](./solution.java)
- 수집 위치: `Data Structures & Algorithms/is-palindrome/submission-0.java`

## ⏱️ 복잡도 분석

- 시간 복잡도: O(n)
- 공간 복잡도: O(1)

## ✅ 한 줄 요약

투 포인터 기법을 사용하여 비알파벳 문자를 건너뛰며 대소문자 구분 없이 양 끝에서 중앙으로 문자를 비교하여 회문 여부를 판단한다.

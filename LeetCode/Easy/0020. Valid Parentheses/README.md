# 🧩 Valid Parentheses

## 📌 문제 정보

| 항목 | 내용 |
| --- | --- |
| 플랫폼 | NeetCode |
| 문제 번호 | 20 |
| 난이도 | Easy |
| 분류 | String, Stack |
| 언어 | Java |
| 제출 일자 | 2026년 05월 11일 15:52:16 |
| 문제 링크 | [Valid Parentheses](https://leetcode.com/problems/valid-parentheses/) |
| 원본 경로 | `Data Structures & Algorithms/validate-parentheses/submission-2.java` |
<!-- AI_ANALYSIS: version=v1 model=gemini-3.1-flash-lite hash=a65baf28f3f62d1f -->

## 📝 문제 설명

You are given a string `s` consisting of the following characters: `'('`, `')'`, `'{'`, `'}'`, `'['` and `']'`.

The input string `s` is valid if and only if:

- Every open bracket is closed by the same type of close bracket.

- Open brackets are closed in the correct order.

- Every close bracket has a corresponding open bracket of the same type.

Return `true` if `s` is a valid string, and `false` otherwise.

**Example 1:**

```text
Input: s = "[]"

Output: true
```

**Example 2:**

```text
Input: s = "([{}])"

Output: true
```

**Example 3:**

```text
Input: s = "[(])"

Output: false
```

Explanation: The brackets are not closed in the correct order.

**Constraints:**

- `1 <= s.length <= 1000`

## 📥 입력

```text
s = "[]"
```

## 📤 출력

```text
true
```

## 💡 핵심 아이디어

- 여는 괄호를 만날 때 대응되는 닫는 괄호를 스택에 미리 저장하여 괄호의 짝을 맞춘다.
- 닫는 괄호를 만날 때 스택에서 꺼낸 값과 현재 문자가 일치하는지 확인하여 순서를 검증한다.
- 모든 문자를 처리한 후 스택이 비어 있어야 모든 괄호가 올바르게 닫힌 것으로 간주한다.

## 🧮 정답 계산식

스택이 비어있지 않고 pop한 값이 현재 닫는 괄호와 일치해야 하며, 최종적으로 스택이 비어있어야 유효하다.

## 🔍 구현 흐름

1. ArrayDeque를 사용하여 스택 객체를 생성한다.
2. 문자열을 순회하며 여는 괄호일 경우 대응하는 닫는 괄호를 스택에 push한다.
3. 닫는 괄호일 경우 스택이 비어있는지 확인하거나 pop한 값이 현재 문자와 다른지 비교한다.
4. 조건을 만족하지 않으면 즉시 false를 반환한다.
5. 순회 종료 후 스택이 비어있는지 여부를 반환한다.

## ⚠️ 주의할 점

- 닫는 괄호가 먼저 나올 경우 스택이 비어있을 수 있으므로 pop 전에 반드시 isEmpty 체크가 필요하다.
- 문자열 순회 종료 후 스택에 여는 괄호가 남아있을 수 있으므로 마지막에 스택이 비었는지 확인해야 한다.

## 📁 제출 코드

- 풀이 파일: [solution.java](./solution.java)
- 수집 위치: `Data Structures & Algorithms/validate-parentheses/submission-2.java`

## ⏱️ 복잡도 분석

- 시간 복잡도: O(n)
- 공간 복잡도: O(n)

## ✅ 한 줄 요약

스택 자료구조를 활용하여 여는 괄호에 대응하는 닫는 괄호를 저장하고 순차적으로 비교하여 유효성을 검증한다.

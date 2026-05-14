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
<!-- AI_ANALYSIS: version=v1 model=gemini-2.5-flash hash=a65baf28f3f62d1f -->

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

- 스택 자료구조를 활용하여 괄호의 짝을 관리합니다.
- 여는 괄호를 만나면 해당 괄호의 짝이 되는 닫는 괄호를 스택에 푸시합니다.
- 닫는 괄호를 만나면 스택의 최상단 괄호와 비교하여 유효성을 검사합니다.
- 모든 문자 처리 후 스택이 비어있어야 유효한 괄호 문자열입니다.

## 🧮 정답 계산식

여는 괄호는 스택에 짝이 되는 닫는 괄호를 푸시하고, 닫는 괄호는 스택에서 짝을 팝하여 일치하는지 확인하며, 최종적으로 스택이 비어있어야 유효하다.

## 🔍 구현 흐름

1. 문자형 스택(Deque)을 초기화합니다.
2. 입력 문자열의 각 문자를 순회합니다.
3. 현재 문자가 여는 괄호('(', '{', '[')인 경우, 해당 괄호의 짝이 되는 닫는 괄호(')', '}', ']')를 스택에 푸시합니다.
4. 현재 문자가 닫는 괄호인 경우, 스택이 비어있거나 스택에서 팝한 문자가 현재 문자와 다르면 즉시 `false`를 반환합니다.
5. 모든 문자를 처리한 후, 스택이 비어있으면 `true`를 반환하고, 그렇지 않으면 `false`를 반환합니다.

## ⚠️ 주의할 점

- 닫는 괄호가 나왔을 때 스택이 비어있는 경우(예: "]")를 반드시 처리해야 합니다.
- 스택에서 팝한 괄호와 현재 닫는 괄호의 종류가 일치하는지 확인해야 합니다(예: "[(])").
- 모든 문자열을 처리한 후 스택에 남아있는 괄호가 없는지 확인해야 합니다(예: "(((").

## 📁 제출 코드

- 풀이 파일: [solution.java](./solution.java)
- 수집 위치: `Data Structures & Algorithms/validate-parentheses/submission-2.java`

## ⏱️ 복잡도 분석

- 시간 복잡도: O(N)
- 공간 복잡도: O(N)

## ✅ 한 줄 요약

스택을 사용하여 여는 괄호의 짝이 되는 닫는 괄호를 저장하고, 닫는 괄호가 나타날 때마다 스택의 최상단과 비교하여 괄호의 유효성을 검사하는 문제.

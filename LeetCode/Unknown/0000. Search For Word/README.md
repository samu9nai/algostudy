# 🧩 Search For Word

## 📌 문제 정보

| 항목 | 내용 |
| --- | --- |
| 플랫폼 | NeetCode |
| 문제 번호 | - |
| 난이도 | LeetCode |
| 분류 | 수집되지 않음 |
| 언어 | Java |
| 제출 일자 | 2026년 05월 18일 13:51:45 |
| 문제 링크 | [Search For Word](https://leetcode.com/problems/search-for-word/) |
| 원본 경로 | `Data Structures & Algorithms/search-for-word/submission-0.java` |
<!-- AI_ANALYSIS: version=v1 model=gemini-3.1-flash-lite hash=6101863cc132cb5a -->

## 📝 문제 설명

Given a 2-D grid of characters `board` and a string `word`, return `true` if the word is present in the grid, otherwise return `false`.

For the word to be present it must be possible to form it with a path in the board with horizontally or vertically neighboring cells. The same cell may not be used more than once in a word.

**Example 1:**

```text
Input:
board = [
 ["A","B","C","D"],
 ["S","A","A","T"],
 ["A","C","A","E"]
],
word = "CAT"

Output: true
```

**Example 2:**

```text
Input:
board = [
 ["A","B","C","D"],
 ["S","A","A","T"],
 ["A","C","A","E"]
],
word = "BAT"

Output: false
```

**Constraints:**

- `1 <= board.length, board[i].length <= 5`

- `1 <= word.length <= 10`

- `board` and `word` consists of only lowercase and uppercase English letters.

## 📥 입력

```text
board = [
 ["A","B","C","D"],
 ["S","A","A","T"],
 ["A","C","A","E"]
],
word = "CAT"
```

## 📤 출력

```text
true
```

## 💡 핵심 아이디어

- 격자 내 모든 셀을 시작점으로 하여 단어를 찾을 수 있는지 확인하는 완전 탐색 기반의 DFS를 수행합니다.
- 방문한 셀은 재사용하지 않도록 임시 문자로 마킹한 뒤, 탐색이 끝나면 원상복구하는 백트래킹 기법을 사용합니다.
- 현재 탐색 중인 문자가 단어의 인덱스와 일치하는지 확인하며 상하좌우로 경로를 확장합니다.

## 🧮 정답 계산식

현재 셀의 문자가 단어의 idx번째 문자와 일치하고, 인접한 네 방향 중 하나라도 남은 단어 부분을 완성할 수 있으면 true를 반환합니다.

## 🔍 구현 흐름

1. 보드의 모든 행과 열을 순회하며 단어의 첫 글자와 일치하는 셀을 찾습니다.
2. 일치하는 셀을 발견하면 해당 위치에서 DFS 탐색을 시작합니다.
3. DFS 함수 내에서 현재 위치가 범위를 벗어나거나 글자가 일치하지 않으면 false를 반환합니다.
4. 방문한 셀을 '#'으로 변경하여 중복 사용을 방지하고, 상하좌우로 재귀 호출을 수행합니다.
5. 재귀 호출이 끝나면 방문 표시를 원래 문자로 되돌려 다른 경로 탐색에 영향을 주지 않도록 합니다.

## ⚠️ 주의할 점

- 방문한 셀을 다시 방문하지 않도록 처리하는 백트래킹 과정에서 원상복구를 누락하면 다른 경로 탐색 시 오류가 발생합니다.
- 단어의 길이가 1인 경우를 포함하여 재귀 종료 조건이 정확히 설정되어야 합니다.

## 📁 제출 코드

- 풀이 파일: [solution.java](./solution.java)
- 수집 위치: `Data Structures & Algorithms/search-for-word/submission-0.java`

## ⏱️ 복잡도 분석

- 시간 복잡도: O(N * M * 3^L) (N, M은 보드 크기, L은 단어 길이)
- 공간 복잡도: O(L) (재귀 호출 스택 깊이)

## ✅ 한 줄 요약

백트래킹을 활용한 DFS 탐색으로 격자 내에서 주어진 단어를 형성할 수 있는 경로를 찾습니다.

# 🧩 Minesweeper

## 📌 문제 정보

| 항목 | 내용 |
| --- | --- |
| 플랫폼 | LeetCode |
| 문제 번호 | 529 |
| 난이도 | Medium |
| 분류 | Array, Depth-First Search, Breadth-First Search, Matrix |
| 언어 | Java |
| 제출 일자 | 2026년 05월 14일 15:41:19 |
| 문제 링크 | [Minesweeper](https://leetcode.com/problems/minesweeper/) |
| 원본 경로 | `Only in LeetCode/0529-minesweeper/0529-minesweeper.java` |
<!-- AI_ANALYSIS: version=v1 model=gemini-3.1-flash-lite hash=3e49764e508b7864 -->

## 📝 문제 설명

Let's play the minesweeper game ([Wikipedia](https://en.wikipedia.org/wiki/Minesweeper_(video_game)), [online game](http://minesweeperonline.com))!

You are given an `m x n` char matrix `board` representing the game board where:

- `'M'` represents an unrevealed mine,

- `'E'` represents an unrevealed empty square,

- `'B'` represents a revealed blank square that has no adjacent mines (i.e., above, below, left, right, and all 4 diagonals),

- digit (`'1'` to `'8'`) represents how many mines are adjacent to this revealed square, and

- `'X'` represents a revealed mine.

You are also given an integer array `click` where `click = [clickr, clickc]` represents the next click position among all the unrevealed squares (`'M'` or `'E'`).

Return *the board after revealing this position according to the following rules*:

- If a mine `'M'` is revealed, then the game is over. You should change it to `'X'`.

- If an empty square `'E'` with no adjacent mines is revealed, then change it to a revealed blank `'B'` and all of its adjacent unrevealed squares should be revealed recursively.

- If an empty square `'E'` with at least one adjacent mine is revealed, then change it to a digit (`'1'` to `'8'`) representing the number of adjacent mines.

- Return the board when no more squares will be revealed.

**Example 1:**

```text
Input: board = [["E","E","E","E","E"],["E","E","M","E","E"],["E","E","E","E","E"],["E","E","E","E","E"]], click = [3,0]
Output: [["B","1","E","1","B"],["B","1","M","1","B"],["B","1","1","1","B"],["B","B","B","B","B"]]
```

**Example 2:**

```text
Input: board = [["B","1","E","1","B"],["B","1","M","1","B"],["B","1","1","1","B"],["B","B","B","B","B"]], click = [1,2]
Output: [["B","1","E","1","B"],["B","1","X","1","B"],["B","1","1","1","B"],["B","B","B","B","B"]]
```

**Constraints:**

- `m == board.length`

- `n == board[i].length`

- `1 <= m, n <= 50`

- `board[i][j]` is either `'M'`, `'E'`, `'B'`, or a digit from `'1'` to `'8'`.

- `click.length == 2`

- `0 <= clickr < m`

- `0 <= clickc < n`

- `board[clickr][clickc]` is either `'M'` or `'E'`.

## 📥 입력

```text
board = [["E","E","E","E","E"],["E","E","M","E","E"],["E","E","E","E","E"],["E","E","E","E","E"]], click = [3,0]
```

## 📤 출력

```text
[["B","1","E","1","B"],["B","1","M","1","B"],["B","1","1","1","B"],["B","B","B","B","B"]]
```

## 💡 핵심 아이디어

- 클릭한 지점이 지뢰인 경우 즉시 게임을 종료하고 상태를 변경한다.
- 클릭한 지점이 빈 칸인 경우 주변 8방향의 지뢰 개수를 계산한다.
- 주변에 지뢰가 있다면 해당 칸을 숫자로 표시하고 재귀를 중단한다.
- 주변에 지뢰가 없다면 해당 칸을 'B'로 표시하고 인접한 모든 칸에 대해 재귀적으로 탐색을 수행한다.

## 🧮 정답 계산식

현재 위치의 주변 8방향을 탐색하여 'M'의 개수를 세고, 개수가 0이면 'B'로 변환 후 인접 칸으로 재귀 호출, 0보다 크면 해당 숫자로 변환한다.

## 🔍 구현 흐름

1. 클릭 위치가 지뢰('M')인지 확인하여 'X'로 변경 후 종료한다.
2. 지뢰가 아니라면 DFS 함수를 호출하여 현재 칸의 상태를 확인한다.
3. 주변 8방향의 지뢰 개수를 카운트하는 보조 함수를 실행한다.
4. 지뢰 개수가 0이면 현재 칸을 'B'로 바꾸고 8방향에 대해 DFS를 재귀적으로 호출한다.
5. 지뢰 개수가 0이 아니면 현재 칸을 해당 숫자 문자로 업데이트하고 탐색을 종료한다.

## ⚠️ 주의할 점

- 이미 방문했거나 숫자로 표시된 칸은 다시 탐색하지 않도록 조건문을 정확히 설정해야 한다.
- 재귀 호출 시 배열의 범위를 벗어나지 않도록 경계 검사를 수행해야 한다.

## 📁 제출 코드

- 풀이 파일: [solution.java](./solution.java)
- 수집 위치: `Only in LeetCode/0529-minesweeper/0529-minesweeper.java`

## ⏱️ 복잡도 분석

- 시간 복잡도: O(m * n)
- 공간 복잡도: O(m * n)

## ✅ 한 줄 요약

지뢰 찾기 게임의 규칙에 따라 클릭한 지점부터 DFS를 사용하여 보드 상태를 재귀적으로 업데이트하는 문제이다.

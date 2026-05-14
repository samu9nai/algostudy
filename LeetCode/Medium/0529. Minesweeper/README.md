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
<!-- AI_ANALYSIS: version=v1 model=gemini-2.5-flash hash=3e49764e508b7864 -->

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

- 클릭된 위치부터 시작하여 Depth-First Search (DFS)를 통해 보드를 탐색합니다.
- 각 칸의 상태('M', 'E')와 인접 지뢰 개수에 따라 보드를 업데이트하는 규칙을 적용합니다.
- 인접한 8방향의 지뢰 개수를 세는 별도의 함수를 구현하여 재사용합니다.
- 이미 탐색했거나 'E'가 아닌 칸은 다시 탐색하지 않도록 하여 중복 처리를 방지합니다.

## 🧮 정답 계산식

클릭된 칸이 지뢰('M')이면 'X'로 변경하고 게임을 종료하며, 'E'인 경우 인접 지뢰가 없으면 'B'로 변경 후 인접한 'E' 칸들을 재귀적으로 탐색하고, 인접 지뢰가 있으면 해당 개수로 변경 후 탐색을 중단합니다.

## 🔍 구현 흐름

1. 클릭된 위치의 칸이 지뢰('M')인지 확인하고, 지뢰라면 해당 칸을 'X'로 변경한 후 보드를 반환하여 게임을 종료합니다.
2. 지뢰가 아니라면, 해당 칸부터 DFS 탐색을 시작합니다.
3. DFS 함수 내에서는 현재 칸이 보드 범위를 벗어나거나 이미 공개된 칸('E'가 아닌 칸)이면 즉시 탐색을 중단합니다.
4. 현재 칸('E')의 8방향 인접 칸에 있는 지뢰의 개수를 셉니다.
5. 인접 지뢰가 1개 이상이면 현재 칸을 해당 지뢰 개수 문자로 변경하고 재귀 호출을 중단합니다.
6. 인접 지뢰가 0개이면 현재 칸을 'B'로 변경하고, 8방향 모든 인접 칸에 대해 재귀적으로 DFS를 호출합니다.

## ⚠️ 주의할 점

- DFS 재귀 호출 시, 이미 방문했거나 'E'가 아닌 칸은 다시 처리하지 않도록 명확한 종료 조건을 설정해야 합니다.
- 8방향 탐색 시, 보드 경계를 벗어나지 않도록 인덱스 유효성 검사를 철저히 해야 합니다.
- 인접 지뢰 개수를 셀 때, 'M' 문자만 지뢰로 간주하고 다른 문자는 무시해야 합니다.

## 📁 제출 코드

- 풀이 파일: [solution.java](./solution.java)
- 수집 위치: `Only in LeetCode/0529-minesweeper/0529-minesweeper.java`

## ⏱️ 복잡도 분석

- 시간 복잡도: O(m * n)
- 공간 복잡도: O(m * n)

## ✅ 한 줄 요약

주어진 클릭 위치부터 DFS를 사용하여 지뢰찾기 규칙에 따라 보드를 업데이트하며, 인접 지뢰가 없는 빈 칸은 재귀적으로 주변을 탐색하고, 지뢰가 있는 칸은 지뢰 개수로 표시합니다.

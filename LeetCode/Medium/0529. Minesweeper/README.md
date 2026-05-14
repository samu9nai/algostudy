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

## 📝 문제 설명

- Let's play the minesweeper game (Wikipedia, online game)! You are given an m x n char matrix board representing the game board where: You are also given an integer array click where click = [clickr, clickc] represents the next click position among all the unrevealed squares ('M' or 'E'). Return the board after reveali…
- 주요 제약: m == board.length / n == board[i].length
- 핵심 분류: Array, Depth-First Search, Breadth-First Search, Matrix
- 문제 원문 전체는 저장하지 않고, 링크와 요약 정보만 보관합니다.

## 📥 입력

```text
board = [["E","E","E","E","E"],["E","E","M","E","E"],["E","E","E","E","E"],["E","E","E","E","E"]], click = [3,0]
```

## 📤 출력

```text
[["B","1","E","1","B"],["B","1","M","1","B"],["B","1","1","1","B"],["B","B","B","B","B"]]
```

## 💡 핵심 아이디어

- 배열을 한 번 이상 순회하면서 필요한 상태를 누적한다.
- DFS로 연결된 상태를 깊게 따라가며 방문 여부를 관리한다.
- BFS로 같은 거리의 상태를 차례대로 확장한다.
- 행과 열의 경계 조건, 방문 처리, 방향 이동을 함께 관리한다.

## 🧮 정답 계산식

요구 조건 `click = [clickr`을 만족하는 값을 계산합니다.

## 🔍 구현 흐름

1. 입력으로 주어진 값과 예외 케이스를 먼저 정리한다.
2. 큐를 사용해 가까운 상태부터 방문하고, 방문 여부를 함께 관리한다.
3. 정답 조건을 만족하면 결과를 갱신하거나 즉시 반환한다.
4. 모든 입력을 처리한 뒤 최종 결과를 반환한다.

## ⚠️ 주의할 점

- 제약 조건: m == board.length / n == board[i].length / 1 <= m, n <= 50
- 방문 처리 시점이 늦으면 중복 방문이나 무한 탐색이 생길 수 있다.

## 📁 제출 코드

- 풀이 파일: [solution.java](./solution.java)
- 수집 위치: `Only in LeetCode/0529-minesweeper/0529-minesweeper.java`

## ⏱️ 복잡도 분석

- 시간 복잡도: 직접 분석 필요
- 공간 복잡도: 직접 분석 필요

## ✅ 한 줄 요약

Minesweeper은 Array, Depth-First Search 관점에서 핵심 조건을 빠르게 판별하는 문제입니다.

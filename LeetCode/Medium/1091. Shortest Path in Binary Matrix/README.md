# 🧩 Shortest Path in Binary Matrix

## 📌 문제 정보

| 항목 | 내용 |
| --- | --- |
| 플랫폼 | NeetCode |
| 문제 번호 | 1091 |
| 난이도 | Medium |
| 분류 | Array, Breadth-First Search, Matrix |
| 언어 | Java |
| 제출 일자 | 2026년 05월 14일 10:44:18 |
| 문제 링크 | [Shortest Path in Binary Matrix](https://leetcode.com/problems/shortest-path-in-binary-matrix/) |
| 원본 경로 | `Data Structures & Algorithms/shortest-path-in-binary-matrix/submission-0.java` |
<!-- AI_ANALYSIS: version=v1 model=gemini-2.5-flash hash=fd8ba1a5aaa40296 -->

## 📝 문제 설명

You are given an `n x n` binary matrix `grid`, return the length of the **shortest clear path** in the matrix. If there is no clear path, return `-1`.

A **clear path** in a binary matrix is a path from the **top-left** cell (i.e., `(0, 0)`) to the **bottom-right** cell (i.e., `(n - 1, n - 1)`) such that:

- All the visited cells of the path are `0`.

- All the adjacent cells of the path are **8-directionally** connected (i.e., they are different and they share an edge or a corner).

The **length of a clear path** is the number of visited cells of this path.

**Example 1:**

```text
Input: grid = [
 [0,1,0],
 [1,0,0],
 [1,1,0]
]

Output: 3
```

**Example 2:**

```text
Input: grid = [
 [1,0],
 [1,1]
]

Output: -1
```

**Constraints:**

- `1 <= grid.length == grid[i].length <= 100`

- `grid[i][j]` is `0` or `1`.

## 📥 입력

```text
grid = [
 [0,1,0],
 [1,0,0],
 [1,1,0]
]
```

## 📤 출력

```text
3
```

## 💡 핵심 아이디어

- 가중치가 없는 그래프에서 최단 경로를 찾기 위해 너비 우선 탐색(BFS)을 사용합니다.
- 상하좌우 대각선을 포함한 8방향으로 인접한 셀로 이동할 수 있습니다.
- 방문한 셀을 표시하고 시작점으로부터의 거리를 저장하기 위해 입력 `grid` 배열을 직접 활용합니다.

## 🧮 정답 계산식

최단 경로의 길이는 BFS 탐색 중 목적지에 도달했을 때 해당 셀에 저장된 값입니다.

## 🔍 구현 흐름

1. 시작점 (0,0) 또는 도착점 (n-1, n-1)이 1인 경우 즉시 -1을 반환하여 경로 없음으로 처리합니다.
2. BFS를 위한 큐를 초기화하고 시작점 (0,0)을 추가한 뒤, 시작점의 거리를 1로 설정하여 방문 처리합니다.
3. 큐가 빌 때까지 반복하며, 큐에서 현재 위치 (r, c)를 꺼내고 현재까지의 거리(dist)를 가져옵니다.
4. 현재 위치가 목적지 (n-1, n-1)이면 dist를 반환합니다.
5. 현재 위치에서 8방향으로 인접한 셀들을 탐색하여, 유효한 범위 내에 있고 값이 0(방문하지 않은 통과 가능한 셀)인 경우 해당 셀의 값을 dist + 1로 업데이트하고 큐에 추가합니다.
6. 큐가 비워질 때까지 목적지에 도달하지 못하면 -1을 반환합니다.

## ⚠️ 주의할 점

- 시작점 또는 도착점이 1인 경우 경로가 없으므로 BFS 시작 전에 예외 처리가 필요합니다.
- 8방향 탐색 시 배열의 경계를 벗어나지 않도록 인덱스 유효성 검사를 철저히 해야 합니다.
- BFS 탐색 중 방문한 셀은 다시 방문하지 않도록 처리해야 하며, 이 코드에서는 `grid` 배열에 거리를 저장하는 방식으로 방문 여부를 동시에 처리합니다.
- 경로의 길이는 방문한 셀의 개수이므로, 시작점을 1로 초기화하고 다음 셀부터 1씩 증가시켜야 합니다.

## 📁 제출 코드

- 풀이 파일: [solution.java](./solution.java)
- 수집 위치: `Data Structures & Algorithms/shortest-path-in-binary-matrix/submission-0.java`

## ⏱️ 복잡도 분석

- 시간 복잡도: O(N^2)
- 공간 복잡도: O(N^2)

## ✅ 한 줄 요약

8방향 이동이 가능한 이진 행렬에서 BFS를 사용하여 (0,0)부터 (n-1, n-1)까지의 최단 경로 길이를 찾는 문제로, `grid` 배열에 거리를 저장하며 방문 여부를 관리합니다.

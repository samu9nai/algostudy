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
<!-- AI_ANALYSIS: version=v1 model=gemini-3.1-flash-lite hash=fd8ba1a5aaa40296 -->

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
- 8방향 이동을 고려하여 현재 위치에서 인접한 모든 0인 셀을 큐에 추가합니다.
- 방문한 셀을 다시 방문하지 않도록 입력 배열 자체를 수정하여 별도의 방문 배열 없이 상태를 관리합니다.

## 🧮 정답 계산식

시작점 (0, 0)에서 도착점 (n-1, n-1)까지 도달하는 최단 거리는 BFS 탐색 중 각 셀에 기록된 누적 거리값으로 결정됩니다.

## 🔍 구현 흐름

1. 시작점과 도착점이 0인지 확인하여 유효하지 않으면 즉시 -1을 반환합니다.
2. 큐를 생성하고 시작점 (0, 0)을 넣은 뒤 해당 위치의 값을 1로 업데이트합니다.
3. 큐가 빌 때까지 반복하며 현재 위치에서 8방향으로 인접한 셀을 탐색합니다.
4. 범위 내에 있고 값이 0인 셀을 발견하면 현재 거리 + 1을 해당 셀에 기록하고 큐에 추가합니다.
5. 도착점에 도달하는 순간 기록된 거리값을 반환하고, 큐가 빌 때까지 찾지 못하면 -1을 반환합니다.

## ⚠️ 주의할 점

- 시작점이나 도착점이 1인 경우를 반드시 먼저 체크해야 합니다.
- 이미 방문한 셀을 다시 방문하지 않도록 grid 값을 1로 변경하여 중복 탐색을 방지해야 합니다.
- 8방향 이동을 위한 행과 열의 변화량 배열을 정확히 정의해야 합니다.

## 📁 제출 코드

- 풀이 파일: [solution.java](./solution.java)
- 수집 위치: `Data Structures & Algorithms/shortest-path-in-binary-matrix/submission-0.java`

## ⏱️ 복잡도 분석

- 시간 복잡도: O(N^2)
- 공간 복잡도: O(N^2)

## ✅ 한 줄 요약

8방향 BFS를 사용하여 이진 행렬의 시작점에서 도착점까지의 최단 경로 길이를 구하는 문제입니다.

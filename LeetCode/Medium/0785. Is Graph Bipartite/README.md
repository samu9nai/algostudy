# 🧩 Is Graph Bipartite?

## 📌 문제 정보

| 항목 | 내용 |
| --- | --- |
| 플랫폼 | LeetCode |
| 문제 번호 | 785 |
| 난이도 | Medium |
| 분류 | Depth-First Search, Breadth-First Search, Union-Find, Graph Theory |
| 언어 | Java |
| 제출 일자 | 2026년 05월 19일 13:50:17 |
| 문제 링크 | [Is Graph Bipartite?](https://leetcode.com/problems/is-graph-bipartite/) |
| 원본 경로 | `Only in LeetCode/0785-is-graph-bipartite/0785-is-graph-bipartite.java` |
<!-- AI_ANALYSIS: version=v1 model=gemini-3.1-flash-lite hash=8e2dbbe3a6077363 -->

## 📝 문제 설명

There is an **undirected** graph with `n` nodes, where each node is numbered between `0` and `n - 1`. You are given a 2D array `graph`, where `graph[u]` is an array of nodes that node `u` is adjacent to. More formally, for each `v` in `graph[u]`, there is an undirected edge between node `u` and node `v`. The graph has the following properties:

- There are no self-edges (`graph[u]` does not contain `u`).

- There are no parallel edges (`graph[u]` does not contain duplicate values).

- If `v` is in `graph[u]`, then `u` is in `graph[v]` (the graph is undirected).

- The graph may not be connected, meaning there may be two nodes `u` and `v` such that there is no path between them.

A graph is **bipartite** if the nodes can be partitioned into two independent sets `A` and `B` such that **every** edge in the graph connects a node in set `A` and a node in set `B`.

Return `true`*if and only if it is **bipartite***.

**Example 1:**

```text
Input: graph = [[1,2,3],[0,2],[0,1,3],[0,2]]
Output: false
Explanation: There is no way to partition the nodes into two independent sets such that every edge connects a node in one and a node in the other.
```

**Example 2:**

```text
Input: graph = [[1,3],[0,2],[1,3],[0,2]]
Output: true
Explanation: We can partition the nodes into two sets: {0, 2} and {1, 3}.
```

**Constraints:**

- `graph.length == n`

- `1 <= n <= 100`

- `0 <= graph[u].length < n`

- `0 <= graph[u][i] <= n - 1`

- `graph[u]` does not contain `u`.

- All the values of `graph[u]` are **unique**.

- If `graph[u]` contains `v`, then `graph[v]` contains `u`.

## 📥 입력

```text
graph = [[1,2,3],[0,2],[0,1,3],[0,2]]
```

## 📤 출력

```text
false
```

설명: There is no way to partition the nodes into two independent sets such that every edge connects a node in one and a node in the other.

## 💡 핵심 아이디어

- 이분 그래프는 인접한 노드끼리 서로 다른 색으로 칠할 수 있는 그래프를 의미합니다.
- BFS를 사용하여 각 노드를 1과 -1이라는 두 가지 색으로 번갈아 가며 칠합니다.
- 이미 색칠된 인접 노드가 현재 노드와 같은 색을 가지고 있다면 이분 그래프가 아닙니다.
- 그래프가 연결되지 않았을 수 있으므로 모든 노드를 순회하며 탐색을 수행해야 합니다.

## 🧮 정답 계산식

인접한 두 노드 u와 v에 대해 color[u] != color[v] 조건을 만족해야 하며, 탐색 중 color[next] == color[cur]인 경우가 발생하면 즉시 false를 반환합니다.

## 🔍 구현 흐름

1. 노드의 색상을 저장할 배열을 0으로 초기화합니다.
2. 모든 노드를 순회하며 아직 색칠되지 않은 노드를 시작점으로 잡습니다.
3. 시작 노드를 1로 설정하고 큐에 삽입하여 BFS를 시작합니다.
4. 인접 노드가 색칠되지 않았다면 현재 노드와 반대 색을 부여하고 큐에 넣습니다.
5. 인접 노드가 이미 색칠되어 있고 현재 노드와 색이 같다면 false를 반환합니다.
6. 모든 노드에 대해 모순 없이 색칠이 완료되면 true를 반환합니다.

## ⚠️ 주의할 점

- 그래프가 여러 개의 연결 요소로 나뉘어 있을 수 있으므로 모든 노드에 대해 반복문을 수행해야 합니다.
- 이미 방문한 노드(색상이 0이 아닌 노드)는 다시 큐에 넣지 않도록 주의해야 합니다.

## 📁 제출 코드

- 풀이 파일: [solution.java](./solution.java)
- 수집 위치: `Only in LeetCode/0785-is-graph-bipartite/0785-is-graph-bipartite.java`

## ⏱️ 복잡도 분석

- 시간 복잡도: O(V + E)
- 공간 복잡도: O(V)

## ✅ 한 줄 요약

BFS를 활용하여 그래프의 모든 노드를 두 가지 색으로 칠하며 인접 노드 간 색상 충돌 여부를 확인하는 방식으로 이분 그래프를 판별합니다.

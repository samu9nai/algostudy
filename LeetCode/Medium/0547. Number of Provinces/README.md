# 🧩 Number of Provinces

## 📌 문제 정보

| 항목 | 내용 |
| --- | --- |
| 플랫폼 | NeetCode |
| 문제 번호 | 547 |
| 난이도 | Medium |
| 분류 | Depth-First Search, Breadth-First Search, Union-Find, Graph Theory |
| 언어 | Java |
| 제출 일자 | 2026년 05월 13일 14:58:08 |
| 문제 링크 | [Number of Provinces](https://leetcode.com/problems/number-of-provinces/) |
| 원본 경로 | `Data Structures & Algorithms/number-of-provinces/submission-0.java` |
<!-- AI_ANALYSIS: version=v1 model=gemini-2.5-flash hash=b8da7e8b9183a845 -->

## 📝 문제 설명

There are `n` cities. Some of them are connected, while some are not. If city `a` is connected directly with city `b`, and city `b` is connected directly with city `c`, then city `a` is connected indirectly with city `c`.

A **province** is a group of directly or indirectly connected cities and no other cities outside of the group.

You are given an `n x n` matrix `isConnected` where `isConnected[i][j] = 1` if the `i-th` city and the `j-th` city are directly connected, and `isConnected[i][j] = 0` otherwise.

Return the total number of **provinces**.

**Example 1:**

```text
Input: isConnected = [
 [1,1,0],
 [1,1,0],
 [0,0,1]
]

Output: 2
```

**Example 2:**

```text
Input: isConnected = [
 [1,0,1],
 [0,1,1],
 [1,1,1]
]

Output: 1
```

**Constraints:**

- `1 <= n <= 200`

- `n == isConnected.length == isConnected[i].length`

- `isConnected[i][j]` is either `0` or `1`.

- `isConnected[i][i] == 1`

- `isConnected[i][j] == isConnected[j][i]`

## 📥 입력

```text
isConnected = [
 [1,1,0],
 [1,1,0],
 [0,0,1]
]
```

## 📤 출력

```text
2
```

## 💡 핵심 아이디어

- 주어진 도시 연결 정보를 그래프의 인접 행렬로 해석하여 연결 요소를 찾는 문제입니다.
- 깊이 우선 탐색(DFS)을 사용하여 한 도시에서 시작하여 연결된 모든 도시를 탐색합니다.
- 아직 방문하지 않은 도시를 발견할 때마다 새로운 지방(연결 요소)이 시작된 것으로 간주하고 카운트를 증가시킵니다.
- 한 번 방문한 도시는 다시 탐색하지 않도록 `visited` 배열을 사용하여 중복 탐색을 방지합니다.

## 🧮 정답 계산식

새로운 연결 요소의 시작점을 발견할 때마다 지방의 개수를 나타내는 변수를 1 증가시킵니다.

## 🔍 구현 흐름

1. 도시의 개수 `n`을 가져오고, 각 도시의 방문 여부를 기록할 `visited` 배열을 `false`로 초기화합니다.
2. 총 지방의 개수를 저장할 `provinces` 변수를 `0`으로 초기화합니다.
3. `0`부터 `n-1`까지 각 도시 `i`에 대해 반복합니다.
4. 만약 도시 `i`가 아직 방문되지 않았다면, `provinces`를 1 증가시키고, 도시 `i`에서 DFS를 시작하여 이 도시에 연결된 모든 도시를 방문 처리합니다.
5. 모든 도시를 탐색한 후 `provinces` 값을 반환합니다.
6. DFS 함수는 현재 도시를 방문 처리하고, 현재 도시와 연결된 아직 방문하지 않은 모든 이웃 도시에 대해 재귀적으로 DFS를 호출합니다.

## ⚠️ 주의할 점

- `isConnected[i][i]`는 항상 1이지만, DFS 탐색 시 `visited` 배열을 통해 자기 자신을 다시 방문하지 않도록 처리됩니다.
- `isConnected[i][j] == isConnected[j][i]` 조건에 따라 그래프가 무방향임을 인지하고, 한 번의 DFS 탐색으로 양방향 연결을 모두 처리합니다.
- 모든 도시를 정확히 한 번씩만 방문하도록 `visited` 배열의 상태를 철저히 관리해야 합니다.

## 📁 제출 코드

- 풀이 파일: [solution.java](./solution.java)
- 수집 위치: `Data Structures & Algorithms/number-of-provinces/submission-0.java`

## ⏱️ 복잡도 분석

- 시간 복잡도: O(N^2)
- 공간 복잡도: O(N)

## ✅ 한 줄 요약

주어진 도시 연결 정보를 그래프로 보고 DFS를 사용하여 연결된 구성 요소(지방)의 수를 계산하는 문제입니다.

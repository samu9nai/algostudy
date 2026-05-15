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
<!-- AI_ANALYSIS: version=v1 model=gemini-3.1-flash-lite hash=b8da7e8b9183a845 -->

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

- 그래프의 연결 성분(Connected Component) 개수를 구하는 문제로 해석합니다.
- 방문하지 않은 노드를 발견할 때마다 새로운 연결 성분이 시작되는 것으로 간주합니다.
- 깊이 우선 탐색(DFS)을 사용하여 현재 노드와 연결된 모든 노드를 방문 처리합니다.

## 🧮 정답 계산식

전체 노드 중 방문하지 않은 노드를 순회하며 DFS를 호출한 횟수가 곧 연결 성분(Province)의 총 개수입니다.

## 🔍 구현 흐름

1. 방문 여부를 기록할 boolean 배열을 생성합니다.
2. 모든 도시를 순회하며 방문하지 않은 도시를 찾습니다.
3. 방문하지 않은 도시를 발견하면 카운트를 증가시키고 해당 도시부터 DFS를 수행합니다.
4. DFS 내부에서 현재 도시와 연결된 모든 미방문 도시를 재귀적으로 방문 처리합니다.
5. 모든 순회가 끝나면 최종 카운트 값을 반환합니다.

## ⚠️ 주의할 점

- 인접 행렬의 크기가 n x n이므로 모든 노드를 확인하는 과정에서 중복 방문을 방지하기 위한 visited 배열 관리가 필수적입니다.

## 📁 제출 코드

- 풀이 파일: [solution.java](./solution.java)
- 수집 위치: `Data Structures & Algorithms/number-of-provinces/submission-0.java`

## ⏱️ 복잡도 분석

- 시간 복잡도: O(n^2)
- 공간 복잡도: O(n)

## ✅ 한 줄 요약

인접 행렬로 주어진 그래프에서 DFS를 활용해 연결 성분의 개수를 효율적으로 계산하는 문제입니다.

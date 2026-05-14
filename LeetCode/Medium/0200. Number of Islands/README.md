# 🧩 Number of Islands

## 📌 문제 정보

| 항목 | 내용 |
| --- | --- |
| 플랫폼 | NeetCode |
| 문제 번호 | 200 |
| 난이도 | Medium |
| 분류 | Array, Depth-First Search, Breadth-First Search, Union-Find, Matrix |
| 언어 | Java |
| 제출 일자 | 2026년 05월 14일 09:56:23 |
| 문제 링크 | [Number of Islands](https://leetcode.com/problems/number-of-islands/) |
| 원본 경로 | `Data Structures & Algorithms/count-number-of-islands/submission-0.java` |
<!-- AI_ANALYSIS: version=v1 model=gemini-2.5-flash hash=c131c0f7928d9515 -->

## 📝 문제 설명

Given a 2D grid `grid` where `'1'` represents land and `'0'` represents water, count and return the number of islands.

An **island** is formed by connecting adjacent lands horizontally or vertically and is surrounded by water. You may assume water is surrounding the grid (i.e., all the edges are water).

**Example 1:**

```text
Input: grid = [
 ["0","1","1","1","0"],
 ["0","1","0","1","0"],
 ["1","1","0","0","0"],
 ["0","0","0","0","0"]
 ]
Output: 1
```

**Example 2:**

```text
Input: grid = [
 ["1","1","0","0","1"],
 ["1","1","0","0","1"],
 ["0","0","1","0","0"],
 ["0","0","0","1","1"]
 ]
Output: 4
```

**Constraints:**

- `1 <= grid.length, grid[i].length <= 100`

- `grid[i][j]` is `'0'` or `'1'`.

## 📥 입력

```text
grid = [
 ["0","1","1","1","0"],
 ["0","1","0","1","0"],
 ["1","1","0","0","0"],
 ["0","0","0","0","0"]
 ]
```

## 📤 출력

```text
1
```

## 💡 핵심 아이디어

- 2D 격자를 순회하며 육지('1')를 발견하면 새로운 섬으로 간주하고 탐색을 시작합니다.
- 깊이 우선 탐색(DFS)을 사용하여 현재 육지 셀과 연결된 모든 육지 셀을 탐색합니다.
- 한번 방문한 육지 셀은 다시 방문하지 않도록 '0'으로 변경하여 중복 계산을 방지하고 무한 루프를 막습니다.

## 🧮 정답 계산식

격자를 순회하며 '1'을 발견할 때마다 섬의 개수를 1 증가시키고, 해당 섬에 속하는 모든 육지 셀을 '0'으로 변경하여 방문 처리합니다.

## 🔍 구현 흐름

1. 섬의 개수를 저장할 `islands` 변수를 0으로 초기화합니다.
2. 격자의 모든 셀을 순회하는 이중 반복문을 실행합니다.
3. 현재 셀 `grid[i][j]`가 '1'인 경우, `islands`를 1 증가시키고, 해당 셀부터 `dfs` 함수를 호출하여 연결된 모든 '1' 셀을 '0'으로 변경합니다.
4. `dfs` 함수는 현재 셀이 격자 범위를 벗어나거나 '0'인 경우 즉시 반환합니다.
5. `dfs` 함수는 현재 셀을 '0'으로 변경한 후, 상하좌우 네 방향의 인접 셀에 대해 재귀적으로 `dfs`를 호출합니다.
6. 모든 셀 순회가 끝나면 최종 `islands` 값을 반환합니다.

## ⚠️ 주의할 점

- DFS 재귀 호출 시 스택 오버플로우가 발생할 수 있으므로, 격자 크기가 매우 큰 경우 주의해야 합니다.
- 이미 방문한 육지 셀을 '0'으로 변경하여 다시 탐색하지 않도록 하는 처리가 필수적입니다.
- 격자 경계를 벗어나는 인덱스 접근을 방지하기 위한 조건문(`r < 0 || r >= row || c < 0 || c >= col`)을 정확히 구현해야 합니다.

## 📁 제출 코드

- 풀이 파일: [solution.java](./solution.java)
- 수집 위치: `Data Structures & Algorithms/count-number-of-islands/submission-0.java`

## ⏱️ 복잡도 분석

- 시간 복잡도: O(R * C)
- 공간 복잡도: O(R * C)

## ✅ 한 줄 요약

2D 격자에서 DFS를 사용하여 연결된 육지 덩어리(섬)의 개수를 세는 문제로, 방문한 육지는 '0'으로 표시하여 중복 계산을 방지합니다.

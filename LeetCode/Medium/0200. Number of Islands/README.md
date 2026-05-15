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
<!-- AI_ANALYSIS: version=v1 model=gemini-3.1-flash-lite hash=c131c0f7928d9515 -->

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

- 2차원 격자를 순회하며 육지('1')를 발견할 때마다 새로운 섬으로 간주합니다.
- DFS를 사용하여 발견된 육지와 연결된 모든 인접 육지를 방문 처리합니다.
- 방문한 육지는 '0'으로 변경하여 중복 방문을 방지하고 섬의 개수를 카운트합니다.

## 🧮 정답 계산식

전체 격자를 순회하며 grid[i][j] == '1'인 지점을 찾을 때마다 섬의 개수를 1 증가시키고, 해당 지점으로부터 DFS를 수행하여 연결된 모든 '1'을 '0'으로 변환합니다.

## 🔍 구현 흐름

1. 격자의 행과 열 크기를 확인하고 섬의 개수를 저장할 변수를 초기화합니다.
2. 이중 반복문을 통해 격자의 모든 셀을 순회합니다.
3. 현재 셀이 '1'인 경우 섬의 개수를 증가시키고 DFS 함수를 호출합니다.
4. DFS 함수 내에서 경계 조건을 확인하고 현재 셀이 '0'이면 즉시 반환합니다.
5. 현재 셀을 '0'으로 변경한 뒤 상하좌우 네 방향으로 재귀 호출을 수행합니다.

## ⚠️ 주의할 점

- 재귀 호출 시 격자의 범위를 벗어나는 인덱스 접근을 방지해야 합니다.
- 이미 방문한 육지를 다시 방문하지 않도록 '0'으로 마킹하는 과정이 필수적입니다.
- 입력 격자가 비어있을 경우에 대한 예외 처리가 필요할 수 있습니다.

## 📁 제출 코드

- 풀이 파일: [solution.java](./solution.java)
- 수집 위치: `Data Structures & Algorithms/count-number-of-islands/submission-0.java`

## ⏱️ 복잡도 분석

- 시간 복잡도: O(M * N)
- 공간 복잡도: O(M * N)

## ✅ 한 줄 요약

2차원 격자에서 DFS를 사용하여 연결된 육지 컴포넌트의 개수를 구하는 문제입니다.

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

## 📝 문제 설명

- There are n cities. Some of them are connected, while some are not. If city a is connected directly with city b, and city b is connected directly with city c, then city a is connected indirectly with city c. A province is a group of directly or indirectly connected cities and no other cities outside of the group. You…
- 주요 제약: 1 <= n <= 200 / n == isConnected.length == isConnected[i].length
- 핵심 분류: Depth-First Search, Breadth-First Search, Union-Find, Graph Theory
- 문제 원문 전체는 저장하지 않고, 링크와 요약 정보만 보관합니다.

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

- DFS로 연결된 상태를 깊게 따라가며 방문 여부를 관리한다.
- BFS로 같은 거리의 상태를 차례대로 확장한다.
- 노드와 간선의 연결 관계를 기준으로 방문 가능한 영역을 탐색한다.

## 🧮 정답 계산식

정답은 조건을 만족하는 노드/칸/컴포넌트를 탐색하며 누적합니다.

## 🔍 구현 흐름

1. 입력으로 주어진 값과 예외 케이스를 먼저 정리한다.
2. 큐를 사용해 가까운 상태부터 방문하고, 방문 여부를 함께 관리한다.
3. 정답 조건을 만족하면 결과를 갱신하거나 즉시 반환한다.
4. 모든 입력을 처리한 뒤 최종 결과를 반환한다.

## ⚠️ 주의할 점

- 제약 조건: 1 <= n <= 200 / n == isConnected.length == isConnected[i].length / isConnected[i][j] is either 0 or 1.
- 방문 처리 시점이 늦으면 중복 방문이나 무한 탐색이 생길 수 있다.

## 📁 제출 코드

- 풀이 파일: [solution.java](./solution.java)
- 수집 위치: `Data Structures & Algorithms/number-of-provinces/submission-0.java`

## ⏱️ 복잡도 분석

- 시간 복잡도: 직접 분석 필요
- 공간 복잡도: 직접 분석 필요

## ✅ 한 줄 요약

Number of Provinces은 Depth-First Search, Breadth-First Search 관점에서 핵심 조건을 빠르게 판별하는 문제입니다.

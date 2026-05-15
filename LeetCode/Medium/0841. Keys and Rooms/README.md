# 🧩 Keys and Rooms

## 📌 문제 정보

| 항목 | 내용 |
| --- | --- |
| 플랫폼 | LeetCode |
| 문제 번호 | 841 |
| 난이도 | Medium |
| 분류 | Depth-First Search, Breadth-First Search, Graph Theory |
| 언어 | Java |
| 제출 일자 | 2026년 05월 13일 15:50:27 |
| 문제 링크 | [Keys and Rooms](https://leetcode.com/problems/keys-and-rooms/) |
| 원본 경로 | `Only in LeetCode/0841-keys-and-rooms/0841-keys-and-rooms.java` |
<!-- AI_ANALYSIS: version=v1 model=gemini-3.1-flash-lite hash=053653481880d579 -->

## 📝 문제 설명

There are `n` rooms labeled from `0` to `n - 1` and all the rooms are locked except for room `0`. Your goal is to visit all the rooms. However, you cannot enter a locked room without having its key.

When you visit a room, you may find a set of **distinct keys** in it. Each key has a number on it, denoting which room it unlocks, and you can take all of them with you to unlock the other rooms.

Given an array `rooms` where `rooms[i]` is the set of keys that you can obtain if you visited room `i`, return `true` *if you can visit **all** the rooms, or* `false` *otherwise*.

**Example 1:**

```text
Input: rooms = [[1],[2],[3],[]]
Output: true
Explanation:
We visit room 0 and pick up key 1.
We then visit room 1 and pick up key 2.
We then visit room 2 and pick up key 3.
We then visit room 3.
Since we were able to visit every room, we return true.
```

**Example 2:**

```text
Input: rooms = [[1,3],[3,0,1],[2],[0]]
Output: false
Explanation: We can not enter room number 2 since the only key that unlocks it is in that room.
```

**Constraints:**

- `n == rooms.length`

- `2 <= n <= 1000`

- `0 <= rooms[i].length <= 1000`

- `1 <= sum(rooms[i].length) <= 3000`

- `0 <= rooms[i][j] < n`

- All the values of `rooms[i]` are **unique**.

## 📥 입력

```text
rooms = [[1],[2],[3],[]]
```

## 📤 출력

```text
true
```

설명: We visit room 0 and pick up key 1.
We then visit room 1 and pick up key 2.
We then visit room 2 and pick up key 3.
We then visit room 3.
Since we were able to visit every room, we return true.

## 💡 핵심 아이디어

- 방을 노드, 열쇠를 간선으로 간주하여 그래프 탐색 문제로 치환합니다.
- 너비 우선 탐색(BFS)을 사용하여 0번 방부터 시작해 도달 가능한 모든 방을 방문합니다.
- 방문 여부를 기록하는 불리언 배열을 사용하여 중복 방문을 방지하고 탐색 상태를 관리합니다.

## 🧮 정답 계산식

모든 방을 방문한 후 방문 배열의 모든 요소가 참(true)인지 확인하여 결과를 결정합니다.

## 🔍 구현 흐름

1. 방문 여부를 체크할 크기 n의 불리언 배열을 초기화합니다.
2. 큐에 시작점인 0번 방을 넣고 방문 처리합니다.
3. 큐가 빌 때까지 반복하며 현재 방에서 얻은 열쇠들을 확인합니다.
4. 아직 방문하지 않은 방의 열쇠라면 큐에 추가하고 방문 처리합니다.
5. 탐색 종료 후 방문 배열을 순회하며 모든 방이 방문되었는지 검사합니다.

## ⚠️ 주의할 점

- 이미 방문한 방의 열쇠를 다시 큐에 넣지 않도록 방문 배열을 반드시 확인해야 합니다.
- 방의 개수가 2개 이상이므로 최소한의 탐색 로직은 항상 수행됩니다.

## 📁 제출 코드

- 풀이 파일: [solution.java](./solution.java)
- 수집 위치: `Only in LeetCode/0841-keys-and-rooms/0841-keys-and-rooms.java`

## ⏱️ 복잡도 분석

- 시간 복잡도: O(N + K), 여기서 N은 방의 개수, K는 모든 방에 있는 열쇠의 총 개수입니다.
- 공간 복잡도: O(N), 방문 배열과 큐를 저장하기 위한 공간이 필요합니다.

## ✅ 한 줄 요약

너비 우선 탐색을 통해 0번 방에서 시작하여 모든 방에 도달 가능한지 확인하는 그래프 탐색 문제입니다.

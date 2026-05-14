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
<!-- AI_ANALYSIS: version=v1 model=gemini-2.5-flash hash=053653481880d579 -->

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

- 방과 열쇠의 관계를 그래프로 모델링하여 방을 노드로, 열쇠를 간선으로 간주합니다.
- 0번 방에서 시작하여 열쇠를 통해 도달할 수 있는 모든 방을 탐색합니다.
- BFS(너비 우선 탐색)를 사용하여 0번 방에서 도달 가능한 모든 방을 효율적으로 찾습니다.

## 🧮 정답 계산식

모든 방을 방문할 수 있는지 여부는 0번 방에서 시작하는 BFS 탐색을 통해 도달 가능한 노드의 수가 전체 방의 수와 같은지 여부로 판정합니다.

## 🔍 구현 흐름

1. 방문 여부를 추적할 `visited` 배열과 BFS 탐색을 위한 `Queue`를 초기화합니다.
2. 0번 방을 `Queue`에 추가하고 `visited[0]`을 `true`로 설정하여 탐색을 시작합니다.
3. `Queue`가 빌 때까지 다음 과정을 반복합니다: `Queue`에서 현재 방을 꺼내고, 해당 방에서 얻은 각 열쇠에 대해 열쇠가 여는 방이 아직 방문되지 않았다면 방문 처리하고 `Queue`에 추가합니다.
4. BFS 탐색이 완료된 후, `visited` 배열을 순회하며 모든 방이 방문되었는지 확인합니다.
5. 하나라도 방문되지 않은 방이 있다면 `false`를 반환하고, 모든 방이 방문되었다면 `true`를 반환합니다.

## ⚠️ 주의할 점

- 이미 방문한 방은 `Queue`에 다시 추가하지 않도록 `visited` 배열을 사용하여 중복 탐색을 방지해야 합니다.
- 방 번호는 0부터 `n-1`까지 유효한 범위 내에 있습니다.
- 초기에는 0번 방만 열려있으므로 항상 0번 방에서 탐색을 시작해야 합니다.

## 📁 제출 코드

- 풀이 파일: [solution.java](./solution.java)
- 수집 위치: `Only in LeetCode/0841-keys-and-rooms/0841-keys-and-rooms.java`

## ⏱️ 복잡도 분석

- 시간 복잡도: O(N + M) (N은 방의 수, M은 총 열쇠의 수)
- 공간 복잡도: O(N) (N은 방의 수)

## ✅ 한 줄 요약

0번 방에서 시작하여 BFS를 통해 열쇠로 도달 가능한 모든 방을 탐색하고, 모든 방을 방문할 수 있는지 여부를 확인하는 그래프 탐색 문제입니다.

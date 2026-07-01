# 🧩 Reverse Linked List

## 📌 문제 정보

| 항목 | 내용 |
| --- | --- |
| 플랫폼 | NeetCode |
| 문제 번호 | 206 |
| 난이도 | Easy |
| 분류 | Linked List, Recursion |
| 언어 | Java |
| 제출 일자 | 2026년 07월 01일 10:25:59 |
| 문제 링크 | [Reverse Linked List](https://leetcode.com/problems/reverse-linked-list/) |
| 원본 경로 | `Data Structures & Algorithms/reverse-a-linked-list/submission-0.java` |
<!-- AI_ANALYSIS: version=v1 model=gemini-3.1-flash-lite hash=bd64da1b26611ae8 -->

## 📝 문제 설명

Given the beginning of a singly linked list `head`, reverse the list, and return the new beginning of the list.

**Example 1:**

```text
Input: head = [0,1,2,3]

Output: [3,2,1,0]
```

**Example 2:**

```text
Input: head = []

Output: []
```

**Constraints:**

- `0 <= The length of the list <= 1000`.

- `-1000 <= Node.val <= 1000`

## 📥 입력

```text
head = [0,1,2,3]
```

## 📤 출력

```text
[3,2,1,0]
```

## 💡 핵심 아이디어

- 연결 리스트의 각 노드를 순회하며 현재 노드의 다음 노드를 이전 노드로 재지정한다.
- 반복문을 사용하여 추가적인 메모리 할당 없이 제자리에서 포인터 방향을 뒤집는다.
- 이전 노드, 현재 노드, 다음 노드를 가리키는 세 개의 포인터를 활용하여 리스트의 연결을 유지한다.

## 🧮 정답 계산식

현재 노드의 next 포인터를 이전 노드(prev)로 변경하고, prev와 curr 포인터를 한 칸씩 이동시키는 과정을 curr이 null이 될 때까지 반복한다.

## 🔍 구현 흐름

1. 이전 노드를 가리킬 prev 변수를 null로 초기화한다.
2. 현재 노드를 가리킬 curr 변수를 head로 설정한다.
3. curr이 null이 아닐 때까지 반복문을 수행한다.
4. 다음 노드를 임시 저장하고 현재 노드의 next를 prev로 변경한다.
5. prev를 현재 노드로, curr을 임시 저장한 다음 노드로 갱신한다.
6. 반복문 종료 후 새로운 리스트의 시작점인 prev를 반환한다.

## ⚠️ 주의할 점

- 리스트가 비어있는 경우(head가 null)를 처리할 수 있어야 한다.
- 포인터 갱신 순서가 잘못되면 리스트의 뒷부분 연결 정보가 유실될 수 있으므로 주의해야 한다.

## 📁 제출 코드

- 풀이 파일: [solution.java](./solution.java)
- 수집 위치: `Data Structures & Algorithms/reverse-a-linked-list/submission-0.java`

## ⏱️ 복잡도 분석

- 시간 복잡도: O(N)
- 공간 복잡도: O(1)

## ✅ 한 줄 요약

세 개의 포인터를 사용하여 연결 리스트의 노드 방향을 순차적으로 뒤집는 반복적 접근 방식입니다.

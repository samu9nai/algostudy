# 🧩 Reverse A Linked List

## 📌 문제 정보

| 항목 | 내용 |
| --- | --- |
| 플랫폼 | NeetCode |
| 문제 번호 | - |
| 난이도 | LeetCode |
| 분류 | 수집되지 않음 |
| 언어 | Java |
| 제출 일자 | 2026년 07월 01일 10:25:59 |
| 문제 링크 | [Reverse A Linked List](https://leetcode.com/problems/reverse-a-linked-list/) |
| 원본 경로 | `Data Structures & Algorithms/reverse-a-linked-list/submission-0.java` |
<!-- AI_ANALYSIS: version=v1 model=gemini-3.1-flash-lite hash=169ad90561cbca44 -->

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

- 단일 연결 리스트의 각 노드 방향을 역순으로 뒤집기 위해 이전 노드와 현재 노드를 추적한다.
- 반복문을 사용하여 리스트의 끝까지 순회하며 각 노드의 next 포인터를 이전 노드로 재설정한다.
- 추가적인 자료구조 없이 포인터 조작만으로 제자리에서 리스트를 뒤집는다.

## 🧮 정답 계산식

현재 노드의 next 포인터를 이전 노드(prev)로 변경하고, prev와 현재 노드(curr)를 한 칸씩 전진시키는 과정을 curr이 null이 될 때까지 반복한다.

## 🔍 구현 흐름

1. 이전 노드를 가리킬 prev 변수를 null로 초기화하고, 현재 노드를 가리킬 curr 변수를 head로 설정한다.
2. curr이 null이 아닐 때까지 반복문을 수행한다.
3. 현재 노드의 다음 노드를 임시 변수 temp에 저장하여 유실을 방지한다.
4. 현재 노드의 next 포인터를 prev로 변경하여 역방향 연결을 생성한다.
5. prev를 현재 노드로, curr을 temp로 갱신하여 다음 노드로 이동한다.
6. 반복문 종료 후 마지막 노드인 prev를 새로운 리스트의 시작점으로 반환한다.

## ⚠️ 주의할 점

- 빈 리스트(head가 null인 경우)가 입력될 때 반복문이 실행되지 않고 null을 올바르게 반환하는지 확인해야 한다.
- 노드의 next 포인터를 변경하기 전에 다음 노드 정보를 미리 저장하지 않으면 리스트의 연결이 끊겨 메모리 누수나 오류가 발생할 수 있다.

## 📁 제출 코드

- 풀이 파일: [solution.java](./solution.java)
- 수집 위치: `Data Structures & Algorithms/reverse-a-linked-list/submission-0.java`

## ⏱️ 복잡도 분석

- 시간 복잡도: O(N)
- 공간 복잡도: O(1)

## ✅ 한 줄 요약

반복문을 통해 각 노드의 next 포인터를 이전 노드로 재지정함으로써 단일 연결 리스트를 제자리에서 역순으로 뒤집는 알고리즘입니다.

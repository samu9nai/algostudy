# 🧩 Depth Of Binary Tree

## 📌 문제 정보

| 항목 | 내용 |
| --- | --- |
| 플랫폼 | NeetCode |
| 문제 번호 | - |
| 난이도 | LeetCode |
| 분류 | 수집되지 않음 |
| 언어 | Java |
| 제출 일자 | 2026년 05월 19일 09:28:59 |
| 문제 링크 | [Depth Of Binary Tree](https://leetcode.com/problems/depth-of-binary-tree/) |
| 원본 경로 | `Data Structures & Algorithms/depth-of-binary-tree/submission-0.java` |
<!-- AI_ANALYSIS: version=v1 model=gemini-3.1-flash-lite hash=291092af01198f37 -->

## 📝 문제 설명

Given the `root` of a binary tree, return its **depth**.

The **depth** of a binary tree is defined as the number of nodes along the longest path from the root node down to the farthest leaf node.

**Example 1:**

```text
Input: root = [1,2,3,null,null,4]

Output: 3
```

**Example 2:**

```text
Input: root = []

Output: 0
```

**Constraints:**

- `0 <= The number of nodes in the tree <= 100`.

- `-100 <= Node.val <= 100`

## 📥 입력

```text
root = [1,2,3,null,null,4]
```

## 📤 출력

```text
3
```

## 💡 핵심 아이디어

- 이진 트리의 최대 깊이는 루트 노드에서 가장 먼 리프 노드까지의 경로에 있는 노드의 개수입니다.
- 재귀를 사용하여 왼쪽 서브트리의 깊이와 오른쪽 서브트리의 깊이를 각각 구합니다.
- 현재 노드를 기준으로 양쪽 서브트리 중 더 큰 깊이 값에 1을 더하여 전체 깊이를 계산합니다.

## 🧮 정답 계산식

트리의 최대 깊이 = 1 + max(왼쪽 서브트리의 최대 깊이, 오른쪽 서브트리의 최대 깊이)이며, 노드가 null일 경우 깊이는 0입니다.

## 🔍 구현 흐름

1. 루트 노드가 null인지 확인하여 null이면 0을 반환합니다.
2. 재귀 함수를 호출하여 왼쪽 자식 노드의 최대 깊이를 구합니다.
3. 재귀 함수를 호출하여 오른쪽 자식 노드의 최대 깊이를 구합니다.
4. 두 값 중 큰 값을 선택하고 1을 더해 현재 노드까지의 깊이를 반환합니다.

## ⚠️ 주의할 점

- 입력으로 빈 트리(null)가 들어오는 경우를 반드시 처리해야 합니다.
- 재귀 호출 시 스택 오버플로우가 발생하지 않도록 트리의 최대 깊이가 시스템 스택 제한 내에 있는지 고려해야 합니다.

## 📁 제출 코드

- 풀이 파일: [solution.java](./solution.java)
- 수집 위치: `Data Structures & Algorithms/depth-of-binary-tree/submission-0.java`

## ⏱️ 복잡도 분석

- 시간 복잡도: O(N)
- 공간 복잡도: O(H)

## ✅ 한 줄 요약

재귀적 분할 정복을 통해 이진 트리의 왼쪽과 오른쪽 서브트리 깊이 중 최댓값을 찾아 전체 깊이를 구하는 문제입니다.

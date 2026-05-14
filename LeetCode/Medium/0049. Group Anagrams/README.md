# 🧩 Group Anagrams

## 📌 문제 정보

| 항목 | 내용 |
| --- | --- |
| 플랫폼 | NeetCode |
| 문제 번호 | 49 |
| 난이도 | Medium |
| 분류 | Array, Hash Table, String, Sorting |
| 언어 | Java |
| 제출 일자 | 2026년 05월 12일 16:01:24 |
| 문제 링크 | [Group Anagrams](https://leetcode.com/problems/group-anagrams/) |
| 원본 경로 | `Data Structures & Algorithms/anagram-groups/submission-1.java` |

## 📝 문제 설명

- Given an array of strings strs, group all anagrams together into sublists. You may return the output in any order. An anagram is a string that contains the exact same characters as another string, but the order of the characters can be different.
- 주요 제약: 1 <= strs.length <= 1000. / 0 <= strs[i].length <= 100
- 핵심 분류: Array, Hash Table, String, Sorting
- 문제 원문 전체는 저장하지 않고, 링크와 요약 정보만 보관합니다.

## 📥 입력

```text
strs = ["act","pots","tops","cat","stop","hat"]
```

## 📤 출력

```text
[["hat"],["act", "cat"],["stop", "pots", "tops"]]
```

## 💡 핵심 아이디어

- 배열을 한 번 이상 순회하면서 필요한 상태를 누적한다.
- 해시 기반 조회로 이미 본 값이나 필요한 보완 값을 빠르게 찾는다.
- 문자 단위의 순서, 빈도, 짝 관계를 명확히 관리한다.
- 정렬을 이용해 비교 기준을 단순화하거나 같은 그룹을 모은다.

## 🧮 정답 계산식

각 문자열을 정렬한 값 또는 문자 빈도 벡터를 같은 애너그램 그룹의 key로 사용합니다.

## 🔍 구현 흐름

1. 입력으로 주어진 값과 예외 케이스를 먼저 정리한다.
2. 빠른 조회가 필요한 값을 해시맵 또는 해시셋에 저장한다.
3. 정답 조건을 만족하면 결과를 갱신하거나 즉시 반환한다.
4. 모든 입력을 처리한 뒤 최종 결과를 반환한다.

## ⚠️ 주의할 점

- 제약 조건: 1 <= strs.length <= 1000. / 0 <= strs[i].length <= 100 / strs[i] is made up of lowercase English letters.
- 같은 값을 여러 번 사용할 수 있는지, 인덱스 중복이 허용되는지 확인한다.

## 📁 제출 코드

- 풀이 파일: [solution.java](./solution.java)
- 수집 위치: `Data Structures & Algorithms/anagram-groups/submission-1.java`

## ⏱️ 복잡도 분석

- 시간 복잡도: O(m * n)
- 공간 복잡도: O(m)

## ✅ 한 줄 요약

Group Anagrams은 Array, Hash Table 관점에서 핵심 조건을 빠르게 판별하는 문제입니다. 목표 시간 복잡도는 O(m * n)입니다.

# algostudy

알고리즘 문제 풀이를 플랫폼별로 자동 백업하고 정리하는 저장소입니다.

BaekjoonHub, CodeTree GitHub 연동, 그리고 LeetCode/NeetCode 동기화 파이프라인을 함께 사용합니다. 각 문제 폴더에는 문제별 `README.md`와 제출 코드가 저장됩니다.

## 📚 플랫폼

| 플랫폼 | 저장 위치 | 수집 방식 |
| --- | --- | --- |
| BOJ | `백준/` | [BaekjoonHub](https://github.com/BaekjoonHub/BaekjoonHub) |
| Programmers | `프로그래머스/` | [BaekjoonHub](https://github.com/BaekjoonHub/BaekjoonHub) |
| CodeTree | `코드트리/` | [CodeTree GitHub 연동](https://www.codetree.ai/ko/github) |
| LeetCode / NeetCode | `LeetCode/` | `neetcode-submissions` → GitHub Actions 정규화 |

## 🧭 현재 스냅샷

2026년 05월 14일 기준입니다.

| 플랫폼 | 문제 수 |
| --- | ---: |
| BOJ | 343 |
| Programmers | 202 |
| CodeTree | 6 |
| LeetCode / NeetCode | 11 |

## 🗂️ 폴더 구조

```text
백준/
  Bronze/
  Silver/
  Gold/
  Unrated/

프로그래머스/
  Lv0/
  Lv1/
  Lv2/
  Lv3/

코드트리/
  samsung-sw/

LeetCode/
  Easy/
    0001. Two Sum/
      README.md
      solution.java
  Medium/
    0841. Keys and Rooms/
      README.md
      solution.java
```

## 🔄 LeetCode 동기화 흐름

LeetCode와 NeetCode 풀이는 별도 source repository인 [`samu9nai/neetcode-submissions`](https://github.com/samu9nai/neetcode-submissions)에 먼저 저장됩니다.

```text
samu9nai/neetcode-submissions
  → GitHub Actions
  → 문제 메타데이터/요약 정규화
  → samu9nai/algostudy/LeetCode
```

NeetCode에서 자동 커밋되는 문제는 source repository의 `Data Structures & Algorithms/` 아래에 저장됩니다. NeetCode에 없는 LeetCode-only 문제는 source repository에 아래 형태로 수동 업로드하면 됩니다.

```text
Only in LeetCode/
  0841-keys-and-rooms/
    0841-keys-and-rooms.java
```

동기화가 끝나면 이 저장소에는 아래처럼 정리됩니다.

```text
LeetCode/
  Medium/
    0841. Keys and Rooms/
      README.md
      solution.java
```

## 📝 LeetCode README 생성 기준

LeetCode 문제별 README는 템플릿 기반으로 생성됩니다.

- 문제 번호, 제목, 난이도, 태그, 링크를 정리합니다.
- 예제 입력/출력과 제약 조건을 가능한 범위에서 파싱합니다.
- 핵심 아이디어, 구현 흐름, 주의할 점, 복잡도 섹션을 생성합니다.
- 문제 원문 전체는 저장하지 않고 요약 정보만 보관합니다.
- 제출 코드는 `solution.<ext>` 형식으로 저장합니다.

템플릿은 source repository의 [`scripts/templates/leetcode-readme.md`](https://github.com/samu9nai/neetcode-submissions/blob/main/scripts/templates/leetcode-readme.md)에서 관리합니다.

## 원칙

- 풀이 코드는 플랫폼별 자동화 결과를 최대한 그대로 보존합니다.
- 문제별 README는 링크, 메타데이터, 요약, 풀이 흐름을 빠르게 다시 보기 위한 용도로 사용합니다.
- BaekjoonHub와 CodeTree가 관리하는 폴더는 별도 정규화 스크립트가 수정하지 않습니다.
- LeetCode 정규화 파이프라인은 `LeetCode/` 폴더만 갱신합니다.

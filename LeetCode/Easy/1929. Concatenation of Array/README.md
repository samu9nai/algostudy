# 🧩 Concatenation of Array

## 📌 문제 정보

| 항목 | 내용 |
| --- | --- |
| 플랫폼 | NeetCode |
| 문제 번호 | 1929 |
| 난이도 | Easy |
| 분류 | Array, Simulation |
| 언어 | Java |
| 제출 일자 | 2026년 05월 11일 16:40:50 |
| 문제 링크 | [Concatenation of Array](https://leetcode.com/problems/concatenation-of-array/) |
| 원본 경로 | `Data Structures & Algorithms/concatenation-of-array/submission-0.java` |
<!-- AI_ANALYSIS: version=v1 model=gemini-3.1-flash-lite hash=f09d13ed71fa4482 -->

## 📝 문제 설명

You are given an integer array `nums` of length `n`. Create an array `ans` of length `2n` where `ans[i] == nums[i]` and `ans[i + n] == nums[i]` for `0 <= i < n` **(0-indexed)**.

Specifically, `ans` is the concatenation of two `nums` arrays.

Return the array `ans`.

**Example 1:**

```text
Input: nums = [1,4,1,2]

Output: [1,4,1,2,1,4,1,2]
```

**Example 2:**

```text
Input: nums = [22,21,20,1]

Output: [22,21,20,1,22,21,20,1]
```

**Constraints:**

- `1 <= nums.length <= 1000`.

- `1 <= nums[i] <= 1000`

## 📥 입력

```text
nums = [1,4,1,2]
```

## 📤 출력

```text
[1,4,1,2,1,4,1,2]
```

## 💡 핵심 아이디어

- 입력 배열의 길이를 두 배로 확장한 새로운 배열을 생성합니다.
- 기존 배열의 데이터를 새로운 배열의 앞부분과 뒷부분에 각각 복사합니다.
- 자바의 내장 라이브러리인 System.arraycopy를 활용하여 효율적으로 메모리를 복사합니다.

## 🧮 정답 계산식

길이가 n인 배열 nums에 대해, 길이가 2n인 배열 ans를 생성하고 ans[i] = nums[i] 및 ans[i + n] = nums[i]를 만족하도록 값을 채웁니다.

## 🔍 구현 흐름

1. 입력 배열 nums의 길이를 구합니다.
2. Arrays.copyOf를 사용하여 길이가 2배인 새로운 배열을 생성하고 초기 n개의 요소를 복사합니다.
3. System.arraycopy를 사용하여 원본 배열의 모든 요소를 새로운 배열의 인덱스 n 위치부터 복사합니다.
4. 완성된 배열을 반환합니다.

## ⚠️ 주의할 점

- 배열의 인덱스 범위를 초과하지 않도록 2n 크기의 배열을 정확히 할당해야 합니다.
- System.arraycopy 사용 시 소스 배열, 시작 위치, 대상 배열, 대상 시작 위치, 복사 길이를 정확히 지정해야 합니다.

## 📁 제출 코드

- 풀이 파일: [solution.java](./solution.java)
- 수집 위치: `Data Structures & Algorithms/concatenation-of-array/submission-0.java`

## ⏱️ 복잡도 분석

- 시간 복잡도: O(n)
- 공간 복잡도: O(n)

## ✅ 한 줄 요약

입력 배열의 길이를 두 배로 늘린 뒤, 원본 데이터를 두 번 복사하여 이어 붙이는 방식으로 문제를 해결합니다.

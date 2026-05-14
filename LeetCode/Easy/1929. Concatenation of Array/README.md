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
<!-- AI_ANALYSIS: version=v1 model=gemini-2.5-flash hash=f09d13ed71fa4482 -->

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

- 원본 배열의 길이를 두 배로 하는 새 배열을 생성합니다.
- 원본 배열의 내용을 새 배열의 앞부분과 뒷부분에 각각 복사하여 채웁니다.

## 🧮 정답 계산식

결과 배열 ans의 i번째 요소는 nums[i % n]과 같습니다. (여기서 n은 nums의 길이)

## 🔍 구현 흐름

1. 입력 배열 nums의 길이를 n으로 저장합니다.
2. n * 2 크기의 새 정수 배열 doubled를 생성하고, Arrays.copyOf를 사용하여 nums의 내용을 doubled의 첫 n개 요소에 복사합니다.
3. System.arraycopy를 사용하여 nums의 모든 요소를 doubled 배열의 n번째 인덱스부터 n개 요소만큼 복사합니다.
4. 완성된 doubled 배열을 반환합니다.

## ⚠️ 주의할 점

- 새로 생성할 배열의 크기가 원본 배열 길이의 정확히 두 배가 되도록 해야 합니다.
- System.arraycopy 사용 시, 복사할 원본 배열의 시작 인덱스, 대상 배열의 시작 인덱스, 복사할 요소의 개수를 정확히 지정해야 합니다.
- Arrays.copyOf는 첫 번째 인자로 주어진 배열의 내용을 두 번째 인자로 주어진 길이의 새 배열에 복사하며, 길이가 원본보다 길면 나머지 부분은 기본값(0)으로 채워집니다. 이 문제에서는 첫 n개 요소만 채우는 데 사용됩니다.

## 📁 제출 코드

- 풀이 파일: [solution.java](./solution.java)
- 수집 위치: `Data Structures & Algorithms/concatenation-of-array/submission-0.java`

## ⏱️ 복잡도 분석

- 시간 복잡도: O(n)
- 공간 복잡도: O(n)

## ✅ 한 줄 요약

주어진 배열을 두 번 연결한 새로운 배열을 생성하기 위해 Arrays.copyOf와 System.arraycopy를 활용하여 효율적으로 배열을 복사하는 문제입니다.

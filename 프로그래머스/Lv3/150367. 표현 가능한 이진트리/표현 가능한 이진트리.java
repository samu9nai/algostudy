class Solution {
    public int[] solution(long[] numbers) {
        int[] answer = new int[numbers.length];

        for (int i = 0; i < numbers.length; i++) {
            String bin = Long.toBinaryString(numbers[i]);

            int size = 1;
            while (size < bin.length()) {
                size = size * 2 + 1;
            }

            StringBuilder sb = new StringBuilder();

            for (int j = 0; j < size - bin.length(); j++) {
                sb.append('0');
            }
            sb.append(bin);
            String tree = sb.toString();

            answer[i] = check(tree, 0, tree.length() - 1, false) ? 1 : 0;
        }

        return answer;
    }

    private boolean check(String tree, int left, int right, boolean parentZero) {
        if (left > right) return true;

        int mid = (left + right) / 2;

        char cur = tree.charAt(mid);

        if (parentZero && (cur == '1')) return false;

        boolean currentDummy = (cur == '0');

        return check(tree, left, mid - 1, currentDummy)
            && check(tree, mid + 1, right, currentDummy);
    }
}
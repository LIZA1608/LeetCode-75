class Solution {
    public boolean isValidSudoku(char[][] board) {
         Set<Character>[] rows = new HashSet[9];
        Set<Character>[] cols = new HashSet[9];
        Set<Character>[] boxes = new HashSet[9];
         for (int i = 0; i < 9; i++) {
            rows[i] = new HashSet<>();
            cols[i] = new HashSet<>();
            boxes[i] = new HashSet<>();
        }
for (int i = 0; i < 9; i++) {
            for (int j = 0; j < 9; j++) {
                char val = board[i][j];

                // Skip empty cells
                if (val == '.') continue;

                // Check row
                if (rows[i].contains(val)) return false;
                rows[i].add(val);

                // Check column
                if (cols[j].contains(val)) return false;
                cols[j].add(val);

                // Check 3x3 sub-box
                int boxIdx = (i / 3) * 3 + j / 3;
                if (boxes[boxIdx].contains(val)) return false;
                boxes[boxIdx].add(val);
            }
        }

        return true;
    }
}

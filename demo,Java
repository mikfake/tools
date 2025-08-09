import java.util.*;

public class Test {
    public static int[] stateOfCells(int[] cell, int days) {
        int[] answer = new int[8];  // Changed from 100 to 8

        // Process for the given number of days
        for (int day = 0; day < days; day++) {
            // Create a temporary array to store the next state
            int[] nextState = new int[8];

            // Process each cell
            for (int i = 0; i < 8; i++) {
                int leftNeighbor, rightNeighbor;

                // Handle boundary conditions
                if (i == 0) {
                    leftNeighbor = 0;  // No left neighbor for first cell
                    rightNeighbor = cell[1];
                } else if (i == 7) {
                    leftNeighbor = cell[6];
                    rightNeighbor = 0;  // No right neighbor for last cell
                } else {
                    leftNeighbor = cell[i - 1];
                    rightNeighbor = cell[i + 1];
                }

                // If both neighbors are the same (both 0 or both 1), cell becomes inactive
                // Otherwise, cell becomes active
                if (leftNeighbor == rightNeighbor) {
                    nextState[i] = 0;
                } else {
                    nextState[i] = 1;
                }
            }

            // Update the cell array with the next state
            for (int i = 0; i < 8; i++) {
                cell[i] = nextState[i];
            }
        }

        // Copy final state to answer array
        for (int i = 0; i < 8; i++) {
            answer[i] = cell[i];
        }

        return answer;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        // Input for cell
        int cell_size = in.nextInt();
        int cell[] = new int[cell_size];
        for (int idx = 0; idx < cell_size; idx++) {
            cell[idx] = in.nextInt();
        }

        // Input for days
        int days = in.nextInt();

        int[] result = stateOfCells(cell, days);
        for (int idx = 0; idx < 8; idx++) {  // Changed to iterate only 8 times
            if (idx < 7) {
                System.out.print(result[idx] + " ");
            } else {
                System.out.print(result[idx]);  // No space after last element
            }
        }
    }
}








import java.util.HashMap;
import java.util.Scanner;

public class demo {
    public static int nonRepeatedChar(String compString) {
        int answer = 0;
        // 用于存储字符及其出现次数
        HashMap<Character, Integer> charCountMap = new HashMap<>();

        // 第一步：统计每个字符的出现次数
        for (char ch : compString.toCharArray()) {
            charCountMap.put(ch, charCountMap.getOrDefault(ch, 0) + 1);
        }

        // 第二步：遍历原字符串，统计「只出现一次」的字符数量
        // （按字符串顺序遍历，保证统计的是「首次且仅出现一次」的字符逻辑 ）
        for (char ch : compString.toCharArray()) {
            if (charCountMap.get(ch) == 1) {
                answer++;
                // 避免重复统计同一字符（比如字符多次出现但次数为1的情况，按题目需求只需算1次 ）
                // 这里将次数置为0，后续遇到相同字符不再重复计数
                charCountMap.put(ch, 0);
            }
        }

        return answer;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String compString = in.nextLine();
        int result = nonRepeatedChar(compString);
        System.out.print(result);
    }
}













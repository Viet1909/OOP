package b1;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class tohop {

	// Hàm chính để tìm các hoán vị
    public static void generatePermutations(int[] nums, int start, List<List<Integer>> result) {
        if (start == nums.length) {
            // Nếu đã đến cuối, thêm hoán vị hiện tại vào danh sách kết quả
            List<Integer> currentPermutation = new ArrayList<>();
            for (int num : nums) {
                currentPermutation.add(num);
            }
            result.add(currentPermutation);
            return;
        }

        // Sinh hoán vị
        for (int i = start; i < nums.length; i++) {
            // Hoán đổi phần tử
            swap(nums, start, i);
            // Gọi đệ quy để tạo hoán vị tiếp theo
            generatePermutations(nums, start + 1, result);
            // Hoán đổi lại để trở về trạng thái ban đầu
            swap(nums, start, i);
        }
    }

    // Hàm hoán đổi hai phần tử trong mảng
    private static void swap(int[] nums, int i, int j) {
        int temp = nums[i];
        nums[i] = nums[j];
        nums[j] = temp;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt(); // Đọc giá trị n

        // Tạo mảng từ 1 đến n
        int[] nums = new int[n];
        for (int i = 0; i < n; i++) {
            nums[i] = i + 1;
        }

        // Danh sách lưu trữ các hoán vị
        List<List<Integer>> result = new ArrayList<>();

        // Gọi hàm để sinh các hoán vị
        generatePermutations(nums, 0, result);

        // In ra kết quả theo định dạng yêu cầu
        for (List<Integer> permutation : result) {
            for (int i = 0; i < permutation.size(); i++) {
                System.out.print(permutation.get(i));
                if (i < permutation.size() - 1) {
                    System.out.print(" "); // In khoảng trắng giữa các phần tử
                }
            }
            System.out.println(); // Xuống dòng sau mỗi hoán vị
        }

        sc.close();
    }
}

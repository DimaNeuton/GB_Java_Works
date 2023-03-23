// 3. Дан массив nums = [3,2,2,3] и число val = 3.
//Если в массиве есть числа, равные заданному, нужно перенести эти элементы в конец массива.
//Таким образом, первые несколько (или все) элементов массива должны быть отличны от заданного, а остальные - равны ему.

package Work01;

public class Task3 {
    public static void main(String[] args) {
        replaceArrItem();
    }
    private static void replaceArrItem() {
        int[] nums = {1, 3, 3, 4, 5, 3, 2, 3, 6};
        int val = 3;
        int backIndex = 0;
        int frontIndex = 0;
        int[] newNums = new int[nums.length];
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == val) {
                newNums[nums.length - 1 - backIndex] = val;
                backIndex++;
            }
            else {
                newNums[frontIndex] = nums[i];
                frontIndex++;
            }
            if (frontIndex == nums.length - backIndex) {
                break;
            }
        }
        for (int item : newNums) {
            System.out.print(item + " ");
        }
    }
}

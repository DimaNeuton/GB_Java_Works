package Work01;

public class Main
{
    public static void main(String[] args)
    {
//        inputNameAndPrint();
        int[] array = {1, 1, 0, 1, 1, 1, 1, 1, 0, 0, 1, 0};
        int count = 0;
        int maxCount = 0;
        for (int num : array)
        {
            if (num == 1)
            {
                count++;
                if (count > maxCount)
                {
                     maxCount = count;
                }
            }
            else
            {
                count = 0;
            }
        }
        System.out.print(maxCount);
//    private static void inputNameAndPrint() {
//        Scanner in = new Scanner(System.in);
//        System.out.print("Введите имя: ");
//        String name = in.next();
//        System.out.print("Привет, " + name);
//    }
    }
}

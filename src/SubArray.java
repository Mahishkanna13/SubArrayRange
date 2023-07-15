import java.util.Scanner;

public class SubArray {
    public static void Result(int[] array,int starting,int ending)
    {
        for(int i=starting;i<=ending;i++)
        {
            System.out.print(array[i]+" ");
        }
    }
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int size=scanner.nextInt();
        int[] Array=new int[size];
        for(int i=0;i<size;i++)
        {
            Array[i]=scanner.nextInt();
        }
        int StartingIndex=scanner.nextInt();
        int EndingIndex=scanner.nextInt();
        Result(Array,StartingIndex,EndingIndex);
    }
}

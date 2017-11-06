import java.util.Random;

public class ShellSortTest {
    
    public static void main(String[] args) {
        int size = 20; //数组大小
        ShellSortTest s = new ShellSortTest();
        
        int array[] = s.GenerateArray(size);
        
        System.out.println("排序前");
        s.displaySort(array);
        s.ShellSort(array);
        System.out.println("\n排序后");
        s.displaySort(array);
    }
   //生成数组
    public int[] GenerateArray(int size) {
        int temp[]= new int[size];
        Random random = new Random();

        for(int i = 0; i < size; i++) {
            temp[i] = Math.abs(random.nextInt()%100);
        }
        return temp;
    }
    //显示数组    
    public void displaySort(int array[]) {
        for(int i = 0; i < array.length; i++) {
            System.out.print(array[i]+" ");
        }
    }
    
    public void ShellSort(int array[]) {
        //  算出空间间隔数
        for(int space = array.length/2; space > 0; space = space/2) {
            for(int i = 0; i < space; i++) {
                sort(array, i, space);
            }
        }
    }
    //选出的间隔数组进行排序
    public void sort(int a[], int CurrIndex, int space) {
        for(int i = CurrIndex; i <  a.length; i = i + space) {
            int tmp = a[i];
            for(int j = i; j < a.length; j = j + space) {
                if(a[i] > a[j]) {
                    a[i] = a[j];
                    a[j] = tmp;                    
                }
            }
        }
    }
}
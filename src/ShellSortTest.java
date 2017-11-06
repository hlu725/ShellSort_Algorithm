import java.util.Random;

public class ShellSortTest {
    
    public static void main(String[] args) {
        int size = 20; //�����С
        ShellSortTest s = new ShellSortTest();
        
        int array[] = s.GenerateArray(size);
        
        System.out.println("����ǰ");
        s.displaySort(array);
        s.ShellSort(array);
        System.out.println("\n�����");
        s.displaySort(array);
    }
   //��������
    public int[] GenerateArray(int size) {
        int temp[]= new int[size];
        Random random = new Random();

        for(int i = 0; i < size; i++) {
            temp[i] = Math.abs(random.nextInt()%100);
        }
        return temp;
    }
    //��ʾ����    
    public void displaySort(int array[]) {
        for(int i = 0; i < array.length; i++) {
            System.out.print(array[i]+" ");
        }
    }
    
    public void ShellSort(int array[]) {
        //  ����ռ�����
        for(int space = array.length/2; space > 0; space = space/2) {
            for(int i = 0; i < space; i++) {
                sort(array, i, space);
            }
        }
    }
    //ѡ���ļ�������������
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
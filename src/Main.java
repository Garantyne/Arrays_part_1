public class Main {
    public static void main(String[] args) {
        //Задача 1
        int[] arr = new int[]{1,2,3};
        double[] arry = {1.57, 7.654, 9.986};
        long[] Arr = new long[50];
        //Задача 2
        for (int i = 0; i < 3; i++) {
            System.out.print(arr[i] + ", ");
        }
        System.out.println();
        for (int i = 0; i < 3; i++) {//тут через запятую совсем некрасиво и непонятно будет через пробел сделал
            System.out.print(arry[i] + " ");
        }
        System.out.println();
        for (int i = 0; i < Arr.length; i++) {//и тут через пробел, пробел рулит)
            System.out.print(Arr[i] + " ");
        }
        System.out.println();
        //Задача 3
        for (int i = 2; i >= 0; i--) {
            System.out.print(arr[i]+ ", ");
        }
        System.out.println();
        for (int i = 2; i >= 0; i--) {
            System.out.print(arry[i]+ " ");
        }
        System.out.println();
        for (int i = Arr.length-1; i >= 0; i--) {//забавно с нулями получается, по ним ведь не понять что они в обратном
            System.out.print(Arr[i]);//порядке вывелись XD поди ничего, по коду то видно что все ок)
        }
        System.out.println();
        //Задание 4
        for (int i = 0; i < 3; i++) {//кажись прокатило)))
            if(arr[i]%2>0){
                arr[i]+=1;
            }
        }
        for (int i = 0; i < 3; i++) {
            System.out.print(arr[i] + ", ");
        }
        System.out.println();

    }
}
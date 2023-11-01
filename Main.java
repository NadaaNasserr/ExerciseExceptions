import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner S = new Scanner(System.in);


        //E2
//        try {
//            System.out.println("enter number");
//        int num = S.nextInt();
//    int[] array = {1, 1, 1, 3, 3, 5};
//    int count = 0;
//    for (int i = 0; i < array.length; i++) {
//        if (array[i] == num) {
//            count++;
//        }
//    }System.out.println(num + " occurs " + count + " times");
//}catch (InputMismatchException e) {
//            System.out.println("Enter numbers only");
//        }


        //E3

// try {
//     int[] array = {1, 4, 17, 7, 25, 3, 100};
//     System.out.println("enter any number");
//    int num =S.nextInt();
//    Arrays.sort(array);
//    System.out.println(Arrays.toString(array));
//    for( int i = array.length-1 ; i>=array.length-num; i--){
//        System.out.println(array[i]);
//    }
//
//}catch (ArrayIndexOutOfBoundsException e){
//    System.out.println(e.getMessage());
//}catch (InputMismatchException e){
//
//    System.out.println(e.getMessage());
//}


        //E5


//        try {
//            System.out.println("Enter the  Size elements of the array: ");
//            int sizearray = S.nextInt();
//            int[] array = new int[sizearray];
//            System.out.println("1. Accept elements of an array");
//            System.out.println("2. Display elements of an array");
//            System.out.println("3. Search the element within array");
//            System.out.println("4. Sort the array");
//            System.out.println("5. To Stop");
//            int menu = S.nextInt();
//            menu(menu);
//            while (menu != 5) {
//
//
//                switch (menu) {
//
//                    case 1:
//                        System.out.println("Enter the elements of the array: ");
//                        for (int i = 0; i < sizearray; i++) {
//                            int elements = S.nextInt();
//                            array[i] = elements;
//                        }
//                        break;
//
//                    case 2:
//                        System.out.println("Display elements of an array");
//
//                        System.out.println(Arrays.toString(array) + " ");
//
//                        break;
//                    case 3:
//                        System.out.println("Enter a number to search");
//                        int search = S.nextInt();
//                        for (int i = 0; i < array.length; i++) {
//                            if (array[i] == search) {
//                                System.out.println("Yes I found number " + search);
//                                break;
//                            } else System.out.println("No found the number " + search);
//                            break;
//                        }
//                        break;
//                    case 4:
//                        System.out.println(" Sort the array");
//                        Arrays.sort(array);
//                        for (int i = 0; i < array.length; i++) {
//                            System.out.println(array[i]);
//                        }
//                        break;
//                    default:
//                        System.out.println("Choose a correct number from the menu from number 1 to number 5 ");
//
//                }
//
//                System.out.println("1. Accept elements of an array");
//                System.out.println("2. Display elements of an array");
//                System.out.println("3. Search the element within array");
//                System.out.println("4. Sort the array");
//                System.out.println("5. To Stop");
//                menu = S.nextInt();
//            }
//        } catch (Exception e) {
//            System.out.println(e.getMessage());
//        }


        //E6
//        try {
//            Random rand = new Random();
//            System.out.println("Enter the minimum value of the range: ");
//            int minimum =S.nextInt();
//            System.out.println("Enter the maximum value of the range: ");
//            int maximum =S.nextInt();
//            System.out.println("Enter the number of random numbers to generate");
//            int random =S.nextInt();
//
//            for (int i =0 ; i<random; i++){
//                System.out.println(rand.nextInt(  maximum - minimum) + minimum);
//            }
//
//        }catch (InputMismatchException e){
//            System.out.println("Something wrong Please Enter numbers only");
//        }



        // E8
//        //  Fibonacci();
//        try {
//            System.out.println("Enter the number of Fibonacci terms to generate: ");
//            int number =S.nextInt();
//            int num0=0;
//            int num1=1;
//            int sum =0;
//            System.out.print(num0+ " , ");
//            System.out.print(num1);
//            for (int i = 2; i<number; i++){
//                sum =  num0 + num1;
//                System.out.print(" , " + sum);
//                num0 =num1;
//                num1 = sum;
//            }
//            //  System.out.println( sum);
//        }catch (InputMismatchException e){
//            System.out.println("enter numbers only");
//        }


    }


    //3


    //    E5
//    public static void menu(int menu) throws Exception {
//
//        if (menu > 5)
//            throw new Exception("Wrong Number!! Choose a correct number from the menu from number 1 to number 5 ");
//
//    }
}
































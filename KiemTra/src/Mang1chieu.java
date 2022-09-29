import java.util.Scanner;

public class Mang1chieu {
    public static void main(String[] args) {
        Scanner cs = new Scanner(System.in);
        System.out.println("Nhập vào kích thước của mảng : ");
        int size = Integer.parseInt(cs.nextLine());
        int[] arr = new int[size];
        do {
            System.out.println("     ");

            System.out.println("*****MENU*****");
            System.out.println("1: Nhập các giá trị của mảng.");
            System.out.println("2: Hiển thị các phần tử của mảng");
            System.out.println("3: In ra các số nguyên tố trong mảng");
            System.out.println("4: In giá trị max, min các phần tử trong mảng ");
            System.out.println("5: Sắp xếp mảng giảm dần");
            System.out.println("6: Thoát");

            System.out.println("  ");
            int pick = Integer.parseInt(cs.nextLine());
            switch (pick) {
                case 1:
                    for (int i = 0; i < arr.length; i++) {
                        System.out.printf("Nhập vào các phần tử của mảng : ", (i+1));
                        arr[i]=Integer.parseInt(cs.nextLine());
                    }
                    break;
                case 2:
                    System.out.println("Các phần tử của mảng là : ");
                    for (int i = 0; i < arr.length; i++) {
                        System.out.print("  " + arr[i] );
                    }
                    System.out.println("  ");
                    break;
                case 3:
                    System.out.println("Các số nguyên tố có trong mảng là: ");
                    for (int i = 0; i < arr.length; i++) {
                        if(arr[i]<2){
                            continue;
                        }else {
                            int a=2;
                            boolean check = true;
                            while (a<=Math.sqrt(arr[i])){
                                if(arr[i]%a==0){
                                    check=false;
                                    break;
                                }a++;
                            }
                            if (check)
                                System.out.print( arr[i] + "   ");
                            else
                                continue;
                        }
                    }
                    System.out.println("  ");
                    break;
                case 4:
                    System.out.println("Các phần tử max , min của mảng là : ");
                    int max = arr[0];
                    int min = arr[0];
                    for (int i = 0; i < arr.length; i++) {
                        if(max<arr[i]){
                            max=arr[i];
                        }
                        if(min>arr[i]){
                            min=arr[i];
                        }
                    }System.out.println("MAX = " + max );
                    System.out.println("MIN = " + min);

                    System.out.println("  ");
                    break;
                case 5:
                    System.out.println("Các phần tử sau khi sắp xếp là : ");
                    for (int i = 0; i < arr.length; i++) {
                        for (int j = i+1; j < arr.length; j++) {
                            if(arr[i]<arr[j]){
                                int x=arr[i];
                                arr[i]=arr[j];
                                arr[j]=x;
                            }
                        }System.out.print(arr[i] + "  ");
                    }
                    System.out.println("  ");
                    break;
                case 6:
                    System.exit(0);
                    break;
            }
        }while (true);
    }
}

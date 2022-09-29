import java.util.Scanner;

public class Mang2chieu {
    public static void main(String[] args) {
        int sDong, sCot;
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập vào số dòng : ");
        sDong = Integer.parseInt(sc.nextLine());
        System.out.println("Nhập vào số cột : ");
        sCot = Integer.parseInt(sc.nextLine());
        int[][] Hung = new int[sDong][sCot];

        do {
            System.out.println("     ");

            System.out.println("*****MENU*****");
            System.out.println("1: Nhập các phần tử của mảng.");
            System.out.println("2: Hiển thị các phần tử của mảng theo ma trận");
            System.out.println("3: In ra các phần tử nằm trên đường chéo chính, phụ và tổng");
            System.out.println("4: Sắp xếp mảng tăng dần theo cột ");
            System.out.println("5: Thoát");

            System.out.println("  ");
            int pick = Integer.parseInt(sc.nextLine());
            switch (pick) {
                case 1:
                    for (int i = 0; i < sDong; i++) {
                        for (int j = 0; j < sCot; j++) {
                            System.out.print("Nhập phần tử thứ ["+i+","+j+"]:");
                            Hung[i][j] = Integer.parseInt(sc.nextLine());
                        }
                    }
                    break;
                case 2:
                    System.out.println("Các phần tử của mảng là  :");
                    for (int i = 0; i < sDong; i++) {
                        for (int j = 0; j < sCot; j++) {
                            System.out.print(Hung[i][j] + "\t");
                        }
                        System.out.println("\n");
                    }
                    break;
                case 3:
                    //Đường chéo chính
                    int sum1=0;
                    System.out.println("Đường chéo chính là : ");
                    for (int i = 0; i < sDong; i++) {
                        for (int j = 0; j < sCot; j++) {
                            if(i==j){
                                sum1 += Hung[i][j];
                                System.out.print( Hung[i][j] + " ");
                            }
                            }
                    }System.out.print( "Tổng của đường chéo chính  = " + sum1 + "\t");
                    System.out.println("\n");

                    //Đường chéo phụ
                    int sum2=0;
                    System.out.println("Đường chéo phụ là : ");
                    for (int i = 0; i < sDong; i++) {
                        for (int j = 0; j < sCot; j++) {
                            if(i+j == sCot-1){
                                sum2 += Hung[i][j];
                                System.out.print(Hung[i][j] + " ");
                            }
                        }
                    }
                    System.out.print( "Tổng của đường chéo phụ  = " + sum2 + "\t");
                    System.out.println("\n");
                    break;
                case 4:
                    for (int i = 0; i < sCot; i++) {
                        for (int j = 0; j < sDong; j++) {
                            for(int k=0;k<sCot;k++)    {
                             if(Hung[i][j]<Hung[k][j])     {
                                 int t = Hung[i][j];
                                 Hung[i][j]=Hung[k][j];
                                 Hung[k][j]=t;

                                }
                            }
                        }
                    }
                    for (int i = 0; i < sDong; i++) {
                        for (int j = 0; j < sCot; j++) {
                            System.out.print(Hung[i][j] + "   ");
                        }
                        System.out.println("   ");
                    }
                    break;
                case 5:
                    System.exit(0);
                    break;
            }
        } while (true);
    }
}


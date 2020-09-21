/**
 * 键盘输入2019的月份和day,输入时第几天
 * 2019年是非闰年
 */
// import java.util.Scanner;

// class Date {
//      public static void main(String[] args) {
//          Scanner scan = new Scanner(System.in);
//          System.out.println("请依次输入month和day,中间空格分隔");
//          int month = scan.nextInt();
//          int day = scan.nextInt();
//          switch(month){
//              case 1:System.out.println("第"+day+"天");
//              break;
//              case 2:System.out.println("第"+(day+31)+"天");
//              break;
//              case 3:System.out.println("第"+day+"天");
//              break;
//              case 4:System.out.println("第"+day+"天");
//              break;
//              case 5:System.out.println("第"+day+"天");
//              break;
//              case 6:System.out.println("第"+day+"天");
//              break;
//              case 7:System.out.println("第"+day+"天");
//              break;
//              case 8:System.out.println("第"+day+"天");
//              break;
//              case 9:System.out.println("第"+day+"天");
//                  break;
//              case 10:System.out.println("第"+day+"天");
//                  break;
//              case 11:System.out.println("第"+day+"天");
//                  break;
//              case 12:System.out.println("第"+day+"天");
//                  break;
//          }
//      }
//  }

// import java.util.Scanner;

// class Date {
// public static void main(String[] args) {
//     Scanner scan = new Scanner(System.in);
//     System.out.println("请依次输入month和day,中间空格分隔");
//     int month = scan.nextInt();
//     int day = scan.nextInt();
//     if(month > 1){
//         System.out.println("正确");
//     }
//     scan.close();
//  }
// }

/**
 * 输出九九乘法表
 */
// class Multiplication {
//     public static void main(String[] args) {
//         for(int i = 1;i <= 9;i++){
//             for(int j = 1;j <= i;j++){
//                 System.out.print(i+"*"+j+" = "+i*j+" ");
//             }
//             System.out.println("\n");
//         }
//     }
// }

/**输出100以内的质数 */
class Multiplication {
    public static void main(String[] args) {
        for (int i = 2; i <= 100; i++) {
            for (int j = 1; j < i; j++) {

            }
            System.out.println("\n");
        }
    }
}
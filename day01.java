// class IdentifierTest {
//     public static void main(String[] args){
//         int myAge = 12;
//         System.out.println(myAge);
//     }
// }

/*
计算机中不同进制的使用说明

对于整数，有四种表示方式：
> 二进制(binary)：0,1 ，满2进1.以0b或0B开头。
> 十进制(decimal)：0-9 ，满10进1。
> 八进制(octal)：0-7 ，满8进1. 以数字0开头表示。
> 十六进制(hex)：0-9及A-F，满16进1. 以0x或0X开头表示。此处的A-F不区分大小写。
    如：0x21AF +1= 0X21B0



*/
// class BinaryTest {
//     public static void main(String[] args){

//         int num1 = 0b110;
//         int num2 = 110;
//         int num3 = 0127;
//         int num4 = 0x110A;

//         System.out.println("num1 = " + num1);
//         System.out.println("num2 = " + num2);
//         System.out.println("num3 = " + num3);
//         System.out.println("num4 = " + num4);

//     }
// }
// class VariableTest1 {
//     public static void main(String[] args) {
//         byte b1 = 19;
//         byte b2 = -128;
//         System.out.println(b1);
//         System.out.println(b2);
//         char c1 = '1';//12就错了。里面只能一个字符
//         System.out.println(c1);
//     }
// }
/*强制类型转换*/
// class VariableTest3 {
//     public static void main(String[] args) {
//         double d1 = 12.3;
//         int i1 = (int)d1;
//         System.out.println(i1);
//     }
// }

// class VariableTest4 {
//     public static void main(String[] args) {
//         double d1 = 12.3;
//         int i1 = (int) d1;
//         System.out.println(i1);
//     }
// }

// class StringTest{
//     public static void main(String[] args){
//         // String s1 = "hello world";
//         // String s2 = "1";
//         // String number = " 1001";
//         // String info = s1 + number;
//         // boolean b1 = true;
//         // System.out.println(b1 + s1);
//         // System.out.println(info);

//     }
// }

// class BinaryTest {
//     public static void main(String[] args) {
//         int num1 = 0b110;
//         int num2 = 0124;
//         System.out.println(num1);
//         System.out.println(num2);
//     }
// }
//
// import java.util.Scanner;
// class ScannerTest{
//     public static void main(String[] args) {

//         Scanner scan = new Scanner(System.in);

//         System.out.println("请输入你的姓名: ");
//         // int nb = scan.nextInt(); \
//         String name = scan.next();
//         System.out.println(name);
//     }
// }
import java.util.Scanner;

class StudentScore {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("请输入学生的成绩: ");
        int score = scan.nextInt();
        int flag = score/10;
        switch(flag){
            case 0:
            case 1:
            case 2:
            case 3:
            case 4:
            case 5: System.out.println("不及格");break;
            case 6:
            case 7:
            case 8:
            case 9:
            case 10:System.out.println("及格");break;
            default:System.out.println("成绩输入错误");
        }
        scan.close();
    }
}
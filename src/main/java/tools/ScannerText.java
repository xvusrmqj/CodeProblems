package tools;

import java.util.Scanner;

/**
 * Scanner的使用
 * 参考：https://docs.oracle.com/javase/7/docs/api/java/util/Scanner.html
 */
public class ScannerText {
    public static void main(String[] args) {
//        readLineFromTerminal();
//        readFromTerminal();
        delimiter();
    }

    /**
     * 从控制台，读取一行
     */
    private static void readLineFromTerminal() {
        Scanner sc = new Scanner(System.in);
        while (sc.hasNext()) {
            String s = sc.nextLine();
            System.out.println(s);
        }
        sc.close();
    }
    /**
     * 从控制台，读取数字
     */
    private static void readFromTerminal() {
        Scanner sc = new Scanner(System.in);
        while (sc.hasNextInt()) { // 还有NextLong、NextByte、NextDouble、NextBoolean、NextShort、NextFloat、NextDouble等
            int i = sc.nextInt();
            System.out.println(i);
        }
        sc.close();
    }

    /**
     * 分隔符不为空白
     * 打印为：
     * 1
     * 2
     * red
     * blue
     */
    private static void delimiter() {
        String input = "1 fish 2 fish red fish blue fish";
        Scanner s = new Scanner(input).useDelimiter("\\s*fish\\s*");
        System.out.println(s.nextInt());
        System.out.println(s.nextInt());
        System.out.println(s.next());
        System.out.println(s.next());
        s.close();
    }
}

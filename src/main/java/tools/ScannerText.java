package tools;

import java.util.Scanner;

/**
 * Scanner的使用
 */
public class ScannerText {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (sc.hasNext()){
            String s = sc.nextLine();
            System.out.println(s);

            // 当输入end时结束
            if(s.equalsIgnoreCase("end")){
                break;
            }
        }
        sc.close();
    }
}

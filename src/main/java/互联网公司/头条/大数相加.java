package 互联网公司.头条;

import org.junit.Assert;
import org.junit.Test;

/**
 * 循环、条件的判断要再次核对
 */
public class 大数相加 {
    // 6:49 - 7:08 - 7:18
    public String add(String s1, String s2) {
        int mov = 0;// 进位
        StringBuilder sb = new StringBuilder();// 保存结果
        // 循环遍历，从尾到头
        for (int i = s1.length()-1, j = s2.length()-1; i >= 0 || j >= 0; i--, j--) {
            // 当为下标负数时，说明已经不需要它了。为了减少判断设为0
            int s1_int;
            if (i < 0) {
                s1_int = 0;
            } else {
                s1_int = s1.charAt(i) - '0';
            }
            // 当为下标负数时，说明已经不需要它了。为了减少判断设为0
            int s2_int;
            if (j < 0) {
                s2_int = 0;
            } else {
                s2_int = s2.charAt(j) - '0';
            }
            // 两数相加再加进位
            int s1_s2 = s1_int + s2_int + mov;
            // 使用进位后将进位再设置回默认值
            mov = 0;
            if (s1_s2 > 9) {
                mov = 1;
                sb.append(s1_s2 - 10);
            } else {
                sb.append(s1_s2);
            }
        }
        // 最后一个进位如果有值就加上。
        if(mov==1)
            sb.append(mov);
        return sb.reverse().toString();
    }
    @Test
    public void test(){
        Assert.assertEquals("2",add("1","1"));
        Assert.assertEquals("22",add("11","11"));
        Assert.assertEquals("12",add("1","11"));
        Assert.assertEquals("20",add("1","19"));
        Assert.assertEquals("10",add("1","9"));
        Assert.assertEquals("1000000111033333",add("111111111","999999999922222"));
//        Assert.assertEquals("18",add("-1","19")); // 负数不支持

    }
}

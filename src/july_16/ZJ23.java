package july_16;

import java.util.Scanner;
/*题目*/
/*题目描述
Z国的货币系统包含面值1元、4元、16元、64元共计4种硬币，以及面值1024元的纸币。现在小Y使用1024元的纸币购买了一件价值为N (0 < N \le 1024)N(0<N≤1024)的商品，请问最少他会收到多少硬币？
输入描述:
一行，包含一个数N。
输出描述:
一行，包含一个数，表示最少收到的硬币数。
示例1
输入
200
输出
17
说明
花200，需要找零824块，找12个64元硬币，3个16元硬币，2个4元硬币即可。*/
/*https://www.nowcoder.com/practice/944e5ca0ea88471fbfa73061ebe95728?tpId=137&&tqId=33900&rp=1&ru=/ta/exam-bytedance&qru=/ta/exam-bytedance/question-ranking*/
public class ZJ23 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = 1024 - n;
        int num = 0;
        while(m>=64){
            m -= 64;
            num++;
        }
        while (m>=16){
            m -= 16;
            num++;
        }
        while (m>=4){
            m -= 4;
            num++;
        }
        while (m>=1){
            m -= 1;
            num++;
        }
        System.out.println(num);
    }
}

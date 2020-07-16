package july_15;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.Scanner;

/*https://www.nowcoder.com/practice/6c9d8d2e426c4c58bbadfdf67d591696?tpId=137&&tqId=34096&rp=1&ru=/ta/exam-bytedance&qru=/ta/exam-bytedance/question-ranking*/
public class ZJ27 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long n = sc.nextInt();
        long m = sc.nextInt();
        ArrayList list = new ArrayList();
        for (Integer i = 1;i<=n;++i){
            list.add(i);
        }
        list.sort(Comparator.naturalOrder());
        /*list.sort(new Comparator() {
            @Override
            public int compare(Object o1, Object o2) {
                return o1.toString().compareTo(o2.toString());
            }
        });*/
        System.out.println(list.get((int) (m-1)));
    }
}

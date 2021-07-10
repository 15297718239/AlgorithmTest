package tanxin;

import java.util.Arrays;
import java.util.Scanner;

public class Package2 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("请输入物品的数量:");
        int n = in.nextInt();
        int[] w = new int[n];
        int[] v = new int[n];
        System.out.println("现在请输入这些物品的重量:");
        for (int i = 0; i < n; i++) {
            w[i] = in.nextInt();
        }
        System.out.println("现在请输入这些物品的价值:");
        for (int i = 0; i < n; i++) {
            v[i] = in.nextInt();
        }
        System.out.println("现在请输入背包的容量:");
        int c = in.nextInt();
        /**
         *按单位重量价值r[i]=v[i]/w[i]降序排列
         */

        double[] r = new double[n];
        int[] index = new int[n];
        for (int i = 0; i < n; i++) {
            r[i] = (double) v[i] / (double) w[i];
            index[i] = i;
        }
        double temp = 0;
        //降序排列
        for (int i = 0; i < n - 1; i++) {
            for (int j = i + 1; j < n; j++) {
                if (r[i] < r[j]) {
                    temp = r[i];
                    r[i] = r[j];
                    r[j] = temp;
                    //交换i，j的下标
                    int x = index[i];
                    index[i] = index[j];
                    index[j] = x;
                }
            }
        }
        /**
         *排序后的重量和价值分别存到w1[]和v1[]中
         */
        int[] w1 = new int[n];
        int[] v1 = new int[n];
        int maxValue = 0;
        for (int i = 0; i < n; i++) {
            w1[i] = w[index[i]];
            v1[i] = v[index[i]];
        }
        System.out.println(Arrays.toString(w1));
        System.out.println(Arrays.toString(v1));
        /**
         *初始化解向量x[n]
         */
        int[] x = new int[n];
        for (int i = 0; i < n; i++) {
            x[i] = 0;
        }
        /**
         *求解并打印解向量
         */
        for (int i = 0; i < n; i++) {
            if (w1[i] < c) {
                x[i] = 1;
                c = c - w1[i];
                maxValue += v1[i];
            } else {
                x[i] = c / w[index[i]];
                maxValue += x[i] * v[index[i]];
                //break; 去掉这个就好
            }


        }


        System.out.println("解向量是:" + Arrays.toString(x));
        /**
         *根据解向量求出背包中存放物品的最大价值并打印
         */


        System.out.println("背包中物品的最大价值为:" + maxValue);

    }
}
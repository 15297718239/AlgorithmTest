package tanxin;

import java.util.Arrays;

public class wait {
    public static void main(String[] args) {
        C c = new C();
        c.run();
    }
}

class C {
    int[] t = {2, 5, 3, 3, 1, 4, 4, 5}; //顾客的等待时间
    int n = t.length;  //顾客人数
    int s = 3;  //服务的点数
    int[][] shunxu = new int[s][n / 3 + 1];

    void run() {
        int i, j;
        Arrays.sort(t);
        System.out.print("顾客的等待时间为：");
        for (i = 0; i < n; i++) {
            System.out.print(t[i] + " ");
        }
        System.out.println();
        int ss = 0;
        int count = 0;
        for (i = 0; i < n; i++) {
            shunxu[i % 3][ss] = t[i];
            count++;
            if (count > 2) {
                ss++;
                count = 0;
            }
        }
        for (i = 0; i < s; i++) {
            System.out.print("第" + i + "个点的服务顺序为：");
            for (j = 0; j < n / 3 + 1; j++) {
                if (shunxu[i][j] != 0)
                    System.out.print(shunxu[i][j] + " ");
            }
            System.out.println();
        }
        float[][] time = new float[s][10];  //等待时间表
        for (i = 0; i < s; i++) {
            for (j = 1; j < n / 3 + 1; j++) {
                if (shunxu[i][j] != 0) {
                    if (j == 1)
                        time[i][j] = shunxu[i][j - 1];
                    else {
                        time[i][j] = shunxu[i][j - 1] + time[i][j - 1];
                    }
                }
            }
        }
        System.out.println("等待时间表为：");
        for (i = 0; i < s; i++) {
            for (j = 0; j < n / 3 + 1; j++) {
                System.out.print(time[i][j] + " ");
            }
            System.out.println();
        }
        float time_all = 0;      //总的等待时间
        for (i = 0; i < s; i++) {
            for (j = 0; j < n / 3 + 1; j++) {
                time_all += time[i][j];
            }
        }
        System.out.println("总的时间为：" + time_all);
        float time_avg = time_all / n;
        System.out.println("等待的平均时间为：" + time_avg);
    }
}
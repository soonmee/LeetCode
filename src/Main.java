import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
//        输入一个正整数n，返回n！的末尾的0的个数
//        Scanner in = new Scanner(System.in);
//
//        int n = in.nextInt();
//
//        System.out.println(CountZero(n));
//
//    }
//
//    private static int CountZero(int n) {
//        int count = 0;
//        while (n > 0){
//            count = count + n / 5;
//            n = n / 5;
//        }
//        return count;
//    }
//        /*
//        给你一个字符串 path，
//        其中 path[i] 的值可以是 'N'、'S'、'E' 或者 'W'，
//        分别表示向北、向南、向东、向西移动一个单位。
//        机器人从二维平面上的原点 (0, 0) 处开始出发，按 path 所指示的路径行走。
//        如果路径在任何位置上出现相交的情况，也就是走到之前已经走过的位置，请返回 True ；否则，返回 False 。
//         */
//        Scanner in = new Scanner(System.in);
//
//        String path = in.nextLine();
//
//        int len = path.length();
//        //走过的为1，没走过的为0
//        int paths[][] = new int[len * 2 + 1][len * 2 + 1];
//        for (int i = 0; i < paths.length; i++){
//            for (int j = 0; j < paths.length; j++){
//                paths[i][j] = 0;
//            }
//        }
//        int x = len + 1, y = len + 1;
//        paths[x][y] = 1;//原点
//
//        for (int i = 0; i < path.length(); i++){
//            if (path.charAt(i) == 'N'){
//                if (paths[x + 1][ y ] == 1){
//                    System.out.println("True");
//                    System.exit(0);
//                }
//                paths[x + 1][ y ] = 1;
//                x = x + 1;
//            }else if (path.charAt(i) == 'S'){
//                if (paths[x - 1][ y ] == 1){
//                    System.out.println("True");
//                    System.exit(0);
//                }
//                paths[x - 1][ y ] = 1;
//                x = x - 1;
//            }else if (path.charAt(i) == 'W'){
//                if (paths[ x ][y - 1] == 1){
//                    System.out.println("True");
//                    System.exit(0);
//                }
//                paths[ x ][y - 1] = 1;
//                y = y - 1;
//            }else if (path.charAt(i) == 'E'){
//                if (paths[ x ][y + 1] == 1){
//                    System.out.println("True");
//                    System.exit(0);
//                }
//                paths[ x ][y + 1] = 1;
//                y = y + 1;
//            }
//        }
//        System.out.println("False");
        Scanner in = new Scanner(System.in);
        String str = in.nextLine();
        if (str == null){
            System.out.println("True");
            System.exit(0);
        }
        if (str.length() % 2 != 0){
            System.out.println("False");
            System.exit(0);
        }
        int i = 0;
        int j = str.length() - 1;
        while (i <= j){
            if ((str.charAt(i) == '{' && str.charAt(j) == '}')
                    || (str.charAt(i) == '(' && str.charAt(j) == ')')
                    || (str.charAt(i) == '[' && str.charAt(j) == ']')){
                i++;
                j--;
            }else {
                System.out.println("False");
                System.exit(0);
            }
        }
        System.out.println("True");
    }
}

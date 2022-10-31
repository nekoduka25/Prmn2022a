package lecture01;

public class kadai15 {
    public static void main(String[] args) {
        int[] score = {41,85,72,38,80};
        for(int i = 0; i <= 4; i++){
            if(score[i] >= 90) {
                System.out.println(i + "番 " + score[i] + "点 " + "秀");
            }else if(score[i] >= 80) {
                System.out.println(i + "番 " + score[i] + "点 " + "優");
            }else if(score[i] >= 70) {
                System.out.println(i + "番 " + score[i] + "点 " + "良");
            }else if(score[i] >= 60) {
                System.out.println(i + "番 " + score[i] + "点 " + "可");
            }else{
                System.out.println(i + "番 " + score[i] + "点 " + "不可");
            }
        }
    }
}


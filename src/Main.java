public class Main {
    public static void main(String[] args) {

        int[] x ={20,30,40};//one dimension
        int [][] y={{20,30,50},//two dimension
                     {30,40,50},
                     {60,70,80}};



        for(int i=0;i<y.length;i++) {
            for (int j = 0; j < y[i].length; j++) {
                System.out.println(y[i][j]);
            }
        }
    }
}
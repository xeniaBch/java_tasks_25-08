package numbers;

public class Numbers {
  //task from Homework
    public static void main(String[] args) {
        System.out.println(squaresInInterval(1,20));
        System.out.println(valuesInInterval(1,72));

    }

    public static  int squaresInInterval(int a, int b) {
        double begin = Math.ceil(Math.sqrt(a));
        double end = Math.floor(Math.sqrt(b));
        int count = 0;
        for (int i = (int)begin; i <=(int)end; i++) {
           count ++;
        }
        return count;
    }

    public static int valuesInInterval(int a, int b) {
        double begin = Math.floor(Math.sqrt(a));
        double end = Math.floor(Math.sqrt(b));
        int count = 0;
        for (int i = (int) begin; i <=(int) end; i++) {
            int tmp = i*(i+1);
            if(tmp>=a && tmp<=b){
               count++;
            }

        }
        return count;
    }
}

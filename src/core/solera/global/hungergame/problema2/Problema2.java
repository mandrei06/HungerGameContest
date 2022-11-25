package core.solera.global.hungergame.problema2;

public class Problema2 {

    public static int lenght (int number) {
        int operations = 1;
        while (number > 1){
            if (number % 2 == 0) {
                number = number/2;
                operations +=1;
            }
            else {
                number = number*3 +1;
                operations +=1;
            }
        }
        return operations;
    }

    public static int maxAbsolute (int number) {
        int maxAbs = 0;
        while (number > 1){
            if (number % 2 == 0) {
                number = number/2;
            }
            else {
                number = number*3 +1;
            }
            if (number > maxAbs) {
                maxAbs = number;
            }
        }
        return maxAbs;
    }



    public static void main(String[] args) {
        // Rules
        // Even next number n/2
        // Odd next number 3n +1
        // n= 1 no next number
        int maxAbs = 0;
        int len = 0;

        for (int i =1 ; i<1000;i++)
        {
            if (lenght(i)>len)
                len = lenght(i);
            if (maxAbsolute(i)>maxAbs)
                maxAbs=maxAbsolute(i);
        }

        System.out.println(len);

        System.out.println(maxAbs);


        System.out.println(len*maxAbs);



    }



}
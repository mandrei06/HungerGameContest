package core.solera.global.hungergame.problem3;


public class Problem3 {
    static String multiply(String num1, String num2) {
        int len1 = num1.length();
        int len2 = num2.length();
        if (len1 == 0 || len2 == 0)
            return "0";

        // will keep the result number in vector
        // in reverse order
        int[] result = new int[len1 + len2];

        // Below two indexes are used to
        // find positions in result.
        int in1 = 0;
        int in2 = 0;

        // Go from right to left in num1
        for (int i = len1 - 1; i >= 0; i--) {
            int carry = 0;
            int n1 = num1.charAt(i) - '0';

            // To shift position to left after every
            // multipliccharAction of a digit in num2
            in2 = 0;

            // Go from right to left in num2
            for (int j = len2 - 1; j >= 0; j--) {
                // Take current digit of second number
                int n2 = num2.charAt(j) - '0';

                // Multiply with current digit of first number
                // and add result to previously stored result
                // charAt current position.
                int sum = n1 * n2 + result[in1 + in2] + carry;

                // Carry for next itercharAtion
                carry = sum / 10;

                // Store result
                result[in1 + in2] = sum % 10;

                in2++;
            }

            // store carry in next cell
            if (carry > 0)
                result[in1 + in2] += carry;

            // To shift position to left after every
            // multipliccharAtion of a digit in num1.
            in1++;
        }

        // ignore '0's from the right
        int i = result.length - 1;
        while (i >= 0 && result[i] == 0)
            i--;

        // If all were '0's - means either both
        // or one of num1 or num2 were '0'
        if (i == -1)
            return "0";

        // genercharAte the result String
        StringBuilder s = new StringBuilder();

        while (i >= 0)
            s.append(result[i--]);

        return s.toString();
    }

    static String findDiff(String str1, String str2) {
        // Before proceeding further, make sure str1
        // is not smaller


        // Take an empty string for storing result
        StringBuilder str = new StringBuilder();

        // Calculate length of both string
        int n1 = str1.length();
        int n2 = str2.length();

        // Reverse both of strings
        str1 = new StringBuilder(str1).reverse().toString();
        str2 = new StringBuilder(str2).reverse().toString();

        int carry = 0;

        // Run loop till small string length
        // and subtract digit of str1 to str2
        for (int i = 0; i < n2; i++) {
            // Do school mathematics, compute difference of
            // current digits
            int sub
                    = ((str1.charAt(i) - '0')
                    - (str2.charAt(i) - '0') - carry);

            // If subtraction is less than zero
            // we add then we add 10 into sub and
            // take carry as 1 for calculating next step
            if (sub < 0) {
                sub = sub + 10;
                carry = 1;
            } else
                carry = 0;

            str.append((char) (sub + '0'));
        }

        // subtract remaining digits of larger number
        for (int i = n2; i < n1; i++) {
            int sub = ((str1.charAt(i) - '0') - carry);

            // if the sub value is -ve, then make it
            // positive
            if (sub < 0) {
                sub = sub + 10;
                carry = 1;
            } else
                carry = 0;

            str.append((char) (sub + '0'));
        }

        // reverse resultant string
        return new StringBuilder(str.toString()).reverse().toString();
    }

    public static void main(String[] args) {
        String m = "100000";



        long n = Integer.parseInt(m);
        String gauss = String.valueOf(n * (n + 1) / 2);
        String resultOfGauss = multiply(gauss, gauss);
        long power2sum = n * (n + 1) * (2 * n + 1) / 6;
        String resultAdd = String.valueOf(power2sum);

        String finalResult=findDiff(resultOfGauss,resultAdd);

        System.out.println(finalResult);
        System.out.println(finalResult.length());

    }


}
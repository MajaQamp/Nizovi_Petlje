public class Broj_A_i_B {
    public static void main(String[] args) {
        int numberA=100;
        int numberB=100;
        int deductionBA = numberB - numberA;
        int sumAB = numberA + numberB;
        int multiplyAB = numberA * numberB;

       if (numberA>numberB) {
            System.out.println("The sum of these two numbers is " + sumAB);}

       if (numberB>numberA) {
           System.out.println("When you deduce " + numberB + " from " + numberA + " you get " + deductionBA);}

       if (numberA==numberB) {
           System.out.println("Now we will multiply these two numbers and the result is " + multiplyAB);}


    }}

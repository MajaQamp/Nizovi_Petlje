public class Varijable_ABCD {
    public static void main(String[] args) {
        int variableA = 101;
        int variableB = 3;
        int variableC = 5;
        int variableD = 12;
        int totalABCD = variableA+variableB+variableC+variableD;

        if ((variableA+variableB>0) || (variableC + variableD>0)) {
            System.out.println("The requirement is met (A+B more than 0 or C+D more than zero), and the sum of all three numbers is: " + totalABCD);
        }
        if ((totalABCD>100) && (totalABCD%2==0)){
            System.out.println("The result is more than 100, so when divided by 2 we get " + totalABCD/2);
        } else if ((totalABCD-1)%2==0) {
            System.out.println("When we subtract 1, the number is dividable by 2, so now we obtain the following result: " + (totalABCD-1)/2);
        } else {
            System.out.println("The number is still not divisible by 2");
        }








    }}

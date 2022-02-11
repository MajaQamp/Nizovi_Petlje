import com.sun.source.tree.IfTree;

public class IznosX

{public static void main(String[] args) {
   int numberX=7;
    System.out.println(numberX+numberX + 6 / (2-numberX));
int totalX=numberX+numberX + 6 / (2-numberX);
    System.out.println(totalX);

    if (totalX%2==0) {
        System.out.println("Broj je djeljiv sa dva");
    }
    if (!(totalX%2==0)) {
        System.out.println("Broj nije djeljiv sa dva");

    }
    }}

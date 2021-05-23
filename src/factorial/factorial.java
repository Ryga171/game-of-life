package factorial;

public class factorial {

public static void main(String args[])
{
    int i,fact=1;
    int number=5;
    for (i=1;i<=number;i++)
    {
        fact=fact*i;
    }
System.out.println("factorial is "+fact);
    int result=fact1(number);
    System.out.println("factorial is "+fact1(number));
}
static int fact2(int n){
    if(n==0){
        return 1;
    }
    else {
         return(n*fact2(n-1));

    }

}
}

package love.programming;

public class MethodDefination {
    public static void main(String[] args) {
        int result;
        MethodDefination myMethodDefinition =new MethodDefination();

        result=myMethodDefinition.mySum(1,2);

       System.out.println(result);

        String mystring= " Elina jodern ";

       String myAnotherString = new String (" Elina Jodern") ;

        mystring.toUpperCase();

        System.out.println(mystring);

        mystring =mystring.toUpperCase();

        System.out.println( mystring);

        mystring=mystring.toUpperCase();

        System.out.println(mystring);

        System.out.println(mystring.equals("myAnthoreString"));
        System.out.println(mystring.equalsIgnoreCase("myAnotherString"));
        System.out.println(mystring==myAnotherString);
    }
    public int mySum (int a,int b)
    {
        return a + b;


    }



    }


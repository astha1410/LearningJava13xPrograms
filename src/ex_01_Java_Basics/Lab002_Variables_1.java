package ex_01_Java_Basics;

public class Lab002_Variables_1
{
    // variable is a container which is used to store data (temporary)

    public static void main(String[] args) {

        String name1 = "this is a name";
        System.out.println(name1);



        /* string s has to be capital,
         prints the value that is stored in memory at the location name1.
         Address of that location is, name1
         value stored at that location is "this is a name" .
         */
         String name2 = "this is also name";

        String name3 = name2;
        /* value stored at name 2 location gets assigned
             to another variable of string type name3
                 note- datatype of these variables must be same ,
                 string value can't go to another variable which is of datatype int & vice versa*/

        System.out.println(name3);
        System.out.println(name2);
        System.out.println( name1 + " " + name2);

    }
}

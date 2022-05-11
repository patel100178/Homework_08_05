//write a programme to enter any string and count total number of 'a' in the string
public class stringCount_a {
    public static void main(String args[])
    {
        int c = 0;
        String St = "I am living in London";
        char letter = 'a';
        for (int i = 0; i < St.length(); i++)
        {
            if (St.charAt(i) == letter) // ---- inbuilt St.charAt(i) method to count character in string'.
                c++;
        }

        System.out.println("Total number of "+letter+ " is " + c + "  in String  " + St);
    }

}






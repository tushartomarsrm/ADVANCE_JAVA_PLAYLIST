/**
 * WOW WOW WOW
 * This is <i>italic</i> and <p>PARAGRAPH</p>
 * @author Tomar
 * @version 0.1
 * @since 2002
 * @see <a href="www.google.com" target="_blank">Goggle</a>
 */
public class tut105JAVADOCS {
    public static void main(String[] args) {
        System.out.println("Main fn");
    }

    /**
     * Hello this is a method
     * @param n1 This is the first no to add
     * @param n2 This is the second no to add
     * @return it returns n1+n2 as integer
     * @throws Exception if n1 is 0
     * @deprecated This method is now deprecated, please use + operator
     */
    public int add(int n1, int n2) throws Exception {
        if (n1 == 0) {
            throw new Exception();
        }
        return n1 + n2;
    }
}
To generate the JavaDoc documentation, follow these steps:

Open the command prompt or terminal.
Navigate to the directory containing your Java file (tut105JAVADOCS.java).
Use the following command to generate the JavaDoc:
bash
Copy code
javadoc tut105JAVADOCS.java
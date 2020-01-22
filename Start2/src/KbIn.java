public class KbIn {
    public static void main(String args[])
        throws java.io.IOException{
            char ch;
            System.out.println("нажмите клавишу, а затемклавишу ENTER:");
            ch = (char) System.in.read();
            System.out.println("Вы нажаликлавишу " +ch);
        }
    }


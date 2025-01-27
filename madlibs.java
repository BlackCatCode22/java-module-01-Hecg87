import java.util.Scanner;

class Main
{
    public static void main(String [] args)
    {
        // Mad Libs

        // Varibales
        String noun = "", verb = "", adj = "", color = "", place = "";

        // Collect Data
        Scanner reader = new Scanner(System.in);
        System.out.println("Welcome to MadLibs Program!");
        System.out.print("Give me a noun: ");
        noun = reader.next();
        System.out.print("Give me a verb");
        verb = reader.next();
        System.out.print("Give me a adjective");
        adj = reader.next();
        System.out.print("Give me a color");
        color = reader.next();
        System.out.print("Give me a place");
        place = reader.next();
        reader.close();

        //Output Paragraph
        System.out.println("I can't wait to go to " + place + " next Friday. I will wear my " + color + " shirt. I'll bring my favorite " + noun + ". I will also " + verb + " further than I ever have before. I will be a " + adj + " day.");
    }
}
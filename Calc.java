import java.util.Scanner;
public class Calc{
    public static void main(String[] args){
        System.out.println("------------------------------------------");
        System.out.println("Hello user, this is Pokémon HP Calculator");
        System.out.println("------------------------------------------");
        Scanner scn=new Scanner(System.in);
        System.out.println("Enter the base stat of your pokemon: ");
        int base=scn.nextInt();
        System.out.println("Enter IV: ");
        int iv=scn.nextInt();
        System.out.println("Enter EV: ");
        int ev=scn.nextInt();
        System.out.println("Enter level of your Pokemon: ");
        int lvl=scn.nextInt();
        int hpar1=((2*base)+iv+(ev/4))*lvl/100;
        int hp=hpar1+lvl+10;
        System.out.println("Your Pokémon's HP is: "+hp);
        System.out.println("***********************************************************************");
        System.out.println("Thank you for using this program, See ya later hope you have great day!");
        System.out.println("***********************************************************************");
        scn.close();
    }
}
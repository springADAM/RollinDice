package myPack;

import java.util.Scanner;

public class MClass {

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Combien De joueur ? : ");
        int n = sc.nextInt();
        Joueur tab[] = new Joueur[n];
        for (int i=0;i<n;i++){
            System.out.println("Joueur "+ (i+1)+" Entrer votre nom : ");
            tab[i]= new Joueur(sc.next());
        }
       // big loop for the rounds
        for(int i=0;i<10;i++){

            // loop for the players
            for(int j=0;j<n;j++){
                tab[j].play();
                System.out.println(tab[j].getName()+" Score is : "+tab[j].getScore());
            }
            System.out.println();
        }
        Joueur j = new Joueur();
        int max = j.Winner(tab);
        System.out.println("Winners are : \n ");
        for(int i=0;i<tab.length;i++){
            if(tab[i].getTotalScore() == max){
            System.out.println(tab[i].getName()+" With Score of : "+tab[i].getTotalScore());
            }
        }
    }
}

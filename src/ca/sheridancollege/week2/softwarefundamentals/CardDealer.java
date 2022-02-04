/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ca.sheridancollege.week2.softwarefundamentals;

/**
 * Name: Sebastian Villafane Ramos
 * Email: villafas@sheridancollege.ca
 * Student ID: 99164202
 */
public class CardDealer 
{
    public static void main(String[] args)
    {
        Card nineClubs = new Card("Clubs", 9);
        nineClubs.setSuit("Diamonds");
        
        //First Object: Created in NetBeans
        Card ace = new Card("Ace", 1);
        ace.setSuit("Spades");
        
        //Print: Created in GitHub
        System.out.println(ace.getSuit());
        
        //Second Object: Created after fetch+merge
        Card twoHearts = new Card("<3", 2);
        twoHearts.setSuit("Hearts");
    }
}

package Deck;

import java.util.ArrayList;
import java.util.Collections;


public class Deck {
	ArrayList<Card>list;

	public Deck(ArrayList<Card>list){
		this.list = list;
	}
	
	public ArrayList<Card> getList() {
		return list;
	}

	public void setList(ArrayList<Card> list) {
		this.list = list;
	}

	public static void main(String[] args) {
		//filling the deck with cards
		ArrayList<Card> listOne = new ArrayList<Card>();
		listOne.add(Card.AceClub);
		listOne.add(Card.AceDiamond);
		listOne.add(Card.AceHeart);
		listOne.add(Card.AceSpade);
		listOne.add(Card.JackClub);
		listOne.add(Card.JackDiamond);
		listOne.add(Card.JackHeart);
		listOne.add(Card.JackSpade);
		listOne.add(Card.QueenClub);
		listOne.add(Card.QueenDiamond);
		listOne.add(Card.QueenHeart);
		listOne.add(Card.QueenSpade);
		listOne.add(Card.KingClub);
		listOne.add(Card.KingDiamond);
		listOne.add(Card.KingHeart);
		listOne.add(Card.KingSpade);
		listOne.add(Card.TenClub);
		listOne.add(Card.TenDiamond);
		listOne.add(Card.TenHeart);
		listOne.add(Card.TenSpade);
		listOne.add(Card.NineClub);
		listOne.add(Card.NineDiamond);
		listOne.add(Card.NineHeart);
		listOne.add(Card.NineSpade);
		listOne.add(Card.EightHeart);
		listOne.add(Card.EightSpade);
		listOne.add(Card.EightClub);
		listOne.add(Card.EightDiamond);
		listOne.add(Card.SevenClub);
		listOne.add(Card.SevenDiamond);
		listOne.add(Card.SevenHeart);
		listOne.add(Card.SevenSpade);
		listOne.add(Card.SixClub);
		listOne.add(Card.SixDiamond);
		listOne.add(Card.SixHeart);
		listOne.add(Card.SixSpade);
		listOne.add(Card.FiveClub);
		listOne.add(Card.FiveDiamond);
		listOne.add(Card.FiveHeart);
		listOne.add(Card.FiveSpade);
		listOne.add(Card.FourClub);
		listOne.add(Card.FourDiamond);
		listOne.add(Card.FourHeart);
		listOne.add(Card.FourSpade);
		listOne.add(Card.ThreeClub);
		listOne.add(Card.ThreeDiamond);
		listOne.add(Card.ThreeHeart);
		listOne.add(Card.ThreeSpade);
		listOne.add(Card.TwoClub);
		listOne.add(Card.TwoDiamond);
		listOne.add(Card.TwoHeart);
		listOne.add(Card.TwoSpade);
		//shuffling the cards (to test)
		Deck.shuffle(listOne);
		//getting next card, again to test whether the method works correctly
		handOutNextCard(listOne);
		handOutNextCard(listOne);
		
           }
	public String toString(){
		return "The card is "+getList();		
		}
	public static Card handOutNextCard(ArrayList<Card>list){
		//it removes the first card always and the list is decreasing its size
		//its always handing out 0 which is the top card
		Card current = list.get(0);
		//after getting the first card then it must be removed 
		list.remove(0);
		return current;
		
	}
	public static int deckSize(ArrayList<Card>list){
		//returns the size of the current deck
		int size = list.size();
		
		return size;
		
	}
	
	public static ArrayList <Card> shuffle(ArrayList<Card>list){
		//shuffles the cards and if the cards are less than 52
		if(list.size()<52){
			System.out.println("The cards are less than 52 create more cards");
		}else{
			Collections.shuffle(list);
		}
		return list;
	}
	

}

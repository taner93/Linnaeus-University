package Deck;

import java.util.ArrayList;

public class PlayCardsMain {

	public static void main(String[] args) {
				
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
		
		       Deck.shuffle(listOne);
		   //    System.out.println(cards.toString());
          
		       Deck.handOutNextCard(listOne);
		       Deck.handOutNextCard(listOne);
		       System.out.print(Deck.deckSize(listOne));
	}

}

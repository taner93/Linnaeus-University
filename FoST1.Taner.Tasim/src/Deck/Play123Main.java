package Deck;

import java.util.ArrayList;

public class Play123Main {

	/**
	 * @param args
	 */
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
		int loose = 0;
		int win = 0;
	//the loop that plays the game 10 000 times as you will see when you
	//run the program the chance to win is only sometimes 1 in 10 000
	//the program must be runned several times(7-8 times or until you win) in order to see that sometimes
	//the player wins
	for(int i = 0;i<10000; i++){
		if(play123(listOne)== true){
			win++;
		}else{
			loose++;
		}
	
	}
	System.out.println("You win " +win+" times");
	System.out.println("You lost "+loose+" times");
		
	}
	public static boolean play123(ArrayList<Card>list){
		//this is the main game
		//it plays the game until in round 1 you get any Ace or round 2 any Two or round 3 any Three
		boolean win=false;
		//round counts the round that the game is played the round cannot be bigger than 3
		//as you will notice down there it will be resetet if it reaches 3, again to 1
		int round=1;
		for(int i = 0;i<list.size()-1;i++){
			//checks the cards, i= list.size()+1 is used to stop the loop
			Deck.handOutNextCard(list);		
			if(list.get(i)==Card.AceClub ||list.get(i)== Card.AceDiamond ||list.get(i)== Card.AceHeart ||list.get(i)== Card.AceSpade){
				if(round==1){				
				i = list.size()+1;
				win = false;
				}
			}
			else if(list.get(i)==Card.TwoClub ||list.get(i)== Card.TwoDiamond ||list.get(i)== Card.TwoHeart ||list.get(i)== Card.TwoSpade){
				if(round==2){		
				i = list.size()+1;
				win = false;
				}
			}else if(list.get(i)==Card.ThreeClub ||list.get(i)== Card.ThreeDiamond ||list.get(i)== Card.ThreeHeart ||list.get(i)== Card.ThreeSpade){
				if(round==3){
				i = list.size()+1;
				win=false;
				}
			}else{
				if(round<3){
					list.remove(0);
					i=0;
					round++;
				}else{
					list.remove(0);
					i=0;
					round=1;
				}
			}
			//if there no cards left it means that you win
			if(list.isEmpty()){
				System.out.println("You win ! ");
				win = true;
			}
		}
		return win;
	}
}

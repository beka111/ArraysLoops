package ProjectFirstDay;

import java.util.Scanner;

public class Number1 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Available music types are Classical, Pop, Country.");
		System.out.println("Please enter the music type:");
		
		String musicType=input.next();
		
		String classical="Classical";
		String classicalMusic1="Four Seasons";
		String classicalMusic2="Fur Elise";
		String classicalMusic3="Finlandia";
		String classicalMusic4="Vosalise";
		String classicalMusic5="The Planets";
		
		String pop="Pop";
		String popMusic1="Bad Guy";
		String popMusic2="Talk";
		String popMusic3="Please Me";
		String popMusic4="7 Ring";
		String popMusic5="Without Me";
		
		String country="Country";
		String countryMusic1="Meant to be";
		String countryMusic2="Heaven";
		String countryMusic3="Simple";
		String countryMusic4="One Number Away";
		String countryMusic5="Get Along";
		String rock="Rock";
		String rap="Rap";
		
		if (musicType.equalsIgnoreCase(country)) {
			System.out.println(countryMusic1+" ,"+ countryMusic2+" ,"+countryMusic3+" ,"+countryMusic4+" ,"
		+countryMusic5+" which one do you want to listen?");
			input.nextLine();
			String listen=input.nextLine();
			if (listen.equalsIgnoreCase(countryMusic1) || listen.equalsIgnoreCase(countryMusic2) 
					|| listen.equalsIgnoreCase(countryMusic3) || listen.equalsIgnoreCase(countryMusic4)
							|| listen.equalsIgnoreCase(countryMusic5)) {
						System.out.println("Please enter $3 for this music");
						int priceInput1=input.nextInt();
						int ourPrice1=3;
						if (priceInput1>ourPrice1) {
							int change=priceInput1-ourPrice1;
							System.out.println("Please take your change"+ change+" dollars change.\n" + listen+" is playing.");
						}
						else if(priceInput1<ourPrice1) {
							int Short= ourPrice1-priceInput1;
							System.out.println(("Please enter" + Short+" dollars more"));
							
							int Short2=input.nextInt();
							if(Short+Short2==ourPrice1) {
							System.out.println(listen+ " is playing. Please enjoy the music");
							}
					    }else if (priceInput1==ourPrice1) {
					    	System.out.println(listen+ " is playing now. Please enjoy the music.");	    	
					    }  	
			 }
		}
		else if (musicType.equalsIgnoreCase(classical)  ) {
			System.out.println(classicalMusic1+" ,"+classicalMusic2+" ,"+ classicalMusic3+" ,"+ classicalMusic4+" ,"+ classicalMusic5+
					" which one do you want to listen?");
			input.nextLine();
			String listen2 = input.nextLine();
			if(listen2.equalsIgnoreCase(classicalMusic1) || listen2.equalsIgnoreCase(classicalMusic2) ||
					listen2.equalsIgnoreCase(classicalMusic3) || listen2.equalsIgnoreCase(classicalMusic4) 
					|| listen2.equalsIgnoreCase(classicalMusic5)) {
				System.out.println("Please enter $2 for this music");
				int priceInput2= input.nextInt();
				int ourPrice2 = 2;
				if (priceInput2>ourPrice2) {
					int change2 = ourPrice2-priceInput2;
					System.out.println("Please take your change"+change2+". "+listen2+ " is playing");
				}if (priceInput2<ourPrice2) {
					int Short3=ourPrice2-priceInput2;
					System.out.println("Please enter "+ Short3+" dollars more");
					int Short4=input.nextInt();
					System.out.println(listen2+" is playing. Please enjoy the music");
				}	if(priceInput2==ourPrice2) {
						System.out.println(listen2 +" is playing. Please enjoy the music.");
					
				}
			}
		}
		else if (musicType.equalsIgnoreCase(pop)) {
			System.out.println(popMusic1+" ,"+popMusic2+" ,"+popMusic4+" ,"+popMusic5+". Which one do you want to listen?");
			input.nextLine();
			String listen3=input.nextLine();
			if (listen3.equalsIgnoreCase(popMusic1) || listen3.equalsIgnoreCase(popMusic2) || listen3.equalsIgnoreCase(popMusic3) 
					|| listen3.equalsIgnoreCase(popMusic4) || listen3.equalsIgnoreCase(popMusic5)) {
				System.out.println("Please enter $4 for this music");
				int ourPrice3=4;
				int priceInput3=input.nextInt();
				if(priceInput3>ourPrice3) {
				int change3= ourPrice3-priceInput3;
				System.out.println(listen3 +" is playing. Take the change and enjoy the music");				
				}if (priceInput3<ourPrice3) {
					int short5=ourPrice3-priceInput3;
					System.out.println("Please enter "+ short5+" dollars more");
					int short6=input.nextInt();
					System.out.println(listen3+" is playing. Please Enjoy the music");
				}if (priceInput3==ourPrice3) {
					System.out.println(listen3+ " is playing. Please enjoy the music.");
				}
			}
		
		}else {
			System.out.println("Type of music is not available.\n Type your music");
			System.out.println("Available music types are Classical, Pop, Country.");
			System.out.println("Please enter the music type:");
		}

	}

}

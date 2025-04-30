import java.util.Scanner; 
 
public class NokiaBackOption{ 
    public static void main(String[] args) { 
        String menu = """ 

		Welcome to the menu list 
		Press: 
 
		1 -> Phone book 
		2 -> Messages 
		3 -> Chat 
		4 -> Call register 
		5 -> Tones 
		6 -> Settings 
		7 -> Call divert 
		8 -> Games 
		9 -> Calculator 
		10 -> Reminders 
		11 -> Clock 
		12 -> Profiles 
		13 -> SIM services
		14 -> Exit

 
                """; 
 boolean back = true;
while(back){
        System.out.print(menu); 
        Scanner menuInput = new Scanner(System.in); 
            int pressMenu = menuInput.nextInt(); 
 
            switch (pressMenu) { 
                case 1: { 
                    String phonebook = """ 

			1. Phonebook 
 
			1 -> Search 
			2 -> Service Nos. 
			3 -> Add name 
			4 -> Erase 
			5 -> Edit 
			6 -> Assign tone 
			7 -> Send b'card 
			8 -> Options 
			9 -> Speed dials 
			10 -> Voice tags
			11 <- Back
 
                            """; 
                    System.out.print(phonebook); 
                    int pressPhoneBook = menuInput.nextInt(); 
 
                    switch (pressPhoneBook) { 
                        case 1:  

			boolean back1 = true;

		{ String search = """

			Search
			0. Back

		    """;
		  System.out.print(search);}
		int pressSearch = menuInput.nextInt();	
	while(back1){ 
		switch(pressSearch){
			case 0: back1 = false; break;
			default: System.out.print("Invalid option");
			} break;
		} break; //close loop 1

                        case 2: 
			boolean back2 = true;

		{ String serviceNos = """

			Service Nos
			0. Back

		    """;
		  System.out.print(serviceNos);}
		int pressServiceNos = menuInput.nextInt();	
	while(back2){ 
		switch(pressServiceNos){
			case 0: back2 = false; break;
			default: System.out.print("Invalid option");
			} break;
		} break; //close loop 2

                        case 3:

			boolean back3 = true;

		{ String addName = """

			Add name
			0. Back

		    """;
		  System.out.print(addName);}
		int pressAddname = menuInput.nextInt();	
	while(back3){ 
		switch(pressAddname){
			case 0: back3 = false; break;
			default: System.out.print("Invalid option");
			} break;
		} break; //close loop 3

                        case 4:

		boolean back4 = true;

		{ String erase = """

			Erase
			0. Back

		    """;
		  System.out.print(erase);}
		int pressErase = menuInput.nextInt();	
	while(back4){ 
		switch(pressErase){
			case 0: back4 = false; break;
			default: System.out.print("Invalid option");
			} break;
		} break; //close loop 4

                        case 5: 
		boolean back5 = true;

		{ String edit = """

			Edit
			0. Back

		    """;
		  System.out.print(edit);}
		int pressEdit = menuInput.nextInt();	
	while(back5){ 
		switch(pressEdit){
			case 0: back5 = false; break;
			default: System.out.print("Invalid option");
			} break;
		} break; //close loop 5

                        case 6:  

			boolean back6 = true;

		{ String assignTone = """

			Assign tone
			0. Back

		    """;
		  System.out.print(assignTone);}
		int pressAssigntone = menuInput.nextInt();	
	while(back6){ 
		switch(pressAssigntone){
			case 0: back6 = false; break;
			default: System.out.print("Invalid option");
			} break;
		} break; //close loop 6			

                        case 7: 

		boolean back7 = true;

		{ String sendBcard = """

			Send b'card
			0. Back

		    """;
		  System.out.print(sendBcard);}
		int pressSendBcard = menuInput.nextInt();	
	while(back7){ 
		switch(pressSendBcard){
			case 0: back7 = false; break;
			default: System.out.print("Invalid option");
			} break;
		} break; //close loop 7

                        case 8: { 
                            String options = """ 

				8. Options 

				1. Type of view 
				2. Memory status 
				3.<- Back


                                    """; 
                            System.out.print(options); 
                            int pressOptions = menuInput.nextInt(); 
                            switch (pressOptions) { 
                                case 1: {String typeView = """

					1. Type of view

				    """; System.out.print(typeView);} 
                                    break; 
                                case 2:{String memoryStatus = """

					2. Memory status

				    """; System.out.print(memoryStatus);} 
                                    break; 
				default: 
                    			System.out.print("Invalid option"); 
                    			break;

                            } 
                            break; 
                        } 
                        case 9:

			boolean back9 = true;

		{ String speedDials = """

			Speed dials
			0. Back

		    """;
		  System.out.print(speedDials);}
		int pressSpeedDials = menuInput.nextInt();	
	while(back9){ 
		switch(pressSpeedDials){
			case 0: back9 = false; break;
			default: System.out.print("Invalid option");
			} break;
		} break; //close loop 9

                        case 10:

			boolean back10 = true;

		{ String voiceTags = """

			Voice tags
			0. Back

		    """;
		  System.out.print(voiceTags);}
		int pressVoicetags = menuInput.nextInt();	
	while(back10){ 
		switch(pressVoicetags){
			case 0: back10 = false; break;
			default: System.out.print("Invalid option");
			} break;
		} break; //close loop 10

			case 11: System.out.print(menu + pressMenu);
                            break;
			default: 
                    		System.out.print("Invalid option"); 
                    		break;
                    } 
                    break; 
                } 
                case 2: { 
                    String messages = """ 


			2. Messages 
 
			1 -> Write messages 
			2 -> Inbox 
			3 -> Outbox 
			4 -> Picture messages 
			5 -> Templates 
			6 -> Smileys 
			7 -> Message settings 
			8 -> Info service 
			9 -> Voice mailbox number 
			10 -> Service command editor 
			11 <- Back

                            """; 
                    System.out.print(messages); 
                    int pressMessages = menuInput.nextInt(); 
 
                    switch (pressMessages) { 
                        case 1:  

		boolean back1 = true;

		{ String writeMessages = """

			Write Messages
			0. Back

		    """;
		  System.out.print(writeMessages);}
		int pressWriteMessages = menuInput.nextInt();	
	while(back1){ 
		switch(pressWriteMessages){
			case 0: back1 = false; break;
			default: System.out.print("Invalid option");
			} break;
		} break; //close loop 1

                        case 2:  
		boolean back2 = true;

		{ String inbox = """

			Inbox
			0. Back

		    """;
		  System.out.print(inbox);}
		int pressInbox = menuInput.nextInt();	
	while(back2){ 
		switch(pressInbox){
			case 0: back2 = false; break;
			default: System.out.print("Invalid option");
			} break;
		} break; //close loop 2

                        case 3:

			boolean back3 = true;

		{ String outbox = """

			Outbox
			0. Back

		    """;
		  System.out.print(outbox);}
		int pressOutbox = menuInput.nextInt();	
	while(back3){ 
		switch(pressOutbox){
			case 0: back3 = false; break;
			default: System.out.print("Invalid option");
			} break;
		} break; //close loop 3

                        case 4: 
			boolean back4 = true;

		{ String pictureMessages = """

			Picture Messages
			0. Back

		    """;
		  System.out.print(pictureMessages);}
		int pressPictureMessages = menuInput.nextInt();	
	while(back4){ 
		switch(pressPictureMessages){
			case 0: back4 = false; break;
			default: System.out.print("Invalid option");
			} break;
		} break; //close loop 4

                        case 5: 			
			boolean back5 = true;

		{ String templates = """

			Templates
			0. Back

		    """;
		  System.out.print(templates);}
		int pressTemplates = menuInput.nextInt();	
	while(back5){ 
		switch(pressTemplates){
			case 0: back5 = false; break;
			default: System.out.print("Invalid option");
			} break;
		} break; //close loop 5

                        case 6:

			boolean back6 = true;

		{ String smileys = """

			Smileys
			0. Back

		    """;
		  System.out.print(smileys);}
		int pressSmileys = menuInput.nextInt();	
	while(back6){ 
		switch(pressSmileys){
			case 0: back6 = false; break;
			default: System.out.print("Invalid option");
			} break;
		} break; //close loop 6

                        case 7: { 
                            String messageSettings = """ 

				7. Message Settings 
 
				1. Set 1 
				2. Common 
				3.<- Back

                                    """; 
                            System.out.print(messageSettings); 
                            int pressMessageSettings = menuInput.nextInt(); 
                            switch (pressMessageSettings) { 
                                case 1: { 
                                    String set1 = """ 

					1. Set 1 
 
					1. Message center number 
					2. Messages sent as 
					3. Message validity
					4.<- back
 
                                            """; 
                                    System.out.print(set1); 
                                    int pressSet1 = menuInput.nextInt(); 
                                    switch (pressSet1) { 
                                        case 1: {String messageCenter = """
   
						1. Message center number

					    """; System.out.print(messageCenter);} 
                                            break; 
                                        case 2: {String messagesSent = """

						2. Message sent as

					    """; System.out.print(messagesSent);} 
                                            break; 
                                        case 3:{String messagesValidity = """

						3. Message validity

					    """; System.out.print(messagesValidity);} 
                                            break;
					case 4: {String backToSet1 = """

						4. Back to Set1

			   		     """;   System.out.print(backToSet1);} 
                   		             break;

					default: 
                    				System.out.print("Invalid option"); 
                    				break;
 
                                    } 
                                    break; 
                                } 
                                case 2: { 
                                    String common = """ 

					2. Common 
 
					1. Delivery reports 
					2. Reply via same centre 
					3. Character support 
					4.<- Back


                                            """; 
                                    System.out.print(common); 
                                    int pressCommon = menuInput.nextInt(); 
                                    switch (pressCommon) { 
                                        case 1:{String deliveryReports = """
   
						1. Delivery reports

					    """; System.out.print(deliveryReports);}
                                            break; 
                                        case 2: {String replyVia = """

						2. Reply Via same centre

					    """; System.out.print(replyVia);}
                                            break; 
                                        case 3:{String characterSupport = """

						3. Character support

					    """; System.out.print(characterSupport);}
                                            break;
					
					case 4: {String backToCommon = """

						4. Back to Messages

			   		 """;   System.out.print(backToCommon);} 
                   		         break;

					default: 
                    				System.out.print("Invalid option"); 
                    				break;
 
                                    } 
                                    break; 
                                } 
                            } 
                            break; 
                        } 
                        case 8:

			boolean back8 = true;

		{ String infoService = """

			Info Service
			0. Back

		    """;
		  System.out.print(infoService);}
		int pressInfoService = menuInput.nextInt();	
	while(back8){ 
		switch(pressInfoService){
			case 0: back8 = false; break;
			default: System.out.print("Invalid option");
			} break;
		} break; //close loop 8

                        case 9:

		boolean back9 = true;

		{ String voiceMailboxNumber = """

			Voice mailbox number
			0. Back

		    """;
		  System.out.print(voiceMailboxNumber);}
		int pressVoiceMailboxNumber = menuInput.nextInt();	
	while(back9){ 
		switch(pressVoiceMailboxNumber){
			case 0: back9 = false; break;
			default: System.out.print("Invalid option");
			} break;
		} break; //close loop 9

                        case 10:
		boolean back10 = true;

		{ String serviceCommand = """

			Service command editor
			0. Back

		    """;
		  System.out.print(serviceCommand);}
		int pressServiceCommand = menuInput.nextInt();	
	while(back10){ 
		switch(pressServiceCommand){
			case 0: back10 = false; break;
			default: System.out.print("Invalid option");
			} break;
		} break; //close loop 10

			case 11: {String backTomsg = """

				11. Back to Messages

			    """;   System.out.print(backTomsg);} 
                            break;

			default: 
                    		System.out.print("Invalid option"); 
                    		break;
 
                    } 
                    break; 
                } 
                case 3:

		boolean back1 = true;

		{ String chat = """

			Chat
			0. Back

		    """;
		  System.out.print(chat);}
		int pressChat = menuInput.nextInt();	
	while(back1){ 
		switch(pressChat){
			case 0: back1 = false; break;
			default: System.out.print("Invalid option");
			} break;
		} break; //close loop 1


                case 4: { 
                    String callRegister = """ 


			4. Call register 
 
			1 -> Missed calls 
			2 -> Received calls 
			3 -> Dialled numbers 
			4 -> Erase recent call lists 
			5 -> Show call duration 
			6 -> Show call costs 
			7 -> Call cost settings 
			8 -> Prepaid credit 
			9 <- Back

                            """; 
                    System.out.print(callRegister); 
                    int pressCallRegister = menuInput.nextInt(); 
 
                    switch (pressCallRegister) { 
                        case 1:

			boolean back01 = true;

		{ String missedCalls = """

			Missed calls
			0. Back

		    """;
		  System.out.print(missedCalls);}
		int pressMissedcalls = menuInput.nextInt();	
	while(back01){ 
		switch(pressMissedcalls){
			case 0: back01 = false; break;
			default: System.out.print("Invalid option");
			} break;
		} break; //close loop 01

                        case 2: 

			boolean back2 = true;

		{ String receivedCalls = """

			Received calls
			0. Back

		    """;
		  System.out.print(receivedCalls);}
		int pressReceivedcalls = menuInput.nextInt();	
	while(back2){ 
		switch(pressReceivedcalls){
			case 0: back2 = false; break;
			default: System.out.print("Invalid option");
			} break;
		} break; //close loop 2

                        case 3:

			boolean back3 = true;

		{ String dialledNumbers = """

			Dialled numbers
			0. Back

		    """;
		  System.out.print(dialledNumbers);}
		int pressDiallednumbers = menuInput.nextInt();	
	while(back3){ 
		switch(pressDiallednumbers){
			case 0: back3 = false; break;
			default: System.out.print("Invalid option");
			} break;
		} break; //close loop 3


                        case 4:

		boolean back4 = true;

		{ String eraseRecentCall = """

			Erase recent call lists
			0. Back

		    """;
		  System.out.print(eraseRecentCall);}
		int pressEraseRecentCall = menuInput.nextInt();	
	while(back4){ 
		switch(pressEraseRecentCall){
			case 0: back4 = false; break;
			default: System.out.print("Invalid option");
			} break;
		} break; //close loop 4

                        case 5: {  
				String showCallDuration = """ 

					5. Show call duration 
 
					1. Last call duration 
					2. All calls' duration 
					3. Received calls' duration
					4. Dialled calls' duration
					5. Clear timers
					6.<- Back

                                            """; 
                                    System.out.print(showCallDuration); 
                                    int pressShowCallDuration = menuInput.nextInt(); 
                                    switch (pressShowCallDuration) { 
                                        case 1: {String lastCallDuration = """
   
						1. Last call duration

					    """; System.out.print(lastCallDuration);} 
                                            break; 
                                        case 2: {String allCallsDuration = """

						2. All calls' duration 

					    """; System.out.print(allCallsDuration);} 
                                            break; 
                                        case 3:{String receivedCallsDuration = """

						3. Received calls' duration

					    """; System.out.print(receivedCallsDuration);}
					    break;
                                        case 4: {String dialledCallsDuration = """
   
						4. Dialled calls' duration

					    """; System.out.print(dialledCallsDuration);} 
                                            break; 
                                        case 5: {String clearTimers = """

						5. Clear timers

					    """; System.out.print(clearTimers);} 
                                            break;

					case 6: {String backToCallRegister1 = """

						6. Back to Call Register

			    	     	     """;   System.out.print(backToCallRegister1);} 
                            	     	     break;

					default: 
                    				System.out.print("Invalid option"); 
                    				break;

                                    } 
                                    break; 
                                } 

                        case 6: { 
				String showCallCosts = """ 


					6. Show call costs 
 
					1. Last call cost 
					2. All calls' cost
					3. Clear counters
					4.<- Back

                                            """; 
                                    System.out.print(showCallCosts); 
                                    int pressShowCallCost = menuInput.nextInt(); 
                                    switch (pressShowCallCost) { 
                                        case 1: {String lastCallCost = """
   
						1. Last call cost

					    """; System.out.print(lastCallCost);} 
                                            break; 
                                        case 2: {String allCallsCost = """

						2. All calls' cost 

					    """; System.out.print(allCallsCost);} 
                                            break; 
                                        case 3: {String clearCounters = """

						3. Clear counters

					    """; System.out.print(clearCounters);} 
                                            break;

					case 4: {String backToCallRegister2 = """

						4. Back to Call Register

			    	     	     """;   System.out.print(backToCallRegister2);} 
                            	     	     break;

					default: 
                    				System.out.print("Invalid option"); 
                    				break;

                                    } 
                                    break; 
                                } 

                        case 7: {
				String callCostSettings = """ 


					7. Call cost settings 
 
					1. Call cost limit 
					2. Show costs in
					3.<- Back

                                            """; 
                                    System.out.print(callCostSettings); 
                                    int pressCallCostSettings = menuInput.nextInt(); 
                                    switch (pressCallCostSettings) { 
                                        case 1: {String callCostLimit = """
   
						1. Call cost limit

					    """; System.out.print(callCostLimit);} 
                                            break; 
                                        case 2: {String showCostsIn = """

						2. Show costs in

					    """; System.out.print(showCostsIn);} 
                                            break;
					case 3: {String backToCallRegister3 = """

						3. Back to Call Register

			    	     	     """;   System.out.print(backToCallRegister3);} 
                            	     	     break;


                                    } 
                                    break; 
                                } 
                        case 8:

			boolean back8 = true;

		{ String prepaidCredit = """

			Prepaid credit
			0. Back

		    """;
		  System.out.print(prepaidCredit);}
		int pressPrepaidCredit = menuInput.nextInt();	
	while(back8){ 
		switch(pressPrepaidCredit){
			case 0: back8 = false; break;
			default: System.out.print("Invalid option");
			} break;
		} break; //close loop 8
			default: 
                    		System.out.print("Invalid option"); 
                    		break;
 
                    } 
                    break; 
                } 
                case 5: { 
                    String tones = """ 

                            5. Tones 
 
                            1 -> Ringing tone 
                            2 -> Ringing volume 
                            3 -> Incoming call alert 
                            4 -> Composer 
                            5 -> Message alert tone 
                            6 -> Keypad tones 
                            7 -> Warning and game tones 
                            8 -> Vibrating alert 
                            9 -> Screen saver 
			    10 <-Back

                            """; 
                    System.out.print(tones); 
                    int pressTones = menuInput.nextInt(); 
 
                    switch (pressTones) { 
                        case 1:  

		boolean back001 = true;

		{ String ringingTone = """

			Ringing Tone
			0. Back

		    """;
		  System.out.print(ringingTone);}
		int pressRingingTone = menuInput.nextInt();	
	while(back001){ 
		switch(pressRingingTone){
			case 0: back001 = false; break;
			default: System.out.print("Invalid option");
			} break;
		} break; //close loop 001

                        case 2:

	boolean back002 = true;

		{ String ringingVolume = """

			Ringing volume
			0. Back

		    """;
		  System.out.print(ringingVolume);}
		int pressRingingvolume = menuInput.nextInt();	
	while(back002){ 
		switch(pressRingingvolume){
			case 0: back002 = false; break;
			default: System.out.print("Invalid option");
			} break;
		} break; //close loop 002

                        case 3:

		boolean back003 = true;

		{ String incomingCall = """

			Ringing volume
			0. Back

		    """;
		  System.out.print(incomingCall);}
		int pressIncomingCall = menuInput.nextInt();	
	while(back003){ 
		switch(pressIncomingCall){
			case 0: back003 = false; break;
			default: System.out.print("Invalid option");
			} break;
		} break; //close loop 003

                        case 4:

		boolean back004 = true;

		{ String composer = """

			Composers
			0. Back

		    """;
		  System.out.print(composer);}
		int pressComposers = menuInput.nextInt();	
	while(back004){ 
		switch(pressComposers){
			case 0: back004 = false; break;
			default: System.out.print("Invalid option");
			} break;
		} break; //close loop 004

                        case 5:

		boolean back005 = true;

		{ String messageAlert = """

			Message alert tone
			0. Back

		    """;
		  System.out.print(messageAlert);}
		int pressMessageAlert = menuInput.nextInt();	
	while(back005){ 
		switch(pressMessageAlert){
			case 0: back005 = false; break;
			default: System.out.print("Invalid option");
			} break;
		} break; //close loop 005

                        case 6: 

		boolean back006 = true;

		{ String keypadTones = """

			Keypad tones
			0. Back

		    """;
		  System.out.print(keypadTones);}
		int pressKeypadTones = menuInput.nextInt();	
	while(back006){ 
		switch(pressKeypadTones){
			case 0: back006 = false; break;
			default: System.out.print("Invalid option");
			} break;
		} break; //close loop 006

                        case 7:

		boolean back007 = true;

		{ String warningAndGame = """

			Warning and game tones
			0. Back

		    """;
		  System.out.print(warningAndGame);}
		int pressWarningAndGame = menuInput.nextInt();	
	while(back007){ 
		switch(pressWarningAndGame){
			case 0: back007 = false; break;
			default: System.out.print("Invalid option");
			} break;
		} break; //close loop 007

                        case 8:

		boolean back008 = true;

		{ String vibratingAlert = """

			Vibrating alert
			0. Back

		    """;
		  System.out.print(vibratingAlert);}
		int pressVibratingAlert = menuInput.nextInt();	
	while(back008){ 
		switch(pressVibratingAlert){
			case 0: back008 = false; break;
			default: System.out.print("Invalid option");
			} break;
		} break; //close loop 008
 
                        case 9:

		boolean back009 = true;

		{ String screenSaver = """

			Screen saver
			0. Back

		    """;
		  System.out.print(screenSaver);}
		int pressScreenSaver = menuInput.nextInt();	
	while(back009){ 
		switch(pressScreenSaver){
			case 0: back009 = false; break;
			default: System.out.print("Invalid option");
			} break;
		} break; //close loop 009 

			case 10: 

		boolean backTo0 = true;

		{ String backToTones = """

			Press
			0. You are about to go back...

		    """;
		  System.out.print(backToTones);}
		int pressBackToTones = menuInput.nextInt();	
	while(backTo0){ 
		switch(pressBackToTones){
			case 0: backTo0 = false; break;
			default: System.out.print("Invalid option");
			} break;
		} break; //close loop backTo0 

			default: 
                    		System.out.print("Invalid option"); 
                    		break;
 
                    } 
                    break; 
                } 
                case 6: {                           
                      String settings = """ 

				6. Settings 
 
				1 -> Call settings 
				2 -> Phone settings 
				3 -> Security settings 
				4 -> Restore factory settings
				5 <- Back to Main Menu
 
                                    """; 
                            System.out.print(settings); 
                            int pressSetting = menuInput.nextInt(); 
                            switch (pressSetting) { 
                                case 1: { 
                                    String callSettings = """ 

					1. Call settings 
 
					1. Automatic redial 
					2. Speed dialling 
					3. Call waiting options
					4. Own number sending
					5. Phone line in use
					6. Automatic answer
					7.<- Back to Settings


                                            """; 
                                    System.out.print(callSettings); 
                                    int pressCallSettings = menuInput.nextInt(); 
                                    switch (pressCallSettings) { 
                                        case 1: {String automaticRedial = """
   
						1. Automatic redial

					    """; System.out.print(automaticRedial);} 
                                            break; 
                                        case 2: {String speedDialling = """

						2. Speed dialling

					    """; System.out.print(speedDialling);} 
                                            break; 
                                        case 3:{String callWaiting = """

						3. Call waiting options

					    """; System.out.print(callWaiting);}
					    break;
                                        case 4: {String ownNumber = """
   
						4. Own number sending

					    """; System.out.print(ownNumber);} 
                                            break; 
                                        case 5: {String phoneLineIn = """

						5. Phone line in use

					    """; System.out.print(phoneLineIn);} 
                                            break; 
                                        case 6:{String automaticAnswer = """

						6. Automatic answer

					    """; System.out.print(automaticAnswer);} 
                                            break;

					case 7: {String backToSettings1 = """

						7. Back to settings

				    	     """;   System.out.print(backToSettings1);} 
        	                    	     break;

					default: 
                    				System.out.print("Invalid option"); 
                    				break;
 
                                    } 
                                    break; 
                                } 
				case 2: { 
                                    String phoneSetting = """ 

					2. Phone setting 

					1. Language 
					2. Cell info display
					3. Welcome note
					4. Network selection
					5. Lights
					6. Confirm SIM service actions
					7.<- Back


                                            """; 
                                    System.out.print(phoneSetting); 
                                    int pressPhoneSettings = menuInput.nextInt(); 
                                    switch (pressPhoneSettings) { 
                                        case 1: {String language = """
   
						1. Language

					    """; System.out.print(language);} 
                                            break; 
                                        case 2: {String cellInfoDisplay = """

						2. Cell info display

					    """; System.out.print(cellInfoDisplay);} 
                                            break; 
                                        case 3:{String welcomeNote = """

						3. Welcome note

					    """; System.out.print(welcomeNote);}
					    break;
                                        case 4: {String networkSelection = """
   
						4. Network selection

					    """; System.out.print(networkSelection);} 
                                            break; 
                                        case 5: {String lights = """

						5. Lights

					    """; System.out.print(lights);} 
                                            break; 
                                        case 6:{String confirmSIM = """

						6. Confirm SIM service actions

					    """; System.out.print(confirmSIM);} 
                                            break;

					case 7: {String backToSettings2 = """

						7. Back to settings

			    	       	    """;   System.out.print(backToSettings2);} 
                            	 	    break;


					default: 
                    				System.out.print("Invalid option"); 
                    				break;
 
                                    } 
                                    break; 
                                } 
				case 3: { 
                                    String securitySetting = """ 


					3. Security settings
 
					1. PIN code request 
					2. Call barring service 
					3. Fixed dialling
					4. Closed user group
					5. Phone security
					6. Change access codes
					7.<- Back


                                            """; 
                                    System.out.print(securitySetting); 
                                    int pressSecuritySetting = menuInput.nextInt(); 
                                    switch (pressSecuritySetting) { 
                                        case 1: {String codeRequest = """
   
						1. PIN code request

					    """; System.out.print(codeRequest);} 
                                            break; 
                                        case 2: {String callBarringService = """

						2. Call barring service

					    """; System.out.print(callBarringService);} 
                                            break; 
                                        case 3:{String fixedDialling = """

						3. Fixed dialling

					    """; System.out.print(fixedDialling);}
					    break;
                                        case 4: {String closedUserGroup = """
   
						4. Closed user group

					    """; System.out.print(closedUserGroup);} 
                                            break; 
                                        case 5: {String phoneSecurity = """

						5. Phone security

					    """; System.out.print(phoneSecurity);} 
                                            break; 
                                        case 6:{String changeAccessCodes = """

						6. Change access codes

					    """; System.out.print(changeAccessCodes);} 
                                            break;
					case 7: {String backToSettings3 = """

						7. Back to settings

			    	     	    """;   System.out.print(backToSettings3);} 
                            	            break;

					default: 
                    				System.out.print("Invalid option"); 
                    				break; 
                                    } 
                                    break; 
                                } 

                                case 4: {String restoreFactory = """

					4. Restore factory setting

			    	     """;   System.out.print(restoreFactory);} 
                            	     break;

				case 5: {String backToSettings = """

					5. Back to settings

			    	     """;   System.out.print(backToSettings);} 
                            	     break;

				default: 
                    			System.out.print("Invalid option"); 
                    			break;

                                     
                                } break;
                            }
                case 7:

		boolean back7 = true;

		{ String callDivert = """

			Call divert
			0. Back

		    """;
		  System.out.print(callDivert);}
		int pressCallDivert = menuInput.nextInt();	
	while(back7){ 
		switch(pressCallDivert){
			case 0: back7 = false; break;
			default: System.out.print("Invalid option");
			} break;
		} break; //close loop 7

                case 8: 

		boolean back8 = true;

		{ String games = """

			Games
			0. Back

		    """;
		  System.out.print(games);}
		int pressGames = menuInput.nextInt();	
	while(back8){ 
		switch(pressGames){
			case 0: back8 = false; break;
			default: System.out.print("Invalid option");
			} break;
		} break; //close loop 8

                case 9:

		boolean back9 = true;

		{ String calculator = """

			Calculator
			0. Back

		    """;
		  System.out.print(calculator);}
		int pressCalculator = menuInput.nextInt();	
	while(back9){ 
		switch(pressCalculator){
			case 0: back9 = false; break;
			default: System.out.print("Invalid option");
			} break;
		} break; //close loop 9

                case 10:
			boolean back10 = true;

		{ String reminders = """

			Reminders
			0. Back

		    """;
		  System.out.print(reminders);}
		int pressReminders = menuInput.nextInt();	
	while(back10){ 
		switch(pressReminders){
			case 0: back10 = false; break;
			default: System.out.print("Invalid option");
			} break;
		} break; //close loop 10

                case 11: { 
                    String clock = """ 

			11. Clock
 
			1 -> Alarm clock 
			2 -> Clock settings
			3 -> Date setting 
			4 -> Stopwatch 
			5 -> Countdown timer 
			6 -> Auto update of date and time 
			7 <- Back


                            """; 
                    System.out.print(clock); 
                    int pressClock = menuInput.nextInt(); 
 
                    switch (pressClock) { 
                        case 1:{String alarmClock = """

				1. Alarm Clock

			    """;   System.out.print(alarmClock);} 
                            break; 
                        case 2:{String clockSettings = """

				2. Clock settings

			    """;   System.out.print(clockSettings);} 
                            break; 
                        case 3:{String dateSetting = """

				3. Date setting

			    """;   System.out.print(dateSetting);} 
                            break; 
                        case 4: {String stopwatch = """

				4. Stopwatch

			    """;   System.out.print(stopwatch);} 
                            break; 
                        case 5:{String countdownTimer = """

				5. Countdown timer

			    """;   System.out.print(countdownTimer);}
                            break; 
                        case 6:{String AutoUpdate = """

				6. Auto update of date and time

			    """;   System.out.print(AutoUpdate);} 
                            break;
			case 14: {String clockMenu = """

				7. Back to Clock Menu

		    	    """;   System.out.print(clockMenu);} 
                    	    break;
			
			default: 
                    		System.out.print("Invalid option"); 
                    		break; 
                    } 
                    break; 
                } 
                case 12:
			boolean back12 = true;

		{ String profiles = """

			Profiles
			0. Back

		    """;
		  System.out.print(profiles);}
		int pressProfiles = menuInput.nextInt();	
	while(back12){ 
		switch(pressProfiles){
			case 0: back12 = false; break;
			default: System.out.print("Invalid option");
			} break;
		} break; //close loop 12

                case 13: 
		boolean back13 = true;

		{ String simServices = """

			SIM services
			0. Back

		    """;
		  System.out.print(simServices);}
		int pressSIMService = menuInput.nextInt();	
	while(back13){ 
		switch(pressSIMService){
			case 0: back13 = false; break;
			default: System.out.print("Invalid option");
			} break;
		} break; //close loop 13

		case 14: back = false; break;
 
                default: 
                    System.out.print("Invalid option"); 
                    break; 
            } 
       //{ 
            //menuInput.close(); 
        //} 

}//close while loop

    } 
} 
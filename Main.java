package MovieTicketSystem;
/*Today problem statement!!
🎬 *Assignment: Movie Ticket Booking System*

*3 Entities:* Viewer, GoldScreen, SilverScreen

─────────────────
*VERSION 1: Basic*
─────────────────

*Viewer*
• Knows: (from INPUT via Scanner)
  - numberOfSeats
  - screenType (GOLD / SILVER)
  - wantsSnacks (YES / NO)
  - snackQuantity
• Unknown: bookingId, ticketPrice, snackPrice, totalBill
• Default Constructor (empty)

*GoldScreen & SilverScreen*
• Knows: bookingId, ticketPrice, snackPrice, totalBill (Constructor with params)
• Unknown: numberOfSeats, wantsSnacks, snackQuantity
• Default Constructor (empty)

─────────────────
*Methods (Complex):*
─────────────────

*Method 1: calculateTicketPrice()*
  - No params (gets numberOfSeats from viewer reference)
  - Modifies ticketPrice
  - Logic:
    • Gold: ticketPrice = numberOfSeats * 500
    • Silver: ticketPrice = numberOfSeats * 200
  - Prints "Ticket Price: " + ticketPrice

*Method 2: calculateSnackPrice()*
  - No params (gets wantsSnacks, snackQuantity from viewer reference)
  - Modifies snackPrice
  - Logic:
    • If wantsSnacks == "YES"
      → Gold: snackPrice = snackQuantity * 150 (premium snacks)
      → Silver: snackPrice = snackQuantity * 80 (regular snacks)
    • If wantsSnacks == "NO"
      → snackPrice = 0
  - Prints "Snack Price: " + snackPrice

*Method 3: generateBill()*
  - No params
  - Modifies totalBill
  - Logic:
    • Gold: totalBill = ticketPrice + snackPrice + 100 (convenience fee)
    • Silver: totalBill = ticketPrice + snackPrice + 50 (convenience fee)
  - Prints "Total Bill: " + totalBill

*Method 4: applyDiscount()*
  - No params
  - Modifies totalBill
  - Logic:
    • If numberOfSeats >= 4 → Apply 10% discount
    • Else → No discount
  - Prints "Discount Applied: " + discountAmount

─────────────────
*Main Logic (Complex):*
─────────────────

// ===== VIEWER 1 =====
Viewer1 → Create Empty Viewer
→ Take numberOfSeats from INPUT
→ Take screenType from INPUT
→ Take wantsSnacks from INPUT
→ If wantsSnacks == "YES" → Take snackQuantity from INPUT
→ set all values
if (viewer1 is GOLD)
Create Known GoldScreen with viewer1 reference
share address of goldScreen to viewer1
perform calculateTicketPrice()
perform calculateSnackPrice()
perform generateBill()
perform applyDiscount()
print "===== BOOKING SUMMARY ====="
print viewer1.getGoldScreen().getBookingId()
print viewer1.getGoldScreen().getTicketPrice()
print viewer1.getGoldScreen().getSnackPrice()
print viewer1.getGoldScreen().getTotalBill()
if (viewer1 is SILVER)
Create Known SilverScreen with viewer1 reference
share address of silverScreen to viewer1
perform calculateTicketPrice()
perform calculateSnackPrice()
perform generateBill()
perform applyDiscount()
print "===== BOOKING SUMMARY ====="
print viewer1.getSilverScreen().getBookingId()
print viewer1.getSilverScreen().getTicketPrice()
print viewer1.getSilverScreen().getSnackPrice()
print viewer1.getSilverScreen().getTotalBill()
// ===== VIEWER 2 =====
(Same logic for viewer2)
// ===== COMPARISON =====
if (viewer1.getTotalBill() > viewer2.getTotalBill())
print "Viewer 1 paid more!"
else if (viewer2.getTotalBill() > viewer1.getTotalBill())
print "Viewer 2 paid more!"
else
print "Both paid same amount!"


─────────────────
*VERSION 2: Association*
─────────────────

*Viewer Changes:*
• Remove: bookingId, ticketPrice, snackPrice, totalBill
• Add: goldScreen variable (getter/setter)
• Add: silverScreen variable (getter/setter)

*GoldScreen Changes:*
• Remove: numberOfSeats, wantsSnacks, snackQuantity
• Add: viewer variable (getter/setter)
• Access values via: viewer.getNumberOfSeats(), viewer.getWantsSnacks()

*SilverScreen Changes:*
• Remove: numberOfSeats, wantsSnacks, snackQuantity
• Add: viewer variable (getter/setter)
• Access values via: viewer.getNumberOfSeats(), viewer.getWantsSnacks()

─────────────────
*Expected Input:*
─────────────────

===== VIEWER 1 =====
Enter number of seats:
5
Enter screen type (GOLD/SILVER):
Gold
Want snacks? (YES/NO):
YES
Enter snack quantity:
3
===== VIEWER 2 =====
Enter number of seats:
2
Enter screen type (GOLD/SILVER):
Silver
Want snacks? (YES/NO):
NO


─────────────────
*Expected Output:*
─────────────────
===== VIEWER 1: GOLD =====
Ticket Price: 2500
Snack Price: 450
Total Bill: 3050
Discount Applied: 305
Final Bill: 2745
BookingId: G101
===== VIEWER 2: SILVER =====
Ticket Price: 400
Snack Price: 0
Total Bill: 450
Discount Applied: 0
Final Bill: 450
BookingId: S202
===== COMPARISON =====
Viewer 1 paid more!*/

import java.util.Scanner;
import java.math.BigInteger;
public class Main {
    public static void main(String[] args){
        Viewer viewer1=new Viewer();

        System.out.println("=====VIEWER 1=====");
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Number of Seats:");
        BigInteger input=new BigInteger(sc.nextLine());
        System.out.println("Enter the Screen Type:");
        String inputType=sc.nextLine();
        System.out.println("Do you want snacks?");
        String inputSnack=sc.nextLine();
        System.out.println("Enter the Snack Quantity:");
        BigInteger inputSq=new BigInteger(sc.nextLine());
        viewer1.setNumberOfSeats(input.intValue());
        viewer1.setScreenType(inputType);
        viewer1.setWantsSnacks(inputSnack);
        viewer1.setSnackQuantity(inputSq.intValue());

        if(viewer1.getScreenType().equals("Gold")){
            GoldScreen gs=new GoldScreen("AZ!1",100,100,200,viewer1);
            System.out.println("=====VIEWER 1=====");
            gs.setViewer(viewer1);
            gs.calculateTicketPrice();
            gs.calculateSnackPrice();
            gs.generateBill();
            gs.applyDiscount();
            System.out.println("=====BOOKING SUMMARY=====");
            System.out.println(viewer1.getGoldScreen().getBookingId());
            System.out.println(viewer1.getGoldScreen().getTicketPrice());
            System.out.println(viewer1.getGoldScreen().getSnackPrice());
            System.out.println(viewer1.getGoldScreen().getTotalBill());
        }
        else{
            SilverScreen ss=new SilverScreen("AZ!1",100,100,200,viewer1);
            System.out.println("=====VIEWER 1=====");
            ss.setViewer(viewer1);
            ss.calculateTicketPrice();
            ss.calculateSnackPrice();
            ss.generateBill();
            ss.applyDiscount();
            System.out.println("=====BOOKING SUMMARY=====");
            System.out.println(viewer1.getSilverScreen().getBookingId());
            System.out.println(viewer1.getSilverScreen().getTicketPrice());
            System.out.println(viewer1.getSilverScreen().getSnackPrice());
            System.out.println(viewer1.getSilverScreen().getTotalBill());
        }

        Viewer viewer2=new Viewer();

        System.out.println("=====VIEWER 2=====");
        Scanner scc = new Scanner(System.in);
        System.out.println("Enter the Number of Seats:");
        BigInteger input1=new BigInteger(scc.nextLine());
        System.out.println("Enter the Screen Type:");
        String inputType1=scc.nextLine();
        System.out.println("Do you want snacks?");
        String inputSnack1=scc.nextLine();
        System.out.println("Enter the Snack Quantity:");
        BigInteger inputSq1=new BigInteger(scc.nextLine());
        viewer2.setNumberOfSeats(input1.intValue());
        viewer2.setScreenType(inputType1);
        viewer2.setWantsSnacks(inputSnack1);
        viewer2.setSnackQuantity(inputSq1.intValue());

        if(viewer1.getScreenType().equals("Gold")){
            GoldScreen gs=new GoldScreen("AZ!1",100,100,200,viewer2);
            System.out.println("=====VIEWER 2=====");
            gs.setViewer(viewer2);
            gs.calculateTicketPrice();
            gs.calculateSnackPrice();
            gs.generateBill();
            gs.applyDiscount();
            System.out.println("=====BOOKING SUMMARY=====");
            System.out.println(viewer2.getGoldScreen().getBookingId());
            System.out.println(viewer2.getGoldScreen().getTicketPrice());
            System.out.println(viewer2.getGoldScreen().getSnackPrice());
            System.out.println(viewer2.getGoldScreen().getTotalBill());
        }
        else{
            SilverScreen ss=new SilverScreen("AZ!1",100,100,200,viewer2);
            System.out.println("=====VIEWER 2=====");
            ss.setViewer(viewer2);
            ss.calculateTicketPrice();
            ss.calculateSnackPrice();
            ss.generateBill();
            ss.applyDiscount();
            System.out.println("=====BOOKING SUMMARY=====");
            System.out.println(viewer2.getSilverScreen().getBookingId());
            System.out.println(viewer2.getSilverScreen().getTicketPrice());
            System.out.println(viewer2.getSilverScreen().getSnackPrice());
            System.out.println(viewer2.getSilverScreen().getTotalBill());
        }

    }
}

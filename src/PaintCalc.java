import java.util.Scanner;

public class PaintCalc {

    public static void main(String[] args) {
        //String newWall = "Y";
        //String respObj = "Y";
        double totalWall = 0;

        Scanner meScan = new Scanner(System.in);
        Scanner intFix = new Scanner(System.in);
        //Integer.parseInt()

                            /// LOOK INTO ADDING WHILE LOOP HERE
        //do {    ////

        ////// Adding Wall //////
        System.out.print("Do you want to add a W to the Calculator? [Y/N]:");
        String newWall = meScan.nextLine().toUpperCase();

        if (newWall.equals("Y")) {

            ///// FOR LOOP ///////
            System.out.print("Please Enter how many walls you want to paint?:");
            int wallAmnt = intFix.nextInt();

            for (int i = 1; i <= wallAmnt; i++) {
                System.out.println(wallAmnt + " Walls Selected, Calculating Wall No." + i);


            //////////////////////
            //////////////////////


                System.out.println("Please Enter the Length of your wall in cm");
                int wallX = intFix.nextInt();

                System.out.println("Please Enter the Height of your wall in cm");
                int wallY = intFix.nextInt();

                /// Objects
                System.out.println("Are there any objects you want to paint around?[Y/N]:");
                String respObj = meScan.nextLine().toUpperCase();

                if (respObj.equals("Y")) {
                    System.out.println("Please Enter the length of your object:");
                    int objX = intFix.nextInt();

                    System.out.println("Please Enter the Height of your object:");
                    int objY = intFix.nextInt();

                    totalWall += ((wallX / 100) * (wallY / 100)) - ((objX / 100) * (objY / 100));
                    //totalWall = (wallX * wallY) - (objX * objX);
                    wallX -= objX;
                    wallY -= objY;

                } else {
                    totalWall += (wallX / 100) * (wallY / 100);
                    System.out.println("\n Calculating.....");
                }

                System.out.println("Total Wall space so far to paint is:\n" + (totalWall) + "Meters Quared total\n"); //+ ((wallX * wallY)-) );

            //System.out.print("Do you want to add another Wall to the Calculator? [Y/N]");
            //newWall = meScan.nextLine();

            } ////\\\\ END OF FOR LOOP ////\\\\

            System.out.print("You have Entered a total of "+ totalWall +" Meter Sqaured That needs Painting.\n");

            double numCans = totalWall / 10;
            double Cost = (numCans);

            System.out.print("Please Select a Paint can Size: \n" +
                    " (A - 2.5L for 8 GBP each)  \n" +
                    " (B - 5L for 15 GBP each)  \n" +
                    " (C - 10L for 25 GBP each) \n" +
                    " (D - Find the Best Price) \nYour Input:");
            String canSelect = meScan.nextLine().toUpperCase();

            switch (canSelect) {
                case "B":
                    System.out.println("You have selected 5L Cans \n");
                    System.out.println("you will need:" + (Math.round(numCans /= 5)) + " Cans of Paint.");

                    Cost = (numCans * 15);

                    if (numCans < 1.1) {
                        Cost = 15;
                    }
                    System.out.println("This will come to a total of:" + Cost + "GBP.");
                    break;

                case "C":
                    System.out.println("You have selected 10L Cans \n");
                    System.out.println("you will need:" + (Math.round(numCans /= 10)) + " Cans of Paint.");

                    Cost = (numCans * 25);

                    if (numCans < 1.1) {
                        Cost = 25;
                    }
                    System.out.println("This will come to a total of:" + Cost + "GBP.");
                    break;

                case "D":
                    double pRem = (Math.round(numCans / 10));

                    System.out.println("You have selected our super cool deal finder, we will seek the best price for you! \n");
                    System.out.println("Total Litres of paint needed:"+ numCans +" you will need:" + pRem + " Cans of 10L Paint.");

                    double subT = (numCans /= 10);
                    System.out.println("pRem:"+ pRem + " subT:" + subT + " numCans:" + numCans);

                    if (subT != 0.00){
                        System.out.println("Adding :" + (Math.round(subT - pRem + 0.5)) + " Cans of 5L Paint.");


                    };
                    //double pRem = (Math.round(numCans /= 10));
                    //System.out.println("TEST: You have" + pRem + " after the %");

                    if (Math.round(subT - pRem + 0.5) < 1){

                        System.out.println("Adding :" + (Math.round(subT - pRem + 0.25)) + " Cans of 2.5L Paint.");
                        Cost = (pRem * 25) + (Math.round(subT - pRem + 0.25) * 8);

                    }

                    Cost = (pRem * 25) + (Math.round(subT - pRem + 0.5) * 15);


                    if (numCans < 1.1) {
                        Cost = 25;
                    }
                    System.out.println("This will come to a total of:" + Cost + "GBP.");
                    break;

                default:
                    System.out.println("You have selected 2.5L Cans \n");
                    System.out.println("you will need:" + (numCans /= 2.5) + " Cans of Paint.");

                    Cost = (numCans * 8);

                    if (numCans < 1.1) {
                        Cost = 8;
                    }
                    System.out.println("This will come to a total of:" + Cost + " GBP.");
                    break;

            } //\\ -END OF CAN SELECTION - //\\

                                                                                        //} while (newWall = "Y")

                                                                                        //old system
                                                                                        //System.out.println("To paint your walls with 1 coat you will need :" + numCans + "cans of 2.5l paint,\n priced at GBP:8 for 2.5L, you will need:" + (numCans) + " Cans of Paint.\n priced at GBP:15 for 5L, you will need:" + (numCans/2) + " Cans of Paint for GBP:"+ ((numCans/2) *) + "\n priced at GBP:25 for 10L, you will need:" + (numCans/4) + " Cans to fully paint your walls at GBP:" + ((numCans/4) * 25) );

                                                                                        // float totalWall = (wallX / 100) + (wallY / 100);
        } while (newWall.equals("Y"));  ////\\\\ END OF DO ; WHILE ////\\\\
        //else {
        //    System.out.println("Oh... ok then, I guess you don't need me after all :(");
        //}
    }
}
import java.io.*;
import java.util.*;
public class  Driver1  {
    public static myArrayList   list;
    public static Scanner  inp;
    public static File f;
    public static String  fname;
    public static int num;
    public static void main( String [ ]args)
    {
        System.out.print("Please enter a path or name of input file : ");
        inp = new Scanner(System.in);
        fname = inp.nextLine();
        f = new File(fname);
        try{
            inp = new Scanner(f);
        }
        catch (FileNotFoundException e) {
            System.out.println("file not found");
        } {

    }

        String line;
        String [ ] tokens;


        num =  Integer.parseInt( inp.nextLine()) ;

        list = new myArrayList(num);


        while ( inp.hasNextLine() )
        {
            int pos = 0;
            int val = 0;
            line = inp.nextLine( );
            tokens = line.split("\\s+");

            switch ( tokens[0] )  {
                case "IF" : //insertFront()
                    val = Integer.parseInt( tokens[1] );
                    list.insertFront(val);
                    break;
                case "IR" : //insertRear()
                    val = Integer.parseInt( tokens[1] );
                    list.insertRear(val);
                    if(list.getSize() == 0)
                        System.out.println("LIST IS FULL");
                    break;
                case  "IP" : //insertPos()
                    pos = Integer.parseInt( tokens[1] );
                    val = Integer.parseInt( tokens[2] );
                    if ( pos < 0 && pos > num)
                        System.out.println("ERROR : NO SUCH POSITION IN LIST");
                    else list.insertPos(val,pos);
                    break;
                case  "DF"  : //deleteFront()
                    if ( ! list.isEmpty() ) {
                        System.out.println("### " + list.deleteFront() + " ###");

                    }
                    else
                        System.out.println("ERROR : CANNOT DELETE FROM EMPTY LIST");
                    break;
                case  "DR"  : //deleteRear()
                    // code for calling deleteRear( ) and printing output in proper format goes here
                    if ( ! list.isEmpty() ) {
                        System.out.println("@@@ " + list.deleteRear() + " @@@");

                    }
                    else
                        System.out.println("ERROR : CANNOT DELETE FROM EMPTY LIST");
                    break;
                case  "DP"   : //deletePos()
                    // code for deletePos() and proper output should go here
                    pos = Integer.parseInt( tokens[1] );
                    if ( ! list.isEmpty() ) {
                        System.out.println("*** " + list.deletePos(pos) + " ***");

                    }
                    else
                        System.out.println("ERROR : CANNOT DELETE FROM EMPTY LIST");
                    break;
                case "PL" : //printList()
                    if (list.isEmpty()) {
                        System.out.println("LIST IS EMPTY");
                    }
                    else
                        list.printList();
                    break;
                case "GS" : //getSize()
                    // code for calling getSize() and printing out appropriately should go here
                    System.out.println("SIZE : " + list.getSize());
                    break;
                case  "GI"  : //getItem()
                    pos = Integer.parseInt(tokens[1]);
                    if ( pos < list.getSize() && pos > 0) {
                        System.out.println("Position " + pos + " : " + list.getItem(pos));
                    }
                    else
                        System.out.println("ERROR : NO SUCH POSITION IN LIST");
                    break;
                default :
                System.out.println("Command not recognized : " + tokens[0]);
            }   // end switch
        }  // end while
    }   // end main()
}    // end class

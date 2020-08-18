import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class ReadNSearchFile {

    private static Scanner x;

    public static void main(String[] args) {

        String filepath = "tutorial.txt";
        String searchTerm = "5464";

        readRecord(searchTerm,filepath);
    }
        public static void readRecord(String searchTerm, String filepath){

            boolean found = false;
            String ID = "";
            String name1 = "";
            String age = "";

            try {
                x = new Scanner(new File(filepath));
                x.useDelimiter("[,\n]");

                while(x.hasNext() && !found){
                    ID = x.next();
                    name1 = x.next();
                    age = x.next();


                    if(ID.equals(searchTerm)){
                        found = true;
                    }

                    if(found)
                    {
                        System.out.println(ID+" "+ name1 + " "+ age);
                    }
                    else
                    {
                        System.out.println("Record not found");
                    }
                }


            }

            catch (FileNotFoundException e) {
                e.printStackTrace();
            }

        }


    }

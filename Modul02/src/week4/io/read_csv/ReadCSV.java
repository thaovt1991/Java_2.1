package week4.io.read_csv;


import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class ReadCSV {
    // Delimiter used in CSV file
    private static final String COMMA_DELIMITER = ",";
    private static final String NEW_LINE_SEPARATOR = "\n";

    // CSV file header
    private static final String FILE_HEADER = "id,code,name";

    public static void main(String[] args) {

        String fileName = "D:\\Java_2.1\\Modul02\\src\\week4\\io\\read_csv\\data\\contries.csv";
        List <String> list = new ArrayList<>();
        try{
            File file = new File(fileName);
            if(!file.exists()){
//                writeCsvFile(fileName);
                try {
                    FileWriter  writer = new FileWriter(fileName);
                    System.out.println("Success");
                }catch (Exception e){
                    e.getStackTrace();
                }

            }
            BufferedReader br = new BufferedReader(new FileReader(file));
            String line ="";
            while ((line = br.readLine())!= null){
                list.add(line) ;
            }

            System.out.println("List : ");
            for(String e : list){
                System.out.println(e);
            }

        } catch (Exception e) {
            e.getStackTrace();
        }

    }




    public static void writeCsvFile(String fileName) {
        // Create new Countrys objects
        Country country1 = new Country(1, "US", "United States");
        Country country2 = new Country(2, "VN", "Viet Nam");
        Country country3 = new Country(3, "AU", "Australia");
        Country country4 = new Country(4, "CN", "China");
        Country country5 = new Country(5, "JP", "Japan");
        Country country6 = new Country(6, "TH", "Thailand");
        Country country7 = new Country(7, "SG", "Singapore");
        // Create a new list of Country objects
        List<Country> countries = new ArrayList<>();
        countries.add(country1);
        countries.add(country2);
        countries.add(country3);
        countries.add(country4);
        countries.add(country5);
        countries.add(country6);
        countries.add(country7);


        FileWriter fileWriter = null; //creart

        try {
            fileWriter = new FileWriter(fileName);

            // Write the CSV file header
            fileWriter.append(FILE_HEADER);

            // Add a new line separator after the header
            fileWriter.append(NEW_LINE_SEPARATOR);

            // Write a new Country object list to the CSV file
            for (Country country : countries) {
                fileWriter.append(String.valueOf(country.getId()));
                fileWriter.append(COMMA_DELIMITER);
                fileWriter.append(country.getCode());
                fileWriter.append(COMMA_DELIMITER);
                fileWriter.append(country.getName());
                fileWriter.append(NEW_LINE_SEPARATOR);
            }

            System.out.println("CSV file was created successfully !!!");

        } catch (Exception e) {
            System.out.println("Error in CsvFileWriter !!!");
            e.printStackTrace();
        } finally {
            try {
                fileWriter.flush();
                fileWriter.close();
            } catch (IOException e) {
                System.out.println("Error while flushing/closing fileWriter !!!");
                e.printStackTrace();
            }
        }
    }


}



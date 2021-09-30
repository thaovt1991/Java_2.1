package week4.io.read_and_write_file;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class ReadAndWriteFile {
    public List<Integer> readFile(String filePath){
        List<Integer> number = new ArrayList<>();
        try{
            File file = new File(filePath) ;
            if(!file.exists()){
                throw new FileNotFoundException();
            }

            BufferedReader br = new BufferedReader(new FileReader(file));
            String line ="";
            while ((line = br.readLine())!= null){
                number.add(Integer.parseInt(line));
            }
            br.close();
        }catch (Exception e){
            System.out.println("The file does not exist or the content has an error !");
        }
        return number ;
    }
    public void writeFile(String fildePath, int max){
        try{
            FileWriter writer = new FileWriter(fildePath,true) ;
            BufferedWriter bufferedWriter = new BufferedWriter(writer);
            bufferedWriter.write("Max value is : "+ max); //
           // bufferedWriter.append("Max value is : "+ max);
            bufferedWriter.close();
        }catch (IOException e){
            e.printStackTrace();
        }
    }
}

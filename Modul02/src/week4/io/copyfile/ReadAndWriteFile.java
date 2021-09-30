package week4.io.copyfile;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class ReadAndWriteFile<E> {
    public List<E> readFile(String filePath){
        List <E> list = new ArrayList<>();
        try{
            File file = new File(filePath) ;
            if(!file.exists()){
                throw new FileNotFoundException();
            }
            BufferedReader br = new BufferedReader(new FileReader(file));
            Object line ;
            while ((line = br.readLine())!= null){
                list.add((E)line);
            }
            br.close();
        }catch (Exception e){
            System.out.println("The file does not exist or error !");
        }
        return list ;
    }

    public void writeFile(String fidePath, E element){
        try {
            FileWriter writer = new FileWriter(fidePath,true) ;
            BufferedWriter bufferedWriter = new BufferedWriter(writer);
            bufferedWriter.write(element.toString() +"\n");
            bufferedWriter.close();
        }catch (Exception e){
            e.getStackTrace();
        }
    }
}

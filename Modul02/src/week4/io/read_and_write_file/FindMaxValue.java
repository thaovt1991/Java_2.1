package week4.io.read_and_write_file;

import java.util.List;

public class FindMaxValue {
    public static int finMax(List<Integer> numbers){
        int max = numbers.get(0);
        for (int i = 0; i < numbers.size(); i++) {
            if (max < numbers.get(i)) {
                max = numbers.get(i);
            }
        }
        return max;
    }
    public static void main(String[] args) {
        ReadAndWriteFile readAndWriteFile = new ReadAndWriteFile();
        List<Integer> numbers = readAndWriteFile.readFile("D:\\Java_2.1\\Modul02\\src\\week4\\io\\read_and_write_file\\data\\numbers.txt");
        int maxValue = finMax(numbers);
        readAndWriteFile.writeFile("D:\\Java_2.1\\Modul02\\src\\week4\\io\\read_and_write_file\\data\\result.txt", maxValue);
    }
}

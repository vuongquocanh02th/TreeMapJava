import java.util.*;
public class WordCount {
    public static void main(String[] args) {
        String input = "Counter-Terrorist Wins!";
        //Chuyen chuoi thanh mang, tach theo khoang trang va ky tu dac biet
        String[] words = input.split("[\\s,.!?;]+");
        //Tree Map luu tru tu va so lan xuat hien cua no
        TreeMap<String, Integer> wordCountMap = new TreeMap<>();
        //Duyet qua tung tu trong mang
        for (String word : words) {
            //Chuyen toan bo tu ve chu thuong de khong phan biet hoa thuong
            word = word.toLowerCase();
            //Kiem tra xem tu da co trong TreeMap chua
            if(wordCountMap.containsKey(word)) {
                //Neu co, tang gia tri len 1
                wordCountMap.put(word, wordCountMap.get(word) + 1);
            }else {
                //Neu chua, them tu vao Treemap voi gia tri 1
                wordCountMap.put(word, 1);
            }
        }
        //Hien thi ket qua
        for(Map.Entry<String, Integer> entry: wordCountMap.entrySet()){
            System.out.println(entry.getKey() + " " + entry.getValue());
        }
    }
}

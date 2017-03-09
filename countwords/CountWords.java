import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
/**
 * Задание 1: Реализовать два метода
 *
 * Формат файла: текстовый, на каждой его строке есть (или/или)
 * - целое число (int)
 * - текстовая строка
 * - пустая строка (пробелы)
 *
 *
 * Пример файла - words.txt в корне проекта
 *
 * ******************************************************************************************
 *  Пожалуйста, не меняйте сигнатуры методов! (название, аргументы, возвращаемое значение)
 *
 *  Можно дописывать новый код - вспомогательные методы, конструкторы, поля
 *
 * ******************************************************************************************
 *
 */
public class CountWords {
    
    /**
     * Метод на вход принимает объект File, изначально сумма = 0
     * Нужно пройти по всем строкам файла, и если в строке стоит целое число,
     * то надо добавить это число к сумме
     * @param file - файл с данными
     * @return - целое число - сумма всех чисел из файла
     */
    public long countNumbers(File file) throws Exception {
        FileReader reader = new FileReader (file);
        BufferedReader in = new BufferedReader(reader);
        StringBuilder str = new StringBuilder ();
        int currentNum = 0;
        String st;
        while ((st = in.readLine()) != null) {
            try {
                currentNum = currentNum + Integer.parseInt(st);
            }   
            catch (NumberFormatException e) {}
        }
        in.close();
        return currentNum;
    }


    /**
     * Метод на вход принимает объект File, изначально результат= ""
     * Нужно пройти по всем строкам файла, и если в строка не пустая и не число
     * то надо присоединить ее к результату через пробел
     * @param file - файл с данными
     * @return - результирующая строка
     */
    public String concatWords(File file) throws Exception {
        FileReader reader = new FileReader (file);
        BufferedReader in = new BufferedReader(reader);
        StringBuilder str = new StringBuilder ();
        int Num = 0;
        String st;
        while ((st = in.readLine()) != null) {
            try {
                Num = Integer.parseInt(st);
            }   
            catch (NumberFormatException e) { 
             if (!"".equals(st.trim())) str.append(st.trim() + " ");
            }
        }
        in.close();
        return str.toString();
    }
    
    public static void main (String [] args) throws Exception {
        File f = new File ("example.txt");
        CountWords newCW = new CountWords ();
        System.out.println(newCW.countNumbers(f));
        System.out.println(newCW.concatWords(f));
    }
}

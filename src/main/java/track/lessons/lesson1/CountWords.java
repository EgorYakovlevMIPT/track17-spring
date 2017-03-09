package track.lessons.lesson1;

import java.io.File;
import java.util.Scanner;

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
        Scanner scn = new Scanner (file);
        int currentNumber = 0;
        while (scn.hasNext()) {
            currentNumber = currentNumber + scn.nextInt();
        }
        scn.close();
        return currentNumber;
    }


    /**
     * Метод на вход принимает объект File, изначально результат= ""
     * Нужно пройти по всем строкам файла, и если в строка не пустая и не число
     * то надо присоединить ее к результату через пробел
     * @param file - файл с данными
     * @return - результирующая строка
     */
    public String concatWords(File file) throws Exception {
        Scanner scn = new Scanner (file);
        StringBuilder buildString = new StringBuilder ();
        String currentString = "";
        while (scn.hasNext()) {
            buildString.append(scn.next() + " ");
        }
        scn.close();
        return currentString;
    }
    
    public static void main (String [] args) throws Exception {
        File f = new File ("/home/eyakovlev/works/projectsJava/track17-spring/src/main/java/track/lessons/lesson1");
        CountWords newCW = new CountWords ();
        System.out.println( newCW.countNumbers(f));
        System.out.println(newCW.concatWords(f));
    }
}

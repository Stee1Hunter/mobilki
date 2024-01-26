package org.example;

import java.io.*;
import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) throws IOException
    {
        Scanner cs = new Scanner(System.in);//
        System.out.print("Введите количество студентов, которых вы хотите записать:");
        int count = cs.nextInt();//тут мы делаем выбор, сколько студентов мы хотим внести в файл
        int a =1;
        while (a <= count){//тут мы используем цикл вайл, чтобы вносить одного студента за другим, это может оказаться очень удобно
            System.out.println("Введите имя студента:");
            cs.nextLine();//вводим данную строку, чтобы код не пропускал ввод имени
            String name = cs.nextLine();//вводим имя
            System.out.println("Введите возраст студента:");
            int age = cs.nextInt();//вводим возраст
            System.out.println("Введите средний балл студента:");
            float ball = cs.nextFloat();//вводим средний балл студента
            FileWriter fw = new FileWriter("Students.txt",true);//обявляем FileWriter,чтобы добавить текст
            BufferedWriter bw = new BufferedWriter(fw);
            String StdInf = String.format("Имя студента: %s, Возраст студента: %s, Балл студента: %s",name,Integer.toString(age),Float.toString(ball));//в данном действии выполняется форматирование, чтобы мы смогли это записать в файл txt
            bw.write(StdInf);//добавляем данные
            bw.newLine();//вводим данную команду,чтобы запись следующего студента начиналась со следующей строки
            bw.close();//закрываем файл
            a++;//увеличиваем значение переменной а на 1, чтобы цикл знал, когда ему необходимо остановиться
        }
    }
}
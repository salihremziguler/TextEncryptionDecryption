package org.salihremziguler.criptology;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class EncDec {
    public static int indexOf(char[] array, char target) {
        for (int i = 0; i < array.length; i++) {
            if (array[i] == target) {
                return i; // Karakter bulundu, indeksi döndür
            }
        }
        return -1; // Karakter bulunamadı
    }

    public static boolean indexOf2(char[] array, char target) {
        for (int i = 0; i < array.length; i++) {
            if (array[i] == target) {
                return true; // Karakter bulundu, indeksi döndür
            }
        }
        return false; // Karakter bulunamadı
    }


    public static void main(String[] args) {


        char[] fullArray = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9',
                'A', 'B', 'C', 'D', 'E', 'F', 'G', 'H', 'I', 'J', 'K', 'L', 'M', 'N', 'O', 'P', 'Q', 'R', 'S', 'T', 'U', 'V', 'W', 'X', 'Y', 'Z',
                'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k', 'l', 'm', 'n', 'o', 'p', 'q', 'r', 's', 't', 'u', 'v', 'w', 'x', 'y', 'z',
                '+', '-', '&', '|', '!', '(', ')', '{', '}', '[', ']', '^', '~', '*', '?', ':'};

        char[] lowerArray = {'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k', 'l', 'm', 'n', 'o', 'p', 'q', 'r', 's', 't', 'u', 'v', 'w', 'x', 'y', 'z'};
        char[] upperArray = {'A', 'B', 'C', 'D', 'E', 'F', 'G', 'H', 'I', 'J', 'K', 'L', 'M', 'N', 'O', 'P', 'Q', 'R', 'S', 'T', 'U', 'V', 'W', 'X', 'Y', 'Z'};

        long startTime = System.currentTimeMillis();

        String key;
        String word ;
        String result = "";
        int sum=0;

        Scanner scanner=new Scanner(System.in);
        System.out.print("Lütfen Şifrelenecek Kelimeyi Giriniz: ");
        word=scanner.nextLine();

        System.out.print("Lütfen Anahtarı Giriniz:  ");
        key=scanner.nextLine();

        //key deki indis degerlerinin toplanıp sum degiskenine atanması
        for (int i=0;i<key.length();i++)
        {
           sum+= indexOf(fullArray,key.charAt(i));
        }

        //sum değerini harf sayısına gore modu alınıyorsa
        int randomNumber2=sum%lowerArray.length;

        //maksimum key in uzunluğu kadar olacak şekilde rastgele bir deger belirleniyor
        int keyRandom=new Random().nextInt(key.length());
        //bu değerin fullArray de hangi indexe denk geldigi bulunuyor.
        int randomNumber1=indexOf(fullArray,key.charAt(keyRandom));

        //şifrelenecek metnin harfleri tek tek geziliyor.
        for (char ch : word.toCharArray()) {
            String midValue = "";
            String prefix = "";
            String suffix = "";

            //Gezilen harf fullArray de hangi indise ait olduğu buunuyor.
            int charIndex = indexOf(fullArray, ch);

            //Eğer randomNumber1 gezilen harfin indisinden büyükse
            if (randomNumber1 > charIndex) {

                //randomNumber1 den gezilen harfin indisini çıkar ve stringe dönüştür.
                prefix = Integer.toString(randomNumber1 - charIndex);
                midValue = lowerArray[randomNumber2] + Integer.toString(prefix.length() + 1);
                midValue += prefix + fullArray[randomNumber1];
                result += midValue;

            } else {
                suffix = Integer.toString(charIndex - randomNumber1);
                midValue = upperArray[randomNumber2] + Integer.toString(suffix.length() + 1);
                midValue += fullArray[randomNumber1] + suffix;
                result += midValue;
            }
        }

        System.out.println("-------Şifrelenmiş Kelime--------------: "+result);
        String pass = result;


        StringBuilder result3 = new StringBuilder();
        String result2 = "";

        while (true) {

            //Öncelikle şifrelenecek kelimenin ilk harfinin şifrelendiği kelimenin uzunluğunu bul.
            int lengthNumber = Character.getNumericValue(pass.charAt(1)) + 2;
            //O metni al.
            String part = pass.substring(0, lengthNumber);
            int chIndex = -1;
            //Eğer kelimenin ilk harfi küçük harfle başlıyor ise
            if (indexOf2(lowerArray, pass.charAt(0))) {
                char keyChar = part.charAt(part.length() - 1);
                chIndex = new String(fullArray).indexOf(keyChar);
                chIndex -= Integer.parseInt(part.substring(2, part.length() - 1));
                result2 += fullArray[chIndex];

            }
            else if (indexOf2(upperArray, pass.charAt(0))) {   //Büyük harfle başlıyor ise
                char keyChar = part.charAt(2);
                chIndex = indexOf(fullArray, keyChar);
                //3.indisten sona kadar al.
                chIndex += Integer.parseInt(part.substring(3));
                result2 += fullArray[chIndex];

            }
            //İlk bulduğumuz uzunluğu metinden ayrıştır.
            pass = pass.substring(lengthNumber);
            //Eğer uzunluk 2 den küçükse bırak.
            if (pass.length() <= 2)
                break;
        }

        System.out.println("-------Şifrenin Çözülmüş Hali----------: "+result2);


        long endTime = System.currentTimeMillis();
        long elapsedTime = endTime - startTime;

        System.out.println("-------Şifrelenmiş Kelime--------------: " + result);


        System.out.println("\n\n\n----PERFORMANS ÖLÇÜMLERİ----");
        System.out.println("Geçen Süre: " + elapsedTime + " milisaniye");

        // Bellek Tüketimi
        long totalMemory = Runtime.getRuntime().totalMemory();
        long freeMemory = Runtime.getRuntime().freeMemory();
        long usedMemory = totalMemory - freeMemory;

        System.out.println("Toplam Bellek: " + totalMemory + " byte");
        System.out.println("Kullanılan Bellek: " + usedMemory + " byte");





    }
}




























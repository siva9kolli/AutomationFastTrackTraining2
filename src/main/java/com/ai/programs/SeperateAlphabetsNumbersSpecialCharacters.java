package com.ai.programs;

public class SeperateAlphabetsNumbersSpecialCharacters {
    public static void main(String[] args) {
        String name = "Test@1234$987@Selenium";

        StringBuffer alphabets = new StringBuffer();
        StringBuffer numbers = new StringBuffer();
        StringBuffer specials = new StringBuffer();

        for(int i=0; i<name.length(); i++) {

            if (Character.isAlphabetic(name.charAt(i))) {
                alphabets.append(name.charAt(i));
            } else if(Character.isDigit(name.charAt(i))){
                numbers.append(name.charAt(i));
            } else {
                specials.append(name.charAt(i));
            }
        }

        System.out.println(alphabets);
        System.out.println(numbers);
        System.out.println(specials);
    }
}

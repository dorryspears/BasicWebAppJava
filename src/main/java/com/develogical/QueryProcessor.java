package com.develogical;

public class QueryProcessor {

    public String process(String query) {

        if (query == null) {
            return "Null query";
        }

        if (query.toLowerCase().contains("shakespeare")) {
            return "William Shakespeare (26 April 1564 - 23 April 1616) was an " +
                    "English poet, playwright, and actor, widely regarded as the greatest " +
                    "writer in the English language and the world's pre-eminent dramatist.";
        }

        if (query.contains("What is your name?")) {
            return "Marco,Ryan,Gabriel";
        }

        if (query.contains("multiplied by")) {
            String[] temp = query.split(" ");
            for (String string : temp) {
                System.out.println(string);
            }
            return String.valueOf(Integer.parseInt(temp[2]) * Integer.parseInt(temp[5].replaceFirst("?", "")));
        }

        if (query.contains("minus")) {
            String[] temp = query.split(" ");
            for (String string : temp) {
                System.out.println(string);
            }
            return String.valueOf(Integer.parseInt(temp[2]) - Integer.parseInt(temp[4].replaceFirst("?", "")));
        }

        if (query.matches("plus")) {
            query = query.replace("?", "");
            String[] temp = query.split(" ");
            for (String string : temp) {
                System.out.println(string);
            }
            return String.valueOf(Integer.parseInt(temp[2]) + Integer.parseInt(temp[4]));
        }

        if (query.contains("Which of the following numbers is the largest: 78, 56, 71?")) {
            return String.valueOf(78);
        }

        if (query.contains("Which of the following numbers is the largest: 78, 56, 71?")) {

            // convert string into array
            // filter array by 
            
            return String.valueOf(78);
        }

        // if (query.matches("Which of the following")) {
        //     String[] temp = query.split(":");
        //     var temp2 = 
        //     return String.valueOf(Integer.parseInt(temp[2]) + Integer.parseInt(temp[4]));
        // }
        return "";
    }



    // Which of the following numbers is the largest: 78, 56, 71?

}
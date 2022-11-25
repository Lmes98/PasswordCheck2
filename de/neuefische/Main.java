package de.neuefische;

public class Main {
    public static void main(String[] args) {


    }

    public static boolean testPasswordLength(String password){

        int length = password.length();
        if(length >= 8){
            return true;
        }else{
            return false;
        }

    }

    public static boolean testPasswordNumber(String password){

        return password.matches(".*[0-9]");
    }

    public static boolean testPasswordUpperLower(String password){

        int anz = 0;
        for(char c : password.toCharArray()){
            if(c >= 'A' && c <= 'Z'){
                anz = anz + 1;
            }

        }

        if(anz > 0){
            return true;
        }else{
            return false;
        }
    }

    public static boolean testPasswordIfBad(String password) {
    String[] arrayPassword = new String[5];

    arrayPassword[0] = "passwort";
    arrayPassword[1] ="123456";

    boolean valid = true;

    for(int i = 0; i < arrayPassword.length;i++){
        if(password.equals(arrayPassword[i])){
            valid = false;
        }else{
            valid = true;
        }
    }
    return  valid;
    }



}
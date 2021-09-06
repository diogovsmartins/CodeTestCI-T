package com.company;

public class Code3 {
    public static void main(String[] args) {
        // write your code here
        int teste=retornaPessoasPreferemUmUnicoPalco(17000);
        System.out.println(teste);

    }
    public static Integer retornaPessoasPreferemUmUnicoPalco(Integer personsPerShow) {
        double justOneShow=personsPerShow*0.25;
        return (int)justOneShow;
    }
}

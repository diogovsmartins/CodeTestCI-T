package com.company;

public class Code4 {
    //A banda The XPTOs vai gravar o seu primeiro disco! Eles foram em vários estúdios de amigos e perceberam que,
    // ao tocar, existia um eco em alguns deles. Alguns estudios que eles visitaram tinham 8, 16, 18, 24, 36
    // metros entre os amplificadores e as paredes opostas
    //Sabendo que as pessoas conseguem perceber o eco num tempo maior ou igual a 0,1s. C
    // rie uma função que consiga determinar se há eco em um estudio de acordo com a distância
    // entre os amplificadores e a parede oposta, considerando a velocidade do som como 340m/s?
    public static void main(String[] args) {
         boolean tester=retornaSeHaEcoNoEstudio(15);
        System.out.println(tester);
    }
    public static boolean retornaSeHaEcoNoEstudio(Integer distance) {
        final int speedOfSound=340;
        final double minimalTime = 0.1;
        double minimalDistance= (speedOfSound*minimalTime)/2;
        boolean echo= distance > minimalDistance;
        return echo;
    }
}

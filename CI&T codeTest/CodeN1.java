package com.company;

public class CodeN1{
        public static void main(String[] args) {
            Integer result=retornaTempoArenaEmMilisegundos("0.35",340);
            System.out.println("The time in Milliseconds until the last person at the arena hear the sound is "+result);
        }

        public static Integer retornaTempoArenaEmMilisegundos(String distance, Integer speedOfSound) {
            double distanceInMeters = Double.parseDouble(distance)*1000;
            double timeInMillis = (distanceInMeters/speedOfSound)*1000;
            timeInMillis = (double) Math.round(timeInMillis);
            return (int) timeInMillis;
        }
    }

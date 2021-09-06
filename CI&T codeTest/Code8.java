package com.company;
//ingressoFinal=26,
public class code8 {
    public static void main(String[] args) {
        int tester=retornaGuicheIngresso(0);
        System.out.println(tester);
    }

    public static Integer retornaGuicheIngresso(Integer wantedTicket) {
        int ticketWindow=1, ticketNumber=1, currentTicket=1, answer=0;
        for(int i=0; i<100; i++) {
            if(currentTicket==wantedTicket){
                answer=ticketWindow;
                break;
            }
            ticketWindow++;
            ticketNumber=ticketNumber+2;
            for(int j=0; j<ticketNumber;j++){
                currentTicket++;
                if(currentTicket==wantedTicket){
                    break;
                }
            }
        }
        return answer;
    }
}

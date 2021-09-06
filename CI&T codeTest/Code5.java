package com.company;

public class Code5 {
    /*6 amigos (Ana, Bia, Cadu, Duda, Edu e Fabi) tem uma banda de rock, moram próximos ao centro da cidade.
    O mapa é o que está aqui abaixo, mostrando onde cada um mora.
   Eles sempre revezam os ensaios cada dia na casa de um integrante e costumam tocar em um pub no lugar P.
   Crie uma função que calcule a soma da quantidade de quilômetros são percorridos no total pelos participantes,
   permitindo que seja informado a quantidade de rodadas de ensaios e shows que a banda fez.
   Suponha a distância das laterais dos quarteirões são de 250m e desconsidere a largura das ruas.*/

    /*a quantidade de metros que os outros integrantes precisam andar para chegar na casa do membro
       onde vai ser o ensaio, no caso um não vai andar porque é na casa dele e o resto vai ter que andar até la
       e depois voltar pra casa quando acabar o ensaio então é aquela distancia *2
       */
    static final int ENSAIO_ANA=(500+500+500+250+1000)*2;
    static final int ENSAIO_BIA=(500+500+1000+750+500)*2;
    static final int ENSAIO_CADU=(500+500+500+750+500)*2;
    static final int ENSAIO_DUDA=(500+500+1000+750+1000)*2;
    static final int ENSAIO_EDU=(500+500+500+250+500)*2;
    static final int ENSAIO_FABI=(750+250+750+250+750)*2;
    static final int SHOW=((750+500+750+750+1250+1250)*2);

    public static void main(String[] args) {
        int tester=calculaDistanciaBandaPercorre(1,1);
        System.out.println(tester);
    }
    public static Integer calculaDistanciaBandaPercorre(Integer numeroRodadaEnsaios,Integer numeroShows) {

        int totalDosEnsaios=(ENSAIO_ANA+ENSAIO_BIA+ENSAIO_CADU+ENSAIO_DUDA+ENSAIO_EDU+ENSAIO_FABI)*numeroRodadaEnsaios;
        int metrosShow=SHOW*numeroShows;
        return (metrosShow+totalDosEnsaios);
    }
}

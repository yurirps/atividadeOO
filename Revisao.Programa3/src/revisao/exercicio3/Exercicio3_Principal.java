package revisao.exercicio3;

public class Exercicio3_Principal {


    public static void main(String[] args) {
        
        Casa casa = new Casa();
        
        casa.iniciarJanelas();
        
        System.out.println(casa.quantidadeJanelasAbertas());
        casa.fechaJanela(0);
        casa.fechaJanela(2);        
        System.out.println(casa.quantidadeJanelasAbertas());
        casa.abreJanela(0);
        System.out.println(casa.quantidadeJanelasAbertas()); //resultado esperado 2
        casa.abreJanela(0);
        System.out.println(casa.quantidadeJanelasAbertas()); //resultado esperado 2 novamente
    }

}

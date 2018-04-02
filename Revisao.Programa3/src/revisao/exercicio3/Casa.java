package revisao.exercicio3;

import programa2.Janela;

public class Casa {
    
    private String cor;
    private Janela[] janela = new Janela[3];
 
    public void iniciarJanelas()
    {
        for(int i = 0; i < janela.length; i++)
        {
            janela[i] = new Janela();
            janela[i].abre();
        }
    }
    
    public void abreJanela(int pos)
    {
        this.janela[pos].abre();
    }
    
    public void fechaJanela(int pos)
    {
        this.janela[pos].fecha();
    }
    
    public void pinta(String s)
    {
        this.cor = s;
    }

    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    public Janela[] getJanela() {
        return janela;
    }

    public void setJanela(Janela[] janela) {
        this.janela = janela;
    }
    
    public int quantidadeJanelasAbertas()
    {
        int abertas=0;   
        
        for(int i = 0; i < janela.length; i++) {        
            if(janela[i].estaAberta()) abertas++;        
        }
        
        return abertas;
    }

}

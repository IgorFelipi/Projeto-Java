import javax.swing.JOptionPane;

public class exameTrigliceridios extends exame {
    
    private int qtdTriglicere;
    private boolean Jejum = true;
    private String resultado;

    public int getQtdTriglicere() {
        return qtdTriglicere;
    }

    public void setQtdTriglicere(int qtdTriglicere) {
        this.qtdTriglicere = qtdTriglicere;
    }

    public boolean isJejum() {
        return Jejum;
    }

    public void setJejum(boolean Jejum) {
        this.Jejum = Jejum;
    }

    public String getResultado() {
        return resultado;
    }

    public void setResultado(String resultado) {
        this.resultado = resultado;
    }
    
    @Override
    public void CadastrarExame(){
        super.CadastrarExame();
        
        qtdTriglicere = Integer.parseInt(JOptionPane.showInputDialog("Digite a sua quantia de Trigliceres:"));
        
        if(anoFinal >= 0 && anoFinal <=9 && Jejum && qtdTriglicere < 75){
            resultado = "Trigliceridio BOM";
         }else if(anoFinal >=10 && anoFinal <=19 && Jejum && qtdTriglicere < 90){
             resultado = "Trigliceridio BOM";
         }else if(anoFinal > 20 && Jejum && qtdTriglicere < 150){
             resultado = "Trigliceridio BOM";
         }else{
             resultado = "Trigliceridio RUIM";
         }
        
}
    
    @Override
     public void classificarResultado(){
       
        String mensagem = "Nome : " + this.getnomePessoa()+ "\n" + 
                          "Tipo sanguineo : " + this.getTipoSangue()+ "\n"+ 
                          "Trigliceridio: " + qtdTriglicere+ "\n"+
                          "Classificação: " + resultado; 
        
        JOptionPane.showMessageDialog(null, mensagem);
    }
    
}

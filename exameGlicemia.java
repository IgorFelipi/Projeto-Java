import javax.swing.JOptionPane;

public class exameGlicemia extends exame {
    
    private int qtdGlicose;
    private String Resultado;

    public int getQtdGlicose() {
        return qtdGlicose;
    }

    public void setQtdGlicose(int qtdGlicose) {
        this.qtdGlicose = qtdGlicose;
    }

    public String getResultado() {
        return Resultado;
    }

    public void setResultado(String Resultado) {
        this.Resultado = Resultado;
    }
    
    @Override
    public  void CadastrarExame(){
        super.CadastrarExame();
        qtdGlicose = Integer.parseInt(JOptionPane.showInputDialog("Digite sua quantidade de Glicose:"));
        
        if(qtdGlicose < 100){
            Resultado = "Normoglicemia";
        }else if (qtdGlicose >=100 && qtdGlicose <= 126){
            Resultado = "Pré-Diabetes";
        }else{
            Resultado = "Diabetes Estabelecido";
        }
        
    }
 
       
    
    @Override
    public void classificarResultado(){
       
        String mensagem = "Nome: " + this.getnomePessoa()+ "\n" + 
                          "Tipo sanguineo: " + this.getTipoSangue()+ "\n"+
                          "Quantidade de glicose : " + qtdGlicose+"\n"+
                          "Classificado em: " + Resultado;
                
        JOptionPane.showMessageDialog(null, mensagem);
    }
    
    
}

import javax.swing.JOptionPane;

public class exameColesterol extends exame {

    private int HDL, LDL;
    private String resultado; 
    private String resultado2;
    private String Risco;

    public int getHDL() {
        return HDL;
    }

    public void setHDL(int HDL) {
        this.HDL = HDL;
    }

    public int getLDL() {
        return LDL;
    }

    public void setLDL(int LDL) {
        this.LDL = LDL;
    }

    public String getResultado() {
        return resultado;
    }

    public void setResultado(String resultado) {
        this.resultado = resultado;
    }

    public String getResultado2() {
        return resultado2;
    }

    public void setResultado2(String resultado2) {
        this.resultado2 = resultado2;
    }

    public String getRisco() {
        return Risco;
    }

    public void setRisco(String Risco) {
        this.Risco = Risco;
    }
        
    @Override
    public  void CadastrarExame(){
        super.CadastrarExame();
        
        HDL = Integer.parseInt(JOptionPane.showInputDialog("Digite a sua quantidade de HDL:"));
        LDL = Integer.parseInt(JOptionPane.showInputDialog("Digite a sua quantidade de LDL:"));
        
        
        if(anoFinal >= 0 && anoFinal <= 19 && HDL >45){
            resultado = "HDL - BOM"; 
            
        }else if(anoFinal >= 20 && HDL > 40 ){
            resultado = "HDL - BOM";
        }else{
            resultado = "HDL - RUIM";
        }
        
        Risco = JOptionPane.showInputDialog("Seu risco é: A -Alto - B Baixo ou M -Medio");
        
        if(Risco.equalsIgnoreCase("B") && LDL > 100){
            resultado2 = "LDL Ruim";
        }else if(Risco.equalsIgnoreCase("M")&& LDL > 70){
            resultado2 = "LDL Ruim";
        }else if(Risco.equalsIgnoreCase("A") && LDL > 50){
            resultado2 = "LDL Ruim";
        }else{
            resultado2 = "LDL BOM";
        }
}
    
    
    @Override
     public void classificarResultado(){
         
       
        String mensagem = "Nome : " + this.getnomePessoa()+ "\n" + 
                          "Tipo sanguineo : " + this.getTipoSangue()+ "\n"+
                          "HDL: " + HDL+ "\n"+
                          "LDL: " + LDL+"\n"+
                          "Risco: " + Risco+ "\n"+
                          "Classificação HDL : " + resultado+"\n"+
                          "Classificação LDL : " + resultado2;
                
        JOptionPane.showMessageDialog(null, mensagem);
    }
    
 
   
}


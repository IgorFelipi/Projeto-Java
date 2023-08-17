import javax.swing.JOptionPane;

public class exameAU extends exame{

    private float acidoUrico;
    private String resultado;

    public float getacidoUrico(){
        return acidoUrico;
    }

    public void setacidoUrico(float acidoUrico){
        this.acidoUrico = acidoUrico;
    }

    public String getresultado(){
        return resultado;
    }

    public void setresultado(String resultado){
        this.resultado = resultado;
    }

    
   @Override
    public void CadastrarExame(){
        acidoUrico = Float.parseFloat(JOptionPane.showInputDialog("Digite a quantidade de Acido Urico:"));

        if(acidoUrico <= 6.8){
            resultado = "Acido Urico totalmente diluido!";
        }else{
            resultado = "Maior chance de formar Cristais de Urato.\n Procure um especialista!";
        }
    }

    
    @Override
     public void classificarResultado(){
       
        String mensagem = "Nome : " + this.getnomePessoa()+ "\n" + 
                          "Tipo sanguineo : " + this.getTipoSangue()+ "\n"+ 
                          "Classificação do Acido urico : " + resultado; 
        
        JOptionPane.showMessageDialog(null, mensagem);
    }

    
}


import javax.swing.JOptionPane;


public  class exame {
    
    private String nomePessoa;
    private String TipoSangue;

    public String getTipoSangue() {
        return TipoSangue;
    }

    public void setTipoSangue(String TipoSangue) {
        this.TipoSangue = TipoSangue;
    }

    public int getAnoFinal() {
        return anoFinal;
    }

    public void setAnoFinal(int anoFinal) {
        this.anoFinal = anoFinal;
    }
    int anoFinal;
    
    public String getnomePessoa(){
        return this.nomePessoa;
    }
    
    public void setnomePessoa(String nomePessoa){
        this.nomePessoa = nomePessoa;
    }
    
   
    public void CadastrarExame(){
        
        
        this.nomePessoa = JOptionPane.showInputDialog("Digite seu nome:");
        this.TipoSangue = JOptionPane.showInputDialog("Digite seu tipo sanguineo:");
        int ano = Integer.parseInt(JOptionPane.showInputDialog("Digite o ano do nascimento:"));
        int anoAtual = 2023;
        this.anoFinal = anoAtual - ano;
        
        
    }
     
      
    public void classificarResultado(){
         
       
        String mensagem = "Nome : " + nomePessoa+ "\n" + 
                          "Tipo sanguineo : " + TipoSangue+ "\n";
                
        JOptionPane.showMessageDialog(null, mensagem);
    }
    
    
}

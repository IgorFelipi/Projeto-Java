import javax.swing.JOptionPane;


public class examecpk extends exame{

    private int cpk;
    private String Sexo;
    private String result = "";

    public void setcpk(int cpk){
        this.cpk = cpk;
    }

    public int getcpk(){
        return this.cpk;
    }

    public void setSexo(String Sexo){
        this.Sexo = Sexo;
    }

    public String getSexo(){
        return this.Sexo;
    }
    public void setresult(String result){
        this.result = result;
    }

    public String getresult(){
        return this.result;
    }

   
    @Override
    public void CadastrarExame(){
        super.CadastrarExame();

      
     

        do{
            Sexo = JOptionPane.showInputDialog("Por favor, Digite o seu sexo: M - Masculino e F - Feminino");
            if (!Sexo.equalsIgnoreCase("M") && !Sexo.equalsIgnoreCase("F")) {
                JOptionPane.showMessageDialog(null, "Sexo inválido. Por favor, digite 'M' para masculino ou 'F' para feminino.");
                continue;
            }
            
            cpk = Integer.parseInt(JOptionPane.showInputDialog("Digite a sua quantidade de Creatinofosfoquinase (cpk):"));
            
            if (Sexo.equalsIgnoreCase("M") && cpk >=32 && cpk <=294){
                result = "Sua função cadíaca, dosagem de mioglobina e tropomina estão adequados";
            }else if(Sexo.equalsIgnoreCase("F") && cpk >= 33 && cpk <= 211){
                result = "Sua função cadíaca, dosagem de mioglobina e tropomina estão adequados";
            }else{
                result = "Seus valores não estão normais, consulte um médico";
            }


        }while(!Sexo.equalsIgnoreCase("M") && !Sexo.equalsIgnoreCase("F"));
        
    }
    
    @Override
     public void classificarResultado(){
         
       
        String mensagem = "Nome : " + this.getnomePessoa()+ "\n" + 
                          "Tipo sanguineo : " + this.getTipoSangue()+ "\n"+
                          "Seu resultado do exame: " + result;
                          
                
        JOptionPane.showMessageDialog(null, mensagem);
    }
    



}
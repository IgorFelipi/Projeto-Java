import javax.swing.JOptionPane;

public class Main {
    public static void main(String args[]){
        int opt;
      

        do{
            
            opt = Integer.parseInt(JOptionPane.showInputDialog(null,"=====ESCOLHA O TIPO DE EXAME====== \n 1-Exame-Glicemia \n 2-Exame-Colesterol\n 3-ExameTrigliceridios\n 0-Sair" ));
            
            switch(opt){
                case 1:
                exameGlicemia eg = new exameGlicemia();
                eg.CadastrarExame();
                eg.classificarResultado();
            break;
                case 2: 
                exameColesterol ec = new exameColesterol();
                ec.CadastrarExame();
                ec.classificarResultado();
            break;
                case 3:
                exameTrigliceridios et = new exameTrigliceridios();
                et.CadastrarExame();
                et.classificarResultado();
            break;
                case 0:
                
            break;
                default:
                    JOptionPane.showMessageDialog(null,"OPÇÃO INVALIDA!\n TENTE NOVAMENTE");

         }
    }while(opt != 0);
}
}

public class Main {
    public static void main(String args[]){
        exameGlicemia eg = new exameGlicemia();
        eg.CadastrarExame();
        eg.classificarResultado();
        
        
        exameColesterol ec = new exameColesterol();
        ec.CadastrarExame();
        ec.classificarResultado();
        
        
        exameTrigliceridios et = new exameTrigliceridios();
        et.CadastrarExame();
        et.classificarResultado();
        
}
}

public class Calculadora {
    int variavel1, variavel2;
    
    public void soma(){
        int resultado= (this.variavel1+this.variavel2);
        System.out.println("A soma dos dois numeros é:" + resultado);
    }
    
    public void subtracao(){
        int resultado= (this.variavel1-this.variavel2);
        System.out.println("A subtracao dos dois numeros é:" + resultado);
    }
    
    public void multiplicacao(){
        int resultado=(this.variavel1*this.variavel2);
        System.out.println("A multiplicacao dos dois numeros é:" + resultado);
    }
    
    public void divisao(){
        int resultado=(this.variavel1/this.variavel2); 
        System.out.println("A divisao dos dois numeros é:" + resultado);
    }
   
    
    public static void main(String [] args) {
        Calculadora n1 = new Calculadora();
        Calculadora n2 = new Calculadora();
        Calculadora n3 = new Calculadora();
        
        n1.variavel1=5;
        n1.variavel2=4;
        n2.variavel1=6;
        n2.variavel2=2;
        n3.variavel1=8;
        n3.variavel2=7;
    
        n1.soma();
        n1.subtracao();
        n1.divisao();
        n1.multiplicacao();
        n2.soma();
        n2.subtracao();
        n2.divisao();
        n2.multiplicacao();
        n3.soma();
        n3.subtracao();
        n3.divisao();
        n3.multiplicacao();
    
    }
}

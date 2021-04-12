public class Cofrinho{
    private Pessoa dono;
    private int qt50;
    private int qt25;
    private int qt10;
    
    
    public Cofrinho (Pessoa umaPessoa){
        this.qt50 = 0;
        this.qt25 = 0;
        this.qt10 = 0;
    }
    
    public Cofrinho (int id, String n){
        dono = new Pessoa (id, n);
        qt50= 0;
        qt25= 0;
        qt10= 0;
    }

    public void depositaUmaMoedaCincoentaCentavos(){
        qt50 = qt50+1;
    }
    
    public void depositaUmaMoedaDezCentavos(){
        qt10 = qt10+1;
    }

    public void depositaUmaMoedaVinteCincoCentavos(){
        qt25 = qt25+1;
    }
    
    public double caculaTotal(){
        double total;
        total = qt50*0.5+qt25*0.25+qt10*0.10;
        return total;
    }
    
    
    
    
    
    
    
}
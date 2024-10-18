package labprogramacion2;

public class PlanIPhone extends Plan {
    protected String email; 
    public PlanIPhone(int numTel, String name, String email){
        super(numTel, name);
        this.email=email;
    }
    
    @Override
    public double pagoMensual(int mins, int msgs){
        return (22+(mins*0.4)+(msgs*0.1));
    }
    @Override
    public String imprimir(){
        return super.imprimir()+"Email: "+email;
    }
    public String getEmail(){
        return email;
    }
}
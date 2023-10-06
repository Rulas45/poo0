
package poo2;


public class Cuenta {
    
    private String nombre;
    private String numeroCuenta;
    private double tipoInteres;
    private double saldo;
    
    public Cuenta(){
        
    }

    public Cuenta(String nombre, String numeroCuenta, double tipoInteres, double saldo) {
        this.nombre = nombre;
        this.numeroCuenta = numeroCuenta;
        this.tipoInteres = tipoInteres;
        this.saldo = saldo;
    }
    
    public Cuenta(Cuenta c){
        
        nombre = c.nombre;
        numeroCuenta = c.numeroCuenta;
        tipoInteres = c.tipoInteres;
        saldo = c.saldo;
        
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getNumeroCuenta() {
        return numeroCuenta;
    }

    public void setNumeroCuenta(String numeroCuenta) {
        this.numeroCuenta = numeroCuenta;
    }

    public double getTipoInteres() {
        return tipoInteres;
    }

    public void setTipoInteres(double tipoInteres) {
        this.tipoInteres = tipoInteres;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }
    
    //metodo ingreso
    public boolean ingreso(double cantidad){
        boolean ingresoCorrecto = true;
        if(cantidad < 0){
            ingresoCorrecto = false;
        }else{
            saldo = saldo + cantidad;
        }
        return ingresoCorrecto;
    }
    
    public boolean reintegro(double cantidad){
        boolean reintegroCorrecto = true;
        if(cantidad < 0){
            reintegroCorrecto = false;
        }else if(saldo >= cantidad){
            saldo -= cantidad;
        }else{
            reintegroCorrecto = false;
        }
        return reintegroCorrecto;  
    }
    
    public boolean transferencia(Cuenta c,double cantidad){
        boolean transferenciaCorrecta = true;
        if(cantidad < 0){
            transferenciaCorrecta = false;
        }
        else if(saldo>=cantidad){
            reintegro(cantidad);
            c.ingreso(cantidad);
        }else{
            transferenciaCorrecta = false;
        }
        return transferenciaCorrecta;
    }
    
}

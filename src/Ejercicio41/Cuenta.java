package Ejercicio41;

public class Cuenta {
    // atributos
    protected float Saldo;
    protected int NumeroConsignaciones = 0; // ingresos
    protected int NumeroRetiros = 0; // retiros
    protected float TasaAnual; // porcentaje
    protected float Comision = 0;

    public Cuenta(float Saldo, float TasaAnual) {
        this.Saldo = Saldo;
        this.TasaAnual = TasaAnual;
    }

    // metodos
    public void consignar(float cantidad) {
        Saldo += cantidad;
        NumeroConsignaciones++;
    }

    public void retirar(float cantidad) {
        if (Saldo >= cantidad) {
            Saldo -= cantidad;
            NumeroRetiros++;
        } else
            System.out.println("no puede retirar dicha cantidad");
    }

    public void calcularInteres(){
        float interesMensual = Saldo * (TasaAnual/12);
        Saldo += interesMensual;
    }
    
    
    public void extractoMensual() {
    	Saldo+=Comision;
    }

	@Override
	public String toString() {
		return "Cuenta [Saldo=" + Saldo + ", NumeroConsignaciones=" + NumeroConsignaciones + ", NumeroRetiros="
				+ NumeroRetiros + ", TasaAnual=" + TasaAnual + ", Comision=" + Comision + "]";
	}
}

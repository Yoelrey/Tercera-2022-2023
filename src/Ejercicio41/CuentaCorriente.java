package Ejercicio41;

public class CuentaCorriente extends Cuenta{

	float Sobregiro = 0;

    public CuentaCorriente(float Saldo, float TasaAnual) {
        super(Saldo, TasaAnual);
    }

    @Override
    public void retirar(float cantidad) {
        super.retirar(cantidad);
        if (Saldo >= cantidad) {
            Saldo -= cantidad;
            NumeroRetiros++;
        } else {
            Sobregiro = cantidad - Saldo;
            Saldo = 0;
        }
    }

    @Override
    public void consignar(float cantidad) {
        if (Sobregiro > 0) {
            if (cantidad >= 0) {
                super.consignar(cantidad - Sobregiro);
                Sobregiro = 0;
                NumeroConsignaciones++;
            } else {
                Sobregiro -= cantidad;
            }
        } else {
            super.consignar(cantidad);
        }
    }

    @Override
    public String toString() {
        return "CuentaCorriente [Saldo=" + Saldo + ", NumeroTransacciones="
                + NumeroConsignaciones + NumeroRetiros + ", Comision=" + Comision + ", Sobregiro=" + Sobregiro + "]";
    }
}
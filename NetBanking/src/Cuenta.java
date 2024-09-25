public class Cuenta
{
    public String numCuenta;
    public int saldo;

    public Cuenta() {

    }

    public Cuenta(int saldo, String numCuenta) {
        this.saldo = saldo;
        this.numCuenta = numCuenta;
    }

    public String getNumCuenta() {
        return numCuenta;
    }

    public void setNumCuenta(String numCuenta) {
        this.numCuenta = numCuenta;
    }

    public int getSaldo() {
        return saldo;
    }

    public void setSaldo(int saldo) {
        this.saldo = saldo;
    }


    public String ConsultarSaldo(){
        return "Su saldo actual es de: " + getSaldo();
    }

    public String Retirar(int monto){
        int saldo = getSaldo();
        int saldoActual = saldo - monto;
        setSaldo(saldoActual);
        return "Su saldo actual es " + getSaldo();
    }

    public String Depositar(int monto){
        int saldo = getSaldo();
        int saldoActual = saldo + monto;
        setSaldo(saldoActual);
        String cuenta = getNumCuenta();
        return "La cuenta " + cuenta + ", tiene un saldo de: " + getSaldo();
    }
}

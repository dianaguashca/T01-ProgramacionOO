package ejercicios.interfaces;

public class CajeroBancoPichincha implements CajeroInterfaz {
	public void solicitarTrajeta(String numero) {
		System.out.println("se solicita su trageta para la transaccion");	
	}
	public void solicitarClave(String clave) {
		System.out.println("ingrese su clave");	
	}
	public void solicitarTipoTransaccion() {
		System.out.println("ingrese su tipo de trnsaccion");
		
	}
	public void solicitarMonto(int monto) {
		System.out.println("elija en monto a retirar ");
		System.out.println("su monto es de "+monto);
	}
	public void validarElSaldo() {
		System.out.println("su saldo es de ");
	}
	public void entregarDinero() {
		System.out.println("dinero en mano");
	}
	public void realizarLaTransaccion() {
		System.out.println("transaccion realizada");
	}
	public void entregarRecibo() {
		System.out.println("recibo impreso");
	}
}

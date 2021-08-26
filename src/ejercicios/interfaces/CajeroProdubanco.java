package ejercicios.interfaces;

public class CajeroProdubanco implements CajeroInterfaz {

	public void solicitarTrajeta(String numero) {
		System.out.println("Ingrese su targeta");
	}
	public void solicitarClave(String clave) {
		System.out.println("ingrese su clave");
		System.out.println("clave ingresada"+clave);
	}
	public void solicitarTipoTransaccion() {
		System.out.println("escoja su tipo de transaccion");	
	}
	public void solicitarMonto(int monto) {
		System.out.println("escoja el monto a retirar");
	}
	public void validarElSaldo() {
		System.out.println("saldo validado");
	}
	public void entregarDinero() {
		System.out.println("dinero imprimiendo");	
	}
	public void realizarLaTransaccion() {
		System.out.println("transaccion realizada");	
	}
	public void entregarRecibo() {
		System.out.println("recibo impreso");
	}

}

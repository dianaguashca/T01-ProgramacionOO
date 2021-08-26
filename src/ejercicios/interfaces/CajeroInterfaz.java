package ejercicios.interfaces;

public interface CajeroInterfaz {
  
	public void solicitarTrajeta(String numero);
	
	public void solicitarClave(String clave);
	
	public void solicitarTipoTransaccion();
	
	public void solicitarMonto(int monto);
	
	public void validarElSaldo();

	public void entregarDinero();
	
	public void realizarLaTransaccion();
	
	public void entregarRecibo();
	
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bancopoo;

/**
 *
 * @author kevit
 */
public class Cajero extends Thread{
    private String nombre;

	private Cliente cliente;
        private Transaccion transaccion;
	private long initialTime;


	public Cajero() {
	}

	public Cajero(String nombre, Cliente cliente,Transaccion transaccion, long initialTime) {
		this.nombre = nombre;
		this.cliente = cliente;
                this.transaccion = transaccion;
		this.initialTime = initialTime;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public long getInitialTime() {
		return initialTime;
	}

	public void setInitialTime(long initialTime) {
		this.initialTime = initialTime;
	}

	public Cliente getCliente() {
		return cliente;
	}

	public void setCliente(Cliente cliente) {
		this.cliente = cliente;
	}

        public Transaccion getTransaccion() {
            return transaccion;
        }

        public void setTransaccion(Transaccion transaccion) {
            this.transaccion = transaccion;
        }
        
        
	@Override
	public void run() {

		System.out.println("El cajero " + this.nombre + " realiza transaccion " 
					+ this.cliente.getNombre() + " en el tiempo: " 
					+ (System.currentTimeMillis() - this.initialTime) / 1000 
					+ "seg");

		for (int i = 0; i < this.transaccion.getTiempo().length; i++) {
			// Se procesa el pedido en X segundos
			this.esperarXsegundos(transaccion.getTiempo()[i]);
			System.out.println("Procesado la transaccion " + (i + 1) 
						+ " del cliente " + this.cliente.getNombre() + "->Tiempo: " 
						+ (System.currentTimeMillis() - this.initialTime) / 1000 
						+ "seg");
		}

		System.out.println("La cajera " + this.nombre + " HA TERMINADO DE PROCESAR " 
						+ this.cliente.getNombre() + " EN EL TIEMPO: " 
						+ (System.currentTimeMillis() - this.initialTime) / 1000 
						+ "seg");
	}

	private void esperarXsegundos(int segundos) {
		try {
			Thread.sleep(segundos * 1000);
		} catch (InterruptedException ex) {
			Thread.currentThread().interrupt();
		}
	}

}


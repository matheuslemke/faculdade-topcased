/**
 * Classes/Relogio.java
 *
 * File generated from the  uml Class
 * $ Date : 4/8/15 11:15:44 AM (April 8, 2015) $
 */
package Classes;



// Start of user code to add imports for Relogio
 
// End of user code

/**
 * Description of the class Relogio.
 *
 */

public abstract class Relogio {
	


		private Array observadores ;
		public Observador[] observador = {};
		// Start of user code to add fields for Relogio

		// End of user code

		/**  SIGNALS  ***/
		interface SMState {
			SMState enterHState();
			void exitToState(SMState s);
		}



		/**
		 * Return observadores.
		 * @return observadores
		 */
		public Array getObservadores() {
		    return observadores;
		}

		/**
		 * Set a value to attribute observadores.
		 * @param observadores.
		 */
		public void setObservadores(Array observadores) {
		    this.observadores = observadores;
		}

		/**
		 * Return observador.
		 * @return observador
		 */
		public Observador[] getObservador() {
		    return observador;
		}

		/**
		 * Set a value to attribute observador.
		 * @param observador.
		 */
		public void setObservador(Observador[] observador) {
		    this.observador = observador;
		}

		/**
		 * Add a observador to the observador array.
		 * @param index index of element.
		 * @param observador_elt Element to add
		 */
		public void addObservador(int index, Observador observador_elt) {
		    this.observador[index]=observador_elt;
		}

		/**
		 * Remove a observador to the observador array at index position.
		 * @param index index element to remove.
		 */
		public void removeObservador(int index) {
		    this.observador[index] = null;
		}



		/**
		 * Constructor.
		 */
		public Relogio() {
			// Start of user code for constructor Relogio
			super();
			// End of user code
		}
		/**
		 * Description of the method cadastrar.
		 *
		 * @param o
		 */
		public void cadastrar(Observador o) {
			// Start of user code for method cadastrar
			//TODO 
			// End of user code
		}


		/**
		 * Description of the method remover.
		 *
		 * @param o
		 */
		public void remover(Observador o) {
			// Start of user code for method remover
			//TODO 
			// End of user code
		}


		/**
		 * Description of the method notificar.
		 *
		 */
		public void notificar() {
			// Start of user code for method notificar
			//TODO 
			// End of user code
		}


		/**  CONNECTORS  ***/



}
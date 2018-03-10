/**
 * Classes/RelogioCentral.java
 *
 * File generated from the  uml Class
 * $ Date : 4/8/15 11:15:44 AM (April 8, 2015) $
 */
package Classes;



// Start of user code to add imports for RelogioCentral
 
// End of user code

/**
 * Description of the class RelogioCentral.
 *
 */

public class RelogioCentral  extends RelogioDigital{
	


		private static RelogioCentral relogio ;
		public Object Property1 ;
		private EDate horario ;
		public Observador[] observador = {};
		// Start of user code to add fields for RelogioCentral

		// End of user code

		/**  SIGNALS  ***/
		interface SMState {
			SMState enterHState();
			void exitToState(SMState s);
		}



		/**
		 * Return relogio.
		 * @return relogio
		 */
		public RelogioCentral getRelogio() {
		    return relogio;
		}

		/**
		 * Set a value to attribute relogio.
		 * @param relogio.
		 */
		public void setRelogio(RelogioCentral relogio) {
		    RelogioCentral.relogio = relogio;
		}

		/**
		 * Return Property1.
		 * @return Property1
		 */
		public Object getProperty1() {
		    return Property1;
		}

		/**
		 * Set a value to attribute Property1.
		 * @param Property1.
		 */
		public void setProperty1(Object Property1) {
		    this.Property1 = Property1;
		}

		/**
		 * Return horario.
		 * @return horario
		 */
		public EDate getHorario() {
		    return horario;
		}

		/**
		 * Set a value to attribute horario.
		 * @param horario.
		 */
		public void setHorario(EDate horario) {
		    this.horario = horario;
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
		 *
		 */
		private RelogioCentral() {
			// Start of user code for constructor RelogioCentral()
			super();
			// End of user code
		}
		/**
		 * Description of the method obterRelogio.
		 *
		 * @return ret
		 */
		public static RelogioCentral obterRelogio() {
			// Start of user code for method obterRelogio
			//TODO 
			// End of user code
		}


		/**
		 * Description of the method .
		 *
		 */
		public void () {
			// Start of user code for method 
			//TODO 
			// End of user code
		}


		/**
		 * Description of the method alterarHora.
		 *
		 */
		public void alterarHora() {
			// Start of user code for method alterarHora
			//TODO 
			// End of user code
		}


		/**
		 * Description of the method obterInstancia.
		 *
		 * @return ret
		 */
		public RelogioCentral obterInstancia() {
			// Start of user code for method obterInstancia
			//TODO 
			// End of user code
		}


		/**
		 * Description of the method .
		 *
		 */
		public void () {
			// Start of user code for method 
			//TODO 
			// End of user code
		}


		/**  CONNECTORS  ***/



}
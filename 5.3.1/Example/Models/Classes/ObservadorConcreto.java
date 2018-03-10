/**
 * Classes/ObservadorConcreto.java
 *
 * File generated from the  uml Class
 * $ Date : 4/8/15 11:15:44 AM (April 8, 2015) $
 */
package Classes;



// Start of user code to add imports for ObservadorConcreto
 
// End of user code

/**
 * Description of the class ObservadorConcreto.
 *
 */

public class ObservadorConcreto 	implements Observador 
{
	


		private RelogioDigital digital ;
		private RelogioAnalogico analogico ;
		// Start of user code to add fields for ObservadorConcreto

		// End of user code

		/**  SIGNALS  ***/
		interface SMState {
			SMState enterHState();
			void exitToState(SMState s);
		}



		/**
		 * Return digital.
		 * @return digital
		 */
		public RelogioDigital getDigital() {
		    return digital;
		}

		/**
		 * Set a value to attribute digital.
		 * @param digital.
		 */
		public void setDigital(RelogioDigital digital) {
		    this.digital = digital;
		}

		/**
		 * Return analogico.
		 * @return analogico
		 */
		public RelogioAnalogico getAnalogico() {
		    return analogico;
		}

		/**
		 * Set a value to attribute analogico.
		 * @param analogico.
		 */
		public void setAnalogico(RelogioAnalogico analogico) {
		    this.analogico = analogico;
		}


		/**
		 * Constructor.
		 */
		public ObservadorConcreto() {
			// Start of user code for constructor ObservadorConcreto
			super();
			// End of user code
		}

		/**  CONNECTORS  ***/



}
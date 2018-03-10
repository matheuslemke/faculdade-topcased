/**
 * Classes/RelogioDigital.java
 *
 * File generated from the  uml Class
 * $ Date : 4/8/15 11:15:44 AM (April 8, 2015) $
 */
package Classes;



// Start of user code to add imports for RelogioDigital
 
// End of user code

/**
 * Description of the class RelogioDigital.
 *
 */

public class RelogioDigital  extends RelogioCentral	implements Observador 
{
	


		private static RelogioCentral relogio ;
		public RelogioCentral[]  = {};
		// Start of user code to add fields for RelogioDigital

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
		    RelogioDigital.relogio = relogio;
		}

		/**
		 * Return .
		 * @return 
		 */
		public RelogioCentral[] get() {
		    return ;
		}

		/**
		 * Set a value to attribute .
		 * @param .
		 */
		public void set(RelogioCentral[] ) {
		    this. = ;
		}

		/**
		 * Add a  to the  array.
		 * @param index index of element.
		 * @param _elt Element to add
		 */
		public void add(int index, RelogioCentral _elt) {
		    this.[index]=_elt;
		}

		/**
		 * Remove a  to the  array at index position.
		 * @param index index element to remove.
		 */
		public void remove(int index) {
		    this.[index] = null;
		}



		/**
		 * Constructor.
		 */
		public RelogioDigital() {
			// Start of user code for constructor RelogioDigital
			super();
			// End of user code
		}
		/**
		 * Description of the method atualizar.
		 *
		 */
		public void atualizar() {
			// Start of user code for method atualizar
			//TODO 
			// End of user code
		}


		/**  CONNECTORS  ***/



}
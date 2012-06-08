/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package controladoras;

/**
 *
 * @author Fam Herrera
 */
public class CuentaException extends Exception {

    /**
     * Creates a new instance of
     * <code>CuentaException</code> without detail message.
     */
    public CuentaException() {
    }

    /**
     * Constructs an instance of
     * <code>CuentaException</code> with the specified detail message.
     *
     * @param msg the detail message.
     */
    public CuentaException(String msg) {
        super(msg);
    }
}

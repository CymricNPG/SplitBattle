/**
 * ABattle, a xbattle conversion for java, Copyright by Roland Spatzenegger (2011-)
 */
package net.npg.sb.shared.error;


import org.apache.commons.lang3.Validate;

import java.util.HashMap;
import java.util.Map;

/**
 * every thrown business logic exception must have a code.
 *
 * @author Cymric
 */
public final class ExceptionCode {

    private static final Map<Integer, ExceptionCode> codes = new HashMap<Integer, ExceptionCode>();
    public final static ExceptionCode NO_EXCEPTION = new ExceptionCode(-1, "NoException");

    private final int code;

    private final String message;

    /**
     * Instantiates a new exception code.
     *
     * @param code    the code
     * @param message the message
     */
    public ExceptionCode(final int code, final String message) {
        assert (codes != null);
        synchronized (codes) {
            Validate.notNull(message);
            if (codes.containsKey(code)) {
                throw new IllegalArgumentException("Code " + code + " already registered with text:" + codes.get(code).message + ". New Text to insert:"
                    + message);
            }
            this.code = code;
            this.message = message;
            codes.put(code, this);
        }
    }

    /**
     * Gets the code.
     *
     * @return the code
     */
    public int getCode() {
        return code;
    }

    /**
     * Gets the message.
     *
     * @return the message
     */
    public String getMessage() {
        return message;
    }

}

package com.flipkart.zjsonpatch;

/**
 * User: holograph
 * Date: 03/08/16
 */
public class InvalidJsonPatchException extends JsonPatchApplicationException {

    private static final long serialVersionUID = 3293427689499365563L;

    public InvalidJsonPatchException(String message) {
        super(message);
    }

    public InvalidJsonPatchException(String message, Throwable cause) {
        super(message, cause);
    }
}

package com.flipkart.zjsonpatch;

/**
 * User: holograph
 * Date: 03/08/16
 *
 * Changed by Vladimir Kovalchuk.
 */
public class JsonPatchApplicationException extends RuntimeException {

    private static final long serialVersionUID = 5904836540076002903L;

    public JsonPatchApplicationException(String message) {
        super(message);
    }

    public JsonPatchApplicationException(String message, Throwable cause) {
        super(message, cause);
    }
}

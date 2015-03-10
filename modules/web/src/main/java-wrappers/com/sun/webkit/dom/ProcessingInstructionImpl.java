// Automatically generated by CodeGeneratorJava.pm. Do not edit.

package com.sun.webkit.dom;

import org.w3c.dom.DOMException;
import org.w3c.dom.ProcessingInstruction;
import org.w3c.dom.stylesheets.StyleSheet;

public class ProcessingInstructionImpl extends NodeImpl implements ProcessingInstruction {
    ProcessingInstructionImpl(long peer) {
        super(peer);
    }

    static ProcessingInstruction getImpl(long peer) {
        return (ProcessingInstruction)create(peer);
    }


//attributes
    public String getTarget() {
        return getTargetImpl(getPeer());
    }
    native static String getTargetImpl(long peer);

    public String getData() {
        return getDataImpl(getPeer());
    }
    native static String getDataImpl(long peer);

    public void setData(String value) throws DOMException {
        setDataImpl(getPeer(), value);
    }
    native static void setDataImpl(long peer, String value);

    public StyleSheet getSheet() {
        return StyleSheetImpl.getImpl(getSheetImpl(getPeer()));
    }
    native static long getSheetImpl(long peer);

}

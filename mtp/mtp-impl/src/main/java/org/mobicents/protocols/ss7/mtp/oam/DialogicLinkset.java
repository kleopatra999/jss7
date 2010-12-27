package org.mobicents.protocols.ss7.mtp.oam;

import java.io.IOException;
import java.nio.ByteBuffer;

import javolution.text.TextBuilder;

/**
 * 
 * @author amit bhayani
 * 
 */
public class DialogicLinkset extends Linkset {

    public DialogicLinkset() {
        super();
    }

    public DialogicLinkset(String linkSetName, String type) {
        super(linkSetName, type);
    }

    @Override
    protected void init() {
        // TODO Auto-generated method stub

    }

    @Override
    public boolean noShutdown(ByteBuffer byteBuffer) {
        if (this.state == LinksetState.AVAILABLE) {
            byteBuffer.put(ShellMessages.LINKSET_ALREADY_ACTIVE);
            return FALSE;
        }

        // TODO Start Dialogic Linkset
        return FALSE;
    }

    @Override
    public boolean addLink(String linkName, ByteBuffer byteBuffer) {
        return FALSE;
    }

    /**
     * Stream implementation methods
     */

    @Override
    protected boolean poll(int operation, int timeout) {
        // TODO Auto-generated method stub
        return false;
    }

    @Override
    public int read(byte[] paramArrayOfByte) throws IOException {
        // TODO Auto-generated method stub
        return 0;
    }

    @Override
    public int write(byte[] paramArrayOfByte) throws IOException {
        // TODO Auto-generated method stub
        return 0;
    }

}
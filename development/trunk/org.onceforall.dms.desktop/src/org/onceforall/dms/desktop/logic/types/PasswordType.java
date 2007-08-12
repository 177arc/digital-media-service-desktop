/*
 * Revision History:
 * $Log: PasswordType.java,v $
 * Revision 1.2  2006/09/19 12:52:09  marc
 * Updated to checkpoint progress.
 *
 * Revision 1.1  2006/08/29 00:42:14  marc
 * Added initial revision.
 *
 * Revision 1.1  2006/08/20 12:59:10  marc
 * First revision after rearchitecting.
 *
 * Revision 1.2  2005/09/04 15:24:37  Marc
 * Updated for 0.5.0 release.
 *
 * Revision 1.1  2005/07/20 10:54:43  Marc
 * Moved types to separate package. Implemented CR1 and CR 2.
 *
 * Revision 1.3  2005/04/09 17:57:31  Marc
 * Updated for version 0.4.
 *
 * Revision 1.2  2005/03/18 00:37:31  Marc
 * Made sure that getValueForUI does not declare an exception.
 *
 * Revision 1.1  2005/03/04 00:19:03  Marc
 * Implemented mail mStep and improved general application functionality.
 *
 */
package org.onceforall.dms.desktop.logic.types;

import java.security.InvalidKeyException;
import java.security.NoSuchAlgorithmException;

import javax.crypto.BadPaddingException;
import javax.crypto.Cipher;
import javax.crypto.IllegalBlockSizeException;
import javax.crypto.NoSuchPaddingException;
import javax.crypto.SecretKey;
import javax.crypto.spec.SecretKeySpec;

import org.onceforall.dms.desktop.Base64;
import org.onceforall.dms.desktop.exception.ConversionException;
import org.onceforall.dms.desktop.exception.DesktopException;


/**
 * Defines a password value type. The difference to a string value type is that it masks the password text.
 * 
 * @see org.onceforall.dms.desktop.logic.types.Type 
 * @see org.onceforall.dms.desktop.logic.MValue
 * @see org.onceforall.dms.desktop.logic.types.StringType
 */

public class PasswordType extends Type {
    /** Specifies the password masking text. */
    public final static String PASSWORD_MASK = "*********";
        
    /** Specifies the secret key that is used to encrypt/decrypt the password. */
    private final static SecretKey KEY = new SecretKeySpec("45c56ee8".getBytes(), "DES");
    
    /**
     * Creates a new password value object.
     */
    protected PasswordType() {
        super("Password", "Specifies a sequence of characters that will be mask so that the user cannot them.", String.class); 
    }

    /**
     * @see org.onceforall.dms.desktop.logic.types.Type#getValueForUI(java.lang.Object)
     */
    @Override
	public synchronized String getValueForUI(Object value) {
        return PASSWORD_MASK;
    }
    
    /**
     * @see org.onceforall.dms.desktop.logic.types.Type#getValueFromUI(java.lang.String)
     */
    @Override
	public Object getValueFromUI(String valueFromUI) throws ConversionException {
        if(valueFromUI != null && !valueFromUI.equals(PASSWORD_MASK))
            return super.getValueFromUI(valueFromUI);
        else
            throw new ConversionException("The password cannot be set to '"+PASSWORD_MASK+".");
    }
    
    /**
     * @see org.onceforall.dms.desktop.logic.types.Type#getValueForDOM(java.lang.Object)
     */
    @Override
	public synchronized String getValueForDOM(Object value) throws DesktopException {
        byte[] encryptedPassword = new byte[0];
        try {
            Cipher cipher = Cipher.getInstance("DES");
            cipher.init(Cipher.ENCRYPT_MODE, KEY);
            encryptedPassword = cipher.doFinal(((String) value).getBytes());
        } catch (NoSuchAlgorithmException exception) {
            exception.printStackTrace();
        } catch (NoSuchPaddingException exception) {
            exception.printStackTrace();
        } catch (InvalidKeyException exception) {
            exception.printStackTrace();
        } catch (IllegalBlockSizeException exception) {
            exception.printStackTrace();
        } catch (BadPaddingException exception) {
            exception.printStackTrace();
        }
        
        return Base64.encodeBytes(encryptedPassword);
    }
    
    
    /**
     * @see org.onceforall.dms.desktop.logic.types.Type#getValueFromDOM(java.lang.String)
     */
    @Override
	public Object getValueFromDOM(String valueFromDOM)
            throws ConversionException {
        byte[] encryptedPassword = valueFromDOM.getBytes();
        byte[] decodedEncryptedPassword = Base64.decode(encryptedPassword, 0, encryptedPassword.length);
        
        byte[] decryptedPassword = new byte[0];
        try {
            Cipher cipher = Cipher.getInstance("DES");
            cipher.init(Cipher.DECRYPT_MODE, KEY);
            decryptedPassword = cipher.doFinal(decodedEncryptedPassword);
        } catch (NoSuchAlgorithmException exception) {
            exception.printStackTrace();
        } catch (NoSuchPaddingException exception) {
            exception.printStackTrace();
        } catch (InvalidKeyException exception) {
            exception.printStackTrace();
        } catch (IllegalBlockSizeException exception) {
            exception.printStackTrace();
        } catch (BadPaddingException exception) {
            exception.printStackTrace();
        }
       
        return new String(decryptedPassword);
    }
}

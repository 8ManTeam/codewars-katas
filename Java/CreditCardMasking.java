package masking;

/*Usually when you buy something, you're asked whether your credit card number, 
phone number or answer to your most secret question is still correct. However, 
since someone could look over your shoulder, you don't want that shown on your 
screen.  Instead, we mask it.Your task is to write a function maskify, which 
changes all but the last four characters into '#'.*/

public class CreditCardMasking {

	public String maskify(String str) {
		if (str.length() < 4) {
            return str;
        } else {
            String newStr = "";
            for (Integer i = 0; i < str.length(); i++) {
                if (i >= 4) {
                    newStr += "#";
                }
            }
            newStr += str.substring(str.length() - 4);
            return newStr;
        }
    }
}


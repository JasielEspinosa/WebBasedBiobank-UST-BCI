package security;

import java.security.SecureRandom;

public class TokenGenerator {
	public static SecureRandom random = new SecureRandom();
	
	public static String generateToken(String token) {
		long longToken = Math.abs(random.nextLong());
		String random = Long.toString(longToken, 16);
		return (token + ":" + random);
	}
}

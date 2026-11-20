import java.math.BigInteger;
import java.util.Scanner;

public class RSA {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        BigInteger p = BigInteger.valueOf(61);
        BigInteger q = BigInteger.valueOf(53);
        BigInteger n = p.multiply(q);

        BigInteger phi = p.subtract(BigInteger.ONE)
                .multiply(q.subtract(BigInteger.ONE));

        BigInteger e = BigInteger.valueOf(17);
        BigInteger d = e.modInverse(phi);

        System.out.println("===== RSA Key Generation =====");
        System.out.println("p = " + p);
        System.out.println("q = " + q);
        System.out.println("n = " + n);
        System.out.println("phi(n) = " + phi);

        System.out.println("\nPublic Key = (" + e + ", " + n + ")");
        System.out.println("Private Key = (" + d + ", " + n + ")");

        System.out.print("\nEnter a numerical message (less than " + n + "): ");
        BigInteger message = sc.nextBigInteger();

        if (message.signum() < 0 || message.compareTo(n) >= 0) {
            System.out.println("Error: Message must be between 0 and "
                    + (n.subtract(BigInteger.ONE)) + ".");
            sc.close();
            return;
        }

        BigInteger ciphertext = message.modPow(e, n);
        BigInteger decryptedMessage = ciphertext.modPow(d, n);

        System.out.println("\n===== RSA Encryption =====");
        System.out.println("Original Message : " + message);
        System.out.println("Encrypted Message : " + ciphertext);
        System.out.println("Decrypted Message : " + decryptedMessage);

        System.out.println("\nRSA Successful: " + message.equals(decryptedMessage));

        sc.close();
    }
}
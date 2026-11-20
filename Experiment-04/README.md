# Experiment 04: RSA Key Generation and Secure File Encryption Using OpenSSL

## Objective
To generate RSA public and private key pairs and perform secure file encryption and decryption using OpenSSL.

## Software Required
1. OpenSSL
2. Windows Command Prompt (CMD)

## Algorithm Used
RSA (Rivest-Shamir-Adleman)

## Key Size
2048 bits

## Procedure
1. Generate a 2048-bit RSA private key.
2. Generate the public key using the private key.
3. Create a text file containing the original message.
4. Encrypt the file using the public key.
5. Decrypt the encrypted file using the private key.
6. Compare the original and decrypted files using the `fc /b` command.

## Output Screenshots
The Screenshots folder contains the following four figures:

1. Figure 14: Generation of RSA Public and Private Keys
2. Figure 15: Encryption Using the Public Key
3. Figure 16: Decryption Using the Private Key
4. Figure 17: RSA File Verification

## Result
RSA key generation, file encryption, and decryption were performed successfully. The original and decrypted files were verified as identical.

## Security Note
Private keys must not be uploaded to a public GitHub repository.
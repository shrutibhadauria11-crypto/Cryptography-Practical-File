# Experiment 06: Creation and Analysis of a Self-Signed X.509 Digital Certificate

## Objective
To create a self-signed X.509 digital certificate and analyze its attributes, validity, and security features.

## Software Required
1. OpenSSL
2. Windows Command Prompt (CMD)

## Algorithm Used
RSA

## Certificate Type
Self-Signed X.509 Digital Certificate

## Procedure
1. Open CMD and navigate to the practical folder.
2. Generate an RSA private key.
3. Create a self-signed X.509 certificate.
4. Display the certificate details.
5. Analyze the subject, issuer, validity period, public key, and signature algorithm.
6. Verify the certificate using its own certificate file.

## Output Screenshots
1. Figure 21: RSA Private Key Generation
2. Figure 22: X.509 Certificate Attributes
3. Figure 23: X.509 Certificate Verification

## Result
A self-signed X.509 certificate was generated successfully using OpenSSL. Its attributes, validity period, and security-related details were analyzed, and certificate verification was performed.

## Security Note
Do not upload private keys (`.pem` or `.key` files) to a public GitHub repository.
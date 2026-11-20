# Experiment 08: AES Encryption and SHA-256 Hashing Using Java

## Objective
To develop an application that secures text messages using AES encryption and SHA-256 hashing in Java.

## Software Requirements
1. Operating System: Windows 10/11
2. Visual Studio Code
3. Programming Language: Java
4. Java Development Kit (JDK)

## Theory

**AES (Advanced Encryption Standard):** AES is a symmetric encryption algorithm that uses the same secret key for encryption and decryption.

**SHA-256:** SHA-256 is a cryptographic hash function that generates a 256-bit hash value. It is used to verify message integrity.

## Procedure
1. Create a Java program named `AESHash.java`.
2. Accept a text message from the user.
3. Generate a 128-bit AES secret key.
4. Encrypt the message using AES.
5. Generate the SHA-256 hash of the original message.
6. Decrypt the encrypted message using the same AES key.
7. Compare the original and decrypted messages.

## Source Code
The `Code` folder contains the Java source file:

- `AESHash.java`

## Output
The program displays:
- Encrypted Message
- SHA-256 Hash
- Decrypted Message
- Message Recovered status

## Result
AES encryption and decryption were implemented successfully using Java. SHA-256 hashing was also performed to generate the hash value of the original message. The decrypted message matched the original message successfully.
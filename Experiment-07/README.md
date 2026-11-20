# Experiment 07: Implementation of RSA and Diffie-Hellman Algorithms Using Java

## Objective
To implement RSA and Diffie-Hellman algorithms using Java to demonstrate public-key cryptography and secure key exchange.

## Software Requirements
1. Operating System: Windows 10/11
2. Visual Studio Code
3. Programming Language: Java
4. Java Development Kit (JDK)
5. VS Code Integrated Terminal

## Part A: RSA Algorithm

RSA is an asymmetric encryption algorithm that uses two different keys:
- Public Key: Used for encryption.
- Private Key: Used for decryption.

### RSA Program
File Name: `RSA.java`

### RSA Parameters
- p = 61
- q = 53
- Public exponent (e) = 17
- n = 3233
- φ(n) = 3120

### RSA Operations
1. Generate public and private keys.
2. Accept a numerical message.
3. Encrypt the message using the public key.
4. Decrypt the ciphertext using the private key.
5. Verify successful decryption.

## Part B: Diffie-Hellman Key Exchange

Diffie-Hellman is a key-exchange algorithm that allows two parties to establish a common secret key over an insecure communication channel.

### Java Program
File Name: `DiffieHellman.java`

### Parameters
- Public Prime (p) = 23
- Public Generator (g) = 5
- Alice's Private Key = 6
- Bob's Private Key = 15

### Operations
1. Calculate Alice's public key.
2. Calculate Bob's public key.
3. Calculate the shared secret independently.
4. Verify that both parties obtain the same shared secret.

## Source Code
The Code folder contains:
1. `RSA.java`
2. `DiffieHellman.java`

## Output Screenshots
The Screenshots folder contains:
1. RSA program execution output.
2. Diffie-Hellman key exchange output.

## Result
RSA encryption and decryption were implemented successfully using Java. The Diffie-Hellman algorithm successfully established the same shared secret between Alice and Bob.
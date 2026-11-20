# Experiment 09: Password Hashing With and Without Salting Using Java

## Objective
To implement password hashing with and without salting and understand how salting improves security against common password attacks.

## Software Requirements
- Windows 10/11
- Visual Studio Code
- Java Development Kit (JDK)

## Theory
Password hashing converts a password into a fixed-length hash value.

**Without Salting:** The same password always generates the same hash, making identical passwords easy to identify.

**With Salting:** A random salt is added to the password before hashing. This produces different hashes even when passwords are identical.

Salting improves resistance against rainbow-table attacks. For real-world password storage, algorithms such as Argon2, bcrypt, scrypt, or PBKDF2 are preferred over plain SHA-256.

## Procedure
1. Create a Java file named `PasswordHashing.java`.
2. Import the required Java security and utility packages.
3. Generate the SHA-256 hash without using salt.
4. Generate a random 16-byte salt using `SecureRandom`.
5. Add the salt to the password and generate its SHA-256 hash.
6. Display both hashes and compare their security properties.
7. Compile and execute the Java program.

## Source Code
File: `Code/PasswordHashing.java`

## Output
The program displays:
- Password hash without salt.
- Randomly generated salt.
- Password hash with salt.
- Security comparison between salted and unsalted hashing.

## Result
Successfully implemented password hashing with and without salting using Java. Observed that salting produces a different hash and improves resistance against rainbow-table attacks.
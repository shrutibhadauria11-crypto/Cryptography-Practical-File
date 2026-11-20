# Experiment-12: Analysis of Secure and Insecure Network Protocols

## Objective
To analyze captured network packets using Wireshark and identify secure and insecure communication protocols and their security implications.

## Software Requirements
- Wireshark
- Windows Operating System
- Internet Connection
- Web Browser

## Theory
Wireshark is a network protocol analyzer used to capture and inspect network packets.

- **HTTP:** Transfers data without encryption, so information may be visible.
- **HTTPS:** Uses TLS encryption to protect communication.
- **DNS:** Resolves domain names into IP addresses. Traditional DNS queries are generally unencrypted.

Secure protocols protect data using encryption, while insecure protocols may expose information during transmission.

## Procedure
1. Open Wireshark and select the active Wi-Fi interface.
2. Start packet capturing.
3. Open an HTTP website and apply the `http` display filter.
4. Observe the unencrypted HTTP packets.
5. Apply the `dns` filter to observe DNS packets.
6. Open an HTTPS website and apply the `tls` filter.
7. Observe TLS handshake packets.
8. Compare secure and insecure communication.
9. Stop the capture and save the captured file.

## Output
- Unencrypted HTTP Packet
- Encrypted VPN / DNS Tunnel Packet (as labelled in the practical PDF)

## Result
Successfully captured and analyzed network packets using Wireshark and identified secure and insecure communication protocols and their security differences.
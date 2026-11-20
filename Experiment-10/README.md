# Experiment 10: HTTPS Traffic Capture and TLS Handshake Analysis Using Wireshark

## Objective
To capture HTTPS network traffic using Wireshark and analyze the TLS handshake, digital certificates, and cipher suites.

## Software Requirements
- Wireshark
- Windows Operating System
- Google Chrome / Microsoft Edge
- Internet Connection

## Theory
HTTPS (Hypertext Transfer Protocol Secure) is a secure version of HTTP that uses TLS (Transport Layer Security) to protect communication between a client and a server.

TLS provides three main security features:

1. **Confidentiality:** Protects data from unauthorized access.
2. **Integrity:** Prevents unauthorized modification of data.
3. **Authentication:** Verifies the identity of the server using digital certificates.

## Procedure
1. Open Wireshark and select the active Wi-Fi or Ethernet interface.
2. Start capturing network packets.
3. Open a web browser and visit https://www.google.com.
4. Refresh the website to generate HTTPS traffic.
5. Stop packet capturing in Wireshark.
6. Apply the display filter `tls` to view TLS packets.
7. Apply the filter `tls.handshake` to identify handshake packets.
8. Select the Client Hello packet and analyze supported TLS versions and cipher suites.
9. Open the browser's certificate viewer and analyze the digital certificate.
10. Save the captured traffic as `HTTPS_TLS_Analysis.pcapng`.

## Output
- TLS Traffic Capture
- TLS Handshake – Client Hello Details

## Result
Successfully captured HTTPS network traffic using Wireshark and analyzed the TLS handshake, digital certificates, and cipher suites.
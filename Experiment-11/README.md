# Experiment 11: Capture and Analyze Encrypted VPN Traffic Using Wireshark

## Objective
To capture and analyze encrypted VPN traffic using Wireshark and compare it with unencrypted network communication.

## Software Requirements
- Wireshark
- Windows Operating System
- Internet Connection
- VPN Software

## Theory
Wireshark is a network protocol analyzer used to capture and analyze network packets.

A VPN (Virtual Private Network) creates a secure encrypted tunnel between a user's device and a VPN server.

In unencrypted communication, data can be captured and viewed in readable form. In VPN communication, data is encrypted before transmission, making the original information difficult to read.

## Procedure
1. Open Wireshark and select the active Wi-Fi interface.
2. Keep VPN OFF and start packet capturing.
3. Open http://neverssl.com in a browser.
4. Apply the filter `http` to view HTTP packets.
5. Analyze HTTP request and response details.
6. Save the capture as `Unencrypted_Traffic.pcapng`.
7. Connect to a VPN server and turn VPN ON.
8. Start capturing network traffic again.
9. Browse some websites and observe VPN tunnel packets.
10. Analyze packet details such as source IP, destination IP and protocol.
11. Save the capture as `Encrypted_VPN_Traffic.pcapng`.
12. Compare both captured traffic.

## Output
1. Wireshark Unencrypted HTTP Traffic
2. Wireshark Encrypted VPN Traffic

## Result
Successfully captured and analyzed network traffic using Wireshark. Compared unencrypted HTTP communication with encrypted VPN tunnel traffic and observed the difference in data visibility and security.
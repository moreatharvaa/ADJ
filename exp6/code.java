// Procedure

// new> java project> project_name(AJP)> finish 

// right click on AJP> new package>package_name(JAVA_PRACTICALS)> finsih

// right click on JAVA_PRACTICALS > new class > class_name(InetDemo)>finish


// run the program


// again new class > name as Inetdemo2 > finsih

// run the program

package JAVA_PRACTICALS;

import java.io.*;
import java.net.*;
public class InetDemo {
public static void main(String[] args) {
try{
InetAddress ip=InetAddress.getByName("engg.dypvp.edu.in");
System.out.println("Host Name: "+ip.getHostName());
System.out.println("IP Address:"+ip.getHostAddress());
}
catch(Exception e)
{
System.out.println(e);
}

}
}


//code 2

package JAVA_PRACTICALS;

import java.io.*;
import java.net.*;
import java.util.*;
public class InetDemo2 {
public static void main(String[] args) throws UnknownHostException
{
// To get and print InetAddress of Local Host
InetAddress address1 = InetAddress.getLocalHost();
System.out.println("InetAddress of Local Host : " + address1);
// To get and print InetAddress of Named Host
InetAddress address2 = InetAddress.getByName("45.22.30.39");
System.out.println("InetAddress of Named Host : " + address2);
// To get and print ALL InetAddresses of Named Host
InetAddress address3[] = InetAddress.getAllByName("172.19.25.29");
for (int i = 0; i < address3.length; i++) {
System.out.println( "ALL InetAddresses of Named Host : " + address3[i]);
}
// To get and print InetAddresses of
// Host with specified IP Address
byte IPAddress[] = { 125, 0, 0, 1 };
InetAddress address4 = InetAddress.getByAddress(IPAddress);
System.out.println("InetAddresses of Host with specified IP Address : " + address4);
// To get and print InetAddresses of Host
// with specified IP Address and hostname

byte[] IPAddress2 = { 105, 22, (byte)223, (byte)186 };
InetAddress address5 = InetAddress.getByAddress( "engg.dypvp.edu.in", IPAddress2);
System.out.println("InetAddresses of Host with specified IP Address and hostname : " + address5);
}
}

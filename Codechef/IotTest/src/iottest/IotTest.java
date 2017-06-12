/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package iottest;
import java.util.*;
import java.io.*;
import java.util.logging.*;
class Iot {
    public Boolean runsOnBattery() {
        try {
            Process proc = Runtime.getRuntime().exec("cmd.exe /c battstat.bat");

            BufferedReader stdInput = new BufferedReader(
                new InputStreamReader(proc.getInputStream()));

            String s;
            while ((s = stdInput.readLine()) != null) {
                if (s.contains("mains power")) {
                    System.out.println(s);
                    return false;
                } else if (s.contains("Discharging")) {
                    return true;
                }
            }
        } catch (IOException ex) {
            System.out.println("exception");
        }

        return false;
    }
}

class IotTest {
    public static void main(String[] args) {
        Iot iot = new Iot();
        System.out.println(iot.runsOnBattery());
    }
}
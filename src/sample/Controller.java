package sample;

import Data.Connect;

import java.sql.Connection;

public class Controller {
    public static void main(String[] args) {
        Connection connect = Connect.setConnection();

        if (connect != null) {
            System.out.println("Ket noi thanh cong");

        } else {
            System.out.println("Ket noi that bai");
        }

    }
}

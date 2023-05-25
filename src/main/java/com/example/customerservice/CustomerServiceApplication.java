package com.example.customerservice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
// put this in your mysql workbench and run it before you run the application!
/*--------------------------------------------------------------------
create database customer_service_db ;
CREATE USER 'backend1'@'localhost' identified with mysql_native_password BY '****';
GRANT ALL ON *.* TO 'backend1'@'localhost' with grant option;
---------------------------------------------------------------------*/

@SpringBootApplication
public class CustomerServiceApplication {

    public static void main(String[] args) {
        SpringApplication.run(CustomerServiceApplication.class, args);
    }

}

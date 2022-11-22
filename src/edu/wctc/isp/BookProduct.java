package edu.wctc.isp;

import java.time.Duration;
import java.time.LocalDate;

public interface BookProduct extends Product {

    String getAuthor();

    String getISBN();

    int getPages();


}

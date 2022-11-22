package edu.wctc.isp;

import java.time.Duration;
import java.time.LocalDate;

public interface MusicProduct extends Product {

    String getArtist();

    Duration getPlayingTime();

}

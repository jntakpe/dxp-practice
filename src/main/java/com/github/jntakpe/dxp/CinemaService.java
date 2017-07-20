package com.github.jntakpe.dxp;

import java.util.List;
import java.util.Map;

/**
 * Service handling {@link Cinema}
 *
 * @author jntakpe
 */
public interface CinemaService {

    /**
     * Read the cinema.csv file (src/main/resources/cinemas.csv). CSV line format is : region;city;number;name;address;...;city;zipCode.
     *
     * @return list of cinemas
     */
    List<Cinema> readCinemaFile();

    /**
     * Find cinemas names by region
     *
     * @param region region
     * @return names of the cinemas
     */
    List<String> findByRegion(String region);

    /**
     * Group cinemas by region and count the number of the cinema within a region
     *
     * @return a map with region as keys and the number of cinemas in that region as value
     */
    Map<String, Long> countCinemaByRegion();


    /**
     * Name of the region containing the most cinemas
     *
     * @return region name
     */
    String findMaxCinemaRegionName();

}

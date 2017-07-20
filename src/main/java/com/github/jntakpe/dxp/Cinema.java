package com.github.jntakpe.dxp;

import org.apache.commons.lang3.builder.ToStringBuilder;

import java.util.Objects;

/**
 * @author jntakpe
 */
public class Cinema {

    private String name;

    private String city;

    private String region;

    public Cinema(String name, String city, String region) {
        this.name = name;
        this.city = city;
        this.region = region;
    }


    public String getName() {
        return name;
    }

    public Cinema setName(String name) {
        this.name = name;
        return this;
    }

    public String getCity() {
        return city;
    }

    public Cinema setCity(String city) {
        this.city = city;
        return this;
    }

    public String getRegion() {
        return region;
    }

    public Cinema setRegion(String region) {
        this.region = region;
        return this;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof Cinema)) {
            return false;
        }
        Cinema cinema = (Cinema) o;
        return Objects.equals(name, cinema.name) &&
                Objects.equals(city, cinema.city);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, city);
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this)
                .append("name", name)
                .append("city", city)
                .append("region", region)
                .toString();
    }
}

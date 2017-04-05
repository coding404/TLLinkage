package com.liushu.example.tllinkage;

import java.util.List;

/**
 * Created by liushu on 2017/4/5.
 */

public class Addressbean {
    /**
     * locations : [{"city":"北京市","country":"","district":"东城区","location_id":10001,"location_name":"北京市东城区","postcode":"100000","provence":"北京市"}]
     * message : 成功
     * pageNum : 0
     * size : 3181
     * status : 0
     * total : 3181
     */

    private String message;
    private int pageNum;
    private int size;
    private int status;
    private int total;
    /**
     * city : 北京市
     * country :
     * district : 东城区
     * location_id : 10001
     * location_name : 北京市东城区
     * postcode : 100000
     * provence : 北京市
     */

    private List<LocationsBean> locations;

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public int getPageNum() {
        return pageNum;
    }

    public void setPageNum(int pageNum) {
        this.pageNum = pageNum;
    }

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }

    public int getStatus() {
        return status;
    }

    public void setStatus(int status) {
        this.status = status;
    }

    public int getTotal() {
        return total;
    }

    public void setTotal(int total) {
        this.total = total;
    }

    public List<LocationsBean> getLocations() {
        return locations;
    }

    public void setLocations(List<LocationsBean> locations) {
        this.locations = locations;
    }

    public static class LocationsBean {
        private String city;
        private String country;
        private String district;
        private int location_id;
        private String location_name;
        private String postcode;
        private String provence;

        public String getCity() {
            return city;
        }

        public void setCity(String city) {
            this.city = city;
        }

        public String getCountry() {
            return country;
        }

        public void setCountry(String country) {
            this.country = country;
        }

        public String getDistrict() {
            return district;
        }

        public void setDistrict(String district) {
            this.district = district;
        }

        public int getLocation_id() {
            return location_id;
        }

        public void setLocation_id(int location_id) {
            this.location_id = location_id;
        }

        public String getLocation_name() {
            return location_name;
        }

        public void setLocation_name(String location_name) {
            this.location_name = location_name;
        }

        public String getPostcode() {
            return postcode;
        }

        public void setPostcode(String postcode) {
            this.postcode = postcode;
        }

        public String getProvence() {
            return provence;
        }

        public void setProvence(String provence) {
            this.provence = provence;
        }
    }
}

package com.liushu.example.tllinkage;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by skywood on 2016/1/29.
 */
public class Route {
    private int status;
    public String message;
     private List<routes> routes=new ArrayList<routes>();
    public class routes {

        private int route_id;

        private int fromLocation_id;
        private String fromLocation_name = "";

        private String fromPostcode = "";
        private String fromDistrict = "";
        private String fromCity = "";
        private String fromProvence = "";
        private String fromCountry = "";

        private int toLocation_id;
        private String toLocation_name = "";

        private String toPostcode = "";
        private String toDistrict = "";
        private String toCity = "";
        private String toProvence = "";
        private String toCountry = "";

        public int getRoute_id() {
            return route_id;
        }

        public void setRoute_id(int route_id) {
            this.route_id = route_id;
        }

        public int getFromLocation_id() {
            return fromLocation_id;
        }

        public void setFromLocation_id(int fromLocation_id) {
            this.fromLocation_id = fromLocation_id;
        }


        public String getFromLocation_name() {
            return fromLocation_name;
        }

        public void setFromLocation_name(String fromLocation_name) {
            this.fromLocation_name = fromLocation_name;
        }

        public String getFromPostcode() {
            return fromPostcode;
        }

        public void setFromPostcode(String fromPostcode) {
            this.fromPostcode = fromPostcode;
        }

        public String getFromDistrict() {
            return fromDistrict;
        }

        public void setFromDistrict(String fromDistrict) {
            this.fromDistrict = fromDistrict;
        }

        public String getFromCity() {
            return fromCity;
        }

        public void setFromCity(String fromCity) {
            this.fromCity = fromCity;
        }

        public String getFromProvence() {
            return fromProvence;
        }

        public void setFromProvence(String fromProvence) {
            this.fromProvence = fromProvence;
        }

        public String getFromCountry() {
            return fromCountry;
        }

        public void setFromCountry(String fromCountry) {
            this.fromCountry = fromCountry;
        }

        public int getToLocation_id() {
            return toLocation_id;
        }

        public void setToLocation_id(int toLocation_id) {
            this.toLocation_id = toLocation_id;
        }

        public String getToLocation_name() {
            return toLocation_name;
        }

        public void setToLocation_name(String toLocation_name) {
            this.toLocation_name = toLocation_name;
        }

        public String getToPostcode() {
            return toPostcode;
        }

        public void setToPostcode(String toPostcode) {
            this.toPostcode = toPostcode;
        }

        public String getToDistrict() {
            return toDistrict;
        }

        public void setToDistrict(String toDistrict) {
            this.toDistrict = toDistrict;
        }

        public String getToCity() {
            return toCity;
        }

        public void setToCity(String toCity) {
            this.toCity = toCity;
        }

        public String getToProvence() {
            return toProvence;
        }

        public void setToProvence(String toProvence) {
            this.toProvence = toProvence;
        }

        public String getToCountry() {
            return toCountry;
        }

        public void setToCountry(String toCountry) {
            this.toCountry = toCountry;
        }
    }

    public int getStatus() {
        return status;
    }

    public void setStatus(int status) {
        this.status = status;
    }

    public List<Route.routes> getRoutes() {
        return routes;
    }

    public void setRoutes(List<Route.routes> routes) {
        this.routes = routes;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }
}

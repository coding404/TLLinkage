package com.liushu.example.tllinkage;

import java.util.List;

/**
 * Created by liushu on 2017/4/5.
 */

public class TransAddressBean {


    /**
     * status : 0
     * size : 3181
     * total : 3181
     * locations : [{"provence_name":"","provence":[{"city_name":"","city":[{"district_name":"","district":[{"location_id":10001,"location_name":"北京市东城区","postcode":"100000","district":"东城区"}]}]}]}]
     */

    private int status;
    private int size;
    private int total;
    private List<LocationsBean> locations;

    public int getStatus() {
        return status;
    }

    public void setStatus(int status) {
        this.status = status;
    }

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
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
        /**
         * provence_name :
         * provence : [{"city_name":"","city":[{"district_name":"","district":[{"location_id":10001,"location_name":"北京市东城区","postcode":"100000","district":"东城区"}]}]}]
         */

        private String provence_name;
        private List<ProvenceBean> provence;

        public String getProvence_name() {
            return provence_name;
        }

        public void setProvence_name(String provence_name) {
            this.provence_name = provence_name;
        }

        public List<ProvenceBean> getProvence() {
            return provence;
        }

        public void setProvence(List<ProvenceBean> provence) {
            this.provence = provence;
        }

        public static class ProvenceBean {
            /**
             * city_name :
             * city : [{"district_name":"","district":[{"location_id":10001,"location_name":"北京市东城区","postcode":"100000","district":"东城区"}]}]
             */

            private String city_name;
            private List<CityBean> city;

            public String getCity_name() {
                return city_name;
            }

            public void setCity_name(String city_name) {
                this.city_name = city_name;
            }

            public List<CityBean> getCity() {
                return city;
            }

            public void setCity(List<CityBean> city) {
                this.city = city;
            }

            public static class CityBean {
                /**
                 * district_name :
                 * district : [{"location_id":10001,"location_name":"北京市东城区","postcode":"100000","district":"东城区"}]
                 */

                private String district_name;
                private List<DistrictBean> district;

                public String getDistrict_name() {
                    return district_name;
                }

                public void setDistrict_name(String district_name) {
                    this.district_name = district_name;
                }

                public List<DistrictBean> getDistrict() {
                    return district;
                }

                public void setDistrict(List<DistrictBean> district) {
                    this.district = district;
                }

                public static class DistrictBean {
                    /**
                     * location_id : 10001
                     * location_name : 北京市东城区
                     * postcode : 100000
                     * district : 东城区
                     */

                    private int location_id;
                    private String location_name;
                    private String postcode;
                    private String district;

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

                    public String getDistrict() {
                        return district;
                    }

                    public void setDistrict(String district) {
                        this.district = district;
                    }
                }
            }
        }
    }
}

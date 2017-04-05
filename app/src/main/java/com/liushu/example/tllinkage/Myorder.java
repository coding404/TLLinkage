package com.liushu.example.tllinkage;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by dell on 2016/3/25.
 */
public class Myorder implements Serializable {
    private int status;
    private int size;
    private int total;
    private String message;//成功",
    private int  pageNum;// 0
    List<orders> orders=new ArrayList<orders>();
    public class  orders implements Serializable {
        // 开始省市区（县）
        private String from_location_id;
        private String to_location_id;

        public void setFrom_location_id(String from_location_id) {
            this.from_location_id = from_location_id;
        }

        public void setTo_location_id(String to_location_id) {
            this.to_location_id = to_location_id;
        }

        public String getFrom_location_id() {

            return from_location_id;
        }

        public String getTo_location_id() {
            return to_location_id;
        }

        private String fromProvence = "";
        private String fromCity = "";
        private String fromDistrict = "";
        // 到达省市区（县）
        private String toProvence = "";
        private String toCity = "";
        private String toDistrict = "";
        private int  order_id   ; //203,
        private int shipper_id  ; //3,
        private String shipperNameCn  ; //  测试货主1  ,
        private String shipperNameEn  ;//   OwnerTest1  ,
        private int resource_id  ;// 100,
        private String resource  ; //  矿石  ,
        private String route_id  ; //13,
        private String fromLocation  ; //  北京市丰台区  ,
        private String fromAddress  ; //  123  ,
        private String toLocation  ; //  江苏省镇江市润州区  ,
        private String toAddress  ;//   123  ,
        private String qty  ; //  50.00  ,
        private String receiptQty  ;//     ,
        private String unit_id  ;// 1,
        private String unit  ;//   吨  ,
        private String orderPrice  ; //    ,
        private int orderCurrency_id  ;// 0,
        private int  price_id  ;// 0,
        private String price  ; //    ,
        private String currency  ;//     ,
        private int orderStatus_id  ;// 5,
        private String orderStatus  ;//   承运力确定  ,
        private String earliestPickupTime; //  2016-03-28 00;00;00  ,//取货时间
        private String latestPickupTime; //  2016-03-28 00;00;00  ,//取货时间
        private String deliveryTime  ; //  2016-03-29 00;00;00  ,//交货时间
        private String registrationTime  ;//  2016-03-28 17;14;26 ,//运达时间
        private String bidCloseTime ;//  2016-03-28 17;44;26 ,//截止时间
        private String remark ;//  test ,
        private String statusUpdateTime ;//  2016-03-28 17;14;26 ,//状态更新时间
        private String receiverName ; // test ,   //
        private String receiverPhone ;//  15221153237 ,
        private int bid_id ;// 0,
        private int  user_id ; //0,
        private String userName ; //  ,
        private String maxQty ; //  ,
        private String bidQty ; //  ,
        private String minQty ; //  ,
        private String bidPrice ; //  ,
        private String bidCurrency ; //  ,
        private int bidStatus_id ;// 0,
        private String bidStatus ; //  ,
        private String bidTime ; //
        private String transportType;
        private String earliestDeliveryTime;
        private String orderRate;
        private String bidRate;
        private String senderName;
        private String senderPhone;
        private String rest_qty;
        private String orderNo;
        private String takeOrderStatus;

        public String getTakeOrderStatus() {
            return takeOrderStatus;
        }

        public void setTakeOrderStatus(String takeOrderStatus) {
            this.takeOrderStatus = takeOrderStatus;
        }

        @Override
        public String toString() {
            return "orders{" +
                    "from_location_id='" + from_location_id + '\'' +
                    ", to_location_id='" + to_location_id + '\'' +
                    ", fromProvence='" + fromProvence + '\'' +
                    ", fromCity='" + fromCity + '\'' +
                    ", fromDistrict='" + fromDistrict + '\'' +
                    ", toProvence='" + toProvence + '\'' +
                    ", toCity='" + toCity + '\'' +
                    ", toDistrict='" + toDistrict + '\'' +
                    ", order_id=" + order_id +
                    ", shipper_id=" + shipper_id +
                    ", shipperNameCn='" + shipperNameCn + '\'' +
                    ", shipperNameEn='" + shipperNameEn + '\'' +
                    ", resource_id=" + resource_id +
                    ", resource='" + resource + '\'' +
                    ", route_id='" + route_id + '\'' +
                    ", fromLocation='" + fromLocation + '\'' +
                    ", fromAddress='" + fromAddress + '\'' +
                    ", toLocation='" + toLocation + '\'' +
                    ", toAddress='" + toAddress + '\'' +
                    ", qty='" + qty + '\'' +
                    ", receiptQty='" + receiptQty + '\'' +
                    ", unit_id='" + unit_id + '\'' +
                    ", unit='" + unit + '\'' +
                    ", orderPrice='" + orderPrice + '\'' +
                    ", orderCurrency_id=" + orderCurrency_id +
                    ", price_id=" + price_id +
                    ", price='" + price + '\'' +
                    ", currency='" + currency + '\'' +
                    ", orderStatus_id=" + orderStatus_id +
                    ", orderStatus='" + orderStatus + '\'' +
                    ", earliestPickupTime='" + earliestPickupTime + '\'' +
                    ", latestPickupTime='" + latestPickupTime + '\'' +
                    ", deliveryTime='" + deliveryTime + '\'' +
                    ", registrationTime='" + registrationTime + '\'' +
                    ", bidCloseTime='" + bidCloseTime + '\'' +
                    ", remark='" + remark + '\'' +
                    ", statusUpdateTime='" + statusUpdateTime + '\'' +
                    ", receiverName='" + receiverName + '\'' +
                    ", receiverPhone='" + receiverPhone + '\'' +
                    ", bid_id=" + bid_id +
                    ", user_id=" + user_id +
                    ", userName='" + userName + '\'' +
                    ", maxQty='" + maxQty + '\'' +
                    ", bidQty='" + bidQty + '\'' +
                    ", minQty='" + minQty + '\'' +
                    ", bidPrice='" + bidPrice + '\'' +
                    ", bidCurrency='" + bidCurrency + '\'' +
                    ", bidStatus_id=" + bidStatus_id +
                    ", bidStatus='" + bidStatus + '\'' +
                    ", bidTime='" + bidTime + '\'' +
                    ", transportType='" + transportType + '\'' +
                    ", earliestDeliveryTime='" + earliestDeliveryTime + '\'' +
                    ", orderRate='" + orderRate + '\'' +
                    ", bidRate='" + bidRate + '\'' +
                    ", senderName='" + senderName + '\'' +
                    ", senderPhone='" + senderPhone + '\'' +
                    ", rest_qty='" + rest_qty + '\'' +
                    ", orderNo='" + orderNo + '\'' +
                    ", takeOrderStatus='" + takeOrderStatus + '\'' +
                    ", orderStatustime='" + orderStatustime + '\'' +
                    ", resourceId='" + resourceId + '\'' +
                    '}';
        }

        public String getOrderNo() {
            return orderNo;
        }

        public void setOrderNo(String orderNo) {
            this.orderNo = orderNo;
        }

        public String getRest_qty() {
            return rest_qty;
        }

        public void setRest_qty(String rest_qty) {
            this.rest_qty = rest_qty;
        }

        private String orderStatustime;

        public void setResourceId(String resourceId) {
            this.resourceId = resourceId;
        }

        public String getResourceId() {

            return resourceId;
        }

        private String resourceId;


        public void setOrderStatustime(String orderStatustime) {
            this.orderStatustime = orderStatustime;
        }

        public String getOrderStatustime() {
            return orderStatustime;
        }

        public void setSenderName(String senderName) {
            this.senderName = senderName;
        }

        public void setSenderPhone(String senderPhone) {
            this.senderPhone = senderPhone;
        }

        public String getSenderName() {

            return senderName;
        }

        public String getSenderPhone() {
            return senderPhone;
        }

        public void setEarliestDeliveryTime(String earliestDeliveryTime) {
            this.earliestDeliveryTime = earliestDeliveryTime;
        }
        public String getEarliestDeliveryTime() {
            return earliestDeliveryTime;
        }
        public orders(String earlierDeliveryTime) {
            this.earliestDeliveryTime = earlierDeliveryTime;
        }
        public String getOrderRate() {
            return orderRate;
        }

        public void setOrderRate(String orderRate) {
            this.orderRate = orderRate;
        }

        public String getBidRate() {
            return bidRate;
        }

        public void setBidRate(String bidRate) {
            this.bidRate = bidRate;
        }

        public String getTransportType() {
            return transportType;
        }

        public void setTransportType(String transportType) {
            this.transportType = transportType;
        }



        public String getFromProvence() {
            return fromProvence;
        }

        public void setFromProvence(String fromProvence) {
            this.fromProvence = fromProvence;
        }

        public String getFromCity() {
            return fromCity;
        }

        public void setFromCity(String fromCity) {
            this.fromCity = fromCity;
        }

        public String getFromDistrict() {
            return fromDistrict;
        }

        public void setFromDistrict(String fromDistrict) {
            this.fromDistrict = fromDistrict;
        }

        public String getToProvence() {
            return toProvence;
        }

        public void setToProvence(String toProvence) {
            this.toProvence = toProvence;
        }

        public String getToCity() {
            return toCity;
        }

        public void setToCity(String toCity) {
            this.toCity = toCity;
        }

        public String getToDistrict() {
            return toDistrict;
        }

        public void setToDistrict(String toDistrict) {
            this.toDistrict = toDistrict;
        }

        public int getOrder_id() {
            return order_id;
        }

        public void setOrder_id(int order_id) {
            this.order_id = order_id;
        }

        public int getShipper_id() {
            return shipper_id;
        }

        public void setShipper_id(int shipper_id) {
            this.shipper_id = shipper_id;
        }

        public String getShipperNameCn() {
            return shipperNameCn;
        }

        public void setShipperNameCn(String shipperNameCn) {
            this.shipperNameCn = shipperNameCn;
        }

        public String getShipperNameEn() {
            return shipperNameEn;
        }

        public void setShipperNameEn(String shipperNameEn) {
            this.shipperNameEn = shipperNameEn;
        }

        public int getResource_id() {
            return resource_id;
        }

        public void setResource_id(int resource_id) {
            this.resource_id = resource_id;
        }

        public String getResource() {
            return resource;
        }

        public void setResource(String resource) {
            this.resource = resource;
        }

        public String getRoute_id() {
            return route_id;
        }

        public void setRoute_id(String route_id) {
            this.route_id = route_id;
        }

        public String getFromLocation() {
            return fromLocation;
        }

        public void setFromLocation(String fromLocation) {
            this.fromLocation = fromLocation;
        }

        public String getFromAddress() {
            return fromAddress;
        }

        public void setFromAddress(String fromAddress) {
            this.fromAddress = fromAddress;
        }

        public String getToLocation() {
            return toLocation;
        }

        public void setToLocation(String toLocation) {
            this.toLocation = toLocation;
        }

        public String getToAddress() {
            return toAddress;
        }

        public void setToAddress(String toAddress) {
            this.toAddress = toAddress;
        }

        public String getQty() {
            return qty;
        }

        public void setQty(String qty) {
            this.qty = qty;
        }

        public String getReceiptQty() {
            return receiptQty;
        }

        public void setReceiptQty(String receiptQty) {
            this.receiptQty = receiptQty;
        }

        public String getUnit_id() {
            return unit_id;
        }

        public void setUnit_id(String unit_id) {
            this.unit_id = unit_id;
        }

        public String getUnit() {
            return unit;
        }

        public void setUnit(String unit) {
            this.unit = unit;
        }

        public String getOrderPrice() {
            return orderPrice;
        }

        public void setOrderPrice(String orderPrice) {
            this.orderPrice = orderPrice;
        }

        public int getOrderCurrency_id() {
            return orderCurrency_id;
        }

        public void setOrderCurrency_id(int orderCurrency_id) {
            this.orderCurrency_id = orderCurrency_id;
        }

        public int getPrice_id() {
            return price_id;
        }

        public void setPrice_id(int price_id) {
            this.price_id = price_id;
        }

        public String getPrice() {
            return price;
        }

        public void setPrice(String price) {
            this.price = price;
        }

        public String getCurrency() {
            return currency;
        }

        public void setCurrency(String currency) {
            this.currency = currency;
        }

        public int getOrderStatus_id() {
            return orderStatus_id;
        }

        public void setOrderStatus_id(int orderStatus_id) {
            this.orderStatus_id = orderStatus_id;
        }

        public String getOrderStatus() {
            return orderStatus;
        }

        public void setOrderStatus(String orderStatus) {
            this.orderStatus = orderStatus;
        }


        public String getEarliestPickupTime() {
            return earliestPickupTime;
        }

        public void setEarliestPickupTime(String earliestPickupTime) {
            this.earliestPickupTime = earliestPickupTime;
        }

        public String getLatestPickupTime() {
            return latestPickupTime;
        }

        public void setLatestPickupTime(String latestPickupTime) {
            this.latestPickupTime = latestPickupTime;
        }

        public String getDeliveryTime() {
            return deliveryTime;
        }

        public void setDeliveryTime(String deliveryTime) {
            this.deliveryTime = deliveryTime;
        }

        public String getRegistrationTime() {
            return registrationTime;
        }

        public void setRegistrationTime(String registrationTime) {
            this.registrationTime = registrationTime;
        }

        public String getBidCloseTime() {
            return bidCloseTime;
        }

        public void setBidCloseTime(String bidCloseTime) {
            this.bidCloseTime = bidCloseTime;
        }

        public String getRemark() {
            return remark;
        }

        public void setRemark(String remark) {
            this.remark = remark;
        }

        public String getStatusUpdateTime() {
            return statusUpdateTime;
        }

        public void setStatusUpdateTime(String statusUpdateTime) {
            this.statusUpdateTime = statusUpdateTime;
        }

        public String getReceiverName() {
            return receiverName;
        }

        public void setReceiverName(String receiverName) {
            this.receiverName = receiverName;
        }

        public String getReceiverPhone() {
            return receiverPhone;
        }

        public void setReceiverPhone(String receiverPhone) {
            this.receiverPhone = receiverPhone;
        }

        public int getBid_id() {
            return bid_id;
        }

        public void setBid_id(int bid_id) {
            this.bid_id = bid_id;
        }

        public int getUser_id() {
            return user_id;
        }

        public void setUser_id(int user_id) {
            this.user_id = user_id;
        }

        public String getUserName() {
            return userName;
        }

        public void setUserName(String userName) {
            this.userName = userName;
        }

        public String getMaxQty() {
            return maxQty;
        }

        public void setMaxQty(String maxQty) {
            this.maxQty = maxQty;
        }

        public String getBidQty() {
            return bidQty;
        }

        public void setBidQty(String bidQty) {
            this.bidQty = bidQty;
        }

        public String getMinQty() {
            return minQty;
        }

        public void setMinQty(String minQty) {
            this.minQty = minQty;
        }

        public String getBidPrice() {
            return bidPrice;
        }

        public void setBidPrice(String bidPrice) {
            this.bidPrice = bidPrice;
        }

        public String getBidCurrency() {
            return bidCurrency;
        }

        public void setBidCurrency(String bidCurrency) {
            this.bidCurrency = bidCurrency;
        }

        public int getBidStatus_id() {
            return bidStatus_id;
        }

        public void setBidStatus_id(int bidStatus_id) {
            this.bidStatus_id = bidStatus_id;
        }

        public String getBidStatus() {
            return bidStatus;
        }

        public void setBidStatus(String bidStatus) {
            this.bidStatus = bidStatus;
        }

        public String getBidTime() {
            return bidTime;
        }

        public void setBidTime(String bidTime) {
            this.bidTime = bidTime;
        }
    }

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

    public List<Myorder.orders> getOrders() {
        return orders;
    }

    public void setOrders(List<Myorder.orders> orders) {
        this.orders = orders;
    }

    @Override
    public String toString() {
        return "MyOrder{" +
                "status=" + status +
                ", size=" + size +
                ", total=" + total +
                ", message='" + message + '\'' +
                ", pageNum=" + pageNum +
                ", orders=" + orders +
                '}';
    }
}

package com.bbld.warehouse.bean;

import java.util.List;

/**
 * Created by likey on 2017/5/23.
 */

public class OrderDetails {
    /**"status": 0,
     "mes": "成功",
     "Info": {}*/
    private int status;
    private String mes;
    private OrderDetailsInfo Info;

    public int getStatus() {
        return status;
    }

    public void setStatus(int status) {
        this.status = status;
    }

    public String getMes() {
        return mes;
    }

    public void setMes(String mes) {
        this.mes = mes;
    }

    public OrderDetailsInfo getInfo() {
        return Info;
    }

    public void setInfo(OrderDetailsInfo info) {
        Info = info;
    }
    public static class OrderDetailsInfo{
        /**"OrderID": "3",
         "OrderNumber": "JXSd834e3384",
         "InvoiceCode": "FHD_6e34d0a8b",
         "ChannelName": "渠道 1",
         "DealerName": "经销商 1",
         "Date": "2017-05-17",
         "DateTime": "2017-05-17 17:18:32",
         "ProductCount": "20",
         "Remark": "发货单录入测试",
         "DeliveryName": "收货人名 2",
         "DeliveryPhone": "联系电话 2",
         "DeliveryAddress": "详细地址 2",
         "Status": "已出库",
         "ProductList": []*/
        private String OrderID;
         private String OrderNumber;
         private String InvoiceCode;
         private String ChannelName;
         private String DealerName;
         private String Date;
         private String DateTime;
         private String ProductCount;
         private String Remark;
         private String DeliveryName;
         private String DeliveryPhone;
         private String DeliveryAddress;
         private String Status;
         private List<OrderDetailsProductList> ProductList;

        public String getOrderID() {
            return OrderID;
        }

        public void setOrderID(String orderID) {
            OrderID = orderID;
        }

        public String getOrderNumber() {
            return OrderNumber;
        }

        public void setOrderNumber(String orderNumber) {
            OrderNumber = orderNumber;
        }

        public String getInvoiceCode() {
            return InvoiceCode;
        }

        public void setInvoiceCode(String invoiceCode) {
            InvoiceCode = invoiceCode;
        }

        public String getChannelName() {
            return ChannelName;
        }

        public void setChannelName(String channelName) {
            ChannelName = channelName;
        }

        public String getDealerName() {
            return DealerName;
        }

        public void setDealerName(String dealerName) {
            DealerName = dealerName;
        }

        public String getDate() {
            return Date;
        }

        public void setDate(String date) {
            Date = date;
        }

        public String getDateTime() {
            return DateTime;
        }

        public void setDateTime(String dateTime) {
            DateTime = dateTime;
        }

        public String getProductCount() {
            return ProductCount;
        }

        public void setProductCount(String productCount) {
            ProductCount = productCount;
        }

        public String getRemark() {
            return Remark;
        }

        public void setRemark(String remark) {
            Remark = remark;
        }

        public String getDeliveryName() {
            return DeliveryName;
        }

        public void setDeliveryName(String deliveryName) {
            DeliveryName = deliveryName;
        }

        public String getDeliveryPhone() {
            return DeliveryPhone;
        }

        public void setDeliveryPhone(String deliveryPhone) {
            DeliveryPhone = deliveryPhone;
        }

        public String getDeliveryAddress() {
            return DeliveryAddress;
        }

        public void setDeliveryAddress(String deliveryAddress) {
            DeliveryAddress = deliveryAddress;
        }

        public String getStatus() {
            return Status;
        }

        public void setStatus(String status) {
            Status = status;
        }

        public List<OrderDetailsProductList> getProductList() {
            return ProductList;
        }

        public void setProductList(List<OrderDetailsProductList> productList) {
            ProductList = productList;
        }

        public static class OrderDetailsProductList{

        }
    }

}
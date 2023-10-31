package com.javatpoint.server.main.model;

import javax.persistence.Entity;
import javax.persistence.Id;
@Entity

public class Can {
	
		@Id
		private int can_id;
		
		private String can_order_no;

		private String can_date;

		private String can_type;

		private String mawb_no;

		private String shipment_order_no;

		private String house_no;	

		private String house_date;

		private String commodity;

		private int actual_qty;

		private int arrived_qty;

		private int actual_chwt;

		private int arrived_chwt;

		private int actual_grwt;

		private int arrived_grwt;

		private int volume;

		private String inco_terms;

		private String uom;

		private String pol;

		private String pod;

		private String bro;

		private String shipper;

		private String shipper_address_type;

		private String shipper_city;

		private String shipper_state;

		private String shipper_country;

		private String shipper_street;

		private String shipper_pin;

		private String consignee;

		private String consignee_address_type;

		private String consignee_city;

		private String consignee_state;

		private String consignee_country;

		private String consignee_street;

		private String consignee_pin;

		private String notify;

		private String notify_address_type;

		private String notify_city;

		private String notify_state;

		private String notify_country;

		private String notify_street;

		private String notify_pin;

		private String bill_to_party_addr_same_flag;

		private String cons_notify_addr_flag;

		private String bill_to_party;

		private String bill_to_party_address_type;

		private String bill_to_party_city;

		private String bill_to_party_state;

		private String bill_to_party_country;

		private String bill_to_party_street;

		private String bill_to_party_pin;

		private String can_status;

		private String do_status;

		private String created_by;

		private String created_date;

		private String modified_by;

	    private String modified_date;

		public int getCan_id() {
			return can_id;
		}

		public void setCan_id(int can_id) {
			this.can_id = can_id;
		}

		public String getCan_order_no() {
			return can_order_no;
		}

		public void setCan_order_no(String can_order_no) {
			this.can_order_no = can_order_no;
		}

		public String getCan_date() {
			return can_date;
		}

		public void setCan_date(String can_date) {
			this.can_date = can_date;
		}

		public String getCan_type() {
			return can_type;
		}

		public void setCan_type(String can_type) {
			this.can_type = can_type;
		}

		public String getMawb_no() {
			return mawb_no;
		}

		public void setMawb_no(String mawb_no) {
			this.mawb_no = mawb_no;
		}

		public String getShipment_order_no() {
			return shipment_order_no;
		}

		public void setShipment_order_no(String shipment_order_no) {
			this.shipment_order_no = shipment_order_no;
		}

		public String getHouse_no() {
			return house_no;
		}

		public void setHouse_no(String house_no) {
			this.house_no = house_no;
		}

		public String getHouse_date() {
			return house_date;
		}

		public void setHouse_date(String house_date) {
			this.house_date = house_date;
		}

		public String getCommodity() {
			return commodity;
		}

		public void setCommodity(String commodity) {
			this.commodity = commodity;
		}

		public int getActual_qty() {
			return actual_qty;
		}

		public void setActual_qty(int actual_qty) {
			this.actual_qty = actual_qty;
		}

		public int getArrived_qty() {
			return arrived_qty;
		}

		public void setArrived_qty(int arrived_qty) {
			this.arrived_qty = arrived_qty;
		}

		public int getActual_chwt() {
			return actual_chwt;
		}

		public void setActual_chwt(int actual_chwt) {
			this.actual_chwt = actual_chwt;
		}

		public int getArrived_chwt() {
			return arrived_chwt;
		}

		public void setArrived_chwt(int arrived_chwt) {
			this.arrived_chwt = arrived_chwt;
		}

		public int getActual_grwt() {
			return actual_grwt;
		}

		public void setActual_grwt(int actual_grwt) {
			this.actual_grwt = actual_grwt;
		}

		public int getArrived_grwt() {
			return arrived_grwt;
		}

		public void setArrived_grwt(int arrived_grwt) {
			this.arrived_grwt = arrived_grwt;
		}

		public int getVolume() {
			return volume;
		}

		public void setVolume(int volume) {
			this.volume = volume;
		}

		public String getInco_terms() {
			return inco_terms;
		}

		public void setInco_terms(String inco_terms) {
			this.inco_terms = inco_terms;
		}

		public String getUom() {
			return uom;
		}

		public void setUom(String uom) {
			this.uom = uom;
		}

		public String getPol() {
			return pol;
		}

		public void setPol(String pol) {
			this.pol = pol;
		}

		public String getPod() {
			return pod;
		}

		public void setPod(String pod) {
			this.pod = pod;
		}

		public String getBro() {
			return bro;
		}

		public void setBro(String bro) {
			this.bro = bro;
		}

		public String getShipper() {
			return shipper;
		}

		public void setShipper(String shipper) {
			this.shipper = shipper;
		}

		public String getShipper_address_type() {
			return shipper_address_type;
		}

		public void setShipper_address_type(String shipper_address_type) {
			this.shipper_address_type = shipper_address_type;
		}

		public String getShipper_city() {
			return shipper_city;
		}

		public void setShipper_city(String shipper_city) {
			this.shipper_city = shipper_city;
		}

		public String getShipper_state() {
			return shipper_state;
		}

		public void setShipper_state(String shipper_state) {
			this.shipper_state = shipper_state;
		}

		public String getShipper_country() {
			return shipper_country;
		}

		public void setShipper_country(String shipper_country) {
			this.shipper_country = shipper_country;
		}

		public String getShipper_street() {
			return shipper_street;
		}

		public void setShipper_street(String shipper_street) {
			this.shipper_street = shipper_street;
		}

		public String getShipper_pin() {
			return shipper_pin;
		}

		public void setShipper_pin(String shipper_pin) {
			this.shipper_pin = shipper_pin;
		}

		public String getConsignee() {
			return consignee;
		}

		public void setConsignee(String consignee) {
			this.consignee = consignee;
		}

		public String getConsignee_address_type() {
			return consignee_address_type;
		}

		public void setConsignee_address_type(String consignee_address_type) {
			this.consignee_address_type = consignee_address_type;
		}

		public String getConsignee_city() {
			return consignee_city;
		}

		public void setConsignee_city(String consignee_city) {
			this.consignee_city = consignee_city;
		}

		public String getConsignee_state() {
			return consignee_state;
		}

		public void setConsignee_state(String consignee_state) {
			this.consignee_state = consignee_state;
		}

		public String getConsignee_country() {
			return consignee_country;
		}

		public void setConsignee_country(String consignee_country) {
			this.consignee_country = consignee_country;
		}

		public String getConsignee_street() {
			return consignee_street;
		}

		public void setConsignee_street(String consignee_street) {
			this.consignee_street = consignee_street;
		}

		public String getConsignee_pin() {
			return consignee_pin;
		}

		public void setConsignee_pin(String consignee_pin) {
			this.consignee_pin = consignee_pin;
		}

		public String getNotify() {
			return notify;
		}

		public void setNotify(String notify) {
			this.notify = notify;
		}

		public String getNotify_address_type() {
			return notify_address_type;
		}

		public void setNotify_address_type(String notify_address_type) {
			this.notify_address_type = notify_address_type;
		}

		public String getNotify_city() {
			return notify_city;
		}

		public void setNotify_city(String notify_city) {
			this.notify_city = notify_city;
		}

		public String getNotify_state() {
			return notify_state;
		}

		public void setNotify_state(String notify_state) {
			this.notify_state = notify_state;
		}

		public String getNotify_country() {
			return notify_country;
		}

		public void setNotify_country(String notify_country) {
			this.notify_country = notify_country;
		}

		public String getNotify_street() {
			return notify_street;
		}

		public void setNotify_street(String notify_street) {
			this.notify_street = notify_street;
		}

		public String getNotify_pin() {
			return notify_pin;
		}

		public void setNotify_pin(String notify_pin) {
			this.notify_pin = notify_pin;
		}

		public String getBill_to_party_addr_same_flag() {
			return bill_to_party_addr_same_flag;
		}

		public void setBill_to_party_addr_same_flag(String bill_to_party_addr_same_flag) {
			this.bill_to_party_addr_same_flag = bill_to_party_addr_same_flag;
		}

		public String getCons_notify_addr_flag() {
			return cons_notify_addr_flag;
		}

		public void setCons_notify_addr_flag(String cons_notify_addr_flag) {
			this.cons_notify_addr_flag = cons_notify_addr_flag;
		}

		public String getBill_to_party() {
			return bill_to_party;
		}

		public void setBill_to_party(String bill_to_party) {
			this.bill_to_party = bill_to_party;
		}

		public String getBill_to_party_address_type() {
			return bill_to_party_address_type;
		}

		public void setBill_to_party_address_type(String bill_to_party_address_type) {
			this.bill_to_party_address_type = bill_to_party_address_type;
		}

		public String getBill_to_party_city() {
			return bill_to_party_city;
		}

		public void setBill_to_party_city(String bill_to_party_city) {
			this.bill_to_party_city = bill_to_party_city;
		}

		public String getBill_to_party_state() {
			return bill_to_party_state;
		}

		public void setBill_to_party_state(String bill_to_party_state) {
			this.bill_to_party_state = bill_to_party_state;
		}

		public String getBill_to_party_country() {
			return bill_to_party_country;
		}

		public void setBill_to_party_country(String bill_to_party_country) {
			this.bill_to_party_country = bill_to_party_country;
		}

		public String getBill_to_party_street() {
			return bill_to_party_street;
		}

		public void setBill_to_party_street(String bill_to_party_street) {
			this.bill_to_party_street = bill_to_party_street;
		}

		public String getBill_to_party_pin() {
			return bill_to_party_pin;
		}

		public void setBill_to_party_pin(String bill_to_party_pin) {
			this.bill_to_party_pin = bill_to_party_pin;
		}

		public String getCan_status() {
			return can_status;
		}

		public void setCan_status(String can_status) {
			this.can_status = can_status;
		}

		public String getDo_status() {
			return do_status;
		}

		public void setDo_status(String do_status) {
			this.do_status = do_status;
		}

		public String getCreated_by() {
			return created_by;
		}

		public void setCreated_by(String created_by) {
			this.created_by = created_by;
		}

		public String getCreated_date() {
			return created_date;
		}

		public void setCreated_date(String created_date) {
			this.created_date = created_date;
		}

		public String getModified_by() {
			return modified_by;
		}

		public void setModified_by(String modified_by) {
			this.modified_by = modified_by;
		}

		public String getModified_date() {
			return modified_date;
		}

		public void setModified_date(String modified_date) {
			this.modified_date = modified_date;
		}

		@Override
		public String toString() {
			return "Can [can_id=" + can_id + ", can_order_no=" + can_order_no + ", can_date=" + can_date + ", can_type="
					+ can_type + ", mawb_no=" + mawb_no + ", shipment_order_no=" + shipment_order_no + ", house_no="
					+ house_no + ", house_date=" + house_date + ", commodity=" + commodity + ", actual_qty="
					+ actual_qty + ", arrived_qty=" + arrived_qty + ", actual_chwt=" + actual_chwt + ", arrived_chwt="
					+ arrived_chwt + ", actual_grwt=" + actual_grwt + ", arrived_grwt=" + arrived_grwt + ", volume="
					+ volume + ", inco_terms=" + inco_terms + ", uom=" + uom + ", pol=" + pol + ", pod=" + pod
					+ ", bro=" + bro + ", shipper=" + shipper + ", shipper_address_type=" + shipper_address_type
					+ ", shipper_city=" + shipper_city + ", shipper_state=" + shipper_state + ", shipper_country="
					+ shipper_country + ", shipper_street=" + shipper_street + ", shipper_pin=" + shipper_pin
					+ ", consignee=" + consignee + ", consignee_address_type=" + consignee_address_type
					+ ", consignee_city=" + consignee_city + ", consignee_state=" + consignee_state
					+ ", consignee_country=" + consignee_country + ", consignee_street=" + consignee_street
					+ ", consignee_pin=" + consignee_pin + ", notify=" + notify + ", notify_address_type="
					+ notify_address_type + ", notify_city=" + notify_city + ", notify_state=" + notify_state
					+ ", notify_country=" + notify_country + ", notify_street=" + notify_street + ", notify_pin="
					+ notify_pin + ", bill_to_party_addr_same_flag=" + bill_to_party_addr_same_flag
					+ ", cons_notify_addr_flag=" + cons_notify_addr_flag + ", bill_to_party=" + bill_to_party
					+ ", bill_to_party_address_type=" + bill_to_party_address_type + ", bill_to_party_city="
					+ bill_to_party_city + ", bill_to_party_state=" + bill_to_party_state + ", bill_to_party_country="
					+ bill_to_party_country + ", bill_to_party_street=" + bill_to_party_street + ", bill_to_party_pin="
					+ bill_to_party_pin + ", can_status=" + can_status + ", do_status=" + do_status + ", created_by="
					+ created_by + ", created_date=" + created_date + ", modified_by=" + modified_by
					+ ", modified_date=" + modified_date + "]";
		}

		public Can(int can_id, String can_order_no, String can_date, String can_type, String mawb_no,
				String shipment_order_no, String house_no, String house_date, String commodity, int actual_qty,
				int arrived_qty, int actual_chwt, int arrived_chwt, int actual_grwt, int arrived_grwt, int volume,
				String inco_terms, String uom, String pol, String pod, String bro, String shipper,
				String shipper_address_type, String shipper_city, String shipper_state, String shipper_country,
				String shipper_street, String shipper_pin, String consignee, String consignee_address_type,
				String consignee_city, String consignee_state, String consignee_country, String consignee_street,
				String consignee_pin, String notify, String notify_address_type, String notify_city,
				String notify_state, String notify_country, String notify_street, String notify_pin,
				String bill_to_party_addr_same_flag, String cons_notify_addr_flag, String bill_to_party,
				String bill_to_party_address_type, String bill_to_party_city, String bill_to_party_state,
				String bill_to_party_country, String bill_to_party_street, String bill_to_party_pin, String can_status,
				String do_status, String created_by, String created_date, String modified_by, String modified_date) {
			super();
			this.can_id = can_id;
			this.can_order_no = can_order_no;
			this.can_date = can_date;
			this.can_type = can_type;
			this.mawb_no = mawb_no;
			this.shipment_order_no = shipment_order_no;
			this.house_no = house_no;
			this.house_date = house_date;
			this.commodity = commodity;
			this.actual_qty = actual_qty;
			this.arrived_qty = arrived_qty;
			this.actual_chwt = actual_chwt;
			this.arrived_chwt = arrived_chwt;
			this.actual_grwt = actual_grwt;
			this.arrived_grwt = arrived_grwt;
			this.volume = volume;
			this.inco_terms = inco_terms;
			this.uom = uom;
			this.pol = pol;
			this.pod = pod;
			this.bro = bro;
			this.shipper = shipper;
			this.shipper_address_type = shipper_address_type;
			this.shipper_city = shipper_city;
			this.shipper_state = shipper_state;
			this.shipper_country = shipper_country;
			this.shipper_street = shipper_street;
			this.shipper_pin = shipper_pin;
			this.consignee = consignee;
			this.consignee_address_type = consignee_address_type;
			this.consignee_city = consignee_city;
			this.consignee_state = consignee_state;
			this.consignee_country = consignee_country;
			this.consignee_street = consignee_street;
			this.consignee_pin = consignee_pin;
			this.notify = notify;
			this.notify_address_type = notify_address_type;
			this.notify_city = notify_city;
			this.notify_state = notify_state;
			this.notify_country = notify_country;
			this.notify_street = notify_street;
			this.notify_pin = notify_pin;
			this.bill_to_party_addr_same_flag = bill_to_party_addr_same_flag;
			this.cons_notify_addr_flag = cons_notify_addr_flag;
			this.bill_to_party = bill_to_party;
			this.bill_to_party_address_type = bill_to_party_address_type;
			this.bill_to_party_city = bill_to_party_city;
			this.bill_to_party_state = bill_to_party_state;
			this.bill_to_party_country = bill_to_party_country;
			this.bill_to_party_street = bill_to_party_street;
			this.bill_to_party_pin = bill_to_party_pin;
			this.can_status = can_status;
			this.do_status = do_status;
			this.created_by = created_by;
			this.created_date = created_date;
			this.modified_by = modified_by;
			this.modified_date = modified_date;
		}

		public Can() {
			super();
			
		}
}

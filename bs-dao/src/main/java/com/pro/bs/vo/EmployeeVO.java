package com.pro.bs.vo;

/**
 * 用户dao
 * Created by hzq on 2016/10/4.
 */
public class EmployeeVO{
        private int employee_id;
        private String employee_name;
        private String employee_gender;
        private double employee_phonenumber;
        private  String getEmployee_email;

        public int getEmployee_id() {
            return employee_id;
        }

        public void setEmployee_id(int employee_id) {
            this.employee_id = employee_id;
        }

        public String getEmployee_name() {
            return employee_name;
        }

        public void setEmployee_name(String employee_name) {
            this.employee_name = employee_name;
        }

        public String getEmployee_gender() {
            return employee_gender;
        }

        public void setEmployee_gender(String employee_gender) {
            this.employee_gender = employee_gender;
        }

        public double getEmployee_phonenumber() {
            return employee_phonenumber;
        }

        public void setEmployee_phonenumber(double employee_phonenumber) {
            this.employee_phonenumber = employee_phonenumber;
        }

        public String getGetEmployee_email() {
            return getEmployee_email;
        }

        public void setGetEmployee_email(String getEmployee_email) {
            this.getEmployee_email = getEmployee_email;
        }
}

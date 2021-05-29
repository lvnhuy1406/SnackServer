package com.vku.snackserver.Common;

import com.vku.snackserver.Model.Request;
import com.vku.snackserver.Model.Users;

public class Common {
    public static Users currentUser;
    public static Request currentRequest;

    public static final String UPDATE = "Update";
    public static final String DELETE = "Delete";

    public static final int PICK_IMAGE_REQUEST = 72;

    public static String convertCodeToStatus(String code) {
        if (code.equals("0")) {
            return "Đã đặt";
        } else if (code.equals("1")) {
            return "Đang chuyển";
        } else {
            return "Đã nhận";
        }
    }
}

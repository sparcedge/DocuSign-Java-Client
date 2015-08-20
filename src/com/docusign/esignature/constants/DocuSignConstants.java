package com.docusign.esignature.constants;

/**
 * Created by merrichuffstutler on 8/19/15.
 */
public class DocuSignConstants {

    public static String status_created = "created";
    public static String status_sent = "sent";

    public static boolean isValidStatus(String status){
        return status_created.equals(status) || status_sent.equals(status);
    }
}

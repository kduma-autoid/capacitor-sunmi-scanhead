package com.sunmi.scanner;

public class ScannerService {
    public static final String ACTION_DATA_CODE_RECEIVED = "com.sunmi.scanner.ACTION_DATA_CODE_RECEIVED";
    public static final String DATA = "data";
    public static final String SOURCE = "source_byte";

//    private static final String API_REMOTE_CONFIG = "https://api.sunmi.com/api/hardware/app/scanner/1.0/?service=/querymachinebyid";
//    public static final int DEFAULT_CONFIG = 0;
//    public static final int FIX_ASCII_LENGTH = 10;
//    public static final String FIX_NULL = "null-null-null";
//    private static final String GBK = "GB18030";
//    private static final String ISO_8859_1 = "ISO-8859-1";
//    public static final int KEY_EVENT_SOURCE = -1743637418;
//    public static final int LOCAL_CONFIG = 1;
//    public static final int REMOTE_CONFIG = 2;
//    private static final int REQUEST_TIME = 1800000;
//    private static final int RETRY_TIME = 5;
//    private static final String SCANNER = "ScannerHeadModel";
//    public static final String SECOND_KEY_SUFFIX = "_second_key";
//    private static final String SHITF_JIS = "SHIFT-JIS";
//    private static final String SP_ADVANCED_CONFIG_KEY = "advanced_config";
//    private static final String SP_CONFIG_FILE = "scanner_config";
//    private static final String SP_CONFIG_KEY = "config";
//    private static final String SP_CUR_CONFIG_KEY = "cur_config";
//    private static final String SP_IS_FIRST_START_APP = "is_first_start_app";
//    private static final String SP_IS_START_BOOT = "is_start_boot";
//    private static final String SP_REMOTE_CONFIG_KEY = "scanner_remote_config";
//    private static final String SP_REQUEST_TIME = "scanner_request_time";
//    private static final String UTF8 = "UTF-8";
//    private static final String WINDOWS_1256 = "WINDOWS-1256";

    public static final int NONE = 100;
    public static final int SUPER_N1365_Y1825 = 101;
    public static final int NLS_2096 = 102;
    public static final int ZEBRA_4710 = 103;
    public static final int HONEYWELL_3601 = 104;
    public static final int HONEYWELL_6603 = 105;
    public static final int ZEBRA_4750 = 106;
    public static final int ZEBRA_1350 = 107;
    public static final int HONEYWELL_6703 = 108;
    public static final int HONEYWELL_3603 = 109;
    public static final int NLS_CM47 = 110;
    public static final int NLS_3108 = 111;
    public static final int ZEBRA_965 = 112;
    public static final int SM_SS_1100 = 113;
    public static final int NLS_CM30 = 114;
    public static final int HONEYWELL_4603 = 115;
    public static final int ZEBRA_4770 = 116;
    public static final int NLS_2596 = 117;
    public static final int SM_SS_1103 = 118;
    public static final int SM_SS_1101 = 119;
    public static final int HONEYWELL_5703 = 120;
    public static final int SM_SS_1100_2 = 121;
    public static final int SM_SS_1104 = 122;

    public static String scannerIdToName(int id) {
        return switch (id) {
            case ScannerService.NONE -> "NONE";

            case ScannerService.SUPER_N1365_Y1825 -> "SUPER_N1365_Y1825";
            case ScannerService.NLS_2096 -> "NLS_2096";
            case ScannerService.ZEBRA_4710 -> "ZEBRA_4710";
            case ScannerService.HONEYWELL_3601 -> "HONEYWELL_3601";
            case ScannerService.HONEYWELL_6603 -> "HONEYWELL_6603";
            case ScannerService.ZEBRA_4750 -> "ZEBRA_4750";
            case ScannerService.ZEBRA_1350 -> "ZEBRA_1350";
            case ScannerService.HONEYWELL_6703 -> "HONEYWELL_6703";
            case ScannerService.HONEYWELL_3603 -> "HONEYWELL_3603";
            case ScannerService.NLS_CM47 -> "NLS_CM47";
            case ScannerService.NLS_3108 -> "NLS_3108";
            case ScannerService.ZEBRA_965 -> "ZEBRA_965";
            case ScannerService.SM_SS_1100 -> "SM_SS_1100";
            case ScannerService.NLS_CM30 -> "NLS_CM30";
            case ScannerService.HONEYWELL_4603 -> "HONEYWELL_4603";
            case ScannerService.ZEBRA_4770 -> "ZEBRA_4770";
            case ScannerService.NLS_2596 -> "NLS_2596";
            case ScannerService.SM_SS_1103 -> "SM_SS_1103";
            case ScannerService.SM_SS_1101 -> "SM_SS_1101";
            case ScannerService.HONEYWELL_5703 -> "HONEYWELL_5703";
            case ScannerService.SM_SS_1100_2 -> "SM_SS_1100_2";
            case ScannerService.SM_SS_1104 -> "SM_SS_1104";

            default -> "UNKNOWN";
        };
    }
}

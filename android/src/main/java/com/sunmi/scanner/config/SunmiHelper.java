package com.sunmi.scanner.config;

import android.text.TextUtils;
import android.util.Log;

import com.sunmi.scanner.ScannerService;
import com.sunmi.scanner.constants.CodeConstants;
import com.sunmi.scanner.entity.CodeSets;
import com.sunmi.scanner.entity.CodeSetting;
import com.sunmi.scanner.entity.CodesRules;
import com.sunmi.scanner.entity.Pair;
import com.sunmi.scanner.entity.ServiceSetting;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;
import java.util.regex.Pattern;
import kotlin.text.Typography;

public class SunmiHelper {
    public static final String QUERY_HW_SN = "scan0001001"; //? com.sunmi.scanner.entity.Result
    public static final String SCAN00000109 = "scan00000109"; //? com.sunmi.scanner.entity.Result <scan00000109=-1> ScanImageFile
    public static final String SCAN00000105 = "scan00000105"; //? com.sunmi.scanner.entity.Result <scan00000105=-1> ocrPic SET_SCAN_OCR_FETCHING
    public static final String QUERY_EXPOSURE = "scan00000106"; // getExpAuto
    public static final String SCAN_MODE_OCR = "scan9002000"; // Scan Mode OCR
    public static final String SCAN_MODE_BARCODE = "scan9003000"; // Scan Mode Barcode
    public static final String SCAN_MODE_IMAGE_CONTROL = "scan00000105"; // Scan Mode Image Control SET_SCAN_OCR_FETCHING
    public static final String AIM_128 = "scan0035";
    public static final String AUSTRALIN_POSTAL = "scan2001";
    public static final String AZTEC = "scan1003";
    public static final String CANADIAN_POST = "scan2006";
    public static final String CHINA_POST = "scan2009";
    public static final String CHINA_TRAVEL_PERMIT_OCR = "scan3004";
    public static final String CHINESE25 = "scan0023";
    public static final String CHINESE_ID_CARD_OCR = "scan3002";
    public static final int CMD_SET_MIN_LENGTH = 13;
    public static final String CODABAR = "scan0009";
    public static final String CODABLOCK = "scan0031";
    public static final String CODE11 = "scan0015";
    public static final String CODE128 = "scan0001";
    public static final String CODE39 = "scan0008";
    public static final String CODE49 = "scan0037";
    public static final String CODE93 = "scan0010";
    public static final String CODE_16K = "scan0036";
    public static final String CODE_32 = "scan0029";
    public static final String CODE_ONE = "scan1010";
    public static final String COMMA = ",";
    public static final String COMPOSITE_AB = "scan0025";
    public static final String COMPOSITE_C = "scan0026";
    public static final String COOP_2OF5 = "scan0038";
    public static final String COUPON_CODE = "scan0033";
    public static final String C_1D_BARCODE = "scan9001";
    public static final String DATA_MATRIX = "scan1004";
    public static final String DEUTSCHE_POST_IDENTCODE = "scan2010";
    public static final String DEUTSCHE_POST_LEITCODE = "scan2011";
    public static final String DISCRETE25 = "scan0022";
    public static final String DOT_CODE = "scan0034";
    public static final String EAN13 = "scan0003";
    public static final String EAN8 = "scan0002";
    public static final String EAN_UCC_COMPOSITE = "scan0013";
    public static final String EMPTY = "";
    public static final String EQUAL = "=";
    public static final String GRID_MATRIX = "scan1007";
    public static final String GS1_DATABAR = "scan0012";
    public static final String HANXIN_CODE = "scan1005";
    public static final String IND25 = "scan0017";
    public static final String INT25 = "scan0006";
    public static final String ISBN = "scan0016";
    public static final String ISBT128 = "scan0021";
    public static final String ISSN_EAN = "scan0027";
    public static final String JAPAN_POSTAL = "scan2005";
    public static final String KIX_POST = "scan2007";
    public static final String KOREA35 = "scan0024";
    public static final String KOREA_POST = "scan2008";
    public static final String MATRIX25 = "scan0007";
    public static final String MAXI_CODE = "scan1006";
    public static final String MICRO_PDF417 = "scan1008";
    public static final String MICRO_QR_CODE = "scan1009";
    public static final String MSI_PLESSEY = "scan0020";
    public static final String PASSPORT_OCR = "scan3003";
    public static final String PDF417 = "scan1001";
    public static final String PLESSEY = "scan0019";
    public static final String QR_CODE = "scan1002";
    public static final String QUERY_1D_BARCODE_SETTING = "scan0002000";
    public static final String QUERY_ADVANCED_FORMAT = "sunmi001001";
    public static final String QUERY_AIM128_SETTING = "scan0002030";
    public static final String QUERY_ALL_ENABLE_CODE = "scan0001000";
    public static final String QUERY_ALL_SETTING_INFO = "sunmi001000";
    public static final String QUERY_AUSTRALIN_POSTAL_SETTING = "scan0004001";
    public static final String QUERY_AZTEC_SETTING = "scan0003003";
    public static final String QUERY_CHINA_POST_SETTING = "scan0004006";
    public static final String QUERY_CHINESE_2OF5_SETTING = "scan0002022";
    public static final String QUERY_CODABAR_SETTING = "scan0002013";
    public static final String QUERY_CODABLOCK_SETTING = "scan0003007";
    public static final String QUERY_CODE11_SETTING = "scan0002017";
    public static final String QUERY_CODE128_SETTING = "scan0002001";
    public static final String QUERY_CODE32_SETTING = "scan0002034";
    public static final String QUERY_CODE39_SETTING = "scan0002011";
    public static final String QUERY_CODE49_SETTING = "scan0002032";
    public static final String QUERY_CODE93_SETTING = "scan0002012";
    public static final String QUERY_CODE_16K_SETTING = "scan0002031";
    public static final String QUERY_CODE_ONE_SETTING = "scan0003011";
    public static final String QUERY_COMPOSITE_AB_SETTING = "scan0002026";
    public static final String QUERY_COMPOSITE_C_SETTING = "scan0002027";
    public static final String QUERY_COOP_2OF5_SETTING = "scan0002033";
    public static final String QUERY_DATA_MATRIX_SETTING = "scan0003004";
    public static final String QUERY_DEUTSCHE_POST_IDENTCODE_SETTING = "scan0004008";
    public static final String QUERY_DEUTSCHE_POST_LEITCODE_SETTING = "scan0004009";
    public static final String QUERY_DISCRETE_2OF5_SETTING = "scan0002021";
    public static final String QUERY_DOT_CODE_SETTING = "scan0003012";
    public static final String QUERY_EAN13_SETTING = "scan0002005";
    public static final String QUERY_EAN8_SETTING = "scan0002004";
    public static final String QUERY_EAN_UCC_COMPOSITE_SETTING = "scan0002015";
    public static final String QUERY_GRID_MATRIX_SETTING = "scan0003008";
    public static final String QUERY_GS1DATABAR_SETTING = "scan0002014";
    public static final String QUERY_HANXIN_CODE_SETTING = "scan0003005";
    public static final String QUERY_INDUSTRIAL_2OF5_SETTING = "scan0002019";
    public static final String QUERY_INTERLEAVED_2OF5_SETTING = "scan0002009";
    public static final String QUERY_ISBN_SETTING = "scan0002018";
    public static final String QUERY_ISBT128_SETTING = "scan0002003";
    public static final String QUERY_ISSN_EAN_SETTING = "scan0002028";
    public static final String QUERY_JAPAN_POSTAL_SETTING = "scan0004005";
    public static final String QUERY_KOREAN_3OF5_SETTING = "scan0002023";
    public static final String QUERY_KOREA_POST_SETTING = "scan0004007";
    public static final String QUERY_MATRIX_2OF5_SETTING = "scan0002010";
    public static final String QUERY_MAXI_CODE_SETTING = "scan0003006";
    public static final String QUERY_MICRO_PDF417_SETTING = "scan0003009";
    public static final String QUERY_MICRO_QR_CODE_SETTING = "scan0003010";
    public static final String QUERY_MSI_PLESSEY_SETTING = "scan0002025";
    public static final String QUERY_PDF417_SETTING = "scan0003001";
    public static final String QUERY_PLESSEY_SETTING = "scan0002024";
    private static final String QUERY_PRE_1D = "scan0002";
    private static final String QUERY_PRE_2D = "scan0003";
    private static final String QUERY_PRE_POSTAL = "scan0004";
    public static final String QUERY_QR_CODE_SETTING = "scan0003002";
    public static final String QUERY_ROYAL_MAIL_CUSTOMER_SETTING = "scan0004011";
    public static final String QUERY_SCAN_CMD = "scan9999999";
    public static final String QUERY_STANDARD_2OF5_SETTING = "scan0002020";
    public static final String QUERY_TELEPEN_SETTING = "scan0002029";
    public static final String QUERY_UCCEAN128_SETTING = "scan0002002";
    public static final String QUERY_UK_POSTAL_SETTING = "scan0004004";
    public static final String QUERY_UPC_A_SETTING = "scan0002008";
    public static final String QUERY_UPC_E1_SETTING = "scan0002007";
    public static final String QUERY_UPC_EAN_COMPOSITE_SETTING = "scan0002016";
    public static final String QUERY_UPC_E_SETTING = "scan0002006";
    public static final String QUERY_USPS_INTELLIGENT_MAIL_SETTING = "scan0004010";
    public static final String QUERY_US_PLANET_SETTING = "scan0004003";
    public static final String QUERY_US_POSTNET_SETTING = "scan0004002";
    public static final String ROYAL_MAIL_CUSTOMER = "scan2013";
    public static final String SCAN = "scan";
    public static final int SCAN_CODE_PRE_NUM = 8;
    public static final int SCAN_CODE_SUF_NUM = 3;
    public static final String SEMICOLON = ";";
    public static final String SET_ADVANCED_FORMAT = "sunmi006000";
    public static final String SET_FLASH_CONTROL = "scan00000107";
    public static final String SET_ADVANCED_FORMAT_ADD = "sunmi006002";
    public static final String SET_ADVANCED_FORMAT_CLEAR = "sunmi006004";
    public static final String SET_ADVANCED_FORMAT_EDIT = "sunmi006003";
    public static final String SET_ADVANCED_FORMAT_REMOVE = "sunmi006001";
    public static final String SET_CENTER_FLAG_SCAN = "sunmi009001";
    public static final String SET_DECODE_AREA_MODE = "sunmi008001";
    public static final String SET_DECODE_AREA_PERCENT = "sunmi008002";
    public static final String SET_OUT_AUTO_ADD = "sunmi003003";
    public static final String SET_OUT_BROADCAST = "sunmi003001";
    public static final String SET_OUT_CHAR_INTERVAL = "sunmi003004";
    public static final String SET_OUT_CODE = "sunmi001001";
    public static final String SET_OUT_CODE_ACTION = "sunmi003006";
    public static final String SET_OUT_CODE_ACTION_BYTE_KEY = "sunmi003008";
    public static final String SET_OUT_CODE_ACTION_DATA_KEY = "sunmi003007";
    public static final String SET_OUT_CODE_ID = "sunmi003005";
    public static final String SET_OUT_TYPE = "sunmi003002";
    public static final String SET_PREFIX = "sunmi005000";
    public static final String SET_PREFIX_CONTEXT = "sunmi005002";
    public static final String SET_PREFIX_COUNT = "sunmi005004";
    public static final String SET_SCAN = "scan0000";
    public static final String SET_SCAN_ALL_CODE = "scan00000000";
    public static final String SET_SCAN_CMD = "scan99999999";
    public static final String SET_SCAN_END_DECODE_ACTION = "sunmi003010";
    public static final String SET_SCAN_HEAD_LEVEL = "scan00000103";
    public static final String SET_SCAN_OCR_FETCHING = "scan00000105";
    public static final String SET_SCAN_SPECIFIC_SCENE = "scan00000104";
    public static final String SET_SCAN_START_DECODE_ACTION = "sunmi003009";
    public static final String SET_SCAN_TRIGGER = "sunmi004000";
    public static final String SET_SCAN_TRIGGER_METHOD = "scan00000101";
    public static final String SET_SCAN_TRIGGER_TIME_OUT = "scan00000102";
    public static final String SET_SUFFIX = "sunmi005001";
    public static final String SET_REMOVE_GROUP_CHAR = "sunmi005006";
    public static final String SET_SUFFIX_CONTEXT = "sunmi005003";
    public static final String SET_SUFFIX_COUNT = "sunmi005005";
    public static final String SET_TIPS = "sunmi002001";
    public static final String SET_TRIGGER_CONTINUOUS_TIME = "sunmi007003";
    public static final String SET_TRIGGER_METHOD = "sunmi007001";
    public static final String SET_TRIGGER_OVER_TIME = "sunmi007002";
    public static final String SPECIFIC_OCR_B = "scan3001";
    public static final String STA25 = "scan0018";
    public static final String SUFFIX_CHECK_CHAR_MODE = "009";
    public static final String SUFFIX_CHECK_CHAR_TYPE = "002";
    public static final String SUFFIX_DOUBLE_CODE = "010";
    public static final String SUFFIX_ENABLE = "000";
    public static final String SUFFIX_EXTEND_CODE_1 = "005";
    public static final String SUFFIX_EXTEND_CODE_2 = "006";
    public static final String SUFFIX_EXTEND_TO_CODE = "008";
    public static final String SUFFIX_FORMAT_MODE = "013";
    public static final String SUFFIX_INVERSE_CODE = "012";
    public static final String SUFFIX_MICRO_CODE = "011";
    public static final String SUFFIX_READ_RANGE = "001";
    public static final String SUFFIX_START_END_FORMAT = "004";
    public static final String SUFFIX_START_END_TYPE = "003";
    public static final String SUFFIX_SYSTEM_CHAR_ZERO = "007";
    public static final String SUNMI = "sunmi";
    public static final String TELEPEN = "scan0032";
    public static final String TLC_39 = "scan0030";
    public static final String UCC_EAN128 = "scan0011";
    public static final String UK_POSTAL = "scan2004";
    public static final String UPC_A = "scan0005";
    public static final String UPC_E = "scan0004";
    public static final String UPC_E1 = "scan0028";
    public static final String UPC_EAN_COMPOSITE = "scan0014";
    public static final String USPS_INTELLIGENT_MAIL = "scan2012";
    public static final String US_PLANET = "scan2003";
    public static final String US_POSTNET = "scan2002";

    public static String setOutCode(int i) {
        return createCmd("sunmi001001", i);
    }

    public static String setTips(int[] iArr) {
        return createCmd(SET_TIPS, iArr);
    }

    public static String setOutBroadcast(int i) {
        return createCmd(SET_OUT_BROADCAST, i);
    }

    public static String setOutType(int i) {
        return createCmd(SET_OUT_TYPE, i);
    }

    public static String setOutAutoAdd(int[] iArr) {
        return createCmd(SET_OUT_AUTO_ADD, iArr);
    }

    public static String setOutCharInterval(int i) {
        return createCmd(SET_OUT_CHAR_INTERVAL, i);
    }

    public static String setSetOutCodeID(int i) {
        return createCmd(SET_OUT_CODE_ID, i);
    }

    public static String setOutBroadcastAction(String str) {
        return createCmd(SET_OUT_CODE_ACTION, str);
    }

    public static String setOutBroadcastDataKey(String str) {
        return createCmd(SET_OUT_CODE_ACTION_DATA_KEY, str);
    }

    public static String setOutBroadcastByteKey(String str) {
        return createCmd(SET_OUT_CODE_ACTION_BYTE_KEY, str);
    }

    public static String setStartDecodeBroadcastAction(String str) {
        return createCmd(SET_SCAN_START_DECODE_ACTION, str);
    }

    public static String setEndDecodeBroadcastAction(String str) {
        return createCmd(SET_SCAN_END_DECODE_ACTION, str);
    }

    public static String setScanTrigger(int[] iArr) {
        return createCmd(SET_SCAN_TRIGGER, iArr);
    }

    public static String setPrefix(int i) {
        return createCmd(SET_PREFIX, i);
    }

    public static String setSuffix(int i) {
        return createCmd(SET_SUFFIX, i);
    }

    public static String setRemoveGroupChar(int i) {
        return createCmd(SET_REMOVE_GROUP_CHAR, i);
    }

    public static String setPrefixCount(int i) {
        return createCmd(SET_PREFIX_COUNT, i);
    }

    public static String setSuffixCount(int i) {
        return createCmd(SET_SUFFIX_COUNT, i);
    }

    public static String setPrefixContext(String str) {
        return createCmd(SET_PREFIX_CONTEXT, str);
    }

    public static String setSuffixContext(String str) {
        return createCmd(SET_SUFFIX_CONTEXT, str);
    }

    public static String setAdvancedFormat(int i) {
        return createCmd(SET_ADVANCED_FORMAT, i);
    }
    public static String setFlashControl(int i) {
        return createCmd(SET_FLASH_CONTROL, i);
    }

    public static String setAdvancedFormatRemove(String str) {
        return createCmd(SET_ADVANCED_FORMAT_REMOVE, str);
    }

    public static String setAdvancedFormatAdd(String[] strArr) {
        return createCmd(SET_ADVANCED_FORMAT_ADD, strArr);
    }

    public static String setAdvancedFormatEdit(String[] strArr) {
        return createCmd(SET_ADVANCED_FORMAT_EDIT, strArr);
    }

    public static String setAdvancedFormatClear(int i) {
        return createCmd(SET_ADVANCED_FORMAT_CLEAR, i);
    }

    public static String setTriggerMethod(int i) {
        return createCmd(SET_TRIGGER_METHOD, i);
    }

    public static String setTriggerOverTime(int i) {
        return createCmd(SET_TRIGGER_OVER_TIME, i);
    }

    public static String setTriggerContinuousTime(int i) {
        return createCmd(SET_TRIGGER_CONTINUOUS_TIME, i);
    }

    public static String setDecodeAreaMode(int i) {
        return createCmd(SET_DECODE_AREA_MODE, i);
    }

    public static String setDecodeAreaPercent(int i) {
        return createCmd(SET_DECODE_AREA_PERCENT, i);
    }

    public static String setCenterFlagScan(int i) {
        return createCmd(SET_CENTER_FLAG_SCAN, i);
    }

    public static String setSetScanCmd(String str) {
        return createCmd(SET_SCAN_CMD, str);
    }

    public static String setScanAllCode(boolean z) {
        return createCmd(SET_SCAN_ALL_CODE, z ? 1 : 0);
    }

    public static String setScanTriggerModel(int i) {
        return createCmd(SET_SCAN_TRIGGER_METHOD, i);
    }

    public static String setScanTriggerTimeOut(int i) {
        return createCmd(SET_SCAN_TRIGGER_TIME_OUT, i);
    }

    public static String setScanHeadLevel(int i) {
        return createCmd(SET_SCAN_HEAD_LEVEL, i);
    }

    public static String setSetScanSpecificScene(int i) {
        return createCmd(SET_SCAN_SPECIFIC_SCENE, i);
    }

    public static String getSetScanOcrFetching(int i) {
        return createCmd(SET_SCAN_OCR_FETCHING, i);
    }

    private static String getCodeStrToCodeId(String str) {
        str.hashCode();
        char c = 65535;
        switch (str.hashCode()) {
            case -2140164507:
                if (str.equals(CodeConstants.JAPAN_POSTAL)) {
                    c = 0;
                    break;
                }
                break;
            case -1939698872:
                if (str.equals("PDF417")) {
                    c = 1;
                    break;
                }
                break;
            case -1881601376:
                if (str.equals(CodeConstants.CHINESE_ID_CARD_OCR)) {
                    c = 2;
                    break;
                }
                break;
            case -1812777107:
                if (str.equals(CodeConstants.COOP_2OF5)) {
                    c = 3;
                    break;
                }
                break;
            case -1785566351:
                if (str.equals(CodeConstants.UPC_E1)) {
                    c = 4;
                    break;
                }
                break;
            case -1688587926:
                if (str.equals(CodeConstants.CODABAR)) {
                    c = 5;
                    break;
                }
                break;
            case -1688533741:
                if (str.equals(CodeConstants.CODE_11)) {
                    c = 6;
                    break;
                }
                break;
            case -1688533678:
                if (str.equals(CodeConstants.CODE_32)) {
                    c = 7;
                    break;
                }
                break;
            case -1688533671:
                if (str.equals(CodeConstants.CODE_39)) {
                    c = 8;
                    break;
                }
                break;
            case -1688533640:
                if (str.equals(CodeConstants.CODE_49)) {
                    c = 9;
                    break;
                }
                break;
            case -1688533491:
                if (str.equals(CodeConstants.CODE_93)) {
                    c = 10;
                    break;
                }
                break;
            case -1646072357:
                if (str.equals(CodeConstants.GRID_MATRIX)) {
                    c = 11;
                    break;
                }
                break;
            case -1551227498:
                if (str.equals(CodeConstants.CHINA_TRAVEL_PERMIT_OCR)) {
                    c = 12;
                    break;
                }
                break;
            case -1548045674:
                if (str.equals(CodeConstants.KOREA_POST)) {
                    c = 13;
                    break;
                }
                break;
            case -1513352222:
                if (str.equals(CodeConstants.COMPOSITE_UPC)) {
                    c = 14;
                    break;
                }
                break;
            case -1461130479:
                if (str.equals(CodeConstants.INTERLEAVED_2OF5)) {
                    c = 15;
                    break;
                }
                break;
            case -1414551947:
                if (str.equals(CodeConstants.KOREAN_3OF5)) {
                    c = 16;
                    break;
                }
                break;
            case -1029797147:
                if (str.equals(CodeConstants.SPECIFIC_OCR_B)) {
                    c = 17;
                    break;
                }
                break;
            case -968758524:
                if (str.equals(CodeConstants.TLC_39)) {
                    c = 18;
                    break;
                }
                break;
            case -957806169:
                if (str.equals(CodeConstants.COUPON_CODE)) {
                    c = 19;
                    break;
                }
                break;
            case -860541965:
                if (str.equals(CodeConstants.MSI_PLESSEY)) {
                    c = 20;
                    break;
                }
                break;
            case -845049609:
                if (str.equals(CodeConstants.DATA_MATRIX)) {
                    c = 21;
                    break;
                }
                break;
            case -804938332:
                if (str.equals(CodeConstants.CODE_128)) {
                    c = 22;
                    break;
                }
                break;
            case -804938189:
                if (str.equals(CodeConstants.CODE_16K)) {
                    c = 23;
                    break;
                }
                break;
            case -804907597:
                if (str.equals(CodeConstants.CODE_ONE)) {
                    c = 24;
                    break;
                }
                break;
            case -787189066:
                if (str.equals(CodeConstants.DOT_CODE)) {
                    c = 25;
                    break;
                }
                break;
            case -756663504:
                if (str.equals(CodeConstants.MICRO_QR_CODE)) {
                    c = '\u001a';
                    break;
                }
                break;
            case -716287563:
                if (str.equals(CodeConstants.UK_POSTAL)) {
                    c = 27;
                    break;
                }
                break;
            case -663928176:
                if (str.equals(CodeConstants.DEUTSCHE_POST_IDENTCODE)) {
                    c = 28;
                    break;
                }
                break;
            case -601264383:
                if (str.equals(CodeConstants.GS1_DATABAR)) {
                    c = 29;
                    break;
                }
                break;
            case -189027409:
                if (str.equals(CodeConstants.UCC_EAN_128)) {
                    c = 30;
                    break;
                }
                break;
            case -20549826:
                if (str.equals(CodeConstants.DEUTSCHE_POST_LEITCODE)) {
                    c = 31;
                    break;
                }
                break;
            case 2256630:
                if (str.equals("ISBN")) {
                    c = ' ';
                    break;
                }
                break;
            case 63778073:
                if (str.equals(CodeConstants.AZTEC)) {
                    c = '!';
                    break;
                }
                break;
            case 65735370:
                if (str.equals(CodeConstants.EAN_8)) {
                    c = Typography.quote;
                    break;
                }
                break;
            case 80948412:
                if (str.equals(CodeConstants.UPC_A)) {
                    c = '#';
                    break;
                }
                break;
            case 80948416:
                if (str.equals(CodeConstants.UPC_E)) {
                    c = Typography.dollar;
                    break;
                }
                break;
            case 235302159:
                if (str.equals(CodeConstants.TELEPEN)) {
                    c = '%';
                    break;
                }
                break;
            case 268885517:
                if (str.equals(CodeConstants.CHINESE_2OF5)) {
                    c = Typography.amp;
                    break;
                }
                break;
            case 337980794:
                if (str.equals(CodeConstants.US_PLANET)) {
                    c = '\'';
                    break;
                }
                break;
            case 350790724:
                if (str.equals(CodeConstants.MICRO_PDF417)) {
                    c = '(';
                    break;
                }
                break;
            case 481459814:
                if (str.equals(CodeConstants.KIX_POST)) {
                    c = ')';
                    break;
                }
                break;
            case 650933023:
                if (str.equals(CodeConstants.USPS_INTELLIGENT_MAIL)) {
                    c = '*';
                    break;
                }
                break;
            case 665923772:
                if (str.equals(CodeConstants.AIM_128)) {
                    c = '+';
                    break;
                }
                break;
            case 683516425:
                if (str.equals(CodeConstants.CHINA_POST)) {
                    c = ',';
                    break;
                }
                break;
            case 764968996:
                if (str.equals(CodeConstants.CODABLOCK)) {
                    c = '-';
                    break;
                }
                break;
            case 799297821:
                if (str.equals(CodeConstants.CANADIAN_POST)) {
                    c = '.';
                    break;
                }
                break;
            case 828938442:
                if (str.equals(CodeConstants.COMPOSITE_C)) {
                    c = '/';
                    break;
                }
                break;
            case 992598803:
                if (str.equals(CodeConstants.ISBT_128)) {
                    c = '0';
                    break;
                }
                break;
            case 1103539727:
                if (str.equals(CodeConstants.COMPOSITE_UCC)) {
                    c = '1';
                    break;
                }
                break;
            case 1174614109:
                if (str.equals(CodeConstants.PLESSEY)) {
                    c = '2';
                    break;
                }
                break;
            case 1252603052:
                if (str.equals(CodeConstants.QR_CODE)) {
                    c = '3';
                    break;
                }
                break;
            case 1258010181:
                if (str.equals(CodeConstants.HAN_XIN_CODE)) {
                    c = '4';
                    break;
                }
                break;
            case 1371066030:
                if (str.equals(CodeConstants.ROYAL_MAIL_CUSTOMER)) {
                    c = '5';
                    break;
                }
                break;
            case 1429816336:
                if (str.equals(CodeConstants.PASSPORT_OCR)) {
                    c = '6';
                    break;
                }
                break;
            case 1467990721:
                if (str.equals(CodeConstants.INDUSTRIAL_2OF5)) {
                    c = '7';
                    break;
                }
                break;
            case 1474160234:
                if (str.equals(CodeConstants.ISSN_EAN)) {
                    c = '8';
                    break;
                }
                break;
            case 1572678777:
                if (str.equals(CodeConstants.MATRIX_2OF5)) {
                    c = '9';
                    break;
                }
                break;
            case 1719706366:
                if (str.equals(CodeConstants.AUSTRALIN_POSTAL)) {
                    c = ':';
                    break;
                }
                break;
            case 1854514753:
                if (str.equals(CodeConstants.DISCRETE_2OF5)) {
                    c = ';';
                    break;
                }
                break;
            case 1874345843:
                if (str.equals(CodeConstants.C_1D_BARCODE)) {
                    c = Typography.less;
                    break;
                }
                break;
            case 1883675133:
                if (str.equals(CodeConstants.STANDARD_2OF5)) {
                    c = '=';
                    break;
                }
                break;
            case 1977816488:
                if (str.equals(CodeConstants.MAXI_CODE)) {
                    c = '>';
                    break;
                }
                break;
            case 1990167899:
                if (str.equals(CodeConstants.US_POSTNET)) {
                    c = '?';
                    break;
                }
                break;
            case 2037796304:
                if (str.equals(CodeConstants.EAN_13)) {
                    c = '@';
                    break;
                }
                break;
            case 2040892603:
                if (str.equals(CodeConstants.COMPOSITE_AB)) {
                    c = 'A';
                    break;
                }
                break;
        }
        switch (c) {
            case 0:
                return JAPAN_POSTAL;
            case 1:
                return PDF417;
            case 2:
                return CHINESE_ID_CARD_OCR;
            case 3:
                return COOP_2OF5;
            case 4:
                return UPC_E1;
            case 5:
                return CODABAR;
            case 6:
                return CODE11;
            case 7:
                return CODE_32;
            case 8:
                return CODE39;
            case 9:
                return CODE49;
            case 10:
                return CODE93;
            case 11:
                return GRID_MATRIX;
            case 12:
                return CHINA_TRAVEL_PERMIT_OCR;
            case 13:
                return KOREA_POST;
            case 14:
                return UPC_EAN_COMPOSITE;
            case 15:
                return INT25;
            case 16:
                return KOREA35;
            case 17:
                return SPECIFIC_OCR_B;
            case 18:
                return TLC_39;
            case 19:
                return COUPON_CODE;
            case 20:
                return MSI_PLESSEY;
            case 21:
                return DATA_MATRIX;
            case 22:
                return CODE128;
            case 23:
                return CODE_16K;
            case 24:
                return CODE_ONE;
            case 25:
                return DOT_CODE;
            case 26:
                return MICRO_QR_CODE;
            case 27:
                return UK_POSTAL;
            case 28:
                return DEUTSCHE_POST_IDENTCODE;
            case 29:
                return GS1_DATABAR;
            case 30:
                return UCC_EAN128;
            case 31:
                return DEUTSCHE_POST_LEITCODE;
            case ' ':
                return ISBN;
            case '!':
                return AZTEC;
            case '\"':
                return "scan0002";
            case '#':
                return UPC_A;
            case '$':
                return "scan0004";
            case '%':
                return TELEPEN;
            case '&':
                return CHINESE25;
            case '\'':
                return US_PLANET;
            case '(':
                return MICRO_PDF417;
            case ')':
                return KIX_POST;
            case '*':
                return USPS_INTELLIGENT_MAIL;
            case '+':
                return AIM_128;
            case ',':
                return CHINA_POST;
            case '-':
                return CODABLOCK;
            case '.':
                return CANADIAN_POST;
            case '/':
                return COMPOSITE_C;
            case '0':
                return ISBT128;
            case '1':
                return EAN_UCC_COMPOSITE;
            case '2':
                return PLESSEY;
            case '3':
                return QR_CODE;
            case '4':
                return HANXIN_CODE;
            case '5':
                return ROYAL_MAIL_CUSTOMER;
            case '6':
                return PASSPORT_OCR;
            case '7':
                return IND25;
            case '8':
                return ISSN_EAN;
            case '9':
                return MATRIX25;
            case ':':
                return AUSTRALIN_POSTAL;
            case ';':
                return DISCRETE25;
            case '<':
                return C_1D_BARCODE;
            case '=':
                return STA25;
            case '>':
                return MAXI_CODE;
            case '?':
                return US_POSTNET;
            case '@':
                return "scan0003";
            case 'A':
                return COMPOSITE_AB;
            default:
                Log.e(SunmiHelper.class.getSimpleName(), "convert error!");
                return "";
        }
    }

    public static String setCodeEnable(String str, boolean z) {
        String codeStrToCodeId = getCodeStrToCodeId(str);
        if (codeStrToCodeId == null || "".equals(codeStrToCodeId)) {
            return "";
        }
        return createCmd(codeStrToCodeId + SUFFIX_ENABLE, z ? 1 : 0);
    }

    public static String setCodeReadRange(String str, int[] iArr) {
        String codeStrToCodeId = getCodeStrToCodeId(str);
        if (codeStrToCodeId == null || "".equals(codeStrToCodeId)) {
            return "";
        }
        return createCmd(codeStrToCodeId + SUFFIX_READ_RANGE, iArr);
    }

    public static String setCodeCheckCharType(String str, int i) {
        String codeStrToCodeId = getCodeStrToCodeId(str);
        if (codeStrToCodeId == null || "".equals(codeStrToCodeId)) {
            return "";
        }
        return createCmd(codeStrToCodeId + SUFFIX_CHECK_CHAR_TYPE, i);
    }

    public static String setCodeCheckMode(String str, int i) {
        String codeStrToCodeId = getCodeStrToCodeId(str);
        if (codeStrToCodeId == null || "".equals(codeStrToCodeId)) {
            return "";
        }
        return createCmd(codeStrToCodeId + SUFFIX_CHECK_CHAR_MODE, i);
    }

    public static String setCodeStartEndType(String str, boolean z) {
        String codeStrToCodeId = getCodeStrToCodeId(str);
        if (codeStrToCodeId == null || "".equals(codeStrToCodeId)) {
            return "";
        }
        return createCmd(codeStrToCodeId + SUFFIX_START_END_TYPE, z ? 1 : 0);
    }

    public static String setCodeStartEndFormat(String str, int i) {
        String codeStrToCodeId = getCodeStrToCodeId(str);
        if (codeStrToCodeId == null || "".equals(codeStrToCodeId)) {
            return "";
        }
        return createCmd(codeStrToCodeId + SUFFIX_START_END_FORMAT, i);
    }

    public static String setCodeExtendRead1(String str, boolean z) {
        String codeStrToCodeId = getCodeStrToCodeId(str);
        if (codeStrToCodeId == null || "".equals(codeStrToCodeId)) {
            return "";
        }
        return createCmd(codeStrToCodeId + SUFFIX_EXTEND_CODE_1, z ? 1 : 0);
    }

    public static String setCodeExtendRead2(String str, boolean z) {
        String codeStrToCodeId = getCodeStrToCodeId(str);
        if (codeStrToCodeId == null || "".equals(codeStrToCodeId)) {
            return "";
        }
        return createCmd(codeStrToCodeId + SUFFIX_EXTEND_CODE_2, z ? 1 : 0);
    }

    public static String setCodeSystemCharZero(String str, boolean z) {
        String codeStrToCodeId = getCodeStrToCodeId(str);
        if (codeStrToCodeId == null || "".equals(codeStrToCodeId)) {
            return "";
        }
        return createCmd(codeStrToCodeId + SUFFIX_SYSTEM_CHAR_ZERO, z ? 1 : 0);
    }

    public static String setCodeExtendToCode(String str, boolean z) {
        String codeStrToCodeId = getCodeStrToCodeId(str);
        if (codeStrToCodeId == null || "".equals(codeStrToCodeId)) {
            return "";
        }
        return createCmd(codeStrToCodeId + SUFFIX_EXTEND_TO_CODE, z ? 1 : 0);
    }

    public static String setCodeReadDouble(String str, int i) {
        String codeStrToCodeId = getCodeStrToCodeId(str);
        if (codeStrToCodeId == null || "".equals(codeStrToCodeId)) {
            return "";
        }
        return createCmd(codeStrToCodeId + SUFFIX_DOUBLE_CODE, i);
    }

    public static String setCodeFormatMode(String str, int i) {
        String codeStrToCodeId = getCodeStrToCodeId(str);
        if (codeStrToCodeId == null || "".equals(codeStrToCodeId)) {
            return "";
        }
        return createCmd(codeStrToCodeId + SUFFIX_FORMAT_MODE, i);
    }

    public static String setCodeReadMicro(String str, boolean z) {
        String codeStrToCodeId = getCodeStrToCodeId(str);
        if (codeStrToCodeId == null || "".equals(codeStrToCodeId)) {
            return "";
        }
        return createCmd(codeStrToCodeId + SUFFIX_MICRO_CODE, z ? 1 : 0);
    }

    public static String setCodeReadInverse(String str, int i) {
        String codeStrToCodeId = getCodeStrToCodeId(str);
        if (codeStrToCodeId == null || "".equals(codeStrToCodeId)) {
            return "";
        }
        return createCmd(codeStrToCodeId + SUFFIX_INVERSE_CODE, i);
    }

    public static String convertCmd(String str, CodesRules codesRules, CodeSetting codeSetting) {
        StringBuilder sb = new StringBuilder();
        if (codeSetting.minLen >= codesRules.minLen && codeSetting.minLen <= codesRules.maxLen && codeSetting.maxLen >= codesRules.minLen && codeSetting.maxLen <= codesRules.maxLen && codeSetting.minLen != -1 && codeSetting.maxLen != -1) {
            sb.append(setCodeReadRange(str, new int[]{codeSetting.minLen, codeSetting.maxLen}));
        }
        if (codesRules.checkCharType.length > 0 && codeSetting.checkCharType != -1) {
            sb.append(setCodeCheckCharType(str, codeSetting.checkCharType));
        }
        if (codesRules.startEndType != -1) {
            sb.append(setCodeStartEndType(str, codeSetting.isStartEndType));
        }
        if (codesRules.startEndType == 1 && codeSetting.startEndFormat != -1) {
            sb.append(setCodeStartEndFormat(str, codeSetting.startEndFormat));
        }
        if (codesRules.extendCode1Type != -1) {
            sb.append(setCodeExtendRead1(str, codeSetting.isExtendCode1));
        }
        if (codesRules.extendCode2Type != -1) {
            sb.append(setCodeExtendRead2(str, codeSetting.isExtendCode2));
        }
        if (codesRules.systemCharZero != -1) {
            sb.append(setCodeSystemCharZero(str, codeSetting.isSystemCharZero));
        }
        if (codesRules.extendToCode != -1) {
            sb.append(setCodeExtendToCode(str, codeSetting.isExtendToCode));
        }
        if (codesRules.checkCharMode.length > 0 && codeSetting.checkCharMode != -1) {
            sb.append(setCodeCheckMode(str, codeSetting.checkCharMode));
        }
        if (!(codesRules.doubleCode == -1 || codeSetting.doubleCode == -1)) {
            sb.append(setCodeReadDouble(str, codeSetting.doubleCode));
        }
        if (codesRules.microCode != -1) {
            sb.append(setCodeReadMicro(str, codeSetting.isMicroCode));
        }
        if (!(codesRules.inverseCode == -1 || codeSetting.inverseCode == -1)) {
            sb.append(setCodeReadInverse(str, codeSetting.inverseCode));
        }
        if (!(codesRules.formatMode == -1 || codeSetting.formatCode == -1)) {
            sb.append(setCodeFormatMode(str, codeSetting.formatCode));
        }
        return sb.toString();
    }

    public static String convertCmd(ServiceSetting serviceSetting, ServiceSetting old) {
        String str;
        StringBuilder sb = new StringBuilder();
        if (serviceSetting != null) {
            if(old.mOutCodeCharSet == serviceSetting.mOutCodeCharSet) {
                Log.i(SunmiHelper.class.getSimpleName(), "unchanged mOutCodeCharSet=" + serviceSetting.mOutCodeCharSet);
            } else {
                if (serviceSetting.mOutCodeCharSet < 0 || serviceSetting.mOutCodeCharSet > 11) {
                    Log.e(SunmiHelper.class.getSimpleName(), "set remote.mOutCodeCharSet isn't [0,11],now set.mOutCodeCharSet=" + serviceSetting.mOutCodeCharSet);
                } else {
                    sb.append(setOutCode(serviceSetting.mOutCodeCharSet));
                }
            }
// TODO
//            if(old.mOutCodeCharSet == serviceSetting.mOutCodeCharSet) {
//                Log.i(SunmiHelper.class.getSimpleName(), "unchanged mOutCodeCharSet=" + serviceSetting.mOutCodeCharSet);
//            } else {
                if (serviceSetting.mTips != null && serviceSetting.mTips.length == 2 && ((serviceSetting.mTips[0] == 0 || serviceSetting.mTips[0] == 1) && (serviceSetting.mTips[1] == 0 || serviceSetting.mTips[1] == 1 || serviceSetting.mTips[1] == -1))) {
                    sb.append(setTips(serviceSetting.mTips));
                } else {
                    Log.e(SunmiHelper.class.getSimpleName(), "set set.mTips value isn't [0,1],now set.mTips=" + Arrays.toString(serviceSetting.mTips));
                }
//            }

            if(old.mOutBroadcast == serviceSetting.mOutBroadcast) {
                Log.i(SunmiHelper.class.getSimpleName(), "unchanged mOutBroadcast=" + serviceSetting.mOutBroadcast);
            } else {
                if (serviceSetting.mOutBroadcast == 0 || serviceSetting.mOutBroadcast == 1) {
                    sb.append(setOutBroadcast(serviceSetting.mOutBroadcast));
                } else {
                    Log.e(SunmiHelper.class.getSimpleName(), "set set.mOutBroadcast value isn't [0,1],now set.mOutBroadcast=" + serviceSetting.mOutBroadcast);
                }
            }

            if(Objects.equals(old.mBroadcastAction, serviceSetting.mBroadcastAction)) {
                Log.i(SunmiHelper.class.getSimpleName(), "unchanged mBroadcastAction=" + serviceSetting.mBroadcastAction);
            } else {
                // TODO: set also if changed
                if (!"com.sunmi.scanner.ACTION_DATA_CODE_RECEIVED".equals(serviceSetting.mBroadcastAction)) {
                    sb.append(setOutBroadcastAction(serviceSetting.mBroadcastAction));
                } else {
                    Log.e(SunmiHelper.class.getSimpleName(), "set set.mBroadcastAction value is default");
                }
            }

            if(Objects.equals(old.mDataKey, serviceSetting.mDataKey)) {
                Log.i(SunmiHelper.class.getSimpleName(), "unchanged mDataKey=" + serviceSetting.mDataKey);
            } else {
                // TODO: set also if changed
                if (!"data".equals(serviceSetting.mDataKey)) {
                    sb.append(setOutBroadcastDataKey(serviceSetting.mDataKey));
                } else {
                    Log.e(SunmiHelper.class.getSimpleName(), "set set.mDataKey value is default");
                }
            }

            if(old.mByteKey == serviceSetting.mByteKey) {
                Log.i(SunmiHelper.class.getSimpleName(), "unchanged mByteKey=" + serviceSetting.mByteKey);
            } else {
                // TODO: set also if changed
                if (ScannerService.SOURCE.equals(serviceSetting.mByteKey)) {
                    Log.e(SunmiHelper.class.getSimpleName(), "set set.mByteKey value is default");
                } else if (!TextUtils.equals(serviceSetting.mByteKey, serviceSetting.mDataKey)) {
                    sb.append(setOutBroadcastByteKey(serviceSetting.mByteKey));
                } else {
                    Log.e(SunmiHelper.class.getSimpleName(), "set set.mByteKey equals set.mDataKey");
                }
            }


            if(old.mStartDecodeAction == serviceSetting.mStartDecodeAction) {
                Log.i(SunmiHelper.class.getSimpleName(), "unchanged mStartDecodeAction=" + serviceSetting.mStartDecodeAction);
            } else {
                // TODO: set also if changed
                String str2 = TextUtils.isEmpty(serviceSetting.mStartDecodeAction) ? " " : serviceSetting.mStartDecodeAction;
                if (" ".equals(str2) || !TextUtils.equals(str2, serviceSetting.mBroadcastAction)) {
                    sb.append(setStartDecodeBroadcastAction(str2));
                } else {
                    Log.e(SunmiHelper.class.getSimpleName(), "set set.mStartDecodeAction equals set.mBroadcastAction");
                }
            }


            if(Objects.equals(old.mEndDecodeAction, serviceSetting.mEndDecodeAction)) {
                Log.i(SunmiHelper.class.getSimpleName(), "unchanged mEndDecodeAction=" + serviceSetting.mEndDecodeAction);
            } else {
                String str22 = TextUtils.isEmpty(serviceSetting.mStartDecodeAction) ? " " : serviceSetting.mStartDecodeAction;
                if (TextUtils.isEmpty(serviceSetting.mEndDecodeAction)) {
                    str = " ";
                } else {
                    str = serviceSetting.mEndDecodeAction;
                }
                if (" ".equals(str) || (!TextUtils.equals(str, serviceSetting.mBroadcastAction) && (" ".equals(str22) || !TextUtils.equals(str, str22)))) {
                    sb.append(setEndDecodeBroadcastAction(str));
                } else {
                    Log.e(SunmiHelper.class.getSimpleName(), "set set.mEndDecodeAction equals set.mBroadcastAction");
                }
            }


            if(old.mOutCodeID == serviceSetting.mOutCodeID) {
                Log.i(SunmiHelper.class.getSimpleName(), "unchanged mOutCodeID=" + serviceSetting.mOutCodeID);
            } else {
                if (serviceSetting.mOutCodeID < 0 || serviceSetting.mOutCodeID > 3) {
                    Log.e(SunmiHelper.class.getSimpleName(), "set set.mOutCodeID value isn't [0,3],now set.mOutCodeID=" + serviceSetting.mOutCodeID);
                } else {
                    sb.append(setSetOutCodeID(serviceSetting.mOutCodeID));
                }
            }


            if(old.specificScene == serviceSetting.specificScene) {
                Log.i(SunmiHelper.class.getSimpleName(), "unchanged specificScene=" + serviceSetting.specificScene);
            } else {
                if (serviceSetting.specificScene < 0 || serviceSetting.specificScene > 5) {
                    Log.e(SunmiHelper.class.getSimpleName(), "set set.specificScene value isn't [0,5],now set.specificScene=" + serviceSetting.specificScene);
                } else {
                    sb.append(setSetScanSpecificScene(serviceSetting.specificScene));
                }
            }


            if(old.mOutType == serviceSetting.mOutType) {
                Log.i(SunmiHelper.class.getSimpleName(), "unchanged mOutType=" + serviceSetting.mOutType);
            } else {
                if (serviceSetting.mOutType < 0 || serviceSetting.mOutType > 3) {
                    Log.e(SunmiHelper.class.getSimpleName(), "set set.mOutType value isn't [0,3],now set.mOutType=" + serviceSetting.mOutType);
                } else {
                    sb.append(setOutType(serviceSetting.mOutType));
                }
            }


            if(old.mOutAutoAdd == serviceSetting.mOutAutoAdd) {
                Log.i(SunmiHelper.class.getSimpleName(), "unchanged mOutAutoAdd=" + serviceSetting.mOutAutoAdd);
            } else {
                if (serviceSetting.mOutAutoAdd != null && (serviceSetting.mOutAutoAdd.length == 3 || serviceSetting.mOutAutoAdd.length == 4) && ((serviceSetting.mOutAutoAdd[0] == 0 || serviceSetting.mOutAutoAdd[0] == 1) && (serviceSetting.mOutAutoAdd[1] == 0 || serviceSetting.mOutAutoAdd[1] == 1))) {
                    sb.append(setOutAutoAdd(serviceSetting.mOutAutoAdd));
                } else {
                    Log.e(SunmiHelper.class.getSimpleName(), "set set.mOutAutoAdd value isn't [0,1],now set.mOutAutoAdd=" + Arrays.toString(serviceSetting.mOutAutoAdd));
                }
            }


            if(old.mOutCharInterval == serviceSetting.mOutCharInterval) {
                Log.i(SunmiHelper.class.getSimpleName(), "unchanged mOutCharInterval=" + serviceSetting.mOutCharInterval);
            } else {
                if (serviceSetting.mOutCharInterval < 0 || serviceSetting.mOutCharInterval > 100) {
                    Log.e(SunmiHelper.class.getSimpleName(), "set set.mOutCharInterval value isn't [0,100],now set.mOutCharInterval=" + serviceSetting.mOutCharInterval);
                } else {
                    sb.append(setOutCharInterval(serviceSetting.mOutCharInterval));
                }
            }


            if(old.mPrefix == serviceSetting.mPrefix) {
                Log.i(SunmiHelper.class.getSimpleName(), "unchanged mPrefix=" + serviceSetting.mPrefix);
            } else {
                if (serviceSetting.mPrefix == 1 || serviceSetting.mPrefix == 0) {
                    sb.append(setPrefix(serviceSetting.mPrefix));
                } else {
                    Log.e(SunmiHelper.class.getSimpleName(), "set set.mPrefix value isn't [0,1],now set.mPrefix=" + serviceSetting.mPrefix);
                }
            }


            if(old.mSuffix == serviceSetting.mSuffix) {
                Log.i(SunmiHelper.class.getSimpleName(), "unchanged mSuffix=" + serviceSetting.mSuffix);
            } else {
                if (serviceSetting.mSuffix == 1 || serviceSetting.mSuffix == 0) {
                    sb.append(setSuffix(serviceSetting.mSuffix));
                } else {
                    Log.e(SunmiHelper.class.getSimpleName(), "set set.mSuffix value isn't [0,1],now set.mSuffix=" + serviceSetting.mSuffix);
                }
            }


            if(old.mRemoveGroupChar == serviceSetting.mRemoveGroupChar) {
                Log.i(SunmiHelper.class.getSimpleName(), "unchanged mRemoveGroupChar=" + serviceSetting.mRemoveGroupChar);
            } else {
                if (serviceSetting.mRemoveGroupChar == 1 || serviceSetting.mRemoveGroupChar == 0) {
                    sb.append(setRemoveGroupChar(serviceSetting.mRemoveGroupChar));
                } else {
                    Log.e(SunmiHelper.class.getSimpleName(), "set set.mRemoveGroupChar value isn't [0,1],now set.mRemoveGroupChar=" + serviceSetting.mRemoveGroupChar);
                }
            }


            if(Objects.equals(old.mPrefixContext, serviceSetting.mPrefixContext)) {
                Log.i(SunmiHelper.class.getSimpleName(), "unchanged mPrefixContext=" + serviceSetting.mPrefixContext);
            } else {
                if (serviceSetting.mPrefixContext == null || serviceSetting.mPrefixContext.isEmpty() || !Pattern.compile("^[\\x00-\\xFF]+$").matcher(serviceSetting.mPrefixContext).matches()) {
                    sb.append(setPrefixContext(ScannerService.FIX_NULL));
                    Log.e(SunmiHelper.class.getSimpleName(), "set set.mPrefixContext value isn't ASCII,now set.mPrefixContext=" + serviceSetting.mPrefixContext);
                } else {
                    sb.append(setPrefixContext(serviceSetting.mPrefixContext));
                }
            }


            if(Objects.equals(old.mSuffixContext, serviceSetting.mSuffixContext)) {
                Log.i(SunmiHelper.class.getSimpleName(), "unchanged mSuffixContext=" + serviceSetting.mSuffixContext);
            } else {
                if (serviceSetting.mSuffixContext == null || serviceSetting.mSuffixContext.isEmpty() || !Pattern.compile("^[\\x00-\\xFF]+$").matcher(serviceSetting.mSuffixContext).matches()) {
                    sb.append(setSuffixContext(ScannerService.FIX_NULL));
                    Log.e(SunmiHelper.class.getSimpleName(), "set set.mSuffixContext value isn't ASCII,now set.mSuffixContext=" + serviceSetting.mSuffixContext);
                } else {
                    sb.append(setSuffixContext(serviceSetting.mSuffixContext));
                }
            }


            if(old.mTriggerMethod == serviceSetting.mTriggerMethod) {
                Log.i(SunmiHelper.class.getSimpleName(), "unchanged mTriggerMethod=" + serviceSetting.mTriggerMethod);
            } else {
                if (serviceSetting.mTriggerMethod < 0 || serviceSetting.mTriggerMethod > 3) {
                    Log.e(SunmiHelper.class.getSimpleName(), "set set.mTriggerMethod value isn't [0,3],now set.mTriggerMethod=" + serviceSetting.mTriggerMethod);
                } else {
                    sb.append(setTriggerMethod(serviceSetting.mTriggerMethod));
                    sb.append(setScanTriggerModel(serviceSetting.mTriggerMethod));
                }
            }


            if(old.mPrefixCount == serviceSetting.mPrefixCount) {
                Log.i(SunmiHelper.class.getSimpleName(), "unchanged mPrefixCount=" + serviceSetting.mPrefixCount);
            } else {
                if (serviceSetting.mPrefixCount < 0 || serviceSetting.mPrefixCount > 20) {
                    Log.e(SunmiHelper.class.getSimpleName(), "set set.mPrefixCount value isn't [0,20],now set.mPrefixCount=" + serviceSetting.mPrefixCount);
                } else {
                    sb.append(setPrefixCount(serviceSetting.mPrefixCount));
                }
            }


            if(old.mSuffixCount == serviceSetting.mSuffixCount) {
                Log.i(SunmiHelper.class.getSimpleName(), "unchanged mSuffixCount=" + serviceSetting.mSuffixCount);
            } else {
                if (serviceSetting.mSuffixCount < 0 || serviceSetting.mSuffixCount > 20) {
                    Log.e(SunmiHelper.class.getSimpleName(), "set set.mSuffixCount value isn't [0,20],now set.mSuffixCount=" + serviceSetting.mSuffixCount);
                } else {
                    sb.append(setSuffixCount(serviceSetting.mSuffixCount));
                }
            }


            if(old.mTriggerTimeOut == serviceSetting.mTriggerTimeOut) {
                Log.i(SunmiHelper.class.getSimpleName(), "unchanged mTriggerTimeOut=" + serviceSetting.mTriggerTimeOut);
            } else {
                if (serviceSetting.mTriggerTimeOut < 1000) {
                    serviceSetting.mTriggerTimeOut = 1000;
                }
                if (serviceSetting.mTriggerTimeOut > 9000) {
                    Log.e(SunmiHelper.class.getSimpleName(), "set set.mTriggerTimeOut value isn't [1000,9000],now set.mTriggerTimeOut=" + serviceSetting.mTriggerTimeOut);
                } else {
                    int i = 5000;
                    sb.append(setTriggerOverTime(serviceSetting.mTriggerMethod == 2 ? serviceSetting.mTriggerTimeOut : 5000));
                    if (serviceSetting.mTriggerMethod == 2) {
                        i = serviceSetting.mTriggerTimeOut;
                    }
                    sb.append(setScanTriggerTimeOut(i));
                }
            }


            if(old.mDecodeMode == serviceSetting.mDecodeMode) {
                Log.i(SunmiHelper.class.getSimpleName(), "unchanged mDecodeMode=" + serviceSetting.mDecodeMode);
            } else {
                if (serviceSetting.mDecodeMode == 0 || serviceSetting.mDecodeMode == 1) {
                    sb.append(setDecodeAreaMode(serviceSetting.mDecodeMode));
                    if (serviceSetting.mDecodeWindowPercent < 0 || serviceSetting.mDecodeWindowPercent > 100) {
                        Log.e(SunmiHelper.class.getSimpleName(), "set set.mDecodeWindowPercent value isn't [0,100],now set.mDecodeWindowPercent=" + serviceSetting.mDecodeWindowPercent);
                    } else {
                        sb.append(setDecodeAreaPercent(serviceSetting.mDecodeWindowPercent));
                    }
                } else {
                    Log.e(SunmiHelper.class.getSimpleName(), "set set.mDecodeMode value isn't [0,1],now set.mDecodeMode=" + serviceSetting.mDecodeMode);
                }
            }


            if(old.mCenterFlagScan == serviceSetting.mCenterFlagScan) {
                Log.i(SunmiHelper.class.getSimpleName(), "unchanged mCenterFlagScan=" + serviceSetting.mCenterFlagScan);
            } else {
                if (serviceSetting.mCenterFlagScan < 0 || serviceSetting.mCenterFlagScan > 2) {
                    Log.e(SunmiHelper.class.getSimpleName(), "set set.mCenterFlagScan value isn't [0,2],now set.mCenterFlagScan=" + serviceSetting.mCenterFlagScan);
                } else {
                    sb.append(setCenterFlagScan(serviceSetting.mCenterFlagScan));
                }
            }


            if(old.mAdvancedFormat == serviceSetting.mAdvancedFormat) {
                Log.i(SunmiHelper.class.getSimpleName(), "unchanged mAdvancedFormat=" + serviceSetting.mAdvancedFormat);
            } else {
                if (serviceSetting.mAdvancedFormat == 1 || serviceSetting.mAdvancedFormat == 0) {
                    sb.append(setAdvancedFormat(serviceSetting.mAdvancedFormat));
                } else {
                    Log.e(SunmiHelper.class.getSimpleName(), "set set.mAdvancedFormat value is not [0,1],now set.mAdvancedFormat=" + serviceSetting.mAdvancedFormat);
                }
            }


            if(old.scanExpSwitch == serviceSetting.scanExpSwitch) {
                Log.i(SunmiHelper.class.getSimpleName(), "unchanged scanExpSwitch=" + serviceSetting.scanExpSwitch);
            } else {
                if (serviceSetting.scanExpSwitch == 1 || serviceSetting.scanExpSwitch == 0) {
                    sb.append(setFlashControl(serviceSetting.scanExpSwitch));
                } else {
                    Log.e(SunmiHelper.class.getSimpleName(), "set set.scanExpSwitch value is not [0,1],now set.scanExpSwitch=" + serviceSetting.scanExpSwitch);
                }
            }

//          TODO
//            if(old.mOutCodeCharSet == serviceSetting.mOutCodeCharSet) {
//                Log.i(SunmiHelper.class.getSimpleName(), "unchanged mOutCodeCharSet=" + serviceSetting.mOutCodeCharSet);
//            } else {
                if (serviceSetting.advancedConfig == null || serviceSetting.advancedConfig.size() <= 0) {
                    sb.append(setAdvancedFormatClear(1));
                    Log.e(SunmiHelper.class.getSimpleName(), "set set.mAdvancedFormat.size() is zero,set.getAdvancedConfig()=" + serviceSetting.getAdvancedConfig());
                } else {
                    sb.append(setAdvancedFormatClear(1));
                    Iterator<Pair> it = serviceSetting.getAdvancedConfig().iterator();
                    while (it.hasNext()) {
                        Pair next = it.next();
                        sb.append(setAdvancedFormatAdd(new String[]{next.first, next.second}));
                    }
                }
//            }
        } else {
            Log.e(SunmiHelper.class.getSimpleName(), "set config is null!");
        }
        return sb.toString();
    }

    public static String convertCmd(List<CodeSets> list, List<CodeSets> list2, boolean z) {
        CodeSets codeSets;
        StringBuilder sb = new StringBuilder();
        if (list != null) {
            for (CodeSets next : list) {
                if (next != null) {
                    sb.append(setCodeEnable(next.name, next.enable));
                    if (!((!z && !next.isSetting) || next.codeSetting == null || next.codeRules == null)) {
                        if (list2 != null) {
                            int indexOf = list2.indexOf(next);
                            if (!(indexOf == -1 || (codeSets = list2.get(indexOf)) == null)) {
                                sb.append(convertCmd(next.name, codeSets.codeRules, next.codeSetting));
                            }
                        } else {
                            sb.append(convertCmd(next.name, next.codeRules, next.codeSetting));
                        }
                    }
                }
            }
        }
        return sb.toString();
    }

//    public static Pair convertCmd(RemoteConfig remoteConfig, DefaultConfig defaultConfig) {
//        Log.d(SunmiHelper.class.getSimpleName(), "remote config:" + remoteConfig);
//        if (remoteConfig == null || remoteConfig.data == null || remoteConfig.data.size() <= 0 || remoteConfig.data.get(0) == null) {
//            return null;
//        }
//        try {
//            RemoteConfig.DataBean dataBean = remoteConfig.data.get(0);
//            return new Pair(convertCmd(dataBean.getServiceSetting()), convertCmd(dataBean.getAllCode(), defaultConfig.allCode, false));
//        } catch (Exception e) {
//            e.printStackTrace();
//            return null;
//        }
//    }

    public static String queryScanCmd(String str) {
        return createCmd(QUERY_SCAN_CMD, str);
    }

    public static String queryCodeSetting(String str) {
        str.hashCode();
        char c = 65535;
        switch (str.hashCode()) {
            case -2140164507:
                if (str.equals(CodeConstants.JAPAN_POSTAL)) {
                    c = 0;
                    break;
                }
                break;
            case -1939698872:
                if (str.equals("PDF417")) {
                    c = 1;
                    break;
                }
                break;
            case -1812777107:
                if (str.equals(CodeConstants.COOP_2OF5)) {
                    c = 2;
                    break;
                }
                break;
            case -1785566351:
                if (str.equals(CodeConstants.UPC_E1)) {
                    c = 3;
                    break;
                }
                break;
            case -1688587926:
                if (str.equals(CodeConstants.CODABAR)) {
                    c = 4;
                    break;
                }
                break;
            case -1688533741:
                if (str.equals(CodeConstants.CODE_11)) {
                    c = 5;
                    break;
                }
                break;
            case -1688533678:
                if (str.equals(CodeConstants.CODE_32)) {
                    c = 6;
                    break;
                }
                break;
            case -1688533671:
                if (str.equals(CodeConstants.CODE_39)) {
                    c = 7;
                    break;
                }
                break;
            case -1688533640:
                if (str.equals(CodeConstants.CODE_49)) {
                    c = 8;
                    break;
                }
                break;
            case -1688533491:
                if (str.equals(CodeConstants.CODE_93)) {
                    c = 9;
                    break;
                }
                break;
            case -1646072357:
                if (str.equals(CodeConstants.GRID_MATRIX)) {
                    c = 10;
                    break;
                }
                break;
            case -1548045674:
                if (str.equals(CodeConstants.KOREA_POST)) {
                    c = 11;
                    break;
                }
                break;
            case -1513352222:
                if (str.equals(CodeConstants.COMPOSITE_UPC)) {
                    c = 12;
                    break;
                }
                break;
            case -1461130479:
                if (str.equals(CodeConstants.INTERLEAVED_2OF5)) {
                    c = 13;
                    break;
                }
                break;
            case -1414551947:
                if (str.equals(CodeConstants.KOREAN_3OF5)) {
                    c = 14;
                    break;
                }
                break;
            case -860541965:
                if (str.equals(CodeConstants.MSI_PLESSEY)) {
                    c = 15;
                    break;
                }
                break;
            case -845049609:
                if (str.equals(CodeConstants.DATA_MATRIX)) {
                    c = 16;
                    break;
                }
                break;
            case -804938332:
                if (str.equals(CodeConstants.CODE_128)) {
                    c = 17;
                    break;
                }
                break;
            case -804938189:
                if (str.equals(CodeConstants.CODE_16K)) {
                    c = 18;
                    break;
                }
                break;
            case -804907597:
                if (str.equals(CodeConstants.CODE_ONE)) {
                    c = 19;
                    break;
                }
                break;
            case -787189066:
                if (str.equals(CodeConstants.DOT_CODE)) {
                    c = 20;
                    break;
                }
                break;
            case -756663504:
                if (str.equals(CodeConstants.MICRO_QR_CODE)) {
                    c = 21;
                    break;
                }
                break;
            case -716287563:
                if (str.equals(CodeConstants.UK_POSTAL)) {
                    c = 22;
                    break;
                }
                break;
            case -663928176:
                if (str.equals(CodeConstants.DEUTSCHE_POST_IDENTCODE)) {
                    c = 23;
                    break;
                }
                break;
            case -601264383:
                if (str.equals(CodeConstants.GS1_DATABAR)) {
                    c = 24;
                    break;
                }
                break;
            case -189027409:
                if (str.equals(CodeConstants.UCC_EAN_128)) {
                    c = 25;
                    break;
                }
                break;
            case -20549826:
                if (str.equals(CodeConstants.DEUTSCHE_POST_LEITCODE)) {
                    c = '\u001a';
                    break;
                }
                break;
            case 2256630:
                if (str.equals("ISBN")) {
                    c = 27;
                    break;
                }
                break;
            case 63778073:
                if (str.equals(CodeConstants.AZTEC)) {
                    c = 28;
                    break;
                }
                break;
            case 65735370:
                if (str.equals(CodeConstants.EAN_8)) {
                    c = 29;
                    break;
                }
                break;
            case 80948412:
                if (str.equals(CodeConstants.UPC_A)) {
                    c = 30;
                    break;
                }
                break;
            case 80948416:
                if (str.equals(CodeConstants.UPC_E)) {
                    c = 31;
                    break;
                }
                break;
            case 235302159:
                if (str.equals(CodeConstants.TELEPEN)) {
                    c = ' ';
                    break;
                }
                break;
            case 268885517:
                if (str.equals(CodeConstants.CHINESE_2OF5)) {
                    c = '!';
                    break;
                }
                break;
            case 337980794:
                if (str.equals(CodeConstants.US_PLANET)) {
                    c = Typography.quote;
                    break;
                }
                break;
            case 350790724:
                if (str.equals(CodeConstants.MICRO_PDF417)) {
                    c = '#';
                    break;
                }
                break;
            case 650933023:
                if (str.equals(CodeConstants.USPS_INTELLIGENT_MAIL)) {
                    c = Typography.dollar;
                    break;
                }
                break;
            case 665923772:
                if (str.equals(CodeConstants.AIM_128)) {
                    c = '%';
                    break;
                }
                break;
            case 683516425:
                if (str.equals(CodeConstants.CHINA_POST)) {
                    c = Typography.amp;
                    break;
                }
                break;
            case 764968996:
                if (str.equals(CodeConstants.CODABLOCK)) {
                    c = '\'';
                    break;
                }
                break;
            case 828938442:
                if (str.equals(CodeConstants.COMPOSITE_C)) {
                    c = '(';
                    break;
                }
                break;
            case 992598803:
                if (str.equals(CodeConstants.ISBT_128)) {
                    c = ')';
                    break;
                }
                break;
            case 1103539727:
                if (str.equals(CodeConstants.COMPOSITE_UCC)) {
                    c = '*';
                    break;
                }
                break;
            case 1174614109:
                if (str.equals(CodeConstants.PLESSEY)) {
                    c = '+';
                    break;
                }
                break;
            case 1252603052:
                if (str.equals(CodeConstants.QR_CODE)) {
                    c = ',';
                    break;
                }
                break;
            case 1258010181:
                if (str.equals(CodeConstants.HAN_XIN_CODE)) {
                    c = '-';
                    break;
                }
                break;
            case 1371066030:
                if (str.equals(CodeConstants.ROYAL_MAIL_CUSTOMER)) {
                    c = '.';
                    break;
                }
                break;
            case 1467990721:
                if (str.equals(CodeConstants.INDUSTRIAL_2OF5)) {
                    c = '/';
                    break;
                }
                break;
            case 1474160234:
                if (str.equals(CodeConstants.ISSN_EAN)) {
                    c = '0';
                    break;
                }
                break;
            case 1572678777:
                if (str.equals(CodeConstants.MATRIX_2OF5)) {
                    c = '1';
                    break;
                }
                break;
            case 1719706366:
                if (str.equals(CodeConstants.AUSTRALIN_POSTAL)) {
                    c = '2';
                    break;
                }
                break;
            case 1854514753:
                if (str.equals(CodeConstants.DISCRETE_2OF5)) {
                    c = '3';
                    break;
                }
                break;
            case 1874345843:
                if (str.equals(CodeConstants.C_1D_BARCODE)) {
                    c = '4';
                    break;
                }
                break;
            case 1883675133:
                if (str.equals(CodeConstants.STANDARD_2OF5)) {
                    c = '5';
                    break;
                }
                break;
            case 1977816488:
                if (str.equals(CodeConstants.MAXI_CODE)) {
                    c = '6';
                    break;
                }
                break;
            case 1990167899:
                if (str.equals(CodeConstants.US_POSTNET)) {
                    c = '7';
                    break;
                }
                break;
            case 2037796304:
                if (str.equals(CodeConstants.EAN_13)) {
                    c = '8';
                    break;
                }
                break;
            case 2040892603:
                if (str.equals(CodeConstants.COMPOSITE_AB)) {
                    c = '9';
                    break;
                }
                break;
        }
        switch (c) {
            case 0:
                return QUERY_JAPAN_POSTAL_SETTING;
            case 1:
                return QUERY_PDF417_SETTING;
            case 2:
                return QUERY_COOP_2OF5_SETTING;
            case 3:
                return QUERY_UPC_E1_SETTING;
            case 4:
                return QUERY_CODABAR_SETTING;
            case 5:
                return QUERY_CODE11_SETTING;
            case 6:
                return QUERY_CODE32_SETTING;
            case 7:
                return QUERY_CODE39_SETTING;
            case 8:
                return QUERY_CODE49_SETTING;
            case 9:
                return QUERY_CODE93_SETTING;
            case 10:
                return QUERY_GRID_MATRIX_SETTING;
            case 11:
                return QUERY_KOREA_POST_SETTING;
            case 12:
                return QUERY_UPC_EAN_COMPOSITE_SETTING;
            case 13:
                return QUERY_INTERLEAVED_2OF5_SETTING;
            case 14:
                return QUERY_KOREAN_3OF5_SETTING;
            case 15:
                return QUERY_MSI_PLESSEY_SETTING;
            case 16:
                return QUERY_DATA_MATRIX_SETTING;
            case 17:
                return QUERY_CODE128_SETTING;
            case 18:
                return QUERY_CODE_16K_SETTING;
            case 19:
                return QUERY_CODE_ONE_SETTING;
            case 20:
                return QUERY_DOT_CODE_SETTING;
            case 21:
                return QUERY_MICRO_QR_CODE_SETTING;
            case 22:
                return QUERY_UK_POSTAL_SETTING;
            case 23:
                return QUERY_DEUTSCHE_POST_IDENTCODE_SETTING;
            case 24:
                return QUERY_GS1DATABAR_SETTING;
            case 25:
                return QUERY_UCCEAN128_SETTING;
            case 26:
                return QUERY_DEUTSCHE_POST_LEITCODE_SETTING;
            case 27:
                return QUERY_ISBN_SETTING;
            case 28:
                return QUERY_AZTEC_SETTING;
            case 29:
                return QUERY_EAN8_SETTING;
            case 30:
                return QUERY_UPC_A_SETTING;
            case 31:
                return QUERY_UPC_E_SETTING;
            case ' ':
                return QUERY_TELEPEN_SETTING;
            case '!':
                return QUERY_CHINESE_2OF5_SETTING;
            case '\"':
                return QUERY_US_PLANET_SETTING;
            case '#':
                return QUERY_MICRO_PDF417_SETTING;
            case '$':
                return QUERY_USPS_INTELLIGENT_MAIL_SETTING;
            case '%':
                return QUERY_AIM128_SETTING;
            case '&':
                return QUERY_CHINA_POST_SETTING;
            case '\'':
                return QUERY_CODABLOCK_SETTING;
            case '(':
                return QUERY_COMPOSITE_C_SETTING;
            case ')':
                return QUERY_ISBT128_SETTING;
            case '*':
                return QUERY_EAN_UCC_COMPOSITE_SETTING;
            case '+':
                return QUERY_PLESSEY_SETTING;
            case ',':
                return QUERY_QR_CODE_SETTING;
            case '-':
                return QUERY_HANXIN_CODE_SETTING;
            case '.':
                return QUERY_ROYAL_MAIL_CUSTOMER_SETTING;
            case '/':
                return QUERY_INDUSTRIAL_2OF5_SETTING;
            case '0':
                return QUERY_ISSN_EAN_SETTING;
            case '1':
                return QUERY_MATRIX_2OF5_SETTING;
            case '2':
                return QUERY_AUSTRALIN_POSTAL_SETTING;
            case '3':
                return QUERY_DISCRETE_2OF5_SETTING;
            case '4':
                return QUERY_1D_BARCODE_SETTING;
            case '5':
                return QUERY_STANDARD_2OF5_SETTING;
            case '6':
                return QUERY_MAXI_CODE_SETTING;
            case '7':
                return QUERY_US_POSTNET_SETTING;
            case '8':
                return QUERY_EAN13_SETTING;
            case '9':
                return QUERY_COMPOSITE_AB_SETTING;
            default:
                return "";
        }
    }

    public static boolean isNotNull(String str) {
        return str != null && !str.isEmpty();
    }

    public static boolean containsEqual(String str) {
        return containsCmd(str, "=");
    }

    public static boolean containsCmd(String str, String str2) {
        return isNotNull(str) && str.contains(str2);
    }

    public static boolean startWithCmd(String str, String str2) {
        return isNotNull(str) && str.startsWith(str2);
    }

    public static boolean isSunmiCmd(String str) {
        return startWithCmd(str, SUNMI);
    }

    public static boolean isScanCmd(String str) {
        return startWithCmd(str, SCAN);
    }

    public static boolean isSetCmd(String str) {
        return str.length() >= 13 && (isSunmiCmd(str) || isScanCmd(str)) && containsEqual(str);
    }

    public static boolean isTrue(String str) {
        return "1".equals(str);
    }

    public static String createCmd(String str, int i) {
        return str + "=" + i + ";";
    }

    public static String createCmd(String str, String str2) {
        return str + "=" + str2 + ";";
    }

    public static String createCmd(String str, int[] iArr) {
        return str + "=" + getValueString(iArr) + ";";
    }

    public static String createCmd(String str, String[] strArr) {
        return str + "=" + getValueString(strArr) + ";";
    }

    public static String getValueString(int[] iArr) {
        StringBuilder sb = new StringBuilder();
        sb.append(iArr[0]);
        for (int i = 1; i < iArr.length; i++) {
            sb.append(",");
            sb.append(iArr[i]);
        }
        return sb.toString();
    }

    public static String getValueString(String[] strArr) {
        StringBuilder sb = new StringBuilder();
        sb.append(strArr[0]);
        for (int i = 1; i < strArr.length; i++) {
            sb.append(",");
            sb.append(strArr[i]);
        }
        return sb.toString();
    }

    public static String[] getValueStringArr(String str) {
        return isNotNull(str) ? str.split(",") : new String[0];
    }

    public static int[] getValueIntArr(String str) {
        String[] split = str.split(",");
        int[] iArr = new int[split.length];
        for (int i = 0; i < split.length; i++) {
            iArr[i] = Integer.parseInt(split[i]);
        }
        return iArr;
    }
}

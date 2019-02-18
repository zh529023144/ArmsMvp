package com.xinghuo.commonlib.app.Constants;




/**
 * @创建者 CSDN_LQR
 * @描述 全局常量类
 */
public class AppConst {

    public static final String TAG = "ZHANG_LOG";

    public static final String REGION = "86";

    /*================== 广播Action begin ==================*/
    //全局数据获取
    public static final String FETCH_COMPLETE = "fetch_complete";
    //好友
    public static final String UPDATE_FRIEND = "update_friend";
    public static final String UPDATE_RED_DOT = "update_red_dot";
    //群组
    public static final String UPDATE_GROUP_NAME = "update_group_name";
    public static final String GROUP_LIST_UPDATE = "group_list_update";
    public static final String UPDATE_GROUP = "update_group";
    public static final String UPDATE_GROUP_MEMBER = "update_group_member";
    public static final String GROUP_DISMISS = "group_dismiss";
    //个人信息
    public static final String CHANGE_INFO_FOR_ME = "change_info_for_me";
    public static final String CHANGE_INFO_FOR_CHANGE_NAME = "change_info_for_change_name";
    public static final String CHANGE_INFO_FOR_USER_INFO = "change_info_for_user_info";
    //会话
    public static final String UPDATE_CONVERSATIONS = "update_conversations";
    public static final String UPDATE_CURRENT_SESSION = "update_current_session";
    public static final String UPDATE_CURRENT_SESSION_NAME = "update_current_session_name";
    public static final String REFRESH_CURRENT_SESSION = "refresh_current_session";
    public static final String CLOSE_CURRENT_SESSION = "close_current_session";
    /*================== 广播Action end ==================*/


    //wifi 热点配置
    public static final String WIFI_SSID = "XH_WIFIGLASS";
    public static final String WIFI_PASSWORD = "12345678";
    public static final int CHECK_WIFI_CONNECT_NUM = 300;

    public static final String THEME_ROOT_TITLE = "我的主题";

    /**
     * true手机网络  false无线WiFi
     */
    public static boolean b_type = false;

    /**
     * 保存用户信息时使用
     */
    public static final class User {
        public static final String USER = "USER";
        public static final String POLICE_NO = "POLICE_NO";
        public static final String ID = "id";
        public static final String USER_ORGID = "userOrgid";
        public static final String NAME = "name";
        public static final String TOKEN = "token";
        public static final String GLASSMAC = "mac_glass";
        public static final String ID_NUM = "id_num";
        public static final String PASSWORD = "password";

        public static final String CURRENT_FACTOR_NAME = "current_factor_name";
        public static final String CURRENT_ACTIVITY = "current_activity";
        // 当前接收的来自xxx消息的id
        public static String CURRENT_SEND_ID = "";
        public static final long TIME_RECENT = 1000*60*2;
    }

    public interface DB {
        long LIST_MODULE_ID = 10000;
        long CHANNEL_MODULE_ID = 10001;
        long MAP_MODULE_ID = 10002;
        long CASE_MODULE_ID = 10003;

        long CHANNEL_BROWSE_MODULE_ID = 10004;
        long CAMERA_BROWSE_MODULE_ID = 10005;


        String THEME_ROOT_PID = "THEME_ROOT_PID";
        String CONTACT_ROOT_PID = "CONTACT_ROOT_PID";
    }

    /**
     * SharedPreference
     */
    public interface SP {
        // 列表搜索历史记录
        String KEY_LIST_SEARCH = "KEY_LIST_SEARCH";
    }

    public static final class Image {
        public static final String ORG_PIC = "org_pic";
        public static final String FACE_PIC = "face_pic";
        //        public static final String ACCOUNT = "account";
        public static final String POLICE_ORG = "police_org";
        public static final String POLICE_FACE = "police_face";

        public static final String ICON_3A = "icon_3a";
        public static final String SHOULD_UPLOAD = "should_upload";
        public static final String UPLOADED = "uploaded";
    }

    public static final class AaaUrl {
//        public static final String APP_URL_190 = "http://190.15.116.36:8082/xEyeWeb/";//36测试环境
//                public static final String APP_URL_190 = "http://190.15.116.35:8082/xEyeWeb/";//35测试环境
        //public static final String APP_URL_190 = "http://190.15.116.8:8082/xEyeWeb/";//测试环境
        public static final String APP_URL_190 = "http://190.15.116.6:9092/xEyeWeb/";//正式环境
        public static final String APP_URL_172 = "http://172.28.0.35:9092/xEyeWeb/";
        public static final String registCenterUrl = "172.28.3.38";
        public static final String MAP_SERVICE_URL = ConfigUrl.Config_URL_MAP + "/arcgis/rest/services/SERVICE_FOR_TEST/GGSZSL11_20/MapServer";
//        public static final String GETFIRSTFORGUID = ApiService.BASE_URL_new + "/faceRecog/faceApp/uploadImage";
//        public static final String SUBMIT = ApiService.BASE_URL_new + "/faceRecog/faceApp/AppsearchFaces";
//        public static final String LOGINFACE = ApiService.BASE_URL_new + "/faceRecog/faceApp/FaceLogin";
//        public static final String SURE = ApiService.BASE_URL_new + "/faceRecog/faceApp/comfirmFace";
        public static final String TEST = "https://api.tuchong.com/";
    }

    public static final class ConfigUrl {
        public static String Config_URL_XL = "";//信令
        public static String Config_URL_MAP = "";//地图
        public static String Config_URL_PIC = "";//图片
        // 消息推送
        public static String WEBSOCKET_URL = "";
    }

    public static final class Permission {
        public static final int CODE = 100;
        public static final int RESULTCOUNTS_SUCCESS = 0;
        //        public static final String ACCOUNT = "account";
        public static final int RESULTCOUNTS_ERROR = -1;
        public static final String DUIBIKU = "duibi_ku";
    }

    public static final class SystemConfig {
        public static final String SYETEM_MOVE = "system_move";//
        public static final String SYETEM_SOUND = "system_sound";//

        public static final String TO_REPEAT = "to_repeat";//
        public static final String THRESHOLD = "threshold";//

        public static final String TO_PUBLISHER = "to_publisher";
        public static final String TO_HDVIDEO = "to_HDVIDEO";
    }


    public static final class ThirdRemove {
        public static final String CHANNEL_THIRD_REMOVE = "channel_third_remove";//
    }

    /**
     * 保存服务器返回的数据时使用(不强制要求保存，视情况而定)
     */
    public static final class ServerResponseData {
        /**
         * 分类案件筛选条件
         */
        public static final String CLASSIFY_CASE_FILTER_CONDITION = "classify_case_filter_condition";
    }

    public static final class PlayType {
        //实时监控
        public static final String PLAY_TYPE = "PLAY_TYPE";
        public static final int PLAY_TYPE_LB = 0;  //列表播放类型
        public static final int PLAY_TYPE_PD = 1;   //频道列表播放类型
        public static final int PLAY_TYPE_PD_HOT = 2;// 频道热门播放类型
        public static final int PLAY_TYPE_MAP = 3;  //地图镜头播放类型
        public static final int PLAY_TYPE_JTSC = 4;
        public static final int PLAY_TYPE_SEARCH = 5;
        public static final int PLAY_TYPE_THEME = 5;  // 主题

        public static final int OP_LB_LX = 0;       //录像
        public static final int OP_LB_JT = 1;       //截图
        public static final int OP_LB_FX = 2;       //分享
        public static final int OP_LB_PL = 3;       //评论
        public static final int OP_LB_HF = 4;       //回放
        public static final int OP_LB_YTKZ = 5;       //云台控制
        public static final int OP_LB_JTSC = 6;     //镜头收藏


        //案件播放

        public static final String CASE_TYPE = "CASE_TYPE";
        public static final int CASE_PLAY_RM = 0;  //热门案件
        public static final int CASE_PLAY_ZX = 1;  //最新案件
        public static final int CASE_PLAY_FL = 2;  //分类案件

        public static final int OP_CASE_SC = 0;      //案件收藏
    }

//    //语音存放位置
//    public static final String AUDIO_SAVE_DIR = FileUtils.getDir("audio");
//    public static final int DEFAULT_MAX_AUDIO_RECORD_TIME_SECOND = 120;
//    //视频存放位置
//    public static final String VIDEO_SAVE_DIR = FileUtils.getDir("video");
//    //照片存放位置
//    public static final String PHOTO_SAVE_DIR = FileUtils.getDir("photo");
//    //头像保存位置
//    public static final String HEADER_SAVE_DIR = FileUtils.getDir("header");
//
//    //头像保存位置
//    public static final String LIB_SAVE_DIR = FileUtils.getDir("lib");

    // 锁屏 亮屏 广播
    public static final String SCREEN_ON = "android.intent.action.SCREEN_ON";
    public static final String SCREEN_OFF = "android.intent.action.SCREEN_OFF";
    public static final String USER_PRESENT = "android.intent.action.USER_PRESENT";


    // 查询眼镜IP
    public static final int CHECK_WIFI_IP = 100;
    public static final int GETGLASSPATH = 101;

    //上传采集图片阈值
    public static final int MAX_UPLOAD = 5;

    // 一键报障
    public static final String ONE_WARN = "one_warn";
    //一键分享
    public static final String ONE_SHARE = "one_share";
    //一键镜头收藏
    public static final String CAMERA_COLLECT = "camera_collect";


    public interface net {
        int IDLE = 0;
        int LOADING = 1;
        int SUCCEED = 2;
        int FAILED = 3;
    }

    //地图默认地址  GCJ02 坐标系
    public interface MAP_LOCATION {
        double LON = 114.06087901306853;
        double LAT = 22.547557212421896;
    }
}

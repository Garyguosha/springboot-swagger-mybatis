package com.lamd.commin.Constants;

public class Constant {
    //  全局配置
    public final static int False = 0;
    public final static int True = 1;

    public final static String kCode_Success = "0";          //  成功
    public final static String kCode_Fail = "1";          //  失败
    public final static String kCode_NULL = "2";
    public final static String kCode_UnAuth = "2000";       //  没有权限
    public final static String kCode_SessionError = "2001";       //  登陆超时

    public final static String kDefaultTimeZone = "GMT+8";      //  默认时区

    //  后台管理系统单页记录数量
    public final static int kAdmin_PageSize = 20;
    public final static int kApi_PageSize = 2;

    //  Token秘钥
    public final static String kToken_Secret = "waNgtIansOft";
    //  接口token缓存
    public static final long TOKEN_EXPIRES_DAY = 7;

    //  认证信息
    public static final String kAuth_tokenResult = "tokenResult";
    public static final String kAuth_xAccessToken = "x-access-token";

    //  cookie保存
    public static final String kHashCookie = "kHashCookie";
    public static final String kCookie_Spokeo = "spokeo";
    public static final String kCookie_icris = "icris";
    public static final String kCookie_neighborwho = "neighborwho";
    public static final String kCookie_indeed = "indeed";
    public static final String kCookie_familytreenow = "familytreenow";
    public static final String kCookie_veromi = "veromi";
    public static final String[] kCookies = new String[]{
            kCookie_Spokeo, kCookie_icris, kCookie_neighborwho, kCookie_indeed, kCookie_familytreenow, kCookie_veromi
    };

    //  不同搜索类型
    public static final Integer Simple_Search = 0;
    public static final Integer Single_Search = 1;
    public static final Integer Advanced_Search = 2;

    //  每天验证码最大发送次数
    public static final Integer EMAIL_CODE_COUNT = 10;

    //  验证码位数
    public static final Integer Email_Code_Num = 6;

    //  人员预览类型 0/人物 1/组织 2/其他
    public static final int VIEWTYPE_people = 0;
    public static final int VIEWTYPE_organization = 1;
    public static final int VIEWTYPE_other = 2;

    //  下载word参数数量 人物 组织 其他
    public static final int PARAMETER_NUM_people = 26;
    public static final int PARAMETER_NUM_organization = 19;
    public static final int PARAMETER_NUM_other = 3;


    //  cache
    public final static String kRedis_IndexCV = "IndexCV";
    public final static String kRedis_TodayCV = "TodayCV";
    public final static String kRedis_UserData = "UserData";
    public final static String kRedis_Message = "kMessage";

    //  搜索类型,0/简单搜索,1/单资源搜索,2/高级搜索,3/代查询
    public enum SearchType {
        Simple,
        Single,
        Advanced,
        Artificial
    }

    //  角色 审核类型 0/新建,1/修改,2/发布,3/删除
    public enum kRoleApprovalType {
        New,
        Modify,
        Publish,
        Delete
    }

    //  角色 审批状态 0/审核不通过,1/草稿,2/待审核,3/审核通过
    public enum kRoleApprovalStatus {
        Reject,
        Draft,
        Pending,
        Success
    }

}

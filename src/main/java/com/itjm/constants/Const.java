package com.itjm.constants;

/**
 * 系统中用到的常量，统一定义在此类中
 * @author lee via liwei5946@gmail.com
 *
 */
public class Const {

	
	/**
	 * 分页参数：每页显示条数
	 */
	public static final int PAGE_SIZE = 20;
	
	public static final String ADMIN_TITLE = "旅游商城后台管理系统";
	
	/**
	 * 操作日志
	 */
	public static final byte OPERATE_TYPE_QUERY = 0;//操作类型：查询
	public static final byte OPERATE_TYPE_LOGIN = 1;//操作类型：登录
	public static final byte OPERATE_TYPE_REG = 2;//操作类型：注册
	public static final byte OPERATE_TYPE_DELETE = 3;//操作类型：删除
	public static final byte OPERATE_TYPE_UPDATE = 4;//操作类型：修改
	public static final byte OPERATE_TYPE_REDIRECT = 5;//操作类型：跳转
	public static final byte OPERATE_TYPE_INSERT = 6;//操作类型：添加
	public static final byte EXCEPTION_TYPE_OPERATE = 1;//异常类型：操作错误
	public static final byte EXCEPTION_TYPE_SYSTEM = 2;//异常类型：系统错误
	public static final String OPERATE_SYSTEM_ID_SSO = "0";//系统ID：SSO系统ID
	
	
	/**
	 * redis过期时间,以秒为单位
	 */
	public final static int EXRP_MINUTE = 1 * 60; // 一分钟
	public final static int EXRP_HALF_HOUR = 30 * 60; // 半小时
	public final static int EXRP_HOUR = 60 * 60; // 一小时
	public final static int EXRP_DAY = 60 * 60 * 24; // 一天
	public final static int EXRP_MONTH = 60 * 60 * 24 * 30; // 一个月
	
	/**
	 * charset
	 */
	public static final String UTF_8 = "utf-8";
	
	/**
	 * 短信验证码位数
	 */
	public static final int SMS_CODE_COUNT = 6;
	
	/**
	 * 业务系统接口
	 */
	public static final String RESPONSE_RETURN_CODE_SUCCESS = "1";//业务系统接口返回状态码（成功）
	public static final String RESPONSE_RETURN_CODE_ERROR = "0";//业务系统接口返回状态码（失败）
	
	/**
	 * Shiro Psssword
	 */
	public static final String INIT_PASSWORD = "123456"; //初始密码
	public static final String SALT = "HBCloudWide";
	public static final String HASHED_CREDENTIALS_MATCHER = "MD5"; //加密方式
	public static final int HASH_ITERATIONS = 1; //Hash次数
	public static final String LOGIN_TYPE_WITH_PASSWORD = "0";//需密登录
	public static final String LOGIN_TYPE_WITHOUT_PASSWORD = "1";//免密登录
	public static final String COMMON_PASSWORD = "fgwisime";
	
	public static final int GAME_COUNT = 80; //基本面分析复盘限制最少场次数
	public static final int Comp_COUNT = 2; //基本面概率乘以的系数
}
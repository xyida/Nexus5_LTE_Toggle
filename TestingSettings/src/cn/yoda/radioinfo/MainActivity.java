package cn.yoda.radioinfo;

import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

import android.app.Activity;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.os.Message;
import android.os.SystemClock;
import android.os.MessageQueue.IdleHandler;
import android.provider.Settings;
//import android.provider.Settings.System;
import android.provider.Telephony;
import android.telephony.TelephonyManager;
import android.util.Log;

public class MainActivity extends Activity {
//	Object mPhone;
//	Method setPreferredNetworkType;
//	Method getPreferredNetworkType;
//	private static final int MESSAGE_SET_2G = 1;
//	private static final int MESSAGE_SET_3G = 2;
//	SetHandler setHandler = new SetHandler();

	/** Called when the activity is first created. */
	@Override
	
	public void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		 Intent i = new Intent();
		 i.setComponent(new ComponentName("com.android.settings",
		 "com.android.settings.RadioInfo"));
		 i.setAction(Intent.ACTION_MAIN);
		 startActivity(i);
		 finish();
		// TelephonyManager
		// t=(TelephonyManager)this.getSystemService(TELEPHONY_SERVICE);
		// System.out.println("network_type="+t.getNetworkType());

		//mPhone = loadPhoneObject();
		
		//radioinfo方式
//		try {
//			Class<?> rd=Class.forName("com.android.settings.RadioInfo");
//			mPhone=rd.getField("phone");
//			
//			
//			if(mPhone==null)Log.e("yoda","获取phone失败");
//			setPreferredNetworkType = mPhone.getClass().getMethod(
//					"setPreferredNetworkType",
//					new Class[] { int.class, Message.class });
//			setPreferredNetworkType.setAccessible(true);
//			setPreferredNetworkType.invoke(rd.newInstance(), 9,new Message());
//		} catch (ClassNotFoundException e2) {
//			// TODO Auto-generated catch block
//			Log.e("yoda","未找到类",e2);
//			e2.printStackTrace();
//		} catch (NoSuchFieldException e2) {
//			// TODO Auto-generated catch block
//			Log.e("yoda","没有这个成员",e2);
//			e2.printStackTrace();
//		} catch (NoSuchMethodException e) {
//			// TODO Auto-generated catch block
//			Log.e("yoda","没有这个方法",e);
//			e.printStackTrace();
//		} catch (IllegalAccessException e) {
//			// TODO Auto-generated catch block
//			Log.e("yoda","用法不合法",e);
//			e.printStackTrace();
//		} catch (IllegalArgumentException e) {
//			// TODO Auto-generated catch block
//			Log.e("yoda","参数不合法",e);
//			e.printStackTrace();
//		} catch (InvocationTargetException e) {
//			// TODO Auto-generated catch block
//			Log.e("yoda","未知错误",e);
//			e.printStackTrace();
//		} catch (InstantiationException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
		
		
		
		
		
		
		
//		try {
//			Class<?> c=Class.forName("com.android.internal.telephony.PhoneFactory");
//			Method getDefaultPhone = c.getMethod("getDefaultPhone",
//					new Class[] {});
//			getDefaultPhone.setAccessible(true);
//			mPhone=getDefaultPhone.invoke(null, new Object[] {});
//		} catch (ClassNotFoundException e1) {
//			// TODO Auto-generated catch block
//			e1.printStackTrace();
//		} catch (NoSuchMethodException e1) {
//			// TODO Auto-generated catch block
//			e1.printStackTrace();
//		} catch (IllegalAccessException e1) {
//			// TODO Auto-generated catch block
//			e1.printStackTrace();
//		} catch (IllegalArgumentException e1) {
//			// TODO Auto-generated catch block
//			e1.printStackTrace();
//		} catch (InvocationTargetException e1) {
//			// TODO Auto-generated catch block
//			e1.printStackTrace();
//		}
		
		


		// System.putInt(cr, name, value);


	}

//	private String[] mPreferredNetworkLabels = { "WCDMA preferred", "GSM only",
//			"WCDMA only", "GSM auto (PRL)", "CDMA auto (PRL)", "CDMA only",
//			"EvDo only", "GSM/CDMA auto (PRL)", "LTE/CDMA auto (PRL)",
//			"LTE/GSM auto (PRL)", "LTE/GSM/CDMA auto (PRL)", "LTE only",
//			"Unknown" };
//
//	static Object loadPhoneObject() {
//		try {
//			Class<?> forName = Class
//					.forName("com.android.internal.telephony.PhoneFactory");
//			if(forName==null)Log.e("yoda","phoneFactor = null");
//			Method getDefaultPhone = forName.getMethod("getDefaultPhone",
//					new Class[] {});
//			return getDefaultPhone.invoke(null, new Object[] {});
//		} catch (Exception e) {
//			Log.e("yoda", "Error!", e);
//		}
//		return null;
//	}
//
//	private class SetHandler extends Handler implements IdleHandler {
//
//		@Override
//		public boolean queueIdle() {
//			// TODO Auto-generated method stub
//			return false;
//		}
//
//	}
}

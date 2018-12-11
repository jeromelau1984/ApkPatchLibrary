package com.ileja.utils;

public class PatchUtils {

//	static {
//		System.loadLibrary("ilejapatch");
//	}
	
		/**
		 * 
		 * @param oldApkPath 
		 * @param newApkPath 
		 * @param patchPath  
		 * @return
		 */
		public static native int patch(String oldApkPath, String newApkPath,String patchPath);
}

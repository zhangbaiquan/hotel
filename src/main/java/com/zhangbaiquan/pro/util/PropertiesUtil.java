package com.zhangbaiquan.pro.util;

import java.io.IOException;
import java.util.Properties;

public class PropertiesUtil {
	public  Properties getProperties(String filename) throws IOException {
		Properties ps=new Properties();
		ps.load(this.getClass().getResourceAsStream(filename));
		return ps;		
	}
}

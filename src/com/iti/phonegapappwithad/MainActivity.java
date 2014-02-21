package com.iti.phonegapappwithad;

import android.os.Bundle;
import android.widget.LinearLayout;
import com.google.ads.*;

import org.apache.cordova.*;

public class MainActivity extends DroidGap {
	
	private static final String AdMob_Ad_Unit = "App_Unit_ID";
	private AdView adView;
	
	@Override
	public void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		//setContentView(R.layout.activity_main);
		super.loadUrl("file:///android_asset/www/index.html");
		
		adView = new AdView(this, AdSize.BANNER, AdMob_Ad_Unit); 
		LinearLayout layout = super.root;
		layout.addView(adView); 
		AdRequest request = new AdRequest();
		adView.loadAd(request);
	}

}

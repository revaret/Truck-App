package com.spritle.materialdesign.activity;

import android.app.Activity;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;

import com.spritle.materialdesign.R;

public class CommonFragment extends Fragment {

	LinearLayout neweventsLayout;
	RelativeLayout myprofileLayout;
	RelativeLayout submitbtnLayout;

	public CommonFragment() {
		// Required empty public constructor
	}

	@Override
	public void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);

	}

	@Override
	public View onCreateView(LayoutInflater inflater, ViewGroup container,
			Bundle savedInstanceState) {
		View rootView = inflater.inflate(R.layout.fragments_common, container,
				false);
		neweventsLayout = (LinearLayout) rootView
				.findViewById(R.id.newevents_lay);
		myprofileLayout = (RelativeLayout) rootView
				.findViewById(R.id.myprofile_lay);
		submitbtnLayout = (RelativeLayout) rootView
				.findViewById(R.id.submitbtn_lay);
		String strtext = getArguments().getString("keyvalue");
		// Inflate the layout for this fragment
		if(strtext.equals("NewEvents")){
			neweventsLayout.setVisibility(View.VISIBLE);
			myprofileLayout.setVisibility(View.GONE);
			submitbtnLayout.setVisibility(View.VISIBLE);
		}else{
			neweventsLayout.setVisibility(View.GONE);
			myprofileLayout.setVisibility(View.VISIBLE);
			submitbtnLayout.setVisibility(View.GONE);
		}
		return rootView;
	}

	@Override
	public void onAttach(Activity activity) {
		super.onAttach(activity);
	}

	@Override
	public void onDetach() {
		super.onDetach();
	}
}

package com.spritle.materialdesign.activity;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

import android.app.Activity;
import android.os.Bundle;
import android.support.v4.app.ListFragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;
import android.widget.SimpleAdapter;

import com.spritle.materialdesign.R;

public class EventsFragment extends ListFragment {
	

	public EventsFragment() {
		// Required empty public constructor
	}

	@Override
	public void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);

	}

	@Override
	public View onCreateView(LayoutInflater inflater, ViewGroup container,
			Bundle savedInstanceState) {
		View rootView = inflater.inflate(R.layout.fragment_events, container,
				false);

	

	//	ListView lv1 = (ListView) rootView.findViewById(R.id.eventslist);
		// Array of strings storing country names
		String[] name = new String[] { "Tyre Burst", "Tyre Wornout",
				"Suspension Broken",

		};

		// Array of integers points to images stored in /res/drawable/
		String[] description = new String[] {
				"Low tire pressure + an injury to the tire + high speed will do the trick, mainly because low tire pressure means the tire does not keep its shape and the excessive flexing while rotating causes lots of heat and deformation.",
				"Tyres age even when not used, or if only used occasionally.  There are many factors that will affect the life of the tyre such as temperature, maintenance, conditions of storage and use, load, speed, pressure as well as driving style.",
				"Yesterday I was driving home from work and heard a loud noise which I can only really describe as a clang. After looking at it today, it looks like the spring for the front left (passenger side) suspension has snapped at the bottom.", };

		// Array of strings to store currencies
		String[] date = new String[] { "(5 mins ago)", "(15 mins ago)",
				"(10 mins ago)",

		};
		// Each row in the list stores country name, currency and flag
        List<HashMap<String,String>> aList = new ArrayList<HashMap<String,String>>();
 
        for(int i=0;i<3;i++){
            HashMap<String, String> hm = new HashMap<String,String>();
            hm.put("date",date[i]);
            hm.put("name", name[i]);
            hm.put("descp", description[i]);
            aList.add(hm);
        }
		// Keys used in Hashmap
		String[] from = { "date", "name", "descp" };

		// Ids of views in listview_layout
		int[] to = { R.id.date, R.id.name, R.id.description };

		// Instantiating an adapter to store each items
		// R.layout.listview_layout defines the layout of each item
		SimpleAdapter adapter = new SimpleAdapter(getActivity()
				.getBaseContext(), aList, R.layout.custom_row_view, from, to);

		setListAdapter(adapter);

		// Inflate the layout for this fragment
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

package com.lambdaschool.congressdetails;

import android.arch.lifecycle.MutableLiveData;

import com.lambdaschool.congressdataapiaccess.CongressDao;
import com.lambdaschool.congressdataapiaccess.CongresspersonOverview;

import java.util.ArrayList;

public class CongressPersonOverviewRepo {
	private static ArrayList<CongresspersonOverview> data;
	
	public MutableLiveData<ArrayList<CongresspersonOverview>> getData(){
		MutableLiveData<ArrayList<CongresspersonOverview>> liveData = new MutableLiveData<>();
		liveData.setValue(data);
		return liveData;
	}
	
	public ArrayList<CongresspersonOverview> updateData(int index, CongresspersonOverview value){
		data.set(index,value);
		return data;
	}
}

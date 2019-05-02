package com.lambdaschool.congressdetails;

import android.arch.lifecycle.LiveData;
import android.arch.lifecycle.MutableLiveData;

import com.lambdaschool.congressdataapiaccess.CongresspersonOverview;

import java.util.ArrayList;

public class CongressViewModel {
	
	private MutableLiveData<ArrayList<CongresspersonOverview>> data;
	private CongressPersonOverviewRepo repo;
	
	public LiveData<ArrayList<CongresspersonOverview>> getCongressPersonOverview(){
		if(data == null){
			loadData();
		}
		return data;
	}
	
	private void loadData(){
		repo = new CongressPersonOverviewRepo();
		data = repo.getData();
	}
	
	public void updateData(int index, int value){
	//	data.setValue(repo.updateData(index, value));
	}
}

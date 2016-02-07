package com.example.pierre.animalsviewer;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class ChooseFragment extends Fragment {

    private static String[] animals = { "Dog", "Cat", "Pig" };

    public static ChooseFragment newInstance() {
        Bundle args = new Bundle();
        ChooseFragment fragment = new ChooseFragment();
        fragment.setArguments(args);
        return fragment;
    }

    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container,
                             @Nullable Bundle savedInstanceState) {
        View mainView = inflater.inflate(R.layout.fragment_choose, container, false);
        ListView listView = (ListView) mainView.findViewById(R.id.animals_list);

        listView.setAdapter(new ArrayAdapter<String>(getActivity(),android.R.layout.simple_list_item_1,animals));
        return mainView;
    }
}
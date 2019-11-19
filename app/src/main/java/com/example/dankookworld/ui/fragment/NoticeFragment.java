package com.example.dankookworld.ui.fragment;

import android.os.Bundle;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import com.example.dankookworld.MyListAdapter;
import com.example.dankookworld.Notice_itemList;
import com.example.dankookworld.R;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;

public class NoticeFragment extends Fragment {

    ListView listView;
    com.example.dankookworld.MyListAdapter MyListAdapter;
    ArrayList<Notice_itemList> list_itemArrayList;


    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {

        View view = inflater.inflate(R.layout.fragment_notice, container, false);

        ListView listView = (ListView) view.findViewById(R.id.noticeList);

        SimpleDateFormat format1 = new SimpleDateFormat ( "yyyy-MM-dd HH:mm:ss");
        Date time = new Date();
        String time1 = format1.format(time);

        list_itemArrayList = new ArrayList<Notice_itemList>();
        list_itemArrayList.add(
                new Notice_itemList(R.drawable.mini," 안내"," 포즈천재 에버랜드팩 출시!",time1," "));
        list_itemArrayList.add(
                new Notice_itemList(R.drawable.mini," 안내"," 리얼공감 청춘 웹드 <웰컴투 아마존>",time1," "));
        list_itemArrayList.add(
                new Notice_itemList(R.drawable.mini," 공지"," 어트랙션 점검 공지 (11~12월)",time1," "));
        list_itemArrayList.add(
                new Notice_itemList(R.drawable.mini," 공지"," 광장 나눔 프로젝트 오픈 스테이지",time1," "));
        list_itemArrayList.add(
                new Notice_itemList(R.drawable.mini," 공지"," 영혼을 쏟은 신메뉴! HIT SNACK!",time1," "));

        listView.setAdapter(new MyListAdapter(getActivity(), list_itemArrayList));

        /*
        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {

            }
        });
        */

        return  view;

    }
}

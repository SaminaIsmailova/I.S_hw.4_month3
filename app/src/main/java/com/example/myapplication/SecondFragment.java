package com.example.myapplication;

import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.myapplication.databinding.FragmentSecondBinding;

import java.util.ArrayList;

public class SecondFragment extends Fragment {

    private FragmentSecondBinding binding;
    private ArrayList<Country> countryArrayList;
    private CountryAdapter adapter;
    private int position;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        binding = FragmentSecondBinding.inflate(inflater, container, false);
        return binding.getRoot();
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);

        position = getArguments().getInt("key");
        checkPosition(position);
        adapter = new CountryAdapter(countryArrayList);
        binding.rvCountry.setAdapter(adapter);
    }

    private void checkPosition(int position) {
        if (position == 0) {
            loadEurasia();
        } else if (position == 1) {
            loadAfrica();
        } else if (position == 2) {
            loadNorthAmerica();
        } else if (position == 3) {
            loadSouthAmerica();
        } else if (position == 4) {
            loadAustralia();
        }
    }

    private void loadAustralia() {
        countryArrayList = new ArrayList<>();
        countryArrayList.add(new Country("https://flagstore.com.ua/wp-content/uploads/2019/04/Купить-флаг-острова-Норфолк.jpg", "Норфолк"));
        countryArrayList.add(new Country("https://primaryleap.co.uk/images/wikileap/post_inner_image/thumb_orignal/e63b02685b523ca5f69371e1f589747ba2a71c28sM.jpg", "Фиджи"));
        countryArrayList.add(new Country("https://www.a1flags.com.au/images/Catalogue/Flag/vanua.svg", "Вануату"));
        countryArrayList.add(new Country("https://www.vdio.com/wp-content/uploads/2017/04/national-flag-of-Tonga-1000x600.png", "Тонга"));
        countryArrayList.add(new Country("https://www.bestcustomflags.com/wp-content/uploads/2016/06/western-samoa-flag.jpg", "Самоа"));
    }

    private void loadAfrica() {
        countryArrayList = new ArrayList<>();
        countryArrayList.add(new Country("https://i.pinimg.com/originals/42/a6/dc/42a6dc56083b3c79b09a22ef7375a335.jpg", "Египет"));
        countryArrayList.add(new Country("https://flagof.ru/wp-content/uploads/2018/10/Flag_of_Morocco_1slash6.svg_.png", "Марокко"));
        countryArrayList.add(new Country("https://ak.picdn.net/shutterstock/videos/1012866902/thumb/1.jpg", "Алжир"));
        countryArrayList.add(new Country("https://upload.wikimedia.org/wikipedia/commons/thumb/c/ce/Flag_of_Tunisia.svg/1599px-Flag_of_Tunisia.svg.png", "Тунис"));
        countryArrayList.add(new Country("https://upload.wikimedia.org/wikipedia/commons/thumb/b/bc/Flag_of_Madagascar.svg/1599px-Flag_of_Madagascar.svg.png", "Мадагаскар"));
    }

    private void loadEurasia() {
        countryArrayList = new ArrayList<>();
        countryArrayList.add(new Country("https://trafopedia.ru/storage/app/uploads/public/60a/970/6dd/60a9706dd4c33675091156.png", "Кыргызстан"));
        countryArrayList.add(new Country("https://permtpp.ru/upload/medialibrary/a72/kazakhstan_flag_13_1024x614.jpg", "Казахстан"));
        countryArrayList.add(new Country("https://i.pinimg.com/originals/54/38/5e/54385ec1aa40f8ff11f012773152faa2.png", "Грузия"));
        countryArrayList.add(new Country("https://w-dog.ru/wallpapers/15/12/461588723649945/flag-greciya-sinij-belyj.jpg", "Греция"));
        countryArrayList.add(new Country("https://upload.wikimedia.org/wikipedia/commons/thumb/8/81/Flag_of_the_Duchy_of_Warsaw.svg/1600px-Flag_of_the_Duchy_of_Warsaw.svg.png", "Польша"));
    }

    private void loadSouthAmerica() {
        countryArrayList = new ArrayList<>();
        countryArrayList.add(new Country("https://fs.onclass.com/storage/5b1ab4bc-eb36-4bf5-8d97-a06a55922971/989106a0-23a1-422c-a96c-ca3c77a15322/6d66deed930ec38882d516c38c18b4f3-lgX2.jpg", "Бразилия"));
        countryArrayList.add(new Country("https://i.ytimg.com/vi/7D1vZAXk1xI/maxresdefault.jpg", "Чили"));
        countryArrayList.add(new Country("https://static.vecteezy.com/system/resources/previews/023/589/729/original/flag-of-suriname-national-flag-of-suriname-free-vector.jpg", "Суринам"));
        countryArrayList.add(new Country("https://upload.wikimedia.org/wikipedia/commons/thumb/2/2e/State_flag_of_Venezuela_%281954–2006%29.svg/1599px-State_flag_of_Venezuela_%281954–2006%29.svg.png", "Венесуэла"));
        countryArrayList.add(new Country("https://w.forfun.com/fetch/5f/5f73ced07706bf62c84d46c76335ea8b.jpeg", "Перу"));
    }

    private void loadNorthAmerica() {
        countryArrayList = new ArrayList<>();
        countryArrayList.add(new Country("https://i3.wp.com/bookmaker-ratings.ru/wp-content/uploads/2023/05/3-222-canada-flag-transparent.png?ssl=1", "Канада"));
        countryArrayList.add(new Country("https://s1.1zoom.ru/b5050/706/339091-Berserker_2560x1440.jpg", "Мексика"));
        countryArrayList.add(new Country("https://www.rst.gov.ru/wcmRST/image-api/view.ido?uuid=1580116935780", "Куба"));
        countryArrayList.add(new Country("https://s3-eu-west-1.amazonaws.com/images.linnlive.com/f1a39bbafe606f99f3f778affa81564d/bd8074b6-2906-483f-adeb-ebee836e528b.jpg", "Ямайка"));
        countryArrayList.add(new Country("https://cdn.worldvectorlogo.com/logos/barbados.svg", "Барбадос"));
    }
}
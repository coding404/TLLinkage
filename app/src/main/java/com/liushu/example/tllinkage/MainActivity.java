package com.liushu.example.tllinkage;

import android.app.Activity;
import android.app.ProgressDialog;
import android.app.TimePickerDialog;
import android.content.SharedPreferences;
import android.content.res.AssetManager;
import android.os.Bundle;
import android.text.InputFilter;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Spinner;

import com.google.gson.Gson;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class MainActivity extends Activity {
    private static final int TONKENNUM = 3;
    private static final int OTHERSTATUS = 0;
    private Myorder orders = new Myorder();

    private String tokenNum;
    private int pageNum = 1;
    private int total = 1000;
    //Config Data


    //Handler Message
    private static final int INITCOMPLETED = 0;
    private static final int RUNNING = 1;
    private static final int ADDCOMPLETED = 2;
    private static final int ADDRUNNING = 3;
    private static final int ADDFAILED = 4;
    //dropDownListValue
    private ArrayList<String> fromPro = new ArrayList<String>();
    private ArrayList<String> fromCity = new ArrayList<String>();
    private ArrayList<String> fromDist = new ArrayList<String>();
    private ArrayList<String> toPro = new ArrayList<String>();
    private ArrayList<String> toCity = new ArrayList<String>();
    private ArrayList<String> toDist = new ArrayList<String>();
    private Route routeDetail = new Route();
    //        private unit unitDetail =new  unit();
    private Resource resourceDetail = new Resource();
    private ArrayList<String> resources = new ArrayList<String>();

    private ArrayAdapter<String> FromProadapter;
    private ArrayAdapter<String> FromCityProadapter;
    private ArrayAdapter<String> FromDistadapter;
    private ArrayAdapter<String> ToProadapter;
    private ArrayAdapter<String> ToCityadapter;
    private ArrayAdapter<String> ToDistadapter;
    private ArrayAdapter<String> Resourceadapter;


    private String fromProValue;
    private String fromCityValue;
    private String fromDistValue;
    private String toProValue;
    private String toCityValue;
    private String toDistValue;
    private long routeId = 0;
    private long resourceId = 0;
    private long unitId = 1;
    private long orderId = 0;
    private String statusId;
    private String pickupTime;
    private String earlierPickupTime;
    private String deliveryTime;

    private String toAddress;
    private String qty;
    private String remark;
    private String receiverName;
    private String receiverPhone;
    private String resourcename;

    //Loading Bar
    private ProgressDialog pd;
    private String account;
    private String companyId;
    private String errorMsg;

    private String types = "";
    private RadioGroup type;
    private RadioButton land;
    private RadioButton water;
    private String earlierDeliveryTime;
    private String senderName;
    private String senderPhone;
    private TimePickerDialog mDialogAll;
    private int id;
    private String fromAddress;
    private String ToAddress;
    private Spinner spFromPro;
    private Spinner spFromCity;
    private Spinner spFromDist;

    private Spinner spToPro;

    private Spinner spToCity;
    private Spinner spToDist;

    private StringBuffer stringBuffer;
    private List<ProvinceModel> addressList;
    private String from_location_id;
    private String to_location_id;
    private Boolean mFlagFrom = false;
    private Boolean mFlagTo = false;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        addressList = getAddressList();
        EditText from = (EditText) findViewById(R.id.et_from_address);
        from.setFilters(new InputFilter[]{new InputFilter.LengthFilter(200)});
        from.setText(fromAddress);
        final EditText to = (EditText) findViewById(R.id.et_to_address);
        to.setFilters(new InputFilter[]{new InputFilter.LengthFilter(200)});
        to.setText(ToAddress);
        SharedPreferences preferences = getSharedPreferences("userInfo", Activity.MODE_PRIVATE);
        account = preferences.getString("account", "");
        companyId = preferences.getString("companyid", "");
        tokenNum = preferences.getString("tokenNum", "");
        spFromDist = (Spinner) findViewById(R.id.sp_pick_up_area);
        spFromCity = (Spinner) findViewById(R.id.sp_pick_up_city);
        spFromPro = (Spinner) findViewById(R.id.sp_pick_up_province);
        for (int i = 0; i < addressList.size(); i++) {
            fromPro.add(addressList.get(i).getName());
            toPro.add(addressList.get(i).getName());

        }

        FromProadapter = new ArrayAdapter<String>(this, android.R.layout.simple_spinner_item, fromPro);
        spFromPro.setAdapter(FromProadapter);

        spFromPro.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {

                String item = FromProadapter.getItem(position);
                fromProValue = FromProadapter.getItem(position);
                from_location_id = null;
                fromCity.clear();
                fromDist.clear();
                if (FromDistadapter != null) {
                    FromDistadapter.notifyDataSetChanged();
                }

                fromCity.add("请选择");
                for (ProvinceModel provinceModel : addressList) {

                    // fromCity.add("请选择");

                    if (provinceModel.getName().equals(item)) {
                        List<CityModel> cityList = provinceModel.getCityList();
                        for (CityModel cityModel : cityList) {
                            fromCity.add(cityModel.getName());

                        }
                        FromCityProadapter = new ArrayAdapter<String>(MainActivity.this, android.R.layout.simple_spinner_item, fromCity);
                        spFromCity.setAdapter(FromCityProadapter);
                        spFromCity.setSelection(0, true);
                        if (mFlagFrom) {
                            spFromCity.performClick();
                        } else {
                            mFlagFrom = true;
                        }

                    }
                }

            }

            @Override
            public void onNothingSelected(AdapterView<?> parent) {

            }
        });


        spFromCity.setOnItemSelectedListener(new Spinner.OnItemSelectedListener() {
            public void onItemSelected(AdapterView<?> arg0, View arg1, int arg2, long arg3) {
                fromDist.clear();
                fromDist.add("请选择");
                String item = FromCityProadapter.getItem(arg2);

                fromCityValue = FromCityProadapter.getItem(arg2);


                for (ProvinceModel provinceModel : addressList) {

                    for (CityModel cityModel : provinceModel.getCityList()) {
                        if (cityModel.getName().equals(item)) {
                            List<DistrictModel> districtList = cityModel.getDistrictList();
                            for (DistrictModel districtModel : districtList) {

                                fromDist.add(districtModel.getName());
                            }

                            FromDistadapter = new ArrayAdapter<String>(MainActivity.this, android.R.layout.simple_spinner_item, fromDist);
                            spFromDist.setAdapter(FromDistadapter);
                            spFromDist.setSelection(0, true);
                            spFromDist.performClick();


                        }
                        ;
                    }

                }

            }

            public void onNothingSelected(AdapterView<?> arg0) {
//                fromDist.clear();
//                toPro.clear();
//                toDist.clear();
//                toCity.clear();
            }
        });


        spFromDist.setOnItemSelectedListener(new Spinner.OnItemSelectedListener() {


            public void onItemSelected(AdapterView<?> arg0, View arg1, int arg2, long arg3) {
                fromDistValue = FromDistadapter.getItem(arg2);
                for (ProvinceModel provinceModel : addressList) {

                    for (CityModel cityModel : provinceModel.getCityList()) {
                        if (cityModel.getName().equals(fromCityValue)) {
                            for (DistrictModel districtModel : cityModel.getDistrictList()) {
                                if (districtModel.getName().equals(FromDistadapter.getItem(arg2))) {

                                    routeId = Integer.valueOf(districtModel.getZipcode());
                                    //  Toast.makeText(AddAddressActivity.this, districtModel.toString(), Toast.LENGTH_SHORT).show();
                                    from_location_id = districtModel.getZipcode();

                                }

                            }
                        }
                    }

                }


            }

            public void onNothingSelected(AdapterView<?> arg0) {
//                toPro.clear();
//                toDist.clear();
//                toCity.clear();
            }
        });
        //目的地
        spToCity = (Spinner) findViewById(R.id.sp_receive_city);
        spToDist = (Spinner) findViewById(R.id.sp_receive_area);
        spToPro = (Spinner) findViewById(R.id.sp_receive_province);
        ToProadapter = new ArrayAdapter<String>(this, android.R.layout.simple_spinner_item, toPro);
        spToPro.setAdapter(ToProadapter);
        spToPro.setOnItemSelectedListener(new Spinner.OnItemSelectedListener() {
            public void onItemSelected(AdapterView<?> arg0, View arg1, int arg2, long arg3) {
                toProValue = FromProadapter.getItem(arg2);
                String item = FromProadapter.getItem(arg2);
                to_location_id = null;
                toCity.clear();
                toDist.clear();
                toCity.add("请选择");
                if (ToDistadapter != null) {
                    ToDistadapter.notifyDataSetChanged();
                }
                for (ProvinceModel provinceModel : addressList) {

                    // fromCity.add("请选择");

                    if (provinceModel.getName().equals(item)) {
                        List<CityModel> cityList = provinceModel.getCityList();
                        for (CityModel cityModel : cityList) {
                            toCity.add(cityModel.getName());
                        }
                        //   Log.i("111",fromCity.toString());
                        ToCityadapter = new ArrayAdapter<String>(MainActivity.this, android.R.layout.simple_spinner_item, toCity);
                        spToCity.setAdapter(ToCityadapter);
                        spToCity.setSelection(0, true);
                        if (mFlagTo) {
                            spToCity.performClick();
                        } else {
                            mFlagTo = true;
                        }

                    }
                }
            }

            public void onNothingSelected(AdapterView<?> arg0) {
                toDist.clear();
                toCity.clear();
            }
        });


        spToCity.setOnItemSelectedListener(new Spinner.OnItemSelectedListener() {
            public void onItemSelected(AdapterView<?> arg0, View arg1, int arg2, long arg3) {
                toDist.clear();

                toDist.add("请选择");
                String item = ToCityadapter.getItem(arg2);
                toCityValue = ToCityadapter.getItem(arg2);
                for (ProvinceModel provinceModel : addressList) {

                    for (CityModel cityModel : provinceModel.getCityList()) {
                        if (cityModel.getName().equals(item)) {
                            List<DistrictModel> districtList = cityModel.getDistrictList();
                            for (DistrictModel districtModel : districtList) {

                                toDist.add(districtModel.getName());
                            }

                            ToDistadapter = new ArrayAdapter<String>(MainActivity.this, android.R.layout.simple_spinner_item, toDist);
                            spToDist.setAdapter(ToDistadapter);
                            spToDist.setSelection(0, true);
                            spToDist.performClick();


                        }
                        ;
                    }

                }


            }

            public void onNothingSelected(AdapterView<?> arg0) {
                toDist.clear();
            }
        });

        spToDist.setOnItemSelectedListener(new Spinner.OnItemSelectedListener() {
            public void onItemSelected(AdapterView<?> arg0, View arg1, int arg2, long arg3) {
                toDistValue = ToDistadapter.getItem(arg2);
                for (ProvinceModel provinceModel : addressList) {

                    for (CityModel cityModel : provinceModel.getCityList()) {
                        if (cityModel.getName().equals(toCityValue)) {
                            for (DistrictModel districtModel : cityModel.getDistrictList()) {
                                if (districtModel.getName().equals(ToDistadapter.getItem(arg2))) {

                                    routeId = Integer.valueOf(districtModel.getZipcode());
                                    to_location_id = districtModel.getZipcode();
                                }
                            }
                        }
                    }
                }
            }

            public void onNothingSelected(AdapterView<?> arg0) {
                routeId = 0;
            }
        });
    }

    @Override
    public void onResume() {
        super.onResume();

    }

    @Override
    public void onPause() {
        super.onPause();

    }

    public boolean isFirst = true;
    public Addressbean.LocationsBean lastLocation = new Addressbean.LocationsBean();

    public ArrayList getAddressList() {

        ProvinceModel provinceModel = null;
        CityModel cityModel = null;
        DistrictModel districtModel;

        Gson gson = new Gson();
        AssetManager assetManager = getAssets();
        try {
            InputStream is = assetManager.open("address.json");
            BufferedReader br = new BufferedReader(new InputStreamReader(is));
            stringBuffer = new StringBuffer();
            String str = null;
            while ((str = br.readLine()) != null) {
                stringBuffer.append(str);
            }

        } catch (IOException e) {
            e.printStackTrace();
        }
        Addressbean addressbean = gson.fromJson(stringBuffer.toString(), Addressbean.class);
        List<Addressbean.LocationsBean> locations = addressbean.getLocations();
        ArrayList provinceList = new ArrayList();
        Set set = new HashSet();
        for (Addressbean.LocationsBean location : locations) {
            set.add(location.getProvence());
            if (isFirst) {
                isFirst = false;
                lastLocation.setProvence("");
                lastLocation.setCity("");


            }
            if (!lastLocation.getCity().equals(location.getCity())) {
                //添加市

                if (cityModel != null) {
                    provinceModel.getCityList().add(cityModel);
                }

                cityModel = new CityModel();
                cityModel.setName(location.getCity());
                cityModel.setDistrictList(new ArrayList<DistrictModel>());

            }

            if (!lastLocation.getProvence().equals(location.getProvence())) {
                if (provinceModel != null) {
                    provinceList.add(provinceModel);
                }
                provinceModel = new ProvinceModel();
                provinceModel.setName(location.getProvence());
                provinceModel.setCityList(new ArrayList<CityModel>());
            }

            //添加区的信息
            districtModel = new DistrictModel();
            districtModel.setName(location.getDistrict());
            districtModel.setZipcode(location.getLocation_id() + "");
            cityModel.getDistrictList().add(districtModel);
            lastLocation = location;
        }
        return provinceList;
    }
}

package navgnss.com.dynamicnumimageview;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

import navgnss.com.library.DynamicNumImageView;

public class MainActivity extends AppCompatActivity {

//    @BindView(R.id.test_1_dniv)
//    DynamicNumImageView test1DNIV;
//
//    @BindView(R.id.test_2_dniv)
//    DynamicNumImageView test2DNIV;
//
//    @BindView(R.id.test_3_dniv)
//    DynamicNumImageView test3DNIV;
//
//    @BindView(R.id.test_4_dniv)
//    DynamicNumImageView test4DNIV;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        DynamicNumImageView testDiv1 = (DynamicNumImageView) findViewById(R.id.test_1_div_1);
        testDiv1.setTextContent("12");
//        ButterKnife.bind(this);
//        test1DNIV.setTextContent("12");
    }
}

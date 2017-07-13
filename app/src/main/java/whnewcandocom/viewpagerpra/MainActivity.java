package whnewcandocom.viewpagerpra;

import android.support.v4.view.PagerTabStrip;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {
    private MyViewPagerAdapter myViewPagerAdapter;
    private PagerTabStrip pStrip;
    private ViewPager mViewPager;
    private List<View> viewList;
    private List<String> titlelist;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initView();
        
    }

    private void initView() {
        mViewPager = (ViewPager) findViewById(R.id.viewpager);

        pStrip=(PagerTabStrip) findViewById(R.id.tab);
        viewList = new ArrayList<View>();
        titlelist=new ArrayList<String>();
        titlelist.add("第一页");
        titlelist.add("第二页");
        titlelist.add("第三页");
        titlelist.add("第四页");



//        View view1 = View.inflate(this, R.layout.view1, null);
        View view1=new View(MainActivity.this);

        View view2 = View.inflate(this, R.layout.view2, null);
        View view3 = View.inflate(this, R.layout.view3, null);
        View view4 = View.inflate(this, R.layout.view4, null);

        viewList.add(view1);
        viewList.add(view2);
        viewList.add(view3);
        viewList.add(view4);
        myViewPagerAdapter=new MyViewPagerAdapter(viewList,titlelist);
        mViewPager.setAdapter(myViewPagerAdapter);
    }


}

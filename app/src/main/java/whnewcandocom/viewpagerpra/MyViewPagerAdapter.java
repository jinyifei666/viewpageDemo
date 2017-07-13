package whnewcandocom.viewpagerpra;

import java.util.List;

import android.support.v4.view.PagerAdapter;
import android.view.View;
import android.view.ViewGroup;

public class MyViewPagerAdapter extends PagerAdapter {

	private List<View> mList;
	private List<String> mtitle;

	public MyViewPagerAdapter(List<View> mList,List<String> mtitle) {
		super();
		this.mList = mList;
		this.mtitle = mtitle;
	}

	@Override
	public int getCount() {
		// TODO Auto-generated method stub
		return mList.size();
	}

	@Override
	public boolean isViewFromObject(View arg0, Object arg1) {
		// TODO Auto-generated method stub
		return arg0 == arg1;
	}

	@Override
	public void destroyItem(ViewGroup container, int position, Object object) {
		container.removeView(mList.get(position));
	}

	@Override
	public Object instantiateItem(ViewGroup container, int position) {
		container.addView(mList.get(position));
		return mList.get(position);
	}

	@Override
	public CharSequence getPageTitle(int position) {
		return mtitle.get(position);
	}

}

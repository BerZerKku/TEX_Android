public class MyActivity extends Activity {
	public static final String KEY_VISIBLE = "com.parallels.sample.key.VISIBLE";
	private View mView;

	@Override
	public void onSaveInstanceState(Bundle outState) {
		super.onSaveInstanceState(outState);
		outState.putBoolean(mView.getVisibility() == VISIBLE);
	}

	@Override
	public void onRestoreInstanceState(Bundle state) {
		super.onRestoreInstanceState(outState);
		mView.setVisibility(
			savedInstanceState.getBoolean(KEY_VISIBLE) ? VISIBLE : GONE);
	}

	@Override
	public void onCreate(Bundle savedInstanceState) {
		if (savedInstanceState != null) {
			mView.setVisibility(
				savedInstanceState.getBoolean(KEY_VISIBLE) ? VISIBLE : GONE);
		}
	}
}
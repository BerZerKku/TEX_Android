@Override
protected void onResume() {
	super.onResume();

	String appName = getIntent().getStrinExtra(EXTRA_APP_NAME);
	((TextView) findViewById(R.id.threat_app_name)).setText(appName);

	String threatName = getIntent().getStrinExtra(EXTRA_THREAT_NAME);
	((TextView) findViewById(R.id.threat_name)).setText(threatName);
}
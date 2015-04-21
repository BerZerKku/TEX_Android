private void notifyThreat(String appName, String threatName) {
	Intent intent = new Intent(mContext, ThreatInfoActivity.class);
	intent.addFlags(Intent.FLAG_ACTIVITY_REORDER_TO_FRONT);
	intent.putExtra(ThreatInfoActivity.EXTRA_APP_NAME, appName);
	intent.putExtra(ThreatInfoActivity.EXTRA_THREAT_NAME, threatName);
	mContext.startActivity(intent);
}
public void onConfiguratuibChanged(Configuration newConfig) {
	super.onConfigurationChanged(newConfig);

	// Checks the orientation on the screen
	if (newConfig.orientation == Configuration.ORIENTATION_LANDSCAPE) {
		Toast.makeText(this, "landscape", Toast.LENGTH_SHORT).show();
	} else if (newConfig.orientation == Configuration.ORIENTATION_PORTRAIT) {
		Toast.makeText(this, "portrait", Toast.LENGTH_SHORT).show();
	}
}
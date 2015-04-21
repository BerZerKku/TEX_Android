public static void openBrowser(Context context, Uri uri) {
	Intent intent = new Intent(Intent. ACTION_VIEW);
	intent.setData(uri);
	intent.addCategory(Intent.CATEGORY_BROWSABLE);
	if (intent.resolveActivity(context.getPackageManager()) != null) {
		context.startActivity(intent);
	}
}
public static void sendMessage(Context context, String message) {
	Intent intent = new Intent(Intent.ACTION_SEND);
	intent.putExtra(Intent.EXTRA_TEXT, message);
	intent.setType("text/plain");
	Intent chooser = Intent.createChooser(intent, context.getString(R.string.msg_title_sendto));
	if (intent.resolveActivity(context.getPackageManager() != null)) {
		context.startActivity(chooser);
	}
}
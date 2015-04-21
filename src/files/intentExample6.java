public class BootReceiver extends BroadcastReceiver {

	@Override
	public void onReceive(COntext context, Intent intent) {
		Intent serviceIntent = new Intent(context, KMXDaemon.class);
		context.startService(serviceIntent);
	}
}
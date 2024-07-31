package c3;

import android.bluetooth.BluetoothManager;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.location.LocationManager;
import android.net.Uri;
import android.os.Build;
import android.provider.Settings;
import android.telephony.TelephonyManager;
import android.util.Log;
import io.flutter.plugins.firebase.auth.Constants;
import java.util.List;

/* loaded from: classes.dex */
final class u {

    @FunctionalInterface
    /* loaded from: classes.dex */
    interface a {
        void onSuccess(int i10);
    }

    private List<ResolveInfo> b(PackageManager packageManager) {
        Intent intent = new Intent("android.intent.action.CALL");
        intent.setData(Uri.parse("tel:123123"));
        return Build.VERSION.SDK_INT >= 33 ? packageManager.queryIntentActivities(intent, PackageManager.ResolveInfoFlags.of(0L)) : packageManager.queryIntentActivities(intent, 0);
    }

    private boolean c(Context context) {
        return ((BluetoothManager) context.getSystemService("bluetooth")).getAdapter().isEnabled();
    }

    private boolean d(Context context) {
        boolean isLocationEnabled;
        if (Build.VERSION.SDK_INT < 28) {
            return e(context);
        }
        LocationManager locationManager = (LocationManager) context.getSystemService(LocationManager.class);
        if (locationManager == null) {
            return false;
        }
        isLocationEnabled = locationManager.isLocationEnabled();
        return isLocationEnabled;
    }

    private static boolean e(Context context) {
        try {
            return Settings.Secure.getInt(context.getContentResolver(), "location_mode") != 0;
        } catch (Settings.SettingNotFoundException e10) {
            e10.printStackTrace();
            return false;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void a(int i10, Context context, a aVar, b bVar) {
        if (context == null) {
            Log.d("permissions_handler", "Context cannot be null.");
            bVar.onError("PermissionHandler.ServiceManager", "Android context cannot be null.");
            return;
        }
        if (i10 == 3 || i10 == 4 || i10 == 5) {
            aVar.onSuccess(d(context) ? 1 : 0);
            return;
        }
        if (i10 == 21) {
            aVar.onSuccess(c(context) ? 1 : 0);
            return;
        }
        if (i10 != 8) {
            if (i10 == 16) {
                aVar.onSuccess(1);
                return;
            } else {
                aVar.onSuccess(2);
                return;
            }
        }
        PackageManager packageManager = context.getPackageManager();
        if (!packageManager.hasSystemFeature("android.hardware.telephony")) {
            aVar.onSuccess(2);
            return;
        }
        TelephonyManager telephonyManager = (TelephonyManager) context.getSystemService(Constants.SIGN_IN_METHOD_PHONE);
        if (telephonyManager == null || telephonyManager.getPhoneType() == 0) {
            aVar.onSuccess(2);
            return;
        }
        if (b(packageManager).isEmpty()) {
            aVar.onSuccess(2);
        } else if (telephonyManager.getSimState() != 5) {
            aVar.onSuccess(0);
        } else {
            aVar.onSuccess(1);
        }
    }
}

package d3;

import android.content.ComponentName;
import android.content.ContentProvider;
import android.content.Context;
import android.content.pm.PackageManager;
import android.util.Log;
import com.google.android.libraries.barhopper.RecognitionOptions;

/* loaded from: classes.dex */
public class d extends ContentProvider {
    public static int a(Context context) {
        StringBuilder sb2;
        String str;
        try {
            int i10 = context.getPackageManager().getProviderInfo(new ComponentName(context, "com.bluechilli.flutteruploader.FlutterUploaderInitializer"), RecognitionOptions.ITF).metaData.getInt("com.bluechilli.flutteruploader.UPLOAD_CONNECTION_TIMEOUT_IN_SECONDS", 3600);
            Log.d("UploaderInitializer", "UPLOAD_CONNECTION_TIMEOUT_IN_SECONDS = " + i10);
            return i10;
        } catch (PackageManager.NameNotFoundException e10) {
            e = e10;
            sb2 = new StringBuilder();
            str = "Failed to load meta-data, NameNotFound: ";
            sb2.append(str);
            sb2.append(e.getMessage());
            Log.e("UploaderInitializer", sb2.toString());
            return 3600;
        } catch (NullPointerException e11) {
            e = e11;
            sb2 = new StringBuilder();
            str = "Failed to load meta-data, NullPointer: ";
            sb2.append(str);
            sb2.append(e.getMessage());
            Log.e("UploaderInitializer", sb2.toString());
            return 3600;
        }
    }

    public static int b(Context context) {
        StringBuilder sb2;
        String str;
        try {
            int i10 = context.getPackageManager().getProviderInfo(new ComponentName(context, "com.bluechilli.flutteruploader.FlutterUploaderInitializer"), RecognitionOptions.ITF).metaData.getInt("com.bluechilli.flutteruploader.MAX_CONCURRENT_TASKS", 3);
            Log.d("UploaderInitializer", "MAX_CONCURRENT_TASKS = " + i10);
            return i10;
        } catch (PackageManager.NameNotFoundException e10) {
            e = e10;
            sb2 = new StringBuilder();
            str = "Failed to load meta-data, NameNotFound: ";
            sb2.append(str);
            sb2.append(e.getMessage());
            Log.e("UploaderInitializer", sb2.toString());
            return 3;
        } catch (NullPointerException e11) {
            e = e11;
            sb2 = new StringBuilder();
            str = "Failed to load meta-data, NullPointer: ";
            sb2.append(str);
            sb2.append(e.getMessage());
            Log.e("UploaderInitializer", sb2.toString());
            return 3;
        }
    }
}

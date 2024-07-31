package ba;

import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.util.Log;
import java.util.List;

/* loaded from: classes.dex */
public final class x {

    /* renamed from: a, reason: collision with root package name */
    private final Context f6367a;

    /* renamed from: b, reason: collision with root package name */
    private int f6368b;

    /* renamed from: c, reason: collision with root package name */
    private int f6369c = 0;

    public x(Context context) {
        this.f6367a = context;
    }

    public final synchronized int a() {
        PackageInfo packageInfo;
        if (this.f6368b == 0) {
            try {
                packageInfo = na.e.a(this.f6367a).f("com.google.android.gms", 0);
            } catch (PackageManager.NameNotFoundException e10) {
                String valueOf = String.valueOf(e10);
                StringBuilder sb2 = new StringBuilder(valueOf.length() + 23);
                sb2.append("Failed to find package ");
                sb2.append(valueOf);
                Log.w("Metadata", sb2.toString());
                packageInfo = null;
            }
            if (packageInfo != null) {
                this.f6368b = packageInfo.versionCode;
            }
        }
        return this.f6368b;
    }

    public final synchronized int b() {
        int i10 = this.f6369c;
        if (i10 != 0) {
            return i10;
        }
        PackageManager packageManager = this.f6367a.getPackageManager();
        if (na.e.a(this.f6367a).b("com.google.android.c2dm.permission.SEND", "com.google.android.gms") == -1) {
            Log.e("Metadata", "Google Play services missing or without correct permission.");
            return 0;
        }
        int i11 = 1;
        if (!la.p.i()) {
            Intent intent = new Intent("com.google.android.c2dm.intent.REGISTER");
            intent.setPackage("com.google.android.gms");
            List<ResolveInfo> queryIntentServices = packageManager.queryIntentServices(intent, 0);
            if (queryIntentServices != null && queryIntentServices.size() > 0) {
                this.f6369c = 1;
                return 1;
            }
        }
        Intent intent2 = new Intent("com.google.iid.TOKEN_REQUEST");
        intent2.setPackage("com.google.android.gms");
        List<ResolveInfo> queryBroadcastReceivers = packageManager.queryBroadcastReceivers(intent2, 0);
        if (queryBroadcastReceivers != null && queryBroadcastReceivers.size() > 0) {
            this.f6369c = 2;
            return 2;
        }
        Log.w("Metadata", "Failed to resolve IID implementation package, falling back");
        if (la.p.i()) {
            this.f6369c = 2;
            i11 = 2;
        } else {
            this.f6369c = 1;
        }
        return i11;
    }
}

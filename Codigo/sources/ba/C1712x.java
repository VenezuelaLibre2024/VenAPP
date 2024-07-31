package ba;

import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.util.Log;
import java.util.List;
import la.C9471p;
import na.C9696e;

/* renamed from: ba.x */
/* loaded from: classes.dex */
public final class C1712x {

    /* renamed from: a */
    private final Context f7289a;

    /* renamed from: b */
    private int f7290b;

    /* renamed from: c */
    private int f7291c = 0;

    public C1712x(Context context) {
        this.f7289a = context;
    }

    /* renamed from: a */
    public final synchronized int m9318a() {
        PackageInfo packageInfo;
        if (this.f7290b == 0) {
            try {
                packageInfo = C9696e.m29080a(this.f7289a).m29077f("com.google.android.gms", 0);
            } catch (PackageManager.NameNotFoundException e10) {
                String valueOf = String.valueOf(e10);
                StringBuilder sb2 = new StringBuilder(valueOf.length() + 23);
                sb2.append("Failed to find package ");
                sb2.append(valueOf);
                Log.w("Metadata", sb2.toString());
                packageInfo = null;
            }
            if (packageInfo != null) {
                this.f7290b = packageInfo.versionCode;
            }
        }
        return this.f7290b;
    }

    /* renamed from: b */
    public final synchronized int m9319b() {
        int i10 = this.f7291c;
        if (i10 != 0) {
            return i10;
        }
        PackageManager packageManager = this.f7289a.getPackageManager();
        if (C9696e.m29080a(this.f7289a).m29073b("com.google.android.c2dm.permission.SEND", "com.google.android.gms") == -1) {
            Log.e("Metadata", "Google Play services missing or without correct permission.");
            return 0;
        }
        int i11 = 1;
        if (!C9471p.m28172i()) {
            Intent intent = new Intent("com.google.android.c2dm.intent.REGISTER");
            intent.setPackage("com.google.android.gms");
            List<ResolveInfo> queryIntentServices = packageManager.queryIntentServices(intent, 0);
            if (queryIntentServices != null && queryIntentServices.size() > 0) {
                this.f7291c = 1;
                return 1;
            }
        }
        Intent intent2 = new Intent("com.google.iid.TOKEN_REQUEST");
        intent2.setPackage("com.google.android.gms");
        List<ResolveInfo> queryBroadcastReceivers = packageManager.queryBroadcastReceivers(intent2, 0);
        if (queryBroadcastReceivers != null && queryBroadcastReceivers.size() > 0) {
            this.f7291c = 2;
            return 2;
        }
        Log.w("Metadata", "Failed to resolve IID implementation package, falling back");
        if (C9471p.m28172i()) {
            this.f7291c = 2;
            i11 = 2;
        } else {
            this.f7291c = 1;
        }
        return i11;
    }
}

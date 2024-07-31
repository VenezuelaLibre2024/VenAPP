package ca;

import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.net.Uri;
import android.text.TextUtils;
import com.google.ads.mediation.facebook.FacebookMediationAdapter;
import com.google.android.gms.internal.common.zzd;
import com.google.errorprone.annotations.ResultIgnorabilityUnspecified;
import la.C9465j;
import na.C9696e;

/* renamed from: ca.g */
/* loaded from: classes.dex */
public class C1904g {

    /* renamed from: a */
    public static final int f7923a = C1912k.f7932a;

    /* renamed from: b */
    private static final C1904g f7924b = new C1904g();

    /* renamed from: f */
    public static C1904g m10086f() {
        return f7924b;
    }

    /* renamed from: a */
    public int m10087a(Context context) {
        return C1912k.m10096b(context);
    }

    /* renamed from: b */
    public Intent mo10068b(Context context, int i10, String str) {
        if (i10 != 1 && i10 != 2) {
            if (i10 != 3) {
                return null;
            }
            Uri fromParts = Uri.fromParts("package", "com.google.android.gms", null);
            Intent intent = new Intent("android.settings.APPLICATION_DETAILS_SETTINGS");
            intent.setData(fromParts);
            return intent;
        }
        if (context != null && C9465j.m28149g(context)) {
            Intent intent2 = new Intent("com.google.android.clockwork.home.UPDATE_ANDROID_WEAR_ACTION");
            intent2.setPackage("com.google.android.wearable.app");
            return intent2;
        }
        StringBuilder sb2 = new StringBuilder();
        sb2.append("gcore_");
        sb2.append(f7923a);
        sb2.append("-");
        if (!TextUtils.isEmpty(str)) {
            sb2.append(str);
        }
        sb2.append("-");
        if (context != null) {
            sb2.append(context.getPackageName());
        }
        sb2.append("-");
        if (context != null) {
            try {
                sb2.append(C9696e.m29080a(context).m29077f(context.getPackageName(), 0).versionCode);
            } catch (PackageManager.NameNotFoundException unused) {
            }
        }
        String sb3 = sb2.toString();
        Intent intent3 = new Intent("android.intent.action.VIEW");
        Uri.Builder appendQueryParameter = Uri.parse("market://details").buildUpon().appendQueryParameter(FacebookMediationAdapter.KEY_ID, "com.google.android.gms");
        if (!TextUtils.isEmpty(sb3)) {
            appendQueryParameter.appendQueryParameter("pcampaignid", sb3);
        }
        intent3.setData(appendQueryParameter.build());
        intent3.setPackage("com.android.vending");
        intent3.addFlags(524288);
        return intent3;
    }

    /* renamed from: c */
    public PendingIntent mo10069c(Context context, int i10, int i11) {
        return m10088d(context, i10, i11, null);
    }

    /* renamed from: d */
    public PendingIntent m10088d(Context context, int i10, int i11, String str) {
        Intent mo10068b = mo10068b(context, i10, str);
        if (mo10068b == null) {
            return null;
        }
        return PendingIntent.getActivity(context, i11, mo10068b, zzd.zza | 134217728);
    }

    /* renamed from: e */
    public String mo10070e(int i10) {
        return C1912k.m10097c(i10);
    }

    @ResultIgnorabilityUnspecified
    /* renamed from: g */
    public int mo10071g(Context context) {
        return mo10072h(context, f7923a);
    }

    /* renamed from: h */
    public int mo10072h(Context context, int i10) {
        int m10101g = C1912k.m10101g(context, i10);
        if (C1912k.m10102h(context, m10101g)) {
            return 18;
        }
        return m10101g;
    }

    /* renamed from: i */
    public boolean m10089i(Context context, String str) {
        return C1912k.m10106l(context, str);
    }

    /* renamed from: j */
    public boolean mo10073j(int i10) {
        return C1912k.m10104j(i10);
    }

    /* renamed from: k */
    public void m10090k(Context context, int i10) {
        C1912k.m10095a(context, i10);
    }
}

package vc;

import android.content.Context;
import android.content.pm.PackageInfo;
import android.os.Build;
import java.util.List;

/* loaded from: classes.dex */
public class a {

    /* renamed from: a, reason: collision with root package name */
    public final String f28772a;

    /* renamed from: b, reason: collision with root package name */
    public final String f28773b;

    /* renamed from: c, reason: collision with root package name */
    public final List<f> f28774c;

    /* renamed from: d, reason: collision with root package name */
    public final String f28775d;

    /* renamed from: e, reason: collision with root package name */
    public final String f28776e;

    /* renamed from: f, reason: collision with root package name */
    public final String f28777f;

    /* renamed from: g, reason: collision with root package name */
    public final String f28778g;

    /* renamed from: h, reason: collision with root package name */
    public final sc.f f28779h;

    public a(String str, String str2, List<f> list, String str3, String str4, String str5, String str6, sc.f fVar) {
        this.f28772a = str;
        this.f28773b = str2;
        this.f28774c = list;
        this.f28775d = str3;
        this.f28776e = str4;
        this.f28777f = str5;
        this.f28778g = str6;
        this.f28779h = fVar;
    }

    public static a a(Context context, b0 b0Var, String str, String str2, List<f> list, sc.f fVar) {
        String packageName = context.getPackageName();
        String g10 = b0Var.g();
        PackageInfo packageInfo = context.getPackageManager().getPackageInfo(packageName, 0);
        String b10 = b(packageInfo);
        String str3 = packageInfo.versionName;
        if (str3 == null) {
            str3 = "0.0";
        }
        return new a(str, str2, list, g10, packageName, b10, str3, fVar);
    }

    private static String b(PackageInfo packageInfo) {
        long longVersionCode;
        if (Build.VERSION.SDK_INT < 28) {
            return Integer.toString(packageInfo.versionCode);
        }
        longVersionCode = packageInfo.getLongVersionCode();
        return Long.toString(longVersionCode);
    }
}

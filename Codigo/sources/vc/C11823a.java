package vc;

import android.content.Context;
import android.content.pm.PackageInfo;
import android.os.Build;
import java.util.List;
import sc.C10888f;

/* renamed from: vc.a */
/* loaded from: classes.dex */
public class C11823a {

    /* renamed from: a */
    public final String f31206a;

    /* renamed from: b */
    public final String f31207b;

    /* renamed from: c */
    public final List<C11833f> f31208c;

    /* renamed from: d */
    public final String f31209d;

    /* renamed from: e */
    public final String f31210e;

    /* renamed from: f */
    public final String f31211f;

    /* renamed from: g */
    public final String f31212g;

    /* renamed from: h */
    public final C10888f f31213h;

    public C11823a(String str, String str2, List<C11833f> list, String str3, String str4, String str5, String str6, C10888f c10888f) {
        this.f31206a = str;
        this.f31207b = str2;
        this.f31208c = list;
        this.f31209d = str3;
        this.f31210e = str4;
        this.f31211f = str5;
        this.f31212g = str6;
        this.f31213h = c10888f;
    }

    /* renamed from: a */
    public static C11823a m37666a(Context context, C11826b0 c11826b0, String str, String str2, List<C11833f> list, C10888f c10888f) {
        String packageName = context.getPackageName();
        String m37685g = c11826b0.m37685g();
        PackageInfo packageInfo = context.getPackageManager().getPackageInfo(packageName, 0);
        String m37667b = m37667b(packageInfo);
        String str3 = packageInfo.versionName;
        if (str3 == null) {
            str3 = "0.0";
        }
        return new C11823a(str, str2, list, m37685g, packageName, m37667b, str3, c10888f);
    }

    /* renamed from: b */
    private static String m37667b(PackageInfo packageInfo) {
        long longVersionCode;
        if (Build.VERSION.SDK_INT < 28) {
            return Integer.toString(packageInfo.versionCode);
        }
        longVersionCode = packageInfo.getLongVersionCode();
        return Long.toString(longVersionCode);
    }
}

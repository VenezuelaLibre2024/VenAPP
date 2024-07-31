package androidx.appcompat.view;

import android.content.Context;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.content.res.TypedArray;
import p111g.C7377a;
import p111g.C7378b;
import p111g.C7380d;
import p111g.C7386j;

/* renamed from: androidx.appcompat.view.a */
/* loaded from: classes.dex */
public class C0242a {

    /* renamed from: a */
    private Context f1070a;

    private C0242a(Context context) {
        this.f1070a = context;
    }

    /* renamed from: b */
    public static C0242a m1170b(Context context) {
        return new C0242a(context);
    }

    /* renamed from: a */
    public boolean m1171a() {
        return this.f1070a.getApplicationInfo().targetSdkVersion < 14;
    }

    /* renamed from: c */
    public int m1172c() {
        return this.f1070a.getResources().getDisplayMetrics().widthPixels / 2;
    }

    /* renamed from: d */
    public int m1173d() {
        Configuration configuration = this.f1070a.getResources().getConfiguration();
        int i10 = configuration.screenWidthDp;
        int i11 = configuration.screenHeightDp;
        if (configuration.smallestScreenWidthDp > 600 || i10 > 600) {
            return 5;
        }
        if (i10 > 960 && i11 > 720) {
            return 5;
        }
        if (i10 > 720 && i11 > 960) {
            return 5;
        }
        if (i10 >= 500) {
            return 4;
        }
        if (i10 > 640 && i11 > 480) {
            return 4;
        }
        if (i10 <= 480 || i11 <= 640) {
            return i10 >= 360 ? 3 : 2;
        }
        return 4;
    }

    /* renamed from: e */
    public int m1174e() {
        return this.f1070a.getResources().getDimensionPixelSize(C7380d.f16734b);
    }

    /* renamed from: f */
    public int m1175f() {
        TypedArray obtainStyledAttributes = this.f1070a.obtainStyledAttributes(null, C7386j.f16979a, C7377a.f16699c, 0);
        int layoutDimension = obtainStyledAttributes.getLayoutDimension(C7386j.f17024j, 0);
        Resources resources = this.f1070a.getResources();
        if (!m1176g()) {
            layoutDimension = Math.min(layoutDimension, resources.getDimensionPixelSize(C7380d.f16733a));
        }
        obtainStyledAttributes.recycle();
        return layoutDimension;
    }

    /* renamed from: g */
    public boolean m1176g() {
        return this.f1070a.getResources().getBoolean(C7378b.f16724a);
    }

    /* renamed from: h */
    public boolean m1177h() {
        return true;
    }
}

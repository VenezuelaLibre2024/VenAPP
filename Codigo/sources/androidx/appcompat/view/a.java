package androidx.appcompat.view;

import android.content.Context;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.content.res.TypedArray;

/* loaded from: classes.dex */
public class a {

    /* renamed from: a, reason: collision with root package name */
    private Context f939a;

    private a(Context context) {
        this.f939a = context;
    }

    public static a b(Context context) {
        return new a(context);
    }

    public boolean a() {
        return this.f939a.getApplicationInfo().targetSdkVersion < 14;
    }

    public int c() {
        return this.f939a.getResources().getDisplayMetrics().widthPixels / 2;
    }

    public int d() {
        Configuration configuration = this.f939a.getResources().getConfiguration();
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

    public int e() {
        return this.f939a.getResources().getDimensionPixelSize(g.d.f15298b);
    }

    public int f() {
        TypedArray obtainStyledAttributes = this.f939a.obtainStyledAttributes(null, g.j.f15401a, g.a.f15263c, 0);
        int layoutDimension = obtainStyledAttributes.getLayoutDimension(g.j.f15446j, 0);
        Resources resources = this.f939a.getResources();
        if (!g()) {
            layoutDimension = Math.min(layoutDimension, resources.getDimensionPixelSize(g.d.f15297a));
        }
        obtainStyledAttributes.recycle();
        return layoutDimension;
    }

    public boolean g() {
        return this.f939a.getResources().getBoolean(g.b.f15288a);
    }

    public boolean h() {
        return true;
    }
}

package la;

import android.content.Context;
import android.content.pm.PackageManager;
import android.os.Build;
import ca.C1912k;
import com.google.android.apps.common.proguard.SideEffectFree;
import io.flutter.plugins.firebase.auth.Constants;

/* renamed from: la.j */
/* loaded from: classes.dex */
public final class C9465j {

    /* renamed from: a */
    private static Boolean f23002a;

    /* renamed from: b */
    private static Boolean f23003b;

    /* renamed from: c */
    private static Boolean f23004c;

    /* renamed from: d */
    private static Boolean f23005d;

    /* renamed from: e */
    private static Boolean f23006e;

    /* renamed from: f */
    private static Boolean f23007f;

    /* renamed from: a */
    public static boolean m28143a(Context context) {
        PackageManager packageManager = context.getPackageManager();
        if (f23006e == null) {
            boolean z10 = false;
            if (C9471p.m28172i() && packageManager.hasSystemFeature("android.hardware.type.automotive")) {
                z10 = true;
            }
            f23006e = Boolean.valueOf(z10);
        }
        return f23006e.booleanValue();
    }

    /* renamed from: b */
    public static boolean m28144b(Context context) {
        if (f23007f == null) {
            boolean z10 = false;
            if (C9471p.m28175l() && context.getPackageManager().hasSystemFeature("com.google.android.play.feature.HPE_EXPERIENCE")) {
                z10 = true;
            }
            f23007f = Boolean.valueOf(z10);
        }
        return f23007f.booleanValue();
    }

    /* renamed from: c */
    public static boolean m28145c(Context context) {
        if (f23004c == null) {
            PackageManager packageManager = context.getPackageManager();
            boolean z10 = false;
            if (packageManager.hasSystemFeature("com.google.android.feature.services_updater") && packageManager.hasSystemFeature("cn.google.services")) {
                z10 = true;
            }
            f23004c = Boolean.valueOf(z10);
        }
        return f23004c.booleanValue();
    }

    /* renamed from: d */
    public static boolean m28146d(Context context) {
        return m28150h(context);
    }

    /* renamed from: e */
    public static boolean m28147e() {
        int i10 = C1912k.f7932a;
        return Constants.USER.equals(Build.TYPE);
    }

    @SideEffectFree
    /* renamed from: f */
    public static boolean m28148f(Context context) {
        return m28152j(context.getPackageManager());
    }

    /* renamed from: g */
    public static boolean m28149g(Context context) {
        if (m28148f(context) && !C9471p.m28171h()) {
            return true;
        }
        if (m28150h(context)) {
            return !C9471p.m28172i() || C9471p.m28175l();
        }
        return false;
    }

    /* renamed from: h */
    public static boolean m28150h(Context context) {
        if (f23003b == null) {
            boolean z10 = false;
            if (C9471p.m28169f() && context.getPackageManager().hasSystemFeature("cn.google")) {
                z10 = true;
            }
            f23003b = Boolean.valueOf(z10);
        }
        return f23003b.booleanValue();
    }

    /* renamed from: i */
    public static boolean m28151i(Context context) {
        if (f23005d == null) {
            boolean z10 = true;
            if (!context.getPackageManager().hasSystemFeature("android.hardware.type.iot") && !context.getPackageManager().hasSystemFeature("android.hardware.type.embedded")) {
                z10 = false;
            }
            f23005d = Boolean.valueOf(z10);
        }
        return f23005d.booleanValue();
    }

    @SideEffectFree
    /* renamed from: j */
    public static boolean m28152j(PackageManager packageManager) {
        if (f23002a == null) {
            boolean z10 = false;
            if (C9471p.m28168e() && packageManager.hasSystemFeature("android.hardware.type.watch")) {
                z10 = true;
            }
            f23002a = Boolean.valueOf(z10);
        }
        return f23002a.booleanValue();
    }
}

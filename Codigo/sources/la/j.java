package la;

import android.content.Context;
import android.content.pm.PackageManager;
import android.os.Build;
import com.google.android.apps.common.proguard.SideEffectFree;
import io.flutter.plugins.firebase.auth.Constants;

/* loaded from: classes.dex */
public final class j {

    /* renamed from: a */
    private static Boolean f21149a;

    /* renamed from: b */
    private static Boolean f21150b;

    /* renamed from: c */
    private static Boolean f21151c;

    /* renamed from: d */
    private static Boolean f21152d;

    /* renamed from: e */
    private static Boolean f21153e;

    /* renamed from: f */
    private static Boolean f21154f;

    public static boolean a(Context context) {
        PackageManager packageManager = context.getPackageManager();
        if (f21153e == null) {
            boolean z10 = false;
            if (p.i() && packageManager.hasSystemFeature("android.hardware.type.automotive")) {
                z10 = true;
            }
            f21153e = Boolean.valueOf(z10);
        }
        return f21153e.booleanValue();
    }

    public static boolean b(Context context) {
        if (f21154f == null) {
            boolean z10 = false;
            if (p.l() && context.getPackageManager().hasSystemFeature("com.google.android.play.feature.HPE_EXPERIENCE")) {
                z10 = true;
            }
            f21154f = Boolean.valueOf(z10);
        }
        return f21154f.booleanValue();
    }

    public static boolean c(Context context) {
        if (f21151c == null) {
            PackageManager packageManager = context.getPackageManager();
            boolean z10 = false;
            if (packageManager.hasSystemFeature("com.google.android.feature.services_updater") && packageManager.hasSystemFeature("cn.google.services")) {
                z10 = true;
            }
            f21151c = Boolean.valueOf(z10);
        }
        return f21151c.booleanValue();
    }

    public static boolean d(Context context) {
        return h(context);
    }

    public static boolean e() {
        int i10 = ca.k.f6983a;
        return Constants.USER.equals(Build.TYPE);
    }

    @SideEffectFree
    public static boolean f(Context context) {
        return j(context.getPackageManager());
    }

    public static boolean g(Context context) {
        if (f(context) && !p.h()) {
            return true;
        }
        if (h(context)) {
            return !p.i() || p.l();
        }
        return false;
    }

    public static boolean h(Context context) {
        if (f21150b == null) {
            boolean z10 = false;
            if (p.f() && context.getPackageManager().hasSystemFeature("cn.google")) {
                z10 = true;
            }
            f21150b = Boolean.valueOf(z10);
        }
        return f21150b.booleanValue();
    }

    public static boolean i(Context context) {
        if (f21152d == null) {
            boolean z10 = true;
            if (!context.getPackageManager().hasSystemFeature("android.hardware.type.iot") && !context.getPackageManager().hasSystemFeature("android.hardware.type.embedded")) {
                z10 = false;
            }
            f21152d = Boolean.valueOf(z10);
        }
        return f21152d.booleanValue();
    }

    @SideEffectFree
    public static boolean j(PackageManager packageManager) {
        if (f21149a == null) {
            boolean z10 = false;
            if (p.e() && packageManager.hasSystemFeature("android.hardware.type.watch")) {
                z10 = true;
            }
            f21149a = Boolean.valueOf(z10);
        }
        return f21149a.booleanValue();
    }
}

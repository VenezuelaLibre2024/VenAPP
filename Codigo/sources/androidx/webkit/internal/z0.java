package androidx.webkit.internal;

import android.content.ComponentName;
import android.content.Context;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.content.pm.ServiceInfo;
import android.os.Build;
import android.os.Bundle;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

/* loaded from: classes.dex */
public abstract class z0 {

    /* renamed from: c */
    private static final Set<z0> f5639c = new HashSet();

    /* renamed from: a */
    private final String f5640a;

    /* renamed from: b */
    private final String f5641b;

    /* loaded from: classes.dex */
    public static class a extends z0 {
        public a(String str, String str2) {
            super(str, str2);
        }

        @Override // androidx.webkit.internal.z0
        public final boolean e() {
            return false;
        }
    }

    /* loaded from: classes.dex */
    public static class b extends z0 {
        public b(String str, String str2) {
            super(str, str2);
        }

        @Override // androidx.webkit.internal.z0
        public final boolean e() {
            return Build.VERSION.SDK_INT >= 28;
        }
    }

    z0(String str, String str2) {
        this.f5640a = str;
        this.f5641b = str2;
        f5639c.add(this);
    }

    private static Bundle a(Context context) {
        PackageInfo f10 = e2.s.f(context);
        if (f10 == null) {
            return null;
        }
        ComponentName componentName = new ComponentName(f10.packageName, "org.chromium.android_webview.services.StartupFeatureMetadataHolder");
        if (Build.VERSION.SDK_INT < 33) {
            try {
                return c(context, componentName, 640).metaData;
            } catch (PackageManager.NameNotFoundException unused) {
                return null;
            }
        }
        try {
            return l0.a(context.getPackageManager(), componentName, l0.b(640L)).metaData;
        } catch (PackageManager.NameNotFoundException unused2) {
            return null;
        }
    }

    private static ServiceInfo c(Context context, ComponentName componentName, int i10) {
        return context.getPackageManager().getServiceInfo(componentName, i10);
    }

    public static Set<z0> g() {
        return Collections.unmodifiableSet(f5639c);
    }

    public String b() {
        return this.f5640a;
    }

    public boolean d(Context context) {
        return e() || f(context);
    }

    public abstract boolean e();

    public boolean f(Context context) {
        Bundle a10 = a(context);
        if (a10 == null) {
            return false;
        }
        return a10.containsKey(this.f5641b);
    }
}

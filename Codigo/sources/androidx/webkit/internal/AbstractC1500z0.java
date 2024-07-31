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
import p073e2.C7115s;

/* renamed from: androidx.webkit.internal.z0 */
/* loaded from: classes.dex */
public abstract class AbstractC1500z0 {

    /* renamed from: c */
    private static final Set<AbstractC1500z0> f6490c = new HashSet();

    /* renamed from: a */
    private final String f6491a;

    /* renamed from: b */
    private final String f6492b;

    /* renamed from: androidx.webkit.internal.z0$a */
    /* loaded from: classes.dex */
    public static class a extends AbstractC1500z0 {
        /* JADX INFO: Access modifiers changed from: package-private */
        public a(String str, String str2) {
            super(str, str2);
        }

        @Override // androidx.webkit.internal.AbstractC1500z0
        /* renamed from: e */
        public final boolean mo8469e() {
            return false;
        }
    }

    /* renamed from: androidx.webkit.internal.z0$b */
    /* loaded from: classes.dex */
    public static class b extends AbstractC1500z0 {
        /* JADX INFO: Access modifiers changed from: package-private */
        public b(String str, String str2) {
            super(str, str2);
        }

        @Override // androidx.webkit.internal.AbstractC1500z0
        /* renamed from: e */
        public final boolean mo8469e() {
            return Build.VERSION.SDK_INT >= 28;
        }
    }

    AbstractC1500z0(String str, String str2) {
        this.f6491a = str;
        this.f6492b = str2;
        f6490c.add(this);
    }

    /* renamed from: a */
    private static Bundle m8464a(Context context) {
        PackageInfo m20993f = C7115s.m20993f(context);
        if (m20993f == null) {
            return null;
        }
        ComponentName componentName = new ComponentName(m20993f.packageName, "org.chromium.android_webview.services.StartupFeatureMetadataHolder");
        if (Build.VERSION.SDK_INT < 33) {
            try {
                return m8465c(context, componentName, 640).metaData;
            } catch (PackageManager.NameNotFoundException unused) {
                return null;
            }
        }
        try {
            return C1465l0.m8381a(context.getPackageManager(), componentName, C1465l0.m8382b(640L)).metaData;
        } catch (PackageManager.NameNotFoundException unused2) {
            return null;
        }
    }

    /* renamed from: c */
    private static ServiceInfo m8465c(Context context, ComponentName componentName, int i10) {
        return context.getPackageManager().getServiceInfo(componentName, i10);
    }

    /* renamed from: g */
    public static Set<AbstractC1500z0> m8466g() {
        return Collections.unmodifiableSet(f6490c);
    }

    /* renamed from: b */
    public String m8467b() {
        return this.f6491a;
    }

    /* renamed from: d */
    public boolean m8468d(Context context) {
        return mo8469e() || m8470f(context);
    }

    /* renamed from: e */
    public abstract boolean mo8469e();

    /* renamed from: f */
    public boolean m8470f(Context context) {
        Bundle m8464a = m8464a(context);
        if (m8464a == null) {
            return false;
        }
        return m8464a.containsKey(this.f6492b);
    }
}

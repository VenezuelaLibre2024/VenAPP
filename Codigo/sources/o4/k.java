package o4;

import android.content.Context;
import android.content.pm.ApplicationInfo;
import com.facebook.internal.n;
import com.google.android.libraries.barhopper.RecognitionOptions;
import i4.e0;
import java.util.List;
import java.util.concurrent.atomic.AtomicBoolean;
import xk.q;

/* loaded from: classes.dex */
public final class k {

    /* renamed from: a, reason: collision with root package name */
    public static final k f22229a = new k();

    /* renamed from: b, reason: collision with root package name */
    private static final AtomicBoolean f22230b = new AtomicBoolean(false);

    private k() {
    }

    public static final void a() {
        if (a5.a.d(k.class)) {
            return;
        }
        try {
            f22230b.set(true);
            b();
        } catch (Throwable th2) {
            a5.a.b(th2, k.class);
        }
    }

    public static final void b() {
        if (a5.a.d(k.class)) {
            return;
        }
        try {
            if (f22230b.get()) {
                if (f22229a.c()) {
                    n nVar = n.f7774a;
                    if (n.g(n.b.IapLoggingLib2)) {
                        f fVar = f.f22188a;
                        f.d(e0.l());
                        return;
                    }
                }
                a.g();
            }
        } catch (Throwable th2) {
            a5.a.b(th2, k.class);
        }
    }

    private final boolean c() {
        List u02;
        if (a5.a.d(this)) {
            return false;
        }
        try {
            Context l10 = e0.l();
            ApplicationInfo applicationInfo = l10.getPackageManager().getApplicationInfo(l10.getPackageName(), RecognitionOptions.ITF);
            kotlin.jvm.internal.n.d(applicationInfo, "context.packageManager.getApplicationInfo(\n              context.packageName, PackageManager.GET_META_DATA)");
            String string = applicationInfo.metaData.getString("com.google.android.play.billingclient.version");
            if (string == null) {
                return false;
            }
            u02 = q.u0(string, new String[]{"."}, false, 3, 2, null);
            return Integer.parseInt((String) u02.get(0)) >= 2;
        } catch (Exception unused) {
            return false;
        } catch (Throwable th2) {
            a5.a.b(th2, this);
            return false;
        }
    }
}

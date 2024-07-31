package p264o4;

import android.content.Context;
import android.content.pm.ApplicationInfo;
import com.facebook.internal.C4633n;
import com.google.android.libraries.barhopper.RecognitionOptions;
import java.util.List;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.jvm.internal.C9322n;
import p007a5.C0033a;
import p152i4.C7799e0;
import p450xk.C12525q;

/* renamed from: o4.k */
/* loaded from: classes.dex */
public final class C9789k {

    /* renamed from: a */
    public static final C9789k f24162a = new C9789k();

    /* renamed from: b */
    private static final AtomicBoolean f24163b = new AtomicBoolean(false);

    private C9789k() {
    }

    /* renamed from: a */
    public static final void m29409a() {
        if (C0033a.m107d(C9789k.class)) {
            return;
        }
        try {
            f24163b.set(true);
            m29410b();
        } catch (Throwable th2) {
            C0033a.m105b(th2, C9789k.class);
        }
    }

    /* renamed from: b */
    public static final void m29410b() {
        if (C0033a.m107d(C9789k.class)) {
            return;
        }
        try {
            if (f24163b.get()) {
                if (f24162a.m29411c()) {
                    C4633n c4633n = C4633n.f8754a;
                    if (C4633n.m11254g(C4633n.b.IapLoggingLib2)) {
                        C9784f c9784f = C9784f.f24121a;
                        C9784f.m29354d(C7799e0.m23860l());
                        return;
                    }
                }
                C9779a.m29345g();
            }
        } catch (Throwable th2) {
            C0033a.m105b(th2, C9789k.class);
        }
    }

    /* renamed from: c */
    private final boolean m29411c() {
        List m41098u0;
        if (C0033a.m107d(this)) {
            return false;
        }
        try {
            Context m23860l = C7799e0.m23860l();
            ApplicationInfo applicationInfo = m23860l.getPackageManager().getApplicationInfo(m23860l.getPackageName(), RecognitionOptions.ITF);
            C9322n.m27780d(applicationInfo, "context.packageManager.getApplicationInfo(\n              context.packageName, PackageManager.GET_META_DATA)");
            String string = applicationInfo.metaData.getString("com.google.android.play.billingclient.version");
            if (string == null) {
                return false;
            }
            m41098u0 = C12525q.m41098u0(string, new String[]{"."}, false, 3, 2, null);
            return Integer.parseInt((String) m41098u0.get(0)) >= 2;
        } catch (Exception unused) {
            return false;
        } catch (Throwable th2) {
            C0033a.m105b(th2, this);
            return false;
        }
    }
}

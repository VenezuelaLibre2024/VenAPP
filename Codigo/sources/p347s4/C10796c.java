package p347s4;

import android.content.Context;
import android.content.SharedPreferences;
import com.facebook.appevents.C4569d;
import com.facebook.internal.C4634n0;
import dk.C7029q;
import dk.C7030q0;
import java.util.List;
import java.util.Set;
import kotlin.jvm.internal.C9322n;
import p007a5.C0033a;
import p152i4.C7799e0;

/* renamed from: s4.c */
/* loaded from: classes.dex */
public final class C10796c {

    /* renamed from: a */
    public static final C10796c f27252a = new C10796c();

    /* renamed from: b */
    private static final Set<String> f27253b;

    static {
        Set<String> m20577i;
        m20577i = C7030q0.m20577i("fb_mobile_purchase", "StartTrial", "Subscribe");
        f27253b = m20577i;
    }

    private C10796c() {
    }

    /* renamed from: c */
    private final boolean m32892c(C4569d c4569d) {
        if (C0033a.m107d(this)) {
            return false;
        }
        try {
            return (c4569d.m10949h() ^ true) || (c4569d.m10949h() && f27253b.contains(c4569d.m10947f()));
        } catch (Throwable th2) {
            C0033a.m105b(th2, this);
            return false;
        }
    }

    /* renamed from: d */
    public static final boolean m32893d() {
        if (C0033a.m107d(C10796c.class)) {
            return false;
        }
        try {
            if ((C7799e0.m23874z(C7799e0.m23860l()) || C4634n0.m11294a0()) ? false : true) {
                return C10798e.m32902b();
            }
            return false;
        } catch (Throwable th2) {
            C0033a.m105b(th2, C10796c.class);
            return false;
        }
    }

    /* renamed from: e */
    public static final void m32894e(final String applicationId, final C4569d event) {
        if (C0033a.m107d(C10796c.class)) {
            return;
        }
        try {
            C9322n.m27781e(applicationId, "applicationId");
            C9322n.m27781e(event, "event");
            if (f27252a.m32892c(event)) {
                C7799e0.m23868t().execute(new Runnable() { // from class: s4.a
                    @Override // java.lang.Runnable
                    public final void run() {
                        C10796c.m32895f(applicationId, event);
                    }
                });
            }
        } catch (Throwable th2) {
            C0033a.m105b(th2, C10796c.class);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: f */
    public static final void m32895f(String applicationId, C4569d event) {
        List m20572e;
        if (C0033a.m107d(C10796c.class)) {
            return;
        }
        try {
            C9322n.m27781e(applicationId, "$applicationId");
            C9322n.m27781e(event, "$event");
            C10798e c10798e = C10798e.f27256a;
            m20572e = C7029q.m20572e(event);
            C10798e.m32903c(applicationId, m20572e);
        } catch (Throwable th2) {
            C0033a.m105b(th2, C10796c.class);
        }
    }

    /* renamed from: g */
    public static final void m32896g(final String str, final String str2) {
        if (C0033a.m107d(C10796c.class)) {
            return;
        }
        try {
            final Context m23860l = C7799e0.m23860l();
            if (m23860l == null || str == null || str2 == null) {
                return;
            }
            C7799e0.m23868t().execute(new Runnable() { // from class: s4.b
                @Override // java.lang.Runnable
                public final void run() {
                    C10796c.m32897h(m23860l, str2, str);
                }
            });
        } catch (Throwable th2) {
            C0033a.m105b(th2, C10796c.class);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: h */
    public static final void m32897h(Context context, String str, String str2) {
        if (C0033a.m107d(C10796c.class)) {
            return;
        }
        try {
            C9322n.m27781e(context, "$context");
            SharedPreferences sharedPreferences = context.getSharedPreferences(str, 0);
            String m27787k = C9322n.m27787k(str2, "pingForOnDevice");
            if (sharedPreferences.getLong(m27787k, 0L) == 0) {
                C10798e.m32905e(str2);
                SharedPreferences.Editor edit = sharedPreferences.edit();
                edit.putLong(m27787k, System.currentTimeMillis());
                edit.apply();
            }
        } catch (Throwable th2) {
            C0033a.m105b(th2, C10796c.class);
        }
    }
}

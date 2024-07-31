package p172j4;

import android.app.Activity;
import com.facebook.internal.C4607a;
import com.facebook.internal.C4634n0;
import com.facebook.internal.C4641r;
import com.facebook.internal.C4648v;
import kotlin.jvm.internal.C9322n;
import p007a5.C0033a;
import p152i4.C7799e0;

/* renamed from: j4.b */
/* loaded from: classes.dex */
public final class C8981b {

    /* renamed from: a */
    public static final C8981b f21518a = new C8981b();

    /* renamed from: b */
    private static final String f21519b = C8981b.class.getCanonicalName();

    /* renamed from: c */
    private static boolean f21520c;

    private C8981b() {
    }

    /* renamed from: b */
    public static final void m26345b() {
        try {
            if (C0033a.m107d(C8981b.class)) {
                return;
            }
            try {
                C7799e0.m23868t().execute(new Runnable() { // from class: j4.a
                    @Override // java.lang.Runnable
                    public final void run() {
                        C8981b.m26346c();
                    }
                });
            } catch (Exception e10) {
                C4634n0 c4634n0 = C4634n0.f8760a;
                C4634n0.m11312j0(f21519b, e10);
            }
        } catch (Throwable th2) {
            C0033a.m105b(th2, C8981b.class);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: c */
    public static final void m26346c() {
        if (C0033a.m107d(C8981b.class)) {
            return;
        }
        try {
            if (C4607a.f8672f.m11115h(C7799e0.m23860l())) {
                return;
            }
            f21518a.m26348e();
            f21520c = true;
        } catch (Throwable th2) {
            C0033a.m105b(th2, C8981b.class);
        }
    }

    /* renamed from: d */
    public static final void m26347d(Activity activity) {
        if (C0033a.m107d(C8981b.class)) {
            return;
        }
        try {
            C9322n.m27781e(activity, "activity");
            try {
                if (f21520c && !C8983d.f21522d.m26361c().isEmpty()) {
                    ViewTreeObserverOnGlobalFocusChangeListenerC8985f.f21529e.m26375e(activity);
                }
            } catch (Exception unused) {
            }
        } catch (Throwable th2) {
            C0033a.m105b(th2, C8981b.class);
        }
    }

    /* renamed from: e */
    private final void m26348e() {
        String m11383i;
        if (C0033a.m107d(this)) {
            return;
        }
        try {
            C4648v c4648v = C4648v.f8854a;
            C4641r m11457q = C4648v.m11457q(C7799e0.m23861m(), false);
            if (m11457q == null || (m11383i = m11457q.m11383i()) == null) {
                return;
            }
            C8983d.f21522d.m26362d(m11383i);
        } catch (Throwable th2) {
            C0033a.m105b(th2, this);
        }
    }
}

package j4;

import android.app.Activity;
import com.facebook.internal.n0;
import com.facebook.internal.r;
import com.facebook.internal.v;
import i4.e0;
import kotlin.jvm.internal.n;

/* loaded from: classes.dex */
public final class b {

    /* renamed from: a, reason: collision with root package name */
    public static final b f19739a = new b();

    /* renamed from: b, reason: collision with root package name */
    private static final String f19740b = b.class.getCanonicalName();

    /* renamed from: c, reason: collision with root package name */
    private static boolean f19741c;

    private b() {
    }

    public static final void b() {
        try {
            if (a5.a.d(b.class)) {
                return;
            }
            try {
                e0.t().execute(new Runnable() { // from class: j4.a
                    @Override // java.lang.Runnable
                    public final void run() {
                        b.c();
                    }
                });
            } catch (Exception e10) {
                n0 n0Var = n0.f7780a;
                n0.j0(f19740b, e10);
            }
        } catch (Throwable th2) {
            a5.a.b(th2, b.class);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void c() {
        if (a5.a.d(b.class)) {
            return;
        }
        try {
            if (com.facebook.internal.a.f7697f.h(e0.l())) {
                return;
            }
            f19739a.e();
            f19741c = true;
        } catch (Throwable th2) {
            a5.a.b(th2, b.class);
        }
    }

    public static final void d(Activity activity) {
        if (a5.a.d(b.class)) {
            return;
        }
        try {
            n.e(activity, "activity");
            try {
                if (f19741c && !d.f19743d.c().isEmpty()) {
                    f.f19750e.e(activity);
                }
            } catch (Exception unused) {
            }
        } catch (Throwable th2) {
            a5.a.b(th2, b.class);
        }
    }

    private final void e() {
        String i10;
        if (a5.a.d(this)) {
            return;
        }
        try {
            v vVar = v.f7874a;
            r q10 = v.q(e0.m(), false);
            if (q10 == null || (i10 = q10.i()) == null) {
                return;
            }
            d.f19743d.d(i10);
        } catch (Throwable th2) {
            a5.a.b(th2, this);
        }
    }
}

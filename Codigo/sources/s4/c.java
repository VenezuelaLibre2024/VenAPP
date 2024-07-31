package s4;

import android.content.Context;
import android.content.SharedPreferences;
import com.facebook.internal.n0;
import dk.q;
import dk.q0;
import i4.e0;
import java.util.List;
import java.util.Set;
import kotlin.jvm.internal.n;

/* loaded from: classes.dex */
public final class c {

    /* renamed from: a, reason: collision with root package name */
    public static final c f25133a = new c();

    /* renamed from: b, reason: collision with root package name */
    private static final Set<String> f25134b;

    static {
        Set<String> i10;
        i10 = q0.i("fb_mobile_purchase", "StartTrial", "Subscribe");
        f25134b = i10;
    }

    private c() {
    }

    private final boolean c(com.facebook.appevents.d dVar) {
        if (a5.a.d(this)) {
            return false;
        }
        try {
            return (dVar.h() ^ true) || (dVar.h() && f25134b.contains(dVar.f()));
        } catch (Throwable th2) {
            a5.a.b(th2, this);
            return false;
        }
    }

    public static final boolean d() {
        if (a5.a.d(c.class)) {
            return false;
        }
        try {
            if ((e0.z(e0.l()) || n0.a0()) ? false : true) {
                return e.b();
            }
            return false;
        } catch (Throwable th2) {
            a5.a.b(th2, c.class);
            return false;
        }
    }

    public static final void e(final String applicationId, final com.facebook.appevents.d event) {
        if (a5.a.d(c.class)) {
            return;
        }
        try {
            n.e(applicationId, "applicationId");
            n.e(event, "event");
            if (f25133a.c(event)) {
                e0.t().execute(new Runnable() { // from class: s4.a
                    @Override // java.lang.Runnable
                    public final void run() {
                        c.f(applicationId, event);
                    }
                });
            }
        } catch (Throwable th2) {
            a5.a.b(th2, c.class);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void f(String applicationId, com.facebook.appevents.d event) {
        List e10;
        if (a5.a.d(c.class)) {
            return;
        }
        try {
            n.e(applicationId, "$applicationId");
            n.e(event, "$event");
            e eVar = e.f25137a;
            e10 = q.e(event);
            e.c(applicationId, e10);
        } catch (Throwable th2) {
            a5.a.b(th2, c.class);
        }
    }

    public static final void g(final String str, final String str2) {
        if (a5.a.d(c.class)) {
            return;
        }
        try {
            final Context l10 = e0.l();
            if (l10 == null || str == null || str2 == null) {
                return;
            }
            e0.t().execute(new Runnable() { // from class: s4.b
                @Override // java.lang.Runnable
                public final void run() {
                    c.h(l10, str2, str);
                }
            });
        } catch (Throwable th2) {
            a5.a.b(th2, c.class);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void h(Context context, String str, String str2) {
        if (a5.a.d(c.class)) {
            return;
        }
        try {
            n.e(context, "$context");
            SharedPreferences sharedPreferences = context.getSharedPreferences(str, 0);
            String k10 = n.k(str2, "pingForOnDevice");
            if (sharedPreferences.getLong(k10, 0L) == 0) {
                e.e(str2);
                SharedPreferences.Editor edit = sharedPreferences.edit();
                edit.putLong(k10, System.currentTimeMillis());
                edit.apply();
            }
        } catch (Throwable th2) {
            a5.a.b(th2, c.class);
        }
    }
}

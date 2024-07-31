package o4;

import android.content.Context;
import kotlin.jvm.internal.n;
import o4.h;

/* loaded from: classes.dex */
public final class f {

    /* renamed from: a, reason: collision with root package name */
    public static final f f22188a = new f();

    private f() {
    }

    private final void c() {
        if (a5.a.d(this)) {
            return;
        }
        try {
            j jVar = j.f22225a;
            h.b bVar = h.f22191s;
            j.e(bVar.d(), bVar.e());
            bVar.d().clear();
        } catch (Throwable th2) {
            a5.a.b(th2, this);
        }
    }

    public static final void d(Context context) {
        h.b bVar;
        h c10;
        if (a5.a.d(f.class)) {
            return;
        }
        try {
            n.e(context, "context");
            if (m.a("com.android.billingclient.api.Purchase") == null || (c10 = (bVar = h.f22191s).c(context)) == null || !bVar.f().get()) {
                return;
            }
            if (j.d()) {
                c10.p("inapp", new Runnable() { // from class: o4.d
                    @Override // java.lang.Runnable
                    public final void run() {
                        f.e();
                    }
                });
            } else {
                c10.o("inapp", new Runnable() { // from class: o4.e
                    @Override // java.lang.Runnable
                    public final void run() {
                        f.f();
                    }
                });
            }
        } catch (Throwable th2) {
            a5.a.b(th2, f.class);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void e() {
        if (a5.a.d(f.class)) {
            return;
        }
        try {
            f22188a.c();
        } catch (Throwable th2) {
            a5.a.b(th2, f.class);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void f() {
        if (a5.a.d(f.class)) {
            return;
        }
        try {
            f22188a.c();
        } catch (Throwable th2) {
            a5.a.b(th2, f.class);
        }
    }
}

package p264o4;

import android.content.Context;
import kotlin.jvm.internal.C9322n;
import p007a5.C0033a;
import p264o4.C9786h;

/* renamed from: o4.f */
/* loaded from: classes.dex */
public final class C9784f {

    /* renamed from: a */
    public static final C9784f f24121a = new C9784f();

    private C9784f() {
    }

    /* renamed from: c */
    private final void m29353c() {
        if (C0033a.m107d(this)) {
            return;
        }
        try {
            C9788j c9788j = C9788j.f24158a;
            C9786h.b bVar = C9786h.f24124s;
            C9788j.m29403e(bVar.m29380d(), bVar.m29381e());
            bVar.m29380d().clear();
        } catch (Throwable th2) {
            C0033a.m105b(th2, this);
        }
    }

    /* renamed from: d */
    public static final void m29354d(Context context) {
        C9786h.b bVar;
        C9786h m29379c;
        if (C0033a.m107d(C9784f.class)) {
            return;
        }
        try {
            C9322n.m27781e(context, "context");
            if (C9791m.m29419a("com.android.billingclient.api.Purchase") == null || (m29379c = (bVar = C9786h.f24124s).m29379c(context)) == null || !bVar.m29382f().get()) {
                return;
            }
            if (C9788j.m29402d()) {
                m29379c.m29376p("inapp", new Runnable() { // from class: o4.d
                    @Override // java.lang.Runnable
                    public final void run() {
                        C9784f.m29355e();
                    }
                });
            } else {
                m29379c.m29375o("inapp", new Runnable() { // from class: o4.e
                    @Override // java.lang.Runnable
                    public final void run() {
                        C9784f.m29356f();
                    }
                });
            }
        } catch (Throwable th2) {
            C0033a.m105b(th2, C9784f.class);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: e */
    public static final void m29355e() {
        if (C0033a.m107d(C9784f.class)) {
            return;
        }
        try {
            f24121a.m29353c();
        } catch (Throwable th2) {
            C0033a.m105b(th2, C9784f.class);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: f */
    public static final void m29356f() {
        if (C0033a.m107d(C9784f.class)) {
            return;
        }
        try {
            f24121a.m29353c();
        } catch (Throwable th2) {
            C0033a.m105b(th2, C9784f.class);
        }
    }
}

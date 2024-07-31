package x4;

import com.facebook.internal.n;
import i4.e0;

/* loaded from: classes.dex */
public final class g {

    /* renamed from: a, reason: collision with root package name */
    public static final g f30397a = new g();

    private g() {
    }

    public static final void d() {
        if (e0.p()) {
            n nVar = n.f7774a;
            n.a(n.b.CrashReport, new n.a() { // from class: x4.d
                @Override // com.facebook.internal.n.a
                public final void a(boolean z10) {
                    g.e(z10);
                }
            });
            n.a(n.b.ErrorReport, new n.a() { // from class: x4.e
                @Override // com.facebook.internal.n.a
                public final void a(boolean z10) {
                    g.f(z10);
                }
            });
            n.a(n.b.AnrReport, new n.a() { // from class: x4.f
                @Override // com.facebook.internal.n.a
                public final void a(boolean z10) {
                    g.g(z10);
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void e(boolean z10) {
        if (z10) {
            z4.c.f32318b.c();
            n nVar = n.f7774a;
            if (n.g(n.b.CrashShield)) {
                b.b();
                a5.a.a();
            }
            if (n.g(n.b.ThreadCheck)) {
                c5.a.a();
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void f(boolean z10) {
        if (z10) {
            b5.e.d();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void g(boolean z10) {
        if (z10) {
            y4.e.c();
        }
    }
}

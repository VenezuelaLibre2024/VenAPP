package p434x4;

import com.facebook.internal.C4633n;
import p007a5.C0033a;
import p023b5.C1661e;
import p037c5.C1872a;
import p152i4.C7799e0;
import p457y4.C12602e;
import p479z4.C12801c;

/* renamed from: x4.g */
/* loaded from: classes.dex */
public final class C12280g {

    /* renamed from: a */
    public static final C12280g f32909a = new C12280g();

    private C12280g() {
    }

    /* renamed from: d */
    public static final void m39543d() {
        if (C7799e0.m23864p()) {
            C4633n c4633n = C4633n.f8754a;
            C4633n.m11248a(C4633n.b.CrashReport, new C4633n.a() { // from class: x4.d
                @Override // com.facebook.internal.C4633n.a
                /* renamed from: a */
                public final void mo10935a(boolean z10) {
                    C12280g.m39544e(z10);
                }
            });
            C4633n.m11248a(C4633n.b.ErrorReport, new C4633n.a() { // from class: x4.e
                @Override // com.facebook.internal.C4633n.a
                /* renamed from: a */
                public final void mo10935a(boolean z10) {
                    C12280g.m39545f(z10);
                }
            });
            C4633n.m11248a(C4633n.b.AnrReport, new C4633n.a() { // from class: x4.f
                @Override // com.facebook.internal.C4633n.a
                /* renamed from: a */
                public final void mo10935a(boolean z10) {
                    C12280g.m39546g(z10);
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: e */
    public static final void m39544e(boolean z10) {
        if (z10) {
            C12801c.f34869b.m42439c();
            C4633n c4633n = C4633n.f8754a;
            if (C4633n.m11254g(C4633n.b.CrashShield)) {
                C12275b.m39520b();
                C0033a.m104a();
            }
            if (C4633n.m11254g(C4633n.b.ThreadCheck)) {
                C1872a.m9975a();
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: f */
    public static final void m39545f(boolean z10) {
        if (z10) {
            C1661e.m9125d();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: g */
    public static final void m39546g(boolean z10) {
        if (z10) {
            C12602e.m41438c();
        }
    }
}

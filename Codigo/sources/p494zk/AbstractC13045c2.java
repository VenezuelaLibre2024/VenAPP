package p494zk;

import kotlin.jvm.internal.C9322n;

/* renamed from: zk.c2 */
/* loaded from: classes3.dex */
public abstract class AbstractC13045c2 extends AbstractC13043c0 implements InterfaceC13044c1, InterfaceC13105r1 {

    /* renamed from: d */
    public C13050d2 f35397d;

    @Override // p494zk.InterfaceC13105r1
    /* renamed from: a */
    public boolean mo43064a() {
        return true;
    }

    @Override // p494zk.InterfaceC13105r1
    /* renamed from: c */
    public C13070i2 mo43065c() {
        return null;
    }

    @Override // p494zk.InterfaceC13044c1
    public void dispose() {
        m43066w().m43100A0(this);
    }

    @Override // p089el.C7243s
    public String toString() {
        return C13092o0.m43273a(this) + '@' + C13092o0.m43274b(this) + "[job@" + C13092o0.m43274b(m43066w()) + ']';
    }

    /* renamed from: w */
    public final C13050d2 m43066w() {
        C13050d2 c13050d2 = this.f35397d;
        if (c13050d2 != null) {
            return c13050d2;
        }
        C9322n.m27792p("job");
        return null;
    }

    /* renamed from: x */
    public final void m43067x(C13050d2 c13050d2) {
        this.f35397d = c13050d2;
    }
}

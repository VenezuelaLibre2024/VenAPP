package be;

import cc.InterfaceC1940a;
import java.util.concurrent.Executor;
import p043ce.InterfaceC1956a;
import p063dc.InterfaceC6880b;
import p098f6.AbstractC7299c;
import p098f6.InterfaceC7301e;
import p098f6.InterfaceC7302f;
import p098f6.InterfaceC7303g;
import p106fe.InterfaceC7337f;
import p485zb.C12867g;
import p487zd.C12965q2;
import p487zd.C12972s;

/* renamed from: be.v0 */
/* loaded from: classes.dex */
public class C1770v0 {
    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: c */
    public static /* synthetic */ byte[] m9470c(byte[] bArr) {
        return bArr;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: d */
    public static /* synthetic */ void m9471d(InterfaceC7302f interfaceC7302f, byte[] bArr) {
        interfaceC7302f.mo21884b(AbstractC7299c.m21880d(bArr));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: e */
    public static C12965q2 m9472e(C12867g c12867g, InterfaceC7303g interfaceC7303g, InterfaceC1940a interfaceC1940a, InterfaceC7337f interfaceC7337f, InterfaceC1956a interfaceC1956a, C12972s c12972s, @InterfaceC6880b Executor executor) {
        final InterfaceC7302f mo21885a = interfaceC7303g.mo21885a("FIREBASE_INAPPMESSAGING", byte[].class, new InterfaceC7301e() { // from class: be.t0
            @Override // p098f6.InterfaceC7301e
            public final Object apply(Object obj) {
                byte[] m9470c;
                m9470c = C1770v0.m9470c((byte[]) obj);
                return m9470c;
            }
        });
        return new C12965q2(new C12965q2.b() { // from class: be.u0
            @Override // p487zd.C12965q2.b
            /* renamed from: a */
            public final void mo9464a(byte[] bArr) {
                C1770v0.m9471d(InterfaceC7302f.this, bArr);
            }
        }, interfaceC1940a, c12867g, interfaceC7337f, interfaceC1956a, c12972s, executor);
    }
}

package p459y6;

import java.io.EOFException;
import p216l7.C9400a;
import p306q7.C10286h;
import p363t8.C11146e0;

/* renamed from: y6.w */
/* loaded from: classes.dex */
public final class C12633w {

    /* renamed from: a */
    private final C11146e0 f34326a = new C11146e0(10);

    /* renamed from: a */
    public C9400a m41606a(InterfaceC12622l interfaceC12622l, C10286h.a aVar) {
        C9400a c9400a = null;
        int i10 = 0;
        while (true) {
            try {
                interfaceC12622l.mo41540q(this.f34326a.m34682e(), 0, 10);
                this.f34326a.m34677U(0);
                if (this.f34326a.m34667K() != 4801587) {
                    break;
                }
                this.f34326a.m34678V(3);
                int m34663G = this.f34326a.m34663G();
                int i11 = m34663G + 10;
                if (c9400a == null) {
                    byte[] bArr = new byte[i11];
                    System.arraycopy(this.f34326a.m34682e(), 0, bArr, 0, 10);
                    interfaceC12622l.mo41540q(bArr, 10, m34663G);
                    c9400a = new C10286h(aVar).m30832e(bArr, i11);
                } else {
                    interfaceC12622l.mo41536k(m34663G);
                }
                i10 += i11;
            } catch (EOFException unused) {
            }
        }
        interfaceC12622l.mo41534f();
        interfaceC12622l.mo41536k(i10);
        return c9400a;
    }
}

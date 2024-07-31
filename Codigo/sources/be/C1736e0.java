package be;

import dj.AbstractC6981f;
import dj.EnumC6976a;
import dj.InterfaceC6982g;
import dj.InterfaceC6983h;
import p165ij.AbstractC8003a;
import p487zd.C12970r2;

/* renamed from: be.e0 */
/* loaded from: classes.dex */
public class C1736e0 {

    /* renamed from: a */
    private C12970r2 f7361a;

    public C1736e0(C12970r2 c12970r2) {
        this.f7361a = c12970r2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: d */
    public /* synthetic */ void m9381d(final InterfaceC6982g interfaceC6982g) {
        this.f7361a.m42914a(new C12970r2.a() { // from class: be.d0
            @Override // p487zd.C12970r2.a
            /* renamed from: a */
            public final void mo9374a(String str) {
                InterfaceC6982g.this.mo20212c(str);
            }
        });
    }

    /* renamed from: e */
    public AbstractC8003a<String> m9382e() {
        AbstractC8003a<String> m20223C = AbstractC6981f.m20214e(new InterfaceC6983h() { // from class: be.c0
            @Override // dj.InterfaceC6983h
            /* renamed from: a */
            public final void mo9367a(InterfaceC6982g interfaceC6982g) {
                C1736e0.this.m9381d(interfaceC6982g);
            }
        }, EnumC6976a.BUFFER).m20223C();
        m20223C.m24580K();
        return m20223C;
    }

    /* renamed from: f */
    public C12970r2 m9383f() {
        return this.f7361a;
    }
}

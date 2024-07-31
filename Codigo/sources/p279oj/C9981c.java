package p279oj;

import dj.AbstractC6977b;
import dj.InterfaceC6978c;
import p123gj.C7579c;
import p123gj.InterfaceC7578b;
import p145hj.C7744b;
import p186jj.InterfaceC9073a;

/* renamed from: oj.c */
/* loaded from: classes3.dex */
public final class C9981c extends AbstractC6977b {

    /* renamed from: a */
    final InterfaceC9073a f24598a;

    public C9981c(InterfaceC9073a interfaceC9073a) {
        this.f24598a = interfaceC9073a;
    }

    @Override // dj.AbstractC6977b
    /* renamed from: p */
    protected void mo20208p(InterfaceC6978c interfaceC6978c) {
        InterfaceC7578b m23025b = C7579c.m23025b();
        interfaceC6978c.mo20211b(m23025b);
        try {
            this.f24598a.run();
            if (m23025b.mo616h()) {
                return;
            }
            interfaceC6978c.mo20210a();
        } catch (Throwable th2) {
            C7744b.m23648b(th2);
            if (m23025b.mo616h()) {
                return;
            }
            interfaceC6978c.onError(th2);
        }
    }
}

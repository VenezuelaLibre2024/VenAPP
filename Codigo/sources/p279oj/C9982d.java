package p279oj;

import dj.AbstractC6977b;
import dj.InterfaceC6978c;
import java.util.concurrent.Callable;
import p123gj.C7579c;
import p123gj.InterfaceC7578b;
import p145hj.C7744b;

/* renamed from: oj.d */
/* loaded from: classes3.dex */
public final class C9982d extends AbstractC6977b {

    /* renamed from: a */
    final Callable<?> f24599a;

    public C9982d(Callable<?> callable) {
        this.f24599a = callable;
    }

    @Override // dj.AbstractC6977b
    /* renamed from: p */
    protected void mo20208p(InterfaceC6978c interfaceC6978c) {
        InterfaceC7578b m23025b = C7579c.m23025b();
        interfaceC6978c.mo20211b(m23025b);
        try {
            this.f24599a.call();
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

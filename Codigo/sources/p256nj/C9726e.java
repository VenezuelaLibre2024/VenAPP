package p256nj;

import dj.InterfaceC6978c;
import java.util.concurrent.atomic.AtomicReference;
import p123gj.InterfaceC7578b;
import p145hj.C7746d;
import p205kj.EnumC9284b;
import p471yj.C12727a;

/* renamed from: nj.e */
/* loaded from: classes3.dex */
public final class C9726e extends AtomicReference<InterfaceC7578b> implements InterfaceC6978c, InterfaceC7578b {
    private static final long serialVersionUID = -7545121636549663526L;

    @Override // dj.InterfaceC6978c
    /* renamed from: a */
    public void mo20210a() {
        lazySet(EnumC9284b.DISPOSED);
    }

    @Override // dj.InterfaceC6978c
    /* renamed from: b */
    public void mo20211b(InterfaceC7578b interfaceC7578b) {
        EnumC9284b.m27697o(this, interfaceC7578b);
    }

    @Override // p123gj.InterfaceC7578b
    public void dispose() {
        EnumC9284b.m27692b(this);
    }

    @Override // p123gj.InterfaceC7578b
    /* renamed from: h */
    public boolean mo616h() {
        return get() == EnumC9284b.DISPOSED;
    }

    @Override // dj.InterfaceC6978c
    public void onError(Throwable th2) {
        lazySet(EnumC9284b.DISPOSED);
        C12727a.m41995q(new C7746d(th2));
    }
}

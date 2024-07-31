package p317qj;

import dj.InterfaceC6987l;
import java.util.concurrent.atomic.AtomicReference;
import p123gj.InterfaceC7578b;
import p145hj.C7743a;
import p145hj.C7744b;
import p186jj.InterfaceC9073a;
import p186jj.InterfaceC9076d;
import p205kj.EnumC9284b;
import p471yj.C12727a;

/* renamed from: qj.b */
/* loaded from: classes3.dex */
public final class C10496b<T> extends AtomicReference<InterfaceC7578b> implements InterfaceC6987l<T>, InterfaceC7578b {
    private static final long serialVersionUID = -6076952298809384986L;

    /* renamed from: a */
    final InterfaceC9076d<? super T> f26090a;

    /* renamed from: b */
    final InterfaceC9076d<? super Throwable> f26091b;

    /* renamed from: c */
    final InterfaceC9073a f26092c;

    public C10496b(InterfaceC9076d<? super T> interfaceC9076d, InterfaceC9076d<? super Throwable> interfaceC9076d2, InterfaceC9073a interfaceC9073a) {
        this.f26090a = interfaceC9076d;
        this.f26091b = interfaceC9076d2;
        this.f26092c = interfaceC9073a;
    }

    @Override // dj.InterfaceC6987l
    /* renamed from: a */
    public void mo20278a() {
        lazySet(EnumC9284b.DISPOSED);
        try {
            this.f26092c.run();
        } catch (Throwable th2) {
            C7744b.m23648b(th2);
            C12727a.m41995q(th2);
        }
    }

    @Override // dj.InterfaceC6987l
    /* renamed from: b */
    public void mo20279b(InterfaceC7578b interfaceC7578b) {
        EnumC9284b.m27697o(this, interfaceC7578b);
    }

    @Override // p123gj.InterfaceC7578b
    public void dispose() {
        EnumC9284b.m27692b(this);
    }

    @Override // p123gj.InterfaceC7578b
    /* renamed from: h */
    public boolean mo616h() {
        return EnumC9284b.m27693i(get());
    }

    @Override // dj.InterfaceC6987l
    public void onError(Throwable th2) {
        lazySet(EnumC9284b.DISPOSED);
        try {
            this.f26091b.accept(th2);
        } catch (Throwable th3) {
            C7744b.m23648b(th3);
            C12727a.m41995q(new C7743a(th2, th3));
        }
    }

    @Override // dj.InterfaceC6987l
    public void onSuccess(T t10) {
        lazySet(EnumC9284b.DISPOSED);
        try {
            this.f26090a.accept(t10);
        } catch (Throwable th2) {
            C7744b.m23648b(th2);
            C12727a.m41995q(th2);
        }
    }
}

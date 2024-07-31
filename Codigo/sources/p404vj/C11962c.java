package p404vj;

import dj.InterfaceC6984i;
import im.InterfaceC8016c;
import java.util.concurrent.atomic.AtomicReference;
import p123gj.InterfaceC7578b;
import p145hj.C7743a;
import p145hj.C7744b;
import p186jj.InterfaceC9073a;
import p186jj.InterfaceC9076d;
import p426wj.EnumC12224g;
import p471yj.C12727a;

/* renamed from: vj.c */
/* loaded from: classes3.dex */
public final class C11962c<T> extends AtomicReference<InterfaceC8016c> implements InterfaceC6984i<T>, InterfaceC8016c, InterfaceC7578b {
    private static final long serialVersionUID = -7251123623727029452L;

    /* renamed from: a */
    final InterfaceC9076d<? super T> f31735a;

    /* renamed from: b */
    final InterfaceC9076d<? super Throwable> f31736b;

    /* renamed from: c */
    final InterfaceC9073a f31737c;

    /* renamed from: d */
    final InterfaceC9076d<? super InterfaceC8016c> f31738d;

    public C11962c(InterfaceC9076d<? super T> interfaceC9076d, InterfaceC9076d<? super Throwable> interfaceC9076d2, InterfaceC9073a interfaceC9073a, InterfaceC9076d<? super InterfaceC8016c> interfaceC9076d3) {
        this.f31735a = interfaceC9076d;
        this.f31736b = interfaceC9076d2;
        this.f31737c = interfaceC9073a;
        this.f31738d = interfaceC9076d3;
    }

    @Override // im.InterfaceC8015b
    /* renamed from: a */
    public void mo24632a() {
        InterfaceC8016c interfaceC8016c = get();
        EnumC12224g enumC12224g = EnumC12224g.CANCELLED;
        if (interfaceC8016c != enumC12224g) {
            lazySet(enumC12224g);
            try {
                this.f31737c.run();
            } catch (Throwable th2) {
                C7744b.m23648b(th2);
                C12727a.m41995q(th2);
            }
        }
    }

    @Override // im.InterfaceC8015b
    /* renamed from: c */
    public void mo24633c(T t10) {
        if (mo616h()) {
            return;
        }
        try {
            this.f31735a.accept(t10);
        } catch (Throwable th2) {
            C7744b.m23648b(th2);
            get().cancel();
            onError(th2);
        }
    }

    @Override // im.InterfaceC8016c
    public void cancel() {
        EnumC12224g.m39353b(this);
    }

    @Override // dj.InterfaceC6984i, im.InterfaceC8015b
    /* renamed from: d */
    public void mo20249d(InterfaceC8016c interfaceC8016c) {
        if (EnumC12224g.m39358o(this, interfaceC8016c)) {
            try {
                this.f31738d.accept(this);
            } catch (Throwable th2) {
                C7744b.m23648b(th2);
                interfaceC8016c.cancel();
                onError(th2);
            }
        }
    }

    @Override // p123gj.InterfaceC7578b
    public void dispose() {
        cancel();
    }

    @Override // p123gj.InterfaceC7578b
    /* renamed from: h */
    public boolean mo616h() {
        return get() == EnumC12224g.CANCELLED;
    }

    @Override // im.InterfaceC8016c
    /* renamed from: i */
    public void mo24634i(long j10) {
        get().mo24634i(j10);
    }

    @Override // im.InterfaceC8015b
    public void onError(Throwable th2) {
        InterfaceC8016c interfaceC8016c = get();
        EnumC12224g enumC12224g = EnumC12224g.CANCELLED;
        if (interfaceC8016c == enumC12224g) {
            C12727a.m41995q(th2);
            return;
        }
        lazySet(enumC12224g);
        try {
            this.f31736b.accept(th2);
        } catch (Throwable th3) {
            C7744b.m23648b(th3);
            C12727a.m41995q(new C7743a(th2, th3));
        }
    }
}

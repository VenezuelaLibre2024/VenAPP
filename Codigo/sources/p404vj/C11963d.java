package p404vj;

import dj.InterfaceC6984i;
import im.InterfaceC8015b;
import im.InterfaceC8016c;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicReference;
import p426wj.EnumC12224g;
import p449xj.C12500c;
import p449xj.C12505h;

/* renamed from: vj.d */
/* loaded from: classes3.dex */
public class C11963d<T> extends AtomicInteger implements InterfaceC6984i<T>, InterfaceC8016c {
    private static final long serialVersionUID = -4945028590049415624L;

    /* renamed from: a */
    final InterfaceC8015b<? super T> f31739a;

    /* renamed from: b */
    final C12500c f31740b = new C12500c();

    /* renamed from: c */
    final AtomicLong f31741c = new AtomicLong();

    /* renamed from: d */
    final AtomicReference<InterfaceC8016c> f31742d = new AtomicReference<>();

    /* renamed from: e */
    final AtomicBoolean f31743e = new AtomicBoolean();

    /* renamed from: f */
    volatile boolean f31744f;

    public C11963d(InterfaceC8015b<? super T> interfaceC8015b) {
        this.f31739a = interfaceC8015b;
    }

    @Override // im.InterfaceC8015b
    /* renamed from: a */
    public void mo24632a() {
        this.f31744f = true;
        C12505h.m40937a(this.f31739a, this, this.f31740b);
    }

    @Override // im.InterfaceC8015b
    /* renamed from: c */
    public void mo24633c(T t10) {
        C12505h.m40939c(this.f31739a, t10, this, this.f31740b);
    }

    @Override // im.InterfaceC8016c
    public void cancel() {
        if (this.f31744f) {
            return;
        }
        EnumC12224g.m39353b(this.f31742d);
    }

    @Override // dj.InterfaceC6984i, im.InterfaceC8015b
    /* renamed from: d */
    public void mo20249d(InterfaceC8016c interfaceC8016c) {
        if (this.f31743e.compareAndSet(false, true)) {
            this.f31739a.mo20249d(this);
            EnumC12224g.m39355l(this.f31742d, this.f31741c, interfaceC8016c);
        } else {
            interfaceC8016c.cancel();
            cancel();
            onError(new IllegalStateException("§2.12 violated: onSubscribe must be called at most once"));
        }
    }

    @Override // im.InterfaceC8016c
    /* renamed from: i */
    public void mo24634i(long j10) {
        if (j10 > 0) {
            EnumC12224g.m39354h(this.f31742d, this.f31741c, j10);
            return;
        }
        cancel();
        onError(new IllegalArgumentException("§3.9 violated: positive request amount required but it was " + j10));
    }

    @Override // im.InterfaceC8015b
    public void onError(Throwable th2) {
        this.f31744f = true;
        C12505h.m40938b(this.f31739a, th2, this, this.f31740b);
    }
}

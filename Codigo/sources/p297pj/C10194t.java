package p297pj;

import dj.AbstractC6981f;
import dj.InterfaceC6984i;
import im.InterfaceC8015b;
import im.InterfaceC8016c;
import java.util.concurrent.atomic.AtomicLong;
import p145hj.C7744b;
import p186jj.InterfaceC9076d;
import p426wj.EnumC12224g;
import p449xj.C12501d;
import p471yj.C12727a;

/* renamed from: pj.t */
/* loaded from: classes3.dex */
public final class C10194t<T> extends AbstractC10175a<T, T> implements InterfaceC9076d<T> {

    /* renamed from: c */
    final InterfaceC9076d<? super T> f25173c;

    /* renamed from: pj.t$a */
    /* loaded from: classes3.dex */
    static final class a<T> extends AtomicLong implements InterfaceC6984i<T>, InterfaceC8016c {
        private static final long serialVersionUID = -6246093802440953054L;

        /* renamed from: a */
        final InterfaceC8015b<? super T> f25174a;

        /* renamed from: b */
        final InterfaceC9076d<? super T> f25175b;

        /* renamed from: c */
        InterfaceC8016c f25176c;

        /* renamed from: d */
        boolean f25177d;

        a(InterfaceC8015b<? super T> interfaceC8015b, InterfaceC9076d<? super T> interfaceC9076d) {
            this.f25174a = interfaceC8015b;
            this.f25175b = interfaceC9076d;
        }

        @Override // im.InterfaceC8015b
        /* renamed from: a */
        public void mo24632a() {
            if (this.f25177d) {
                return;
            }
            this.f25177d = true;
            this.f25174a.mo24632a();
        }

        @Override // im.InterfaceC8015b
        /* renamed from: c */
        public void mo24633c(T t10) {
            if (this.f25177d) {
                return;
            }
            if (get() != 0) {
                this.f25174a.mo24633c(t10);
                C12501d.m40931d(this, 1L);
                return;
            }
            try {
                this.f25175b.accept(t10);
            } catch (Throwable th2) {
                C7744b.m23648b(th2);
                cancel();
                onError(th2);
            }
        }

        @Override // im.InterfaceC8016c
        public void cancel() {
            this.f25176c.cancel();
        }

        @Override // dj.InterfaceC6984i, im.InterfaceC8015b
        /* renamed from: d */
        public void mo20249d(InterfaceC8016c interfaceC8016c) {
            if (EnumC12224g.m39360q(this.f25176c, interfaceC8016c)) {
                this.f25176c = interfaceC8016c;
                this.f25174a.mo20249d(this);
                interfaceC8016c.mo24634i(Long.MAX_VALUE);
            }
        }

        @Override // im.InterfaceC8016c
        /* renamed from: i */
        public void mo24634i(long j10) {
            if (EnumC12224g.m39359p(j10)) {
                C12501d.m40928a(this, j10);
            }
        }

        @Override // im.InterfaceC8015b
        public void onError(Throwable th2) {
            if (this.f25177d) {
                C12727a.m41995q(th2);
            } else {
                this.f25177d = true;
                this.f25174a.onError(th2);
            }
        }
    }

    public C10194t(AbstractC6981f<T> abstractC6981f) {
        super(abstractC6981f);
        this.f25173c = this;
    }

    @Override // dj.AbstractC6981f
    /* renamed from: I */
    protected void mo20229I(InterfaceC8015b<? super T> interfaceC8015b) {
        this.f24989b.m20228H(new a(interfaceC8015b, this.f25173c));
    }

    @Override // p186jj.InterfaceC9076d
    public void accept(T t10) {
    }
}
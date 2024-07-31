package p297pj;

import dj.AbstractC6981f;
import dj.InterfaceC6984i;
import im.InterfaceC8015b;
import im.InterfaceC8016c;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicReference;
import p426wj.EnumC12224g;
import p449xj.C12501d;

/* renamed from: pj.v */
/* loaded from: classes3.dex */
public final class C10196v<T> extends AbstractC10175a<T, T> {

    /* renamed from: pj.v$a */
    /* loaded from: classes3.dex */
    static final class a<T> extends AtomicInteger implements InterfaceC6984i<T>, InterfaceC8016c {
        private static final long serialVersionUID = 163080509307634843L;

        /* renamed from: a */
        final InterfaceC8015b<? super T> f25181a;

        /* renamed from: b */
        InterfaceC8016c f25182b;

        /* renamed from: c */
        volatile boolean f25183c;

        /* renamed from: d */
        Throwable f25184d;

        /* renamed from: e */
        volatile boolean f25185e;

        /* renamed from: f */
        final AtomicLong f25186f = new AtomicLong();

        /* renamed from: r */
        final AtomicReference<T> f25187r = new AtomicReference<>();

        a(InterfaceC8015b<? super T> interfaceC8015b) {
            this.f25181a = interfaceC8015b;
        }

        @Override // im.InterfaceC8015b
        /* renamed from: a */
        public void mo24632a() {
            this.f25183c = true;
            m30510e();
        }

        /* renamed from: b */
        boolean m30509b(boolean z10, boolean z11, InterfaceC8015b<?> interfaceC8015b, AtomicReference<T> atomicReference) {
            if (this.f25185e) {
                atomicReference.lazySet(null);
                return true;
            }
            if (!z10) {
                return false;
            }
            Throwable th2 = this.f25184d;
            if (th2 != null) {
                atomicReference.lazySet(null);
                interfaceC8015b.onError(th2);
                return true;
            }
            if (!z11) {
                return false;
            }
            interfaceC8015b.mo24632a();
            return true;
        }

        @Override // im.InterfaceC8015b
        /* renamed from: c */
        public void mo24633c(T t10) {
            this.f25187r.lazySet(t10);
            m30510e();
        }

        @Override // im.InterfaceC8016c
        public void cancel() {
            if (this.f25185e) {
                return;
            }
            this.f25185e = true;
            this.f25182b.cancel();
            if (getAndIncrement() == 0) {
                this.f25187r.lazySet(null);
            }
        }

        @Override // dj.InterfaceC6984i, im.InterfaceC8015b
        /* renamed from: d */
        public void mo20249d(InterfaceC8016c interfaceC8016c) {
            if (EnumC12224g.m39360q(this.f25182b, interfaceC8016c)) {
                this.f25182b = interfaceC8016c;
                this.f25181a.mo20249d(this);
                interfaceC8016c.mo24634i(Long.MAX_VALUE);
            }
        }

        /* renamed from: e */
        void m30510e() {
            if (getAndIncrement() != 0) {
                return;
            }
            InterfaceC8015b<? super T> interfaceC8015b = this.f25181a;
            AtomicLong atomicLong = this.f25186f;
            AtomicReference<T> atomicReference = this.f25187r;
            int i10 = 1;
            do {
                long j10 = 0;
                while (true) {
                    if (j10 == atomicLong.get()) {
                        break;
                    }
                    boolean z10 = this.f25183c;
                    T andSet = atomicReference.getAndSet(null);
                    boolean z11 = andSet == null;
                    if (m30509b(z10, z11, interfaceC8015b, atomicReference)) {
                        return;
                    }
                    if (z11) {
                        break;
                    }
                    interfaceC8015b.mo24633c(andSet);
                    j10++;
                }
                if (j10 == atomicLong.get()) {
                    if (m30509b(this.f25183c, atomicReference.get() == null, interfaceC8015b, atomicReference)) {
                        return;
                    }
                }
                if (j10 != 0) {
                    C12501d.m40931d(atomicLong, j10);
                }
                i10 = addAndGet(-i10);
            } while (i10 != 0);
        }

        @Override // im.InterfaceC8016c
        /* renamed from: i */
        public void mo24634i(long j10) {
            if (EnumC12224g.m39359p(j10)) {
                C12501d.m40928a(this.f25186f, j10);
                m30510e();
            }
        }

        @Override // im.InterfaceC8015b
        public void onError(Throwable th2) {
            this.f25184d = th2;
            this.f25183c = true;
            m30510e();
        }
    }

    public C10196v(AbstractC6981f<T> abstractC6981f) {
        super(abstractC6981f);
    }

    @Override // dj.AbstractC6981f
    /* renamed from: I */
    protected void mo20229I(InterfaceC8015b<? super T> interfaceC8015b) {
        this.f24989b.m20228H(new a(interfaceC8015b));
    }
}

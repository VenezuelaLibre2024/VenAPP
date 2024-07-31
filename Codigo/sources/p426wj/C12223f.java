package p426wj;

import im.InterfaceC8016c;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicReference;
import p224lj.C9513b;
import p449xj.C12501d;

/* renamed from: wj.f */
/* loaded from: classes3.dex */
public class C12223f extends AtomicInteger implements InterfaceC8016c {
    private static final long serialVersionUID = -2189523197179400958L;

    /* renamed from: a */
    InterfaceC8016c f32687a;

    /* renamed from: b */
    long f32688b;

    /* renamed from: c */
    final AtomicReference<InterfaceC8016c> f32689c = new AtomicReference<>();

    /* renamed from: d */
    final AtomicLong f32690d = new AtomicLong();

    /* renamed from: e */
    final AtomicLong f32691e = new AtomicLong();

    /* renamed from: f */
    volatile boolean f32692f;

    /* renamed from: r */
    protected boolean f32693r;

    /* renamed from: b */
    final void m39348b() {
        if (getAndIncrement() != 0) {
            return;
        }
        m39349e();
    }

    @Override // im.InterfaceC8016c
    public void cancel() {
        if (this.f32692f) {
            return;
        }
        this.f32692f = true;
        m39348b();
    }

    /* renamed from: e */
    final void m39349e() {
        int i10 = 1;
        long j10 = 0;
        InterfaceC8016c interfaceC8016c = null;
        do {
            InterfaceC8016c interfaceC8016c2 = this.f32689c.get();
            if (interfaceC8016c2 != null) {
                interfaceC8016c2 = this.f32689c.getAndSet(null);
            }
            long j11 = this.f32690d.get();
            if (j11 != 0) {
                j11 = this.f32690d.getAndSet(0L);
            }
            long j12 = this.f32691e.get();
            if (j12 != 0) {
                j12 = this.f32691e.getAndSet(0L);
            }
            InterfaceC8016c interfaceC8016c3 = this.f32687a;
            if (this.f32692f) {
                if (interfaceC8016c3 != null) {
                    interfaceC8016c3.cancel();
                    this.f32687a = null;
                }
                if (interfaceC8016c2 != null) {
                    interfaceC8016c2.cancel();
                }
            } else {
                long j13 = this.f32688b;
                if (j13 != Long.MAX_VALUE) {
                    j13 = C12501d.m40930c(j13, j11);
                    if (j13 != Long.MAX_VALUE) {
                        j13 -= j12;
                        if (j13 < 0) {
                            EnumC12224g.m39356m(j13);
                            j13 = 0;
                        }
                    }
                    this.f32688b = j13;
                }
                if (interfaceC8016c2 != null) {
                    if (interfaceC8016c3 != null) {
                        interfaceC8016c3.cancel();
                    }
                    this.f32687a = interfaceC8016c2;
                    if (j13 != 0) {
                        j10 = C12501d.m40930c(j10, j13);
                        interfaceC8016c = interfaceC8016c2;
                    }
                } else if (interfaceC8016c3 != null && j11 != 0) {
                    j10 = C12501d.m40930c(j10, j11);
                    interfaceC8016c = interfaceC8016c3;
                }
            }
            i10 = addAndGet(-i10);
        } while (i10 != 0);
        if (j10 != 0) {
            interfaceC8016c.mo24634i(j10);
        }
    }

    /* renamed from: g */
    public final boolean m39350g() {
        return this.f32693r;
    }

    /* renamed from: h */
    public final void m39351h(long j10) {
        if (this.f32693r) {
            return;
        }
        if (get() != 0 || !compareAndSet(0, 1)) {
            C12501d.m40928a(this.f32691e, j10);
            m39348b();
            return;
        }
        long j11 = this.f32688b;
        if (j11 != Long.MAX_VALUE) {
            long j12 = j11 - j10;
            if (j12 < 0) {
                EnumC12224g.m39356m(j12);
                j12 = 0;
            }
            this.f32688b = j12;
        }
        if (decrementAndGet() == 0) {
            return;
        }
        m39349e();
    }

    @Override // im.InterfaceC8016c
    /* renamed from: i */
    public final void mo24634i(long j10) {
        if (!EnumC12224g.m39359p(j10) || this.f32693r) {
            return;
        }
        if (get() != 0 || !compareAndSet(0, 1)) {
            C12501d.m40928a(this.f32690d, j10);
            m39348b();
            return;
        }
        long j11 = this.f32688b;
        if (j11 != Long.MAX_VALUE) {
            long m40930c = C12501d.m40930c(j11, j10);
            this.f32688b = m40930c;
            if (m40930c == Long.MAX_VALUE) {
                this.f32693r = true;
            }
        }
        InterfaceC8016c interfaceC8016c = this.f32687a;
        if (decrementAndGet() != 0) {
            m39349e();
        }
        if (interfaceC8016c != null) {
            interfaceC8016c.mo24634i(j10);
        }
    }

    /* renamed from: j */
    public final void m39352j(InterfaceC8016c interfaceC8016c) {
        if (this.f32692f) {
            interfaceC8016c.cancel();
            return;
        }
        C9513b.m28324d(interfaceC8016c, "s is null");
        if (get() != 0 || !compareAndSet(0, 1)) {
            InterfaceC8016c andSet = this.f32689c.getAndSet(interfaceC8016c);
            if (andSet != null) {
                andSet.cancel();
            }
            m39348b();
            return;
        }
        InterfaceC8016c interfaceC8016c2 = this.f32687a;
        if (interfaceC8016c2 != null) {
            interfaceC8016c2.cancel();
        }
        this.f32687a = interfaceC8016c;
        long j10 = this.f32688b;
        if (decrementAndGet() != 0) {
            m39349e();
        }
        if (j10 != 0) {
            interfaceC8016c.mo24634i(j10);
        }
    }
}

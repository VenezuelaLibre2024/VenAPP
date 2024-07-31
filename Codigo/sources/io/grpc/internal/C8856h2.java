package io.grpc.internal;

import java.util.concurrent.atomic.AtomicBoolean;
import vi.AbstractC11924j1;
import vi.AbstractC11925k;
import vi.C11895a;
import vi.C11915g1;
import vi.C11953w0;

/* renamed from: io.grpc.internal.h2 */
/* loaded from: classes3.dex */
public final class C8856h2 {

    /* renamed from: c */
    public static final C8856h2 f20641c = new C8856h2(new AbstractC11924j1[0]);

    /* renamed from: a */
    private final AbstractC11924j1[] f20642a;

    /* renamed from: b */
    private final AtomicBoolean f20643b = new AtomicBoolean(false);

    C8856h2(AbstractC11924j1[] abstractC11924j1Arr) {
        this.f20642a = abstractC11924j1Arr;
    }

    /* renamed from: h */
    public static C8856h2 m25591h(AbstractC11925k[] abstractC11925kArr, C11895a c11895a, C11953w0 c11953w0) {
        C8856h2 c8856h2 = new C8856h2(abstractC11925kArr);
        for (AbstractC11925k abstractC11925k : abstractC11925kArr) {
            abstractC11925k.m38182m(c11895a, c11953w0);
        }
        return c8856h2;
    }

    /* renamed from: a */
    public void m25592a() {
        for (AbstractC11924j1 abstractC11924j1 : this.f20642a) {
            ((AbstractC11925k) abstractC11924j1).m38179j();
        }
    }

    /* renamed from: b */
    public void m25593b(C11953w0 c11953w0) {
        for (AbstractC11924j1 abstractC11924j1 : this.f20642a) {
            ((AbstractC11925k) abstractC11924j1).m38180k(c11953w0);
        }
    }

    /* renamed from: c */
    public void m25594c() {
        for (AbstractC11924j1 abstractC11924j1 : this.f20642a) {
            ((AbstractC11925k) abstractC11924j1).m38181l();
        }
    }

    /* renamed from: d */
    public void m25595d(int i10) {
        for (AbstractC11924j1 abstractC11924j1 : this.f20642a) {
            abstractC11924j1.m38172a(i10);
        }
    }

    /* renamed from: e */
    public void m25596e(int i10, long j10, long j11) {
        for (AbstractC11924j1 abstractC11924j1 : this.f20642a) {
            abstractC11924j1.m38173b(i10, j10, j11);
        }
    }

    /* renamed from: f */
    public void m25597f(long j10) {
        for (AbstractC11924j1 abstractC11924j1 : this.f20642a) {
            abstractC11924j1.m38174c(j10);
        }
    }

    /* renamed from: g */
    public void m25598g(long j10) {
        for (AbstractC11924j1 abstractC11924j1 : this.f20642a) {
            abstractC11924j1.m38175d(j10);
        }
    }

    /* renamed from: i */
    public void m25599i(int i10) {
        for (AbstractC11924j1 abstractC11924j1 : this.f20642a) {
            abstractC11924j1.m38176e(i10);
        }
    }

    /* renamed from: j */
    public void m25600j(int i10, long j10, long j11) {
        for (AbstractC11924j1 abstractC11924j1 : this.f20642a) {
            abstractC11924j1.m38177f(i10, j10, j11);
        }
    }

    /* renamed from: k */
    public void m25601k(long j10) {
        for (AbstractC11924j1 abstractC11924j1 : this.f20642a) {
            abstractC11924j1.m38178g(j10);
        }
    }

    /* renamed from: l */
    public void m25602l(long j10) {
        for (AbstractC11924j1 abstractC11924j1 : this.f20642a) {
            abstractC11924j1.mo26002h(j10);
        }
    }

    /* renamed from: m */
    public void m25603m(C11915g1 c11915g1) {
        if (this.f20643b.compareAndSet(false, true)) {
            for (AbstractC11924j1 abstractC11924j1 : this.f20642a) {
                abstractC11924j1.mo9633i(c11915g1);
            }
        }
    }
}

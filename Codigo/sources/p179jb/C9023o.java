package p179jb;

import com.google.crypto.tink.internal.C5948t;
import java.security.GeneralSecurityException;
import java.util.Iterator;
import p400vb.C11786a0;
import p400vb.C11790c0;
import p400vb.C11821y;
import p400vb.EnumC11802i0;
import p400vb.EnumC11822z;

/* renamed from: jb.o */
/* loaded from: classes2.dex */
public final class C9023o {

    /* renamed from: a */
    private final C11790c0.b f21633a;

    private C9023o(C11790c0.b bVar) {
        this.f21633a = bVar;
    }

    /* renamed from: c */
    private synchronized C11790c0.c m26480c(C11821y c11821y, EnumC11802i0 enumC11802i0) {
        int m26483g;
        m26483g = m26483g();
        if (enumC11802i0 == EnumC11802i0.UNKNOWN_PREFIX) {
            throw new GeneralSecurityException("unknown output prefix type");
        }
        return C11790c0.c.m37345f0().m37355A(c11821y).m37356B(m26483g).m37358D(EnumC11822z.ENABLED).m37357C(enumC11802i0).build();
    }

    /* renamed from: e */
    private synchronized boolean m26481e(int i10) {
        Iterator<C11790c0.c> it = this.f21633a.m37338D().iterator();
        while (it.hasNext()) {
            if (it.next().m37351b0() == i10) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: f */
    private synchronized C11790c0.c m26482f(C11786a0 c11786a0) {
        return m26480c(C9032x.m26534k(c11786a0), c11786a0.m37297a0());
    }

    /* renamed from: g */
    private synchronized int m26483g() {
        int m15288c;
        do {
            m15288c = C5948t.m15288c();
        } while (m26481e(m15288c));
        return m15288c;
    }

    /* renamed from: i */
    public static C9023o m26484i() {
        return new C9023o(C11790c0.m37327e0());
    }

    /* renamed from: j */
    public static C9023o m26485j(C9022n c9022n) {
        return new C9023o(c9022n.m26473h().mo15967a());
    }

    /* renamed from: a */
    public synchronized C9023o m26486a(C9020l c9020l) {
        m26487b(c9020l.m26458b(), false);
        return this;
    }

    @Deprecated
    /* renamed from: b */
    public synchronized int m26487b(C11786a0 c11786a0, boolean z10) {
        C11790c0.c m26482f;
        m26482f = m26482f(c11786a0);
        this.f21633a.m37335A(m26482f);
        if (z10) {
            this.f21633a.m37339E(m26482f.m37351b0());
        }
        return m26482f.m37351b0();
    }

    /* renamed from: d */
    public synchronized C9022n m26488d() {
        return C9022n.m26464e(this.f21633a.build());
    }

    /* renamed from: h */
    public synchronized C9023o m26489h(int i10) {
        for (int i11 = 0; i11 < this.f21633a.m37337C(); i11++) {
            C11790c0.c m37336B = this.f21633a.m37336B(i11);
            if (m37336B.m37351b0() == i10) {
                if (!m37336B.m37353d0().equals(EnumC11822z.ENABLED)) {
                    throw new GeneralSecurityException("cannot set key as primary because it's not enabled: " + i10);
                }
                this.f21633a.m37339E(i10);
            }
        }
        throw new GeneralSecurityException("key not found: " + i10);
        return this;
    }
}

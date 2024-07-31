package p155i7;

import com.facebook.ads.AdError;
import p363t8.C11146e0;
import p363t8.C11164n0;
import p363t8.C11172r0;
import p459y6.AbstractC12606a;
import p459y6.InterfaceC12622l;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: i7.x */
/* loaded from: classes.dex */
public final class C7896x extends AbstractC12606a {

    /* renamed from: i7.x$b */
    /* loaded from: classes.dex */
    private static final class b implements AbstractC12606a.f {

        /* renamed from: a */
        private final C11164n0 f19195a;

        /* renamed from: b */
        private final C11146e0 f19196b;

        private b(C11164n0 c11164n0) {
            this.f19195a = c11164n0;
            this.f19196b = new C11146e0();
        }

        /* renamed from: c */
        private AbstractC12606a.e m24345c(C11146e0 c11146e0, long j10, long j11) {
            int i10 = -1;
            int i11 = -1;
            long j12 = -9223372036854775807L;
            while (c11146e0.m34679a() >= 4) {
                if (C7896x.m24344k(c11146e0.m34682e(), c11146e0.m34683f()) != 442) {
                    c11146e0.m34678V(1);
                } else {
                    c11146e0.m34678V(4);
                    long m24354l = C7897y.m24354l(c11146e0);
                    if (m24354l != -9223372036854775807L) {
                        long m34825b = this.f19195a.m34825b(m24354l);
                        if (m34825b > j10) {
                            return j12 == -9223372036854775807L ? AbstractC12606a.e.m41505d(m34825b, j11) : AbstractC12606a.e.m41506e(j11 + i11);
                        }
                        if (100000 + m34825b > j10) {
                            return AbstractC12606a.e.m41506e(j11 + c11146e0.m34683f());
                        }
                        i11 = c11146e0.m34683f();
                        j12 = m34825b;
                    }
                    m24346d(c11146e0);
                    i10 = c11146e0.m34683f();
                }
            }
            return j12 != -9223372036854775807L ? AbstractC12606a.e.m41507f(j12, j11 + i10) : AbstractC12606a.e.f34218d;
        }

        /* renamed from: d */
        private static void m24346d(C11146e0 c11146e0) {
            int m24344k;
            int m34684g = c11146e0.m34684g();
            if (c11146e0.m34679a() < 10) {
                c11146e0.m34677U(m34684g);
                return;
            }
            c11146e0.m34678V(9);
            int m34664H = c11146e0.m34664H() & 7;
            if (c11146e0.m34679a() < m34664H) {
                c11146e0.m34677U(m34684g);
                return;
            }
            c11146e0.m34678V(m34664H);
            if (c11146e0.m34679a() < 4) {
                c11146e0.m34677U(m34684g);
                return;
            }
            if (C7896x.m24344k(c11146e0.m34682e(), c11146e0.m34683f()) == 443) {
                c11146e0.m34678V(4);
                int m34670N = c11146e0.m34670N();
                if (c11146e0.m34679a() < m34670N) {
                    c11146e0.m34677U(m34684g);
                    return;
                }
                c11146e0.m34678V(m34670N);
            }
            while (c11146e0.m34679a() >= 4 && (m24344k = C7896x.m24344k(c11146e0.m34682e(), c11146e0.m34683f())) != 442 && m24344k != 441 && (m24344k >>> 8) == 1) {
                c11146e0.m34678V(4);
                if (c11146e0.m34679a() < 2) {
                    c11146e0.m34677U(m34684g);
                    return;
                }
                c11146e0.m34677U(Math.min(c11146e0.m34684g(), c11146e0.m34683f() + c11146e0.m34670N()));
            }
        }

        @Override // p459y6.AbstractC12606a.f
        /* renamed from: a */
        public AbstractC12606a.e mo9152a(InterfaceC12622l interfaceC12622l, long j10) {
            long position = interfaceC12622l.getPosition();
            int min = (int) Math.min(20000L, interfaceC12622l.getLength() - position);
            this.f19196b.m34673Q(min);
            interfaceC12622l.mo41540q(this.f19196b.m34682e(), 0, min);
            return m24345c(this.f19196b, j10, position);
        }

        @Override // p459y6.AbstractC12606a.f
        /* renamed from: b */
        public void mo24199b() {
            this.f19196b.m34674R(C11172r0.f29045f);
        }
    }

    public C7896x(C11164n0 c11164n0, long j10, long j11) {
        super(new AbstractC12606a.b(), new b(c11164n0), j10, 0L, j10 + 1, 0L, j11, 188L, AdError.NETWORK_ERROR_CODE);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: k */
    public static int m24344k(byte[] bArr, int i10) {
        return (bArr[i10 + 3] & 255) | ((bArr[i10] & 255) << 24) | ((bArr[i10 + 1] & 255) << 16) | ((bArr[i10 + 2] & 255) << 8);
    }
}

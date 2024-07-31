package p155i7;

import p363t8.C11146e0;
import p363t8.C11164n0;
import p363t8.C11172r0;
import p459y6.AbstractC12606a;
import p459y6.InterfaceC12622l;

/* renamed from: i7.e0 */
/* loaded from: classes.dex */
final class C7871e0 extends AbstractC12606a {

    /* renamed from: i7.e0$a */
    /* loaded from: classes.dex */
    private static final class a implements AbstractC12606a.f {

        /* renamed from: a */
        private final C11164n0 f18891a;

        /* renamed from: b */
        private final C11146e0 f18892b = new C11146e0();

        /* renamed from: c */
        private final int f18893c;

        /* renamed from: d */
        private final int f18894d;

        public a(int i10, C11164n0 c11164n0, int i11) {
            this.f18893c = i10;
            this.f18891a = c11164n0;
            this.f18894d = i11;
        }

        /* renamed from: c */
        private AbstractC12606a.e m24198c(C11146e0 c11146e0, long j10, long j11) {
            int m24270a;
            int m24270a2;
            int m34684g = c11146e0.m34684g();
            long j12 = -1;
            long j13 = -1;
            long j14 = -9223372036854775807L;
            while (c11146e0.m34679a() >= 188 && (m24270a2 = (m24270a = C7881j0.m24270a(c11146e0.m34682e(), c11146e0.m34683f(), m34684g)) + 188) <= m34684g) {
                long m24272c = C7881j0.m24272c(c11146e0, m24270a, this.f18893c);
                if (m24272c != -9223372036854775807L) {
                    long m34825b = this.f18891a.m34825b(m24272c);
                    if (m34825b > j10) {
                        return j14 == -9223372036854775807L ? AbstractC12606a.e.m41505d(m34825b, j11) : AbstractC12606a.e.m41506e(j11 + j13);
                    }
                    if (100000 + m34825b > j10) {
                        return AbstractC12606a.e.m41506e(j11 + m24270a);
                    }
                    j13 = m24270a;
                    j14 = m34825b;
                }
                c11146e0.m34677U(m24270a2);
                j12 = m24270a2;
            }
            return j14 != -9223372036854775807L ? AbstractC12606a.e.m41507f(j14, j11 + j12) : AbstractC12606a.e.f34218d;
        }

        @Override // p459y6.AbstractC12606a.f
        /* renamed from: a */
        public AbstractC12606a.e mo9152a(InterfaceC12622l interfaceC12622l, long j10) {
            long position = interfaceC12622l.getPosition();
            int min = (int) Math.min(this.f18894d, interfaceC12622l.getLength() - position);
            this.f18892b.m34673Q(min);
            interfaceC12622l.mo41540q(this.f18892b.m34682e(), 0, min);
            return m24198c(this.f18892b, j10, position);
        }

        @Override // p459y6.AbstractC12606a.f
        /* renamed from: b */
        public void mo24199b() {
            this.f18892b.m34674R(C11172r0.f29045f);
        }
    }

    public C7871e0(C11164n0 c11164n0, long j10, long j11, int i10, int i11) {
        super(new AbstractC12606a.b(), new a(i10, c11164n0, i11), j10, 0L, j10 + 1, 0L, j11, 188L, 940);
    }
}

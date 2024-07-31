package p025b7;

import java.util.Objects;
import p459y6.AbstractC12606a;
import p459y6.C12627q;
import p459y6.C12630t;
import p459y6.InterfaceC12622l;

/* renamed from: b7.b */
/* loaded from: classes.dex */
final class C1668b extends AbstractC12606a {

    /* renamed from: b7.b$b */
    /* loaded from: classes.dex */
    private static final class b implements AbstractC12606a.f {

        /* renamed from: a */
        private final C12630t f7062a;

        /* renamed from: b */
        private final int f7063b;

        /* renamed from: c */
        private final C12627q.a f7064c;

        private b(C12630t c12630t, int i10) {
            this.f7062a = c12630t;
            this.f7063b = i10;
            this.f7064c = new C12627q.a();
        }

        /* renamed from: c */
        private long m9151c(InterfaceC12622l interfaceC12622l) {
            while (interfaceC12622l.mo19807i() < interfaceC12622l.getLength() - 6 && !C12627q.m41578h(interfaceC12622l, this.f7062a, this.f7063b, this.f7064c)) {
                interfaceC12622l.mo41536k(1);
            }
            if (interfaceC12622l.mo19807i() < interfaceC12622l.getLength() - 6) {
                return this.f7064c.f34304a;
            }
            interfaceC12622l.mo41536k((int) (interfaceC12622l.getLength() - interfaceC12622l.mo19807i()));
            return this.f7062a.f34317j;
        }

        @Override // p459y6.AbstractC12606a.f
        /* renamed from: a */
        public AbstractC12606a.e mo9152a(InterfaceC12622l interfaceC12622l, long j10) {
            long position = interfaceC12622l.getPosition();
            long m9151c = m9151c(interfaceC12622l);
            long mo19807i = interfaceC12622l.mo19807i();
            interfaceC12622l.mo41536k(Math.max(6, this.f7062a.f34310c));
            long m9151c2 = m9151c(interfaceC12622l);
            return (m9151c > j10 || m9151c2 <= j10) ? m9151c2 <= j10 ? AbstractC12606a.e.m41507f(m9151c2, interfaceC12622l.mo19807i()) : AbstractC12606a.e.m41505d(m9151c, position) : AbstractC12606a.e.m41506e(mo19807i);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1668b(final C12630t c12630t, int i10, long j10, long j11) {
        super(new AbstractC12606a.d() { // from class: b7.a
            @Override // p459y6.AbstractC12606a.d
            /* renamed from: a */
            public final long mo9150a(long j12) {
                return C12630t.this.m41601i(j12);
            }
        }, new b(c12630t, i10), c12630t.m41598f(), 0L, c12630t.f34317j, j10, j11, c12630t.m41597d(), Math.max(6, c12630t.f34310c));
        Objects.requireNonNull(c12630t);
    }
}

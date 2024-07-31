package p397v7;

import android.os.Handler;
import java.io.IOException;
import java.util.HashMap;
import java.util.Iterator;
import p351s8.InterfaceC10834m0;
import p361t6.AbstractC11018d4;
import p363t8.C11137a;
import p363t8.C11172r0;
import p397v7.InterfaceC11684a0;
import p397v7.InterfaceC11705h0;
import p436x6.InterfaceC12329u;

/* renamed from: v7.g */
/* loaded from: classes.dex */
public abstract class AbstractC11701g<T> extends AbstractC11683a {

    /* renamed from: s */
    private final HashMap<T, b<T>> f30695s = new HashMap<>();

    /* renamed from: t */
    private Handler f30696t;

    /* renamed from: u */
    private InterfaceC10834m0 f30697u;

    /* renamed from: v7.g$a */
    /* loaded from: classes.dex */
    private final class a implements InterfaceC11705h0, InterfaceC12329u {

        /* renamed from: a */
        private final T f30698a;

        /* renamed from: b */
        private InterfaceC11705h0.a f30699b;

        /* renamed from: c */
        private InterfaceC12329u.a f30700c;

        public a(T t10) {
            this.f30699b = AbstractC11701g.this.m36814w(null);
            this.f30700c = AbstractC11701g.this.m36812u(null);
            this.f30698a = t10;
        }

        /* renamed from: K */
        private C11737x m36866K(C11737x c11737x) {
            long mo36862H = AbstractC11701g.this.mo36862H(this.f30698a, c11737x.f30954f);
            long mo36862H2 = AbstractC11701g.this.mo36862H(this.f30698a, c11737x.f30955g);
            return (mo36862H == c11737x.f30954f && mo36862H2 == c11737x.f30955g) ? c11737x : new C11737x(c11737x.f30949a, c11737x.f30950b, c11737x.f30951c, c11737x.f30952d, c11737x.f30953e, mo36862H, mo36862H2);
        }

        /* renamed from: s */
        private boolean m36867s(int i10, InterfaceC11684a0.b bVar) {
            InterfaceC11684a0.b bVar2;
            if (bVar != null) {
                bVar2 = AbstractC11701g.this.mo36861G(this.f30698a, bVar);
                if (bVar2 == null) {
                    return false;
                }
            } else {
                bVar2 = null;
            }
            int mo36863I = AbstractC11701g.this.mo36863I(this.f30698a, i10);
            InterfaceC11705h0.a aVar = this.f30699b;
            if (aVar.f30711a != mo36863I || !C11172r0.m34914c(aVar.f30712b, bVar2)) {
                this.f30699b = AbstractC11701g.this.m36813v(mo36863I, bVar2, 0L);
            }
            InterfaceC12329u.a aVar2 = this.f30700c;
            if (aVar2.f33078a == mo36863I && C11172r0.m34914c(aVar2.f33079b, bVar2)) {
                return true;
            }
            this.f30700c = AbstractC11701g.this.m36811t(mo36863I, bVar2);
            return true;
        }

        @Override // p436x6.InterfaceC12329u
        /* renamed from: B */
        public void mo33696B(int i10, InterfaceC11684a0.b bVar) {
            if (m36867s(i10, bVar)) {
                this.f30700c.m39868i();
            }
        }

        @Override // p436x6.InterfaceC12329u
        /* renamed from: C */
        public void mo33697C(int i10, InterfaceC11684a0.b bVar) {
            if (m36867s(i10, bVar)) {
                this.f30700c.m39869j();
            }
        }

        @Override // p397v7.InterfaceC11705h0
        /* renamed from: D */
        public void mo33698D(int i10, InterfaceC11684a0.b bVar, C11731u c11731u, C11737x c11737x) {
            if (m36867s(i10, bVar)) {
                this.f30699b.m36892s(c11731u, m36866K(c11737x));
            }
        }

        @Override // p397v7.InterfaceC11705h0
        /* renamed from: F */
        public void mo33699F(int i10, InterfaceC11684a0.b bVar, C11731u c11731u, C11737x c11737x, IOException iOException, boolean z10) {
            if (m36867s(i10, bVar)) {
                this.f30699b.m36898y(c11731u, m36866K(c11737x), iOException, z10);
            }
        }

        @Override // p397v7.InterfaceC11705h0
        /* renamed from: G */
        public void mo33700G(int i10, InterfaceC11684a0.b bVar, C11731u c11731u, C11737x c11737x) {
            if (m36867s(i10, bVar)) {
                this.f30699b.m36882B(c11731u, m36866K(c11737x));
            }
        }

        @Override // p436x6.InterfaceC12329u
        /* renamed from: I */
        public void mo33701I(int i10, InterfaceC11684a0.b bVar, Exception exc) {
            if (m36867s(i10, bVar)) {
                this.f30700c.m39871l(exc);
            }
        }

        @Override // p436x6.InterfaceC12329u
        /* renamed from: J */
        public void mo33702J(int i10, InterfaceC11684a0.b bVar, int i11) {
            if (m36867s(i10, bVar)) {
                this.f30700c.m39870k(i11);
            }
        }

        @Override // p436x6.InterfaceC12329u
        /* renamed from: u */
        public void mo33703u(int i10, InterfaceC11684a0.b bVar) {
            if (m36867s(i10, bVar)) {
                this.f30700c.m39867h();
            }
        }

        @Override // p397v7.InterfaceC11705h0
        /* renamed from: v */
        public void mo33704v(int i10, InterfaceC11684a0.b bVar, C11737x c11737x) {
            if (m36867s(i10, bVar)) {
                this.f30699b.m36889j(m36866K(c11737x));
            }
        }

        @Override // p397v7.InterfaceC11705h0
        /* renamed from: w */
        public void mo33705w(int i10, InterfaceC11684a0.b bVar, C11737x c11737x) {
            if (m36867s(i10, bVar)) {
                this.f30699b.m36885E(m36866K(c11737x));
            }
        }

        @Override // p397v7.InterfaceC11705h0
        /* renamed from: x */
        public void mo33706x(int i10, InterfaceC11684a0.b bVar, C11731u c11731u, C11737x c11737x) {
            if (m36867s(i10, bVar)) {
                this.f30699b.m36895v(c11731u, m36866K(c11737x));
            }
        }

        @Override // p436x6.InterfaceC12329u
        /* renamed from: y */
        public void mo33707y(int i10, InterfaceC11684a0.b bVar) {
            if (m36867s(i10, bVar)) {
                this.f30700c.m39872m();
            }
        }
    }

    /* renamed from: v7.g$b */
    /* loaded from: classes.dex */
    private static final class b<T> {

        /* renamed from: a */
        public final InterfaceC11684a0 f30702a;

        /* renamed from: b */
        public final InterfaceC11684a0.c f30703b;

        /* renamed from: c */
        public final AbstractC11701g<T>.a f30704c;

        public b(InterfaceC11684a0 interfaceC11684a0, InterfaceC11684a0.c cVar, AbstractC11701g<T>.a aVar) {
            this.f30702a = interfaceC11684a0;
            this.f30703b = cVar;
            this.f30704c = aVar;
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // p397v7.AbstractC11683a
    /* renamed from: C */
    public void mo11833C(InterfaceC10834m0 interfaceC10834m0) {
        this.f30697u = interfaceC10834m0;
        this.f30696t = C11172r0.m34954w();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // p397v7.AbstractC11683a
    /* renamed from: E */
    public void mo11834E() {
        for (b<T> bVar : this.f30695s.values()) {
            bVar.f30702a.mo36804b(bVar.f30703b);
            bVar.f30702a.mo36807g(bVar.f30704c);
            bVar.f30702a.mo36809q(bVar.f30704c);
        }
        this.f30695s.clear();
    }

    /* renamed from: G */
    protected abstract InterfaceC11684a0.b mo36861G(T t10, InterfaceC11684a0.b bVar);

    /* renamed from: H */
    protected long mo36862H(T t10, long j10) {
        return j10;
    }

    /* renamed from: I */
    protected int mo36863I(T t10, int i10) {
        return i10;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: K, reason: merged with bridge method [inline-methods] */
    public abstract void m36860J(T t10, InterfaceC11684a0 interfaceC11684a0, AbstractC11018d4 abstractC11018d4);

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: L */
    public final void m36865L(final T t10, InterfaceC11684a0 interfaceC11684a0) {
        C11137a.m34599a(!this.f30695s.containsKey(t10));
        InterfaceC11684a0.c cVar = new InterfaceC11684a0.c() { // from class: v7.f
            @Override // p397v7.InterfaceC11684a0.c
            /* renamed from: a */
            public final void mo34304a(InterfaceC11684a0 interfaceC11684a02, AbstractC11018d4 abstractC11018d4) {
                AbstractC11701g.this.m36860J(t10, interfaceC11684a02, abstractC11018d4);
            }
        };
        a aVar = new a(t10);
        this.f30695s.put(t10, new b<>(interfaceC11684a0, cVar, aVar));
        interfaceC11684a0.mo36808j((Handler) C11137a.m34603e(this.f30696t), aVar);
        interfaceC11684a0.mo36810s((Handler) C11137a.m34603e(this.f30696t), aVar);
        interfaceC11684a0.mo36803a(cVar, this.f30697u, m36800A());
        if (m36801B()) {
            return;
        }
        interfaceC11684a0.mo36805c(cVar);
    }

    @Override // p397v7.InterfaceC11684a0
    /* renamed from: n */
    public void mo11845n() {
        Iterator<b<T>> it = this.f30695s.values().iterator();
        while (it.hasNext()) {
            it.next().f30702a.mo11845n();
        }
    }

    @Override // p397v7.AbstractC11683a
    /* renamed from: y */
    protected void mo36816y() {
        for (b<T> bVar : this.f30695s.values()) {
            bVar.f30702a.mo36805c(bVar.f30703b);
        }
    }

    @Override // p397v7.AbstractC11683a
    /* renamed from: z */
    protected void mo36817z() {
        for (b<T> bVar : this.f30695s.values()) {
            bVar.f30702a.mo36806f(bVar.f30703b);
        }
    }
}

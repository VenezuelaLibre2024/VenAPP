package p397v7;

import android.os.Looper;
import p351s8.C10844v;
import p351s8.InterfaceC10811b;
import p351s8.InterfaceC10816d0;
import p351s8.InterfaceC10827j;
import p351s8.InterfaceC10834m0;
import p361t6.AbstractC11018d4;
import p361t6.C11010c2;
import p363t8.C11137a;
import p376u6.C11391m3;
import p397v7.C11722p0;
import p397v7.C11724q0;
import p397v7.InterfaceC11684a0;
import p397v7.InterfaceC11712k0;
import p436x6.C12316l;
import p436x6.InterfaceC12330v;
import p436x6.InterfaceC12332x;
import p459y6.C12618h;
import p459y6.InterfaceC12626p;

/* renamed from: v7.q0 */
/* loaded from: classes.dex */
public final class C11724q0 extends AbstractC11683a implements C11722p0.b {

    /* renamed from: A */
    private long f30845A;

    /* renamed from: B */
    private boolean f30846B;

    /* renamed from: C */
    private boolean f30847C;

    /* renamed from: D */
    private InterfaceC10834m0 f30848D;

    /* renamed from: s */
    private final C11010c2 f30849s;

    /* renamed from: t */
    private final C11010c2.h f30850t;

    /* renamed from: u */
    private final InterfaceC10827j.a f30851u;

    /* renamed from: v */
    private final InterfaceC11712k0.a f30852v;

    /* renamed from: w */
    private final InterfaceC12330v f30853w;

    /* renamed from: x */
    private final InterfaceC10816d0 f30854x;

    /* renamed from: y */
    private final int f30855y;

    /* renamed from: z */
    private boolean f30856z;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: v7.q0$a */
    /* loaded from: classes.dex */
    public class a extends AbstractC11727s {
        a(C11724q0 c11724q0, AbstractC11018d4 abstractC11018d4) {
            super(abstractC11018d4);
        }

        @Override // p397v7.AbstractC11727s, p361t6.AbstractC11018d4
        /* renamed from: l */
        public AbstractC11018d4.b mo11857l(int i10, AbstractC11018d4.b bVar, boolean z10) {
            super.mo11857l(i10, bVar, z10);
            bVar.f28230f = true;
            return bVar;
        }

        @Override // p397v7.AbstractC11727s, p361t6.AbstractC11018d4
        /* renamed from: t */
        public AbstractC11018d4.d mo11860t(int i10, AbstractC11018d4.d dVar, long j10) {
            super.mo11860t(i10, dVar, j10);
            dVar.f28266w = true;
            return dVar;
        }
    }

    /* renamed from: v7.q0$b */
    /* loaded from: classes.dex */
    public static final class b implements InterfaceC11684a0.a {

        /* renamed from: a */
        private final InterfaceC10827j.a f30857a;

        /* renamed from: b */
        private InterfaceC11712k0.a f30858b;

        /* renamed from: c */
        private InterfaceC12332x f30859c;

        /* renamed from: d */
        private InterfaceC10816d0 f30860d;

        /* renamed from: e */
        private int f30861e;

        /* renamed from: f */
        private String f30862f;

        /* renamed from: g */
        private Object f30863g;

        public b(InterfaceC10827j.a aVar) {
            this(aVar, new C12618h());
        }

        public b(InterfaceC10827j.a aVar, InterfaceC11712k0.a aVar2) {
            this(aVar, aVar2, new C12316l(), new C10844v(), 1048576);
        }

        public b(InterfaceC10827j.a aVar, InterfaceC11712k0.a aVar2, InterfaceC12332x interfaceC12332x, InterfaceC10816d0 interfaceC10816d0, int i10) {
            this.f30857a = aVar;
            this.f30858b = aVar2;
            this.f30859c = interfaceC12332x;
            this.f30860d = interfaceC10816d0;
            this.f30861e = i10;
        }

        public b(InterfaceC10827j.a aVar, final InterfaceC12626p interfaceC12626p) {
            this(aVar, new InterfaceC11712k0.a() { // from class: v7.r0
                @Override // p397v7.InterfaceC11712k0.a
                /* renamed from: a */
                public final InterfaceC11712k0 mo36919a(C11391m3 c11391m3) {
                    InterfaceC11712k0 m36999f;
                    m36999f = C11724q0.b.m36999f(InterfaceC12626p.this, c11391m3);
                    return m36999f;
                }
            });
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: f */
        public static /* synthetic */ InterfaceC11712k0 m36999f(InterfaceC12626p interfaceC12626p, C11391m3 c11391m3) {
            return new C11689c(interfaceC12626p);
        }

        @Override // p397v7.InterfaceC11684a0.a
        /* renamed from: e, reason: merged with bridge method [inline-methods] */
        public C11724q0 mo11846a(C11010c2 c11010c2) {
            C11010c2.c m33727c;
            C11010c2.c m33733f;
            C11137a.m34603e(c11010c2.f28024b);
            C11010c2.h hVar = c11010c2.f28024b;
            boolean z10 = hVar.f28104h == null && this.f30863g != null;
            boolean z11 = hVar.f28101e == null && this.f30862f != null;
            if (!z10 || !z11) {
                if (z10) {
                    m33733f = c11010c2.m33727c().m33733f(this.f30863g);
                    c11010c2 = m33733f.m33728a();
                    C11010c2 c11010c22 = c11010c2;
                    return new C11724q0(c11010c22, this.f30857a, this.f30858b, this.f30859c.mo39835a(c11010c22), this.f30860d, this.f30861e, null);
                }
                if (z11) {
                    m33727c = c11010c2.m33727c();
                }
                C11010c2 c11010c222 = c11010c2;
                return new C11724q0(c11010c222, this.f30857a, this.f30858b, this.f30859c.mo39835a(c11010c222), this.f30860d, this.f30861e, null);
            }
            m33727c = c11010c2.m33727c().m33733f(this.f30863g);
            m33733f = m33727c.m33729b(this.f30862f);
            c11010c2 = m33733f.m33728a();
            C11010c2 c11010c2222 = c11010c2;
            return new C11724q0(c11010c2222, this.f30857a, this.f30858b, this.f30859c.mo39835a(c11010c2222), this.f30860d, this.f30861e, null);
        }

        @Override // p397v7.InterfaceC11684a0.a
        /* renamed from: g, reason: merged with bridge method [inline-methods] */
        public b mo11847b(InterfaceC12332x interfaceC12332x) {
            this.f30859c = (InterfaceC12332x) C11137a.m34604f(interfaceC12332x, "MediaSource.Factory#setDrmSessionManagerProvider no longer handles null by instantiating a new DefaultDrmSessionManagerProvider. Explicitly construct and pass an instance in order to retain the old behavior.");
            return this;
        }

        @Override // p397v7.InterfaceC11684a0.a
        /* renamed from: h, reason: merged with bridge method [inline-methods] */
        public b mo11848c(InterfaceC10816d0 interfaceC10816d0) {
            this.f30860d = (InterfaceC10816d0) C11137a.m34604f(interfaceC10816d0, "MediaSource.Factory#setLoadErrorHandlingPolicy no longer handles null by instantiating a new DefaultLoadErrorHandlingPolicy. Explicitly construct and pass an instance in order to retain the old behavior.");
            return this;
        }
    }

    private C11724q0(C11010c2 c11010c2, InterfaceC10827j.a aVar, InterfaceC11712k0.a aVar2, InterfaceC12330v interfaceC12330v, InterfaceC10816d0 interfaceC10816d0, int i10) {
        this.f30850t = (C11010c2.h) C11137a.m34603e(c11010c2.f28024b);
        this.f30849s = c11010c2;
        this.f30851u = aVar;
        this.f30852v = aVar2;
        this.f30853w = interfaceC12330v;
        this.f30854x = interfaceC10816d0;
        this.f30855y = i10;
        this.f30856z = true;
        this.f30845A = -9223372036854775807L;
    }

    /* synthetic */ C11724q0(C11010c2 c11010c2, InterfaceC10827j.a aVar, InterfaceC11712k0.a aVar2, InterfaceC12330v interfaceC12330v, InterfaceC10816d0 interfaceC10816d0, int i10, a aVar3) {
        this(c11010c2, aVar, aVar2, interfaceC12330v, interfaceC10816d0, i10);
    }

    /* renamed from: F */
    private void m36997F() {
        AbstractC11018d4 c11740y0 = new C11740y0(this.f30845A, this.f30846B, false, this.f30847C, null, this.f30849s);
        if (this.f30856z) {
            c11740y0 = new a(this, c11740y0);
        }
        m36802D(c11740y0);
    }

    @Override // p397v7.AbstractC11683a
    /* renamed from: C */
    protected void mo11833C(InterfaceC10834m0 interfaceC10834m0) {
        this.f30848D = interfaceC10834m0;
        this.f30853w.mo39793b((Looper) C11137a.m34603e(Looper.myLooper()), m36800A());
        this.f30853w.mo39792a();
        m36997F();
    }

    @Override // p397v7.AbstractC11683a
    /* renamed from: E */
    protected void mo11834E() {
        this.f30853w.release();
    }

    @Override // p397v7.InterfaceC11684a0
    /* renamed from: d */
    public C11010c2 mo11842d() {
        return this.f30849s;
    }

    @Override // p397v7.InterfaceC11684a0
    /* renamed from: e */
    public InterfaceC11739y mo11843e(InterfaceC11684a0.b bVar, InterfaceC10811b interfaceC10811b, long j10) {
        InterfaceC10827j mo33002a = this.f30851u.mo33002a();
        InterfaceC10834m0 interfaceC10834m0 = this.f30848D;
        if (interfaceC10834m0 != null) {
            mo33002a.mo161l(interfaceC10834m0);
        }
        return new C11722p0(this.f30850t.f28097a, mo33002a, this.f30852v.mo36919a(m36800A()), this.f30853w, m36812u(bVar), this.f30854x, m36814w(bVar), this, interfaceC10811b, this.f30850t.f28101e, this.f30855y);
    }

    @Override // p397v7.C11722p0.b
    /* renamed from: k */
    public void mo36970k(long j10, boolean z10, boolean z11) {
        if (j10 == -9223372036854775807L) {
            j10 = this.f30845A;
        }
        if (!this.f30856z && this.f30845A == j10 && this.f30846B == z10 && this.f30847C == z11) {
            return;
        }
        this.f30845A = j10;
        this.f30846B = z10;
        this.f30847C = z11;
        this.f30856z = false;
        m36997F();
    }

    @Override // p397v7.InterfaceC11684a0
    /* renamed from: l */
    public void mo11844l(InterfaceC11739y interfaceC11739y) {
        ((C11722p0) interfaceC11739y).m36960e0();
    }

    @Override // p397v7.InterfaceC11684a0
    /* renamed from: n */
    public void mo11845n() {
    }
}

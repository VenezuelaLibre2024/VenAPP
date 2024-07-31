package p397v7;

import p351s8.InterfaceC10811b;
import p361t6.AbstractC11018d4;
import p361t6.C11010c2;
import p363t8.C11172r0;
import p397v7.InterfaceC11684a0;
import p415w7.C12088c;

/* renamed from: v7.w */
/* loaded from: classes.dex */
public final class C11735w extends AbstractC11706h1 {

    /* renamed from: A */
    private a f30937A;

    /* renamed from: B */
    private C11733v f30938B;

    /* renamed from: C */
    private boolean f30939C;

    /* renamed from: D */
    private boolean f30940D;

    /* renamed from: E */
    private boolean f30941E;

    /* renamed from: x */
    private final boolean f30942x;

    /* renamed from: y */
    private final AbstractC11018d4.d f30943y;

    /* renamed from: z */
    private final AbstractC11018d4.b f30944z;

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: v7.w$a */
    /* loaded from: classes.dex */
    public static final class a extends AbstractC11727s {

        /* renamed from: t */
        public static final Object f30945t = new Object();

        /* renamed from: r */
        private final Object f30946r;

        /* renamed from: s */
        private final Object f30947s;

        private a(AbstractC11018d4 abstractC11018d4, Object obj, Object obj2) {
            super(abstractC11018d4);
            this.f30946r = obj;
            this.f30947s = obj2;
        }

        /* renamed from: A */
        public static a m37093A(AbstractC11018d4 abstractC11018d4, Object obj, Object obj2) {
            return new a(abstractC11018d4, obj, obj2);
        }

        /* renamed from: z */
        public static a m37095z(C11010c2 c11010c2) {
            return new a(new b(c11010c2), AbstractC11018d4.d.f28236C, f30945t);
        }

        @Override // p397v7.AbstractC11727s, p361t6.AbstractC11018d4
        /* renamed from: g */
        public int mo11856g(Object obj) {
            Object obj2;
            AbstractC11018d4 abstractC11018d4 = this.f30865f;
            if (f30945t.equals(obj) && (obj2 = this.f30947s) != null) {
                obj = obj2;
            }
            return abstractC11018d4.mo11856g(obj);
        }

        @Override // p397v7.AbstractC11727s, p361t6.AbstractC11018d4
        /* renamed from: l */
        public AbstractC11018d4.b mo11857l(int i10, AbstractC11018d4.b bVar, boolean z10) {
            this.f30865f.mo11857l(i10, bVar, z10);
            if (C11172r0.m34914c(bVar.f28226b, this.f30947s) && z10) {
                bVar.f28226b = f30945t;
            }
            return bVar;
        }

        @Override // p397v7.AbstractC11727s, p361t6.AbstractC11018d4
        /* renamed from: r */
        public Object mo11859r(int i10) {
            Object mo11859r = this.f30865f.mo11859r(i10);
            return C11172r0.m34914c(mo11859r, this.f30947s) ? f30945t : mo11859r;
        }

        @Override // p397v7.AbstractC11727s, p361t6.AbstractC11018d4
        /* renamed from: t */
        public AbstractC11018d4.d mo11860t(int i10, AbstractC11018d4.d dVar, long j10) {
            this.f30865f.mo11860t(i10, dVar, j10);
            if (C11172r0.m34914c(dVar.f28255a, this.f30946r)) {
                dVar.f28255a = AbstractC11018d4.d.f28236C;
            }
            return dVar;
        }

        /* renamed from: y */
        public a m37096y(AbstractC11018d4 abstractC11018d4) {
            return new a(abstractC11018d4, this.f30946r, this.f30947s);
        }
    }

    /* renamed from: v7.w$b */
    /* loaded from: classes.dex */
    public static final class b extends AbstractC11018d4 {

        /* renamed from: f */
        private final C11010c2 f30948f;

        public b(C11010c2 c11010c2) {
            this.f30948f = c11010c2;
        }

        @Override // p361t6.AbstractC11018d4
        /* renamed from: g */
        public int mo11856g(Object obj) {
            return obj == a.f30945t ? 0 : -1;
        }

        @Override // p361t6.AbstractC11018d4
        /* renamed from: l */
        public AbstractC11018d4.b mo11857l(int i10, AbstractC11018d4.b bVar, boolean z10) {
            bVar.m34028w(z10 ? 0 : null, z10 ? a.f30945t : null, 0, -9223372036854775807L, 0L, C12088c.f32171r, true);
            return bVar;
        }

        @Override // p361t6.AbstractC11018d4
        /* renamed from: n */
        public int mo11858n() {
            return 1;
        }

        @Override // p361t6.AbstractC11018d4
        /* renamed from: r */
        public Object mo11859r(int i10) {
            return a.f30945t;
        }

        @Override // p361t6.AbstractC11018d4
        /* renamed from: t */
        public AbstractC11018d4.d mo11860t(int i10, AbstractC11018d4.d dVar, long j10) {
            dVar.m34037j(AbstractC11018d4.d.f28236C, this.f30948f, null, -9223372036854775807L, -9223372036854775807L, -9223372036854775807L, false, true, null, 0L, -9223372036854775807L, 0, 0, 0L);
            dVar.f28266w = true;
            return dVar;
        }

        @Override // p361t6.AbstractC11018d4
        /* renamed from: u */
        public int mo11861u() {
            return 1;
        }
    }

    public C11735w(InterfaceC11684a0 interfaceC11684a0, boolean z10) {
        super(interfaceC11684a0);
        this.f30942x = z10 && interfaceC11684a0.mo36818o();
        this.f30943y = new AbstractC11018d4.d();
        this.f30944z = new AbstractC11018d4.b();
        AbstractC11018d4 mo36819p = interfaceC11684a0.mo36819p();
        if (mo36819p == null) {
            this.f30937A = a.m37095z(interfaceC11684a0.mo11842d());
        } else {
            this.f30937A = a.m37093A(mo36819p, null, null);
            this.f30941E = true;
        }
    }

    /* renamed from: X */
    private Object m37088X(Object obj) {
        return (this.f30937A.f30947s == null || !this.f30937A.f30947s.equals(obj)) ? obj : a.f30945t;
    }

    /* renamed from: Y */
    private Object m37089Y(Object obj) {
        return (this.f30937A.f30947s == null || !obj.equals(a.f30945t)) ? obj : this.f30937A.f30947s;
    }

    /* renamed from: a0 */
    private void m37090a0(long j10) {
        C11733v c11733v = this.f30938B;
        int mo11856g = this.f30937A.mo11856g(c11733v.f30928a.f30974a);
        if (mo11856g == -1) {
            return;
        }
        long j11 = this.f30937A.m34001k(mo11856g, this.f30944z).f28228d;
        if (j11 != -9223372036854775807L && j10 >= j11) {
            j10 = Math.max(0L, j11 - 1);
        }
        c11733v.m37083u(j10);
    }

    @Override // p397v7.AbstractC11701g, p397v7.AbstractC11683a
    /* renamed from: E */
    public void mo11834E() {
        this.f30940D = false;
        this.f30939C = false;
        super.mo11834E();
    }

    @Override // p397v7.AbstractC11706h1
    /* renamed from: N */
    protected InterfaceC11684a0.b mo36901N(InterfaceC11684a0.b bVar) {
        return bVar.m36820c(m37088X(bVar.f30974a));
    }

    /* JADX WARN: Removed duplicated region for block: B:12:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:27:0x008d  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x009e  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0094  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x00bb  */
    @Override // p397v7.AbstractC11706h1
    /* renamed from: T */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    protected void mo36852T(p361t6.AbstractC11018d4 r15) {
        /*
            r14 = this;
            boolean r0 = r14.f30940D
            if (r0 == 0) goto L19
            v7.w$a r0 = r14.f30937A
            v7.w$a r15 = r0.m37096y(r15)
            r14.f30937A = r15
            v7.v r15 = r14.f30938B
            if (r15 == 0) goto Lae
            long r0 = r15.m37080m()
            r14.m37090a0(r0)
            goto Lae
        L19:
            boolean r0 = r15.m34005v()
            if (r0 == 0) goto L36
            boolean r0 = r14.f30941E
            if (r0 == 0) goto L2a
            v7.w$a r0 = r14.f30937A
            v7.w$a r15 = r0.m37096y(r15)
            goto L32
        L2a:
            java.lang.Object r0 = p361t6.AbstractC11018d4.d.f28236C
            java.lang.Object r1 = p397v7.C11735w.a.f30945t
            v7.w$a r15 = p397v7.C11735w.a.m37093A(r15, r0, r1)
        L32:
            r14.f30937A = r15
            goto Lae
        L36:
            t6.d4$d r0 = r14.f30943y
            r1 = 0
            r15.m34004s(r1, r0)
            t6.d4$d r0 = r14.f30943y
            long r2 = r0.m34033f()
            t6.d4$d r0 = r14.f30943y
            java.lang.Object r0 = r0.f28255a
            v7.v r4 = r14.f30938B
            if (r4 == 0) goto L74
            long r4 = r4.m37081n()
            v7.w$a r6 = r14.f30937A
            v7.v r7 = r14.f30938B
            v7.a0$b r7 = r7.f30928a
            java.lang.Object r7 = r7.f30974a
            t6.d4$b r8 = r14.f30944z
            r6.mo33628m(r7, r8)
            t6.d4$b r6 = r14.f30944z
            long r6 = r6.m34023r()
            long r6 = r6 + r4
            v7.w$a r4 = r14.f30937A
            t6.d4$d r5 = r14.f30943y
            t6.d4$d r1 = r4.m34004s(r1, r5)
            long r4 = r1.m34033f()
            int r1 = (r6 > r4 ? 1 : (r6 == r4 ? 0 : -1))
            if (r1 == 0) goto L74
            r12 = r6
            goto L75
        L74:
            r12 = r2
        L75:
            t6.d4$d r9 = r14.f30943y
            t6.d4$b r10 = r14.f30944z
            r11 = 0
            r8 = r15
            android.util.Pair r1 = r8.m34002o(r9, r10, r11, r12)
            java.lang.Object r2 = r1.first
            java.lang.Object r1 = r1.second
            java.lang.Long r1 = (java.lang.Long) r1
            long r3 = r1.longValue()
            boolean r1 = r14.f30941E
            if (r1 == 0) goto L94
            v7.w$a r0 = r14.f30937A
            v7.w$a r15 = r0.m37096y(r15)
            goto L98
        L94:
            v7.w$a r15 = p397v7.C11735w.a.m37093A(r15, r0, r2)
        L98:
            r14.f30937A = r15
            v7.v r15 = r14.f30938B
            if (r15 == 0) goto Lae
            r14.m37090a0(r3)
            v7.a0$b r15 = r15.f30928a
            java.lang.Object r0 = r15.f30974a
            java.lang.Object r0 = r14.m37089Y(r0)
            v7.a0$b r15 = r15.m36820c(r0)
            goto Laf
        Lae:
            r15 = 0
        Laf:
            r0 = 1
            r14.f30941E = r0
            r14.f30940D = r0
            v7.w$a r0 = r14.f30937A
            r14.m36802D(r0)
            if (r15 == 0) goto Lc6
            v7.v r0 = r14.f30938B
            java.lang.Object r0 = p363t8.C11137a.m34603e(r0)
            v7.v r0 = (p397v7.C11733v) r0
            r0.m37079d(r15)
        Lc6:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: p397v7.C11735w.mo36852T(t6.d4):void");
    }

    @Override // p397v7.AbstractC11706h1
    /* renamed from: V */
    public void mo36908V() {
        if (this.f30942x) {
            return;
        }
        this.f30939C = true;
        m36907U();
    }

    @Override // p397v7.InterfaceC11684a0
    /* renamed from: W, reason: merged with bridge method [inline-methods] */
    public C11733v mo11843e(InterfaceC11684a0.b bVar, InterfaceC10811b interfaceC10811b, long j10) {
        C11733v c11733v = new C11733v(bVar, interfaceC10811b, j10);
        c11733v.m37085w(this.f30718v);
        if (this.f30940D) {
            c11733v.m37079d(bVar.m36820c(m37089Y(bVar.f30974a)));
        } else {
            this.f30938B = c11733v;
            if (!this.f30939C) {
                this.f30939C = true;
                m36907U();
            }
        }
        return c11733v;
    }

    /* renamed from: Z */
    public AbstractC11018d4 m37092Z() {
        return this.f30937A;
    }

    @Override // p397v7.InterfaceC11684a0
    /* renamed from: l */
    public void mo11844l(InterfaceC11739y interfaceC11739y) {
        ((C11733v) interfaceC11739y).m37084v();
        if (interfaceC11739y == this.f30938B) {
            this.f30938B = null;
        }
    }

    @Override // p397v7.AbstractC11701g, p397v7.InterfaceC11684a0
    /* renamed from: n */
    public void mo11845n() {
    }
}

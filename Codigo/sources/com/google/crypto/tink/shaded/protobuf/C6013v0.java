package com.google.crypto.tink.shaded.protobuf;

import com.google.crypto.tink.shaded.protobuf.C5959d0;
import com.google.crypto.tink.shaded.protobuf.C6008t1;
import com.google.crypto.tink.shaded.protobuf.C6009u;
import java.util.Iterator;
import java.util.Map;

/* renamed from: com.google.crypto.tink.shaded.protobuf.v0 */
/* loaded from: classes2.dex */
final class C6013v0<T> implements InterfaceC5969g1<T> {

    /* renamed from: a */
    private final InterfaceC6001r0 f12768a;

    /* renamed from: b */
    private final AbstractC5990n1<?, ?> f12769b;

    /* renamed from: c */
    private final boolean f12770c;

    /* renamed from: d */
    private final AbstractC5997q<?> f12771d;

    private C6013v0(AbstractC5990n1<?, ?> abstractC5990n1, AbstractC5997q<?> abstractC5997q, InterfaceC6001r0 interfaceC6001r0) {
        this.f12769b = abstractC5990n1;
        this.f12770c = abstractC5997q.mo15954e(interfaceC6001r0);
        this.f12771d = abstractC5997q;
        this.f12768a = interfaceC6001r0;
    }

    /* renamed from: k */
    private <UT, UB> int m16200k(AbstractC5990n1<UT, UB> abstractC5990n1, T t10) {
        return abstractC5990n1.mo15896i(abstractC5990n1.mo15894g(t10));
    }

    /* renamed from: l */
    private <UT, UB, ET extends C6009u.b<ET>> void m16201l(AbstractC5990n1<UT, UB> abstractC5990n1, AbstractC5997q<ET> abstractC5997q, T t10, InterfaceC5966f1 interfaceC5966f1, C5994p c5994p) {
        UB mo15893f = abstractC5990n1.mo15893f(t10);
        C6009u<ET> mo15953d = abstractC5997q.mo15953d(t10);
        do {
            try {
                if (interfaceC5966f1.mo15427A() == Integer.MAX_VALUE) {
                    return;
                }
            } finally {
                abstractC5990n1.mo15902o(t10, mo15893f);
            }
        } while (m16203n(interfaceC5966f1, c5994p, abstractC5997q, mo15953d, abstractC5990n1, mo15893f));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: m */
    public static <T> C6013v0<T> m16202m(AbstractC5990n1<?, ?> abstractC5990n1, AbstractC5997q<?> abstractC5997q, InterfaceC6001r0 interfaceC6001r0) {
        return new C6013v0<>(abstractC5990n1, abstractC5997q, interfaceC6001r0);
    }

    /* renamed from: n */
    private <UT, UB, ET extends C6009u.b<ET>> boolean m16203n(InterfaceC5966f1 interfaceC5966f1, C5994p c5994p, AbstractC5997q<ET> abstractC5997q, C6009u<ET> c6009u, AbstractC5990n1<UT, UB> abstractC5990n1, UB ub2) {
        int mo15443a = interfaceC5966f1.mo15443a();
        if (mo15443a != C6008t1.f12736a) {
            if (C6008t1.m16093b(mo15443a) != 2) {
                return interfaceC5966f1.mo15430D();
            }
            Object mo15951b = abstractC5997q.mo15951b(c5994p, this.f12768a, C6008t1.m16092a(mo15443a));
            if (mo15951b == null) {
                return abstractC5990n1.m15900m(ub2, interfaceC5966f1);
            }
            abstractC5997q.mo15957h(interfaceC5966f1, mo15951b, c5994p, c6009u);
            return true;
        }
        Object obj = null;
        int i10 = 0;
        AbstractC5970h abstractC5970h = null;
        while (interfaceC5966f1.mo15427A() != Integer.MAX_VALUE) {
            int mo15443a2 = interfaceC5966f1.mo15443a();
            if (mo15443a2 == C6008t1.f12738c) {
                i10 = interfaceC5966f1.mo15450h();
                obj = abstractC5997q.mo15951b(c5994p, this.f12768a, i10);
            } else if (mo15443a2 == C6008t1.f12739d) {
                if (obj != null) {
                    abstractC5997q.mo15957h(interfaceC5966f1, obj, c5994p, c6009u);
                } else {
                    abstractC5970h = interfaceC5966f1.mo15457o();
                }
            } else if (!interfaceC5966f1.mo15430D()) {
                break;
            }
        }
        if (interfaceC5966f1.mo15443a() != C6008t1.f12737b) {
            throw C5953b0.m15323b();
        }
        if (abstractC5970h != null) {
            if (obj != null) {
                abstractC5997q.mo15958i(abstractC5970h, obj, c5994p, c6009u);
            } else {
                abstractC5990n1.mo15891d(ub2, i10, abstractC5970h);
            }
        }
        return true;
    }

    /* renamed from: o */
    private <UT, UB> void m16204o(AbstractC5990n1<UT, UB> abstractC5990n1, T t10, InterfaceC6011u1 interfaceC6011u1) {
        abstractC5990n1.mo15906s(abstractC5990n1.mo15894g(t10), interfaceC6011u1);
    }

    @Override // com.google.crypto.tink.shaded.protobuf.InterfaceC5969g1
    /* renamed from: a */
    public void mo15470a(T t10, T t11) {
        C5975i1.m15606G(this.f12769b, t10, t11);
        if (this.f12770c) {
            C5975i1.m15604E(this.f12771d, t10, t11);
        }
    }

    @Override // com.google.crypto.tink.shaded.protobuf.InterfaceC5969g1
    /* renamed from: b */
    public void mo15471b(T t10) {
        this.f12769b.mo15897j(t10);
        this.f12771d.mo15955f(t10);
    }

    @Override // com.google.crypto.tink.shaded.protobuf.InterfaceC5969g1
    /* renamed from: c */
    public final boolean mo15472c(T t10) {
        return this.f12771d.mo15952c(t10).m16116o();
    }

    @Override // com.google.crypto.tink.shaded.protobuf.InterfaceC5969g1
    /* renamed from: d */
    public int mo15473d(T t10) {
        int m16200k = m16200k(this.f12769b, t10) + 0;
        return this.f12770c ? m16200k + this.f12771d.mo15952c(t10).m16112j() : m16200k;
    }

    @Override // com.google.crypto.tink.shaded.protobuf.InterfaceC5969g1
    /* renamed from: e */
    public T mo15474e() {
        InterfaceC6001r0 interfaceC6001r0 = this.f12768a;
        return interfaceC6001r0 instanceof AbstractC6018y ? (T) ((AbstractC6018y) interfaceC6001r0).m16241L() : (T) interfaceC6001r0.mo15969d().mo15973f();
    }

    @Override // com.google.crypto.tink.shaded.protobuf.InterfaceC5969g1
    /* renamed from: f */
    public int mo15475f(T t10) {
        int hashCode = this.f12769b.mo15894g(t10).hashCode();
        return this.f12770c ? (hashCode * 53) + this.f12771d.mo15952c(t10).hashCode() : hashCode;
    }

    @Override // com.google.crypto.tink.shaded.protobuf.InterfaceC5969g1
    /* renamed from: g */
    public boolean mo15476g(T t10, T t11) {
        if (!this.f12769b.mo15894g(t10).equals(this.f12769b.mo15894g(t11))) {
            return false;
        }
        if (this.f12770c) {
            return this.f12771d.mo15952c(t10).equals(this.f12771d.mo15952c(t11));
        }
        return true;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:22:0x00c6  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x00cb A[EDGE_INSN: B:24:0x00cb->B:25:0x00cb BREAK  A[LOOP:1: B:10:0x006d->B:18:0x006d], SYNTHETIC] */
    @Override // com.google.crypto.tink.shaded.protobuf.InterfaceC5969g1
    /* renamed from: h */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void mo15477h(T r11, byte[] r12, int r13, int r14, com.google.crypto.tink.shaded.protobuf.C5961e.b r15) {
        /*
            r10 = this;
            r0 = r11
            com.google.crypto.tink.shaded.protobuf.y r0 = (com.google.crypto.tink.shaded.protobuf.AbstractC6018y) r0
            com.google.crypto.tink.shaded.protobuf.o1 r1 = r0.unknownFields
            com.google.crypto.tink.shaded.protobuf.o1 r2 = com.google.crypto.tink.shaded.protobuf.C5993o1.m15915c()
            if (r1 != r2) goto L11
            com.google.crypto.tink.shaded.protobuf.o1 r1 = com.google.crypto.tink.shaded.protobuf.C5993o1.m15919k()
            r0.unknownFields = r1
        L11:
            com.google.crypto.tink.shaded.protobuf.y$c r11 = (com.google.crypto.tink.shaded.protobuf.AbstractC6018y.c) r11
            com.google.crypto.tink.shaded.protobuf.u r11 = r11.m16265V()
            r0 = 0
            r2 = r0
        L19:
            if (r13 >= r14) goto Ld7
            int r4 = com.google.crypto.tink.shaded.protobuf.C5961e.m15361I(r12, r13, r15)
            int r13 = r15.f12572a
            int r3 = com.google.crypto.tink.shaded.protobuf.C6008t1.f12736a
            r5 = 2
            if (r13 == r3) goto L6b
            int r3 = com.google.crypto.tink.shaded.protobuf.C6008t1.m16093b(r13)
            if (r3 != r5) goto L66
            com.google.crypto.tink.shaded.protobuf.q<?> r2 = r10.f12771d
            com.google.crypto.tink.shaded.protobuf.p r3 = r15.f12575d
            com.google.crypto.tink.shaded.protobuf.r0 r5 = r10.f12768a
            int r6 = com.google.crypto.tink.shaded.protobuf.C6008t1.m16092a(r13)
            java.lang.Object r2 = r2.mo15951b(r3, r5, r6)
            r8 = r2
            com.google.crypto.tink.shaded.protobuf.y$e r8 = (com.google.crypto.tink.shaded.protobuf.AbstractC6018y.e) r8
            if (r8 == 0) goto L5b
            com.google.crypto.tink.shaded.protobuf.c1 r13 = com.google.crypto.tink.shaded.protobuf.C5957c1.m15338a()
            com.google.crypto.tink.shaded.protobuf.r0 r2 = r8.m16269b()
            java.lang.Class r2 = r2.getClass()
            com.google.crypto.tink.shaded.protobuf.g1 r13 = r13.m15340c(r2)
            int r13 = com.google.crypto.tink.shaded.protobuf.C5961e.m15384p(r13, r12, r4, r14, r15)
            com.google.crypto.tink.shaded.protobuf.y$d r2 = r8.f12785b
            java.lang.Object r3 = r15.f12574c
            r11.m16120x(r2, r3)
            goto L64
        L5b:
            r2 = r13
            r3 = r12
            r5 = r14
            r6 = r1
            r7 = r15
            int r13 = com.google.crypto.tink.shaded.protobuf.C5961e.m15359G(r2, r3, r4, r5, r6, r7)
        L64:
            r2 = r8
            goto L19
        L66:
            int r13 = com.google.crypto.tink.shaded.protobuf.C5961e.m15368P(r13, r12, r4, r14, r15)
            goto L19
        L6b:
            r13 = 0
            r3 = r0
        L6d:
            if (r4 >= r14) goto Lcb
            int r4 = com.google.crypto.tink.shaded.protobuf.C5961e.m15361I(r12, r4, r15)
            int r6 = r15.f12572a
            int r7 = com.google.crypto.tink.shaded.protobuf.C6008t1.m16092a(r6)
            int r8 = com.google.crypto.tink.shaded.protobuf.C6008t1.m16093b(r6)
            if (r7 == r5) goto Lac
            r9 = 3
            if (r7 == r9) goto L83
            goto Lc1
        L83:
            if (r2 == 0) goto La1
            com.google.crypto.tink.shaded.protobuf.c1 r6 = com.google.crypto.tink.shaded.protobuf.C5957c1.m15338a()
            com.google.crypto.tink.shaded.protobuf.r0 r7 = r2.m16269b()
            java.lang.Class r7 = r7.getClass()
            com.google.crypto.tink.shaded.protobuf.g1 r6 = r6.m15340c(r7)
            int r4 = com.google.crypto.tink.shaded.protobuf.C5961e.m15384p(r6, r12, r4, r14, r15)
            com.google.crypto.tink.shaded.protobuf.y$d r6 = r2.f12785b
            java.lang.Object r7 = r15.f12574c
            r11.m16120x(r6, r7)
            goto L6d
        La1:
            if (r8 != r5) goto Lc1
            int r4 = com.google.crypto.tink.shaded.protobuf.C5961e.m15370b(r12, r4, r15)
            java.lang.Object r3 = r15.f12574c
            com.google.crypto.tink.shaded.protobuf.h r3 = (com.google.crypto.tink.shaded.protobuf.AbstractC5970h) r3
            goto L6d
        Lac:
            if (r8 != 0) goto Lc1
            int r4 = com.google.crypto.tink.shaded.protobuf.C5961e.m15361I(r12, r4, r15)
            int r13 = r15.f12572a
            com.google.crypto.tink.shaded.protobuf.q<?> r2 = r10.f12771d
            com.google.crypto.tink.shaded.protobuf.p r6 = r15.f12575d
            com.google.crypto.tink.shaded.protobuf.r0 r7 = r10.f12768a
            java.lang.Object r2 = r2.mo15951b(r6, r7, r13)
            com.google.crypto.tink.shaded.protobuf.y$e r2 = (com.google.crypto.tink.shaded.protobuf.AbstractC6018y.e) r2
            goto L6d
        Lc1:
            int r7 = com.google.crypto.tink.shaded.protobuf.C6008t1.f12737b
            if (r6 != r7) goto Lc6
            goto Lcb
        Lc6:
            int r4 = com.google.crypto.tink.shaded.protobuf.C5961e.m15368P(r6, r12, r4, r14, r15)
            goto L6d
        Lcb:
            if (r3 == 0) goto Ld4
            int r13 = com.google.crypto.tink.shaded.protobuf.C6008t1.m16094c(r13, r5)
            r1.m15929n(r13, r3)
        Ld4:
            r13 = r4
            goto L19
        Ld7:
            if (r13 != r14) goto Lda
            return
        Lda:
            com.google.crypto.tink.shaded.protobuf.b0 r11 = com.google.crypto.tink.shaded.protobuf.C5953b0.m15329h()
            throw r11
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.crypto.tink.shaded.protobuf.C6013v0.mo15477h(java.lang.Object, byte[], int, int, com.google.crypto.tink.shaded.protobuf.e$b):void");
    }

    @Override // com.google.crypto.tink.shaded.protobuf.InterfaceC5969g1
    /* renamed from: i */
    public void mo15478i(T t10, InterfaceC5966f1 interfaceC5966f1, C5994p c5994p) {
        m16201l(this.f12769b, this.f12771d, t10, interfaceC5966f1, c5994p);
    }

    @Override // com.google.crypto.tink.shaded.protobuf.InterfaceC5969g1
    /* renamed from: j */
    public void mo15479j(T t10, InterfaceC6011u1 interfaceC6011u1) {
        Iterator<Map.Entry<?, Object>> m16117s = this.f12771d.mo15952c(t10).m16117s();
        while (m16117s.hasNext()) {
            Map.Entry<?, Object> next = m16117s.next();
            C6009u.b bVar = (C6009u.b) next.getKey();
            if (bVar.mo16124e() != C6008t1.c.MESSAGE || bVar.mo16122c() || bVar.mo16125f()) {
                throw new IllegalStateException("Found invalid MessageSet item.");
            }
            interfaceC6011u1.mo15825b(bVar.mo16121a(), next instanceof C5959d0.b ? ((C5959d0.b) next).m15346a().m15399e() : next.getValue());
        }
        m16204o(this.f12769b, t10, interfaceC6011u1);
    }
}

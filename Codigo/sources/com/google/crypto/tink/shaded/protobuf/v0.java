package com.google.crypto.tink.shaded.protobuf;

import com.google.crypto.tink.shaded.protobuf.d0;
import com.google.crypto.tink.shaded.protobuf.t1;
import com.google.crypto.tink.shaded.protobuf.u;
import java.util.Iterator;
import java.util.Map;

/* loaded from: classes2.dex */
final class v0<T> implements g1<T> {

    /* renamed from: a */
    private final r0 f11553a;

    /* renamed from: b */
    private final n1<?, ?> f11554b;

    /* renamed from: c */
    private final boolean f11555c;

    /* renamed from: d */
    private final q<?> f11556d;

    private v0(n1<?, ?> n1Var, q<?> qVar, r0 r0Var) {
        this.f11554b = n1Var;
        this.f11555c = qVar.e(r0Var);
        this.f11556d = qVar;
        this.f11553a = r0Var;
    }

    private <UT, UB> int k(n1<UT, UB> n1Var, T t10) {
        return n1Var.i(n1Var.g(t10));
    }

    private <UT, UB, ET extends u.b<ET>> void l(n1<UT, UB> n1Var, q<ET> qVar, T t10, f1 f1Var, p pVar) {
        UB f10 = n1Var.f(t10);
        u<ET> d10 = qVar.d(t10);
        do {
            try {
                if (f1Var.A() == Integer.MAX_VALUE) {
                    return;
                }
            } finally {
                n1Var.o(t10, f10);
            }
        } while (n(f1Var, pVar, qVar, d10, n1Var, f10));
    }

    public static <T> v0<T> m(n1<?, ?> n1Var, q<?> qVar, r0 r0Var) {
        return new v0<>(n1Var, qVar, r0Var);
    }

    private <UT, UB, ET extends u.b<ET>> boolean n(f1 f1Var, p pVar, q<ET> qVar, u<ET> uVar, n1<UT, UB> n1Var, UB ub2) {
        int a10 = f1Var.a();
        if (a10 != t1.f11521a) {
            if (t1.b(a10) != 2) {
                return f1Var.D();
            }
            Object b10 = qVar.b(pVar, this.f11553a, t1.a(a10));
            if (b10 == null) {
                return n1Var.m(ub2, f1Var);
            }
            qVar.h(f1Var, b10, pVar, uVar);
            return true;
        }
        Object obj = null;
        int i10 = 0;
        h hVar = null;
        while (f1Var.A() != Integer.MAX_VALUE) {
            int a11 = f1Var.a();
            if (a11 == t1.f11523c) {
                i10 = f1Var.h();
                obj = qVar.b(pVar, this.f11553a, i10);
            } else if (a11 == t1.f11524d) {
                if (obj != null) {
                    qVar.h(f1Var, obj, pVar, uVar);
                } else {
                    hVar = f1Var.o();
                }
            } else if (!f1Var.D()) {
                break;
            }
        }
        if (f1Var.a() != t1.f11522b) {
            throw b0.b();
        }
        if (hVar != null) {
            if (obj != null) {
                qVar.i(hVar, obj, pVar, uVar);
            } else {
                n1Var.d(ub2, i10, hVar);
            }
        }
        return true;
    }

    private <UT, UB> void o(n1<UT, UB> n1Var, T t10, u1 u1Var) {
        n1Var.s(n1Var.g(t10), u1Var);
    }

    @Override // com.google.crypto.tink.shaded.protobuf.g1
    public void a(T t10, T t11) {
        i1.G(this.f11554b, t10, t11);
        if (this.f11555c) {
            i1.E(this.f11556d, t10, t11);
        }
    }

    @Override // com.google.crypto.tink.shaded.protobuf.g1
    public void b(T t10) {
        this.f11554b.j(t10);
        this.f11556d.f(t10);
    }

    @Override // com.google.crypto.tink.shaded.protobuf.g1
    public final boolean c(T t10) {
        return this.f11556d.c(t10).o();
    }

    @Override // com.google.crypto.tink.shaded.protobuf.g1
    public int d(T t10) {
        int k10 = k(this.f11554b, t10) + 0;
        return this.f11555c ? k10 + this.f11556d.c(t10).j() : k10;
    }

    @Override // com.google.crypto.tink.shaded.protobuf.g1
    public T e() {
        r0 r0Var = this.f11553a;
        return r0Var instanceof y ? (T) ((y) r0Var).L() : (T) r0Var.d().f();
    }

    @Override // com.google.crypto.tink.shaded.protobuf.g1
    public int f(T t10) {
        int hashCode = this.f11554b.g(t10).hashCode();
        return this.f11555c ? (hashCode * 53) + this.f11556d.c(t10).hashCode() : hashCode;
    }

    @Override // com.google.crypto.tink.shaded.protobuf.g1
    public boolean g(T t10, T t11) {
        if (!this.f11554b.g(t10).equals(this.f11554b.g(t11))) {
            return false;
        }
        if (this.f11555c) {
            return this.f11556d.c(t10).equals(this.f11556d.c(t11));
        }
        return true;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:22:0x00c6  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x00cb A[EDGE_INSN: B:24:0x00cb->B:25:0x00cb BREAK  A[LOOP:1: B:10:0x006d->B:18:0x006d], SYNTHETIC] */
    @Override // com.google.crypto.tink.shaded.protobuf.g1
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void h(T r11, byte[] r12, int r13, int r14, com.google.crypto.tink.shaded.protobuf.e.b r15) {
        /*
            r10 = this;
            r0 = r11
            com.google.crypto.tink.shaded.protobuf.y r0 = (com.google.crypto.tink.shaded.protobuf.y) r0
            com.google.crypto.tink.shaded.protobuf.o1 r1 = r0.unknownFields
            com.google.crypto.tink.shaded.protobuf.o1 r2 = com.google.crypto.tink.shaded.protobuf.o1.c()
            if (r1 != r2) goto L11
            com.google.crypto.tink.shaded.protobuf.o1 r1 = com.google.crypto.tink.shaded.protobuf.o1.k()
            r0.unknownFields = r1
        L11:
            com.google.crypto.tink.shaded.protobuf.y$c r11 = (com.google.crypto.tink.shaded.protobuf.y.c) r11
            com.google.crypto.tink.shaded.protobuf.u r11 = r11.V()
            r0 = 0
            r2 = r0
        L19:
            if (r13 >= r14) goto Ld7
            int r4 = com.google.crypto.tink.shaded.protobuf.e.I(r12, r13, r15)
            int r13 = r15.f11357a
            int r3 = com.google.crypto.tink.shaded.protobuf.t1.f11521a
            r5 = 2
            if (r13 == r3) goto L6b
            int r3 = com.google.crypto.tink.shaded.protobuf.t1.b(r13)
            if (r3 != r5) goto L66
            com.google.crypto.tink.shaded.protobuf.q<?> r2 = r10.f11556d
            com.google.crypto.tink.shaded.protobuf.p r3 = r15.f11360d
            com.google.crypto.tink.shaded.protobuf.r0 r5 = r10.f11553a
            int r6 = com.google.crypto.tink.shaded.protobuf.t1.a(r13)
            java.lang.Object r2 = r2.b(r3, r5, r6)
            r8 = r2
            com.google.crypto.tink.shaded.protobuf.y$e r8 = (com.google.crypto.tink.shaded.protobuf.y.e) r8
            if (r8 == 0) goto L5b
            com.google.crypto.tink.shaded.protobuf.c1 r13 = com.google.crypto.tink.shaded.protobuf.c1.a()
            com.google.crypto.tink.shaded.protobuf.r0 r2 = r8.b()
            java.lang.Class r2 = r2.getClass()
            com.google.crypto.tink.shaded.protobuf.g1 r13 = r13.c(r2)
            int r13 = com.google.crypto.tink.shaded.protobuf.e.p(r13, r12, r4, r14, r15)
            com.google.crypto.tink.shaded.protobuf.y$d r2 = r8.f11570b
            java.lang.Object r3 = r15.f11359c
            r11.x(r2, r3)
            goto L64
        L5b:
            r2 = r13
            r3 = r12
            r5 = r14
            r6 = r1
            r7 = r15
            int r13 = com.google.crypto.tink.shaded.protobuf.e.G(r2, r3, r4, r5, r6, r7)
        L64:
            r2 = r8
            goto L19
        L66:
            int r13 = com.google.crypto.tink.shaded.protobuf.e.P(r13, r12, r4, r14, r15)
            goto L19
        L6b:
            r13 = 0
            r3 = r0
        L6d:
            if (r4 >= r14) goto Lcb
            int r4 = com.google.crypto.tink.shaded.protobuf.e.I(r12, r4, r15)
            int r6 = r15.f11357a
            int r7 = com.google.crypto.tink.shaded.protobuf.t1.a(r6)
            int r8 = com.google.crypto.tink.shaded.protobuf.t1.b(r6)
            if (r7 == r5) goto Lac
            r9 = 3
            if (r7 == r9) goto L83
            goto Lc1
        L83:
            if (r2 == 0) goto La1
            com.google.crypto.tink.shaded.protobuf.c1 r6 = com.google.crypto.tink.shaded.protobuf.c1.a()
            com.google.crypto.tink.shaded.protobuf.r0 r7 = r2.b()
            java.lang.Class r7 = r7.getClass()
            com.google.crypto.tink.shaded.protobuf.g1 r6 = r6.c(r7)
            int r4 = com.google.crypto.tink.shaded.protobuf.e.p(r6, r12, r4, r14, r15)
            com.google.crypto.tink.shaded.protobuf.y$d r6 = r2.f11570b
            java.lang.Object r7 = r15.f11359c
            r11.x(r6, r7)
            goto L6d
        La1:
            if (r8 != r5) goto Lc1
            int r4 = com.google.crypto.tink.shaded.protobuf.e.b(r12, r4, r15)
            java.lang.Object r3 = r15.f11359c
            com.google.crypto.tink.shaded.protobuf.h r3 = (com.google.crypto.tink.shaded.protobuf.h) r3
            goto L6d
        Lac:
            if (r8 != 0) goto Lc1
            int r4 = com.google.crypto.tink.shaded.protobuf.e.I(r12, r4, r15)
            int r13 = r15.f11357a
            com.google.crypto.tink.shaded.protobuf.q<?> r2 = r10.f11556d
            com.google.crypto.tink.shaded.protobuf.p r6 = r15.f11360d
            com.google.crypto.tink.shaded.protobuf.r0 r7 = r10.f11553a
            java.lang.Object r2 = r2.b(r6, r7, r13)
            com.google.crypto.tink.shaded.protobuf.y$e r2 = (com.google.crypto.tink.shaded.protobuf.y.e) r2
            goto L6d
        Lc1:
            int r7 = com.google.crypto.tink.shaded.protobuf.t1.f11522b
            if (r6 != r7) goto Lc6
            goto Lcb
        Lc6:
            int r4 = com.google.crypto.tink.shaded.protobuf.e.P(r6, r12, r4, r14, r15)
            goto L6d
        Lcb:
            if (r3 == 0) goto Ld4
            int r13 = com.google.crypto.tink.shaded.protobuf.t1.c(r13, r5)
            r1.n(r13, r3)
        Ld4:
            r13 = r4
            goto L19
        Ld7:
            if (r13 != r14) goto Lda
            return
        Lda:
            com.google.crypto.tink.shaded.protobuf.b0 r11 = com.google.crypto.tink.shaded.protobuf.b0.h()
            throw r11
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.crypto.tink.shaded.protobuf.v0.h(java.lang.Object, byte[], int, int, com.google.crypto.tink.shaded.protobuf.e$b):void");
    }

    @Override // com.google.crypto.tink.shaded.protobuf.g1
    public void i(T t10, f1 f1Var, p pVar) {
        l(this.f11554b, this.f11556d, t10, f1Var, pVar);
    }

    @Override // com.google.crypto.tink.shaded.protobuf.g1
    public void j(T t10, u1 u1Var) {
        Iterator<Map.Entry<?, Object>> s10 = this.f11556d.c(t10).s();
        while (s10.hasNext()) {
            Map.Entry<?, Object> next = s10.next();
            u.b bVar = (u.b) next.getKey();
            if (bVar.e() != t1.c.MESSAGE || bVar.c() || bVar.f()) {
                throw new IllegalStateException("Found invalid MessageSet item.");
            }
            u1Var.b(bVar.a(), next instanceof d0.b ? ((d0.b) next).a().e() : next.getValue());
        }
        o(this.f11554b, t10, u1Var);
    }
}

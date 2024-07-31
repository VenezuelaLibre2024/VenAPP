package com.google.protobuf;

import com.google.android.gms.common.api.a;
import com.google.protobuf.t1;
import java.util.List;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes2.dex */
public final class i implements f1 {

    /* renamed from: a, reason: collision with root package name */
    private final h f13223a;

    /* renamed from: b, reason: collision with root package name */
    private int f13224b;

    /* renamed from: c, reason: collision with root package name */
    private int f13225c;

    /* renamed from: d, reason: collision with root package name */
    private int f13226d = 0;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes2.dex */
    public static /* synthetic */ class a {

        /* renamed from: a, reason: collision with root package name */
        static final /* synthetic */ int[] f13227a;

        static {
            int[] iArr = new int[t1.b.values().length];
            f13227a = iArr;
            try {
                iArr[t1.b.BOOL.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f13227a[t1.b.BYTES.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f13227a[t1.b.DOUBLE.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f13227a[t1.b.ENUM.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f13227a[t1.b.FIXED32.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f13227a[t1.b.FIXED64.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f13227a[t1.b.FLOAT.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                f13227a[t1.b.INT32.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                f13227a[t1.b.INT64.ordinal()] = 9;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                f13227a[t1.b.MESSAGE.ordinal()] = 10;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                f13227a[t1.b.SFIXED32.ordinal()] = 11;
            } catch (NoSuchFieldError unused11) {
            }
            try {
                f13227a[t1.b.SFIXED64.ordinal()] = 12;
            } catch (NoSuchFieldError unused12) {
            }
            try {
                f13227a[t1.b.SINT32.ordinal()] = 13;
            } catch (NoSuchFieldError unused13) {
            }
            try {
                f13227a[t1.b.SINT64.ordinal()] = 14;
            } catch (NoSuchFieldError unused14) {
            }
            try {
                f13227a[t1.b.STRING.ordinal()] = 15;
            } catch (NoSuchFieldError unused15) {
            }
            try {
                f13227a[t1.b.UINT32.ordinal()] = 16;
            } catch (NoSuchFieldError unused16) {
            }
            try {
                f13227a[t1.b.UINT64.ordinal()] = 17;
            } catch (NoSuchFieldError unused17) {
            }
        }
    }

    private i(h hVar) {
        h hVar2 = (h) z.b(hVar, "input");
        this.f13223a = hVar2;
        hVar2.f13201d = this;
    }

    public static i Q(h hVar) {
        i iVar = hVar.f13201d;
        return iVar != null ? iVar : new i(hVar);
    }

    private <T> void R(T t10, g1<T> g1Var, o oVar) {
        int i10 = this.f13225c;
        this.f13225c = t1.c(t1.a(this.f13224b), 4);
        try {
            g1Var.i(t10, this, oVar);
            if (this.f13224b == this.f13225c) {
            } else {
                throw b0.h();
            }
        } finally {
            this.f13225c = i10;
        }
    }

    private <T> void S(T t10, g1<T> g1Var, o oVar) {
        int C = this.f13223a.C();
        h hVar = this.f13223a;
        if (hVar.f13198a >= hVar.f13199b) {
            throw b0.i();
        }
        int l10 = hVar.l(C);
        this.f13223a.f13198a++;
        g1Var.i(t10, this, oVar);
        this.f13223a.a(0);
        r5.f13198a--;
        this.f13223a.k(l10);
    }

    private Object T(t1.b bVar, Class<?> cls, o oVar) {
        switch (a.f13227a[bVar.ordinal()]) {
            case 1:
                return Boolean.valueOf(e());
            case 2:
                return o();
            case 3:
                return Double.valueOf(readDouble());
            case 4:
                return Integer.valueOf(k());
            case 5:
                return Integer.valueOf(u());
            case 6:
                return Long.valueOf(b());
            case 7:
                return Float.valueOf(readFloat());
            case 8:
                return Integer.valueOf(p());
            case 9:
                return Long.valueOf(H());
            case 10:
                return N(cls, oVar);
            case 11:
                return Integer.valueOf(E());
            case 12:
                return Long.valueOf(f());
            case 13:
                return Integer.valueOf(l());
            case 14:
                return Long.valueOf(y());
            case 15:
                return I();
            case 16:
                return Integer.valueOf(h());
            case 17:
                return Long.valueOf(s());
            default:
                throw new IllegalArgumentException("unsupported field type.");
        }
    }

    private <T> T U(g1<T> g1Var, o oVar) {
        T e10 = g1Var.e();
        R(e10, g1Var, oVar);
        g1Var.b(e10);
        return e10;
    }

    private <T> T V(g1<T> g1Var, o oVar) {
        T e10 = g1Var.e();
        S(e10, g1Var, oVar);
        g1Var.b(e10);
        return e10;
    }

    private void X(int i10) {
        if (this.f13223a.d() != i10) {
            throw b0.m();
        }
    }

    private void Y(int i10) {
        if (t1.b(this.f13224b) != i10) {
            throw b0.e();
        }
    }

    private void Z(int i10) {
        if ((i10 & 3) != 0) {
            throw b0.h();
        }
    }

    private void a0(int i10) {
        if ((i10 & 7) != 0) {
            throw b0.h();
        }
    }

    @Override // com.google.protobuf.f1
    public int A() {
        int i10 = this.f13226d;
        if (i10 != 0) {
            this.f13224b = i10;
            this.f13226d = 0;
        } else {
            this.f13224b = this.f13223a.B();
        }
        int i11 = this.f13224b;
        return (i11 == 0 || i11 == this.f13225c) ? a.e.API_PRIORITY_OTHER : t1.a(i11);
    }

    @Override // com.google.protobuf.f1
    public void B(List<String> list) {
        W(list, false);
    }

    @Override // com.google.protobuf.f1
    public void C(List<Float> list) {
        int B;
        int B2;
        if (!(list instanceof v)) {
            int b10 = t1.b(this.f13224b);
            if (b10 == 2) {
                int C = this.f13223a.C();
                Z(C);
                int d10 = this.f13223a.d() + C;
                do {
                    list.add(Float.valueOf(this.f13223a.s()));
                } while (this.f13223a.d() < d10);
                return;
            }
            if (b10 != 5) {
                throw b0.e();
            }
            do {
                list.add(Float.valueOf(this.f13223a.s()));
                if (this.f13223a.e()) {
                    return;
                } else {
                    B = this.f13223a.B();
                }
            } while (B == this.f13224b);
            this.f13226d = B;
            return;
        }
        v vVar = (v) list;
        int b11 = t1.b(this.f13224b);
        if (b11 == 2) {
            int C2 = this.f13223a.C();
            Z(C2);
            int d11 = this.f13223a.d() + C2;
            do {
                vVar.h(this.f13223a.s());
            } while (this.f13223a.d() < d11);
            return;
        }
        if (b11 != 5) {
            throw b0.e();
        }
        do {
            vVar.h(this.f13223a.s());
            if (this.f13223a.e()) {
                return;
            } else {
                B2 = this.f13223a.B();
            }
        } while (B2 == this.f13224b);
        this.f13226d = B2;
    }

    @Override // com.google.protobuf.f1
    public boolean D() {
        int i10;
        if (this.f13223a.e() || (i10 = this.f13224b) == this.f13225c) {
            return false;
        }
        return this.f13223a.F(i10);
    }

    @Override // com.google.protobuf.f1
    public int E() {
        Y(5);
        return this.f13223a.v();
    }

    @Override // com.google.protobuf.f1
    public void F(List<g> list) {
        int B;
        if (t1.b(this.f13224b) != 2) {
            throw b0.e();
        }
        do {
            list.add(o());
            if (this.f13223a.e()) {
                return;
            } else {
                B = this.f13223a.B();
            }
        } while (B == this.f13224b);
        this.f13226d = B;
    }

    @Override // com.google.protobuf.f1
    public void G(List<Double> list) {
        int B;
        int B2;
        if (!(list instanceof l)) {
            int b10 = t1.b(this.f13224b);
            if (b10 != 1) {
                if (b10 != 2) {
                    throw b0.e();
                }
                int C = this.f13223a.C();
                a0(C);
                int d10 = this.f13223a.d() + C;
                do {
                    list.add(Double.valueOf(this.f13223a.o()));
                } while (this.f13223a.d() < d10);
                return;
            }
            do {
                list.add(Double.valueOf(this.f13223a.o()));
                if (this.f13223a.e()) {
                    return;
                } else {
                    B = this.f13223a.B();
                }
            } while (B == this.f13224b);
            this.f13226d = B;
            return;
        }
        l lVar = (l) list;
        int b11 = t1.b(this.f13224b);
        if (b11 != 1) {
            if (b11 != 2) {
                throw b0.e();
            }
            int C2 = this.f13223a.C();
            a0(C2);
            int d11 = this.f13223a.d() + C2;
            do {
                lVar.h(this.f13223a.o());
            } while (this.f13223a.d() < d11);
            return;
        }
        do {
            lVar.h(this.f13223a.o());
            if (this.f13223a.e()) {
                return;
            } else {
                B2 = this.f13223a.B();
            }
        } while (B2 == this.f13224b);
        this.f13226d = B2;
    }

    @Override // com.google.protobuf.f1
    public long H() {
        Y(0);
        return this.f13223a.u();
    }

    @Override // com.google.protobuf.f1
    public String I() {
        Y(2);
        return this.f13223a.A();
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.google.protobuf.f1
    @Deprecated
    public <T> void J(List<T> list, g1<T> g1Var, o oVar) {
        int B;
        if (t1.b(this.f13224b) != 3) {
            throw b0.e();
        }
        int i10 = this.f13224b;
        do {
            list.add(U(g1Var, oVar));
            if (this.f13223a.e() || this.f13226d != 0) {
                return;
            } else {
                B = this.f13223a.B();
            }
        } while (B == i10);
        this.f13226d = B;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.google.protobuf.f1
    public <T> void K(List<T> list, g1<T> g1Var, o oVar) {
        int B;
        if (t1.b(this.f13224b) != 2) {
            throw b0.e();
        }
        int i10 = this.f13224b;
        do {
            list.add(V(g1Var, oVar));
            if (this.f13223a.e() || this.f13226d != 0) {
                return;
            } else {
                B = this.f13223a.B();
            }
        } while (B == i10);
        this.f13226d = B;
    }

    @Override // com.google.protobuf.f1
    @Deprecated
    public <T> T L(Class<T> cls, o oVar) {
        Y(3);
        return (T) U(c1.a().c(cls), oVar);
    }

    /* JADX WARN: Code restructure failed: missing block: B:38:0x005c, code lost:
    
        r8.put(r2, r3);
     */
    /* JADX WARN: Code restructure failed: missing block: B:40:0x0064, code lost:
    
        return;
     */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.google.protobuf.f1
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public <K, V> void M(java.util.Map<K, V> r8, com.google.protobuf.k0.a<K, V> r9, com.google.protobuf.o r10) {
        /*
            r7 = this;
            r0 = 2
            r7.Y(r0)
            com.google.protobuf.h r1 = r7.f13223a
            int r1 = r1.C()
            com.google.protobuf.h r2 = r7.f13223a
            int r1 = r2.l(r1)
            K r2 = r9.f13278b
            V r3 = r9.f13280d
        L14:
            int r4 = r7.A()     // Catch: java.lang.Throwable -> L65
            r5 = 2147483647(0x7fffffff, float:NaN)
            if (r4 == r5) goto L5c
            com.google.protobuf.h r5 = r7.f13223a     // Catch: java.lang.Throwable -> L65
            boolean r5 = r5.e()     // Catch: java.lang.Throwable -> L65
            if (r5 == 0) goto L26
            goto L5c
        L26:
            r5 = 1
            java.lang.String r6 = "Unable to parse map entry."
            if (r4 == r5) goto L47
            if (r4 == r0) goto L3a
            boolean r4 = r7.D()     // Catch: com.google.protobuf.b0.a -> L4f java.lang.Throwable -> L65
            if (r4 == 0) goto L34
            goto L14
        L34:
            com.google.protobuf.b0 r4 = new com.google.protobuf.b0     // Catch: com.google.protobuf.b0.a -> L4f java.lang.Throwable -> L65
            r4.<init>(r6)     // Catch: com.google.protobuf.b0.a -> L4f java.lang.Throwable -> L65
            throw r4     // Catch: com.google.protobuf.b0.a -> L4f java.lang.Throwable -> L65
        L3a:
            com.google.protobuf.t1$b r4 = r9.f13279c     // Catch: com.google.protobuf.b0.a -> L4f java.lang.Throwable -> L65
            V r5 = r9.f13280d     // Catch: com.google.protobuf.b0.a -> L4f java.lang.Throwable -> L65
            java.lang.Class r5 = r5.getClass()     // Catch: com.google.protobuf.b0.a -> L4f java.lang.Throwable -> L65
            java.lang.Object r3 = r7.T(r4, r5, r10)     // Catch: com.google.protobuf.b0.a -> L4f java.lang.Throwable -> L65
            goto L14
        L47:
            com.google.protobuf.t1$b r4 = r9.f13277a     // Catch: com.google.protobuf.b0.a -> L4f java.lang.Throwable -> L65
            r5 = 0
            java.lang.Object r2 = r7.T(r4, r5, r5)     // Catch: com.google.protobuf.b0.a -> L4f java.lang.Throwable -> L65
            goto L14
        L4f:
            boolean r4 = r7.D()     // Catch: java.lang.Throwable -> L65
            if (r4 == 0) goto L56
            goto L14
        L56:
            com.google.protobuf.b0 r8 = new com.google.protobuf.b0     // Catch: java.lang.Throwable -> L65
            r8.<init>(r6)     // Catch: java.lang.Throwable -> L65
            throw r8     // Catch: java.lang.Throwable -> L65
        L5c:
            r8.put(r2, r3)     // Catch: java.lang.Throwable -> L65
            com.google.protobuf.h r8 = r7.f13223a
            r8.k(r1)
            return
        L65:
            r8 = move-exception
            com.google.protobuf.h r9 = r7.f13223a
            r9.k(r1)
            throw r8
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.protobuf.i.M(java.util.Map, com.google.protobuf.k0$a, com.google.protobuf.o):void");
    }

    @Override // com.google.protobuf.f1
    public <T> T N(Class<T> cls, o oVar) {
        Y(2);
        return (T) V(c1.a().c(cls), oVar);
    }

    @Override // com.google.protobuf.f1
    public <T> void O(T t10, g1<T> g1Var, o oVar) {
        Y(3);
        R(t10, g1Var, oVar);
    }

    @Override // com.google.protobuf.f1
    public <T> void P(T t10, g1<T> g1Var, o oVar) {
        Y(2);
        S(t10, g1Var, oVar);
    }

    public void W(List<String> list, boolean z10) {
        int B;
        int B2;
        if (t1.b(this.f13224b) != 2) {
            throw b0.e();
        }
        if (!(list instanceof g0) || z10) {
            do {
                list.add(z10 ? I() : z());
                if (this.f13223a.e()) {
                    return;
                } else {
                    B = this.f13223a.B();
                }
            } while (B == this.f13224b);
            this.f13226d = B;
            return;
        }
        g0 g0Var = (g0) list;
        do {
            g0Var.B(o());
            if (this.f13223a.e()) {
                return;
            } else {
                B2 = this.f13223a.B();
            }
        } while (B2 == this.f13224b);
        this.f13226d = B2;
    }

    @Override // com.google.protobuf.f1
    public int a() {
        return this.f13224b;
    }

    @Override // com.google.protobuf.f1
    public long b() {
        Y(1);
        return this.f13223a.r();
    }

    @Override // com.google.protobuf.f1
    public void c(List<Integer> list) {
        int B;
        int B2;
        if (!(list instanceof y)) {
            int b10 = t1.b(this.f13224b);
            if (b10 == 2) {
                int C = this.f13223a.C();
                Z(C);
                int d10 = this.f13223a.d() + C;
                do {
                    list.add(Integer.valueOf(this.f13223a.v()));
                } while (this.f13223a.d() < d10);
                return;
            }
            if (b10 != 5) {
                throw b0.e();
            }
            do {
                list.add(Integer.valueOf(this.f13223a.v()));
                if (this.f13223a.e()) {
                    return;
                } else {
                    B = this.f13223a.B();
                }
            } while (B == this.f13224b);
            this.f13226d = B;
            return;
        }
        y yVar = (y) list;
        int b11 = t1.b(this.f13224b);
        if (b11 == 2) {
            int C2 = this.f13223a.C();
            Z(C2);
            int d11 = this.f13223a.d() + C2;
            do {
                yVar.F0(this.f13223a.v());
            } while (this.f13223a.d() < d11);
            return;
        }
        if (b11 != 5) {
            throw b0.e();
        }
        do {
            yVar.F0(this.f13223a.v());
            if (this.f13223a.e()) {
                return;
            } else {
                B2 = this.f13223a.B();
            }
        } while (B2 == this.f13224b);
        this.f13226d = B2;
    }

    @Override // com.google.protobuf.f1
    public void d(List<Long> list) {
        int B;
        int d10;
        int B2;
        if (!(list instanceof i0)) {
            int b10 = t1.b(this.f13224b);
            if (b10 != 0) {
                if (b10 != 2) {
                    throw b0.e();
                }
                d10 = this.f13223a.d() + this.f13223a.C();
                do {
                    list.add(Long.valueOf(this.f13223a.y()));
                } while (this.f13223a.d() < d10);
            }
            do {
                list.add(Long.valueOf(this.f13223a.y()));
                if (this.f13223a.e()) {
                    return;
                } else {
                    B = this.f13223a.B();
                }
            } while (B == this.f13224b);
            this.f13226d = B;
            return;
        }
        i0 i0Var = (i0) list;
        int b11 = t1.b(this.f13224b);
        if (b11 != 0) {
            if (b11 != 2) {
                throw b0.e();
            }
            d10 = this.f13223a.d() + this.f13223a.C();
            do {
                i0Var.k(this.f13223a.y());
            } while (this.f13223a.d() < d10);
        }
        do {
            i0Var.k(this.f13223a.y());
            if (this.f13223a.e()) {
                return;
            } else {
                B2 = this.f13223a.B();
            }
        } while (B2 == this.f13224b);
        this.f13226d = B2;
        return;
        X(d10);
    }

    @Override // com.google.protobuf.f1
    public boolean e() {
        Y(0);
        return this.f13223a.m();
    }

    @Override // com.google.protobuf.f1
    public long f() {
        Y(1);
        return this.f13223a.w();
    }

    @Override // com.google.protobuf.f1
    public void g(List<Long> list) {
        int B;
        int d10;
        int B2;
        if (!(list instanceof i0)) {
            int b10 = t1.b(this.f13224b);
            if (b10 != 0) {
                if (b10 != 2) {
                    throw b0.e();
                }
                d10 = this.f13223a.d() + this.f13223a.C();
                do {
                    list.add(Long.valueOf(this.f13223a.D()));
                } while (this.f13223a.d() < d10);
            }
            do {
                list.add(Long.valueOf(this.f13223a.D()));
                if (this.f13223a.e()) {
                    return;
                } else {
                    B = this.f13223a.B();
                }
            } while (B == this.f13224b);
            this.f13226d = B;
            return;
        }
        i0 i0Var = (i0) list;
        int b11 = t1.b(this.f13224b);
        if (b11 != 0) {
            if (b11 != 2) {
                throw b0.e();
            }
            d10 = this.f13223a.d() + this.f13223a.C();
            do {
                i0Var.k(this.f13223a.D());
            } while (this.f13223a.d() < d10);
        }
        do {
            i0Var.k(this.f13223a.D());
            if (this.f13223a.e()) {
                return;
            } else {
                B2 = this.f13223a.B();
            }
        } while (B2 == this.f13224b);
        this.f13226d = B2;
        return;
        X(d10);
    }

    @Override // com.google.protobuf.f1
    public int h() {
        Y(0);
        return this.f13223a.C();
    }

    @Override // com.google.protobuf.f1
    public void i(List<Long> list) {
        int B;
        int d10;
        int B2;
        if (!(list instanceof i0)) {
            int b10 = t1.b(this.f13224b);
            if (b10 != 0) {
                if (b10 != 2) {
                    throw b0.e();
                }
                d10 = this.f13223a.d() + this.f13223a.C();
                do {
                    list.add(Long.valueOf(this.f13223a.u()));
                } while (this.f13223a.d() < d10);
            }
            do {
                list.add(Long.valueOf(this.f13223a.u()));
                if (this.f13223a.e()) {
                    return;
                } else {
                    B = this.f13223a.B();
                }
            } while (B == this.f13224b);
            this.f13226d = B;
            return;
        }
        i0 i0Var = (i0) list;
        int b11 = t1.b(this.f13224b);
        if (b11 != 0) {
            if (b11 != 2) {
                throw b0.e();
            }
            d10 = this.f13223a.d() + this.f13223a.C();
            do {
                i0Var.k(this.f13223a.u());
            } while (this.f13223a.d() < d10);
        }
        do {
            i0Var.k(this.f13223a.u());
            if (this.f13223a.e()) {
                return;
            } else {
                B2 = this.f13223a.B();
            }
        } while (B2 == this.f13224b);
        this.f13226d = B2;
        return;
        X(d10);
    }

    @Override // com.google.protobuf.f1
    public void j(List<Integer> list) {
        int B;
        int d10;
        int B2;
        if (!(list instanceof y)) {
            int b10 = t1.b(this.f13224b);
            if (b10 != 0) {
                if (b10 != 2) {
                    throw b0.e();
                }
                d10 = this.f13223a.d() + this.f13223a.C();
                do {
                    list.add(Integer.valueOf(this.f13223a.p()));
                } while (this.f13223a.d() < d10);
            }
            do {
                list.add(Integer.valueOf(this.f13223a.p()));
                if (this.f13223a.e()) {
                    return;
                } else {
                    B = this.f13223a.B();
                }
            } while (B == this.f13224b);
            this.f13226d = B;
            return;
        }
        y yVar = (y) list;
        int b11 = t1.b(this.f13224b);
        if (b11 != 0) {
            if (b11 != 2) {
                throw b0.e();
            }
            d10 = this.f13223a.d() + this.f13223a.C();
            do {
                yVar.F0(this.f13223a.p());
            } while (this.f13223a.d() < d10);
        }
        do {
            yVar.F0(this.f13223a.p());
            if (this.f13223a.e()) {
                return;
            } else {
                B2 = this.f13223a.B();
            }
        } while (B2 == this.f13224b);
        this.f13226d = B2;
        return;
        X(d10);
    }

    @Override // com.google.protobuf.f1
    public int k() {
        Y(0);
        return this.f13223a.p();
    }

    @Override // com.google.protobuf.f1
    public int l() {
        Y(0);
        return this.f13223a.x();
    }

    @Override // com.google.protobuf.f1
    public void m(List<Boolean> list) {
        int B;
        int d10;
        int B2;
        if (!(list instanceof e)) {
            int b10 = t1.b(this.f13224b);
            if (b10 != 0) {
                if (b10 != 2) {
                    throw b0.e();
                }
                d10 = this.f13223a.d() + this.f13223a.C();
                do {
                    list.add(Boolean.valueOf(this.f13223a.m()));
                } while (this.f13223a.d() < d10);
            }
            do {
                list.add(Boolean.valueOf(this.f13223a.m()));
                if (this.f13223a.e()) {
                    return;
                } else {
                    B = this.f13223a.B();
                }
            } while (B == this.f13224b);
            this.f13226d = B;
            return;
        }
        e eVar = (e) list;
        int b11 = t1.b(this.f13224b);
        if (b11 != 0) {
            if (b11 != 2) {
                throw b0.e();
            }
            d10 = this.f13223a.d() + this.f13223a.C();
            do {
                eVar.k(this.f13223a.m());
            } while (this.f13223a.d() < d10);
        }
        do {
            eVar.k(this.f13223a.m());
            if (this.f13223a.e()) {
                return;
            } else {
                B2 = this.f13223a.B();
            }
        } while (B2 == this.f13224b);
        this.f13226d = B2;
        return;
        X(d10);
    }

    @Override // com.google.protobuf.f1
    public void n(List<String> list) {
        W(list, true);
    }

    @Override // com.google.protobuf.f1
    public g o() {
        Y(2);
        return this.f13223a.n();
    }

    @Override // com.google.protobuf.f1
    public int p() {
        Y(0);
        return this.f13223a.t();
    }

    @Override // com.google.protobuf.f1
    public void q(List<Long> list) {
        int B;
        int B2;
        if (!(list instanceof i0)) {
            int b10 = t1.b(this.f13224b);
            if (b10 != 1) {
                if (b10 != 2) {
                    throw b0.e();
                }
                int C = this.f13223a.C();
                a0(C);
                int d10 = this.f13223a.d() + C;
                do {
                    list.add(Long.valueOf(this.f13223a.r()));
                } while (this.f13223a.d() < d10);
                return;
            }
            do {
                list.add(Long.valueOf(this.f13223a.r()));
                if (this.f13223a.e()) {
                    return;
                } else {
                    B = this.f13223a.B();
                }
            } while (B == this.f13224b);
            this.f13226d = B;
            return;
        }
        i0 i0Var = (i0) list;
        int b11 = t1.b(this.f13224b);
        if (b11 != 1) {
            if (b11 != 2) {
                throw b0.e();
            }
            int C2 = this.f13223a.C();
            a0(C2);
            int d11 = this.f13223a.d() + C2;
            do {
                i0Var.k(this.f13223a.r());
            } while (this.f13223a.d() < d11);
            return;
        }
        do {
            i0Var.k(this.f13223a.r());
            if (this.f13223a.e()) {
                return;
            } else {
                B2 = this.f13223a.B();
            }
        } while (B2 == this.f13224b);
        this.f13226d = B2;
    }

    @Override // com.google.protobuf.f1
    public void r(List<Integer> list) {
        int B;
        int d10;
        int B2;
        if (!(list instanceof y)) {
            int b10 = t1.b(this.f13224b);
            if (b10 != 0) {
                if (b10 != 2) {
                    throw b0.e();
                }
                d10 = this.f13223a.d() + this.f13223a.C();
                do {
                    list.add(Integer.valueOf(this.f13223a.x()));
                } while (this.f13223a.d() < d10);
            }
            do {
                list.add(Integer.valueOf(this.f13223a.x()));
                if (this.f13223a.e()) {
                    return;
                } else {
                    B = this.f13223a.B();
                }
            } while (B == this.f13224b);
            this.f13226d = B;
            return;
        }
        y yVar = (y) list;
        int b11 = t1.b(this.f13224b);
        if (b11 != 0) {
            if (b11 != 2) {
                throw b0.e();
            }
            d10 = this.f13223a.d() + this.f13223a.C();
            do {
                yVar.F0(this.f13223a.x());
            } while (this.f13223a.d() < d10);
        }
        do {
            yVar.F0(this.f13223a.x());
            if (this.f13223a.e()) {
                return;
            } else {
                B2 = this.f13223a.B();
            }
        } while (B2 == this.f13224b);
        this.f13226d = B2;
        return;
        X(d10);
    }

    @Override // com.google.protobuf.f1
    public double readDouble() {
        Y(1);
        return this.f13223a.o();
    }

    @Override // com.google.protobuf.f1
    public float readFloat() {
        Y(5);
        return this.f13223a.s();
    }

    @Override // com.google.protobuf.f1
    public long s() {
        Y(0);
        return this.f13223a.D();
    }

    @Override // com.google.protobuf.f1
    public void t(List<Integer> list) {
        int B;
        int d10;
        int B2;
        if (!(list instanceof y)) {
            int b10 = t1.b(this.f13224b);
            if (b10 != 0) {
                if (b10 != 2) {
                    throw b0.e();
                }
                d10 = this.f13223a.d() + this.f13223a.C();
                do {
                    list.add(Integer.valueOf(this.f13223a.C()));
                } while (this.f13223a.d() < d10);
            }
            do {
                list.add(Integer.valueOf(this.f13223a.C()));
                if (this.f13223a.e()) {
                    return;
                } else {
                    B = this.f13223a.B();
                }
            } while (B == this.f13224b);
            this.f13226d = B;
            return;
        }
        y yVar = (y) list;
        int b11 = t1.b(this.f13224b);
        if (b11 != 0) {
            if (b11 != 2) {
                throw b0.e();
            }
            d10 = this.f13223a.d() + this.f13223a.C();
            do {
                yVar.F0(this.f13223a.C());
            } while (this.f13223a.d() < d10);
        }
        do {
            yVar.F0(this.f13223a.C());
            if (this.f13223a.e()) {
                return;
            } else {
                B2 = this.f13223a.B();
            }
        } while (B2 == this.f13224b);
        this.f13226d = B2;
        return;
        X(d10);
    }

    @Override // com.google.protobuf.f1
    public int u() {
        Y(5);
        return this.f13223a.q();
    }

    @Override // com.google.protobuf.f1
    public void v(List<Long> list) {
        int B;
        int B2;
        if (!(list instanceof i0)) {
            int b10 = t1.b(this.f13224b);
            if (b10 != 1) {
                if (b10 != 2) {
                    throw b0.e();
                }
                int C = this.f13223a.C();
                a0(C);
                int d10 = this.f13223a.d() + C;
                do {
                    list.add(Long.valueOf(this.f13223a.w()));
                } while (this.f13223a.d() < d10);
                return;
            }
            do {
                list.add(Long.valueOf(this.f13223a.w()));
                if (this.f13223a.e()) {
                    return;
                } else {
                    B = this.f13223a.B();
                }
            } while (B == this.f13224b);
            this.f13226d = B;
            return;
        }
        i0 i0Var = (i0) list;
        int b11 = t1.b(this.f13224b);
        if (b11 != 1) {
            if (b11 != 2) {
                throw b0.e();
            }
            int C2 = this.f13223a.C();
            a0(C2);
            int d11 = this.f13223a.d() + C2;
            do {
                i0Var.k(this.f13223a.w());
            } while (this.f13223a.d() < d11);
            return;
        }
        do {
            i0Var.k(this.f13223a.w());
            if (this.f13223a.e()) {
                return;
            } else {
                B2 = this.f13223a.B();
            }
        } while (B2 == this.f13224b);
        this.f13226d = B2;
    }

    @Override // com.google.protobuf.f1
    public void w(List<Integer> list) {
        int B;
        int d10;
        int B2;
        if (!(list instanceof y)) {
            int b10 = t1.b(this.f13224b);
            if (b10 != 0) {
                if (b10 != 2) {
                    throw b0.e();
                }
                d10 = this.f13223a.d() + this.f13223a.C();
                do {
                    list.add(Integer.valueOf(this.f13223a.t()));
                } while (this.f13223a.d() < d10);
            }
            do {
                list.add(Integer.valueOf(this.f13223a.t()));
                if (this.f13223a.e()) {
                    return;
                } else {
                    B = this.f13223a.B();
                }
            } while (B == this.f13224b);
            this.f13226d = B;
            return;
        }
        y yVar = (y) list;
        int b11 = t1.b(this.f13224b);
        if (b11 != 0) {
            if (b11 != 2) {
                throw b0.e();
            }
            d10 = this.f13223a.d() + this.f13223a.C();
            do {
                yVar.F0(this.f13223a.t());
            } while (this.f13223a.d() < d10);
        }
        do {
            yVar.F0(this.f13223a.t());
            if (this.f13223a.e()) {
                return;
            } else {
                B2 = this.f13223a.B();
            }
        } while (B2 == this.f13224b);
        this.f13226d = B2;
        return;
        X(d10);
    }

    @Override // com.google.protobuf.f1
    public void x(List<Integer> list) {
        int B;
        int B2;
        if (!(list instanceof y)) {
            int b10 = t1.b(this.f13224b);
            if (b10 == 2) {
                int C = this.f13223a.C();
                Z(C);
                int d10 = this.f13223a.d() + C;
                do {
                    list.add(Integer.valueOf(this.f13223a.q()));
                } while (this.f13223a.d() < d10);
                return;
            }
            if (b10 != 5) {
                throw b0.e();
            }
            do {
                list.add(Integer.valueOf(this.f13223a.q()));
                if (this.f13223a.e()) {
                    return;
                } else {
                    B = this.f13223a.B();
                }
            } while (B == this.f13224b);
            this.f13226d = B;
            return;
        }
        y yVar = (y) list;
        int b11 = t1.b(this.f13224b);
        if (b11 == 2) {
            int C2 = this.f13223a.C();
            Z(C2);
            int d11 = this.f13223a.d() + C2;
            do {
                yVar.F0(this.f13223a.q());
            } while (this.f13223a.d() < d11);
            return;
        }
        if (b11 != 5) {
            throw b0.e();
        }
        do {
            yVar.F0(this.f13223a.q());
            if (this.f13223a.e()) {
                return;
            } else {
                B2 = this.f13223a.B();
            }
        } while (B2 == this.f13224b);
        this.f13226d = B2;
    }

    @Override // com.google.protobuf.f1
    public long y() {
        Y(0);
        return this.f13223a.y();
    }

    @Override // com.google.protobuf.f1
    public String z() {
        Y(2);
        return this.f13223a.z();
    }
}

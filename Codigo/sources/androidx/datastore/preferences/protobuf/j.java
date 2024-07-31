package androidx.datastore.preferences.protobuf;

import androidx.datastore.preferences.protobuf.t1;
import com.google.android.gms.common.api.a;
import java.util.List;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public final class j implements f1 {

    /* renamed from: a, reason: collision with root package name */
    private final i f4164a;

    /* renamed from: b, reason: collision with root package name */
    private int f4165b;

    /* renamed from: c, reason: collision with root package name */
    private int f4166c;

    /* renamed from: d, reason: collision with root package name */
    private int f4167d = 0;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public static /* synthetic */ class a {

        /* renamed from: a, reason: collision with root package name */
        static final /* synthetic */ int[] f4168a;

        static {
            int[] iArr = new int[t1.b.values().length];
            f4168a = iArr;
            try {
                iArr[t1.b.BOOL.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f4168a[t1.b.BYTES.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f4168a[t1.b.DOUBLE.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f4168a[t1.b.ENUM.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f4168a[t1.b.FIXED32.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f4168a[t1.b.FIXED64.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f4168a[t1.b.FLOAT.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                f4168a[t1.b.INT32.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                f4168a[t1.b.INT64.ordinal()] = 9;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                f4168a[t1.b.MESSAGE.ordinal()] = 10;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                f4168a[t1.b.SFIXED32.ordinal()] = 11;
            } catch (NoSuchFieldError unused11) {
            }
            try {
                f4168a[t1.b.SFIXED64.ordinal()] = 12;
            } catch (NoSuchFieldError unused12) {
            }
            try {
                f4168a[t1.b.SINT32.ordinal()] = 13;
            } catch (NoSuchFieldError unused13) {
            }
            try {
                f4168a[t1.b.SINT64.ordinal()] = 14;
            } catch (NoSuchFieldError unused14) {
            }
            try {
                f4168a[t1.b.STRING.ordinal()] = 15;
            } catch (NoSuchFieldError unused15) {
            }
            try {
                f4168a[t1.b.UINT32.ordinal()] = 16;
            } catch (NoSuchFieldError unused16) {
            }
            try {
                f4168a[t1.b.UINT64.ordinal()] = 17;
            } catch (NoSuchFieldError unused17) {
            }
        }
    }

    private j(i iVar) {
        i iVar2 = (i) a0.b(iVar, "input");
        this.f4164a = iVar2;
        iVar2.f4138d = this;
    }

    public static j Q(i iVar) {
        j jVar = iVar.f4138d;
        return jVar != null ? jVar : new j(iVar);
    }

    private Object R(t1.b bVar, Class<?> cls, p pVar) {
        switch (a.f4168a[bVar.ordinal()]) {
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
                return M(cls, pVar);
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
                throw new RuntimeException("unsupported field type.");
        }
    }

    private <T> T S(g1<T> g1Var, p pVar) {
        int i10 = this.f4166c;
        this.f4166c = t1.c(t1.a(this.f4165b), 4);
        try {
            T e10 = g1Var.e();
            g1Var.h(e10, this, pVar);
            g1Var.b(e10);
            if (this.f4165b == this.f4166c) {
                return e10;
            }
            throw b0.g();
        } finally {
            this.f4166c = i10;
        }
    }

    private <T> T T(g1<T> g1Var, p pVar) {
        int C = this.f4164a.C();
        i iVar = this.f4164a;
        if (iVar.f4135a >= iVar.f4136b) {
            throw b0.h();
        }
        int l10 = iVar.l(C);
        T e10 = g1Var.e();
        this.f4164a.f4135a++;
        g1Var.h(e10, this, pVar);
        g1Var.b(e10);
        this.f4164a.a(0);
        r5.f4135a--;
        this.f4164a.k(l10);
        return e10;
    }

    private void V(int i10) {
        if (this.f4164a.d() != i10) {
            throw b0.k();
        }
    }

    private void W(int i10) {
        if (t1.b(this.f4165b) != i10) {
            throw b0.d();
        }
    }

    private void X(int i10) {
        if ((i10 & 3) != 0) {
            throw b0.g();
        }
    }

    private void Y(int i10) {
        if ((i10 & 7) != 0) {
            throw b0.g();
        }
    }

    @Override // androidx.datastore.preferences.protobuf.f1
    public int A() {
        int i10 = this.f4167d;
        if (i10 != 0) {
            this.f4165b = i10;
            this.f4167d = 0;
        } else {
            this.f4165b = this.f4164a.B();
        }
        int i11 = this.f4165b;
        return (i11 == 0 || i11 == this.f4166c) ? a.e.API_PRIORITY_OTHER : t1.a(i11);
    }

    @Override // androidx.datastore.preferences.protobuf.f1
    public void B(List<String> list) {
        U(list, false);
    }

    @Override // androidx.datastore.preferences.protobuf.f1
    public void C(List<Float> list) {
        int B;
        int B2;
        if (!(list instanceof w)) {
            int b10 = t1.b(this.f4165b);
            if (b10 == 2) {
                int C = this.f4164a.C();
                X(C);
                int d10 = this.f4164a.d() + C;
                do {
                    list.add(Float.valueOf(this.f4164a.s()));
                } while (this.f4164a.d() < d10);
                return;
            }
            if (b10 != 5) {
                throw b0.d();
            }
            do {
                list.add(Float.valueOf(this.f4164a.s()));
                if (this.f4164a.e()) {
                    return;
                } else {
                    B = this.f4164a.B();
                }
            } while (B == this.f4165b);
            this.f4167d = B;
            return;
        }
        w wVar = (w) list;
        int b11 = t1.b(this.f4165b);
        if (b11 == 2) {
            int C2 = this.f4164a.C();
            X(C2);
            int d11 = this.f4164a.d() + C2;
            do {
                wVar.h(this.f4164a.s());
            } while (this.f4164a.d() < d11);
            return;
        }
        if (b11 != 5) {
            throw b0.d();
        }
        do {
            wVar.h(this.f4164a.s());
            if (this.f4164a.e()) {
                return;
            } else {
                B2 = this.f4164a.B();
            }
        } while (B2 == this.f4165b);
        this.f4167d = B2;
    }

    @Override // androidx.datastore.preferences.protobuf.f1
    public boolean D() {
        int i10;
        if (this.f4164a.e() || (i10 = this.f4165b) == this.f4166c) {
            return false;
        }
        return this.f4164a.E(i10);
    }

    @Override // androidx.datastore.preferences.protobuf.f1
    public int E() {
        W(5);
        return this.f4164a.v();
    }

    @Override // androidx.datastore.preferences.protobuf.f1
    public void F(List<h> list) {
        int B;
        if (t1.b(this.f4165b) != 2) {
            throw b0.d();
        }
        do {
            list.add(o());
            if (this.f4164a.e()) {
                return;
            } else {
                B = this.f4164a.B();
            }
        } while (B == this.f4165b);
        this.f4167d = B;
    }

    @Override // androidx.datastore.preferences.protobuf.f1
    public void G(List<Double> list) {
        int B;
        int B2;
        if (!(list instanceof m)) {
            int b10 = t1.b(this.f4165b);
            if (b10 != 1) {
                if (b10 != 2) {
                    throw b0.d();
                }
                int C = this.f4164a.C();
                Y(C);
                int d10 = this.f4164a.d() + C;
                do {
                    list.add(Double.valueOf(this.f4164a.o()));
                } while (this.f4164a.d() < d10);
                return;
            }
            do {
                list.add(Double.valueOf(this.f4164a.o()));
                if (this.f4164a.e()) {
                    return;
                } else {
                    B = this.f4164a.B();
                }
            } while (B == this.f4165b);
            this.f4167d = B;
            return;
        }
        m mVar = (m) list;
        int b11 = t1.b(this.f4165b);
        if (b11 != 1) {
            if (b11 != 2) {
                throw b0.d();
            }
            int C2 = this.f4164a.C();
            Y(C2);
            int d11 = this.f4164a.d() + C2;
            do {
                mVar.h(this.f4164a.o());
            } while (this.f4164a.d() < d11);
            return;
        }
        do {
            mVar.h(this.f4164a.o());
            if (this.f4164a.e()) {
                return;
            } else {
                B2 = this.f4164a.B();
            }
        } while (B2 == this.f4165b);
        this.f4167d = B2;
    }

    @Override // androidx.datastore.preferences.protobuf.f1
    public long H() {
        W(0);
        return this.f4164a.u();
    }

    @Override // androidx.datastore.preferences.protobuf.f1
    public String I() {
        W(2);
        return this.f4164a.A();
    }

    @Override // androidx.datastore.preferences.protobuf.f1
    public <T> T J(g1<T> g1Var, p pVar) {
        W(2);
        return (T) T(g1Var, pVar);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // androidx.datastore.preferences.protobuf.f1
    public <T> void K(List<T> list, g1<T> g1Var, p pVar) {
        int B;
        if (t1.b(this.f4165b) != 2) {
            throw b0.d();
        }
        int i10 = this.f4165b;
        do {
            list.add(T(g1Var, pVar));
            if (this.f4164a.e() || this.f4167d != 0) {
                return;
            } else {
                B = this.f4164a.B();
            }
        } while (B == i10);
        this.f4167d = B;
    }

    @Override // androidx.datastore.preferences.protobuf.f1
    public <T> T L(g1<T> g1Var, p pVar) {
        W(3);
        return (T) S(g1Var, pVar);
    }

    @Override // androidx.datastore.preferences.protobuf.f1
    public <T> T M(Class<T> cls, p pVar) {
        W(2);
        return (T) T(c1.a().d(cls), pVar);
    }

    @Override // androidx.datastore.preferences.protobuf.f1
    public <T> T N(Class<T> cls, p pVar) {
        W(3);
        return (T) S(c1.a().d(cls), pVar);
    }

    /* JADX WARN: Code restructure failed: missing block: B:38:0x005c, code lost:
    
        r8.put(r2, r3);
     */
    /* JADX WARN: Code restructure failed: missing block: B:40:0x0064, code lost:
    
        return;
     */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // androidx.datastore.preferences.protobuf.f1
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public <K, V> void O(java.util.Map<K, V> r8, androidx.datastore.preferences.protobuf.k0.a<K, V> r9, androidx.datastore.preferences.protobuf.p r10) {
        /*
            r7 = this;
            r0 = 2
            r7.W(r0)
            androidx.datastore.preferences.protobuf.i r1 = r7.f4164a
            int r1 = r1.C()
            androidx.datastore.preferences.protobuf.i r2 = r7.f4164a
            int r1 = r2.l(r1)
            K r2 = r9.f4210b
            V r3 = r9.f4212d
        L14:
            int r4 = r7.A()     // Catch: java.lang.Throwable -> L65
            r5 = 2147483647(0x7fffffff, float:NaN)
            if (r4 == r5) goto L5c
            androidx.datastore.preferences.protobuf.i r5 = r7.f4164a     // Catch: java.lang.Throwable -> L65
            boolean r5 = r5.e()     // Catch: java.lang.Throwable -> L65
            if (r5 == 0) goto L26
            goto L5c
        L26:
            r5 = 1
            java.lang.String r6 = "Unable to parse map entry."
            if (r4 == r5) goto L47
            if (r4 == r0) goto L3a
            boolean r4 = r7.D()     // Catch: androidx.datastore.preferences.protobuf.b0.a -> L4f java.lang.Throwable -> L65
            if (r4 == 0) goto L34
            goto L14
        L34:
            androidx.datastore.preferences.protobuf.b0 r4 = new androidx.datastore.preferences.protobuf.b0     // Catch: androidx.datastore.preferences.protobuf.b0.a -> L4f java.lang.Throwable -> L65
            r4.<init>(r6)     // Catch: androidx.datastore.preferences.protobuf.b0.a -> L4f java.lang.Throwable -> L65
            throw r4     // Catch: androidx.datastore.preferences.protobuf.b0.a -> L4f java.lang.Throwable -> L65
        L3a:
            androidx.datastore.preferences.protobuf.t1$b r4 = r9.f4211c     // Catch: androidx.datastore.preferences.protobuf.b0.a -> L4f java.lang.Throwable -> L65
            V r5 = r9.f4212d     // Catch: androidx.datastore.preferences.protobuf.b0.a -> L4f java.lang.Throwable -> L65
            java.lang.Class r5 = r5.getClass()     // Catch: androidx.datastore.preferences.protobuf.b0.a -> L4f java.lang.Throwable -> L65
            java.lang.Object r3 = r7.R(r4, r5, r10)     // Catch: androidx.datastore.preferences.protobuf.b0.a -> L4f java.lang.Throwable -> L65
            goto L14
        L47:
            androidx.datastore.preferences.protobuf.t1$b r4 = r9.f4209a     // Catch: androidx.datastore.preferences.protobuf.b0.a -> L4f java.lang.Throwable -> L65
            r5 = 0
            java.lang.Object r2 = r7.R(r4, r5, r5)     // Catch: androidx.datastore.preferences.protobuf.b0.a -> L4f java.lang.Throwable -> L65
            goto L14
        L4f:
            boolean r4 = r7.D()     // Catch: java.lang.Throwable -> L65
            if (r4 == 0) goto L56
            goto L14
        L56:
            androidx.datastore.preferences.protobuf.b0 r8 = new androidx.datastore.preferences.protobuf.b0     // Catch: java.lang.Throwable -> L65
            r8.<init>(r6)     // Catch: java.lang.Throwable -> L65
            throw r8     // Catch: java.lang.Throwable -> L65
        L5c:
            r8.put(r2, r3)     // Catch: java.lang.Throwable -> L65
            androidx.datastore.preferences.protobuf.i r8 = r7.f4164a
            r8.k(r1)
            return
        L65:
            r8 = move-exception
            androidx.datastore.preferences.protobuf.i r9 = r7.f4164a
            r9.k(r1)
            throw r8
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.datastore.preferences.protobuf.j.O(java.util.Map, androidx.datastore.preferences.protobuf.k0$a, androidx.datastore.preferences.protobuf.p):void");
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // androidx.datastore.preferences.protobuf.f1
    public <T> void P(List<T> list, g1<T> g1Var, p pVar) {
        int B;
        if (t1.b(this.f4165b) != 3) {
            throw b0.d();
        }
        int i10 = this.f4165b;
        do {
            list.add(S(g1Var, pVar));
            if (this.f4164a.e() || this.f4167d != 0) {
                return;
            } else {
                B = this.f4164a.B();
            }
        } while (B == i10);
        this.f4167d = B;
    }

    public void U(List<String> list, boolean z10) {
        int B;
        int B2;
        if (t1.b(this.f4165b) != 2) {
            throw b0.d();
        }
        if (!(list instanceof g0) || z10) {
            do {
                list.add(z10 ? I() : z());
                if (this.f4164a.e()) {
                    return;
                } else {
                    B = this.f4164a.B();
                }
            } while (B == this.f4165b);
            this.f4167d = B;
            return;
        }
        g0 g0Var = (g0) list;
        do {
            g0Var.J0(o());
            if (this.f4164a.e()) {
                return;
            } else {
                B2 = this.f4164a.B();
            }
        } while (B2 == this.f4165b);
        this.f4167d = B2;
    }

    @Override // androidx.datastore.preferences.protobuf.f1
    public int a() {
        return this.f4165b;
    }

    @Override // androidx.datastore.preferences.protobuf.f1
    public long b() {
        W(1);
        return this.f4164a.r();
    }

    @Override // androidx.datastore.preferences.protobuf.f1
    public void c(List<Integer> list) {
        int B;
        int B2;
        if (!(list instanceof z)) {
            int b10 = t1.b(this.f4165b);
            if (b10 == 2) {
                int C = this.f4164a.C();
                X(C);
                int d10 = this.f4164a.d() + C;
                do {
                    list.add(Integer.valueOf(this.f4164a.v()));
                } while (this.f4164a.d() < d10);
                return;
            }
            if (b10 != 5) {
                throw b0.d();
            }
            do {
                list.add(Integer.valueOf(this.f4164a.v()));
                if (this.f4164a.e()) {
                    return;
                } else {
                    B = this.f4164a.B();
                }
            } while (B == this.f4165b);
            this.f4167d = B;
            return;
        }
        z zVar = (z) list;
        int b11 = t1.b(this.f4165b);
        if (b11 == 2) {
            int C2 = this.f4164a.C();
            X(C2);
            int d11 = this.f4164a.d() + C2;
            do {
                zVar.F0(this.f4164a.v());
            } while (this.f4164a.d() < d11);
            return;
        }
        if (b11 != 5) {
            throw b0.d();
        }
        do {
            zVar.F0(this.f4164a.v());
            if (this.f4164a.e()) {
                return;
            } else {
                B2 = this.f4164a.B();
            }
        } while (B2 == this.f4165b);
        this.f4167d = B2;
    }

    @Override // androidx.datastore.preferences.protobuf.f1
    public void d(List<Long> list) {
        int B;
        int d10;
        int B2;
        if (!(list instanceof i0)) {
            int b10 = t1.b(this.f4165b);
            if (b10 != 0) {
                if (b10 != 2) {
                    throw b0.d();
                }
                d10 = this.f4164a.d() + this.f4164a.C();
                do {
                    list.add(Long.valueOf(this.f4164a.y()));
                } while (this.f4164a.d() < d10);
            }
            do {
                list.add(Long.valueOf(this.f4164a.y()));
                if (this.f4164a.e()) {
                    return;
                } else {
                    B = this.f4164a.B();
                }
            } while (B == this.f4165b);
            this.f4167d = B;
            return;
        }
        i0 i0Var = (i0) list;
        int b11 = t1.b(this.f4165b);
        if (b11 != 0) {
            if (b11 != 2) {
                throw b0.d();
            }
            d10 = this.f4164a.d() + this.f4164a.C();
            do {
                i0Var.k(this.f4164a.y());
            } while (this.f4164a.d() < d10);
        }
        do {
            i0Var.k(this.f4164a.y());
            if (this.f4164a.e()) {
                return;
            } else {
                B2 = this.f4164a.B();
            }
        } while (B2 == this.f4165b);
        this.f4167d = B2;
        return;
        V(d10);
    }

    @Override // androidx.datastore.preferences.protobuf.f1
    public boolean e() {
        W(0);
        return this.f4164a.m();
    }

    @Override // androidx.datastore.preferences.protobuf.f1
    public long f() {
        W(1);
        return this.f4164a.w();
    }

    @Override // androidx.datastore.preferences.protobuf.f1
    public void g(List<Long> list) {
        int B;
        int d10;
        int B2;
        if (!(list instanceof i0)) {
            int b10 = t1.b(this.f4165b);
            if (b10 != 0) {
                if (b10 != 2) {
                    throw b0.d();
                }
                d10 = this.f4164a.d() + this.f4164a.C();
                do {
                    list.add(Long.valueOf(this.f4164a.D()));
                } while (this.f4164a.d() < d10);
            }
            do {
                list.add(Long.valueOf(this.f4164a.D()));
                if (this.f4164a.e()) {
                    return;
                } else {
                    B = this.f4164a.B();
                }
            } while (B == this.f4165b);
            this.f4167d = B;
            return;
        }
        i0 i0Var = (i0) list;
        int b11 = t1.b(this.f4165b);
        if (b11 != 0) {
            if (b11 != 2) {
                throw b0.d();
            }
            d10 = this.f4164a.d() + this.f4164a.C();
            do {
                i0Var.k(this.f4164a.D());
            } while (this.f4164a.d() < d10);
        }
        do {
            i0Var.k(this.f4164a.D());
            if (this.f4164a.e()) {
                return;
            } else {
                B2 = this.f4164a.B();
            }
        } while (B2 == this.f4165b);
        this.f4167d = B2;
        return;
        V(d10);
    }

    @Override // androidx.datastore.preferences.protobuf.f1
    public int h() {
        W(0);
        return this.f4164a.C();
    }

    @Override // androidx.datastore.preferences.protobuf.f1
    public void i(List<Long> list) {
        int B;
        int d10;
        int B2;
        if (!(list instanceof i0)) {
            int b10 = t1.b(this.f4165b);
            if (b10 != 0) {
                if (b10 != 2) {
                    throw b0.d();
                }
                d10 = this.f4164a.d() + this.f4164a.C();
                do {
                    list.add(Long.valueOf(this.f4164a.u()));
                } while (this.f4164a.d() < d10);
            }
            do {
                list.add(Long.valueOf(this.f4164a.u()));
                if (this.f4164a.e()) {
                    return;
                } else {
                    B = this.f4164a.B();
                }
            } while (B == this.f4165b);
            this.f4167d = B;
            return;
        }
        i0 i0Var = (i0) list;
        int b11 = t1.b(this.f4165b);
        if (b11 != 0) {
            if (b11 != 2) {
                throw b0.d();
            }
            d10 = this.f4164a.d() + this.f4164a.C();
            do {
                i0Var.k(this.f4164a.u());
            } while (this.f4164a.d() < d10);
        }
        do {
            i0Var.k(this.f4164a.u());
            if (this.f4164a.e()) {
                return;
            } else {
                B2 = this.f4164a.B();
            }
        } while (B2 == this.f4165b);
        this.f4167d = B2;
        return;
        V(d10);
    }

    @Override // androidx.datastore.preferences.protobuf.f1
    public void j(List<Integer> list) {
        int B;
        int d10;
        int B2;
        if (!(list instanceof z)) {
            int b10 = t1.b(this.f4165b);
            if (b10 != 0) {
                if (b10 != 2) {
                    throw b0.d();
                }
                d10 = this.f4164a.d() + this.f4164a.C();
                do {
                    list.add(Integer.valueOf(this.f4164a.p()));
                } while (this.f4164a.d() < d10);
            }
            do {
                list.add(Integer.valueOf(this.f4164a.p()));
                if (this.f4164a.e()) {
                    return;
                } else {
                    B = this.f4164a.B();
                }
            } while (B == this.f4165b);
            this.f4167d = B;
            return;
        }
        z zVar = (z) list;
        int b11 = t1.b(this.f4165b);
        if (b11 != 0) {
            if (b11 != 2) {
                throw b0.d();
            }
            d10 = this.f4164a.d() + this.f4164a.C();
            do {
                zVar.F0(this.f4164a.p());
            } while (this.f4164a.d() < d10);
        }
        do {
            zVar.F0(this.f4164a.p());
            if (this.f4164a.e()) {
                return;
            } else {
                B2 = this.f4164a.B();
            }
        } while (B2 == this.f4165b);
        this.f4167d = B2;
        return;
        V(d10);
    }

    @Override // androidx.datastore.preferences.protobuf.f1
    public int k() {
        W(0);
        return this.f4164a.p();
    }

    @Override // androidx.datastore.preferences.protobuf.f1
    public int l() {
        W(0);
        return this.f4164a.x();
    }

    @Override // androidx.datastore.preferences.protobuf.f1
    public void m(List<Boolean> list) {
        int B;
        int d10;
        int B2;
        if (!(list instanceof f)) {
            int b10 = t1.b(this.f4165b);
            if (b10 != 0) {
                if (b10 != 2) {
                    throw b0.d();
                }
                d10 = this.f4164a.d() + this.f4164a.C();
                do {
                    list.add(Boolean.valueOf(this.f4164a.m()));
                } while (this.f4164a.d() < d10);
            }
            do {
                list.add(Boolean.valueOf(this.f4164a.m()));
                if (this.f4164a.e()) {
                    return;
                } else {
                    B = this.f4164a.B();
                }
            } while (B == this.f4165b);
            this.f4167d = B;
            return;
        }
        f fVar = (f) list;
        int b11 = t1.b(this.f4165b);
        if (b11 != 0) {
            if (b11 != 2) {
                throw b0.d();
            }
            d10 = this.f4164a.d() + this.f4164a.C();
            do {
                fVar.k(this.f4164a.m());
            } while (this.f4164a.d() < d10);
        }
        do {
            fVar.k(this.f4164a.m());
            if (this.f4164a.e()) {
                return;
            } else {
                B2 = this.f4164a.B();
            }
        } while (B2 == this.f4165b);
        this.f4167d = B2;
        return;
        V(d10);
    }

    @Override // androidx.datastore.preferences.protobuf.f1
    public void n(List<String> list) {
        U(list, true);
    }

    @Override // androidx.datastore.preferences.protobuf.f1
    public h o() {
        W(2);
        return this.f4164a.n();
    }

    @Override // androidx.datastore.preferences.protobuf.f1
    public int p() {
        W(0);
        return this.f4164a.t();
    }

    @Override // androidx.datastore.preferences.protobuf.f1
    public void q(List<Long> list) {
        int B;
        int B2;
        if (!(list instanceof i0)) {
            int b10 = t1.b(this.f4165b);
            if (b10 != 1) {
                if (b10 != 2) {
                    throw b0.d();
                }
                int C = this.f4164a.C();
                Y(C);
                int d10 = this.f4164a.d() + C;
                do {
                    list.add(Long.valueOf(this.f4164a.r()));
                } while (this.f4164a.d() < d10);
                return;
            }
            do {
                list.add(Long.valueOf(this.f4164a.r()));
                if (this.f4164a.e()) {
                    return;
                } else {
                    B = this.f4164a.B();
                }
            } while (B == this.f4165b);
            this.f4167d = B;
            return;
        }
        i0 i0Var = (i0) list;
        int b11 = t1.b(this.f4165b);
        if (b11 != 1) {
            if (b11 != 2) {
                throw b0.d();
            }
            int C2 = this.f4164a.C();
            Y(C2);
            int d11 = this.f4164a.d() + C2;
            do {
                i0Var.k(this.f4164a.r());
            } while (this.f4164a.d() < d11);
            return;
        }
        do {
            i0Var.k(this.f4164a.r());
            if (this.f4164a.e()) {
                return;
            } else {
                B2 = this.f4164a.B();
            }
        } while (B2 == this.f4165b);
        this.f4167d = B2;
    }

    @Override // androidx.datastore.preferences.protobuf.f1
    public void r(List<Integer> list) {
        int B;
        int d10;
        int B2;
        if (!(list instanceof z)) {
            int b10 = t1.b(this.f4165b);
            if (b10 != 0) {
                if (b10 != 2) {
                    throw b0.d();
                }
                d10 = this.f4164a.d() + this.f4164a.C();
                do {
                    list.add(Integer.valueOf(this.f4164a.x()));
                } while (this.f4164a.d() < d10);
            }
            do {
                list.add(Integer.valueOf(this.f4164a.x()));
                if (this.f4164a.e()) {
                    return;
                } else {
                    B = this.f4164a.B();
                }
            } while (B == this.f4165b);
            this.f4167d = B;
            return;
        }
        z zVar = (z) list;
        int b11 = t1.b(this.f4165b);
        if (b11 != 0) {
            if (b11 != 2) {
                throw b0.d();
            }
            d10 = this.f4164a.d() + this.f4164a.C();
            do {
                zVar.F0(this.f4164a.x());
            } while (this.f4164a.d() < d10);
        }
        do {
            zVar.F0(this.f4164a.x());
            if (this.f4164a.e()) {
                return;
            } else {
                B2 = this.f4164a.B();
            }
        } while (B2 == this.f4165b);
        this.f4167d = B2;
        return;
        V(d10);
    }

    @Override // androidx.datastore.preferences.protobuf.f1
    public double readDouble() {
        W(1);
        return this.f4164a.o();
    }

    @Override // androidx.datastore.preferences.protobuf.f1
    public float readFloat() {
        W(5);
        return this.f4164a.s();
    }

    @Override // androidx.datastore.preferences.protobuf.f1
    public long s() {
        W(0);
        return this.f4164a.D();
    }

    @Override // androidx.datastore.preferences.protobuf.f1
    public void t(List<Integer> list) {
        int B;
        int d10;
        int B2;
        if (!(list instanceof z)) {
            int b10 = t1.b(this.f4165b);
            if (b10 != 0) {
                if (b10 != 2) {
                    throw b0.d();
                }
                d10 = this.f4164a.d() + this.f4164a.C();
                do {
                    list.add(Integer.valueOf(this.f4164a.C()));
                } while (this.f4164a.d() < d10);
            }
            do {
                list.add(Integer.valueOf(this.f4164a.C()));
                if (this.f4164a.e()) {
                    return;
                } else {
                    B = this.f4164a.B();
                }
            } while (B == this.f4165b);
            this.f4167d = B;
            return;
        }
        z zVar = (z) list;
        int b11 = t1.b(this.f4165b);
        if (b11 != 0) {
            if (b11 != 2) {
                throw b0.d();
            }
            d10 = this.f4164a.d() + this.f4164a.C();
            do {
                zVar.F0(this.f4164a.C());
            } while (this.f4164a.d() < d10);
        }
        do {
            zVar.F0(this.f4164a.C());
            if (this.f4164a.e()) {
                return;
            } else {
                B2 = this.f4164a.B();
            }
        } while (B2 == this.f4165b);
        this.f4167d = B2;
        return;
        V(d10);
    }

    @Override // androidx.datastore.preferences.protobuf.f1
    public int u() {
        W(5);
        return this.f4164a.q();
    }

    @Override // androidx.datastore.preferences.protobuf.f1
    public void v(List<Long> list) {
        int B;
        int B2;
        if (!(list instanceof i0)) {
            int b10 = t1.b(this.f4165b);
            if (b10 != 1) {
                if (b10 != 2) {
                    throw b0.d();
                }
                int C = this.f4164a.C();
                Y(C);
                int d10 = this.f4164a.d() + C;
                do {
                    list.add(Long.valueOf(this.f4164a.w()));
                } while (this.f4164a.d() < d10);
                return;
            }
            do {
                list.add(Long.valueOf(this.f4164a.w()));
                if (this.f4164a.e()) {
                    return;
                } else {
                    B = this.f4164a.B();
                }
            } while (B == this.f4165b);
            this.f4167d = B;
            return;
        }
        i0 i0Var = (i0) list;
        int b11 = t1.b(this.f4165b);
        if (b11 != 1) {
            if (b11 != 2) {
                throw b0.d();
            }
            int C2 = this.f4164a.C();
            Y(C2);
            int d11 = this.f4164a.d() + C2;
            do {
                i0Var.k(this.f4164a.w());
            } while (this.f4164a.d() < d11);
            return;
        }
        do {
            i0Var.k(this.f4164a.w());
            if (this.f4164a.e()) {
                return;
            } else {
                B2 = this.f4164a.B();
            }
        } while (B2 == this.f4165b);
        this.f4167d = B2;
    }

    @Override // androidx.datastore.preferences.protobuf.f1
    public void w(List<Integer> list) {
        int B;
        int d10;
        int B2;
        if (!(list instanceof z)) {
            int b10 = t1.b(this.f4165b);
            if (b10 != 0) {
                if (b10 != 2) {
                    throw b0.d();
                }
                d10 = this.f4164a.d() + this.f4164a.C();
                do {
                    list.add(Integer.valueOf(this.f4164a.t()));
                } while (this.f4164a.d() < d10);
            }
            do {
                list.add(Integer.valueOf(this.f4164a.t()));
                if (this.f4164a.e()) {
                    return;
                } else {
                    B = this.f4164a.B();
                }
            } while (B == this.f4165b);
            this.f4167d = B;
            return;
        }
        z zVar = (z) list;
        int b11 = t1.b(this.f4165b);
        if (b11 != 0) {
            if (b11 != 2) {
                throw b0.d();
            }
            d10 = this.f4164a.d() + this.f4164a.C();
            do {
                zVar.F0(this.f4164a.t());
            } while (this.f4164a.d() < d10);
        }
        do {
            zVar.F0(this.f4164a.t());
            if (this.f4164a.e()) {
                return;
            } else {
                B2 = this.f4164a.B();
            }
        } while (B2 == this.f4165b);
        this.f4167d = B2;
        return;
        V(d10);
    }

    @Override // androidx.datastore.preferences.protobuf.f1
    public void x(List<Integer> list) {
        int B;
        int B2;
        if (!(list instanceof z)) {
            int b10 = t1.b(this.f4165b);
            if (b10 == 2) {
                int C = this.f4164a.C();
                X(C);
                int d10 = this.f4164a.d() + C;
                do {
                    list.add(Integer.valueOf(this.f4164a.q()));
                } while (this.f4164a.d() < d10);
                return;
            }
            if (b10 != 5) {
                throw b0.d();
            }
            do {
                list.add(Integer.valueOf(this.f4164a.q()));
                if (this.f4164a.e()) {
                    return;
                } else {
                    B = this.f4164a.B();
                }
            } while (B == this.f4165b);
            this.f4167d = B;
            return;
        }
        z zVar = (z) list;
        int b11 = t1.b(this.f4165b);
        if (b11 == 2) {
            int C2 = this.f4164a.C();
            X(C2);
            int d11 = this.f4164a.d() + C2;
            do {
                zVar.F0(this.f4164a.q());
            } while (this.f4164a.d() < d11);
            return;
        }
        if (b11 != 5) {
            throw b0.d();
        }
        do {
            zVar.F0(this.f4164a.q());
            if (this.f4164a.e()) {
                return;
            } else {
                B2 = this.f4164a.B();
            }
        } while (B2 == this.f4165b);
        this.f4167d = B2;
    }

    @Override // androidx.datastore.preferences.protobuf.f1
    public long y() {
        W(0);
        return this.f4164a.y();
    }

    @Override // androidx.datastore.preferences.protobuf.f1
    public String z() {
        W(2);
        return this.f4164a.z();
    }
}

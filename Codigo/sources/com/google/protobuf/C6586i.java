package com.google.protobuf;

import com.google.android.gms.common.api.C5101a;
import com.google.protobuf.C6621t1;
import java.util.List;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: com.google.protobuf.i */
/* loaded from: classes2.dex */
public final class C6586i implements InterfaceC6579f1 {

    /* renamed from: a */
    private final AbstractC6583h f14497a;

    /* renamed from: b */
    private int f14498b;

    /* renamed from: c */
    private int f14499c;

    /* renamed from: d */
    private int f14500d = 0;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.google.protobuf.i$a */
    /* loaded from: classes2.dex */
    public static /* synthetic */ class a {

        /* renamed from: a */
        static final /* synthetic */ int[] f14501a;

        static {
            int[] iArr = new int[C6621t1.b.values().length];
            f14501a = iArr;
            try {
                iArr[C6621t1.b.BOOL.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f14501a[C6621t1.b.BYTES.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f14501a[C6621t1.b.DOUBLE.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f14501a[C6621t1.b.ENUM.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f14501a[C6621t1.b.FIXED32.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f14501a[C6621t1.b.FIXED64.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f14501a[C6621t1.b.FLOAT.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                f14501a[C6621t1.b.INT32.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                f14501a[C6621t1.b.INT64.ordinal()] = 9;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                f14501a[C6621t1.b.MESSAGE.ordinal()] = 10;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                f14501a[C6621t1.b.SFIXED32.ordinal()] = 11;
            } catch (NoSuchFieldError unused11) {
            }
            try {
                f14501a[C6621t1.b.SFIXED64.ordinal()] = 12;
            } catch (NoSuchFieldError unused12) {
            }
            try {
                f14501a[C6621t1.b.SINT32.ordinal()] = 13;
            } catch (NoSuchFieldError unused13) {
            }
            try {
                f14501a[C6621t1.b.SINT64.ordinal()] = 14;
            } catch (NoSuchFieldError unused14) {
            }
            try {
                f14501a[C6621t1.b.STRING.ordinal()] = 15;
            } catch (NoSuchFieldError unused15) {
            }
            try {
                f14501a[C6621t1.b.UINT32.ordinal()] = 16;
            } catch (NoSuchFieldError unused16) {
            }
            try {
                f14501a[C6621t1.b.UINT64.ordinal()] = 17;
            } catch (NoSuchFieldError unused17) {
            }
        }
    }

    private C6586i(AbstractC6583h abstractC6583h) {
        AbstractC6583h abstractC6583h2 = (AbstractC6583h) C6633z.m19348b(abstractC6583h, "input");
        this.f14497a = abstractC6583h2;
        abstractC6583h2.f14475d = this;
    }

    /* renamed from: Q */
    public static C6586i m18625Q(AbstractC6583h abstractC6583h) {
        C6586i c6586i = abstractC6583h.f14475d;
        return c6586i != null ? c6586i : new C6586i(abstractC6583h);
    }

    /* renamed from: R */
    private <T> void m18626R(T t10, InterfaceC6582g1<T> interfaceC6582g1, C6604o c6604o) {
        int i10 = this.f14499c;
        this.f14499c = C6621t1.m19190c(C6621t1.m19188a(this.f14498b), 4);
        try {
            interfaceC6582g1.mo18548i(t10, this, c6604o);
            if (this.f14498b == this.f14499c) {
            } else {
                throw C6566b0.m18403h();
            }
        } finally {
            this.f14499c = i10;
        }
    }

    /* renamed from: S */
    private <T> void m18627S(T t10, InterfaceC6582g1<T> interfaceC6582g1, C6604o c6604o) {
        int mo18558C = this.f14497a.mo18558C();
        AbstractC6583h abstractC6583h = this.f14497a;
        if (abstractC6583h.f14472a >= abstractC6583h.f14473b) {
            throw C6566b0.m18404i();
        }
        int mo18566l = abstractC6583h.mo18566l(mo18558C);
        this.f14497a.f14472a++;
        interfaceC6582g1.mo18548i(t10, this, c6604o);
        this.f14497a.mo18562a(0);
        r5.f14472a--;
        this.f14497a.mo18565k(mo18566l);
    }

    /* renamed from: T */
    private Object m18628T(C6621t1.b bVar, Class<?> cls, C6604o c6604o) {
        switch (a.f14501a[bVar.ordinal()]) {
            case 1:
                return Boolean.valueOf(mo18485e());
            case 2:
                return mo18495o();
            case 3:
                return Double.valueOf(readDouble());
            case 4:
                return Integer.valueOf(mo18491k());
            case 5:
                return Integer.valueOf(mo18501u());
            case 6:
                return Long.valueOf(mo18482b());
            case 7:
                return Float.valueOf(readFloat());
            case 8:
                return Integer.valueOf(mo18496p());
            case 9:
                return Long.valueOf(mo18472H());
            case 10:
                return mo18478N(cls, c6604o);
            case 11:
                return Integer.valueOf(mo18469E());
            case 12:
                return Long.valueOf(mo18486f());
            case 13:
                return Integer.valueOf(mo18492l());
            case 14:
                return Long.valueOf(mo18505y());
            case 15:
                return mo18473I();
            case 16:
                return Integer.valueOf(mo18488h());
            case 17:
                return Long.valueOf(mo18499s());
            default:
                throw new IllegalArgumentException("unsupported field type.");
        }
    }

    /* renamed from: U */
    private <T> T m18629U(InterfaceC6582g1<T> interfaceC6582g1, C6604o c6604o) {
        T mo18544e = interfaceC6582g1.mo18544e();
        m18626R(mo18544e, interfaceC6582g1, c6604o);
        interfaceC6582g1.mo18541b(mo18544e);
        return mo18544e;
    }

    /* renamed from: V */
    private <T> T m18630V(InterfaceC6582g1<T> interfaceC6582g1, C6604o c6604o) {
        T mo18544e = interfaceC6582g1.mo18544e();
        m18627S(mo18544e, interfaceC6582g1, c6604o);
        interfaceC6582g1.mo18541b(mo18544e);
        return mo18544e;
    }

    /* renamed from: X */
    private void m18631X(int i10) {
        if (this.f14497a.mo18563d() != i10) {
            throw C6566b0.m18406m();
        }
    }

    /* renamed from: Y */
    private void m18632Y(int i10) {
        if (C6621t1.m19189b(this.f14498b) != i10) {
            throw C6566b0.m18400e();
        }
    }

    /* renamed from: Z */
    private void m18633Z(int i10) {
        if ((i10 & 3) != 0) {
            throw C6566b0.m18403h();
        }
    }

    /* renamed from: a0 */
    private void m18634a0(int i10) {
        if ((i10 & 7) != 0) {
            throw C6566b0.m18403h();
        }
    }

    @Override // com.google.protobuf.InterfaceC6579f1
    /* renamed from: A */
    public int mo18465A() {
        int i10 = this.f14500d;
        if (i10 != 0) {
            this.f14498b = i10;
            this.f14500d = 0;
        } else {
            this.f14498b = this.f14497a.mo18557B();
        }
        int i11 = this.f14498b;
        return (i11 == 0 || i11 == this.f14499c) ? C5101a.e.API_PRIORITY_OTHER : C6621t1.m19188a(i11);
    }

    @Override // com.google.protobuf.InterfaceC6579f1
    /* renamed from: B */
    public void mo18466B(List<String> list) {
        m18635W(list, false);
    }

    @Override // com.google.protobuf.InterfaceC6579f1
    /* renamed from: C */
    public void mo18467C(List<Float> list) {
        int mo18557B;
        int mo18557B2;
        if (!(list instanceof C6625v)) {
            int m19189b = C6621t1.m19189b(this.f14498b);
            if (m19189b == 2) {
                int mo18558C = this.f14497a.mo18558C();
                m18633Z(mo18558C);
                int mo18563d = this.f14497a.mo18563d() + mo18558C;
                do {
                    list.add(Float.valueOf(this.f14497a.mo18573s()));
                } while (this.f14497a.mo18563d() < mo18563d);
                return;
            }
            if (m19189b != 5) {
                throw C6566b0.m18400e();
            }
            do {
                list.add(Float.valueOf(this.f14497a.mo18573s()));
                if (this.f14497a.mo18564e()) {
                    return;
                } else {
                    mo18557B = this.f14497a.mo18557B();
                }
            } while (mo18557B == this.f14498b);
            this.f14500d = mo18557B;
            return;
        }
        C6625v c6625v = (C6625v) list;
        int m19189b2 = C6621t1.m19189b(this.f14498b);
        if (m19189b2 == 2) {
            int mo18558C2 = this.f14497a.mo18558C();
            m18633Z(mo18558C2);
            int mo18563d2 = this.f14497a.mo18563d() + mo18558C2;
            do {
                c6625v.m19268h(this.f14497a.mo18573s());
            } while (this.f14497a.mo18563d() < mo18563d2);
            return;
        }
        if (m19189b2 != 5) {
            throw C6566b0.m18400e();
        }
        do {
            c6625v.m19268h(this.f14497a.mo18573s());
            if (this.f14497a.mo18564e()) {
                return;
            } else {
                mo18557B2 = this.f14497a.mo18557B();
            }
        } while (mo18557B2 == this.f14498b);
        this.f14500d = mo18557B2;
    }

    @Override // com.google.protobuf.InterfaceC6579f1
    /* renamed from: D */
    public boolean mo18468D() {
        int i10;
        if (this.f14497a.mo18564e() || (i10 = this.f14498b) == this.f14499c) {
            return false;
        }
        return this.f14497a.mo18561F(i10);
    }

    @Override // com.google.protobuf.InterfaceC6579f1
    /* renamed from: E */
    public int mo18469E() {
        m18632Y(5);
        return this.f14497a.mo18576v();
    }

    @Override // com.google.protobuf.InterfaceC6579f1
    /* renamed from: F */
    public void mo18470F(List<AbstractC6580g> list) {
        int mo18557B;
        if (C6621t1.m19189b(this.f14498b) != 2) {
            throw C6566b0.m18400e();
        }
        do {
            list.add(mo18495o());
            if (this.f14497a.mo18564e()) {
                return;
            } else {
                mo18557B = this.f14497a.mo18557B();
            }
        } while (mo18557B == this.f14498b);
        this.f14500d = mo18557B;
    }

    @Override // com.google.protobuf.InterfaceC6579f1
    /* renamed from: G */
    public void mo18471G(List<Double> list) {
        int mo18557B;
        int mo18557B2;
        if (!(list instanceof C6595l)) {
            int m19189b = C6621t1.m19189b(this.f14498b);
            if (m19189b != 1) {
                if (m19189b != 2) {
                    throw C6566b0.m18400e();
                }
                int mo18558C = this.f14497a.mo18558C();
                m18634a0(mo18558C);
                int mo18563d = this.f14497a.mo18563d() + mo18558C;
                do {
                    list.add(Double.valueOf(this.f14497a.mo18569o()));
                } while (this.f14497a.mo18563d() < mo18563d);
                return;
            }
            do {
                list.add(Double.valueOf(this.f14497a.mo18569o()));
                if (this.f14497a.mo18564e()) {
                    return;
                } else {
                    mo18557B = this.f14497a.mo18557B();
                }
            } while (mo18557B == this.f14498b);
            this.f14500d = mo18557B;
            return;
        }
        C6595l c6595l = (C6595l) list;
        int m19189b2 = C6621t1.m19189b(this.f14498b);
        if (m19189b2 != 1) {
            if (m19189b2 != 2) {
                throw C6566b0.m18400e();
            }
            int mo18558C2 = this.f14497a.mo18558C();
            m18634a0(mo18558C2);
            int mo18563d2 = this.f14497a.mo18563d() + mo18558C2;
            do {
                c6595l.m18917h(this.f14497a.mo18569o());
            } while (this.f14497a.mo18563d() < mo18563d2);
            return;
        }
        do {
            c6595l.m18917h(this.f14497a.mo18569o());
            if (this.f14497a.mo18564e()) {
                return;
            } else {
                mo18557B2 = this.f14497a.mo18557B();
            }
        } while (mo18557B2 == this.f14498b);
        this.f14500d = mo18557B2;
    }

    @Override // com.google.protobuf.InterfaceC6579f1
    /* renamed from: H */
    public long mo18472H() {
        m18632Y(0);
        return this.f14497a.mo18575u();
    }

    @Override // com.google.protobuf.InterfaceC6579f1
    /* renamed from: I */
    public String mo18473I() {
        m18632Y(2);
        return this.f14497a.mo18556A();
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.google.protobuf.InterfaceC6579f1
    @Deprecated
    /* renamed from: J */
    public <T> void mo18474J(List<T> list, InterfaceC6582g1<T> interfaceC6582g1, C6604o c6604o) {
        int mo18557B;
        if (C6621t1.m19189b(this.f14498b) != 3) {
            throw C6566b0.m18400e();
        }
        int i10 = this.f14498b;
        do {
            list.add(m18629U(interfaceC6582g1, c6604o));
            if (this.f14497a.mo18564e() || this.f14500d != 0) {
                return;
            } else {
                mo18557B = this.f14497a.mo18557B();
            }
        } while (mo18557B == i10);
        this.f14500d = mo18557B;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.google.protobuf.InterfaceC6579f1
    /* renamed from: K */
    public <T> void mo18475K(List<T> list, InterfaceC6582g1<T> interfaceC6582g1, C6604o c6604o) {
        int mo18557B;
        if (C6621t1.m19189b(this.f14498b) != 2) {
            throw C6566b0.m18400e();
        }
        int i10 = this.f14498b;
        do {
            list.add(m18630V(interfaceC6582g1, c6604o));
            if (this.f14497a.mo18564e() || this.f14500d != 0) {
                return;
            } else {
                mo18557B = this.f14497a.mo18557B();
            }
        } while (mo18557B == i10);
        this.f14500d = mo18557B;
    }

    @Override // com.google.protobuf.InterfaceC6579f1
    @Deprecated
    /* renamed from: L */
    public <T> T mo18476L(Class<T> cls, C6604o c6604o) {
        m18632Y(3);
        return (T) m18629U(C6570c1.m18416a().m18418c(cls), c6604o);
    }

    /* JADX WARN: Code restructure failed: missing block: B:38:0x005c, code lost:
    
        r8.put(r2, r3);
     */
    /* JADX WARN: Code restructure failed: missing block: B:40:0x0064, code lost:
    
        return;
     */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.google.protobuf.InterfaceC6579f1
    /* renamed from: M */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public <K, V> void mo18477M(java.util.Map<K, V> r8, com.google.protobuf.C6593k0.a<K, V> r9, com.google.protobuf.C6604o r10) {
        /*
            r7 = this;
            r0 = 2
            r7.m18632Y(r0)
            com.google.protobuf.h r1 = r7.f14497a
            int r1 = r1.mo18558C()
            com.google.protobuf.h r2 = r7.f14497a
            int r1 = r2.mo18566l(r1)
            K r2 = r9.f14552b
            V r3 = r9.f14554d
        L14:
            int r4 = r7.mo18465A()     // Catch: java.lang.Throwable -> L65
            r5 = 2147483647(0x7fffffff, float:NaN)
            if (r4 == r5) goto L5c
            com.google.protobuf.h r5 = r7.f14497a     // Catch: java.lang.Throwable -> L65
            boolean r5 = r5.mo18564e()     // Catch: java.lang.Throwable -> L65
            if (r5 == 0) goto L26
            goto L5c
        L26:
            r5 = 1
            java.lang.String r6 = "Unable to parse map entry."
            if (r4 == r5) goto L47
            if (r4 == r0) goto L3a
            boolean r4 = r7.mo18468D()     // Catch: com.google.protobuf.C6566b0.a -> L4f java.lang.Throwable -> L65
            if (r4 == 0) goto L34
            goto L14
        L34:
            com.google.protobuf.b0 r4 = new com.google.protobuf.b0     // Catch: com.google.protobuf.C6566b0.a -> L4f java.lang.Throwable -> L65
            r4.<init>(r6)     // Catch: com.google.protobuf.C6566b0.a -> L4f java.lang.Throwable -> L65
            throw r4     // Catch: com.google.protobuf.C6566b0.a -> L4f java.lang.Throwable -> L65
        L3a:
            com.google.protobuf.t1$b r4 = r9.f14553c     // Catch: com.google.protobuf.C6566b0.a -> L4f java.lang.Throwable -> L65
            V r5 = r9.f14554d     // Catch: com.google.protobuf.C6566b0.a -> L4f java.lang.Throwable -> L65
            java.lang.Class r5 = r5.getClass()     // Catch: com.google.protobuf.C6566b0.a -> L4f java.lang.Throwable -> L65
            java.lang.Object r3 = r7.m18628T(r4, r5, r10)     // Catch: com.google.protobuf.C6566b0.a -> L4f java.lang.Throwable -> L65
            goto L14
        L47:
            com.google.protobuf.t1$b r4 = r9.f14551a     // Catch: com.google.protobuf.C6566b0.a -> L4f java.lang.Throwable -> L65
            r5 = 0
            java.lang.Object r2 = r7.m18628T(r4, r5, r5)     // Catch: com.google.protobuf.C6566b0.a -> L4f java.lang.Throwable -> L65
            goto L14
        L4f:
            boolean r4 = r7.mo18468D()     // Catch: java.lang.Throwable -> L65
            if (r4 == 0) goto L56
            goto L14
        L56:
            com.google.protobuf.b0 r8 = new com.google.protobuf.b0     // Catch: java.lang.Throwable -> L65
            r8.<init>(r6)     // Catch: java.lang.Throwable -> L65
            throw r8     // Catch: java.lang.Throwable -> L65
        L5c:
            r8.put(r2, r3)     // Catch: java.lang.Throwable -> L65
            com.google.protobuf.h r8 = r7.f14497a
            r8.mo18565k(r1)
            return
        L65:
            r8 = move-exception
            com.google.protobuf.h r9 = r7.f14497a
            r9.mo18565k(r1)
            throw r8
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.protobuf.C6586i.mo18477M(java.util.Map, com.google.protobuf.k0$a, com.google.protobuf.o):void");
    }

    @Override // com.google.protobuf.InterfaceC6579f1
    /* renamed from: N */
    public <T> T mo18478N(Class<T> cls, C6604o c6604o) {
        m18632Y(2);
        return (T) m18630V(C6570c1.m18416a().m18418c(cls), c6604o);
    }

    @Override // com.google.protobuf.InterfaceC6579f1
    /* renamed from: O */
    public <T> void mo18479O(T t10, InterfaceC6582g1<T> interfaceC6582g1, C6604o c6604o) {
        m18632Y(3);
        m18626R(t10, interfaceC6582g1, c6604o);
    }

    @Override // com.google.protobuf.InterfaceC6579f1
    /* renamed from: P */
    public <T> void mo18480P(T t10, InterfaceC6582g1<T> interfaceC6582g1, C6604o c6604o) {
        m18632Y(2);
        m18627S(t10, interfaceC6582g1, c6604o);
    }

    /* renamed from: W */
    public void m18635W(List<String> list, boolean z10) {
        int mo18557B;
        int mo18557B2;
        if (C6621t1.m19189b(this.f14498b) != 2) {
            throw C6566b0.m18400e();
        }
        if (!(list instanceof InterfaceC6581g0) || z10) {
            do {
                list.add(z10 ? mo18473I() : mo18506z());
                if (this.f14497a.mo18564e()) {
                    return;
                } else {
                    mo18557B = this.f14497a.mo18557B();
                }
            } while (mo18557B == this.f14498b);
            this.f14500d = mo18557B;
            return;
        }
        InterfaceC6581g0 interfaceC6581g0 = (InterfaceC6581g0) list;
        do {
            interfaceC6581g0.mo18456B(mo18495o());
            if (this.f14497a.mo18564e()) {
                return;
            } else {
                mo18557B2 = this.f14497a.mo18557B();
            }
        } while (mo18557B2 == this.f14498b);
        this.f14500d = mo18557B2;
    }

    @Override // com.google.protobuf.InterfaceC6579f1
    /* renamed from: a */
    public int mo18481a() {
        return this.f14498b;
    }

    @Override // com.google.protobuf.InterfaceC6579f1
    /* renamed from: b */
    public long mo18482b() {
        m18632Y(1);
        return this.f14497a.mo18572r();
    }

    @Override // com.google.protobuf.InterfaceC6579f1
    /* renamed from: c */
    public void mo18483c(List<Integer> list) {
        int mo18557B;
        int mo18557B2;
        if (!(list instanceof C6631y)) {
            int m19189b = C6621t1.m19189b(this.f14498b);
            if (m19189b == 2) {
                int mo18558C = this.f14497a.mo18558C();
                m18633Z(mo18558C);
                int mo18563d = this.f14497a.mo18563d() + mo18558C;
                do {
                    list.add(Integer.valueOf(this.f14497a.mo18576v()));
                } while (this.f14497a.mo18563d() < mo18563d);
                return;
            }
            if (m19189b != 5) {
                throw C6566b0.m18400e();
            }
            do {
                list.add(Integer.valueOf(this.f14497a.mo18576v()));
                if (this.f14497a.mo18564e()) {
                    return;
                } else {
                    mo18557B = this.f14497a.mo18557B();
                }
            } while (mo18557B == this.f14498b);
            this.f14500d = mo18557B;
            return;
        }
        C6631y c6631y = (C6631y) list;
        int m19189b2 = C6621t1.m19189b(this.f14498b);
        if (m19189b2 == 2) {
            int mo18558C2 = this.f14497a.mo18558C();
            m18633Z(mo18558C2);
            int mo18563d2 = this.f14497a.mo18563d() + mo18558C2;
            do {
                c6631y.mo19337F0(this.f14497a.mo18576v());
            } while (this.f14497a.mo18563d() < mo18563d2);
            return;
        }
        if (m19189b2 != 5) {
            throw C6566b0.m18400e();
        }
        do {
            c6631y.mo19337F0(this.f14497a.mo18576v());
            if (this.f14497a.mo18564e()) {
                return;
            } else {
                mo18557B2 = this.f14497a.mo18557B();
            }
        } while (mo18557B2 == this.f14498b);
        this.f14500d = mo18557B2;
    }

    @Override // com.google.protobuf.InterfaceC6579f1
    /* renamed from: d */
    public void mo18484d(List<Long> list) {
        int mo18557B;
        int mo18563d;
        int mo18557B2;
        if (!(list instanceof C6587i0)) {
            int m19189b = C6621t1.m19189b(this.f14498b);
            if (m19189b != 0) {
                if (m19189b != 2) {
                    throw C6566b0.m18400e();
                }
                mo18563d = this.f14497a.mo18563d() + this.f14497a.mo18558C();
                do {
                    list.add(Long.valueOf(this.f14497a.mo18579y()));
                } while (this.f14497a.mo18563d() < mo18563d);
            }
            do {
                list.add(Long.valueOf(this.f14497a.mo18579y()));
                if (this.f14497a.mo18564e()) {
                    return;
                } else {
                    mo18557B = this.f14497a.mo18557B();
                }
            } while (mo18557B == this.f14498b);
            this.f14500d = mo18557B;
            return;
        }
        C6587i0 c6587i0 = (C6587i0) list;
        int m19189b2 = C6621t1.m19189b(this.f14498b);
        if (m19189b2 != 0) {
            if (m19189b2 != 2) {
                throw C6566b0.m18400e();
            }
            mo18563d = this.f14497a.mo18563d() + this.f14497a.mo18558C();
            do {
                c6587i0.m18641k(this.f14497a.mo18579y());
            } while (this.f14497a.mo18563d() < mo18563d);
        }
        do {
            c6587i0.m18641k(this.f14497a.mo18579y());
            if (this.f14497a.mo18564e()) {
                return;
            } else {
                mo18557B2 = this.f14497a.mo18557B();
            }
        } while (mo18557B2 == this.f14498b);
        this.f14500d = mo18557B2;
        return;
        m18631X(mo18563d);
    }

    @Override // com.google.protobuf.InterfaceC6579f1
    /* renamed from: e */
    public boolean mo18485e() {
        m18632Y(0);
        return this.f14497a.mo18567m();
    }

    @Override // com.google.protobuf.InterfaceC6579f1
    /* renamed from: f */
    public long mo18486f() {
        m18632Y(1);
        return this.f14497a.mo18577w();
    }

    @Override // com.google.protobuf.InterfaceC6579f1
    /* renamed from: g */
    public void mo18487g(List<Long> list) {
        int mo18557B;
        int mo18563d;
        int mo18557B2;
        if (!(list instanceof C6587i0)) {
            int m19189b = C6621t1.m19189b(this.f14498b);
            if (m19189b != 0) {
                if (m19189b != 2) {
                    throw C6566b0.m18400e();
                }
                mo18563d = this.f14497a.mo18563d() + this.f14497a.mo18558C();
                do {
                    list.add(Long.valueOf(this.f14497a.mo18559D()));
                } while (this.f14497a.mo18563d() < mo18563d);
            }
            do {
                list.add(Long.valueOf(this.f14497a.mo18559D()));
                if (this.f14497a.mo18564e()) {
                    return;
                } else {
                    mo18557B = this.f14497a.mo18557B();
                }
            } while (mo18557B == this.f14498b);
            this.f14500d = mo18557B;
            return;
        }
        C6587i0 c6587i0 = (C6587i0) list;
        int m19189b2 = C6621t1.m19189b(this.f14498b);
        if (m19189b2 != 0) {
            if (m19189b2 != 2) {
                throw C6566b0.m18400e();
            }
            mo18563d = this.f14497a.mo18563d() + this.f14497a.mo18558C();
            do {
                c6587i0.m18641k(this.f14497a.mo18559D());
            } while (this.f14497a.mo18563d() < mo18563d);
        }
        do {
            c6587i0.m18641k(this.f14497a.mo18559D());
            if (this.f14497a.mo18564e()) {
                return;
            } else {
                mo18557B2 = this.f14497a.mo18557B();
            }
        } while (mo18557B2 == this.f14498b);
        this.f14500d = mo18557B2;
        return;
        m18631X(mo18563d);
    }

    @Override // com.google.protobuf.InterfaceC6579f1
    /* renamed from: h */
    public int mo18488h() {
        m18632Y(0);
        return this.f14497a.mo18558C();
    }

    @Override // com.google.protobuf.InterfaceC6579f1
    /* renamed from: i */
    public void mo18489i(List<Long> list) {
        int mo18557B;
        int mo18563d;
        int mo18557B2;
        if (!(list instanceof C6587i0)) {
            int m19189b = C6621t1.m19189b(this.f14498b);
            if (m19189b != 0) {
                if (m19189b != 2) {
                    throw C6566b0.m18400e();
                }
                mo18563d = this.f14497a.mo18563d() + this.f14497a.mo18558C();
                do {
                    list.add(Long.valueOf(this.f14497a.mo18575u()));
                } while (this.f14497a.mo18563d() < mo18563d);
            }
            do {
                list.add(Long.valueOf(this.f14497a.mo18575u()));
                if (this.f14497a.mo18564e()) {
                    return;
                } else {
                    mo18557B = this.f14497a.mo18557B();
                }
            } while (mo18557B == this.f14498b);
            this.f14500d = mo18557B;
            return;
        }
        C6587i0 c6587i0 = (C6587i0) list;
        int m19189b2 = C6621t1.m19189b(this.f14498b);
        if (m19189b2 != 0) {
            if (m19189b2 != 2) {
                throw C6566b0.m18400e();
            }
            mo18563d = this.f14497a.mo18563d() + this.f14497a.mo18558C();
            do {
                c6587i0.m18641k(this.f14497a.mo18575u());
            } while (this.f14497a.mo18563d() < mo18563d);
        }
        do {
            c6587i0.m18641k(this.f14497a.mo18575u());
            if (this.f14497a.mo18564e()) {
                return;
            } else {
                mo18557B2 = this.f14497a.mo18557B();
            }
        } while (mo18557B2 == this.f14498b);
        this.f14500d = mo18557B2;
        return;
        m18631X(mo18563d);
    }

    @Override // com.google.protobuf.InterfaceC6579f1
    /* renamed from: j */
    public void mo18490j(List<Integer> list) {
        int mo18557B;
        int mo18563d;
        int mo18557B2;
        if (!(list instanceof C6631y)) {
            int m19189b = C6621t1.m19189b(this.f14498b);
            if (m19189b != 0) {
                if (m19189b != 2) {
                    throw C6566b0.m18400e();
                }
                mo18563d = this.f14497a.mo18563d() + this.f14497a.mo18558C();
                do {
                    list.add(Integer.valueOf(this.f14497a.mo18570p()));
                } while (this.f14497a.mo18563d() < mo18563d);
            }
            do {
                list.add(Integer.valueOf(this.f14497a.mo18570p()));
                if (this.f14497a.mo18564e()) {
                    return;
                } else {
                    mo18557B = this.f14497a.mo18557B();
                }
            } while (mo18557B == this.f14498b);
            this.f14500d = mo18557B;
            return;
        }
        C6631y c6631y = (C6631y) list;
        int m19189b2 = C6621t1.m19189b(this.f14498b);
        if (m19189b2 != 0) {
            if (m19189b2 != 2) {
                throw C6566b0.m18400e();
            }
            mo18563d = this.f14497a.mo18563d() + this.f14497a.mo18558C();
            do {
                c6631y.mo19337F0(this.f14497a.mo18570p());
            } while (this.f14497a.mo18563d() < mo18563d);
        }
        do {
            c6631y.mo19337F0(this.f14497a.mo18570p());
            if (this.f14497a.mo18564e()) {
                return;
            } else {
                mo18557B2 = this.f14497a.mo18557B();
            }
        } while (mo18557B2 == this.f14498b);
        this.f14500d = mo18557B2;
        return;
        m18631X(mo18563d);
    }

    @Override // com.google.protobuf.InterfaceC6579f1
    /* renamed from: k */
    public int mo18491k() {
        m18632Y(0);
        return this.f14497a.mo18570p();
    }

    @Override // com.google.protobuf.InterfaceC6579f1
    /* renamed from: l */
    public int mo18492l() {
        m18632Y(0);
        return this.f14497a.mo18578x();
    }

    @Override // com.google.protobuf.InterfaceC6579f1
    /* renamed from: m */
    public void mo18493m(List<Boolean> list) {
        int mo18557B;
        int mo18563d;
        int mo18557B2;
        if (!(list instanceof C6574e)) {
            int m19189b = C6621t1.m19189b(this.f14498b);
            if (m19189b != 0) {
                if (m19189b != 2) {
                    throw C6566b0.m18400e();
                }
                mo18563d = this.f14497a.mo18563d() + this.f14497a.mo18558C();
                do {
                    list.add(Boolean.valueOf(this.f14497a.mo18567m()));
                } while (this.f14497a.mo18563d() < mo18563d);
            }
            do {
                list.add(Boolean.valueOf(this.f14497a.mo18567m()));
                if (this.f14497a.mo18564e()) {
                    return;
                } else {
                    mo18557B = this.f14497a.mo18557B();
                }
            } while (mo18557B == this.f14498b);
            this.f14500d = mo18557B;
            return;
        }
        C6574e c6574e = (C6574e) list;
        int m19189b2 = C6621t1.m19189b(this.f14498b);
        if (m19189b2 != 0) {
            if (m19189b2 != 2) {
                throw C6566b0.m18400e();
            }
            mo18563d = this.f14497a.mo18563d() + this.f14497a.mo18558C();
            do {
                c6574e.m18437k(this.f14497a.mo18567m());
            } while (this.f14497a.mo18563d() < mo18563d);
        }
        do {
            c6574e.m18437k(this.f14497a.mo18567m());
            if (this.f14497a.mo18564e()) {
                return;
            } else {
                mo18557B2 = this.f14497a.mo18557B();
            }
        } while (mo18557B2 == this.f14498b);
        this.f14500d = mo18557B2;
        return;
        m18631X(mo18563d);
    }

    @Override // com.google.protobuf.InterfaceC6579f1
    /* renamed from: n */
    public void mo18494n(List<String> list) {
        m18635W(list, true);
    }

    @Override // com.google.protobuf.InterfaceC6579f1
    /* renamed from: o */
    public AbstractC6580g mo18495o() {
        m18632Y(2);
        return this.f14497a.mo18568n();
    }

    @Override // com.google.protobuf.InterfaceC6579f1
    /* renamed from: p */
    public int mo18496p() {
        m18632Y(0);
        return this.f14497a.mo18574t();
    }

    @Override // com.google.protobuf.InterfaceC6579f1
    /* renamed from: q */
    public void mo18497q(List<Long> list) {
        int mo18557B;
        int mo18557B2;
        if (!(list instanceof C6587i0)) {
            int m19189b = C6621t1.m19189b(this.f14498b);
            if (m19189b != 1) {
                if (m19189b != 2) {
                    throw C6566b0.m18400e();
                }
                int mo18558C = this.f14497a.mo18558C();
                m18634a0(mo18558C);
                int mo18563d = this.f14497a.mo18563d() + mo18558C;
                do {
                    list.add(Long.valueOf(this.f14497a.mo18572r()));
                } while (this.f14497a.mo18563d() < mo18563d);
                return;
            }
            do {
                list.add(Long.valueOf(this.f14497a.mo18572r()));
                if (this.f14497a.mo18564e()) {
                    return;
                } else {
                    mo18557B = this.f14497a.mo18557B();
                }
            } while (mo18557B == this.f14498b);
            this.f14500d = mo18557B;
            return;
        }
        C6587i0 c6587i0 = (C6587i0) list;
        int m19189b2 = C6621t1.m19189b(this.f14498b);
        if (m19189b2 != 1) {
            if (m19189b2 != 2) {
                throw C6566b0.m18400e();
            }
            int mo18558C2 = this.f14497a.mo18558C();
            m18634a0(mo18558C2);
            int mo18563d2 = this.f14497a.mo18563d() + mo18558C2;
            do {
                c6587i0.m18641k(this.f14497a.mo18572r());
            } while (this.f14497a.mo18563d() < mo18563d2);
            return;
        }
        do {
            c6587i0.m18641k(this.f14497a.mo18572r());
            if (this.f14497a.mo18564e()) {
                return;
            } else {
                mo18557B2 = this.f14497a.mo18557B();
            }
        } while (mo18557B2 == this.f14498b);
        this.f14500d = mo18557B2;
    }

    @Override // com.google.protobuf.InterfaceC6579f1
    /* renamed from: r */
    public void mo18498r(List<Integer> list) {
        int mo18557B;
        int mo18563d;
        int mo18557B2;
        if (!(list instanceof C6631y)) {
            int m19189b = C6621t1.m19189b(this.f14498b);
            if (m19189b != 0) {
                if (m19189b != 2) {
                    throw C6566b0.m18400e();
                }
                mo18563d = this.f14497a.mo18563d() + this.f14497a.mo18558C();
                do {
                    list.add(Integer.valueOf(this.f14497a.mo18578x()));
                } while (this.f14497a.mo18563d() < mo18563d);
            }
            do {
                list.add(Integer.valueOf(this.f14497a.mo18578x()));
                if (this.f14497a.mo18564e()) {
                    return;
                } else {
                    mo18557B = this.f14497a.mo18557B();
                }
            } while (mo18557B == this.f14498b);
            this.f14500d = mo18557B;
            return;
        }
        C6631y c6631y = (C6631y) list;
        int m19189b2 = C6621t1.m19189b(this.f14498b);
        if (m19189b2 != 0) {
            if (m19189b2 != 2) {
                throw C6566b0.m18400e();
            }
            mo18563d = this.f14497a.mo18563d() + this.f14497a.mo18558C();
            do {
                c6631y.mo19337F0(this.f14497a.mo18578x());
            } while (this.f14497a.mo18563d() < mo18563d);
        }
        do {
            c6631y.mo19337F0(this.f14497a.mo18578x());
            if (this.f14497a.mo18564e()) {
                return;
            } else {
                mo18557B2 = this.f14497a.mo18557B();
            }
        } while (mo18557B2 == this.f14498b);
        this.f14500d = mo18557B2;
        return;
        m18631X(mo18563d);
    }

    @Override // com.google.protobuf.InterfaceC6579f1
    public double readDouble() {
        m18632Y(1);
        return this.f14497a.mo18569o();
    }

    @Override // com.google.protobuf.InterfaceC6579f1
    public float readFloat() {
        m18632Y(5);
        return this.f14497a.mo18573s();
    }

    @Override // com.google.protobuf.InterfaceC6579f1
    /* renamed from: s */
    public long mo18499s() {
        m18632Y(0);
        return this.f14497a.mo18559D();
    }

    @Override // com.google.protobuf.InterfaceC6579f1
    /* renamed from: t */
    public void mo18500t(List<Integer> list) {
        int mo18557B;
        int mo18563d;
        int mo18557B2;
        if (!(list instanceof C6631y)) {
            int m19189b = C6621t1.m19189b(this.f14498b);
            if (m19189b != 0) {
                if (m19189b != 2) {
                    throw C6566b0.m18400e();
                }
                mo18563d = this.f14497a.mo18563d() + this.f14497a.mo18558C();
                do {
                    list.add(Integer.valueOf(this.f14497a.mo18558C()));
                } while (this.f14497a.mo18563d() < mo18563d);
            }
            do {
                list.add(Integer.valueOf(this.f14497a.mo18558C()));
                if (this.f14497a.mo18564e()) {
                    return;
                } else {
                    mo18557B = this.f14497a.mo18557B();
                }
            } while (mo18557B == this.f14498b);
            this.f14500d = mo18557B;
            return;
        }
        C6631y c6631y = (C6631y) list;
        int m19189b2 = C6621t1.m19189b(this.f14498b);
        if (m19189b2 != 0) {
            if (m19189b2 != 2) {
                throw C6566b0.m18400e();
            }
            mo18563d = this.f14497a.mo18563d() + this.f14497a.mo18558C();
            do {
                c6631y.mo19337F0(this.f14497a.mo18558C());
            } while (this.f14497a.mo18563d() < mo18563d);
        }
        do {
            c6631y.mo19337F0(this.f14497a.mo18558C());
            if (this.f14497a.mo18564e()) {
                return;
            } else {
                mo18557B2 = this.f14497a.mo18557B();
            }
        } while (mo18557B2 == this.f14498b);
        this.f14500d = mo18557B2;
        return;
        m18631X(mo18563d);
    }

    @Override // com.google.protobuf.InterfaceC6579f1
    /* renamed from: u */
    public int mo18501u() {
        m18632Y(5);
        return this.f14497a.mo18571q();
    }

    @Override // com.google.protobuf.InterfaceC6579f1
    /* renamed from: v */
    public void mo18502v(List<Long> list) {
        int mo18557B;
        int mo18557B2;
        if (!(list instanceof C6587i0)) {
            int m19189b = C6621t1.m19189b(this.f14498b);
            if (m19189b != 1) {
                if (m19189b != 2) {
                    throw C6566b0.m18400e();
                }
                int mo18558C = this.f14497a.mo18558C();
                m18634a0(mo18558C);
                int mo18563d = this.f14497a.mo18563d() + mo18558C;
                do {
                    list.add(Long.valueOf(this.f14497a.mo18577w()));
                } while (this.f14497a.mo18563d() < mo18563d);
                return;
            }
            do {
                list.add(Long.valueOf(this.f14497a.mo18577w()));
                if (this.f14497a.mo18564e()) {
                    return;
                } else {
                    mo18557B = this.f14497a.mo18557B();
                }
            } while (mo18557B == this.f14498b);
            this.f14500d = mo18557B;
            return;
        }
        C6587i0 c6587i0 = (C6587i0) list;
        int m19189b2 = C6621t1.m19189b(this.f14498b);
        if (m19189b2 != 1) {
            if (m19189b2 != 2) {
                throw C6566b0.m18400e();
            }
            int mo18558C2 = this.f14497a.mo18558C();
            m18634a0(mo18558C2);
            int mo18563d2 = this.f14497a.mo18563d() + mo18558C2;
            do {
                c6587i0.m18641k(this.f14497a.mo18577w());
            } while (this.f14497a.mo18563d() < mo18563d2);
            return;
        }
        do {
            c6587i0.m18641k(this.f14497a.mo18577w());
            if (this.f14497a.mo18564e()) {
                return;
            } else {
                mo18557B2 = this.f14497a.mo18557B();
            }
        } while (mo18557B2 == this.f14498b);
        this.f14500d = mo18557B2;
    }

    @Override // com.google.protobuf.InterfaceC6579f1
    /* renamed from: w */
    public void mo18503w(List<Integer> list) {
        int mo18557B;
        int mo18563d;
        int mo18557B2;
        if (!(list instanceof C6631y)) {
            int m19189b = C6621t1.m19189b(this.f14498b);
            if (m19189b != 0) {
                if (m19189b != 2) {
                    throw C6566b0.m18400e();
                }
                mo18563d = this.f14497a.mo18563d() + this.f14497a.mo18558C();
                do {
                    list.add(Integer.valueOf(this.f14497a.mo18574t()));
                } while (this.f14497a.mo18563d() < mo18563d);
            }
            do {
                list.add(Integer.valueOf(this.f14497a.mo18574t()));
                if (this.f14497a.mo18564e()) {
                    return;
                } else {
                    mo18557B = this.f14497a.mo18557B();
                }
            } while (mo18557B == this.f14498b);
            this.f14500d = mo18557B;
            return;
        }
        C6631y c6631y = (C6631y) list;
        int m19189b2 = C6621t1.m19189b(this.f14498b);
        if (m19189b2 != 0) {
            if (m19189b2 != 2) {
                throw C6566b0.m18400e();
            }
            mo18563d = this.f14497a.mo18563d() + this.f14497a.mo18558C();
            do {
                c6631y.mo19337F0(this.f14497a.mo18574t());
            } while (this.f14497a.mo18563d() < mo18563d);
        }
        do {
            c6631y.mo19337F0(this.f14497a.mo18574t());
            if (this.f14497a.mo18564e()) {
                return;
            } else {
                mo18557B2 = this.f14497a.mo18557B();
            }
        } while (mo18557B2 == this.f14498b);
        this.f14500d = mo18557B2;
        return;
        m18631X(mo18563d);
    }

    @Override // com.google.protobuf.InterfaceC6579f1
    /* renamed from: x */
    public void mo18504x(List<Integer> list) {
        int mo18557B;
        int mo18557B2;
        if (!(list instanceof C6631y)) {
            int m19189b = C6621t1.m19189b(this.f14498b);
            if (m19189b == 2) {
                int mo18558C = this.f14497a.mo18558C();
                m18633Z(mo18558C);
                int mo18563d = this.f14497a.mo18563d() + mo18558C;
                do {
                    list.add(Integer.valueOf(this.f14497a.mo18571q()));
                } while (this.f14497a.mo18563d() < mo18563d);
                return;
            }
            if (m19189b != 5) {
                throw C6566b0.m18400e();
            }
            do {
                list.add(Integer.valueOf(this.f14497a.mo18571q()));
                if (this.f14497a.mo18564e()) {
                    return;
                } else {
                    mo18557B = this.f14497a.mo18557B();
                }
            } while (mo18557B == this.f14498b);
            this.f14500d = mo18557B;
            return;
        }
        C6631y c6631y = (C6631y) list;
        int m19189b2 = C6621t1.m19189b(this.f14498b);
        if (m19189b2 == 2) {
            int mo18558C2 = this.f14497a.mo18558C();
            m18633Z(mo18558C2);
            int mo18563d2 = this.f14497a.mo18563d() + mo18558C2;
            do {
                c6631y.mo19337F0(this.f14497a.mo18571q());
            } while (this.f14497a.mo18563d() < mo18563d2);
            return;
        }
        if (m19189b2 != 5) {
            throw C6566b0.m18400e();
        }
        do {
            c6631y.mo19337F0(this.f14497a.mo18571q());
            if (this.f14497a.mo18564e()) {
                return;
            } else {
                mo18557B2 = this.f14497a.mo18557B();
            }
        } while (mo18557B2 == this.f14498b);
        this.f14500d = mo18557B2;
    }

    @Override // com.google.protobuf.InterfaceC6579f1
    /* renamed from: y */
    public long mo18505y() {
        m18632Y(0);
        return this.f14497a.mo18579y();
    }

    @Override // com.google.protobuf.InterfaceC6579f1
    /* renamed from: z */
    public String mo18506z() {
        m18632Y(2);
        return this.f14497a.mo18580z();
    }
}

package androidx.datastore.preferences.protobuf;

import androidx.datastore.preferences.protobuf.C1205t1;
import com.google.android.gms.common.api.C5101a;
import java.util.List;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: androidx.datastore.preferences.protobuf.j */
/* loaded from: classes.dex */
public final class C1173j implements InterfaceC1163f1 {

    /* renamed from: a */
    private final AbstractC1170i f4875a;

    /* renamed from: b */
    private int f4876b;

    /* renamed from: c */
    private int f4877c;

    /* renamed from: d */
    private int f4878d = 0;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: androidx.datastore.preferences.protobuf.j$a */
    /* loaded from: classes.dex */
    public static /* synthetic */ class a {

        /* renamed from: a */
        static final /* synthetic */ int[] f4879a;

        static {
            int[] iArr = new int[C1205t1.b.values().length];
            f4879a = iArr;
            try {
                iArr[C1205t1.b.BOOL.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f4879a[C1205t1.b.BYTES.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f4879a[C1205t1.b.DOUBLE.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f4879a[C1205t1.b.ENUM.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f4879a[C1205t1.b.FIXED32.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f4879a[C1205t1.b.FIXED64.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f4879a[C1205t1.b.FLOAT.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                f4879a[C1205t1.b.INT32.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                f4879a[C1205t1.b.INT64.ordinal()] = 9;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                f4879a[C1205t1.b.MESSAGE.ordinal()] = 10;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                f4879a[C1205t1.b.SFIXED32.ordinal()] = 11;
            } catch (NoSuchFieldError unused11) {
            }
            try {
                f4879a[C1205t1.b.SFIXED64.ordinal()] = 12;
            } catch (NoSuchFieldError unused12) {
            }
            try {
                f4879a[C1205t1.b.SINT32.ordinal()] = 13;
            } catch (NoSuchFieldError unused13) {
            }
            try {
                f4879a[C1205t1.b.SINT64.ordinal()] = 14;
            } catch (NoSuchFieldError unused14) {
            }
            try {
                f4879a[C1205t1.b.STRING.ordinal()] = 15;
            } catch (NoSuchFieldError unused15) {
            }
            try {
                f4879a[C1205t1.b.UINT32.ordinal()] = 16;
            } catch (NoSuchFieldError unused16) {
            }
            try {
                f4879a[C1205t1.b.UINT64.ordinal()] = 17;
            } catch (NoSuchFieldError unused17) {
            }
        }
    }

    private C1173j(AbstractC1170i abstractC1170i) {
        AbstractC1170i abstractC1170i2 = (AbstractC1170i) C1147a0.m5644b(abstractC1170i, "input");
        this.f4875a = abstractC1170i2;
        abstractC1170i2.f4849d = this;
    }

    /* renamed from: Q */
    public static C1173j m5974Q(AbstractC1170i abstractC1170i) {
        C1173j c1173j = abstractC1170i.f4849d;
        return c1173j != null ? c1173j : new C1173j(abstractC1170i);
    }

    /* renamed from: R */
    private Object m5975R(C1205t1.b bVar, Class<?> cls, C1191p c1191p) {
        switch (a.f4879a[bVar.ordinal()]) {
            case 1:
                return Boolean.valueOf(mo5737e());
            case 2:
                return mo5747o();
            case 3:
                return Double.valueOf(readDouble());
            case 4:
                return Integer.valueOf(mo5743k());
            case 5:
                return Integer.valueOf(mo5753u());
            case 6:
                return Long.valueOf(mo5732b());
            case 7:
                return Float.valueOf(readFloat());
            case 8:
                return Integer.valueOf(mo5748p());
            case 9:
                return Long.valueOf(mo5721H());
            case 10:
                return mo5726M(cls, c1191p);
            case 11:
                return Integer.valueOf(mo5718E());
            case 12:
                return Long.valueOf(mo5738f());
            case 13:
                return Integer.valueOf(mo5744l());
            case 14:
                return Long.valueOf(mo5757y());
            case 15:
                return mo5722I();
            case 16:
                return Integer.valueOf(mo5740h());
            case 17:
                return Long.valueOf(mo5751s());
            default:
                throw new RuntimeException("unsupported field type.");
        }
    }

    /* renamed from: S */
    private <T> T m5976S(InterfaceC1166g1<T> interfaceC1166g1, C1191p c1191p) {
        int i10 = this.f4877c;
        this.f4877c = C1205t1.m6428c(C1205t1.m6426a(this.f4876b), 4);
        try {
            T mo5796e = interfaceC1166g1.mo5796e();
            interfaceC1166g1.mo5799h(mo5796e, this, c1191p);
            interfaceC1166g1.mo5793b(mo5796e);
            if (this.f4876b == this.f4877c) {
                return mo5796e;
            }
            throw C1150b0.m5670g();
        } finally {
            this.f4877c = i10;
        }
    }

    /* renamed from: T */
    private <T> T m5977T(InterfaceC1166g1<T> interfaceC1166g1, C1191p c1191p) {
        int mo5851C = this.f4875a.mo5851C();
        AbstractC1170i abstractC1170i = this.f4875a;
        if (abstractC1170i.f4846a >= abstractC1170i.f4847b) {
            throw C1150b0.m5671h();
        }
        int mo5858l = abstractC1170i.mo5858l(mo5851C);
        T mo5796e = interfaceC1166g1.mo5796e();
        this.f4875a.f4846a++;
        interfaceC1166g1.mo5799h(mo5796e, this, c1191p);
        interfaceC1166g1.mo5793b(mo5796e);
        this.f4875a.mo5854a(0);
        r5.f4846a--;
        this.f4875a.mo5857k(mo5858l);
        return mo5796e;
    }

    /* renamed from: V */
    private void m5978V(int i10) {
        if (this.f4875a.mo5855d() != i10) {
            throw C1150b0.m5673k();
        }
    }

    /* renamed from: W */
    private void m5979W(int i10) {
        if (C1205t1.m6427b(this.f4876b) != i10) {
            throw C1150b0.m5667d();
        }
    }

    /* renamed from: X */
    private void m5980X(int i10) {
        if ((i10 & 3) != 0) {
            throw C1150b0.m5670g();
        }
    }

    /* renamed from: Y */
    private void m5981Y(int i10) {
        if ((i10 & 7) != 0) {
            throw C1150b0.m5670g();
        }
    }

    @Override // androidx.datastore.preferences.protobuf.InterfaceC1163f1
    /* renamed from: A */
    public int mo5714A() {
        int i10 = this.f4878d;
        if (i10 != 0) {
            this.f4876b = i10;
            this.f4878d = 0;
        } else {
            this.f4876b = this.f4875a.mo5850B();
        }
        int i11 = this.f4876b;
        return (i11 == 0 || i11 == this.f4877c) ? C5101a.e.API_PRIORITY_OTHER : C1205t1.m6426a(i11);
    }

    @Override // androidx.datastore.preferences.protobuf.InterfaceC1163f1
    /* renamed from: B */
    public void mo5715B(List<String> list) {
        m5982U(list, false);
    }

    @Override // androidx.datastore.preferences.protobuf.InterfaceC1163f1
    /* renamed from: C */
    public void mo5716C(List<Float> list) {
        int mo5850B;
        int mo5850B2;
        if (!(list instanceof C1211w)) {
            int m6427b = C1205t1.m6427b(this.f4876b);
            if (m6427b == 2) {
                int mo5851C = this.f4875a.mo5851C();
                m5980X(mo5851C);
                int mo5855d = this.f4875a.mo5855d() + mo5851C;
                do {
                    list.add(Float.valueOf(this.f4875a.mo5865s()));
                } while (this.f4875a.mo5855d() < mo5855d);
                return;
            }
            if (m6427b != 5) {
                throw C1150b0.m5667d();
            }
            do {
                list.add(Float.valueOf(this.f4875a.mo5865s()));
                if (this.f4875a.mo5856e()) {
                    return;
                } else {
                    mo5850B = this.f4875a.mo5850B();
                }
            } while (mo5850B == this.f4876b);
            this.f4878d = mo5850B;
            return;
        }
        C1211w c1211w = (C1211w) list;
        int m6427b2 = C1205t1.m6427b(this.f4876b);
        if (m6427b2 == 2) {
            int mo5851C2 = this.f4875a.mo5851C();
            m5980X(mo5851C2);
            int mo5855d2 = this.f4875a.mo5855d() + mo5851C2;
            do {
                c1211w.m6533h(this.f4875a.mo5865s());
            } while (this.f4875a.mo5855d() < mo5855d2);
            return;
        }
        if (m6427b2 != 5) {
            throw C1150b0.m5667d();
        }
        do {
            c1211w.m6533h(this.f4875a.mo5865s());
            if (this.f4875a.mo5856e()) {
                return;
            } else {
                mo5850B2 = this.f4875a.mo5850B();
            }
        } while (mo5850B2 == this.f4876b);
        this.f4878d = mo5850B2;
    }

    @Override // androidx.datastore.preferences.protobuf.InterfaceC1163f1
    /* renamed from: D */
    public boolean mo5717D() {
        int i10;
        if (this.f4875a.mo5856e() || (i10 = this.f4876b) == this.f4877c) {
            return false;
        }
        return this.f4875a.mo5853E(i10);
    }

    @Override // androidx.datastore.preferences.protobuf.InterfaceC1163f1
    /* renamed from: E */
    public int mo5718E() {
        m5979W(5);
        return this.f4875a.mo5868v();
    }

    @Override // androidx.datastore.preferences.protobuf.InterfaceC1163f1
    /* renamed from: F */
    public void mo5719F(List<AbstractC1167h> list) {
        int mo5850B;
        if (C1205t1.m6427b(this.f4876b) != 2) {
            throw C1150b0.m5667d();
        }
        do {
            list.add(mo5747o());
            if (this.f4875a.mo5856e()) {
                return;
            } else {
                mo5850B = this.f4875a.mo5850B();
            }
        } while (mo5850B == this.f4876b);
        this.f4878d = mo5850B;
    }

    @Override // androidx.datastore.preferences.protobuf.InterfaceC1163f1
    /* renamed from: G */
    public void mo5720G(List<Double> list) {
        int mo5850B;
        int mo5850B2;
        if (!(list instanceof C1182m)) {
            int m6427b = C1205t1.m6427b(this.f4876b);
            if (m6427b != 1) {
                if (m6427b != 2) {
                    throw C1150b0.m5667d();
                }
                int mo5851C = this.f4875a.mo5851C();
                m5981Y(mo5851C);
                int mo5855d = this.f4875a.mo5855d() + mo5851C;
                do {
                    list.add(Double.valueOf(this.f4875a.mo5861o()));
                } while (this.f4875a.mo5855d() < mo5855d);
                return;
            }
            do {
                list.add(Double.valueOf(this.f4875a.mo5861o()));
                if (this.f4875a.mo5856e()) {
                    return;
                } else {
                    mo5850B = this.f4875a.mo5850B();
                }
            } while (mo5850B == this.f4876b);
            this.f4878d = mo5850B;
            return;
        }
        C1182m c1182m = (C1182m) list;
        int m6427b2 = C1205t1.m6427b(this.f4876b);
        if (m6427b2 != 1) {
            if (m6427b2 != 2) {
                throw C1150b0.m5667d();
            }
            int mo5851C2 = this.f4875a.mo5851C();
            m5981Y(mo5851C2);
            int mo5855d2 = this.f4875a.mo5855d() + mo5851C2;
            do {
                c1182m.m6211h(this.f4875a.mo5861o());
            } while (this.f4875a.mo5855d() < mo5855d2);
            return;
        }
        do {
            c1182m.m6211h(this.f4875a.mo5861o());
            if (this.f4875a.mo5856e()) {
                return;
            } else {
                mo5850B2 = this.f4875a.mo5850B();
            }
        } while (mo5850B2 == this.f4876b);
        this.f4878d = mo5850B2;
    }

    @Override // androidx.datastore.preferences.protobuf.InterfaceC1163f1
    /* renamed from: H */
    public long mo5721H() {
        m5979W(0);
        return this.f4875a.mo5867u();
    }

    @Override // androidx.datastore.preferences.protobuf.InterfaceC1163f1
    /* renamed from: I */
    public String mo5722I() {
        m5979W(2);
        return this.f4875a.mo5849A();
    }

    @Override // androidx.datastore.preferences.protobuf.InterfaceC1163f1
    /* renamed from: J */
    public <T> T mo5723J(InterfaceC1166g1<T> interfaceC1166g1, C1191p c1191p) {
        m5979W(2);
        return (T) m5977T(interfaceC1166g1, c1191p);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // androidx.datastore.preferences.protobuf.InterfaceC1163f1
    /* renamed from: K */
    public <T> void mo5724K(List<T> list, InterfaceC1166g1<T> interfaceC1166g1, C1191p c1191p) {
        int mo5850B;
        if (C1205t1.m6427b(this.f4876b) != 2) {
            throw C1150b0.m5667d();
        }
        int i10 = this.f4876b;
        do {
            list.add(m5977T(interfaceC1166g1, c1191p));
            if (this.f4875a.mo5856e() || this.f4878d != 0) {
                return;
            } else {
                mo5850B = this.f4875a.mo5850B();
            }
        } while (mo5850B == i10);
        this.f4878d = mo5850B;
    }

    @Override // androidx.datastore.preferences.protobuf.InterfaceC1163f1
    /* renamed from: L */
    public <T> T mo5725L(InterfaceC1166g1<T> interfaceC1166g1, C1191p c1191p) {
        m5979W(3);
        return (T) m5976S(interfaceC1166g1, c1191p);
    }

    @Override // androidx.datastore.preferences.protobuf.InterfaceC1163f1
    /* renamed from: M */
    public <T> T mo5726M(Class<T> cls, C1191p c1191p) {
        m5979W(2);
        return (T) m5977T(C1154c1.m5677a().m5680d(cls), c1191p);
    }

    @Override // androidx.datastore.preferences.protobuf.InterfaceC1163f1
    /* renamed from: N */
    public <T> T mo5727N(Class<T> cls, C1191p c1191p) {
        m5979W(3);
        return (T) m5976S(C1154c1.m5677a().m5680d(cls), c1191p);
    }

    /* JADX WARN: Code restructure failed: missing block: B:38:0x005c, code lost:
    
        r8.put(r2, r3);
     */
    /* JADX WARN: Code restructure failed: missing block: B:40:0x0064, code lost:
    
        return;
     */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // androidx.datastore.preferences.protobuf.InterfaceC1163f1
    /* renamed from: O */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public <K, V> void mo5728O(java.util.Map<K, V> r8, androidx.datastore.preferences.protobuf.C1177k0.a<K, V> r9, androidx.datastore.preferences.protobuf.C1191p r10) {
        /*
            r7 = this;
            r0 = 2
            r7.m5979W(r0)
            androidx.datastore.preferences.protobuf.i r1 = r7.f4875a
            int r1 = r1.mo5851C()
            androidx.datastore.preferences.protobuf.i r2 = r7.f4875a
            int r1 = r2.mo5858l(r1)
            K r2 = r9.f4921b
            V r3 = r9.f4923d
        L14:
            int r4 = r7.mo5714A()     // Catch: java.lang.Throwable -> L65
            r5 = 2147483647(0x7fffffff, float:NaN)
            if (r4 == r5) goto L5c
            androidx.datastore.preferences.protobuf.i r5 = r7.f4875a     // Catch: java.lang.Throwable -> L65
            boolean r5 = r5.mo5856e()     // Catch: java.lang.Throwable -> L65
            if (r5 == 0) goto L26
            goto L5c
        L26:
            r5 = 1
            java.lang.String r6 = "Unable to parse map entry."
            if (r4 == r5) goto L47
            if (r4 == r0) goto L3a
            boolean r4 = r7.mo5717D()     // Catch: androidx.datastore.preferences.protobuf.C1150b0.a -> L4f java.lang.Throwable -> L65
            if (r4 == 0) goto L34
            goto L14
        L34:
            androidx.datastore.preferences.protobuf.b0 r4 = new androidx.datastore.preferences.protobuf.b0     // Catch: androidx.datastore.preferences.protobuf.C1150b0.a -> L4f java.lang.Throwable -> L65
            r4.<init>(r6)     // Catch: androidx.datastore.preferences.protobuf.C1150b0.a -> L4f java.lang.Throwable -> L65
            throw r4     // Catch: androidx.datastore.preferences.protobuf.C1150b0.a -> L4f java.lang.Throwable -> L65
        L3a:
            androidx.datastore.preferences.protobuf.t1$b r4 = r9.f4922c     // Catch: androidx.datastore.preferences.protobuf.C1150b0.a -> L4f java.lang.Throwable -> L65
            V r5 = r9.f4923d     // Catch: androidx.datastore.preferences.protobuf.C1150b0.a -> L4f java.lang.Throwable -> L65
            java.lang.Class r5 = r5.getClass()     // Catch: androidx.datastore.preferences.protobuf.C1150b0.a -> L4f java.lang.Throwable -> L65
            java.lang.Object r3 = r7.m5975R(r4, r5, r10)     // Catch: androidx.datastore.preferences.protobuf.C1150b0.a -> L4f java.lang.Throwable -> L65
            goto L14
        L47:
            androidx.datastore.preferences.protobuf.t1$b r4 = r9.f4920a     // Catch: androidx.datastore.preferences.protobuf.C1150b0.a -> L4f java.lang.Throwable -> L65
            r5 = 0
            java.lang.Object r2 = r7.m5975R(r4, r5, r5)     // Catch: androidx.datastore.preferences.protobuf.C1150b0.a -> L4f java.lang.Throwable -> L65
            goto L14
        L4f:
            boolean r4 = r7.mo5717D()     // Catch: java.lang.Throwable -> L65
            if (r4 == 0) goto L56
            goto L14
        L56:
            androidx.datastore.preferences.protobuf.b0 r8 = new androidx.datastore.preferences.protobuf.b0     // Catch: java.lang.Throwable -> L65
            r8.<init>(r6)     // Catch: java.lang.Throwable -> L65
            throw r8     // Catch: java.lang.Throwable -> L65
        L5c:
            r8.put(r2, r3)     // Catch: java.lang.Throwable -> L65
            androidx.datastore.preferences.protobuf.i r8 = r7.f4875a
            r8.mo5857k(r1)
            return
        L65:
            r8 = move-exception
            androidx.datastore.preferences.protobuf.i r9 = r7.f4875a
            r9.mo5857k(r1)
            throw r8
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.datastore.preferences.protobuf.C1173j.mo5728O(java.util.Map, androidx.datastore.preferences.protobuf.k0$a, androidx.datastore.preferences.protobuf.p):void");
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // androidx.datastore.preferences.protobuf.InterfaceC1163f1
    /* renamed from: P */
    public <T> void mo5729P(List<T> list, InterfaceC1166g1<T> interfaceC1166g1, C1191p c1191p) {
        int mo5850B;
        if (C1205t1.m6427b(this.f4876b) != 3) {
            throw C1150b0.m5667d();
        }
        int i10 = this.f4876b;
        do {
            list.add(m5976S(interfaceC1166g1, c1191p));
            if (this.f4875a.mo5856e() || this.f4878d != 0) {
                return;
            } else {
                mo5850B = this.f4875a.mo5850B();
            }
        } while (mo5850B == i10);
        this.f4878d = mo5850B;
    }

    /* renamed from: U */
    public void m5982U(List<String> list, boolean z10) {
        int mo5850B;
        int mo5850B2;
        if (C1205t1.m6427b(this.f4876b) != 2) {
            throw C1150b0.m5667d();
        }
        if (!(list instanceof InterfaceC1165g0) || z10) {
            do {
                list.add(z10 ? mo5722I() : mo5758z());
                if (this.f4875a.mo5856e()) {
                    return;
                } else {
                    mo5850B = this.f4875a.mo5850B();
                }
            } while (mo5850B == this.f4876b);
            this.f4878d = mo5850B;
            return;
        }
        InterfaceC1165g0 interfaceC1165g0 = (InterfaceC1165g0) list;
        do {
            interfaceC1165g0.mo5782J0(mo5747o());
            if (this.f4875a.mo5856e()) {
                return;
            } else {
                mo5850B2 = this.f4875a.mo5850B();
            }
        } while (mo5850B2 == this.f4876b);
        this.f4878d = mo5850B2;
    }

    @Override // androidx.datastore.preferences.protobuf.InterfaceC1163f1
    /* renamed from: a */
    public int mo5730a() {
        return this.f4876b;
    }

    @Override // androidx.datastore.preferences.protobuf.InterfaceC1163f1
    /* renamed from: b */
    public long mo5732b() {
        m5979W(1);
        return this.f4875a.mo5864r();
    }

    @Override // androidx.datastore.preferences.protobuf.InterfaceC1163f1
    /* renamed from: c */
    public void mo5734c(List<Integer> list) {
        int mo5850B;
        int mo5850B2;
        if (!(list instanceof C1217z)) {
            int m6427b = C1205t1.m6427b(this.f4876b);
            if (m6427b == 2) {
                int mo5851C = this.f4875a.mo5851C();
                m5980X(mo5851C);
                int mo5855d = this.f4875a.mo5855d() + mo5851C;
                do {
                    list.add(Integer.valueOf(this.f4875a.mo5868v()));
                } while (this.f4875a.mo5855d() < mo5855d);
                return;
            }
            if (m6427b != 5) {
                throw C1150b0.m5667d();
            }
            do {
                list.add(Integer.valueOf(this.f4875a.mo5868v()));
                if (this.f4875a.mo5856e()) {
                    return;
                } else {
                    mo5850B = this.f4875a.mo5850B();
                }
            } while (mo5850B == this.f4876b);
            this.f4878d = mo5850B;
            return;
        }
        C1217z c1217z = (C1217z) list;
        int m6427b2 = C1205t1.m6427b(this.f4876b);
        if (m6427b2 == 2) {
            int mo5851C2 = this.f4875a.mo5851C();
            m5980X(mo5851C2);
            int mo5855d2 = this.f4875a.mo5855d() + mo5851C2;
            do {
                c1217z.m6584F0(this.f4875a.mo5868v());
            } while (this.f4875a.mo5855d() < mo5855d2);
            return;
        }
        if (m6427b2 != 5) {
            throw C1150b0.m5667d();
        }
        do {
            c1217z.m6584F0(this.f4875a.mo5868v());
            if (this.f4875a.mo5856e()) {
                return;
            } else {
                mo5850B2 = this.f4875a.mo5850B();
            }
        } while (mo5850B2 == this.f4876b);
        this.f4878d = mo5850B2;
    }

    @Override // androidx.datastore.preferences.protobuf.InterfaceC1163f1
    /* renamed from: d */
    public void mo5735d(List<Long> list) {
        int mo5850B;
        int mo5855d;
        int mo5850B2;
        if (!(list instanceof C1171i0)) {
            int m6427b = C1205t1.m6427b(this.f4876b);
            if (m6427b != 0) {
                if (m6427b != 2) {
                    throw C1150b0.m5667d();
                }
                mo5855d = this.f4875a.mo5855d() + this.f4875a.mo5851C();
                do {
                    list.add(Long.valueOf(this.f4875a.mo5871y()));
                } while (this.f4875a.mo5855d() < mo5855d);
            }
            do {
                list.add(Long.valueOf(this.f4875a.mo5871y()));
                if (this.f4875a.mo5856e()) {
                    return;
                } else {
                    mo5850B = this.f4875a.mo5850B();
                }
            } while (mo5850B == this.f4876b);
            this.f4878d = mo5850B;
            return;
        }
        C1171i0 c1171i0 = (C1171i0) list;
        int m6427b2 = C1205t1.m6427b(this.f4876b);
        if (m6427b2 != 0) {
            if (m6427b2 != 2) {
                throw C1150b0.m5667d();
            }
            mo5855d = this.f4875a.mo5855d() + this.f4875a.mo5851C();
            do {
                c1171i0.m5910k(this.f4875a.mo5871y());
            } while (this.f4875a.mo5855d() < mo5855d);
        }
        do {
            c1171i0.m5910k(this.f4875a.mo5871y());
            if (this.f4875a.mo5856e()) {
                return;
            } else {
                mo5850B2 = this.f4875a.mo5850B();
            }
        } while (mo5850B2 == this.f4876b);
        this.f4878d = mo5850B2;
        return;
        m5978V(mo5855d);
    }

    @Override // androidx.datastore.preferences.protobuf.InterfaceC1163f1
    /* renamed from: e */
    public boolean mo5737e() {
        m5979W(0);
        return this.f4875a.mo5859m();
    }

    @Override // androidx.datastore.preferences.protobuf.InterfaceC1163f1
    /* renamed from: f */
    public long mo5738f() {
        m5979W(1);
        return this.f4875a.mo5869w();
    }

    @Override // androidx.datastore.preferences.protobuf.InterfaceC1163f1
    /* renamed from: g */
    public void mo5739g(List<Long> list) {
        int mo5850B;
        int mo5855d;
        int mo5850B2;
        if (!(list instanceof C1171i0)) {
            int m6427b = C1205t1.m6427b(this.f4876b);
            if (m6427b != 0) {
                if (m6427b != 2) {
                    throw C1150b0.m5667d();
                }
                mo5855d = this.f4875a.mo5855d() + this.f4875a.mo5851C();
                do {
                    list.add(Long.valueOf(this.f4875a.mo5852D()));
                } while (this.f4875a.mo5855d() < mo5855d);
            }
            do {
                list.add(Long.valueOf(this.f4875a.mo5852D()));
                if (this.f4875a.mo5856e()) {
                    return;
                } else {
                    mo5850B = this.f4875a.mo5850B();
                }
            } while (mo5850B == this.f4876b);
            this.f4878d = mo5850B;
            return;
        }
        C1171i0 c1171i0 = (C1171i0) list;
        int m6427b2 = C1205t1.m6427b(this.f4876b);
        if (m6427b2 != 0) {
            if (m6427b2 != 2) {
                throw C1150b0.m5667d();
            }
            mo5855d = this.f4875a.mo5855d() + this.f4875a.mo5851C();
            do {
                c1171i0.m5910k(this.f4875a.mo5852D());
            } while (this.f4875a.mo5855d() < mo5855d);
        }
        do {
            c1171i0.m5910k(this.f4875a.mo5852D());
            if (this.f4875a.mo5856e()) {
                return;
            } else {
                mo5850B2 = this.f4875a.mo5850B();
            }
        } while (mo5850B2 == this.f4876b);
        this.f4878d = mo5850B2;
        return;
        m5978V(mo5855d);
    }

    @Override // androidx.datastore.preferences.protobuf.InterfaceC1163f1
    /* renamed from: h */
    public int mo5740h() {
        m5979W(0);
        return this.f4875a.mo5851C();
    }

    @Override // androidx.datastore.preferences.protobuf.InterfaceC1163f1
    /* renamed from: i */
    public void mo5741i(List<Long> list) {
        int mo5850B;
        int mo5855d;
        int mo5850B2;
        if (!(list instanceof C1171i0)) {
            int m6427b = C1205t1.m6427b(this.f4876b);
            if (m6427b != 0) {
                if (m6427b != 2) {
                    throw C1150b0.m5667d();
                }
                mo5855d = this.f4875a.mo5855d() + this.f4875a.mo5851C();
                do {
                    list.add(Long.valueOf(this.f4875a.mo5867u()));
                } while (this.f4875a.mo5855d() < mo5855d);
            }
            do {
                list.add(Long.valueOf(this.f4875a.mo5867u()));
                if (this.f4875a.mo5856e()) {
                    return;
                } else {
                    mo5850B = this.f4875a.mo5850B();
                }
            } while (mo5850B == this.f4876b);
            this.f4878d = mo5850B;
            return;
        }
        C1171i0 c1171i0 = (C1171i0) list;
        int m6427b2 = C1205t1.m6427b(this.f4876b);
        if (m6427b2 != 0) {
            if (m6427b2 != 2) {
                throw C1150b0.m5667d();
            }
            mo5855d = this.f4875a.mo5855d() + this.f4875a.mo5851C();
            do {
                c1171i0.m5910k(this.f4875a.mo5867u());
            } while (this.f4875a.mo5855d() < mo5855d);
        }
        do {
            c1171i0.m5910k(this.f4875a.mo5867u());
            if (this.f4875a.mo5856e()) {
                return;
            } else {
                mo5850B2 = this.f4875a.mo5850B();
            }
        } while (mo5850B2 == this.f4876b);
        this.f4878d = mo5850B2;
        return;
        m5978V(mo5855d);
    }

    @Override // androidx.datastore.preferences.protobuf.InterfaceC1163f1
    /* renamed from: j */
    public void mo5742j(List<Integer> list) {
        int mo5850B;
        int mo5855d;
        int mo5850B2;
        if (!(list instanceof C1217z)) {
            int m6427b = C1205t1.m6427b(this.f4876b);
            if (m6427b != 0) {
                if (m6427b != 2) {
                    throw C1150b0.m5667d();
                }
                mo5855d = this.f4875a.mo5855d() + this.f4875a.mo5851C();
                do {
                    list.add(Integer.valueOf(this.f4875a.mo5862p()));
                } while (this.f4875a.mo5855d() < mo5855d);
            }
            do {
                list.add(Integer.valueOf(this.f4875a.mo5862p()));
                if (this.f4875a.mo5856e()) {
                    return;
                } else {
                    mo5850B = this.f4875a.mo5850B();
                }
            } while (mo5850B == this.f4876b);
            this.f4878d = mo5850B;
            return;
        }
        C1217z c1217z = (C1217z) list;
        int m6427b2 = C1205t1.m6427b(this.f4876b);
        if (m6427b2 != 0) {
            if (m6427b2 != 2) {
                throw C1150b0.m5667d();
            }
            mo5855d = this.f4875a.mo5855d() + this.f4875a.mo5851C();
            do {
                c1217z.m6584F0(this.f4875a.mo5862p());
            } while (this.f4875a.mo5855d() < mo5855d);
        }
        do {
            c1217z.m6584F0(this.f4875a.mo5862p());
            if (this.f4875a.mo5856e()) {
                return;
            } else {
                mo5850B2 = this.f4875a.mo5850B();
            }
        } while (mo5850B2 == this.f4876b);
        this.f4878d = mo5850B2;
        return;
        m5978V(mo5855d);
    }

    @Override // androidx.datastore.preferences.protobuf.InterfaceC1163f1
    /* renamed from: k */
    public int mo5743k() {
        m5979W(0);
        return this.f4875a.mo5862p();
    }

    @Override // androidx.datastore.preferences.protobuf.InterfaceC1163f1
    /* renamed from: l */
    public int mo5744l() {
        m5979W(0);
        return this.f4875a.mo5870x();
    }

    @Override // androidx.datastore.preferences.protobuf.InterfaceC1163f1
    /* renamed from: m */
    public void mo5745m(List<Boolean> list) {
        int mo5850B;
        int mo5855d;
        int mo5850B2;
        if (!(list instanceof C1161f)) {
            int m6427b = C1205t1.m6427b(this.f4876b);
            if (m6427b != 0) {
                if (m6427b != 2) {
                    throw C1150b0.m5667d();
                }
                mo5855d = this.f4875a.mo5855d() + this.f4875a.mo5851C();
                do {
                    list.add(Boolean.valueOf(this.f4875a.mo5859m()));
                } while (this.f4875a.mo5855d() < mo5855d);
            }
            do {
                list.add(Boolean.valueOf(this.f4875a.mo5859m()));
                if (this.f4875a.mo5856e()) {
                    return;
                } else {
                    mo5850B = this.f4875a.mo5850B();
                }
            } while (mo5850B == this.f4876b);
            this.f4878d = mo5850B;
            return;
        }
        C1161f c1161f = (C1161f) list;
        int m6427b2 = C1205t1.m6427b(this.f4876b);
        if (m6427b2 != 0) {
            if (m6427b2 != 2) {
                throw C1150b0.m5667d();
            }
            mo5855d = this.f4875a.mo5855d() + this.f4875a.mo5851C();
            do {
                c1161f.m5774k(this.f4875a.mo5859m());
            } while (this.f4875a.mo5855d() < mo5855d);
        }
        do {
            c1161f.m5774k(this.f4875a.mo5859m());
            if (this.f4875a.mo5856e()) {
                return;
            } else {
                mo5850B2 = this.f4875a.mo5850B();
            }
        } while (mo5850B2 == this.f4876b);
        this.f4878d = mo5850B2;
        return;
        m5978V(mo5855d);
    }

    @Override // androidx.datastore.preferences.protobuf.InterfaceC1163f1
    /* renamed from: n */
    public void mo5746n(List<String> list) {
        m5982U(list, true);
    }

    @Override // androidx.datastore.preferences.protobuf.InterfaceC1163f1
    /* renamed from: o */
    public AbstractC1167h mo5747o() {
        m5979W(2);
        return this.f4875a.mo5860n();
    }

    @Override // androidx.datastore.preferences.protobuf.InterfaceC1163f1
    /* renamed from: p */
    public int mo5748p() {
        m5979W(0);
        return this.f4875a.mo5866t();
    }

    @Override // androidx.datastore.preferences.protobuf.InterfaceC1163f1
    /* renamed from: q */
    public void mo5749q(List<Long> list) {
        int mo5850B;
        int mo5850B2;
        if (!(list instanceof C1171i0)) {
            int m6427b = C1205t1.m6427b(this.f4876b);
            if (m6427b != 1) {
                if (m6427b != 2) {
                    throw C1150b0.m5667d();
                }
                int mo5851C = this.f4875a.mo5851C();
                m5981Y(mo5851C);
                int mo5855d = this.f4875a.mo5855d() + mo5851C;
                do {
                    list.add(Long.valueOf(this.f4875a.mo5864r()));
                } while (this.f4875a.mo5855d() < mo5855d);
                return;
            }
            do {
                list.add(Long.valueOf(this.f4875a.mo5864r()));
                if (this.f4875a.mo5856e()) {
                    return;
                } else {
                    mo5850B = this.f4875a.mo5850B();
                }
            } while (mo5850B == this.f4876b);
            this.f4878d = mo5850B;
            return;
        }
        C1171i0 c1171i0 = (C1171i0) list;
        int m6427b2 = C1205t1.m6427b(this.f4876b);
        if (m6427b2 != 1) {
            if (m6427b2 != 2) {
                throw C1150b0.m5667d();
            }
            int mo5851C2 = this.f4875a.mo5851C();
            m5981Y(mo5851C2);
            int mo5855d2 = this.f4875a.mo5855d() + mo5851C2;
            do {
                c1171i0.m5910k(this.f4875a.mo5864r());
            } while (this.f4875a.mo5855d() < mo5855d2);
            return;
        }
        do {
            c1171i0.m5910k(this.f4875a.mo5864r());
            if (this.f4875a.mo5856e()) {
                return;
            } else {
                mo5850B2 = this.f4875a.mo5850B();
            }
        } while (mo5850B2 == this.f4876b);
        this.f4878d = mo5850B2;
    }

    @Override // androidx.datastore.preferences.protobuf.InterfaceC1163f1
    /* renamed from: r */
    public void mo5750r(List<Integer> list) {
        int mo5850B;
        int mo5855d;
        int mo5850B2;
        if (!(list instanceof C1217z)) {
            int m6427b = C1205t1.m6427b(this.f4876b);
            if (m6427b != 0) {
                if (m6427b != 2) {
                    throw C1150b0.m5667d();
                }
                mo5855d = this.f4875a.mo5855d() + this.f4875a.mo5851C();
                do {
                    list.add(Integer.valueOf(this.f4875a.mo5870x()));
                } while (this.f4875a.mo5855d() < mo5855d);
            }
            do {
                list.add(Integer.valueOf(this.f4875a.mo5870x()));
                if (this.f4875a.mo5856e()) {
                    return;
                } else {
                    mo5850B = this.f4875a.mo5850B();
                }
            } while (mo5850B == this.f4876b);
            this.f4878d = mo5850B;
            return;
        }
        C1217z c1217z = (C1217z) list;
        int m6427b2 = C1205t1.m6427b(this.f4876b);
        if (m6427b2 != 0) {
            if (m6427b2 != 2) {
                throw C1150b0.m5667d();
            }
            mo5855d = this.f4875a.mo5855d() + this.f4875a.mo5851C();
            do {
                c1217z.m6584F0(this.f4875a.mo5870x());
            } while (this.f4875a.mo5855d() < mo5855d);
        }
        do {
            c1217z.m6584F0(this.f4875a.mo5870x());
            if (this.f4875a.mo5856e()) {
                return;
            } else {
                mo5850B2 = this.f4875a.mo5850B();
            }
        } while (mo5850B2 == this.f4876b);
        this.f4878d = mo5850B2;
        return;
        m5978V(mo5855d);
    }

    @Override // androidx.datastore.preferences.protobuf.InterfaceC1163f1
    public double readDouble() {
        m5979W(1);
        return this.f4875a.mo5861o();
    }

    @Override // androidx.datastore.preferences.protobuf.InterfaceC1163f1
    public float readFloat() {
        m5979W(5);
        return this.f4875a.mo5865s();
    }

    @Override // androidx.datastore.preferences.protobuf.InterfaceC1163f1
    /* renamed from: s */
    public long mo5751s() {
        m5979W(0);
        return this.f4875a.mo5852D();
    }

    @Override // androidx.datastore.preferences.protobuf.InterfaceC1163f1
    /* renamed from: t */
    public void mo5752t(List<Integer> list) {
        int mo5850B;
        int mo5855d;
        int mo5850B2;
        if (!(list instanceof C1217z)) {
            int m6427b = C1205t1.m6427b(this.f4876b);
            if (m6427b != 0) {
                if (m6427b != 2) {
                    throw C1150b0.m5667d();
                }
                mo5855d = this.f4875a.mo5855d() + this.f4875a.mo5851C();
                do {
                    list.add(Integer.valueOf(this.f4875a.mo5851C()));
                } while (this.f4875a.mo5855d() < mo5855d);
            }
            do {
                list.add(Integer.valueOf(this.f4875a.mo5851C()));
                if (this.f4875a.mo5856e()) {
                    return;
                } else {
                    mo5850B = this.f4875a.mo5850B();
                }
            } while (mo5850B == this.f4876b);
            this.f4878d = mo5850B;
            return;
        }
        C1217z c1217z = (C1217z) list;
        int m6427b2 = C1205t1.m6427b(this.f4876b);
        if (m6427b2 != 0) {
            if (m6427b2 != 2) {
                throw C1150b0.m5667d();
            }
            mo5855d = this.f4875a.mo5855d() + this.f4875a.mo5851C();
            do {
                c1217z.m6584F0(this.f4875a.mo5851C());
            } while (this.f4875a.mo5855d() < mo5855d);
        }
        do {
            c1217z.m6584F0(this.f4875a.mo5851C());
            if (this.f4875a.mo5856e()) {
                return;
            } else {
                mo5850B2 = this.f4875a.mo5850B();
            }
        } while (mo5850B2 == this.f4876b);
        this.f4878d = mo5850B2;
        return;
        m5978V(mo5855d);
    }

    @Override // androidx.datastore.preferences.protobuf.InterfaceC1163f1
    /* renamed from: u */
    public int mo5753u() {
        m5979W(5);
        return this.f4875a.mo5863q();
    }

    @Override // androidx.datastore.preferences.protobuf.InterfaceC1163f1
    /* renamed from: v */
    public void mo5754v(List<Long> list) {
        int mo5850B;
        int mo5850B2;
        if (!(list instanceof C1171i0)) {
            int m6427b = C1205t1.m6427b(this.f4876b);
            if (m6427b != 1) {
                if (m6427b != 2) {
                    throw C1150b0.m5667d();
                }
                int mo5851C = this.f4875a.mo5851C();
                m5981Y(mo5851C);
                int mo5855d = this.f4875a.mo5855d() + mo5851C;
                do {
                    list.add(Long.valueOf(this.f4875a.mo5869w()));
                } while (this.f4875a.mo5855d() < mo5855d);
                return;
            }
            do {
                list.add(Long.valueOf(this.f4875a.mo5869w()));
                if (this.f4875a.mo5856e()) {
                    return;
                } else {
                    mo5850B = this.f4875a.mo5850B();
                }
            } while (mo5850B == this.f4876b);
            this.f4878d = mo5850B;
            return;
        }
        C1171i0 c1171i0 = (C1171i0) list;
        int m6427b2 = C1205t1.m6427b(this.f4876b);
        if (m6427b2 != 1) {
            if (m6427b2 != 2) {
                throw C1150b0.m5667d();
            }
            int mo5851C2 = this.f4875a.mo5851C();
            m5981Y(mo5851C2);
            int mo5855d2 = this.f4875a.mo5855d() + mo5851C2;
            do {
                c1171i0.m5910k(this.f4875a.mo5869w());
            } while (this.f4875a.mo5855d() < mo5855d2);
            return;
        }
        do {
            c1171i0.m5910k(this.f4875a.mo5869w());
            if (this.f4875a.mo5856e()) {
                return;
            } else {
                mo5850B2 = this.f4875a.mo5850B();
            }
        } while (mo5850B2 == this.f4876b);
        this.f4878d = mo5850B2;
    }

    @Override // androidx.datastore.preferences.protobuf.InterfaceC1163f1
    /* renamed from: w */
    public void mo5755w(List<Integer> list) {
        int mo5850B;
        int mo5855d;
        int mo5850B2;
        if (!(list instanceof C1217z)) {
            int m6427b = C1205t1.m6427b(this.f4876b);
            if (m6427b != 0) {
                if (m6427b != 2) {
                    throw C1150b0.m5667d();
                }
                mo5855d = this.f4875a.mo5855d() + this.f4875a.mo5851C();
                do {
                    list.add(Integer.valueOf(this.f4875a.mo5866t()));
                } while (this.f4875a.mo5855d() < mo5855d);
            }
            do {
                list.add(Integer.valueOf(this.f4875a.mo5866t()));
                if (this.f4875a.mo5856e()) {
                    return;
                } else {
                    mo5850B = this.f4875a.mo5850B();
                }
            } while (mo5850B == this.f4876b);
            this.f4878d = mo5850B;
            return;
        }
        C1217z c1217z = (C1217z) list;
        int m6427b2 = C1205t1.m6427b(this.f4876b);
        if (m6427b2 != 0) {
            if (m6427b2 != 2) {
                throw C1150b0.m5667d();
            }
            mo5855d = this.f4875a.mo5855d() + this.f4875a.mo5851C();
            do {
                c1217z.m6584F0(this.f4875a.mo5866t());
            } while (this.f4875a.mo5855d() < mo5855d);
        }
        do {
            c1217z.m6584F0(this.f4875a.mo5866t());
            if (this.f4875a.mo5856e()) {
                return;
            } else {
                mo5850B2 = this.f4875a.mo5850B();
            }
        } while (mo5850B2 == this.f4876b);
        this.f4878d = mo5850B2;
        return;
        m5978V(mo5855d);
    }

    @Override // androidx.datastore.preferences.protobuf.InterfaceC1163f1
    /* renamed from: x */
    public void mo5756x(List<Integer> list) {
        int mo5850B;
        int mo5850B2;
        if (!(list instanceof C1217z)) {
            int m6427b = C1205t1.m6427b(this.f4876b);
            if (m6427b == 2) {
                int mo5851C = this.f4875a.mo5851C();
                m5980X(mo5851C);
                int mo5855d = this.f4875a.mo5855d() + mo5851C;
                do {
                    list.add(Integer.valueOf(this.f4875a.mo5863q()));
                } while (this.f4875a.mo5855d() < mo5855d);
                return;
            }
            if (m6427b != 5) {
                throw C1150b0.m5667d();
            }
            do {
                list.add(Integer.valueOf(this.f4875a.mo5863q()));
                if (this.f4875a.mo5856e()) {
                    return;
                } else {
                    mo5850B = this.f4875a.mo5850B();
                }
            } while (mo5850B == this.f4876b);
            this.f4878d = mo5850B;
            return;
        }
        C1217z c1217z = (C1217z) list;
        int m6427b2 = C1205t1.m6427b(this.f4876b);
        if (m6427b2 == 2) {
            int mo5851C2 = this.f4875a.mo5851C();
            m5980X(mo5851C2);
            int mo5855d2 = this.f4875a.mo5855d() + mo5851C2;
            do {
                c1217z.m6584F0(this.f4875a.mo5863q());
            } while (this.f4875a.mo5855d() < mo5855d2);
            return;
        }
        if (m6427b2 != 5) {
            throw C1150b0.m5667d();
        }
        do {
            c1217z.m6584F0(this.f4875a.mo5863q());
            if (this.f4875a.mo5856e()) {
                return;
            } else {
                mo5850B2 = this.f4875a.mo5850B();
            }
        } while (mo5850B2 == this.f4876b);
        this.f4878d = mo5850B2;
    }

    @Override // androidx.datastore.preferences.protobuf.InterfaceC1163f1
    /* renamed from: y */
    public long mo5757y() {
        m5979W(0);
        return this.f4875a.mo5871y();
    }

    @Override // androidx.datastore.preferences.protobuf.InterfaceC1163f1
    /* renamed from: z */
    public String mo5758z() {
        m5979W(2);
        return this.f4875a.mo5872z();
    }
}

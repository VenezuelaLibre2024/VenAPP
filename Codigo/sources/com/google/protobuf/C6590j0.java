package com.google.protobuf;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: com.google.protobuf.j0 */
/* loaded from: classes2.dex */
public final class C6590j0 implements InterfaceC6585h1 {

    /* renamed from: b */
    private static final InterfaceC6611q0 f14522b = new a();

    /* renamed from: a */
    private final InterfaceC6611q0 f14523a;

    /* renamed from: com.google.protobuf.j0$a */
    /* loaded from: classes2.dex */
    class a implements InterfaceC6611q0 {
        a() {
        }

        @Override // com.google.protobuf.InterfaceC6611q0
        /* renamed from: a */
        public InterfaceC6608p0 mo18826a(Class<?> cls) {
            throw new IllegalStateException("This should never be called.");
        }

        @Override // com.google.protobuf.InterfaceC6611q0
        /* renamed from: b */
        public boolean mo18827b(Class<?> cls) {
            return false;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: com.google.protobuf.j0$b */
    /* loaded from: classes2.dex */
    public static class b implements InterfaceC6611q0 {

        /* renamed from: a */
        private InterfaceC6611q0[] f14524a;

        b(InterfaceC6611q0... interfaceC6611q0Arr) {
            this.f14524a = interfaceC6611q0Arr;
        }

        @Override // com.google.protobuf.InterfaceC6611q0
        /* renamed from: a */
        public InterfaceC6608p0 mo18826a(Class<?> cls) {
            for (InterfaceC6611q0 interfaceC6611q0 : this.f14524a) {
                if (interfaceC6611q0.mo18827b(cls)) {
                    return interfaceC6611q0.mo18826a(cls);
                }
            }
            throw new UnsupportedOperationException("No factory is available for message type: " + cls.getName());
        }

        @Override // com.google.protobuf.InterfaceC6611q0
        /* renamed from: b */
        public boolean mo18827b(Class<?> cls) {
            for (InterfaceC6611q0 interfaceC6611q0 : this.f14524a) {
                if (interfaceC6611q0.mo18827b(cls)) {
                    return true;
                }
            }
            return false;
        }
    }

    public C6590j0() {
        this(m18822b());
    }

    private C6590j0(InterfaceC6611q0 interfaceC6611q0) {
        this.f14523a = (InterfaceC6611q0) C6633z.m19348b(interfaceC6611q0, "messageInfoFactory");
    }

    /* renamed from: b */
    private static InterfaceC6611q0 m18822b() {
        return new b(C6627w.m19280c(), m18823c());
    }

    /* renamed from: c */
    private static InterfaceC6611q0 m18823c() {
        try {
            return (InterfaceC6611q0) Class.forName("com.google.protobuf.DescriptorMessageInfoFactory").getDeclaredMethod("getInstance", new Class[0]).invoke(null, new Object[0]);
        } catch (Exception unused) {
            return f14522b;
        }
    }

    /* renamed from: d */
    private static boolean m18824d(InterfaceC6608p0 interfaceC6608p0) {
        return interfaceC6608p0.mo18451c() == EnumC6567b1.PROTO2;
    }

    /* renamed from: e */
    private static <T> InterfaceC6582g1<T> m18825e(Class<T> cls, InterfaceC6608p0 interfaceC6608p0) {
        return AbstractC6629x.class.isAssignableFrom(cls) ? m18824d(interfaceC6608p0) ? C6623u0.m19215R(cls, interfaceC6608p0, C6632y0.m19345b(), AbstractC6584h0.m18617b(), C6588i1.m18660M(), C6613r.m19030b(), C6605o0.m18976b()) : C6623u0.m19215R(cls, interfaceC6608p0, C6632y0.m19345b(), AbstractC6584h0.m18617b(), C6588i1.m18660M(), null, C6605o0.m18976b()) : m18824d(interfaceC6608p0) ? C6623u0.m19215R(cls, interfaceC6608p0, C6632y0.m19344a(), AbstractC6584h0.m18616a(), C6588i1.m18655H(), C6613r.m19029a(), C6605o0.m18975a()) : C6623u0.m19215R(cls, interfaceC6608p0, C6632y0.m19344a(), AbstractC6584h0.m18616a(), C6588i1.m18656I(), null, C6605o0.m18975a());
    }

    @Override // com.google.protobuf.InterfaceC6585h1
    /* renamed from: a */
    public <T> InterfaceC6582g1<T> mo18624a(Class<T> cls) {
        AbstractC6603n1<?, ?> m18655H;
        AbstractC6607p<?> m19029a;
        C6588i1.m18657J(cls);
        InterfaceC6608p0 mo18826a = this.f14523a.mo18826a(cls);
        if (!mo18826a.mo18449a()) {
            return m18825e(cls, mo18826a);
        }
        if (AbstractC6629x.class.isAssignableFrom(cls)) {
            m18655H = C6588i1.m18660M();
            m19029a = C6613r.m19030b();
        } else {
            m18655H = C6588i1.m18655H();
            m19029a = C6613r.m19029a();
        }
        return C6626v0.m19277l(m18655H, m19029a, mo18826a.mo18450b());
    }
}

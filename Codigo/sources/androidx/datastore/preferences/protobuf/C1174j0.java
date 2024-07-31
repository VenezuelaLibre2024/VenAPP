package androidx.datastore.preferences.protobuf;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: androidx.datastore.preferences.protobuf.j0 */
/* loaded from: classes.dex */
public final class C1174j0 implements InterfaceC1169h1 {

    /* renamed from: b */
    private static final InterfaceC1195q0 f4880b = new a();

    /* renamed from: a */
    private final InterfaceC1195q0 f4881a;

    /* renamed from: androidx.datastore.preferences.protobuf.j0$a */
    /* loaded from: classes.dex */
    static class a implements InterfaceC1195q0 {
        a() {
        }

        @Override // androidx.datastore.preferences.protobuf.InterfaceC1195q0
        /* renamed from: a */
        public InterfaceC1192p0 mo5987a(Class<?> cls) {
            throw new IllegalStateException("This should never be called.");
        }

        @Override // androidx.datastore.preferences.protobuf.InterfaceC1195q0
        /* renamed from: b */
        public boolean mo5988b(Class<?> cls) {
            return false;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: androidx.datastore.preferences.protobuf.j0$b */
    /* loaded from: classes.dex */
    public static class b implements InterfaceC1195q0 {

        /* renamed from: a */
        private InterfaceC1195q0[] f4882a;

        b(InterfaceC1195q0... interfaceC1195q0Arr) {
            this.f4882a = interfaceC1195q0Arr;
        }

        @Override // androidx.datastore.preferences.protobuf.InterfaceC1195q0
        /* renamed from: a */
        public InterfaceC1192p0 mo5987a(Class<?> cls) {
            for (InterfaceC1195q0 interfaceC1195q0 : this.f4882a) {
                if (interfaceC1195q0.mo5988b(cls)) {
                    return interfaceC1195q0.mo5987a(cls);
                }
            }
            throw new UnsupportedOperationException("No factory is available for message type: " + cls.getName());
        }

        @Override // androidx.datastore.preferences.protobuf.InterfaceC1195q0
        /* renamed from: b */
        public boolean mo5988b(Class<?> cls) {
            for (InterfaceC1195q0 interfaceC1195q0 : this.f4882a) {
                if (interfaceC1195q0.mo5988b(cls)) {
                    return true;
                }
            }
            return false;
        }
    }

    public C1174j0() {
        this(m5983b());
    }

    private C1174j0(InterfaceC1195q0 interfaceC1195q0) {
        this.f4881a = (InterfaceC1195q0) C1147a0.m5644b(interfaceC1195q0, "messageInfoFactory");
    }

    /* renamed from: b */
    private static InterfaceC1195q0 m5983b() {
        return new b(C1213x.m6541c(), m5984c());
    }

    /* renamed from: c */
    private static InterfaceC1195q0 m5984c() {
        try {
            return (InterfaceC1195q0) Class.forName("androidx.datastore.preferences.protobuf.DescriptorMessageInfoFactory").getDeclaredMethod("getInstance", new Class[0]).invoke(null, new Object[0]);
        } catch (Exception unused) {
            return f4880b;
        }
    }

    /* renamed from: d */
    private static boolean m5985d(InterfaceC1192p0 interfaceC1192p0) {
        return interfaceC1192p0.mo5766c() == EnumC1151b1.PROTO2;
    }

    /* renamed from: e */
    private static <T> InterfaceC1166g1<T> m5986e(Class<T> cls, InterfaceC1192p0 interfaceC1192p0) {
        return AbstractC1215y.class.isAssignableFrom(cls) ? m5985d(interfaceC1192p0) ? C1207u0.m6477N(cls, interfaceC1192p0, C1216y0.m6579b(), AbstractC1168h0.m5834b(), C1172i1.m5929M(), C1200s.m6376b(), C1189o0.m6253b()) : C1207u0.m6477N(cls, interfaceC1192p0, C1216y0.m6579b(), AbstractC1168h0.m5834b(), C1172i1.m5929M(), null, C1189o0.m6253b()) : m5985d(interfaceC1192p0) ? C1207u0.m6477N(cls, interfaceC1192p0, C1216y0.m6578a(), AbstractC1168h0.m5833a(), C1172i1.m5924H(), C1200s.m6375a(), C1189o0.m6252a()) : C1207u0.m6477N(cls, interfaceC1192p0, C1216y0.m6578a(), AbstractC1168h0.m5833a(), C1172i1.m5925I(), null, C1189o0.m6252a());
    }

    @Override // androidx.datastore.preferences.protobuf.InterfaceC1169h1
    /* renamed from: a */
    public <T> InterfaceC1166g1<T> mo5841a(Class<T> cls) {
        AbstractC1187n1<?, ?> m5924H;
        AbstractC1194q<?> m6375a;
        C1172i1.m5926J(cls);
        InterfaceC1192p0 mo5987a = this.f4881a.mo5987a(cls);
        if (!mo5987a.mo5764a()) {
            return m5986e(cls, mo5987a);
        }
        if (AbstractC1215y.class.isAssignableFrom(cls)) {
            m5924H = C1172i1.m5929M();
            m6375a = C1200s.m6376b();
        } else {
            m5924H = C1172i1.m5924H();
            m6375a = C1200s.m6375a();
        }
        return C1210v0.m6525l(m5924H, m6375a, mo5987a.mo5765b());
    }
}

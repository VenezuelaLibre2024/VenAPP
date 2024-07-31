package com.google.crypto.tink.shaded.protobuf;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: com.google.crypto.tink.shaded.protobuf.j0 */
/* loaded from: classes2.dex */
public final class C5977j0 implements InterfaceC5972h1 {

    /* renamed from: b */
    private static final InterfaceC5998q0 f12640b = new a();

    /* renamed from: a */
    private final InterfaceC5998q0 f12641a;

    /* renamed from: com.google.crypto.tink.shaded.protobuf.j0$a */
    /* loaded from: classes2.dex */
    class a implements InterfaceC5998q0 {
        a() {
        }

        @Override // com.google.crypto.tink.shaded.protobuf.InterfaceC5998q0
        /* renamed from: a */
        public InterfaceC5995p0 mo15671a(Class<?> cls) {
            throw new IllegalStateException("This should never be called.");
        }

        @Override // com.google.crypto.tink.shaded.protobuf.InterfaceC5998q0
        /* renamed from: b */
        public boolean mo15672b(Class<?> cls) {
            return false;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: com.google.crypto.tink.shaded.protobuf.j0$b */
    /* loaded from: classes2.dex */
    public static class b implements InterfaceC5998q0 {

        /* renamed from: a */
        private InterfaceC5998q0[] f12642a;

        b(InterfaceC5998q0... interfaceC5998q0Arr) {
            this.f12642a = interfaceC5998q0Arr;
        }

        @Override // com.google.crypto.tink.shaded.protobuf.InterfaceC5998q0
        /* renamed from: a */
        public InterfaceC5995p0 mo15671a(Class<?> cls) {
            for (InterfaceC5998q0 interfaceC5998q0 : this.f12642a) {
                if (interfaceC5998q0.mo15672b(cls)) {
                    return interfaceC5998q0.mo15671a(cls);
                }
            }
            throw new UnsupportedOperationException("No factory is available for message type: " + cls.getName());
        }

        @Override // com.google.crypto.tink.shaded.protobuf.InterfaceC5998q0
        /* renamed from: b */
        public boolean mo15672b(Class<?> cls) {
            for (InterfaceC5998q0 interfaceC5998q0 : this.f12642a) {
                if (interfaceC5998q0.mo15672b(cls)) {
                    return true;
                }
            }
            return false;
        }
    }

    public C5977j0() {
        this(m15667b());
    }

    private C5977j0(InterfaceC5998q0 interfaceC5998q0) {
        this.f12641a = (InterfaceC5998q0) C5950a0.m15303b(interfaceC5998q0, "messageInfoFactory");
    }

    /* renamed from: b */
    private static InterfaceC5998q0 m15667b() {
        return new b(C6016x.m16218c(), m15668c());
    }

    /* renamed from: c */
    private static InterfaceC5998q0 m15668c() {
        try {
            return (InterfaceC5998q0) Class.forName("com.google.crypto.tink.shaded.protobuf.DescriptorMessageInfoFactory").getDeclaredMethod("getInstance", new Class[0]).invoke(null, new Object[0]);
        } catch (Exception unused) {
            return f12640b;
        }
    }

    /* renamed from: d */
    private static boolean m15669d(InterfaceC5995p0 interfaceC5995p0) {
        return interfaceC5995p0.mo15402c() == EnumC5954b1.PROTO2;
    }

    /* renamed from: e */
    private static <T> InterfaceC5969g1<T> m15670e(Class<T> cls, InterfaceC5995p0 interfaceC5995p0) {
        return AbstractC6018y.class.isAssignableFrom(cls) ? m15669d(interfaceC5995p0) ? C6010u0.m16151U(cls, interfaceC5995p0, C6019y0.m16273b(), AbstractC5971h0.m15514b(), C5975i1.m15612M(), C6003s.m16041b(), C5992o0.m15912b()) : C6010u0.m16151U(cls, interfaceC5995p0, C6019y0.m16273b(), AbstractC5971h0.m15514b(), C5975i1.m15612M(), null, C5992o0.m15912b()) : m15669d(interfaceC5995p0) ? C6010u0.m16151U(cls, interfaceC5995p0, C6019y0.m16272a(), AbstractC5971h0.m15513a(), C5975i1.m15607H(), C6003s.m16040a(), C5992o0.m15911a()) : C6010u0.m16151U(cls, interfaceC5995p0, C6019y0.m16272a(), AbstractC5971h0.m15513a(), C5975i1.m15608I(), null, C5992o0.m15911a());
    }

    @Override // com.google.crypto.tink.shaded.protobuf.InterfaceC5972h1
    /* renamed from: a */
    public <T> InterfaceC5969g1<T> mo15521a(Class<T> cls) {
        AbstractC5990n1<?, ?> m15607H;
        AbstractC5997q<?> m16040a;
        C5975i1.m15609J(cls);
        InterfaceC5995p0 mo15671a = this.f12641a.mo15671a(cls);
        if (!mo15671a.mo15400a()) {
            return m15670e(cls, mo15671a);
        }
        if (AbstractC6018y.class.isAssignableFrom(cls)) {
            m15607H = C5975i1.m15612M();
            m16040a = C6003s.m16041b();
        } else {
            m15607H = C5975i1.m15607H();
            m16040a = C6003s.m16040a();
        }
        return C6013v0.m16202m(m15607H, m16040a, mo15671a.mo15401b());
    }
}

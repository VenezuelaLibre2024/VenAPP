package com.google.crypto.tink.shaded.protobuf;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes2.dex */
public final class j0 implements h1 {

    /* renamed from: b, reason: collision with root package name */
    private static final q0 f11425b = new a();

    /* renamed from: a, reason: collision with root package name */
    private final q0 f11426a;

    /* loaded from: classes2.dex */
    class a implements q0 {
        a() {
        }

        @Override // com.google.crypto.tink.shaded.protobuf.q0
        public p0 a(Class<?> cls) {
            throw new IllegalStateException("This should never be called.");
        }

        @Override // com.google.crypto.tink.shaded.protobuf.q0
        public boolean b(Class<?> cls) {
            return false;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes2.dex */
    public static class b implements q0 {

        /* renamed from: a, reason: collision with root package name */
        private q0[] f11427a;

        b(q0... q0VarArr) {
            this.f11427a = q0VarArr;
        }

        @Override // com.google.crypto.tink.shaded.protobuf.q0
        public p0 a(Class<?> cls) {
            for (q0 q0Var : this.f11427a) {
                if (q0Var.b(cls)) {
                    return q0Var.a(cls);
                }
            }
            throw new UnsupportedOperationException("No factory is available for message type: " + cls.getName());
        }

        @Override // com.google.crypto.tink.shaded.protobuf.q0
        public boolean b(Class<?> cls) {
            for (q0 q0Var : this.f11427a) {
                if (q0Var.b(cls)) {
                    return true;
                }
            }
            return false;
        }
    }

    public j0() {
        this(b());
    }

    private j0(q0 q0Var) {
        this.f11426a = (q0) a0.b(q0Var, "messageInfoFactory");
    }

    private static q0 b() {
        return new b(x.c(), c());
    }

    private static q0 c() {
        try {
            return (q0) Class.forName("com.google.crypto.tink.shaded.protobuf.DescriptorMessageInfoFactory").getDeclaredMethod("getInstance", new Class[0]).invoke(null, new Object[0]);
        } catch (Exception unused) {
            return f11425b;
        }
    }

    private static boolean d(p0 p0Var) {
        return p0Var.c() == b1.PROTO2;
    }

    private static <T> g1<T> e(Class<T> cls, p0 p0Var) {
        return y.class.isAssignableFrom(cls) ? d(p0Var) ? u0.U(cls, p0Var, y0.b(), h0.b(), i1.M(), s.b(), o0.b()) : u0.U(cls, p0Var, y0.b(), h0.b(), i1.M(), null, o0.b()) : d(p0Var) ? u0.U(cls, p0Var, y0.a(), h0.a(), i1.H(), s.a(), o0.a()) : u0.U(cls, p0Var, y0.a(), h0.a(), i1.I(), null, o0.a());
    }

    @Override // com.google.crypto.tink.shaded.protobuf.h1
    public <T> g1<T> a(Class<T> cls) {
        n1<?, ?> H;
        q<?> a10;
        i1.J(cls);
        p0 a11 = this.f11426a.a(cls);
        if (!a11.a()) {
            return e(cls, a11);
        }
        if (y.class.isAssignableFrom(cls)) {
            H = i1.M();
            a10 = s.b();
        } else {
            H = i1.H();
            a10 = s.a();
        }
        return v0.m(H, a10, a11.b());
    }
}

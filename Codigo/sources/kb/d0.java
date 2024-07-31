package kb;

import com.google.crypto.tink.internal.d;
import vb.y;

/* loaded from: classes2.dex */
public class d0 extends com.google.crypto.tink.internal.d<vb.e0> {

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes2.dex */
    public class a extends com.google.crypto.tink.internal.m<jb.a, vb.e0> {
        a(Class cls) {
            super(cls);
        }

        @Override // com.google.crypto.tink.internal.m
        /* renamed from: c */
        public jb.a a(vb.e0 e0Var) {
            String X = e0Var.Y().X();
            return jb.s.a(X).b(X);
        }
    }

    /* loaded from: classes2.dex */
    class b extends d.a<vb.f0, vb.e0> {
        b(Class cls) {
            super(cls);
        }

        @Override // com.google.crypto.tink.internal.d.a
        /* renamed from: f */
        public vb.e0 a(vb.f0 f0Var) {
            return vb.e0.a0().A(f0Var).B(d0.this.k()).build();
        }

        @Override // com.google.crypto.tink.internal.d.a
        /* renamed from: g */
        public vb.f0 d(com.google.crypto.tink.shaded.protobuf.h hVar) {
            return vb.f0.Y(hVar, com.google.crypto.tink.shaded.protobuf.p.b());
        }

        @Override // com.google.crypto.tink.internal.d.a
        /* renamed from: h */
        public void e(vb.f0 f0Var) {
        }
    }

    public d0() {
        super(vb.e0.class, new a(jb.a.class));
    }

    public static void m(boolean z10) {
        jb.x.l(new d0(), z10);
    }

    @Override // com.google.crypto.tink.internal.d
    public String d() {
        return "type.googleapis.com/google.crypto.tink.KmsAeadKey";
    }

    @Override // com.google.crypto.tink.internal.d
    public d.a<?, vb.e0> f() {
        return new b(vb.f0.class);
    }

    @Override // com.google.crypto.tink.internal.d
    public y.c g() {
        return y.c.REMOTE;
    }

    public int k() {
        return 0;
    }

    @Override // com.google.crypto.tink.internal.d
    /* renamed from: l */
    public vb.e0 h(com.google.crypto.tink.shaded.protobuf.h hVar) {
        return vb.e0.b0(hVar, com.google.crypto.tink.shaded.protobuf.p.b());
    }

    @Override // com.google.crypto.tink.internal.d
    /* renamed from: n */
    public void j(vb.e0 e0Var) {
        wb.r.c(e0Var.Z(), k());
    }
}

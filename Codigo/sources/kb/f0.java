package kb;

import com.google.crypto.tink.internal.d;
import java.security.GeneralSecurityException;
import vb.y;

/* loaded from: classes2.dex */
public class f0 extends com.google.crypto.tink.internal.d<vb.g0> {

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes2.dex */
    public class a extends com.google.crypto.tink.internal.m<jb.a, vb.g0> {
        a(Class cls) {
            super(cls);
        }

        @Override // com.google.crypto.tink.internal.m
        /* renamed from: c */
        public jb.a a(vb.g0 g0Var) {
            String Y = g0Var.Y().Y();
            return new e0(g0Var.Y().X(), jb.s.a(Y).b(Y));
        }
    }

    /* loaded from: classes2.dex */
    class b extends d.a<vb.h0, vb.g0> {
        b(Class cls) {
            super(cls);
        }

        @Override // com.google.crypto.tink.internal.d.a
        /* renamed from: f */
        public vb.g0 a(vb.h0 h0Var) {
            return vb.g0.a0().A(h0Var).B(f0.this.k()).build();
        }

        @Override // com.google.crypto.tink.internal.d.a
        /* renamed from: g */
        public vb.h0 d(com.google.crypto.tink.shaded.protobuf.h hVar) {
            return vb.h0.a0(hVar, com.google.crypto.tink.shaded.protobuf.p.b());
        }

        @Override // com.google.crypto.tink.internal.d.a
        /* renamed from: h */
        public void e(vb.h0 h0Var) {
            if (h0Var.Y().isEmpty() || !h0Var.Z()) {
                throw new GeneralSecurityException("invalid key format: missing KEK URI or DEK template");
            }
        }
    }

    public f0() {
        super(vb.g0.class, new a(jb.a.class));
    }

    public static void m(boolean z10) {
        jb.x.l(new f0(), z10);
    }

    @Override // com.google.crypto.tink.internal.d
    public String d() {
        return "type.googleapis.com/google.crypto.tink.KmsEnvelopeAeadKey";
    }

    @Override // com.google.crypto.tink.internal.d
    public d.a<?, vb.g0> f() {
        return new b(vb.h0.class);
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
    public vb.g0 h(com.google.crypto.tink.shaded.protobuf.h hVar) {
        return vb.g0.b0(hVar, com.google.crypto.tink.shaded.protobuf.p.b());
    }

    @Override // com.google.crypto.tink.internal.d
    /* renamed from: n */
    public void j(vb.g0 g0Var) {
        wb.r.c(g0Var.Z(), k());
    }
}

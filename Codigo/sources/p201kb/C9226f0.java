package p201kb;

import com.google.crypto.tink.internal.AbstractC5932d;
import com.google.crypto.tink.internal.AbstractC5941m;
import com.google.crypto.tink.shaded.protobuf.AbstractC5970h;
import com.google.crypto.tink.shaded.protobuf.C5994p;
import java.security.GeneralSecurityException;
import p179jb.C9027s;
import p179jb.C9032x;
import p179jb.InterfaceC9009a;
import p400vb.C11798g0;
import p400vb.C11800h0;
import p400vb.C11821y;
import p419wb.C12146r;

/* renamed from: kb.f0 */
/* loaded from: classes2.dex */
public class C9226f0 extends AbstractC5932d<C11798g0> {

    /* renamed from: kb.f0$a */
    /* loaded from: classes2.dex */
    class a extends AbstractC5941m<InterfaceC9009a, C11798g0> {
        a(Class cls) {
            super(cls);
        }

        @Override // com.google.crypto.tink.internal.AbstractC5941m
        /* renamed from: c, reason: merged with bridge method [inline-methods] */
        public InterfaceC9009a mo15252a(C11798g0 c11798g0) {
            String m37475Y = c11798g0.m37460Y().m37475Y();
            return new C9224e0(c11798g0.m37460Y().m37474X(), C9027s.m26494a(m37475Y).mo26493b(m37475Y));
        }
    }

    /* renamed from: kb.f0$b */
    /* loaded from: classes2.dex */
    class b extends AbstractC5932d.a<C11800h0, C11798g0> {
        b(Class cls) {
            super(cls);
        }

        @Override // com.google.crypto.tink.internal.AbstractC5932d.a
        /* renamed from: f, reason: merged with bridge method [inline-methods] */
        public C11798g0 mo15213a(C11800h0 c11800h0) {
            return C11798g0.m37456a0().m37462A(c11800h0).m37463B(C9226f0.this.m27445k()).build();
        }

        @Override // com.google.crypto.tink.internal.AbstractC5932d.a
        /* renamed from: g, reason: merged with bridge method [inline-methods] */
        public C11800h0 mo15216d(AbstractC5970h abstractC5970h) {
            return C11800h0.m37473a0(abstractC5970h, C5994p.m15932b());
        }

        @Override // com.google.crypto.tink.internal.AbstractC5932d.a
        /* renamed from: h, reason: merged with bridge method [inline-methods] */
        public void mo15217e(C11800h0 c11800h0) {
            if (c11800h0.m37475Y().isEmpty() || !c11800h0.m37476Z()) {
                throw new GeneralSecurityException("invalid key format: missing KEK URI or DEK template");
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public C9226f0() {
        super(C11798g0.class, new a(InterfaceC9009a.class));
    }

    /* renamed from: m */
    public static void m27444m(boolean z10) {
        C9032x.m26535l(new C9226f0(), z10);
    }

    @Override // com.google.crypto.tink.internal.AbstractC5932d
    /* renamed from: d */
    public String mo15206d() {
        return "type.googleapis.com/google.crypto.tink.KmsEnvelopeAeadKey";
    }

    @Override // com.google.crypto.tink.internal.AbstractC5932d
    /* renamed from: f */
    public AbstractC5932d.a<?, C11798g0> mo15208f() {
        return new b(C11800h0.class);
    }

    @Override // com.google.crypto.tink.internal.AbstractC5932d
    /* renamed from: g */
    public C11821y.c mo15209g() {
        return C11821y.c.REMOTE;
    }

    /* renamed from: k */
    public int m27445k() {
        return 0;
    }

    @Override // com.google.crypto.tink.internal.AbstractC5932d
    /* renamed from: l, reason: merged with bridge method [inline-methods] */
    public C11798g0 mo15210h(AbstractC5970h abstractC5970h) {
        return C11798g0.m37457b0(abstractC5970h, C5994p.m15932b());
    }

    @Override // com.google.crypto.tink.internal.AbstractC5932d
    /* renamed from: n, reason: merged with bridge method [inline-methods] */
    public void mo15212j(C11798g0 c11798g0) {
        C12146r.m38913c(c11798g0.m37461Z(), m27445k());
    }
}

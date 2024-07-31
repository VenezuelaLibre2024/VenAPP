package p201kb;

import com.google.crypto.tink.internal.AbstractC5932d;
import com.google.crypto.tink.internal.AbstractC5941m;
import com.google.crypto.tink.shaded.protobuf.AbstractC5970h;
import com.google.crypto.tink.shaded.protobuf.C5994p;
import p179jb.C9027s;
import p179jb.C9032x;
import p179jb.InterfaceC9009a;
import p400vb.C11794e0;
import p400vb.C11796f0;
import p400vb.C11821y;
import p419wb.C12146r;

/* renamed from: kb.d0 */
/* loaded from: classes2.dex */
public class C9222d0 extends AbstractC5932d<C11794e0> {

    /* renamed from: kb.d0$a */
    /* loaded from: classes2.dex */
    class a extends AbstractC5941m<InterfaceC9009a, C11794e0> {
        a(Class cls) {
            super(cls);
        }

        @Override // com.google.crypto.tink.internal.AbstractC5941m
        /* renamed from: c, reason: merged with bridge method [inline-methods] */
        public InterfaceC9009a mo15252a(C11794e0 c11794e0) {
            String m37440X = c11794e0.m37417Y().m37440X();
            return C9027s.m26494a(m37440X).mo26493b(m37440X);
        }
    }

    /* renamed from: kb.d0$b */
    /* loaded from: classes2.dex */
    class b extends AbstractC5932d.a<C11796f0, C11794e0> {
        b(Class cls) {
            super(cls);
        }

        @Override // com.google.crypto.tink.internal.AbstractC5932d.a
        /* renamed from: f, reason: merged with bridge method [inline-methods] */
        public C11794e0 mo15213a(C11796f0 c11796f0) {
            return C11794e0.m37413a0().m37419A(c11796f0).m37420B(C9222d0.this.m27416k()).build();
        }

        @Override // com.google.crypto.tink.internal.AbstractC5932d.a
        /* renamed from: g, reason: merged with bridge method [inline-methods] */
        public C11796f0 mo15216d(AbstractC5970h abstractC5970h) {
            return C11796f0.m37439Y(abstractC5970h, C5994p.m15932b());
        }

        @Override // com.google.crypto.tink.internal.AbstractC5932d.a
        /* renamed from: h, reason: merged with bridge method [inline-methods] */
        public void mo15217e(C11796f0 c11796f0) {
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public C9222d0() {
        super(C11794e0.class, new a(InterfaceC9009a.class));
    }

    /* renamed from: m */
    public static void m27415m(boolean z10) {
        C9032x.m26535l(new C9222d0(), z10);
    }

    @Override // com.google.crypto.tink.internal.AbstractC5932d
    /* renamed from: d */
    public String mo15206d() {
        return "type.googleapis.com/google.crypto.tink.KmsAeadKey";
    }

    @Override // com.google.crypto.tink.internal.AbstractC5932d
    /* renamed from: f */
    public AbstractC5932d.a<?, C11794e0> mo15208f() {
        return new b(C11796f0.class);
    }

    @Override // com.google.crypto.tink.internal.AbstractC5932d
    /* renamed from: g */
    public C11821y.c mo15209g() {
        return C11821y.c.REMOTE;
    }

    /* renamed from: k */
    public int m27416k() {
        return 0;
    }

    @Override // com.google.crypto.tink.internal.AbstractC5932d
    /* renamed from: l, reason: merged with bridge method [inline-methods] */
    public C11794e0 mo15210h(AbstractC5970h abstractC5970h) {
        return C11794e0.m37414b0(abstractC5970h, C5994p.m15932b());
    }

    @Override // com.google.crypto.tink.internal.AbstractC5932d
    /* renamed from: n, reason: merged with bridge method [inline-methods] */
    public void mo15212j(C11794e0 c11794e0) {
        C12146r.m38913c(c11794e0.m37418Z(), m27416k());
    }
}

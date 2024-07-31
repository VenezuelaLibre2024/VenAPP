package p201kb;

import com.google.crypto.tink.internal.AbstractC5932d;
import com.google.crypto.tink.internal.AbstractC5941m;
import com.google.crypto.tink.shaded.protobuf.AbstractC5970h;
import com.google.crypto.tink.shaded.protobuf.C5994p;
import java.security.GeneralSecurityException;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import p179jb.C9020l;
import p179jb.C9032x;
import p179jb.InterfaceC9009a;
import p400vb.C11806k0;
import p400vb.C11808l0;
import p400vb.C11821y;
import p419wb.C12144p;
import p419wb.C12146r;
import p419wb.C12147s;

/* renamed from: kb.h0 */
/* loaded from: classes2.dex */
public class C9230h0 extends AbstractC5932d<C11806k0> {

    /* renamed from: kb.h0$a */
    /* loaded from: classes2.dex */
    class a extends AbstractC5941m<InterfaceC9009a, C11806k0> {
        a(Class cls) {
            super(cls);
        }

        @Override // com.google.crypto.tink.internal.AbstractC5941m
        /* renamed from: c, reason: merged with bridge method [inline-methods] */
        public InterfaceC9009a mo15252a(C11806k0 c11806k0) {
            return new C12147s(c11806k0.m37521Y().m15502w());
        }
    }

    /* renamed from: kb.h0$b */
    /* loaded from: classes2.dex */
    class b extends AbstractC5932d.a<C11808l0, C11806k0> {
        b(Class cls) {
            super(cls);
        }

        @Override // com.google.crypto.tink.internal.AbstractC5932d.a
        /* renamed from: c */
        public Map<String, AbstractC5932d.a.C13195a<C11808l0>> mo15215c() {
            HashMap hashMap = new HashMap();
            hashMap.put("XCHACHA20_POLY1305", new AbstractC5932d.a.C13195a(C11808l0.m37537W(), C9020l.b.TINK));
            hashMap.put("XCHACHA20_POLY1305_RAW", new AbstractC5932d.a.C13195a(C11808l0.m37537W(), C9020l.b.RAW));
            return Collections.unmodifiableMap(hashMap);
        }

        @Override // com.google.crypto.tink.internal.AbstractC5932d.a
        /* renamed from: f, reason: merged with bridge method [inline-methods] */
        public C11806k0 mo15213a(C11808l0 c11808l0) {
            return C11806k0.m37517a0().m37524B(C9230h0.this.m27471k()).m37523A(AbstractC5970h.m15486k(C12144p.m38907c(32))).build();
        }

        @Override // com.google.crypto.tink.internal.AbstractC5932d.a
        /* renamed from: g, reason: merged with bridge method [inline-methods] */
        public C11808l0 mo15216d(AbstractC5970h abstractC5970h) {
            return C11808l0.m37538X(abstractC5970h, C5994p.m15932b());
        }

        @Override // com.google.crypto.tink.internal.AbstractC5932d.a
        /* renamed from: h, reason: merged with bridge method [inline-methods] */
        public void mo15217e(C11808l0 c11808l0) {
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public C9230h0() {
        super(C11806k0.class, new a(InterfaceC9009a.class));
    }

    /* renamed from: m */
    public static void m27470m(boolean z10) {
        C9032x.m26535l(new C9230h0(), z10);
        C9236k0.m27493c();
    }

    @Override // com.google.crypto.tink.internal.AbstractC5932d
    /* renamed from: d */
    public String mo15206d() {
        return "type.googleapis.com/google.crypto.tink.XChaCha20Poly1305Key";
    }

    @Override // com.google.crypto.tink.internal.AbstractC5932d
    /* renamed from: f */
    public AbstractC5932d.a<?, C11806k0> mo15208f() {
        return new b(C11808l0.class);
    }

    @Override // com.google.crypto.tink.internal.AbstractC5932d
    /* renamed from: g */
    public C11821y.c mo15209g() {
        return C11821y.c.SYMMETRIC;
    }

    /* renamed from: k */
    public int m27471k() {
        return 0;
    }

    @Override // com.google.crypto.tink.internal.AbstractC5932d
    /* renamed from: l, reason: merged with bridge method [inline-methods] */
    public C11806k0 mo15210h(AbstractC5970h abstractC5970h) {
        return C11806k0.m37518b0(abstractC5970h, C5994p.m15932b());
    }

    @Override // com.google.crypto.tink.internal.AbstractC5932d
    /* renamed from: n, reason: merged with bridge method [inline-methods] */
    public void mo15212j(C11806k0 c11806k0) {
        C12146r.m38913c(c11806k0.m37522Z(), m27471k());
        if (c11806k0.m37521Y().size() != 32) {
            throw new GeneralSecurityException("invalid XChaCha20Poly1305Key: incorrect key length");
        }
    }
}

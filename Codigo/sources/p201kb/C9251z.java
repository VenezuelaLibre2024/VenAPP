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
import p400vb.C11814r;
import p400vb.C11815s;
import p400vb.C11821y;
import p419wb.C12135g;
import p419wb.C12144p;
import p419wb.C12146r;

/* renamed from: kb.z */
/* loaded from: classes2.dex */
public class C9251z extends AbstractC5932d<C11814r> {

    /* renamed from: kb.z$a */
    /* loaded from: classes2.dex */
    class a extends AbstractC5941m<InterfaceC9009a, C11814r> {
        a(Class cls) {
            super(cls);
        }

        @Override // com.google.crypto.tink.internal.AbstractC5941m
        /* renamed from: c, reason: merged with bridge method [inline-methods] */
        public InterfaceC9009a mo15252a(C11814r c11814r) {
            return new C12135g(c11814r.m37589Y().m15502w());
        }
    }

    /* renamed from: kb.z$b */
    /* loaded from: classes2.dex */
    class b extends AbstractC5932d.a<C11815s, C11814r> {
        b(Class cls) {
            super(cls);
        }

        @Override // com.google.crypto.tink.internal.AbstractC5932d.a
        /* renamed from: c */
        public Map<String, AbstractC5932d.a.C13195a<C11815s>> mo15215c() {
            HashMap hashMap = new HashMap();
            hashMap.put("CHACHA20_POLY1305", new AbstractC5932d.a.C13195a(C11815s.m37594W(), C9020l.b.TINK));
            hashMap.put("CHACHA20_POLY1305_RAW", new AbstractC5932d.a.C13195a(C11815s.m37594W(), C9020l.b.RAW));
            return Collections.unmodifiableMap(hashMap);
        }

        @Override // com.google.crypto.tink.internal.AbstractC5932d.a
        /* renamed from: f, reason: merged with bridge method [inline-methods] */
        public C11814r mo15213a(C11815s c11815s) {
            return C11814r.m37585a0().m37592B(C9251z.this.m27565k()).m37591A(AbstractC5970h.m15486k(C12144p.m38907c(32))).build();
        }

        @Override // com.google.crypto.tink.internal.AbstractC5932d.a
        /* renamed from: g, reason: merged with bridge method [inline-methods] */
        public C11815s mo15216d(AbstractC5970h abstractC5970h) {
            return C11815s.m37595X(abstractC5970h, C5994p.m15932b());
        }

        @Override // com.google.crypto.tink.internal.AbstractC5932d.a
        /* renamed from: h, reason: merged with bridge method [inline-methods] */
        public void mo15217e(C11815s c11815s) {
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public C9251z() {
        super(C11814r.class, new a(InterfaceC9009a.class));
    }

    /* renamed from: m */
    public static void m27564m(boolean z10) {
        C9032x.m26535l(new C9251z(), z10);
        C9220c0.m27409c();
    }

    @Override // com.google.crypto.tink.internal.AbstractC5932d
    /* renamed from: d */
    public String mo15206d() {
        return "type.googleapis.com/google.crypto.tink.ChaCha20Poly1305Key";
    }

    @Override // com.google.crypto.tink.internal.AbstractC5932d
    /* renamed from: f */
    public AbstractC5932d.a<?, C11814r> mo15208f() {
        return new b(C11815s.class);
    }

    @Override // com.google.crypto.tink.internal.AbstractC5932d
    /* renamed from: g */
    public C11821y.c mo15209g() {
        return C11821y.c.SYMMETRIC;
    }

    /* renamed from: k */
    public int m27565k() {
        return 0;
    }

    @Override // com.google.crypto.tink.internal.AbstractC5932d
    /* renamed from: l, reason: merged with bridge method [inline-methods] */
    public C11814r mo15210h(AbstractC5970h abstractC5970h) {
        return C11814r.m37586b0(abstractC5970h, C5994p.m15932b());
    }

    @Override // com.google.crypto.tink.internal.AbstractC5932d
    /* renamed from: n, reason: merged with bridge method [inline-methods] */
    public void mo15212j(C11814r c11814r) {
        C12146r.m38913c(c11814r.m37590Z(), m27565k());
        if (c11814r.m37589Y().size() != 32) {
            throw new GeneralSecurityException("invalid ChaCha20Poly1305Key: incorrect key length");
        }
    }
}

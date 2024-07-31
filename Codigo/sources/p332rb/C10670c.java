package p332rb;

import com.google.crypto.tink.internal.AbstractC5932d;
import com.google.crypto.tink.internal.AbstractC5940l;
import com.google.crypto.tink.internal.AbstractC5941m;
import com.google.crypto.tink.internal.C5936h;
import com.google.crypto.tink.shaded.protobuf.AbstractC5970h;
import com.google.crypto.tink.shaded.protobuf.C5994p;
import java.security.GeneralSecurityException;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import p179jb.AbstractC9015g;
import p179jb.C9020l;
import p179jb.C9032x;
import p179jb.InterfaceC9028t;
import p400vb.C11785a;
import p400vb.C11787b;
import p400vb.C11789c;
import p400vb.C11821y;
import p419wb.C12141m;
import p419wb.C12143o;
import p419wb.C12144p;
import p419wb.C12146r;
import sb.C10881b;

/* renamed from: rb.c */
/* loaded from: classes2.dex */
public final class C10670c extends AbstractC5932d<C11785a> {

    /* renamed from: d */
    private static final AbstractC5940l<C10668a, InterfaceC10674g> f26974d = AbstractC5940l.m15247b(new AbstractC5940l.b() { // from class: rb.b
        @Override // com.google.crypto.tink.internal.AbstractC5940l.b
        /* renamed from: a */
        public final Object mo15251a(AbstractC9015g abstractC9015g) {
            return new C10881b((C10668a) abstractC9015g);
        }
    }, C10668a.class, InterfaceC10674g.class);

    /* renamed from: rb.c$a */
    /* loaded from: classes2.dex */
    class a extends AbstractC5941m<InterfaceC9028t, C11785a> {
        a(Class cls) {
            super(cls);
        }

        @Override // com.google.crypto.tink.internal.AbstractC5941m
        /* renamed from: c, reason: merged with bridge method [inline-methods] */
        public InterfaceC9028t mo15252a(C11785a c11785a) {
            return new C12143o(new C12141m(c11785a.m37282Z().m15502w()), c11785a.m37283a0().m37320Y());
        }
    }

    /* renamed from: rb.c$b */
    /* loaded from: classes2.dex */
    class b extends AbstractC5932d.a<C11787b, C11785a> {
        b(Class cls) {
            super(cls);
        }

        @Override // com.google.crypto.tink.internal.AbstractC5932d.a
        /* renamed from: c */
        public Map<String, AbstractC5932d.a.C13195a<C11787b>> mo15215c() {
            HashMap hashMap = new HashMap();
            C11787b build = C11787b.m37306a0().m37312A(32).m37313B(C11789c.m37318Z().m37321A(16).build()).build();
            C9020l.b bVar = C9020l.b.TINK;
            hashMap.put("AES_CMAC", new AbstractC5932d.a.C13195a(build, bVar));
            hashMap.put("AES256_CMAC", new AbstractC5932d.a.C13195a(C11787b.m37306a0().m37312A(32).m37313B(C11789c.m37318Z().m37321A(16).build()).build(), bVar));
            hashMap.put("AES256_CMAC_RAW", new AbstractC5932d.a.C13195a(C11787b.m37306a0().m37312A(32).m37313B(C11789c.m37318Z().m37321A(16).build()).build(), C9020l.b.RAW));
            return Collections.unmodifiableMap(hashMap);
        }

        @Override // com.google.crypto.tink.internal.AbstractC5932d.a
        /* renamed from: f, reason: merged with bridge method [inline-methods] */
        public C11785a mo15213a(C11787b c11787b) {
            return C11785a.m37277c0().m37287C(0).m37285A(AbstractC5970h.m15486k(C12144p.m38907c(c11787b.m37310Y()))).m37286B(c11787b.m37311Z()).build();
        }

        @Override // com.google.crypto.tink.internal.AbstractC5932d.a
        /* renamed from: g, reason: merged with bridge method [inline-methods] */
        public C11787b mo15216d(AbstractC5970h abstractC5970h) {
            return C11787b.m37307b0(abstractC5970h, C5994p.m15932b());
        }

        @Override // com.google.crypto.tink.internal.AbstractC5932d.a
        /* renamed from: h, reason: merged with bridge method [inline-methods] */
        public void mo15217e(C11787b c11787b) {
            C10670c.m32470q(c11787b.m37311Z());
            C10670c.m32471r(c11787b.m37310Y());
        }
    }

    C10670c() {
        super(C11785a.class, new a(InterfaceC9028t.class));
    }

    /* renamed from: o */
    public static void m32469o(boolean z10) {
        C9032x.m26535l(new C10670c(), z10);
        C10673f.m32491c();
        C5936h.m15227c().m15230d(f26974d);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: q */
    public static void m32470q(C11789c c11789c) {
        if (c11789c.m37320Y() < 10) {
            throw new GeneralSecurityException("tag size too short");
        }
        if (c11789c.m37320Y() > 16) {
            throw new GeneralSecurityException("tag size too long");
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: r */
    public static void m32471r(int i10) {
        if (i10 != 32) {
            throw new GeneralSecurityException("AesCmacKey size wrong, must be 32 bytes");
        }
    }

    @Override // com.google.crypto.tink.internal.AbstractC5932d
    /* renamed from: d */
    public String mo15206d() {
        return "type.googleapis.com/google.crypto.tink.AesCmacKey";
    }

    @Override // com.google.crypto.tink.internal.AbstractC5932d
    /* renamed from: f */
    public AbstractC5932d.a<?, C11785a> mo15208f() {
        return new b(C11787b.class);
    }

    @Override // com.google.crypto.tink.internal.AbstractC5932d
    /* renamed from: g */
    public C11821y.c mo15209g() {
        return C11821y.c.SYMMETRIC;
    }

    /* renamed from: m */
    public int m32472m() {
        return 0;
    }

    @Override // com.google.crypto.tink.internal.AbstractC5932d
    /* renamed from: n, reason: merged with bridge method [inline-methods] */
    public C11785a mo15210h(AbstractC5970h abstractC5970h) {
        return C11785a.m37278d0(abstractC5970h, C5994p.m15932b());
    }

    @Override // com.google.crypto.tink.internal.AbstractC5932d
    /* renamed from: p, reason: merged with bridge method [inline-methods] */
    public void mo15212j(C11785a c11785a) {
        C12146r.m38913c(c11785a.m37284b0(), m32472m());
        m32471r(c11785a.m37282Z().size());
        m32470q(c11785a.m37283a0());
    }
}

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
import p400vb.C11801i;
import p400vb.C11803j;
import p400vb.C11805k;
import p400vb.C11821y;
import p419wb.C12130b;
import p419wb.C12144p;
import p419wb.C12146r;

/* renamed from: kb.h */
/* loaded from: classes2.dex */
public final class C9229h extends AbstractC5932d<C11801i> {

    /* renamed from: kb.h$a */
    /* loaded from: classes2.dex */
    class a extends AbstractC5941m<InterfaceC9009a, C11801i> {
        a(Class cls) {
            super(cls);
        }

        @Override // com.google.crypto.tink.internal.AbstractC5941m
        /* renamed from: c, reason: merged with bridge method [inline-methods] */
        public InterfaceC9009a mo15252a(C11801i c11801i) {
            return new C12130b(c11801i.m37486Z().m15502w(), c11801i.m37487a0().m37512Y());
        }
    }

    /* renamed from: kb.h$b */
    /* loaded from: classes2.dex */
    class b extends AbstractC5932d.a<C11803j, C11801i> {
        b(Class cls) {
            super(cls);
        }

        @Override // com.google.crypto.tink.internal.AbstractC5932d.a
        /* renamed from: c */
        public Map<String, AbstractC5932d.a.C13195a<C11803j>> mo15215c() {
            HashMap hashMap = new HashMap();
            C9020l.b bVar = C9020l.b.TINK;
            hashMap.put("AES128_EAX", C9229h.m27461l(16, 16, bVar));
            C9020l.b bVar2 = C9020l.b.RAW;
            hashMap.put("AES128_EAX_RAW", C9229h.m27461l(16, 16, bVar2));
            hashMap.put("AES256_EAX", C9229h.m27461l(32, 16, bVar));
            hashMap.put("AES256_EAX_RAW", C9229h.m27461l(32, 16, bVar2));
            return Collections.unmodifiableMap(hashMap);
        }

        @Override // com.google.crypto.tink.internal.AbstractC5932d.a
        /* renamed from: f, reason: merged with bridge method [inline-methods] */
        public C11801i mo15213a(C11803j c11803j) {
            return C11801i.m37481c0().m37489A(AbstractC5970h.m15486k(C12144p.m38907c(c11803j.m37501Y()))).m37490B(c11803j.m37502Z()).m37491C(C9229h.this.m27463m()).build();
        }

        @Override // com.google.crypto.tink.internal.AbstractC5932d.a
        /* renamed from: g, reason: merged with bridge method [inline-methods] */
        public C11803j mo15216d(AbstractC5970h abstractC5970h) {
            return C11803j.m37498b0(abstractC5970h, C5994p.m15932b());
        }

        @Override // com.google.crypto.tink.internal.AbstractC5932d.a
        /* renamed from: h, reason: merged with bridge method [inline-methods] */
        public void mo15217e(C11803j c11803j) {
            C12146r.m38911a(c11803j.m37501Y());
            if (c11803j.m37502Z().m37512Y() != 12 && c11803j.m37502Z().m37512Y() != 16) {
                throw new GeneralSecurityException("invalid IV size; acceptable values have 12 or 16 bytes");
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public C9229h() {
        super(C11801i.class, new a(InterfaceC9009a.class));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: l */
    public static AbstractC5932d.a.C13195a<C11803j> m27461l(int i10, int i11, C9020l.b bVar) {
        return new AbstractC5932d.a.C13195a<>(C11803j.m37497a0().m37503A(i10).m37504B(C11805k.m37510Z().m37513A(i11).build()).build(), bVar);
    }

    /* renamed from: o */
    public static void m27462o(boolean z10) {
        C9032x.m26535l(new C9229h(), z10);
        C9239n.m27498c();
    }

    @Override // com.google.crypto.tink.internal.AbstractC5932d
    /* renamed from: d */
    public String mo15206d() {
        return "type.googleapis.com/google.crypto.tink.AesEaxKey";
    }

    @Override // com.google.crypto.tink.internal.AbstractC5932d
    /* renamed from: f */
    public AbstractC5932d.a<?, C11801i> mo15208f() {
        return new b(C11803j.class);
    }

    @Override // com.google.crypto.tink.internal.AbstractC5932d
    /* renamed from: g */
    public C11821y.c mo15209g() {
        return C11821y.c.SYMMETRIC;
    }

    /* renamed from: m */
    public int m27463m() {
        return 0;
    }

    @Override // com.google.crypto.tink.internal.AbstractC5932d
    /* renamed from: n, reason: merged with bridge method [inline-methods] */
    public C11801i mo15210h(AbstractC5970h abstractC5970h) {
        return C11801i.m37482d0(abstractC5970h, C5994p.m15932b());
    }

    @Override // com.google.crypto.tink.internal.AbstractC5932d
    /* renamed from: p, reason: merged with bridge method [inline-methods] */
    public void mo15212j(C11801i c11801i) {
        C12146r.m38913c(c11801i.m37488b0(), m27463m());
        C12146r.m38911a(c11801i.m37486Z().size());
        if (c11801i.m37487a0().m37512Y() != 12 && c11801i.m37487a0().m37512Y() != 16) {
            throw new GeneralSecurityException("invalid IV size; acceptable values have 12 or 16 bytes");
        }
    }
}

package p201kb;

import com.google.crypto.tink.internal.AbstractC5932d;
import com.google.crypto.tink.internal.AbstractC5941m;
import com.google.crypto.tink.shaded.protobuf.AbstractC5970h;
import com.google.crypto.tink.shaded.protobuf.C5994p;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import p179jb.C9020l;
import p179jb.C9032x;
import p179jb.InterfaceC9009a;
import p271ob.C9830b;
import p400vb.C11807l;
import p400vb.C11809m;
import p400vb.C11821y;
import p419wb.C12131c;
import p419wb.C12144p;
import p419wb.C12146r;

/* renamed from: kb.p */
/* loaded from: classes2.dex */
public final class C9241p extends AbstractC5932d<C11807l> {

    /* renamed from: kb.p$a */
    /* loaded from: classes2.dex */
    class a extends AbstractC5941m<InterfaceC9009a, C11807l> {
        a(Class cls) {
            super(cls);
        }

        @Override // com.google.crypto.tink.internal.AbstractC5941m
        /* renamed from: c, reason: merged with bridge method [inline-methods] */
        public InterfaceC9009a mo15252a(C11807l c11807l) {
            return new C12131c(c11807l.m37532Y().m15502w());
        }
    }

    /* renamed from: kb.p$b */
    /* loaded from: classes2.dex */
    class b extends AbstractC5932d.a<C11809m, C11807l> {
        b(Class cls) {
            super(cls);
        }

        @Override // com.google.crypto.tink.internal.AbstractC5932d.a
        /* renamed from: c */
        public Map<String, AbstractC5932d.a.C13195a<C11809m>> mo15215c() {
            HashMap hashMap = new HashMap();
            C9020l.b bVar = C9020l.b.TINK;
            hashMap.put("AES128_GCM", C9241p.m27508l(16, bVar));
            C9020l.b bVar2 = C9020l.b.RAW;
            hashMap.put("AES128_GCM_RAW", C9241p.m27508l(16, bVar2));
            hashMap.put("AES256_GCM", C9241p.m27508l(32, bVar));
            hashMap.put("AES256_GCM_RAW", C9241p.m27508l(32, bVar2));
            return Collections.unmodifiableMap(hashMap);
        }

        @Override // com.google.crypto.tink.internal.AbstractC5932d.a
        /* renamed from: f, reason: merged with bridge method [inline-methods] */
        public C11807l mo15213a(C11809m c11809m) {
            return C11807l.m37528a0().m37534A(AbstractC5970h.m15486k(C12144p.m38907c(c11809m.m37544X()))).m37535B(C9241p.this.m27510m()).build();
        }

        @Override // com.google.crypto.tink.internal.AbstractC5932d.a
        /* renamed from: g, reason: merged with bridge method [inline-methods] */
        public C11809m mo15216d(AbstractC5970h abstractC5970h) {
            return C11809m.m37542Z(abstractC5970h, C5994p.m15932b());
        }

        @Override // com.google.crypto.tink.internal.AbstractC5932d.a
        /* renamed from: h, reason: merged with bridge method [inline-methods] */
        public void mo15217e(C11809m c11809m) {
            C12146r.m38911a(c11809m.m37544X());
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public C9241p() {
        super(C11807l.class, new a(InterfaceC9009a.class));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: l */
    public static AbstractC5932d.a.C13195a<C11809m> m27508l(int i10, C9020l.b bVar) {
        return new AbstractC5932d.a.C13195a<>(C11809m.m37541Y().m37545A(i10).build(), bVar);
    }

    /* renamed from: o */
    public static void m27509o(boolean z10) {
        C9032x.m26535l(new C9241p(), z10);
        C9244s.m27530c();
    }

    @Override // com.google.crypto.tink.internal.AbstractC5932d
    /* renamed from: a */
    public C9830b.b mo15203a() {
        return C9830b.b.ALGORITHM_REQUIRES_BORINGCRYPTO;
    }

    @Override // com.google.crypto.tink.internal.AbstractC5932d
    /* renamed from: d */
    public String mo15206d() {
        return "type.googleapis.com/google.crypto.tink.AesGcmKey";
    }

    @Override // com.google.crypto.tink.internal.AbstractC5932d
    /* renamed from: f */
    public AbstractC5932d.a<?, C11807l> mo15208f() {
        return new b(C11809m.class);
    }

    @Override // com.google.crypto.tink.internal.AbstractC5932d
    /* renamed from: g */
    public C11821y.c mo15209g() {
        return C11821y.c.SYMMETRIC;
    }

    /* renamed from: m */
    public int m27510m() {
        return 0;
    }

    @Override // com.google.crypto.tink.internal.AbstractC5932d
    /* renamed from: n, reason: merged with bridge method [inline-methods] */
    public C11807l mo15210h(AbstractC5970h abstractC5970h) {
        return C11807l.m37529b0(abstractC5970h, C5994p.m15932b());
    }

    @Override // com.google.crypto.tink.internal.AbstractC5932d
    /* renamed from: p, reason: merged with bridge method [inline-methods] */
    public void mo15212j(C11807l c11807l) {
        C12146r.m38913c(c11807l.m37533Z(), m27510m());
        C12146r.m38911a(c11807l.m37532Y().size());
    }
}

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
import p179jb.InterfaceC9028t;
import p271ob.C9830b;
import p332rb.C10678k;
import p400vb.C11791d;
import p400vb.C11793e;
import p400vb.C11795f;
import p400vb.C11797g;
import p400vb.C11799h;
import p400vb.C11819w;
import p400vb.C11820x;
import p400vb.C11821y;
import p400vb.EnumC11817u;
import p419wb.C12136h;
import p419wb.C12146r;
import p419wb.InterfaceC12140l;

/* renamed from: kb.e */
/* loaded from: classes2.dex */
public final class C9223e extends AbstractC5932d<C11791d> {

    /* renamed from: kb.e$a */
    /* loaded from: classes2.dex */
    class a extends AbstractC5941m<InterfaceC9009a, C11791d> {
        a(Class cls) {
            super(cls);
        }

        @Override // com.google.crypto.tink.internal.AbstractC5941m
        /* renamed from: c, reason: merged with bridge method [inline-methods] */
        public InterfaceC9009a mo15252a(C11791d c11791d) {
            return new C12136h((InterfaceC12140l) new C9225f().m15207e(c11791d.m37368Z(), InterfaceC12140l.class), (InterfaceC9028t) new C10678k().m15207e(c11791d.m37369a0(), InterfaceC9028t.class), c11791d.m37369a0().m37619b0().m37644a0());
        }
    }

    /* renamed from: kb.e$b */
    /* loaded from: classes2.dex */
    class b extends AbstractC5932d.a<C11793e, C11791d> {
        b(Class cls) {
            super(cls);
        }

        @Override // com.google.crypto.tink.internal.AbstractC5932d.a
        /* renamed from: c */
        public Map<String, AbstractC5932d.a.C13195a<C11793e>> mo15215c() {
            HashMap hashMap = new HashMap();
            EnumC11817u enumC11817u = EnumC11817u.SHA256;
            C9020l.b bVar = C9020l.b.TINK;
            hashMap.put("AES128_CTR_HMAC_SHA256", C9223e.m27424l(16, 16, 32, 16, enumC11817u, bVar));
            C9020l.b bVar2 = C9020l.b.RAW;
            hashMap.put("AES128_CTR_HMAC_SHA256_RAW", C9223e.m27424l(16, 16, 32, 16, enumC11817u, bVar2));
            hashMap.put("AES256_CTR_HMAC_SHA256", C9223e.m27424l(32, 16, 32, 32, enumC11817u, bVar));
            hashMap.put("AES256_CTR_HMAC_SHA256_RAW", C9223e.m27424l(32, 16, 32, 32, enumC11817u, bVar2));
            return Collections.unmodifiableMap(hashMap);
        }

        @Override // com.google.crypto.tink.internal.AbstractC5932d.a
        /* renamed from: f, reason: merged with bridge method [inline-methods] */
        public C11791d mo15213a(C11793e c11793e) {
            C11795f mo15213a = new C9225f().mo15208f().mo15213a(c11793e.m37406Y());
            return C11791d.m37363c0().m37371A(mo15213a).m37372B(new C10678k().mo15208f().mo15213a(c11793e.m37407Z())).m37373C(C9223e.this.m27427n()).build();
        }

        @Override // com.google.crypto.tink.internal.AbstractC5932d.a
        /* renamed from: g, reason: merged with bridge method [inline-methods] */
        public C11793e mo15216d(AbstractC5970h abstractC5970h) {
            return C11793e.m37403b0(abstractC5970h, C5994p.m15932b());
        }

        @Override // com.google.crypto.tink.internal.AbstractC5932d.a
        /* renamed from: h, reason: merged with bridge method [inline-methods] */
        public void mo15217e(C11793e c11793e) {
            new C9225f().mo15208f().mo15217e(c11793e.m37406Y());
            new C10678k().mo15208f().mo15217e(c11793e.m37407Z());
            C12146r.m38911a(c11793e.m37406Y().m37449Z());
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public C9223e() {
        super(C11791d.class, new a(InterfaceC9009a.class));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: l */
    public static AbstractC5932d.a.C13195a<C11793e> m27424l(int i10, int i11, int i12, int i13, EnumC11817u enumC11817u, C9020l.b bVar) {
        return new AbstractC5932d.a.C13195a<>(m27425m(i10, i11, i12, i13, enumC11817u), bVar);
    }

    /* renamed from: m */
    private static C11793e m27425m(int i10, int i11, int i12, int i13, EnumC11817u enumC11817u) {
        C11797g build = C11797g.m37445b0().m37452B(C11799h.m37467Z().m37470A(i11).build()).m37451A(i10).build();
        return C11793e.m37402a0().m37408A(build).m37409B(C11819w.m37628b0().m37635B(C11820x.m37640b0().m37645A(enumC11817u).m37646B(i13).build()).m37634A(i12).build()).build();
    }

    /* renamed from: p */
    public static void m27426p(boolean z10) {
        C9032x.m26535l(new C9223e(), z10);
    }

    @Override // com.google.crypto.tink.internal.AbstractC5932d
    /* renamed from: a */
    public C9830b.b mo15203a() {
        return C9830b.b.ALGORITHM_REQUIRES_BORINGCRYPTO;
    }

    @Override // com.google.crypto.tink.internal.AbstractC5932d
    /* renamed from: d */
    public String mo15206d() {
        return "type.googleapis.com/google.crypto.tink.AesCtrHmacAeadKey";
    }

    @Override // com.google.crypto.tink.internal.AbstractC5932d
    /* renamed from: f */
    public AbstractC5932d.a<?, C11791d> mo15208f() {
        return new b(C11793e.class);
    }

    @Override // com.google.crypto.tink.internal.AbstractC5932d
    /* renamed from: g */
    public C11821y.c mo15209g() {
        return C11821y.c.SYMMETRIC;
    }

    /* renamed from: n */
    public int m27427n() {
        return 0;
    }

    @Override // com.google.crypto.tink.internal.AbstractC5932d
    /* renamed from: o, reason: merged with bridge method [inline-methods] */
    public C11791d mo15210h(AbstractC5970h abstractC5970h) {
        return C11791d.m37364d0(abstractC5970h, C5994p.m15932b());
    }

    @Override // com.google.crypto.tink.internal.AbstractC5932d
    /* renamed from: q, reason: merged with bridge method [inline-methods] */
    public void mo15212j(C11791d c11791d) {
        C12146r.m38913c(c11791d.m37370b0(), m27427n());
        new C9225f().mo15212j(c11791d.m37368Z());
        new C10678k().mo15212j(c11791d.m37369a0());
    }
}

package p179jb;

import com.google.crypto.tink.internal.AbstractC5932d;
import com.google.crypto.tink.shaded.protobuf.AbstractC5970h;
import com.google.crypto.tink.shaded.protobuf.C5953b0;
import com.google.crypto.tink.shaded.protobuf.InterfaceC6001r0;
import java.security.GeneralSecurityException;
import p400vb.C11821y;

/* renamed from: jb.i */
/* loaded from: classes2.dex */
class C9017i<PrimitiveT, KeyProtoT extends InterfaceC6001r0> implements InterfaceC9016h<PrimitiveT> {

    /* renamed from: a */
    private final AbstractC5932d<KeyProtoT> f21612a;

    /* renamed from: b */
    private final Class<PrimitiveT> f21613b;

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: jb.i$a */
    /* loaded from: classes2.dex */
    public static class a<KeyFormatProtoT extends InterfaceC6001r0, KeyProtoT extends InterfaceC6001r0> {

        /* renamed from: a */
        final AbstractC5932d.a<KeyFormatProtoT, KeyProtoT> f21614a;

        a(AbstractC5932d.a<KeyFormatProtoT, KeyProtoT> aVar) {
            this.f21614a = aVar;
        }

        /* renamed from: b */
        private KeyProtoT m26440b(KeyFormatProtoT keyformatprotot) {
            this.f21614a.mo15217e(keyformatprotot);
            return this.f21614a.mo15213a(keyformatprotot);
        }

        /* renamed from: a */
        KeyProtoT m26441a(AbstractC5970h abstractC5970h) {
            return m26440b(this.f21614a.mo15216d(abstractC5970h));
        }
    }

    public C9017i(AbstractC5932d<KeyProtoT> abstractC5932d, Class<PrimitiveT> cls) {
        if (!abstractC5932d.m15211i().contains(cls) && !Void.class.equals(cls)) {
            throw new IllegalArgumentException(String.format("Given internalKeyMananger %s does not support primitive class %s", abstractC5932d.toString(), cls.getName()));
        }
        this.f21612a = abstractC5932d;
        this.f21613b = cls;
    }

    /* renamed from: e */
    private a<?, KeyProtoT> m26438e() {
        return new a<>(this.f21612a.mo15208f());
    }

    /* renamed from: f */
    private PrimitiveT m26439f(KeyProtoT keyprotot) {
        if (Void.class.equals(this.f21613b)) {
            throw new GeneralSecurityException("Cannot create a primitive for Void");
        }
        this.f21612a.mo15212j(keyprotot);
        return (PrimitiveT) this.f21612a.m15207e(keyprotot, this.f21613b);
    }

    @Override // p179jb.InterfaceC9016h
    /* renamed from: a */
    public final C11821y mo26434a(AbstractC5970h abstractC5970h) {
        try {
            return C11821y.m37652d0().m37660B(mo26435b()).m37661C(m26438e().m26441a(abstractC5970h).mo15292b()).m37659A(this.f21612a.mo15209g()).build();
        } catch (C5953b0 e10) {
            throw new GeneralSecurityException("Unexpected proto", e10);
        }
    }

    @Override // p179jb.InterfaceC9016h
    /* renamed from: b */
    public final String mo26435b() {
        return this.f21612a.mo15206d();
    }

    @Override // p179jb.InterfaceC9016h
    /* renamed from: c */
    public final PrimitiveT mo26436c(AbstractC5970h abstractC5970h) {
        try {
            return m26439f(this.f21612a.mo15210h(abstractC5970h));
        } catch (C5953b0 e10) {
            throw new GeneralSecurityException("Failures parsing proto of type " + this.f21612a.m15205c().getName(), e10);
        }
    }

    @Override // p179jb.InterfaceC9016h
    /* renamed from: d */
    public final InterfaceC6001r0 mo26437d(AbstractC5970h abstractC5970h) {
        try {
            return m26438e().m26441a(abstractC5970h);
        } catch (C5953b0 e10) {
            throw new GeneralSecurityException("Failures parsing proto of type " + this.f21612a.mo15208f().m15214b().getName(), e10);
        }
    }
}

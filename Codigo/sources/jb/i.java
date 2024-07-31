package jb;

import com.google.crypto.tink.internal.d;
import com.google.crypto.tink.shaded.protobuf.b0;
import com.google.crypto.tink.shaded.protobuf.r0;
import java.security.GeneralSecurityException;

/* loaded from: classes2.dex */
class i<PrimitiveT, KeyProtoT extends r0> implements h<PrimitiveT> {

    /* renamed from: a, reason: collision with root package name */
    private final com.google.crypto.tink.internal.d<KeyProtoT> f19833a;

    /* renamed from: b, reason: collision with root package name */
    private final Class<PrimitiveT> f19834b;

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes2.dex */
    public static class a<KeyFormatProtoT extends r0, KeyProtoT extends r0> {

        /* renamed from: a, reason: collision with root package name */
        final d.a<KeyFormatProtoT, KeyProtoT> f19835a;

        a(d.a<KeyFormatProtoT, KeyProtoT> aVar) {
            this.f19835a = aVar;
        }

        private KeyProtoT b(KeyFormatProtoT keyformatprotot) {
            this.f19835a.e(keyformatprotot);
            return this.f19835a.a(keyformatprotot);
        }

        KeyProtoT a(com.google.crypto.tink.shaded.protobuf.h hVar) {
            return b(this.f19835a.d(hVar));
        }
    }

    public i(com.google.crypto.tink.internal.d<KeyProtoT> dVar, Class<PrimitiveT> cls) {
        if (!dVar.i().contains(cls) && !Void.class.equals(cls)) {
            throw new IllegalArgumentException(String.format("Given internalKeyMananger %s does not support primitive class %s", dVar.toString(), cls.getName()));
        }
        this.f19833a = dVar;
        this.f19834b = cls;
    }

    private a<?, KeyProtoT> e() {
        return new a<>(this.f19833a.f());
    }

    private PrimitiveT f(KeyProtoT keyprotot) {
        if (Void.class.equals(this.f19834b)) {
            throw new GeneralSecurityException("Cannot create a primitive for Void");
        }
        this.f19833a.j(keyprotot);
        return (PrimitiveT) this.f19833a.e(keyprotot, this.f19834b);
    }

    @Override // jb.h
    public final vb.y a(com.google.crypto.tink.shaded.protobuf.h hVar) {
        try {
            return vb.y.d0().B(b()).C(e().a(hVar).b()).A(this.f19833a.g()).build();
        } catch (b0 e10) {
            throw new GeneralSecurityException("Unexpected proto", e10);
        }
    }

    @Override // jb.h
    public final String b() {
        return this.f19833a.d();
    }

    @Override // jb.h
    public final PrimitiveT c(com.google.crypto.tink.shaded.protobuf.h hVar) {
        try {
            return f(this.f19833a.h(hVar));
        } catch (b0 e10) {
            throw new GeneralSecurityException("Failures parsing proto of type " + this.f19833a.c().getName(), e10);
        }
    }

    @Override // jb.h
    public final r0 d(com.google.crypto.tink.shaded.protobuf.h hVar) {
        try {
            return e().a(hVar);
        } catch (b0 e10) {
            throw new GeneralSecurityException("Failures parsing proto of type " + this.f19833a.f().b().getName(), e10);
        }
    }
}

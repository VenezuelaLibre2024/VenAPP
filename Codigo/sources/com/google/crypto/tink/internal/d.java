package com.google.crypto.tink.internal;

import com.google.crypto.tink.shaded.protobuf.r0;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import jb.l;
import ob.b;
import vb.y;

/* loaded from: classes2.dex */
public abstract class d<KeyProtoT extends r0> {

    /* renamed from: a */
    private final Class<KeyProtoT> f11280a;

    /* renamed from: b */
    private final Map<Class<?>, m<?, KeyProtoT>> f11281b;

    /* renamed from: c */
    private final Class<?> f11282c;

    /* loaded from: classes2.dex */
    public static abstract class a<KeyFormatProtoT extends r0, KeyProtoT extends r0> {

        /* renamed from: a */
        private final Class<KeyFormatProtoT> f11283a;

        /* renamed from: com.google.crypto.tink.internal.d$a$a */
        /* loaded from: classes2.dex */
        public static final class C0170a<KeyFormatProtoT> {

            /* renamed from: a */
            public KeyFormatProtoT f11284a;

            /* renamed from: b */
            public l.b f11285b;

            public C0170a(KeyFormatProtoT keyformatprotot, l.b bVar) {
                this.f11284a = keyformatprotot;
                this.f11285b = bVar;
            }
        }

        public a(Class<KeyFormatProtoT> cls) {
            this.f11283a = cls;
        }

        public abstract KeyProtoT a(KeyFormatProtoT keyformatprotot);

        public final Class<KeyFormatProtoT> b() {
            return this.f11283a;
        }

        public Map<String, C0170a<KeyFormatProtoT>> c() {
            return Collections.emptyMap();
        }

        public abstract KeyFormatProtoT d(com.google.crypto.tink.shaded.protobuf.h hVar);

        public abstract void e(KeyFormatProtoT keyformatprotot);
    }

    @SafeVarargs
    public d(Class<KeyProtoT> cls, m<?, KeyProtoT>... mVarArr) {
        this.f11280a = cls;
        HashMap hashMap = new HashMap();
        for (m<?, KeyProtoT> mVar : mVarArr) {
            if (hashMap.containsKey(mVar.b())) {
                throw new IllegalArgumentException("KeyTypeManager constructed with duplicate factories for primitive " + mVar.b().getCanonicalName());
            }
            hashMap.put(mVar.b(), mVar);
        }
        this.f11282c = mVarArr.length > 0 ? mVarArr[0].b() : Void.class;
        this.f11281b = Collections.unmodifiableMap(hashMap);
    }

    public b.EnumC0370b a() {
        return b.EnumC0370b.ALGORITHM_NOT_FIPS;
    }

    public final Class<?> b() {
        return this.f11282c;
    }

    public final Class<KeyProtoT> c() {
        return this.f11280a;
    }

    public abstract String d();

    public final <P> P e(KeyProtoT keyprotot, Class<P> cls) {
        m<?, KeyProtoT> mVar = this.f11281b.get(cls);
        if (mVar != null) {
            return (P) mVar.a(keyprotot);
        }
        throw new IllegalArgumentException("Requested primitive class " + cls.getCanonicalName() + " not supported.");
    }

    public abstract a<?, KeyProtoT> f();

    public abstract y.c g();

    public abstract KeyProtoT h(com.google.crypto.tink.shaded.protobuf.h hVar);

    public final Set<Class<?>> i() {
        return this.f11281b.keySet();
    }

    public abstract void j(KeyProtoT keyprotot);
}

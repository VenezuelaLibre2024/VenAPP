package com.google.crypto.tink.internal;

import com.google.crypto.tink.shaded.protobuf.AbstractC5970h;
import com.google.crypto.tink.shaded.protobuf.InterfaceC6001r0;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import p179jb.C9020l;
import p271ob.C9830b;
import p400vb.C11821y;

/* renamed from: com.google.crypto.tink.internal.d */
/* loaded from: classes2.dex */
public abstract class AbstractC5932d<KeyProtoT extends InterfaceC6001r0> {

    /* renamed from: a */
    private final Class<KeyProtoT> f12495a;

    /* renamed from: b */
    private final Map<Class<?>, AbstractC5941m<?, KeyProtoT>> f12496b;

    /* renamed from: c */
    private final Class<?> f12497c;

    /* renamed from: com.google.crypto.tink.internal.d$a */
    /* loaded from: classes2.dex */
    public static abstract class a<KeyFormatProtoT extends InterfaceC6001r0, KeyProtoT extends InterfaceC6001r0> {

        /* renamed from: a */
        private final Class<KeyFormatProtoT> f12498a;

        /* renamed from: com.google.crypto.tink.internal.d$a$a, reason: collision with other inner class name */
        /* loaded from: classes2.dex */
        public static final class C13195a<KeyFormatProtoT> {

            /* renamed from: a */
            public KeyFormatProtoT f12499a;

            /* renamed from: b */
            public C9020l.b f12500b;

            public C13195a(KeyFormatProtoT keyformatprotot, C9020l.b bVar) {
                this.f12499a = keyformatprotot;
                this.f12500b = bVar;
            }
        }

        public a(Class<KeyFormatProtoT> cls) {
            this.f12498a = cls;
        }

        /* renamed from: a */
        public abstract KeyProtoT mo15213a(KeyFormatProtoT keyformatprotot);

        /* renamed from: b */
        public final Class<KeyFormatProtoT> m15214b() {
            return this.f12498a;
        }

        /* renamed from: c */
        public Map<String, C13195a<KeyFormatProtoT>> mo15215c() {
            return Collections.emptyMap();
        }

        /* renamed from: d */
        public abstract KeyFormatProtoT mo15216d(AbstractC5970h abstractC5970h);

        /* renamed from: e */
        public abstract void mo15217e(KeyFormatProtoT keyformatprotot);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @SafeVarargs
    public AbstractC5932d(Class<KeyProtoT> cls, AbstractC5941m<?, KeyProtoT>... abstractC5941mArr) {
        this.f12495a = cls;
        HashMap hashMap = new HashMap();
        for (AbstractC5941m<?, KeyProtoT> abstractC5941m : abstractC5941mArr) {
            if (hashMap.containsKey(abstractC5941m.m15253b())) {
                throw new IllegalArgumentException("KeyTypeManager constructed with duplicate factories for primitive " + abstractC5941m.m15253b().getCanonicalName());
            }
            hashMap.put(abstractC5941m.m15253b(), abstractC5941m);
        }
        this.f12497c = abstractC5941mArr.length > 0 ? abstractC5941mArr[0].m15253b() : Void.class;
        this.f12496b = Collections.unmodifiableMap(hashMap);
    }

    /* renamed from: a */
    public C9830b.b mo15203a() {
        return C9830b.b.ALGORITHM_NOT_FIPS;
    }

    /* renamed from: b */
    public final Class<?> m15204b() {
        return this.f12497c;
    }

    /* renamed from: c */
    public final Class<KeyProtoT> m15205c() {
        return this.f12495a;
    }

    /* renamed from: d */
    public abstract String mo15206d();

    /* renamed from: e */
    public final <P> P m15207e(KeyProtoT keyprotot, Class<P> cls) {
        AbstractC5941m<?, KeyProtoT> abstractC5941m = this.f12496b.get(cls);
        if (abstractC5941m != null) {
            return (P) abstractC5941m.mo15252a(keyprotot);
        }
        throw new IllegalArgumentException("Requested primitive class " + cls.getCanonicalName() + " not supported.");
    }

    /* renamed from: f */
    public abstract a<?, KeyProtoT> mo15208f();

    /* renamed from: g */
    public abstract C11821y.c mo15209g();

    /* renamed from: h */
    public abstract KeyProtoT mo15210h(AbstractC5970h abstractC5970h);

    /* renamed from: i */
    public final Set<Class<?>> m15211i() {
        return this.f12496b.keySet();
    }

    /* renamed from: j */
    public abstract void mo15212j(KeyProtoT keyprotot);
}

package com.google.protobuf;

import com.google.protobuf.C6621t1;

/* renamed from: com.google.protobuf.k0 */
/* loaded from: classes2.dex */
public class C6593k0<K, V> {

    /* renamed from: a */
    private final a<K, V> f14548a;

    /* renamed from: b */
    private final K f14549b;

    /* renamed from: c */
    private final V f14550c;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.google.protobuf.k0$a */
    /* loaded from: classes2.dex */
    public static class a<K, V> {

        /* renamed from: a */
        public final C6621t1.b f14551a;

        /* renamed from: b */
        public final K f14552b;

        /* renamed from: c */
        public final C6621t1.b f14553c;

        /* renamed from: d */
        public final V f14554d;

        public a(C6621t1.b bVar, K k10, C6621t1.b bVar2, V v10) {
            this.f14551a = bVar;
            this.f14552b = k10;
            this.f14553c = bVar2;
            this.f14554d = v10;
        }
    }

    private C6593k0(C6621t1.b bVar, K k10, C6621t1.b bVar2, V v10) {
        this.f14548a = new a<>(bVar, k10, bVar2, v10);
        this.f14549b = k10;
        this.f14550c = v10;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: b */
    public static <K, V> int m18905b(a<K, V> aVar, K k10, V v10) {
        return C6619t.m19151d(aVar.f14551a, 1, k10) + C6619t.m19151d(aVar.f14553c, 2, v10);
    }

    /* renamed from: d */
    public static <K, V> C6593k0<K, V> m18906d(C6621t1.b bVar, K k10, C6621t1.b bVar2, V v10) {
        return new C6593k0<>(bVar, k10, bVar2, v10);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: e */
    public static <K, V> void m18907e(AbstractC6589j abstractC6589j, a<K, V> aVar, K k10, V v10) {
        C6619t.m19148A(abstractC6589j, aVar.f14551a, 1, k10);
        C6619t.m19148A(abstractC6589j, aVar.f14553c, 2, v10);
    }

    /* renamed from: a */
    public int m18908a(int i10, K k10, V v10) {
        return AbstractC6589j.m18725U(i10) + AbstractC6589j.m18707C(m18905b(this.f14548a, k10, v10));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: c */
    public a<K, V> m18909c() {
        return this.f14548a;
    }
}

package androidx.datastore.preferences.protobuf;

import androidx.datastore.preferences.protobuf.C1205t1;

/* renamed from: androidx.datastore.preferences.protobuf.k0 */
/* loaded from: classes.dex */
public class C1177k0<K, V> {

    /* renamed from: a */
    private final a<K, V> f4917a;

    /* renamed from: b */
    private final K f4918b;

    /* renamed from: c */
    private final V f4919c;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: androidx.datastore.preferences.protobuf.k0$a */
    /* loaded from: classes.dex */
    public static class a<K, V> {

        /* renamed from: a */
        public final C1205t1.b f4920a;

        /* renamed from: b */
        public final K f4921b;

        /* renamed from: c */
        public final C1205t1.b f4922c;

        /* renamed from: d */
        public final V f4923d;

        public a(C1205t1.b bVar, K k10, C1205t1.b bVar2, V v10) {
            this.f4920a = bVar;
            this.f4921b = k10;
            this.f4922c = bVar2;
            this.f4923d = v10;
        }
    }

    private C1177k0(C1205t1.b bVar, K k10, C1205t1.b bVar2, V v10) {
        this.f4917a = new a<>(bVar, k10, bVar2, v10);
        this.f4918b = k10;
        this.f4919c = v10;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: b */
    public static <K, V> int m6136b(a<K, V> aVar, K k10, V v10) {
        return C1206u.m6433d(aVar.f4920a, 1, k10) + C1206u.m6433d(aVar.f4922c, 2, v10);
    }

    /* renamed from: d */
    public static <K, V> C1177k0<K, V> m6137d(C1205t1.b bVar, K k10, C1205t1.b bVar2, V v10) {
        return new C1177k0<>(bVar, k10, bVar2, v10);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: e */
    public static <K, V> void m6138e(AbstractC1176k abstractC1176k, a<K, V> aVar, K k10, V v10) {
        C1206u.m6444z(abstractC1176k, aVar.f4920a, 1, k10);
        C1206u.m6444z(abstractC1176k, aVar.f4922c, 2, v10);
    }

    /* renamed from: a */
    public int m6139a(int i10, K k10, V v10) {
        return AbstractC1176k.m6039V(i10) + AbstractC1176k.m6020C(m6136b(this.f4917a, k10, v10));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: c */
    public a<K, V> m6140c() {
        return this.f4917a;
    }
}

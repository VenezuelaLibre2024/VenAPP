package androidx.datastore.preferences.protobuf;

import androidx.datastore.preferences.protobuf.t1;

/* loaded from: classes.dex */
public class k0<K, V> {

    /* renamed from: a, reason: collision with root package name */
    private final a<K, V> f4206a;

    /* renamed from: b, reason: collision with root package name */
    private final K f4207b;

    /* renamed from: c, reason: collision with root package name */
    private final V f4208c;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public static class a<K, V> {

        /* renamed from: a, reason: collision with root package name */
        public final t1.b f4209a;

        /* renamed from: b, reason: collision with root package name */
        public final K f4210b;

        /* renamed from: c, reason: collision with root package name */
        public final t1.b f4211c;

        /* renamed from: d, reason: collision with root package name */
        public final V f4212d;

        public a(t1.b bVar, K k10, t1.b bVar2, V v10) {
            this.f4209a = bVar;
            this.f4210b = k10;
            this.f4211c = bVar2;
            this.f4212d = v10;
        }
    }

    private k0(t1.b bVar, K k10, t1.b bVar2, V v10) {
        this.f4206a = new a<>(bVar, k10, bVar2, v10);
        this.f4207b = k10;
        this.f4208c = v10;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static <K, V> int b(a<K, V> aVar, K k10, V v10) {
        return u.d(aVar.f4209a, 1, k10) + u.d(aVar.f4211c, 2, v10);
    }

    public static <K, V> k0<K, V> d(t1.b bVar, K k10, t1.b bVar2, V v10) {
        return new k0<>(bVar, k10, bVar2, v10);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static <K, V> void e(k kVar, a<K, V> aVar, K k10, V v10) {
        u.z(kVar, aVar.f4209a, 1, k10);
        u.z(kVar, aVar.f4211c, 2, v10);
    }

    public int a(int i10, K k10, V v10) {
        return k.V(i10) + k.C(b(this.f4206a, k10, v10));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public a<K, V> c() {
        return this.f4206a;
    }
}

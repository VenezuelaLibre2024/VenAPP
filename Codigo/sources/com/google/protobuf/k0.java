package com.google.protobuf;

import com.google.protobuf.t1;

/* loaded from: classes2.dex */
public class k0<K, V> {

    /* renamed from: a, reason: collision with root package name */
    private final a<K, V> f13274a;

    /* renamed from: b, reason: collision with root package name */
    private final K f13275b;

    /* renamed from: c, reason: collision with root package name */
    private final V f13276c;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes2.dex */
    public static class a<K, V> {

        /* renamed from: a, reason: collision with root package name */
        public final t1.b f13277a;

        /* renamed from: b, reason: collision with root package name */
        public final K f13278b;

        /* renamed from: c, reason: collision with root package name */
        public final t1.b f13279c;

        /* renamed from: d, reason: collision with root package name */
        public final V f13280d;

        public a(t1.b bVar, K k10, t1.b bVar2, V v10) {
            this.f13277a = bVar;
            this.f13278b = k10;
            this.f13279c = bVar2;
            this.f13280d = v10;
        }
    }

    private k0(t1.b bVar, K k10, t1.b bVar2, V v10) {
        this.f13274a = new a<>(bVar, k10, bVar2, v10);
        this.f13275b = k10;
        this.f13276c = v10;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static <K, V> int b(a<K, V> aVar, K k10, V v10) {
        return t.d(aVar.f13277a, 1, k10) + t.d(aVar.f13279c, 2, v10);
    }

    public static <K, V> k0<K, V> d(t1.b bVar, K k10, t1.b bVar2, V v10) {
        return new k0<>(bVar, k10, bVar2, v10);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static <K, V> void e(j jVar, a<K, V> aVar, K k10, V v10) {
        t.A(jVar, aVar.f13277a, 1, k10);
        t.A(jVar, aVar.f13279c, 2, v10);
    }

    public int a(int i10, K k10, V v10) {
        return j.U(i10) + j.C(b(this.f13274a, k10, v10));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public a<K, V> c() {
        return this.f13274a;
    }
}

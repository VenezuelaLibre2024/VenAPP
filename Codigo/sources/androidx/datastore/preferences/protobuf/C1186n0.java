package androidx.datastore.preferences.protobuf;

import androidx.datastore.preferences.protobuf.C1177k0;
import java.util.Map;

/* renamed from: androidx.datastore.preferences.protobuf.n0 */
/* loaded from: classes.dex */
class C1186n0 implements InterfaceC1183m0 {
    /* renamed from: i */
    private static <K, V> int m6227i(int i10, Object obj, Object obj2) {
        C1180l0 c1180l0 = (C1180l0) obj;
        C1177k0 c1177k0 = (C1177k0) obj2;
        int i11 = 0;
        if (c1180l0.isEmpty()) {
            return 0;
        }
        for (Map.Entry<K, V> entry : c1180l0.entrySet()) {
            i11 += c1177k0.m6139a(i10, entry.getKey(), entry.getValue());
        }
        return i11;
    }

    /* renamed from: j */
    private static <K, V> C1180l0<K, V> m6228j(Object obj, Object obj2) {
        C1180l0<K, V> c1180l0 = (C1180l0) obj;
        C1180l0<K, V> c1180l02 = (C1180l0) obj2;
        if (!c1180l02.isEmpty()) {
            if (!c1180l0.m6198j()) {
                c1180l0 = c1180l0.m6201m();
            }
            c1180l0.m6200l(c1180l02);
        }
        return c1180l0;
    }

    @Override // androidx.datastore.preferences.protobuf.InterfaceC1183m0
    /* renamed from: a */
    public Object mo6218a(Object obj, Object obj2) {
        return m6228j(obj, obj2);
    }

    @Override // androidx.datastore.preferences.protobuf.InterfaceC1183m0
    /* renamed from: b */
    public C1177k0.a<?, ?> mo6219b(Object obj) {
        return ((C1177k0) obj).m6140c();
    }

    @Override // androidx.datastore.preferences.protobuf.InterfaceC1183m0
    /* renamed from: c */
    public Map<?, ?> mo6220c(Object obj) {
        return (C1180l0) obj;
    }

    @Override // androidx.datastore.preferences.protobuf.InterfaceC1183m0
    /* renamed from: d */
    public Object mo6221d(Object obj) {
        return C1180l0.m6194d().m6201m();
    }

    @Override // androidx.datastore.preferences.protobuf.InterfaceC1183m0
    /* renamed from: e */
    public Map<?, ?> mo6222e(Object obj) {
        return (C1180l0) obj;
    }

    @Override // androidx.datastore.preferences.protobuf.InterfaceC1183m0
    /* renamed from: f */
    public Object mo6223f(Object obj) {
        ((C1180l0) obj).m6199k();
        return obj;
    }

    @Override // androidx.datastore.preferences.protobuf.InterfaceC1183m0
    /* renamed from: g */
    public int mo6224g(int i10, Object obj, Object obj2) {
        return m6227i(i10, obj, obj2);
    }

    @Override // androidx.datastore.preferences.protobuf.InterfaceC1183m0
    /* renamed from: h */
    public boolean mo6225h(Object obj) {
        return !((C1180l0) obj).m6198j();
    }
}

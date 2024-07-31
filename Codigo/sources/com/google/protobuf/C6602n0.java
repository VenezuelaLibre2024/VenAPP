package com.google.protobuf;

import com.google.protobuf.C6593k0;
import java.util.Map;

/* renamed from: com.google.protobuf.n0 */
/* loaded from: classes2.dex */
class C6602n0 implements InterfaceC6599m0 {
    /* renamed from: i */
    private static <K, V> int m18951i(int i10, Object obj, Object obj2) {
        C6596l0 c6596l0 = (C6596l0) obj;
        C6593k0 c6593k0 = (C6593k0) obj2;
        int i11 = 0;
        if (c6596l0.isEmpty()) {
            return 0;
        }
        for (Map.Entry<K, V> entry : c6596l0.entrySet()) {
            i11 += c6593k0.m18908a(i10, entry.getKey(), entry.getValue());
        }
        return i11;
    }

    /* renamed from: j */
    private static <K, V> C6596l0<K, V> m18952j(Object obj, Object obj2) {
        C6596l0<K, V> c6596l0 = (C6596l0) obj;
        C6596l0<K, V> c6596l02 = (C6596l0) obj2;
        if (!c6596l02.isEmpty()) {
            if (!c6596l0.m18931j()) {
                c6596l0 = c6596l0.m18934m();
            }
            c6596l0.m18933l(c6596l02);
        }
        return c6596l0;
    }

    @Override // com.google.protobuf.InterfaceC6599m0
    /* renamed from: a */
    public Object mo18939a(Object obj, Object obj2) {
        return m18952j(obj, obj2);
    }

    @Override // com.google.protobuf.InterfaceC6599m0
    /* renamed from: b */
    public C6593k0.a<?, ?> mo18940b(Object obj) {
        return ((C6593k0) obj).m18909c();
    }

    @Override // com.google.protobuf.InterfaceC6599m0
    /* renamed from: c */
    public Map<?, ?> mo18941c(Object obj) {
        return (C6596l0) obj;
    }

    @Override // com.google.protobuf.InterfaceC6599m0
    /* renamed from: d */
    public Object mo18942d(Object obj) {
        return C6596l0.m18927d().m18934m();
    }

    @Override // com.google.protobuf.InterfaceC6599m0
    /* renamed from: e */
    public Map<?, ?> mo18943e(Object obj) {
        return (C6596l0) obj;
    }

    @Override // com.google.protobuf.InterfaceC6599m0
    /* renamed from: f */
    public Object mo18944f(Object obj) {
        ((C6596l0) obj).m18932k();
        return obj;
    }

    @Override // com.google.protobuf.InterfaceC6599m0
    /* renamed from: g */
    public int mo18945g(int i10, Object obj, Object obj2) {
        return m18951i(i10, obj, obj2);
    }

    @Override // com.google.protobuf.InterfaceC6599m0
    /* renamed from: h */
    public boolean mo18946h(Object obj) {
        return !((C6596l0) obj).m18931j();
    }
}

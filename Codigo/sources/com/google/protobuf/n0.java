package com.google.protobuf;

import com.google.protobuf.k0;
import java.util.Map;

/* loaded from: classes2.dex */
class n0 implements m0 {
    private static <K, V> int i(int i10, Object obj, Object obj2) {
        l0 l0Var = (l0) obj;
        k0 k0Var = (k0) obj2;
        int i11 = 0;
        if (l0Var.isEmpty()) {
            return 0;
        }
        for (Map.Entry<K, V> entry : l0Var.entrySet()) {
            i11 += k0Var.a(i10, entry.getKey(), entry.getValue());
        }
        return i11;
    }

    private static <K, V> l0<K, V> j(Object obj, Object obj2) {
        l0<K, V> l0Var = (l0) obj;
        l0<K, V> l0Var2 = (l0) obj2;
        if (!l0Var2.isEmpty()) {
            if (!l0Var.j()) {
                l0Var = l0Var.m();
            }
            l0Var.l(l0Var2);
        }
        return l0Var;
    }

    @Override // com.google.protobuf.m0
    public Object a(Object obj, Object obj2) {
        return j(obj, obj2);
    }

    @Override // com.google.protobuf.m0
    public k0.a<?, ?> b(Object obj) {
        return ((k0) obj).c();
    }

    @Override // com.google.protobuf.m0
    public Map<?, ?> c(Object obj) {
        return (l0) obj;
    }

    @Override // com.google.protobuf.m0
    public Object d(Object obj) {
        return l0.d().m();
    }

    @Override // com.google.protobuf.m0
    public Map<?, ?> e(Object obj) {
        return (l0) obj;
    }

    @Override // com.google.protobuf.m0
    public Object f(Object obj) {
        ((l0) obj).k();
        return obj;
    }

    @Override // com.google.protobuf.m0
    public int g(int i10, Object obj, Object obj2) {
        return i(i10, obj, obj2);
    }

    @Override // com.google.protobuf.m0
    public boolean h(Object obj) {
        return !((l0) obj).j();
    }
}

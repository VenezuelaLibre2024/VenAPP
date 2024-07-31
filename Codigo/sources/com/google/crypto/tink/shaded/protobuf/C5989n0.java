package com.google.crypto.tink.shaded.protobuf;

import com.google.crypto.tink.shaded.protobuf.C5980k0;
import java.util.Map;

/* renamed from: com.google.crypto.tink.shaded.protobuf.n0 */
/* loaded from: classes2.dex */
class C5989n0 implements InterfaceC5986m0 {
    /* renamed from: i */
    private static <K, V> int m15886i(int i10, Object obj, Object obj2) {
        C5983l0 c5983l0 = (C5983l0) obj;
        C5980k0 c5980k0 = (C5980k0) obj2;
        int i11 = 0;
        if (c5983l0.isEmpty()) {
            return 0;
        }
        for (Map.Entry<K, V> entry : c5983l0.entrySet()) {
            i11 += c5980k0.m15802a(i10, entry.getKey(), entry.getValue());
        }
        return i11;
    }

    /* renamed from: j */
    private static <K, V> C5983l0<K, V> m15887j(Object obj, Object obj2) {
        C5983l0<K, V> c5983l0 = (C5983l0) obj;
        C5983l0<K, V> c5983l02 = (C5983l0) obj2;
        if (!c5983l02.isEmpty()) {
            if (!c5983l0.m15857j()) {
                c5983l0 = c5983l0.m15860m();
            }
            c5983l0.m15859l(c5983l02);
        }
        return c5983l0;
    }

    @Override // com.google.crypto.tink.shaded.protobuf.InterfaceC5986m0
    /* renamed from: a */
    public Object mo15877a(Object obj, Object obj2) {
        return m15887j(obj, obj2);
    }

    @Override // com.google.crypto.tink.shaded.protobuf.InterfaceC5986m0
    /* renamed from: b */
    public C5980k0.a<?, ?> mo15878b(Object obj) {
        ((C5980k0) obj).m15803c();
        return null;
    }

    @Override // com.google.crypto.tink.shaded.protobuf.InterfaceC5986m0
    /* renamed from: c */
    public Map<?, ?> mo15879c(Object obj) {
        return (C5983l0) obj;
    }

    @Override // com.google.crypto.tink.shaded.protobuf.InterfaceC5986m0
    /* renamed from: d */
    public Object mo15880d(Object obj) {
        return C5983l0.m15853d().m15860m();
    }

    @Override // com.google.crypto.tink.shaded.protobuf.InterfaceC5986m0
    /* renamed from: e */
    public Map<?, ?> mo15881e(Object obj) {
        return (C5983l0) obj;
    }

    @Override // com.google.crypto.tink.shaded.protobuf.InterfaceC5986m0
    /* renamed from: f */
    public Object mo15882f(Object obj) {
        ((C5983l0) obj).m15858k();
        return obj;
    }

    @Override // com.google.crypto.tink.shaded.protobuf.InterfaceC5986m0
    /* renamed from: g */
    public int mo15883g(int i10, Object obj, Object obj2) {
        return m15886i(i10, obj, obj2);
    }

    @Override // com.google.crypto.tink.shaded.protobuf.InterfaceC5986m0
    /* renamed from: h */
    public boolean mo15884h(Object obj) {
        return !((C5983l0) obj).m15857j();
    }
}

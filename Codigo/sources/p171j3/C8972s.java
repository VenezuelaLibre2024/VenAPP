package p171j3;

import java.util.HashMap;
import java.util.Map;
import p129h3.InterfaceC7622f;

/* renamed from: j3.s */
/* loaded from: classes.dex */
final class C8972s {

    /* renamed from: a */
    private final Map<InterfaceC7622f, C8965l<?>> f21477a = new HashMap();

    /* renamed from: b */
    private final Map<InterfaceC7622f, C8965l<?>> f21478b = new HashMap();

    /* renamed from: b */
    private Map<InterfaceC7622f, C8965l<?>> m26324b(boolean z10) {
        return z10 ? this.f21478b : this.f21477a;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a */
    public C8965l<?> m26325a(InterfaceC7622f interfaceC7622f, boolean z10) {
        return m26324b(z10).get(interfaceC7622f);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: c */
    public void m26326c(InterfaceC7622f interfaceC7622f, C8965l<?> c8965l) {
        m26324b(c8965l.m26295p()).put(interfaceC7622f, c8965l);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: d */
    public void m26327d(InterfaceC7622f interfaceC7622f, C8965l<?> c8965l) {
        Map<InterfaceC7622f, C8965l<?>> m26324b = m26324b(c8965l.m26295p());
        if (c8965l.equals(m26324b.get(interfaceC7622f))) {
            m26324b.remove(interfaceC7622f);
        }
    }
}

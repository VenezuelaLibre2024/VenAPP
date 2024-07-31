package p354t;

import androidx.camera.camera2.internal.InterfaceC0575x2;
import androidx.camera.core.impl.C0668t1;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import p342s.C10742h;

/* renamed from: t.h */
/* loaded from: classes.dex */
public class C10943h {

    /* renamed from: a */
    private final C10742h f27839a;

    @FunctionalInterface
    /* renamed from: t.h$a */
    /* loaded from: classes.dex */
    public interface a {
        /* renamed from: a */
        void mo2413a(InterfaceC0575x2 interfaceC0575x2);
    }

    public C10943h(C0668t1 c0668t1) {
        this.f27839a = (C10742h) c0668t1.m3238b(C10742h.class);
    }

    /* renamed from: a */
    private void m33416a(Set<InterfaceC0575x2> set) {
        for (InterfaceC0575x2 interfaceC0575x2 : set) {
            interfaceC0575x2.mo2342c().mo2355p(interfaceC0575x2);
        }
    }

    /* renamed from: b */
    private void m33417b(Set<InterfaceC0575x2> set) {
        for (InterfaceC0575x2 interfaceC0575x2 : set) {
            interfaceC0575x2.mo2342c().mo2356q(interfaceC0575x2);
        }
    }

    /* renamed from: c */
    public void m33418c(InterfaceC0575x2 interfaceC0575x2, List<InterfaceC0575x2> list, List<InterfaceC0575x2> list2, a aVar) {
        InterfaceC0575x2 next;
        InterfaceC0575x2 next2;
        if (m33419d()) {
            LinkedHashSet linkedHashSet = new LinkedHashSet();
            Iterator<InterfaceC0575x2> it = list.iterator();
            while (it.hasNext() && (next2 = it.next()) != interfaceC0575x2) {
                linkedHashSet.add(next2);
            }
            m33417b(linkedHashSet);
        }
        aVar.mo2413a(interfaceC0575x2);
        if (m33419d()) {
            LinkedHashSet linkedHashSet2 = new LinkedHashSet();
            Iterator<InterfaceC0575x2> it2 = list2.iterator();
            while (it2.hasNext() && (next = it2.next()) != interfaceC0575x2) {
                linkedHashSet2.add(next);
            }
            m33416a(linkedHashSet2);
        }
    }

    /* renamed from: d */
    public boolean m33419d() {
        return this.f27839a != null;
    }
}

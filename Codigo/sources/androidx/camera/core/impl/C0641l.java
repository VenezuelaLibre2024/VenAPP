package androidx.camera.core.impl;

import java.util.Iterator;
import java.util.List;

/* renamed from: androidx.camera.core.impl.l */
/* loaded from: classes.dex */
public final class C0641l extends AbstractC0637k {

    /* renamed from: a */
    private final List<AbstractC0637k> f2874a;

    @Override // androidx.camera.core.impl.AbstractC0637k
    /* renamed from: a */
    public void mo2410a() {
        Iterator<AbstractC0637k> it = this.f2874a.iterator();
        while (it.hasNext()) {
            it.next().mo2410a();
        }
    }

    @Override // androidx.camera.core.impl.AbstractC0637k
    /* renamed from: b */
    public void mo2411b(InterfaceC0663s interfaceC0663s) {
        Iterator<AbstractC0637k> it = this.f2874a.iterator();
        while (it.hasNext()) {
            it.next().mo2411b(interfaceC0663s);
        }
    }

    @Override // androidx.camera.core.impl.AbstractC0637k
    /* renamed from: c */
    public void mo2412c(C0645m c0645m) {
        Iterator<AbstractC0637k> it = this.f2874a.iterator();
        while (it.hasNext()) {
            it.next().mo2412c(c0645m);
        }
    }

    /* renamed from: d */
    public List<AbstractC0637k> m3148d() {
        return this.f2874a;
    }
}

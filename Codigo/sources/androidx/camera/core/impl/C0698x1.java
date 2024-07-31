package androidx.camera.core.impl;

import androidx.lifecycle.C1320r;
import androidx.lifecycle.LiveData;
import p018b0.AbstractC1598f;
import p407w.InterfaceC12021k1;

/* renamed from: androidx.camera.core.impl.x1 */
/* loaded from: classes.dex */
public class C0698x1 extends C0599a1 {

    /* renamed from: b */
    private final InterfaceC0602b0 f3014b;

    /* renamed from: c */
    private final C0695w1 f3015c;

    public C0698x1(InterfaceC0602b0 interfaceC0602b0, C0695w1 c0695w1) {
        super(interfaceC0602b0);
        this.f3014b = interfaceC0602b0;
        this.f3015c = c0695w1;
    }

    @Override // p407w.InterfaceC12028o
    /* renamed from: d */
    public boolean mo2561d() {
        if (this.f3015c.m3376l(5)) {
            return this.f3014b.mo2561d();
        }
        return false;
    }

    @Override // p407w.InterfaceC12028o
    /* renamed from: g */
    public LiveData<Integer> mo2564g() {
        return !this.f3015c.m3376l(6) ? new C1320r(0) : this.f3014b.mo2564g();
    }

    @Override // androidx.camera.core.impl.InterfaceC0602b0
    /* renamed from: h */
    public InterfaceC0602b0 mo2982h() {
        return this.f3014b;
    }

    @Override // p407w.InterfaceC12028o
    /* renamed from: j */
    public LiveData<InterfaceC12021k1> mo2566j() {
        return !this.f3015c.m3376l(0) ? new C1320r(AbstractC1598f.m8898e(1.0f, 1.0f, 1.0f, 0.0f)) : this.f3014b.mo2566j();
    }
}

package androidx.camera.core.impl;

import com.google.common.util.concurrent.InterfaceFutureC5920f;
import java.util.ArrayList;
import java.util.Set;
import p002a0.C0009f;

/* renamed from: androidx.camera.core.impl.w1 */
/* loaded from: classes.dex */
public class C0695w1 extends C0703z0 {

    /* renamed from: c */
    private final InterfaceC0699y f3009c;

    /* renamed from: d */
    private volatile boolean f3010d;

    /* renamed from: e */
    private volatile Set<Integer> f3011e;

    public C0695w1(InterfaceC0699y interfaceC0699y) {
        super(interfaceC0699y);
        this.f3010d = false;
        this.f3009c = interfaceC0699y;
    }

    @Override // androidx.camera.core.impl.C0703z0, p407w.InterfaceC12016j
    /* renamed from: b */
    public InterfaceFutureC5920f<Void> mo2722b(float f10) {
        return !m3376l(0) ? C0009f.m20f(new IllegalStateException("Zoom is not supported")) : this.f3009c.mo2722b(f10);
    }

    @Override // androidx.camera.core.impl.C0703z0, p407w.InterfaceC12016j
    /* renamed from: d */
    public InterfaceFutureC5920f<Void> mo2726d(float f10) {
        return !m3376l(0) ? C0009f.m20f(new IllegalStateException("Zoom is not supported")) : this.f3009c.mo2726d(f10);
    }

    @Override // androidx.camera.core.impl.C0703z0, p407w.InterfaceC12016j
    /* renamed from: g */
    public InterfaceFutureC5920f<Void> mo2732g(boolean z10) {
        return !m3376l(6) ? C0009f.m20f(new IllegalStateException("Torch is not supported")) : this.f3009c.mo2732g(z10);
    }

    /* renamed from: k */
    public void m3375k(boolean z10, Set<Integer> set) {
        this.f3010d = z10;
        this.f3011e = set;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: l */
    public boolean m3376l(int... iArr) {
        if (!this.f3010d || this.f3011e == null) {
            return true;
        }
        ArrayList arrayList = new ArrayList(iArr.length);
        for (int i10 : iArr) {
            arrayList.add(Integer.valueOf(i10));
        }
        return this.f3011e.containsAll(arrayList);
    }
}

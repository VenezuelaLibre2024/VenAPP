package androidx.camera.core.impl;

import android.graphics.Rect;
import androidx.camera.core.impl.C0701y1;
import com.google.common.util.concurrent.InterfaceFutureC5920f;
import java.util.List;

/* renamed from: androidx.camera.core.impl.z0 */
/* loaded from: classes.dex */
public class C0703z0 implements InterfaceC0699y {

    /* renamed from: b */
    private final InterfaceC0699y f3038b;

    public C0703z0(InterfaceC0699y interfaceC0699y) {
        this.f3038b = interfaceC0699y;
    }

    @Override // androidx.camera.core.impl.InterfaceC0699y
    /* renamed from: a */
    public void mo2720a(C0701y1.b bVar) {
        this.f3038b.mo2720a(bVar);
    }

    @Override // p407w.InterfaceC12016j
    /* renamed from: b */
    public InterfaceFutureC5920f<Void> mo2722b(float f10) {
        return this.f3038b.mo2722b(f10);
    }

    @Override // androidx.camera.core.impl.InterfaceC0699y
    /* renamed from: c */
    public InterfaceFutureC5920f<List<Void>> mo2724c(List<C0642l0> list, int i10, int i11) {
        return this.f3038b.mo2724c(list, i10, i11);
    }

    @Override // p407w.InterfaceC12016j
    /* renamed from: d */
    public InterfaceFutureC5920f<Void> mo2726d(float f10) {
        return this.f3038b.mo2726d(f10);
    }

    @Override // androidx.camera.core.impl.InterfaceC0699y
    /* renamed from: e */
    public Rect mo2728e() {
        return this.f3038b.mo2728e();
    }

    @Override // androidx.camera.core.impl.InterfaceC0699y
    /* renamed from: f */
    public void mo2730f(int i10) {
        this.f3038b.mo2730f(i10);
    }

    @Override // p407w.InterfaceC12016j
    /* renamed from: g */
    public InterfaceFutureC5920f<Void> mo2732g(boolean z10) {
        return this.f3038b.mo2732g(z10);
    }

    @Override // androidx.camera.core.impl.InterfaceC0699y
    /* renamed from: h */
    public InterfaceC0649n0 mo2733h() {
        return this.f3038b.mo2733h();
    }

    @Override // androidx.camera.core.impl.InterfaceC0699y
    /* renamed from: i */
    public void mo2734i(InterfaceC0649n0 interfaceC0649n0) {
        this.f3038b.mo2734i(interfaceC0649n0);
    }

    @Override // androidx.camera.core.impl.InterfaceC0699y
    /* renamed from: j */
    public void mo2735j() {
        this.f3038b.mo2735j();
    }
}

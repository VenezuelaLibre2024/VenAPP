package androidx.camera.core.impl;

import android.util.Size;
import java.util.List;

/* renamed from: androidx.camera.core.impl.a1 */
/* loaded from: classes.dex */
public class C0599a1 implements InterfaceC0602b0 {

    /* renamed from: a */
    private final InterfaceC0602b0 f2757a;

    public C0599a1(InterfaceC0602b0 interfaceC0602b0) {
        this.f2757a = interfaceC0602b0;
    }

    @Override // p407w.InterfaceC12028o
    /* renamed from: a */
    public int mo2558a() {
        return this.f2757a.mo2558a();
    }

    @Override // androidx.camera.core.impl.InterfaceC0602b0
    /* renamed from: b */
    public String mo2559b() {
        return this.f2757a.mo2559b();
    }

    @Override // androidx.camera.core.impl.InterfaceC0602b0
    /* renamed from: c */
    public List<Size> mo2560c(int i10) {
        return this.f2757a.mo2560c(i10);
    }

    @Override // androidx.camera.core.impl.InterfaceC0602b0
    /* renamed from: e */
    public C0668t1 mo2562e() {
        return this.f2757a.mo2562e();
    }

    @Override // androidx.camera.core.impl.InterfaceC0602b0
    /* renamed from: f */
    public List<Size> mo2563f(int i10) {
        return this.f2757a.mo2563f(i10);
    }

    @Override // p407w.InterfaceC12028o
    public int getLensFacing() {
        return this.f2757a.getLensFacing();
    }

    @Override // p407w.InterfaceC12028o
    /* renamed from: i */
    public int mo2565i(int i10) {
        return this.f2757a.mo2565i(i10);
    }
}

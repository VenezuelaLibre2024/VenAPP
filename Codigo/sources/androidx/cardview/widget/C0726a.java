package androidx.cardview.widget;

import android.content.Context;
import android.content.res.ColorStateList;
import android.view.View;

/* renamed from: androidx.cardview.widget.a */
/* loaded from: classes.dex */
class C0726a implements InterfaceC0728c {
    /* renamed from: o */
    private C0729d m3623o(InterfaceC0727b interfaceC0727b) {
        return (C0729d) interfaceC0727b.mo3619c();
    }

    @Override // androidx.cardview.widget.InterfaceC0728c
    /* renamed from: a */
    public void mo3624a(InterfaceC0727b interfaceC0727b, float f10) {
        m3623o(interfaceC0727b).m3647h(f10);
    }

    @Override // androidx.cardview.widget.InterfaceC0728c
    /* renamed from: b */
    public float mo3625b(InterfaceC0727b interfaceC0727b) {
        return m3623o(interfaceC0727b).m3644d();
    }

    @Override // androidx.cardview.widget.InterfaceC0728c
    /* renamed from: c */
    public void mo3626c(InterfaceC0727b interfaceC0727b, float f10) {
        interfaceC0727b.mo3622f().setElevation(f10);
    }

    @Override // androidx.cardview.widget.InterfaceC0728c
    /* renamed from: d */
    public float mo3627d(InterfaceC0727b interfaceC0727b) {
        return m3623o(interfaceC0727b).m3643c();
    }

    @Override // androidx.cardview.widget.InterfaceC0728c
    /* renamed from: e */
    public ColorStateList mo3628e(InterfaceC0727b interfaceC0727b) {
        return m3623o(interfaceC0727b).m3642b();
    }

    @Override // androidx.cardview.widget.InterfaceC0728c
    /* renamed from: f */
    public float mo3629f(InterfaceC0727b interfaceC0727b) {
        return mo3625b(interfaceC0727b) * 2.0f;
    }

    @Override // androidx.cardview.widget.InterfaceC0728c
    /* renamed from: g */
    public void mo3630g(InterfaceC0727b interfaceC0727b) {
        mo3637n(interfaceC0727b, mo3627d(interfaceC0727b));
    }

    @Override // androidx.cardview.widget.InterfaceC0728c
    /* renamed from: h */
    public void mo3631h(InterfaceC0727b interfaceC0727b, Context context, ColorStateList colorStateList, float f10, float f11, float f12) {
        interfaceC0727b.mo3617a(new C0729d(colorStateList, f10));
        View mo3622f = interfaceC0727b.mo3622f();
        mo3622f.setClipToOutline(true);
        mo3622f.setElevation(f11);
        mo3637n(interfaceC0727b, f12);
    }

    @Override // androidx.cardview.widget.InterfaceC0728c
    /* renamed from: i */
    public float mo3632i(InterfaceC0727b interfaceC0727b) {
        return interfaceC0727b.mo3622f().getElevation();
    }

    @Override // androidx.cardview.widget.InterfaceC0728c
    /* renamed from: j */
    public void mo3633j(InterfaceC0727b interfaceC0727b) {
        mo3637n(interfaceC0727b, mo3627d(interfaceC0727b));
    }

    @Override // androidx.cardview.widget.InterfaceC0728c
    /* renamed from: k */
    public void mo3634k() {
    }

    @Override // androidx.cardview.widget.InterfaceC0728c
    /* renamed from: l */
    public float mo3635l(InterfaceC0727b interfaceC0727b) {
        return mo3625b(interfaceC0727b) * 2.0f;
    }

    @Override // androidx.cardview.widget.InterfaceC0728c
    /* renamed from: m */
    public void mo3636m(InterfaceC0727b interfaceC0727b, ColorStateList colorStateList) {
        m3623o(interfaceC0727b).m3645f(colorStateList);
    }

    @Override // androidx.cardview.widget.InterfaceC0728c
    /* renamed from: n */
    public void mo3637n(InterfaceC0727b interfaceC0727b, float f10) {
        m3623o(interfaceC0727b).m3646g(f10, interfaceC0727b.mo3618b(), interfaceC0727b.mo3621e());
        m3638p(interfaceC0727b);
    }

    /* renamed from: p */
    public void m3638p(InterfaceC0727b interfaceC0727b) {
        if (!interfaceC0727b.mo3618b()) {
            interfaceC0727b.mo3620d(0, 0, 0, 0);
            return;
        }
        float mo3627d = mo3627d(interfaceC0727b);
        float mo3625b = mo3625b(interfaceC0727b);
        int ceil = (int) Math.ceil(C0730e.m3648a(mo3627d, mo3625b, interfaceC0727b.mo3621e()));
        int ceil2 = (int) Math.ceil(C0730e.m3649b(mo3627d, mo3625b, interfaceC0727b.mo3621e()));
        interfaceC0727b.mo3620d(ceil, ceil2, ceil, ceil2);
    }
}

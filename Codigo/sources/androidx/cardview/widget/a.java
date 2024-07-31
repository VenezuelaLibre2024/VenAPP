package androidx.cardview.widget;

import android.content.Context;
import android.content.res.ColorStateList;
import android.view.View;

/* loaded from: classes.dex */
class a implements c {
    private d o(b bVar) {
        return (d) bVar.c();
    }

    @Override // androidx.cardview.widget.c
    public void a(b bVar, float f10) {
        o(bVar).h(f10);
    }

    @Override // androidx.cardview.widget.c
    public float b(b bVar) {
        return o(bVar).d();
    }

    @Override // androidx.cardview.widget.c
    public void c(b bVar, float f10) {
        bVar.f().setElevation(f10);
    }

    @Override // androidx.cardview.widget.c
    public float d(b bVar) {
        return o(bVar).c();
    }

    @Override // androidx.cardview.widget.c
    public ColorStateList e(b bVar) {
        return o(bVar).b();
    }

    @Override // androidx.cardview.widget.c
    public float f(b bVar) {
        return b(bVar) * 2.0f;
    }

    @Override // androidx.cardview.widget.c
    public void g(b bVar) {
        n(bVar, d(bVar));
    }

    @Override // androidx.cardview.widget.c
    public void h(b bVar, Context context, ColorStateList colorStateList, float f10, float f11, float f12) {
        bVar.a(new d(colorStateList, f10));
        View f13 = bVar.f();
        f13.setClipToOutline(true);
        f13.setElevation(f11);
        n(bVar, f12);
    }

    @Override // androidx.cardview.widget.c
    public float i(b bVar) {
        return bVar.f().getElevation();
    }

    @Override // androidx.cardview.widget.c
    public void j(b bVar) {
        n(bVar, d(bVar));
    }

    @Override // androidx.cardview.widget.c
    public void k() {
    }

    @Override // androidx.cardview.widget.c
    public float l(b bVar) {
        return b(bVar) * 2.0f;
    }

    @Override // androidx.cardview.widget.c
    public void m(b bVar, ColorStateList colorStateList) {
        o(bVar).f(colorStateList);
    }

    @Override // androidx.cardview.widget.c
    public void n(b bVar, float f10) {
        o(bVar).g(f10, bVar.b(), bVar.e());
        p(bVar);
    }

    public void p(b bVar) {
        if (!bVar.b()) {
            bVar.d(0, 0, 0, 0);
            return;
        }
        float d10 = d(bVar);
        float b10 = b(bVar);
        int ceil = (int) Math.ceil(e.a(d10, b10, bVar.e()));
        int ceil2 = (int) Math.ceil(e.b(d10, b10, bVar.e()));
        bVar.d(ceil, ceil2, ceil, ceil2);
    }
}

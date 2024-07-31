package androidx.appcompat.widget;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.PopupWindow;

/* loaded from: classes.dex */
class r extends PopupWindow {

    /* renamed from: b, reason: collision with root package name */
    private static final boolean f1613b = false;

    /* renamed from: a, reason: collision with root package name */
    private boolean f1614a;

    public r(Context context, AttributeSet attributeSet, int i10, int i11) {
        super(context, attributeSet, i10, i11);
        a(context, attributeSet, i10, i11);
    }

    private void a(Context context, AttributeSet attributeSet, int i10, int i11) {
        l1 u10 = l1.u(context, attributeSet, g.j.Y1, i10, i11);
        int i12 = g.j.f15404a2;
        if (u10.r(i12)) {
            b(u10.a(i12, false));
        }
        setBackgroundDrawable(u10.f(g.j.Z1));
        u10.v();
    }

    private void b(boolean z10) {
        if (f1613b) {
            this.f1614a = z10;
        } else {
            androidx.core.widget.j.a(this, z10);
        }
    }

    @Override // android.widget.PopupWindow
    public void showAsDropDown(View view, int i10, int i11) {
        if (f1613b && this.f1614a) {
            i11 -= view.getHeight();
        }
        super.showAsDropDown(view, i10, i11);
    }

    @Override // android.widget.PopupWindow
    public void showAsDropDown(View view, int i10, int i11, int i12) {
        if (f1613b && this.f1614a) {
            i11 -= view.getHeight();
        }
        super.showAsDropDown(view, i10, i11, i12);
    }

    @Override // android.widget.PopupWindow
    public void update(View view, int i10, int i11, int i12, int i13) {
        if (f1613b && this.f1614a) {
            i11 -= view.getHeight();
        }
        super.update(view, i10, i11, i12, i13);
    }
}

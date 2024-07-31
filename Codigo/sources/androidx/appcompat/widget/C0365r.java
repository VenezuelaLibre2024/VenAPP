package androidx.appcompat.widget;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.PopupWindow;
import androidx.core.widget.C1140j;
import p111g.C7386j;

/* renamed from: androidx.appcompat.widget.r */
/* loaded from: classes.dex */
class C0365r extends PopupWindow {

    /* renamed from: b */
    private static final boolean f1888b = false;

    /* renamed from: a */
    private boolean f1889a;

    public C0365r(Context context, AttributeSet attributeSet, int i10, int i11) {
        super(context, attributeSet, i10, i11);
        m1947a(context, attributeSet, i10, i11);
    }

    /* renamed from: a */
    private void m1947a(Context context, AttributeSet attributeSet, int i10, int i11) {
        C0349l1 m1845u = C0349l1.m1845u(context, attributeSet, C7386j.f16973Y1, i10, i11);
        int i12 = C7386j.f16982a2;
        if (m1845u.m1863r(i12)) {
            m1948b(m1845u.m1846a(i12, false));
        }
        setBackgroundDrawable(m1845u.m1851f(C7386j.f16977Z1));
        m1845u.m1864v();
    }

    /* renamed from: b */
    private void m1948b(boolean z10) {
        if (f1888b) {
            this.f1889a = z10;
        } else {
            C1140j.m5571a(this, z10);
        }
    }

    @Override // android.widget.PopupWindow
    public void showAsDropDown(View view, int i10, int i11) {
        if (f1888b && this.f1889a) {
            i11 -= view.getHeight();
        }
        super.showAsDropDown(view, i10, i11);
    }

    @Override // android.widget.PopupWindow
    public void showAsDropDown(View view, int i10, int i11, int i12) {
        if (f1888b && this.f1889a) {
            i11 -= view.getHeight();
        }
        super.showAsDropDown(view, i10, i11, i12);
    }

    @Override // android.widget.PopupWindow
    public void update(View view, int i10, int i11, int i12, int i13) {
        if (f1888b && this.f1889a) {
            i11 -= view.getHeight();
        }
        super.update(view, i10, i11, i12, i13);
    }
}

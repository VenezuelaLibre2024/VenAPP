package androidx.core.view;

import android.view.View;
import android.view.ViewGroup;

/* renamed from: androidx.core.view.r0 */
/* loaded from: classes.dex */
public class C1092r0 {

    /* renamed from: a */
    private int f4648a;

    /* renamed from: b */
    private int f4649b;

    public C1092r0(ViewGroup viewGroup) {
    }

    /* renamed from: a */
    public int m5128a() {
        return this.f4648a | this.f4649b;
    }

    /* renamed from: b */
    public void m5129b(View view, View view2, int i10) {
        m5130c(view, view2, i10, 0);
    }

    /* renamed from: c */
    public void m5130c(View view, View view2, int i10, int i11) {
        if (i11 == 1) {
            this.f4649b = i10;
        } else {
            this.f4648a = i10;
        }
    }

    /* renamed from: d */
    public void m5131d(View view) {
        m5132e(view, 0);
    }

    /* renamed from: e */
    public void m5132e(View view, int i10) {
        if (i10 == 1) {
            this.f4649b = 0;
        } else {
            this.f4648a = 0;
        }
    }
}

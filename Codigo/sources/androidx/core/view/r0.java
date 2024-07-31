package androidx.core.view;

import android.view.View;
import android.view.ViewGroup;

/* loaded from: classes.dex */
public class r0 {

    /* renamed from: a, reason: collision with root package name */
    private int f3956a;

    /* renamed from: b, reason: collision with root package name */
    private int f3957b;

    public r0(ViewGroup viewGroup) {
    }

    public int a() {
        return this.f3956a | this.f3957b;
    }

    public void b(View view, View view2, int i10) {
        c(view, view2, i10, 0);
    }

    public void c(View view, View view2, int i10, int i11) {
        if (i11 == 1) {
            this.f3957b = i10;
        } else {
            this.f3956a = i10;
        }
    }

    public void d(View view) {
        e(view, 0);
    }

    public void e(View view, int i10) {
        if (i10 == 1) {
            this.f3957b = 0;
        } else {
            this.f3956a = 0;
        }
    }
}

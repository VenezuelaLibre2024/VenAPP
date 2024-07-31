package yd;

import android.view.View;
import android.widget.ScrollView;

/* loaded from: classes.dex */
public class d {

    /* renamed from: a, reason: collision with root package name */
    private View f31829a;

    /* renamed from: b, reason: collision with root package name */
    private boolean f31830b;

    /* renamed from: c, reason: collision with root package name */
    private int f31831c;

    /* renamed from: d, reason: collision with root package name */
    private int f31832d;

    public d(View view, boolean z10) {
        this.f31829a = view;
        this.f31830b = z10;
    }

    public int a() {
        if (this.f31829a.getVisibility() == 8) {
            return 0;
        }
        View view = this.f31829a;
        if (!(view instanceof ScrollView)) {
            return view.getMeasuredHeight();
        }
        ScrollView scrollView = (ScrollView) view;
        return scrollView.getPaddingBottom() + scrollView.getPaddingTop() + scrollView.getChildAt(0).getMeasuredHeight();
    }

    public int b() {
        return this.f31832d;
    }

    public View c() {
        return this.f31829a;
    }

    public boolean d() {
        return this.f31830b;
    }

    public void e(int i10, int i11) {
        b.b(this.f31829a, i10, i11);
    }

    public void f(int i10, int i11) {
        this.f31831c = i10;
        this.f31832d = i11;
    }
}

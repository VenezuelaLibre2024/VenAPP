package p466yd;

import android.view.View;
import android.widget.ScrollView;

/* renamed from: yd.d */
/* loaded from: classes.dex */
public class C12674d {

    /* renamed from: a */
    private View f34365a;

    /* renamed from: b */
    private boolean f34366b;

    /* renamed from: c */
    private int f34367c;

    /* renamed from: d */
    private int f34368d;

    public C12674d(View view, boolean z10) {
        this.f34365a = view;
        this.f34366b = z10;
    }

    /* renamed from: a */
    public int m41707a() {
        if (this.f34365a.getVisibility() == 8) {
            return 0;
        }
        View view = this.f34365a;
        if (!(view instanceof ScrollView)) {
            return view.getMeasuredHeight();
        }
        ScrollView scrollView = (ScrollView) view;
        return scrollView.getPaddingBottom() + scrollView.getPaddingTop() + scrollView.getChildAt(0).getMeasuredHeight();
    }

    /* renamed from: b */
    public int m41708b() {
        return this.f34368d;
    }

    /* renamed from: c */
    public View m41709c() {
        return this.f34365a;
    }

    /* renamed from: d */
    public boolean m41710d() {
        return this.f34366b;
    }

    /* renamed from: e */
    public void m41711e(int i10, int i11) {
        C12672b.m41697b(this.f34365a, i10, i11);
    }

    /* renamed from: f */
    public void m41712f(int i10, int i11) {
        this.f34367c = i10;
        this.f34368d = i11;
    }
}

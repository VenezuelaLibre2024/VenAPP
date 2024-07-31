package p466yd;

import android.view.View;
import p382ud.C11544m;

/* renamed from: yd.b */
/* loaded from: classes.dex */
public class C12672b {
    /* renamed from: a */
    private static void m41696a(View view, int i10, int i11, int i12, int i13) {
        C11544m.m36185d("\tdesired (w,h)", view.getMeasuredWidth(), view.getMeasuredHeight());
        if (view.getVisibility() == 8) {
            i10 = 0;
            i11 = 0;
        }
        view.measure(View.MeasureSpec.makeMeasureSpec(i10, i12), View.MeasureSpec.makeMeasureSpec(i11, i13));
        C11544m.m36185d("\tactual (w,h)", view.getMeasuredWidth(), view.getMeasuredHeight());
    }

    /* renamed from: b */
    public static void m41697b(View view, int i10, int i11) {
        m41696a(view, i10, i11, Integer.MIN_VALUE, Integer.MIN_VALUE);
    }

    /* renamed from: c */
    public static void m41698c(View view, int i10, int i11) {
        m41696a(view, i10, i11, Integer.MIN_VALUE, 1073741824);
    }

    /* renamed from: d */
    public static void m41699d(View view, int i10, int i11) {
        m41696a(view, i10, i11, 1073741824, Integer.MIN_VALUE);
    }
}

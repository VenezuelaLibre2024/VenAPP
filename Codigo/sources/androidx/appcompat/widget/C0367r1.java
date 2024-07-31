package androidx.appcompat.widget;

import android.os.Build;
import android.view.View;

/* renamed from: androidx.appcompat.widget.r1 */
/* loaded from: classes.dex */
public class C0367r1 {

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: androidx.appcompat.widget.r1$a */
    /* loaded from: classes.dex */
    public static class a {
        /* renamed from: a */
        static void m1951a(View view, CharSequence charSequence) {
            view.setTooltipText(charSequence);
        }
    }

    /* renamed from: a */
    public static void m1950a(View view, CharSequence charSequence) {
        if (Build.VERSION.SDK_INT >= 26) {
            a.m1951a(view, charSequence);
        } else {
            ViewOnLongClickListenerC0376u1.m2022h(view, charSequence);
        }
    }
}

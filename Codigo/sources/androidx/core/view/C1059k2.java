package androidx.core.view;

import android.view.ViewGroup;

/* renamed from: androidx.core.view.k2 */
/* loaded from: classes.dex */
public final class C1059k2 {

    /* renamed from: androidx.core.view.k2$a */
    /* loaded from: classes.dex */
    static class a {
        /* renamed from: a */
        static int m5014a(ViewGroup viewGroup) {
            return viewGroup.getNestedScrollAxes();
        }

        /* renamed from: b */
        static boolean m5015b(ViewGroup viewGroup) {
            return viewGroup.isTransitionGroup();
        }

        /* renamed from: c */
        static void m5016c(ViewGroup viewGroup, boolean z10) {
            viewGroup.setTransitionGroup(z10);
        }
    }

    /* renamed from: a */
    public static boolean m5013a(ViewGroup viewGroup) {
        return a.m5015b(viewGroup);
    }
}

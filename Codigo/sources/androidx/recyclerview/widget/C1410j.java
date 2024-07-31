package androidx.recyclerview.widget;

import android.view.View;
import androidx.recyclerview.widget.RecyclerView;

/* renamed from: androidx.recyclerview.widget.j */
/* loaded from: classes.dex */
class C1410j {
    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a */
    public static int m8072a(RecyclerView.C1393y c1393y, AbstractC1408h abstractC1408h, View view, View view2, RecyclerView.AbstractC1382n abstractC1382n, boolean z10) {
        if (abstractC1382n.m7855t() == 0 || c1393y.m7920a() == 0 || view == null || view2 == null) {
            return 0;
        }
        if (!z10) {
            return Math.abs(abstractC1382n.m7826I(view) - abstractC1382n.m7826I(view2)) + 1;
        }
        return Math.min(abstractC1408h.mo8068h(), abstractC1408h.mo8064d(view2) - abstractC1408h.mo8065e(view));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: b */
    public static int m8073b(RecyclerView.C1393y c1393y, AbstractC1408h abstractC1408h, View view, View view2, RecyclerView.AbstractC1382n abstractC1382n, boolean z10, boolean z11) {
        if (abstractC1382n.m7855t() == 0 || c1393y.m7920a() == 0 || view == null || view2 == null) {
            return 0;
        }
        int max = z11 ? Math.max(0, (c1393y.m7920a() - Math.max(abstractC1382n.m7826I(view), abstractC1382n.m7826I(view2))) - 1) : Math.max(0, Math.min(abstractC1382n.m7826I(view), abstractC1382n.m7826I(view2)));
        if (z10) {
            return Math.round((max * (Math.abs(abstractC1408h.mo8064d(view2) - abstractC1408h.mo8065e(view)) / (Math.abs(abstractC1382n.m7826I(view) - abstractC1382n.m7826I(view2)) + 1))) + (abstractC1408h.mo8067g() - abstractC1408h.mo8065e(view)));
        }
        return max;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: c */
    public static int m8074c(RecyclerView.C1393y c1393y, AbstractC1408h abstractC1408h, View view, View view2, RecyclerView.AbstractC1382n abstractC1382n, boolean z10) {
        if (abstractC1382n.m7855t() == 0 || c1393y.m7920a() == 0 || view == null || view2 == null) {
            return 0;
        }
        if (!z10) {
            return c1393y.m7920a();
        }
        return (int) (((abstractC1408h.mo8064d(view2) - abstractC1408h.mo8065e(view)) / (Math.abs(abstractC1382n.m7826I(view) - abstractC1382n.m7826I(view2)) + 1)) * c1393y.m7920a());
    }
}

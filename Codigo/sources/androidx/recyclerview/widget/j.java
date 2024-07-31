package androidx.recyclerview.widget;

import android.view.View;
import androidx.recyclerview.widget.RecyclerView;

/* loaded from: classes.dex */
class j {
    /* JADX INFO: Access modifiers changed from: package-private */
    public static int a(RecyclerView.y yVar, h hVar, View view, View view2, RecyclerView.n nVar, boolean z10) {
        if (nVar.t() == 0 || yVar.a() == 0 || view == null || view2 == null) {
            return 0;
        }
        if (!z10) {
            return Math.abs(nVar.I(view) - nVar.I(view2)) + 1;
        }
        return Math.min(hVar.h(), hVar.d(view2) - hVar.e(view));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static int b(RecyclerView.y yVar, h hVar, View view, View view2, RecyclerView.n nVar, boolean z10, boolean z11) {
        if (nVar.t() == 0 || yVar.a() == 0 || view == null || view2 == null) {
            return 0;
        }
        int max = z11 ? Math.max(0, (yVar.a() - Math.max(nVar.I(view), nVar.I(view2))) - 1) : Math.max(0, Math.min(nVar.I(view), nVar.I(view2)));
        if (z10) {
            return Math.round((max * (Math.abs(hVar.d(view2) - hVar.e(view)) / (Math.abs(nVar.I(view) - nVar.I(view2)) + 1))) + (hVar.g() - hVar.e(view)));
        }
        return max;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static int c(RecyclerView.y yVar, h hVar, View view, View view2, RecyclerView.n nVar, boolean z10) {
        if (nVar.t() == 0 || yVar.a() == 0 || view == null || view2 == null) {
            return 0;
        }
        if (!z10) {
            return yVar.a();
        }
        return (int) (((hVar.d(view2) - hVar.e(view)) / (Math.abs(nVar.I(view) - nVar.I(view2)) + 1)) * yVar.a());
    }
}

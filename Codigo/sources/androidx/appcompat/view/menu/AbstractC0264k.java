package androidx.appcompat.view.menu;

import android.content.Context;
import android.graphics.Rect;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.FrameLayout;
import android.widget.HeaderViewListAdapter;
import android.widget.ListAdapter;
import android.widget.PopupWindow;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: androidx.appcompat.view.menu.k */
/* loaded from: classes.dex */
public abstract class AbstractC0264k implements InterfaceC0269p, InterfaceC0266m, AdapterView.OnItemClickListener {

    /* renamed from: a */
    private Rect f1336a;

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: m */
    public static int m1387m(ListAdapter listAdapter, ViewGroup viewGroup, Context context, int i10) {
        int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(0, 0);
        int makeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(0, 0);
        int count = listAdapter.getCount();
        int i11 = 0;
        int i12 = 0;
        View view = null;
        for (int i13 = 0; i13 < count; i13++) {
            int itemViewType = listAdapter.getItemViewType(i13);
            if (itemViewType != i12) {
                view = null;
                i12 = itemViewType;
            }
            if (viewGroup == null) {
                viewGroup = new FrameLayout(context);
            }
            view = listAdapter.getView(i13, view, viewGroup);
            view.measure(makeMeasureSpec, makeMeasureSpec2);
            int measuredWidth = view.getMeasuredWidth();
            if (measuredWidth >= i10) {
                return i10;
            }
            if (measuredWidth > i11) {
                i11 = measuredWidth;
            }
        }
        return i11;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: w */
    public static boolean m1388w(C0260g c0260g) {
        int size = c0260g.size();
        for (int i10 = 0; i10 < size; i10++) {
            MenuItem item = c0260g.getItem(i10);
            if (item.isVisible() && item.getIcon() != null) {
                return true;
            }
        }
        return false;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: x */
    public static C0259f m1389x(ListAdapter listAdapter) {
        return listAdapter instanceof HeaderViewListAdapter ? (C0259f) ((HeaderViewListAdapter) listAdapter).getWrappedAdapter() : (C0259f) listAdapter;
    }

    @Override // androidx.appcompat.view.menu.InterfaceC0266m
    /* renamed from: c */
    public boolean mo1243c(C0260g c0260g, C0262i c0262i) {
        return false;
    }

    @Override // androidx.appcompat.view.menu.InterfaceC0266m
    /* renamed from: h */
    public boolean mo1247h(C0260g c0260g, C0262i c0262i) {
        return false;
    }

    @Override // androidx.appcompat.view.menu.InterfaceC0266m
    /* renamed from: i */
    public void mo1248i(Context context, C0260g c0260g) {
    }

    /* renamed from: j */
    public abstract void mo1271j(C0260g c0260g);

    /* renamed from: k */
    protected boolean mo1272k() {
        return true;
    }

    /* renamed from: l */
    public Rect m1390l() {
        return this.f1336a;
    }

    /* renamed from: n */
    public abstract void mo1273n(View view);

    /* renamed from: o */
    public void m1391o(Rect rect) {
        this.f1336a = rect;
    }

    @Override // android.widget.AdapterView.OnItemClickListener
    public void onItemClick(AdapterView<?> adapterView, View view, int i10, long j10) {
        ListAdapter listAdapter = (ListAdapter) adapterView.getAdapter();
        m1389x(listAdapter).f1256a.m1311M((MenuItem) listAdapter.getItem(i10), this, mo1272k() ? 0 : 4);
    }

    /* renamed from: p */
    public abstract void mo1274p(boolean z10);

    /* renamed from: q */
    public abstract void mo1275q(int i10);

    /* renamed from: s */
    public abstract void mo1277s(int i10);

    /* renamed from: t */
    public abstract void mo1278t(PopupWindow.OnDismissListener onDismissListener);

    /* renamed from: u */
    public abstract void mo1279u(boolean z10);

    /* renamed from: v */
    public abstract void mo1280v(int i10);
}

package androidx.appcompat.view.menu;

import android.R;
import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;
import androidx.appcompat.view.menu.g;
import androidx.appcompat.widget.l1;

/* loaded from: classes.dex */
public final class ExpandedMenuView extends ListView implements g.b, n, AdapterView.OnItemClickListener {

    /* renamed from: c, reason: collision with root package name */
    private static final int[] f1015c = {R.attr.background, R.attr.divider};

    /* renamed from: a, reason: collision with root package name */
    private g f1016a;

    /* renamed from: b, reason: collision with root package name */
    private int f1017b;

    public ExpandedMenuView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, R.attr.listViewStyle);
    }

    public ExpandedMenuView(Context context, AttributeSet attributeSet, int i10) {
        super(context, attributeSet);
        setOnItemClickListener(this);
        l1 u10 = l1.u(context, attributeSet, f1015c, i10, 0);
        if (u10.r(0)) {
            setBackgroundDrawable(u10.f(0));
        }
        if (u10.r(1)) {
            setDivider(u10.f(1));
        }
        u10.v();
    }

    @Override // androidx.appcompat.view.menu.n
    public void a(g gVar) {
        this.f1016a = gVar;
    }

    @Override // androidx.appcompat.view.menu.g.b
    public boolean b(i iVar) {
        return this.f1016a.L(iVar, 0);
    }

    public int getWindowAnimations() {
        return this.f1017b;
    }

    @Override // android.widget.ListView, android.widget.AbsListView, android.widget.AdapterView, android.view.ViewGroup, android.view.View
    protected void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        setChildrenDrawingCacheEnabled(false);
    }

    @Override // android.widget.AdapterView.OnItemClickListener
    public void onItemClick(AdapterView adapterView, View view, int i10, long j10) {
        b((i) getAdapter().getItem(i10));
    }
}

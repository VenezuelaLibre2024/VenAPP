package androidx.appcompat.view.menu;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import androidx.appcompat.view.menu.InterfaceC0267n;
import java.util.ArrayList;

/* renamed from: androidx.appcompat.view.menu.f */
/* loaded from: classes.dex */
public class C0259f extends BaseAdapter {

    /* renamed from: a */
    C0260g f1256a;

    /* renamed from: b */
    private int f1257b = -1;

    /* renamed from: c */
    private boolean f1258c;

    /* renamed from: d */
    private final boolean f1259d;

    /* renamed from: e */
    private final LayoutInflater f1260e;

    /* renamed from: f */
    private final int f1261f;

    public C0259f(C0260g c0260g, LayoutInflater layoutInflater, boolean z10, int i10) {
        this.f1259d = z10;
        this.f1260e = layoutInflater;
        this.f1256a = c0260g;
        this.f1261f = i10;
        m1288a();
    }

    /* renamed from: a */
    void m1288a() {
        C0262i m1344v = this.f1256a.m1344v();
        if (m1344v != null) {
            ArrayList<C0262i> m1348z = this.f1256a.m1348z();
            int size = m1348z.size();
            for (int i10 = 0; i10 < size; i10++) {
                if (m1348z.get(i10) == m1344v) {
                    this.f1257b = i10;
                    return;
                }
            }
        }
        this.f1257b = -1;
    }

    /* renamed from: b */
    public C0260g m1289b() {
        return this.f1256a;
    }

    @Override // android.widget.Adapter
    /* renamed from: c, reason: merged with bridge method [inline-methods] */
    public C0262i getItem(int i10) {
        ArrayList<C0262i> m1348z = this.f1259d ? this.f1256a.m1348z() : this.f1256a.m1303E();
        int i11 = this.f1257b;
        if (i11 >= 0 && i10 >= i11) {
            i10++;
        }
        return m1348z.get(i10);
    }

    /* renamed from: d */
    public void m1291d(boolean z10) {
        this.f1258c = z10;
    }

    @Override // android.widget.Adapter
    public int getCount() {
        ArrayList<C0262i> m1348z = this.f1259d ? this.f1256a.m1348z() : this.f1256a.m1303E();
        int i10 = this.f1257b;
        int size = m1348z.size();
        return i10 < 0 ? size : size - 1;
    }

    @Override // android.widget.Adapter
    public long getItemId(int i10) {
        return i10;
    }

    @Override // android.widget.Adapter
    public View getView(int i10, View view, ViewGroup viewGroup) {
        if (view == null) {
            view = this.f1260e.inflate(this.f1261f, viewGroup, false);
        }
        int groupId = getItem(i10).getGroupId();
        int i11 = i10 - 1;
        ListMenuItemView listMenuItemView = (ListMenuItemView) view;
        listMenuItemView.setGroupDividerEnabled(this.f1256a.mo1304F() && groupId != (i11 >= 0 ? getItem(i11).getGroupId() : groupId));
        InterfaceC0267n.a aVar = (InterfaceC0267n.a) view;
        if (this.f1258c) {
            listMenuItemView.setForceShowIcon(true);
        }
        aVar.mo1221c(getItem(i10), 0);
        return view;
    }

    @Override // android.widget.BaseAdapter
    public void notifyDataSetChanged() {
        m1288a();
        super.notifyDataSetChanged();
    }
}

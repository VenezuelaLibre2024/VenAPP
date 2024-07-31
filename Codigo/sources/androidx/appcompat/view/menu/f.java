package androidx.appcompat.view.menu;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import androidx.appcompat.view.menu.n;
import java.util.ArrayList;

/* loaded from: classes.dex */
public class f extends BaseAdapter {

    /* renamed from: a, reason: collision with root package name */
    g f1101a;

    /* renamed from: b, reason: collision with root package name */
    private int f1102b = -1;

    /* renamed from: c, reason: collision with root package name */
    private boolean f1103c;

    /* renamed from: d, reason: collision with root package name */
    private final boolean f1104d;

    /* renamed from: e, reason: collision with root package name */
    private final LayoutInflater f1105e;

    /* renamed from: f, reason: collision with root package name */
    private final int f1106f;

    public f(g gVar, LayoutInflater layoutInflater, boolean z10, int i10) {
        this.f1104d = z10;
        this.f1105e = layoutInflater;
        this.f1101a = gVar;
        this.f1106f = i10;
        a();
    }

    void a() {
        i v10 = this.f1101a.v();
        if (v10 != null) {
            ArrayList<i> z10 = this.f1101a.z();
            int size = z10.size();
            for (int i10 = 0; i10 < size; i10++) {
                if (z10.get(i10) == v10) {
                    this.f1102b = i10;
                    return;
                }
            }
        }
        this.f1102b = -1;
    }

    public g b() {
        return this.f1101a;
    }

    @Override // android.widget.Adapter
    /* renamed from: c, reason: merged with bridge method [inline-methods] */
    public i getItem(int i10) {
        ArrayList<i> z10 = this.f1104d ? this.f1101a.z() : this.f1101a.E();
        int i11 = this.f1102b;
        if (i11 >= 0 && i10 >= i11) {
            i10++;
        }
        return z10.get(i10);
    }

    public void d(boolean z10) {
        this.f1103c = z10;
    }

    @Override // android.widget.Adapter
    public int getCount() {
        ArrayList<i> z10 = this.f1104d ? this.f1101a.z() : this.f1101a.E();
        int i10 = this.f1102b;
        int size = z10.size();
        return i10 < 0 ? size : size - 1;
    }

    @Override // android.widget.Adapter
    public long getItemId(int i10) {
        return i10;
    }

    @Override // android.widget.Adapter
    public View getView(int i10, View view, ViewGroup viewGroup) {
        if (view == null) {
            view = this.f1105e.inflate(this.f1106f, viewGroup, false);
        }
        int groupId = getItem(i10).getGroupId();
        int i11 = i10 - 1;
        ListMenuItemView listMenuItemView = (ListMenuItemView) view;
        listMenuItemView.setGroupDividerEnabled(this.f1101a.F() && groupId != (i11 >= 0 ? getItem(i11).getGroupId() : groupId));
        n.a aVar = (n.a) view;
        if (this.f1103c) {
            listMenuItemView.setForceShowIcon(true);
        }
        aVar.c(getItem(i10), 0);
        return view;
    }

    @Override // android.widget.BaseAdapter
    public void notifyDataSetChanged() {
        a();
        super.notifyDataSetChanged();
    }
}

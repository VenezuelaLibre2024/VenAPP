package androidx.appcompat.view.menu;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.BaseAdapter;
import android.widget.ListAdapter;
import androidx.appcompat.view.menu.m;
import androidx.appcompat.view.menu.n;
import java.util.ArrayList;

/* loaded from: classes.dex */
public class e implements m, AdapterView.OnItemClickListener {

    /* renamed from: a */
    Context f1090a;

    /* renamed from: b */
    LayoutInflater f1091b;

    /* renamed from: c */
    g f1092c;

    /* renamed from: d */
    ExpandedMenuView f1093d;

    /* renamed from: e */
    int f1094e;

    /* renamed from: f */
    int f1095f;

    /* renamed from: r */
    int f1096r;

    /* renamed from: s */
    private m.a f1097s;

    /* renamed from: t */
    a f1098t;

    /* loaded from: classes.dex */
    public class a extends BaseAdapter {

        /* renamed from: a */
        private int f1099a = -1;

        public a() {
            a();
        }

        void a() {
            i v10 = e.this.f1092c.v();
            if (v10 != null) {
                ArrayList<i> z10 = e.this.f1092c.z();
                int size = z10.size();
                for (int i10 = 0; i10 < size; i10++) {
                    if (z10.get(i10) == v10) {
                        this.f1099a = i10;
                        return;
                    }
                }
            }
            this.f1099a = -1;
        }

        @Override // android.widget.Adapter
        /* renamed from: b */
        public i getItem(int i10) {
            ArrayList<i> z10 = e.this.f1092c.z();
            int i11 = i10 + e.this.f1094e;
            int i12 = this.f1099a;
            if (i12 >= 0 && i11 >= i12) {
                i11++;
            }
            return z10.get(i11);
        }

        @Override // android.widget.Adapter
        public int getCount() {
            int size = e.this.f1092c.z().size() - e.this.f1094e;
            return this.f1099a < 0 ? size : size - 1;
        }

        @Override // android.widget.Adapter
        public long getItemId(int i10) {
            return i10;
        }

        @Override // android.widget.Adapter
        public View getView(int i10, View view, ViewGroup viewGroup) {
            if (view == null) {
                e eVar = e.this;
                view = eVar.f1091b.inflate(eVar.f1096r, viewGroup, false);
            }
            ((n.a) view).c(getItem(i10), 0);
            return view;
        }

        @Override // android.widget.BaseAdapter
        public void notifyDataSetChanged() {
            a();
            super.notifyDataSetChanged();
        }
    }

    public e(int i10, int i11) {
        this.f1096r = i10;
        this.f1095f = i11;
    }

    public e(Context context, int i10) {
        this(i10, 0);
        this.f1090a = context;
        this.f1091b = LayoutInflater.from(context);
    }

    public ListAdapter a() {
        if (this.f1098t == null) {
            this.f1098t = new a();
        }
        return this.f1098t;
    }

    @Override // androidx.appcompat.view.menu.m
    public void b(g gVar, boolean z10) {
        m.a aVar = this.f1097s;
        if (aVar != null) {
            aVar.b(gVar, z10);
        }
    }

    @Override // androidx.appcompat.view.menu.m
    public boolean c(g gVar, i iVar) {
        return false;
    }

    @Override // androidx.appcompat.view.menu.m
    public void d(m.a aVar) {
        this.f1097s = aVar;
    }

    @Override // androidx.appcompat.view.menu.m
    public boolean e(r rVar) {
        if (!rVar.hasVisibleItems()) {
            return false;
        }
        new h(rVar).d(null);
        m.a aVar = this.f1097s;
        if (aVar == null) {
            return true;
        }
        aVar.c(rVar);
        return true;
    }

    @Override // androidx.appcompat.view.menu.m
    public void f(boolean z10) {
        a aVar = this.f1098t;
        if (aVar != null) {
            aVar.notifyDataSetChanged();
        }
    }

    @Override // androidx.appcompat.view.menu.m
    public boolean g() {
        return false;
    }

    @Override // androidx.appcompat.view.menu.m
    public boolean h(g gVar, i iVar) {
        return false;
    }

    /* JADX WARN: Removed duplicated region for block: B:10:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0029  */
    @Override // androidx.appcompat.view.menu.m
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void i(android.content.Context r3, androidx.appcompat.view.menu.g r4) {
        /*
            r2 = this;
            int r0 = r2.f1095f
            if (r0 == 0) goto L14
            android.view.ContextThemeWrapper r0 = new android.view.ContextThemeWrapper
            int r1 = r2.f1095f
            r0.<init>(r3, r1)
            r2.f1090a = r0
            android.view.LayoutInflater r3 = android.view.LayoutInflater.from(r0)
        L11:
            r2.f1091b = r3
            goto L23
        L14:
            android.content.Context r0 = r2.f1090a
            if (r0 == 0) goto L23
            r2.f1090a = r3
            android.view.LayoutInflater r0 = r2.f1091b
            if (r0 != 0) goto L23
            android.view.LayoutInflater r3 = android.view.LayoutInflater.from(r3)
            goto L11
        L23:
            r2.f1092c = r4
            androidx.appcompat.view.menu.e$a r3 = r2.f1098t
            if (r3 == 0) goto L2c
            r3.notifyDataSetChanged()
        L2c:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.view.menu.e.i(android.content.Context, androidx.appcompat.view.menu.g):void");
    }

    public n j(ViewGroup viewGroup) {
        if (this.f1093d == null) {
            this.f1093d = (ExpandedMenuView) this.f1091b.inflate(g.g.f15370g, viewGroup, false);
            if (this.f1098t == null) {
                this.f1098t = new a();
            }
            this.f1093d.setAdapter((ListAdapter) this.f1098t);
            this.f1093d.setOnItemClickListener(this);
        }
        return this.f1093d;
    }

    @Override // android.widget.AdapterView.OnItemClickListener
    public void onItemClick(AdapterView<?> adapterView, View view, int i10, long j10) {
        this.f1092c.M(this.f1098t.getItem(i10), this, 0);
    }
}

package androidx.appcompat.view.menu;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.BaseAdapter;
import android.widget.ListAdapter;
import androidx.appcompat.view.menu.InterfaceC0266m;
import androidx.appcompat.view.menu.InterfaceC0267n;
import java.util.ArrayList;
import p111g.C7383g;

/* renamed from: androidx.appcompat.view.menu.e */
/* loaded from: classes.dex */
public class C0258e implements InterfaceC0266m, AdapterView.OnItemClickListener {

    /* renamed from: a */
    Context f1245a;

    /* renamed from: b */
    LayoutInflater f1246b;

    /* renamed from: c */
    C0260g f1247c;

    /* renamed from: d */
    ExpandedMenuView f1248d;

    /* renamed from: e */
    int f1249e;

    /* renamed from: f */
    int f1250f;

    /* renamed from: r */
    int f1251r;

    /* renamed from: s */
    private InterfaceC0266m.a f1252s;

    /* renamed from: t */
    a f1253t;

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: androidx.appcompat.view.menu.e$a */
    /* loaded from: classes.dex */
    public class a extends BaseAdapter {

        /* renamed from: a */
        private int f1254a = -1;

        public a() {
            m1286a();
        }

        /* renamed from: a */
        void m1286a() {
            C0262i m1344v = C0258e.this.f1247c.m1344v();
            if (m1344v != null) {
                ArrayList<C0262i> m1348z = C0258e.this.f1247c.m1348z();
                int size = m1348z.size();
                for (int i10 = 0; i10 < size; i10++) {
                    if (m1348z.get(i10) == m1344v) {
                        this.f1254a = i10;
                        return;
                    }
                }
            }
            this.f1254a = -1;
        }

        @Override // android.widget.Adapter
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public C0262i getItem(int i10) {
            ArrayList<C0262i> m1348z = C0258e.this.f1247c.m1348z();
            int i11 = i10 + C0258e.this.f1249e;
            int i12 = this.f1254a;
            if (i12 >= 0 && i11 >= i12) {
                i11++;
            }
            return m1348z.get(i11);
        }

        @Override // android.widget.Adapter
        public int getCount() {
            int size = C0258e.this.f1247c.m1348z().size() - C0258e.this.f1249e;
            return this.f1254a < 0 ? size : size - 1;
        }

        @Override // android.widget.Adapter
        public long getItemId(int i10) {
            return i10;
        }

        @Override // android.widget.Adapter
        public View getView(int i10, View view, ViewGroup viewGroup) {
            if (view == null) {
                C0258e c0258e = C0258e.this;
                view = c0258e.f1246b.inflate(c0258e.f1251r, viewGroup, false);
            }
            ((InterfaceC0267n.a) view).mo1221c(getItem(i10), 0);
            return view;
        }

        @Override // android.widget.BaseAdapter
        public void notifyDataSetChanged() {
            m1286a();
            super.notifyDataSetChanged();
        }
    }

    public C0258e(int i10, int i11) {
        this.f1251r = i10;
        this.f1250f = i11;
    }

    public C0258e(Context context, int i10) {
        this(i10, 0);
        this.f1245a = context;
        this.f1246b = LayoutInflater.from(context);
    }

    /* renamed from: a */
    public ListAdapter m1284a() {
        if (this.f1253t == null) {
            this.f1253t = new a();
        }
        return this.f1253t;
    }

    @Override // androidx.appcompat.view.menu.InterfaceC0266m
    /* renamed from: b */
    public void mo1242b(C0260g c0260g, boolean z10) {
        InterfaceC0266m.a aVar = this.f1252s;
        if (aVar != null) {
            aVar.mo1035b(c0260g, z10);
        }
    }

    @Override // androidx.appcompat.view.menu.InterfaceC0266m
    /* renamed from: c */
    public boolean mo1243c(C0260g c0260g, C0262i c0262i) {
        return false;
    }

    @Override // androidx.appcompat.view.menu.InterfaceC0266m
    /* renamed from: d */
    public void mo1244d(InterfaceC0266m.a aVar) {
        this.f1252s = aVar;
    }

    @Override // androidx.appcompat.view.menu.InterfaceC0266m
    /* renamed from: e */
    public boolean mo1245e(SubMenuC0271r subMenuC0271r) {
        if (!subMenuC0271r.hasVisibleItems()) {
            return false;
        }
        new DialogInterfaceOnKeyListenerC0261h(subMenuC0271r).m1350d(null);
        InterfaceC0266m.a aVar = this.f1252s;
        if (aVar == null) {
            return true;
        }
        aVar.mo1036c(subMenuC0271r);
        return true;
    }

    @Override // androidx.appcompat.view.menu.InterfaceC0266m
    /* renamed from: f */
    public void mo1246f(boolean z10) {
        a aVar = this.f1253t;
        if (aVar != null) {
            aVar.notifyDataSetChanged();
        }
    }

    @Override // androidx.appcompat.view.menu.InterfaceC0266m
    /* renamed from: g */
    public boolean mo1270g() {
        return false;
    }

    @Override // androidx.appcompat.view.menu.InterfaceC0266m
    /* renamed from: h */
    public boolean mo1247h(C0260g c0260g, C0262i c0262i) {
        return false;
    }

    /* JADX WARN: Removed duplicated region for block: B:10:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0029  */
    @Override // androidx.appcompat.view.menu.InterfaceC0266m
    /* renamed from: i */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void mo1248i(android.content.Context r3, androidx.appcompat.view.menu.C0260g r4) {
        /*
            r2 = this;
            int r0 = r2.f1250f
            if (r0 == 0) goto L14
            android.view.ContextThemeWrapper r0 = new android.view.ContextThemeWrapper
            int r1 = r2.f1250f
            r0.<init>(r3, r1)
            r2.f1245a = r0
            android.view.LayoutInflater r3 = android.view.LayoutInflater.from(r0)
        L11:
            r2.f1246b = r3
            goto L23
        L14:
            android.content.Context r0 = r2.f1245a
            if (r0 == 0) goto L23
            r2.f1245a = r3
            android.view.LayoutInflater r0 = r2.f1246b
            if (r0 != 0) goto L23
            android.view.LayoutInflater r3 = android.view.LayoutInflater.from(r3)
            goto L11
        L23:
            r2.f1247c = r4
            androidx.appcompat.view.menu.e$a r3 = r2.f1253t
            if (r3 == 0) goto L2c
            r3.notifyDataSetChanged()
        L2c:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.view.menu.C0258e.mo1248i(android.content.Context, androidx.appcompat.view.menu.g):void");
    }

    /* renamed from: j */
    public InterfaceC0267n m1285j(ViewGroup viewGroup) {
        if (this.f1248d == null) {
            this.f1248d = (ExpandedMenuView) this.f1246b.inflate(C7383g.f16841g, viewGroup, false);
            if (this.f1253t == null) {
                this.f1253t = new a();
            }
            this.f1248d.setAdapter((ListAdapter) this.f1253t);
            this.f1248d.setOnItemClickListener(this);
        }
        return this.f1248d;
    }

    @Override // android.widget.AdapterView.OnItemClickListener
    public void onItemClick(AdapterView<?> adapterView, View view, int i10, long j10) {
        this.f1247c.m1311M(this.f1253t.getItem(i10), this, 0);
    }
}

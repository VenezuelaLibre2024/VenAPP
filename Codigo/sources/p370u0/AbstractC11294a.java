package p370u0;

import android.content.Context;
import android.database.ContentObserver;
import android.database.Cursor;
import android.database.DataSetObserver;
import android.os.Handler;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.Filter;
import android.widget.Filterable;
import p370u0.C11295b;

/* renamed from: u0.a */
/* loaded from: classes.dex */
public abstract class AbstractC11294a extends BaseAdapter implements Filterable, C11295b.a {

    /* renamed from: a */
    protected boolean f29301a;

    /* renamed from: b */
    protected boolean f29302b;

    /* renamed from: c */
    protected Cursor f29303c;

    /* renamed from: d */
    protected Context f29304d;

    /* renamed from: e */
    protected int f29305e;

    /* renamed from: f */
    protected a f29306f;

    /* renamed from: r */
    protected DataSetObserver f29307r;

    /* renamed from: s */
    protected C11295b f29308s;

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: u0.a$a */
    /* loaded from: classes.dex */
    public class a extends ContentObserver {
        a() {
            super(new Handler());
        }

        @Override // android.database.ContentObserver
        public boolean deliverSelfNotifications() {
            return true;
        }

        @Override // android.database.ContentObserver
        public void onChange(boolean z10) {
            AbstractC11294a.this.m35295h();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: u0.a$b */
    /* loaded from: classes.dex */
    public class b extends DataSetObserver {
        b() {
        }

        @Override // android.database.DataSetObserver
        public void onChanged() {
            AbstractC11294a abstractC11294a = AbstractC11294a.this;
            abstractC11294a.f29301a = true;
            abstractC11294a.notifyDataSetChanged();
        }

        @Override // android.database.DataSetObserver
        public void onInvalidated() {
            AbstractC11294a abstractC11294a = AbstractC11294a.this;
            abstractC11294a.f29301a = false;
            abstractC11294a.notifyDataSetInvalidated();
        }
    }

    public AbstractC11294a(Context context, Cursor cursor, boolean z10) {
        m35293e(context, cursor, z10 ? 1 : 2);
    }

    /* renamed from: a */
    public void mo1723a(Cursor cursor) {
        Cursor m35296i = m35296i(cursor);
        if (m35296i != null) {
            m35296i.close();
        }
    }

    @Override // p370u0.C11295b.a
    /* renamed from: c */
    public Cursor mo35292c() {
        return this.f29303c;
    }

    public abstract CharSequence convertToString(Cursor cursor);

    /* renamed from: d */
    public abstract void mo1725d(View view, Context context, Cursor cursor);

    /* renamed from: e */
    void m35293e(Context context, Cursor cursor, int i10) {
        b bVar;
        if ((i10 & 1) == 1) {
            i10 |= 2;
            this.f29302b = true;
        } else {
            this.f29302b = false;
        }
        boolean z10 = cursor != null;
        this.f29303c = cursor;
        this.f29301a = z10;
        this.f29304d = context;
        this.f29305e = z10 ? cursor.getColumnIndexOrThrow("_id") : -1;
        if ((i10 & 2) == 2) {
            this.f29306f = new a();
            bVar = new b();
        } else {
            bVar = null;
            this.f29306f = null;
        }
        this.f29307r = bVar;
        if (z10) {
            a aVar = this.f29306f;
            if (aVar != null) {
                cursor.registerContentObserver(aVar);
            }
            DataSetObserver dataSetObserver = this.f29307r;
            if (dataSetObserver != null) {
                cursor.registerDataSetObserver(dataSetObserver);
            }
        }
    }

    /* renamed from: f */
    public abstract View mo35294f(Context context, Cursor cursor, ViewGroup viewGroup);

    /* renamed from: g */
    public abstract View mo1726g(Context context, Cursor cursor, ViewGroup viewGroup);

    @Override // android.widget.Adapter
    public int getCount() {
        Cursor cursor;
        if (!this.f29301a || (cursor = this.f29303c) == null) {
            return 0;
        }
        return cursor.getCount();
    }

    @Override // android.widget.BaseAdapter, android.widget.SpinnerAdapter
    public View getDropDownView(int i10, View view, ViewGroup viewGroup) {
        if (!this.f29301a) {
            return null;
        }
        this.f29303c.moveToPosition(i10);
        if (view == null) {
            view = mo35294f(this.f29304d, this.f29303c, viewGroup);
        }
        mo1725d(view, this.f29304d, this.f29303c);
        return view;
    }

    @Override // android.widget.Filterable
    public Filter getFilter() {
        if (this.f29308s == null) {
            this.f29308s = new C11295b(this);
        }
        return this.f29308s;
    }

    @Override // android.widget.Adapter
    public Object getItem(int i10) {
        Cursor cursor;
        if (!this.f29301a || (cursor = this.f29303c) == null) {
            return null;
        }
        cursor.moveToPosition(i10);
        return this.f29303c;
    }

    @Override // android.widget.Adapter
    public long getItemId(int i10) {
        Cursor cursor;
        if (this.f29301a && (cursor = this.f29303c) != null && cursor.moveToPosition(i10)) {
            return this.f29303c.getLong(this.f29305e);
        }
        return 0L;
    }

    @Override // android.widget.Adapter
    public View getView(int i10, View view, ViewGroup viewGroup) {
        if (!this.f29301a) {
            throw new IllegalStateException("this should only be called when the cursor is valid");
        }
        if (this.f29303c.moveToPosition(i10)) {
            if (view == null) {
                view = mo1726g(this.f29304d, this.f29303c, viewGroup);
            }
            mo1725d(view, this.f29304d, this.f29303c);
            return view;
        }
        throw new IllegalStateException("couldn't move cursor to position " + i10);
    }

    /* renamed from: h */
    protected void m35295h() {
        Cursor cursor;
        if (!this.f29302b || (cursor = this.f29303c) == null || cursor.isClosed()) {
            return;
        }
        this.f29301a = this.f29303c.requery();
    }

    /* renamed from: i */
    public Cursor m35296i(Cursor cursor) {
        Cursor cursor2 = this.f29303c;
        if (cursor == cursor2) {
            return null;
        }
        if (cursor2 != null) {
            a aVar = this.f29306f;
            if (aVar != null) {
                cursor2.unregisterContentObserver(aVar);
            }
            DataSetObserver dataSetObserver = this.f29307r;
            if (dataSetObserver != null) {
                cursor2.unregisterDataSetObserver(dataSetObserver);
            }
        }
        this.f29303c = cursor;
        if (cursor != null) {
            a aVar2 = this.f29306f;
            if (aVar2 != null) {
                cursor.registerContentObserver(aVar2);
            }
            DataSetObserver dataSetObserver2 = this.f29307r;
            if (dataSetObserver2 != null) {
                cursor.registerDataSetObserver(dataSetObserver2);
            }
            this.f29305e = cursor.getColumnIndexOrThrow("_id");
            this.f29301a = true;
            notifyDataSetChanged();
        } else {
            this.f29305e = -1;
            this.f29301a = false;
            notifyDataSetInvalidated();
        }
        return cursor2;
    }
}

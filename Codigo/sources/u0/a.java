package u0;

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
import u0.b;

/* loaded from: classes.dex */
public abstract class a extends BaseAdapter implements Filterable, b.a {

    /* renamed from: a, reason: collision with root package name */
    protected boolean f26999a;

    /* renamed from: b, reason: collision with root package name */
    protected boolean f27000b;

    /* renamed from: c, reason: collision with root package name */
    protected Cursor f27001c;

    /* renamed from: d, reason: collision with root package name */
    protected Context f27002d;

    /* renamed from: e, reason: collision with root package name */
    protected int f27003e;

    /* renamed from: f, reason: collision with root package name */
    protected C0443a f27004f;

    /* renamed from: r, reason: collision with root package name */
    protected DataSetObserver f27005r;

    /* renamed from: s, reason: collision with root package name */
    protected u0.b f27006s;

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: u0.a$a, reason: collision with other inner class name */
    /* loaded from: classes.dex */
    public class C0443a extends ContentObserver {
        C0443a() {
            super(new Handler());
        }

        @Override // android.database.ContentObserver
        public boolean deliverSelfNotifications() {
            return true;
        }

        @Override // android.database.ContentObserver
        public void onChange(boolean z10) {
            a.this.h();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes.dex */
    public class b extends DataSetObserver {
        b() {
        }

        @Override // android.database.DataSetObserver
        public void onChanged() {
            a aVar = a.this;
            aVar.f26999a = true;
            aVar.notifyDataSetChanged();
        }

        @Override // android.database.DataSetObserver
        public void onInvalidated() {
            a aVar = a.this;
            aVar.f26999a = false;
            aVar.notifyDataSetInvalidated();
        }
    }

    public a(Context context, Cursor cursor, boolean z10) {
        e(context, cursor, z10 ? 1 : 2);
    }

    public void a(Cursor cursor) {
        Cursor i10 = i(cursor);
        if (i10 != null) {
            i10.close();
        }
    }

    @Override // u0.b.a
    public Cursor c() {
        return this.f27001c;
    }

    public abstract CharSequence convertToString(Cursor cursor);

    public abstract void d(View view, Context context, Cursor cursor);

    void e(Context context, Cursor cursor, int i10) {
        b bVar;
        if ((i10 & 1) == 1) {
            i10 |= 2;
            this.f27000b = true;
        } else {
            this.f27000b = false;
        }
        boolean z10 = cursor != null;
        this.f27001c = cursor;
        this.f26999a = z10;
        this.f27002d = context;
        this.f27003e = z10 ? cursor.getColumnIndexOrThrow("_id") : -1;
        if ((i10 & 2) == 2) {
            this.f27004f = new C0443a();
            bVar = new b();
        } else {
            bVar = null;
            this.f27004f = null;
        }
        this.f27005r = bVar;
        if (z10) {
            C0443a c0443a = this.f27004f;
            if (c0443a != null) {
                cursor.registerContentObserver(c0443a);
            }
            DataSetObserver dataSetObserver = this.f27005r;
            if (dataSetObserver != null) {
                cursor.registerDataSetObserver(dataSetObserver);
            }
        }
    }

    public abstract View f(Context context, Cursor cursor, ViewGroup viewGroup);

    public abstract View g(Context context, Cursor cursor, ViewGroup viewGroup);

    @Override // android.widget.Adapter
    public int getCount() {
        Cursor cursor;
        if (!this.f26999a || (cursor = this.f27001c) == null) {
            return 0;
        }
        return cursor.getCount();
    }

    @Override // android.widget.BaseAdapter, android.widget.SpinnerAdapter
    public View getDropDownView(int i10, View view, ViewGroup viewGroup) {
        if (!this.f26999a) {
            return null;
        }
        this.f27001c.moveToPosition(i10);
        if (view == null) {
            view = f(this.f27002d, this.f27001c, viewGroup);
        }
        d(view, this.f27002d, this.f27001c);
        return view;
    }

    @Override // android.widget.Filterable
    public Filter getFilter() {
        if (this.f27006s == null) {
            this.f27006s = new u0.b(this);
        }
        return this.f27006s;
    }

    @Override // android.widget.Adapter
    public Object getItem(int i10) {
        Cursor cursor;
        if (!this.f26999a || (cursor = this.f27001c) == null) {
            return null;
        }
        cursor.moveToPosition(i10);
        return this.f27001c;
    }

    @Override // android.widget.Adapter
    public long getItemId(int i10) {
        Cursor cursor;
        if (this.f26999a && (cursor = this.f27001c) != null && cursor.moveToPosition(i10)) {
            return this.f27001c.getLong(this.f27003e);
        }
        return 0L;
    }

    @Override // android.widget.Adapter
    public View getView(int i10, View view, ViewGroup viewGroup) {
        if (!this.f26999a) {
            throw new IllegalStateException("this should only be called when the cursor is valid");
        }
        if (this.f27001c.moveToPosition(i10)) {
            if (view == null) {
                view = g(this.f27002d, this.f27001c, viewGroup);
            }
            d(view, this.f27002d, this.f27001c);
            return view;
        }
        throw new IllegalStateException("couldn't move cursor to position " + i10);
    }

    protected void h() {
        Cursor cursor;
        if (!this.f27000b || (cursor = this.f27001c) == null || cursor.isClosed()) {
            return;
        }
        this.f26999a = this.f27001c.requery();
    }

    public Cursor i(Cursor cursor) {
        Cursor cursor2 = this.f27001c;
        if (cursor == cursor2) {
            return null;
        }
        if (cursor2 != null) {
            C0443a c0443a = this.f27004f;
            if (c0443a != null) {
                cursor2.unregisterContentObserver(c0443a);
            }
            DataSetObserver dataSetObserver = this.f27005r;
            if (dataSetObserver != null) {
                cursor2.unregisterDataSetObserver(dataSetObserver);
            }
        }
        this.f27001c = cursor;
        if (cursor != null) {
            C0443a c0443a2 = this.f27004f;
            if (c0443a2 != null) {
                cursor.registerContentObserver(c0443a2);
            }
            DataSetObserver dataSetObserver2 = this.f27005r;
            if (dataSetObserver2 != null) {
                cursor.registerDataSetObserver(dataSetObserver2);
            }
            this.f27003e = cursor.getColumnIndexOrThrow("_id");
            this.f26999a = true;
            notifyDataSetChanged();
        } else {
            this.f27003e = -1;
            this.f26999a = false;
            notifyDataSetInvalidated();
        }
        return cursor2;
    }
}

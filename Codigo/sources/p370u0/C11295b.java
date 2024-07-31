package p370u0;

import android.database.Cursor;
import android.widget.Filter;

/* renamed from: u0.b */
/* loaded from: classes.dex */
class C11295b extends Filter {

    /* renamed from: a */
    a f29311a;

    /* renamed from: u0.b$a */
    /* loaded from: classes.dex */
    interface a {
        /* renamed from: a */
        void mo1723a(Cursor cursor);

        /* renamed from: b */
        Cursor mo1724b(CharSequence charSequence);

        /* renamed from: c */
        Cursor mo35292c();

        CharSequence convertToString(Cursor cursor);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public C11295b(a aVar) {
        this.f29311a = aVar;
    }

    @Override // android.widget.Filter
    public CharSequence convertResultToString(Object obj) {
        return this.f29311a.convertToString((Cursor) obj);
    }

    @Override // android.widget.Filter
    protected Filter.FilterResults performFiltering(CharSequence charSequence) {
        Cursor mo1724b = this.f29311a.mo1724b(charSequence);
        Filter.FilterResults filterResults = new Filter.FilterResults();
        if (mo1724b != null) {
            filterResults.count = mo1724b.getCount();
        } else {
            filterResults.count = 0;
            mo1724b = null;
        }
        filterResults.values = mo1724b;
        return filterResults;
    }

    @Override // android.widget.Filter
    protected void publishResults(CharSequence charSequence, Filter.FilterResults filterResults) {
        Cursor mo35292c = this.f29311a.mo35292c();
        Object obj = filterResults.values;
        if (obj == null || obj == mo35292c) {
            return;
        }
        this.f29311a.mo1723a((Cursor) obj);
    }
}

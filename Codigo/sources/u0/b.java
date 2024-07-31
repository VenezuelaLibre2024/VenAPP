package u0;

import android.database.Cursor;
import android.widget.Filter;

/* loaded from: classes.dex */
class b extends Filter {

    /* renamed from: a, reason: collision with root package name */
    a f27009a;

    /* loaded from: classes.dex */
    interface a {
        void a(Cursor cursor);

        Cursor b(CharSequence charSequence);

        Cursor c();

        CharSequence convertToString(Cursor cursor);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public b(a aVar) {
        this.f27009a = aVar;
    }

    @Override // android.widget.Filter
    public CharSequence convertResultToString(Object obj) {
        return this.f27009a.convertToString((Cursor) obj);
    }

    @Override // android.widget.Filter
    protected Filter.FilterResults performFiltering(CharSequence charSequence) {
        Cursor b10 = this.f27009a.b(charSequence);
        Filter.FilterResults filterResults = new Filter.FilterResults();
        if (b10 != null) {
            filterResults.count = b10.getCount();
        } else {
            filterResults.count = 0;
            b10 = null;
        }
        filterResults.values = b10;
        return filterResults;
    }

    @Override // android.widget.Filter
    protected void publishResults(CharSequence charSequence, Filter.FilterResults filterResults) {
        Cursor c10 = this.f27009a.c();
        Object obj = filterResults.values;
        if (obj == null || obj == c10) {
            return;
        }
        this.f27009a.a((Cursor) obj);
    }
}

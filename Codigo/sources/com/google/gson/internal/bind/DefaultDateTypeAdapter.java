package com.google.gson.internal.bind;

import com.google.gson.TypeAdapter;
import com.google.gson.internal.d;
import com.google.gson.internal.i;
import com.google.gson.r;
import com.google.gson.v;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.ParsePosition;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import nf.c;

/* loaded from: classes2.dex */
public final class DefaultDateTypeAdapter<T extends Date> extends TypeAdapter<T> {

    /* renamed from: a, reason: collision with root package name */
    private final b<T> f12829a;

    /* renamed from: b, reason: collision with root package name */
    private final List<DateFormat> f12830b;

    /* loaded from: classes2.dex */
    public static abstract class b<T extends Date> {

        /* renamed from: b, reason: collision with root package name */
        public static final b<Date> f12831b = new a(Date.class);

        /* renamed from: a, reason: collision with root package name */
        private final Class<T> f12832a;

        /* loaded from: classes2.dex */
        class a extends b<Date> {
            a(Class cls) {
                super(cls);
            }

            @Override // com.google.gson.internal.bind.DefaultDateTypeAdapter.b
            protected Date d(Date date) {
                return date;
            }
        }

        /* JADX INFO: Access modifiers changed from: protected */
        public b(Class<T> cls) {
            this.f12832a = cls;
        }

        private final v c(DefaultDateTypeAdapter<T> defaultDateTypeAdapter) {
            return TypeAdapters.a(this.f12832a, defaultDateTypeAdapter);
        }

        public final v a(int i10, int i11) {
            return c(new DefaultDateTypeAdapter<>(this, i10, i11));
        }

        public final v b(String str) {
            return c(new DefaultDateTypeAdapter<>(this, str));
        }

        protected abstract T d(Date date);
    }

    private DefaultDateTypeAdapter(b<T> bVar, int i10, int i11) {
        ArrayList arrayList = new ArrayList();
        this.f12830b = arrayList;
        this.f12829a = (b) com.google.gson.internal.a.b(bVar);
        Locale locale = Locale.US;
        arrayList.add(DateFormat.getDateTimeInstance(i10, i11, locale));
        if (!Locale.getDefault().equals(locale)) {
            arrayList.add(DateFormat.getDateTimeInstance(i10, i11));
        }
        if (d.d()) {
            arrayList.add(i.c(i10, i11));
        }
    }

    private DefaultDateTypeAdapter(b<T> bVar, String str) {
        ArrayList arrayList = new ArrayList();
        this.f12830b = arrayList;
        this.f12829a = (b) com.google.gson.internal.a.b(bVar);
        Locale locale = Locale.US;
        arrayList.add(new SimpleDateFormat(str, locale));
        if (Locale.getDefault().equals(locale)) {
            return;
        }
        arrayList.add(new SimpleDateFormat(str));
    }

    private Date a(nf.a aVar) {
        String a02 = aVar.a0();
        synchronized (this.f12830b) {
            Iterator<DateFormat> it = this.f12830b.iterator();
            while (it.hasNext()) {
                try {
                    return it.next().parse(a02);
                } catch (ParseException unused) {
                }
            }
            try {
                return lf.a.c(a02, new ParsePosition(0));
            } catch (ParseException e10) {
                throw new r("Failed parsing '" + a02 + "' as Date; at path " + aVar.o(), e10);
            }
        }
    }

    @Override // com.google.gson.TypeAdapter
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public T read(nf.a aVar) {
        if (aVar.h0() == nf.b.NULL) {
            aVar.S();
            return null;
        }
        return this.f12829a.d(a(aVar));
    }

    @Override // com.google.gson.TypeAdapter
    /* renamed from: c, reason: merged with bridge method [inline-methods] */
    public void write(c cVar, Date date) {
        String format;
        if (date == null) {
            cVar.B();
            return;
        }
        DateFormat dateFormat = this.f12830b.get(0);
        synchronized (this.f12830b) {
            format = dateFormat.format(date);
        }
        cVar.j0(format);
    }

    public String toString() {
        StringBuilder sb2;
        String simpleName;
        DateFormat dateFormat = this.f12830b.get(0);
        if (dateFormat instanceof SimpleDateFormat) {
            sb2 = new StringBuilder();
            sb2.append("DefaultDateTypeAdapter(");
            simpleName = ((SimpleDateFormat) dateFormat).toPattern();
        } else {
            sb2 = new StringBuilder();
            sb2.append("DefaultDateTypeAdapter(");
            simpleName = dateFormat.getClass().getSimpleName();
        }
        sb2.append(simpleName);
        sb2.append(')');
        return sb2.toString();
    }
}

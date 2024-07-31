package com.google.gson.internal.bind;

import com.google.gson.Gson;
import com.google.gson.TypeAdapter;
import com.google.gson.internal.d;
import com.google.gson.internal.i;
import com.google.gson.r;
import com.google.gson.v;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.ParsePosition;
import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import nf.c;

/* loaded from: classes2.dex */
public final class DateTypeAdapter extends TypeAdapter<Date> {

    /* renamed from: b, reason: collision with root package name */
    public static final v f12827b = new v() { // from class: com.google.gson.internal.bind.DateTypeAdapter.1
        @Override // com.google.gson.v
        public <T> TypeAdapter<T> create(Gson gson, com.google.gson.reflect.a<T> aVar) {
            if (aVar.getRawType() == Date.class) {
                return new DateTypeAdapter();
            }
            return null;
        }
    };

    /* renamed from: a, reason: collision with root package name */
    private final List<DateFormat> f12828a;

    public DateTypeAdapter() {
        ArrayList arrayList = new ArrayList();
        this.f12828a = arrayList;
        Locale locale = Locale.US;
        arrayList.add(DateFormat.getDateTimeInstance(2, 2, locale));
        if (!Locale.getDefault().equals(locale)) {
            arrayList.add(DateFormat.getDateTimeInstance(2, 2));
        }
        if (d.d()) {
            arrayList.add(i.c(2, 2));
        }
    }

    private Date a(nf.a aVar) {
        String a02 = aVar.a0();
        synchronized (this.f12828a) {
            Iterator<DateFormat> it = this.f12828a.iterator();
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
    public Date read(nf.a aVar) {
        if (aVar.h0() != nf.b.NULL) {
            return a(aVar);
        }
        aVar.S();
        return null;
    }

    @Override // com.google.gson.TypeAdapter
    /* renamed from: c, reason: merged with bridge method [inline-methods] */
    public void write(c cVar, Date date) {
        String format;
        if (date == null) {
            cVar.B();
            return;
        }
        DateFormat dateFormat = this.f12828a.get(0);
        synchronized (this.f12828a) {
            format = dateFormat.format(date);
        }
        cVar.j0(format);
    }
}

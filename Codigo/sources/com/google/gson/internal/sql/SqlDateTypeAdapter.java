package com.google.gson.internal.sql;

import com.google.gson.Gson;
import com.google.gson.TypeAdapter;
import com.google.gson.r;
import com.google.gson.v;
import java.sql.Date;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import nf.b;
import nf.c;

/* loaded from: classes2.dex */
final class SqlDateTypeAdapter extends TypeAdapter<Date> {

    /* renamed from: b, reason: collision with root package name */
    static final v f12994b = new v() { // from class: com.google.gson.internal.sql.SqlDateTypeAdapter.1
        @Override // com.google.gson.v
        public <T> TypeAdapter<T> create(Gson gson, com.google.gson.reflect.a<T> aVar) {
            if (aVar.getRawType() == Date.class) {
                return new SqlDateTypeAdapter();
            }
            return null;
        }
    };

    /* renamed from: a, reason: collision with root package name */
    private final DateFormat f12995a;

    private SqlDateTypeAdapter() {
        this.f12995a = new SimpleDateFormat("MMM d, yyyy");
    }

    @Override // com.google.gson.TypeAdapter
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public Date read(nf.a aVar) {
        java.util.Date parse;
        if (aVar.h0() == b.NULL) {
            aVar.S();
            return null;
        }
        String a02 = aVar.a0();
        try {
            synchronized (this) {
                parse = this.f12995a.parse(a02);
            }
            return new Date(parse.getTime());
        } catch (ParseException e10) {
            throw new r("Failed parsing '" + a02 + "' as SQL Date; at path " + aVar.o(), e10);
        }
    }

    @Override // com.google.gson.TypeAdapter
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public void write(c cVar, Date date) {
        String format;
        if (date == null) {
            cVar.B();
            return;
        }
        synchronized (this) {
            format = this.f12995a.format((java.util.Date) date);
        }
        cVar.j0(format);
    }
}

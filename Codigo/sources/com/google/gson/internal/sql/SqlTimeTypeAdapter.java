package com.google.gson.internal.sql;

import com.google.gson.Gson;
import com.google.gson.TypeAdapter;
import com.google.gson.r;
import com.google.gson.v;
import java.sql.Time;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import nf.b;
import nf.c;

/* loaded from: classes2.dex */
final class SqlTimeTypeAdapter extends TypeAdapter<Time> {

    /* renamed from: b, reason: collision with root package name */
    static final v f12996b = new v() { // from class: com.google.gson.internal.sql.SqlTimeTypeAdapter.1
        @Override // com.google.gson.v
        public <T> TypeAdapter<T> create(Gson gson, com.google.gson.reflect.a<T> aVar) {
            if (aVar.getRawType() == Time.class) {
                return new SqlTimeTypeAdapter();
            }
            return null;
        }
    };

    /* renamed from: a, reason: collision with root package name */
    private final DateFormat f12997a;

    private SqlTimeTypeAdapter() {
        this.f12997a = new SimpleDateFormat("hh:mm:ss a");
    }

    @Override // com.google.gson.TypeAdapter
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public Time read(nf.a aVar) {
        Time time;
        if (aVar.h0() == b.NULL) {
            aVar.S();
            return null;
        }
        String a02 = aVar.a0();
        try {
            synchronized (this) {
                time = new Time(this.f12997a.parse(a02).getTime());
            }
            return time;
        } catch (ParseException e10) {
            throw new r("Failed parsing '" + a02 + "' as SQL Time; at path " + aVar.o(), e10);
        }
    }

    @Override // com.google.gson.TypeAdapter
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public void write(c cVar, Time time) {
        String format;
        if (time == null) {
            cVar.B();
            return;
        }
        synchronized (this) {
            format = this.f12997a.format((Date) time);
        }
        cVar.j0(format);
    }
}

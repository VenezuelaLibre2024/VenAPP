package com.google.gson.internal.sql;

import com.google.gson.Gson;
import com.google.gson.TypeAdapter;
import com.google.gson.v;
import java.sql.Timestamp;
import java.util.Date;
import nf.c;

/* loaded from: classes2.dex */
class SqlTimestampTypeAdapter extends TypeAdapter<Timestamp> {

    /* renamed from: b, reason: collision with root package name */
    static final v f12998b = new v() { // from class: com.google.gson.internal.sql.SqlTimestampTypeAdapter.1
        @Override // com.google.gson.v
        public <T> TypeAdapter<T> create(Gson gson, com.google.gson.reflect.a<T> aVar) {
            if (aVar.getRawType() == Timestamp.class) {
                return new SqlTimestampTypeAdapter(gson.l(Date.class));
            }
            return null;
        }
    };

    /* renamed from: a, reason: collision with root package name */
    private final TypeAdapter<Date> f12999a;

    private SqlTimestampTypeAdapter(TypeAdapter<Date> typeAdapter) {
        this.f12999a = typeAdapter;
    }

    @Override // com.google.gson.TypeAdapter
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public Timestamp read(nf.a aVar) {
        Date read = this.f12999a.read(aVar);
        if (read != null) {
            return new Timestamp(read.getTime());
        }
        return null;
    }

    @Override // com.google.gson.TypeAdapter
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public void write(c cVar, Timestamp timestamp) {
        this.f12999a.write(cVar, timestamp);
    }
}

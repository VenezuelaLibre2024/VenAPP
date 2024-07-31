package com.google.gson.internal.bind;

import com.google.gson.Gson;
import com.google.gson.TypeAdapter;
import com.google.gson.internal.g;
import com.google.gson.t;
import com.google.gson.u;
import com.google.gson.v;
import java.util.ArrayList;
import nf.c;

/* loaded from: classes2.dex */
public final class ObjectTypeAdapter extends TypeAdapter<Object> {

    /* renamed from: c, reason: collision with root package name */
    private static final v f12844c = b(t.DOUBLE);

    /* renamed from: a, reason: collision with root package name */
    private final Gson f12845a;

    /* renamed from: b, reason: collision with root package name */
    private final u f12846b;

    /* loaded from: classes2.dex */
    static /* synthetic */ class a {

        /* renamed from: a, reason: collision with root package name */
        static final /* synthetic */ int[] f12848a;

        static {
            int[] iArr = new int[nf.b.values().length];
            f12848a = iArr;
            try {
                iArr[nf.b.BEGIN_ARRAY.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f12848a[nf.b.BEGIN_OBJECT.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f12848a[nf.b.STRING.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f12848a[nf.b.NUMBER.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f12848a[nf.b.BOOLEAN.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f12848a[nf.b.NULL.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
        }
    }

    private ObjectTypeAdapter(Gson gson, u uVar) {
        this.f12845a = gson;
        this.f12846b = uVar;
    }

    public static v a(u uVar) {
        return uVar == t.DOUBLE ? f12844c : b(uVar);
    }

    private static v b(final u uVar) {
        return new v() { // from class: com.google.gson.internal.bind.ObjectTypeAdapter.1
            @Override // com.google.gson.v
            public <T> TypeAdapter<T> create(Gson gson, com.google.gson.reflect.a<T> aVar) {
                if (aVar.getRawType() == Object.class) {
                    return new ObjectTypeAdapter(gson, u.this);
                }
                return null;
            }
        };
    }

    @Override // com.google.gson.TypeAdapter
    public Object read(nf.a aVar) {
        switch (a.f12848a[aVar.h0().ordinal()]) {
            case 1:
                ArrayList arrayList = new ArrayList();
                aVar.a();
                while (aVar.q()) {
                    arrayList.add(read(aVar));
                }
                aVar.i();
                return arrayList;
            case 2:
                g gVar = new g();
                aVar.b();
                while (aVar.q()) {
                    gVar.put(aVar.Q(), read(aVar));
                }
                aVar.j();
                return gVar;
            case 3:
                return aVar.a0();
            case 4:
                return this.f12846b.b(aVar);
            case 5:
                return Boolean.valueOf(aVar.E());
            case 6:
                aVar.S();
                return null;
            default:
                throw new IllegalStateException();
        }
    }

    @Override // com.google.gson.TypeAdapter
    public void write(c cVar, Object obj) {
        if (obj == null) {
            cVar.B();
            return;
        }
        TypeAdapter l10 = this.f12845a.l(obj.getClass());
        if (!(l10 instanceof ObjectTypeAdapter)) {
            l10.write(cVar, obj);
        } else {
            cVar.f();
            cVar.j();
        }
    }
}

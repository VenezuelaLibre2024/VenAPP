package com.google.gson.internal.bind;

import com.google.gson.Gson;
import com.google.gson.TypeAdapter;
import com.google.gson.r;
import com.google.gson.t;
import com.google.gson.u;
import com.google.gson.v;
import nf.c;

/* loaded from: classes2.dex */
public final class NumberTypeAdapter extends TypeAdapter<Number> {

    /* renamed from: b, reason: collision with root package name */
    private static final v f12840b = b(t.LAZILY_PARSED_NUMBER);

    /* renamed from: a, reason: collision with root package name */
    private final u f12841a;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes2.dex */
    public static /* synthetic */ class a {

        /* renamed from: a, reason: collision with root package name */
        static final /* synthetic */ int[] f12843a;

        static {
            int[] iArr = new int[nf.b.values().length];
            f12843a = iArr;
            try {
                iArr[nf.b.NULL.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f12843a[nf.b.NUMBER.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f12843a[nf.b.STRING.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
        }
    }

    private NumberTypeAdapter(u uVar) {
        this.f12841a = uVar;
    }

    public static v a(u uVar) {
        return uVar == t.LAZILY_PARSED_NUMBER ? f12840b : b(uVar);
    }

    private static v b(u uVar) {
        return new v() { // from class: com.google.gson.internal.bind.NumberTypeAdapter.1
            @Override // com.google.gson.v
            public <T> TypeAdapter<T> create(Gson gson, com.google.gson.reflect.a<T> aVar) {
                if (aVar.getRawType() == Number.class) {
                    return NumberTypeAdapter.this;
                }
                return null;
            }
        };
    }

    @Override // com.google.gson.TypeAdapter
    /* renamed from: c, reason: merged with bridge method [inline-methods] */
    public Number read(nf.a aVar) {
        nf.b h02 = aVar.h0();
        int i10 = a.f12843a[h02.ordinal()];
        if (i10 == 1) {
            aVar.S();
            return null;
        }
        if (i10 == 2 || i10 == 3) {
            return this.f12841a.b(aVar);
        }
        throw new r("Expecting number, got: " + h02 + "; at path " + aVar.f0());
    }

    @Override // com.google.gson.TypeAdapter
    /* renamed from: d, reason: merged with bridge method [inline-methods] */
    public void write(c cVar, Number number) {
        cVar.i0(number);
    }
}

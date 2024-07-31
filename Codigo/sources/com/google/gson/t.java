package com.google.gson;

import java.math.BigDecimal;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes2.dex */
public abstract class t implements u {
    private static final /* synthetic */ t[] $VALUES;
    public static final t BIG_DECIMAL;
    public static final t DOUBLE;
    public static final t LAZILY_PARSED_NUMBER;
    public static final t LONG_OR_DOUBLE;

    /* loaded from: classes2.dex */
    enum a extends t {
        a(String str, int i10) {
            super(str, i10, null);
        }

        @Override // com.google.gson.u
        /* renamed from: h, reason: merged with bridge method [inline-methods] */
        public Double b(nf.a aVar) {
            return Double.valueOf(aVar.H());
        }
    }

    static {
        a aVar = new a("DOUBLE", 0);
        DOUBLE = aVar;
        t tVar = new t("LAZILY_PARSED_NUMBER", 1) { // from class: com.google.gson.t.b
            {
                a aVar2 = null;
            }

            @Override // com.google.gson.u
            public Number b(nf.a aVar2) {
                return new com.google.gson.internal.f(aVar2.a0());
            }
        };
        LAZILY_PARSED_NUMBER = tVar;
        t tVar2 = new t("LONG_OR_DOUBLE", 2) { // from class: com.google.gson.t.c
            {
                a aVar2 = null;
            }

            @Override // com.google.gson.u
            public Number b(nf.a aVar2) {
                String a02 = aVar2.a0();
                try {
                    try {
                        return Long.valueOf(Long.parseLong(a02));
                    } catch (NumberFormatException unused) {
                        Double valueOf = Double.valueOf(a02);
                        if ((!valueOf.isInfinite() && !valueOf.isNaN()) || aVar2.r()) {
                            return valueOf;
                        }
                        throw new nf.d("JSON forbids NaN and infinities: " + valueOf + "; at path " + aVar2.o());
                    }
                } catch (NumberFormatException e10) {
                    throw new n("Cannot parse " + a02 + "; at path " + aVar2.o(), e10);
                }
            }
        };
        LONG_OR_DOUBLE = tVar2;
        t tVar3 = new t("BIG_DECIMAL", 3) { // from class: com.google.gson.t.d
            {
                a aVar2 = null;
            }

            @Override // com.google.gson.u
            /* renamed from: h, reason: merged with bridge method [inline-methods] */
            public BigDecimal b(nf.a aVar2) {
                String a02 = aVar2.a0();
                try {
                    return new BigDecimal(a02);
                } catch (NumberFormatException e10) {
                    throw new n("Cannot parse " + a02 + "; at path " + aVar2.o(), e10);
                }
            }
        };
        BIG_DECIMAL = tVar3;
        $VALUES = new t[]{aVar, tVar, tVar2, tVar3};
    }

    private t(String str, int i10) {
    }

    /* synthetic */ t(String str, int i10, a aVar) {
        this(str, i10);
    }

    public static t valueOf(String str) {
        return (t) Enum.valueOf(t.class, str);
    }

    public static t[] values() {
        return (t[]) $VALUES.clone();
    }
}

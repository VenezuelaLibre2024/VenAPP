package com.google.gson;

import com.google.gson.internal.C6483f;
import java.math.BigDecimal;
import nf.C9712a;
import nf.C9715d;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* renamed from: com.google.gson.t */
/* loaded from: classes2.dex */
public abstract class EnumC6505t implements InterfaceC6506u {
    private static final /* synthetic */ EnumC6505t[] $VALUES;
    public static final EnumC6505t BIG_DECIMAL;
    public static final EnumC6505t DOUBLE;
    public static final EnumC6505t LAZILY_PARSED_NUMBER;
    public static final EnumC6505t LONG_OR_DOUBLE;

    /* renamed from: com.google.gson.t$a */
    /* loaded from: classes2.dex */
    enum a extends EnumC6505t {
        a(String str, int i10) {
            super(str, i10, null);
        }

        @Override // com.google.gson.InterfaceC6506u
        /* renamed from: h, reason: merged with bridge method [inline-methods] */
        public Double mo18297b(C9712a c9712a) {
            return Double.valueOf(c9712a.mo18200H());
        }
    }

    static {
        a aVar = new a("DOUBLE", 0);
        DOUBLE = aVar;
        EnumC6505t enumC6505t = new EnumC6505t("LAZILY_PARSED_NUMBER", 1) { // from class: com.google.gson.t.b
            {
                a aVar2 = null;
            }

            @Override // com.google.gson.InterfaceC6506u
            /* renamed from: b */
            public Number mo18297b(C9712a c9712a) {
                return new C6483f(c9712a.mo18209a0());
            }
        };
        LAZILY_PARSED_NUMBER = enumC6505t;
        EnumC6505t enumC6505t2 = new EnumC6505t("LONG_OR_DOUBLE", 2) { // from class: com.google.gson.t.c
            {
                a aVar2 = null;
            }

            @Override // com.google.gson.InterfaceC6506u
            /* renamed from: b */
            public Number mo18297b(C9712a c9712a) {
                String mo18209a0 = c9712a.mo18209a0();
                try {
                    try {
                        return Long.valueOf(Long.parseLong(mo18209a0));
                    } catch (NumberFormatException unused) {
                        Double valueOf = Double.valueOf(mo18209a0);
                        if ((!valueOf.isInfinite() && !valueOf.isNaN()) || c9712a.m29123r()) {
                            return valueOf;
                        }
                        throw new C9715d("JSON forbids NaN and infinities: " + valueOf + "; at path " + c9712a.mo18215o());
                    }
                } catch (NumberFormatException e10) {
                    throw new C6498n("Cannot parse " + mo18209a0 + "; at path " + c9712a.mo18215o(), e10);
                }
            }
        };
        LONG_OR_DOUBLE = enumC6505t2;
        EnumC6505t enumC6505t3 = new EnumC6505t("BIG_DECIMAL", 3) { // from class: com.google.gson.t.d
            {
                a aVar2 = null;
            }

            @Override // com.google.gson.InterfaceC6506u
            /* renamed from: h, reason: merged with bridge method [inline-methods] */
            public BigDecimal mo18297b(C9712a c9712a) {
                String mo18209a0 = c9712a.mo18209a0();
                try {
                    return new BigDecimal(mo18209a0);
                } catch (NumberFormatException e10) {
                    throw new C6498n("Cannot parse " + mo18209a0 + "; at path " + c9712a.mo18215o(), e10);
                }
            }
        };
        BIG_DECIMAL = enumC6505t3;
        $VALUES = new EnumC6505t[]{aVar, enumC6505t, enumC6505t2, enumC6505t3};
    }

    private EnumC6505t(String str, int i10) {
    }

    /* synthetic */ EnumC6505t(String str, int i10, a aVar) {
        this(str, i10);
    }

    public static EnumC6505t valueOf(String str) {
        return (EnumC6505t) Enum.valueOf(EnumC6505t.class, str);
    }

    public static EnumC6505t[] values() {
        return (EnumC6505t[]) $VALUES.clone();
    }
}

package com.google.gson;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* renamed from: com.google.gson.s */
/* loaded from: classes2.dex */
public abstract class EnumC6504s {
    private static final /* synthetic */ EnumC6504s[] $VALUES;
    public static final EnumC6504s DEFAULT;
    public static final EnumC6504s STRING;

    /* renamed from: com.google.gson.s$a */
    /* loaded from: classes2.dex */
    enum a extends EnumC6504s {
        a(String str, int i10) {
            super(str, i10, null);
        }
    }

    static {
        a aVar = new a("DEFAULT", 0);
        DEFAULT = aVar;
        EnumC6504s enumC6504s = new EnumC6504s("STRING", 1) { // from class: com.google.gson.s.b
            {
                a aVar2 = null;
            }
        };
        STRING = enumC6504s;
        $VALUES = new EnumC6504s[]{aVar, enumC6504s};
    }

    private EnumC6504s(String str, int i10) {
    }

    /* synthetic */ EnumC6504s(String str, int i10, a aVar) {
        this(str, i10);
    }

    public static EnumC6504s valueOf(String str) {
        return (EnumC6504s) Enum.valueOf(EnumC6504s.class, str);
    }

    public static EnumC6504s[] values() {
        return (EnumC6504s[]) $VALUES.clone();
    }
}

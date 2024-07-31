package com.google.gson;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes2.dex */
public abstract class s {
    private static final /* synthetic */ s[] $VALUES;
    public static final s DEFAULT;
    public static final s STRING;

    /* loaded from: classes2.dex */
    enum a extends s {
        a(String str, int i10) {
            super(str, i10, null);
        }
    }

    static {
        a aVar = new a("DEFAULT", 0);
        DEFAULT = aVar;
        s sVar = new s("STRING", 1) { // from class: com.google.gson.s.b
            {
                a aVar2 = null;
            }
        };
        STRING = sVar;
        $VALUES = new s[]{aVar, sVar};
    }

    private s(String str, int i10) {
    }

    /* synthetic */ s(String str, int i10, a aVar) {
        this(str, i10);
    }

    public static s valueOf(String str) {
        return (s) Enum.valueOf(s.class, str);
    }

    public static s[] values() {
        return (s[]) $VALUES.clone();
    }
}

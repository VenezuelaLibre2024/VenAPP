package com.google.firebase.perf.util;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* renamed from: com.google.firebase.perf.util.k */
/* loaded from: classes.dex */
public abstract class EnumC6337k {
    private static final /* synthetic */ EnumC6337k[] $VALUES;
    public static final EnumC6337k BYTES;
    public static final EnumC6337k GIGABYTES;
    public static final EnumC6337k KILOBYTES;
    public static final EnumC6337k MEGABYTES;
    public static final EnumC6337k TERABYTES;
    long numBytes;

    /* renamed from: com.google.firebase.perf.util.k$a */
    /* loaded from: classes.dex */
    enum a extends EnumC6337k {
        a(String str, int i10, long j10) {
            super(str, i10, j10, null);
        }
    }

    static {
        a aVar = new a("TERABYTES", 0, 1099511627776L);
        TERABYTES = aVar;
        EnumC6337k enumC6337k = new EnumC6337k("GIGABYTES", 1, 1073741824L) { // from class: com.google.firebase.perf.util.k.b
            {
                a aVar2 = null;
            }
        };
        GIGABYTES = enumC6337k;
        EnumC6337k enumC6337k2 = new EnumC6337k("MEGABYTES", 2, 1048576L) { // from class: com.google.firebase.perf.util.k.c
            {
                a aVar2 = null;
            }
        };
        MEGABYTES = enumC6337k2;
        EnumC6337k enumC6337k3 = new EnumC6337k("KILOBYTES", 3, 1024L) { // from class: com.google.firebase.perf.util.k.d
            {
                a aVar2 = null;
            }
        };
        KILOBYTES = enumC6337k3;
        EnumC6337k enumC6337k4 = new EnumC6337k("BYTES", 4, 1L) { // from class: com.google.firebase.perf.util.k.e
            {
                a aVar2 = null;
            }
        };
        BYTES = enumC6337k4;
        $VALUES = new EnumC6337k[]{aVar, enumC6337k, enumC6337k2, enumC6337k3, enumC6337k4};
    }

    private EnumC6337k(String str, int i10, long j10) {
        this.numBytes = j10;
    }

    /* synthetic */ EnumC6337k(String str, int i10, long j10, a aVar) {
        this(str, i10, j10);
    }

    public static EnumC6337k valueOf(String str) {
        return (EnumC6337k) Enum.valueOf(EnumC6337k.class, str);
    }

    public static EnumC6337k[] values() {
        return (EnumC6337k[]) $VALUES.clone();
    }

    /* renamed from: b */
    public long m17527b(long j10) {
        return (j10 * this.numBytes) / KILOBYTES.numBytes;
    }
}

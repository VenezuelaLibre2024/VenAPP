package com.google.protobuf;

/* JADX WARN: Enum visitor error
jadx.core.utils.exceptions.JadxRuntimeException: Init of enum field 'INT' uses external variables
	at jadx.core.dex.visitors.EnumVisitor.createEnumFieldByConstructor(EnumVisitor.java:451)
	at jadx.core.dex.visitors.EnumVisitor.processEnumFieldByField(EnumVisitor.java:372)
	at jadx.core.dex.visitors.EnumVisitor.processEnumFieldByWrappedInsn(EnumVisitor.java:337)
	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromFilledArray(EnumVisitor.java:322)
	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromInsn(EnumVisitor.java:262)
	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromInvoke(EnumVisitor.java:293)
	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromInsn(EnumVisitor.java:266)
	at jadx.core.dex.visitors.EnumVisitor.convertToEnum(EnumVisitor.java:151)
	at jadx.core.dex.visitors.EnumVisitor.visit(EnumVisitor.java:100)
 */
/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* loaded from: classes2.dex */
public final class c0 {
    private static final /* synthetic */ c0[] $VALUES;
    public static final c0 BOOLEAN;
    public static final c0 BYTE_STRING;
    public static final c0 DOUBLE;
    public static final c0 ENUM;
    public static final c0 FLOAT;
    public static final c0 INT;
    public static final c0 LONG;
    public static final c0 MESSAGE;
    public static final c0 STRING;
    public static final c0 VOID = new c0("VOID", 0, Void.class, Void.class, null);
    private final Class<?> boxedType;
    private final Object defaultDefault;
    private final Class<?> type;

    static {
        Class cls = Integer.TYPE;
        INT = new c0("INT", 1, cls, Integer.class, 0);
        LONG = new c0("LONG", 2, Long.TYPE, Long.class, 0L);
        FLOAT = new c0("FLOAT", 3, Float.TYPE, Float.class, Float.valueOf(0.0f));
        DOUBLE = new c0("DOUBLE", 4, Double.TYPE, Double.class, Double.valueOf(0.0d));
        BOOLEAN = new c0("BOOLEAN", 5, Boolean.TYPE, Boolean.class, Boolean.FALSE);
        STRING = new c0("STRING", 6, String.class, String.class, "");
        BYTE_STRING = new c0("BYTE_STRING", 7, g.class, g.class, g.f13185b);
        ENUM = new c0("ENUM", 8, cls, Integer.class, null);
        MESSAGE = new c0("MESSAGE", 9, Object.class, Object.class, null);
        $VALUES = b();
    }

    private c0(String str, int i10, Class cls, Class cls2, Object obj) {
        this.type = cls;
        this.boxedType = cls2;
        this.defaultDefault = obj;
    }

    private static /* synthetic */ c0[] b() {
        return new c0[]{VOID, INT, LONG, FLOAT, DOUBLE, BOOLEAN, STRING, BYTE_STRING, ENUM, MESSAGE};
    }

    public static c0 valueOf(String str) {
        return (c0) Enum.valueOf(c0.class, str);
    }

    public static c0[] values() {
        return (c0[]) $VALUES.clone();
    }

    public Class<?> h() {
        return this.boxedType;
    }
}

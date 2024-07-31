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
/* renamed from: com.google.protobuf.c0 */
/* loaded from: classes2.dex */
public final class EnumC6569c0 {
    private static final /* synthetic */ EnumC6569c0[] $VALUES;
    public static final EnumC6569c0 BOOLEAN;
    public static final EnumC6569c0 BYTE_STRING;
    public static final EnumC6569c0 DOUBLE;
    public static final EnumC6569c0 ENUM;
    public static final EnumC6569c0 FLOAT;
    public static final EnumC6569c0 INT;
    public static final EnumC6569c0 LONG;
    public static final EnumC6569c0 MESSAGE;
    public static final EnumC6569c0 STRING;
    public static final EnumC6569c0 VOID = new EnumC6569c0("VOID", 0, Void.class, Void.class, null);
    private final Class<?> boxedType;
    private final Object defaultDefault;
    private final Class<?> type;

    static {
        Class cls = Integer.TYPE;
        INT = new EnumC6569c0("INT", 1, cls, Integer.class, 0);
        LONG = new EnumC6569c0("LONG", 2, Long.TYPE, Long.class, 0L);
        FLOAT = new EnumC6569c0("FLOAT", 3, Float.TYPE, Float.class, Float.valueOf(0.0f));
        DOUBLE = new EnumC6569c0("DOUBLE", 4, Double.TYPE, Double.class, Double.valueOf(0.0d));
        BOOLEAN = new EnumC6569c0("BOOLEAN", 5, Boolean.TYPE, Boolean.class, Boolean.FALSE);
        STRING = new EnumC6569c0("STRING", 6, String.class, String.class, "");
        BYTE_STRING = new EnumC6569c0("BYTE_STRING", 7, AbstractC6580g.class, AbstractC6580g.class, AbstractC6580g.f14459b);
        ENUM = new EnumC6569c0("ENUM", 8, cls, Integer.class, null);
        MESSAGE = new EnumC6569c0("MESSAGE", 9, Object.class, Object.class, null);
        $VALUES = m18414b();
    }

    private EnumC6569c0(String str, int i10, Class cls, Class cls2, Object obj) {
        this.type = cls;
        this.boxedType = cls2;
        this.defaultDefault = obj;
    }

    /* renamed from: b */
    private static /* synthetic */ EnumC6569c0[] m18414b() {
        return new EnumC6569c0[]{VOID, INT, LONG, FLOAT, DOUBLE, BOOLEAN, STRING, BYTE_STRING, ENUM, MESSAGE};
    }

    public static EnumC6569c0 valueOf(String str) {
        return (EnumC6569c0) Enum.valueOf(EnumC6569c0.class, str);
    }

    public static EnumC6569c0[] values() {
        return (EnumC6569c0[]) $VALUES.clone();
    }

    /* renamed from: h */
    public Class<?> m18415h() {
        return this.boxedType;
    }
}

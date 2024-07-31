package com.google.crypto.tink.shaded.protobuf;

/* JADX WARN: Enum visitor error
jadx.core.utils.exceptions.JadxRuntimeException: Init of enum field 'INT' uses external variables
	at jadx.core.dex.visitors.EnumVisitor.createEnumFieldByConstructor(EnumVisitor.java:451)
	at jadx.core.dex.visitors.EnumVisitor.processEnumFieldByRegister(EnumVisitor.java:395)
	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromFilledArray(EnumVisitor.java:324)
	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromInsn(EnumVisitor.java:262)
	at jadx.core.dex.visitors.EnumVisitor.convertToEnum(EnumVisitor.java:151)
	at jadx.core.dex.visitors.EnumVisitor.visit(EnumVisitor.java:100)
 */
/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* renamed from: com.google.crypto.tink.shaded.protobuf.c0 */
/* loaded from: classes2.dex */
public final class EnumC5956c0 {
    private static final /* synthetic */ EnumC5956c0[] $VALUES;
    public static final EnumC5956c0 BOOLEAN;
    public static final EnumC5956c0 BYTE_STRING;
    public static final EnumC5956c0 DOUBLE;
    public static final EnumC5956c0 ENUM;
    public static final EnumC5956c0 FLOAT;
    public static final EnumC5956c0 INT;
    public static final EnumC5956c0 LONG;
    public static final EnumC5956c0 MESSAGE;
    public static final EnumC5956c0 STRING;
    public static final EnumC5956c0 VOID;
    private final Class<?> boxedType;
    private final Object defaultDefault;
    private final Class<?> type;

    static {
        EnumC5956c0 enumC5956c0 = new EnumC5956c0("VOID", 0, Void.class, Void.class, null);
        VOID = enumC5956c0;
        Class cls = Integer.TYPE;
        EnumC5956c0 enumC5956c02 = new EnumC5956c0("INT", 1, cls, Integer.class, 0);
        INT = enumC5956c02;
        EnumC5956c0 enumC5956c03 = new EnumC5956c0("LONG", 2, Long.TYPE, Long.class, 0L);
        LONG = enumC5956c03;
        EnumC5956c0 enumC5956c04 = new EnumC5956c0("FLOAT", 3, Float.TYPE, Float.class, Float.valueOf(0.0f));
        FLOAT = enumC5956c04;
        EnumC5956c0 enumC5956c05 = new EnumC5956c0("DOUBLE", 4, Double.TYPE, Double.class, Double.valueOf(0.0d));
        DOUBLE = enumC5956c05;
        EnumC5956c0 enumC5956c06 = new EnumC5956c0("BOOLEAN", 5, Boolean.TYPE, Boolean.class, Boolean.FALSE);
        BOOLEAN = enumC5956c06;
        EnumC5956c0 enumC5956c07 = new EnumC5956c0("STRING", 6, String.class, String.class, "");
        STRING = enumC5956c07;
        EnumC5956c0 enumC5956c08 = new EnumC5956c0("BYTE_STRING", 7, AbstractC5970h.class, AbstractC5970h.class, AbstractC5970h.f12591b);
        BYTE_STRING = enumC5956c08;
        EnumC5956c0 enumC5956c09 = new EnumC5956c0("ENUM", 8, cls, Integer.class, null);
        ENUM = enumC5956c09;
        EnumC5956c0 enumC5956c010 = new EnumC5956c0("MESSAGE", 9, Object.class, Object.class, null);
        MESSAGE = enumC5956c010;
        $VALUES = new EnumC5956c0[]{enumC5956c0, enumC5956c02, enumC5956c03, enumC5956c04, enumC5956c05, enumC5956c06, enumC5956c07, enumC5956c08, enumC5956c09, enumC5956c010};
    }

    private EnumC5956c0(String str, int i10, Class cls, Class cls2, Object obj) {
        this.type = cls;
        this.boxedType = cls2;
        this.defaultDefault = obj;
    }

    public static EnumC5956c0 valueOf(String str) {
        return (EnumC5956c0) Enum.valueOf(EnumC5956c0.class, str);
    }

    public static EnumC5956c0[] values() {
        return (EnumC5956c0[]) $VALUES.clone();
    }

    /* renamed from: b */
    public Class<?> m15337b() {
        return this.boxedType;
    }
}

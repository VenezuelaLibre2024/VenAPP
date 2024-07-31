package androidx.datastore.preferences.protobuf;

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
/* renamed from: androidx.datastore.preferences.protobuf.c0 */
/* loaded from: classes.dex */
public final class EnumC1153c0 {
    private static final /* synthetic */ EnumC1153c0[] $VALUES;
    public static final EnumC1153c0 BOOLEAN;
    public static final EnumC1153c0 BYTE_STRING;
    public static final EnumC1153c0 DOUBLE;
    public static final EnumC1153c0 ENUM;
    public static final EnumC1153c0 FLOAT;
    public static final EnumC1153c0 INT;
    public static final EnumC1153c0 LONG;
    public static final EnumC1153c0 MESSAGE;
    public static final EnumC1153c0 STRING;
    public static final EnumC1153c0 VOID;
    private final Class<?> boxedType;
    private final Object defaultDefault;
    private final Class<?> type;

    static {
        EnumC1153c0 enumC1153c0 = new EnumC1153c0("VOID", 0, Void.class, Void.class, null);
        VOID = enumC1153c0;
        Class cls = Integer.TYPE;
        EnumC1153c0 enumC1153c02 = new EnumC1153c0("INT", 1, cls, Integer.class, 0);
        INT = enumC1153c02;
        EnumC1153c0 enumC1153c03 = new EnumC1153c0("LONG", 2, Long.TYPE, Long.class, 0L);
        LONG = enumC1153c03;
        EnumC1153c0 enumC1153c04 = new EnumC1153c0("FLOAT", 3, Float.TYPE, Float.class, Float.valueOf(0.0f));
        FLOAT = enumC1153c04;
        EnumC1153c0 enumC1153c05 = new EnumC1153c0("DOUBLE", 4, Double.TYPE, Double.class, Double.valueOf(0.0d));
        DOUBLE = enumC1153c05;
        EnumC1153c0 enumC1153c06 = new EnumC1153c0("BOOLEAN", 5, Boolean.TYPE, Boolean.class, Boolean.FALSE);
        BOOLEAN = enumC1153c06;
        EnumC1153c0 enumC1153c07 = new EnumC1153c0("STRING", 6, String.class, String.class, "");
        STRING = enumC1153c07;
        EnumC1153c0 enumC1153c08 = new EnumC1153c0("BYTE_STRING", 7, AbstractC1167h.class, AbstractC1167h.class, AbstractC1167h.f4831b);
        BYTE_STRING = enumC1153c08;
        EnumC1153c0 enumC1153c09 = new EnumC1153c0("ENUM", 8, cls, Integer.class, null);
        ENUM = enumC1153c09;
        EnumC1153c0 enumC1153c010 = new EnumC1153c0("MESSAGE", 9, Object.class, Object.class, null);
        MESSAGE = enumC1153c010;
        $VALUES = new EnumC1153c0[]{enumC1153c0, enumC1153c02, enumC1153c03, enumC1153c04, enumC1153c05, enumC1153c06, enumC1153c07, enumC1153c08, enumC1153c09, enumC1153c010};
    }

    private EnumC1153c0(String str, int i10, Class cls, Class cls2, Object obj) {
        this.type = cls;
        this.boxedType = cls2;
        this.defaultDefault = obj;
    }

    public static EnumC1153c0 valueOf(String str) {
        return (EnumC1153c0) Enum.valueOf(EnumC1153c0.class, str);
    }

    public static EnumC1153c0[] values() {
        return (EnumC1153c0[]) $VALUES.clone();
    }

    /* renamed from: b */
    public Class<?> m5676b() {
        return this.boxedType;
    }
}

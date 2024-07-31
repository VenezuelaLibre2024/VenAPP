package androidx.datastore.preferences.protobuf;

import java.lang.reflect.Type;

/* JADX WARN: Enum visitor error
jadx.core.utils.exceptions.JadxRuntimeException: Init of enum field 'DOUBLE' uses external variables
	at jadx.core.dex.visitors.EnumVisitor.createEnumFieldByConstructor(EnumVisitor.java:451)
	at jadx.core.dex.visitors.EnumVisitor.processEnumFieldByRegister(EnumVisitor.java:395)
	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromFilledArray(EnumVisitor.java:324)
	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromInsn(EnumVisitor.java:262)
	at jadx.core.dex.visitors.EnumVisitor.convertToEnum(EnumVisitor.java:151)
	at jadx.core.dex.visitors.EnumVisitor.visit(EnumVisitor.java:100)
 */
/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* renamed from: androidx.datastore.preferences.protobuf.v */
/* loaded from: classes.dex */
public final class EnumC1209v {
    private static final /* synthetic */ EnumC1209v[] $VALUES;
    public static final EnumC1209v BOOL;
    public static final EnumC1209v BOOL_LIST;
    public static final EnumC1209v BOOL_LIST_PACKED;
    public static final EnumC1209v BYTES;
    public static final EnumC1209v BYTES_LIST;
    public static final EnumC1209v DOUBLE;
    public static final EnumC1209v DOUBLE_LIST;
    public static final EnumC1209v DOUBLE_LIST_PACKED;
    private static final Type[] EMPTY_TYPES;
    public static final EnumC1209v ENUM;
    public static final EnumC1209v ENUM_LIST;
    public static final EnumC1209v ENUM_LIST_PACKED;
    public static final EnumC1209v FIXED32;
    public static final EnumC1209v FIXED32_LIST;
    public static final EnumC1209v FIXED32_LIST_PACKED;
    public static final EnumC1209v FIXED64;
    public static final EnumC1209v FIXED64_LIST;
    public static final EnumC1209v FIXED64_LIST_PACKED;
    public static final EnumC1209v FLOAT;
    public static final EnumC1209v FLOAT_LIST;
    public static final EnumC1209v FLOAT_LIST_PACKED;
    public static final EnumC1209v GROUP;
    public static final EnumC1209v GROUP_LIST;
    public static final EnumC1209v INT32;
    public static final EnumC1209v INT32_LIST;
    public static final EnumC1209v INT32_LIST_PACKED;
    public static final EnumC1209v INT64;
    public static final EnumC1209v INT64_LIST;
    public static final EnumC1209v INT64_LIST_PACKED;
    public static final EnumC1209v MAP;
    public static final EnumC1209v MESSAGE;
    public static final EnumC1209v MESSAGE_LIST;
    public static final EnumC1209v SFIXED32;
    public static final EnumC1209v SFIXED32_LIST;
    public static final EnumC1209v SFIXED32_LIST_PACKED;
    public static final EnumC1209v SFIXED64;
    public static final EnumC1209v SFIXED64_LIST;
    public static final EnumC1209v SFIXED64_LIST_PACKED;
    public static final EnumC1209v SINT32;
    public static final EnumC1209v SINT32_LIST;
    public static final EnumC1209v SINT32_LIST_PACKED;
    public static final EnumC1209v SINT64;
    public static final EnumC1209v SINT64_LIST;
    public static final EnumC1209v SINT64_LIST_PACKED;
    public static final EnumC1209v STRING;
    public static final EnumC1209v STRING_LIST;
    public static final EnumC1209v UINT32;
    public static final EnumC1209v UINT32_LIST;
    public static final EnumC1209v UINT32_LIST_PACKED;
    public static final EnumC1209v UINT64;
    public static final EnumC1209v UINT64_LIST;
    public static final EnumC1209v UINT64_LIST_PACKED;
    private static final EnumC1209v[] VALUES;
    private final b collection;
    private final Class<?> elementType;

    /* renamed from: id */
    private final int f5018id;
    private final EnumC1153c0 javaType;
    private final boolean primitiveScalar;

    /* renamed from: androidx.datastore.preferences.protobuf.v$a */
    /* loaded from: classes.dex */
    static /* synthetic */ class a {

        /* renamed from: a */
        static final /* synthetic */ int[] f5019a;

        /* renamed from: b */
        static final /* synthetic */ int[] f5020b;

        static {
            int[] iArr = new int[EnumC1153c0.values().length];
            f5020b = iArr;
            try {
                iArr[EnumC1153c0.BYTE_STRING.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f5020b[EnumC1153c0.MESSAGE.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f5020b[EnumC1153c0.STRING.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            int[] iArr2 = new int[b.values().length];
            f5019a = iArr2;
            try {
                iArr2[b.MAP.ordinal()] = 1;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f5019a[b.VECTOR.ordinal()] = 2;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f5019a[b.SCALAR.ordinal()] = 3;
            } catch (NoSuchFieldError unused6) {
            }
        }
    }

    /* renamed from: androidx.datastore.preferences.protobuf.v$b */
    /* loaded from: classes.dex */
    enum b {
        SCALAR(false),
        VECTOR(true),
        PACKED_VECTOR(true),
        MAP(false);

        private final boolean isList;

        b(boolean z10) {
            this.isList = z10;
        }
    }

    static {
        b bVar = b.SCALAR;
        EnumC1153c0 enumC1153c0 = EnumC1153c0.DOUBLE;
        EnumC1209v enumC1209v = new EnumC1209v("DOUBLE", 0, 0, bVar, enumC1153c0);
        DOUBLE = enumC1209v;
        EnumC1153c0 enumC1153c02 = EnumC1153c0.FLOAT;
        EnumC1209v enumC1209v2 = new EnumC1209v("FLOAT", 1, 1, bVar, enumC1153c02);
        FLOAT = enumC1209v2;
        EnumC1153c0 enumC1153c03 = EnumC1153c0.LONG;
        EnumC1209v enumC1209v3 = new EnumC1209v("INT64", 2, 2, bVar, enumC1153c03);
        INT64 = enumC1209v3;
        EnumC1209v enumC1209v4 = new EnumC1209v("UINT64", 3, 3, bVar, enumC1153c03);
        UINT64 = enumC1209v4;
        EnumC1153c0 enumC1153c04 = EnumC1153c0.INT;
        EnumC1209v enumC1209v5 = new EnumC1209v("INT32", 4, 4, bVar, enumC1153c04);
        INT32 = enumC1209v5;
        EnumC1209v enumC1209v6 = new EnumC1209v("FIXED64", 5, 5, bVar, enumC1153c03);
        FIXED64 = enumC1209v6;
        EnumC1209v enumC1209v7 = new EnumC1209v("FIXED32", 6, 6, bVar, enumC1153c04);
        FIXED32 = enumC1209v7;
        EnumC1153c0 enumC1153c05 = EnumC1153c0.BOOLEAN;
        EnumC1209v enumC1209v8 = new EnumC1209v("BOOL", 7, 7, bVar, enumC1153c05);
        BOOL = enumC1209v8;
        EnumC1153c0 enumC1153c06 = EnumC1153c0.STRING;
        EnumC1209v enumC1209v9 = new EnumC1209v("STRING", 8, 8, bVar, enumC1153c06);
        STRING = enumC1209v9;
        EnumC1153c0 enumC1153c07 = EnumC1153c0.MESSAGE;
        EnumC1209v enumC1209v10 = new EnumC1209v("MESSAGE", 9, 9, bVar, enumC1153c07);
        MESSAGE = enumC1209v10;
        EnumC1153c0 enumC1153c08 = EnumC1153c0.BYTE_STRING;
        EnumC1209v enumC1209v11 = new EnumC1209v("BYTES", 10, 10, bVar, enumC1153c08);
        BYTES = enumC1209v11;
        EnumC1209v enumC1209v12 = new EnumC1209v("UINT32", 11, 11, bVar, enumC1153c04);
        UINT32 = enumC1209v12;
        EnumC1153c0 enumC1153c09 = EnumC1153c0.ENUM;
        EnumC1209v enumC1209v13 = new EnumC1209v("ENUM", 12, 12, bVar, enumC1153c09);
        ENUM = enumC1209v13;
        EnumC1209v enumC1209v14 = new EnumC1209v("SFIXED32", 13, 13, bVar, enumC1153c04);
        SFIXED32 = enumC1209v14;
        EnumC1209v enumC1209v15 = new EnumC1209v("SFIXED64", 14, 14, bVar, enumC1153c03);
        SFIXED64 = enumC1209v15;
        EnumC1209v enumC1209v16 = new EnumC1209v("SINT32", 15, 15, bVar, enumC1153c04);
        SINT32 = enumC1209v16;
        EnumC1209v enumC1209v17 = new EnumC1209v("SINT64", 16, 16, bVar, enumC1153c03);
        SINT64 = enumC1209v17;
        EnumC1209v enumC1209v18 = new EnumC1209v("GROUP", 17, 17, bVar, enumC1153c07);
        GROUP = enumC1209v18;
        b bVar2 = b.VECTOR;
        EnumC1209v enumC1209v19 = new EnumC1209v("DOUBLE_LIST", 18, 18, bVar2, enumC1153c0);
        DOUBLE_LIST = enumC1209v19;
        EnumC1209v enumC1209v20 = new EnumC1209v("FLOAT_LIST", 19, 19, bVar2, enumC1153c02);
        FLOAT_LIST = enumC1209v20;
        EnumC1209v enumC1209v21 = new EnumC1209v("INT64_LIST", 20, 20, bVar2, enumC1153c03);
        INT64_LIST = enumC1209v21;
        EnumC1209v enumC1209v22 = new EnumC1209v("UINT64_LIST", 21, 21, bVar2, enumC1153c03);
        UINT64_LIST = enumC1209v22;
        EnumC1209v enumC1209v23 = new EnumC1209v("INT32_LIST", 22, 22, bVar2, enumC1153c04);
        INT32_LIST = enumC1209v23;
        EnumC1209v enumC1209v24 = new EnumC1209v("FIXED64_LIST", 23, 23, bVar2, enumC1153c03);
        FIXED64_LIST = enumC1209v24;
        EnumC1209v enumC1209v25 = new EnumC1209v("FIXED32_LIST", 24, 24, bVar2, enumC1153c04);
        FIXED32_LIST = enumC1209v25;
        EnumC1209v enumC1209v26 = new EnumC1209v("BOOL_LIST", 25, 25, bVar2, enumC1153c05);
        BOOL_LIST = enumC1209v26;
        EnumC1209v enumC1209v27 = new EnumC1209v("STRING_LIST", 26, 26, bVar2, enumC1153c06);
        STRING_LIST = enumC1209v27;
        EnumC1209v enumC1209v28 = new EnumC1209v("MESSAGE_LIST", 27, 27, bVar2, enumC1153c07);
        MESSAGE_LIST = enumC1209v28;
        EnumC1209v enumC1209v29 = new EnumC1209v("BYTES_LIST", 28, 28, bVar2, enumC1153c08);
        BYTES_LIST = enumC1209v29;
        EnumC1209v enumC1209v30 = new EnumC1209v("UINT32_LIST", 29, 29, bVar2, enumC1153c04);
        UINT32_LIST = enumC1209v30;
        EnumC1209v enumC1209v31 = new EnumC1209v("ENUM_LIST", 30, 30, bVar2, enumC1153c09);
        ENUM_LIST = enumC1209v31;
        EnumC1209v enumC1209v32 = new EnumC1209v("SFIXED32_LIST", 31, 31, bVar2, enumC1153c04);
        SFIXED32_LIST = enumC1209v32;
        EnumC1209v enumC1209v33 = new EnumC1209v("SFIXED64_LIST", 32, 32, bVar2, enumC1153c03);
        SFIXED64_LIST = enumC1209v33;
        EnumC1209v enumC1209v34 = new EnumC1209v("SINT32_LIST", 33, 33, bVar2, enumC1153c04);
        SINT32_LIST = enumC1209v34;
        EnumC1209v enumC1209v35 = new EnumC1209v("SINT64_LIST", 34, 34, bVar2, enumC1153c03);
        SINT64_LIST = enumC1209v35;
        b bVar3 = b.PACKED_VECTOR;
        EnumC1209v enumC1209v36 = new EnumC1209v("DOUBLE_LIST_PACKED", 35, 35, bVar3, enumC1153c0);
        DOUBLE_LIST_PACKED = enumC1209v36;
        EnumC1209v enumC1209v37 = new EnumC1209v("FLOAT_LIST_PACKED", 36, 36, bVar3, enumC1153c02);
        FLOAT_LIST_PACKED = enumC1209v37;
        EnumC1209v enumC1209v38 = new EnumC1209v("INT64_LIST_PACKED", 37, 37, bVar3, enumC1153c03);
        INT64_LIST_PACKED = enumC1209v38;
        EnumC1209v enumC1209v39 = new EnumC1209v("UINT64_LIST_PACKED", 38, 38, bVar3, enumC1153c03);
        UINT64_LIST_PACKED = enumC1209v39;
        EnumC1209v enumC1209v40 = new EnumC1209v("INT32_LIST_PACKED", 39, 39, bVar3, enumC1153c04);
        INT32_LIST_PACKED = enumC1209v40;
        EnumC1209v enumC1209v41 = new EnumC1209v("FIXED64_LIST_PACKED", 40, 40, bVar3, enumC1153c03);
        FIXED64_LIST_PACKED = enumC1209v41;
        EnumC1209v enumC1209v42 = new EnumC1209v("FIXED32_LIST_PACKED", 41, 41, bVar3, enumC1153c04);
        FIXED32_LIST_PACKED = enumC1209v42;
        EnumC1209v enumC1209v43 = new EnumC1209v("BOOL_LIST_PACKED", 42, 42, bVar3, enumC1153c05);
        BOOL_LIST_PACKED = enumC1209v43;
        EnumC1209v enumC1209v44 = new EnumC1209v("UINT32_LIST_PACKED", 43, 43, bVar3, enumC1153c04);
        UINT32_LIST_PACKED = enumC1209v44;
        EnumC1209v enumC1209v45 = new EnumC1209v("ENUM_LIST_PACKED", 44, 44, bVar3, enumC1153c09);
        ENUM_LIST_PACKED = enumC1209v45;
        EnumC1209v enumC1209v46 = new EnumC1209v("SFIXED32_LIST_PACKED", 45, 45, bVar3, enumC1153c04);
        SFIXED32_LIST_PACKED = enumC1209v46;
        EnumC1209v enumC1209v47 = new EnumC1209v("SFIXED64_LIST_PACKED", 46, 46, bVar3, enumC1153c03);
        SFIXED64_LIST_PACKED = enumC1209v47;
        EnumC1209v enumC1209v48 = new EnumC1209v("SINT32_LIST_PACKED", 47, 47, bVar3, enumC1153c04);
        SINT32_LIST_PACKED = enumC1209v48;
        EnumC1209v enumC1209v49 = new EnumC1209v("SINT64_LIST_PACKED", 48, 48, bVar3, enumC1153c03);
        SINT64_LIST_PACKED = enumC1209v49;
        EnumC1209v enumC1209v50 = new EnumC1209v("GROUP_LIST", 49, 49, bVar2, enumC1153c07);
        GROUP_LIST = enumC1209v50;
        EnumC1209v enumC1209v51 = new EnumC1209v("MAP", 50, 50, b.MAP, EnumC1153c0.VOID);
        MAP = enumC1209v51;
        $VALUES = new EnumC1209v[]{enumC1209v, enumC1209v2, enumC1209v3, enumC1209v4, enumC1209v5, enumC1209v6, enumC1209v7, enumC1209v8, enumC1209v9, enumC1209v10, enumC1209v11, enumC1209v12, enumC1209v13, enumC1209v14, enumC1209v15, enumC1209v16, enumC1209v17, enumC1209v18, enumC1209v19, enumC1209v20, enumC1209v21, enumC1209v22, enumC1209v23, enumC1209v24, enumC1209v25, enumC1209v26, enumC1209v27, enumC1209v28, enumC1209v29, enumC1209v30, enumC1209v31, enumC1209v32, enumC1209v33, enumC1209v34, enumC1209v35, enumC1209v36, enumC1209v37, enumC1209v38, enumC1209v39, enumC1209v40, enumC1209v41, enumC1209v42, enumC1209v43, enumC1209v44, enumC1209v45, enumC1209v46, enumC1209v47, enumC1209v48, enumC1209v49, enumC1209v50, enumC1209v51};
        EMPTY_TYPES = new Type[0];
        EnumC1209v[] values = values();
        VALUES = new EnumC1209v[values.length];
        for (EnumC1209v enumC1209v52 : values) {
            VALUES[enumC1209v52.f5018id] = enumC1209v52;
        }
    }

    private EnumC1209v(String str, int i10, int i11, b bVar, EnumC1153c0 enumC1153c0) {
        int i12;
        this.f5018id = i11;
        this.collection = bVar;
        this.javaType = enumC1153c0;
        int i13 = a.f5019a[bVar.ordinal()];
        this.elementType = (i13 == 1 || i13 == 2) ? enumC1153c0.m5676b() : null;
        this.primitiveScalar = (bVar != b.SCALAR || (i12 = a.f5020b[enumC1153c0.ordinal()]) == 1 || i12 == 2 || i12 == 3) ? false : true;
    }

    public static EnumC1209v valueOf(String str) {
        return (EnumC1209v) Enum.valueOf(EnumC1209v.class, str);
    }

    public static EnumC1209v[] values() {
        return (EnumC1209v[]) $VALUES.clone();
    }

    /* renamed from: b */
    public int m6522b() {
        return this.f5018id;
    }
}

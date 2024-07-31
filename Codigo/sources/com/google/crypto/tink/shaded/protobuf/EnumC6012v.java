package com.google.crypto.tink.shaded.protobuf;

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
/* renamed from: com.google.crypto.tink.shaded.protobuf.v */
/* loaded from: classes2.dex */
public final class EnumC6012v {
    private static final /* synthetic */ EnumC6012v[] $VALUES;
    public static final EnumC6012v BOOL;
    public static final EnumC6012v BOOL_LIST;
    public static final EnumC6012v BOOL_LIST_PACKED;
    public static final EnumC6012v BYTES;
    public static final EnumC6012v BYTES_LIST;
    public static final EnumC6012v DOUBLE;
    public static final EnumC6012v DOUBLE_LIST;
    public static final EnumC6012v DOUBLE_LIST_PACKED;
    private static final Type[] EMPTY_TYPES;
    public static final EnumC6012v ENUM;
    public static final EnumC6012v ENUM_LIST;
    public static final EnumC6012v ENUM_LIST_PACKED;
    public static final EnumC6012v FIXED32;
    public static final EnumC6012v FIXED32_LIST;
    public static final EnumC6012v FIXED32_LIST_PACKED;
    public static final EnumC6012v FIXED64;
    public static final EnumC6012v FIXED64_LIST;
    public static final EnumC6012v FIXED64_LIST_PACKED;
    public static final EnumC6012v FLOAT;
    public static final EnumC6012v FLOAT_LIST;
    public static final EnumC6012v FLOAT_LIST_PACKED;
    public static final EnumC6012v GROUP;
    public static final EnumC6012v GROUP_LIST;
    public static final EnumC6012v INT32;
    public static final EnumC6012v INT32_LIST;
    public static final EnumC6012v INT32_LIST_PACKED;
    public static final EnumC6012v INT64;
    public static final EnumC6012v INT64_LIST;
    public static final EnumC6012v INT64_LIST_PACKED;
    public static final EnumC6012v MAP;
    public static final EnumC6012v MESSAGE;
    public static final EnumC6012v MESSAGE_LIST;
    public static final EnumC6012v SFIXED32;
    public static final EnumC6012v SFIXED32_LIST;
    public static final EnumC6012v SFIXED32_LIST_PACKED;
    public static final EnumC6012v SFIXED64;
    public static final EnumC6012v SFIXED64_LIST;
    public static final EnumC6012v SFIXED64_LIST_PACKED;
    public static final EnumC6012v SINT32;
    public static final EnumC6012v SINT32_LIST;
    public static final EnumC6012v SINT32_LIST_PACKED;
    public static final EnumC6012v SINT64;
    public static final EnumC6012v SINT64_LIST;
    public static final EnumC6012v SINT64_LIST_PACKED;
    public static final EnumC6012v STRING;
    public static final EnumC6012v STRING_LIST;
    public static final EnumC6012v UINT32;
    public static final EnumC6012v UINT32_LIST;
    public static final EnumC6012v UINT32_LIST_PACKED;
    public static final EnumC6012v UINT64;
    public static final EnumC6012v UINT64_LIST;
    public static final EnumC6012v UINT64_LIST_PACKED;
    private static final EnumC6012v[] VALUES;
    private final b collection;
    private final Class<?> elementType;

    /* renamed from: id */
    private final int f12765id;
    private final EnumC5956c0 javaType;
    private final boolean primitiveScalar;

    /* renamed from: com.google.crypto.tink.shaded.protobuf.v$a */
    /* loaded from: classes2.dex */
    static /* synthetic */ class a {

        /* renamed from: a */
        static final /* synthetic */ int[] f12766a;

        /* renamed from: b */
        static final /* synthetic */ int[] f12767b;

        static {
            int[] iArr = new int[EnumC5956c0.values().length];
            f12767b = iArr;
            try {
                iArr[EnumC5956c0.BYTE_STRING.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f12767b[EnumC5956c0.MESSAGE.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f12767b[EnumC5956c0.STRING.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            int[] iArr2 = new int[b.values().length];
            f12766a = iArr2;
            try {
                iArr2[b.MAP.ordinal()] = 1;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f12766a[b.VECTOR.ordinal()] = 2;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f12766a[b.SCALAR.ordinal()] = 3;
            } catch (NoSuchFieldError unused6) {
            }
        }
    }

    /* renamed from: com.google.crypto.tink.shaded.protobuf.v$b */
    /* loaded from: classes2.dex */
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
        EnumC5956c0 enumC5956c0 = EnumC5956c0.DOUBLE;
        EnumC6012v enumC6012v = new EnumC6012v("DOUBLE", 0, 0, bVar, enumC5956c0);
        DOUBLE = enumC6012v;
        EnumC5956c0 enumC5956c02 = EnumC5956c0.FLOAT;
        EnumC6012v enumC6012v2 = new EnumC6012v("FLOAT", 1, 1, bVar, enumC5956c02);
        FLOAT = enumC6012v2;
        EnumC5956c0 enumC5956c03 = EnumC5956c0.LONG;
        EnumC6012v enumC6012v3 = new EnumC6012v("INT64", 2, 2, bVar, enumC5956c03);
        INT64 = enumC6012v3;
        EnumC6012v enumC6012v4 = new EnumC6012v("UINT64", 3, 3, bVar, enumC5956c03);
        UINT64 = enumC6012v4;
        EnumC5956c0 enumC5956c04 = EnumC5956c0.INT;
        EnumC6012v enumC6012v5 = new EnumC6012v("INT32", 4, 4, bVar, enumC5956c04);
        INT32 = enumC6012v5;
        EnumC6012v enumC6012v6 = new EnumC6012v("FIXED64", 5, 5, bVar, enumC5956c03);
        FIXED64 = enumC6012v6;
        EnumC6012v enumC6012v7 = new EnumC6012v("FIXED32", 6, 6, bVar, enumC5956c04);
        FIXED32 = enumC6012v7;
        EnumC5956c0 enumC5956c05 = EnumC5956c0.BOOLEAN;
        EnumC6012v enumC6012v8 = new EnumC6012v("BOOL", 7, 7, bVar, enumC5956c05);
        BOOL = enumC6012v8;
        EnumC5956c0 enumC5956c06 = EnumC5956c0.STRING;
        EnumC6012v enumC6012v9 = new EnumC6012v("STRING", 8, 8, bVar, enumC5956c06);
        STRING = enumC6012v9;
        EnumC5956c0 enumC5956c07 = EnumC5956c0.MESSAGE;
        EnumC6012v enumC6012v10 = new EnumC6012v("MESSAGE", 9, 9, bVar, enumC5956c07);
        MESSAGE = enumC6012v10;
        EnumC5956c0 enumC5956c08 = EnumC5956c0.BYTE_STRING;
        EnumC6012v enumC6012v11 = new EnumC6012v("BYTES", 10, 10, bVar, enumC5956c08);
        BYTES = enumC6012v11;
        EnumC6012v enumC6012v12 = new EnumC6012v("UINT32", 11, 11, bVar, enumC5956c04);
        UINT32 = enumC6012v12;
        EnumC5956c0 enumC5956c09 = EnumC5956c0.ENUM;
        EnumC6012v enumC6012v13 = new EnumC6012v("ENUM", 12, 12, bVar, enumC5956c09);
        ENUM = enumC6012v13;
        EnumC6012v enumC6012v14 = new EnumC6012v("SFIXED32", 13, 13, bVar, enumC5956c04);
        SFIXED32 = enumC6012v14;
        EnumC6012v enumC6012v15 = new EnumC6012v("SFIXED64", 14, 14, bVar, enumC5956c03);
        SFIXED64 = enumC6012v15;
        EnumC6012v enumC6012v16 = new EnumC6012v("SINT32", 15, 15, bVar, enumC5956c04);
        SINT32 = enumC6012v16;
        EnumC6012v enumC6012v17 = new EnumC6012v("SINT64", 16, 16, bVar, enumC5956c03);
        SINT64 = enumC6012v17;
        EnumC6012v enumC6012v18 = new EnumC6012v("GROUP", 17, 17, bVar, enumC5956c07);
        GROUP = enumC6012v18;
        b bVar2 = b.VECTOR;
        EnumC6012v enumC6012v19 = new EnumC6012v("DOUBLE_LIST", 18, 18, bVar2, enumC5956c0);
        DOUBLE_LIST = enumC6012v19;
        EnumC6012v enumC6012v20 = new EnumC6012v("FLOAT_LIST", 19, 19, bVar2, enumC5956c02);
        FLOAT_LIST = enumC6012v20;
        EnumC6012v enumC6012v21 = new EnumC6012v("INT64_LIST", 20, 20, bVar2, enumC5956c03);
        INT64_LIST = enumC6012v21;
        EnumC6012v enumC6012v22 = new EnumC6012v("UINT64_LIST", 21, 21, bVar2, enumC5956c03);
        UINT64_LIST = enumC6012v22;
        EnumC6012v enumC6012v23 = new EnumC6012v("INT32_LIST", 22, 22, bVar2, enumC5956c04);
        INT32_LIST = enumC6012v23;
        EnumC6012v enumC6012v24 = new EnumC6012v("FIXED64_LIST", 23, 23, bVar2, enumC5956c03);
        FIXED64_LIST = enumC6012v24;
        EnumC6012v enumC6012v25 = new EnumC6012v("FIXED32_LIST", 24, 24, bVar2, enumC5956c04);
        FIXED32_LIST = enumC6012v25;
        EnumC6012v enumC6012v26 = new EnumC6012v("BOOL_LIST", 25, 25, bVar2, enumC5956c05);
        BOOL_LIST = enumC6012v26;
        EnumC6012v enumC6012v27 = new EnumC6012v("STRING_LIST", 26, 26, bVar2, enumC5956c06);
        STRING_LIST = enumC6012v27;
        EnumC6012v enumC6012v28 = new EnumC6012v("MESSAGE_LIST", 27, 27, bVar2, enumC5956c07);
        MESSAGE_LIST = enumC6012v28;
        EnumC6012v enumC6012v29 = new EnumC6012v("BYTES_LIST", 28, 28, bVar2, enumC5956c08);
        BYTES_LIST = enumC6012v29;
        EnumC6012v enumC6012v30 = new EnumC6012v("UINT32_LIST", 29, 29, bVar2, enumC5956c04);
        UINT32_LIST = enumC6012v30;
        EnumC6012v enumC6012v31 = new EnumC6012v("ENUM_LIST", 30, 30, bVar2, enumC5956c09);
        ENUM_LIST = enumC6012v31;
        EnumC6012v enumC6012v32 = new EnumC6012v("SFIXED32_LIST", 31, 31, bVar2, enumC5956c04);
        SFIXED32_LIST = enumC6012v32;
        EnumC6012v enumC6012v33 = new EnumC6012v("SFIXED64_LIST", 32, 32, bVar2, enumC5956c03);
        SFIXED64_LIST = enumC6012v33;
        EnumC6012v enumC6012v34 = new EnumC6012v("SINT32_LIST", 33, 33, bVar2, enumC5956c04);
        SINT32_LIST = enumC6012v34;
        EnumC6012v enumC6012v35 = new EnumC6012v("SINT64_LIST", 34, 34, bVar2, enumC5956c03);
        SINT64_LIST = enumC6012v35;
        b bVar3 = b.PACKED_VECTOR;
        EnumC6012v enumC6012v36 = new EnumC6012v("DOUBLE_LIST_PACKED", 35, 35, bVar3, enumC5956c0);
        DOUBLE_LIST_PACKED = enumC6012v36;
        EnumC6012v enumC6012v37 = new EnumC6012v("FLOAT_LIST_PACKED", 36, 36, bVar3, enumC5956c02);
        FLOAT_LIST_PACKED = enumC6012v37;
        EnumC6012v enumC6012v38 = new EnumC6012v("INT64_LIST_PACKED", 37, 37, bVar3, enumC5956c03);
        INT64_LIST_PACKED = enumC6012v38;
        EnumC6012v enumC6012v39 = new EnumC6012v("UINT64_LIST_PACKED", 38, 38, bVar3, enumC5956c03);
        UINT64_LIST_PACKED = enumC6012v39;
        EnumC6012v enumC6012v40 = new EnumC6012v("INT32_LIST_PACKED", 39, 39, bVar3, enumC5956c04);
        INT32_LIST_PACKED = enumC6012v40;
        EnumC6012v enumC6012v41 = new EnumC6012v("FIXED64_LIST_PACKED", 40, 40, bVar3, enumC5956c03);
        FIXED64_LIST_PACKED = enumC6012v41;
        EnumC6012v enumC6012v42 = new EnumC6012v("FIXED32_LIST_PACKED", 41, 41, bVar3, enumC5956c04);
        FIXED32_LIST_PACKED = enumC6012v42;
        EnumC6012v enumC6012v43 = new EnumC6012v("BOOL_LIST_PACKED", 42, 42, bVar3, enumC5956c05);
        BOOL_LIST_PACKED = enumC6012v43;
        EnumC6012v enumC6012v44 = new EnumC6012v("UINT32_LIST_PACKED", 43, 43, bVar3, enumC5956c04);
        UINT32_LIST_PACKED = enumC6012v44;
        EnumC6012v enumC6012v45 = new EnumC6012v("ENUM_LIST_PACKED", 44, 44, bVar3, enumC5956c09);
        ENUM_LIST_PACKED = enumC6012v45;
        EnumC6012v enumC6012v46 = new EnumC6012v("SFIXED32_LIST_PACKED", 45, 45, bVar3, enumC5956c04);
        SFIXED32_LIST_PACKED = enumC6012v46;
        EnumC6012v enumC6012v47 = new EnumC6012v("SFIXED64_LIST_PACKED", 46, 46, bVar3, enumC5956c03);
        SFIXED64_LIST_PACKED = enumC6012v47;
        EnumC6012v enumC6012v48 = new EnumC6012v("SINT32_LIST_PACKED", 47, 47, bVar3, enumC5956c04);
        SINT32_LIST_PACKED = enumC6012v48;
        EnumC6012v enumC6012v49 = new EnumC6012v("SINT64_LIST_PACKED", 48, 48, bVar3, enumC5956c03);
        SINT64_LIST_PACKED = enumC6012v49;
        EnumC6012v enumC6012v50 = new EnumC6012v("GROUP_LIST", 49, 49, bVar2, enumC5956c07);
        GROUP_LIST = enumC6012v50;
        EnumC6012v enumC6012v51 = new EnumC6012v("MAP", 50, 50, b.MAP, EnumC5956c0.VOID);
        MAP = enumC6012v51;
        $VALUES = new EnumC6012v[]{enumC6012v, enumC6012v2, enumC6012v3, enumC6012v4, enumC6012v5, enumC6012v6, enumC6012v7, enumC6012v8, enumC6012v9, enumC6012v10, enumC6012v11, enumC6012v12, enumC6012v13, enumC6012v14, enumC6012v15, enumC6012v16, enumC6012v17, enumC6012v18, enumC6012v19, enumC6012v20, enumC6012v21, enumC6012v22, enumC6012v23, enumC6012v24, enumC6012v25, enumC6012v26, enumC6012v27, enumC6012v28, enumC6012v29, enumC6012v30, enumC6012v31, enumC6012v32, enumC6012v33, enumC6012v34, enumC6012v35, enumC6012v36, enumC6012v37, enumC6012v38, enumC6012v39, enumC6012v40, enumC6012v41, enumC6012v42, enumC6012v43, enumC6012v44, enumC6012v45, enumC6012v46, enumC6012v47, enumC6012v48, enumC6012v49, enumC6012v50, enumC6012v51};
        EMPTY_TYPES = new Type[0];
        EnumC6012v[] values = values();
        VALUES = new EnumC6012v[values.length];
        for (EnumC6012v enumC6012v52 : values) {
            VALUES[enumC6012v52.f12765id] = enumC6012v52;
        }
    }

    private EnumC6012v(String str, int i10, int i11, b bVar, EnumC5956c0 enumC5956c0) {
        int i12;
        this.f12765id = i11;
        this.collection = bVar;
        this.javaType = enumC5956c0;
        int i13 = a.f12766a[bVar.ordinal()];
        this.elementType = (i13 == 1 || i13 == 2) ? enumC5956c0.m15337b() : null;
        this.primitiveScalar = (bVar != b.SCALAR || (i12 = a.f12767b[enumC5956c0.ordinal()]) == 1 || i12 == 2 || i12 == 3) ? false : true;
    }

    public static EnumC6012v valueOf(String str) {
        return (EnumC6012v) Enum.valueOf(EnumC6012v.class, str);
    }

    public static EnumC6012v[] values() {
        return (EnumC6012v[]) $VALUES.clone();
    }

    /* renamed from: b */
    public int m16199b() {
        return this.f12765id;
    }
}

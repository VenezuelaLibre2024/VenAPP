package com.google.protobuf;

import java.lang.reflect.Type;

/* JADX WARN: Enum visitor error
jadx.core.utils.exceptions.JadxRuntimeException: Init of enum field 'DOUBLE' uses external variables
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
/* renamed from: com.google.protobuf.u */
/* loaded from: classes2.dex */
public final class EnumC6622u {
    private static final /* synthetic */ EnumC6622u[] $VALUES;
    public static final EnumC6622u BOOL;
    public static final EnumC6622u BOOL_LIST;
    public static final EnumC6622u BOOL_LIST_PACKED;
    public static final EnumC6622u BYTES;
    public static final EnumC6622u BYTES_LIST;
    public static final EnumC6622u DOUBLE;
    public static final EnumC6622u DOUBLE_LIST;
    public static final EnumC6622u DOUBLE_LIST_PACKED;
    private static final Type[] EMPTY_TYPES;
    public static final EnumC6622u ENUM;
    public static final EnumC6622u ENUM_LIST;
    public static final EnumC6622u ENUM_LIST_PACKED;
    public static final EnumC6622u FIXED32;
    public static final EnumC6622u FIXED32_LIST;
    public static final EnumC6622u FIXED32_LIST_PACKED;
    public static final EnumC6622u FIXED64;
    public static final EnumC6622u FIXED64_LIST;
    public static final EnumC6622u FIXED64_LIST_PACKED;
    public static final EnumC6622u FLOAT;
    public static final EnumC6622u FLOAT_LIST;
    public static final EnumC6622u FLOAT_LIST_PACKED;
    public static final EnumC6622u GROUP;
    public static final EnumC6622u GROUP_LIST;
    public static final EnumC6622u INT32;
    public static final EnumC6622u INT32_LIST;
    public static final EnumC6622u INT32_LIST_PACKED;
    public static final EnumC6622u INT64;
    public static final EnumC6622u INT64_LIST;
    public static final EnumC6622u INT64_LIST_PACKED;
    public static final EnumC6622u MAP;
    public static final EnumC6622u MESSAGE;
    public static final EnumC6622u MESSAGE_LIST;
    public static final EnumC6622u SFIXED32;
    public static final EnumC6622u SFIXED32_LIST;
    public static final EnumC6622u SFIXED32_LIST_PACKED;
    public static final EnumC6622u SFIXED64;
    public static final EnumC6622u SFIXED64_LIST;
    public static final EnumC6622u SFIXED64_LIST_PACKED;
    public static final EnumC6622u SINT32;
    public static final EnumC6622u SINT32_LIST;
    public static final EnumC6622u SINT32_LIST_PACKED;
    public static final EnumC6622u SINT64;
    public static final EnumC6622u SINT64_LIST;
    public static final EnumC6622u SINT64_LIST_PACKED;
    public static final EnumC6622u STRING;
    public static final EnumC6622u STRING_LIST;
    public static final EnumC6622u UINT32;
    public static final EnumC6622u UINT32_LIST;
    public static final EnumC6622u UINT32_LIST_PACKED;
    public static final EnumC6622u UINT64;
    public static final EnumC6622u UINT64_LIST;
    public static final EnumC6622u UINT64_LIST_PACKED;
    private static final EnumC6622u[] VALUES;
    private final b collection;
    private final Class<?> elementType;

    /* renamed from: id */
    private final int f14627id;
    private final EnumC6569c0 javaType;
    private final boolean primitiveScalar;

    /* renamed from: com.google.protobuf.u$a */
    /* loaded from: classes2.dex */
    static /* synthetic */ class a {

        /* renamed from: a */
        static final /* synthetic */ int[] f14628a;

        /* renamed from: b */
        static final /* synthetic */ int[] f14629b;

        static {
            int[] iArr = new int[EnumC6569c0.values().length];
            f14629b = iArr;
            try {
                iArr[EnumC6569c0.BYTE_STRING.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f14629b[EnumC6569c0.MESSAGE.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f14629b[EnumC6569c0.STRING.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            int[] iArr2 = new int[b.values().length];
            f14628a = iArr2;
            try {
                iArr2[b.MAP.ordinal()] = 1;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f14628a[b.VECTOR.ordinal()] = 2;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f14628a[b.SCALAR.ordinal()] = 3;
            } catch (NoSuchFieldError unused6) {
            }
        }
    }

    /* renamed from: com.google.protobuf.u$b */
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
        EnumC6569c0 enumC6569c0 = EnumC6569c0.DOUBLE;
        DOUBLE = new EnumC6622u("DOUBLE", 0, 0, bVar, enumC6569c0);
        EnumC6569c0 enumC6569c02 = EnumC6569c0.FLOAT;
        FLOAT = new EnumC6622u("FLOAT", 1, 1, bVar, enumC6569c02);
        EnumC6569c0 enumC6569c03 = EnumC6569c0.LONG;
        INT64 = new EnumC6622u("INT64", 2, 2, bVar, enumC6569c03);
        UINT64 = new EnumC6622u("UINT64", 3, 3, bVar, enumC6569c03);
        EnumC6569c0 enumC6569c04 = EnumC6569c0.INT;
        INT32 = new EnumC6622u("INT32", 4, 4, bVar, enumC6569c04);
        FIXED64 = new EnumC6622u("FIXED64", 5, 5, bVar, enumC6569c03);
        FIXED32 = new EnumC6622u("FIXED32", 6, 6, bVar, enumC6569c04);
        EnumC6569c0 enumC6569c05 = EnumC6569c0.BOOLEAN;
        BOOL = new EnumC6622u("BOOL", 7, 7, bVar, enumC6569c05);
        EnumC6569c0 enumC6569c06 = EnumC6569c0.STRING;
        STRING = new EnumC6622u("STRING", 8, 8, bVar, enumC6569c06);
        EnumC6569c0 enumC6569c07 = EnumC6569c0.MESSAGE;
        MESSAGE = new EnumC6622u("MESSAGE", 9, 9, bVar, enumC6569c07);
        EnumC6569c0 enumC6569c08 = EnumC6569c0.BYTE_STRING;
        BYTES = new EnumC6622u("BYTES", 10, 10, bVar, enumC6569c08);
        UINT32 = new EnumC6622u("UINT32", 11, 11, bVar, enumC6569c04);
        EnumC6569c0 enumC6569c09 = EnumC6569c0.ENUM;
        ENUM = new EnumC6622u("ENUM", 12, 12, bVar, enumC6569c09);
        SFIXED32 = new EnumC6622u("SFIXED32", 13, 13, bVar, enumC6569c04);
        SFIXED64 = new EnumC6622u("SFIXED64", 14, 14, bVar, enumC6569c03);
        SINT32 = new EnumC6622u("SINT32", 15, 15, bVar, enumC6569c04);
        SINT64 = new EnumC6622u("SINT64", 16, 16, bVar, enumC6569c03);
        GROUP = new EnumC6622u("GROUP", 17, 17, bVar, enumC6569c07);
        b bVar2 = b.VECTOR;
        DOUBLE_LIST = new EnumC6622u("DOUBLE_LIST", 18, 18, bVar2, enumC6569c0);
        FLOAT_LIST = new EnumC6622u("FLOAT_LIST", 19, 19, bVar2, enumC6569c02);
        INT64_LIST = new EnumC6622u("INT64_LIST", 20, 20, bVar2, enumC6569c03);
        UINT64_LIST = new EnumC6622u("UINT64_LIST", 21, 21, bVar2, enumC6569c03);
        INT32_LIST = new EnumC6622u("INT32_LIST", 22, 22, bVar2, enumC6569c04);
        FIXED64_LIST = new EnumC6622u("FIXED64_LIST", 23, 23, bVar2, enumC6569c03);
        FIXED32_LIST = new EnumC6622u("FIXED32_LIST", 24, 24, bVar2, enumC6569c04);
        BOOL_LIST = new EnumC6622u("BOOL_LIST", 25, 25, bVar2, enumC6569c05);
        STRING_LIST = new EnumC6622u("STRING_LIST", 26, 26, bVar2, enumC6569c06);
        MESSAGE_LIST = new EnumC6622u("MESSAGE_LIST", 27, 27, bVar2, enumC6569c07);
        BYTES_LIST = new EnumC6622u("BYTES_LIST", 28, 28, bVar2, enumC6569c08);
        UINT32_LIST = new EnumC6622u("UINT32_LIST", 29, 29, bVar2, enumC6569c04);
        ENUM_LIST = new EnumC6622u("ENUM_LIST", 30, 30, bVar2, enumC6569c09);
        SFIXED32_LIST = new EnumC6622u("SFIXED32_LIST", 31, 31, bVar2, enumC6569c04);
        SFIXED64_LIST = new EnumC6622u("SFIXED64_LIST", 32, 32, bVar2, enumC6569c03);
        SINT32_LIST = new EnumC6622u("SINT32_LIST", 33, 33, bVar2, enumC6569c04);
        SINT64_LIST = new EnumC6622u("SINT64_LIST", 34, 34, bVar2, enumC6569c03);
        b bVar3 = b.PACKED_VECTOR;
        DOUBLE_LIST_PACKED = new EnumC6622u("DOUBLE_LIST_PACKED", 35, 35, bVar3, enumC6569c0);
        FLOAT_LIST_PACKED = new EnumC6622u("FLOAT_LIST_PACKED", 36, 36, bVar3, enumC6569c02);
        INT64_LIST_PACKED = new EnumC6622u("INT64_LIST_PACKED", 37, 37, bVar3, enumC6569c03);
        UINT64_LIST_PACKED = new EnumC6622u("UINT64_LIST_PACKED", 38, 38, bVar3, enumC6569c03);
        INT32_LIST_PACKED = new EnumC6622u("INT32_LIST_PACKED", 39, 39, bVar3, enumC6569c04);
        FIXED64_LIST_PACKED = new EnumC6622u("FIXED64_LIST_PACKED", 40, 40, bVar3, enumC6569c03);
        FIXED32_LIST_PACKED = new EnumC6622u("FIXED32_LIST_PACKED", 41, 41, bVar3, enumC6569c04);
        BOOL_LIST_PACKED = new EnumC6622u("BOOL_LIST_PACKED", 42, 42, bVar3, enumC6569c05);
        UINT32_LIST_PACKED = new EnumC6622u("UINT32_LIST_PACKED", 43, 43, bVar3, enumC6569c04);
        ENUM_LIST_PACKED = new EnumC6622u("ENUM_LIST_PACKED", 44, 44, bVar3, enumC6569c09);
        SFIXED32_LIST_PACKED = new EnumC6622u("SFIXED32_LIST_PACKED", 45, 45, bVar3, enumC6569c04);
        SFIXED64_LIST_PACKED = new EnumC6622u("SFIXED64_LIST_PACKED", 46, 46, bVar3, enumC6569c03);
        SINT32_LIST_PACKED = new EnumC6622u("SINT32_LIST_PACKED", 47, 47, bVar3, enumC6569c04);
        SINT64_LIST_PACKED = new EnumC6622u("SINT64_LIST_PACKED", 48, 48, bVar3, enumC6569c03);
        GROUP_LIST = new EnumC6622u("GROUP_LIST", 49, 49, bVar2, enumC6569c07);
        MAP = new EnumC6622u("MAP", 50, 50, b.MAP, EnumC6569c0.VOID);
        $VALUES = m19195b();
        EMPTY_TYPES = new Type[0];
        EnumC6622u[] values = values();
        VALUES = new EnumC6622u[values.length];
        for (EnumC6622u enumC6622u : values) {
            VALUES[enumC6622u.f14627id] = enumC6622u;
        }
    }

    private EnumC6622u(String str, int i10, int i11, b bVar, EnumC6569c0 enumC6569c0) {
        int i12;
        this.f14627id = i11;
        this.collection = bVar;
        this.javaType = enumC6569c0;
        int i13 = a.f14628a[bVar.ordinal()];
        this.elementType = (i13 == 1 || i13 == 2) ? enumC6569c0.m18415h() : null;
        this.primitiveScalar = (bVar != b.SCALAR || (i12 = a.f14629b[enumC6569c0.ordinal()]) == 1 || i12 == 2 || i12 == 3) ? false : true;
    }

    /* renamed from: b */
    private static /* synthetic */ EnumC6622u[] m19195b() {
        return new EnumC6622u[]{DOUBLE, FLOAT, INT64, UINT64, INT32, FIXED64, FIXED32, BOOL, STRING, MESSAGE, BYTES, UINT32, ENUM, SFIXED32, SFIXED64, SINT32, SINT64, GROUP, DOUBLE_LIST, FLOAT_LIST, INT64_LIST, UINT64_LIST, INT32_LIST, FIXED64_LIST, FIXED32_LIST, BOOL_LIST, STRING_LIST, MESSAGE_LIST, BYTES_LIST, UINT32_LIST, ENUM_LIST, SFIXED32_LIST, SFIXED64_LIST, SINT32_LIST, SINT64_LIST, DOUBLE_LIST_PACKED, FLOAT_LIST_PACKED, INT64_LIST_PACKED, UINT64_LIST_PACKED, INT32_LIST_PACKED, FIXED64_LIST_PACKED, FIXED32_LIST_PACKED, BOOL_LIST_PACKED, UINT32_LIST_PACKED, ENUM_LIST_PACKED, SFIXED32_LIST_PACKED, SFIXED64_LIST_PACKED, SINT32_LIST_PACKED, SINT64_LIST_PACKED, GROUP_LIST, MAP};
    }

    public static EnumC6622u valueOf(String str) {
        return (EnumC6622u) Enum.valueOf(EnumC6622u.class, str);
    }

    public static EnumC6622u[] values() {
        return (EnumC6622u[]) $VALUES.clone();
    }

    /* renamed from: h */
    public int m19196h() {
        return this.f14627id;
    }
}

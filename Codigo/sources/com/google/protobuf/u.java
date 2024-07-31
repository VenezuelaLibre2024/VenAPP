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
/* loaded from: classes2.dex */
public final class u {
    private static final /* synthetic */ u[] $VALUES;
    public static final u BOOL;
    public static final u BOOL_LIST;
    public static final u BOOL_LIST_PACKED;
    public static final u BYTES;
    public static final u BYTES_LIST;
    public static final u DOUBLE;
    public static final u DOUBLE_LIST;
    public static final u DOUBLE_LIST_PACKED;
    private static final Type[] EMPTY_TYPES;
    public static final u ENUM;
    public static final u ENUM_LIST;
    public static final u ENUM_LIST_PACKED;
    public static final u FIXED32;
    public static final u FIXED32_LIST;
    public static final u FIXED32_LIST_PACKED;
    public static final u FIXED64;
    public static final u FIXED64_LIST;
    public static final u FIXED64_LIST_PACKED;
    public static final u FLOAT;
    public static final u FLOAT_LIST;
    public static final u FLOAT_LIST_PACKED;
    public static final u GROUP;
    public static final u GROUP_LIST;
    public static final u INT32;
    public static final u INT32_LIST;
    public static final u INT32_LIST_PACKED;
    public static final u INT64;
    public static final u INT64_LIST;
    public static final u INT64_LIST_PACKED;
    public static final u MAP;
    public static final u MESSAGE;
    public static final u MESSAGE_LIST;
    public static final u SFIXED32;
    public static final u SFIXED32_LIST;
    public static final u SFIXED32_LIST_PACKED;
    public static final u SFIXED64;
    public static final u SFIXED64_LIST;
    public static final u SFIXED64_LIST_PACKED;
    public static final u SINT32;
    public static final u SINT32_LIST;
    public static final u SINT32_LIST_PACKED;
    public static final u SINT64;
    public static final u SINT64_LIST;
    public static final u SINT64_LIST_PACKED;
    public static final u STRING;
    public static final u STRING_LIST;
    public static final u UINT32;
    public static final u UINT32_LIST;
    public static final u UINT32_LIST_PACKED;
    public static final u UINT64;
    public static final u UINT64_LIST;
    public static final u UINT64_LIST_PACKED;
    private static final u[] VALUES;
    private final b collection;
    private final Class<?> elementType;

    /* renamed from: id, reason: collision with root package name */
    private final int f13353id;
    private final c0 javaType;
    private final boolean primitiveScalar;

    /* loaded from: classes2.dex */
    static /* synthetic */ class a {

        /* renamed from: a, reason: collision with root package name */
        static final /* synthetic */ int[] f13354a;

        /* renamed from: b, reason: collision with root package name */
        static final /* synthetic */ int[] f13355b;

        static {
            int[] iArr = new int[c0.values().length];
            f13355b = iArr;
            try {
                iArr[c0.BYTE_STRING.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f13355b[c0.MESSAGE.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f13355b[c0.STRING.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            int[] iArr2 = new int[b.values().length];
            f13354a = iArr2;
            try {
                iArr2[b.MAP.ordinal()] = 1;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f13354a[b.VECTOR.ordinal()] = 2;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f13354a[b.SCALAR.ordinal()] = 3;
            } catch (NoSuchFieldError unused6) {
            }
        }
    }

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
        c0 c0Var = c0.DOUBLE;
        DOUBLE = new u("DOUBLE", 0, 0, bVar, c0Var);
        c0 c0Var2 = c0.FLOAT;
        FLOAT = new u("FLOAT", 1, 1, bVar, c0Var2);
        c0 c0Var3 = c0.LONG;
        INT64 = new u("INT64", 2, 2, bVar, c0Var3);
        UINT64 = new u("UINT64", 3, 3, bVar, c0Var3);
        c0 c0Var4 = c0.INT;
        INT32 = new u("INT32", 4, 4, bVar, c0Var4);
        FIXED64 = new u("FIXED64", 5, 5, bVar, c0Var3);
        FIXED32 = new u("FIXED32", 6, 6, bVar, c0Var4);
        c0 c0Var5 = c0.BOOLEAN;
        BOOL = new u("BOOL", 7, 7, bVar, c0Var5);
        c0 c0Var6 = c0.STRING;
        STRING = new u("STRING", 8, 8, bVar, c0Var6);
        c0 c0Var7 = c0.MESSAGE;
        MESSAGE = new u("MESSAGE", 9, 9, bVar, c0Var7);
        c0 c0Var8 = c0.BYTE_STRING;
        BYTES = new u("BYTES", 10, 10, bVar, c0Var8);
        UINT32 = new u("UINT32", 11, 11, bVar, c0Var4);
        c0 c0Var9 = c0.ENUM;
        ENUM = new u("ENUM", 12, 12, bVar, c0Var9);
        SFIXED32 = new u("SFIXED32", 13, 13, bVar, c0Var4);
        SFIXED64 = new u("SFIXED64", 14, 14, bVar, c0Var3);
        SINT32 = new u("SINT32", 15, 15, bVar, c0Var4);
        SINT64 = new u("SINT64", 16, 16, bVar, c0Var3);
        GROUP = new u("GROUP", 17, 17, bVar, c0Var7);
        b bVar2 = b.VECTOR;
        DOUBLE_LIST = new u("DOUBLE_LIST", 18, 18, bVar2, c0Var);
        FLOAT_LIST = new u("FLOAT_LIST", 19, 19, bVar2, c0Var2);
        INT64_LIST = new u("INT64_LIST", 20, 20, bVar2, c0Var3);
        UINT64_LIST = new u("UINT64_LIST", 21, 21, bVar2, c0Var3);
        INT32_LIST = new u("INT32_LIST", 22, 22, bVar2, c0Var4);
        FIXED64_LIST = new u("FIXED64_LIST", 23, 23, bVar2, c0Var3);
        FIXED32_LIST = new u("FIXED32_LIST", 24, 24, bVar2, c0Var4);
        BOOL_LIST = new u("BOOL_LIST", 25, 25, bVar2, c0Var5);
        STRING_LIST = new u("STRING_LIST", 26, 26, bVar2, c0Var6);
        MESSAGE_LIST = new u("MESSAGE_LIST", 27, 27, bVar2, c0Var7);
        BYTES_LIST = new u("BYTES_LIST", 28, 28, bVar2, c0Var8);
        UINT32_LIST = new u("UINT32_LIST", 29, 29, bVar2, c0Var4);
        ENUM_LIST = new u("ENUM_LIST", 30, 30, bVar2, c0Var9);
        SFIXED32_LIST = new u("SFIXED32_LIST", 31, 31, bVar2, c0Var4);
        SFIXED64_LIST = new u("SFIXED64_LIST", 32, 32, bVar2, c0Var3);
        SINT32_LIST = new u("SINT32_LIST", 33, 33, bVar2, c0Var4);
        SINT64_LIST = new u("SINT64_LIST", 34, 34, bVar2, c0Var3);
        b bVar3 = b.PACKED_VECTOR;
        DOUBLE_LIST_PACKED = new u("DOUBLE_LIST_PACKED", 35, 35, bVar3, c0Var);
        FLOAT_LIST_PACKED = new u("FLOAT_LIST_PACKED", 36, 36, bVar3, c0Var2);
        INT64_LIST_PACKED = new u("INT64_LIST_PACKED", 37, 37, bVar3, c0Var3);
        UINT64_LIST_PACKED = new u("UINT64_LIST_PACKED", 38, 38, bVar3, c0Var3);
        INT32_LIST_PACKED = new u("INT32_LIST_PACKED", 39, 39, bVar3, c0Var4);
        FIXED64_LIST_PACKED = new u("FIXED64_LIST_PACKED", 40, 40, bVar3, c0Var3);
        FIXED32_LIST_PACKED = new u("FIXED32_LIST_PACKED", 41, 41, bVar3, c0Var4);
        BOOL_LIST_PACKED = new u("BOOL_LIST_PACKED", 42, 42, bVar3, c0Var5);
        UINT32_LIST_PACKED = new u("UINT32_LIST_PACKED", 43, 43, bVar3, c0Var4);
        ENUM_LIST_PACKED = new u("ENUM_LIST_PACKED", 44, 44, bVar3, c0Var9);
        SFIXED32_LIST_PACKED = new u("SFIXED32_LIST_PACKED", 45, 45, bVar3, c0Var4);
        SFIXED64_LIST_PACKED = new u("SFIXED64_LIST_PACKED", 46, 46, bVar3, c0Var3);
        SINT32_LIST_PACKED = new u("SINT32_LIST_PACKED", 47, 47, bVar3, c0Var4);
        SINT64_LIST_PACKED = new u("SINT64_LIST_PACKED", 48, 48, bVar3, c0Var3);
        GROUP_LIST = new u("GROUP_LIST", 49, 49, bVar2, c0Var7);
        MAP = new u("MAP", 50, 50, b.MAP, c0.VOID);
        $VALUES = b();
        EMPTY_TYPES = new Type[0];
        u[] values = values();
        VALUES = new u[values.length];
        for (u uVar : values) {
            VALUES[uVar.f13353id] = uVar;
        }
    }

    private u(String str, int i10, int i11, b bVar, c0 c0Var) {
        int i12;
        this.f13353id = i11;
        this.collection = bVar;
        this.javaType = c0Var;
        int i13 = a.f13354a[bVar.ordinal()];
        this.elementType = (i13 == 1 || i13 == 2) ? c0Var.h() : null;
        this.primitiveScalar = (bVar != b.SCALAR || (i12 = a.f13355b[c0Var.ordinal()]) == 1 || i12 == 2 || i12 == 3) ? false : true;
    }

    private static /* synthetic */ u[] b() {
        return new u[]{DOUBLE, FLOAT, INT64, UINT64, INT32, FIXED64, FIXED32, BOOL, STRING, MESSAGE, BYTES, UINT32, ENUM, SFIXED32, SFIXED64, SINT32, SINT64, GROUP, DOUBLE_LIST, FLOAT_LIST, INT64_LIST, UINT64_LIST, INT32_LIST, FIXED64_LIST, FIXED32_LIST, BOOL_LIST, STRING_LIST, MESSAGE_LIST, BYTES_LIST, UINT32_LIST, ENUM_LIST, SFIXED32_LIST, SFIXED64_LIST, SINT32_LIST, SINT64_LIST, DOUBLE_LIST_PACKED, FLOAT_LIST_PACKED, INT64_LIST_PACKED, UINT64_LIST_PACKED, INT32_LIST_PACKED, FIXED64_LIST_PACKED, FIXED32_LIST_PACKED, BOOL_LIST_PACKED, UINT32_LIST_PACKED, ENUM_LIST_PACKED, SFIXED32_LIST_PACKED, SFIXED64_LIST_PACKED, SINT32_LIST_PACKED, SINT64_LIST_PACKED, GROUP_LIST, MAP};
    }

    public static u valueOf(String str) {
        return (u) Enum.valueOf(u.class, str);
    }

    public static u[] values() {
        return (u[]) $VALUES.clone();
    }

    public int h() {
        return this.f13353id;
    }
}

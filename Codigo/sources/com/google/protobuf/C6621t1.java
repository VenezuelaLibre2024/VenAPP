package com.google.protobuf;

/* renamed from: com.google.protobuf.t1 */
/* loaded from: classes2.dex */
public final class C6621t1 {

    /* renamed from: a */
    static final int f14623a = m19190c(1, 3);

    /* renamed from: b */
    static final int f14624b = m19190c(1, 4);

    /* renamed from: c */
    static final int f14625c = m19190c(2, 0);

    /* renamed from: d */
    static final int f14626d = m19190c(3, 2);

    /* JADX WARN: Enum visitor error
    jadx.core.utils.exceptions.JadxRuntimeException: Init of enum field 'INT64' uses external variables
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
    /* renamed from: com.google.protobuf.t1$b */
    /* loaded from: classes2.dex */
    public static class b {
        private static final /* synthetic */ b[] $VALUES;
        public static final b BOOL;
        public static final b BYTES;
        public static final b ENUM;
        public static final b FIXED32;
        public static final b FIXED64;
        public static final b GROUP;
        public static final b INT32;
        public static final b INT64;
        public static final b MESSAGE;
        public static final b SFIXED32;
        public static final b SFIXED64;
        public static final b SINT32;
        public static final b SINT64;
        public static final b STRING;
        public static final b UINT32;
        public static final b UINT64;
        private final c javaType;
        private final int wireType;
        public static final b DOUBLE = new b("DOUBLE", 0, c.DOUBLE, 1);
        public static final b FLOAT = new b("FLOAT", 1, c.FLOAT, 5);

        /* renamed from: com.google.protobuf.t1$b$a */
        /* loaded from: classes2.dex */
        enum a extends b {
            a(String str, int i10, c cVar, int i11) {
                super(str, i10, cVar, i11);
            }
        }

        /* renamed from: com.google.protobuf.t1$b$b, reason: collision with other inner class name */
        /* loaded from: classes2.dex */
        enum C13198b extends b {
            C13198b(String str, int i10, c cVar, int i11) {
                super(str, i10, cVar, i11);
            }
        }

        /* renamed from: com.google.protobuf.t1$b$c */
        /* loaded from: classes2.dex */
        enum c extends b {
            c(String str, int i10, c cVar, int i11) {
                super(str, i10, cVar, i11);
            }
        }

        /* renamed from: com.google.protobuf.t1$b$d */
        /* loaded from: classes2.dex */
        enum d extends b {
            d(String str, int i10, c cVar, int i11) {
                super(str, i10, cVar, i11);
            }
        }

        static {
            c cVar = c.LONG;
            INT64 = new b("INT64", 2, cVar, 0);
            UINT64 = new b("UINT64", 3, cVar, 0);
            c cVar2 = c.INT;
            INT32 = new b("INT32", 4, cVar2, 0);
            FIXED64 = new b("FIXED64", 5, cVar, 1);
            FIXED32 = new b("FIXED32", 6, cVar2, 5);
            BOOL = new b("BOOL", 7, c.BOOLEAN, 0);
            STRING = new a("STRING", 8, c.STRING, 2);
            c cVar3 = c.MESSAGE;
            GROUP = new C13198b("GROUP", 9, cVar3, 3);
            MESSAGE = new c("MESSAGE", 10, cVar3, 2);
            BYTES = new d("BYTES", 11, c.BYTE_STRING, 2);
            UINT32 = new b("UINT32", 12, cVar2, 0);
            ENUM = new b("ENUM", 13, c.ENUM, 0);
            SFIXED32 = new b("SFIXED32", 14, cVar2, 5);
            SFIXED64 = new b("SFIXED64", 15, cVar, 1);
            SINT32 = new b("SINT32", 16, cVar2, 0);
            SINT64 = new b("SINT64", 17, cVar, 0);
            $VALUES = m19191b();
        }

        private b(String str, int i10, c cVar, int i11) {
            this.javaType = cVar;
            this.wireType = i11;
        }

        /* renamed from: b */
        private static /* synthetic */ b[] m19191b() {
            return new b[]{DOUBLE, FLOAT, INT64, UINT64, INT32, FIXED64, FIXED32, BOOL, STRING, GROUP, MESSAGE, BYTES, UINT32, ENUM, SFIXED32, SFIXED64, SINT32, SINT64};
        }

        public static b valueOf(String str) {
            return (b) Enum.valueOf(b.class, str);
        }

        public static b[] values() {
            return (b[]) $VALUES.clone();
        }

        /* renamed from: h */
        public c m19192h() {
            return this.javaType;
        }

        /* renamed from: i */
        public int m19193i() {
            return this.wireType;
        }
    }

    /* renamed from: com.google.protobuf.t1$c */
    /* loaded from: classes2.dex */
    public enum c {
        INT(0),
        LONG(0L),
        FLOAT(Float.valueOf(0.0f)),
        DOUBLE(Double.valueOf(0.0d)),
        BOOLEAN(Boolean.FALSE),
        STRING(""),
        BYTE_STRING(AbstractC6580g.f14459b),
        ENUM(null),
        MESSAGE(null);

        private final Object defaultDefault;

        c(Object obj) {
            this.defaultDefault = obj;
        }
    }

    /* renamed from: a */
    public static int m19188a(int i10) {
        return i10 >>> 3;
    }

    /* renamed from: b */
    public static int m19189b(int i10) {
        return i10 & 7;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: c */
    public static int m19190c(int i10, int i11) {
        return (i10 << 3) | i11;
    }
}

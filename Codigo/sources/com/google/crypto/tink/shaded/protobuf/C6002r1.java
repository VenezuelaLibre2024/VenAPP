package com.google.crypto.tink.shaded.protobuf;

import java.lang.reflect.Field;
import java.nio.Buffer;
import java.nio.ByteOrder;
import java.security.AccessController;
import java.security.PrivilegedExceptionAction;
import java.util.logging.Level;
import java.util.logging.Logger;
import sun.misc.Unsafe;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: com.google.crypto.tink.shaded.protobuf.r1 */
/* loaded from: classes2.dex */
public final class C6002r1 {

    /* renamed from: a */
    private static final Unsafe f12708a = m15977D();

    /* renamed from: b */
    private static final Class<?> f12709b = C5958d.m15343b();

    /* renamed from: c */
    private static final boolean f12710c = m16008o(Long.TYPE);

    /* renamed from: d */
    private static final boolean f12711d = m16008o(Integer.TYPE);

    /* renamed from: e */
    private static final e f12712e = m15975B();

    /* renamed from: f */
    private static final boolean f12713f = m15993T();

    /* renamed from: g */
    private static final boolean f12714g = m15992S();

    /* renamed from: h */
    static final long f12715h;

    /* renamed from: i */
    private static final long f12716i;

    /* renamed from: j */
    private static final long f12717j;

    /* renamed from: k */
    private static final long f12718k;

    /* renamed from: l */
    private static final long f12719l;

    /* renamed from: m */
    private static final long f12720m;

    /* renamed from: n */
    private static final long f12721n;

    /* renamed from: o */
    private static final long f12722o;

    /* renamed from: p */
    private static final long f12723p;

    /* renamed from: q */
    private static final long f12724q;

    /* renamed from: r */
    private static final long f12725r;

    /* renamed from: s */
    private static final long f12726s;

    /* renamed from: t */
    private static final long f12727t;

    /* renamed from: u */
    private static final long f12728u;

    /* renamed from: v */
    private static final int f12729v;

    /* renamed from: w */
    static final boolean f12730w;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.google.crypto.tink.shaded.protobuf.r1$a */
    /* loaded from: classes2.dex */
    public class a implements PrivilegedExceptionAction<Unsafe> {
        a() {
        }

        @Override // java.security.PrivilegedExceptionAction
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public Unsafe run() {
            for (Field field : Unsafe.class.getDeclaredFields()) {
                field.setAccessible(true);
                Object obj = field.get(null);
                if (Unsafe.class.isInstance(obj)) {
                    return (Unsafe) Unsafe.class.cast(obj);
                }
            }
            return null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: com.google.crypto.tink.shaded.protobuf.r1$b */
    /* loaded from: classes2.dex */
    public static final class b extends e {
        b(Unsafe unsafe) {
            super(unsafe);
        }

        @Override // com.google.crypto.tink.shaded.protobuf.C6002r1.e
        /* renamed from: c */
        public boolean mo16021c(Object obj, long j10) {
            return C6002r1.f12730w ? C6002r1.m16012s(obj, j10) : C6002r1.m16013t(obj, j10);
        }

        @Override // com.google.crypto.tink.shaded.protobuf.C6002r1.e
        /* renamed from: d */
        public byte mo16022d(Object obj, long j10) {
            return C6002r1.f12730w ? C6002r1.m16015v(obj, j10) : C6002r1.m16016w(obj, j10);
        }

        @Override // com.google.crypto.tink.shaded.protobuf.C6002r1.e
        /* renamed from: e */
        public double mo16023e(Object obj, long j10) {
            return Double.longBitsToDouble(m16034h(obj, j10));
        }

        @Override // com.google.crypto.tink.shaded.protobuf.C6002r1.e
        /* renamed from: f */
        public float mo16024f(Object obj, long j10) {
            return Float.intBitsToFloat(m16033g(obj, j10));
        }

        @Override // com.google.crypto.tink.shaded.protobuf.C6002r1.e
        /* renamed from: k */
        public void mo16025k(Object obj, long j10, boolean z10) {
            if (C6002r1.f12730w) {
                C6002r1.m15982I(obj, j10, z10);
            } else {
                C6002r1.m15983J(obj, j10, z10);
            }
        }

        @Override // com.google.crypto.tink.shaded.protobuf.C6002r1.e
        /* renamed from: l */
        public void mo16026l(Object obj, long j10, byte b10) {
            if (C6002r1.f12730w) {
                C6002r1.m15985L(obj, j10, b10);
            } else {
                C6002r1.m15986M(obj, j10, b10);
            }
        }

        @Override // com.google.crypto.tink.shaded.protobuf.C6002r1.e
        /* renamed from: m */
        public void mo16027m(Object obj, long j10, double d10) {
            m16038p(obj, j10, Double.doubleToLongBits(d10));
        }

        @Override // com.google.crypto.tink.shaded.protobuf.C6002r1.e
        /* renamed from: n */
        public void mo16028n(Object obj, long j10, float f10) {
            m16037o(obj, j10, Float.floatToIntBits(f10));
        }

        @Override // com.google.crypto.tink.shaded.protobuf.C6002r1.e
        /* renamed from: s */
        public boolean mo16029s() {
            return false;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: com.google.crypto.tink.shaded.protobuf.r1$c */
    /* loaded from: classes2.dex */
    public static final class c extends e {
        c(Unsafe unsafe) {
            super(unsafe);
        }

        @Override // com.google.crypto.tink.shaded.protobuf.C6002r1.e
        /* renamed from: c */
        public boolean mo16021c(Object obj, long j10) {
            return C6002r1.f12730w ? C6002r1.m16012s(obj, j10) : C6002r1.m16013t(obj, j10);
        }

        @Override // com.google.crypto.tink.shaded.protobuf.C6002r1.e
        /* renamed from: d */
        public byte mo16022d(Object obj, long j10) {
            return C6002r1.f12730w ? C6002r1.m16015v(obj, j10) : C6002r1.m16016w(obj, j10);
        }

        @Override // com.google.crypto.tink.shaded.protobuf.C6002r1.e
        /* renamed from: e */
        public double mo16023e(Object obj, long j10) {
            return Double.longBitsToDouble(m16034h(obj, j10));
        }

        @Override // com.google.crypto.tink.shaded.protobuf.C6002r1.e
        /* renamed from: f */
        public float mo16024f(Object obj, long j10) {
            return Float.intBitsToFloat(m16033g(obj, j10));
        }

        @Override // com.google.crypto.tink.shaded.protobuf.C6002r1.e
        /* renamed from: k */
        public void mo16025k(Object obj, long j10, boolean z10) {
            if (C6002r1.f12730w) {
                C6002r1.m15982I(obj, j10, z10);
            } else {
                C6002r1.m15983J(obj, j10, z10);
            }
        }

        @Override // com.google.crypto.tink.shaded.protobuf.C6002r1.e
        /* renamed from: l */
        public void mo16026l(Object obj, long j10, byte b10) {
            if (C6002r1.f12730w) {
                C6002r1.m15985L(obj, j10, b10);
            } else {
                C6002r1.m15986M(obj, j10, b10);
            }
        }

        @Override // com.google.crypto.tink.shaded.protobuf.C6002r1.e
        /* renamed from: m */
        public void mo16027m(Object obj, long j10, double d10) {
            m16038p(obj, j10, Double.doubleToLongBits(d10));
        }

        @Override // com.google.crypto.tink.shaded.protobuf.C6002r1.e
        /* renamed from: n */
        public void mo16028n(Object obj, long j10, float f10) {
            m16037o(obj, j10, Float.floatToIntBits(f10));
        }

        @Override // com.google.crypto.tink.shaded.protobuf.C6002r1.e
        /* renamed from: s */
        public boolean mo16029s() {
            return false;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: com.google.crypto.tink.shaded.protobuf.r1$d */
    /* loaded from: classes2.dex */
    public static final class d extends e {
        d(Unsafe unsafe) {
            super(unsafe);
        }

        @Override // com.google.crypto.tink.shaded.protobuf.C6002r1.e
        /* renamed from: c */
        public boolean mo16021c(Object obj, long j10) {
            return this.f12731a.getBoolean(obj, j10);
        }

        @Override // com.google.crypto.tink.shaded.protobuf.C6002r1.e
        /* renamed from: d */
        public byte mo16022d(Object obj, long j10) {
            return this.f12731a.getByte(obj, j10);
        }

        @Override // com.google.crypto.tink.shaded.protobuf.C6002r1.e
        /* renamed from: e */
        public double mo16023e(Object obj, long j10) {
            return this.f12731a.getDouble(obj, j10);
        }

        @Override // com.google.crypto.tink.shaded.protobuf.C6002r1.e
        /* renamed from: f */
        public float mo16024f(Object obj, long j10) {
            return this.f12731a.getFloat(obj, j10);
        }

        @Override // com.google.crypto.tink.shaded.protobuf.C6002r1.e
        /* renamed from: k */
        public void mo16025k(Object obj, long j10, boolean z10) {
            this.f12731a.putBoolean(obj, j10, z10);
        }

        @Override // com.google.crypto.tink.shaded.protobuf.C6002r1.e
        /* renamed from: l */
        public void mo16026l(Object obj, long j10, byte b10) {
            this.f12731a.putByte(obj, j10, b10);
        }

        @Override // com.google.crypto.tink.shaded.protobuf.C6002r1.e
        /* renamed from: m */
        public void mo16027m(Object obj, long j10, double d10) {
            this.f12731a.putDouble(obj, j10, d10);
        }

        @Override // com.google.crypto.tink.shaded.protobuf.C6002r1.e
        /* renamed from: n */
        public void mo16028n(Object obj, long j10, float f10) {
            this.f12731a.putFloat(obj, j10, f10);
        }

        @Override // com.google.crypto.tink.shaded.protobuf.C6002r1.e
        /* renamed from: r */
        public boolean mo16030r() {
            if (!super.mo16030r()) {
                return false;
            }
            try {
                Class<?> cls = this.f12731a.getClass();
                Class<?> cls2 = Long.TYPE;
                cls.getMethod("getByte", Object.class, cls2);
                cls.getMethod("putByte", Object.class, cls2, Byte.TYPE);
                cls.getMethod("getBoolean", Object.class, cls2);
                cls.getMethod("putBoolean", Object.class, cls2, Boolean.TYPE);
                cls.getMethod("getFloat", Object.class, cls2);
                cls.getMethod("putFloat", Object.class, cls2, Float.TYPE);
                cls.getMethod("getDouble", Object.class, cls2);
                cls.getMethod("putDouble", Object.class, cls2, Double.TYPE);
                return true;
            } catch (Throwable th2) {
                C6002r1.m15980G(th2);
                return false;
            }
        }

        @Override // com.google.crypto.tink.shaded.protobuf.C6002r1.e
        /* renamed from: s */
        public boolean mo16029s() {
            if (!super.mo16029s()) {
                return false;
            }
            try {
                Class<?> cls = this.f12731a.getClass();
                Class<?> cls2 = Long.TYPE;
                cls.getMethod("getByte", cls2);
                cls.getMethod("putByte", cls2, Byte.TYPE);
                cls.getMethod("getInt", cls2);
                cls.getMethod("putInt", cls2, Integer.TYPE);
                cls.getMethod("getLong", cls2);
                cls.getMethod("putLong", cls2, cls2);
                cls.getMethod("copyMemory", cls2, cls2, cls2);
                cls.getMethod("copyMemory", Object.class, cls2, Object.class, cls2, cls2);
                return true;
            } catch (Throwable th2) {
                C6002r1.m15980G(th2);
                return false;
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: com.google.crypto.tink.shaded.protobuf.r1$e */
    /* loaded from: classes2.dex */
    public static abstract class e {

        /* renamed from: a */
        Unsafe f12731a;

        e(Unsafe unsafe) {
            this.f12731a = unsafe;
        }

        /* renamed from: a */
        public final int m16031a(Class<?> cls) {
            return this.f12731a.arrayBaseOffset(cls);
        }

        /* renamed from: b */
        public final int m16032b(Class<?> cls) {
            return this.f12731a.arrayIndexScale(cls);
        }

        /* renamed from: c */
        public abstract boolean mo16021c(Object obj, long j10);

        /* renamed from: d */
        public abstract byte mo16022d(Object obj, long j10);

        /* renamed from: e */
        public abstract double mo16023e(Object obj, long j10);

        /* renamed from: f */
        public abstract float mo16024f(Object obj, long j10);

        /* renamed from: g */
        public final int m16033g(Object obj, long j10) {
            return this.f12731a.getInt(obj, j10);
        }

        /* renamed from: h */
        public final long m16034h(Object obj, long j10) {
            return this.f12731a.getLong(obj, j10);
        }

        /* renamed from: i */
        public final Object m16035i(Object obj, long j10) {
            return this.f12731a.getObject(obj, j10);
        }

        /* renamed from: j */
        public final long m16036j(Field field) {
            return this.f12731a.objectFieldOffset(field);
        }

        /* renamed from: k */
        public abstract void mo16025k(Object obj, long j10, boolean z10);

        /* renamed from: l */
        public abstract void mo16026l(Object obj, long j10, byte b10);

        /* renamed from: m */
        public abstract void mo16027m(Object obj, long j10, double d10);

        /* renamed from: n */
        public abstract void mo16028n(Object obj, long j10, float f10);

        /* renamed from: o */
        public final void m16037o(Object obj, long j10, int i10) {
            this.f12731a.putInt(obj, j10, i10);
        }

        /* renamed from: p */
        public final void m16038p(Object obj, long j10, long j11) {
            this.f12731a.putLong(obj, j10, j11);
        }

        /* renamed from: q */
        public final void m16039q(Object obj, long j10, Object obj2) {
            this.f12731a.putObject(obj, j10, obj2);
        }

        /* renamed from: r */
        public boolean mo16030r() {
            Unsafe unsafe = this.f12731a;
            if (unsafe == null) {
                return false;
            }
            try {
                Class<?> cls = unsafe.getClass();
                cls.getMethod("objectFieldOffset", Field.class);
                cls.getMethod("arrayBaseOffset", Class.class);
                cls.getMethod("arrayIndexScale", Class.class);
                Class<?> cls2 = Long.TYPE;
                cls.getMethod("getInt", Object.class, cls2);
                cls.getMethod("putInt", Object.class, cls2, Integer.TYPE);
                cls.getMethod("getLong", Object.class, cls2);
                cls.getMethod("putLong", Object.class, cls2, cls2);
                cls.getMethod("getObject", Object.class, cls2);
                cls.getMethod("putObject", Object.class, cls2, Object.class);
                return true;
            } catch (Throwable th2) {
                C6002r1.m15980G(th2);
                return false;
            }
        }

        /* renamed from: s */
        public boolean mo16029s() {
            Unsafe unsafe = this.f12731a;
            if (unsafe == null) {
                return false;
            }
            try {
                Class<?> cls = unsafe.getClass();
                cls.getMethod("objectFieldOffset", Field.class);
                cls.getMethod("getLong", Object.class, Long.TYPE);
                return C6002r1.m15995b() != null;
            } catch (Throwable th2) {
                C6002r1.m15980G(th2);
                return false;
            }
        }
    }

    static {
        long m16005l = m16005l(byte[].class);
        f12715h = m16005l;
        f12716i = m16005l(boolean[].class);
        f12717j = m16006m(boolean[].class);
        f12718k = m16005l(int[].class);
        f12719l = m16006m(int[].class);
        f12720m = m16005l(long[].class);
        f12721n = m16006m(long[].class);
        f12722o = m16005l(float[].class);
        f12723p = m16006m(float[].class);
        f12724q = m16005l(double[].class);
        f12725r = m16006m(double[].class);
        f12726s = m16005l(Object[].class);
        f12727t = m16006m(Object[].class);
        f12728u = m16010q(m16007n());
        f12729v = (int) (m16005l & 7);
        f12730w = ByteOrder.nativeOrder() == ByteOrder.BIG_ENDIAN;
    }

    private C6002r1() {
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: A */
    public static long m15974A(Object obj, long j10) {
        return f12712e.m16034h(obj, j10);
    }

    /* renamed from: B */
    private static e m15975B() {
        Unsafe unsafe = f12708a;
        if (unsafe == null) {
            return null;
        }
        if (!C5958d.m15344c()) {
            return new d(unsafe);
        }
        if (f12710c) {
            return new c(unsafe);
        }
        if (f12711d) {
            return new b(unsafe);
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: C */
    public static Object m15976C(Object obj, long j10) {
        return f12712e.m16035i(obj, j10);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: D */
    public static Unsafe m15977D() {
        try {
            return (Unsafe) AccessController.doPrivileged(new a());
        } catch (Throwable unused) {
            return null;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: E */
    public static boolean m15978E() {
        return f12714g;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: F */
    public static boolean m15979F() {
        return f12713f;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: G */
    public static void m15980G(Throwable th2) {
        Logger.getLogger(C6002r1.class.getName()).log(Level.WARNING, "platform method missing - proto runtime falling back to safer methods: " + th2);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: H */
    public static void m15981H(Object obj, long j10, boolean z10) {
        f12712e.mo16025k(obj, j10, z10);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: I */
    public static void m15982I(Object obj, long j10, boolean z10) {
        m15985L(obj, j10, z10 ? (byte) 1 : (byte) 0);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: J */
    public static void m15983J(Object obj, long j10, boolean z10) {
        m15986M(obj, j10, z10 ? (byte) 1 : (byte) 0);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: K */
    public static void m15984K(byte[] bArr, long j10, byte b10) {
        f12712e.mo16026l(bArr, f12715h + j10, b10);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: L */
    public static void m15985L(Object obj, long j10, byte b10) {
        long j11 = (-4) & j10;
        int m16019z = m16019z(obj, j11);
        int i10 = ((~((int) j10)) & 3) << 3;
        m15989P(obj, j11, ((255 & b10) << i10) | (m16019z & (~(255 << i10))));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: M */
    public static void m15986M(Object obj, long j10, byte b10) {
        long j11 = (-4) & j10;
        int i10 = (((int) j10) & 3) << 3;
        m15989P(obj, j11, ((255 & b10) << i10) | (m16019z(obj, j11) & (~(255 << i10))));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: N */
    public static void m15987N(Object obj, long j10, double d10) {
        f12712e.mo16027m(obj, j10, d10);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: O */
    public static void m15988O(Object obj, long j10, float f10) {
        f12712e.mo16028n(obj, j10, f10);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: P */
    public static void m15989P(Object obj, long j10, int i10) {
        f12712e.m16037o(obj, j10, i10);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: Q */
    public static void m15990Q(Object obj, long j10, long j11) {
        f12712e.m16038p(obj, j10, j11);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: R */
    public static void m15991R(Object obj, long j10, Object obj2) {
        f12712e.m16039q(obj, j10, obj2);
    }

    /* renamed from: S */
    private static boolean m15992S() {
        e eVar = f12712e;
        if (eVar == null) {
            return false;
        }
        return eVar.mo16030r();
    }

    /* renamed from: T */
    private static boolean m15993T() {
        e eVar = f12712e;
        if (eVar == null) {
            return false;
        }
        return eVar.mo16029s();
    }

    /* renamed from: b */
    static /* synthetic */ Field m15995b() {
        return m16007n();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: k */
    public static <T> T m16004k(Class<T> cls) {
        try {
            return (T) f12708a.allocateInstance(cls);
        } catch (InstantiationException e10) {
            throw new IllegalStateException(e10);
        }
    }

    /* renamed from: l */
    private static int m16005l(Class<?> cls) {
        if (f12714g) {
            return f12712e.m16031a(cls);
        }
        return -1;
    }

    /* renamed from: m */
    private static int m16006m(Class<?> cls) {
        if (f12714g) {
            return f12712e.m16032b(cls);
        }
        return -1;
    }

    /* renamed from: n */
    private static Field m16007n() {
        Field m16009p;
        if (C5958d.m15344c() && (m16009p = m16009p(Buffer.class, "effectiveDirectAddress")) != null) {
            return m16009p;
        }
        Field m16009p2 = m16009p(Buffer.class, "address");
        if (m16009p2 == null || m16009p2.getType() != Long.TYPE) {
            return null;
        }
        return m16009p2;
    }

    /* renamed from: o */
    static boolean m16008o(Class<?> cls) {
        if (!C5958d.m15344c()) {
            return false;
        }
        try {
            Class<?> cls2 = f12709b;
            Class<?> cls3 = Boolean.TYPE;
            cls2.getMethod("peekLong", cls, cls3);
            cls2.getMethod("pokeLong", cls, Long.TYPE, cls3);
            Class<?> cls4 = Integer.TYPE;
            cls2.getMethod("pokeInt", cls, cls4, cls3);
            cls2.getMethod("peekInt", cls, cls3);
            cls2.getMethod("pokeByte", cls, Byte.TYPE);
            cls2.getMethod("peekByte", cls);
            cls2.getMethod("pokeByteArray", cls, byte[].class, cls4, cls4);
            cls2.getMethod("peekByteArray", cls, byte[].class, cls4, cls4);
            return true;
        } catch (Throwable unused) {
            return false;
        }
    }

    /* renamed from: p */
    private static Field m16009p(Class<?> cls, String str) {
        try {
            return cls.getDeclaredField(str);
        } catch (Throwable unused) {
            return null;
        }
    }

    /* renamed from: q */
    private static long m16010q(Field field) {
        e eVar;
        if (field == null || (eVar = f12712e) == null) {
            return -1L;
        }
        return eVar.m16036j(field);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: r */
    public static boolean m16011r(Object obj, long j10) {
        return f12712e.mo16021c(obj, j10);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: s */
    public static boolean m16012s(Object obj, long j10) {
        return m16015v(obj, j10) != 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: t */
    public static boolean m16013t(Object obj, long j10) {
        return m16016w(obj, j10) != 0;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: u */
    public static byte m16014u(byte[] bArr, long j10) {
        return f12712e.mo16022d(bArr, f12715h + j10);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: v */
    public static byte m16015v(Object obj, long j10) {
        return (byte) ((m16019z(obj, (-4) & j10) >>> ((int) (((~j10) & 3) << 3))) & 255);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: w */
    public static byte m16016w(Object obj, long j10) {
        return (byte) ((m16019z(obj, (-4) & j10) >>> ((int) ((j10 & 3) << 3))) & 255);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: x */
    public static double m16017x(Object obj, long j10) {
        return f12712e.mo16023e(obj, j10);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: y */
    public static float m16018y(Object obj, long j10) {
        return f12712e.mo16024f(obj, j10);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: z */
    public static int m16019z(Object obj, long j10) {
        return f12712e.m16033g(obj, j10);
    }
}

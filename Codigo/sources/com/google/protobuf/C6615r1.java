package com.google.protobuf;

import java.lang.reflect.Field;
import java.nio.Buffer;
import java.nio.ByteOrder;
import java.security.AccessController;
import java.security.PrivilegedExceptionAction;
import java.util.logging.Level;
import java.util.logging.Logger;
import sun.misc.Unsafe;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: com.google.protobuf.r1 */
/* loaded from: classes2.dex */
public final class C6615r1 {

    /* renamed from: a */
    private static final Unsafe f14591a = m19042D();

    /* renamed from: b */
    private static final Class<?> f14592b = C6571d.m18421b();

    /* renamed from: c */
    private static final boolean f14593c = m19073o(Long.TYPE);

    /* renamed from: d */
    private static final boolean f14594d = m19073o(Integer.TYPE);

    /* renamed from: e */
    private static final e f14595e = m19040B();

    /* renamed from: f */
    private static final boolean f14596f = m19058T();

    /* renamed from: g */
    private static final boolean f14597g = m19057S();

    /* renamed from: h */
    static final long f14598h;

    /* renamed from: i */
    private static final long f14599i;

    /* renamed from: j */
    private static final long f14600j;

    /* renamed from: k */
    private static final long f14601k;

    /* renamed from: l */
    private static final long f14602l;

    /* renamed from: m */
    private static final long f14603m;

    /* renamed from: n */
    private static final long f14604n;

    /* renamed from: o */
    private static final long f14605o;

    /* renamed from: p */
    private static final long f14606p;

    /* renamed from: q */
    private static final long f14607q;

    /* renamed from: r */
    private static final long f14608r;

    /* renamed from: s */
    private static final long f14609s;

    /* renamed from: t */
    private static final long f14610t;

    /* renamed from: u */
    private static final long f14611u;

    /* renamed from: v */
    private static final int f14612v;

    /* renamed from: w */
    static final boolean f14613w;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.google.protobuf.r1$a */
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
    /* renamed from: com.google.protobuf.r1$b */
    /* loaded from: classes2.dex */
    public static final class b extends e {
        b(Unsafe unsafe) {
            super(unsafe);
        }

        @Override // com.google.protobuf.C6615r1.e
        /* renamed from: c */
        public boolean mo19086c(Object obj, long j10) {
            return C6615r1.f14613w ? C6615r1.m19077s(obj, j10) : C6615r1.m19078t(obj, j10);
        }

        @Override // com.google.protobuf.C6615r1.e
        /* renamed from: d */
        public byte mo19087d(Object obj, long j10) {
            return C6615r1.f14613w ? C6615r1.m19080v(obj, j10) : C6615r1.m19081w(obj, j10);
        }

        @Override // com.google.protobuf.C6615r1.e
        /* renamed from: e */
        public double mo19088e(Object obj, long j10) {
            return Double.longBitsToDouble(m19099h(obj, j10));
        }

        @Override // com.google.protobuf.C6615r1.e
        /* renamed from: f */
        public float mo19089f(Object obj, long j10) {
            return Float.intBitsToFloat(m19098g(obj, j10));
        }

        @Override // com.google.protobuf.C6615r1.e
        /* renamed from: k */
        public void mo19090k(Object obj, long j10, boolean z10) {
            if (C6615r1.f14613w) {
                C6615r1.m19047I(obj, j10, z10);
            } else {
                C6615r1.m19048J(obj, j10, z10);
            }
        }

        @Override // com.google.protobuf.C6615r1.e
        /* renamed from: l */
        public void mo19091l(Object obj, long j10, byte b10) {
            if (C6615r1.f14613w) {
                C6615r1.m19050L(obj, j10, b10);
            } else {
                C6615r1.m19051M(obj, j10, b10);
            }
        }

        @Override // com.google.protobuf.C6615r1.e
        /* renamed from: m */
        public void mo19092m(Object obj, long j10, double d10) {
            m19103p(obj, j10, Double.doubleToLongBits(d10));
        }

        @Override // com.google.protobuf.C6615r1.e
        /* renamed from: n */
        public void mo19093n(Object obj, long j10, float f10) {
            m19102o(obj, j10, Float.floatToIntBits(f10));
        }

        @Override // com.google.protobuf.C6615r1.e
        /* renamed from: s */
        public boolean mo19094s() {
            return false;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: com.google.protobuf.r1$c */
    /* loaded from: classes2.dex */
    public static final class c extends e {
        c(Unsafe unsafe) {
            super(unsafe);
        }

        @Override // com.google.protobuf.C6615r1.e
        /* renamed from: c */
        public boolean mo19086c(Object obj, long j10) {
            return C6615r1.f14613w ? C6615r1.m19077s(obj, j10) : C6615r1.m19078t(obj, j10);
        }

        @Override // com.google.protobuf.C6615r1.e
        /* renamed from: d */
        public byte mo19087d(Object obj, long j10) {
            return C6615r1.f14613w ? C6615r1.m19080v(obj, j10) : C6615r1.m19081w(obj, j10);
        }

        @Override // com.google.protobuf.C6615r1.e
        /* renamed from: e */
        public double mo19088e(Object obj, long j10) {
            return Double.longBitsToDouble(m19099h(obj, j10));
        }

        @Override // com.google.protobuf.C6615r1.e
        /* renamed from: f */
        public float mo19089f(Object obj, long j10) {
            return Float.intBitsToFloat(m19098g(obj, j10));
        }

        @Override // com.google.protobuf.C6615r1.e
        /* renamed from: k */
        public void mo19090k(Object obj, long j10, boolean z10) {
            if (C6615r1.f14613w) {
                C6615r1.m19047I(obj, j10, z10);
            } else {
                C6615r1.m19048J(obj, j10, z10);
            }
        }

        @Override // com.google.protobuf.C6615r1.e
        /* renamed from: l */
        public void mo19091l(Object obj, long j10, byte b10) {
            if (C6615r1.f14613w) {
                C6615r1.m19050L(obj, j10, b10);
            } else {
                C6615r1.m19051M(obj, j10, b10);
            }
        }

        @Override // com.google.protobuf.C6615r1.e
        /* renamed from: m */
        public void mo19092m(Object obj, long j10, double d10) {
            m19103p(obj, j10, Double.doubleToLongBits(d10));
        }

        @Override // com.google.protobuf.C6615r1.e
        /* renamed from: n */
        public void mo19093n(Object obj, long j10, float f10) {
            m19102o(obj, j10, Float.floatToIntBits(f10));
        }

        @Override // com.google.protobuf.C6615r1.e
        /* renamed from: s */
        public boolean mo19094s() {
            return false;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: com.google.protobuf.r1$d */
    /* loaded from: classes2.dex */
    public static final class d extends e {
        d(Unsafe unsafe) {
            super(unsafe);
        }

        @Override // com.google.protobuf.C6615r1.e
        /* renamed from: c */
        public boolean mo19086c(Object obj, long j10) {
            return this.f14614a.getBoolean(obj, j10);
        }

        @Override // com.google.protobuf.C6615r1.e
        /* renamed from: d */
        public byte mo19087d(Object obj, long j10) {
            return this.f14614a.getByte(obj, j10);
        }

        @Override // com.google.protobuf.C6615r1.e
        /* renamed from: e */
        public double mo19088e(Object obj, long j10) {
            return this.f14614a.getDouble(obj, j10);
        }

        @Override // com.google.protobuf.C6615r1.e
        /* renamed from: f */
        public float mo19089f(Object obj, long j10) {
            return this.f14614a.getFloat(obj, j10);
        }

        @Override // com.google.protobuf.C6615r1.e
        /* renamed from: k */
        public void mo19090k(Object obj, long j10, boolean z10) {
            this.f14614a.putBoolean(obj, j10, z10);
        }

        @Override // com.google.protobuf.C6615r1.e
        /* renamed from: l */
        public void mo19091l(Object obj, long j10, byte b10) {
            this.f14614a.putByte(obj, j10, b10);
        }

        @Override // com.google.protobuf.C6615r1.e
        /* renamed from: m */
        public void mo19092m(Object obj, long j10, double d10) {
            this.f14614a.putDouble(obj, j10, d10);
        }

        @Override // com.google.protobuf.C6615r1.e
        /* renamed from: n */
        public void mo19093n(Object obj, long j10, float f10) {
            this.f14614a.putFloat(obj, j10, f10);
        }

        @Override // com.google.protobuf.C6615r1.e
        /* renamed from: r */
        public boolean mo19095r() {
            if (!super.mo19095r()) {
                return false;
            }
            try {
                Class<?> cls = this.f14614a.getClass();
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
                C6615r1.m19045G(th2);
                return false;
            }
        }

        @Override // com.google.protobuf.C6615r1.e
        /* renamed from: s */
        public boolean mo19094s() {
            if (!super.mo19094s()) {
                return false;
            }
            try {
                Class<?> cls = this.f14614a.getClass();
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
                C6615r1.m19045G(th2);
                return false;
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: com.google.protobuf.r1$e */
    /* loaded from: classes2.dex */
    public static abstract class e {

        /* renamed from: a */
        Unsafe f14614a;

        e(Unsafe unsafe) {
            this.f14614a = unsafe;
        }

        /* renamed from: a */
        public final int m19096a(Class<?> cls) {
            return this.f14614a.arrayBaseOffset(cls);
        }

        /* renamed from: b */
        public final int m19097b(Class<?> cls) {
            return this.f14614a.arrayIndexScale(cls);
        }

        /* renamed from: c */
        public abstract boolean mo19086c(Object obj, long j10);

        /* renamed from: d */
        public abstract byte mo19087d(Object obj, long j10);

        /* renamed from: e */
        public abstract double mo19088e(Object obj, long j10);

        /* renamed from: f */
        public abstract float mo19089f(Object obj, long j10);

        /* renamed from: g */
        public final int m19098g(Object obj, long j10) {
            return this.f14614a.getInt(obj, j10);
        }

        /* renamed from: h */
        public final long m19099h(Object obj, long j10) {
            return this.f14614a.getLong(obj, j10);
        }

        /* renamed from: i */
        public final Object m19100i(Object obj, long j10) {
            return this.f14614a.getObject(obj, j10);
        }

        /* renamed from: j */
        public final long m19101j(Field field) {
            return this.f14614a.objectFieldOffset(field);
        }

        /* renamed from: k */
        public abstract void mo19090k(Object obj, long j10, boolean z10);

        /* renamed from: l */
        public abstract void mo19091l(Object obj, long j10, byte b10);

        /* renamed from: m */
        public abstract void mo19092m(Object obj, long j10, double d10);

        /* renamed from: n */
        public abstract void mo19093n(Object obj, long j10, float f10);

        /* renamed from: o */
        public final void m19102o(Object obj, long j10, int i10) {
            this.f14614a.putInt(obj, j10, i10);
        }

        /* renamed from: p */
        public final void m19103p(Object obj, long j10, long j11) {
            this.f14614a.putLong(obj, j10, j11);
        }

        /* renamed from: q */
        public final void m19104q(Object obj, long j10, Object obj2) {
            this.f14614a.putObject(obj, j10, obj2);
        }

        /* renamed from: r */
        public boolean mo19095r() {
            Unsafe unsafe = this.f14614a;
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
                C6615r1.m19045G(th2);
                return false;
            }
        }

        /* renamed from: s */
        public boolean mo19094s() {
            Unsafe unsafe = this.f14614a;
            if (unsafe == null) {
                return false;
            }
            try {
                Class<?> cls = unsafe.getClass();
                cls.getMethod("objectFieldOffset", Field.class);
                cls.getMethod("getLong", Object.class, Long.TYPE);
                return C6615r1.m19060b() != null;
            } catch (Throwable th2) {
                C6615r1.m19045G(th2);
                return false;
            }
        }
    }

    static {
        long m19070l = m19070l(byte[].class);
        f14598h = m19070l;
        f14599i = m19070l(boolean[].class);
        f14600j = m19071m(boolean[].class);
        f14601k = m19070l(int[].class);
        f14602l = m19071m(int[].class);
        f14603m = m19070l(long[].class);
        f14604n = m19071m(long[].class);
        f14605o = m19070l(float[].class);
        f14606p = m19071m(float[].class);
        f14607q = m19070l(double[].class);
        f14608r = m19071m(double[].class);
        f14609s = m19070l(Object[].class);
        f14610t = m19071m(Object[].class);
        f14611u = m19075q(m19072n());
        f14612v = (int) (m19070l & 7);
        f14613w = ByteOrder.nativeOrder() == ByteOrder.BIG_ENDIAN;
    }

    private C6615r1() {
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: A */
    public static long m19039A(Object obj, long j10) {
        return f14595e.m19099h(obj, j10);
    }

    /* renamed from: B */
    private static e m19040B() {
        Unsafe unsafe = f14591a;
        if (unsafe == null) {
            return null;
        }
        if (!C6571d.m18422c()) {
            return new d(unsafe);
        }
        if (f14593c) {
            return new c(unsafe);
        }
        if (f14594d) {
            return new b(unsafe);
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: C */
    public static Object m19041C(Object obj, long j10) {
        return f14595e.m19100i(obj, j10);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: D */
    public static Unsafe m19042D() {
        try {
            return (Unsafe) AccessController.doPrivileged(new a());
        } catch (Throwable unused) {
            return null;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: E */
    public static boolean m19043E() {
        return f14597g;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: F */
    public static boolean m19044F() {
        return f14596f;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: G */
    public static void m19045G(Throwable th2) {
        Logger.getLogger(C6615r1.class.getName()).log(Level.WARNING, "platform method missing - proto runtime falling back to safer methods: " + th2);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: H */
    public static void m19046H(Object obj, long j10, boolean z10) {
        f14595e.mo19090k(obj, j10, z10);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: I */
    public static void m19047I(Object obj, long j10, boolean z10) {
        m19050L(obj, j10, z10 ? (byte) 1 : (byte) 0);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: J */
    public static void m19048J(Object obj, long j10, boolean z10) {
        m19051M(obj, j10, z10 ? (byte) 1 : (byte) 0);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: K */
    public static void m19049K(byte[] bArr, long j10, byte b10) {
        f14595e.mo19091l(bArr, f14598h + j10, b10);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: L */
    public static void m19050L(Object obj, long j10, byte b10) {
        long j11 = (-4) & j10;
        int m19084z = m19084z(obj, j11);
        int i10 = ((~((int) j10)) & 3) << 3;
        m19054P(obj, j11, ((255 & b10) << i10) | (m19084z & (~(255 << i10))));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: M */
    public static void m19051M(Object obj, long j10, byte b10) {
        long j11 = (-4) & j10;
        int i10 = (((int) j10) & 3) << 3;
        m19054P(obj, j11, ((255 & b10) << i10) | (m19084z(obj, j11) & (~(255 << i10))));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: N */
    public static void m19052N(Object obj, long j10, double d10) {
        f14595e.mo19092m(obj, j10, d10);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: O */
    public static void m19053O(Object obj, long j10, float f10) {
        f14595e.mo19093n(obj, j10, f10);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: P */
    public static void m19054P(Object obj, long j10, int i10) {
        f14595e.m19102o(obj, j10, i10);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: Q */
    public static void m19055Q(Object obj, long j10, long j11) {
        f14595e.m19103p(obj, j10, j11);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: R */
    public static void m19056R(Object obj, long j10, Object obj2) {
        f14595e.m19104q(obj, j10, obj2);
    }

    /* renamed from: S */
    private static boolean m19057S() {
        e eVar = f14595e;
        if (eVar == null) {
            return false;
        }
        return eVar.mo19095r();
    }

    /* renamed from: T */
    private static boolean m19058T() {
        e eVar = f14595e;
        if (eVar == null) {
            return false;
        }
        return eVar.mo19094s();
    }

    /* renamed from: b */
    static /* synthetic */ Field m19060b() {
        return m19072n();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: k */
    public static <T> T m19069k(Class<T> cls) {
        try {
            return (T) f14591a.allocateInstance(cls);
        } catch (InstantiationException e10) {
            throw new IllegalStateException(e10);
        }
    }

    /* renamed from: l */
    private static int m19070l(Class<?> cls) {
        if (f14597g) {
            return f14595e.m19096a(cls);
        }
        return -1;
    }

    /* renamed from: m */
    private static int m19071m(Class<?> cls) {
        if (f14597g) {
            return f14595e.m19097b(cls);
        }
        return -1;
    }

    /* renamed from: n */
    private static Field m19072n() {
        Field m19074p;
        if (C6571d.m18422c() && (m19074p = m19074p(Buffer.class, "effectiveDirectAddress")) != null) {
            return m19074p;
        }
        Field m19074p2 = m19074p(Buffer.class, "address");
        if (m19074p2 == null || m19074p2.getType() != Long.TYPE) {
            return null;
        }
        return m19074p2;
    }

    /* renamed from: o */
    static boolean m19073o(Class<?> cls) {
        if (!C6571d.m18422c()) {
            return false;
        }
        try {
            Class<?> cls2 = f14592b;
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
    private static Field m19074p(Class<?> cls, String str) {
        try {
            return cls.getDeclaredField(str);
        } catch (Throwable unused) {
            return null;
        }
    }

    /* renamed from: q */
    private static long m19075q(Field field) {
        e eVar;
        if (field == null || (eVar = f14595e) == null) {
            return -1L;
        }
        return eVar.m19101j(field);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: r */
    public static boolean m19076r(Object obj, long j10) {
        return f14595e.mo19086c(obj, j10);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: s */
    public static boolean m19077s(Object obj, long j10) {
        return m19080v(obj, j10) != 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: t */
    public static boolean m19078t(Object obj, long j10) {
        return m19081w(obj, j10) != 0;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: u */
    public static byte m19079u(byte[] bArr, long j10) {
        return f14595e.mo19087d(bArr, f14598h + j10);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: v */
    public static byte m19080v(Object obj, long j10) {
        return (byte) ((m19084z(obj, (-4) & j10) >>> ((int) (((~j10) & 3) << 3))) & 255);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: w */
    public static byte m19081w(Object obj, long j10) {
        return (byte) ((m19084z(obj, (-4) & j10) >>> ((int) ((j10 & 3) << 3))) & 255);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: x */
    public static double m19082x(Object obj, long j10) {
        return f14595e.mo19088e(obj, j10);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: y */
    public static float m19083y(Object obj, long j10) {
        return f14595e.mo19089f(obj, j10);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: z */
    public static int m19084z(Object obj, long j10) {
        return f14595e.m19098g(obj, j10);
    }
}

package androidx.datastore.preferences.protobuf;

import java.lang.reflect.Field;
import java.nio.Buffer;
import java.nio.ByteOrder;
import java.security.AccessController;
import java.security.PrivilegedExceptionAction;
import java.util.logging.Level;
import java.util.logging.Logger;
import sun.misc.Unsafe;

/* renamed from: androidx.datastore.preferences.protobuf.r1 */
/* loaded from: classes.dex */
final class C1199r1 {

    /* renamed from: a */
    private static final Logger f4961a = Logger.getLogger(C1199r1.class.getName());

    /* renamed from: b */
    private static final Unsafe f4962b = m6315B();

    /* renamed from: c */
    private static final Class<?> f4963c = C1155d.m5683b();

    /* renamed from: d */
    private static final boolean f4964d = m6343m(Long.TYPE);

    /* renamed from: e */
    private static final boolean f4965e = m6343m(Integer.TYPE);

    /* renamed from: f */
    private static final e f4966f = m6356z();

    /* renamed from: g */
    private static final boolean f4967g = m6330Q();

    /* renamed from: h */
    private static final boolean f4968h = m6329P();

    /* renamed from: i */
    static final long f4969i;

    /* renamed from: j */
    private static final long f4970j;

    /* renamed from: k */
    private static final long f4971k;

    /* renamed from: l */
    private static final long f4972l;

    /* renamed from: m */
    private static final long f4973m;

    /* renamed from: n */
    private static final long f4974n;

    /* renamed from: o */
    private static final long f4975o;

    /* renamed from: p */
    private static final long f4976p;

    /* renamed from: q */
    private static final long f4977q;

    /* renamed from: r */
    private static final long f4978r;

    /* renamed from: s */
    private static final long f4979s;

    /* renamed from: t */
    private static final long f4980t;

    /* renamed from: u */
    private static final long f4981u;

    /* renamed from: v */
    private static final long f4982v;

    /* renamed from: w */
    private static final int f4983w;

    /* renamed from: x */
    static final boolean f4984x;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: androidx.datastore.preferences.protobuf.r1$a */
    /* loaded from: classes.dex */
    public static class a implements PrivilegedExceptionAction<Unsafe> {
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
    /* renamed from: androidx.datastore.preferences.protobuf.r1$b */
    /* loaded from: classes.dex */
    public static final class b extends e {
        b(Unsafe unsafe) {
            super(unsafe);
        }

        @Override // androidx.datastore.preferences.protobuf.C1199r1.e
        /* renamed from: c */
        public boolean mo6358c(Object obj, long j10) {
            return C1199r1.f4984x ? C1199r1.m6347q(obj, j10) : C1199r1.m6348r(obj, j10);
        }

        @Override // androidx.datastore.preferences.protobuf.C1199r1.e
        /* renamed from: d */
        public byte mo6359d(Object obj, long j10) {
            return C1199r1.f4984x ? C1199r1.m6350t(obj, j10) : C1199r1.m6351u(obj, j10);
        }

        @Override // androidx.datastore.preferences.protobuf.C1199r1.e
        /* renamed from: e */
        public double mo6360e(Object obj, long j10) {
            return Double.longBitsToDouble(m6369h(obj, j10));
        }

        @Override // androidx.datastore.preferences.protobuf.C1199r1.e
        /* renamed from: f */
        public float mo6361f(Object obj, long j10) {
            return Float.intBitsToFloat(m6368g(obj, j10));
        }

        @Override // androidx.datastore.preferences.protobuf.C1199r1.e
        /* renamed from: k */
        public void mo6362k(Object obj, long j10, boolean z10) {
            if (C1199r1.f4984x) {
                C1199r1.m6319F(obj, j10, z10);
            } else {
                C1199r1.m6320G(obj, j10, z10);
            }
        }

        @Override // androidx.datastore.preferences.protobuf.C1199r1.e
        /* renamed from: l */
        public void mo6363l(Object obj, long j10, byte b10) {
            if (C1199r1.f4984x) {
                C1199r1.m6322I(obj, j10, b10);
            } else {
                C1199r1.m6323J(obj, j10, b10);
            }
        }

        @Override // androidx.datastore.preferences.protobuf.C1199r1.e
        /* renamed from: m */
        public void mo6364m(Object obj, long j10, double d10) {
            m6373p(obj, j10, Double.doubleToLongBits(d10));
        }

        @Override // androidx.datastore.preferences.protobuf.C1199r1.e
        /* renamed from: n */
        public void mo6365n(Object obj, long j10, float f10) {
            m6372o(obj, j10, Float.floatToIntBits(f10));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: androidx.datastore.preferences.protobuf.r1$c */
    /* loaded from: classes.dex */
    public static final class c extends e {
        c(Unsafe unsafe) {
            super(unsafe);
        }

        @Override // androidx.datastore.preferences.protobuf.C1199r1.e
        /* renamed from: c */
        public boolean mo6358c(Object obj, long j10) {
            return C1199r1.f4984x ? C1199r1.m6347q(obj, j10) : C1199r1.m6348r(obj, j10);
        }

        @Override // androidx.datastore.preferences.protobuf.C1199r1.e
        /* renamed from: d */
        public byte mo6359d(Object obj, long j10) {
            return C1199r1.f4984x ? C1199r1.m6350t(obj, j10) : C1199r1.m6351u(obj, j10);
        }

        @Override // androidx.datastore.preferences.protobuf.C1199r1.e
        /* renamed from: e */
        public double mo6360e(Object obj, long j10) {
            return Double.longBitsToDouble(m6369h(obj, j10));
        }

        @Override // androidx.datastore.preferences.protobuf.C1199r1.e
        /* renamed from: f */
        public float mo6361f(Object obj, long j10) {
            return Float.intBitsToFloat(m6368g(obj, j10));
        }

        @Override // androidx.datastore.preferences.protobuf.C1199r1.e
        /* renamed from: k */
        public void mo6362k(Object obj, long j10, boolean z10) {
            if (C1199r1.f4984x) {
                C1199r1.m6319F(obj, j10, z10);
            } else {
                C1199r1.m6320G(obj, j10, z10);
            }
        }

        @Override // androidx.datastore.preferences.protobuf.C1199r1.e
        /* renamed from: l */
        public void mo6363l(Object obj, long j10, byte b10) {
            if (C1199r1.f4984x) {
                C1199r1.m6322I(obj, j10, b10);
            } else {
                C1199r1.m6323J(obj, j10, b10);
            }
        }

        @Override // androidx.datastore.preferences.protobuf.C1199r1.e
        /* renamed from: m */
        public void mo6364m(Object obj, long j10, double d10) {
            m6373p(obj, j10, Double.doubleToLongBits(d10));
        }

        @Override // androidx.datastore.preferences.protobuf.C1199r1.e
        /* renamed from: n */
        public void mo6365n(Object obj, long j10, float f10) {
            m6372o(obj, j10, Float.floatToIntBits(f10));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: androidx.datastore.preferences.protobuf.r1$d */
    /* loaded from: classes.dex */
    public static final class d extends e {
        d(Unsafe unsafe) {
            super(unsafe);
        }

        @Override // androidx.datastore.preferences.protobuf.C1199r1.e
        /* renamed from: c */
        public boolean mo6358c(Object obj, long j10) {
            return this.f4985a.getBoolean(obj, j10);
        }

        @Override // androidx.datastore.preferences.protobuf.C1199r1.e
        /* renamed from: d */
        public byte mo6359d(Object obj, long j10) {
            return this.f4985a.getByte(obj, j10);
        }

        @Override // androidx.datastore.preferences.protobuf.C1199r1.e
        /* renamed from: e */
        public double mo6360e(Object obj, long j10) {
            return this.f4985a.getDouble(obj, j10);
        }

        @Override // androidx.datastore.preferences.protobuf.C1199r1.e
        /* renamed from: f */
        public float mo6361f(Object obj, long j10) {
            return this.f4985a.getFloat(obj, j10);
        }

        @Override // androidx.datastore.preferences.protobuf.C1199r1.e
        /* renamed from: k */
        public void mo6362k(Object obj, long j10, boolean z10) {
            this.f4985a.putBoolean(obj, j10, z10);
        }

        @Override // androidx.datastore.preferences.protobuf.C1199r1.e
        /* renamed from: l */
        public void mo6363l(Object obj, long j10, byte b10) {
            this.f4985a.putByte(obj, j10, b10);
        }

        @Override // androidx.datastore.preferences.protobuf.C1199r1.e
        /* renamed from: m */
        public void mo6364m(Object obj, long j10, double d10) {
            this.f4985a.putDouble(obj, j10, d10);
        }

        @Override // androidx.datastore.preferences.protobuf.C1199r1.e
        /* renamed from: n */
        public void mo6365n(Object obj, long j10, float f10) {
            this.f4985a.putFloat(obj, j10, f10);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: androidx.datastore.preferences.protobuf.r1$e */
    /* loaded from: classes.dex */
    public static abstract class e {

        /* renamed from: a */
        Unsafe f4985a;

        e(Unsafe unsafe) {
            this.f4985a = unsafe;
        }

        /* renamed from: a */
        public final int m6366a(Class<?> cls) {
            return this.f4985a.arrayBaseOffset(cls);
        }

        /* renamed from: b */
        public final int m6367b(Class<?> cls) {
            return this.f4985a.arrayIndexScale(cls);
        }

        /* renamed from: c */
        public abstract boolean mo6358c(Object obj, long j10);

        /* renamed from: d */
        public abstract byte mo6359d(Object obj, long j10);

        /* renamed from: e */
        public abstract double mo6360e(Object obj, long j10);

        /* renamed from: f */
        public abstract float mo6361f(Object obj, long j10);

        /* renamed from: g */
        public final int m6368g(Object obj, long j10) {
            return this.f4985a.getInt(obj, j10);
        }

        /* renamed from: h */
        public final long m6369h(Object obj, long j10) {
            return this.f4985a.getLong(obj, j10);
        }

        /* renamed from: i */
        public final Object m6370i(Object obj, long j10) {
            return this.f4985a.getObject(obj, j10);
        }

        /* renamed from: j */
        public final long m6371j(Field field) {
            return this.f4985a.objectFieldOffset(field);
        }

        /* renamed from: k */
        public abstract void mo6362k(Object obj, long j10, boolean z10);

        /* renamed from: l */
        public abstract void mo6363l(Object obj, long j10, byte b10);

        /* renamed from: m */
        public abstract void mo6364m(Object obj, long j10, double d10);

        /* renamed from: n */
        public abstract void mo6365n(Object obj, long j10, float f10);

        /* renamed from: o */
        public final void m6372o(Object obj, long j10, int i10) {
            this.f4985a.putInt(obj, j10, i10);
        }

        /* renamed from: p */
        public final void m6373p(Object obj, long j10, long j11) {
            this.f4985a.putLong(obj, j10, j11);
        }

        /* renamed from: q */
        public final void m6374q(Object obj, long j10, Object obj2) {
            this.f4985a.putObject(obj, j10, obj2);
        }
    }

    static {
        long m6340j = m6340j(byte[].class);
        f4969i = m6340j;
        f4970j = m6340j(boolean[].class);
        f4971k = m6341k(boolean[].class);
        f4972l = m6340j(int[].class);
        f4973m = m6341k(int[].class);
        f4974n = m6340j(long[].class);
        f4975o = m6341k(long[].class);
        f4976p = m6340j(float[].class);
        f4977q = m6341k(float[].class);
        f4978r = m6340j(double[].class);
        f4979s = m6341k(double[].class);
        f4980t = m6340j(Object[].class);
        f4981u = m6341k(Object[].class);
        f4982v = m6345o(m6342l());
        f4983w = (int) (m6340j & 7);
        f4984x = ByteOrder.nativeOrder() == ByteOrder.BIG_ENDIAN;
    }

    private C1199r1() {
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: A */
    public static Object m6314A(Object obj, long j10) {
        return f4966f.m6370i(obj, j10);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: B */
    public static Unsafe m6315B() {
        try {
            return (Unsafe) AccessController.doPrivileged(new a());
        } catch (Throwable unused) {
            return null;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: C */
    public static boolean m6316C() {
        return f4968h;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: D */
    public static boolean m6317D() {
        return f4967g;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: E */
    public static void m6318E(Object obj, long j10, boolean z10) {
        f4966f.mo6362k(obj, j10, z10);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: F */
    public static void m6319F(Object obj, long j10, boolean z10) {
        m6322I(obj, j10, z10 ? (byte) 1 : (byte) 0);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: G */
    public static void m6320G(Object obj, long j10, boolean z10) {
        m6323J(obj, j10, z10 ? (byte) 1 : (byte) 0);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: H */
    public static void m6321H(byte[] bArr, long j10, byte b10) {
        f4966f.mo6363l(bArr, f4969i + j10, b10);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: I */
    public static void m6322I(Object obj, long j10, byte b10) {
        long j11 = (-4) & j10;
        int m6354x = m6354x(obj, j11);
        int i10 = ((~((int) j10)) & 3) << 3;
        m6326M(obj, j11, ((255 & b10) << i10) | (m6354x & (~(255 << i10))));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: J */
    public static void m6323J(Object obj, long j10, byte b10) {
        long j11 = (-4) & j10;
        int i10 = (((int) j10) & 3) << 3;
        m6326M(obj, j11, ((255 & b10) << i10) | (m6354x(obj, j11) & (~(255 << i10))));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: K */
    public static void m6324K(Object obj, long j10, double d10) {
        f4966f.mo6364m(obj, j10, d10);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: L */
    public static void m6325L(Object obj, long j10, float f10) {
        f4966f.mo6365n(obj, j10, f10);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: M */
    public static void m6326M(Object obj, long j10, int i10) {
        f4966f.m6372o(obj, j10, i10);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: N */
    public static void m6327N(Object obj, long j10, long j11) {
        f4966f.m6373p(obj, j10, j11);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: O */
    public static void m6328O(Object obj, long j10, Object obj2) {
        f4966f.m6374q(obj, j10, obj2);
    }

    /* renamed from: P */
    private static boolean m6329P() {
        Unsafe unsafe = f4962b;
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
            if (C1155d.m5684c()) {
                return true;
            }
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
            f4961a.log(Level.WARNING, "platform method missing - proto runtime falling back to safer methods: " + th2);
            return false;
        }
    }

    /* renamed from: Q */
    private static boolean m6330Q() {
        Unsafe unsafe = f4962b;
        if (unsafe == null) {
            return false;
        }
        try {
            Class<?> cls = unsafe.getClass();
            cls.getMethod("objectFieldOffset", Field.class);
            Class<?> cls2 = Long.TYPE;
            cls.getMethod("getLong", Object.class, cls2);
            if (m6342l() == null) {
                return false;
            }
            if (C1155d.m5684c()) {
                return true;
            }
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
            f4961a.log(Level.WARNING, "platform method missing - proto runtime falling back to safer methods: " + th2);
            return false;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: i */
    public static <T> T m6339i(Class<T> cls) {
        try {
            return (T) f4962b.allocateInstance(cls);
        } catch (InstantiationException e10) {
            throw new IllegalStateException(e10);
        }
    }

    /* renamed from: j */
    private static int m6340j(Class<?> cls) {
        if (f4968h) {
            return f4966f.m6366a(cls);
        }
        return -1;
    }

    /* renamed from: k */
    private static int m6341k(Class<?> cls) {
        if (f4968h) {
            return f4966f.m6367b(cls);
        }
        return -1;
    }

    /* renamed from: l */
    private static Field m6342l() {
        Field m6344n;
        if (C1155d.m5684c() && (m6344n = m6344n(Buffer.class, "effectiveDirectAddress")) != null) {
            return m6344n;
        }
        Field m6344n2 = m6344n(Buffer.class, "address");
        if (m6344n2 == null || m6344n2.getType() != Long.TYPE) {
            return null;
        }
        return m6344n2;
    }

    /* renamed from: m */
    private static boolean m6343m(Class<?> cls) {
        if (!C1155d.m5684c()) {
            return false;
        }
        try {
            Class<?> cls2 = f4963c;
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

    /* renamed from: n */
    private static Field m6344n(Class<?> cls, String str) {
        try {
            return cls.getDeclaredField(str);
        } catch (Throwable unused) {
            return null;
        }
    }

    /* renamed from: o */
    private static long m6345o(Field field) {
        e eVar;
        if (field == null || (eVar = f4966f) == null) {
            return -1L;
        }
        return eVar.m6371j(field);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: p */
    public static boolean m6346p(Object obj, long j10) {
        return f4966f.mo6358c(obj, j10);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: q */
    public static boolean m6347q(Object obj, long j10) {
        return m6350t(obj, j10) != 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: r */
    public static boolean m6348r(Object obj, long j10) {
        return m6351u(obj, j10) != 0;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: s */
    public static byte m6349s(byte[] bArr, long j10) {
        return f4966f.mo6359d(bArr, f4969i + j10);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: t */
    public static byte m6350t(Object obj, long j10) {
        return (byte) ((m6354x(obj, (-4) & j10) >>> ((int) (((~j10) & 3) << 3))) & 255);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: u */
    public static byte m6351u(Object obj, long j10) {
        return (byte) ((m6354x(obj, (-4) & j10) >>> ((int) ((j10 & 3) << 3))) & 255);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: v */
    public static double m6352v(Object obj, long j10) {
        return f4966f.mo6360e(obj, j10);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: w */
    public static float m6353w(Object obj, long j10) {
        return f4966f.mo6361f(obj, j10);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: x */
    public static int m6354x(Object obj, long j10) {
        return f4966f.m6368g(obj, j10);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: y */
    public static long m6355y(Object obj, long j10) {
        return f4966f.m6369h(obj, j10);
    }

    /* renamed from: z */
    private static e m6356z() {
        Unsafe unsafe = f4962b;
        if (unsafe == null) {
            return null;
        }
        if (!C1155d.m5684c()) {
            return new d(unsafe);
        }
        if (f4964d) {
            return new c(unsafe);
        }
        if (f4965e) {
            return new b(unsafe);
        }
        return null;
    }
}

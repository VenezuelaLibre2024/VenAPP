package androidx.datastore.preferences.protobuf;

import java.lang.reflect.Field;
import java.nio.Buffer;
import java.nio.ByteOrder;
import java.security.AccessController;
import java.security.PrivilegedExceptionAction;
import java.util.logging.Level;
import java.util.logging.Logger;
import sun.misc.Unsafe;

/* loaded from: classes.dex */
final class r1 {

    /* renamed from: a, reason: collision with root package name */
    private static final Logger f4250a = Logger.getLogger(r1.class.getName());

    /* renamed from: b, reason: collision with root package name */
    private static final Unsafe f4251b = B();

    /* renamed from: c, reason: collision with root package name */
    private static final Class<?> f4252c = androidx.datastore.preferences.protobuf.d.b();

    /* renamed from: d, reason: collision with root package name */
    private static final boolean f4253d = m(Long.TYPE);

    /* renamed from: e, reason: collision with root package name */
    private static final boolean f4254e = m(Integer.TYPE);

    /* renamed from: f, reason: collision with root package name */
    private static final e f4255f = z();

    /* renamed from: g, reason: collision with root package name */
    private static final boolean f4256g = Q();

    /* renamed from: h, reason: collision with root package name */
    private static final boolean f4257h = P();

    /* renamed from: i, reason: collision with root package name */
    static final long f4258i;

    /* renamed from: j, reason: collision with root package name */
    private static final long f4259j;

    /* renamed from: k, reason: collision with root package name */
    private static final long f4260k;

    /* renamed from: l, reason: collision with root package name */
    private static final long f4261l;

    /* renamed from: m, reason: collision with root package name */
    private static final long f4262m;

    /* renamed from: n, reason: collision with root package name */
    private static final long f4263n;

    /* renamed from: o, reason: collision with root package name */
    private static final long f4264o;

    /* renamed from: p, reason: collision with root package name */
    private static final long f4265p;

    /* renamed from: q, reason: collision with root package name */
    private static final long f4266q;

    /* renamed from: r, reason: collision with root package name */
    private static final long f4267r;

    /* renamed from: s, reason: collision with root package name */
    private static final long f4268s;

    /* renamed from: t, reason: collision with root package name */
    private static final long f4269t;

    /* renamed from: u, reason: collision with root package name */
    private static final long f4270u;

    /* renamed from: v, reason: collision with root package name */
    private static final long f4271v;

    /* renamed from: w, reason: collision with root package name */
    private static final int f4272w;

    /* renamed from: x, reason: collision with root package name */
    static final boolean f4273x;

    /* JADX INFO: Access modifiers changed from: package-private */
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
    /* loaded from: classes.dex */
    public static final class b extends e {
        b(Unsafe unsafe) {
            super(unsafe);
        }

        @Override // androidx.datastore.preferences.protobuf.r1.e
        public boolean c(Object obj, long j10) {
            return r1.f4273x ? r1.q(obj, j10) : r1.r(obj, j10);
        }

        @Override // androidx.datastore.preferences.protobuf.r1.e
        public byte d(Object obj, long j10) {
            return r1.f4273x ? r1.t(obj, j10) : r1.u(obj, j10);
        }

        @Override // androidx.datastore.preferences.protobuf.r1.e
        public double e(Object obj, long j10) {
            return Double.longBitsToDouble(h(obj, j10));
        }

        @Override // androidx.datastore.preferences.protobuf.r1.e
        public float f(Object obj, long j10) {
            return Float.intBitsToFloat(g(obj, j10));
        }

        @Override // androidx.datastore.preferences.protobuf.r1.e
        public void k(Object obj, long j10, boolean z10) {
            if (r1.f4273x) {
                r1.F(obj, j10, z10);
            } else {
                r1.G(obj, j10, z10);
            }
        }

        @Override // androidx.datastore.preferences.protobuf.r1.e
        public void l(Object obj, long j10, byte b10) {
            if (r1.f4273x) {
                r1.I(obj, j10, b10);
            } else {
                r1.J(obj, j10, b10);
            }
        }

        @Override // androidx.datastore.preferences.protobuf.r1.e
        public void m(Object obj, long j10, double d10) {
            p(obj, j10, Double.doubleToLongBits(d10));
        }

        @Override // androidx.datastore.preferences.protobuf.r1.e
        public void n(Object obj, long j10, float f10) {
            o(obj, j10, Float.floatToIntBits(f10));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes.dex */
    public static final class c extends e {
        c(Unsafe unsafe) {
            super(unsafe);
        }

        @Override // androidx.datastore.preferences.protobuf.r1.e
        public boolean c(Object obj, long j10) {
            return r1.f4273x ? r1.q(obj, j10) : r1.r(obj, j10);
        }

        @Override // androidx.datastore.preferences.protobuf.r1.e
        public byte d(Object obj, long j10) {
            return r1.f4273x ? r1.t(obj, j10) : r1.u(obj, j10);
        }

        @Override // androidx.datastore.preferences.protobuf.r1.e
        public double e(Object obj, long j10) {
            return Double.longBitsToDouble(h(obj, j10));
        }

        @Override // androidx.datastore.preferences.protobuf.r1.e
        public float f(Object obj, long j10) {
            return Float.intBitsToFloat(g(obj, j10));
        }

        @Override // androidx.datastore.preferences.protobuf.r1.e
        public void k(Object obj, long j10, boolean z10) {
            if (r1.f4273x) {
                r1.F(obj, j10, z10);
            } else {
                r1.G(obj, j10, z10);
            }
        }

        @Override // androidx.datastore.preferences.protobuf.r1.e
        public void l(Object obj, long j10, byte b10) {
            if (r1.f4273x) {
                r1.I(obj, j10, b10);
            } else {
                r1.J(obj, j10, b10);
            }
        }

        @Override // androidx.datastore.preferences.protobuf.r1.e
        public void m(Object obj, long j10, double d10) {
            p(obj, j10, Double.doubleToLongBits(d10));
        }

        @Override // androidx.datastore.preferences.protobuf.r1.e
        public void n(Object obj, long j10, float f10) {
            o(obj, j10, Float.floatToIntBits(f10));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes.dex */
    public static final class d extends e {
        d(Unsafe unsafe) {
            super(unsafe);
        }

        @Override // androidx.datastore.preferences.protobuf.r1.e
        public boolean c(Object obj, long j10) {
            return this.f4274a.getBoolean(obj, j10);
        }

        @Override // androidx.datastore.preferences.protobuf.r1.e
        public byte d(Object obj, long j10) {
            return this.f4274a.getByte(obj, j10);
        }

        @Override // androidx.datastore.preferences.protobuf.r1.e
        public double e(Object obj, long j10) {
            return this.f4274a.getDouble(obj, j10);
        }

        @Override // androidx.datastore.preferences.protobuf.r1.e
        public float f(Object obj, long j10) {
            return this.f4274a.getFloat(obj, j10);
        }

        @Override // androidx.datastore.preferences.protobuf.r1.e
        public void k(Object obj, long j10, boolean z10) {
            this.f4274a.putBoolean(obj, j10, z10);
        }

        @Override // androidx.datastore.preferences.protobuf.r1.e
        public void l(Object obj, long j10, byte b10) {
            this.f4274a.putByte(obj, j10, b10);
        }

        @Override // androidx.datastore.preferences.protobuf.r1.e
        public void m(Object obj, long j10, double d10) {
            this.f4274a.putDouble(obj, j10, d10);
        }

        @Override // androidx.datastore.preferences.protobuf.r1.e
        public void n(Object obj, long j10, float f10) {
            this.f4274a.putFloat(obj, j10, f10);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes.dex */
    public static abstract class e {

        /* renamed from: a, reason: collision with root package name */
        Unsafe f4274a;

        e(Unsafe unsafe) {
            this.f4274a = unsafe;
        }

        public final int a(Class<?> cls) {
            return this.f4274a.arrayBaseOffset(cls);
        }

        public final int b(Class<?> cls) {
            return this.f4274a.arrayIndexScale(cls);
        }

        public abstract boolean c(Object obj, long j10);

        public abstract byte d(Object obj, long j10);

        public abstract double e(Object obj, long j10);

        public abstract float f(Object obj, long j10);

        public final int g(Object obj, long j10) {
            return this.f4274a.getInt(obj, j10);
        }

        public final long h(Object obj, long j10) {
            return this.f4274a.getLong(obj, j10);
        }

        public final Object i(Object obj, long j10) {
            return this.f4274a.getObject(obj, j10);
        }

        public final long j(Field field) {
            return this.f4274a.objectFieldOffset(field);
        }

        public abstract void k(Object obj, long j10, boolean z10);

        public abstract void l(Object obj, long j10, byte b10);

        public abstract void m(Object obj, long j10, double d10);

        public abstract void n(Object obj, long j10, float f10);

        public final void o(Object obj, long j10, int i10) {
            this.f4274a.putInt(obj, j10, i10);
        }

        public final void p(Object obj, long j10, long j11) {
            this.f4274a.putLong(obj, j10, j11);
        }

        public final void q(Object obj, long j10, Object obj2) {
            this.f4274a.putObject(obj, j10, obj2);
        }
    }

    static {
        long j10 = j(byte[].class);
        f4258i = j10;
        f4259j = j(boolean[].class);
        f4260k = k(boolean[].class);
        f4261l = j(int[].class);
        f4262m = k(int[].class);
        f4263n = j(long[].class);
        f4264o = k(long[].class);
        f4265p = j(float[].class);
        f4266q = k(float[].class);
        f4267r = j(double[].class);
        f4268s = k(double[].class);
        f4269t = j(Object[].class);
        f4270u = k(Object[].class);
        f4271v = o(l());
        f4272w = (int) (j10 & 7);
        f4273x = ByteOrder.nativeOrder() == ByteOrder.BIG_ENDIAN;
    }

    private r1() {
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static Object A(Object obj, long j10) {
        return f4255f.i(obj, j10);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static Unsafe B() {
        try {
            return (Unsafe) AccessController.doPrivileged(new a());
        } catch (Throwable unused) {
            return null;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static boolean C() {
        return f4257h;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static boolean D() {
        return f4256g;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static void E(Object obj, long j10, boolean z10) {
        f4255f.k(obj, j10, z10);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void F(Object obj, long j10, boolean z10) {
        I(obj, j10, z10 ? (byte) 1 : (byte) 0);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void G(Object obj, long j10, boolean z10) {
        J(obj, j10, z10 ? (byte) 1 : (byte) 0);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static void H(byte[] bArr, long j10, byte b10) {
        f4255f.l(bArr, f4258i + j10, b10);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void I(Object obj, long j10, byte b10) {
        long j11 = (-4) & j10;
        int x10 = x(obj, j11);
        int i10 = ((~((int) j10)) & 3) << 3;
        M(obj, j11, ((255 & b10) << i10) | (x10 & (~(255 << i10))));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void J(Object obj, long j10, byte b10) {
        long j11 = (-4) & j10;
        int i10 = (((int) j10) & 3) << 3;
        M(obj, j11, ((255 & b10) << i10) | (x(obj, j11) & (~(255 << i10))));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static void K(Object obj, long j10, double d10) {
        f4255f.m(obj, j10, d10);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static void L(Object obj, long j10, float f10) {
        f4255f.n(obj, j10, f10);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static void M(Object obj, long j10, int i10) {
        f4255f.o(obj, j10, i10);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static void N(Object obj, long j10, long j11) {
        f4255f.p(obj, j10, j11);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static void O(Object obj, long j10, Object obj2) {
        f4255f.q(obj, j10, obj2);
    }

    private static boolean P() {
        Unsafe unsafe = f4251b;
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
            if (androidx.datastore.preferences.protobuf.d.c()) {
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
            f4250a.log(Level.WARNING, "platform method missing - proto runtime falling back to safer methods: " + th2);
            return false;
        }
    }

    private static boolean Q() {
        Unsafe unsafe = f4251b;
        if (unsafe == null) {
            return false;
        }
        try {
            Class<?> cls = unsafe.getClass();
            cls.getMethod("objectFieldOffset", Field.class);
            Class<?> cls2 = Long.TYPE;
            cls.getMethod("getLong", Object.class, cls2);
            if (l() == null) {
                return false;
            }
            if (androidx.datastore.preferences.protobuf.d.c()) {
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
            f4250a.log(Level.WARNING, "platform method missing - proto runtime falling back to safer methods: " + th2);
            return false;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static <T> T i(Class<T> cls) {
        try {
            return (T) f4251b.allocateInstance(cls);
        } catch (InstantiationException e10) {
            throw new IllegalStateException(e10);
        }
    }

    private static int j(Class<?> cls) {
        if (f4257h) {
            return f4255f.a(cls);
        }
        return -1;
    }

    private static int k(Class<?> cls) {
        if (f4257h) {
            return f4255f.b(cls);
        }
        return -1;
    }

    private static Field l() {
        Field n10;
        if (androidx.datastore.preferences.protobuf.d.c() && (n10 = n(Buffer.class, "effectiveDirectAddress")) != null) {
            return n10;
        }
        Field n11 = n(Buffer.class, "address");
        if (n11 == null || n11.getType() != Long.TYPE) {
            return null;
        }
        return n11;
    }

    private static boolean m(Class<?> cls) {
        if (!androidx.datastore.preferences.protobuf.d.c()) {
            return false;
        }
        try {
            Class<?> cls2 = f4252c;
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

    private static Field n(Class<?> cls, String str) {
        try {
            return cls.getDeclaredField(str);
        } catch (Throwable unused) {
            return null;
        }
    }

    private static long o(Field field) {
        e eVar;
        if (field == null || (eVar = f4255f) == null) {
            return -1L;
        }
        return eVar.j(field);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static boolean p(Object obj, long j10) {
        return f4255f.c(obj, j10);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static boolean q(Object obj, long j10) {
        return t(obj, j10) != 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static boolean r(Object obj, long j10) {
        return u(obj, j10) != 0;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static byte s(byte[] bArr, long j10) {
        return f4255f.d(bArr, f4258i + j10);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static byte t(Object obj, long j10) {
        return (byte) ((x(obj, (-4) & j10) >>> ((int) (((~j10) & 3) << 3))) & 255);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static byte u(Object obj, long j10) {
        return (byte) ((x(obj, (-4) & j10) >>> ((int) ((j10 & 3) << 3))) & 255);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static double v(Object obj, long j10) {
        return f4255f.e(obj, j10);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static float w(Object obj, long j10) {
        return f4255f.f(obj, j10);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static int x(Object obj, long j10) {
        return f4255f.g(obj, j10);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static long y(Object obj, long j10) {
        return f4255f.h(obj, j10);
    }

    private static e z() {
        Unsafe unsafe = f4251b;
        if (unsafe == null) {
            return null;
        }
        if (!androidx.datastore.preferences.protobuf.d.c()) {
            return new d(unsafe);
        }
        if (f4253d) {
            return new c(unsafe);
        }
        if (f4254e) {
            return new b(unsafe);
        }
        return null;
    }
}

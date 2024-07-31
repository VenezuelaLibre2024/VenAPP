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
/* loaded from: classes2.dex */
public final class r1 {

    /* renamed from: a, reason: collision with root package name */
    private static final Unsafe f11493a = D();

    /* renamed from: b, reason: collision with root package name */
    private static final Class<?> f11494b = com.google.crypto.tink.shaded.protobuf.d.b();

    /* renamed from: c, reason: collision with root package name */
    private static final boolean f11495c = o(Long.TYPE);

    /* renamed from: d, reason: collision with root package name */
    private static final boolean f11496d = o(Integer.TYPE);

    /* renamed from: e, reason: collision with root package name */
    private static final e f11497e = B();

    /* renamed from: f, reason: collision with root package name */
    private static final boolean f11498f = T();

    /* renamed from: g, reason: collision with root package name */
    private static final boolean f11499g = S();

    /* renamed from: h, reason: collision with root package name */
    static final long f11500h;

    /* renamed from: i, reason: collision with root package name */
    private static final long f11501i;

    /* renamed from: j, reason: collision with root package name */
    private static final long f11502j;

    /* renamed from: k, reason: collision with root package name */
    private static final long f11503k;

    /* renamed from: l, reason: collision with root package name */
    private static final long f11504l;

    /* renamed from: m, reason: collision with root package name */
    private static final long f11505m;

    /* renamed from: n, reason: collision with root package name */
    private static final long f11506n;

    /* renamed from: o, reason: collision with root package name */
    private static final long f11507o;

    /* renamed from: p, reason: collision with root package name */
    private static final long f11508p;

    /* renamed from: q, reason: collision with root package name */
    private static final long f11509q;

    /* renamed from: r, reason: collision with root package name */
    private static final long f11510r;

    /* renamed from: s, reason: collision with root package name */
    private static final long f11511s;

    /* renamed from: t, reason: collision with root package name */
    private static final long f11512t;

    /* renamed from: u, reason: collision with root package name */
    private static final long f11513u;

    /* renamed from: v, reason: collision with root package name */
    private static final int f11514v;

    /* renamed from: w, reason: collision with root package name */
    static final boolean f11515w;

    /* JADX INFO: Access modifiers changed from: package-private */
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
    /* loaded from: classes2.dex */
    public static final class b extends e {
        b(Unsafe unsafe) {
            super(unsafe);
        }

        @Override // com.google.crypto.tink.shaded.protobuf.r1.e
        public boolean c(Object obj, long j10) {
            return r1.f11515w ? r1.s(obj, j10) : r1.t(obj, j10);
        }

        @Override // com.google.crypto.tink.shaded.protobuf.r1.e
        public byte d(Object obj, long j10) {
            return r1.f11515w ? r1.v(obj, j10) : r1.w(obj, j10);
        }

        @Override // com.google.crypto.tink.shaded.protobuf.r1.e
        public double e(Object obj, long j10) {
            return Double.longBitsToDouble(h(obj, j10));
        }

        @Override // com.google.crypto.tink.shaded.protobuf.r1.e
        public float f(Object obj, long j10) {
            return Float.intBitsToFloat(g(obj, j10));
        }

        @Override // com.google.crypto.tink.shaded.protobuf.r1.e
        public void k(Object obj, long j10, boolean z10) {
            if (r1.f11515w) {
                r1.I(obj, j10, z10);
            } else {
                r1.J(obj, j10, z10);
            }
        }

        @Override // com.google.crypto.tink.shaded.protobuf.r1.e
        public void l(Object obj, long j10, byte b10) {
            if (r1.f11515w) {
                r1.L(obj, j10, b10);
            } else {
                r1.M(obj, j10, b10);
            }
        }

        @Override // com.google.crypto.tink.shaded.protobuf.r1.e
        public void m(Object obj, long j10, double d10) {
            p(obj, j10, Double.doubleToLongBits(d10));
        }

        @Override // com.google.crypto.tink.shaded.protobuf.r1.e
        public void n(Object obj, long j10, float f10) {
            o(obj, j10, Float.floatToIntBits(f10));
        }

        @Override // com.google.crypto.tink.shaded.protobuf.r1.e
        public boolean s() {
            return false;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes2.dex */
    public static final class c extends e {
        c(Unsafe unsafe) {
            super(unsafe);
        }

        @Override // com.google.crypto.tink.shaded.protobuf.r1.e
        public boolean c(Object obj, long j10) {
            return r1.f11515w ? r1.s(obj, j10) : r1.t(obj, j10);
        }

        @Override // com.google.crypto.tink.shaded.protobuf.r1.e
        public byte d(Object obj, long j10) {
            return r1.f11515w ? r1.v(obj, j10) : r1.w(obj, j10);
        }

        @Override // com.google.crypto.tink.shaded.protobuf.r1.e
        public double e(Object obj, long j10) {
            return Double.longBitsToDouble(h(obj, j10));
        }

        @Override // com.google.crypto.tink.shaded.protobuf.r1.e
        public float f(Object obj, long j10) {
            return Float.intBitsToFloat(g(obj, j10));
        }

        @Override // com.google.crypto.tink.shaded.protobuf.r1.e
        public void k(Object obj, long j10, boolean z10) {
            if (r1.f11515w) {
                r1.I(obj, j10, z10);
            } else {
                r1.J(obj, j10, z10);
            }
        }

        @Override // com.google.crypto.tink.shaded.protobuf.r1.e
        public void l(Object obj, long j10, byte b10) {
            if (r1.f11515w) {
                r1.L(obj, j10, b10);
            } else {
                r1.M(obj, j10, b10);
            }
        }

        @Override // com.google.crypto.tink.shaded.protobuf.r1.e
        public void m(Object obj, long j10, double d10) {
            p(obj, j10, Double.doubleToLongBits(d10));
        }

        @Override // com.google.crypto.tink.shaded.protobuf.r1.e
        public void n(Object obj, long j10, float f10) {
            o(obj, j10, Float.floatToIntBits(f10));
        }

        @Override // com.google.crypto.tink.shaded.protobuf.r1.e
        public boolean s() {
            return false;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes2.dex */
    public static final class d extends e {
        d(Unsafe unsafe) {
            super(unsafe);
        }

        @Override // com.google.crypto.tink.shaded.protobuf.r1.e
        public boolean c(Object obj, long j10) {
            return this.f11516a.getBoolean(obj, j10);
        }

        @Override // com.google.crypto.tink.shaded.protobuf.r1.e
        public byte d(Object obj, long j10) {
            return this.f11516a.getByte(obj, j10);
        }

        @Override // com.google.crypto.tink.shaded.protobuf.r1.e
        public double e(Object obj, long j10) {
            return this.f11516a.getDouble(obj, j10);
        }

        @Override // com.google.crypto.tink.shaded.protobuf.r1.e
        public float f(Object obj, long j10) {
            return this.f11516a.getFloat(obj, j10);
        }

        @Override // com.google.crypto.tink.shaded.protobuf.r1.e
        public void k(Object obj, long j10, boolean z10) {
            this.f11516a.putBoolean(obj, j10, z10);
        }

        @Override // com.google.crypto.tink.shaded.protobuf.r1.e
        public void l(Object obj, long j10, byte b10) {
            this.f11516a.putByte(obj, j10, b10);
        }

        @Override // com.google.crypto.tink.shaded.protobuf.r1.e
        public void m(Object obj, long j10, double d10) {
            this.f11516a.putDouble(obj, j10, d10);
        }

        @Override // com.google.crypto.tink.shaded.protobuf.r1.e
        public void n(Object obj, long j10, float f10) {
            this.f11516a.putFloat(obj, j10, f10);
        }

        @Override // com.google.crypto.tink.shaded.protobuf.r1.e
        public boolean r() {
            if (!super.r()) {
                return false;
            }
            try {
                Class<?> cls = this.f11516a.getClass();
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
                r1.G(th2);
                return false;
            }
        }

        @Override // com.google.crypto.tink.shaded.protobuf.r1.e
        public boolean s() {
            if (!super.s()) {
                return false;
            }
            try {
                Class<?> cls = this.f11516a.getClass();
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
                r1.G(th2);
                return false;
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes2.dex */
    public static abstract class e {

        /* renamed from: a, reason: collision with root package name */
        Unsafe f11516a;

        e(Unsafe unsafe) {
            this.f11516a = unsafe;
        }

        public final int a(Class<?> cls) {
            return this.f11516a.arrayBaseOffset(cls);
        }

        public final int b(Class<?> cls) {
            return this.f11516a.arrayIndexScale(cls);
        }

        public abstract boolean c(Object obj, long j10);

        public abstract byte d(Object obj, long j10);

        public abstract double e(Object obj, long j10);

        public abstract float f(Object obj, long j10);

        public final int g(Object obj, long j10) {
            return this.f11516a.getInt(obj, j10);
        }

        public final long h(Object obj, long j10) {
            return this.f11516a.getLong(obj, j10);
        }

        public final Object i(Object obj, long j10) {
            return this.f11516a.getObject(obj, j10);
        }

        public final long j(Field field) {
            return this.f11516a.objectFieldOffset(field);
        }

        public abstract void k(Object obj, long j10, boolean z10);

        public abstract void l(Object obj, long j10, byte b10);

        public abstract void m(Object obj, long j10, double d10);

        public abstract void n(Object obj, long j10, float f10);

        public final void o(Object obj, long j10, int i10) {
            this.f11516a.putInt(obj, j10, i10);
        }

        public final void p(Object obj, long j10, long j11) {
            this.f11516a.putLong(obj, j10, j11);
        }

        public final void q(Object obj, long j10, Object obj2) {
            this.f11516a.putObject(obj, j10, obj2);
        }

        public boolean r() {
            Unsafe unsafe = this.f11516a;
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
                r1.G(th2);
                return false;
            }
        }

        public boolean s() {
            Unsafe unsafe = this.f11516a;
            if (unsafe == null) {
                return false;
            }
            try {
                Class<?> cls = unsafe.getClass();
                cls.getMethod("objectFieldOffset", Field.class);
                cls.getMethod("getLong", Object.class, Long.TYPE);
                return r1.b() != null;
            } catch (Throwable th2) {
                r1.G(th2);
                return false;
            }
        }
    }

    static {
        long l10 = l(byte[].class);
        f11500h = l10;
        f11501i = l(boolean[].class);
        f11502j = m(boolean[].class);
        f11503k = l(int[].class);
        f11504l = m(int[].class);
        f11505m = l(long[].class);
        f11506n = m(long[].class);
        f11507o = l(float[].class);
        f11508p = m(float[].class);
        f11509q = l(double[].class);
        f11510r = m(double[].class);
        f11511s = l(Object[].class);
        f11512t = m(Object[].class);
        f11513u = q(n());
        f11514v = (int) (l10 & 7);
        f11515w = ByteOrder.nativeOrder() == ByteOrder.BIG_ENDIAN;
    }

    private r1() {
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static long A(Object obj, long j10) {
        return f11497e.h(obj, j10);
    }

    private static e B() {
        Unsafe unsafe = f11493a;
        if (unsafe == null) {
            return null;
        }
        if (!com.google.crypto.tink.shaded.protobuf.d.c()) {
            return new d(unsafe);
        }
        if (f11495c) {
            return new c(unsafe);
        }
        if (f11496d) {
            return new b(unsafe);
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static Object C(Object obj, long j10) {
        return f11497e.i(obj, j10);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static Unsafe D() {
        try {
            return (Unsafe) AccessController.doPrivileged(new a());
        } catch (Throwable unused) {
            return null;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static boolean E() {
        return f11499g;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static boolean F() {
        return f11498f;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void G(Throwable th2) {
        Logger.getLogger(r1.class.getName()).log(Level.WARNING, "platform method missing - proto runtime falling back to safer methods: " + th2);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static void H(Object obj, long j10, boolean z10) {
        f11497e.k(obj, j10, z10);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void I(Object obj, long j10, boolean z10) {
        L(obj, j10, z10 ? (byte) 1 : (byte) 0);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void J(Object obj, long j10, boolean z10) {
        M(obj, j10, z10 ? (byte) 1 : (byte) 0);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static void K(byte[] bArr, long j10, byte b10) {
        f11497e.l(bArr, f11500h + j10, b10);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void L(Object obj, long j10, byte b10) {
        long j11 = (-4) & j10;
        int z10 = z(obj, j11);
        int i10 = ((~((int) j10)) & 3) << 3;
        P(obj, j11, ((255 & b10) << i10) | (z10 & (~(255 << i10))));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void M(Object obj, long j10, byte b10) {
        long j11 = (-4) & j10;
        int i10 = (((int) j10) & 3) << 3;
        P(obj, j11, ((255 & b10) << i10) | (z(obj, j11) & (~(255 << i10))));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static void N(Object obj, long j10, double d10) {
        f11497e.m(obj, j10, d10);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static void O(Object obj, long j10, float f10) {
        f11497e.n(obj, j10, f10);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static void P(Object obj, long j10, int i10) {
        f11497e.o(obj, j10, i10);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static void Q(Object obj, long j10, long j11) {
        f11497e.p(obj, j10, j11);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static void R(Object obj, long j10, Object obj2) {
        f11497e.q(obj, j10, obj2);
    }

    private static boolean S() {
        e eVar = f11497e;
        if (eVar == null) {
            return false;
        }
        return eVar.r();
    }

    private static boolean T() {
        e eVar = f11497e;
        if (eVar == null) {
            return false;
        }
        return eVar.s();
    }

    static /* synthetic */ Field b() {
        return n();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static <T> T k(Class<T> cls) {
        try {
            return (T) f11493a.allocateInstance(cls);
        } catch (InstantiationException e10) {
            throw new IllegalStateException(e10);
        }
    }

    private static int l(Class<?> cls) {
        if (f11499g) {
            return f11497e.a(cls);
        }
        return -1;
    }

    private static int m(Class<?> cls) {
        if (f11499g) {
            return f11497e.b(cls);
        }
        return -1;
    }

    private static Field n() {
        Field p10;
        if (com.google.crypto.tink.shaded.protobuf.d.c() && (p10 = p(Buffer.class, "effectiveDirectAddress")) != null) {
            return p10;
        }
        Field p11 = p(Buffer.class, "address");
        if (p11 == null || p11.getType() != Long.TYPE) {
            return null;
        }
        return p11;
    }

    static boolean o(Class<?> cls) {
        if (!com.google.crypto.tink.shaded.protobuf.d.c()) {
            return false;
        }
        try {
            Class<?> cls2 = f11494b;
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

    private static Field p(Class<?> cls, String str) {
        try {
            return cls.getDeclaredField(str);
        } catch (Throwable unused) {
            return null;
        }
    }

    private static long q(Field field) {
        e eVar;
        if (field == null || (eVar = f11497e) == null) {
            return -1L;
        }
        return eVar.j(field);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static boolean r(Object obj, long j10) {
        return f11497e.c(obj, j10);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static boolean s(Object obj, long j10) {
        return v(obj, j10) != 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static boolean t(Object obj, long j10) {
        return w(obj, j10) != 0;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static byte u(byte[] bArr, long j10) {
        return f11497e.d(bArr, f11500h + j10);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static byte v(Object obj, long j10) {
        return (byte) ((z(obj, (-4) & j10) >>> ((int) (((~j10) & 3) << 3))) & 255);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static byte w(Object obj, long j10) {
        return (byte) ((z(obj, (-4) & j10) >>> ((int) ((j10 & 3) << 3))) & 255);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static double x(Object obj, long j10) {
        return f11497e.e(obj, j10);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static float y(Object obj, long j10) {
        return f11497e.f(obj, j10);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static int z(Object obj, long j10) {
        return f11497e.g(obj, j10);
    }
}

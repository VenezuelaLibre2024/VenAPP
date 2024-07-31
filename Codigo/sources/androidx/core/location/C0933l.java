package androidx.core.location;

import android.location.LocationRequest;
import android.os.Build;
import androidx.core.util.C0984h;
import com.google.android.gms.common.api.C5101a;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/* renamed from: androidx.core.location.l */
/* loaded from: classes.dex */
public final class C0933l {

    /* renamed from: a */
    final int f4437a;

    /* renamed from: b */
    final long f4438b;

    /* renamed from: c */
    final long f4439c;

    /* renamed from: d */
    final long f4440d;

    /* renamed from: e */
    final int f4441e;

    /* renamed from: f */
    final float f4442f;

    /* renamed from: g */
    final long f4443g;

    /* renamed from: androidx.core.location.l$a */
    /* loaded from: classes.dex */
    private static class a {

        /* renamed from: a */
        private static Class<?> f4444a;

        /* renamed from: b */
        private static Method f4445b;

        /* renamed from: c */
        private static Method f4446c;

        /* renamed from: d */
        private static Method f4447d;

        /* renamed from: e */
        private static Method f4448e;

        /* renamed from: f */
        private static Method f4449f;

        /* renamed from: a */
        public static Object m4681a(C0933l c0933l, String str) {
            try {
                if (f4444a == null) {
                    f4444a = Class.forName("android.location.LocationRequest");
                }
                if (f4445b == null) {
                    Method declaredMethod = f4444a.getDeclaredMethod("createFromDeprecatedProvider", String.class, Long.TYPE, Float.TYPE, Boolean.TYPE);
                    f4445b = declaredMethod;
                    declaredMethod.setAccessible(true);
                }
                Object invoke = f4445b.invoke(null, str, Long.valueOf(c0933l.m4673b()), Float.valueOf(c0933l.m4676e()), Boolean.FALSE);
                if (invoke == null) {
                    return null;
                }
                if (f4446c == null) {
                    Method declaredMethod2 = f4444a.getDeclaredMethod("setQuality", Integer.TYPE);
                    f4446c = declaredMethod2;
                    declaredMethod2.setAccessible(true);
                }
                f4446c.invoke(invoke, Integer.valueOf(c0933l.m4678g()));
                if (f4447d == null) {
                    Method declaredMethod3 = f4444a.getDeclaredMethod("setFastestInterval", Long.TYPE);
                    f4447d = declaredMethod3;
                    declaredMethod3.setAccessible(true);
                }
                f4447d.invoke(invoke, Long.valueOf(c0933l.m4677f()));
                if (c0933l.m4675d() < Integer.MAX_VALUE) {
                    if (f4448e == null) {
                        Method declaredMethod4 = f4444a.getDeclaredMethod("setNumUpdates", Integer.TYPE);
                        f4448e = declaredMethod4;
                        declaredMethod4.setAccessible(true);
                    }
                    f4448e.invoke(invoke, Integer.valueOf(c0933l.m4675d()));
                }
                if (c0933l.m4672a() < Long.MAX_VALUE) {
                    if (f4449f == null) {
                        Method declaredMethod5 = f4444a.getDeclaredMethod("setExpireIn", Long.TYPE);
                        f4449f = declaredMethod5;
                        declaredMethod5.setAccessible(true);
                    }
                    f4449f.invoke(invoke, Long.valueOf(c0933l.m4672a()));
                }
                return invoke;
            } catch (ClassNotFoundException | IllegalAccessException | NoSuchMethodException | InvocationTargetException unused) {
                return null;
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: androidx.core.location.l$b */
    /* loaded from: classes.dex */
    public static class b {
        /* renamed from: a */
        public static LocationRequest m4682a(C0933l c0933l) {
            LocationRequest.Builder quality;
            LocationRequest.Builder minUpdateIntervalMillis;
            LocationRequest.Builder durationMillis;
            LocationRequest.Builder maxUpdates;
            LocationRequest.Builder minUpdateDistanceMeters;
            LocationRequest.Builder maxUpdateDelayMillis;
            LocationRequest build;
            quality = new LocationRequest.Builder(c0933l.m4673b()).setQuality(c0933l.m4678g());
            minUpdateIntervalMillis = quality.setMinUpdateIntervalMillis(c0933l.m4677f());
            durationMillis = minUpdateIntervalMillis.setDurationMillis(c0933l.m4672a());
            maxUpdates = durationMillis.setMaxUpdates(c0933l.m4675d());
            minUpdateDistanceMeters = maxUpdates.setMinUpdateDistanceMeters(c0933l.m4676e());
            maxUpdateDelayMillis = minUpdateDistanceMeters.setMaxUpdateDelayMillis(c0933l.m4674c());
            build = maxUpdateDelayMillis.build();
            return build;
        }
    }

    /* renamed from: androidx.core.location.l$c */
    /* loaded from: classes.dex */
    public static final class c {

        /* renamed from: a */
        private long f4450a;

        /* renamed from: b */
        private int f4451b;

        /* renamed from: c */
        private long f4452c;

        /* renamed from: d */
        private int f4453d;

        /* renamed from: e */
        private long f4454e;

        /* renamed from: f */
        private float f4455f;

        /* renamed from: g */
        private long f4456g;

        public c(long j10) {
            m4684b(j10);
            this.f4451b = 102;
            this.f4452c = Long.MAX_VALUE;
            this.f4453d = C5101a.e.API_PRIORITY_OTHER;
            this.f4454e = -1L;
            this.f4455f = 0.0f;
            this.f4456g = 0L;
        }

        /* renamed from: a */
        public C0933l m4683a() {
            C0984h.m4836n((this.f4450a == Long.MAX_VALUE && this.f4454e == -1) ? false : true, "passive location requests must have an explicit minimum update interval");
            long j10 = this.f4450a;
            return new C0933l(j10, this.f4451b, this.f4452c, this.f4453d, Math.min(this.f4454e, j10), this.f4455f, this.f4456g);
        }

        /* renamed from: b */
        public c m4684b(long j10) {
            this.f4450a = C0984h.m4829g(j10, 0L, Long.MAX_VALUE, "intervalMillis");
            return this;
        }

        /* renamed from: c */
        public c m4685c(float f10) {
            this.f4455f = f10;
            this.f4455f = C0984h.m4827e(f10, 0.0f, Float.MAX_VALUE, "minUpdateDistanceMeters");
            return this;
        }

        /* renamed from: d */
        public c m4686d(long j10) {
            this.f4454e = C0984h.m4829g(j10, 0L, Long.MAX_VALUE, "minUpdateIntervalMillis");
            return this;
        }

        /* renamed from: e */
        public c m4687e(int i10) {
            C0984h.m4825c(i10 == 104 || i10 == 102 || i10 == 100, "quality must be a defined QUALITY constant, not %d", Integer.valueOf(i10));
            this.f4451b = i10;
            return this;
        }
    }

    C0933l(long j10, int i10, long j11, int i11, long j12, float f10, long j13) {
        this.f4438b = j10;
        this.f4437a = i10;
        this.f4439c = j12;
        this.f4440d = j11;
        this.f4441e = i11;
        this.f4442f = f10;
        this.f4443g = j13;
    }

    /* renamed from: a */
    public long m4672a() {
        return this.f4440d;
    }

    /* renamed from: b */
    public long m4673b() {
        return this.f4438b;
    }

    /* renamed from: c */
    public long m4674c() {
        return this.f4443g;
    }

    /* renamed from: d */
    public int m4675d() {
        return this.f4441e;
    }

    /* renamed from: e */
    public float m4676e() {
        return this.f4442f;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C0933l)) {
            return false;
        }
        C0933l c0933l = (C0933l) obj;
        return this.f4437a == c0933l.f4437a && this.f4438b == c0933l.f4438b && this.f4439c == c0933l.f4439c && this.f4440d == c0933l.f4440d && this.f4441e == c0933l.f4441e && Float.compare(c0933l.f4442f, this.f4442f) == 0 && this.f4443g == c0933l.f4443g;
    }

    /* renamed from: f */
    public long m4677f() {
        long j10 = this.f4439c;
        return j10 == -1 ? this.f4438b : j10;
    }

    /* renamed from: g */
    public int m4678g() {
        return this.f4437a;
    }

    /* renamed from: h */
    public LocationRequest m4679h() {
        return b.m4682a(this);
    }

    public int hashCode() {
        int i10 = this.f4437a * 31;
        long j10 = this.f4438b;
        int i11 = (i10 + ((int) (j10 ^ (j10 >>> 32)))) * 31;
        long j11 = this.f4439c;
        return i11 + ((int) (j11 ^ (j11 >>> 32)));
    }

    /* renamed from: i */
    public LocationRequest m4680i(String str) {
        return Build.VERSION.SDK_INT >= 31 ? m4679h() : (LocationRequest) a.m4681a(this, str);
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0042  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0053  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x007e  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0093  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public java.lang.String toString() {
        /*
            r5 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "Request["
            r0.append(r1)
            long r1 = r5.f4438b
            r3 = 9223372036854775807(0x7fffffffffffffff, double:NaN)
            int r1 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r1 == 0) goto L37
            java.lang.String r1 = "@"
            r0.append(r1)
            long r1 = r5.f4438b
            androidx.core.util.C0986j.m4843e(r1, r0)
            int r1 = r5.f4437a
            r2 = 100
            if (r1 == r2) goto L34
            r2 = 102(0x66, float:1.43E-43)
            if (r1 == r2) goto L31
            r2 = 104(0x68, float:1.46E-43)
            if (r1 == r2) goto L2e
            goto L3c
        L2e:
            java.lang.String r1 = " LOW_POWER"
            goto L39
        L31:
            java.lang.String r1 = " BALANCED"
            goto L39
        L34:
            java.lang.String r1 = " HIGH_ACCURACY"
            goto L39
        L37:
            java.lang.String r1 = "PASSIVE"
        L39:
            r0.append(r1)
        L3c:
            long r1 = r5.f4440d
            int r1 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r1 == 0) goto L4c
            java.lang.String r1 = ", duration="
            r0.append(r1)
            long r1 = r5.f4440d
            androidx.core.util.C0986j.m4843e(r1, r0)
        L4c:
            int r1 = r5.f4441e
            r2 = 2147483647(0x7fffffff, float:NaN)
            if (r1 == r2) goto L5d
            java.lang.String r1 = ", maxUpdates="
            r0.append(r1)
            int r1 = r5.f4441e
            r0.append(r1)
        L5d:
            long r1 = r5.f4439c
            r3 = -1
            int r3 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r3 == 0) goto L75
            long r3 = r5.f4438b
            int r1 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r1 >= 0) goto L75
            java.lang.String r1 = ", minUpdateInterval="
            r0.append(r1)
            long r1 = r5.f4439c
            androidx.core.util.C0986j.m4843e(r1, r0)
        L75:
            float r1 = r5.f4442f
            double r1 = (double) r1
            r3 = 0
            int r1 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r1 <= 0) goto L88
            java.lang.String r1 = ", minUpdateDistance="
            r0.append(r1)
            float r1 = r5.f4442f
            r0.append(r1)
        L88:
            long r1 = r5.f4443g
            r3 = 2
            long r1 = r1 / r3
            long r3 = r5.f4438b
            int r1 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r1 <= 0) goto L9d
            java.lang.String r1 = ", maxUpdateDelay="
            r0.append(r1)
            long r1 = r5.f4443g
            androidx.core.util.C0986j.m4843e(r1, r0)
        L9d:
            r1 = 93
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.core.location.C0933l.toString():java.lang.String");
    }
}

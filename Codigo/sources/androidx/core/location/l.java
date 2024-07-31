package androidx.core.location;

import android.location.LocationRequest;
import android.os.Build;
import com.google.android.gms.common.api.a;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/* loaded from: classes.dex */
public final class l {

    /* renamed from: a, reason: collision with root package name */
    final int f3765a;

    /* renamed from: b, reason: collision with root package name */
    final long f3766b;

    /* renamed from: c, reason: collision with root package name */
    final long f3767c;

    /* renamed from: d, reason: collision with root package name */
    final long f3768d;

    /* renamed from: e, reason: collision with root package name */
    final int f3769e;

    /* renamed from: f, reason: collision with root package name */
    final float f3770f;

    /* renamed from: g, reason: collision with root package name */
    final long f3771g;

    /* loaded from: classes.dex */
    private static class a {

        /* renamed from: a, reason: collision with root package name */
        private static Class<?> f3772a;

        /* renamed from: b, reason: collision with root package name */
        private static Method f3773b;

        /* renamed from: c, reason: collision with root package name */
        private static Method f3774c;

        /* renamed from: d, reason: collision with root package name */
        private static Method f3775d;

        /* renamed from: e, reason: collision with root package name */
        private static Method f3776e;

        /* renamed from: f, reason: collision with root package name */
        private static Method f3777f;

        public static Object a(l lVar, String str) {
            try {
                if (f3772a == null) {
                    f3772a = Class.forName("android.location.LocationRequest");
                }
                if (f3773b == null) {
                    Method declaredMethod = f3772a.getDeclaredMethod("createFromDeprecatedProvider", String.class, Long.TYPE, Float.TYPE, Boolean.TYPE);
                    f3773b = declaredMethod;
                    declaredMethod.setAccessible(true);
                }
                Object invoke = f3773b.invoke(null, str, Long.valueOf(lVar.b()), Float.valueOf(lVar.e()), Boolean.FALSE);
                if (invoke == null) {
                    return null;
                }
                if (f3774c == null) {
                    Method declaredMethod2 = f3772a.getDeclaredMethod("setQuality", Integer.TYPE);
                    f3774c = declaredMethod2;
                    declaredMethod2.setAccessible(true);
                }
                f3774c.invoke(invoke, Integer.valueOf(lVar.g()));
                if (f3775d == null) {
                    Method declaredMethod3 = f3772a.getDeclaredMethod("setFastestInterval", Long.TYPE);
                    f3775d = declaredMethod3;
                    declaredMethod3.setAccessible(true);
                }
                f3775d.invoke(invoke, Long.valueOf(lVar.f()));
                if (lVar.d() < Integer.MAX_VALUE) {
                    if (f3776e == null) {
                        Method declaredMethod4 = f3772a.getDeclaredMethod("setNumUpdates", Integer.TYPE);
                        f3776e = declaredMethod4;
                        declaredMethod4.setAccessible(true);
                    }
                    f3776e.invoke(invoke, Integer.valueOf(lVar.d()));
                }
                if (lVar.a() < Long.MAX_VALUE) {
                    if (f3777f == null) {
                        Method declaredMethod5 = f3772a.getDeclaredMethod("setExpireIn", Long.TYPE);
                        f3777f = declaredMethod5;
                        declaredMethod5.setAccessible(true);
                    }
                    f3777f.invoke(invoke, Long.valueOf(lVar.a()));
                }
                return invoke;
            } catch (ClassNotFoundException | IllegalAccessException | NoSuchMethodException | InvocationTargetException unused) {
                return null;
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes.dex */
    public static class b {
        public static LocationRequest a(l lVar) {
            LocationRequest.Builder quality;
            LocationRequest.Builder minUpdateIntervalMillis;
            LocationRequest.Builder durationMillis;
            LocationRequest.Builder maxUpdates;
            LocationRequest.Builder minUpdateDistanceMeters;
            LocationRequest.Builder maxUpdateDelayMillis;
            LocationRequest build;
            quality = new LocationRequest.Builder(lVar.b()).setQuality(lVar.g());
            minUpdateIntervalMillis = quality.setMinUpdateIntervalMillis(lVar.f());
            durationMillis = minUpdateIntervalMillis.setDurationMillis(lVar.a());
            maxUpdates = durationMillis.setMaxUpdates(lVar.d());
            minUpdateDistanceMeters = maxUpdates.setMinUpdateDistanceMeters(lVar.e());
            maxUpdateDelayMillis = minUpdateDistanceMeters.setMaxUpdateDelayMillis(lVar.c());
            build = maxUpdateDelayMillis.build();
            return build;
        }
    }

    /* loaded from: classes.dex */
    public static final class c {

        /* renamed from: a, reason: collision with root package name */
        private long f3778a;

        /* renamed from: b, reason: collision with root package name */
        private int f3779b;

        /* renamed from: c, reason: collision with root package name */
        private long f3780c;

        /* renamed from: d, reason: collision with root package name */
        private int f3781d;

        /* renamed from: e, reason: collision with root package name */
        private long f3782e;

        /* renamed from: f, reason: collision with root package name */
        private float f3783f;

        /* renamed from: g, reason: collision with root package name */
        private long f3784g;

        public c(long j10) {
            b(j10);
            this.f3779b = 102;
            this.f3780c = Long.MAX_VALUE;
            this.f3781d = a.e.API_PRIORITY_OTHER;
            this.f3782e = -1L;
            this.f3783f = 0.0f;
            this.f3784g = 0L;
        }

        public l a() {
            androidx.core.util.h.n((this.f3778a == Long.MAX_VALUE && this.f3782e == -1) ? false : true, "passive location requests must have an explicit minimum update interval");
            long j10 = this.f3778a;
            return new l(j10, this.f3779b, this.f3780c, this.f3781d, Math.min(this.f3782e, j10), this.f3783f, this.f3784g);
        }

        public c b(long j10) {
            this.f3778a = androidx.core.util.h.g(j10, 0L, Long.MAX_VALUE, "intervalMillis");
            return this;
        }

        public c c(float f10) {
            this.f3783f = f10;
            this.f3783f = androidx.core.util.h.e(f10, 0.0f, Float.MAX_VALUE, "minUpdateDistanceMeters");
            return this;
        }

        public c d(long j10) {
            this.f3782e = androidx.core.util.h.g(j10, 0L, Long.MAX_VALUE, "minUpdateIntervalMillis");
            return this;
        }

        public c e(int i10) {
            androidx.core.util.h.c(i10 == 104 || i10 == 102 || i10 == 100, "quality must be a defined QUALITY constant, not %d", Integer.valueOf(i10));
            this.f3779b = i10;
            return this;
        }
    }

    l(long j10, int i10, long j11, int i11, long j12, float f10, long j13) {
        this.f3766b = j10;
        this.f3765a = i10;
        this.f3767c = j12;
        this.f3768d = j11;
        this.f3769e = i11;
        this.f3770f = f10;
        this.f3771g = j13;
    }

    public long a() {
        return this.f3768d;
    }

    public long b() {
        return this.f3766b;
    }

    public long c() {
        return this.f3771g;
    }

    public int d() {
        return this.f3769e;
    }

    public float e() {
        return this.f3770f;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof l)) {
            return false;
        }
        l lVar = (l) obj;
        return this.f3765a == lVar.f3765a && this.f3766b == lVar.f3766b && this.f3767c == lVar.f3767c && this.f3768d == lVar.f3768d && this.f3769e == lVar.f3769e && Float.compare(lVar.f3770f, this.f3770f) == 0 && this.f3771g == lVar.f3771g;
    }

    public long f() {
        long j10 = this.f3767c;
        return j10 == -1 ? this.f3766b : j10;
    }

    public int g() {
        return this.f3765a;
    }

    public LocationRequest h() {
        return b.a(this);
    }

    public int hashCode() {
        int i10 = this.f3765a * 31;
        long j10 = this.f3766b;
        int i11 = (i10 + ((int) (j10 ^ (j10 >>> 32)))) * 31;
        long j11 = this.f3767c;
        return i11 + ((int) (j11 ^ (j11 >>> 32)));
    }

    public LocationRequest i(String str) {
        return Build.VERSION.SDK_INT >= 31 ? h() : (LocationRequest) a.a(this, str);
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
            long r1 = r5.f3766b
            r3 = 9223372036854775807(0x7fffffffffffffff, double:NaN)
            int r1 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r1 == 0) goto L37
            java.lang.String r1 = "@"
            r0.append(r1)
            long r1 = r5.f3766b
            androidx.core.util.j.e(r1, r0)
            int r1 = r5.f3765a
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
            long r1 = r5.f3768d
            int r1 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r1 == 0) goto L4c
            java.lang.String r1 = ", duration="
            r0.append(r1)
            long r1 = r5.f3768d
            androidx.core.util.j.e(r1, r0)
        L4c:
            int r1 = r5.f3769e
            r2 = 2147483647(0x7fffffff, float:NaN)
            if (r1 == r2) goto L5d
            java.lang.String r1 = ", maxUpdates="
            r0.append(r1)
            int r1 = r5.f3769e
            r0.append(r1)
        L5d:
            long r1 = r5.f3767c
            r3 = -1
            int r3 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r3 == 0) goto L75
            long r3 = r5.f3766b
            int r1 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r1 >= 0) goto L75
            java.lang.String r1 = ", minUpdateInterval="
            r0.append(r1)
            long r1 = r5.f3767c
            androidx.core.util.j.e(r1, r0)
        L75:
            float r1 = r5.f3770f
            double r1 = (double) r1
            r3 = 0
            int r1 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r1 <= 0) goto L88
            java.lang.String r1 = ", minUpdateDistance="
            r0.append(r1)
            float r1 = r5.f3770f
            r0.append(r1)
        L88:
            long r1 = r5.f3771g
            r3 = 2
            long r1 = r1 / r3
            long r3 = r5.f3766b
            int r1 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r1 <= 0) goto L9d
            java.lang.String r1 = ", maxUpdateDelay="
            r0.append(r1)
            long r1 = r5.f3771g
            androidx.core.util.j.e(r1, r0)
        L9d:
            r1 = 93
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.core.location.l.toString():java.lang.String");
    }
}

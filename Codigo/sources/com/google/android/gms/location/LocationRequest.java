package com.google.android.gms.location;

import android.os.Build;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.SystemClock;
import android.os.WorkSource;
import com.google.android.gms.common.api.a;
import com.google.android.gms.common.internal.ReflectedParcelable;
import com.google.android.gms.internal.location.zzd;
import com.google.android.gms.internal.location.zzdj;

/* loaded from: classes2.dex */
public final class LocationRequest extends ea.a implements ReflectedParcelable {
    public static final Parcelable.Creator<LocationRequest> CREATOR = new x0();

    /* renamed from: a */
    private int f9764a;

    /* renamed from: b */
    private long f9765b;

    /* renamed from: c */
    private long f9766c;

    /* renamed from: d */
    private long f9767d;

    /* renamed from: e */
    private long f9768e;

    /* renamed from: f */
    private int f9769f;

    /* renamed from: r */
    private float f9770r;

    /* renamed from: s */
    private boolean f9771s;

    /* renamed from: t */
    private long f9772t;

    /* renamed from: u */
    private final int f9773u;

    /* renamed from: v */
    private final int f9774v;

    /* renamed from: w */
    private final String f9775w;

    /* renamed from: x */
    private final boolean f9776x;

    /* renamed from: y */
    private final WorkSource f9777y;

    /* renamed from: z */
    private final zzd f9778z;

    /* loaded from: classes2.dex */
    public static final class a {

        /* renamed from: a */
        private int f9779a;

        /* renamed from: b */
        private long f9780b;

        /* renamed from: c */
        private long f9781c;

        /* renamed from: d */
        private long f9782d;

        /* renamed from: e */
        private long f9783e;

        /* renamed from: f */
        private int f9784f;

        /* renamed from: g */
        private float f9785g;

        /* renamed from: h */
        private boolean f9786h;

        /* renamed from: i */
        private long f9787i;

        /* renamed from: j */
        private int f9788j;

        /* renamed from: k */
        private int f9789k;

        /* renamed from: l */
        private String f9790l;

        /* renamed from: m */
        private boolean f9791m;

        /* renamed from: n */
        private WorkSource f9792n;

        /* renamed from: o */
        private zzd f9793o;

        public a(int i10, long j10) {
            com.google.android.gms.common.internal.s.b(j10 >= 0, "intervalMillis must be greater than or equal to 0");
            b0.a(i10);
            this.f9779a = i10;
            this.f9780b = j10;
            this.f9781c = -1L;
            this.f9782d = 0L;
            this.f9783e = Long.MAX_VALUE;
            this.f9784f = a.e.API_PRIORITY_OTHER;
            this.f9785g = 0.0f;
            this.f9786h = true;
            this.f9787i = -1L;
            this.f9788j = 0;
            this.f9789k = 0;
            this.f9790l = null;
            this.f9791m = false;
            this.f9792n = null;
            this.f9793o = null;
        }

        public a(long j10) {
            com.google.android.gms.common.internal.s.b(j10 >= 0, "intervalMillis must be greater than or equal to 0");
            this.f9780b = j10;
            this.f9779a = 102;
            this.f9781c = -1L;
            this.f9782d = 0L;
            this.f9783e = Long.MAX_VALUE;
            this.f9784f = a.e.API_PRIORITY_OTHER;
            this.f9785g = 0.0f;
            this.f9786h = true;
            this.f9787i = -1L;
            this.f9788j = 0;
            this.f9789k = 0;
            this.f9790l = null;
            this.f9791m = false;
            this.f9792n = null;
            this.f9793o = null;
        }

        public a(LocationRequest locationRequest) {
            this.f9779a = locationRequest.D1();
            this.f9780b = locationRequest.x1();
            this.f9781c = locationRequest.C1();
            this.f9782d = locationRequest.z1();
            this.f9783e = locationRequest.v1();
            this.f9784f = locationRequest.A1();
            this.f9785g = locationRequest.B1();
            this.f9786h = locationRequest.G1();
            this.f9787i = locationRequest.y1();
            this.f9788j = locationRequest.w1();
            this.f9789k = locationRequest.zza();
            this.f9790l = locationRequest.zzd();
            this.f9791m = locationRequest.zze();
            this.f9792n = locationRequest.L1();
            this.f9793o = locationRequest.M1();
        }

        public LocationRequest a() {
            int i10 = this.f9779a;
            long j10 = this.f9780b;
            long j11 = this.f9781c;
            if (j11 == -1) {
                j11 = j10;
            } else if (i10 != 105) {
                j11 = Math.min(j11, j10);
            }
            long max = Math.max(this.f9782d, this.f9780b);
            long j12 = this.f9783e;
            int i11 = this.f9784f;
            float f10 = this.f9785g;
            boolean z10 = this.f9786h;
            long j13 = this.f9787i;
            return new LocationRequest(i10, j10, j11, max, Long.MAX_VALUE, j12, i11, f10, z10, j13 == -1 ? this.f9780b : j13, this.f9788j, this.f9789k, this.f9790l, this.f9791m, new WorkSource(this.f9792n), this.f9793o);
        }

        public a b(long j10) {
            com.google.android.gms.common.internal.s.b(j10 > 0, "durationMillis must be greater than 0");
            this.f9783e = j10;
            return this;
        }

        public a c(int i10) {
            o0.a(i10);
            this.f9788j = i10;
            return this;
        }

        public a d(long j10) {
            com.google.android.gms.common.internal.s.b(j10 >= 0, "intervalMillis must be greater than or equal to 0");
            this.f9780b = j10;
            return this;
        }

        public a e(long j10) {
            boolean z10 = true;
            if (j10 != -1 && j10 < 0) {
                z10 = false;
            }
            com.google.android.gms.common.internal.s.b(z10, "maxUpdateAgeMillis must be greater than or equal to 0, or IMPLICIT_MAX_UPDATE_AGE");
            this.f9787i = j10;
            return this;
        }

        public a f(float f10) {
            com.google.android.gms.common.internal.s.b(f10 >= 0.0f, "minUpdateDistanceMeters must be greater than or equal to 0");
            this.f9785g = f10;
            return this;
        }

        public a g(long j10) {
            boolean z10 = true;
            if (j10 != -1 && j10 < 0) {
                z10 = false;
            }
            com.google.android.gms.common.internal.s.b(z10, "minUpdateIntervalMillis must be greater than or equal to 0, or IMPLICIT_MIN_UPDATE_INTERVAL");
            this.f9781c = j10;
            return this;
        }

        public a h(int i10) {
            b0.a(i10);
            this.f9779a = i10;
            return this;
        }

        public a i(boolean z10) {
            this.f9786h = z10;
            return this;
        }

        public final a j(boolean z10) {
            this.f9791m = z10;
            return this;
        }

        @Deprecated
        public final a k(String str) {
            if (Build.VERSION.SDK_INT < 30) {
                this.f9790l = str;
            }
            return this;
        }

        public final a l(int i10) {
            int i11;
            boolean z10;
            if (i10 == 0 || i10 == 1) {
                i11 = i10;
                z10 = true;
            } else {
                i11 = 2;
                if (i10 == 2) {
                    z10 = true;
                    i10 = 2;
                } else {
                    i11 = i10;
                    z10 = false;
                }
            }
            com.google.android.gms.common.internal.s.c(z10, "throttle behavior %d must be a ThrottleBehavior.THROTTLE_* constant", Integer.valueOf(i10));
            this.f9789k = i11;
            return this;
        }

        public final a m(WorkSource workSource) {
            this.f9792n = workSource;
            return this;
        }
    }

    @Deprecated
    public LocationRequest() {
        this(102, 3600000L, 600000L, 0L, Long.MAX_VALUE, Long.MAX_VALUE, a.e.API_PRIORITY_OTHER, 0.0f, true, 3600000L, 0, 0, null, false, new WorkSource(), null);
    }

    public LocationRequest(int i10, long j10, long j11, long j12, long j13, long j14, int i11, float f10, boolean z10, long j15, int i12, int i13, String str, boolean z11, WorkSource workSource, zzd zzdVar) {
        this.f9764a = i10;
        long j16 = j10;
        this.f9765b = j16;
        this.f9766c = j11;
        this.f9767d = j12;
        this.f9768e = j13 == Long.MAX_VALUE ? j14 : Math.min(Math.max(1L, j13 - SystemClock.elapsedRealtime()), j14);
        this.f9769f = i11;
        this.f9770r = f10;
        this.f9771s = z10;
        this.f9772t = j15 != -1 ? j15 : j16;
        this.f9773u = i12;
        this.f9774v = i13;
        this.f9775w = str;
        this.f9776x = z11;
        this.f9777y = workSource;
        this.f9778z = zzdVar;
    }

    private static String N1(long j10) {
        return j10 == Long.MAX_VALUE ? "∞" : zzdj.zza(j10);
    }

    @Deprecated
    public static LocationRequest u1() {
        return new LocationRequest(102, 3600000L, 600000L, 0L, Long.MAX_VALUE, Long.MAX_VALUE, a.e.API_PRIORITY_OTHER, 0.0f, true, 3600000L, 0, 0, null, false, new WorkSource(), null);
    }

    public int A1() {
        return this.f9769f;
    }

    public float B1() {
        return this.f9770r;
    }

    public long C1() {
        return this.f9766c;
    }

    public int D1() {
        return this.f9764a;
    }

    public boolean E1() {
        long j10 = this.f9767d;
        return j10 > 0 && (j10 >> 1) >= this.f9765b;
    }

    public boolean F1() {
        return this.f9764a == 105;
    }

    public boolean G1() {
        return this.f9771s;
    }

    @Deprecated
    public LocationRequest H1(long j10) {
        com.google.android.gms.common.internal.s.c(j10 >= 0, "illegal fastest interval: %d", Long.valueOf(j10));
        this.f9766c = j10;
        return this;
    }

    @Deprecated
    public LocationRequest I1(long j10) {
        com.google.android.gms.common.internal.s.b(j10 >= 0, "intervalMillis must be greater than or equal to 0");
        long j11 = this.f9766c;
        long j12 = this.f9765b;
        if (j11 == j12 / 6) {
            this.f9766c = j10 / 6;
        }
        if (this.f9772t == j12) {
            this.f9772t = j10;
        }
        this.f9765b = j10;
        return this;
    }

    @Deprecated
    public LocationRequest J1(int i10) {
        b0.a(i10);
        this.f9764a = i10;
        return this;
    }

    @Deprecated
    public LocationRequest K1(float f10) {
        if (f10 >= 0.0f) {
            this.f9770r = f10;
            return this;
        }
        throw new IllegalArgumentException("invalid displacement: " + f10);
    }

    public final WorkSource L1() {
        return this.f9777y;
    }

    public final zzd M1() {
        return this.f9778z;
    }

    public boolean equals(Object obj) {
        if (obj instanceof LocationRequest) {
            LocationRequest locationRequest = (LocationRequest) obj;
            if (this.f9764a == locationRequest.f9764a && ((F1() || this.f9765b == locationRequest.f9765b) && this.f9766c == locationRequest.f9766c && E1() == locationRequest.E1() && ((!E1() || this.f9767d == locationRequest.f9767d) && this.f9768e == locationRequest.f9768e && this.f9769f == locationRequest.f9769f && this.f9770r == locationRequest.f9770r && this.f9771s == locationRequest.f9771s && this.f9773u == locationRequest.f9773u && this.f9774v == locationRequest.f9774v && this.f9776x == locationRequest.f9776x && this.f9777y.equals(locationRequest.f9777y) && com.google.android.gms.common.internal.q.b(this.f9775w, locationRequest.f9775w) && com.google.android.gms.common.internal.q.b(this.f9778z, locationRequest.f9778z)))) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        return com.google.android.gms.common.internal.q.c(Integer.valueOf(this.f9764a), Long.valueOf(this.f9765b), Long.valueOf(this.f9766c), this.f9777y);
    }

    public String toString() {
        long j10;
        StringBuilder sb2 = new StringBuilder();
        sb2.append("Request[");
        if (!F1()) {
            sb2.append("@");
            if (E1()) {
                zzdj.zzb(this.f9765b, sb2);
                sb2.append("/");
                j10 = this.f9767d;
            } else {
                j10 = this.f9765b;
            }
            zzdj.zzb(j10, sb2);
            sb2.append(" ");
        }
        sb2.append(b0.b(this.f9764a));
        if (F1() || this.f9766c != this.f9765b) {
            sb2.append(", minUpdateInterval=");
            sb2.append(N1(this.f9766c));
        }
        if (this.f9770r > 0.0d) {
            sb2.append(", minUpdateDistance=");
            sb2.append(this.f9770r);
        }
        boolean F1 = F1();
        long j11 = this.f9772t;
        if (!F1 ? j11 != this.f9765b : j11 != Long.MAX_VALUE) {
            sb2.append(", maxUpdateAge=");
            sb2.append(N1(this.f9772t));
        }
        if (this.f9768e != Long.MAX_VALUE) {
            sb2.append(", duration=");
            zzdj.zzb(this.f9768e, sb2);
        }
        if (this.f9769f != Integer.MAX_VALUE) {
            sb2.append(", maxUpdates=");
            sb2.append(this.f9769f);
        }
        if (this.f9774v != 0) {
            sb2.append(", ");
            sb2.append(d0.a(this.f9774v));
        }
        if (this.f9773u != 0) {
            sb2.append(", ");
            sb2.append(o0.b(this.f9773u));
        }
        if (this.f9771s) {
            sb2.append(", waitForAccurateLocation");
        }
        if (this.f9776x) {
            sb2.append(", bypass");
        }
        if (this.f9775w != null) {
            sb2.append(", moduleId=");
            sb2.append(this.f9775w);
        }
        if (!la.v.d(this.f9777y)) {
            sb2.append(", ");
            sb2.append(this.f9777y);
        }
        if (this.f9778z != null) {
            sb2.append(", impersonation=");
            sb2.append(this.f9778z);
        }
        sb2.append(']');
        return sb2.toString();
    }

    public long v1() {
        return this.f9768e;
    }

    public int w1() {
        return this.f9773u;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i10) {
        int a10 = ea.c.a(parcel);
        ea.c.u(parcel, 1, D1());
        ea.c.z(parcel, 2, x1());
        ea.c.z(parcel, 3, C1());
        ea.c.u(parcel, 6, A1());
        ea.c.q(parcel, 7, B1());
        ea.c.z(parcel, 8, z1());
        ea.c.g(parcel, 9, G1());
        ea.c.z(parcel, 10, v1());
        ea.c.z(parcel, 11, y1());
        ea.c.u(parcel, 12, w1());
        ea.c.u(parcel, 13, this.f9774v);
        ea.c.G(parcel, 14, this.f9775w, false);
        ea.c.g(parcel, 15, this.f9776x);
        ea.c.E(parcel, 16, this.f9777y, i10, false);
        ea.c.E(parcel, 17, this.f9778z, i10, false);
        ea.c.b(parcel, a10);
    }

    public long x1() {
        return this.f9765b;
    }

    public long y1() {
        return this.f9772t;
    }

    public long z1() {
        return this.f9767d;
    }

    public final int zza() {
        return this.f9774v;
    }

    @Deprecated
    public final String zzd() {
        return this.f9775w;
    }

    public final boolean zze() {
        return this.f9776x;
    }
}

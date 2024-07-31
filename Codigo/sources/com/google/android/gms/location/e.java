package com.google.android.gms.location;

import android.os.Build;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.WorkSource;
import com.google.android.gms.internal.location.zzd;
import com.google.android.gms.internal.location.zzdj;

/* loaded from: classes2.dex */
public final class e extends ea.a {
    public static final Parcelable.Creator<e> CREATOR = new l0();

    /* renamed from: a, reason: collision with root package name */
    private final long f9805a;

    /* renamed from: b, reason: collision with root package name */
    private final int f9806b;

    /* renamed from: c, reason: collision with root package name */
    private final int f9807c;

    /* renamed from: d, reason: collision with root package name */
    private final long f9808d;

    /* renamed from: e, reason: collision with root package name */
    private final boolean f9809e;

    /* renamed from: f, reason: collision with root package name */
    private final int f9810f;

    /* renamed from: r, reason: collision with root package name */
    private final String f9811r;

    /* renamed from: s, reason: collision with root package name */
    private final WorkSource f9812s;

    /* renamed from: t, reason: collision with root package name */
    private final zzd f9813t;

    /* loaded from: classes2.dex */
    public static final class a {

        /* renamed from: a, reason: collision with root package name */
        private long f9814a = 60000;

        /* renamed from: b, reason: collision with root package name */
        private int f9815b = 0;

        /* renamed from: c, reason: collision with root package name */
        private int f9816c = 102;

        /* renamed from: d, reason: collision with root package name */
        private long f9817d = Long.MAX_VALUE;

        /* renamed from: e, reason: collision with root package name */
        private boolean f9818e = false;

        /* renamed from: f, reason: collision with root package name */
        private int f9819f = 0;

        /* renamed from: g, reason: collision with root package name */
        private String f9820g = null;

        /* renamed from: h, reason: collision with root package name */
        private WorkSource f9821h = null;

        /* renamed from: i, reason: collision with root package name */
        private zzd f9822i = null;

        public e a() {
            return new e(this.f9814a, this.f9815b, this.f9816c, this.f9817d, this.f9818e, this.f9819f, this.f9820g, new WorkSource(this.f9821h), this.f9822i);
        }

        public a b(int i10) {
            b0.a(i10);
            this.f9816c = i10;
            return this;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public e(long j10, int i10, int i11, long j11, boolean z10, int i12, String str, WorkSource workSource, zzd zzdVar) {
        boolean z11 = true;
        if (Build.VERSION.SDK_INT >= 30 && str != null) {
            z11 = false;
        }
        com.google.android.gms.common.internal.s.a(z11);
        this.f9805a = j10;
        this.f9806b = i10;
        this.f9807c = i11;
        this.f9808d = j11;
        this.f9809e = z10;
        this.f9810f = i12;
        this.f9811r = str;
        this.f9812s = workSource;
        this.f9813t = zzdVar;
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof e)) {
            return false;
        }
        e eVar = (e) obj;
        return this.f9805a == eVar.f9805a && this.f9806b == eVar.f9806b && this.f9807c == eVar.f9807c && this.f9808d == eVar.f9808d && this.f9809e == eVar.f9809e && this.f9810f == eVar.f9810f && com.google.android.gms.common.internal.q.b(this.f9811r, eVar.f9811r) && com.google.android.gms.common.internal.q.b(this.f9812s, eVar.f9812s) && com.google.android.gms.common.internal.q.b(this.f9813t, eVar.f9813t);
    }

    public int hashCode() {
        return com.google.android.gms.common.internal.q.c(Long.valueOf(this.f9805a), Integer.valueOf(this.f9806b), Integer.valueOf(this.f9807c), Long.valueOf(this.f9808d));
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder();
        sb2.append("CurrentLocationRequest[");
        sb2.append(b0.b(this.f9807c));
        if (this.f9805a != Long.MAX_VALUE) {
            sb2.append(", maxAge=");
            zzdj.zzb(this.f9805a, sb2);
        }
        if (this.f9808d != Long.MAX_VALUE) {
            sb2.append(", duration=");
            sb2.append(this.f9808d);
            sb2.append("ms");
        }
        if (this.f9806b != 0) {
            sb2.append(", ");
            sb2.append(o0.b(this.f9806b));
        }
        if (this.f9809e) {
            sb2.append(", bypass");
        }
        if (this.f9810f != 0) {
            sb2.append(", ");
            sb2.append(d0.a(this.f9810f));
        }
        if (this.f9811r != null) {
            sb2.append(", moduleId=");
            sb2.append(this.f9811r);
        }
        if (!la.v.d(this.f9812s)) {
            sb2.append(", workSource=");
            sb2.append(this.f9812s);
        }
        if (this.f9813t != null) {
            sb2.append(", impersonation=");
            sb2.append(this.f9813t);
        }
        sb2.append(']');
        return sb2.toString();
    }

    public long u1() {
        return this.f9808d;
    }

    public int v1() {
        return this.f9806b;
    }

    public long w1() {
        return this.f9805a;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i10) {
        int a10 = ea.c.a(parcel);
        ea.c.z(parcel, 1, w1());
        ea.c.u(parcel, 2, v1());
        ea.c.u(parcel, 3, x1());
        ea.c.z(parcel, 4, u1());
        ea.c.g(parcel, 5, this.f9809e);
        ea.c.E(parcel, 6, this.f9812s, i10, false);
        ea.c.u(parcel, 7, this.f9810f);
        ea.c.G(parcel, 8, this.f9811r, false);
        ea.c.E(parcel, 9, this.f9813t, i10, false);
        ea.c.b(parcel, a10);
    }

    public int x1() {
        return this.f9807c;
    }

    public final WorkSource y1() {
        return this.f9812s;
    }

    public final int zza() {
        return this.f9810f;
    }

    @Deprecated
    public final String zzd() {
        return this.f9811r;
    }

    public final boolean zze() {
        return this.f9809e;
    }
}

package com.google.android.gms.location;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.internal.location.zzd;
import com.google.android.gms.internal.location.zzdj;

/* loaded from: classes2.dex */
public final class l extends ea.a {
    public static final Parcelable.Creator<l> CREATOR = new v0();

    /* renamed from: a, reason: collision with root package name */
    private final long f9843a;

    /* renamed from: b, reason: collision with root package name */
    private final int f9844b;

    /* renamed from: c, reason: collision with root package name */
    private final boolean f9845c;

    /* renamed from: d, reason: collision with root package name */
    private final String f9846d;

    /* renamed from: e, reason: collision with root package name */
    private final zzd f9847e;

    /* loaded from: classes2.dex */
    public static final class a {

        /* renamed from: a, reason: collision with root package name */
        private long f9848a = Long.MAX_VALUE;

        /* renamed from: b, reason: collision with root package name */
        private int f9849b = 0;

        /* renamed from: c, reason: collision with root package name */
        private boolean f9850c = false;

        /* renamed from: d, reason: collision with root package name */
        private String f9851d = null;

        /* renamed from: e, reason: collision with root package name */
        private zzd f9852e = null;

        public l a() {
            return new l(this.f9848a, this.f9849b, this.f9850c, this.f9851d, this.f9852e);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public l(long j10, int i10, boolean z10, String str, zzd zzdVar) {
        this.f9843a = j10;
        this.f9844b = i10;
        this.f9845c = z10;
        this.f9846d = str;
        this.f9847e = zzdVar;
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof l)) {
            return false;
        }
        l lVar = (l) obj;
        return this.f9843a == lVar.f9843a && this.f9844b == lVar.f9844b && this.f9845c == lVar.f9845c && com.google.android.gms.common.internal.q.b(this.f9846d, lVar.f9846d) && com.google.android.gms.common.internal.q.b(this.f9847e, lVar.f9847e);
    }

    public int hashCode() {
        return com.google.android.gms.common.internal.q.c(Long.valueOf(this.f9843a), Integer.valueOf(this.f9844b), Boolean.valueOf(this.f9845c));
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder();
        sb2.append("LastLocationRequest[");
        if (this.f9843a != Long.MAX_VALUE) {
            sb2.append("maxAge=");
            zzdj.zzb(this.f9843a, sb2);
        }
        if (this.f9844b != 0) {
            sb2.append(", ");
            sb2.append(o0.b(this.f9844b));
        }
        if (this.f9845c) {
            sb2.append(", bypass");
        }
        if (this.f9846d != null) {
            sb2.append(", moduleId=");
            sb2.append(this.f9846d);
        }
        if (this.f9847e != null) {
            sb2.append(", impersonation=");
            sb2.append(this.f9847e);
        }
        sb2.append(']');
        return sb2.toString();
    }

    public int u1() {
        return this.f9844b;
    }

    public long v1() {
        return this.f9843a;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i10) {
        int a10 = ea.c.a(parcel);
        ea.c.z(parcel, 1, v1());
        ea.c.u(parcel, 2, u1());
        ea.c.g(parcel, 3, this.f9845c);
        ea.c.G(parcel, 4, this.f9846d, false);
        ea.c.E(parcel, 5, this.f9847e, i10, false);
        ea.c.b(parcel, a10);
    }
}

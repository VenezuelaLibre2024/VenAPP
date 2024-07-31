package com.google.android.gms.measurement.internal;

import android.os.Parcel;
import android.os.Parcelable;

/* loaded from: classes2.dex */
public final class hb extends ea.a {
    public static final Parcelable.Creator<hb> CREATOR = new gb();

    /* renamed from: a, reason: collision with root package name */
    private final int f10236a;

    /* renamed from: b, reason: collision with root package name */
    public final String f10237b;

    /* renamed from: c, reason: collision with root package name */
    public final long f10238c;

    /* renamed from: d, reason: collision with root package name */
    public final Long f10239d;

    /* renamed from: e, reason: collision with root package name */
    private final Float f10240e;

    /* renamed from: f, reason: collision with root package name */
    public final String f10241f;

    /* renamed from: r, reason: collision with root package name */
    public final String f10242r;

    /* renamed from: s, reason: collision with root package name */
    public final Double f10243s;

    /* JADX INFO: Access modifiers changed from: package-private */
    public hb(int i10, String str, long j10, Long l10, Float f10, String str2, String str3, Double d10) {
        this.f10236a = i10;
        this.f10237b = str;
        this.f10238c = j10;
        this.f10239d = l10;
        this.f10240e = null;
        if (i10 == 1) {
            this.f10243s = f10 != null ? Double.valueOf(f10.doubleValue()) : null;
        } else {
            this.f10243s = d10;
        }
        this.f10241f = str2;
        this.f10242r = str3;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public hb(jb jbVar) {
        this(jbVar.f10320c, jbVar.f10321d, jbVar.f10322e, jbVar.f10319b);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public hb(String str, long j10, Object obj, String str2) {
        com.google.android.gms.common.internal.s.f(str);
        this.f10236a = 2;
        this.f10237b = str;
        this.f10238c = j10;
        this.f10242r = str2;
        if (obj == null) {
            this.f10239d = null;
            this.f10240e = null;
            this.f10243s = null;
            this.f10241f = null;
            return;
        }
        if (obj instanceof Long) {
            this.f10239d = (Long) obj;
            this.f10240e = null;
            this.f10243s = null;
            this.f10241f = null;
            return;
        }
        if (obj instanceof String) {
            this.f10239d = null;
            this.f10240e = null;
            this.f10243s = null;
            this.f10241f = (String) obj;
            return;
        }
        if (!(obj instanceof Double)) {
            throw new IllegalArgumentException("User attribute given of un-supported type");
        }
        this.f10239d = null;
        this.f10240e = null;
        this.f10243s = (Double) obj;
        this.f10241f = null;
    }

    public final Object u1() {
        Long l10 = this.f10239d;
        if (l10 != null) {
            return l10;
        }
        Double d10 = this.f10243s;
        if (d10 != null) {
            return d10;
        }
        String str = this.f10241f;
        if (str != null) {
            return str;
        }
        return null;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        int a10 = ea.c.a(parcel);
        ea.c.u(parcel, 1, this.f10236a);
        ea.c.G(parcel, 2, this.f10237b, false);
        ea.c.z(parcel, 3, this.f10238c);
        ea.c.B(parcel, 4, this.f10239d, false);
        ea.c.s(parcel, 5, null, false);
        ea.c.G(parcel, 6, this.f10241f, false);
        ea.c.G(parcel, 7, this.f10242r, false);
        ea.c.p(parcel, 8, this.f10243s, false);
        ea.c.b(parcel, a10);
    }
}

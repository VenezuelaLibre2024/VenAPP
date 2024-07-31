package com.google.android.gms.measurement.internal;

import android.os.Parcel;
import android.os.Parcelable;

/* loaded from: classes2.dex */
public final class d extends ea.a {
    public static final Parcelable.Creator<d> CREATOR = new g();

    /* renamed from: a, reason: collision with root package name */
    public String f10043a;

    /* renamed from: b, reason: collision with root package name */
    public String f10044b;

    /* renamed from: c, reason: collision with root package name */
    public hb f10045c;

    /* renamed from: d, reason: collision with root package name */
    public long f10046d;

    /* renamed from: e, reason: collision with root package name */
    public boolean f10047e;

    /* renamed from: f, reason: collision with root package name */
    public String f10048f;

    /* renamed from: r, reason: collision with root package name */
    public d0 f10049r;

    /* renamed from: s, reason: collision with root package name */
    public long f10050s;

    /* renamed from: t, reason: collision with root package name */
    public d0 f10051t;

    /* renamed from: u, reason: collision with root package name */
    public long f10052u;

    /* renamed from: v, reason: collision with root package name */
    public d0 f10053v;

    /* JADX INFO: Access modifiers changed from: package-private */
    public d(d dVar) {
        com.google.android.gms.common.internal.s.j(dVar);
        this.f10043a = dVar.f10043a;
        this.f10044b = dVar.f10044b;
        this.f10045c = dVar.f10045c;
        this.f10046d = dVar.f10046d;
        this.f10047e = dVar.f10047e;
        this.f10048f = dVar.f10048f;
        this.f10049r = dVar.f10049r;
        this.f10050s = dVar.f10050s;
        this.f10051t = dVar.f10051t;
        this.f10052u = dVar.f10052u;
        this.f10053v = dVar.f10053v;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public d(String str, String str2, hb hbVar, long j10, boolean z10, String str3, d0 d0Var, long j11, d0 d0Var2, long j12, d0 d0Var3) {
        this.f10043a = str;
        this.f10044b = str2;
        this.f10045c = hbVar;
        this.f10046d = j10;
        this.f10047e = z10;
        this.f10048f = str3;
        this.f10049r = d0Var;
        this.f10050s = j11;
        this.f10051t = d0Var2;
        this.f10052u = j12;
        this.f10053v = d0Var3;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        int a10 = ea.c.a(parcel);
        ea.c.G(parcel, 2, this.f10043a, false);
        ea.c.G(parcel, 3, this.f10044b, false);
        ea.c.E(parcel, 4, this.f10045c, i10, false);
        ea.c.z(parcel, 5, this.f10046d);
        ea.c.g(parcel, 6, this.f10047e);
        ea.c.G(parcel, 7, this.f10048f, false);
        ea.c.E(parcel, 8, this.f10049r, i10, false);
        ea.c.z(parcel, 9, this.f10050s);
        ea.c.E(parcel, 10, this.f10051t, i10, false);
        ea.c.z(parcel, 11, this.f10052u);
        ea.c.E(parcel, 12, this.f10053v, i10, false);
        ea.c.b(parcel, a10);
    }
}

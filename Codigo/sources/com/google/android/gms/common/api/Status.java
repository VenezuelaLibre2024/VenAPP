package com.google.android.gms.common.api;

import android.app.Activity;
import android.app.PendingIntent;
import android.os.Parcel;
import android.os.Parcelable;
import com.facebook.ads.AdError;
import com.google.android.gms.common.internal.ReflectedParcelable;
import com.google.android.gms.common.internal.q;
import com.google.errorprone.annotations.ResultIgnorabilityUnspecified;

/* loaded from: classes.dex */
public final class Status extends ea.a implements n, ReflectedParcelable {

    /* renamed from: a */
    final int f9299a;

    /* renamed from: b */
    private final int f9300b;

    /* renamed from: c */
    private final String f9301c;

    /* renamed from: d */
    private final PendingIntent f9302d;

    /* renamed from: e */
    private final ca.b f9303e;

    /* renamed from: f */
    public static final Status f9291f = new Status(-1);

    /* renamed from: r */
    public static final Status f9292r = new Status(0);

    /* renamed from: s */
    public static final Status f9293s = new Status(14);

    /* renamed from: t */
    public static final Status f9294t = new Status(8);

    /* renamed from: u */
    public static final Status f9295u = new Status(15);

    /* renamed from: v */
    public static final Status f9296v = new Status(16);

    /* renamed from: x */
    public static final Status f9298x = new Status(17);

    /* renamed from: w */
    public static final Status f9297w = new Status(18);
    public static final Parcelable.Creator<Status> CREATOR = new z();

    public Status(int i10) {
        this(i10, (String) null);
    }

    public Status(int i10, int i11, String str, PendingIntent pendingIntent, ca.b bVar) {
        this.f9299a = i10;
        this.f9300b = i11;
        this.f9301c = str;
        this.f9302d = pendingIntent;
        this.f9303e = bVar;
    }

    public Status(int i10, String str) {
        this(1, i10, str, null, null);
    }

    public Status(int i10, String str, PendingIntent pendingIntent) {
        this(1, i10, str, pendingIntent, null);
    }

    public Status(ca.b bVar, String str) {
        this(bVar, str, 17);
    }

    @Deprecated
    public Status(ca.b bVar, String str, int i10) {
        this(1, i10, str, bVar.w1(), bVar);
    }

    public boolean R0() {
        return this.f9300b == 16;
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof Status)) {
            return false;
        }
        Status status = (Status) obj;
        return this.f9299a == status.f9299a && this.f9300b == status.f9300b && com.google.android.gms.common.internal.q.b(this.f9301c, status.f9301c) && com.google.android.gms.common.internal.q.b(this.f9302d, status.f9302d) && com.google.android.gms.common.internal.q.b(this.f9303e, status.f9303e);
    }

    @Override // com.google.android.gms.common.api.n
    public Status getStatus() {
        return this;
    }

    public int hashCode() {
        return com.google.android.gms.common.internal.q.c(Integer.valueOf(this.f9299a), Integer.valueOf(this.f9300b), this.f9301c, this.f9302d, this.f9303e);
    }

    public String toString() {
        q.a d10 = com.google.android.gms.common.internal.q.d(this);
        d10.a("statusCode", zza());
        d10.a("resolution", this.f9302d);
        return d10.toString();
    }

    public ca.b u1() {
        return this.f9303e;
    }

    @ResultIgnorabilityUnspecified
    public int v1() {
        return this.f9300b;
    }

    public String w1() {
        return this.f9301c;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i10) {
        int a10 = ea.c.a(parcel);
        ea.c.u(parcel, 1, v1());
        ea.c.G(parcel, 2, w1(), false);
        ea.c.E(parcel, 3, this.f9302d, i10, false);
        ea.c.E(parcel, 4, u1(), i10, false);
        ea.c.u(parcel, AdError.NETWORK_ERROR_CODE, this.f9299a);
        ea.c.b(parcel, a10);
    }

    public boolean x1() {
        return this.f9302d != null;
    }

    public boolean y1() {
        return this.f9300b <= 0;
    }

    public void z1(Activity activity, int i10) {
        if (x1()) {
            PendingIntent pendingIntent = this.f9302d;
            com.google.android.gms.common.internal.s.j(pendingIntent);
            activity.startIntentSenderForResult(pendingIntent.getIntentSender(), i10, null, 0, 0, 0);
        }
    }

    public final String zza() {
        String str = this.f9301c;
        return str != null ? str : d.a(this.f9300b);
    }
}

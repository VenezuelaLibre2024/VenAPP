package com.google.android.gms.ads.internal.client;

import android.os.Parcel;
import android.os.Parcelable;
import org.json.JSONObject;

/* loaded from: classes.dex */
public final class b5 extends ea.a {
    public static final Parcelable.Creator<b5> CREATOR = new c5();

    /* renamed from: a, reason: collision with root package name */
    public final int f8621a;

    /* renamed from: b, reason: collision with root package name */
    public final int f8622b;

    /* renamed from: c, reason: collision with root package name */
    public final String f8623c;

    /* renamed from: d, reason: collision with root package name */
    public final long f8624d;

    public b5(int i10, int i11, String str, long j10) {
        this.f8621a = i10;
        this.f8622b = i11;
        this.f8623c = str;
        this.f8624d = j10;
    }

    public static b5 u1(JSONObject jSONObject) {
        return new b5(jSONObject.getInt("type_num"), jSONObject.getInt("precision_num"), jSONObject.getString("currency"), jSONObject.getLong("value"));
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        int i11 = this.f8621a;
        int a10 = ea.c.a(parcel);
        ea.c.u(parcel, 1, i11);
        ea.c.u(parcel, 2, this.f8622b);
        ea.c.G(parcel, 3, this.f8623c, false);
        ea.c.z(parcel, 4, this.f8624d);
        ea.c.b(parcel, a10);
    }
}

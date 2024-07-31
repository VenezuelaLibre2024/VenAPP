package com.google.android.gms.ads.internal.client;

import android.os.Parcel;
import android.os.Parcelable;
import org.json.JSONObject;
import p081ea.AbstractC7138a;
import p081ea.C7140c;

/* renamed from: com.google.android.gms.ads.internal.client.b5 */
/* loaded from: classes.dex */
public final class C4796b5 extends AbstractC7138a {
    public static final Parcelable.Creator<C4796b5> CREATOR = new C4803c5();

    /* renamed from: a */
    public final int f9698a;

    /* renamed from: b */
    public final int f9699b;

    /* renamed from: c */
    public final String f9700c;

    /* renamed from: d */
    public final long f9701d;

    public C4796b5(int i10, int i11, String str, long j10) {
        this.f9698a = i10;
        this.f9699b = i11;
        this.f9700c = str;
        this.f9701d = j10;
    }

    /* renamed from: u1 */
    public static C4796b5 m12369u1(JSONObject jSONObject) {
        return new C4796b5(jSONObject.getInt("type_num"), jSONObject.getInt("precision_num"), jSONObject.getString("currency"), jSONObject.getLong("value"));
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        int i11 = this.f9698a;
        int m21209a = C7140c.m21209a(parcel);
        C7140c.m21229u(parcel, 1, i11);
        C7140c.m21229u(parcel, 2, this.f9699b);
        C7140c.m21200G(parcel, 3, this.f9700c, false);
        C7140c.m21234z(parcel, 4, this.f9701d);
        C7140c.m21210b(parcel, m21209a);
    }
}

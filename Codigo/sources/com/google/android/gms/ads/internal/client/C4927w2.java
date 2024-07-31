package com.google.android.gms.ads.internal.client;

import android.os.Parcel;
import android.os.Parcelable;
import p081ea.AbstractC7138a;
import p081ea.C7140c;

/* renamed from: com.google.android.gms.ads.internal.client.w2 */
/* loaded from: classes.dex */
public final class C4927w2 extends AbstractC7138a {
    public static final Parcelable.Creator<C4927w2> CREATOR = new C4933x2();

    /* renamed from: a */
    public final int f9872a;

    public C4927w2(int i10) {
        this.f9872a = i10;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        int i11 = this.f9872a;
        int m21209a = C7140c.m21209a(parcel);
        C7140c.m21229u(parcel, 2, i11);
        C7140c.m21210b(parcel, m21209a);
    }
}

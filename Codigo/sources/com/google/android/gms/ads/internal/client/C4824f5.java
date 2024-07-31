package com.google.android.gms.ads.internal.client;

import android.os.Parcel;
import android.os.Parcelable;
import p081ea.AbstractC7138a;
import p081ea.C7140c;

/* renamed from: com.google.android.gms.ads.internal.client.f5 */
/* loaded from: classes.dex */
public final class C4824f5 extends AbstractC7138a {
    public static final Parcelable.Creator<C4824f5> CREATOR = new C4831g5();

    /* renamed from: a */
    public final int f9741a;

    public C4824f5(int i10) {
        this.f9741a = i10;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        int i11 = this.f9741a;
        int m21209a = C7140c.m21209a(parcel);
        C7140c.m21229u(parcel, 2, i11);
        C7140c.m21210b(parcel, m21209a);
    }
}

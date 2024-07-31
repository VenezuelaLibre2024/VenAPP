package com.google.android.gms.ads.internal.client;

import android.os.Parcel;
import android.os.Parcelable;
import p081ea.AbstractC7138a;
import p081ea.C7140c;

/* renamed from: com.google.android.gms.ads.internal.client.a1 */
/* loaded from: classes.dex */
public final class C4785a1 extends AbstractC7138a {
    public static final Parcelable.Creator<C4785a1> CREATOR = new C4793b2();

    /* renamed from: a */
    public final String f9688a;

    /* renamed from: b */
    public final String f9689b;

    public C4785a1(String str, String str2) {
        this.f9688a = str;
        this.f9689b = str2;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        String str = this.f9688a;
        int m21209a = C7140c.m21209a(parcel);
        C7140c.m21200G(parcel, 1, str, false);
        C7140c.m21200G(parcel, 2, this.f9689b, false);
        C7140c.m21210b(parcel, m21209a);
    }
}

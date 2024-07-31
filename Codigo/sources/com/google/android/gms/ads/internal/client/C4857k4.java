package com.google.android.gms.ads.internal.client;

import android.os.Parcel;
import android.os.Parcelable;
import p081ea.AbstractC7138a;
import p081ea.C7140c;

/* renamed from: com.google.android.gms.ads.internal.client.k4 */
/* loaded from: classes.dex */
public final class C4857k4 extends AbstractC7138a {
    public static final Parcelable.Creator<C4857k4> CREATOR = new C4863l4();

    /* renamed from: a */
    public final String f9763a;

    /* JADX INFO: Access modifiers changed from: package-private */
    public C4857k4(String str) {
        this.f9763a = str;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        String str = this.f9763a;
        int m21209a = C7140c.m21209a(parcel);
        C7140c.m21200G(parcel, 15, str, false);
        C7140c.m21210b(parcel, m21209a);
    }
}

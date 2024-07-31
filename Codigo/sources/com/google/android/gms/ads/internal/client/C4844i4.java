package com.google.android.gms.ads.internal.client;

import android.os.Parcel;
import android.os.Parcelable;
import p081ea.AbstractC7138a;
import p081ea.C7140c;
import p438x8.C12387y;

/* renamed from: com.google.android.gms.ads.internal.client.i4 */
/* loaded from: classes.dex */
public final class C4844i4 extends AbstractC7138a {
    public static final Parcelable.Creator<C4844i4> CREATOR = new C4851j4();

    /* renamed from: a */
    public final int f9752a;

    /* renamed from: b */
    public final int f9753b;

    public C4844i4(int i10, int i11) {
        this.f9752a = i10;
        this.f9753b = i11;
    }

    public C4844i4(C12387y c12387y) {
        this.f9752a = c12387y.m40036c();
        this.f9753b = c12387y.m40037d();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        int i11 = this.f9752a;
        int m21209a = C7140c.m21209a(parcel);
        C7140c.m21229u(parcel, 1, i11);
        C7140c.m21229u(parcel, 2, this.f9753b);
        C7140c.m21210b(parcel, m21209a);
    }
}

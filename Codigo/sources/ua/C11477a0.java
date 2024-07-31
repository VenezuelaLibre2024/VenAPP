package ua;

import android.os.Parcel;
import android.os.Parcelable;
import p081ea.AbstractC7138a;
import p081ea.C7140c;

/* renamed from: ua.a0 */
/* loaded from: classes2.dex */
public final class C11477a0 extends AbstractC7138a {
    public static final Parcelable.Creator<C11477a0> CREATOR = new C11493i0();

    /* renamed from: a */
    public final int f29801a;

    /* renamed from: b */
    public final int f29802b;

    /* renamed from: c */
    public final byte[] f29803c;

    public C11477a0(int i10, int i11, byte[] bArr) {
        this.f29801a = i10;
        this.f29802b = i11;
        this.f29803c = bArr;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i10) {
        int i11 = this.f29801a;
        int m21209a = C7140c.m21209a(parcel);
        C7140c.m21229u(parcel, 2, i11);
        C7140c.m21229u(parcel, 3, this.f29802b);
        C7140c.m21220l(parcel, 4, this.f29803c, false);
        C7140c.m21210b(parcel, m21209a);
    }
}

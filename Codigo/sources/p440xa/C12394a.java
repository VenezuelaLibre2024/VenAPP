package p440xa;

import android.os.Parcel;
import android.os.Parcelable;
import p081ea.AbstractC7138a;
import p081ea.C7140c;

/* renamed from: xa.a */
/* loaded from: classes2.dex */
public class C12394a extends AbstractC7138a {
    public static final Parcelable.Creator<C12394a> CREATOR = new C12402i();

    /* renamed from: a */
    public final String f33269a;

    /* renamed from: b */
    public final byte[] f33270b;

    /* renamed from: c */
    public final int f33271c;

    public C12394a(String str, byte[] bArr, int i10) {
        this.f33269a = str;
        this.f33270b = bArr;
        this.f33271c = i10;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        int m21209a = C7140c.m21209a(parcel);
        C7140c.m21200G(parcel, 2, this.f33269a, false);
        C7140c.m21220l(parcel, 3, this.f33270b, false);
        C7140c.m21229u(parcel, 4, this.f33271c);
        C7140c.m21210b(parcel, m21209a);
    }
}

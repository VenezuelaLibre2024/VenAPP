package xa;

import android.os.Parcel;
import android.os.Parcelable;

/* loaded from: classes2.dex */
public class a extends ea.a {
    public static final Parcelable.Creator<a> CREATOR = new i();

    /* renamed from: a, reason: collision with root package name */
    public final String f30749a;

    /* renamed from: b, reason: collision with root package name */
    public final byte[] f30750b;

    /* renamed from: c, reason: collision with root package name */
    public final int f30751c;

    public a(String str, byte[] bArr, int i10) {
        this.f30749a = str;
        this.f30750b = bArr;
        this.f30751c = i10;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        int a10 = ea.c.a(parcel);
        ea.c.G(parcel, 2, this.f30749a, false);
        ea.c.l(parcel, 3, this.f30750b, false);
        ea.c.u(parcel, 4, this.f30751c);
        ea.c.b(parcel, a10);
    }
}

package x9;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import com.facebook.ads.AdError;

/* loaded from: classes.dex */
public class b extends ea.a {
    public static final Parcelable.Creator<b> CREATOR = new d();

    /* renamed from: r, reason: collision with root package name */
    public static final int f30728r = 0;

    /* renamed from: s, reason: collision with root package name */
    public static final int f30729s = 1;

    /* renamed from: t, reason: collision with root package name */
    public static final int f30730t = 2;

    /* renamed from: u, reason: collision with root package name */
    public static final int f30731u = 3;

    /* renamed from: v, reason: collision with root package name */
    public static final int f30732v = 4;

    /* renamed from: w, reason: collision with root package name */
    public static final int f30733w = 5;

    /* renamed from: x, reason: collision with root package name */
    public static final int f30734x = 6;

    /* renamed from: y, reason: collision with root package name */
    public static final int f30735y = 7;

    /* renamed from: z, reason: collision with root package name */
    public static final int f30736z = 7;

    /* renamed from: a, reason: collision with root package name */
    public final String f30737a;

    /* renamed from: b, reason: collision with root package name */
    public final int f30738b;

    /* renamed from: c, reason: collision with root package name */
    public final long f30739c;

    /* renamed from: d, reason: collision with root package name */
    public final byte[] f30740d;

    /* renamed from: e, reason: collision with root package name */
    final int f30741e;

    /* renamed from: f, reason: collision with root package name */
    Bundle f30742f;

    /* JADX INFO: Access modifiers changed from: package-private */
    public b(int i10, String str, int i11, long j10, byte[] bArr, Bundle bundle) {
        this.f30741e = i10;
        this.f30737a = str;
        this.f30738b = i11;
        this.f30739c = j10;
        this.f30740d = bArr;
        this.f30742f = bundle;
    }

    public String toString() {
        return "ProxyRequest[ url: " + this.f30737a + ", method: " + this.f30738b + " ]";
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i10) {
        int a10 = ea.c.a(parcel);
        ea.c.G(parcel, 1, this.f30737a, false);
        ea.c.u(parcel, 2, this.f30738b);
        ea.c.z(parcel, 3, this.f30739c);
        ea.c.l(parcel, 4, this.f30740d, false);
        ea.c.j(parcel, 5, this.f30742f, false);
        ea.c.u(parcel, AdError.NETWORK_ERROR_CODE, this.f30741e);
        ea.c.b(parcel, a10);
    }
}

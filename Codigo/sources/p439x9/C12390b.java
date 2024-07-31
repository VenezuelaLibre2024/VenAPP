package p439x9;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import com.facebook.ads.AdError;
import p081ea.AbstractC7138a;
import p081ea.C7140c;

/* renamed from: x9.b */
/* loaded from: classes.dex */
public class C12390b extends AbstractC7138a {
    public static final Parcelable.Creator<C12390b> CREATOR = new C12392d();

    /* renamed from: r */
    public static final int f33248r = 0;

    /* renamed from: s */
    public static final int f33249s = 1;

    /* renamed from: t */
    public static final int f33250t = 2;

    /* renamed from: u */
    public static final int f33251u = 3;

    /* renamed from: v */
    public static final int f33252v = 4;

    /* renamed from: w */
    public static final int f33253w = 5;

    /* renamed from: x */
    public static final int f33254x = 6;

    /* renamed from: y */
    public static final int f33255y = 7;

    /* renamed from: z */
    public static final int f33256z = 7;

    /* renamed from: a */
    public final String f33257a;

    /* renamed from: b */
    public final int f33258b;

    /* renamed from: c */
    public final long f33259c;

    /* renamed from: d */
    public final byte[] f33260d;

    /* renamed from: e */
    final int f33261e;

    /* renamed from: f */
    Bundle f33262f;

    /* JADX INFO: Access modifiers changed from: package-private */
    public C12390b(int i10, String str, int i11, long j10, byte[] bArr, Bundle bundle) {
        this.f33261e = i10;
        this.f33257a = str;
        this.f33258b = i11;
        this.f33259c = j10;
        this.f33260d = bArr;
        this.f33262f = bundle;
    }

    public String toString() {
        return "ProxyRequest[ url: " + this.f33257a + ", method: " + this.f33258b + " ]";
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i10) {
        int m21209a = C7140c.m21209a(parcel);
        C7140c.m21200G(parcel, 1, this.f33257a, false);
        C7140c.m21229u(parcel, 2, this.f33258b);
        C7140c.m21234z(parcel, 3, this.f33259c);
        C7140c.m21220l(parcel, 4, this.f33260d, false);
        C7140c.m21218j(parcel, 5, this.f33262f, false);
        C7140c.m21229u(parcel, AdError.NETWORK_ERROR_CODE, this.f33261e);
        C7140c.m21210b(parcel, m21209a);
    }
}

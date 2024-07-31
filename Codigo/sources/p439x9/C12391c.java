package p439x9;

import android.app.PendingIntent;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import com.facebook.ads.AdError;
import p081ea.AbstractC7138a;
import p081ea.C7140c;

/* renamed from: x9.c */
/* loaded from: classes.dex */
public class C12391c extends AbstractC7138a {
    public static final Parcelable.Creator<C12391c> CREATOR = new C12393e();

    /* renamed from: a */
    public final int f33263a;

    /* renamed from: b */
    public final PendingIntent f33264b;

    /* renamed from: c */
    public final int f33265c;

    /* renamed from: d */
    public final byte[] f33266d;

    /* renamed from: e */
    final int f33267e;

    /* renamed from: f */
    final Bundle f33268f;

    /* JADX INFO: Access modifiers changed from: package-private */
    public C12391c(int i10, int i11, PendingIntent pendingIntent, int i12, Bundle bundle, byte[] bArr) {
        this.f33267e = i10;
        this.f33263a = i11;
        this.f33265c = i12;
        this.f33268f = bundle;
        this.f33266d = bArr;
        this.f33264b = pendingIntent;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i10) {
        int m21209a = C7140c.m21209a(parcel);
        C7140c.m21229u(parcel, 1, this.f33263a);
        C7140c.m21198E(parcel, 2, this.f33264b, i10, false);
        C7140c.m21229u(parcel, 3, this.f33265c);
        C7140c.m21218j(parcel, 4, this.f33268f, false);
        C7140c.m21220l(parcel, 5, this.f33266d, false);
        C7140c.m21229u(parcel, AdError.NETWORK_ERROR_CODE, this.f33267e);
        C7140c.m21210b(parcel, m21209a);
    }
}

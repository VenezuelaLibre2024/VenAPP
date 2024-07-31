package x9;

import android.app.PendingIntent;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import com.facebook.ads.AdError;

/* loaded from: classes.dex */
public class c extends ea.a {
    public static final Parcelable.Creator<c> CREATOR = new e();

    /* renamed from: a, reason: collision with root package name */
    public final int f30743a;

    /* renamed from: b, reason: collision with root package name */
    public final PendingIntent f30744b;

    /* renamed from: c, reason: collision with root package name */
    public final int f30745c;

    /* renamed from: d, reason: collision with root package name */
    public final byte[] f30746d;

    /* renamed from: e, reason: collision with root package name */
    final int f30747e;

    /* renamed from: f, reason: collision with root package name */
    final Bundle f30748f;

    /* JADX INFO: Access modifiers changed from: package-private */
    public c(int i10, int i11, PendingIntent pendingIntent, int i12, Bundle bundle, byte[] bArr) {
        this.f30747e = i10;
        this.f30743a = i11;
        this.f30745c = i12;
        this.f30748f = bundle;
        this.f30746d = bArr;
        this.f30744b = pendingIntent;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i10) {
        int a10 = ea.c.a(parcel);
        ea.c.u(parcel, 1, this.f30743a);
        ea.c.E(parcel, 2, this.f30744b, i10, false);
        ea.c.u(parcel, 3, this.f30745c);
        ea.c.j(parcel, 4, this.f30748f, false);
        ea.c.l(parcel, 5, this.f30746d, false);
        ea.c.u(parcel, AdError.NETWORK_ERROR_CODE, this.f30747e);
        ea.c.b(parcel, a10);
    }
}

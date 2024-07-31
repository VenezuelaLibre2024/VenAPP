package ca;

import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.RemoteException;
import android.util.Log;
import com.google.android.gms.common.internal.b2;

/* loaded from: classes.dex */
public final class h0 extends ea.a {
    public static final Parcelable.Creator<h0> CREATOR = new i0();

    /* renamed from: a, reason: collision with root package name */
    private final String f6977a;

    /* renamed from: b, reason: collision with root package name */
    private final y f6978b;

    /* renamed from: c, reason: collision with root package name */
    private final boolean f6979c;

    /* renamed from: d, reason: collision with root package name */
    private final boolean f6980d;

    /* JADX INFO: Access modifiers changed from: package-private */
    public h0(String str, IBinder iBinder, boolean z10, boolean z11) {
        this.f6977a = str;
        z zVar = null;
        if (iBinder != null) {
            try {
                com.google.android.gms.dynamic.b zzd = b2.f2(iBinder).zzd();
                byte[] bArr = zzd == null ? null : (byte[]) com.google.android.gms.dynamic.d.g2(zzd);
                if (bArr != null) {
                    zVar = new z(bArr);
                } else {
                    Log.e("GoogleCertificatesQuery", "Could not unwrap certificate");
                }
            } catch (RemoteException e10) {
                Log.e("GoogleCertificatesQuery", "Could not unwrap certificate", e10);
            }
        }
        this.f6978b = zVar;
        this.f6979c = z10;
        this.f6980d = z11;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public h0(String str, y yVar, boolean z10, boolean z11) {
        this.f6977a = str;
        this.f6978b = yVar;
        this.f6979c = z10;
        this.f6980d = z11;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        int a10 = ea.c.a(parcel);
        ea.c.G(parcel, 1, this.f6977a, false);
        y yVar = this.f6978b;
        if (yVar == null) {
            Log.w("GoogleCertificatesQuery", "certificate binder is null");
            yVar = null;
        }
        ea.c.t(parcel, 2, yVar, false);
        ea.c.g(parcel, 3, this.f6979c);
        ea.c.g(parcel, 4, this.f6980d);
        ea.c.b(parcel, a10);
    }
}

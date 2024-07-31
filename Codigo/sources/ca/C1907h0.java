package ca;

import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.RemoteException;
import android.util.Log;
import com.google.android.gms.common.internal.AbstractBinderC5227b2;
import com.google.android.gms.dynamic.BinderC5314d;
import com.google.android.gms.dynamic.InterfaceC5312b;
import p081ea.AbstractC7138a;
import p081ea.C7140c;

/* renamed from: ca.h0 */
/* loaded from: classes.dex */
public final class C1907h0 extends AbstractC7138a {
    public static final Parcelable.Creator<C1907h0> CREATOR = new C1909i0();

    /* renamed from: a */
    private final String f7926a;

    /* renamed from: b */
    private final AbstractBinderC1930y f7927b;

    /* renamed from: c */
    private final boolean f7928c;

    /* renamed from: d */
    private final boolean f7929d;

    /* JADX INFO: Access modifiers changed from: package-private */
    public C1907h0(String str, IBinder iBinder, boolean z10, boolean z11) {
        this.f7926a = str;
        BinderC1931z binderC1931z = null;
        if (iBinder != null) {
            try {
                InterfaceC5312b zzd = AbstractBinderC5227b2.m13228f2(iBinder).zzd();
                byte[] bArr = zzd == null ? null : (byte[]) BinderC5314d.m13411g2(zzd);
                if (bArr != null) {
                    binderC1931z = new BinderC1931z(bArr);
                } else {
                    Log.e("GoogleCertificatesQuery", "Could not unwrap certificate");
                }
            } catch (RemoteException e10) {
                Log.e("GoogleCertificatesQuery", "Could not unwrap certificate", e10);
            }
        }
        this.f7927b = binderC1931z;
        this.f7928c = z10;
        this.f7929d = z11;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public C1907h0(String str, AbstractBinderC1930y abstractBinderC1930y, boolean z10, boolean z11) {
        this.f7926a = str;
        this.f7927b = abstractBinderC1930y;
        this.f7928c = z10;
        this.f7929d = z11;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        int m21209a = C7140c.m21209a(parcel);
        C7140c.m21200G(parcel, 1, this.f7926a, false);
        AbstractBinderC1930y abstractBinderC1930y = this.f7927b;
        if (abstractBinderC1930y == null) {
            Log.w("GoogleCertificatesQuery", "certificate binder is null");
            abstractBinderC1930y = null;
        }
        C7140c.m21228t(parcel, 2, abstractBinderC1930y, false);
        C7140c.m21215g(parcel, 3, this.f7928c);
        C7140c.m21215g(parcel, 4, this.f7929d);
        C7140c.m21210b(parcel, m21209a);
    }
}

package p013ab;

import android.os.IBinder;
import android.os.Parcel;
import com.google.android.gms.internal.base.zaa;
import com.google.android.gms.internal.base.zac;

/* renamed from: ab.g */
/* loaded from: classes2.dex */
public final class C0088g extends zaa {
    /* JADX INFO: Access modifiers changed from: package-private */
    public C0088g(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.signin.internal.ISignInService");
    }

    /* renamed from: f2 */
    public final void m380f2(C0091j c0091j, InterfaceC0087f interfaceC0087f) {
        Parcel zaa = zaa();
        zac.zad(zaa, c0091j);
        zac.zae(zaa, interfaceC0087f);
        zac(12, zaa);
    }
}

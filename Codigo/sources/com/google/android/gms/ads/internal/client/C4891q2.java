package com.google.android.gms.ads.internal.client;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import com.google.android.gms.internal.ads.zzayg;
import com.google.android.gms.internal.ads.zzayi;

/* renamed from: com.google.android.gms.ads.internal.client.q2 */
/* loaded from: classes.dex */
public final class C4891q2 extends zzayg implements InterfaceC4903s2 {
    /* JADX INFO: Access modifiers changed from: package-private */
    public C4891q2(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.client.IVideoController");
    }

    @Override // com.google.android.gms.ads.internal.client.InterfaceC4903s2
    public final float zze() {
        throw null;
    }

    @Override // com.google.android.gms.ads.internal.client.InterfaceC4903s2
    public final float zzf() {
        throw null;
    }

    @Override // com.google.android.gms.ads.internal.client.InterfaceC4903s2
    public final float zzg() {
        throw null;
    }

    @Override // com.google.android.gms.ads.internal.client.InterfaceC4903s2
    public final InterfaceC4921v2 zzi() {
        InterfaceC4921v2 c4909t2;
        Parcel zzbl = zzbl(11, zza());
        IBinder readStrongBinder = zzbl.readStrongBinder();
        if (readStrongBinder == null) {
            c4909t2 = null;
        } else {
            IInterface queryLocalInterface = readStrongBinder.queryLocalInterface("com.google.android.gms.ads.internal.client.IVideoLifecycleCallbacks");
            c4909t2 = queryLocalInterface instanceof InterfaceC4921v2 ? (InterfaceC4921v2) queryLocalInterface : new C4909t2(readStrongBinder);
        }
        zzbl.recycle();
        return c4909t2;
    }

    @Override // com.google.android.gms.ads.internal.client.InterfaceC4903s2
    public final void zzm(InterfaceC4921v2 interfaceC4921v2) {
        Parcel zza = zza();
        zzayi.zzf(zza, interfaceC4921v2);
        zzbm(8, zza);
    }
}

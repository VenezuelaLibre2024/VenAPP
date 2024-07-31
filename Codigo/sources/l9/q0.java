package l9;

import android.net.Uri;
import android.os.RemoteException;
import com.google.android.gms.internal.ads.zzbgc;
import com.google.android.gms.internal.ads.zzbxi;
import com.google.android.gms.internal.ads.zzcec;
import com.google.android.gms.internal.ads.zzfny;
import com.google.android.gms.internal.ads.zzgej;
import java.util.ArrayList;
import java.util.Iterator;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public final class q0 implements zzgej {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ zzbxi f21118a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ boolean f21119b;

    /* renamed from: c, reason: collision with root package name */
    final /* synthetic */ c f21120c;

    /* JADX INFO: Access modifiers changed from: package-private */
    public q0(c cVar, zzbxi zzbxiVar, boolean z10) {
        this.f21118a = zzbxiVar;
        this.f21119b = z10;
        this.f21120c = cVar;
    }

    @Override // com.google.android.gms.internal.ads.zzgej
    public final void zza(Throwable th2) {
        try {
            this.f21118a.zze("Internal error: " + th2.getMessage());
        } catch (RemoteException e10) {
            zzcec.zzh("", e10);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzgej
    public final /* bridge */ /* synthetic */ void zzb(Object obj) {
        boolean z10;
        String str;
        Uri G2;
        zzfny zzfnyVar;
        String uri;
        ArrayList arrayList = (ArrayList) obj;
        try {
            this.f21118a.zzf(arrayList);
            z10 = this.f21120c.A;
            if (z10 || this.f21119b) {
                Iterator it = arrayList.iterator();
                while (it.hasNext()) {
                    Uri uri2 = (Uri) it.next();
                    if (this.f21120c.x2(uri2)) {
                        str = this.f21120c.J;
                        G2 = c.G2(uri2, str, "1");
                        zzfnyVar = this.f21120c.f21055z;
                        uri = G2.toString();
                    } else {
                        if (((Boolean) com.google.android.gms.ads.internal.client.a0.c().zza(zzbgc.zzhx)).booleanValue()) {
                            zzfnyVar = this.f21120c.f21055z;
                            uri = uri2.toString();
                        }
                    }
                    zzfnyVar.zzc(uri, null);
                }
            }
        } catch (RemoteException e10) {
            zzcec.zzh("", e10);
        }
    }
}

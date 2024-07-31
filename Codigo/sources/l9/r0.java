package l9;

import android.net.Uri;
import android.os.RemoteException;
import com.google.android.gms.internal.ads.zzbgc;
import com.google.android.gms.internal.ads.zzbxi;
import com.google.android.gms.internal.ads.zzcec;
import com.google.android.gms.internal.ads.zzfny;
import com.google.android.gms.internal.ads.zzgej;
import java.util.List;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public final class r0 implements zzgej {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ zzbxi f21123a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ boolean f21124b;

    /* renamed from: c, reason: collision with root package name */
    final /* synthetic */ c f21125c;

    /* JADX INFO: Access modifiers changed from: package-private */
    public r0(c cVar, zzbxi zzbxiVar, boolean z10) {
        this.f21123a = zzbxiVar;
        this.f21124b = z10;
        this.f21125c = cVar;
    }

    @Override // com.google.android.gms.internal.ads.zzgej
    public final void zza(Throwable th2) {
        try {
            this.f21123a.zze("Internal error: " + th2.getMessage());
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
        List<Uri> list = (List) obj;
        try {
            c.n2(this.f21125c, list);
            this.f21123a.zzf(list);
            z10 = this.f21125c.B;
            if (z10 || this.f21124b) {
                for (Uri uri2 : list) {
                    if (this.f21125c.w2(uri2)) {
                        str = this.f21125c.J;
                        G2 = c.G2(uri2, str, "1");
                        zzfnyVar = this.f21125c.f21055z;
                        uri = G2.toString();
                    } else {
                        if (((Boolean) com.google.android.gms.ads.internal.client.a0.c().zza(zzbgc.zzhx)).booleanValue()) {
                            zzfnyVar = this.f21125c.f21055z;
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

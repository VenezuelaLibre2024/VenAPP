package p218l9;

import android.net.Uri;
import android.os.RemoteException;
import com.google.android.gms.ads.internal.client.C4784a0;
import com.google.android.gms.internal.ads.zzbgc;
import com.google.android.gms.internal.ads.zzbxi;
import com.google.android.gms.internal.ads.zzcec;
import com.google.android.gms.internal.ads.zzfny;
import com.google.android.gms.internal.ads.zzgej;
import java.util.ArrayList;
import java.util.Iterator;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: l9.q0 */
/* loaded from: classes.dex */
public final class C9444q0 implements zzgej {

    /* renamed from: a */
    final /* synthetic */ zzbxi f22971a;

    /* renamed from: b */
    final /* synthetic */ boolean f22972b;

    /* renamed from: c */
    final /* synthetic */ BinderC9415c f22973c;

    /* JADX INFO: Access modifiers changed from: package-private */
    public C9444q0(BinderC9415c binderC9415c, zzbxi zzbxiVar, boolean z10) {
        this.f22971a = zzbxiVar;
        this.f22972b = z10;
        this.f22973c = binderC9415c;
    }

    @Override // com.google.android.gms.internal.ads.zzgej
    public final void zza(Throwable th2) {
        try {
            this.f22971a.zze("Internal error: " + th2.getMessage());
        } catch (RemoteException e10) {
            zzcec.zzh("", e10);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzgej
    public final /* bridge */ /* synthetic */ void zzb(Object obj) {
        boolean z10;
        String str;
        Uri m28052G2;
        zzfny zzfnyVar;
        String uri;
        ArrayList arrayList = (ArrayList) obj;
        try {
            this.f22971a.zzf(arrayList);
            z10 = this.f22973c.f22876A;
            if (z10 || this.f22972b) {
                Iterator it = arrayList.iterator();
                while (it.hasNext()) {
                    Uri uri2 = (Uri) it.next();
                    if (this.f22973c.m28089x2(uri2)) {
                        str = this.f22973c.f22885J;
                        m28052G2 = BinderC9415c.m28052G2(uri2, str, "1");
                        zzfnyVar = this.f22973c.f22908z;
                        uri = m28052G2.toString();
                    } else {
                        if (((Boolean) C4784a0.m12365c().zza(zzbgc.zzhx)).booleanValue()) {
                            zzfnyVar = this.f22973c.f22908z;
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

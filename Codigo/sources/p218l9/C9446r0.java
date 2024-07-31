package p218l9;

import android.net.Uri;
import android.os.RemoteException;
import com.google.android.gms.ads.internal.client.C4784a0;
import com.google.android.gms.internal.ads.zzbgc;
import com.google.android.gms.internal.ads.zzbxi;
import com.google.android.gms.internal.ads.zzcec;
import com.google.android.gms.internal.ads.zzfny;
import com.google.android.gms.internal.ads.zzgej;
import java.util.List;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: l9.r0 */
/* loaded from: classes.dex */
public final class C9446r0 implements zzgej {

    /* renamed from: a */
    final /* synthetic */ zzbxi f22976a;

    /* renamed from: b */
    final /* synthetic */ boolean f22977b;

    /* renamed from: c */
    final /* synthetic */ BinderC9415c f22978c;

    /* JADX INFO: Access modifiers changed from: package-private */
    public C9446r0(BinderC9415c binderC9415c, zzbxi zzbxiVar, boolean z10) {
        this.f22976a = zzbxiVar;
        this.f22977b = z10;
        this.f22978c = binderC9415c;
    }

    @Override // com.google.android.gms.internal.ads.zzgej
    public final void zza(Throwable th2) {
        try {
            this.f22976a.zze("Internal error: " + th2.getMessage());
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
        List<Uri> list = (List) obj;
        try {
            BinderC9415c.m28070n2(this.f22978c, list);
            this.f22976a.zzf(list);
            z10 = this.f22978c.f22877B;
            if (z10 || this.f22977b) {
                for (Uri uri2 : list) {
                    if (this.f22978c.m28088w2(uri2)) {
                        str = this.f22978c.f22885J;
                        m28052G2 = BinderC9415c.m28052G2(uri2, str, "1");
                        zzfnyVar = this.f22978c.f22908z;
                        uri = m28052G2.toString();
                    } else {
                        if (((Boolean) C4784a0.m12365c().zza(zzbgc.zzhx)).booleanValue()) {
                            zzfnyVar = this.f22978c.f22908z;
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

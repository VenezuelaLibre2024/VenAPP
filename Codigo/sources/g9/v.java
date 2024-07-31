package g9;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import com.google.android.gms.ads.internal.overlay.AdOverlayInfoParcel;
import com.google.android.gms.ads.internal.util.j2;
import com.google.android.gms.internal.ads.zzdiu;

/* loaded from: classes.dex */
public final class v {
    public static final void a(Context context, AdOverlayInfoParcel adOverlayInfoParcel, boolean z10) {
        if (adOverlayInfoParcel.f8892v != 4 || adOverlayInfoParcel.f8884c != null) {
            Intent intent = new Intent();
            intent.setClassName(context, "com.google.android.gms.ads.AdActivity");
            intent.putExtra("com.google.android.gms.ads.internal.overlay.useClientJar", adOverlayInfoParcel.f8894x.zzd);
            intent.putExtra("shouldCallOnOverlayOpened", z10);
            Bundle bundle = new Bundle(1);
            bundle.putParcelable("com.google.android.gms.ads.inernal.overlay.AdOverlayInfo", adOverlayInfoParcel);
            intent.putExtra("com.google.android.gms.ads.inernal.overlay.AdOverlayInfo", bundle);
            if (!la.p.f()) {
                intent.addFlags(524288);
            }
            if (!(context instanceof Activity)) {
                intent.addFlags(268435456);
            }
            com.google.android.gms.ads.internal.t.r();
            j2.s(context, intent);
            return;
        }
        com.google.android.gms.ads.internal.client.a aVar = adOverlayInfoParcel.f8883b;
        if (aVar != null) {
            aVar.onAdClicked();
        }
        zzdiu zzdiuVar = adOverlayInfoParcel.F;
        if (zzdiuVar != null) {
            zzdiuVar.zzs();
        }
        Activity zzi = adOverlayInfoParcel.f8885d.zzi();
        j jVar = adOverlayInfoParcel.f8882a;
        if (jVar != null && jVar.f16131u && zzi != null) {
            context = zzi;
        }
        com.google.android.gms.ads.internal.t.j();
        j jVar2 = adOverlayInfoParcel.f8882a;
        a.b(context, jVar2, adOverlayInfoParcel.f8890t, jVar2 != null ? jVar2.f16130t : null);
    }
}

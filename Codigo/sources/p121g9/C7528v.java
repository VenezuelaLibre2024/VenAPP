package p121g9;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import com.google.android.gms.ads.internal.C4965t;
import com.google.android.gms.ads.internal.client.InterfaceC4783a;
import com.google.android.gms.ads.internal.overlay.AdOverlayInfoParcel;
import com.google.android.gms.ads.internal.util.C5005j2;
import com.google.android.gms.internal.ads.zzdiu;
import la.C9471p;

/* renamed from: g9.v */
/* loaded from: classes.dex */
public final class C7528v {
    /* renamed from: a */
    public static final void m22864a(Context context, AdOverlayInfoParcel adOverlayInfoParcel, boolean z10) {
        if (adOverlayInfoParcel.f9987v != 4 || adOverlayInfoParcel.f9979c != null) {
            Intent intent = new Intent();
            intent.setClassName(context, "com.google.android.gms.ads.AdActivity");
            intent.putExtra("com.google.android.gms.ads.internal.overlay.useClientJar", adOverlayInfoParcel.f9989x.zzd);
            intent.putExtra("shouldCallOnOverlayOpened", z10);
            Bundle bundle = new Bundle(1);
            bundle.putParcelable("com.google.android.gms.ads.inernal.overlay.AdOverlayInfo", adOverlayInfoParcel);
            intent.putExtra("com.google.android.gms.ads.inernal.overlay.AdOverlayInfo", bundle);
            if (!C9471p.m28169f()) {
                intent.addFlags(524288);
            }
            if (!(context instanceof Activity)) {
                intent.addFlags(268435456);
            }
            C4965t.m12581r();
            C5005j2.m12680s(context, intent);
            return;
        }
        InterfaceC4783a interfaceC4783a = adOverlayInfoParcel.f9978b;
        if (interfaceC4783a != null) {
            interfaceC4783a.onAdClicked();
        }
        zzdiu zzdiuVar = adOverlayInfoParcel.f9974F;
        if (zzdiuVar != null) {
            zzdiuVar.zzs();
        }
        Activity zzi = adOverlayInfoParcel.f9980d.zzi();
        C7516j c7516j = adOverlayInfoParcel.f9977a;
        if (c7516j != null && c7516j.f17760u && zzi != null) {
            context = zzi;
        }
        C4965t.m12573j();
        C7516j c7516j2 = adOverlayInfoParcel.f9977a;
        C7500a.m22840b(context, c7516j2, adOverlayInfoParcel.f9985t, c7516j2 != null ? c7516j2.f17759t : null);
    }
}

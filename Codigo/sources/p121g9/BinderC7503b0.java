package p121g9;

import android.app.Activity;
import android.os.Bundle;
import com.google.android.gms.ads.internal.util.C5047u1;

/* renamed from: g9.b0 */
/* loaded from: classes.dex */
public final class BinderC7503b0 extends BinderC7527u {
    public BinderC7503b0(Activity activity) {
        super(activity);
    }

    @Override // p121g9.BinderC7527u, com.google.android.gms.internal.ads.zzbwt
    public final void zzl(Bundle bundle) {
        C5047u1.m12726a("AdOverlayParcel is null or does not contain valid overlay type.");
        this.f17780G = 4;
        this.f17781a.finish();
    }
}

package g9;

import android.app.Activity;
import android.os.Bundle;
import com.google.android.gms.ads.internal.util.u1;

/* loaded from: classes.dex */
public final class b0 extends u {
    public b0(Activity activity) {
        super(activity);
    }

    @Override // g9.u, com.google.android.gms.internal.ads.zzbwt
    public final void zzl(Bundle bundle) {
        u1.a("AdOverlayParcel is null or does not contain valid overlay type.");
        this.G = 4;
        this.f16144a.finish();
    }
}

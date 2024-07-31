package ia;

import android.os.IBinder;
import android.os.Parcel;
import com.google.android.gms.internal.base.zaa;
import com.google.android.gms.internal.base.zac;

/* loaded from: classes.dex */
public final class i extends zaa {
    /* JADX INFO: Access modifiers changed from: package-private */
    public i(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.common.moduleinstall.internal.IModuleInstallService");
    }

    public final void f2(h hVar, a aVar) {
        Parcel zaa = zaa();
        zac.zae(zaa, hVar);
        zac.zad(zaa, aVar);
        zac(1, zaa);
    }

    public final void g2(h hVar, a aVar, k kVar) {
        Parcel zaa = zaa();
        zac.zae(zaa, hVar);
        zac.zad(zaa, aVar);
        zac.zae(zaa, kVar);
        zac(2, zaa);
    }

    public final void h2(com.google.android.gms.common.api.internal.h hVar, k kVar) {
        Parcel zaa = zaa();
        zac.zae(zaa, hVar);
        zac.zae(zaa, kVar);
        zac(6, zaa);
    }
}

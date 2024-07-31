package fa;

import android.os.IBinder;
import android.os.Parcel;
import com.google.android.gms.common.internal.w;
import com.google.android.gms.internal.base.zaa;
import com.google.android.gms.internal.base.zac;

/* loaded from: classes.dex */
public final class a extends zaa {
    /* JADX INFO: Access modifiers changed from: package-private */
    public a(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.common.internal.service.IClientTelemetryService");
    }

    public final void f2(w wVar) {
        Parcel zaa = zaa();
        zac.zad(zaa, wVar);
        zad(1, zaa);
    }
}

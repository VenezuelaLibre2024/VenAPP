package wa;

import android.content.Context;
import android.content.Intent;
import com.google.android.gms.measurement.internal.n4;
import com.google.android.gms.measurement.internal.w5;

/* loaded from: classes2.dex */
public final class n {

    /* renamed from: a, reason: collision with root package name */
    private final a f29740a;

    /* loaded from: classes2.dex */
    public interface a {
        void a(Context context, Intent intent);
    }

    public n(a aVar) {
        com.google.android.gms.common.internal.s.j(aVar);
        this.f29740a = aVar;
    }

    public final void a(Context context, Intent intent) {
        n4 zzj = w5.a(context, null, null).zzj();
        if (intent == null) {
            zzj.G().a("Receiver called with null intent");
            return;
        }
        String action = intent.getAction();
        zzj.F().b("Local receiver got", action);
        if (!"com.google.android.gms.measurement.UPLOAD".equals(action)) {
            if ("com.android.vending.INSTALL_REFERRER".equals(action)) {
                zzj.G().a("Install Referrer Broadcasts are deprecated");
            }
        } else {
            Intent className = new Intent().setClassName(context, "com.google.android.gms.measurement.AppMeasurementService");
            className.setAction("com.google.android.gms.measurement.UPLOAD");
            zzj.F().a("Starting wakeful intent.");
            this.f29740a.a(context, className);
        }
    }
}

package p418wa;

import android.content.Context;
import android.content.Intent;
import com.google.android.gms.common.internal.C5276s;
import com.google.android.gms.measurement.internal.C5595n4;
import com.google.android.gms.measurement.internal.C5712w5;

/* renamed from: wa.n */
/* loaded from: classes2.dex */
public final class C12116n {

    /* renamed from: a */
    private final a f32205a;

    /* renamed from: wa.n$a */
    /* loaded from: classes2.dex */
    public interface a {
        /* renamed from: a */
        void mo13580a(Context context, Intent intent);
    }

    public C12116n(a aVar) {
        C5276s.m13324j(aVar);
        this.f32205a = aVar;
    }

    /* renamed from: a */
    public final void m38851a(Context context, Intent intent) {
        C5595n4 zzj = C5712w5.m14488a(context, null, null).zzj();
        if (intent == null) {
            zzj.m14187G().m14218a("Receiver called with null intent");
            return;
        }
        String action = intent.getAction();
        zzj.m14186F().m14219b("Local receiver got", action);
        if (!"com.google.android.gms.measurement.UPLOAD".equals(action)) {
            if ("com.android.vending.INSTALL_REFERRER".equals(action)) {
                zzj.m14187G().m14218a("Install Referrer Broadcasts are deprecated");
            }
        } else {
            Intent className = new Intent().setClassName(context, "com.google.android.gms.measurement.AppMeasurementService");
            className.setAction("com.google.android.gms.measurement.UPLOAD");
            zzj.m14186F().m14218a("Starting wakeful intent.");
            this.f32205a.mo13580a(context, className);
        }
    }
}

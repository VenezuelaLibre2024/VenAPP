package p418wa;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import com.google.android.gms.internal.measurement.zzpg;
import com.google.android.gms.measurement.internal.C5474e0;
import com.google.android.gms.measurement.internal.C5712w5;

/* renamed from: wa.i0 */
/* loaded from: classes2.dex */
public final class C12110i0 extends BroadcastReceiver {

    /* renamed from: a */
    private final C5712w5 f32204a;

    public C12110i0(C5712w5 c5712w5) {
        this.f32204a = c5712w5;
    }

    @Override // android.content.BroadcastReceiver
    public final void onReceive(Context context, Intent intent) {
        if (intent == null) {
            this.f32204a.zzj().m14187G().m14218a("App receiver called with null intent");
            return;
        }
        String action = intent.getAction();
        if (action == null) {
            this.f32204a.zzj().m14187G().m14218a("App receiver called with null action");
            return;
        }
        if (!action.equals("com.google.android.gms.measurement.TRIGGERS_AVAILABLE")) {
            this.f32204a.zzj().m14187G().m14218a("App receiver called with unknown action");
            return;
        }
        final C5712w5 c5712w5 = this.f32204a;
        if (zzpg.zza() && c5712w5.m14521u().m13911y(null, C5474e0.f11232M0)) {
            c5712w5.zzj().m14186F().m14218a("App receiver notified triggers are available");
            c5712w5.zzl().m14248y(new Runnable() { // from class: com.google.android.gms.measurement.internal.nb
                @Override // java.lang.Runnable
                public final void run() {
                    C5712w5 c5712w52 = C5712w5.this;
                    if (!c5712w52.m14500G().m14028Q0()) {
                        c5712w52.zzj().m14187G().m14218a("registerTrigger called but app not eligible");
                        return;
                    }
                    final C5442b7 m14496C = c5712w52.m14496C();
                    m14496C.getClass();
                    new Thread(new Runnable() { // from class: com.google.android.gms.measurement.internal.ob
                        @Override // java.lang.Runnable
                        public final void run() {
                            C5442b7.this.m13692k0();
                        }
                    }).start();
                }
            });
        }
    }
}

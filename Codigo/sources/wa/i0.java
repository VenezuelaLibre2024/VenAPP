package wa;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import com.google.android.gms.internal.measurement.zzpg;
import com.google.android.gms.measurement.internal.w5;

/* loaded from: classes2.dex */
public final class i0 extends BroadcastReceiver {

    /* renamed from: a, reason: collision with root package name */
    private final w5 f29739a;

    public i0(w5 w5Var) {
        this.f29739a = w5Var;
    }

    @Override // android.content.BroadcastReceiver
    public final void onReceive(Context context, Intent intent) {
        if (intent == null) {
            this.f29739a.zzj().G().a("App receiver called with null intent");
            return;
        }
        String action = intent.getAction();
        if (action == null) {
            this.f29739a.zzj().G().a("App receiver called with null action");
            return;
        }
        if (!action.equals("com.google.android.gms.measurement.TRIGGERS_AVAILABLE")) {
            this.f29739a.zzj().G().a("App receiver called with unknown action");
            return;
        }
        final w5 w5Var = this.f29739a;
        if (zzpg.zza() && w5Var.u().y(null, com.google.android.gms.measurement.internal.e0.M0)) {
            w5Var.zzj().F().a("App receiver notified triggers are available");
            w5Var.zzl().y(new Runnable() { // from class: com.google.android.gms.measurement.internal.nb
                @Override // java.lang.Runnable
                public final void run() {
                    w5 w5Var2 = w5.this;
                    if (!w5Var2.G().Q0()) {
                        w5Var2.zzj().G().a("registerTrigger called but app not eligible");
                        return;
                    }
                    final b7 C = w5Var2.C();
                    C.getClass();
                    new Thread(new Runnable() { // from class: com.google.android.gms.measurement.internal.ob
                        @Override // java.lang.Runnable
                        public final void run() {
                            b7.this.k0();
                        }
                    }).start();
                }
            });
        }
    }
}

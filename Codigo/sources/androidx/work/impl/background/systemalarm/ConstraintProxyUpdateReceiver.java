package androidx.work.impl.background.systemalarm;

import android.content.BroadcastReceiver;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import androidx.work.impl.background.systemalarm.ConstraintProxy;
import androidx.work.impl.e0;
import f2.j;
import l2.q;

/* loaded from: classes.dex */
public class ConstraintProxyUpdateReceiver extends BroadcastReceiver {

    /* renamed from: a */
    static final String f5734a = j.i("ConstrntProxyUpdtRecvr");

    /* loaded from: classes.dex */
    class a implements Runnable {

        /* renamed from: a */
        final /* synthetic */ Intent f5735a;

        /* renamed from: b */
        final /* synthetic */ Context f5736b;

        /* renamed from: c */
        final /* synthetic */ BroadcastReceiver.PendingResult f5737c;

        a(Intent intent, Context context, BroadcastReceiver.PendingResult pendingResult) {
            this.f5735a = intent;
            this.f5736b = context;
            this.f5737c = pendingResult;
        }

        @Override // java.lang.Runnable
        public void run() {
            try {
                boolean booleanExtra = this.f5735a.getBooleanExtra("KEY_BATTERY_NOT_LOW_PROXY_ENABLED", false);
                boolean booleanExtra2 = this.f5735a.getBooleanExtra("KEY_BATTERY_CHARGING_PROXY_ENABLED", false);
                boolean booleanExtra3 = this.f5735a.getBooleanExtra("KEY_STORAGE_NOT_LOW_PROXY_ENABLED", false);
                boolean booleanExtra4 = this.f5735a.getBooleanExtra("KEY_NETWORK_STATE_PROXY_ENABLED", false);
                j.e().a(ConstraintProxyUpdateReceiver.f5734a, "Updating proxies: (BatteryNotLowProxy (" + booleanExtra + "), BatteryChargingProxy (" + booleanExtra2 + "), StorageNotLowProxy (" + booleanExtra3 + "), NetworkStateProxy (" + booleanExtra4 + "), ");
                q.a(this.f5736b, ConstraintProxy.BatteryNotLowProxy.class, booleanExtra);
                q.a(this.f5736b, ConstraintProxy.BatteryChargingProxy.class, booleanExtra2);
                q.a(this.f5736b, ConstraintProxy.StorageNotLowProxy.class, booleanExtra3);
                q.a(this.f5736b, ConstraintProxy.NetworkStateProxy.class, booleanExtra4);
            } finally {
                this.f5737c.finish();
            }
        }
    }

    public static Intent a(Context context, boolean z10, boolean z11, boolean z12, boolean z13) {
        Intent intent = new Intent("androidx.work.impl.background.systemalarm.UpdateProxies");
        intent.setComponent(new ComponentName(context, (Class<?>) ConstraintProxyUpdateReceiver.class));
        intent.putExtra("KEY_BATTERY_NOT_LOW_PROXY_ENABLED", z10).putExtra("KEY_BATTERY_CHARGING_PROXY_ENABLED", z11).putExtra("KEY_STORAGE_NOT_LOW_PROXY_ENABLED", z12).putExtra("KEY_NETWORK_STATE_PROXY_ENABLED", z13);
        return intent;
    }

    @Override // android.content.BroadcastReceiver
    public void onReceive(Context context, Intent intent) {
        String action = intent != null ? intent.getAction() : null;
        if ("androidx.work.impl.background.systemalarm.UpdateProxies".equals(action)) {
            e0.m(context).s().c(new a(intent, context, goAsync()));
            return;
        }
        j.e().a(f5734a, "Ignoring unknown action " + action);
    }
}

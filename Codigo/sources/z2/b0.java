package z2;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.location.LocationManager;
import io.flutter.plugin.common.EventChannel;

/* loaded from: classes.dex */
public class b0 extends BroadcastReceiver {

    /* renamed from: a, reason: collision with root package name */
    private final EventChannel.EventSink f32259a;

    /* renamed from: b, reason: collision with root package name */
    private f0 f32260b;

    public b0(EventChannel.EventSink eventSink) {
        this.f32259a = eventSink;
    }

    @Override // android.content.BroadcastReceiver
    public void onReceive(Context context, Intent intent) {
        f0 f0Var;
        if ("android.location.PROVIDERS_CHANGED".equals(intent.getAction())) {
            LocationManager locationManager = (LocationManager) context.getSystemService("location");
            boolean isProviderEnabled = locationManager.isProviderEnabled("gps");
            boolean isProviderEnabled2 = locationManager.isProviderEnabled("network");
            if (isProviderEnabled || isProviderEnabled2) {
                f0 f0Var2 = this.f32260b;
                if (f0Var2 != null && f0Var2 != f0.disabled) {
                    return;
                } else {
                    f0Var = f0.enabled;
                }
            } else {
                f0 f0Var3 = this.f32260b;
                if (f0Var3 != null && f0Var3 != f0.enabled) {
                    return;
                } else {
                    f0Var = f0.disabled;
                }
            }
            this.f32260b = f0Var;
            this.f32259a.success(Integer.valueOf(f0Var.ordinal()));
        }
    }
}

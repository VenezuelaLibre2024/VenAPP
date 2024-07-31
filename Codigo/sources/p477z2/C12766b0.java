package p477z2;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.location.LocationManager;
import io.flutter.plugin.common.EventChannel;

/* renamed from: z2.b0 */
/* loaded from: classes.dex */
public class C12766b0 extends BroadcastReceiver {

    /* renamed from: a */
    private final EventChannel.EventSink f34810a;

    /* renamed from: b */
    private EnumC12774f0 f34811b;

    public C12766b0(EventChannel.EventSink eventSink) {
        this.f34810a = eventSink;
    }

    @Override // android.content.BroadcastReceiver
    public void onReceive(Context context, Intent intent) {
        EnumC12774f0 enumC12774f0;
        if ("android.location.PROVIDERS_CHANGED".equals(intent.getAction())) {
            LocationManager locationManager = (LocationManager) context.getSystemService("location");
            boolean isProviderEnabled = locationManager.isProviderEnabled("gps");
            boolean isProviderEnabled2 = locationManager.isProviderEnabled("network");
            if (isProviderEnabled || isProviderEnabled2) {
                EnumC12774f0 enumC12774f02 = this.f34811b;
                if (enumC12774f02 != null && enumC12774f02 != EnumC12774f0.disabled) {
                    return;
                } else {
                    enumC12774f0 = EnumC12774f0.enabled;
                }
            } else {
                EnumC12774f0 enumC12774f03 = this.f34811b;
                if (enumC12774f03 != null && enumC12774f03 != EnumC12774f0.enabled) {
                    return;
                } else {
                    enumC12774f0 = EnumC12774f0.disabled;
                }
            }
            this.f34811b = enumC12774f0;
            this.f34810a.success(Integer.valueOf(enumC12774f0.ordinal()));
        }
    }
}

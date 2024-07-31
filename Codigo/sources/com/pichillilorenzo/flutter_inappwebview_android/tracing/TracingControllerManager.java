package com.pichillilorenzo.flutter_inappwebview_android.tracing;

import com.pichillilorenzo.flutter_inappwebview_android.InAppWebViewFlutterPlugin;
import com.pichillilorenzo.flutter_inappwebview_android.types.Disposable;
import e2.k;
import e2.l;
import e2.t;
import io.flutter.plugin.common.MethodChannel;

/* loaded from: classes3.dex */
public class TracingControllerManager implements Disposable {
    protected static final String LOG_TAG = "TracingControllerMan";
    public static final String METHOD_CHANNEL_NAME = "com.pichillilorenzo/flutter_inappwebview_tracingcontroller";
    public static l tracingController;
    public TracingControllerChannelDelegate channelDelegate;
    public InAppWebViewFlutterPlugin plugin;

    public TracingControllerManager(InAppWebViewFlutterPlugin inAppWebViewFlutterPlugin) {
        this.plugin = inAppWebViewFlutterPlugin;
        this.channelDelegate = new TracingControllerChannelDelegate(this, new MethodChannel(inAppWebViewFlutterPlugin.messenger, METHOD_CHANNEL_NAME));
    }

    public static k buildTracingConfig(TracingSettings tracingSettings) {
        k.a aVar = new k.a();
        for (Object obj : tracingSettings.categories) {
            if (obj instanceof String) {
                aVar.b((String) obj);
            }
            if (obj instanceof Integer) {
                aVar.a(((Integer) obj).intValue());
            }
        }
        Integer num = tracingSettings.tracingMode;
        if (num != null) {
            aVar.d(num.intValue());
        }
        return aVar.c();
    }

    public static void init() {
        if (tracingController == null && t.a("TRACING_CONTROLLER_BASIC_USAGE")) {
            tracingController = l.a();
        }
    }

    @Override // com.pichillilorenzo.flutter_inappwebview_android.types.Disposable
    public void dispose() {
        TracingControllerChannelDelegate tracingControllerChannelDelegate = this.channelDelegate;
        if (tracingControllerChannelDelegate != null) {
            tracingControllerChannelDelegate.dispose();
            this.channelDelegate = null;
        }
        this.plugin = null;
    }
}

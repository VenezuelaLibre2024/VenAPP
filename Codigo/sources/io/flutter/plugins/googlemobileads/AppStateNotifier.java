package io.flutter.plugins.googlemobileads;

import androidx.lifecycle.f;
import androidx.lifecycle.i;
import androidx.lifecycle.k;
import androidx.lifecycle.w;
import io.flutter.plugin.common.BinaryMessenger;
import io.flutter.plugin.common.EventChannel;
import io.flutter.plugin.common.MethodCall;
import io.flutter.plugin.common.MethodChannel;

/* loaded from: classes3.dex */
final class AppStateNotifier implements i, MethodChannel.MethodCallHandler, EventChannel.StreamHandler {
    private static final String EVENT_CHANNEL_NAME = "plugins.flutter.io/google_mobile_ads/app_state_event";
    private static final String METHOD_CHANNEL_NAME = "plugins.flutter.io/google_mobile_ads/app_state_method";
    private final EventChannel eventChannel;
    private EventChannel.EventSink events;
    private final MethodChannel methodChannel;

    /* JADX INFO: Access modifiers changed from: package-private */
    public AppStateNotifier(BinaryMessenger binaryMessenger) {
        MethodChannel methodChannel = new MethodChannel(binaryMessenger, METHOD_CHANNEL_NAME);
        this.methodChannel = methodChannel;
        methodChannel.setMethodCallHandler(this);
        EventChannel eventChannel = new EventChannel(binaryMessenger, EVENT_CHANNEL_NAME);
        this.eventChannel = eventChannel;
        eventChannel.setStreamHandler(this);
    }

    @Override // io.flutter.plugin.common.EventChannel.StreamHandler
    public void onCancel(Object obj) {
        this.events = null;
    }

    @Override // io.flutter.plugin.common.EventChannel.StreamHandler
    public void onListen(Object obj, EventChannel.EventSink eventSink) {
        this.events = eventSink;
    }

    @Override // io.flutter.plugin.common.MethodChannel.MethodCallHandler
    public void onMethodCall(MethodCall methodCall, MethodChannel.Result result) {
        String str = methodCall.method;
        str.hashCode();
        if (str.equals("stop")) {
            stop();
        } else if (str.equals("start")) {
            start();
        } else {
            result.notImplemented();
        }
    }

    @Override // androidx.lifecycle.i
    public void onStateChanged(k kVar, f.a aVar) {
        EventChannel.EventSink eventSink;
        String str;
        if (aVar == f.a.ON_START && (eventSink = this.events) != null) {
            str = "foreground";
        } else if (aVar != f.a.ON_STOP || (eventSink = this.events) == null) {
            return;
        } else {
            str = "background";
        }
        eventSink.success(str);
    }

    void start() {
        w.l().getLifecycle().a(this);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void stop() {
        w.l().getLifecycle().c(this);
    }
}

package oi;

import android.os.Handler;
import android.os.Looper;
import io.flutter.plugin.common.BinaryMessenger;
import io.flutter.plugin.common.EventChannel;
import java.util.Map;

/* loaded from: classes3.dex */
public final class d implements EventChannel.StreamHandler {

    /* renamed from: a, reason: collision with root package name */
    private EventChannel.EventSink f22572a;

    /* renamed from: b, reason: collision with root package name */
    private final EventChannel f22573b;

    public d(BinaryMessenger binaryMessenger) {
        kotlin.jvm.internal.n.e(binaryMessenger, "binaryMessenger");
        EventChannel eventChannel = new EventChannel(binaryMessenger, "dev.steenbakker.mobile_scanner/scanner/event");
        this.f22573b = eventChannel;
        eventChannel.setStreamHandler(this);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void c(d this$0, Map event) {
        kotlin.jvm.internal.n.e(this$0, "this$0");
        kotlin.jvm.internal.n.e(event, "$event");
        EventChannel.EventSink eventSink = this$0.f22572a;
        if (eventSink != null) {
            eventSink.success(event);
        }
    }

    public final void b(final Map<String, ? extends Object> event) {
        kotlin.jvm.internal.n.e(event, "event");
        new Handler(Looper.getMainLooper()).post(new Runnable() { // from class: oi.c
            @Override // java.lang.Runnable
            public final void run() {
                d.c(d.this, event);
            }
        });
    }

    @Override // io.flutter.plugin.common.EventChannel.StreamHandler
    public void onCancel(Object obj) {
        this.f22572a = null;
    }

    @Override // io.flutter.plugin.common.EventChannel.StreamHandler
    public void onListen(Object obj, EventChannel.EventSink eventSink) {
        this.f22572a = eventSink;
    }
}

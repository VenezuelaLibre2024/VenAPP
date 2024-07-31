package p278oi;

import android.os.Handler;
import android.os.Looper;
import io.flutter.plugin.common.BinaryMessenger;
import io.flutter.plugin.common.EventChannel;
import java.util.Map;
import kotlin.jvm.internal.C9322n;

/* renamed from: oi.d */
/* loaded from: classes3.dex */
public final class C9955d implements EventChannel.StreamHandler {

    /* renamed from: a */
    private EventChannel.EventSink f24505a;

    /* renamed from: b */
    private final EventChannel f24506b;

    public C9955d(BinaryMessenger binaryMessenger) {
        C9322n.m27781e(binaryMessenger, "binaryMessenger");
        EventChannel eventChannel = new EventChannel(binaryMessenger, "dev.steenbakker.mobile_scanner/scanner/event");
        this.f24506b = eventChannel;
        eventChannel.setStreamHandler(this);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: c */
    public static final void m29750c(C9955d this$0, Map event) {
        C9322n.m27781e(this$0, "this$0");
        C9322n.m27781e(event, "$event");
        EventChannel.EventSink eventSink = this$0.f24505a;
        if (eventSink != null) {
            eventSink.success(event);
        }
    }

    /* renamed from: b */
    public final void m29751b(final Map<String, ? extends Object> event) {
        C9322n.m27781e(event, "event");
        new Handler(Looper.getMainLooper()).post(new Runnable() { // from class: oi.c
            @Override // java.lang.Runnable
            public final void run() {
                C9955d.m29750c(C9955d.this, event);
            }
        });
    }

    @Override // io.flutter.plugin.common.EventChannel.StreamHandler
    public void onCancel(Object obj) {
        this.f24505a = null;
    }

    @Override // io.flutter.plugin.common.EventChannel.StreamHandler
    public void onListen(Object obj, EventChannel.EventSink eventSink) {
        this.f24505a = eventSink;
    }
}

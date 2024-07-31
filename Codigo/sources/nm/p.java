package nm;

import dk.k0;
import io.flutter.plugin.common.EventChannel;
import java.util.HashMap;
import java.util.Map;

/* loaded from: classes3.dex */
public final class p implements EventChannel.StreamHandler {

    /* renamed from: a, reason: collision with root package name */
    private final EventChannel f22043a;

    /* renamed from: b, reason: collision with root package name */
    private EventChannel.EventSink f22044b;

    public p(EventChannel eventChannel) {
        kotlin.jvm.internal.n.e(eventChannel, "eventChannel");
        this.f22043a = eventChannel;
        eventChannel.setStreamHandler(this);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ void d(p pVar, String str, Map map, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            map = new HashMap();
        }
        pVar.c(str, map);
    }

    public final void a() {
        EventChannel.EventSink eventSink = this.f22044b;
        if (eventSink != null) {
            eventSink.endOfStream();
            onCancel(null);
        }
        this.f22043a.setStreamHandler(null);
    }

    public final void b(String str, String str2, Object obj) {
        EventChannel.EventSink eventSink = this.f22044b;
        if (eventSink != null) {
            eventSink.error(str, str2, obj);
        }
    }

    public final void c(String method, Map<String, ? extends Object> arguments) {
        Map n10;
        kotlin.jvm.internal.n.e(method, "method");
        kotlin.jvm.internal.n.e(arguments, "arguments");
        EventChannel.EventSink eventSink = this.f22044b;
        if (eventSink != null) {
            n10 = k0.n(arguments, new ck.m("event", method));
            eventSink.success(n10);
        }
    }

    @Override // io.flutter.plugin.common.EventChannel.StreamHandler
    public void onCancel(Object obj) {
        this.f22044b = null;
    }

    @Override // io.flutter.plugin.common.EventChannel.StreamHandler
    public void onListen(Object obj, EventChannel.EventSink eventSink) {
        this.f22044b = eventSink;
    }
}

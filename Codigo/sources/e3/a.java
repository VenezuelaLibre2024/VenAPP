package e3;

import io.flutter.plugin.common.EventChannel;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

/* loaded from: classes.dex */
public class a<T> implements EventChannel.StreamHandler {

    /* renamed from: a, reason: collision with root package name */
    private EventChannel.EventSink f14467a;

    /* renamed from: b, reason: collision with root package name */
    Map<String, T> f14468b = new HashMap();

    public void a(String str, T t10) {
        EventChannel.EventSink eventSink = this.f14467a;
        if (eventSink != null) {
            eventSink.success(t10);
        }
        this.f14468b.put(str, t10);
    }

    public void b() {
        this.f14468b.clear();
    }

    @Override // io.flutter.plugin.common.EventChannel.StreamHandler
    public void onCancel(Object obj) {
        this.f14467a = null;
    }

    @Override // io.flutter.plugin.common.EventChannel.StreamHandler
    public void onListen(Object obj, EventChannel.EventSink eventSink) {
        this.f14467a = eventSink;
        if (this.f14468b.isEmpty()) {
            return;
        }
        Iterator<T> it = this.f14468b.values().iterator();
        while (it.hasNext()) {
            eventSink.success(it.next());
        }
    }
}

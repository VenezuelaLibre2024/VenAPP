package p074e3;

import io.flutter.plugin.common.EventChannel;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

/* renamed from: e3.a */
/* loaded from: classes.dex */
public class C7119a<T> implements EventChannel.StreamHandler {

    /* renamed from: a */
    private EventChannel.EventSink f15839a;

    /* renamed from: b */
    Map<String, T> f15840b = new HashMap();

    /* renamed from: a */
    public void m21008a(String str, T t10) {
        EventChannel.EventSink eventSink = this.f15839a;
        if (eventSink != null) {
            eventSink.success(t10);
        }
        this.f15840b.put(str, t10);
    }

    /* renamed from: b */
    public void m21009b() {
        this.f15840b.clear();
    }

    @Override // io.flutter.plugin.common.EventChannel.StreamHandler
    public void onCancel(Object obj) {
        this.f15839a = null;
    }

    @Override // io.flutter.plugin.common.EventChannel.StreamHandler
    public void onListen(Object obj, EventChannel.EventSink eventSink) {
        this.f15839a = eventSink;
        if (this.f15840b.isEmpty()) {
            return;
        }
        Iterator<T> it = this.f15840b.values().iterator();
        while (it.hasNext()) {
            eventSink.success(it.next());
        }
    }
}

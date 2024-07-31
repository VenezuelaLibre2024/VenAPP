package p258nm;

import ck.C2028m;
import dk.C7018k0;
import io.flutter.plugin.common.EventChannel;
import java.util.HashMap;
import java.util.Map;
import kotlin.jvm.internal.C9322n;

/* renamed from: nm.p */
/* loaded from: classes3.dex */
public final class C9746p implements EventChannel.StreamHandler {

    /* renamed from: a */
    private final EventChannel f23976a;

    /* renamed from: b */
    private EventChannel.EventSink f23977b;

    public C9746p(EventChannel eventChannel) {
        C9322n.m27781e(eventChannel, "eventChannel");
        this.f23976a = eventChannel;
        eventChannel.setStreamHandler(this);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: d */
    public static /* synthetic */ void m29220d(C9746p c9746p, String str, Map map, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            map = new HashMap();
        }
        c9746p.m29223c(str, map);
    }

    /* renamed from: a */
    public final void m29221a() {
        EventChannel.EventSink eventSink = this.f23977b;
        if (eventSink != null) {
            eventSink.endOfStream();
            onCancel(null);
        }
        this.f23976a.setStreamHandler(null);
    }

    /* renamed from: b */
    public final void m29222b(String str, String str2, Object obj) {
        EventChannel.EventSink eventSink = this.f23977b;
        if (eventSink != null) {
            eventSink.error(str, str2, obj);
        }
    }

    /* renamed from: c */
    public final void m29223c(String method, Map<String, ? extends Object> arguments) {
        Map m20427n;
        C9322n.m27781e(method, "method");
        C9322n.m27781e(arguments, "arguments");
        EventChannel.EventSink eventSink = this.f23977b;
        if (eventSink != null) {
            m20427n = C7018k0.m20427n(arguments, new C2028m("event", method));
            eventSink.success(m20427n);
        }
    }

    @Override // io.flutter.plugin.common.EventChannel.StreamHandler
    public void onCancel(Object obj) {
        this.f23977b = null;
    }

    @Override // io.flutter.plugin.common.EventChannel.StreamHandler
    public void onListen(Object obj, EventChannel.EventSink eventSink) {
        this.f23977b = eventSink;
    }
}

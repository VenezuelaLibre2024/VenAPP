package io.flutter.plugins.firebase.appcheck;

import ec.e;
import io.flutter.plugin.common.EventChannel;
import io.flutter.plugins.firebase.auth.Constants;
import java.util.HashMap;

/* loaded from: classes3.dex */
public class TokenChannelStreamHandler implements EventChannel.StreamHandler {
    private final ec.e firebaseAppCheck;
    private e.a listener;

    public TokenChannelStreamHandler(ec.e eVar) {
        this.firebaseAppCheck = eVar;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void lambda$onListen$0(EventChannel.EventSink eventSink, ec.c cVar) {
        HashMap hashMap = new HashMap();
        hashMap.put(Constants.TOKEN, cVar.b());
        eventSink.success(hashMap);
    }

    @Override // io.flutter.plugin.common.EventChannel.StreamHandler
    public void onCancel(Object obj) {
        e.a aVar = this.listener;
        if (aVar != null) {
            this.firebaseAppCheck.h(aVar);
            this.listener = null;
        }
    }

    @Override // io.flutter.plugin.common.EventChannel.StreamHandler
    public void onListen(Object obj, final EventChannel.EventSink eventSink) {
        e.a aVar = new e.a() { // from class: io.flutter.plugins.firebase.appcheck.i
            @Override // ec.e.a
            public final void a(ec.c cVar) {
                TokenChannelStreamHandler.lambda$onListen$0(EventChannel.EventSink.this, cVar);
            }
        };
        this.listener = aVar;
        this.firebaseAppCheck.c(aVar);
    }
}

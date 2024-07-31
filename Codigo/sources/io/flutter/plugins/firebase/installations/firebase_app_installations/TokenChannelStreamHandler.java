package io.flutter.plugins.firebase.installations.firebase_app_installations;

import io.flutter.plugin.common.EventChannel;
import io.flutter.plugins.firebase.auth.Constants;
import java.util.HashMap;

/* loaded from: classes3.dex */
public class TokenChannelStreamHandler implements EventChannel.StreamHandler {
    private final com.google.firebase.installations.c firebaseInstallations;
    private ge.a listener;

    public TokenChannelStreamHandler(com.google.firebase.installations.c cVar) {
        this.firebaseInstallations = cVar;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void lambda$createTokenEventListener$0(EventChannel.EventSink eventSink, String str) {
        HashMap hashMap = new HashMap();
        hashMap.put(Constants.TOKEN, str);
        eventSink.success(hashMap);
    }

    ge.a createTokenEventListener(final EventChannel.EventSink eventSink) {
        return new ge.a() { // from class: io.flutter.plugins.firebase.installations.firebase_app_installations.h
            @Override // ge.a
            public final void a(String str) {
                TokenChannelStreamHandler.lambda$createTokenEventListener$0(EventChannel.EventSink.this, str);
            }
        };
    }

    @Override // io.flutter.plugin.common.EventChannel.StreamHandler
    public void onCancel(Object obj) {
        if (this.listener != null) {
            this.listener = null;
        }
    }

    @Override // io.flutter.plugin.common.EventChannel.StreamHandler
    public void onListen(Object obj, EventChannel.EventSink eventSink) {
        ge.a createTokenEventListener = createTokenEventListener(eventSink);
        this.listener = createTokenEventListener;
        this.firebaseInstallations.E(createTokenEventListener);
    }
}

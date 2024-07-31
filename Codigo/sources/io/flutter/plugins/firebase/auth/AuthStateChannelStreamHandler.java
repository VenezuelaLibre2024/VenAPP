package io.flutter.plugins.firebase.auth;

import com.google.firebase.auth.FirebaseAuth;
import io.flutter.plugin.common.EventChannel;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.atomic.AtomicBoolean;

/* loaded from: classes3.dex */
public class AuthStateChannelStreamHandler implements EventChannel.StreamHandler {
    private FirebaseAuth.a authStateListener;
    private final FirebaseAuth firebaseAuth;

    public AuthStateChannelStreamHandler(FirebaseAuth firebaseAuth) {
        this.firebaseAuth = firebaseAuth;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void lambda$onListen$0(AtomicBoolean atomicBoolean, Map map, EventChannel.EventSink eventSink, FirebaseAuth firebaseAuth) {
        if (atomicBoolean.get()) {
            atomicBoolean.set(false);
            return;
        }
        com.google.firebase.auth.a0 j10 = firebaseAuth.j();
        map.put(Constants.USER, j10 == null ? null : PigeonParser.parseFirebaseUser(j10).toList());
        eventSink.success(map);
    }

    @Override // io.flutter.plugin.common.EventChannel.StreamHandler
    public void onCancel(Object obj) {
        FirebaseAuth.a aVar = this.authStateListener;
        if (aVar != null) {
            this.firebaseAuth.p(aVar);
            this.authStateListener = null;
        }
    }

    @Override // io.flutter.plugin.common.EventChannel.StreamHandler
    public void onListen(Object obj, final EventChannel.EventSink eventSink) {
        final HashMap hashMap = new HashMap();
        hashMap.put("appName", this.firebaseAuth.i().q());
        final AtomicBoolean atomicBoolean = new AtomicBoolean(true);
        FirebaseAuth.a aVar = new FirebaseAuth.a() { // from class: io.flutter.plugins.firebase.auth.a
            @Override // com.google.firebase.auth.FirebaseAuth.a
            public final void a(FirebaseAuth firebaseAuth) {
                AuthStateChannelStreamHandler.lambda$onListen$0(atomicBoolean, hashMap, eventSink, firebaseAuth);
            }
        };
        this.authStateListener = aVar;
        this.firebaseAuth.b(aVar);
    }
}

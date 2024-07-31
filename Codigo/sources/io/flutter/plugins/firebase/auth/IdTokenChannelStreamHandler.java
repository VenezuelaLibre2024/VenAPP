package io.flutter.plugins.firebase.auth;

import com.google.firebase.auth.FirebaseAuth;
import io.flutter.plugin.common.EventChannel;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.atomic.AtomicBoolean;

/* loaded from: classes3.dex */
public class IdTokenChannelStreamHandler implements EventChannel.StreamHandler {
    private final FirebaseAuth firebaseAuth;
    private FirebaseAuth.b idTokenListener;

    public IdTokenChannelStreamHandler(FirebaseAuth firebaseAuth) {
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
        FirebaseAuth.b bVar = this.idTokenListener;
        if (bVar != null) {
            this.firebaseAuth.q(bVar);
            this.idTokenListener = null;
        }
    }

    @Override // io.flutter.plugin.common.EventChannel.StreamHandler
    public void onListen(Object obj, final EventChannel.EventSink eventSink) {
        final HashMap hashMap = new HashMap();
        hashMap.put("appName", this.firebaseAuth.i().q());
        final AtomicBoolean atomicBoolean = new AtomicBoolean(true);
        FirebaseAuth.b bVar = new FirebaseAuth.b() { // from class: io.flutter.plugins.firebase.auth.q2
            @Override // com.google.firebase.auth.FirebaseAuth.b
            public final void a(FirebaseAuth firebaseAuth) {
                IdTokenChannelStreamHandler.lambda$onListen$0(atomicBoolean, hashMap, eventSink, firebaseAuth);
            }
        };
        this.idTokenListener = bVar;
        this.firebaseAuth.c(bVar);
    }
}

package io.flutter.plugins.firebase.messaging;

import androidx.lifecycle.LiveData;
import com.google.firebase.messaging.r0;

/* loaded from: classes3.dex */
public class FlutterFirebaseRemoteMessageLiveData extends LiveData<r0> {
    private static FlutterFirebaseRemoteMessageLiveData instance;

    public static FlutterFirebaseRemoteMessageLiveData getInstance() {
        if (instance == null) {
            instance = new FlutterFirebaseRemoteMessageLiveData();
        }
        return instance;
    }

    public void postRemoteMessage(r0 r0Var) {
        postValue(r0Var);
    }
}

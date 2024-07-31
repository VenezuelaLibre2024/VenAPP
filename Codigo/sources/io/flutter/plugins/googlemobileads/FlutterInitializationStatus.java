package io.flutter.plugins.googlemobileads;

import e9.a;
import e9.b;
import java.util.HashMap;
import java.util.Map;

/* loaded from: classes3.dex */
class FlutterInitializationStatus {
    final Map<String, FlutterAdapterStatus> adapterStatuses;

    /* JADX INFO: Access modifiers changed from: package-private */
    public FlutterInitializationStatus(b bVar) {
        HashMap hashMap = new HashMap();
        for (Map.Entry<String, a> entry : bVar.getAdapterStatusMap().entrySet()) {
            hashMap.put(entry.getKey(), new FlutterAdapterStatus(entry.getValue()));
        }
        this.adapterStatuses = hashMap;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public FlutterInitializationStatus(Map<String, FlutterAdapterStatus> map) {
        this.adapterStatuses = map;
    }
}

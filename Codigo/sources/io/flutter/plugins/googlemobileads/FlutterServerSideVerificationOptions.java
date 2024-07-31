package io.flutter.plugins.googlemobileads;

import java.util.Objects;
import n9.e;

/* loaded from: classes3.dex */
class FlutterServerSideVerificationOptions {
    private final String customData;
    private final String userId;

    public FlutterServerSideVerificationOptions(String str, String str2) {
        this.userId = str;
        this.customData = str2;
    }

    public e asServerSideVerificationOptions() {
        e.a aVar = new e.a();
        String str = this.userId;
        if (str != null) {
            aVar.c(str);
        }
        String str2 = this.customData;
        if (str2 != null) {
            aVar.b(str2);
        }
        return aVar.a();
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof FlutterServerSideVerificationOptions)) {
            return false;
        }
        FlutterServerSideVerificationOptions flutterServerSideVerificationOptions = (FlutterServerSideVerificationOptions) obj;
        return Objects.equals(flutterServerSideVerificationOptions.userId, this.userId) && Objects.equals(flutterServerSideVerificationOptions.customData, this.customData);
    }

    public String getCustomData() {
        return this.customData;
    }

    public String getUserId() {
        return this.userId;
    }

    public int hashCode() {
        return Objects.hash(this.userId, this.customData);
    }
}

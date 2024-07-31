package oi;

import io.flutter.plugin.common.PluginRegistry;
import oi.x;

/* loaded from: classes3.dex */
public final class y implements PluginRegistry.RequestPermissionsResultListener {

    /* renamed from: a */
    private final x.b f22654a;

    /* renamed from: b */
    private boolean f22655b;

    public y(x.b resultCallback) {
        kotlin.jvm.internal.n.e(resultCallback, "resultCallback");
        this.f22654a = resultCallback;
    }

    @Override // io.flutter.plugin.common.PluginRegistry.RequestPermissionsResultListener
    public boolean onRequestPermissionsResult(int i10, String[] permissions, int[] grantResults) {
        kotlin.jvm.internal.n.e(permissions, "permissions");
        kotlin.jvm.internal.n.e(grantResults, "grantResults");
        if (this.f22655b || i10 != 1926) {
            return false;
        }
        this.f22655b = true;
        if ((grantResults.length == 0) || grantResults[0] != 0) {
            this.f22654a.onResult("CameraAccessDenied", "Camera access permission was denied.");
        } else {
            this.f22654a.onResult(null, null);
        }
        return true;
    }
}

package p278oi;

import io.flutter.plugin.common.PluginRegistry;
import kotlin.jvm.internal.C9322n;
import p278oi.C9976x;

/* renamed from: oi.y */
/* loaded from: classes3.dex */
public final class C9977y implements PluginRegistry.RequestPermissionsResultListener {

    /* renamed from: a */
    private final C9976x.b f24587a;

    /* renamed from: b */
    private boolean f24588b;

    public C9977y(C9976x.b resultCallback) {
        C9322n.m27781e(resultCallback, "resultCallback");
        this.f24587a = resultCallback;
    }

    @Override // io.flutter.plugin.common.PluginRegistry.RequestPermissionsResultListener
    public boolean onRequestPermissionsResult(int i10, String[] permissions, int[] grantResults) {
        C9322n.m27781e(permissions, "permissions");
        C9322n.m27781e(grantResults, "grantResults");
        if (this.f24588b || i10 != 1926) {
            return false;
        }
        this.f24588b = true;
        if ((grantResults.length == 0) || grantResults[0] != 0) {
            this.f24587a.onResult("CameraAccessDenied", "Camera access permission was denied.");
        } else {
            this.f24587a.onResult(null, null);
        }
        return true;
    }
}

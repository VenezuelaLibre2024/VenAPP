package io.flutter.plugins.webviewflutter;

import android.webkit.PermissionRequest;
import io.flutter.plugin.common.BinaryMessenger;
import io.flutter.plugins.webviewflutter.GeneratedAndroidWebView;
import java.util.List;
import java.util.Objects;

/* loaded from: classes3.dex */
public class PermissionRequestHostApiImpl implements GeneratedAndroidWebView.PermissionRequestHostApi {
    private final BinaryMessenger binaryMessenger;
    private final InstanceManager instanceManager;

    public PermissionRequestHostApiImpl(BinaryMessenger binaryMessenger, InstanceManager instanceManager) {
        this.binaryMessenger = binaryMessenger;
        this.instanceManager = instanceManager;
    }

    private PermissionRequest getPermissionRequestInstance(Long l10) {
        PermissionRequest permissionRequest = (PermissionRequest) this.instanceManager.getInstance(l10.longValue());
        Objects.requireNonNull(permissionRequest);
        return permissionRequest;
    }

    @Override // io.flutter.plugins.webviewflutter.GeneratedAndroidWebView.PermissionRequestHostApi
    public void deny(Long l10) {
        getPermissionRequestInstance(l10).deny();
    }

    @Override // io.flutter.plugins.webviewflutter.GeneratedAndroidWebView.PermissionRequestHostApi
    public void grant(Long l10, List<String> list) {
        getPermissionRequestInstance(l10).grant((String[]) list.toArray(new String[0]));
    }
}

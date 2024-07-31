package io.flutter.plugins.webviewflutter;

import android.webkit.GeolocationPermissions;
import io.flutter.plugin.common.BinaryMessenger;
import io.flutter.plugins.webviewflutter.GeneratedAndroidWebView;
import java.util.Objects;

/* loaded from: classes3.dex */
public class GeolocationPermissionsCallbackHostApiImpl implements GeneratedAndroidWebView.GeolocationPermissionsCallbackHostApi {
    private final BinaryMessenger binaryMessenger;
    private final InstanceManager instanceManager;

    public GeolocationPermissionsCallbackHostApiImpl(BinaryMessenger binaryMessenger, InstanceManager instanceManager) {
        this.binaryMessenger = binaryMessenger;
        this.instanceManager = instanceManager;
    }

    private GeolocationPermissions.Callback getGeolocationPermissionsCallbackInstance(Long l10) {
        GeolocationPermissions.Callback callback = (GeolocationPermissions.Callback) this.instanceManager.getInstance(l10.longValue());
        Objects.requireNonNull(callback);
        return callback;
    }

    @Override // io.flutter.plugins.webviewflutter.GeneratedAndroidWebView.GeolocationPermissionsCallbackHostApi
    public void invoke(Long l10, String str, Boolean bool, Boolean bool2) {
        getGeolocationPermissionsCallbackInstance(l10).invoke(str, bool.booleanValue(), bool2.booleanValue());
    }
}
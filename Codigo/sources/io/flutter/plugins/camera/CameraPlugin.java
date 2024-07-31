package io.flutter.plugins.camera;

import android.app.Activity;
import io.flutter.embedding.engine.plugins.FlutterPlugin;
import io.flutter.embedding.engine.plugins.activity.ActivityAware;
import io.flutter.embedding.engine.plugins.activity.ActivityPluginBinding;
import io.flutter.plugin.common.BinaryMessenger;
import io.flutter.plugin.common.PluginRegistry;
import io.flutter.plugins.camera.CameraPermissions;
import io.flutter.view.TextureRegistry;

/* loaded from: classes3.dex */
public final class CameraPlugin implements FlutterPlugin, ActivityAware {
    private static final String TAG = "CameraPlugin";
    private FlutterPlugin.FlutterPluginBinding flutterPluginBinding;
    private MethodCallHandlerImpl methodCallHandler;

    private void maybeStartListening(Activity activity, BinaryMessenger binaryMessenger, CameraPermissions.PermissionsRegistry permissionsRegistry, TextureRegistry textureRegistry) {
        this.methodCallHandler = new MethodCallHandlerImpl(activity, binaryMessenger, new CameraPermissions(), permissionsRegistry, textureRegistry);
    }

    public static void registerWith(PluginRegistry.Registrar registrar) {
        new CameraPlugin().maybeStartListening(registrar.activity(), registrar.messenger(), new CameraPermissions.PermissionsRegistry() { // from class: io.flutter.plugins.camera.u
            public /* synthetic */ u() {
            }

            @Override // io.flutter.plugins.camera.CameraPermissions.PermissionsRegistry
            public final void addListener(PluginRegistry.RequestPermissionsResultListener requestPermissionsResultListener) {
                PluginRegistry.Registrar.this.addRequestPermissionsResultListener(requestPermissionsResultListener);
            }
        }, registrar.view());
    }

    @Override // io.flutter.embedding.engine.plugins.activity.ActivityAware
    public void onAttachedToActivity(ActivityPluginBinding activityPluginBinding) {
        maybeStartListening(activityPluginBinding.getActivity(), this.flutterPluginBinding.getBinaryMessenger(), new CameraPermissions.PermissionsRegistry() { // from class: io.flutter.plugins.camera.t
            public /* synthetic */ t() {
            }

            @Override // io.flutter.plugins.camera.CameraPermissions.PermissionsRegistry
            public final void addListener(PluginRegistry.RequestPermissionsResultListener requestPermissionsResultListener) {
                ActivityPluginBinding.this.addRequestPermissionsResultListener(requestPermissionsResultListener);
            }
        }, this.flutterPluginBinding.getTextureRegistry());
    }

    @Override // io.flutter.embedding.engine.plugins.FlutterPlugin
    public void onAttachedToEngine(FlutterPlugin.FlutterPluginBinding flutterPluginBinding) {
        this.flutterPluginBinding = flutterPluginBinding;
    }

    @Override // io.flutter.embedding.engine.plugins.activity.ActivityAware
    public void onDetachedFromActivity() {
        MethodCallHandlerImpl methodCallHandlerImpl = this.methodCallHandler;
        if (methodCallHandlerImpl != null) {
            methodCallHandlerImpl.stopListening();
            this.methodCallHandler = null;
        }
    }

    @Override // io.flutter.embedding.engine.plugins.activity.ActivityAware
    public void onDetachedFromActivityForConfigChanges() {
        onDetachedFromActivity();
    }

    @Override // io.flutter.embedding.engine.plugins.FlutterPlugin
    public void onDetachedFromEngine(FlutterPlugin.FlutterPluginBinding flutterPluginBinding) {
        this.flutterPluginBinding = null;
    }

    @Override // io.flutter.embedding.engine.plugins.activity.ActivityAware
    public void onReattachedToActivityForConfigChanges(ActivityPluginBinding activityPluginBinding) {
        onAttachedToActivity(activityPluginBinding);
    }
}

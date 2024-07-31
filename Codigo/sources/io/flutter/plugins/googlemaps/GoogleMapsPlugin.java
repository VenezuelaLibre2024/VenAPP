package io.flutter.plugins.googlemaps;

import android.app.Activity;
import android.app.Application;
import android.os.Bundle;
import androidx.lifecycle.f;
import androidx.lifecycle.k;
import androidx.lifecycle.l;
import io.flutter.embedding.engine.plugins.FlutterPlugin;
import io.flutter.embedding.engine.plugins.activity.ActivityAware;
import io.flutter.embedding.engine.plugins.activity.ActivityPluginBinding;
import io.flutter.embedding.engine.plugins.lifecycle.FlutterLifecycleAdapter;
import io.flutter.plugin.common.PluginRegistry;
import io.flutter.plugin.platform.PlatformViewRegistry;

/* loaded from: classes3.dex */
public class GoogleMapsPlugin implements FlutterPlugin, ActivityAware {
    private static final String VIEW_TYPE = "plugins.flutter.dev/google_maps_android";
    f lifecycle;

    /* loaded from: classes3.dex */
    private static final class ProxyLifecycleProvider implements Application.ActivityLifecycleCallbacks, k, LifecycleProvider {
        private final l lifecycle = new l(this);
        private final int registrarActivityHashCode;

        ProxyLifecycleProvider(Activity activity) {
            this.registrarActivityHashCode = activity.hashCode();
            activity.getApplication().registerActivityLifecycleCallbacks(this);
        }

        @Override // androidx.lifecycle.k
        public f getLifecycle() {
            return this.lifecycle;
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityCreated(Activity activity, Bundle bundle) {
            if (activity.hashCode() != this.registrarActivityHashCode) {
                return;
            }
            this.lifecycle.h(f.a.ON_CREATE);
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityDestroyed(Activity activity) {
            if (activity.hashCode() != this.registrarActivityHashCode) {
                return;
            }
            activity.getApplication().unregisterActivityLifecycleCallbacks(this);
            this.lifecycle.h(f.a.ON_DESTROY);
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityPaused(Activity activity) {
            if (activity.hashCode() != this.registrarActivityHashCode) {
                return;
            }
            this.lifecycle.h(f.a.ON_PAUSE);
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityResumed(Activity activity) {
            if (activity.hashCode() != this.registrarActivityHashCode) {
                return;
            }
            this.lifecycle.h(f.a.ON_RESUME);
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityStarted(Activity activity) {
            if (activity.hashCode() != this.registrarActivityHashCode) {
                return;
            }
            this.lifecycle.h(f.a.ON_START);
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityStopped(Activity activity) {
            if (activity.hashCode() != this.registrarActivityHashCode) {
                return;
            }
            this.lifecycle.h(f.a.ON_STOP);
        }
    }

    public static void registerWith(PluginRegistry.Registrar registrar) {
        PlatformViewRegistry platformViewRegistry;
        GoogleMapFactory googleMapFactory;
        final Activity activity = registrar.activity();
        if (activity == null) {
            return;
        }
        if (activity instanceof k) {
            platformViewRegistry = registrar.platformViewRegistry();
            googleMapFactory = new GoogleMapFactory(registrar.messenger(), registrar.context(), new LifecycleProvider() { // from class: io.flutter.plugins.googlemaps.GoogleMapsPlugin.1
                @Override // io.flutter.plugins.googlemaps.LifecycleProvider
                public f getLifecycle() {
                    return ((k) activity).getLifecycle();
                }
            });
        } else {
            platformViewRegistry = registrar.platformViewRegistry();
            googleMapFactory = new GoogleMapFactory(registrar.messenger(), registrar.context(), new ProxyLifecycleProvider(activity));
        }
        platformViewRegistry.registerViewFactory(VIEW_TYPE, googleMapFactory);
    }

    @Override // io.flutter.embedding.engine.plugins.activity.ActivityAware
    public void onAttachedToActivity(ActivityPluginBinding activityPluginBinding) {
        this.lifecycle = FlutterLifecycleAdapter.getActivityLifecycle(activityPluginBinding);
    }

    @Override // io.flutter.embedding.engine.plugins.FlutterPlugin
    public void onAttachedToEngine(FlutterPlugin.FlutterPluginBinding flutterPluginBinding) {
        flutterPluginBinding.getPlatformViewRegistry().registerViewFactory(VIEW_TYPE, new GoogleMapFactory(flutterPluginBinding.getBinaryMessenger(), flutterPluginBinding.getApplicationContext(), new LifecycleProvider() { // from class: io.flutter.plugins.googlemaps.GoogleMapsPlugin.2
            @Override // io.flutter.plugins.googlemaps.LifecycleProvider
            public f getLifecycle() {
                return GoogleMapsPlugin.this.lifecycle;
            }
        }));
    }

    @Override // io.flutter.embedding.engine.plugins.activity.ActivityAware
    public void onDetachedFromActivity() {
        this.lifecycle = null;
    }

    @Override // io.flutter.embedding.engine.plugins.activity.ActivityAware
    public void onDetachedFromActivityForConfigChanges() {
        onDetachedFromActivity();
    }

    @Override // io.flutter.embedding.engine.plugins.FlutterPlugin
    public void onDetachedFromEngine(FlutterPlugin.FlutterPluginBinding flutterPluginBinding) {
    }

    @Override // io.flutter.embedding.engine.plugins.activity.ActivityAware
    public void onReattachedToActivityForConfigChanges(ActivityPluginBinding activityPluginBinding) {
        onAttachedToActivity(activityPluginBinding);
    }
}

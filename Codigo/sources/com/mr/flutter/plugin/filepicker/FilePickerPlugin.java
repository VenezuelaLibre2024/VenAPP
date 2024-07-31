package com.mr.flutter.plugin.filepicker;

import android.app.Activity;
import android.app.Application;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import androidx.lifecycle.DefaultLifecycleObserver;
import androidx.lifecycle.f;
import androidx.lifecycle.k;
import io.flutter.embedding.engine.plugins.FlutterPlugin;
import io.flutter.embedding.engine.plugins.activity.ActivityAware;
import io.flutter.embedding.engine.plugins.activity.ActivityPluginBinding;
import io.flutter.embedding.engine.plugins.lifecycle.FlutterLifecycleAdapter;
import io.flutter.plugin.common.BinaryMessenger;
import io.flutter.plugin.common.EventChannel;
import io.flutter.plugin.common.MethodCall;
import io.flutter.plugin.common.MethodChannel;
import io.flutter.plugin.common.PluginRegistry;
import java.util.ArrayList;
import java.util.HashMap;

/* loaded from: classes3.dex */
public class FilePickerPlugin implements MethodChannel.MethodCallHandler, FlutterPlugin, ActivityAware {

    /* renamed from: t */
    private static String f13495t = null;

    /* renamed from: u */
    private static boolean f13496u = false;

    /* renamed from: v */
    private static boolean f13497v = false;

    /* renamed from: a */
    private ActivityPluginBinding f13498a;

    /* renamed from: b */
    private com.mr.flutter.plugin.filepicker.b f13499b;

    /* renamed from: c */
    private Application f13500c;

    /* renamed from: d */
    private FlutterPlugin.FlutterPluginBinding f13501d;

    /* renamed from: e */
    private f f13502e;

    /* renamed from: f */
    private LifeCycleObserver f13503f;

    /* renamed from: r */
    private Activity f13504r;

    /* renamed from: s */
    private MethodChannel f13505s;

    /* loaded from: classes3.dex */
    public class LifeCycleObserver implements Application.ActivityLifecycleCallbacks, DefaultLifecycleObserver {

        /* renamed from: a */
        private final Activity f13506a;

        LifeCycleObserver(Activity activity) {
            this.f13506a = activity;
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityCreated(Activity activity, Bundle bundle) {
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityDestroyed(Activity activity) {
            if (this.f13506a != activity || activity.getApplicationContext() == null) {
                return;
            }
            ((Application) activity.getApplicationContext()).unregisterActivityLifecycleCallbacks(this);
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityPaused(Activity activity) {
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityResumed(Activity activity) {
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityStarted(Activity activity) {
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityStopped(Activity activity) {
        }

        @Override // androidx.lifecycle.DefaultLifecycleObserver
        public void onCreate(k kVar) {
        }

        @Override // androidx.lifecycle.DefaultLifecycleObserver
        public void onDestroy(k kVar) {
            onActivityDestroyed(this.f13506a);
        }

        @Override // androidx.lifecycle.DefaultLifecycleObserver
        public void onPause(k kVar) {
        }

        @Override // androidx.lifecycle.DefaultLifecycleObserver
        public void onResume(k kVar) {
        }

        @Override // androidx.lifecycle.DefaultLifecycleObserver
        public void onStart(k kVar) {
        }

        @Override // androidx.lifecycle.DefaultLifecycleObserver
        public void onStop(k kVar) {
            onActivityStopped(this.f13506a);
        }
    }

    /* loaded from: classes3.dex */
    public class a implements EventChannel.StreamHandler {
        a() {
        }

        @Override // io.flutter.plugin.common.EventChannel.StreamHandler
        public void onCancel(Object obj) {
            FilePickerPlugin.this.f13499b.n(null);
        }

        @Override // io.flutter.plugin.common.EventChannel.StreamHandler
        public void onListen(Object obj, EventChannel.EventSink eventSink) {
            FilePickerPlugin.this.f13499b.n(eventSink);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes3.dex */
    public static class b implements MethodChannel.Result {

        /* renamed from: a */
        private final MethodChannel.Result f13509a;

        /* renamed from: b */
        private final Handler f13510b = new Handler(Looper.getMainLooper());

        /* loaded from: classes3.dex */
        class a implements Runnable {

            /* renamed from: a */
            final /* synthetic */ Object f13511a;

            a(Object obj) {
                this.f13511a = obj;
            }

            @Override // java.lang.Runnable
            public void run() {
                b.this.f13509a.success(this.f13511a);
            }
        }

        /* renamed from: com.mr.flutter.plugin.filepicker.FilePickerPlugin$b$b */
        /* loaded from: classes3.dex */
        class RunnableC0193b implements Runnable {

            /* renamed from: a */
            final /* synthetic */ String f13513a;

            /* renamed from: b */
            final /* synthetic */ String f13514b;

            /* renamed from: c */
            final /* synthetic */ Object f13515c;

            RunnableC0193b(String str, String str2, Object obj) {
                this.f13513a = str;
                this.f13514b = str2;
                this.f13515c = obj;
            }

            @Override // java.lang.Runnable
            public void run() {
                b.this.f13509a.error(this.f13513a, this.f13514b, this.f13515c);
            }
        }

        /* loaded from: classes3.dex */
        class c implements Runnable {
            c() {
            }

            @Override // java.lang.Runnable
            public void run() {
                b.this.f13509a.notImplemented();
            }
        }

        b(MethodChannel.Result result) {
            this.f13509a = result;
        }

        @Override // io.flutter.plugin.common.MethodChannel.Result
        public void error(String str, String str2, Object obj) {
            this.f13510b.post(new RunnableC0193b(str, str2, obj));
        }

        @Override // io.flutter.plugin.common.MethodChannel.Result
        public void notImplemented() {
            this.f13510b.post(new c());
        }

        @Override // io.flutter.plugin.common.MethodChannel.Result
        public void success(Object obj) {
            this.f13510b.post(new a(obj));
        }
    }

    private static String b(String str) {
        str.hashCode();
        char c10 = 65535;
        switch (str.hashCode()) {
            case -1349088399:
                if (str.equals("custom")) {
                    c10 = 0;
                    break;
                }
                break;
            case 96748:
                if (str.equals("any")) {
                    c10 = 1;
                    break;
                }
                break;
            case 99469:
                if (str.equals("dir")) {
                    c10 = 2;
                    break;
                }
                break;
            case 93166550:
                if (str.equals("audio")) {
                    c10 = 3;
                    break;
                }
                break;
            case 100313435:
                if (str.equals("image")) {
                    c10 = 4;
                    break;
                }
                break;
            case 103772132:
                if (str.equals("media")) {
                    c10 = 5;
                    break;
                }
                break;
            case 112202875:
                if (str.equals("video")) {
                    c10 = 6;
                    break;
                }
                break;
        }
        switch (c10) {
            case 0:
            case 1:
                return "*/*";
            case 2:
                return "dir";
            case 3:
                return "audio/*";
            case 4:
                return "image/*";
            case 5:
                return "image/*,video/*";
            case 6:
                return "video/*";
            default:
                return null;
        }
    }

    private void c(BinaryMessenger binaryMessenger, Application application, Activity activity, PluginRegistry.Registrar registrar, ActivityPluginBinding activityPluginBinding) {
        this.f13504r = activity;
        this.f13500c = application;
        this.f13499b = new com.mr.flutter.plugin.filepicker.b(activity);
        MethodChannel methodChannel = new MethodChannel(binaryMessenger, "miguelruivo.flutter.plugins.filepicker");
        this.f13505s = methodChannel;
        methodChannel.setMethodCallHandler(this);
        new EventChannel(binaryMessenger, "miguelruivo.flutter.plugins.filepickerevent").setStreamHandler(new a());
        LifeCycleObserver lifeCycleObserver = new LifeCycleObserver(activity);
        this.f13503f = lifeCycleObserver;
        if (registrar != null) {
            application.registerActivityLifecycleCallbacks(lifeCycleObserver);
            registrar.addActivityResultListener(this.f13499b);
            registrar.addRequestPermissionsResultListener(this.f13499b);
        } else {
            activityPluginBinding.addActivityResultListener(this.f13499b);
            activityPluginBinding.addRequestPermissionsResultListener(this.f13499b);
            f activityLifecycle = FlutterLifecycleAdapter.getActivityLifecycle(activityPluginBinding);
            this.f13502e = activityLifecycle;
            activityLifecycle.a(this.f13503f);
        }
    }

    private void d() {
        this.f13498a.removeActivityResultListener(this.f13499b);
        this.f13498a.removeRequestPermissionsResultListener(this.f13499b);
        this.f13498a = null;
        LifeCycleObserver lifeCycleObserver = this.f13503f;
        if (lifeCycleObserver != null) {
            this.f13502e.c(lifeCycleObserver);
            this.f13500c.unregisterActivityLifecycleCallbacks(this.f13503f);
        }
        this.f13502e = null;
        this.f13499b.n(null);
        this.f13499b = null;
        this.f13505s.setMethodCallHandler(null);
        this.f13505s = null;
        this.f13500c = null;
    }

    @Override // io.flutter.embedding.engine.plugins.activity.ActivityAware
    public void onAttachedToActivity(ActivityPluginBinding activityPluginBinding) {
        this.f13498a = activityPluginBinding;
        c(this.f13501d.getBinaryMessenger(), (Application) this.f13501d.getApplicationContext(), this.f13498a.getActivity(), null, this.f13498a);
    }

    @Override // io.flutter.embedding.engine.plugins.FlutterPlugin
    public void onAttachedToEngine(FlutterPlugin.FlutterPluginBinding flutterPluginBinding) {
        this.f13501d = flutterPluginBinding;
    }

    @Override // io.flutter.embedding.engine.plugins.activity.ActivityAware
    public void onDetachedFromActivity() {
        d();
    }

    @Override // io.flutter.embedding.engine.plugins.activity.ActivityAware
    public void onDetachedFromActivityForConfigChanges() {
        onDetachedFromActivity();
    }

    @Override // io.flutter.embedding.engine.plugins.FlutterPlugin
    public void onDetachedFromEngine(FlutterPlugin.FlutterPluginBinding flutterPluginBinding) {
        this.f13501d = null;
    }

    @Override // io.flutter.plugin.common.MethodChannel.MethodCallHandler
    public void onMethodCall(MethodCall methodCall, MethodChannel.Result result) {
        String[] f10;
        String str;
        if (this.f13504r == null) {
            result.error("no_activity", "file picker plugin requires a foreground activity", null);
            return;
        }
        b bVar = new b(result);
        HashMap hashMap = (HashMap) methodCall.arguments;
        String str2 = methodCall.method;
        if (str2 != null && str2.equals("clear")) {
            bVar.success(Boolean.valueOf(c.a(this.f13504r.getApplicationContext())));
            return;
        }
        String b10 = b(methodCall.method);
        f13495t = b10;
        if (b10 == null) {
            bVar.notImplemented();
        } else if (b10 != "dir") {
            f13496u = ((Boolean) hashMap.get("allowMultipleSelection")).booleanValue();
            f13497v = ((Boolean) hashMap.get("withData")).booleanValue();
            f10 = c.f((ArrayList) hashMap.get("allowedExtensions"));
            str = methodCall.method;
            if (str == null && str.equals("custom") && (f10 == null || f10.length == 0)) {
                bVar.error("FilePicker", "Unsupported filter. Make sure that you are only using the extension without the dot, (ie., jpg instead of .jpg). This could also have happened because you are using an unsupported file extension.  If the problem persists, you may want to consider using FileType.all instead.", null);
                return;
            } else {
                this.f13499b.q(f13495t, f13496u, f13497v, f10, bVar);
            }
        }
        f10 = null;
        str = methodCall.method;
        if (str == null) {
        }
        this.f13499b.q(f13495t, f13496u, f13497v, f10, bVar);
    }

    @Override // io.flutter.embedding.engine.plugins.activity.ActivityAware
    public void onReattachedToActivityForConfigChanges(ActivityPluginBinding activityPluginBinding) {
        onAttachedToActivity(activityPluginBinding);
    }
}

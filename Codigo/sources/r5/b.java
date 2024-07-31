package r5;

import android.content.Context;
import io.flutter.embedding.engine.plugins.FlutterPlugin;
import io.flutter.embedding.engine.plugins.activity.ActivityAware;
import io.flutter.embedding.engine.plugins.activity.ActivityPluginBinding;
import io.flutter.plugin.common.BinaryMessenger;
import io.flutter.plugin.common.MethodChannel;
import io.flutter.plugin.common.PluginRegistry;
import kotlin.jvm.internal.n;
import r5.b;
import t5.g;
import y5.c;

/* loaded from: classes.dex */
public final class b implements FlutterPlugin, ActivityAware {

    /* renamed from: e, reason: collision with root package name */
    public static final a f24738e = new a(null);

    /* renamed from: a, reason: collision with root package name */
    private g f24739a;

    /* renamed from: b, reason: collision with root package name */
    private final c f24740b = new c();

    /* renamed from: c, reason: collision with root package name */
    private ActivityPluginBinding f24741c;

    /* renamed from: d, reason: collision with root package name */
    private PluginRegistry.RequestPermissionsResultListener f24742d;

    /* loaded from: classes.dex */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(kotlin.jvm.internal.g gVar) {
            this();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final boolean c(c permissionsUtils, int i10, String[] permissions, int[] grantResults) {
            n.e(permissionsUtils, "$permissionsUtils");
            n.e(permissions, "permissions");
            n.e(grantResults, "grantResults");
            permissionsUtils.a(i10, permissions, grantResults);
            return false;
        }

        public final PluginRegistry.RequestPermissionsResultListener b(final c permissionsUtils) {
            n.e(permissionsUtils, "permissionsUtils");
            return new PluginRegistry.RequestPermissionsResultListener() { // from class: r5.a
                @Override // io.flutter.plugin.common.PluginRegistry.RequestPermissionsResultListener
                public final boolean onRequestPermissionsResult(int i10, String[] strArr, int[] iArr) {
                    boolean c10;
                    c10 = b.a.c(c.this, i10, strArr, iArr);
                    return c10;
                }
            };
        }

        public final void d(g plugin, BinaryMessenger messenger) {
            n.e(plugin, "plugin");
            n.e(messenger, "messenger");
            new MethodChannel(messenger, "com.fluttercandies/photo_manager").setMethodCallHandler(plugin);
        }
    }

    private final void a(ActivityPluginBinding activityPluginBinding) {
        ActivityPluginBinding activityPluginBinding2 = this.f24741c;
        if (activityPluginBinding2 != null) {
            c(activityPluginBinding2);
        }
        this.f24741c = activityPluginBinding;
        g gVar = this.f24739a;
        if (gVar != null) {
            gVar.f(activityPluginBinding.getActivity());
        }
        b(activityPluginBinding);
    }

    private final void b(ActivityPluginBinding activityPluginBinding) {
        PluginRegistry.RequestPermissionsResultListener b10 = f24738e.b(this.f24740b);
        this.f24742d = b10;
        activityPluginBinding.addRequestPermissionsResultListener(b10);
        g gVar = this.f24739a;
        if (gVar != null) {
            activityPluginBinding.addActivityResultListener(gVar.g());
        }
    }

    private final void c(ActivityPluginBinding activityPluginBinding) {
        PluginRegistry.RequestPermissionsResultListener requestPermissionsResultListener = this.f24742d;
        if (requestPermissionsResultListener != null) {
            activityPluginBinding.removeRequestPermissionsResultListener(requestPermissionsResultListener);
        }
        g gVar = this.f24739a;
        if (gVar != null) {
            activityPluginBinding.removeActivityResultListener(gVar.g());
        }
    }

    @Override // io.flutter.embedding.engine.plugins.activity.ActivityAware
    public void onAttachedToActivity(ActivityPluginBinding binding) {
        n.e(binding, "binding");
        a(binding);
    }

    @Override // io.flutter.embedding.engine.plugins.FlutterPlugin
    public void onAttachedToEngine(FlutterPlugin.FlutterPluginBinding binding) {
        n.e(binding, "binding");
        Context applicationContext = binding.getApplicationContext();
        n.d(applicationContext, "getApplicationContext(...)");
        BinaryMessenger binaryMessenger = binding.getBinaryMessenger();
        n.d(binaryMessenger, "getBinaryMessenger(...)");
        g gVar = new g(applicationContext, binaryMessenger, null, this.f24740b);
        a aVar = f24738e;
        BinaryMessenger binaryMessenger2 = binding.getBinaryMessenger();
        n.d(binaryMessenger2, "getBinaryMessenger(...)");
        aVar.d(gVar, binaryMessenger2);
        this.f24739a = gVar;
    }

    @Override // io.flutter.embedding.engine.plugins.activity.ActivityAware
    public void onDetachedFromActivity() {
        ActivityPluginBinding activityPluginBinding = this.f24741c;
        if (activityPluginBinding != null) {
            c(activityPluginBinding);
        }
        g gVar = this.f24739a;
        if (gVar != null) {
            gVar.f(null);
        }
        this.f24741c = null;
    }

    @Override // io.flutter.embedding.engine.plugins.activity.ActivityAware
    public void onDetachedFromActivityForConfigChanges() {
        g gVar = this.f24739a;
        if (gVar != null) {
            gVar.f(null);
        }
    }

    @Override // io.flutter.embedding.engine.plugins.FlutterPlugin
    public void onDetachedFromEngine(FlutterPlugin.FlutterPluginBinding binding) {
        n.e(binding, "binding");
        this.f24739a = null;
    }

    @Override // io.flutter.embedding.engine.plugins.activity.ActivityAware
    public void onReattachedToActivityForConfigChanges(ActivityPluginBinding binding) {
        n.e(binding, "binding");
        a(binding);
    }
}

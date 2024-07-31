package p326r5;

import android.content.Context;
import io.flutter.embedding.engine.plugins.FlutterPlugin;
import io.flutter.embedding.engine.plugins.activity.ActivityAware;
import io.flutter.embedding.engine.plugins.activity.ActivityPluginBinding;
import io.flutter.plugin.common.BinaryMessenger;
import io.flutter.plugin.common.MethodChannel;
import io.flutter.plugin.common.PluginRegistry;
import kotlin.jvm.internal.C9315g;
import kotlin.jvm.internal.C9322n;
import p326r5.C10624b;
import p360t5.C10993g;
import p458y5.C12605c;

/* renamed from: r5.b */
/* loaded from: classes.dex */
public final class C10624b implements FlutterPlugin, ActivityAware {

    /* renamed from: e */
    public static final a f26852e = new a(null);

    /* renamed from: a */
    private C10993g f26853a;

    /* renamed from: b */
    private final C12605c f26854b = new C12605c();

    /* renamed from: c */
    private ActivityPluginBinding f26855c;

    /* renamed from: d */
    private PluginRegistry.RequestPermissionsResultListener f26856d;

    /* renamed from: r5.b$a */
    /* loaded from: classes.dex */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(C9315g c9315g) {
            this();
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: c */
        public static final boolean m32382c(C12605c permissionsUtils, int i10, String[] permissions, int[] grantResults) {
            C9322n.m27781e(permissionsUtils, "$permissionsUtils");
            C9322n.m27781e(permissions, "permissions");
            C9322n.m27781e(grantResults, "grantResults");
            permissionsUtils.m41459a(i10, permissions, grantResults);
            return false;
        }

        /* renamed from: b */
        public final PluginRegistry.RequestPermissionsResultListener m32383b(final C12605c permissionsUtils) {
            C9322n.m27781e(permissionsUtils, "permissionsUtils");
            return new PluginRegistry.RequestPermissionsResultListener() { // from class: r5.a
                @Override // io.flutter.plugin.common.PluginRegistry.RequestPermissionsResultListener
                public final boolean onRequestPermissionsResult(int i10, String[] strArr, int[] iArr) {
                    boolean m32382c;
                    m32382c = C10624b.a.m32382c(C12605c.this, i10, strArr, iArr);
                    return m32382c;
                }
            };
        }

        /* renamed from: d */
        public final void m32384d(C10993g plugin, BinaryMessenger messenger) {
            C9322n.m27781e(plugin, "plugin");
            C9322n.m27781e(messenger, "messenger");
            new MethodChannel(messenger, "com.fluttercandies/photo_manager").setMethodCallHandler(plugin);
        }
    }

    /* renamed from: a */
    private final void m32378a(ActivityPluginBinding activityPluginBinding) {
        ActivityPluginBinding activityPluginBinding2 = this.f26855c;
        if (activityPluginBinding2 != null) {
            m32380c(activityPluginBinding2);
        }
        this.f26855c = activityPluginBinding;
        C10993g c10993g = this.f26853a;
        if (c10993g != null) {
            c10993g.m33607f(activityPluginBinding.getActivity());
        }
        m32379b(activityPluginBinding);
    }

    /* renamed from: b */
    private final void m32379b(ActivityPluginBinding activityPluginBinding) {
        PluginRegistry.RequestPermissionsResultListener m32383b = f26852e.m32383b(this.f26854b);
        this.f26856d = m32383b;
        activityPluginBinding.addRequestPermissionsResultListener(m32383b);
        C10993g c10993g = this.f26853a;
        if (c10993g != null) {
            activityPluginBinding.addActivityResultListener(c10993g.m33608g());
        }
    }

    /* renamed from: c */
    private final void m32380c(ActivityPluginBinding activityPluginBinding) {
        PluginRegistry.RequestPermissionsResultListener requestPermissionsResultListener = this.f26856d;
        if (requestPermissionsResultListener != null) {
            activityPluginBinding.removeRequestPermissionsResultListener(requestPermissionsResultListener);
        }
        C10993g c10993g = this.f26853a;
        if (c10993g != null) {
            activityPluginBinding.removeActivityResultListener(c10993g.m33608g());
        }
    }

    @Override // io.flutter.embedding.engine.plugins.activity.ActivityAware
    public void onAttachedToActivity(ActivityPluginBinding binding) {
        C9322n.m27781e(binding, "binding");
        m32378a(binding);
    }

    @Override // io.flutter.embedding.engine.plugins.FlutterPlugin
    public void onAttachedToEngine(FlutterPlugin.FlutterPluginBinding binding) {
        C9322n.m27781e(binding, "binding");
        Context applicationContext = binding.getApplicationContext();
        C9322n.m27780d(applicationContext, "getApplicationContext(...)");
        BinaryMessenger binaryMessenger = binding.getBinaryMessenger();
        C9322n.m27780d(binaryMessenger, "getBinaryMessenger(...)");
        C10993g c10993g = new C10993g(applicationContext, binaryMessenger, null, this.f26854b);
        a aVar = f26852e;
        BinaryMessenger binaryMessenger2 = binding.getBinaryMessenger();
        C9322n.m27780d(binaryMessenger2, "getBinaryMessenger(...)");
        aVar.m32384d(c10993g, binaryMessenger2);
        this.f26853a = c10993g;
    }

    @Override // io.flutter.embedding.engine.plugins.activity.ActivityAware
    public void onDetachedFromActivity() {
        ActivityPluginBinding activityPluginBinding = this.f26855c;
        if (activityPluginBinding != null) {
            m32380c(activityPluginBinding);
        }
        C10993g c10993g = this.f26853a;
        if (c10993g != null) {
            c10993g.m33607f(null);
        }
        this.f26855c = null;
    }

    @Override // io.flutter.embedding.engine.plugins.activity.ActivityAware
    public void onDetachedFromActivityForConfigChanges() {
        C10993g c10993g = this.f26853a;
        if (c10993g != null) {
            c10993g.m33607f(null);
        }
    }

    @Override // io.flutter.embedding.engine.plugins.FlutterPlugin
    public void onDetachedFromEngine(FlutterPlugin.FlutterPluginBinding binding) {
        C9322n.m27781e(binding, "binding");
        this.f26853a = null;
    }

    @Override // io.flutter.embedding.engine.plugins.activity.ActivityAware
    public void onReattachedToActivityForConfigChanges(ActivityPluginBinding binding) {
        C9322n.m27781e(binding, "binding");
        m32378a(binding);
    }
}

package p301q2;

import android.app.Activity;
import android.content.Intent;
import android.net.Uri;
import androidx.browser.customtabs.C0394d;
import ck.C2037v;
import com.facebook.ads.AdError;
import io.flutter.embedding.engine.plugins.FlutterPlugin;
import io.flutter.embedding.engine.plugins.activity.ActivityAware;
import io.flutter.embedding.engine.plugins.activity.ActivityPluginBinding;
import io.flutter.plugin.common.MethodCall;
import io.flutter.plugin.common.MethodChannel;
import io.flutter.plugin.common.PluginRegistry;
import kotlin.jvm.internal.AbstractC9323o;
import kotlin.jvm.internal.C9315g;
import kotlin.jvm.internal.C9322n;
import p280ok.InterfaceC9987a;

/* renamed from: q2.a */
/* loaded from: classes.dex */
public final class C10227a implements FlutterPlugin, MethodChannel.MethodCallHandler, ActivityAware, PluginRegistry.ActivityResultListener {

    /* renamed from: d */
    public static final a f25367d = new a(null);

    /* renamed from: e */
    private static MethodChannel.Result f25368e;

    /* renamed from: f */
    private static InterfaceC9987a<C2037v> f25369f;

    /* renamed from: a */
    private final int f25370a = AdError.NO_FILL_ERROR_CODE;

    /* renamed from: b */
    private MethodChannel f25371b;

    /* renamed from: c */
    private ActivityPluginBinding f25372c;

    /* renamed from: q2.a$a */
    /* loaded from: classes.dex */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(C9315g c9315g) {
            this();
        }
    }

    /* renamed from: q2.a$b */
    /* loaded from: classes.dex */
    static final class b extends AbstractC9323o implements InterfaceC9987a<C2037v> {

        /* renamed from: a */
        final /* synthetic */ Activity f25373a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        b(Activity activity) {
            super(0);
            this.f25373a = activity;
        }

        /* renamed from: a */
        public final void m30584a() {
            Intent launchIntentForPackage = this.f25373a.getPackageManager().getLaunchIntentForPackage(this.f25373a.getPackageName());
            if (launchIntentForPackage != null) {
                launchIntentForPackage.setPackage(null);
            }
            if (launchIntentForPackage != null) {
                launchIntentForPackage.setFlags(67108864);
            }
            this.f25373a.startActivity(launchIntentForPackage);
        }

        @Override // p280ok.InterfaceC9987a
        public /* bridge */ /* synthetic */ C2037v invoke() {
            m30584a();
            return C2037v.f8089a;
        }
    }

    @Override // io.flutter.plugin.common.PluginRegistry.ActivityResultListener
    public boolean onActivityResult(int i10, int i11, Intent intent) {
        MethodChannel.Result result;
        if (i10 != this.f25370a || (result = f25368e) == null) {
            return false;
        }
        result.error("authorization-error/canceled", "The user closed the Custom Tab", null);
        f25368e = null;
        f25369f = null;
        return false;
    }

    @Override // io.flutter.embedding.engine.plugins.activity.ActivityAware
    public void onAttachedToActivity(ActivityPluginBinding binding) {
        C9322n.m27781e(binding, "binding");
        this.f25372c = binding;
        binding.addActivityResultListener(this);
    }

    @Override // io.flutter.embedding.engine.plugins.FlutterPlugin
    public void onAttachedToEngine(FlutterPlugin.FlutterPluginBinding flutterPluginBinding) {
        C9322n.m27781e(flutterPluginBinding, "flutterPluginBinding");
        MethodChannel methodChannel = new MethodChannel(flutterPluginBinding.getBinaryMessenger(), "com.aboutyou.dart_packages.sign_in_with_apple");
        this.f25371b = methodChannel;
        methodChannel.setMethodCallHandler(this);
    }

    @Override // io.flutter.embedding.engine.plugins.activity.ActivityAware
    public void onDetachedFromActivity() {
        ActivityPluginBinding activityPluginBinding = this.f25372c;
        if (activityPluginBinding != null) {
            activityPluginBinding.removeActivityResultListener(this);
        }
        this.f25372c = null;
    }

    @Override // io.flutter.embedding.engine.plugins.activity.ActivityAware
    public void onDetachedFromActivityForConfigChanges() {
        onDetachedFromActivity();
    }

    @Override // io.flutter.embedding.engine.plugins.FlutterPlugin
    public void onDetachedFromEngine(FlutterPlugin.FlutterPluginBinding binding) {
        C9322n.m27781e(binding, "binding");
        MethodChannel methodChannel = this.f25371b;
        if (methodChannel != null) {
            methodChannel.setMethodCallHandler(null);
        }
        this.f25371b = null;
    }

    @Override // io.flutter.plugin.common.MethodChannel.MethodCallHandler
    public void onMethodCall(MethodCall call, MethodChannel.Result result) {
        String str;
        Object obj;
        String str2;
        C9322n.m27781e(call, "call");
        C9322n.m27781e(result, "result");
        String str3 = call.method;
        if (C9322n.m27777a(str3, "isAvailable")) {
            result.success(Boolean.TRUE);
            return;
        }
        if (!C9322n.m27777a(str3, "performAuthorizationRequest")) {
            result.notImplemented();
            return;
        }
        ActivityPluginBinding activityPluginBinding = this.f25372c;
        Activity activity = activityPluginBinding != null ? activityPluginBinding.getActivity() : null;
        if (activity == null) {
            str = "Plugin is not attached to an activity";
            obj = call.arguments;
            str2 = "MISSING_ACTIVITY";
        } else {
            String str4 = (String) call.argument("url");
            if (str4 != null) {
                MethodChannel.Result result2 = f25368e;
                if (result2 != null) {
                    result2.error("NEW_REQUEST", "A new request came in while this was still pending. The previous request (this one) was then cancelled.", null);
                }
                InterfaceC9987a<C2037v> interfaceC9987a = f25369f;
                if (interfaceC9987a != null) {
                    C9322n.m27778b(interfaceC9987a);
                    interfaceC9987a.invoke();
                }
                f25368e = result;
                f25369f = new b(activity);
                C0394d m2113b = new C0394d.b().m2113b();
                C9322n.m27780d(m2113b, "build(...)");
                m2113b.f2069a.setData(Uri.parse(str4));
                activity.startActivityForResult(m2113b.f2069a, this.f25370a, m2113b.f2070b);
                return;
            }
            str = "Missing 'url' argument";
            obj = call.arguments;
            str2 = "MISSING_ARG";
        }
        result.error(str2, str, obj);
    }

    @Override // io.flutter.embedding.engine.plugins.activity.ActivityAware
    public void onReattachedToActivityForConfigChanges(ActivityPluginBinding binding) {
        C9322n.m27781e(binding, "binding");
        onAttachedToActivity(binding);
    }
}

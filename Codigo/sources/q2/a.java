package q2;

import android.app.Activity;
import android.content.Intent;
import android.net.Uri;
import androidx.browser.customtabs.d;
import ck.v;
import com.facebook.ads.AdError;
import io.flutter.embedding.engine.plugins.FlutterPlugin;
import io.flutter.embedding.engine.plugins.activity.ActivityAware;
import io.flutter.embedding.engine.plugins.activity.ActivityPluginBinding;
import io.flutter.plugin.common.MethodCall;
import io.flutter.plugin.common.MethodChannel;
import io.flutter.plugin.common.PluginRegistry;
import kotlin.jvm.internal.g;
import kotlin.jvm.internal.n;
import kotlin.jvm.internal.o;

/* loaded from: classes.dex */
public final class a implements FlutterPlugin, MethodChannel.MethodCallHandler, ActivityAware, PluginRegistry.ActivityResultListener {

    /* renamed from: d, reason: collision with root package name */
    public static final C0389a f23399d = new C0389a(null);

    /* renamed from: e, reason: collision with root package name */
    private static MethodChannel.Result f23400e;

    /* renamed from: f, reason: collision with root package name */
    private static ok.a<v> f23401f;

    /* renamed from: a, reason: collision with root package name */
    private final int f23402a = AdError.NO_FILL_ERROR_CODE;

    /* renamed from: b, reason: collision with root package name */
    private MethodChannel f23403b;

    /* renamed from: c, reason: collision with root package name */
    private ActivityPluginBinding f23404c;

    /* renamed from: q2.a$a, reason: collision with other inner class name */
    /* loaded from: classes.dex */
    public static final class C0389a {
        private C0389a() {
        }

        public /* synthetic */ C0389a(g gVar) {
            this();
        }
    }

    /* loaded from: classes.dex */
    static final class b extends o implements ok.a<v> {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ Activity f23405a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        b(Activity activity) {
            super(0);
            this.f23405a = activity;
        }

        public final void a() {
            Intent launchIntentForPackage = this.f23405a.getPackageManager().getLaunchIntentForPackage(this.f23405a.getPackageName());
            if (launchIntentForPackage != null) {
                launchIntentForPackage.setPackage(null);
            }
            if (launchIntentForPackage != null) {
                launchIntentForPackage.setFlags(67108864);
            }
            this.f23405a.startActivity(launchIntentForPackage);
        }

        @Override // ok.a
        public /* bridge */ /* synthetic */ v invoke() {
            a();
            return v.f7137a;
        }
    }

    @Override // io.flutter.plugin.common.PluginRegistry.ActivityResultListener
    public boolean onActivityResult(int i10, int i11, Intent intent) {
        MethodChannel.Result result;
        if (i10 != this.f23402a || (result = f23400e) == null) {
            return false;
        }
        result.error("authorization-error/canceled", "The user closed the Custom Tab", null);
        f23400e = null;
        f23401f = null;
        return false;
    }

    @Override // io.flutter.embedding.engine.plugins.activity.ActivityAware
    public void onAttachedToActivity(ActivityPluginBinding binding) {
        n.e(binding, "binding");
        this.f23404c = binding;
        binding.addActivityResultListener(this);
    }

    @Override // io.flutter.embedding.engine.plugins.FlutterPlugin
    public void onAttachedToEngine(FlutterPlugin.FlutterPluginBinding flutterPluginBinding) {
        n.e(flutterPluginBinding, "flutterPluginBinding");
        MethodChannel methodChannel = new MethodChannel(flutterPluginBinding.getBinaryMessenger(), "com.aboutyou.dart_packages.sign_in_with_apple");
        this.f23403b = methodChannel;
        methodChannel.setMethodCallHandler(this);
    }

    @Override // io.flutter.embedding.engine.plugins.activity.ActivityAware
    public void onDetachedFromActivity() {
        ActivityPluginBinding activityPluginBinding = this.f23404c;
        if (activityPluginBinding != null) {
            activityPluginBinding.removeActivityResultListener(this);
        }
        this.f23404c = null;
    }

    @Override // io.flutter.embedding.engine.plugins.activity.ActivityAware
    public void onDetachedFromActivityForConfigChanges() {
        onDetachedFromActivity();
    }

    @Override // io.flutter.embedding.engine.plugins.FlutterPlugin
    public void onDetachedFromEngine(FlutterPlugin.FlutterPluginBinding binding) {
        n.e(binding, "binding");
        MethodChannel methodChannel = this.f23403b;
        if (methodChannel != null) {
            methodChannel.setMethodCallHandler(null);
        }
        this.f23403b = null;
    }

    @Override // io.flutter.plugin.common.MethodChannel.MethodCallHandler
    public void onMethodCall(MethodCall call, MethodChannel.Result result) {
        String str;
        Object obj;
        String str2;
        n.e(call, "call");
        n.e(result, "result");
        String str3 = call.method;
        if (n.a(str3, "isAvailable")) {
            result.success(Boolean.TRUE);
            return;
        }
        if (!n.a(str3, "performAuthorizationRequest")) {
            result.notImplemented();
            return;
        }
        ActivityPluginBinding activityPluginBinding = this.f23404c;
        Activity activity = activityPluginBinding != null ? activityPluginBinding.getActivity() : null;
        if (activity == null) {
            str = "Plugin is not attached to an activity";
            obj = call.arguments;
            str2 = "MISSING_ACTIVITY";
        } else {
            String str4 = (String) call.argument("url");
            if (str4 != null) {
                MethodChannel.Result result2 = f23400e;
                if (result2 != null) {
                    result2.error("NEW_REQUEST", "A new request came in while this was still pending. The previous request (this one) was then cancelled.", null);
                }
                ok.a<v> aVar = f23401f;
                if (aVar != null) {
                    n.b(aVar);
                    aVar.invoke();
                }
                f23400e = result;
                f23401f = new b(activity);
                d b10 = new d.b().b();
                n.d(b10, "build(...)");
                b10.f1766a.setData(Uri.parse(str4));
                activity.startActivityForResult(b10.f1766a, this.f23402a, b10.f1767b);
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
        n.e(binding, "binding");
        onAttachedToActivity(binding);
    }
}

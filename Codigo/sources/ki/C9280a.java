package ki;

import android.content.Context;
import android.content.pm.PackageManager;
import android.view.WindowManager;
import io.flutter.embedding.engine.plugins.FlutterPlugin;
import io.flutter.plugin.common.BinaryMessenger;
import io.flutter.plugin.common.MethodChannel;
import kotlin.jvm.internal.C9322n;

/* renamed from: ki.a */
/* loaded from: classes3.dex */
public final class C9280a implements FlutterPlugin {

    /* renamed from: a */
    private MethodChannel f22537a;

    /* renamed from: a */
    private final void m27688a(BinaryMessenger binaryMessenger, Context context) {
        this.f22537a = new MethodChannel(binaryMessenger, "dev.fluttercommunity.plus/device_info");
        PackageManager packageManager = context.getPackageManager();
        C9322n.m27780d(packageManager, "getPackageManager(...)");
        Object systemService = context.getSystemService("window");
        C9322n.m27779c(systemService, "null cannot be cast to non-null type android.view.WindowManager");
        C9282c c9282c = new C9282c(packageManager, (WindowManager) systemService);
        MethodChannel methodChannel = this.f22537a;
        if (methodChannel == null) {
            C9322n.m27792p("methodChannel");
            methodChannel = null;
        }
        methodChannel.setMethodCallHandler(c9282c);
    }

    @Override // io.flutter.embedding.engine.plugins.FlutterPlugin
    public void onAttachedToEngine(FlutterPlugin.FlutterPluginBinding binding) {
        C9322n.m27781e(binding, "binding");
        BinaryMessenger binaryMessenger = binding.getBinaryMessenger();
        C9322n.m27780d(binaryMessenger, "getBinaryMessenger(...)");
        Context applicationContext = binding.getApplicationContext();
        C9322n.m27780d(applicationContext, "getApplicationContext(...)");
        m27688a(binaryMessenger, applicationContext);
    }

    @Override // io.flutter.embedding.engine.plugins.FlutterPlugin
    public void onDetachedFromEngine(FlutterPlugin.FlutterPluginBinding binding) {
        C9322n.m27781e(binding, "binding");
        MethodChannel methodChannel = this.f22537a;
        if (methodChannel == null) {
            C9322n.m27792p("methodChannel");
            methodChannel = null;
        }
        methodChannel.setMethodCallHandler(null);
    }
}

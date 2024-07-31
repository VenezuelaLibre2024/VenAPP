package ki;

import android.content.Context;
import android.content.pm.PackageManager;
import android.view.WindowManager;
import io.flutter.embedding.engine.plugins.FlutterPlugin;
import io.flutter.plugin.common.BinaryMessenger;
import io.flutter.plugin.common.MethodChannel;
import kotlin.jvm.internal.n;

/* loaded from: classes3.dex */
public final class a implements FlutterPlugin {

    /* renamed from: a, reason: collision with root package name */
    private MethodChannel f20715a;

    private final void a(BinaryMessenger binaryMessenger, Context context) {
        this.f20715a = new MethodChannel(binaryMessenger, "dev.fluttercommunity.plus/device_info");
        PackageManager packageManager = context.getPackageManager();
        n.d(packageManager, "getPackageManager(...)");
        Object systemService = context.getSystemService("window");
        n.c(systemService, "null cannot be cast to non-null type android.view.WindowManager");
        c cVar = new c(packageManager, (WindowManager) systemService);
        MethodChannel methodChannel = this.f20715a;
        if (methodChannel == null) {
            n.p("methodChannel");
            methodChannel = null;
        }
        methodChannel.setMethodCallHandler(cVar);
    }

    @Override // io.flutter.embedding.engine.plugins.FlutterPlugin
    public void onAttachedToEngine(FlutterPlugin.FlutterPluginBinding binding) {
        n.e(binding, "binding");
        BinaryMessenger binaryMessenger = binding.getBinaryMessenger();
        n.d(binaryMessenger, "getBinaryMessenger(...)");
        Context applicationContext = binding.getApplicationContext();
        n.d(applicationContext, "getApplicationContext(...)");
        a(binaryMessenger, applicationContext);
    }

    @Override // io.flutter.embedding.engine.plugins.FlutterPlugin
    public void onDetachedFromEngine(FlutterPlugin.FlutterPluginBinding binding) {
        n.e(binding, "binding");
        MethodChannel methodChannel = this.f20715a;
        if (methodChannel == null) {
            n.p("methodChannel");
            methodChannel = null;
        }
        methodChannel.setMethodCallHandler(null);
    }
}

package h5;

import android.content.Context;
import android.os.Build;
import i5.c;
import i5.e;
import io.flutter.embedding.engine.plugins.FlutterPlugin;
import io.flutter.plugin.common.MethodCall;
import io.flutter.plugin.common.MethodChannel;
import kotlin.jvm.internal.g;
import kotlin.jvm.internal.n;

/* loaded from: classes.dex */
public final class a implements FlutterPlugin, MethodChannel.MethodCallHandler {

    /* renamed from: c */
    public static final C0270a f16378c = new C0270a(null);

    /* renamed from: d */
    private static boolean f16379d;

    /* renamed from: a */
    private Context f16380a;

    /* renamed from: b */
    private MethodChannel f16381b;

    /* renamed from: h5.a$a */
    /* loaded from: classes.dex */
    public static final class C0270a {
        private C0270a() {
        }

        public /* synthetic */ C0270a(g gVar) {
            this();
        }

        public final boolean a() {
            return a.f16379d;
        }
    }

    public a() {
        l5.a aVar = l5.a.f20979a;
        aVar.b(new n5.a(0));
        aVar.b(new n5.a(1));
        aVar.b(new o5.a());
        aVar.b(new n5.a(3));
    }

    private final int b(MethodCall methodCall) {
        f16379d = n.a((Boolean) methodCall.arguments(), Boolean.TRUE);
        return 1;
    }

    @Override // io.flutter.embedding.engine.plugins.FlutterPlugin
    public void onAttachedToEngine(FlutterPlugin.FlutterPluginBinding binding) {
        n.e(binding, "binding");
        Context applicationContext = binding.getApplicationContext();
        n.d(applicationContext, "getApplicationContext(...)");
        this.f16380a = applicationContext;
        MethodChannel methodChannel = new MethodChannel(binding.getBinaryMessenger(), "flutter_image_compress");
        this.f16381b = methodChannel;
        methodChannel.setMethodCallHandler(this);
    }

    @Override // io.flutter.embedding.engine.plugins.FlutterPlugin
    public void onDetachedFromEngine(FlutterPlugin.FlutterPluginBinding binding) {
        n.e(binding, "binding");
        MethodChannel methodChannel = this.f16381b;
        if (methodChannel != null) {
            methodChannel.setMethodCallHandler(null);
        }
        this.f16381b = null;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    @Override // io.flutter.plugin.common.MethodChannel.MethodCallHandler
    public void onMethodCall(MethodCall call, MethodChannel.Result result) {
        int i10;
        n.e(call, "call");
        n.e(result, "result");
        String str = call.method;
        if (str != null) {
            Context context = null;
            switch (str.hashCode()) {
                case -129880033:
                    if (str.equals("compressWithFileAndGetFile")) {
                        c cVar = new c(call, result);
                        Context context2 = this.f16380a;
                        if (context2 == null) {
                            n.p("context");
                        } else {
                            context = context2;
                        }
                        cVar.i(context);
                        return;
                    }
                    break;
                case 86054116:
                    if (str.equals("compressWithFile")) {
                        c cVar2 = new c(call, result);
                        Context context3 = this.f16380a;
                        if (context3 == null) {
                            n.p("context");
                        } else {
                            context = context3;
                        }
                        cVar2.g(context);
                        return;
                    }
                    break;
                case 86233094:
                    if (str.equals("compressWithList")) {
                        e eVar = new e(call, result);
                        Context context4 = this.f16380a;
                        if (context4 == null) {
                            n.p("context");
                        } else {
                            context = context4;
                        }
                        eVar.f(context);
                        return;
                    }
                    break;
                case 1262746611:
                    if (str.equals("getSystemVersion")) {
                        i10 = Build.VERSION.SDK_INT;
                        break;
                    }
                    break;
                case 2067272455:
                    if (str.equals("showLog")) {
                        i10 = b(call);
                        break;
                    }
                    break;
            }
            result.success(Integer.valueOf(i10));
            return;
        }
        result.notImplemented();
    }
}

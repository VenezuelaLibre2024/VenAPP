package p131h5;

import android.content.Context;
import android.os.Build;
import io.flutter.embedding.engine.plugins.FlutterPlugin;
import io.flutter.plugin.common.MethodCall;
import io.flutter.plugin.common.MethodChannel;
import kotlin.jvm.internal.C9315g;
import kotlin.jvm.internal.C9322n;
import p153i5.C7844c;
import p153i5.C7846e;
import p214l5.C9398a;
import p248n5.C9662a;
import p265o5.C9792a;

/* renamed from: h5.a */
/* loaded from: classes.dex */
public final class C7630a implements FlutterPlugin, MethodChannel.MethodCallHandler {

    /* renamed from: c */
    public static final a f18015c = new a(null);

    /* renamed from: d */
    private static boolean f18016d;

    /* renamed from: a */
    private Context f18017a;

    /* renamed from: b */
    private MethodChannel f18018b;

    /* renamed from: h5.a$a */
    /* loaded from: classes.dex */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(C9315g c9315g) {
            this();
        }

        /* renamed from: a */
        public final boolean m23158a() {
            return C7630a.f18016d;
        }
    }

    public C7630a() {
        C9398a c9398a = C9398a.f22801a;
        c9398a.m27987b(new C9662a(0));
        c9398a.m27987b(new C9662a(1));
        c9398a.m27987b(new C9792a());
        c9398a.m27987b(new C9662a(3));
    }

    /* renamed from: b */
    private final int m23157b(MethodCall methodCall) {
        f18016d = C9322n.m27777a((Boolean) methodCall.arguments(), Boolean.TRUE);
        return 1;
    }

    @Override // io.flutter.embedding.engine.plugins.FlutterPlugin
    public void onAttachedToEngine(FlutterPlugin.FlutterPluginBinding binding) {
        C9322n.m27781e(binding, "binding");
        Context applicationContext = binding.getApplicationContext();
        C9322n.m27780d(applicationContext, "getApplicationContext(...)");
        this.f18017a = applicationContext;
        MethodChannel methodChannel = new MethodChannel(binding.getBinaryMessenger(), "flutter_image_compress");
        this.f18018b = methodChannel;
        methodChannel.setMethodCallHandler(this);
    }

    @Override // io.flutter.embedding.engine.plugins.FlutterPlugin
    public void onDetachedFromEngine(FlutterPlugin.FlutterPluginBinding binding) {
        C9322n.m27781e(binding, "binding");
        MethodChannel methodChannel = this.f18018b;
        if (methodChannel != null) {
            methodChannel.setMethodCallHandler(null);
        }
        this.f18018b = null;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    @Override // io.flutter.plugin.common.MethodChannel.MethodCallHandler
    public void onMethodCall(MethodCall call, MethodChannel.Result result) {
        int i10;
        C9322n.m27781e(call, "call");
        C9322n.m27781e(result, "result");
        String str = call.method;
        if (str != null) {
            Context context = null;
            switch (str.hashCode()) {
                case -129880033:
                    if (str.equals("compressWithFileAndGetFile")) {
                        C7844c c7844c = new C7844c(call, result);
                        Context context2 = this.f18017a;
                        if (context2 == null) {
                            C9322n.m27792p("context");
                        } else {
                            context = context2;
                        }
                        c7844c.m24135i(context);
                        return;
                    }
                    break;
                case 86054116:
                    if (str.equals("compressWithFile")) {
                        C7844c c7844c2 = new C7844c(call, result);
                        Context context3 = this.f18017a;
                        if (context3 == null) {
                            C9322n.m27792p("context");
                        } else {
                            context = context3;
                        }
                        c7844c2.m24134g(context);
                        return;
                    }
                    break;
                case 86233094:
                    if (str.equals("compressWithList")) {
                        C7846e c7846e = new C7846e(call, result);
                        Context context4 = this.f18017a;
                        if (context4 == null) {
                            C9322n.m27792p("context");
                        } else {
                            context = context4;
                        }
                        c7846e.m24138f(context);
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
                        i10 = m23157b(call);
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

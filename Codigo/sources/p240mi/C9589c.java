package p240mi;

import android.content.Context;
import io.flutter.embedding.engine.plugins.FlutterPlugin;
import io.flutter.embedding.engine.plugins.activity.ActivityAware;
import io.flutter.embedding.engine.plugins.activity.ActivityPluginBinding;
import io.flutter.plugin.common.MethodChannel;
import kotlin.jvm.internal.C9315g;
import kotlin.jvm.internal.C9322n;

/* renamed from: mi.c */
/* loaded from: classes3.dex */
public final class C9589c implements FlutterPlugin, ActivityAware {

    /* renamed from: d */
    public static final a f23383d = new a(null);

    /* renamed from: a */
    private C9588b f23384a;

    /* renamed from: b */
    private C9590d f23385b;

    /* renamed from: c */
    private MethodChannel f23386c;

    /* renamed from: mi.c$a */
    /* loaded from: classes3.dex */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(C9315g c9315g) {
            this();
        }
    }

    @Override // io.flutter.embedding.engine.plugins.activity.ActivityAware
    public void onAttachedToActivity(ActivityPluginBinding binding) {
        C9322n.m27781e(binding, "binding");
        C9590d c9590d = this.f23385b;
        C9588b c9588b = null;
        if (c9590d == null) {
            C9322n.m27792p("manager");
            c9590d = null;
        }
        binding.addActivityResultListener(c9590d);
        C9588b c9588b2 = this.f23384a;
        if (c9588b2 == null) {
            C9322n.m27792p("share");
        } else {
            c9588b = c9588b2;
        }
        c9588b.m28575m(binding.getActivity());
    }

    @Override // io.flutter.embedding.engine.plugins.FlutterPlugin
    public void onAttachedToEngine(FlutterPlugin.FlutterPluginBinding binding) {
        C9322n.m27781e(binding, "binding");
        this.f23386c = new MethodChannel(binding.getBinaryMessenger(), "dev.fluttercommunity.plus/share");
        Context applicationContext = binding.getApplicationContext();
        C9322n.m27780d(applicationContext, "getApplicationContext(...)");
        C9590d c9590d = new C9590d(applicationContext);
        this.f23385b = c9590d;
        c9590d.m28583b();
        Context applicationContext2 = binding.getApplicationContext();
        C9322n.m27780d(applicationContext2, "getApplicationContext(...)");
        C9590d c9590d2 = this.f23385b;
        MethodChannel methodChannel = null;
        if (c9590d2 == null) {
            C9322n.m27792p("manager");
            c9590d2 = null;
        }
        C9588b c9588b = new C9588b(applicationContext2, null, c9590d2);
        this.f23384a = c9588b;
        C9590d c9590d3 = this.f23385b;
        if (c9590d3 == null) {
            C9322n.m27792p("manager");
            c9590d3 = null;
        }
        C9587a c9587a = new C9587a(c9588b, c9590d3);
        MethodChannel methodChannel2 = this.f23386c;
        if (methodChannel2 == null) {
            C9322n.m27792p("methodChannel");
        } else {
            methodChannel = methodChannel2;
        }
        methodChannel.setMethodCallHandler(c9587a);
    }

    @Override // io.flutter.embedding.engine.plugins.activity.ActivityAware
    public void onDetachedFromActivity() {
        C9588b c9588b = this.f23384a;
        if (c9588b == null) {
            C9322n.m27792p("share");
            c9588b = null;
        }
        c9588b.m28575m(null);
    }

    @Override // io.flutter.embedding.engine.plugins.activity.ActivityAware
    public void onDetachedFromActivityForConfigChanges() {
        onDetachedFromActivity();
    }

    @Override // io.flutter.embedding.engine.plugins.FlutterPlugin
    public void onDetachedFromEngine(FlutterPlugin.FlutterPluginBinding binding) {
        C9322n.m27781e(binding, "binding");
        C9590d c9590d = this.f23385b;
        if (c9590d == null) {
            C9322n.m27792p("manager");
            c9590d = null;
        }
        c9590d.m28582a();
        MethodChannel methodChannel = this.f23386c;
        if (methodChannel == null) {
            C9322n.m27792p("methodChannel");
            methodChannel = null;
        }
        methodChannel.setMethodCallHandler(null);
    }

    @Override // io.flutter.embedding.engine.plugins.activity.ActivityAware
    public void onReattachedToActivityForConfigChanges(ActivityPluginBinding binding) {
        C9322n.m27781e(binding, "binding");
        onAttachedToActivity(binding);
    }
}

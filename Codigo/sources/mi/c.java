package mi;

import android.content.Context;
import io.flutter.embedding.engine.plugins.FlutterPlugin;
import io.flutter.embedding.engine.plugins.activity.ActivityAware;
import io.flutter.embedding.engine.plugins.activity.ActivityPluginBinding;
import io.flutter.plugin.common.MethodChannel;
import kotlin.jvm.internal.g;
import kotlin.jvm.internal.n;

/* loaded from: classes3.dex */
public final class c implements FlutterPlugin, ActivityAware {

    /* renamed from: d, reason: collision with root package name */
    public static final a f21529d = new a(null);

    /* renamed from: a, reason: collision with root package name */
    private b f21530a;

    /* renamed from: b, reason: collision with root package name */
    private d f21531b;

    /* renamed from: c, reason: collision with root package name */
    private MethodChannel f21532c;

    /* loaded from: classes3.dex */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(g gVar) {
            this();
        }
    }

    @Override // io.flutter.embedding.engine.plugins.activity.ActivityAware
    public void onAttachedToActivity(ActivityPluginBinding binding) {
        n.e(binding, "binding");
        d dVar = this.f21531b;
        b bVar = null;
        if (dVar == null) {
            n.p("manager");
            dVar = null;
        }
        binding.addActivityResultListener(dVar);
        b bVar2 = this.f21530a;
        if (bVar2 == null) {
            n.p("share");
        } else {
            bVar = bVar2;
        }
        bVar.m(binding.getActivity());
    }

    @Override // io.flutter.embedding.engine.plugins.FlutterPlugin
    public void onAttachedToEngine(FlutterPlugin.FlutterPluginBinding binding) {
        n.e(binding, "binding");
        this.f21532c = new MethodChannel(binding.getBinaryMessenger(), "dev.fluttercommunity.plus/share");
        Context applicationContext = binding.getApplicationContext();
        n.d(applicationContext, "getApplicationContext(...)");
        d dVar = new d(applicationContext);
        this.f21531b = dVar;
        dVar.b();
        Context applicationContext2 = binding.getApplicationContext();
        n.d(applicationContext2, "getApplicationContext(...)");
        d dVar2 = this.f21531b;
        MethodChannel methodChannel = null;
        if (dVar2 == null) {
            n.p("manager");
            dVar2 = null;
        }
        b bVar = new b(applicationContext2, null, dVar2);
        this.f21530a = bVar;
        d dVar3 = this.f21531b;
        if (dVar3 == null) {
            n.p("manager");
            dVar3 = null;
        }
        mi.a aVar = new mi.a(bVar, dVar3);
        MethodChannel methodChannel2 = this.f21532c;
        if (methodChannel2 == null) {
            n.p("methodChannel");
        } else {
            methodChannel = methodChannel2;
        }
        methodChannel.setMethodCallHandler(aVar);
    }

    @Override // io.flutter.embedding.engine.plugins.activity.ActivityAware
    public void onDetachedFromActivity() {
        b bVar = this.f21530a;
        if (bVar == null) {
            n.p("share");
            bVar = null;
        }
        bVar.m(null);
    }

    @Override // io.flutter.embedding.engine.plugins.activity.ActivityAware
    public void onDetachedFromActivityForConfigChanges() {
        onDetachedFromActivity();
    }

    @Override // io.flutter.embedding.engine.plugins.FlutterPlugin
    public void onDetachedFromEngine(FlutterPlugin.FlutterPluginBinding binding) {
        n.e(binding, "binding");
        d dVar = this.f21531b;
        if (dVar == null) {
            n.p("manager");
            dVar = null;
        }
        dVar.a();
        MethodChannel methodChannel = this.f21532c;
        if (methodChannel == null) {
            n.p("methodChannel");
            methodChannel = null;
        }
        methodChannel.setMethodCallHandler(null);
    }

    @Override // io.flutter.embedding.engine.plugins.activity.ActivityAware
    public void onReattachedToActivityForConfigChanges(ActivityPluginBinding binding) {
        n.e(binding, "binding");
        onAttachedToActivity(binding);
    }
}

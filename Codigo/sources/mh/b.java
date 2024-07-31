package mh;

import android.app.Activity;
import android.content.Intent;
import android.net.Uri;
import ck.m;
import ck.r;
import dk.k0;
import io.flutter.embedding.engine.plugins.FlutterPlugin;
import io.flutter.embedding.engine.plugins.activity.ActivityAware;
import io.flutter.embedding.engine.plugins.activity.ActivityPluginBinding;
import io.flutter.plugin.common.BinaryMessenger;
import io.flutter.plugin.common.EventChannel;
import io.flutter.plugin.common.MethodCall;
import io.flutter.plugin.common.MethodChannel;
import io.flutter.plugin.common.PluginRegistry;
import java.util.Map;
import kotlin.jvm.internal.g;
import kotlin.jvm.internal.n;

/* loaded from: classes3.dex */
public final class b implements FlutterPlugin, MethodChannel.MethodCallHandler, ActivityAware, PluginRegistry.NewIntentListener {

    /* renamed from: t */
    public static final a f21507t = new a(null);

    /* renamed from: a */
    private MethodChannel f21508a;

    /* renamed from: b */
    private EventChannel f21509b;

    /* renamed from: c */
    private EventChannel.EventSink f21510c;

    /* renamed from: d */
    private ActivityPluginBinding f21511d;

    /* renamed from: e */
    private String f21512e = "";

    /* renamed from: f */
    private nh.a f21513f;

    /* renamed from: r */
    private BinaryMessenger f21514r;

    /* renamed from: s */
    private Activity f21515s;

    /* loaded from: classes3.dex */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(g gVar) {
            this();
        }
    }

    /* renamed from: mh.b$b */
    /* loaded from: classes3.dex */
    public static final class C0346b implements EventChannel.StreamHandler {
        C0346b() {
        }

        @Override // io.flutter.plugin.common.EventChannel.StreamHandler
        public void onCancel(Object obj) {
            b.this.f21510c = null;
        }

        @Override // io.flutter.plugin.common.EventChannel.StreamHandler
        public void onListen(Object obj, EventChannel.EventSink eventSink) {
            b bVar = b.this;
            n.b(eventSink);
            bVar.f21510c = eventSink;
        }
    }

    private final void d(BinaryMessenger binaryMessenger) {
        this.f21514r = binaryMessenger;
        this.f21513f = new nh.a(this);
        MethodChannel methodChannel = new MethodChannel(binaryMessenger, "twitter_login");
        this.f21508a = methodChannel;
        n.b(methodChannel);
        methodChannel.setMethodCallHandler(this);
        EventChannel eventChannel = new EventChannel(binaryMessenger, "twitter_login/event");
        this.f21509b = eventChannel;
        n.b(eventChannel);
        eventChannel.setStreamHandler(new C0346b());
    }

    public final BinaryMessenger b() {
        return this.f21514r;
    }

    public final Activity c() {
        return this.f21515s;
    }

    @Override // io.flutter.embedding.engine.plugins.activity.ActivityAware
    public void onAttachedToActivity(ActivityPluginBinding binding) {
        n.e(binding, "binding");
        this.f21511d = binding;
        this.f21515s = binding.getActivity();
        binding.addOnNewIntentListener(this);
    }

    @Override // io.flutter.embedding.engine.plugins.FlutterPlugin
    public void onAttachedToEngine(FlutterPlugin.FlutterPluginBinding flutterPluginBinding) {
        n.e(flutterPluginBinding, "flutterPluginBinding");
        BinaryMessenger binaryMessenger = flutterPluginBinding.getBinaryMessenger();
        n.d(binaryMessenger, "getBinaryMessenger(...)");
        d(binaryMessenger);
    }

    @Override // io.flutter.embedding.engine.plugins.activity.ActivityAware
    public void onDetachedFromActivity() {
        ActivityPluginBinding activityPluginBinding = this.f21511d;
        if (activityPluginBinding != null) {
            activityPluginBinding.removeOnNewIntentListener(this);
        }
        this.f21511d = null;
        this.f21515s = null;
    }

    @Override // io.flutter.embedding.engine.plugins.activity.ActivityAware
    public void onDetachedFromActivityForConfigChanges() {
        ActivityPluginBinding activityPluginBinding = this.f21511d;
        if (activityPluginBinding != null) {
            activityPluginBinding.removeOnNewIntentListener(this);
        }
        this.f21511d = null;
        this.f21515s = null;
    }

    @Override // io.flutter.embedding.engine.plugins.FlutterPlugin
    public void onDetachedFromEngine(FlutterPlugin.FlutterPluginBinding flutterPluginBinding) {
        n.e(flutterPluginBinding, "flutterPluginBinding");
        nh.a aVar = this.f21513f;
        n.b(aVar);
        aVar.a();
        this.f21513f = null;
        MethodChannel methodChannel = this.f21508a;
        n.b(methodChannel);
        methodChannel.setMethodCallHandler(null);
        this.f21508a = null;
        EventChannel eventChannel = this.f21509b;
        n.b(eventChannel);
        eventChannel.setStreamHandler(null);
        this.f21509b = null;
    }

    @Override // io.flutter.plugin.common.MethodChannel.MethodCallHandler
    public void onMethodCall(MethodCall call, MethodChannel.Result result) {
        n.e(call, "call");
        n.e(result, "result");
        if (!n.a(call.method, "setScheme")) {
            result.notImplemented();
            return;
        }
        Object obj = call.arguments;
        n.c(obj, "null cannot be cast to non-null type kotlin.String");
        this.f21512e = (String) obj;
        result.success(null);
    }

    @Override // io.flutter.plugin.common.PluginRegistry.NewIntentListener
    public boolean onNewIntent(Intent intent) {
        Map k10;
        n.e(intent, "intent");
        String str = this.f21512e;
        Uri data = intent.getData();
        if (!n.a(str, data != null ? data.getScheme() : null)) {
            return false;
        }
        EventChannel.EventSink eventSink = this.f21510c;
        if (eventSink != null) {
            m[] mVarArr = new m[2];
            mVarArr[0] = r.a("type", "url");
            Uri data2 = intent.getData();
            mVarArr[1] = r.a("url", data2 != null ? data2.toString() : null);
            k10 = k0.k(mVarArr);
            eventSink.success(k10);
        }
        return true;
    }

    @Override // io.flutter.embedding.engine.plugins.activity.ActivityAware
    public void onReattachedToActivityForConfigChanges(ActivityPluginBinding binding) {
        n.e(binding, "binding");
        this.f21511d = binding;
        this.f21515s = binding.getActivity();
        binding.addOnNewIntentListener(this);
    }
}

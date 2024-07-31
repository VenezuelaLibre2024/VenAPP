package mh;

import android.app.Activity;
import android.content.Intent;
import android.net.Uri;
import ck.C2028m;
import ck.C2033r;
import dk.C7018k0;
import io.flutter.embedding.engine.plugins.FlutterPlugin;
import io.flutter.embedding.engine.plugins.activity.ActivityAware;
import io.flutter.embedding.engine.plugins.activity.ActivityPluginBinding;
import io.flutter.plugin.common.BinaryMessenger;
import io.flutter.plugin.common.EventChannel;
import io.flutter.plugin.common.MethodCall;
import io.flutter.plugin.common.MethodChannel;
import io.flutter.plugin.common.PluginRegistry;
import java.util.Map;
import kotlin.jvm.internal.C9315g;
import kotlin.jvm.internal.C9322n;
import p255nh.C9718a;

/* renamed from: mh.b */
/* loaded from: classes3.dex */
public final class C9586b implements FlutterPlugin, MethodChannel.MethodCallHandler, ActivityAware, PluginRegistry.NewIntentListener {

    /* renamed from: t */
    public static final a f23361t = new a(null);

    /* renamed from: a */
    private MethodChannel f23362a;

    /* renamed from: b */
    private EventChannel f23363b;

    /* renamed from: c */
    private EventChannel.EventSink f23364c;

    /* renamed from: d */
    private ActivityPluginBinding f23365d;

    /* renamed from: e */
    private String f23366e = "";

    /* renamed from: f */
    private C9718a f23367f;

    /* renamed from: r */
    private BinaryMessenger f23368r;

    /* renamed from: s */
    private Activity f23369s;

    /* renamed from: mh.b$a */
    /* loaded from: classes3.dex */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(C9315g c9315g) {
            this();
        }
    }

    /* renamed from: mh.b$b */
    /* loaded from: classes3.dex */
    public static final class b implements EventChannel.StreamHandler {
        b() {
        }

        @Override // io.flutter.plugin.common.EventChannel.StreamHandler
        public void onCancel(Object obj) {
            C9586b.this.f23364c = null;
        }

        @Override // io.flutter.plugin.common.EventChannel.StreamHandler
        public void onListen(Object obj, EventChannel.EventSink eventSink) {
            C9586b c9586b = C9586b.this;
            C9322n.m27778b(eventSink);
            c9586b.f23364c = eventSink;
        }
    }

    /* renamed from: d */
    private final void m28558d(BinaryMessenger binaryMessenger) {
        this.f23368r = binaryMessenger;
        this.f23367f = new C9718a(this);
        MethodChannel methodChannel = new MethodChannel(binaryMessenger, "twitter_login");
        this.f23362a = methodChannel;
        C9322n.m27778b(methodChannel);
        methodChannel.setMethodCallHandler(this);
        EventChannel eventChannel = new EventChannel(binaryMessenger, "twitter_login/event");
        this.f23363b = eventChannel;
        C9322n.m27778b(eventChannel);
        eventChannel.setStreamHandler(new b());
    }

    /* renamed from: b */
    public final BinaryMessenger m28559b() {
        return this.f23368r;
    }

    /* renamed from: c */
    public final Activity m28560c() {
        return this.f23369s;
    }

    @Override // io.flutter.embedding.engine.plugins.activity.ActivityAware
    public void onAttachedToActivity(ActivityPluginBinding binding) {
        C9322n.m27781e(binding, "binding");
        this.f23365d = binding;
        this.f23369s = binding.getActivity();
        binding.addOnNewIntentListener(this);
    }

    @Override // io.flutter.embedding.engine.plugins.FlutterPlugin
    public void onAttachedToEngine(FlutterPlugin.FlutterPluginBinding flutterPluginBinding) {
        C9322n.m27781e(flutterPluginBinding, "flutterPluginBinding");
        BinaryMessenger binaryMessenger = flutterPluginBinding.getBinaryMessenger();
        C9322n.m27780d(binaryMessenger, "getBinaryMessenger(...)");
        m28558d(binaryMessenger);
    }

    @Override // io.flutter.embedding.engine.plugins.activity.ActivityAware
    public void onDetachedFromActivity() {
        ActivityPluginBinding activityPluginBinding = this.f23365d;
        if (activityPluginBinding != null) {
            activityPluginBinding.removeOnNewIntentListener(this);
        }
        this.f23365d = null;
        this.f23369s = null;
    }

    @Override // io.flutter.embedding.engine.plugins.activity.ActivityAware
    public void onDetachedFromActivityForConfigChanges() {
        ActivityPluginBinding activityPluginBinding = this.f23365d;
        if (activityPluginBinding != null) {
            activityPluginBinding.removeOnNewIntentListener(this);
        }
        this.f23365d = null;
        this.f23369s = null;
    }

    @Override // io.flutter.embedding.engine.plugins.FlutterPlugin
    public void onDetachedFromEngine(FlutterPlugin.FlutterPluginBinding flutterPluginBinding) {
        C9322n.m27781e(flutterPluginBinding, "flutterPluginBinding");
        C9718a c9718a = this.f23367f;
        C9322n.m27778b(c9718a);
        c9718a.m29147a();
        this.f23367f = null;
        MethodChannel methodChannel = this.f23362a;
        C9322n.m27778b(methodChannel);
        methodChannel.setMethodCallHandler(null);
        this.f23362a = null;
        EventChannel eventChannel = this.f23363b;
        C9322n.m27778b(eventChannel);
        eventChannel.setStreamHandler(null);
        this.f23363b = null;
    }

    @Override // io.flutter.plugin.common.MethodChannel.MethodCallHandler
    public void onMethodCall(MethodCall call, MethodChannel.Result result) {
        C9322n.m27781e(call, "call");
        C9322n.m27781e(result, "result");
        if (!C9322n.m27777a(call.method, "setScheme")) {
            result.notImplemented();
            return;
        }
        Object obj = call.arguments;
        C9322n.m27779c(obj, "null cannot be cast to non-null type kotlin.String");
        this.f23366e = (String) obj;
        result.success(null);
    }

    @Override // io.flutter.plugin.common.PluginRegistry.NewIntentListener
    public boolean onNewIntent(Intent intent) {
        Map m20424k;
        C9322n.m27781e(intent, "intent");
        String str = this.f23366e;
        Uri data = intent.getData();
        if (!C9322n.m27777a(str, data != null ? data.getScheme() : null)) {
            return false;
        }
        EventChannel.EventSink eventSink = this.f23364c;
        if (eventSink != null) {
            C2028m[] c2028mArr = new C2028m[2];
            c2028mArr[0] = C2033r.m10353a("type", "url");
            Uri data2 = intent.getData();
            c2028mArr[1] = C2033r.m10353a("url", data2 != null ? data2.toString() : null);
            m20424k = C7018k0.m20424k(c2028mArr);
            eventSink.success(m20424k);
        }
        return true;
    }

    @Override // io.flutter.embedding.engine.plugins.activity.ActivityAware
    public void onReattachedToActivityForConfigChanges(ActivityPluginBinding binding) {
        C9322n.m27781e(binding, "binding");
        this.f23365d = binding;
        this.f23369s = binding.getActivity();
        binding.addOnNewIntentListener(this);
    }
}

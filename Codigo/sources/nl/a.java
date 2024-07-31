package nl;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import io.flutter.embedding.engine.plugins.FlutterPlugin;
import io.flutter.embedding.engine.plugins.activity.ActivityAware;
import io.flutter.embedding.engine.plugins.activity.ActivityPluginBinding;
import io.flutter.plugin.common.BinaryMessenger;
import io.flutter.plugin.common.EventChannel;
import io.flutter.plugin.common.MethodCall;
import io.flutter.plugin.common.MethodChannel;
import io.flutter.plugin.common.PluginRegistry;

/* loaded from: classes3.dex */
public class a implements FlutterPlugin, MethodChannel.MethodCallHandler, EventChannel.StreamHandler, ActivityAware, PluginRegistry.NewIntentListener {

    /* renamed from: a, reason: collision with root package name */
    private BroadcastReceiver f21988a;

    /* renamed from: b, reason: collision with root package name */
    private String f21989b;

    /* renamed from: c, reason: collision with root package name */
    private String f21990c;

    /* renamed from: d, reason: collision with root package name */
    private Context f21991d;

    /* renamed from: e, reason: collision with root package name */
    private boolean f21992e = true;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: nl.a$a, reason: collision with other inner class name */
    /* loaded from: classes3.dex */
    public class C0360a extends BroadcastReceiver {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ EventChannel.EventSink f21993a;

        C0360a(EventChannel.EventSink eventSink) {
            this.f21993a = eventSink;
        }

        @Override // android.content.BroadcastReceiver
        public void onReceive(Context context, Intent intent) {
            String dataString = intent.getDataString();
            if (dataString == null) {
                this.f21993a.error("UNAVAILABLE", "Link unavailable", null);
            } else {
                this.f21993a.success(dataString);
            }
        }
    }

    private BroadcastReceiver a(EventChannel.EventSink eventSink) {
        return new C0360a(eventSink);
    }

    private void b(Context context, Intent intent) {
        String action = intent.getAction();
        String dataString = intent.getDataString();
        if ("android.intent.action.VIEW".equals(action)) {
            if (this.f21992e) {
                this.f21989b = dataString;
                this.f21992e = false;
            }
            this.f21990c = dataString;
            BroadcastReceiver broadcastReceiver = this.f21988a;
            if (broadcastReceiver != null) {
                broadcastReceiver.onReceive(context, intent);
            }
        }
    }

    private static void c(BinaryMessenger binaryMessenger, a aVar) {
        new MethodChannel(binaryMessenger, "uni_links/messages").setMethodCallHandler(aVar);
        new EventChannel(binaryMessenger, "uni_links/events").setStreamHandler(aVar);
    }

    @Override // io.flutter.embedding.engine.plugins.activity.ActivityAware
    public void onAttachedToActivity(ActivityPluginBinding activityPluginBinding) {
        activityPluginBinding.addOnNewIntentListener(this);
        b(this.f21991d, activityPluginBinding.getActivity().getIntent());
    }

    @Override // io.flutter.embedding.engine.plugins.FlutterPlugin
    public void onAttachedToEngine(FlutterPlugin.FlutterPluginBinding flutterPluginBinding) {
        this.f21991d = flutterPluginBinding.getApplicationContext();
        c(flutterPluginBinding.getBinaryMessenger(), this);
    }

    @Override // io.flutter.plugin.common.EventChannel.StreamHandler
    public void onCancel(Object obj) {
        this.f21988a = null;
    }

    @Override // io.flutter.embedding.engine.plugins.activity.ActivityAware
    public void onDetachedFromActivity() {
    }

    @Override // io.flutter.embedding.engine.plugins.activity.ActivityAware
    public void onDetachedFromActivityForConfigChanges() {
    }

    @Override // io.flutter.embedding.engine.plugins.FlutterPlugin
    public void onDetachedFromEngine(FlutterPlugin.FlutterPluginBinding flutterPluginBinding) {
    }

    @Override // io.flutter.plugin.common.EventChannel.StreamHandler
    public void onListen(Object obj, EventChannel.EventSink eventSink) {
        this.f21988a = a(eventSink);
    }

    @Override // io.flutter.plugin.common.MethodChannel.MethodCallHandler
    public void onMethodCall(MethodCall methodCall, MethodChannel.Result result) {
        String str;
        if (methodCall.method.equals("getInitialLink")) {
            str = this.f21989b;
        } else {
            if (!methodCall.method.equals("getLatestLink")) {
                result.notImplemented();
                return;
            }
            str = this.f21990c;
        }
        result.success(str);
    }

    @Override // io.flutter.plugin.common.PluginRegistry.NewIntentListener
    public boolean onNewIntent(Intent intent) {
        b(this.f21991d, intent);
        return false;
    }

    @Override // io.flutter.embedding.engine.plugins.activity.ActivityAware
    public void onReattachedToActivityForConfigChanges(ActivityPluginBinding activityPluginBinding) {
        activityPluginBinding.addOnNewIntentListener(this);
        b(this.f21991d, activityPluginBinding.getActivity().getIntent());
    }
}

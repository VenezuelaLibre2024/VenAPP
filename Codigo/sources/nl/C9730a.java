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

/* renamed from: nl.a */
/* loaded from: classes3.dex */
public class C9730a implements FlutterPlugin, MethodChannel.MethodCallHandler, EventChannel.StreamHandler, ActivityAware, PluginRegistry.NewIntentListener {

    /* renamed from: a */
    private BroadcastReceiver f23921a;

    /* renamed from: b */
    private String f23922b;

    /* renamed from: c */
    private String f23923c;

    /* renamed from: d */
    private Context f23924d;

    /* renamed from: e */
    private boolean f23925e = true;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: nl.a$a */
    /* loaded from: classes3.dex */
    public class a extends BroadcastReceiver {

        /* renamed from: a */
        final /* synthetic */ EventChannel.EventSink f23926a;

        a(EventChannel.EventSink eventSink) {
            this.f23926a = eventSink;
        }

        @Override // android.content.BroadcastReceiver
        public void onReceive(Context context, Intent intent) {
            String dataString = intent.getDataString();
            if (dataString == null) {
                this.f23926a.error("UNAVAILABLE", "Link unavailable", null);
            } else {
                this.f23926a.success(dataString);
            }
        }
    }

    /* renamed from: a */
    private BroadcastReceiver m29162a(EventChannel.EventSink eventSink) {
        return new a(eventSink);
    }

    /* renamed from: b */
    private void m29163b(Context context, Intent intent) {
        String action = intent.getAction();
        String dataString = intent.getDataString();
        if ("android.intent.action.VIEW".equals(action)) {
            if (this.f23925e) {
                this.f23922b = dataString;
                this.f23925e = false;
            }
            this.f23923c = dataString;
            BroadcastReceiver broadcastReceiver = this.f23921a;
            if (broadcastReceiver != null) {
                broadcastReceiver.onReceive(context, intent);
            }
        }
    }

    /* renamed from: c */
    private static void m29164c(BinaryMessenger binaryMessenger, C9730a c9730a) {
        new MethodChannel(binaryMessenger, "uni_links/messages").setMethodCallHandler(c9730a);
        new EventChannel(binaryMessenger, "uni_links/events").setStreamHandler(c9730a);
    }

    @Override // io.flutter.embedding.engine.plugins.activity.ActivityAware
    public void onAttachedToActivity(ActivityPluginBinding activityPluginBinding) {
        activityPluginBinding.addOnNewIntentListener(this);
        m29163b(this.f23924d, activityPluginBinding.getActivity().getIntent());
    }

    @Override // io.flutter.embedding.engine.plugins.FlutterPlugin
    public void onAttachedToEngine(FlutterPlugin.FlutterPluginBinding flutterPluginBinding) {
        this.f23924d = flutterPluginBinding.getApplicationContext();
        m29164c(flutterPluginBinding.getBinaryMessenger(), this);
    }

    @Override // io.flutter.plugin.common.EventChannel.StreamHandler
    public void onCancel(Object obj) {
        this.f23921a = null;
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
        this.f23921a = m29162a(eventSink);
    }

    @Override // io.flutter.plugin.common.MethodChannel.MethodCallHandler
    public void onMethodCall(MethodCall methodCall, MethodChannel.Result result) {
        String str;
        if (methodCall.method.equals("getInitialLink")) {
            str = this.f23922b;
        } else {
            if (!methodCall.method.equals("getLatestLink")) {
                result.notImplemented();
                return;
            }
            str = this.f23923c;
        }
        result.success(str);
    }

    @Override // io.flutter.plugin.common.PluginRegistry.NewIntentListener
    public boolean onNewIntent(Intent intent) {
        m29163b(this.f23924d, intent);
        return false;
    }

    @Override // io.flutter.embedding.engine.plugins.activity.ActivityAware
    public void onReattachedToActivityForConfigChanges(ActivityPluginBinding activityPluginBinding) {
        activityPluginBinding.addOnNewIntentListener(this);
        m29163b(this.f23924d, activityPluginBinding.getActivity().getIntent());
    }
}

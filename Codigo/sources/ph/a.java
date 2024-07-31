package ph;

import android.os.Environment;
import io.flutter.embedding.engine.plugins.FlutterPlugin;
import io.flutter.plugin.common.MethodCall;
import io.flutter.plugin.common.MethodChannel;
import kotlin.jvm.internal.n;

/* loaded from: classes3.dex */
public final class a implements FlutterPlugin, MethodChannel.MethodCallHandler {

    /* renamed from: a, reason: collision with root package name */
    private MethodChannel f23050a;

    @Override // io.flutter.embedding.engine.plugins.FlutterPlugin
    public void onAttachedToEngine(FlutterPlugin.FlutterPluginBinding flutterPluginBinding) {
        n.e(flutterPluginBinding, "flutterPluginBinding");
        MethodChannel methodChannel = new MethodChannel(flutterPluginBinding.getBinaryMessenger(), "android_path_provider");
        this.f23050a = methodChannel;
        methodChannel.setMethodCallHandler(this);
    }

    @Override // io.flutter.embedding.engine.plugins.FlutterPlugin
    public void onDetachedFromEngine(FlutterPlugin.FlutterPluginBinding binding) {
        n.e(binding, "binding");
        MethodChannel methodChannel = this.f23050a;
        if (methodChannel == null) {
            n.p("channel");
            methodChannel = null;
        }
        methodChannel.setMethodCallHandler(null);
    }

    @Override // io.flutter.plugin.common.MethodChannel.MethodCallHandler
    public void onMethodCall(MethodCall call, MethodChannel.Result result) {
        String str;
        n.e(call, "call");
        n.e(result, "result");
        if (n.a(call.method, "getAlarmsPath")) {
            str = Environment.DIRECTORY_ALARMS;
        } else if (n.a(call.method, "getDCIMPath")) {
            str = Environment.DIRECTORY_DCIM;
        } else if (n.a(call.method, "getDocumentsPath")) {
            str = Environment.DIRECTORY_DOCUMENTS;
        } else if (n.a(call.method, "getDownloadsPath")) {
            str = Environment.DIRECTORY_DOWNLOADS;
        } else if (n.a(call.method, "getMoviesPath")) {
            str = Environment.DIRECTORY_MOVIES;
        } else if (n.a(call.method, "getMusicPath")) {
            str = Environment.DIRECTORY_MUSIC;
        } else if (n.a(call.method, "getNotificationsPath")) {
            str = Environment.DIRECTORY_NOTIFICATIONS;
        } else if (n.a(call.method, "getPicturesPath")) {
            str = Environment.DIRECTORY_PICTURES;
        } else if (n.a(call.method, "getPodcastsPath")) {
            str = Environment.DIRECTORY_PODCASTS;
        } else {
            if (!n.a(call.method, "getRingtonesPath")) {
                result.notImplemented();
                return;
            }
            str = Environment.DIRECTORY_RINGTONES;
        }
        result.success(Environment.getExternalStoragePublicDirectory(str).getAbsolutePath());
    }
}

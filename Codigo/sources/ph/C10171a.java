package ph;

import android.os.Environment;
import io.flutter.embedding.engine.plugins.FlutterPlugin;
import io.flutter.plugin.common.MethodCall;
import io.flutter.plugin.common.MethodChannel;
import kotlin.jvm.internal.C9322n;

/* renamed from: ph.a */
/* loaded from: classes3.dex */
public final class C10171a implements FlutterPlugin, MethodChannel.MethodCallHandler {

    /* renamed from: a */
    private MethodChannel f24983a;

    @Override // io.flutter.embedding.engine.plugins.FlutterPlugin
    public void onAttachedToEngine(FlutterPlugin.FlutterPluginBinding flutterPluginBinding) {
        C9322n.m27781e(flutterPluginBinding, "flutterPluginBinding");
        MethodChannel methodChannel = new MethodChannel(flutterPluginBinding.getBinaryMessenger(), "android_path_provider");
        this.f24983a = methodChannel;
        methodChannel.setMethodCallHandler(this);
    }

    @Override // io.flutter.embedding.engine.plugins.FlutterPlugin
    public void onDetachedFromEngine(FlutterPlugin.FlutterPluginBinding binding) {
        C9322n.m27781e(binding, "binding");
        MethodChannel methodChannel = this.f24983a;
        if (methodChannel == null) {
            C9322n.m27792p("channel");
            methodChannel = null;
        }
        methodChannel.setMethodCallHandler(null);
    }

    @Override // io.flutter.plugin.common.MethodChannel.MethodCallHandler
    public void onMethodCall(MethodCall call, MethodChannel.Result result) {
        String str;
        C9322n.m27781e(call, "call");
        C9322n.m27781e(result, "result");
        if (C9322n.m27777a(call.method, "getAlarmsPath")) {
            str = Environment.DIRECTORY_ALARMS;
        } else if (C9322n.m27777a(call.method, "getDCIMPath")) {
            str = Environment.DIRECTORY_DCIM;
        } else if (C9322n.m27777a(call.method, "getDocumentsPath")) {
            str = Environment.DIRECTORY_DOCUMENTS;
        } else if (C9322n.m27777a(call.method, "getDownloadsPath")) {
            str = Environment.DIRECTORY_DOWNLOADS;
        } else if (C9322n.m27777a(call.method, "getMoviesPath")) {
            str = Environment.DIRECTORY_MOVIES;
        } else if (C9322n.m27777a(call.method, "getMusicPath")) {
            str = Environment.DIRECTORY_MUSIC;
        } else if (C9322n.m27777a(call.method, "getNotificationsPath")) {
            str = Environment.DIRECTORY_NOTIFICATIONS;
        } else if (C9322n.m27777a(call.method, "getPicturesPath")) {
            str = Environment.DIRECTORY_PICTURES;
        } else if (C9322n.m27777a(call.method, "getPodcastsPath")) {
            str = Environment.DIRECTORY_PODCASTS;
        } else {
            if (!C9322n.m27777a(call.method, "getRingtonesPath")) {
                result.notImplemented();
                return;
            }
            str = Environment.DIRECTORY_RINGTONES;
        }
        result.success(Environment.getExternalStoragePublicDirectory(str).getAbsolutePath());
    }
}

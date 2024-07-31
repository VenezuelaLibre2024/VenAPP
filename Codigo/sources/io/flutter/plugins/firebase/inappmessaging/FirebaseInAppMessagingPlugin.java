package io.flutter.plugins.firebase.inappmessaging;

import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.TaskCompletionSource;
import io.flutter.embedding.engine.plugins.FlutterPlugin;
import io.flutter.plugin.common.MethodCall;
import io.flutter.plugin.common.MethodChannel;
import io.flutter.plugins.firebase.analytics.Constants;
import io.flutter.plugins.firebase.core.FlutterFirebasePlugin;
import io.flutter.plugins.firebase.inappmessaging.FirebaseInAppMessagingPlugin;
import java.util.Map;
import java.util.Objects;
import qd.q;
import zb.g;

/* loaded from: classes3.dex */
public class FirebaseInAppMessagingPlugin implements FlutterFirebasePlugin, FlutterPlugin, MethodChannel.MethodCallHandler {
    private MethodChannel channel;

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void lambda$didReinitializeFirebaseCore$1(TaskCompletionSource taskCompletionSource) {
        try {
            taskCompletionSource.setResult(null);
        } catch (Exception e10) {
            taskCompletionSource.setException(e10);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void lambda$getPluginConstantsForFirebaseApp$0(TaskCompletionSource taskCompletionSource) {
        try {
            taskCompletionSource.setResult(null);
        } catch (Exception e10) {
            taskCompletionSource.setException(e10);
        }
    }

    @Override // io.flutter.plugins.firebase.core.FlutterFirebasePlugin
    public Task<Void> didReinitializeFirebaseCore() {
        final TaskCompletionSource taskCompletionSource = new TaskCompletionSource();
        FlutterFirebasePlugin.cachedThreadPool.execute(new Runnable() { // from class: si.b
            @Override // java.lang.Runnable
            public final void run() {
                FirebaseInAppMessagingPlugin.lambda$didReinitializeFirebaseCore$1(TaskCompletionSource.this);
            }
        });
        return taskCompletionSource.getTask();
    }

    @Override // io.flutter.plugins.firebase.core.FlutterFirebasePlugin
    public Task<Map<String, Object>> getPluginConstantsForFirebaseApp(g gVar) {
        final TaskCompletionSource taskCompletionSource = new TaskCompletionSource();
        FlutterFirebasePlugin.cachedThreadPool.execute(new Runnable() { // from class: si.a
            @Override // java.lang.Runnable
            public final void run() {
                FirebaseInAppMessagingPlugin.lambda$getPluginConstantsForFirebaseApp$0(TaskCompletionSource.this);
            }
        });
        return taskCompletionSource.getTask();
    }

    @Override // io.flutter.embedding.engine.plugins.FlutterPlugin
    public void onAttachedToEngine(FlutterPlugin.FlutterPluginBinding flutterPluginBinding) {
        MethodChannel methodChannel = new MethodChannel(flutterPluginBinding.getBinaryMessenger(), "plugins.flutter.io/firebase_in_app_messaging");
        this.channel = methodChannel;
        methodChannel.setMethodCallHandler(new FirebaseInAppMessagingPlugin());
    }

    @Override // io.flutter.embedding.engine.plugins.FlutterPlugin
    public void onDetachedFromEngine(FlutterPlugin.FlutterPluginBinding flutterPluginBinding) {
        MethodChannel methodChannel = this.channel;
        if (methodChannel != null) {
            methodChannel.setMethodCallHandler(null);
            this.channel = null;
        }
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:13:0x002f. Please report as an issue. */
    @Override // io.flutter.plugin.common.MethodChannel.MethodCallHandler
    public void onMethodCall(MethodCall methodCall, MethodChannel.Result result) {
        String str = methodCall.method;
        str.hashCode();
        char c10 = 65535;
        switch (str.hashCode()) {
            case -1239842282:
                if (str.equals("FirebaseInAppMessaging#triggerEvent")) {
                    c10 = 0;
                    break;
                }
                break;
            case -966702930:
                if (str.equals("FirebaseInAppMessaging#setMessagesSuppressed")) {
                    c10 = 1;
                    break;
                }
                break;
            case 971268604:
                if (str.equals("FirebaseInAppMessaging#setAutomaticDataCollectionEnabled")) {
                    c10 = 2;
                    break;
                }
                break;
        }
        switch (c10) {
            case 0:
                String str2 = (String) methodCall.argument(Constants.EVENT_NAME);
                Objects.requireNonNull(str2);
                q.e().k(str2);
                result.success(null);
                return;
            case 1:
                Boolean bool = (Boolean) methodCall.argument("suppress");
                Objects.requireNonNull(bool);
                q.e().j(bool);
                result.success(null);
                return;
            case 2:
                q.e().h((Boolean) methodCall.argument("enabled"));
                result.success(null);
                return;
            default:
                result.notImplemented();
                return;
        }
    }
}

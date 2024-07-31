package io.flutter.plugins.firebase.installations.firebase_app_installations;

import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.Tasks;
import io.flutter.embedding.engine.plugins.FlutterPlugin;
import io.flutter.plugin.common.BinaryMessenger;
import io.flutter.plugin.common.EventChannel;
import io.flutter.plugin.common.MethodCall;
import io.flutter.plugin.common.MethodChannel;
import io.flutter.plugins.firebase.core.FlutterFirebasePlugin;
import io.flutter.plugins.firebase.core.FlutterFirebasePluginRegistry;
import io.flutter.plugins.firebase.crashlytics.Constants;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
import java.util.concurrent.Callable;

/* loaded from: classes3.dex */
public class FirebaseInstallationsPlugin implements FlutterFirebasePlugin, FlutterPlugin, MethodChannel.MethodCallHandler {
    private static final String METHOD_CHANNEL_NAME = "plugins.flutter.io/firebase_app_installations";
    private MethodChannel channel;
    private BinaryMessenger messenger;
    private final Map<EventChannel, EventChannel.StreamHandler> streamHandlers = new HashMap();

    private Task<Void> deleteId(Map<String, Object> map) {
        return Tasks.call(FlutterFirebasePlugin.cachedThreadPool, new Callable() { // from class: io.flutter.plugins.firebase.installations.firebase_app_installations.c

            /* renamed from: b */
            public final /* synthetic */ Map f18178b;

            public /* synthetic */ c(Map map2) {
                r2 = map2;
            }

            @Override // java.util.concurrent.Callable
            public final Object call() {
                Void lambda$deleteId$3;
                lambda$deleteId$3 = FirebaseInstallationsPlugin.this.lambda$deleteId$3(r2);
                return lambda$deleteId$3;
            }
        });
    }

    private Map<String, Object> getExceptionDetails(Exception exc) {
        HashMap hashMap = new HashMap();
        hashMap.put("code", "unknown");
        hashMap.put(Constants.MESSAGE, exc != null ? exc.getMessage() : "An unknown error has occurred.");
        return hashMap;
    }

    private Task<String> getId(Map<String, Object> map) {
        return Tasks.call(FlutterFirebasePlugin.cachedThreadPool, new Callable() { // from class: io.flutter.plugins.firebase.installations.firebase_app_installations.a

            /* renamed from: b */
            public final /* synthetic */ Map f18174b;

            public /* synthetic */ a(Map map2) {
                r2 = map2;
            }

            @Override // java.util.concurrent.Callable
            public final Object call() {
                String lambda$getId$0;
                lambda$getId$0 = FirebaseInstallationsPlugin.this.lambda$getId$0(r2);
                return lambda$getId$0;
            }
        });
    }

    private com.google.firebase.installations.c getInstallations(Map<String, Object> map) {
        Object obj = map.get("appName");
        Objects.requireNonNull(obj);
        return com.google.firebase.installations.c.t(zb.g.p((String) obj));
    }

    private Task<String> getToken(Map<String, Object> map) {
        return Tasks.call(FlutterFirebasePlugin.cachedThreadPool, new Callable() { // from class: io.flutter.plugins.firebase.installations.firebase_app_installations.g

            /* renamed from: b */
            public final /* synthetic */ Map f18182b;

            public /* synthetic */ g(Map map2) {
                r2 = map2;
            }

            @Override // java.util.concurrent.Callable
            public final Object call() {
                String lambda$getToken$1;
                lambda$getToken$1 = FirebaseInstallationsPlugin.this.lambda$getToken$1(r2);
                return lambda$getToken$1;
            }
        });
    }

    public /* synthetic */ Void lambda$deleteId$3(Map map) {
        return (Void) Tasks.await(getInstallations(map).j());
    }

    public static /* synthetic */ Void lambda$didReinitializeFirebaseCore$6() {
        return null;
    }

    public /* synthetic */ String lambda$getId$0(Map map) {
        return (String) Tasks.await(getInstallations(map).getId());
    }

    public static /* synthetic */ Map lambda$getPluginConstantsForFirebaseApp$5() {
        return null;
    }

    public /* synthetic */ String lambda$getToken$1(Map map) {
        com.google.firebase.installations.c installations = getInstallations(map);
        Object obj = map.get("forceRefresh");
        Objects.requireNonNull(obj);
        return ((com.google.firebase.installations.g) Tasks.await(installations.a(((Boolean) obj).booleanValue()))).b();
    }

    public /* synthetic */ void lambda$onMethodCall$4(MethodChannel.Result result, Task task) {
        if (task.isSuccessful()) {
            result.success(task.getResult());
        } else {
            Exception exception = task.getException();
            result.error("firebase_app_installations", exception != null ? exception.getMessage() : null, getExceptionDetails(exception));
        }
    }

    public /* synthetic */ String lambda$registerIdChangeListener$2(Map map) {
        Object obj = map.get("appName");
        Objects.requireNonNull(obj);
        TokenChannelStreamHandler tokenChannelStreamHandler = new TokenChannelStreamHandler(getInstallations(map));
        String str = "plugins.flutter.io/firebase_app_installations/token/" + ((String) obj);
        EventChannel eventChannel = new EventChannel(this.messenger, str);
        eventChannel.setStreamHandler(tokenChannelStreamHandler);
        this.streamHandlers.put(eventChannel, tokenChannelStreamHandler);
        return str;
    }

    private Task<String> registerIdChangeListener(Map<String, Object> map) {
        return Tasks.call(FlutterFirebasePlugin.cachedThreadPool, new Callable() { // from class: io.flutter.plugins.firebase.installations.firebase_app_installations.e

            /* renamed from: b */
            public final /* synthetic */ Map f18180b;

            public /* synthetic */ e(Map map2) {
                r2 = map2;
            }

            @Override // java.util.concurrent.Callable
            public final Object call() {
                String lambda$registerIdChangeListener$2;
                lambda$registerIdChangeListener$2 = FirebaseInstallationsPlugin.this.lambda$registerIdChangeListener$2(r2);
                return lambda$registerIdChangeListener$2;
            }
        });
    }

    private void removeEventListeners() {
        for (EventChannel eventChannel : this.streamHandlers.keySet()) {
            this.streamHandlers.get(eventChannel).onCancel(null);
            eventChannel.setStreamHandler(null);
        }
        this.streamHandlers.clear();
    }

    private MethodChannel setup(BinaryMessenger binaryMessenger) {
        MethodChannel methodChannel = new MethodChannel(binaryMessenger, METHOD_CHANNEL_NAME);
        methodChannel.setMethodCallHandler(this);
        this.messenger = binaryMessenger;
        return methodChannel;
    }

    @Override // io.flutter.plugins.firebase.core.FlutterFirebasePlugin
    public Task<Void> didReinitializeFirebaseCore() {
        return Tasks.call(FlutterFirebasePlugin.cachedThreadPool, new Callable() { // from class: io.flutter.plugins.firebase.installations.firebase_app_installations.d
            @Override // java.util.concurrent.Callable
            public final Object call() {
                Void lambda$didReinitializeFirebaseCore$6;
                lambda$didReinitializeFirebaseCore$6 = FirebaseInstallationsPlugin.lambda$didReinitializeFirebaseCore$6();
                return lambda$didReinitializeFirebaseCore$6;
            }
        });
    }

    @Override // io.flutter.plugins.firebase.core.FlutterFirebasePlugin
    public Task<Map<String, Object>> getPluginConstantsForFirebaseApp(zb.g gVar) {
        return Tasks.call(FlutterFirebasePlugin.cachedThreadPool, new Callable() { // from class: io.flutter.plugins.firebase.installations.firebase_app_installations.f
            @Override // java.util.concurrent.Callable
            public final Object call() {
                Map lambda$getPluginConstantsForFirebaseApp$5;
                lambda$getPluginConstantsForFirebaseApp$5 = FirebaseInstallationsPlugin.lambda$getPluginConstantsForFirebaseApp$5();
                return lambda$getPluginConstantsForFirebaseApp$5;
            }
        });
    }

    @Override // io.flutter.embedding.engine.plugins.FlutterPlugin
    public void onAttachedToEngine(FlutterPlugin.FlutterPluginBinding flutterPluginBinding) {
        this.channel = setup(flutterPluginBinding.getBinaryMessenger());
        FlutterFirebasePluginRegistry.registerPlugin(METHOD_CHANNEL_NAME, this);
    }

    @Override // io.flutter.embedding.engine.plugins.FlutterPlugin
    public void onDetachedFromEngine(FlutterPlugin.FlutterPluginBinding flutterPluginBinding) {
        this.channel.setMethodCallHandler(null);
        this.channel = null;
        this.messenger = null;
        removeEventListeners();
    }

    @Override // io.flutter.plugin.common.MethodChannel.MethodCallHandler
    public void onMethodCall(MethodCall methodCall, MethodChannel.Result result) {
        Task registerIdChangeListener;
        String str = methodCall.method;
        str.hashCode();
        char c10 = 65535;
        switch (str.hashCode()) {
            case -1186391021:
                if (str.equals("FirebaseInstallations#registerIdChangeListener")) {
                    c10 = 0;
                    break;
                }
                break;
            case -230254828:
                if (str.equals("FirebaseInstallations#getToken")) {
                    c10 = 1;
                    break;
                }
                break;
            case 751549920:
                if (str.equals("FirebaseInstallations#getId")) {
                    c10 = 2;
                    break;
                }
                break;
            case 1737112764:
                if (str.equals("FirebaseInstallations#delete")) {
                    c10 = 3;
                    break;
                }
                break;
        }
        switch (c10) {
            case 0:
                registerIdChangeListener = registerIdChangeListener((Map) methodCall.arguments());
                break;
            case 1:
                registerIdChangeListener = getToken((Map) methodCall.arguments());
                break;
            case 2:
                registerIdChangeListener = getId((Map) methodCall.arguments());
                break;
            case 3:
                registerIdChangeListener = deleteId((Map) methodCall.arguments());
                break;
            default:
                result.notImplemented();
                return;
        }
        registerIdChangeListener.addOnCompleteListener(new OnCompleteListener() { // from class: io.flutter.plugins.firebase.installations.firebase_app_installations.b

            /* renamed from: b */
            public final /* synthetic */ MethodChannel.Result f18176b;

            public /* synthetic */ b(MethodChannel.Result result2) {
                r2 = result2;
            }

            @Override // com.google.android.gms.tasks.OnCompleteListener
            public final void onComplete(Task task) {
                FirebaseInstallationsPlugin.this.lambda$onMethodCall$4(r2, task);
            }
        });
    }
}

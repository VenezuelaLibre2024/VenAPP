package io.flutter.plugins.firebase.appcheck;

import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.TaskCompletionSource;
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

/* loaded from: classes3.dex */
public class FlutterFirebaseAppCheckPlugin implements FlutterFirebasePlugin, FlutterPlugin, MethodChannel.MethodCallHandler {
    static final /* synthetic */ boolean $assertionsDisabled = false;
    private static final String METHOD_CHANNEL_NAME = "plugins.flutter.io/firebase_app_check";
    private MethodChannel channel;
    private BinaryMessenger messenger;
    private final Map<EventChannel, TokenChannelStreamHandler> streamHandlers = new HashMap();
    private final String debugProvider = "debug";
    private final String safetyNetProvider = "safetyNet";
    private final String playIntegrity = "playIntegrity";

    private Task<Void> activate(Map<String, Object> map) {
        TaskCompletionSource taskCompletionSource = new TaskCompletionSource();
        FlutterFirebasePlugin.cachedThreadPool.execute(new Runnable() { // from class: io.flutter.plugins.firebase.appcheck.d

            /* renamed from: b */
            public final /* synthetic */ Map f17985b;

            /* renamed from: c */
            public final /* synthetic */ TaskCompletionSource f17986c;

            public /* synthetic */ d(Map map2, TaskCompletionSource taskCompletionSource2) {
                r2 = map2;
                r3 = taskCompletionSource2;
            }

            @Override // java.lang.Runnable
            public final void run() {
                FlutterFirebaseAppCheckPlugin.this.lambda$activate$1(r2, r3);
            }
        });
        return taskCompletionSource2.getTask();
    }

    private ec.e getAppCheck(Map<String, Object> map) {
        Object obj = map.get("appName");
        Objects.requireNonNull(obj);
        return ec.e.e(zb.g.p((String) obj));
    }

    private Map<String, Object> getExceptionDetails(Exception exc) {
        HashMap hashMap = new HashMap();
        hashMap.put("code", "unknown");
        hashMap.put(Constants.MESSAGE, exc != null ? exc.getMessage() : "An unknown error has occurred.");
        return hashMap;
    }

    private Task<String> getLimitedUseAppCheckToken(Map<String, Object> map) {
        TaskCompletionSource taskCompletionSource = new TaskCompletionSource();
        FlutterFirebasePlugin.cachedThreadPool.execute(new Runnable() { // from class: io.flutter.plugins.firebase.appcheck.b

            /* renamed from: b */
            public final /* synthetic */ Map f17981b;

            /* renamed from: c */
            public final /* synthetic */ TaskCompletionSource f17982c;

            public /* synthetic */ b(Map map2, TaskCompletionSource taskCompletionSource2) {
                r2 = map2;
                r3 = taskCompletionSource2;
            }

            @Override // java.lang.Runnable
            public final void run() {
                FlutterFirebaseAppCheckPlugin.this.lambda$getLimitedUseAppCheckToken$0(r2, r3);
            }
        });
        return taskCompletionSource2.getTask();
    }

    private Task<String> getToken(Map<String, Object> map) {
        TaskCompletionSource taskCompletionSource = new TaskCompletionSource();
        FlutterFirebasePlugin.cachedThreadPool.execute(new Runnable() { // from class: io.flutter.plugins.firebase.appcheck.a

            /* renamed from: b */
            public final /* synthetic */ Map f17978b;

            /* renamed from: c */
            public final /* synthetic */ TaskCompletionSource f17979c;

            public /* synthetic */ a(Map map2, TaskCompletionSource taskCompletionSource2) {
                r2 = map2;
                r3 = taskCompletionSource2;
            }

            @Override // java.lang.Runnable
            public final void run() {
                FlutterFirebaseAppCheckPlugin.this.lambda$getToken$2(r2, r3);
            }
        });
        return taskCompletionSource2.getTask();
    }

    private void initInstance(BinaryMessenger binaryMessenger) {
        FlutterFirebasePluginRegistry.registerPlugin(METHOD_CHANNEL_NAME, this);
        MethodChannel methodChannel = new MethodChannel(binaryMessenger, METHOD_CHANNEL_NAME);
        this.channel = methodChannel;
        methodChannel.setMethodCallHandler(this);
        this.messenger = binaryMessenger;
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x0042  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x005c A[Catch: Exception -> 0x006a, TryCatch #0 {Exception -> 0x006a, blocks: (B:2:0x0000, B:14:0x0065, B:18:0x0047, B:19:0x004f, B:20:0x0053, B:21:0x005c, B:22:0x0021, B:25:0x002b, B:28:0x0035), top: B:1:0x0000 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public /* synthetic */ void lambda$activate$1(java.util.Map r6, com.google.android.gms.tasks.TaskCompletionSource r7) {
        /*
            r5 = this;
            java.lang.String r0 = "androidProvider"
            java.lang.Object r0 = r6.get(r0)     // Catch: java.lang.Exception -> L6a
            java.util.Objects.requireNonNull(r0)     // Catch: java.lang.Exception -> L6a
            java.lang.String r0 = (java.lang.String) r0     // Catch: java.lang.Exception -> L6a
            int r1 = r0.hashCode()     // Catch: java.lang.Exception -> L6a
            r2 = -1111504533(0xffffffffbdbfc96b, float:-0.09364589)
            r3 = 2
            r4 = 1
            if (r1 == r2) goto L35
            r2 = 95458899(0x5b09653, float:1.6606181E-35)
            if (r1 == r2) goto L2b
            r2 = 242544249(0xe74ee79, float:3.0190142E-30)
            if (r1 == r2) goto L21
            goto L3f
        L21:
            java.lang.String r1 = "playIntegrity"
            boolean r0 = r0.equals(r1)     // Catch: java.lang.Exception -> L6a
            if (r0 == 0) goto L3f
            r0 = r3
            goto L40
        L2b:
            java.lang.String r1 = "debug"
            boolean r0 = r0.equals(r1)     // Catch: java.lang.Exception -> L6a
            if (r0 == 0) goto L3f
            r0 = 0
            goto L40
        L35:
            java.lang.String r1 = "safetyNet"
            boolean r0 = r0.equals(r1)     // Catch: java.lang.Exception -> L6a
            if (r0 == 0) goto L3f
            r0 = r4
            goto L40
        L3f:
            r0 = -1
        L40:
            if (r0 == 0) goto L5c
            if (r0 == r4) goto L53
            if (r0 == r3) goto L47
            goto L65
        L47:
            ec.e r6 = r5.getAppCheck(r6)     // Catch: java.lang.Exception -> L6a
            kc.b r0 = kc.b.b()     // Catch: java.lang.Exception -> L6a
        L4f:
            r6.g(r0)     // Catch: java.lang.Exception -> L6a
            goto L65
        L53:
            ec.e r6 = r5.getAppCheck(r6)     // Catch: java.lang.Exception -> L6a
            mc.b r0 = mc.b.b()     // Catch: java.lang.Exception -> L6a
            goto L4f
        L5c:
            ec.e r6 = r5.getAppCheck(r6)     // Catch: java.lang.Exception -> L6a
            fc.a r0 = fc.a.b()     // Catch: java.lang.Exception -> L6a
            goto L4f
        L65:
            r6 = 0
            r7.setResult(r6)     // Catch: java.lang.Exception -> L6a
            goto L6e
        L6a:
            r6 = move-exception
            r7.setException(r6)
        L6e:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: io.flutter.plugins.firebase.appcheck.FlutterFirebaseAppCheckPlugin.lambda$activate$1(java.util.Map, com.google.android.gms.tasks.TaskCompletionSource):void");
    }

    public static /* synthetic */ void lambda$didReinitializeFirebaseCore$7(TaskCompletionSource taskCompletionSource) {
        try {
            taskCompletionSource.setResult(null);
        } catch (Exception e10) {
            taskCompletionSource.setException(e10);
        }
    }

    public /* synthetic */ void lambda$getLimitedUseAppCheckToken$0(Map map, TaskCompletionSource taskCompletionSource) {
        try {
            taskCompletionSource.setResult(((ec.c) Tasks.await(getAppCheck(map).f())).b());
        } catch (Exception e10) {
            taskCompletionSource.setException(e10);
        }
    }

    public static /* synthetic */ void lambda$getPluginConstantsForFirebaseApp$6(TaskCompletionSource taskCompletionSource) {
        try {
            taskCompletionSource.setResult(null);
        } catch (Exception e10) {
            taskCompletionSource.setException(e10);
        }
    }

    public /* synthetic */ void lambda$getToken$2(Map map, TaskCompletionSource taskCompletionSource) {
        try {
            ec.e appCheck = getAppCheck(map);
            Object obj = map.get("forceRefresh");
            Objects.requireNonNull(obj);
            taskCompletionSource.setResult(((ec.c) Tasks.await(appCheck.d(((Boolean) obj).booleanValue()))).b());
        } catch (Exception e10) {
            taskCompletionSource.setException(e10);
        }
    }

    public /* synthetic */ void lambda$onMethodCall$5(MethodChannel.Result result, Task task) {
        if (task.isSuccessful()) {
            result.success(task.getResult());
        } else {
            Exception exception = task.getException();
            result.error("firebase_app_check", exception != null ? exception.getMessage() : null, getExceptionDetails(exception));
        }
    }

    public /* synthetic */ void lambda$registerTokenListener$4(Map map, TaskCompletionSource taskCompletionSource) {
        try {
            Object obj = map.get("appName");
            Objects.requireNonNull(obj);
            TokenChannelStreamHandler tokenChannelStreamHandler = new TokenChannelStreamHandler(getAppCheck(map));
            String str = "plugins.flutter.io/firebase_app_check/token/" + ((String) obj);
            EventChannel eventChannel = new EventChannel(this.messenger, str);
            eventChannel.setStreamHandler(tokenChannelStreamHandler);
            this.streamHandlers.put(eventChannel, tokenChannelStreamHandler);
            taskCompletionSource.setResult(str);
        } catch (Exception e10) {
            taskCompletionSource.setException(e10);
        }
    }

    public /* synthetic */ void lambda$setTokenAutoRefreshEnabled$3(Map map, TaskCompletionSource taskCompletionSource) {
        try {
            ec.e appCheck = getAppCheck(map);
            Object obj = map.get("isTokenAutoRefreshEnabled");
            Objects.requireNonNull(obj);
            appCheck.i(((Boolean) obj).booleanValue());
            taskCompletionSource.setResult(null);
        } catch (Exception e10) {
            taskCompletionSource.setException(e10);
        }
    }

    private Task<String> registerTokenListener(Map<String, Object> map) {
        TaskCompletionSource taskCompletionSource = new TaskCompletionSource();
        FlutterFirebasePlugin.cachedThreadPool.execute(new Runnable() { // from class: io.flutter.plugins.firebase.appcheck.g

            /* renamed from: b */
            public final /* synthetic */ Map f17993b;

            /* renamed from: c */
            public final /* synthetic */ TaskCompletionSource f17994c;

            public /* synthetic */ g(Map map2, TaskCompletionSource taskCompletionSource2) {
                r2 = map2;
                r3 = taskCompletionSource2;
            }

            @Override // java.lang.Runnable
            public final void run() {
                FlutterFirebaseAppCheckPlugin.this.lambda$registerTokenListener$4(r2, r3);
            }
        });
        return taskCompletionSource2.getTask();
    }

    private void removeEventListeners() {
        for (EventChannel eventChannel : this.streamHandlers.keySet()) {
            this.streamHandlers.get(eventChannel).onCancel(null);
            eventChannel.setStreamHandler(null);
        }
        this.streamHandlers.clear();
    }

    private Task<Void> setTokenAutoRefreshEnabled(Map<String, Object> map) {
        TaskCompletionSource taskCompletionSource = new TaskCompletionSource();
        FlutterFirebasePlugin.cachedThreadPool.execute(new Runnable() { // from class: io.flutter.plugins.firebase.appcheck.e

            /* renamed from: b */
            public final /* synthetic */ Map f17988b;

            /* renamed from: c */
            public final /* synthetic */ TaskCompletionSource f17989c;

            public /* synthetic */ e(Map map2, TaskCompletionSource taskCompletionSource2) {
                r2 = map2;
                r3 = taskCompletionSource2;
            }

            @Override // java.lang.Runnable
            public final void run() {
                FlutterFirebaseAppCheckPlugin.this.lambda$setTokenAutoRefreshEnabled$3(r2, r3);
            }
        });
        return taskCompletionSource2.getTask();
    }

    @Override // io.flutter.plugins.firebase.core.FlutterFirebasePlugin
    public Task<Void> didReinitializeFirebaseCore() {
        TaskCompletionSource taskCompletionSource = new TaskCompletionSource();
        FlutterFirebasePlugin.cachedThreadPool.execute(new Runnable() { // from class: io.flutter.plugins.firebase.appcheck.h
            public /* synthetic */ h() {
            }

            @Override // java.lang.Runnable
            public final void run() {
                FlutterFirebaseAppCheckPlugin.lambda$didReinitializeFirebaseCore$7(TaskCompletionSource.this);
            }
        });
        return taskCompletionSource.getTask();
    }

    @Override // io.flutter.plugins.firebase.core.FlutterFirebasePlugin
    public Task<Map<String, Object>> getPluginConstantsForFirebaseApp(zb.g gVar) {
        TaskCompletionSource taskCompletionSource = new TaskCompletionSource();
        FlutterFirebasePlugin.cachedThreadPool.execute(new Runnable() { // from class: io.flutter.plugins.firebase.appcheck.c
            public /* synthetic */ c() {
            }

            @Override // java.lang.Runnable
            public final void run() {
                FlutterFirebaseAppCheckPlugin.lambda$getPluginConstantsForFirebaseApp$6(TaskCompletionSource.this);
            }
        });
        return taskCompletionSource.getTask();
    }

    @Override // io.flutter.embedding.engine.plugins.FlutterPlugin
    public void onAttachedToEngine(FlutterPlugin.FlutterPluginBinding flutterPluginBinding) {
        initInstance(flutterPluginBinding.getBinaryMessenger());
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
        Task limitedUseAppCheckToken;
        String str = methodCall.method;
        str.hashCode();
        char c10 = 65535;
        switch (str.hashCode()) {
            case -1278813948:
                if (str.equals("FirebaseAppCheck#getLimitedUseAppCheckToken")) {
                    c10 = 0;
                    break;
                }
                break;
            case -672622207:
                if (str.equals("FirebaseAppCheck#setTokenAutoRefreshEnabled")) {
                    c10 = 1;
                    break;
                }
                break;
            case -65506347:
                if (str.equals("FirebaseAppCheck#registerTokenListener")) {
                    c10 = 2;
                    break;
                }
                break;
            case 380266104:
                if (str.equals("FirebaseAppCheck#getToken")) {
                    c10 = 3;
                    break;
                }
                break;
            case 1052891944:
                if (str.equals("FirebaseAppCheck#activate")) {
                    c10 = 4;
                    break;
                }
                break;
        }
        switch (c10) {
            case 0:
                limitedUseAppCheckToken = getLimitedUseAppCheckToken((Map) methodCall.arguments());
                break;
            case 1:
                limitedUseAppCheckToken = setTokenAutoRefreshEnabled((Map) methodCall.arguments());
                break;
            case 2:
                limitedUseAppCheckToken = registerTokenListener((Map) methodCall.arguments());
                break;
            case 3:
                limitedUseAppCheckToken = getToken((Map) methodCall.arguments());
                break;
            case 4:
                limitedUseAppCheckToken = activate((Map) methodCall.arguments());
                break;
            default:
                result.notImplemented();
                return;
        }
        limitedUseAppCheckToken.addOnCompleteListener(new OnCompleteListener() { // from class: io.flutter.plugins.firebase.appcheck.f

            /* renamed from: b */
            public final /* synthetic */ MethodChannel.Result f17991b;

            public /* synthetic */ f(MethodChannel.Result result2) {
                r2 = result2;
            }

            @Override // com.google.android.gms.tasks.OnCompleteListener
            public final void onComplete(Task task) {
                FlutterFirebaseAppCheckPlugin.this.lambda$onMethodCall$5(r2, task);
            }
        });
    }
}

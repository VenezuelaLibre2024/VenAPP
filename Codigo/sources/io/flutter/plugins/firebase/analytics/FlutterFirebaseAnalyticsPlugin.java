package io.flutter.plugins.firebase.analytics;

import android.content.Context;
import android.os.Bundle;
import android.os.Parcelable;
import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.TaskCompletionSource;
import com.google.android.gms.tasks.Tasks;
import com.google.firebase.analytics.FirebaseAnalytics;
import io.flutter.embedding.engine.plugins.FlutterPlugin;
import io.flutter.plugin.common.BinaryMessenger;
import io.flutter.plugin.common.MethodCall;
import io.flutter.plugin.common.MethodChannel;
import io.flutter.plugins.firebase.core.FlutterFirebasePlugin;
import io.flutter.plugins.firebase.core.FlutterFirebasePluginRegistry;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

/* loaded from: classes3.dex */
public class FlutterFirebaseAnalyticsPlugin implements FlutterFirebasePlugin, MethodChannel.MethodCallHandler, FlutterPlugin {
    private FirebaseAnalytics analytics;
    private MethodChannel channel;

    /* renamed from: io.flutter.plugins.firebase.analytics.FlutterFirebaseAnalyticsPlugin$1 */
    /* loaded from: classes3.dex */
    public class AnonymousClass1 extends HashMap<String, Object> {
        AnonymousClass1() {
        }
    }

    private static Bundle createBundleFromMap(Map<String, Object> map) {
        long intValue;
        if (map == null) {
            return null;
        }
        Bundle bundle = new Bundle();
        for (Map.Entry<String, Object> entry : map.entrySet()) {
            Object value = entry.getValue();
            String key = entry.getKey();
            if (value instanceof String) {
                bundle.putString(key, (String) value);
            } else {
                if (value instanceof Integer) {
                    intValue = ((Integer) value).intValue();
                } else if (value instanceof Long) {
                    intValue = ((Long) value).longValue();
                } else if (value instanceof Double) {
                    bundle.putDouble(key, ((Double) value).doubleValue());
                } else if (value instanceof Boolean) {
                    bundle.putBoolean(key, ((Boolean) value).booleanValue());
                } else if (value == null) {
                    bundle.putString(key, null);
                } else if (value instanceof Iterable) {
                    ArrayList<? extends Parcelable> arrayList = new ArrayList<>();
                    for (Object obj : (Iterable) value) {
                        if (!(obj instanceof Map)) {
                            throw new IllegalArgumentException("Unsupported value type: " + obj.getClass().getCanonicalName() + " in list at key " + key);
                        }
                        arrayList.add(createBundleFromMap((Map) obj));
                    }
                    bundle.putParcelableArrayList(key, arrayList);
                } else {
                    if (!(value instanceof Map)) {
                        throw new IllegalArgumentException("Unsupported value type: " + value.getClass().getCanonicalName());
                    }
                    bundle.putParcelable(key, createBundleFromMap((Map) value));
                }
                bundle.putLong(key, intValue);
            }
        }
        return bundle;
    }

    private Task<String> handleGetAppInstanceId() {
        TaskCompletionSource taskCompletionSource = new TaskCompletionSource();
        FlutterFirebasePlugin.cachedThreadPool.execute(new Runnable() { // from class: io.flutter.plugins.firebase.analytics.f

            /* renamed from: b */
            public final /* synthetic */ TaskCompletionSource f17959b;

            public /* synthetic */ f(TaskCompletionSource taskCompletionSource2) {
                r2 = taskCompletionSource2;
            }

            @Override // java.lang.Runnable
            public final void run() {
                FlutterFirebaseAnalyticsPlugin.this.lambda$handleGetAppInstanceId$10(r2);
            }
        });
        return taskCompletionSource2.getTask();
    }

    private Task<Long> handleGetSessionId() {
        TaskCompletionSource taskCompletionSource = new TaskCompletionSource();
        FlutterFirebasePlugin.cachedThreadPool.execute(new Runnable() { // from class: io.flutter.plugins.firebase.analytics.c

            /* renamed from: b */
            public final /* synthetic */ TaskCompletionSource f17952b;

            public /* synthetic */ c(TaskCompletionSource taskCompletionSource2) {
                r2 = taskCompletionSource2;
            }

            @Override // java.lang.Runnable
            public final void run() {
                FlutterFirebaseAnalyticsPlugin.this.lambda$handleGetSessionId$1(r2);
            }
        });
        return taskCompletionSource2.getTask();
    }

    private Task<Void> handleLogEvent(Map<String, Object> map) {
        TaskCompletionSource taskCompletionSource = new TaskCompletionSource();
        FlutterFirebasePlugin.cachedThreadPool.execute(new Runnable() { // from class: io.flutter.plugins.firebase.analytics.k

            /* renamed from: b */
            public final /* synthetic */ Map f17969b;

            /* renamed from: c */
            public final /* synthetic */ TaskCompletionSource f17970c;

            public /* synthetic */ k(Map map2, TaskCompletionSource taskCompletionSource2) {
                r2 = map2;
                r3 = taskCompletionSource2;
            }

            @Override // java.lang.Runnable
            public final void run() {
                FlutterFirebaseAnalyticsPlugin.this.lambda$handleLogEvent$2(r2, r3);
            }
        });
        return taskCompletionSource2.getTask();
    }

    private Task<Void> handleResetAnalyticsData() {
        TaskCompletionSource taskCompletionSource = new TaskCompletionSource();
        FlutterFirebasePlugin.cachedThreadPool.execute(new Runnable() { // from class: io.flutter.plugins.firebase.analytics.d

            /* renamed from: b */
            public final /* synthetic */ TaskCompletionSource f17954b;

            public /* synthetic */ d(TaskCompletionSource taskCompletionSource2) {
                r2 = taskCompletionSource2;
            }

            @Override // java.lang.Runnable
            public final void run() {
                FlutterFirebaseAnalyticsPlugin.this.lambda$handleResetAnalyticsData$7(r2);
            }
        });
        return taskCompletionSource2.getTask();
    }

    private Task<Void> handleSetAnalyticsCollectionEnabled(Map<String, Object> map) {
        TaskCompletionSource taskCompletionSource = new TaskCompletionSource();
        FlutterFirebasePlugin.cachedThreadPool.execute(new Runnable() { // from class: io.flutter.plugins.firebase.analytics.m

            /* renamed from: b */
            public final /* synthetic */ Map f17975b;

            /* renamed from: c */
            public final /* synthetic */ TaskCompletionSource f17976c;

            public /* synthetic */ m(Map map2, TaskCompletionSource taskCompletionSource2) {
                r2 = map2;
                r3 = taskCompletionSource2;
            }

            @Override // java.lang.Runnable
            public final void run() {
                FlutterFirebaseAnalyticsPlugin.this.lambda$handleSetAnalyticsCollectionEnabled$4(r2, r3);
            }
        });
        return taskCompletionSource2.getTask();
    }

    private Task<Void> handleSetSessionTimeoutDuration(Map<String, Object> map) {
        TaskCompletionSource taskCompletionSource = new TaskCompletionSource();
        FlutterFirebasePlugin.cachedThreadPool.execute(new Runnable() { // from class: io.flutter.plugins.firebase.analytics.e

            /* renamed from: b */
            public final /* synthetic */ Map f17956b;

            /* renamed from: c */
            public final /* synthetic */ TaskCompletionSource f17957c;

            public /* synthetic */ e(Map map2, TaskCompletionSource taskCompletionSource2) {
                r2 = map2;
                r3 = taskCompletionSource2;
            }

            @Override // java.lang.Runnable
            public final void run() {
                FlutterFirebaseAnalyticsPlugin.this.lambda$handleSetSessionTimeoutDuration$5(r2, r3);
            }
        });
        return taskCompletionSource2.getTask();
    }

    private Task<Void> handleSetUserId(Map<String, Object> map) {
        TaskCompletionSource taskCompletionSource = new TaskCompletionSource();
        FlutterFirebasePlugin.cachedThreadPool.execute(new Runnable() { // from class: io.flutter.plugins.firebase.analytics.a

            /* renamed from: b */
            public final /* synthetic */ Map f17947b;

            /* renamed from: c */
            public final /* synthetic */ TaskCompletionSource f17948c;

            public /* synthetic */ a(Map map2, TaskCompletionSource taskCompletionSource2) {
                r2 = map2;
                r3 = taskCompletionSource2;
            }

            @Override // java.lang.Runnable
            public final void run() {
                FlutterFirebaseAnalyticsPlugin.this.lambda$handleSetUserId$3(r2, r3);
            }
        });
        return taskCompletionSource2.getTask();
    }

    private Task<Void> handleSetUserProperty(Map<String, Object> map) {
        TaskCompletionSource taskCompletionSource = new TaskCompletionSource();
        FlutterFirebasePlugin.cachedThreadPool.execute(new Runnable() { // from class: io.flutter.plugins.firebase.analytics.g

            /* renamed from: b */
            public final /* synthetic */ Map f17961b;

            /* renamed from: c */
            public final /* synthetic */ TaskCompletionSource f17962c;

            public /* synthetic */ g(Map map2, TaskCompletionSource taskCompletionSource2) {
                r2 = map2;
                r3 = taskCompletionSource2;
            }

            @Override // java.lang.Runnable
            public final void run() {
                FlutterFirebaseAnalyticsPlugin.this.lambda$handleSetUserProperty$6(r2, r3);
            }
        });
        return taskCompletionSource2.getTask();
    }

    private void initInstance(BinaryMessenger binaryMessenger, Context context) {
        this.analytics = FirebaseAnalytics.getInstance(context);
        MethodChannel methodChannel = new MethodChannel(binaryMessenger, "plugins.flutter.io/firebase_analytics");
        this.channel = methodChannel;
        methodChannel.setMethodCallHandler(this);
        FlutterFirebasePluginRegistry.registerPlugin("plugins.flutter.io/firebase_analytics", this);
    }

    public static /* synthetic */ void lambda$didReinitializeFirebaseCore$12(TaskCompletionSource taskCompletionSource) {
        try {
            taskCompletionSource.setResult(null);
        } catch (Exception e10) {
            taskCompletionSource.setException(e10);
        }
    }

    public /* synthetic */ void lambda$getPluginConstantsForFirebaseApp$11(TaskCompletionSource taskCompletionSource) {
        try {
            taskCompletionSource.setResult(new HashMap<String, Object>() { // from class: io.flutter.plugins.firebase.analytics.FlutterFirebaseAnalyticsPlugin.1
                AnonymousClass1() {
                }
            });
        } catch (Exception e10) {
            taskCompletionSource.setException(e10);
        }
    }

    public /* synthetic */ void lambda$handleGetAppInstanceId$10(TaskCompletionSource taskCompletionSource) {
        try {
            taskCompletionSource.setResult((String) Tasks.await(this.analytics.a()));
        } catch (Exception e10) {
            taskCompletionSource.setException(e10);
        }
    }

    public /* synthetic */ void lambda$handleGetSessionId$1(TaskCompletionSource taskCompletionSource) {
        try {
            taskCompletionSource.setResult((Long) Tasks.await(this.analytics.b()));
        } catch (Exception e10) {
            taskCompletionSource.setException(e10);
        }
    }

    public /* synthetic */ void lambda$handleLogEvent$2(Map map, TaskCompletionSource taskCompletionSource) {
        try {
            Object obj = map.get(Constants.EVENT_NAME);
            Objects.requireNonNull(obj);
            Bundle createBundleFromMap = createBundleFromMap((Map) map.get(Constants.PARAMETERS));
            this.analytics.c((String) obj, createBundleFromMap);
            taskCompletionSource.setResult(null);
        } catch (Exception e10) {
            taskCompletionSource.setException(e10);
        }
    }

    public /* synthetic */ void lambda$handleResetAnalyticsData$7(TaskCompletionSource taskCompletionSource) {
        try {
            this.analytics.d();
            taskCompletionSource.setResult(null);
        } catch (Exception e10) {
            taskCompletionSource.setException(e10);
        }
    }

    public /* synthetic */ void lambda$handleSetAnalyticsCollectionEnabled$4(Map map, TaskCompletionSource taskCompletionSource) {
        try {
            Object obj = map.get("enabled");
            Objects.requireNonNull(obj);
            this.analytics.e(((Boolean) obj).booleanValue());
            taskCompletionSource.setResult(null);
        } catch (Exception e10) {
            taskCompletionSource.setException(e10);
        }
    }

    public /* synthetic */ void lambda$handleSetSessionTimeoutDuration$5(Map map, TaskCompletionSource taskCompletionSource) {
        try {
            Objects.requireNonNull(map.get(Constants.MILLISECONDS));
            this.analytics.h(((Integer) r4).intValue());
            taskCompletionSource.setResult(null);
        } catch (Exception e10) {
            taskCompletionSource.setException(e10);
        }
    }

    public /* synthetic */ void lambda$handleSetUserId$3(Map map, TaskCompletionSource taskCompletionSource) {
        try {
            this.analytics.i((String) map.get(Constants.USER_ID));
            taskCompletionSource.setResult(null);
        } catch (Exception e10) {
            taskCompletionSource.setException(e10);
        }
    }

    public /* synthetic */ void lambda$handleSetUserProperty$6(Map map, TaskCompletionSource taskCompletionSource) {
        try {
            Object obj = map.get("name");
            Objects.requireNonNull(obj);
            String str = (String) map.get("value");
            this.analytics.j((String) obj, str);
            taskCompletionSource.setResult(null);
        } catch (Exception e10) {
            taskCompletionSource.setException(e10);
        }
    }

    public static /* synthetic */ void lambda$onMethodCall$0(MethodChannel.Result result, Task task) {
        if (task.isSuccessful()) {
            result.success(task.getResult());
        } else {
            Exception exception = task.getException();
            result.error("firebase_analytics", exception != null ? exception.getMessage() : "An unknown error occurred", null);
        }
    }

    public /* synthetic */ void lambda$setConsent$8(Map map, TaskCompletionSource taskCompletionSource) {
        try {
            Boolean bool = (Boolean) map.get(Constants.AD_STORAGE_CONSENT_GRANTED);
            Boolean bool2 = (Boolean) map.get(Constants.ANALYTICS_STORAGE_CONSENT_GRANTED);
            HashMap hashMap = new HashMap();
            if (bool != null) {
                hashMap.put(FirebaseAnalytics.b.AD_STORAGE, bool.booleanValue() ? FirebaseAnalytics.a.GRANTED : FirebaseAnalytics.a.DENIED);
            }
            if (bool2 != null) {
                hashMap.put(FirebaseAnalytics.b.ANALYTICS_STORAGE, bool2.booleanValue() ? FirebaseAnalytics.a.GRANTED : FirebaseAnalytics.a.DENIED);
            }
            this.analytics.f(hashMap);
            taskCompletionSource.setResult(null);
        } catch (Exception e10) {
            taskCompletionSource.setException(e10);
        }
    }

    public /* synthetic */ void lambda$setDefaultEventParameters$9(Map map, TaskCompletionSource taskCompletionSource) {
        try {
            this.analytics.g(createBundleFromMap(map));
            taskCompletionSource.setResult(null);
        } catch (Exception e10) {
            taskCompletionSource.setException(e10);
        }
    }

    private Task<Void> setConsent(Map<String, Object> map) {
        TaskCompletionSource taskCompletionSource = new TaskCompletionSource();
        FlutterFirebasePlugin.cachedThreadPool.execute(new Runnable() { // from class: io.flutter.plugins.firebase.analytics.l

            /* renamed from: b */
            public final /* synthetic */ Map f17972b;

            /* renamed from: c */
            public final /* synthetic */ TaskCompletionSource f17973c;

            public /* synthetic */ l(Map map2, TaskCompletionSource taskCompletionSource2) {
                r2 = map2;
                r3 = taskCompletionSource2;
            }

            @Override // java.lang.Runnable
            public final void run() {
                FlutterFirebaseAnalyticsPlugin.this.lambda$setConsent$8(r2, r3);
            }
        });
        return taskCompletionSource2.getTask();
    }

    private Task<Void> setDefaultEventParameters(Map<String, Object> map) {
        TaskCompletionSource taskCompletionSource = new TaskCompletionSource();
        FlutterFirebasePlugin.cachedThreadPool.execute(new Runnable() { // from class: io.flutter.plugins.firebase.analytics.i

            /* renamed from: b */
            public final /* synthetic */ Map f17965b;

            /* renamed from: c */
            public final /* synthetic */ TaskCompletionSource f17966c;

            public /* synthetic */ i(Map map2, TaskCompletionSource taskCompletionSource2) {
                r2 = map2;
                r3 = taskCompletionSource2;
            }

            @Override // java.lang.Runnable
            public final void run() {
                FlutterFirebaseAnalyticsPlugin.this.lambda$setDefaultEventParameters$9(r2, r3);
            }
        });
        return taskCompletionSource2.getTask();
    }

    @Override // io.flutter.plugins.firebase.core.FlutterFirebasePlugin
    public Task<Void> didReinitializeFirebaseCore() {
        TaskCompletionSource taskCompletionSource = new TaskCompletionSource();
        FlutterFirebasePlugin.cachedThreadPool.execute(new Runnable() { // from class: io.flutter.plugins.firebase.analytics.j
            public /* synthetic */ j() {
            }

            @Override // java.lang.Runnable
            public final void run() {
                FlutterFirebaseAnalyticsPlugin.lambda$didReinitializeFirebaseCore$12(TaskCompletionSource.this);
            }
        });
        return taskCompletionSource.getTask();
    }

    @Override // io.flutter.plugins.firebase.core.FlutterFirebasePlugin
    public Task<Map<String, Object>> getPluginConstantsForFirebaseApp(zb.g gVar) {
        TaskCompletionSource taskCompletionSource = new TaskCompletionSource();
        FlutterFirebasePlugin.cachedThreadPool.execute(new Runnable() { // from class: io.flutter.plugins.firebase.analytics.b

            /* renamed from: b */
            public final /* synthetic */ TaskCompletionSource f17950b;

            public /* synthetic */ b(TaskCompletionSource taskCompletionSource2) {
                r2 = taskCompletionSource2;
            }

            @Override // java.lang.Runnable
            public final void run() {
                FlutterFirebaseAnalyticsPlugin.this.lambda$getPluginConstantsForFirebaseApp$11(r2);
            }
        });
        return taskCompletionSource2.getTask();
    }

    @Override // io.flutter.embedding.engine.plugins.FlutterPlugin
    public void onAttachedToEngine(FlutterPlugin.FlutterPluginBinding flutterPluginBinding) {
        initInstance(flutterPluginBinding.getBinaryMessenger(), flutterPluginBinding.getApplicationContext());
    }

    @Override // io.flutter.embedding.engine.plugins.FlutterPlugin
    public void onDetachedFromEngine(FlutterPlugin.FlutterPluginBinding flutterPluginBinding) {
        MethodChannel methodChannel = this.channel;
        if (methodChannel != null) {
            methodChannel.setMethodCallHandler(null);
            this.channel = null;
        }
    }

    @Override // io.flutter.plugin.common.MethodChannel.MethodCallHandler
    public void onMethodCall(MethodCall methodCall, MethodChannel.Result result) {
        Task handleGetAppInstanceId;
        String str = methodCall.method;
        str.hashCode();
        char c10 = 65535;
        switch (str.hashCode()) {
            case -2090892968:
                if (str.equals("Analytics#getAppInstanceId")) {
                    c10 = 0;
                    break;
                }
                break;
            case -1931910274:
                if (str.equals("Analytics#resetAnalyticsData")) {
                    c10 = 1;
                    break;
                }
                break;
            case -1572470123:
                if (str.equals("Analytics#setConsent")) {
                    c10 = 2;
                    break;
                }
                break;
            case -273201790:
                if (str.equals("Analytics#setAnalyticsCollectionEnabled")) {
                    c10 = 3;
                    break;
                }
                break;
            case -99047480:
                if (str.equals("Analytics#setDefaultEventParameters")) {
                    c10 = 4;
                    break;
                }
                break;
            case -45011405:
                if (str.equals("Analytics#logEvent")) {
                    c10 = 5;
                    break;
                }
                break;
            case 179244440:
                if (str.equals("Analytics#getSessionId")) {
                    c10 = 6;
                    break;
                }
                break;
            case 1083589925:
                if (str.equals("Analytics#setUserProperty")) {
                    c10 = 7;
                    break;
                }
                break;
            case 1751063748:
                if (str.equals("Analytics#setSessionTimeoutDuration")) {
                    c10 = '\b';
                    break;
                }
                break;
            case 1992044651:
                if (str.equals("Analytics#setUserId")) {
                    c10 = '\t';
                    break;
                }
                break;
        }
        switch (c10) {
            case 0:
                handleGetAppInstanceId = handleGetAppInstanceId();
                break;
            case 1:
                handleGetAppInstanceId = handleResetAnalyticsData();
                break;
            case 2:
                handleGetAppInstanceId = setConsent((Map) methodCall.arguments());
                break;
            case 3:
                handleGetAppInstanceId = handleSetAnalyticsCollectionEnabled((Map) methodCall.arguments());
                break;
            case 4:
                handleGetAppInstanceId = setDefaultEventParameters((Map) methodCall.arguments());
                break;
            case 5:
                handleGetAppInstanceId = handleLogEvent((Map) methodCall.arguments());
                break;
            case 6:
                handleGetAppInstanceId = handleGetSessionId();
                break;
            case 7:
                handleGetAppInstanceId = handleSetUserProperty((Map) methodCall.arguments());
                break;
            case '\b':
                handleGetAppInstanceId = handleSetSessionTimeoutDuration((Map) methodCall.arguments());
                break;
            case '\t':
                handleGetAppInstanceId = handleSetUserId((Map) methodCall.arguments());
                break;
            default:
                result.notImplemented();
                return;
        }
        handleGetAppInstanceId.addOnCompleteListener(new OnCompleteListener() { // from class: io.flutter.plugins.firebase.analytics.h
            public /* synthetic */ h() {
            }

            @Override // com.google.android.gms.tasks.OnCompleteListener
            public final void onComplete(Task task) {
                FlutterFirebaseAnalyticsPlugin.lambda$onMethodCall$0(MethodChannel.Result.this, task);
            }
        });
    }
}

package io.flutter.plugins.firebase.performance;

import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.TaskCompletionSource;
import com.google.firebase.perf.metrics.Trace;
import io.flutter.embedding.engine.plugins.FlutterPlugin;
import io.flutter.plugin.common.BinaryMessenger;
import io.flutter.plugin.common.MethodCall;
import io.flutter.plugin.common.MethodChannel;
import io.flutter.plugins.firebase.core.FlutterFirebasePlugin;
import io.flutter.plugins.firebase.core.FlutterFirebasePluginRegistry;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Objects;

/* loaded from: classes3.dex */
public class FlutterFirebasePerformancePlugin implements FlutterFirebasePlugin, FlutterPlugin, MethodChannel.MethodCallHandler {
    private static final String METHOD_CHANNEL_NAME = "plugins.flutter.io/firebase_performance";
    private MethodChannel channel;
    static final HashMap<Integer, se.g> _httpMetrics = new HashMap<>();
    static final HashMap<Integer, Trace> _traces = new HashMap<>();
    static int _traceHandle = 0;
    static int _httpMetricHandle = 0;

    /* renamed from: io.flutter.plugins.firebase.performance.FlutterFirebasePerformancePlugin$1 */
    /* loaded from: classes3.dex */
    public class AnonymousClass1 extends HashMap<String, Object> {
        AnonymousClass1() {
        }
    }

    private Task<Integer> httpMetricStart(MethodCall methodCall) {
        TaskCompletionSource taskCompletionSource = new TaskCompletionSource();
        FlutterFirebasePlugin.cachedThreadPool.execute(new Runnable() { // from class: io.flutter.plugins.firebase.performance.h

            /* renamed from: b */
            public final /* synthetic */ TaskCompletionSource f18237b;

            public /* synthetic */ h(TaskCompletionSource taskCompletionSource2) {
                r2 = taskCompletionSource2;
            }

            @Override // java.lang.Runnable
            public final void run() {
                FlutterFirebasePerformancePlugin.lambda$httpMetricStart$4(MethodCall.this, r2);
            }
        });
        return taskCompletionSource2.getTask();
    }

    private Task<Void> httpMetricStop(MethodCall methodCall) {
        TaskCompletionSource taskCompletionSource = new TaskCompletionSource();
        FlutterFirebasePlugin.cachedThreadPool.execute(new Runnable() { // from class: io.flutter.plugins.firebase.performance.i

            /* renamed from: b */
            public final /* synthetic */ TaskCompletionSource f18239b;

            public /* synthetic */ i(TaskCompletionSource taskCompletionSource2) {
                r2 = taskCompletionSource2;
            }

            @Override // java.lang.Runnable
            public final void run() {
                FlutterFirebasePerformancePlugin.lambda$httpMetricStop$5(MethodCall.this, r2);
            }
        });
        return taskCompletionSource2.getTask();
    }

    private void initInstance(BinaryMessenger binaryMessenger) {
        FlutterFirebasePluginRegistry.registerPlugin(METHOD_CHANNEL_NAME, this);
        MethodChannel methodChannel = new MethodChannel(binaryMessenger, METHOD_CHANNEL_NAME);
        this.channel = methodChannel;
        methodChannel.setMethodCallHandler(this);
    }

    private Task<Boolean> isPerformanceCollectionEnabled() {
        TaskCompletionSource taskCompletionSource = new TaskCompletionSource();
        FlutterFirebasePlugin.cachedThreadPool.execute(new Runnable() { // from class: io.flutter.plugins.firebase.performance.c
            public /* synthetic */ c() {
            }

            @Override // java.lang.Runnable
            public final void run() {
                FlutterFirebasePerformancePlugin.lambda$isPerformanceCollectionEnabled$0(TaskCompletionSource.this);
            }
        });
        return taskCompletionSource.getTask();
    }

    public static /* synthetic */ void lambda$didReinitializeFirebaseCore$8(TaskCompletionSource taskCompletionSource) {
        try {
            Iterator<Trace> it = _traces.values().iterator();
            while (it.hasNext()) {
                it.next().stop();
            }
            _traces.clear();
            Iterator<se.g> it2 = _httpMetrics.values().iterator();
            while (it2.hasNext()) {
                it2.next().h();
            }
            _httpMetrics.clear();
            taskCompletionSource.setResult(null);
        } catch (Exception e10) {
            taskCompletionSource.setException(e10);
        }
    }

    public /* synthetic */ void lambda$getPluginConstantsForFirebaseApp$7(TaskCompletionSource taskCompletionSource) {
        try {
            taskCompletionSource.setResult(new HashMap<String, Object>() { // from class: io.flutter.plugins.firebase.performance.FlutterFirebasePerformancePlugin.1
                AnonymousClass1() {
                }
            });
        } catch (Exception e10) {
            taskCompletionSource.setException(e10);
        }
    }

    public static /* synthetic */ void lambda$httpMetricStart$4(MethodCall methodCall, TaskCompletionSource taskCompletionSource) {
        try {
            String str = (String) methodCall.argument("url");
            Objects.requireNonNull(str);
            String str2 = (String) methodCall.argument("httpMethod");
            Objects.requireNonNull(str2);
            se.g e10 = oe.e.c().e(str, parseHttpMethod(str2));
            e10.g();
            int i10 = _httpMetricHandle;
            _httpMetricHandle = i10 + 1;
            _httpMetrics.put(Integer.valueOf(i10), e10);
            taskCompletionSource.setResult(Integer.valueOf(i10));
        } catch (Exception e11) {
            taskCompletionSource.setException(e11);
        }
    }

    public static /* synthetic */ void lambda$httpMetricStop$5(MethodCall methodCall, TaskCompletionSource taskCompletionSource) {
        try {
            Integer num = (Integer) methodCall.argument("handle");
            Objects.requireNonNull(num);
            int intValue = num.intValue();
            Map map = (Map) methodCall.argument("attributes");
            Objects.requireNonNull(map);
            Map map2 = map;
            Integer num2 = (Integer) methodCall.argument("httpResponseCode");
            Integer num3 = (Integer) methodCall.argument("requestPayloadSize");
            String str = (String) methodCall.argument("responseContentType");
            Integer num4 = (Integer) methodCall.argument("responsePayloadSize");
            se.g gVar = _httpMetrics.get(Integer.valueOf(intValue));
            if (gVar == null) {
                taskCompletionSource.setResult(null);
                return;
            }
            if (num2 != null) {
                gVar.c(num2.intValue());
            }
            if (num3 != null) {
                gVar.d(num3.intValue());
            }
            if (str != null) {
                gVar.e(str);
            }
            if (num4 != null) {
                gVar.f(num4.intValue());
            }
            for (String str2 : map2.keySet()) {
                String str3 = (String) map2.get(str2);
                if (str3 != null) {
                    gVar.b(str2, str3);
                }
            }
            gVar.h();
            _httpMetrics.remove(Integer.valueOf(intValue));
            taskCompletionSource.setResult(null);
        } catch (Exception e10) {
            taskCompletionSource.setException(e10);
        }
    }

    public static /* synthetic */ void lambda$isPerformanceCollectionEnabled$0(TaskCompletionSource taskCompletionSource) {
        try {
            taskCompletionSource.setResult(Boolean.valueOf(oe.e.c().d()));
        } catch (Exception e10) {
            taskCompletionSource.setException(e10);
        }
    }

    public static /* synthetic */ void lambda$onMethodCall$6(MethodChannel.Result result, Task task) {
        if (task.isSuccessful()) {
            result.success(task.getResult());
        } else {
            Exception exception = task.getException();
            result.error("firebase_crashlytics", exception != null ? exception.getMessage() : "An unknown error occurred", null);
        }
    }

    public static /* synthetic */ void lambda$setPerformanceCollectionEnabled$1(MethodCall methodCall, TaskCompletionSource taskCompletionSource) {
        try {
            oe.e.c().g((Boolean) methodCall.argument("enable"));
            taskCompletionSource.setResult(null);
        } catch (Exception e10) {
            taskCompletionSource.setException(e10);
        }
    }

    public static /* synthetic */ void lambda$traceStart$2(MethodCall methodCall, TaskCompletionSource taskCompletionSource) {
        try {
            String str = (String) methodCall.argument("name");
            Objects.requireNonNull(str);
            Trace f10 = oe.e.c().f(str);
            f10.start();
            int i10 = _traceHandle;
            _traceHandle = i10 + 1;
            _traces.put(Integer.valueOf(i10), f10);
            taskCompletionSource.setResult(Integer.valueOf(i10));
        } catch (Exception e10) {
            taskCompletionSource.setException(e10);
        }
    }

    public static /* synthetic */ void lambda$traceStop$3(MethodCall methodCall, TaskCompletionSource taskCompletionSource) {
        try {
            Integer num = (Integer) methodCall.argument("handle");
            Objects.requireNonNull(num);
            int intValue = num.intValue();
            Map map = (Map) methodCall.argument("attributes");
            Objects.requireNonNull(map);
            Map map2 = map;
            Map map3 = (Map) methodCall.argument("metrics");
            Objects.requireNonNull(map3);
            Map map4 = map3;
            Trace trace = _traces.get(Integer.valueOf(intValue));
            if (trace == null) {
                taskCompletionSource.setResult(null);
                return;
            }
            for (String str : map2.keySet()) {
                String str2 = (String) map2.get(str);
                if (str2 != null) {
                    trace.putAttribute(str, str2);
                }
            }
            for (String str3 : map4.keySet()) {
                if (((Integer) map4.get(str3)) != null) {
                    trace.putMetric(str3, r5.intValue());
                }
            }
            trace.stop();
            _traces.remove(Integer.valueOf(intValue));
            taskCompletionSource.setResult(null);
        } catch (Exception e10) {
            taskCompletionSource.setException(e10);
        }
    }

    private static String parseHttpMethod(String str) {
        str.hashCode();
        char c10 = 65535;
        switch (str.hashCode()) {
            case -2047533199:
                if (str.equals("HttpMethod.Get")) {
                    c10 = 0;
                    break;
                }
                break;
            case -2047524054:
                if (str.equals("HttpMethod.Put")) {
                    c10 = 1;
                    break;
                }
                break;
            case -1022018640:
                if (str.equals("HttpMethod.Delete")) {
                    c10 = 2;
                    break;
                }
                break;
            case -576186973:
                if (str.equals("HttpMethod.Patch")) {
                    c10 = 3;
                    break;
                }
                break;
            case -572004704:
                if (str.equals("HttpMethod.Trace")) {
                    c10 = 4;
                    break;
                }
                break;
            case -122777287:
                if (str.equals("HttpMethod.Options")) {
                    c10 = 5;
                    break;
                }
                break;
            case 951009573:
                if (str.equals("HttpMethod.Head")) {
                    c10 = 6;
                    break;
                }
                break;
            case 951258085:
                if (str.equals("HttpMethod.Post")) {
                    c10 = 7;
                    break;
                }
                break;
            case 2078049157:
                if (str.equals("HttpMethod.Connect")) {
                    c10 = '\b';
                    break;
                }
                break;
        }
        switch (c10) {
            case 0:
                return "GET";
            case 1:
                return "PUT";
            case 2:
                return "DELETE";
            case 3:
                return "PATCH";
            case 4:
                return "TRACE";
            case 5:
                return "OPTIONS";
            case 6:
                return "HEAD";
            case 7:
                return "POST";
            case '\b':
                return "CONNECT";
            default:
                throw new IllegalArgumentException(String.format("No HttpMethod for: %s", str));
        }
    }

    private Task<Void> setPerformanceCollectionEnabled(MethodCall methodCall) {
        TaskCompletionSource taskCompletionSource = new TaskCompletionSource();
        FlutterFirebasePlugin.cachedThreadPool.execute(new Runnable() { // from class: io.flutter.plugins.firebase.performance.f

            /* renamed from: b */
            public final /* synthetic */ TaskCompletionSource f18233b;

            public /* synthetic */ f(TaskCompletionSource taskCompletionSource2) {
                r2 = taskCompletionSource2;
            }

            @Override // java.lang.Runnable
            public final void run() {
                FlutterFirebasePerformancePlugin.lambda$setPerformanceCollectionEnabled$1(MethodCall.this, r2);
            }
        });
        return taskCompletionSource2.getTask();
    }

    private Task<Integer> traceStart(MethodCall methodCall) {
        TaskCompletionSource taskCompletionSource = new TaskCompletionSource();
        FlutterFirebasePlugin.cachedThreadPool.execute(new Runnable() { // from class: io.flutter.plugins.firebase.performance.g

            /* renamed from: b */
            public final /* synthetic */ TaskCompletionSource f18235b;

            public /* synthetic */ g(TaskCompletionSource taskCompletionSource2) {
                r2 = taskCompletionSource2;
            }

            @Override // java.lang.Runnable
            public final void run() {
                FlutterFirebasePerformancePlugin.lambda$traceStart$2(MethodCall.this, r2);
            }
        });
        return taskCompletionSource2.getTask();
    }

    private Task<Void> traceStop(MethodCall methodCall) {
        TaskCompletionSource taskCompletionSource = new TaskCompletionSource();
        FlutterFirebasePlugin.cachedThreadPool.execute(new Runnable() { // from class: io.flutter.plugins.firebase.performance.e

            /* renamed from: b */
            public final /* synthetic */ TaskCompletionSource f18231b;

            public /* synthetic */ e(TaskCompletionSource taskCompletionSource2) {
                r2 = taskCompletionSource2;
            }

            @Override // java.lang.Runnable
            public final void run() {
                FlutterFirebasePerformancePlugin.lambda$traceStop$3(MethodCall.this, r2);
            }
        });
        return taskCompletionSource2.getTask();
    }

    @Override // io.flutter.plugins.firebase.core.FlutterFirebasePlugin
    public Task<Void> didReinitializeFirebaseCore() {
        TaskCompletionSource taskCompletionSource = new TaskCompletionSource();
        FlutterFirebasePlugin.cachedThreadPool.execute(new Runnable() { // from class: io.flutter.plugins.firebase.performance.d
            public /* synthetic */ d() {
            }

            @Override // java.lang.Runnable
            public final void run() {
                FlutterFirebasePerformancePlugin.lambda$didReinitializeFirebaseCore$8(TaskCompletionSource.this);
            }
        });
        return taskCompletionSource.getTask();
    }

    @Override // io.flutter.plugins.firebase.core.FlutterFirebasePlugin
    public Task<Map<String, Object>> getPluginConstantsForFirebaseApp(zb.g gVar) {
        TaskCompletionSource taskCompletionSource = new TaskCompletionSource();
        FlutterFirebasePlugin.cachedThreadPool.execute(new Runnable() { // from class: io.flutter.plugins.firebase.performance.b

            /* renamed from: b */
            public final /* synthetic */ TaskCompletionSource f18227b;

            public /* synthetic */ b(TaskCompletionSource taskCompletionSource2) {
                r2 = taskCompletionSource2;
            }

            @Override // java.lang.Runnable
            public final void run() {
                FlutterFirebasePerformancePlugin.this.lambda$getPluginConstantsForFirebaseApp$7(r2);
            }
        });
        return taskCompletionSource2.getTask();
    }

    @Override // io.flutter.embedding.engine.plugins.FlutterPlugin
    public void onAttachedToEngine(FlutterPlugin.FlutterPluginBinding flutterPluginBinding) {
        initInstance(flutterPluginBinding.getBinaryMessenger());
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
        Task traceStart;
        String str = methodCall.method;
        str.hashCode();
        char c10 = 65535;
        switch (str.hashCode()) {
            case -2120473769:
                if (str.equals("FirebasePerformance#traceStart")) {
                    c10 = 0;
                    break;
                }
                break;
            case -1491270476:
                if (str.equals("FirebasePerformance#httpMetricStop")) {
                    c10 = 1;
                    break;
                }
                break;
            case 347240045:
                if (str.equals("FirebasePerformance#traceStop")) {
                    c10 = 2;
                    break;
                }
                break;
            case 610629367:
                if (str.equals("FirebasePerformance#isPerformanceCollectionEnabled")) {
                    c10 = 3;
                    break;
                }
                break;
            case 844329211:
                if (str.equals("FirebasePerformance#setPerformanceCollectionEnabled")) {
                    c10 = 4;
                    break;
                }
                break;
            case 1015242224:
                if (str.equals("FirebasePerformance#httpMetricStart")) {
                    c10 = 5;
                    break;
                }
                break;
        }
        switch (c10) {
            case 0:
                traceStart = traceStart(methodCall);
                break;
            case 1:
                traceStart = httpMetricStop(methodCall);
                break;
            case 2:
                traceStart = traceStop(methodCall);
                break;
            case 3:
                traceStart = isPerformanceCollectionEnabled();
                break;
            case 4:
                traceStart = setPerformanceCollectionEnabled(methodCall);
                break;
            case 5:
                traceStart = httpMetricStart(methodCall);
                break;
            default:
                result.notImplemented();
                return;
        }
        traceStart.addOnCompleteListener(new OnCompleteListener() { // from class: io.flutter.plugins.firebase.performance.a
            public /* synthetic */ a() {
            }

            @Override // com.google.android.gms.tasks.OnCompleteListener
            public final void onComplete(Task task) {
                FlutterFirebasePerformancePlugin.lambda$onMethodCall$6(MethodChannel.Result.this, task);
            }
        });
    }
}

package io.flutter.plugins.firebase.messaging;

import android.app.Activity;
import android.content.Intent;
import android.os.Build;
import androidx.core.app.t0;
import androidx.lifecycle.LiveData;
import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.TaskCompletionSource;
import com.google.android.gms.tasks.Tasks;
import com.google.firebase.messaging.FirebaseMessaging;
import com.google.firebase.messaging.r0;
import io.flutter.embedding.engine.FlutterShellArgs;
import io.flutter.embedding.engine.plugins.FlutterPlugin;
import io.flutter.embedding.engine.plugins.activity.ActivityAware;
import io.flutter.embedding.engine.plugins.activity.ActivityPluginBinding;
import io.flutter.plugin.common.BinaryMessenger;
import io.flutter.plugin.common.MethodCall;
import io.flutter.plugin.common.MethodChannel;
import io.flutter.plugin.common.PluginRegistry;
import io.flutter.plugins.firebase.auth.Constants;
import io.flutter.plugins.firebase.core.FlutterFirebasePlugin;
import io.flutter.plugins.firebase.core.FlutterFirebasePluginRegistry;
import io.flutter.plugins.firebase.messaging.FlutterFirebasePermissionManager;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

/* loaded from: classes3.dex */
public class FlutterFirebaseMessagingPlugin implements FlutterFirebasePlugin, MethodChannel.MethodCallHandler, PluginRegistry.NewIntentListener, FlutterPlugin, ActivityAware {
    private MethodChannel channel;
    private r0 initialMessage;
    private Map<String, Object> initialMessageNotification;
    private Activity mainActivity;
    FlutterFirebasePermissionManager permissionManager;
    private androidx.lifecycle.s<r0> remoteMessageObserver;
    private androidx.lifecycle.s<String> tokenObserver;
    private final HashMap<String, Boolean> consumedInitialMessages = new HashMap<>();
    private final LiveData<r0> liveDataRemoteMessage = FlutterFirebaseRemoteMessageLiveData.getInstance();
    private final LiveData<String> liveDataToken = FlutterFirebaseTokenLiveData.getInstance();

    /* renamed from: io.flutter.plugins.firebase.messaging.FlutterFirebaseMessagingPlugin$1 */
    /* loaded from: classes3.dex */
    public class AnonymousClass1 extends HashMap<String, Object> {
        final /* synthetic */ String val$token;

        AnonymousClass1(String str) {
            this.val$token = str;
            put(Constants.TOKEN, str);
        }
    }

    /* renamed from: io.flutter.plugins.firebase.messaging.FlutterFirebaseMessagingPlugin$2 */
    /* loaded from: classes3.dex */
    public class AnonymousClass2 extends HashMap<String, Object> {
        final /* synthetic */ FirebaseMessaging val$firebaseMessaging;

        AnonymousClass2(FirebaseMessaging firebaseMessaging) {
            this.val$firebaseMessaging = firebaseMessaging;
            put("isAutoInitEnabled", Boolean.valueOf(firebaseMessaging.y()));
        }
    }

    private Boolean checkPermissions() {
        return Boolean.valueOf(ContextHolder.getApplicationContext().checkSelfPermission("android.permission.POST_NOTIFICATIONS") == 0);
    }

    private Task<Void> deleteToken() {
        TaskCompletionSource taskCompletionSource = new TaskCompletionSource();
        FlutterFirebasePlugin.cachedThreadPool.execute(new Runnable() { // from class: io.flutter.plugins.firebase.messaging.g
            public /* synthetic */ g() {
            }

            @Override // java.lang.Runnable
            public final void run() {
                FlutterFirebaseMessagingPlugin.lambda$deleteToken$2(TaskCompletionSource.this);
            }
        });
        return taskCompletionSource.getTask();
    }

    private Map<String, Object> getExceptionDetails(Exception exc) {
        HashMap hashMap = new HashMap();
        hashMap.put("code", "unknown");
        hashMap.put(io.flutter.plugins.firebase.crashlytics.Constants.MESSAGE, exc != null ? exc.getMessage() : "An unknown error has occurred.");
        return hashMap;
    }

    private Task<Map<String, Object>> getInitialMessage() {
        TaskCompletionSource taskCompletionSource = new TaskCompletionSource();
        FlutterFirebasePlugin.cachedThreadPool.execute(new Runnable() { // from class: io.flutter.plugins.firebase.messaging.t

            /* renamed from: b */
            public final /* synthetic */ TaskCompletionSource f18222b;

            public /* synthetic */ t(TaskCompletionSource taskCompletionSource2) {
                r2 = taskCompletionSource2;
            }

            @Override // java.lang.Runnable
            public final void run() {
                FlutterFirebaseMessagingPlugin.this.lambda$getInitialMessage$9(r2);
            }
        });
        return taskCompletionSource2.getTask();
    }

    private Task<Map<String, Integer>> getPermissions() {
        TaskCompletionSource taskCompletionSource = new TaskCompletionSource();
        FlutterFirebasePlugin.cachedThreadPool.execute(new Runnable() { // from class: io.flutter.plugins.firebase.messaging.p

            /* renamed from: b */
            public final /* synthetic */ TaskCompletionSource f18216b;

            public /* synthetic */ p(TaskCompletionSource taskCompletionSource2) {
                r2 = taskCompletionSource2;
            }

            @Override // java.lang.Runnable
            public final void run() {
                FlutterFirebaseMessagingPlugin.this.lambda$getPermissions$13(r2);
            }
        });
        return taskCompletionSource2.getTask();
    }

    private Task<Map<String, Object>> getToken() {
        TaskCompletionSource taskCompletionSource = new TaskCompletionSource();
        FlutterFirebasePlugin.cachedThreadPool.execute(new Runnable() { // from class: io.flutter.plugins.firebase.messaging.e

            /* renamed from: b */
            public final /* synthetic */ TaskCompletionSource f18198b;

            public /* synthetic */ e(TaskCompletionSource taskCompletionSource2) {
                r2 = taskCompletionSource2;
            }

            @Override // java.lang.Runnable
            public final void run() {
                FlutterFirebaseMessagingPlugin.this.lambda$getToken$3(r2);
            }
        });
        return taskCompletionSource2.getTask();
    }

    private void initInstance(BinaryMessenger binaryMessenger) {
        MethodChannel methodChannel = new MethodChannel(binaryMessenger, "plugins.flutter.io/firebase_messaging");
        this.channel = methodChannel;
        methodChannel.setMethodCallHandler(this);
        this.permissionManager = new FlutterFirebasePermissionManager();
        this.remoteMessageObserver = new androidx.lifecycle.s() { // from class: io.flutter.plugins.firebase.messaging.i
            public /* synthetic */ i() {
            }

            @Override // androidx.lifecycle.s
            public final void a(Object obj) {
                FlutterFirebaseMessagingPlugin.this.lambda$initInstance$0((r0) obj);
            }
        };
        this.tokenObserver = new androidx.lifecycle.s() { // from class: io.flutter.plugins.firebase.messaging.j
            public /* synthetic */ j() {
            }

            @Override // androidx.lifecycle.s
            public final void a(Object obj) {
                FlutterFirebaseMessagingPlugin.this.lambda$initInstance$1((String) obj);
            }
        };
        this.liveDataRemoteMessage.observeForever(this.remoteMessageObserver);
        this.liveDataToken.observeForever(this.tokenObserver);
        FlutterFirebasePluginRegistry.registerPlugin("plugins.flutter.io/firebase_messaging", this);
    }

    public static /* synthetic */ void lambda$deleteToken$2(TaskCompletionSource taskCompletionSource) {
        try {
            Tasks.await(FirebaseMessaging.r().o());
            taskCompletionSource.setResult(null);
        } catch (Exception e10) {
            taskCompletionSource.setException(e10);
        }
    }

    public /* synthetic */ void lambda$getInitialMessage$9(TaskCompletionSource taskCompletionSource) {
        Map map;
        try {
            r0 r0Var = this.initialMessage;
            if (r0Var != null) {
                Map<String, Object> remoteMessageToMap = FlutterFirebaseMessagingUtils.remoteMessageToMap(r0Var);
                Map<String, Object> map2 = this.initialMessageNotification;
                if (map2 != null) {
                    remoteMessageToMap.put("notification", map2);
                }
                taskCompletionSource.setResult(remoteMessageToMap);
                this.initialMessage = null;
                this.initialMessageNotification = null;
                return;
            }
            Activity activity = this.mainActivity;
            if (activity == null) {
                taskCompletionSource.setResult(null);
                return;
            }
            Intent intent = activity.getIntent();
            if (intent != null && intent.getExtras() != null) {
                String string = intent.getExtras().getString("google.message_id");
                if (string == null) {
                    string = intent.getExtras().getString("message_id");
                }
                if (string != null && this.consumedInitialMessages.get(string) == null) {
                    r0 r0Var2 = FlutterFirebaseMessagingReceiver.notifications.get(string);
                    if (r0Var2 == null) {
                        Map<String, Object> firebaseMessageMap = FlutterFirebaseMessagingStore.getInstance().getFirebaseMessageMap(string);
                        if (firebaseMessageMap != null) {
                            r0Var2 = FlutterFirebaseMessagingUtils.getRemoteMessageForArguments(firebaseMessageMap);
                            if (firebaseMessageMap.get("notification") != null) {
                                map = (Map) firebaseMessageMap.get("notification");
                                FlutterFirebaseMessagingStore.getInstance().removeFirebaseMessage(string);
                            }
                        }
                        map = null;
                        FlutterFirebaseMessagingStore.getInstance().removeFirebaseMessage(string);
                    } else {
                        map = null;
                    }
                    if (r0Var2 == null) {
                        taskCompletionSource.setResult(null);
                        return;
                    }
                    this.consumedInitialMessages.put(string, Boolean.TRUE);
                    Map<String, Object> remoteMessageToMap2 = FlutterFirebaseMessagingUtils.remoteMessageToMap(r0Var2);
                    if (r0Var2.A1() == null && map != null) {
                        remoteMessageToMap2.put("notification", map);
                    }
                    taskCompletionSource.setResult(remoteMessageToMap2);
                    return;
                }
                taskCompletionSource.setResult(null);
                return;
            }
            taskCompletionSource.setResult(null);
        } catch (Exception e10) {
            taskCompletionSource.setException(e10);
        }
    }

    public /* synthetic */ void lambda$getPermissions$13(TaskCompletionSource taskCompletionSource) {
        try {
            HashMap hashMap = new HashMap();
            hashMap.put("authorizationStatus", Integer.valueOf(Build.VERSION.SDK_INT >= 33 ? checkPermissions().booleanValue() : t0.f(this.mainActivity).a() ? 1 : 0));
            taskCompletionSource.setResult(hashMap);
        } catch (Exception e10) {
            taskCompletionSource.setException(e10);
        }
    }

    public static /* synthetic */ void lambda$getPluginConstantsForFirebaseApp$15(zb.g gVar, TaskCompletionSource taskCompletionSource) {
        try {
            HashMap hashMap = new HashMap();
            if (gVar.q().equals("[DEFAULT]")) {
                hashMap.put("AUTO_INIT_ENABLED", Boolean.valueOf(FirebaseMessaging.r().y()));
            }
            taskCompletionSource.setResult(hashMap);
        } catch (Exception e10) {
            taskCompletionSource.setException(e10);
        }
    }

    public /* synthetic */ void lambda$getToken$3(TaskCompletionSource taskCompletionSource) {
        try {
            taskCompletionSource.setResult(new HashMap<String, Object>((String) Tasks.await(FirebaseMessaging.r().u())) { // from class: io.flutter.plugins.firebase.messaging.FlutterFirebaseMessagingPlugin.1
                final /* synthetic */ String val$token;

                AnonymousClass1(String str) {
                    this.val$token = str;
                    put(Constants.TOKEN, str);
                }
            });
        } catch (Exception e10) {
            taskCompletionSource.setException(e10);
        }
    }

    public /* synthetic */ void lambda$initInstance$0(r0 r0Var) {
        this.channel.invokeMethod("Messaging#onMessage", FlutterFirebaseMessagingUtils.remoteMessageToMap(r0Var));
    }

    public /* synthetic */ void lambda$initInstance$1(String str) {
        this.channel.invokeMethod("Messaging#onTokenRefresh", str);
    }

    public /* synthetic */ void lambda$onMethodCall$14(MethodChannel.Result result, Task task) {
        if (task.isSuccessful()) {
            result.success(task.getResult());
        } else {
            Exception exception = task.getException();
            result.error("firebase_messaging", exception != null ? exception.getMessage() : null, getExceptionDetails(exception));
        }
    }

    public static /* synthetic */ void lambda$requestPermissions$10(Map map, TaskCompletionSource taskCompletionSource, int i10) {
        map.put("authorizationStatus", Integer.valueOf(i10));
        taskCompletionSource.setResult(map);
    }

    public static /* synthetic */ void lambda$requestPermissions$11(TaskCompletionSource taskCompletionSource, String str) {
        taskCompletionSource.setException(new Exception(str));
    }

    public /* synthetic */ void lambda$requestPermissions$12(TaskCompletionSource taskCompletionSource) {
        HashMap hashMap = new HashMap();
        try {
            if (checkPermissions().booleanValue()) {
                hashMap.put("authorizationStatus", 1);
                taskCompletionSource.setResult(hashMap);
            } else {
                this.permissionManager.requestPermissions(this.mainActivity, new FlutterFirebasePermissionManager.RequestPermissionsSuccessCallback() { // from class: io.flutter.plugins.firebase.messaging.m

                    /* renamed from: a */
                    public final /* synthetic */ Map f18210a;

                    /* renamed from: b */
                    public final /* synthetic */ TaskCompletionSource f18211b;

                    public /* synthetic */ m(Map hashMap2, TaskCompletionSource taskCompletionSource2) {
                        r1 = hashMap2;
                        r2 = taskCompletionSource2;
                    }

                    @Override // io.flutter.plugins.firebase.messaging.FlutterFirebasePermissionManager.RequestPermissionsSuccessCallback
                    public final void onSuccess(int i10) {
                        FlutterFirebaseMessagingPlugin.lambda$requestPermissions$10(r1, r2, i10);
                    }
                }, new ErrorCallback() { // from class: io.flutter.plugins.firebase.messaging.n
                    public /* synthetic */ n() {
                    }

                    @Override // io.flutter.plugins.firebase.messaging.ErrorCallback
                    public final void onError(String str) {
                        FlutterFirebaseMessagingPlugin.lambda$requestPermissions$11(TaskCompletionSource.this, str);
                    }
                });
            }
        } catch (Exception e10) {
            taskCompletionSource2.setException(e10);
        }
    }

    public static /* synthetic */ void lambda$sendMessage$6(Map map, TaskCompletionSource taskCompletionSource) {
        try {
            FlutterFirebaseMessagingUtils.getFirebaseMessagingForArguments(map).L(FlutterFirebaseMessagingUtils.getRemoteMessageForArguments(map));
            taskCompletionSource.setResult(null);
        } catch (Exception e10) {
            taskCompletionSource.setException(e10);
        }
    }

    public /* synthetic */ void lambda$setAutoInitEnabled$7(Map map, TaskCompletionSource taskCompletionSource) {
        try {
            FirebaseMessaging firebaseMessagingForArguments = FlutterFirebaseMessagingUtils.getFirebaseMessagingForArguments(map);
            Object obj = map.get("enabled");
            Objects.requireNonNull(obj);
            firebaseMessagingForArguments.M(((Boolean) obj).booleanValue());
            taskCompletionSource.setResult(new HashMap<String, Object>(firebaseMessagingForArguments) { // from class: io.flutter.plugins.firebase.messaging.FlutterFirebaseMessagingPlugin.2
                final /* synthetic */ FirebaseMessaging val$firebaseMessaging;

                AnonymousClass2(FirebaseMessaging firebaseMessagingForArguments2) {
                    this.val$firebaseMessaging = firebaseMessagingForArguments2;
                    put("isAutoInitEnabled", Boolean.valueOf(firebaseMessagingForArguments2.y()));
                }
            });
        } catch (Exception e10) {
            taskCompletionSource.setException(e10);
        }
    }

    public static /* synthetic */ void lambda$setDeliveryMetricsExportToBigQuery$8(Map map, TaskCompletionSource taskCompletionSource) {
        try {
            FirebaseMessaging firebaseMessagingForArguments = FlutterFirebaseMessagingUtils.getFirebaseMessagingForArguments(map);
            Object obj = map.get("enabled");
            Objects.requireNonNull(obj);
            firebaseMessagingForArguments.N(((Boolean) obj).booleanValue());
            taskCompletionSource.setResult(null);
        } catch (Exception e10) {
            taskCompletionSource.setException(e10);
        }
    }

    public static /* synthetic */ void lambda$subscribeToTopic$4(Map map, TaskCompletionSource taskCompletionSource) {
        try {
            FirebaseMessaging firebaseMessagingForArguments = FlutterFirebaseMessagingUtils.getFirebaseMessagingForArguments(map);
            Object obj = map.get("topic");
            Objects.requireNonNull(obj);
            Tasks.await(firebaseMessagingForArguments.R((String) obj));
            taskCompletionSource.setResult(null);
        } catch (Exception e10) {
            taskCompletionSource.setException(e10);
        }
    }

    public static /* synthetic */ void lambda$unsubscribeFromTopic$5(Map map, TaskCompletionSource taskCompletionSource) {
        try {
            FirebaseMessaging firebaseMessagingForArguments = FlutterFirebaseMessagingUtils.getFirebaseMessagingForArguments(map);
            Object obj = map.get("topic");
            Objects.requireNonNull(obj);
            Tasks.await(firebaseMessagingForArguments.U((String) obj));
            taskCompletionSource.setResult(null);
        } catch (Exception e10) {
            taskCompletionSource.setException(e10);
        }
    }

    private Task<Map<String, Integer>> requestPermissions() {
        TaskCompletionSource taskCompletionSource = new TaskCompletionSource();
        FlutterFirebasePlugin.cachedThreadPool.execute(new Runnable() { // from class: io.flutter.plugins.firebase.messaging.o

            /* renamed from: b */
            public final /* synthetic */ TaskCompletionSource f18214b;

            public /* synthetic */ o(TaskCompletionSource taskCompletionSource2) {
                r2 = taskCompletionSource2;
            }

            @Override // java.lang.Runnable
            public final void run() {
                FlutterFirebaseMessagingPlugin.this.lambda$requestPermissions$12(r2);
            }
        });
        return taskCompletionSource2.getTask();
    }

    private Task<Void> sendMessage(Map<String, Object> map) {
        TaskCompletionSource taskCompletionSource = new TaskCompletionSource();
        FlutterFirebasePlugin.cachedThreadPool.execute(new Runnable() { // from class: io.flutter.plugins.firebase.messaging.u

            /* renamed from: a */
            public final /* synthetic */ Map f18223a;

            /* renamed from: b */
            public final /* synthetic */ TaskCompletionSource f18224b;

            public /* synthetic */ u(Map map2, TaskCompletionSource taskCompletionSource2) {
                r1 = map2;
                r2 = taskCompletionSource2;
            }

            @Override // java.lang.Runnable
            public final void run() {
                FlutterFirebaseMessagingPlugin.lambda$sendMessage$6(r1, r2);
            }
        });
        return taskCompletionSource2.getTask();
    }

    private Task<Map<String, Object>> setAutoInitEnabled(Map<String, Object> map) {
        TaskCompletionSource taskCompletionSource = new TaskCompletionSource();
        FlutterFirebasePlugin.cachedThreadPool.execute(new Runnable() { // from class: io.flutter.plugins.firebase.messaging.h

            /* renamed from: b */
            public final /* synthetic */ Map f18203b;

            /* renamed from: c */
            public final /* synthetic */ TaskCompletionSource f18204c;

            public /* synthetic */ h(Map map2, TaskCompletionSource taskCompletionSource2) {
                r2 = map2;
                r3 = taskCompletionSource2;
            }

            @Override // java.lang.Runnable
            public final void run() {
                FlutterFirebaseMessagingPlugin.this.lambda$setAutoInitEnabled$7(r2, r3);
            }
        });
        return taskCompletionSource2.getTask();
    }

    private Task<Void> setDeliveryMetricsExportToBigQuery(Map<String, Object> map) {
        TaskCompletionSource taskCompletionSource = new TaskCompletionSource();
        FlutterFirebasePlugin.cachedThreadPool.execute(new Runnable() { // from class: io.flutter.plugins.firebase.messaging.f

            /* renamed from: a */
            public final /* synthetic */ Map f18199a;

            /* renamed from: b */
            public final /* synthetic */ TaskCompletionSource f18200b;

            public /* synthetic */ f(Map map2, TaskCompletionSource taskCompletionSource2) {
                r1 = map2;
                r2 = taskCompletionSource2;
            }

            @Override // java.lang.Runnable
            public final void run() {
                FlutterFirebaseMessagingPlugin.lambda$setDeliveryMetricsExportToBigQuery$8(r1, r2);
            }
        });
        return taskCompletionSource2.getTask();
    }

    private Task<Void> subscribeToTopic(Map<String, Object> map) {
        TaskCompletionSource taskCompletionSource = new TaskCompletionSource();
        FlutterFirebasePlugin.cachedThreadPool.execute(new Runnable() { // from class: io.flutter.plugins.firebase.messaging.s

            /* renamed from: a */
            public final /* synthetic */ Map f18219a;

            /* renamed from: b */
            public final /* synthetic */ TaskCompletionSource f18220b;

            public /* synthetic */ s(Map map2, TaskCompletionSource taskCompletionSource2) {
                r1 = map2;
                r2 = taskCompletionSource2;
            }

            @Override // java.lang.Runnable
            public final void run() {
                FlutterFirebaseMessagingPlugin.lambda$subscribeToTopic$4(r1, r2);
            }
        });
        return taskCompletionSource2.getTask();
    }

    private Task<Void> unsubscribeFromTopic(Map<String, Object> map) {
        TaskCompletionSource taskCompletionSource = new TaskCompletionSource();
        FlutterFirebasePlugin.cachedThreadPool.execute(new Runnable() { // from class: io.flutter.plugins.firebase.messaging.k

            /* renamed from: a */
            public final /* synthetic */ Map f18207a;

            /* renamed from: b */
            public final /* synthetic */ TaskCompletionSource f18208b;

            public /* synthetic */ k(Map map2, TaskCompletionSource taskCompletionSource2) {
                r1 = map2;
                r2 = taskCompletionSource2;
            }

            @Override // java.lang.Runnable
            public final void run() {
                FlutterFirebaseMessagingPlugin.lambda$unsubscribeFromTopic$5(r1, r2);
            }
        });
        return taskCompletionSource2.getTask();
    }

    @Override // io.flutter.plugins.firebase.core.FlutterFirebasePlugin
    public Task<Void> didReinitializeFirebaseCore() {
        TaskCompletionSource taskCompletionSource = new TaskCompletionSource();
        FlutterFirebasePlugin.cachedThreadPool.execute(new Runnable() { // from class: io.flutter.plugins.firebase.messaging.l
            public /* synthetic */ l() {
            }

            @Override // java.lang.Runnable
            public final void run() {
                TaskCompletionSource.this.setResult(null);
            }
        });
        return taskCompletionSource.getTask();
    }

    @Override // io.flutter.plugins.firebase.core.FlutterFirebasePlugin
    public Task<Map<String, Object>> getPluginConstantsForFirebaseApp(zb.g gVar) {
        TaskCompletionSource taskCompletionSource = new TaskCompletionSource();
        FlutterFirebasePlugin.cachedThreadPool.execute(new Runnable() { // from class: io.flutter.plugins.firebase.messaging.d

            /* renamed from: b */
            public final /* synthetic */ TaskCompletionSource f18196b;

            public /* synthetic */ d(TaskCompletionSource taskCompletionSource2) {
                r2 = taskCompletionSource2;
            }

            @Override // java.lang.Runnable
            public final void run() {
                FlutterFirebaseMessagingPlugin.lambda$getPluginConstantsForFirebaseApp$15(zb.g.this, r2);
            }
        });
        return taskCompletionSource2.getTask();
    }

    @Override // io.flutter.embedding.engine.plugins.activity.ActivityAware
    public void onAttachedToActivity(ActivityPluginBinding activityPluginBinding) {
        activityPluginBinding.addOnNewIntentListener(this);
        activityPluginBinding.addRequestPermissionsResultListener(this.permissionManager);
        Activity activity = activityPluginBinding.getActivity();
        this.mainActivity = activity;
        if (activity.getIntent() == null || this.mainActivity.getIntent().getExtras() == null || (this.mainActivity.getIntent().getFlags() & 1048576) == 1048576) {
            return;
        }
        onNewIntent(this.mainActivity.getIntent());
    }

    @Override // io.flutter.embedding.engine.plugins.FlutterPlugin
    public void onAttachedToEngine(FlutterPlugin.FlutterPluginBinding flutterPluginBinding) {
        initInstance(flutterPluginBinding.getBinaryMessenger());
    }

    @Override // io.flutter.embedding.engine.plugins.activity.ActivityAware
    public void onDetachedFromActivity() {
        this.mainActivity = null;
    }

    @Override // io.flutter.embedding.engine.plugins.activity.ActivityAware
    public void onDetachedFromActivityForConfigChanges() {
        this.mainActivity = null;
    }

    @Override // io.flutter.embedding.engine.plugins.FlutterPlugin
    public void onDetachedFromEngine(FlutterPlugin.FlutterPluginBinding flutterPluginBinding) {
        this.liveDataToken.removeObserver(this.tokenObserver);
        this.liveDataRemoteMessage.removeObserver(this.remoteMessageObserver);
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:36:0x0090. Please report as an issue. */
    @Override // io.flutter.plugin.common.MethodChannel.MethodCallHandler
    public void onMethodCall(MethodCall methodCall, MethodChannel.Result result) {
        Task initialMessage;
        Long valueOf;
        Long valueOf2;
        String str = methodCall.method;
        str.hashCode();
        char c10 = 65535;
        switch (str.hashCode()) {
            case -1704007366:
                if (str.equals("Messaging#getInitialMessage")) {
                    c10 = 0;
                    break;
                }
                break;
            case -1661255137:
                if (str.equals("Messaging#setAutoInitEnabled")) {
                    c10 = 1;
                    break;
                }
                break;
            case -657665041:
                if (str.equals("Messaging#deleteToken")) {
                    c10 = 2;
                    break;
                }
                break;
            case 421314579:
                if (str.equals("Messaging#unsubscribeFromTopic")) {
                    c10 = 3;
                    break;
                }
                break;
            case 506322569:
                if (str.equals("Messaging#subscribeToTopic")) {
                    c10 = 4;
                    break;
                }
                break;
            case 607887267:
                if (str.equals("Messaging#setDeliveryMetricsExportToBigQuery")) {
                    c10 = 5;
                    break;
                }
                break;
            case 928431066:
                if (str.equals("Messaging#startBackgroundIsolate")) {
                    c10 = 6;
                    break;
                }
                break;
            case 1165917248:
                if (str.equals("Messaging#sendMessage")) {
                    c10 = 7;
                    break;
                }
                break;
            case 1231338975:
                if (str.equals("Messaging#requestPermission")) {
                    c10 = '\b';
                    break;
                }
                break;
            case 1243856389:
                if (str.equals("Messaging#getNotificationSettings")) {
                    c10 = '\t';
                    break;
                }
                break;
            case 1459336962:
                if (str.equals("Messaging#getToken")) {
                    c10 = '\n';
                    break;
                }
                break;
        }
        switch (c10) {
            case 0:
                initialMessage = getInitialMessage();
                initialMessage.addOnCompleteListener(new OnCompleteListener() { // from class: io.flutter.plugins.firebase.messaging.q

                    /* renamed from: b */
                    public final /* synthetic */ MethodChannel.Result f18218b;

                    public /* synthetic */ q(MethodChannel.Result result2) {
                        r2 = result2;
                    }

                    @Override // com.google.android.gms.tasks.OnCompleteListener
                    public final void onComplete(Task task) {
                        FlutterFirebaseMessagingPlugin.this.lambda$onMethodCall$14(r2, task);
                    }
                });
                return;
            case 1:
                initialMessage = setAutoInitEnabled((Map) methodCall.arguments());
                initialMessage.addOnCompleteListener(new OnCompleteListener() { // from class: io.flutter.plugins.firebase.messaging.q

                    /* renamed from: b */
                    public final /* synthetic */ MethodChannel.Result f18218b;

                    public /* synthetic */ q(MethodChannel.Result result2) {
                        r2 = result2;
                    }

                    @Override // com.google.android.gms.tasks.OnCompleteListener
                    public final void onComplete(Task task) {
                        FlutterFirebaseMessagingPlugin.this.lambda$onMethodCall$14(r2, task);
                    }
                });
                return;
            case 2:
                initialMessage = deleteToken();
                initialMessage.addOnCompleteListener(new OnCompleteListener() { // from class: io.flutter.plugins.firebase.messaging.q

                    /* renamed from: b */
                    public final /* synthetic */ MethodChannel.Result f18218b;

                    public /* synthetic */ q(MethodChannel.Result result2) {
                        r2 = result2;
                    }

                    @Override // com.google.android.gms.tasks.OnCompleteListener
                    public final void onComplete(Task task) {
                        FlutterFirebaseMessagingPlugin.this.lambda$onMethodCall$14(r2, task);
                    }
                });
                return;
            case 3:
                initialMessage = unsubscribeFromTopic((Map) methodCall.arguments());
                initialMessage.addOnCompleteListener(new OnCompleteListener() { // from class: io.flutter.plugins.firebase.messaging.q

                    /* renamed from: b */
                    public final /* synthetic */ MethodChannel.Result f18218b;

                    public /* synthetic */ q(MethodChannel.Result result2) {
                        r2 = result2;
                    }

                    @Override // com.google.android.gms.tasks.OnCompleteListener
                    public final void onComplete(Task task) {
                        FlutterFirebaseMessagingPlugin.this.lambda$onMethodCall$14(r2, task);
                    }
                });
                return;
            case 4:
                initialMessage = subscribeToTopic((Map) methodCall.arguments());
                initialMessage.addOnCompleteListener(new OnCompleteListener() { // from class: io.flutter.plugins.firebase.messaging.q

                    /* renamed from: b */
                    public final /* synthetic */ MethodChannel.Result f18218b;

                    public /* synthetic */ q(MethodChannel.Result result2) {
                        r2 = result2;
                    }

                    @Override // com.google.android.gms.tasks.OnCompleteListener
                    public final void onComplete(Task task) {
                        FlutterFirebaseMessagingPlugin.this.lambda$onMethodCall$14(r2, task);
                    }
                });
                return;
            case 5:
                initialMessage = setDeliveryMetricsExportToBigQuery((Map) methodCall.arguments());
                initialMessage.addOnCompleteListener(new OnCompleteListener() { // from class: io.flutter.plugins.firebase.messaging.q

                    /* renamed from: b */
                    public final /* synthetic */ MethodChannel.Result f18218b;

                    public /* synthetic */ q(MethodChannel.Result result2) {
                        r2 = result2;
                    }

                    @Override // com.google.android.gms.tasks.OnCompleteListener
                    public final void onComplete(Task task) {
                        FlutterFirebaseMessagingPlugin.this.lambda$onMethodCall$14(r2, task);
                    }
                });
                return;
            case 6:
                Map map = (Map) methodCall.arguments;
                Object obj = map.get("pluginCallbackHandle");
                Object obj2 = map.get("userCallbackHandle");
                if (obj instanceof Long) {
                    valueOf = (Long) obj;
                } else {
                    if (!(obj instanceof Integer)) {
                        throw new IllegalArgumentException("Expected 'Long' or 'Integer' type for 'pluginCallbackHandle'.");
                    }
                    valueOf = Long.valueOf(((Integer) obj).intValue());
                }
                long longValue = valueOf.longValue();
                if (obj2 instanceof Long) {
                    valueOf2 = (Long) obj2;
                } else {
                    if (!(obj2 instanceof Integer)) {
                        throw new IllegalArgumentException("Expected 'Long' or 'Integer' type for 'userCallbackHandle'.");
                    }
                    valueOf2 = Long.valueOf(((Integer) obj2).intValue());
                }
                long longValue2 = valueOf2.longValue();
                Activity activity = this.mainActivity;
                FlutterShellArgs fromIntent = activity != null ? FlutterShellArgs.fromIntent(activity.getIntent()) : null;
                FlutterFirebaseMessagingBackgroundService.setCallbackDispatcher(longValue);
                FlutterFirebaseMessagingBackgroundService.setUserCallbackHandle(longValue2);
                FlutterFirebaseMessagingBackgroundService.startBackgroundIsolate(longValue, fromIntent);
                initialMessage = Tasks.forResult(null);
                initialMessage.addOnCompleteListener(new OnCompleteListener() { // from class: io.flutter.plugins.firebase.messaging.q

                    /* renamed from: b */
                    public final /* synthetic */ MethodChannel.Result f18218b;

                    public /* synthetic */ q(MethodChannel.Result result2) {
                        r2 = result2;
                    }

                    @Override // com.google.android.gms.tasks.OnCompleteListener
                    public final void onComplete(Task task) {
                        FlutterFirebaseMessagingPlugin.this.lambda$onMethodCall$14(r2, task);
                    }
                });
                return;
            case 7:
                initialMessage = sendMessage((Map) methodCall.arguments());
                initialMessage.addOnCompleteListener(new OnCompleteListener() { // from class: io.flutter.plugins.firebase.messaging.q

                    /* renamed from: b */
                    public final /* synthetic */ MethodChannel.Result f18218b;

                    public /* synthetic */ q(MethodChannel.Result result2) {
                        r2 = result2;
                    }

                    @Override // com.google.android.gms.tasks.OnCompleteListener
                    public final void onComplete(Task task) {
                        FlutterFirebaseMessagingPlugin.this.lambda$onMethodCall$14(r2, task);
                    }
                });
                return;
            case '\b':
                if (Build.VERSION.SDK_INT >= 33) {
                    initialMessage = requestPermissions();
                    initialMessage.addOnCompleteListener(new OnCompleteListener() { // from class: io.flutter.plugins.firebase.messaging.q

                        /* renamed from: b */
                        public final /* synthetic */ MethodChannel.Result f18218b;

                        public /* synthetic */ q(MethodChannel.Result result2) {
                            r2 = result2;
                        }

                        @Override // com.google.android.gms.tasks.OnCompleteListener
                        public final void onComplete(Task task) {
                            FlutterFirebaseMessagingPlugin.this.lambda$onMethodCall$14(r2, task);
                        }
                    });
                    return;
                }
            case '\t':
                initialMessage = getPermissions();
                initialMessage.addOnCompleteListener(new OnCompleteListener() { // from class: io.flutter.plugins.firebase.messaging.q

                    /* renamed from: b */
                    public final /* synthetic */ MethodChannel.Result f18218b;

                    public /* synthetic */ q(MethodChannel.Result result2) {
                        r2 = result2;
                    }

                    @Override // com.google.android.gms.tasks.OnCompleteListener
                    public final void onComplete(Task task) {
                        FlutterFirebaseMessagingPlugin.this.lambda$onMethodCall$14(r2, task);
                    }
                });
                return;
            case '\n':
                initialMessage = getToken();
                initialMessage.addOnCompleteListener(new OnCompleteListener() { // from class: io.flutter.plugins.firebase.messaging.q

                    /* renamed from: b */
                    public final /* synthetic */ MethodChannel.Result f18218b;

                    public /* synthetic */ q(MethodChannel.Result result2) {
                        r2 = result2;
                    }

                    @Override // com.google.android.gms.tasks.OnCompleteListener
                    public final void onComplete(Task task) {
                        FlutterFirebaseMessagingPlugin.this.lambda$onMethodCall$14(r2, task);
                    }
                });
                return;
            default:
                result2.notImplemented();
                return;
        }
    }

    @Override // io.flutter.plugin.common.PluginRegistry.NewIntentListener
    public boolean onNewIntent(Intent intent) {
        Map<String, Object> map;
        Map<String, Object> map2;
        Map<String, Object> firebaseMessageMap;
        if (intent.getExtras() == null) {
            return false;
        }
        String string = intent.getExtras().getString("google.message_id");
        if (string == null) {
            string = intent.getExtras().getString("message_id");
        }
        if (string == null) {
            return false;
        }
        r0 r0Var = FlutterFirebaseMessagingReceiver.notifications.get(string);
        if (r0Var != null || (firebaseMessageMap = FlutterFirebaseMessagingStore.getInstance().getFirebaseMessageMap(string)) == null) {
            map = null;
        } else {
            r0Var = FlutterFirebaseMessagingUtils.getRemoteMessageForArguments(firebaseMessageMap);
            map = FlutterFirebaseMessagingUtils.getRemoteMessageNotificationForArguments(firebaseMessageMap);
        }
        if (r0Var == null) {
            return false;
        }
        this.initialMessage = r0Var;
        this.initialMessageNotification = map;
        FlutterFirebaseMessagingReceiver.notifications.remove(string);
        Map<String, Object> remoteMessageToMap = FlutterFirebaseMessagingUtils.remoteMessageToMap(r0Var);
        if (r0Var.A1() == null && (map2 = this.initialMessageNotification) != null) {
            remoteMessageToMap.put("notification", map2);
        }
        this.channel.invokeMethod("Messaging#onMessageOpenedApp", remoteMessageToMap);
        this.mainActivity.setIntent(intent);
        return true;
    }

    @Override // io.flutter.embedding.engine.plugins.activity.ActivityAware
    public void onReattachedToActivityForConfigChanges(ActivityPluginBinding activityPluginBinding) {
        activityPluginBinding.addOnNewIntentListener(this);
        this.mainActivity = activityPluginBinding.getActivity();
    }
}

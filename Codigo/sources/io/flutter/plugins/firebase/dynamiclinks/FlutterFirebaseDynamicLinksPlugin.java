package io.flutter.plugins.firebase.dynamiclinks;

import android.app.Activity;
import android.content.Intent;
import android.net.Uri;
import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.OnFailureListener;
import com.google.android.gms.tasks.OnSuccessListener;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.TaskCompletionSource;
import com.google.android.gms.tasks.Tasks;
import fd.a;
import fd.d;
import io.flutter.embedding.engine.plugins.FlutterPlugin;
import io.flutter.embedding.engine.plugins.activity.ActivityAware;
import io.flutter.embedding.engine.plugins.activity.ActivityPluginBinding;
import io.flutter.plugin.common.BinaryMessenger;
import io.flutter.plugin.common.MethodCall;
import io.flutter.plugin.common.MethodChannel;
import io.flutter.plugin.common.PluginRegistry;
import io.flutter.plugins.firebase.core.FlutterFirebasePlugin;
import io.flutter.plugins.firebase.core.FlutterFirebasePluginRegistry;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Objects;
import java.util.concurrent.atomic.AtomicReference;

/* loaded from: classes3.dex */
public class FlutterFirebaseDynamicLinksPlugin implements FlutterFirebasePlugin, FlutterPlugin, ActivityAware, MethodChannel.MethodCallHandler, PluginRegistry.NewIntentListener {
    private static final String METHOD_CHANNEL_NAME = "plugins.flutter.io/firebase_dynamic_links";
    private static final String TAG = "FLTFirebaseDynamicLinks";
    private final AtomicReference<Activity> activity = new AtomicReference<>(null);
    private Map<String, Object> cachedDynamicLinkData;
    private Map<String, Object> cachedDynamicLinkException;
    private MethodChannel channel;

    private String buildLink(Map<String, Object> map) {
        return setupParameters(map).a().a().toString();
    }

    private Task<Map<String, Object>> buildShortLink(Map<String, Object> map) {
        TaskCompletionSource taskCompletionSource = new TaskCompletionSource();
        FlutterFirebasePlugin.cachedThreadPool.execute(new Runnable() { // from class: io.flutter.plugins.firebase.dynamiclinks.d

            /* renamed from: b */
            public final /* synthetic */ Map f18165b;

            /* renamed from: c */
            public final /* synthetic */ TaskCompletionSource f18166c;

            public /* synthetic */ d(Map map2, TaskCompletionSource taskCompletionSource2) {
                r2 = map2;
                r3 = taskCompletionSource2;
            }

            @Override // java.lang.Runnable
            public final void run() {
                FlutterFirebaseDynamicLinksPlugin.this.lambda$buildShortLink$3(r2, r3);
            }
        });
        return taskCompletionSource2.getTask();
    }

    private void checkForCachedData() {
        Map<String, Object> map = this.cachedDynamicLinkData;
        if (map != null) {
            this.channel.invokeMethod("FirebaseDynamicLink#onLinkSuccess", map);
            this.cachedDynamicLinkData = null;
        }
        Map<String, Object> map2 = this.cachedDynamicLinkException;
        if (map2 != null) {
            this.channel.invokeMethod("FirebaseDynamicLink#onLinkError", map2);
            this.cachedDynamicLinkException = null;
        }
    }

    private void detachToActivity() {
        this.activity.set(null);
    }

    private Task<Map<String, Object>> getDynamicLink(fd.b bVar, String str) {
        TaskCompletionSource taskCompletionSource = new TaskCompletionSource();
        FlutterFirebasePlugin.cachedThreadPool.execute(new Runnable() { // from class: io.flutter.plugins.firebase.dynamiclinks.f

            /* renamed from: b */
            public final /* synthetic */ String f18169b;

            /* renamed from: c */
            public final /* synthetic */ fd.b f18170c;

            /* renamed from: d */
            public final /* synthetic */ TaskCompletionSource f18171d;

            public /* synthetic */ f(String str2, fd.b bVar2, TaskCompletionSource taskCompletionSource2) {
                r2 = str2;
                r3 = bVar2;
                r4 = taskCompletionSource2;
            }

            @Override // java.lang.Runnable
            public final void run() {
                FlutterFirebaseDynamicLinksPlugin.this.lambda$getDynamicLink$4(r2, r3, r4);
            }
        });
        return taskCompletionSource2.getTask();
    }

    static fd.b getDynamicLinkInstance(Map<String, Object> map) {
        String str;
        return (map == null || (str = (String) map.get("appName")) == null) ? fd.b.d() : fd.b.e(zb.g.p(str));
    }

    private void initInstance(BinaryMessenger binaryMessenger) {
        MethodChannel methodChannel = new MethodChannel(binaryMessenger, METHOD_CHANNEL_NAME);
        this.channel = methodChannel;
        methodChannel.setMethodCallHandler(this);
        FlutterFirebasePluginRegistry.registerPlugin(METHOD_CHANNEL_NAME, this);
        checkForCachedData();
    }

    public /* synthetic */ void lambda$buildShortLink$3(Map map, TaskCompletionSource taskCompletionSource) {
        try {
            a.c cVar = setupParameters(map);
            String str = (String) map.get("longDynamicLink");
            if (str != null) {
                cVar.i(Uri.parse(str));
            }
            Integer num = 1;
            Integer num2 = (Integer) map.get("shortLinkType");
            if (num2 != null) {
                int intValue = num2.intValue();
                if (intValue == 0) {
                    num = 1;
                } else if (intValue == 1) {
                    num = 2;
                }
            }
            HashMap hashMap = new HashMap();
            fd.d dVar = (fd.d) Tasks.await(cVar.b(num.intValue()));
            ArrayList arrayList = new ArrayList();
            Iterator<? extends d.a> it = dVar.h0().iterator();
            while (it.hasNext()) {
                arrayList.add(it.next().getMessage());
            }
            hashMap.put("url", dVar.i0().toString());
            hashMap.put("warnings", arrayList);
            hashMap.put("previewLink", dVar.U().toString());
            taskCompletionSource.setResult(hashMap);
        } catch (Exception e10) {
            taskCompletionSource.setException(e10);
        }
    }

    public /* synthetic */ void lambda$getDynamicLink$4(String str, fd.b bVar, TaskCompletionSource taskCompletionSource) {
        Object await;
        try {
            if (str == null) {
                if (this.activity.get() != null && this.activity.get().getIntent() != null && !this.activity.get().getIntent().getBooleanExtra("flutterfire-used-link", false)) {
                    this.activity.get().getIntent().putExtra("flutterfire-used-link", true);
                    await = Tasks.await(bVar.b(this.activity.get().getIntent()));
                }
                taskCompletionSource.setResult(null);
                return;
            }
            await = Tasks.await(bVar.c(Uri.parse(str)));
            taskCompletionSource.setResult(Utils.getMapFromPendingDynamicLinkData((fd.c) await));
        } catch (Exception e10) {
            taskCompletionSource.setException(e10);
        }
    }

    public static /* synthetic */ void lambda$onMethodCall$2(MethodChannel.Result result, Task task) {
        if (task.isSuccessful()) {
            result.success(task.getResult());
        } else {
            Exception exception = task.getException();
            result.error(Constants.DEFAULT_ERROR_CODE, exception != null ? exception.getMessage() : null, Utils.getExceptionDetails(exception));
        }
    }

    public /* synthetic */ void lambda$onNewIntent$0(fd.c cVar) {
        Map<String, Object> mapFromPendingDynamicLinkData = Utils.getMapFromPendingDynamicLinkData(cVar);
        if (mapFromPendingDynamicLinkData != null) {
            MethodChannel methodChannel = this.channel;
            if (methodChannel != null) {
                methodChannel.invokeMethod("FirebaseDynamicLink#onLinkSuccess", mapFromPendingDynamicLinkData);
            } else {
                this.cachedDynamicLinkData = mapFromPendingDynamicLinkData;
            }
        }
    }

    public /* synthetic */ void lambda$onNewIntent$1(Exception exc) {
        Map<String, Object> exceptionDetails = Utils.getExceptionDetails(exc);
        MethodChannel methodChannel = this.channel;
        if (methodChannel != null) {
            methodChannel.invokeMethod("FirebaseDynamicLink#onLinkError", exceptionDetails);
        } else {
            this.cachedDynamicLinkException = exceptionDetails;
        }
    }

    private a.c setupParameters(Map<String, Object> map) {
        a.c a10 = getDynamicLinkInstance(map).a();
        Object obj = map.get("uriPrefix");
        Objects.requireNonNull(obj);
        String str = (String) map.get("link");
        a10.d((String) obj);
        a10.h(Uri.parse(str));
        Map map2 = (Map) map.get("androidParameters");
        if (map2 != null) {
            String str2 = (String) valueFor("packageName", map2);
            String str3 = (String) valueFor("fallbackUrl", map2);
            Integer num = (Integer) valueFor("minimumVersion", map2);
            a.b.C0244a c0244a = new a.b.C0244a(str2);
            if (str3 != null) {
                c0244a.b(Uri.parse(str3));
            }
            if (num != null) {
                c0244a.c(num.intValue());
            }
            a10.c(c0244a.a());
        }
        Map map3 = (Map) map.get("googleAnalyticsParameters");
        if (map3 != null) {
            String str4 = (String) valueFor("campaign", map3);
            String str5 = (String) valueFor("content", map3);
            String str6 = (String) valueFor("medium", map3);
            String str7 = (String) valueFor("source", map3);
            String str8 = (String) valueFor("term", map3);
            a.d.C0245a c0245a = new a.d.C0245a();
            if (str4 != null) {
                c0245a.b(str4);
            }
            if (str5 != null) {
                c0245a.c(str5);
            }
            if (str6 != null) {
                c0245a.d(str6);
            }
            if (str7 != null) {
                c0245a.e(str7);
            }
            if (str8 != null) {
                c0245a.f(str8);
            }
            a10.e(c0245a.a());
        }
        Map map4 = (Map) map.get("iosParameters");
        if (map4 != null) {
            String str9 = (String) valueFor("bundleId", map4);
            String str10 = (String) valueFor("appStoreId", map4);
            String str11 = (String) valueFor("customScheme", map4);
            String str12 = (String) valueFor("fallbackUrl", map4);
            String str13 = (String) valueFor("ipadBundleId", map4);
            String str14 = (String) valueFor("ipadFallbackUrl", map4);
            String str15 = (String) valueFor("minimumVersion", map4);
            a.e.C0246a c0246a = new a.e.C0246a(str9);
            if (str10 != null) {
                c0246a.b(str10);
            }
            if (str11 != null) {
                c0246a.c(str11);
            }
            if (str12 != null) {
                c0246a.d(Uri.parse(str12));
            }
            if (str13 != null) {
                c0246a.e(str13);
            }
            if (str14 != null) {
                c0246a.f(Uri.parse(str14));
            }
            if (str15 != null) {
                c0246a.g(str15);
            }
            a10.f(c0246a.a());
        }
        Map map5 = (Map) map.get("itunesConnectAnalyticsParameters");
        if (map5 != null) {
            String str16 = (String) valueFor("affiliateToken", map5);
            String str17 = (String) valueFor("campaignToken", map5);
            String str18 = (String) valueFor("providerToken", map5);
            a.f.C0247a c0247a = new a.f.C0247a();
            if (str16 != null) {
                c0247a.b(str16);
            }
            if (str17 != null) {
                c0247a.c(str17);
            }
            if (str18 != null) {
                c0247a.d(str18);
            }
            a10.g(c0247a.a());
        }
        Map map6 = (Map) map.get("navigationInfoParameters");
        if (map6 != null) {
            Boolean bool = (Boolean) valueFor("forcedRedirectEnabled", map6);
            a.g.C0248a c0248a = new a.g.C0248a();
            if (bool != null) {
                c0248a.b(bool.booleanValue());
            }
            a10.j(c0248a.a());
        }
        Map map7 = (Map) map.get("socialMetaTagParameters");
        if (map7 != null) {
            String str19 = (String) valueFor("description", map7);
            String str20 = (String) valueFor("imageUrl", map7);
            String str21 = (String) valueFor("title", map7);
            a.h.C0249a c0249a = new a.h.C0249a();
            if (str19 != null) {
                c0249a.b(str19);
            }
            if (str20 != null) {
                c0249a.c(Uri.parse(str20));
            }
            if (str21 != null) {
                c0249a.d(str21);
            }
            a10.k(c0249a.a());
        }
        return a10;
    }

    private static <T> T valueFor(String str, Map<String, Object> map) {
        return (T) map.get(str);
    }

    @Override // io.flutter.plugins.firebase.core.FlutterFirebasePlugin
    public Task<Void> didReinitializeFirebaseCore() {
        TaskCompletionSource taskCompletionSource = new TaskCompletionSource();
        FlutterFirebasePlugin.cachedThreadPool.execute(new Runnable() { // from class: io.flutter.plugins.firebase.dynamiclinks.e
            public /* synthetic */ e() {
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
        FlutterFirebasePlugin.cachedThreadPool.execute(new Runnable() { // from class: io.flutter.plugins.firebase.dynamiclinks.g
            public /* synthetic */ g() {
            }

            @Override // java.lang.Runnable
            public final void run() {
                TaskCompletionSource.this.setResult(null);
            }
        });
        return taskCompletionSource.getTask();
    }

    @Override // io.flutter.embedding.engine.plugins.activity.ActivityAware
    public void onAttachedToActivity(ActivityPluginBinding activityPluginBinding) {
        this.activity.set(activityPluginBinding.getActivity());
        activityPluginBinding.addOnNewIntentListener(this);
    }

    @Override // io.flutter.embedding.engine.plugins.FlutterPlugin
    public void onAttachedToEngine(FlutterPlugin.FlutterPluginBinding flutterPluginBinding) {
        initInstance(flutterPluginBinding.getBinaryMessenger());
    }

    @Override // io.flutter.embedding.engine.plugins.activity.ActivityAware
    public void onDetachedFromActivity() {
        detachToActivity();
    }

    @Override // io.flutter.embedding.engine.plugins.activity.ActivityAware
    public void onDetachedFromActivityForConfigChanges() {
        detachToActivity();
    }

    @Override // io.flutter.embedding.engine.plugins.FlutterPlugin
    public void onDetachedFromEngine(FlutterPlugin.FlutterPluginBinding flutterPluginBinding) {
        this.channel.setMethodCallHandler(null);
        this.channel = null;
    }

    @Override // io.flutter.plugin.common.MethodChannel.MethodCallHandler
    public void onMethodCall(MethodCall methodCall, MethodChannel.Result result) {
        Task<Map<String, Object>> dynamicLink;
        fd.b dynamicLinkInstance = getDynamicLinkInstance((Map) methodCall.arguments());
        String str = methodCall.method;
        str.hashCode();
        char c10 = 65535;
        switch (str.hashCode()) {
            case -2071055899:
                if (str.equals("FirebaseDynamicLinks#getDynamicLink")) {
                    c10 = 0;
                    break;
                }
                break;
            case -1769644534:
                if (str.equals("FirebaseDynamicLinks#buildShortLink")) {
                    c10 = 1;
                    break;
                }
                break;
            case -579002774:
                if (str.equals("FirebaseDynamicLinks#getInitialLink")) {
                    c10 = 2;
                    break;
                }
                break;
            case 1658258438:
                if (str.equals("FirebaseDynamicLinks#buildLink")) {
                    c10 = 3;
                    break;
                }
                break;
        }
        switch (c10) {
            case 0:
            case 2:
                dynamicLink = getDynamicLink(dynamicLinkInstance, (String) methodCall.argument("url"));
                break;
            case 1:
                Map<String, Object> map = (Map) methodCall.arguments();
                Objects.requireNonNull(map);
                dynamicLink = buildShortLink(map);
                break;
            case 3:
                result.success(buildLink((Map) methodCall.arguments()));
                return;
            default:
                result.notImplemented();
                return;
        }
        dynamicLink.addOnCompleteListener(new OnCompleteListener() { // from class: io.flutter.plugins.firebase.dynamiclinks.a
            public /* synthetic */ a() {
            }

            @Override // com.google.android.gms.tasks.OnCompleteListener
            public final void onComplete(Task task) {
                FlutterFirebaseDynamicLinksPlugin.lambda$onMethodCall$2(MethodChannel.Result.this, task);
            }
        });
    }

    @Override // io.flutter.plugin.common.PluginRegistry.NewIntentListener
    public boolean onNewIntent(Intent intent) {
        getDynamicLinkInstance(null).b(intent).addOnSuccessListener(new OnSuccessListener() { // from class: io.flutter.plugins.firebase.dynamiclinks.b
            public /* synthetic */ b() {
            }

            @Override // com.google.android.gms.tasks.OnSuccessListener
            public final void onSuccess(Object obj) {
                FlutterFirebaseDynamicLinksPlugin.this.lambda$onNewIntent$0((fd.c) obj);
            }
        }).addOnFailureListener(new OnFailureListener() { // from class: io.flutter.plugins.firebase.dynamiclinks.c
            public /* synthetic */ c() {
            }

            @Override // com.google.android.gms.tasks.OnFailureListener
            public final void onFailure(Exception exc) {
                FlutterFirebaseDynamicLinksPlugin.this.lambda$onNewIntent$1(exc);
            }
        });
        return false;
    }

    @Override // io.flutter.embedding.engine.plugins.activity.ActivityAware
    public void onReattachedToActivityForConfigChanges(ActivityPluginBinding activityPluginBinding) {
        this.activity.set(activityPluginBinding.getActivity());
        activityPluginBinding.addOnNewIntentListener(this);
    }
}

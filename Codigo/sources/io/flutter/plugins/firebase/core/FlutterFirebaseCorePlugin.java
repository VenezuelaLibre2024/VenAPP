package io.flutter.plugins.firebase.core;

import android.content.Context;
import android.os.Looper;
import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.TaskCompletionSource;
import com.google.android.gms.tasks.Tasks;
import io.flutter.embedding.engine.plugins.FlutterPlugin;
import io.flutter.plugins.firebase.core.GeneratedAndroidFirebaseCore;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import zb.p;

/* loaded from: classes3.dex */
public class FlutterFirebaseCorePlugin implements FlutterPlugin, GeneratedAndroidFirebaseCore.FirebaseCoreHostApi, GeneratedAndroidFirebaseCore.FirebaseAppHostApi {
    public static Map<String, String> customAuthDomain = new HashMap();
    private Context applicationContext;
    private boolean coreInitialized = false;

    private Task<GeneratedAndroidFirebaseCore.PigeonInitializeResponse> firebaseAppToMap(zb.g gVar) {
        TaskCompletionSource taskCompletionSource = new TaskCompletionSource();
        FlutterFirebasePlugin.cachedThreadPool.execute(new Runnable() { // from class: io.flutter.plugins.firebase.core.d

            /* renamed from: b */
            public final /* synthetic */ zb.g f18115b;

            /* renamed from: c */
            public final /* synthetic */ TaskCompletionSource f18116c;

            public /* synthetic */ d(zb.g gVar2, TaskCompletionSource taskCompletionSource2) {
                r2 = gVar2;
                r3 = taskCompletionSource2;
            }

            @Override // java.lang.Runnable
            public final void run() {
                FlutterFirebaseCorePlugin.this.lambda$firebaseAppToMap$0(r2, r3);
            }
        });
        return taskCompletionSource2.getTask();
    }

    private GeneratedAndroidFirebaseCore.PigeonFirebaseOptions firebaseOptionsToMap(zb.p pVar) {
        GeneratedAndroidFirebaseCore.PigeonFirebaseOptions.Builder builder = new GeneratedAndroidFirebaseCore.PigeonFirebaseOptions.Builder();
        builder.setApiKey(pVar.b());
        builder.setAppId(pVar.c());
        if (pVar.f() != null) {
            builder.setMessagingSenderId(pVar.f());
        }
        if (pVar.g() != null) {
            builder.setProjectId(pVar.g());
        }
        builder.setDatabaseURL(pVar.d());
        builder.setStorageBucket(pVar.h());
        builder.setTrackingId(pVar.e());
        return builder.build();
    }

    public static /* synthetic */ void lambda$delete$7(String str, TaskCompletionSource taskCompletionSource) {
        try {
            try {
                zb.g.p(str).j();
            } catch (IllegalStateException unused) {
            }
            taskCompletionSource.setResult(null);
        } catch (Exception e10) {
            taskCompletionSource.setException(e10);
        }
    }

    public /* synthetic */ void lambda$firebaseAppToMap$0(zb.g gVar, TaskCompletionSource taskCompletionSource) {
        try {
            GeneratedAndroidFirebaseCore.PigeonInitializeResponse.Builder builder = new GeneratedAndroidFirebaseCore.PigeonInitializeResponse.Builder();
            builder.setName(gVar.q());
            builder.setOptions(firebaseOptionsToMap(gVar.r()));
            builder.setIsAutomaticDataCollectionEnabled(Boolean.valueOf(gVar.x()));
            builder.setPluginConstants((Map) Tasks.await(FlutterFirebasePluginRegistry.getPluginConstantsForFirebaseApp(gVar)));
            taskCompletionSource.setResult(builder.build());
        } catch (Exception e10) {
            taskCompletionSource.setException(e10);
        }
    }

    public /* synthetic */ void lambda$initializeApp$2(GeneratedAndroidFirebaseCore.PigeonFirebaseOptions pigeonFirebaseOptions, String str, TaskCompletionSource taskCompletionSource) {
        try {
            zb.p a10 = new p.b().b(pigeonFirebaseOptions.getApiKey()).c(pigeonFirebaseOptions.getAppId()).d(pigeonFirebaseOptions.getDatabaseURL()).f(pigeonFirebaseOptions.getMessagingSenderId()).g(pigeonFirebaseOptions.getProjectId()).h(pigeonFirebaseOptions.getStorageBucket()).e(pigeonFirebaseOptions.getTrackingId()).a();
            try {
                Looper.prepare();
            } catch (Exception unused) {
            }
            if (pigeonFirebaseOptions.getAuthDomain() != null) {
                customAuthDomain.put(str, pigeonFirebaseOptions.getAuthDomain());
            }
            taskCompletionSource.setResult((GeneratedAndroidFirebaseCore.PigeonInitializeResponse) Tasks.await(firebaseAppToMap(zb.g.w(this.applicationContext, a10, str))));
        } catch (Exception e10) {
            taskCompletionSource.setException(e10);
        }
    }

    public /* synthetic */ void lambda$initializeCore$3(TaskCompletionSource taskCompletionSource) {
        try {
            if (this.coreInitialized) {
                Tasks.await(FlutterFirebasePluginRegistry.didReinitializeFirebaseCore());
            } else {
                this.coreInitialized = true;
            }
            List<zb.g> n10 = zb.g.n(this.applicationContext);
            ArrayList arrayList = new ArrayList(n10.size());
            Iterator<zb.g> it = n10.iterator();
            while (it.hasNext()) {
                arrayList.add((GeneratedAndroidFirebaseCore.PigeonInitializeResponse) Tasks.await(firebaseAppToMap(it.next())));
            }
            taskCompletionSource.setResult(arrayList);
        } catch (Exception e10) {
            taskCompletionSource.setException(e10);
        }
    }

    public static /* synthetic */ void lambda$listenToResponse$1(GeneratedAndroidFirebaseCore.Result result, Task task) {
        if (task.isSuccessful()) {
            result.success(task.getResult());
        } else {
            result.error(task.getException());
        }
    }

    public /* synthetic */ void lambda$optionsFromResource$4(TaskCompletionSource taskCompletionSource) {
        try {
            zb.p a10 = zb.p.a(this.applicationContext);
            if (a10 == null) {
                taskCompletionSource.setResult(null);
            } else {
                taskCompletionSource.setResult(firebaseOptionsToMap(a10));
            }
        } catch (Exception e10) {
            taskCompletionSource.setException(e10);
        }
    }

    public static /* synthetic */ void lambda$setAutomaticDataCollectionEnabled$5(String str, Boolean bool, TaskCompletionSource taskCompletionSource) {
        try {
            zb.g.p(str).F(bool);
            taskCompletionSource.setResult(null);
        } catch (Exception e10) {
            taskCompletionSource.setException(e10);
        }
    }

    public static /* synthetic */ void lambda$setAutomaticResourceManagementEnabled$6(String str, Boolean bool, TaskCompletionSource taskCompletionSource) {
        try {
            zb.g.p(str).E(bool.booleanValue());
            taskCompletionSource.setResult(null);
        } catch (Exception e10) {
            taskCompletionSource.setException(e10);
        }
    }

    private <T> void listenToResponse(TaskCompletionSource<T> taskCompletionSource, GeneratedAndroidFirebaseCore.Result<T> result) {
        taskCompletionSource.getTask().addOnCompleteListener(new OnCompleteListener() { // from class: io.flutter.plugins.firebase.core.b
            public /* synthetic */ b() {
            }

            @Override // com.google.android.gms.tasks.OnCompleteListener
            public final void onComplete(Task task) {
                FlutterFirebaseCorePlugin.lambda$listenToResponse$1(GeneratedAndroidFirebaseCore.Result.this, task);
            }
        });
    }

    @Override // io.flutter.plugins.firebase.core.GeneratedAndroidFirebaseCore.FirebaseAppHostApi
    public void delete(String str, GeneratedAndroidFirebaseCore.Result<Void> result) {
        TaskCompletionSource taskCompletionSource = new TaskCompletionSource();
        FlutterFirebasePlugin.cachedThreadPool.execute(new Runnable() { // from class: io.flutter.plugins.firebase.core.a

            /* renamed from: a */
            public final /* synthetic */ String f18109a;

            /* renamed from: b */
            public final /* synthetic */ TaskCompletionSource f18110b;

            public /* synthetic */ a(String str2, TaskCompletionSource taskCompletionSource2) {
                r1 = str2;
                r2 = taskCompletionSource2;
            }

            @Override // java.lang.Runnable
            public final void run() {
                FlutterFirebaseCorePlugin.lambda$delete$7(r1, r2);
            }
        });
        listenToResponse(taskCompletionSource2, result);
    }

    @Override // io.flutter.plugins.firebase.core.GeneratedAndroidFirebaseCore.FirebaseCoreHostApi
    public void initializeApp(String str, GeneratedAndroidFirebaseCore.PigeonFirebaseOptions pigeonFirebaseOptions, GeneratedAndroidFirebaseCore.Result<GeneratedAndroidFirebaseCore.PigeonInitializeResponse> result) {
        TaskCompletionSource taskCompletionSource = new TaskCompletionSource();
        FlutterFirebasePlugin.cachedThreadPool.execute(new Runnable() { // from class: io.flutter.plugins.firebase.core.f

            /* renamed from: b */
            public final /* synthetic */ GeneratedAndroidFirebaseCore.PigeonFirebaseOptions f18120b;

            /* renamed from: c */
            public final /* synthetic */ String f18121c;

            /* renamed from: d */
            public final /* synthetic */ TaskCompletionSource f18122d;

            public /* synthetic */ f(GeneratedAndroidFirebaseCore.PigeonFirebaseOptions pigeonFirebaseOptions2, String str2, TaskCompletionSource taskCompletionSource2) {
                r2 = pigeonFirebaseOptions2;
                r3 = str2;
                r4 = taskCompletionSource2;
            }

            @Override // java.lang.Runnable
            public final void run() {
                FlutterFirebaseCorePlugin.this.lambda$initializeApp$2(r2, r3, r4);
            }
        });
        listenToResponse(taskCompletionSource2, result);
    }

    @Override // io.flutter.plugins.firebase.core.GeneratedAndroidFirebaseCore.FirebaseCoreHostApi
    public void initializeCore(GeneratedAndroidFirebaseCore.Result<List<GeneratedAndroidFirebaseCore.PigeonInitializeResponse>> result) {
        TaskCompletionSource taskCompletionSource = new TaskCompletionSource();
        FlutterFirebasePlugin.cachedThreadPool.execute(new Runnable() { // from class: io.flutter.plugins.firebase.core.e

            /* renamed from: b */
            public final /* synthetic */ TaskCompletionSource f18118b;

            public /* synthetic */ e(TaskCompletionSource taskCompletionSource2) {
                r2 = taskCompletionSource2;
            }

            @Override // java.lang.Runnable
            public final void run() {
                FlutterFirebaseCorePlugin.this.lambda$initializeCore$3(r2);
            }
        });
        listenToResponse(taskCompletionSource2, result);
    }

    @Override // io.flutter.embedding.engine.plugins.FlutterPlugin
    public void onAttachedToEngine(FlutterPlugin.FlutterPluginBinding flutterPluginBinding) {
        GeneratedAndroidFirebaseCore.FirebaseCoreHostApi.setup(flutterPluginBinding.getBinaryMessenger(), this);
        GeneratedAndroidFirebaseCore.FirebaseAppHostApi.setup(flutterPluginBinding.getBinaryMessenger(), this);
        this.applicationContext = flutterPluginBinding.getApplicationContext();
    }

    @Override // io.flutter.embedding.engine.plugins.FlutterPlugin
    public void onDetachedFromEngine(FlutterPlugin.FlutterPluginBinding flutterPluginBinding) {
        this.applicationContext = null;
        GeneratedAndroidFirebaseCore.FirebaseCoreHostApi.setup(flutterPluginBinding.getBinaryMessenger(), null);
        GeneratedAndroidFirebaseCore.FirebaseAppHostApi.setup(flutterPluginBinding.getBinaryMessenger(), null);
    }

    @Override // io.flutter.plugins.firebase.core.GeneratedAndroidFirebaseCore.FirebaseCoreHostApi
    public void optionsFromResource(GeneratedAndroidFirebaseCore.Result<GeneratedAndroidFirebaseCore.PigeonFirebaseOptions> result) {
        TaskCompletionSource taskCompletionSource = new TaskCompletionSource();
        FlutterFirebasePlugin.cachedThreadPool.execute(new Runnable() { // from class: io.flutter.plugins.firebase.core.c

            /* renamed from: b */
            public final /* synthetic */ TaskCompletionSource f18113b;

            public /* synthetic */ c(TaskCompletionSource taskCompletionSource2) {
                r2 = taskCompletionSource2;
            }

            @Override // java.lang.Runnable
            public final void run() {
                FlutterFirebaseCorePlugin.this.lambda$optionsFromResource$4(r2);
            }
        });
        listenToResponse(taskCompletionSource2, result);
    }

    @Override // io.flutter.plugins.firebase.core.GeneratedAndroidFirebaseCore.FirebaseAppHostApi
    public void setAutomaticDataCollectionEnabled(String str, Boolean bool, GeneratedAndroidFirebaseCore.Result<Void> result) {
        TaskCompletionSource taskCompletionSource = new TaskCompletionSource();
        FlutterFirebasePlugin.cachedThreadPool.execute(new Runnable() { // from class: io.flutter.plugins.firebase.core.g

            /* renamed from: a */
            public final /* synthetic */ String f18123a;

            /* renamed from: b */
            public final /* synthetic */ Boolean f18124b;

            /* renamed from: c */
            public final /* synthetic */ TaskCompletionSource f18125c;

            public /* synthetic */ g(String str2, Boolean bool2, TaskCompletionSource taskCompletionSource2) {
                r1 = str2;
                r2 = bool2;
                r3 = taskCompletionSource2;
            }

            @Override // java.lang.Runnable
            public final void run() {
                FlutterFirebaseCorePlugin.lambda$setAutomaticDataCollectionEnabled$5(r1, r2, r3);
            }
        });
        listenToResponse(taskCompletionSource2, result);
    }

    @Override // io.flutter.plugins.firebase.core.GeneratedAndroidFirebaseCore.FirebaseAppHostApi
    public void setAutomaticResourceManagementEnabled(String str, Boolean bool, GeneratedAndroidFirebaseCore.Result<Void> result) {
        TaskCompletionSource taskCompletionSource = new TaskCompletionSource();
        FlutterFirebasePlugin.cachedThreadPool.execute(new Runnable() { // from class: io.flutter.plugins.firebase.core.h

            /* renamed from: a */
            public final /* synthetic */ String f18126a;

            /* renamed from: b */
            public final /* synthetic */ Boolean f18127b;

            /* renamed from: c */
            public final /* synthetic */ TaskCompletionSource f18128c;

            public /* synthetic */ h(String str2, Boolean bool2, TaskCompletionSource taskCompletionSource2) {
                r1 = str2;
                r2 = bool2;
                r3 = taskCompletionSource2;
            }

            @Override // java.lang.Runnable
            public final void run() {
                FlutterFirebaseCorePlugin.lambda$setAutomaticResourceManagementEnabled$6(r1, r2, r3);
            }
        });
        listenToResponse(taskCompletionSource2, result);
    }
}

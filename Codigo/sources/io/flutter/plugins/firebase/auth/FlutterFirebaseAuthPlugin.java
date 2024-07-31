package io.flutter.plugins.firebase.auth;

import android.app.Activity;
import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.TaskCompletionSource;
import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.auth.n0;
import io.flutter.embedding.engine.plugins.FlutterPlugin;
import io.flutter.embedding.engine.plugins.activity.ActivityAware;
import io.flutter.embedding.engine.plugins.activity.ActivityPluginBinding;
import io.flutter.plugin.common.BinaryMessenger;
import io.flutter.plugin.common.EventChannel;
import io.flutter.plugin.common.MethodChannel;
import io.flutter.plugins.firebase.auth.GeneratedAndroidFirebaseAuth;
import io.flutter.plugins.firebase.auth.PhoneNumberVerificationStreamHandler;
import io.flutter.plugins.firebase.core.FlutterFirebaseCorePlugin;
import io.flutter.plugins.firebase.core.FlutterFirebasePlugin;
import io.flutter.plugins.firebase.core.FlutterFirebasePluginRegistry;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.UUID;

/* loaded from: classes3.dex */
public class FlutterFirebaseAuthPlugin implements FlutterFirebasePlugin, FlutterPlugin, ActivityAware, GeneratedAndroidFirebaseAuth.FirebaseAuthHostApi {
    static final /* synthetic */ boolean $assertionsDisabled = false;
    private static final String METHOD_CHANNEL_NAME = "plugins.flutter.io/firebase_auth";
    static final HashMap<Integer, com.google.firebase.auth.h> authCredentials = new HashMap<>();
    private Activity activity;
    private MethodChannel channel;
    private BinaryMessenger messenger;
    private final Map<EventChannel, EventChannel.StreamHandler> streamHandlers = new HashMap();
    private final FlutterFirebaseAuthUser firebaseAuthUser = new FlutterFirebaseAuthUser();
    private final FlutterFirebaseMultiFactor firebaseMultiFactor = new FlutterFirebaseMultiFactor();
    private final FlutterFirebaseTotpMultiFactor firebaseTotpMultiFactor = new FlutterFirebaseTotpMultiFactor();
    private final FlutterFirebaseTotpSecret firebaseTotpSecret = new FlutterFirebaseTotpSecret();

    private Activity getActivity() {
        return this.activity;
    }

    public static FirebaseAuth getAuthFromPigeon(GeneratedAndroidFirebaseAuth.AuthPigeonFirebaseApp authPigeonFirebaseApp) {
        FirebaseAuth firebaseAuth = FirebaseAuth.getInstance(zb.g.p(authPigeonFirebaseApp.getAppName()));
        if (authPigeonFirebaseApp.getTenantId() != null) {
            firebaseAuth.w(authPigeonFirebaseApp.getTenantId());
        }
        String str = FlutterFirebaseCorePlugin.customAuthDomain.get(authPigeonFirebaseApp.getAppName());
        if (str != null) {
            firebaseAuth.u(str);
        }
        return firebaseAuth;
    }

    private void initInstance(BinaryMessenger binaryMessenger) {
        FlutterFirebasePluginRegistry.registerPlugin(METHOD_CHANNEL_NAME, this);
        this.channel = new MethodChannel(binaryMessenger, METHOD_CHANNEL_NAME);
        GeneratedAndroidFirebaseAuth.FirebaseAuthHostApi.setup(binaryMessenger, this);
        GeneratedAndroidFirebaseAuth.FirebaseAuthUserHostApi.setup(binaryMessenger, this.firebaseAuthUser);
        GeneratedAndroidFirebaseAuth.MultiFactorUserHostApi.setup(binaryMessenger, this.firebaseMultiFactor);
        GeneratedAndroidFirebaseAuth.MultiFactoResolverHostApi.setup(binaryMessenger, this.firebaseMultiFactor);
        GeneratedAndroidFirebaseAuth.MultiFactorTotpHostApi.setup(binaryMessenger, this.firebaseTotpMultiFactor);
        GeneratedAndroidFirebaseAuth.MultiFactorTotpSecretHostApi.setup(binaryMessenger, this.firebaseTotpSecret);
        this.messenger = binaryMessenger;
    }

    public static /* synthetic */ void lambda$applyActionCode$0(GeneratedAndroidFirebaseAuth.Result result, Task task) {
        if (task.isSuccessful()) {
            result.success(null);
        } else {
            result.error(FlutterFirebaseAuthPluginException.parserExceptionToFlutter(task.getException()));
        }
    }

    public static /* synthetic */ void lambda$checkActionCode$1(GeneratedAndroidFirebaseAuth.Result result, Task task) {
        if (task.isSuccessful()) {
            result.success(PigeonParser.parseActionCodeResult((com.google.firebase.auth.d) task.getResult()));
        } else {
            result.error(FlutterFirebaseAuthPluginException.parserExceptionToFlutter(task.getException()));
        }
    }

    public static /* synthetic */ void lambda$confirmPasswordReset$2(GeneratedAndroidFirebaseAuth.Result result, Task task) {
        if (task.isSuccessful()) {
            result.success(null);
        } else {
            result.error(FlutterFirebaseAuthPluginException.parserExceptionToFlutter(task.getException()));
        }
    }

    public static /* synthetic */ void lambda$createUserWithEmailAndPassword$3(GeneratedAndroidFirebaseAuth.Result result, Task task) {
        if (task.isSuccessful()) {
            result.success(PigeonParser.parseAuthResult((com.google.firebase.auth.i) task.getResult()));
        } else {
            result.error(FlutterFirebaseAuthPluginException.parserExceptionToFlutter(task.getException()));
        }
    }

    public /* synthetic */ void lambda$didReinitializeFirebaseCore$17(TaskCompletionSource taskCompletionSource) {
        try {
            removeEventListeners();
            authCredentials.clear();
            taskCompletionSource.setResult(null);
        } catch (Exception e10) {
            taskCompletionSource.setException(e10);
        }
    }

    public static /* synthetic */ void lambda$fetchSignInMethodsForEmail$10(GeneratedAndroidFirebaseAuth.Result result, Task task) {
        if (task.isSuccessful()) {
            result.success(((com.google.firebase.auth.v0) task.getResult()).a());
        } else {
            result.error(FlutterFirebaseAuthPluginException.parserExceptionToFlutter(task.getException()));
        }
    }

    public static /* synthetic */ void lambda$getPluginConstantsForFirebaseApp$16(zb.g gVar, TaskCompletionSource taskCompletionSource) {
        try {
            HashMap hashMap = new HashMap();
            FirebaseAuth firebaseAuth = FirebaseAuth.getInstance(gVar);
            com.google.firebase.auth.a0 j10 = firebaseAuth.j();
            String m10 = firebaseAuth.m();
            GeneratedAndroidFirebaseAuth.PigeonUserDetails parseFirebaseUser = j10 == null ? null : PigeonParser.parseFirebaseUser(j10);
            if (m10 != null) {
                hashMap.put("APP_LANGUAGE_CODE", m10);
            }
            if (parseFirebaseUser != null) {
                hashMap.put("APP_CURRENT_USER", parseFirebaseUser.toList());
            }
            taskCompletionSource.setResult(hashMap);
        } catch (Exception e10) {
            taskCompletionSource.setException(e10);
        }
    }

    public static /* synthetic */ void lambda$sendPasswordResetEmail$11(GeneratedAndroidFirebaseAuth.Result result, Task task) {
        if (task.isSuccessful()) {
            result.success(null);
        } else {
            result.error(FlutterFirebaseAuthPluginException.parserExceptionToFlutter(task.getException()));
        }
    }

    public static /* synthetic */ void lambda$sendPasswordResetEmail$12(GeneratedAndroidFirebaseAuth.Result result, Task task) {
        if (task.isSuccessful()) {
            result.success(null);
        } else {
            result.error(FlutterFirebaseAuthPluginException.parserExceptionToFlutter(task.getException()));
        }
    }

    public static /* synthetic */ void lambda$sendSignInLinkToEmail$13(GeneratedAndroidFirebaseAuth.Result result, Task task) {
        if (task.isSuccessful()) {
            result.success(null);
        } else {
            result.error(FlutterFirebaseAuthPluginException.parserExceptionToFlutter(task.getException()));
        }
    }

    public static /* synthetic */ void lambda$signInAnonymously$4(GeneratedAndroidFirebaseAuth.Result result, Task task) {
        if (task.isSuccessful()) {
            result.success(PigeonParser.parseAuthResult((com.google.firebase.auth.i) task.getResult()));
        } else {
            result.error(FlutterFirebaseAuthPluginException.parserExceptionToFlutter(task.getException()));
        }
    }

    public static /* synthetic */ void lambda$signInWithCredential$5(GeneratedAndroidFirebaseAuth.Result result, Task task) {
        if (task.isSuccessful()) {
            result.success(PigeonParser.parseAuthResult((com.google.firebase.auth.i) task.getResult()));
        } else {
            result.error(FlutterFirebaseAuthPluginException.parserExceptionToFlutter(task.getException()));
        }
    }

    public static /* synthetic */ void lambda$signInWithCustomToken$6(GeneratedAndroidFirebaseAuth.Result result, Task task) {
        if (task.isSuccessful()) {
            result.success(PigeonParser.parseAuthResult((com.google.firebase.auth.i) task.getResult()));
        } else {
            result.error(FlutterFirebaseAuthPluginException.parserExceptionToFlutter(task.getException()));
        }
    }

    public static /* synthetic */ void lambda$signInWithEmailAndPassword$7(GeneratedAndroidFirebaseAuth.Result result, Task task) {
        if (task.isSuccessful()) {
            result.success(PigeonParser.parseAuthResult((com.google.firebase.auth.i) task.getResult()));
        } else {
            result.error(FlutterFirebaseAuthPluginException.parserExceptionToFlutter(task.getException()));
        }
    }

    public static /* synthetic */ void lambda$signInWithEmailLink$8(GeneratedAndroidFirebaseAuth.Result result, Task task) {
        if (task.isSuccessful()) {
            result.success(PigeonParser.parseAuthResult((com.google.firebase.auth.i) task.getResult()));
        } else {
            result.error(FlutterFirebaseAuthPluginException.parserExceptionToFlutter(task.getException()));
        }
    }

    public static /* synthetic */ void lambda$signInWithProvider$9(GeneratedAndroidFirebaseAuth.Result result, Task task) {
        if (task.isSuccessful()) {
            result.success(PigeonParser.parseAuthResult((com.google.firebase.auth.i) task.getResult()));
        } else {
            result.error(FlutterFirebaseAuthPluginException.parserExceptionToFlutter(task.getException()));
        }
    }

    public static /* synthetic */ void lambda$verifyPasswordResetCode$14(GeneratedAndroidFirebaseAuth.Result result, Task task) {
        if (task.isSuccessful()) {
            result.success((String) task.getResult());
        } else {
            result.error(FlutterFirebaseAuthPluginException.parserExceptionToFlutter(task.getException()));
        }
    }

    public static /* synthetic */ void lambda$verifyPhoneNumber$15(com.google.firebase.auth.o0 o0Var) {
        authCredentials.put(Integer.valueOf(o0Var.hashCode()), o0Var);
    }

    private void removeEventListeners() {
        for (EventChannel eventChannel : this.streamHandlers.keySet()) {
            EventChannel.StreamHandler streamHandler = this.streamHandlers.get(eventChannel);
            if (streamHandler != null) {
                streamHandler.onCancel(null);
            }
            eventChannel.setStreamHandler(null);
        }
        this.streamHandlers.clear();
    }

    @Override // io.flutter.plugins.firebase.auth.GeneratedAndroidFirebaseAuth.FirebaseAuthHostApi
    public void applyActionCode(GeneratedAndroidFirebaseAuth.AuthPigeonFirebaseApp authPigeonFirebaseApp, String str, GeneratedAndroidFirebaseAuth.Result<Void> result) {
        getAuthFromPigeon(authPigeonFirebaseApp).d(str).addOnCompleteListener(new OnCompleteListener() { // from class: io.flutter.plugins.firebase.auth.k
            public /* synthetic */ k() {
            }

            @Override // com.google.android.gms.tasks.OnCompleteListener
            public final void onComplete(Task task) {
                FlutterFirebaseAuthPlugin.lambda$applyActionCode$0(GeneratedAndroidFirebaseAuth.Result.this, task);
            }
        });
    }

    @Override // io.flutter.plugins.firebase.auth.GeneratedAndroidFirebaseAuth.FirebaseAuthHostApi
    public void checkActionCode(GeneratedAndroidFirebaseAuth.AuthPigeonFirebaseApp authPigeonFirebaseApp, String str, GeneratedAndroidFirebaseAuth.Result<GeneratedAndroidFirebaseAuth.PigeonActionCodeInfo> result) {
        getAuthFromPigeon(authPigeonFirebaseApp).e(str).addOnCompleteListener(new OnCompleteListener() { // from class: io.flutter.plugins.firebase.auth.d
            public /* synthetic */ d() {
            }

            @Override // com.google.android.gms.tasks.OnCompleteListener
            public final void onComplete(Task task) {
                FlutterFirebaseAuthPlugin.lambda$checkActionCode$1(GeneratedAndroidFirebaseAuth.Result.this, task);
            }
        });
    }

    @Override // io.flutter.plugins.firebase.auth.GeneratedAndroidFirebaseAuth.FirebaseAuthHostApi
    public void confirmPasswordReset(GeneratedAndroidFirebaseAuth.AuthPigeonFirebaseApp authPigeonFirebaseApp, String str, String str2, GeneratedAndroidFirebaseAuth.Result<Void> result) {
        getAuthFromPigeon(authPigeonFirebaseApp).f(str, str2).addOnCompleteListener(new OnCompleteListener() { // from class: io.flutter.plugins.firebase.auth.h
            public /* synthetic */ h() {
            }

            @Override // com.google.android.gms.tasks.OnCompleteListener
            public final void onComplete(Task task) {
                FlutterFirebaseAuthPlugin.lambda$confirmPasswordReset$2(GeneratedAndroidFirebaseAuth.Result.this, task);
            }
        });
    }

    @Override // io.flutter.plugins.firebase.auth.GeneratedAndroidFirebaseAuth.FirebaseAuthHostApi
    public void createUserWithEmailAndPassword(GeneratedAndroidFirebaseAuth.AuthPigeonFirebaseApp authPigeonFirebaseApp, String str, String str2, GeneratedAndroidFirebaseAuth.Result<GeneratedAndroidFirebaseAuth.PigeonUserCredential> result) {
        getAuthFromPigeon(authPigeonFirebaseApp).g(str, str2).addOnCompleteListener(new OnCompleteListener() { // from class: io.flutter.plugins.firebase.auth.l
            public /* synthetic */ l() {
            }

            @Override // com.google.android.gms.tasks.OnCompleteListener
            public final void onComplete(Task task) {
                FlutterFirebaseAuthPlugin.lambda$createUserWithEmailAndPassword$3(GeneratedAndroidFirebaseAuth.Result.this, task);
            }
        });
    }

    @Override // io.flutter.plugins.firebase.core.FlutterFirebasePlugin
    public Task<Void> didReinitializeFirebaseCore() {
        TaskCompletionSource taskCompletionSource = new TaskCompletionSource();
        FlutterFirebasePlugin.cachedThreadPool.execute(new Runnable() { // from class: io.flutter.plugins.firebase.auth.f

            /* renamed from: b */
            public final /* synthetic */ TaskCompletionSource f18024b;

            public /* synthetic */ f(TaskCompletionSource taskCompletionSource2) {
                r2 = taskCompletionSource2;
            }

            @Override // java.lang.Runnable
            public final void run() {
                FlutterFirebaseAuthPlugin.this.lambda$didReinitializeFirebaseCore$17(r2);
            }
        });
        return taskCompletionSource2.getTask();
    }

    @Override // io.flutter.plugins.firebase.auth.GeneratedAndroidFirebaseAuth.FirebaseAuthHostApi
    public void fetchSignInMethodsForEmail(GeneratedAndroidFirebaseAuth.AuthPigeonFirebaseApp authPigeonFirebaseApp, String str, GeneratedAndroidFirebaseAuth.Result<List<String>> result) {
        getAuthFromPigeon(authPigeonFirebaseApp).h(str).addOnCompleteListener(new OnCompleteListener() { // from class: io.flutter.plugins.firebase.auth.i
            public /* synthetic */ i() {
            }

            @Override // com.google.android.gms.tasks.OnCompleteListener
            public final void onComplete(Task task) {
                FlutterFirebaseAuthPlugin.lambda$fetchSignInMethodsForEmail$10(GeneratedAndroidFirebaseAuth.Result.this, task);
            }
        });
    }

    @Override // io.flutter.plugins.firebase.core.FlutterFirebasePlugin
    public Task<Map<String, Object>> getPluginConstantsForFirebaseApp(zb.g gVar) {
        TaskCompletionSource taskCompletionSource = new TaskCompletionSource();
        FlutterFirebasePlugin.cachedThreadPool.execute(new Runnable() { // from class: io.flutter.plugins.firebase.auth.n

            /* renamed from: b */
            public final /* synthetic */ TaskCompletionSource f18058b;

            public /* synthetic */ n(TaskCompletionSource taskCompletionSource2) {
                r2 = taskCompletionSource2;
            }

            @Override // java.lang.Runnable
            public final void run() {
                FlutterFirebaseAuthPlugin.lambda$getPluginConstantsForFirebaseApp$16(zb.g.this, r2);
            }
        });
        return taskCompletionSource2.getTask();
    }

    @Override // io.flutter.embedding.engine.plugins.activity.ActivityAware
    public void onAttachedToActivity(ActivityPluginBinding activityPluginBinding) {
        Activity activity = activityPluginBinding.getActivity();
        this.activity = activity;
        this.firebaseAuthUser.setActivity(activity);
    }

    @Override // io.flutter.embedding.engine.plugins.FlutterPlugin
    public void onAttachedToEngine(FlutterPlugin.FlutterPluginBinding flutterPluginBinding) {
        initInstance(flutterPluginBinding.getBinaryMessenger());
    }

    @Override // io.flutter.embedding.engine.plugins.activity.ActivityAware
    public void onDetachedFromActivity() {
        this.activity = null;
        this.firebaseAuthUser.setActivity(null);
    }

    @Override // io.flutter.embedding.engine.plugins.activity.ActivityAware
    public void onDetachedFromActivityForConfigChanges() {
        this.activity = null;
        this.firebaseAuthUser.setActivity(null);
    }

    @Override // io.flutter.embedding.engine.plugins.FlutterPlugin
    public void onDetachedFromEngine(FlutterPlugin.FlutterPluginBinding flutterPluginBinding) {
        this.channel.setMethodCallHandler(null);
        GeneratedAndroidFirebaseAuth.FirebaseAuthHostApi.setup(this.messenger, null);
        GeneratedAndroidFirebaseAuth.FirebaseAuthUserHostApi.setup(this.messenger, null);
        GeneratedAndroidFirebaseAuth.MultiFactorUserHostApi.setup(this.messenger, null);
        GeneratedAndroidFirebaseAuth.MultiFactoResolverHostApi.setup(this.messenger, null);
        GeneratedAndroidFirebaseAuth.MultiFactorTotpHostApi.setup(this.messenger, null);
        GeneratedAndroidFirebaseAuth.MultiFactorTotpSecretHostApi.setup(this.messenger, null);
        this.channel = null;
        this.messenger = null;
        removeEventListeners();
    }

    @Override // io.flutter.embedding.engine.plugins.activity.ActivityAware
    public void onReattachedToActivityForConfigChanges(ActivityPluginBinding activityPluginBinding) {
        Activity activity = activityPluginBinding.getActivity();
        this.activity = activity;
        this.firebaseAuthUser.setActivity(activity);
    }

    @Override // io.flutter.plugins.firebase.auth.GeneratedAndroidFirebaseAuth.FirebaseAuthHostApi
    public void registerAuthStateListener(GeneratedAndroidFirebaseAuth.AuthPigeonFirebaseApp authPigeonFirebaseApp, GeneratedAndroidFirebaseAuth.Result<String> result) {
        try {
            FirebaseAuth authFromPigeon = getAuthFromPigeon(authPigeonFirebaseApp);
            AuthStateChannelStreamHandler authStateChannelStreamHandler = new AuthStateChannelStreamHandler(authFromPigeon);
            String str = "plugins.flutter.io/firebase_auth/auth-state/" + authFromPigeon.i().q();
            EventChannel eventChannel = new EventChannel(this.messenger, str);
            eventChannel.setStreamHandler(authStateChannelStreamHandler);
            this.streamHandlers.put(eventChannel, authStateChannelStreamHandler);
            result.success(str);
        } catch (Exception e10) {
            result.error(e10);
        }
    }

    @Override // io.flutter.plugins.firebase.auth.GeneratedAndroidFirebaseAuth.FirebaseAuthHostApi
    public void registerIdTokenListener(GeneratedAndroidFirebaseAuth.AuthPigeonFirebaseApp authPigeonFirebaseApp, GeneratedAndroidFirebaseAuth.Result<String> result) {
        try {
            FirebaseAuth authFromPigeon = getAuthFromPigeon(authPigeonFirebaseApp);
            IdTokenChannelStreamHandler idTokenChannelStreamHandler = new IdTokenChannelStreamHandler(authFromPigeon);
            String str = "plugins.flutter.io/firebase_auth/id-token/" + authFromPigeon.i().q();
            EventChannel eventChannel = new EventChannel(this.messenger, str);
            eventChannel.setStreamHandler(idTokenChannelStreamHandler);
            this.streamHandlers.put(eventChannel, idTokenChannelStreamHandler);
            result.success(str);
        } catch (Exception e10) {
            result.error(e10);
        }
    }

    @Override // io.flutter.plugins.firebase.auth.GeneratedAndroidFirebaseAuth.FirebaseAuthHostApi
    public void revokeTokenWithAuthorizationCode(GeneratedAndroidFirebaseAuth.AuthPigeonFirebaseApp authPigeonFirebaseApp, String str, GeneratedAndroidFirebaseAuth.Result<Void> result) {
    }

    @Override // io.flutter.plugins.firebase.auth.GeneratedAndroidFirebaseAuth.FirebaseAuthHostApi
    public void sendPasswordResetEmail(GeneratedAndroidFirebaseAuth.AuthPigeonFirebaseApp authPigeonFirebaseApp, String str, GeneratedAndroidFirebaseAuth.PigeonActionCodeSettings pigeonActionCodeSettings, GeneratedAndroidFirebaseAuth.Result<Void> result) {
        Task<Void> s10;
        OnCompleteListener<Void> pVar;
        FirebaseAuth authFromPigeon = getAuthFromPigeon(authPigeonFirebaseApp);
        if (pigeonActionCodeSettings == null) {
            s10 = authFromPigeon.r(str);
            pVar = new OnCompleteListener() { // from class: io.flutter.plugins.firebase.auth.o
                public /* synthetic */ o() {
                }

                @Override // com.google.android.gms.tasks.OnCompleteListener
                public final void onComplete(Task task) {
                    FlutterFirebaseAuthPlugin.lambda$sendPasswordResetEmail$11(GeneratedAndroidFirebaseAuth.Result.this, task);
                }
            };
        } else {
            s10 = authFromPigeon.s(str, PigeonParser.getActionCodeSettings(pigeonActionCodeSettings));
            pVar = new OnCompleteListener() { // from class: io.flutter.plugins.firebase.auth.p
                public /* synthetic */ p() {
                }

                @Override // com.google.android.gms.tasks.OnCompleteListener
                public final void onComplete(Task task) {
                    FlutterFirebaseAuthPlugin.lambda$sendPasswordResetEmail$12(GeneratedAndroidFirebaseAuth.Result.this, task);
                }
            };
        }
        s10.addOnCompleteListener(pVar);
    }

    @Override // io.flutter.plugins.firebase.auth.GeneratedAndroidFirebaseAuth.FirebaseAuthHostApi
    public void sendSignInLinkToEmail(GeneratedAndroidFirebaseAuth.AuthPigeonFirebaseApp authPigeonFirebaseApp, String str, GeneratedAndroidFirebaseAuth.PigeonActionCodeSettings pigeonActionCodeSettings, GeneratedAndroidFirebaseAuth.Result<Void> result) {
        getAuthFromPigeon(authPigeonFirebaseApp).t(str, PigeonParser.getActionCodeSettings(pigeonActionCodeSettings)).addOnCompleteListener(new OnCompleteListener() { // from class: io.flutter.plugins.firebase.auth.e
            public /* synthetic */ e() {
            }

            @Override // com.google.android.gms.tasks.OnCompleteListener
            public final void onComplete(Task task) {
                FlutterFirebaseAuthPlugin.lambda$sendSignInLinkToEmail$13(GeneratedAndroidFirebaseAuth.Result.this, task);
            }
        });
    }

    @Override // io.flutter.plugins.firebase.auth.GeneratedAndroidFirebaseAuth.FirebaseAuthHostApi
    public void setLanguageCode(GeneratedAndroidFirebaseAuth.AuthPigeonFirebaseApp authPigeonFirebaseApp, String str, GeneratedAndroidFirebaseAuth.Result<String> result) {
        try {
            FirebaseAuth authFromPigeon = getAuthFromPigeon(authPigeonFirebaseApp);
            if (str == null) {
                authFromPigeon.E();
            } else {
                authFromPigeon.v(str);
            }
            result.success(authFromPigeon.m());
        } catch (Exception e10) {
            result.error(e10);
        }
    }

    @Override // io.flutter.plugins.firebase.auth.GeneratedAndroidFirebaseAuth.FirebaseAuthHostApi
    public void setSettings(GeneratedAndroidFirebaseAuth.AuthPigeonFirebaseApp authPigeonFirebaseApp, GeneratedAndroidFirebaseAuth.PigeonFirebaseAuthSettings pigeonFirebaseAuthSettings, GeneratedAndroidFirebaseAuth.Result<Void> result) {
        try {
            FirebaseAuth authFromPigeon = getAuthFromPigeon(authPigeonFirebaseApp);
            authFromPigeon.l().b(pigeonFirebaseAuthSettings.getAppVerificationDisabledForTesting().booleanValue());
            if (pigeonFirebaseAuthSettings.getForceRecaptchaFlow() != null) {
                authFromPigeon.l().a(pigeonFirebaseAuthSettings.getForceRecaptchaFlow().booleanValue());
            }
            if (pigeonFirebaseAuthSettings.getPhoneNumber() != null && pigeonFirebaseAuthSettings.getSmsCode() != null) {
                authFromPigeon.l().c(pigeonFirebaseAuthSettings.getPhoneNumber(), pigeonFirebaseAuthSettings.getSmsCode());
            }
            result.success(null);
        } catch (Exception e10) {
            result.error(e10);
        }
    }

    @Override // io.flutter.plugins.firebase.auth.GeneratedAndroidFirebaseAuth.FirebaseAuthHostApi
    public void signInAnonymously(GeneratedAndroidFirebaseAuth.AuthPigeonFirebaseApp authPigeonFirebaseApp, GeneratedAndroidFirebaseAuth.Result<GeneratedAndroidFirebaseAuth.PigeonUserCredential> result) {
        getAuthFromPigeon(authPigeonFirebaseApp).x().addOnCompleteListener(new OnCompleteListener() { // from class: io.flutter.plugins.firebase.auth.g
            public /* synthetic */ g() {
            }

            @Override // com.google.android.gms.tasks.OnCompleteListener
            public final void onComplete(Task task) {
                FlutterFirebaseAuthPlugin.lambda$signInAnonymously$4(GeneratedAndroidFirebaseAuth.Result.this, task);
            }
        });
    }

    @Override // io.flutter.plugins.firebase.auth.GeneratedAndroidFirebaseAuth.FirebaseAuthHostApi
    public void signInWithCredential(GeneratedAndroidFirebaseAuth.AuthPigeonFirebaseApp authPigeonFirebaseApp, Map<String, Object> map, GeneratedAndroidFirebaseAuth.Result<GeneratedAndroidFirebaseAuth.PigeonUserCredential> result) {
        FirebaseAuth authFromPigeon = getAuthFromPigeon(authPigeonFirebaseApp);
        com.google.firebase.auth.h credential = PigeonParser.getCredential(map);
        if (credential == null) {
            throw FlutterFirebaseAuthPluginException.invalidCredential();
        }
        authFromPigeon.y(credential).addOnCompleteListener(new OnCompleteListener() { // from class: io.flutter.plugins.firebase.auth.s
            public /* synthetic */ s() {
            }

            @Override // com.google.android.gms.tasks.OnCompleteListener
            public final void onComplete(Task task) {
                FlutterFirebaseAuthPlugin.lambda$signInWithCredential$5(GeneratedAndroidFirebaseAuth.Result.this, task);
            }
        });
    }

    @Override // io.flutter.plugins.firebase.auth.GeneratedAndroidFirebaseAuth.FirebaseAuthHostApi
    public void signInWithCustomToken(GeneratedAndroidFirebaseAuth.AuthPigeonFirebaseApp authPigeonFirebaseApp, String str, GeneratedAndroidFirebaseAuth.Result<GeneratedAndroidFirebaseAuth.PigeonUserCredential> result) {
        getAuthFromPigeon(authPigeonFirebaseApp).z(str).addOnCompleteListener(new OnCompleteListener() { // from class: io.flutter.plugins.firebase.auth.j
            public /* synthetic */ j() {
            }

            @Override // com.google.android.gms.tasks.OnCompleteListener
            public final void onComplete(Task task) {
                FlutterFirebaseAuthPlugin.lambda$signInWithCustomToken$6(GeneratedAndroidFirebaseAuth.Result.this, task);
            }
        });
    }

    @Override // io.flutter.plugins.firebase.auth.GeneratedAndroidFirebaseAuth.FirebaseAuthHostApi
    public void signInWithEmailAndPassword(GeneratedAndroidFirebaseAuth.AuthPigeonFirebaseApp authPigeonFirebaseApp, String str, String str2, GeneratedAndroidFirebaseAuth.Result<GeneratedAndroidFirebaseAuth.PigeonUserCredential> result) {
        getAuthFromPigeon(authPigeonFirebaseApp).A(str, str2).addOnCompleteListener(new OnCompleteListener() { // from class: io.flutter.plugins.firebase.auth.q
            public /* synthetic */ q() {
            }

            @Override // com.google.android.gms.tasks.OnCompleteListener
            public final void onComplete(Task task) {
                FlutterFirebaseAuthPlugin.lambda$signInWithEmailAndPassword$7(GeneratedAndroidFirebaseAuth.Result.this, task);
            }
        });
    }

    @Override // io.flutter.plugins.firebase.auth.GeneratedAndroidFirebaseAuth.FirebaseAuthHostApi
    public void signInWithEmailLink(GeneratedAndroidFirebaseAuth.AuthPigeonFirebaseApp authPigeonFirebaseApp, String str, String str2, GeneratedAndroidFirebaseAuth.Result<GeneratedAndroidFirebaseAuth.PigeonUserCredential> result) {
        getAuthFromPigeon(authPigeonFirebaseApp).B(str, str2).addOnCompleteListener(new OnCompleteListener() { // from class: io.flutter.plugins.firebase.auth.c
            public /* synthetic */ c() {
            }

            @Override // com.google.android.gms.tasks.OnCompleteListener
            public final void onComplete(Task task) {
                FlutterFirebaseAuthPlugin.lambda$signInWithEmailLink$8(GeneratedAndroidFirebaseAuth.Result.this, task);
            }
        });
    }

    @Override // io.flutter.plugins.firebase.auth.GeneratedAndroidFirebaseAuth.FirebaseAuthHostApi
    public void signInWithProvider(GeneratedAndroidFirebaseAuth.AuthPigeonFirebaseApp authPigeonFirebaseApp, GeneratedAndroidFirebaseAuth.PigeonSignInProvider pigeonSignInProvider, GeneratedAndroidFirebaseAuth.Result<GeneratedAndroidFirebaseAuth.PigeonUserCredential> result) {
        FirebaseAuth authFromPigeon = getAuthFromPigeon(authPigeonFirebaseApp);
        n0.a d10 = com.google.firebase.auth.n0.d(pigeonSignInProvider.getProviderId());
        if (pigeonSignInProvider.getScopes() != null) {
            d10.c(pigeonSignInProvider.getScopes());
        }
        if (pigeonSignInProvider.getCustomParameters() != null) {
            d10.a(pigeonSignInProvider.getCustomParameters());
        }
        authFromPigeon.D(getActivity(), d10.b()).addOnCompleteListener(new OnCompleteListener() { // from class: io.flutter.plugins.firebase.auth.m
            public /* synthetic */ m() {
            }

            @Override // com.google.android.gms.tasks.OnCompleteListener
            public final void onComplete(Task task) {
                FlutterFirebaseAuthPlugin.lambda$signInWithProvider$9(GeneratedAndroidFirebaseAuth.Result.this, task);
            }
        });
    }

    @Override // io.flutter.plugins.firebase.auth.GeneratedAndroidFirebaseAuth.FirebaseAuthHostApi
    public void signOut(GeneratedAndroidFirebaseAuth.AuthPigeonFirebaseApp authPigeonFirebaseApp, GeneratedAndroidFirebaseAuth.Result<Void> result) {
        try {
            getAuthFromPigeon(authPigeonFirebaseApp).C();
            result.success(null);
        } catch (Exception e10) {
            result.error(e10);
        }
    }

    @Override // io.flutter.plugins.firebase.auth.GeneratedAndroidFirebaseAuth.FirebaseAuthHostApi
    public void useEmulator(GeneratedAndroidFirebaseAuth.AuthPigeonFirebaseApp authPigeonFirebaseApp, String str, Long l10, GeneratedAndroidFirebaseAuth.Result<Void> result) {
        try {
            getAuthFromPigeon(authPigeonFirebaseApp).F(str, l10.intValue());
            result.success(null);
        } catch (Exception e10) {
            result.error(e10);
        }
    }

    @Override // io.flutter.plugins.firebase.auth.GeneratedAndroidFirebaseAuth.FirebaseAuthHostApi
    public void verifyPasswordResetCode(GeneratedAndroidFirebaseAuth.AuthPigeonFirebaseApp authPigeonFirebaseApp, String str, GeneratedAndroidFirebaseAuth.Result<String> result) {
        getAuthFromPigeon(authPigeonFirebaseApp).G(str).addOnCompleteListener(new OnCompleteListener() { // from class: io.flutter.plugins.firebase.auth.t
            public /* synthetic */ t() {
            }

            @Override // com.google.android.gms.tasks.OnCompleteListener
            public final void onComplete(Task task) {
                FlutterFirebaseAuthPlugin.lambda$verifyPasswordResetCode$14(GeneratedAndroidFirebaseAuth.Result.this, task);
            }
        });
    }

    @Override // io.flutter.plugins.firebase.auth.GeneratedAndroidFirebaseAuth.FirebaseAuthHostApi
    public void verifyPhoneNumber(GeneratedAndroidFirebaseAuth.AuthPigeonFirebaseApp authPigeonFirebaseApp, GeneratedAndroidFirebaseAuth.PigeonVerifyPhoneNumberRequest pigeonVerifyPhoneNumberRequest, GeneratedAndroidFirebaseAuth.Result<String> result) {
        try {
            String str = "plugins.flutter.io/firebase_auth/phone/" + UUID.randomUUID().toString();
            EventChannel eventChannel = new EventChannel(this.messenger, str);
            com.google.firebase.auth.t0 t0Var = null;
            com.google.firebase.auth.l0 l0Var = pigeonVerifyPhoneNumberRequest.getMultiFactorSessionId() != null ? FlutterFirebaseMultiFactor.multiFactorSessionMap.get(pigeonVerifyPhoneNumberRequest.getMultiFactorSessionId()) : null;
            String multiFactorInfoId = pigeonVerifyPhoneNumberRequest.getMultiFactorInfoId();
            if (multiFactorInfoId != null) {
                Iterator<String> it = FlutterFirebaseMultiFactor.multiFactorResolverMap.keySet().iterator();
                while (it.hasNext()) {
                    Iterator<com.google.firebase.auth.j0> it2 = FlutterFirebaseMultiFactor.multiFactorResolverMap.get(it.next()).v1().iterator();
                    while (true) {
                        if (it2.hasNext()) {
                            com.google.firebase.auth.j0 next = it2.next();
                            if (next.l().equals(multiFactorInfoId) && (next instanceof com.google.firebase.auth.t0)) {
                                t0Var = (com.google.firebase.auth.t0) next;
                                break;
                            }
                        }
                    }
                }
            }
            PhoneNumberVerificationStreamHandler phoneNumberVerificationStreamHandler = new PhoneNumberVerificationStreamHandler(getActivity(), authPigeonFirebaseApp, pigeonVerifyPhoneNumberRequest, l0Var, t0Var, new PhoneNumberVerificationStreamHandler.OnCredentialsListener() { // from class: io.flutter.plugins.firebase.auth.b
                @Override // io.flutter.plugins.firebase.auth.PhoneNumberVerificationStreamHandler.OnCredentialsListener
                public final void onCredentialsReceived(com.google.firebase.auth.o0 o0Var) {
                    FlutterFirebaseAuthPlugin.lambda$verifyPhoneNumber$15(o0Var);
                }
            });
            eventChannel.setStreamHandler(phoneNumberVerificationStreamHandler);
            this.streamHandlers.put(eventChannel, phoneNumberVerificationStreamHandler);
            result.success(str);
        } catch (Exception e10) {
            result.error(e10);
        }
    }
}

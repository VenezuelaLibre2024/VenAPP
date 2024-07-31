package io.flutter.plugins.firebase.auth;

import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import io.flutter.plugins.firebase.auth.GeneratedAndroidFirebaseAuth;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.UUID;

/* loaded from: classes3.dex */
public class FlutterFirebaseMultiFactor implements GeneratedAndroidFirebaseAuth.MultiFactorUserHostApi, GeneratedAndroidFirebaseAuth.MultiFactoResolverHostApi {
    static final /* synthetic */ boolean $assertionsDisabled = false;
    static final Map<String, Map<String, com.google.firebase.auth.h0>> multiFactorUserMap = new HashMap();
    static final Map<String, com.google.firebase.auth.l0> multiFactorSessionMap = new HashMap();
    static final Map<String, com.google.firebase.auth.k0> multiFactorResolverMap = new HashMap();
    static final Map<String, com.google.firebase.auth.i0> multiFactorAssertionMap = new HashMap();

    public static /* synthetic */ void lambda$enrollPhone$0(GeneratedAndroidFirebaseAuth.Result result, Task task) {
        if (task.isSuccessful()) {
            result.success(null);
        } else {
            result.error(FlutterFirebaseAuthPluginException.parserExceptionToFlutter(task.getException()));
        }
    }

    public static /* synthetic */ void lambda$enrollTotp$1(GeneratedAndroidFirebaseAuth.Result result, Task task) {
        if (task.isSuccessful()) {
            result.success(null);
        } else {
            result.error(FlutterFirebaseAuthPluginException.parserExceptionToFlutter(task.getException()));
        }
    }

    public static /* synthetic */ void lambda$getSession$2(GeneratedAndroidFirebaseAuth.Result result, Task task) {
        if (!task.isSuccessful()) {
            result.error(FlutterFirebaseAuthPluginException.parserExceptionToFlutter(task.getException()));
            return;
        }
        com.google.firebase.auth.l0 l0Var = (com.google.firebase.auth.l0) task.getResult();
        String uuid = UUID.randomUUID().toString();
        multiFactorSessionMap.put(uuid, l0Var);
        result.success(new GeneratedAndroidFirebaseAuth.PigeonMultiFactorSession.Builder().setId(uuid).build());
    }

    public static /* synthetic */ void lambda$resolveSignIn$4(GeneratedAndroidFirebaseAuth.Result result, Task task) {
        if (task.isSuccessful()) {
            result.success(PigeonParser.parseAuthResult((com.google.firebase.auth.i) task.getResult()));
        } else {
            result.error(FlutterFirebaseAuthPluginException.parserExceptionToFlutter(task.getException()));
        }
    }

    public static /* synthetic */ void lambda$unenroll$3(GeneratedAndroidFirebaseAuth.Result result, Task task) {
        if (task.isSuccessful()) {
            result.success(null);
        } else {
            result.error(FlutterFirebaseAuthPluginException.parserExceptionToFlutter(task.getException()));
        }
    }

    @Override // io.flutter.plugins.firebase.auth.GeneratedAndroidFirebaseAuth.MultiFactorUserHostApi
    public void enrollPhone(GeneratedAndroidFirebaseAuth.AuthPigeonFirebaseApp authPigeonFirebaseApp, GeneratedAndroidFirebaseAuth.PigeonPhoneMultiFactorAssertion pigeonPhoneMultiFactorAssertion, String str, GeneratedAndroidFirebaseAuth.Result<Void> result) {
        try {
            getAppMultiFactor(authPigeonFirebaseApp).a(com.google.firebase.auth.s0.a(com.google.firebase.auth.q0.a(pigeonPhoneMultiFactorAssertion.getVerificationId(), pigeonPhoneMultiFactorAssertion.getVerificationCode())), str).addOnCompleteListener(new OnCompleteListener() { // from class: io.flutter.plugins.firebase.auth.p0
                public /* synthetic */ p0() {
                }

                @Override // com.google.android.gms.tasks.OnCompleteListener
                public final void onComplete(Task task) {
                    FlutterFirebaseMultiFactor.lambda$enrollPhone$0(GeneratedAndroidFirebaseAuth.Result.this, task);
                }
            });
        } catch (le.a e10) {
            result.error(e10);
        }
    }

    @Override // io.flutter.plugins.firebase.auth.GeneratedAndroidFirebaseAuth.MultiFactorUserHostApi
    public void enrollTotp(GeneratedAndroidFirebaseAuth.AuthPigeonFirebaseApp authPigeonFirebaseApp, String str, String str2, GeneratedAndroidFirebaseAuth.Result<Void> result) {
        try {
            getAppMultiFactor(authPigeonFirebaseApp).a(multiFactorAssertionMap.get(str), str2).addOnCompleteListener(new OnCompleteListener() { // from class: io.flutter.plugins.firebase.auth.o0
                public /* synthetic */ o0() {
                }

                @Override // com.google.android.gms.tasks.OnCompleteListener
                public final void onComplete(Task task) {
                    FlutterFirebaseMultiFactor.lambda$enrollTotp$1(GeneratedAndroidFirebaseAuth.Result.this, task);
                }
            });
        } catch (le.a e10) {
            result.error(e10);
        }
    }

    com.google.firebase.auth.h0 getAppMultiFactor(GeneratedAndroidFirebaseAuth.AuthPigeonFirebaseApp authPigeonFirebaseApp) {
        com.google.firebase.auth.a0 currentUserFromPigeon = FlutterFirebaseAuthUser.getCurrentUserFromPigeon(authPigeonFirebaseApp);
        if (currentUserFromPigeon == null) {
            throw new le.a("No user is signed in");
        }
        Map<String, Map<String, com.google.firebase.auth.h0>> map = multiFactorUserMap;
        if (map.get(authPigeonFirebaseApp.getAppName()) == null) {
            map.put(authPigeonFirebaseApp.getAppName(), new HashMap());
        }
        Map<String, com.google.firebase.auth.h0> map2 = map.get(authPigeonFirebaseApp.getAppName());
        if (map2.get(currentUserFromPigeon.l()) == null) {
            map2.put(currentUserFromPigeon.l(), currentUserFromPigeon.x1());
        }
        return map2.get(currentUserFromPigeon.l());
    }

    @Override // io.flutter.plugins.firebase.auth.GeneratedAndroidFirebaseAuth.MultiFactorUserHostApi
    public void getEnrolledFactors(GeneratedAndroidFirebaseAuth.AuthPigeonFirebaseApp authPigeonFirebaseApp, GeneratedAndroidFirebaseAuth.Result<List<GeneratedAndroidFirebaseAuth.PigeonMultiFactorInfo>> result) {
        try {
            result.success(PigeonParser.multiFactorInfoToPigeon(getAppMultiFactor(authPigeonFirebaseApp).b()));
        } catch (le.a e10) {
            result.error(e10);
        }
    }

    @Override // io.flutter.plugins.firebase.auth.GeneratedAndroidFirebaseAuth.MultiFactorUserHostApi
    public void getSession(GeneratedAndroidFirebaseAuth.AuthPigeonFirebaseApp authPigeonFirebaseApp, GeneratedAndroidFirebaseAuth.Result<GeneratedAndroidFirebaseAuth.PigeonMultiFactorSession> result) {
        try {
            getAppMultiFactor(authPigeonFirebaseApp).c().addOnCompleteListener(new OnCompleteListener() { // from class: io.flutter.plugins.firebase.auth.r0
                public /* synthetic */ r0() {
                }

                @Override // com.google.android.gms.tasks.OnCompleteListener
                public final void onComplete(Task task) {
                    FlutterFirebaseMultiFactor.lambda$getSession$2(GeneratedAndroidFirebaseAuth.Result.this, task);
                }
            });
        } catch (le.a e10) {
            result.error(e10);
        }
    }

    @Override // io.flutter.plugins.firebase.auth.GeneratedAndroidFirebaseAuth.MultiFactoResolverHostApi
    public void resolveSignIn(String str, GeneratedAndroidFirebaseAuth.PigeonPhoneMultiFactorAssertion pigeonPhoneMultiFactorAssertion, String str2, GeneratedAndroidFirebaseAuth.Result<GeneratedAndroidFirebaseAuth.PigeonUserCredential> result) {
        com.google.firebase.auth.k0 k0Var = multiFactorResolverMap.get(str);
        if (k0Var == null) {
            result.error(FlutterFirebaseAuthPluginException.parserExceptionToFlutter(new Exception("Resolver not found")));
        } else {
            k0Var.x1(pigeonPhoneMultiFactorAssertion != null ? com.google.firebase.auth.s0.a(com.google.firebase.auth.q0.a(pigeonPhoneMultiFactorAssertion.getVerificationId(), pigeonPhoneMultiFactorAssertion.getVerificationCode())) : multiFactorAssertionMap.get(str2)).addOnCompleteListener(new OnCompleteListener() { // from class: io.flutter.plugins.firebase.auth.s0
                public /* synthetic */ s0() {
                }

                @Override // com.google.android.gms.tasks.OnCompleteListener
                public final void onComplete(Task task) {
                    FlutterFirebaseMultiFactor.lambda$resolveSignIn$4(GeneratedAndroidFirebaseAuth.Result.this, task);
                }
            });
        }
    }

    @Override // io.flutter.plugins.firebase.auth.GeneratedAndroidFirebaseAuth.MultiFactorUserHostApi
    public void unenroll(GeneratedAndroidFirebaseAuth.AuthPigeonFirebaseApp authPigeonFirebaseApp, String str, GeneratedAndroidFirebaseAuth.Result<Void> result) {
        try {
            getAppMultiFactor(authPigeonFirebaseApp).d(str).addOnCompleteListener(new OnCompleteListener() { // from class: io.flutter.plugins.firebase.auth.q0
                public /* synthetic */ q0() {
                }

                @Override // com.google.android.gms.tasks.OnCompleteListener
                public final void onComplete(Task task) {
                    FlutterFirebaseMultiFactor.lambda$unenroll$3(GeneratedAndroidFirebaseAuth.Result.this, task);
                }
            });
        } catch (le.a e10) {
            result.error(FlutterFirebaseAuthPluginException.parserExceptionToFlutter(e10));
        }
    }
}

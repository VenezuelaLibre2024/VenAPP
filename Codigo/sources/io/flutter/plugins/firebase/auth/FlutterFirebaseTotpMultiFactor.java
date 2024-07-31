package io.flutter.plugins.firebase.auth;

import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import io.flutter.plugins.firebase.auth.GeneratedAndroidFirebaseAuth;
import java.util.HashMap;
import java.util.Map;
import java.util.UUID;

/* loaded from: classes3.dex */
public class FlutterFirebaseTotpMultiFactor implements GeneratedAndroidFirebaseAuth.MultiFactorTotpHostApi {
    static final /* synthetic */ boolean $assertionsDisabled = false;
    static final Map<String, com.google.firebase.auth.z0> multiFactorSecret = new HashMap();

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void lambda$generateSecret$0(GeneratedAndroidFirebaseAuth.Result result, Task task) {
        if (!task.isSuccessful()) {
            result.error(FlutterFirebaseAuthPluginException.parserExceptionToFlutter(task.getException()));
            return;
        }
        com.google.firebase.auth.z0 z0Var = (com.google.firebase.auth.z0) task.getResult();
        multiFactorSecret.put(z0Var.d(), z0Var);
        result.success(new GeneratedAndroidFirebaseAuth.PigeonTotpSecret.Builder().setCodeIntervalSeconds(Long.valueOf(z0Var.h())).setCodeLength(Long.valueOf(z0Var.b())).setSecretKey(z0Var.d()).setHashingAlgorithm(z0Var.a()).setEnrollmentCompletionDeadline(Long.valueOf(z0Var.g())).build());
    }

    @Override // io.flutter.plugins.firebase.auth.GeneratedAndroidFirebaseAuth.MultiFactorTotpHostApi
    public void generateSecret(String str, final GeneratedAndroidFirebaseAuth.Result<GeneratedAndroidFirebaseAuth.PigeonTotpSecret> result) {
        com.google.firebase.auth.x0.a(FlutterFirebaseMultiFactor.multiFactorSessionMap.get(str)).addOnCompleteListener(new OnCompleteListener() { // from class: io.flutter.plugins.firebase.auth.t0
            @Override // com.google.android.gms.tasks.OnCompleteListener
            public final void onComplete(Task task) {
                FlutterFirebaseTotpMultiFactor.lambda$generateSecret$0(GeneratedAndroidFirebaseAuth.Result.this, task);
            }
        });
    }

    @Override // io.flutter.plugins.firebase.auth.GeneratedAndroidFirebaseAuth.MultiFactorTotpHostApi
    public void getAssertionForEnrollment(String str, String str2, GeneratedAndroidFirebaseAuth.Result<String> result) {
        com.google.firebase.auth.w0 b10 = com.google.firebase.auth.x0.b(multiFactorSecret.get(str), str2);
        String uuid = UUID.randomUUID().toString();
        FlutterFirebaseMultiFactor.multiFactorAssertionMap.put(uuid, b10);
        result.success(uuid);
    }

    @Override // io.flutter.plugins.firebase.auth.GeneratedAndroidFirebaseAuth.MultiFactorTotpHostApi
    public void getAssertionForSignIn(String str, String str2, GeneratedAndroidFirebaseAuth.Result<String> result) {
        com.google.firebase.auth.w0 c10 = com.google.firebase.auth.x0.c(str, str2);
        String uuid = UUID.randomUUID().toString();
        FlutterFirebaseMultiFactor.multiFactorAssertionMap.put(uuid, c10);
        result.success(uuid);
    }
}

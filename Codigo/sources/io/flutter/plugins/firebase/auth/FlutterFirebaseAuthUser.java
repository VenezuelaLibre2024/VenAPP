package io.flutter.plugins.firebase.auth;

import android.app.Activity;
import android.net.Uri;
import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.Tasks;
import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.auth.d1;
import com.google.firebase.auth.n0;
import io.flutter.plugins.firebase.auth.GeneratedAndroidFirebaseAuth;
import io.flutter.plugins.firebase.core.FlutterFirebasePlugin;
import java.util.Map;

/* loaded from: classes3.dex */
public class FlutterFirebaseAuthUser implements GeneratedAndroidFirebaseAuth.FirebaseAuthUserHostApi {
    private Activity activity;

    public static com.google.firebase.auth.a0 getCurrentUserFromPigeon(GeneratedAndroidFirebaseAuth.AuthPigeonFirebaseApp authPigeonFirebaseApp) {
        FirebaseAuth firebaseAuth = FirebaseAuth.getInstance(zb.g.p(authPigeonFirebaseApp.getAppName()));
        if (authPigeonFirebaseApp.getTenantId() != null) {
            firebaseAuth.w(authPigeonFirebaseApp.getTenantId());
        }
        return firebaseAuth.j();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void lambda$delete$0(GeneratedAndroidFirebaseAuth.Result result, Task task) {
        if (task.isSuccessful()) {
            result.success(null);
        } else {
            result.error(FlutterFirebaseAuthPluginException.parserExceptionToFlutter(task.getException()));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void lambda$getIdToken$1(GeneratedAndroidFirebaseAuth.AuthPigeonFirebaseApp authPigeonFirebaseApp, GeneratedAndroidFirebaseAuth.Result result, Boolean bool) {
        com.google.firebase.auth.a0 currentUserFromPigeon = getCurrentUserFromPigeon(authPigeonFirebaseApp);
        if (currentUserFromPigeon == null) {
            result.error(FlutterFirebaseAuthPluginException.noUser());
            return;
        }
        try {
            result.success(PigeonParser.parseTokenResult((com.google.firebase.auth.c0) Tasks.await(currentUserFromPigeon.v1(bool.booleanValue()))));
        } catch (Exception e10) {
            result.error(FlutterFirebaseAuthPluginException.parserExceptionToFlutter(e10));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void lambda$linkWithCredential$2(GeneratedAndroidFirebaseAuth.Result result, Task task) {
        if (task.isSuccessful()) {
            result.success(PigeonParser.parseAuthResult((com.google.firebase.auth.i) task.getResult()));
        } else {
            result.error(FlutterFirebaseAuthPluginException.parserExceptionToFlutter(task.getException()));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void lambda$linkWithProvider$3(GeneratedAndroidFirebaseAuth.Result result, Task task) {
        if (task.isSuccessful()) {
            result.success(PigeonParser.parseAuthResult((com.google.firebase.auth.i) task.getResult()));
        } else {
            result.error(FlutterFirebaseAuthPluginException.parserExceptionToFlutter(task.getException()));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void lambda$reauthenticateWithCredential$4(GeneratedAndroidFirebaseAuth.Result result, Task task) {
        if (task.isSuccessful()) {
            result.success(PigeonParser.parseAuthResult((com.google.firebase.auth.i) task.getResult()));
        } else {
            result.error(FlutterFirebaseAuthPluginException.parserExceptionToFlutter(task.getException()));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void lambda$reauthenticateWithProvider$5(GeneratedAndroidFirebaseAuth.Result result, Task task) {
        if (task.isSuccessful()) {
            result.success(PigeonParser.parseAuthResult((com.google.firebase.auth.i) task.getResult()));
        } else {
            result.error(FlutterFirebaseAuthPluginException.parserExceptionToFlutter(task.getException()));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void lambda$reload$6(GeneratedAndroidFirebaseAuth.Result result, com.google.firebase.auth.a0 a0Var, Task task) {
        if (task.isSuccessful()) {
            result.success(PigeonParser.parseFirebaseUser(a0Var));
        } else {
            result.error(FlutterFirebaseAuthPluginException.parserExceptionToFlutter(task.getException()));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void lambda$sendEmailVerification$7(GeneratedAndroidFirebaseAuth.Result result, Task task) {
        if (task.isSuccessful()) {
            result.success(null);
        } else {
            result.error(FlutterFirebaseAuthPluginException.parserExceptionToFlutter(task.getException()));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void lambda$sendEmailVerification$8(GeneratedAndroidFirebaseAuth.Result result, Task task) {
        if (task.isSuccessful()) {
            result.success(null);
        } else {
            result.error(FlutterFirebaseAuthPluginException.parserExceptionToFlutter(task.getException()));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void lambda$unlink$9(GeneratedAndroidFirebaseAuth.Result result, Task task) {
        if (task.isSuccessful()) {
            result.success(PigeonParser.parseAuthResult((com.google.firebase.auth.i) task.getResult()));
        } else {
            Exception exception = task.getException();
            result.error(exception.getMessage().contains("User was not linked to an account with the given provider.") ? FlutterFirebaseAuthPluginException.noSuchProvider() : FlutterFirebaseAuthPluginException.parserExceptionToFlutter(exception));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void lambda$updateEmail$10(GeneratedAndroidFirebaseAuth.Result result, com.google.firebase.auth.a0 a0Var, Task task) {
        if (task.isSuccessful()) {
            result.success(PigeonParser.parseFirebaseUser(a0Var));
        } else {
            result.error(FlutterFirebaseAuthPluginException.parserExceptionToFlutter(task.getException()));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void lambda$updateEmail$11(final com.google.firebase.auth.a0 a0Var, final GeneratedAndroidFirebaseAuth.Result result, Task task) {
        if (task.isSuccessful()) {
            a0Var.D1().addOnCompleteListener(new OnCompleteListener() { // from class: io.flutter.plugins.firebase.auth.i0
                @Override // com.google.android.gms.tasks.OnCompleteListener
                public final void onComplete(Task task2) {
                    FlutterFirebaseAuthUser.lambda$updateEmail$10(GeneratedAndroidFirebaseAuth.Result.this, a0Var, task2);
                }
            });
        } else {
            result.error(FlutterFirebaseAuthPluginException.parserExceptionToFlutter(task.getException()));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void lambda$updatePassword$12(GeneratedAndroidFirebaseAuth.Result result, com.google.firebase.auth.a0 a0Var, Task task) {
        if (task.isSuccessful()) {
            result.success(PigeonParser.parseFirebaseUser(a0Var));
        } else {
            result.error(FlutterFirebaseAuthPluginException.parserExceptionToFlutter(task.getException()));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void lambda$updatePassword$13(final com.google.firebase.auth.a0 a0Var, final GeneratedAndroidFirebaseAuth.Result result, Task task) {
        if (task.isSuccessful()) {
            a0Var.D1().addOnCompleteListener(new OnCompleteListener() { // from class: io.flutter.plugins.firebase.auth.n0
                @Override // com.google.android.gms.tasks.OnCompleteListener
                public final void onComplete(Task task2) {
                    FlutterFirebaseAuthUser.lambda$updatePassword$12(GeneratedAndroidFirebaseAuth.Result.this, a0Var, task2);
                }
            });
        } else {
            result.error(FlutterFirebaseAuthPluginException.parserExceptionToFlutter(task.getException()));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void lambda$updatePhoneNumber$14(GeneratedAndroidFirebaseAuth.Result result, com.google.firebase.auth.a0 a0Var, Task task) {
        if (task.isSuccessful()) {
            result.success(PigeonParser.parseFirebaseUser(a0Var));
        } else {
            result.error(FlutterFirebaseAuthPluginException.parserExceptionToFlutter(task.getException()));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void lambda$updatePhoneNumber$15(final com.google.firebase.auth.a0 a0Var, final GeneratedAndroidFirebaseAuth.Result result, Task task) {
        if (task.isSuccessful()) {
            a0Var.D1().addOnCompleteListener(new OnCompleteListener() { // from class: io.flutter.plugins.firebase.auth.y
                @Override // com.google.android.gms.tasks.OnCompleteListener
                public final void onComplete(Task task2) {
                    FlutterFirebaseAuthUser.lambda$updatePhoneNumber$14(GeneratedAndroidFirebaseAuth.Result.this, a0Var, task2);
                }
            });
        } else {
            result.error(FlutterFirebaseAuthPluginException.parserExceptionToFlutter(task.getException()));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void lambda$updateProfile$16(GeneratedAndroidFirebaseAuth.Result result, com.google.firebase.auth.a0 a0Var, Task task) {
        if (task.isSuccessful()) {
            result.success(PigeonParser.parseFirebaseUser(a0Var));
        } else {
            result.error(FlutterFirebaseAuthPluginException.parserExceptionToFlutter(task.getException()));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void lambda$updateProfile$17(final com.google.firebase.auth.a0 a0Var, final GeneratedAndroidFirebaseAuth.Result result, Task task) {
        if (task.isSuccessful()) {
            a0Var.D1().addOnCompleteListener(new OnCompleteListener() { // from class: io.flutter.plugins.firebase.auth.e0
                @Override // com.google.android.gms.tasks.OnCompleteListener
                public final void onComplete(Task task2) {
                    FlutterFirebaseAuthUser.lambda$updateProfile$16(GeneratedAndroidFirebaseAuth.Result.this, a0Var, task2);
                }
            });
        } else {
            result.error(FlutterFirebaseAuthPluginException.parserExceptionToFlutter(task.getException()));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void lambda$verifyBeforeUpdateEmail$18(GeneratedAndroidFirebaseAuth.Result result, Task task) {
        if (task.isSuccessful()) {
            result.success(null);
        } else {
            result.error(FlutterFirebaseAuthPluginException.parserExceptionToFlutter(task.getException()));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void lambda$verifyBeforeUpdateEmail$19(GeneratedAndroidFirebaseAuth.Result result, Task task) {
        if (task.isSuccessful()) {
            result.success(null);
        } else {
            result.error(FlutterFirebaseAuthPluginException.parserExceptionToFlutter(task.getException()));
        }
    }

    @Override // io.flutter.plugins.firebase.auth.GeneratedAndroidFirebaseAuth.FirebaseAuthUserHostApi
    public void delete(GeneratedAndroidFirebaseAuth.AuthPigeonFirebaseApp authPigeonFirebaseApp, final GeneratedAndroidFirebaseAuth.Result<Void> result) {
        com.google.firebase.auth.a0 currentUserFromPigeon = getCurrentUserFromPigeon(authPigeonFirebaseApp);
        if (currentUserFromPigeon == null) {
            result.error(FlutterFirebaseAuthPluginException.noUser());
        } else {
            currentUserFromPigeon.u1().addOnCompleteListener(new OnCompleteListener() { // from class: io.flutter.plugins.firebase.auth.f0
                @Override // com.google.android.gms.tasks.OnCompleteListener
                public final void onComplete(Task task) {
                    FlutterFirebaseAuthUser.lambda$delete$0(GeneratedAndroidFirebaseAuth.Result.this, task);
                }
            });
        }
    }

    @Override // io.flutter.plugins.firebase.auth.GeneratedAndroidFirebaseAuth.FirebaseAuthUserHostApi
    public void getIdToken(final GeneratedAndroidFirebaseAuth.AuthPigeonFirebaseApp authPigeonFirebaseApp, final Boolean bool, final GeneratedAndroidFirebaseAuth.Result<GeneratedAndroidFirebaseAuth.PigeonIdTokenResult> result) {
        FlutterFirebasePlugin.cachedThreadPool.execute(new Runnable() { // from class: io.flutter.plugins.firebase.auth.z
            @Override // java.lang.Runnable
            public final void run() {
                FlutterFirebaseAuthUser.lambda$getIdToken$1(GeneratedAndroidFirebaseAuth.AuthPigeonFirebaseApp.this, result, bool);
            }
        });
    }

    @Override // io.flutter.plugins.firebase.auth.GeneratedAndroidFirebaseAuth.FirebaseAuthUserHostApi
    public void linkWithCredential(GeneratedAndroidFirebaseAuth.AuthPigeonFirebaseApp authPigeonFirebaseApp, Map<String, Object> map, final GeneratedAndroidFirebaseAuth.Result<GeneratedAndroidFirebaseAuth.PigeonUserCredential> result) {
        com.google.firebase.auth.a0 currentUserFromPigeon = getCurrentUserFromPigeon(authPigeonFirebaseApp);
        com.google.firebase.auth.h credential = PigeonParser.getCredential(map);
        if (currentUserFromPigeon == null) {
            result.error(FlutterFirebaseAuthPluginException.noUser());
        } else if (credential == null) {
            result.error(FlutterFirebaseAuthPluginException.invalidCredential());
        } else {
            currentUserFromPigeon.B1(credential).addOnCompleteListener(new OnCompleteListener() { // from class: io.flutter.plugins.firebase.auth.b0
                @Override // com.google.android.gms.tasks.OnCompleteListener
                public final void onComplete(Task task) {
                    FlutterFirebaseAuthUser.lambda$linkWithCredential$2(GeneratedAndroidFirebaseAuth.Result.this, task);
                }
            });
        }
    }

    @Override // io.flutter.plugins.firebase.auth.GeneratedAndroidFirebaseAuth.FirebaseAuthUserHostApi
    public void linkWithProvider(GeneratedAndroidFirebaseAuth.AuthPigeonFirebaseApp authPigeonFirebaseApp, GeneratedAndroidFirebaseAuth.PigeonSignInProvider pigeonSignInProvider, final GeneratedAndroidFirebaseAuth.Result<GeneratedAndroidFirebaseAuth.PigeonUserCredential> result) {
        com.google.firebase.auth.a0 currentUserFromPigeon = getCurrentUserFromPigeon(authPigeonFirebaseApp);
        n0.a d10 = com.google.firebase.auth.n0.d(pigeonSignInProvider.getProviderId());
        if (pigeonSignInProvider.getScopes() != null) {
            d10.c(pigeonSignInProvider.getScopes());
        }
        if (pigeonSignInProvider.getCustomParameters() != null) {
            d10.a(pigeonSignInProvider.getCustomParameters());
        }
        currentUserFromPigeon.G1(this.activity, d10.b()).addOnCompleteListener(new OnCompleteListener() { // from class: io.flutter.plugins.firebase.auth.w
            @Override // com.google.android.gms.tasks.OnCompleteListener
            public final void onComplete(Task task) {
                FlutterFirebaseAuthUser.lambda$linkWithProvider$3(GeneratedAndroidFirebaseAuth.Result.this, task);
            }
        });
    }

    @Override // io.flutter.plugins.firebase.auth.GeneratedAndroidFirebaseAuth.FirebaseAuthUserHostApi
    public void reauthenticateWithCredential(GeneratedAndroidFirebaseAuth.AuthPigeonFirebaseApp authPigeonFirebaseApp, Map<String, Object> map, final GeneratedAndroidFirebaseAuth.Result<GeneratedAndroidFirebaseAuth.PigeonUserCredential> result) {
        com.google.firebase.auth.a0 currentUserFromPigeon = getCurrentUserFromPigeon(authPigeonFirebaseApp);
        com.google.firebase.auth.h credential = PigeonParser.getCredential(map);
        if (currentUserFromPigeon == null) {
            result.error(FlutterFirebaseAuthPluginException.noUser());
        } else if (credential == null) {
            result.error(FlutterFirebaseAuthPluginException.invalidCredential());
        } else {
            currentUserFromPigeon.C1(credential).addOnCompleteListener(new OnCompleteListener() { // from class: io.flutter.plugins.firebase.auth.l0
                @Override // com.google.android.gms.tasks.OnCompleteListener
                public final void onComplete(Task task) {
                    FlutterFirebaseAuthUser.lambda$reauthenticateWithCredential$4(GeneratedAndroidFirebaseAuth.Result.this, task);
                }
            });
        }
    }

    @Override // io.flutter.plugins.firebase.auth.GeneratedAndroidFirebaseAuth.FirebaseAuthUserHostApi
    public void reauthenticateWithProvider(GeneratedAndroidFirebaseAuth.AuthPigeonFirebaseApp authPigeonFirebaseApp, GeneratedAndroidFirebaseAuth.PigeonSignInProvider pigeonSignInProvider, final GeneratedAndroidFirebaseAuth.Result<GeneratedAndroidFirebaseAuth.PigeonUserCredential> result) {
        com.google.firebase.auth.a0 currentUserFromPigeon = getCurrentUserFromPigeon(authPigeonFirebaseApp);
        n0.a d10 = com.google.firebase.auth.n0.d(pigeonSignInProvider.getProviderId());
        if (pigeonSignInProvider.getScopes() != null) {
            d10.c(pigeonSignInProvider.getScopes());
        }
        if (pigeonSignInProvider.getCustomParameters() != null) {
            d10.a(pigeonSignInProvider.getCustomParameters());
        }
        currentUserFromPigeon.H1(this.activity, d10.b()).addOnCompleteListener(new OnCompleteListener() { // from class: io.flutter.plugins.firebase.auth.m0
            @Override // com.google.android.gms.tasks.OnCompleteListener
            public final void onComplete(Task task) {
                FlutterFirebaseAuthUser.lambda$reauthenticateWithProvider$5(GeneratedAndroidFirebaseAuth.Result.this, task);
            }
        });
    }

    @Override // io.flutter.plugins.firebase.auth.GeneratedAndroidFirebaseAuth.FirebaseAuthUserHostApi
    public void reload(GeneratedAndroidFirebaseAuth.AuthPigeonFirebaseApp authPigeonFirebaseApp, final GeneratedAndroidFirebaseAuth.Result<GeneratedAndroidFirebaseAuth.PigeonUserDetails> result) {
        final com.google.firebase.auth.a0 currentUserFromPigeon = getCurrentUserFromPigeon(authPigeonFirebaseApp);
        if (currentUserFromPigeon == null) {
            result.error(FlutterFirebaseAuthPluginException.noUser());
        } else {
            currentUserFromPigeon.D1().addOnCompleteListener(new OnCompleteListener() { // from class: io.flutter.plugins.firebase.auth.u
                @Override // com.google.android.gms.tasks.OnCompleteListener
                public final void onComplete(Task task) {
                    FlutterFirebaseAuthUser.lambda$reload$6(GeneratedAndroidFirebaseAuth.Result.this, currentUserFromPigeon, task);
                }
            });
        }
    }

    @Override // io.flutter.plugins.firebase.auth.GeneratedAndroidFirebaseAuth.FirebaseAuthUserHostApi
    public void sendEmailVerification(GeneratedAndroidFirebaseAuth.AuthPigeonFirebaseApp authPigeonFirebaseApp, GeneratedAndroidFirebaseAuth.PigeonActionCodeSettings pigeonActionCodeSettings, final GeneratedAndroidFirebaseAuth.Result<Void> result) {
        com.google.firebase.auth.a0 currentUserFromPigeon = getCurrentUserFromPigeon(authPigeonFirebaseApp);
        if (currentUserFromPigeon == null) {
            result.error(FlutterFirebaseAuthPluginException.noUser());
        } else if (pigeonActionCodeSettings == null) {
            currentUserFromPigeon.E1().addOnCompleteListener(new OnCompleteListener() { // from class: io.flutter.plugins.firebase.auth.j0
                @Override // com.google.android.gms.tasks.OnCompleteListener
                public final void onComplete(Task task) {
                    FlutterFirebaseAuthUser.lambda$sendEmailVerification$7(GeneratedAndroidFirebaseAuth.Result.this, task);
                }
            });
        } else {
            currentUserFromPigeon.F1(PigeonParser.getActionCodeSettings(pigeonActionCodeSettings)).addOnCompleteListener(new OnCompleteListener() { // from class: io.flutter.plugins.firebase.auth.k0
                @Override // com.google.android.gms.tasks.OnCompleteListener
                public final void onComplete(Task task) {
                    FlutterFirebaseAuthUser.lambda$sendEmailVerification$8(GeneratedAndroidFirebaseAuth.Result.this, task);
                }
            });
        }
    }

    public void setActivity(Activity activity) {
        this.activity = activity;
    }

    @Override // io.flutter.plugins.firebase.auth.GeneratedAndroidFirebaseAuth.FirebaseAuthUserHostApi
    public void unlink(GeneratedAndroidFirebaseAuth.AuthPigeonFirebaseApp authPigeonFirebaseApp, String str, final GeneratedAndroidFirebaseAuth.Result<GeneratedAndroidFirebaseAuth.PigeonUserCredential> result) {
        com.google.firebase.auth.a0 currentUserFromPigeon = getCurrentUserFromPigeon(authPigeonFirebaseApp);
        if (currentUserFromPigeon == null) {
            result.error(FlutterFirebaseAuthPluginException.noUser());
        } else {
            currentUserFromPigeon.I1(str).addOnCompleteListener(new OnCompleteListener() { // from class: io.flutter.plugins.firebase.auth.d0
                @Override // com.google.android.gms.tasks.OnCompleteListener
                public final void onComplete(Task task) {
                    FlutterFirebaseAuthUser.lambda$unlink$9(GeneratedAndroidFirebaseAuth.Result.this, task);
                }
            });
        }
    }

    @Override // io.flutter.plugins.firebase.auth.GeneratedAndroidFirebaseAuth.FirebaseAuthUserHostApi
    public void updateEmail(GeneratedAndroidFirebaseAuth.AuthPigeonFirebaseApp authPigeonFirebaseApp, String str, final GeneratedAndroidFirebaseAuth.Result<GeneratedAndroidFirebaseAuth.PigeonUserDetails> result) {
        final com.google.firebase.auth.a0 currentUserFromPigeon = getCurrentUserFromPigeon(authPigeonFirebaseApp);
        if (currentUserFromPigeon == null) {
            result.error(FlutterFirebaseAuthPluginException.noUser());
        } else {
            currentUserFromPigeon.J1(str).addOnCompleteListener(new OnCompleteListener() { // from class: io.flutter.plugins.firebase.auth.a0
                @Override // com.google.android.gms.tasks.OnCompleteListener
                public final void onComplete(Task task) {
                    FlutterFirebaseAuthUser.lambda$updateEmail$11(com.google.firebase.auth.a0.this, result, task);
                }
            });
        }
    }

    @Override // io.flutter.plugins.firebase.auth.GeneratedAndroidFirebaseAuth.FirebaseAuthUserHostApi
    public void updatePassword(GeneratedAndroidFirebaseAuth.AuthPigeonFirebaseApp authPigeonFirebaseApp, String str, final GeneratedAndroidFirebaseAuth.Result<GeneratedAndroidFirebaseAuth.PigeonUserDetails> result) {
        final com.google.firebase.auth.a0 currentUserFromPigeon = getCurrentUserFromPigeon(authPigeonFirebaseApp);
        if (currentUserFromPigeon == null) {
            result.error(FlutterFirebaseAuthPluginException.noUser());
        } else {
            currentUserFromPigeon.K1(str).addOnCompleteListener(new OnCompleteListener() { // from class: io.flutter.plugins.firebase.auth.x
                @Override // com.google.android.gms.tasks.OnCompleteListener
                public final void onComplete(Task task) {
                    FlutterFirebaseAuthUser.lambda$updatePassword$13(com.google.firebase.auth.a0.this, result, task);
                }
            });
        }
    }

    @Override // io.flutter.plugins.firebase.auth.GeneratedAndroidFirebaseAuth.FirebaseAuthUserHostApi
    public void updatePhoneNumber(GeneratedAndroidFirebaseAuth.AuthPigeonFirebaseApp authPigeonFirebaseApp, Map<String, Object> map, final GeneratedAndroidFirebaseAuth.Result<GeneratedAndroidFirebaseAuth.PigeonUserDetails> result) {
        final com.google.firebase.auth.a0 currentUserFromPigeon = getCurrentUserFromPigeon(authPigeonFirebaseApp);
        if (currentUserFromPigeon == null) {
            result.error(FlutterFirebaseAuthPluginException.noUser());
            return;
        }
        com.google.firebase.auth.o0 o0Var = (com.google.firebase.auth.o0) PigeonParser.getCredential(map);
        if (o0Var == null) {
            result.error(FlutterFirebaseAuthPluginException.invalidCredential());
        } else {
            currentUserFromPigeon.L1(o0Var).addOnCompleteListener(new OnCompleteListener() { // from class: io.flutter.plugins.firebase.auth.c0
                @Override // com.google.android.gms.tasks.OnCompleteListener
                public final void onComplete(Task task) {
                    FlutterFirebaseAuthUser.lambda$updatePhoneNumber$15(com.google.firebase.auth.a0.this, result, task);
                }
            });
        }
    }

    @Override // io.flutter.plugins.firebase.auth.GeneratedAndroidFirebaseAuth.FirebaseAuthUserHostApi
    public void updateProfile(GeneratedAndroidFirebaseAuth.AuthPigeonFirebaseApp authPigeonFirebaseApp, GeneratedAndroidFirebaseAuth.PigeonUserProfile pigeonUserProfile, final GeneratedAndroidFirebaseAuth.Result<GeneratedAndroidFirebaseAuth.PigeonUserDetails> result) {
        final com.google.firebase.auth.a0 currentUserFromPigeon = getCurrentUserFromPigeon(authPigeonFirebaseApp);
        if (currentUserFromPigeon == null) {
            result.error(FlutterFirebaseAuthPluginException.noUser());
            return;
        }
        d1.a aVar = new d1.a();
        if (pigeonUserProfile.getDisplayNameChanged().booleanValue()) {
            aVar.b(pigeonUserProfile.getDisplayName());
        }
        if (pigeonUserProfile.getPhotoUrlChanged().booleanValue()) {
            aVar.c(pigeonUserProfile.getPhotoUrl() != null ? Uri.parse(pigeonUserProfile.getPhotoUrl()) : null);
        }
        currentUserFromPigeon.M1(aVar.a()).addOnCompleteListener(new OnCompleteListener() { // from class: io.flutter.plugins.firebase.auth.v
            @Override // com.google.android.gms.tasks.OnCompleteListener
            public final void onComplete(Task task) {
                FlutterFirebaseAuthUser.lambda$updateProfile$17(com.google.firebase.auth.a0.this, result, task);
            }
        });
    }

    @Override // io.flutter.plugins.firebase.auth.GeneratedAndroidFirebaseAuth.FirebaseAuthUserHostApi
    public void verifyBeforeUpdateEmail(GeneratedAndroidFirebaseAuth.AuthPigeonFirebaseApp authPigeonFirebaseApp, String str, GeneratedAndroidFirebaseAuth.PigeonActionCodeSettings pigeonActionCodeSettings, final GeneratedAndroidFirebaseAuth.Result<Void> result) {
        com.google.firebase.auth.a0 currentUserFromPigeon = getCurrentUserFromPigeon(authPigeonFirebaseApp);
        if (currentUserFromPigeon == null) {
            result.error(FlutterFirebaseAuthPluginException.noUser());
        } else if (pigeonActionCodeSettings == null) {
            currentUserFromPigeon.N1(str).addOnCompleteListener(new OnCompleteListener() { // from class: io.flutter.plugins.firebase.auth.g0
                @Override // com.google.android.gms.tasks.OnCompleteListener
                public final void onComplete(Task task) {
                    FlutterFirebaseAuthUser.lambda$verifyBeforeUpdateEmail$18(GeneratedAndroidFirebaseAuth.Result.this, task);
                }
            });
        } else {
            currentUserFromPigeon.O1(str, PigeonParser.getActionCodeSettings(pigeonActionCodeSettings)).addOnCompleteListener(new OnCompleteListener() { // from class: io.flutter.plugins.firebase.auth.h0
                @Override // com.google.android.gms.tasks.OnCompleteListener
                public final void onComplete(Task task) {
                    FlutterFirebaseAuthUser.lambda$verifyBeforeUpdateEmail$19(GeneratedAndroidFirebaseAuth.Result.this, task);
                }
            });
        }
    }
}

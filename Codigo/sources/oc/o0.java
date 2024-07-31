package oc;

import android.util.Log;
import com.google.android.gms.internal.p002firebaseauthapi.zzacf;
import com.google.android.gms.tasks.Continuation;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.Tasks;
import com.google.android.recaptcha.RecaptchaAction;
import com.google.firebase.auth.FirebaseAuth;

/* loaded from: classes.dex */
public abstract class o0<T> {
    /* JADX INFO: Access modifiers changed from: package-private */
    public static /* synthetic */ Task a(RecaptchaAction recaptchaAction, FirebaseAuth firebaseAuth, String str, Continuation continuation, Task task) {
        if (task.isSuccessful()) {
            return Tasks.forResult(task.getResult());
        }
        Exception exc = (Exception) com.google.android.gms.common.internal.s.j(task.getException());
        if (zzacf.zzc(exc)) {
            if (Log.isLoggable("RecaptchaCallWrapper", 4)) {
                Log.i("RecaptchaCallWrapper", "Falling back to recaptcha enterprise flow for action " + String.valueOf(recaptchaAction));
            }
            if (firebaseAuth.o0() == null) {
                firebaseAuth.i0(new t0(firebaseAuth.i(), firebaseAuth));
            }
            return d(firebaseAuth.o0(), recaptchaAction, str, continuation);
        }
        Log.e("RecaptchaCallWrapper", "Initial task failed for action " + String.valueOf(recaptchaAction) + "with exception - " + exc.getMessage());
        return Tasks.forException(exc);
    }

    /* JADX WARN: Multi-variable type inference failed */
    private static <T> Task<T> d(t0 t0Var, RecaptchaAction recaptchaAction, String str, Continuation<String, Task<T>> continuation) {
        Task<String> b10 = t0Var.b(str, Boolean.FALSE, recaptchaAction);
        return b10.continueWithTask(continuation).continueWithTask(new p0(str, t0Var, recaptchaAction, continuation));
    }

    public final Task<T> b(final FirebaseAuth firebaseAuth, final String str, final RecaptchaAction recaptchaAction, String str2) {
        final Continuation continuation = new Continuation() { // from class: oc.q0
            @Override // com.google.android.gms.tasks.Continuation
            public final Object then(Task task) {
                String str3;
                o0 o0Var = o0.this;
                if (task.isSuccessful()) {
                    str3 = (String) task.getResult();
                } else {
                    Log.e("RecaptchaCallWrapper", "Failed to get Recaptcha token, error - " + ((Exception) com.google.android.gms.common.internal.s.j(task.getException())).getMessage() + "\n\n Failing open with a fake token.");
                    str3 = "NO_RECAPTCHA";
                }
                return o0Var.c(str3);
            }
        };
        t0 o02 = firebaseAuth.o0();
        return (o02 == null || !o02.d(str2)) ? (Task<T>) c(null).continueWithTask(new Continuation() { // from class: oc.n0
            @Override // com.google.android.gms.tasks.Continuation
            public final Object then(Task task) {
                return o0.a(RecaptchaAction.this, firebaseAuth, str, continuation, task);
            }
        }) : d(o02, recaptchaAction, str, continuation);
    }

    public abstract Task<T> c(String str);
}

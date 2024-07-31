package p272oc;

import android.util.Log;
import com.google.android.gms.common.internal.C5276s;
import com.google.android.gms.internal.p498firebaseauthapi.zzacf;
import com.google.android.gms.tasks.Continuation;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.Tasks;
import com.google.android.recaptcha.RecaptchaAction;
import com.google.firebase.auth.FirebaseAuth;

/* renamed from: oc.o0 */
/* loaded from: classes.dex */
public abstract class AbstractC9876o0<T> {
    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a */
    public static /* synthetic */ Task m29568a(RecaptchaAction recaptchaAction, FirebaseAuth firebaseAuth, String str, Continuation continuation, Task task) {
        if (task.isSuccessful()) {
            return Tasks.forResult(task.getResult());
        }
        Exception exc = (Exception) C5276s.m13324j(task.getException());
        if (zzacf.zzc(exc)) {
            if (Log.isLoggable("RecaptchaCallWrapper", 4)) {
                Log.i("RecaptchaCallWrapper", "Falling back to recaptcha enterprise flow for action " + String.valueOf(recaptchaAction));
            }
            if (firebaseAuth.m16407o0() == null) {
                firebaseAuth.m16397i0(new C9891t0(firebaseAuth.m16396i(), firebaseAuth));
            }
            return m29569d(firebaseAuth.m16407o0(), recaptchaAction, str, continuation);
        }
        Log.e("RecaptchaCallWrapper", "Initial task failed for action " + String.valueOf(recaptchaAction) + "with exception - " + exc.getMessage());
        return Tasks.forException(exc);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: d */
    private static <T> Task<T> m29569d(C9891t0 c9891t0, RecaptchaAction recaptchaAction, String str, Continuation<String, Task<T>> continuation) {
        Task<String> m29597b = c9891t0.m29597b(str, Boolean.FALSE, recaptchaAction);
        return m29597b.continueWithTask(continuation).continueWithTask(new C9879p0(str, c9891t0, recaptchaAction, continuation));
    }

    /* renamed from: b */
    public final Task<T> m29570b(final FirebaseAuth firebaseAuth, final String str, final RecaptchaAction recaptchaAction, String str2) {
        final Continuation continuation = new Continuation() { // from class: oc.q0
            @Override // com.google.android.gms.tasks.Continuation
            public final Object then(Task task) {
                String str3;
                AbstractC9876o0 abstractC9876o0 = AbstractC9876o0.this;
                if (task.isSuccessful()) {
                    str3 = (String) task.getResult();
                } else {
                    Log.e("RecaptchaCallWrapper", "Failed to get Recaptcha token, error - " + ((Exception) C5276s.m13324j(task.getException())).getMessage() + "\n\n Failing open with a fake token.");
                    str3 = "NO_RECAPTCHA";
                }
                return abstractC9876o0.mo16525c(str3);
            }
        };
        C9891t0 m16407o0 = firebaseAuth.m16407o0();
        return (m16407o0 == null || !m16407o0.m29598d(str2)) ? (Task<T>) mo16525c(null).continueWithTask(new Continuation() { // from class: oc.n0
            @Override // com.google.android.gms.tasks.Continuation
            public final Object then(Task task) {
                return AbstractC9876o0.m29568a(RecaptchaAction.this, firebaseAuth, str, continuation, task);
            }
        }) : m29569d(m16407o0, recaptchaAction, str, continuation);
    }

    /* renamed from: c */
    public abstract Task<T> mo16525c(String str);
}

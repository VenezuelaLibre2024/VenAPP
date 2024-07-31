package p272oc;

import android.util.Log;
import com.google.android.gms.common.internal.C5276s;
import com.google.android.gms.tasks.Continuation;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.Tasks;
import com.google.android.recaptcha.RecaptchaAction;
import com.google.android.recaptcha.RecaptchaTasksClient;

/* renamed from: oc.v0 */
/* loaded from: classes.dex */
final class C9897v0 implements Continuation<RecaptchaTasksClient, Task<String>> {

    /* renamed from: a */
    private final /* synthetic */ RecaptchaAction f24399a;

    /* JADX INFO: Access modifiers changed from: package-private */
    public C9897v0(C9891t0 c9891t0, RecaptchaAction recaptchaAction) {
        this.f24399a = recaptchaAction;
    }

    @Override // com.google.android.gms.tasks.Continuation
    public final /* synthetic */ Task<String> then(Task<RecaptchaTasksClient> task) {
        if (task.isSuccessful()) {
            return task.getResult().executeTask(this.f24399a);
        }
        Exception exc = (Exception) C5276s.m13324j(task.getException());
        if (!(exc instanceof C9894u0)) {
            return Tasks.forException(exc);
        }
        if (Log.isLoggable("RecaptchaHandler", 4)) {
            Log.i("RecaptchaHandler", "Ignoring error related to fetching recaptcha config - " + exc.getMessage());
        }
        return Tasks.forResult("");
    }
}

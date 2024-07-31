package oc;

import android.app.Application;
import com.google.android.gms.tasks.Task;
import com.google.android.recaptcha.Recaptcha;
import com.google.android.recaptcha.RecaptchaTasksClient;

/* loaded from: classes.dex */
final class r0 implements s0 {
    @Override // oc.s0
    public final Task<RecaptchaTasksClient> a(Application application, String str) {
        return Recaptcha.getTasksClient(application, str);
    }
}

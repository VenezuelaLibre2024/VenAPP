package oc;

import android.app.Application;
import com.google.android.gms.tasks.Task;
import com.google.android.recaptcha.RecaptchaTasksClient;

/* loaded from: classes.dex */
public interface s0 {
    Task<RecaptchaTasksClient> a(Application application, String str);
}

package p272oc;

import android.app.Application;
import com.google.android.gms.tasks.Task;
import com.google.android.recaptcha.Recaptcha;
import com.google.android.recaptcha.RecaptchaTasksClient;

/* renamed from: oc.r0 */
/* loaded from: classes.dex */
final class C9885r0 implements InterfaceC9888s0 {
    @Override // p272oc.InterfaceC9888s0
    /* renamed from: a */
    public final Task<RecaptchaTasksClient> mo29585a(Application application, String str) {
        return Recaptcha.getTasksClient(application, str);
    }
}

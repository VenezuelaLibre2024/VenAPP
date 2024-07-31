package oc;

import android.app.Application;
import android.text.TextUtils;
import android.util.Log;
import com.google.android.gms.internal.p002firebaseauthapi.zzab;
import com.google.android.gms.internal.p002firebaseauthapi.zzafk;
import com.google.android.gms.internal.p002firebaseauthapi.zzag;
import com.google.android.gms.tasks.Continuation;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.Tasks;
import com.google.android.recaptcha.RecaptchaTasksClient;
import java.util.List;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public final class w0 implements Continuation<zzafk, Task<RecaptchaTasksClient>> {

    /* renamed from: a, reason: collision with root package name */
    private final /* synthetic */ String f22471a;

    /* renamed from: b, reason: collision with root package name */
    private final /* synthetic */ t0 f22472b;

    /* JADX INFO: Access modifiers changed from: package-private */
    public w0(t0 t0Var, String str) {
        this.f22472b = t0Var;
        this.f22471a = str;
    }

    @Override // com.google.android.gms.tasks.Continuation
    public final /* synthetic */ Task<RecaptchaTasksClient> then(Task<zzafk> task) {
        if (!task.isSuccessful()) {
            return Tasks.forException(new u0((String) com.google.android.gms.common.internal.s.j(((Exception) com.google.android.gms.common.internal.s.j(task.getException())).getMessage())));
        }
        zzafk result = task.getResult();
        String zza = result.zza();
        if (zzag.zzc(zza)) {
            return Tasks.forException(new u0("No Recaptcha Enterprise siteKey configured for tenant/project " + this.f22471a));
        }
        List<String> zza2 = zzab.zza('/').zza((CharSequence) zza);
        String str = zza2.size() != 4 ? null : zza2.get(3);
        if (TextUtils.isEmpty(str)) {
            return Tasks.forException(new Exception("Invalid siteKey format " + zza));
        }
        if (Log.isLoggable("RecaptchaHandler", 4)) {
            Log.i("RecaptchaHandler", "Successfully obtained site key for tenant " + this.f22471a);
        }
        this.f22472b.f22454b = result;
        t0 t0Var = this.f22472b;
        Task<RecaptchaTasksClient> a10 = t0Var.f22457e.a((Application) t0Var.f22455c.m(), str);
        this.f22472b.f22453a.put(this.f22471a, a10);
        return a10;
    }
}

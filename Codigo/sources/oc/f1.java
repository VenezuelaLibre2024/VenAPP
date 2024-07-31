package oc;

import android.util.Base64;
import android.util.Log;
import com.google.android.gms.internal.p002firebaseauthapi.zzafj;
import com.google.android.gms.tasks.Continuation;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.Tasks;
import com.google.android.play.core.integrity.IntegrityManager;
import com.google.android.play.core.integrity.IntegrityTokenRequest;
import com.google.android.play.core.integrity.IntegrityTokenResponse;
import java.security.MessageDigest;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public final class f1 implements Continuation<zzafj, Task<IntegrityTokenResponse>> {

    /* renamed from: a, reason: collision with root package name */
    private final /* synthetic */ String f22387a;

    /* renamed from: b, reason: collision with root package name */
    private final /* synthetic */ IntegrityManager f22388b;

    /* renamed from: c, reason: collision with root package name */
    private final /* synthetic */ d0 f22389c;

    /* JADX INFO: Access modifiers changed from: package-private */
    public f1(d0 d0Var, String str, IntegrityManager integrityManager) {
        this.f22389c = d0Var;
        this.f22387a = str;
        this.f22388b = integrityManager;
    }

    @Override // com.google.android.gms.tasks.Continuation
    public final /* synthetic */ Task<IntegrityTokenResponse> then(Task<zzafj> task) {
        String str;
        if (task.isSuccessful()) {
            this.f22389c.f22369a = task.getResult().zza();
            return this.f22388b.requestIntegrityToken(IntegrityTokenRequest.builder().setCloudProjectNumber(Long.parseLong(task.getResult().zza())).setNonce(new String(Base64.encode(MessageDigest.getInstance("SHA-256").digest(this.f22387a.getBytes("UTF-8")), 11))).build());
        }
        str = d0.f22367b;
        Log.e(str, "Problem retrieving Play Integrity producer project:  " + task.getException().getMessage());
        return Tasks.forException(task.getException());
    }
}

package oc;

import android.util.Log;
import com.google.android.gms.tasks.OnFailureListener;
import com.google.android.gms.tasks.TaskCompletionSource;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public final class b1 implements OnFailureListener {

    /* renamed from: a, reason: collision with root package name */
    private final /* synthetic */ TaskCompletionSource f22345a;

    /* JADX INFO: Access modifiers changed from: package-private */
    public b1(d0 d0Var, TaskCompletionSource taskCompletionSource) {
        this.f22345a = taskCompletionSource;
    }

    @Override // com.google.android.gms.tasks.OnFailureListener
    public final void onFailure(Exception exc) {
        String str;
        str = d0.f22367b;
        Log.e(str, String.format("Failed to get reCAPTCHA token with error [%s]- calling backend without app verification", exc.getMessage()));
        if ((exc instanceof com.google.firebase.auth.q) && ((com.google.firebase.auth.q) exc).a().endsWith("UNAUTHORIZED_DOMAIN")) {
            this.f22345a.setException(exc);
        } else {
            this.f22345a.setResult(new n1().a());
        }
    }
}

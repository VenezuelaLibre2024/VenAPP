package oc;

import com.google.android.gms.tasks.OnSuccessListener;
import com.google.android.gms.tasks.TaskCompletionSource;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public final class h1 implements OnSuccessListener<String> {

    /* renamed from: a */
    private final /* synthetic */ TaskCompletionSource f22394a;

    public h1(d0 d0Var, TaskCompletionSource taskCompletionSource) {
        this.f22394a = taskCompletionSource;
    }

    @Override // com.google.android.gms.tasks.OnSuccessListener
    public final /* synthetic */ void onSuccess(String str) {
        this.f22394a.setResult(new n1().c(str).a());
    }
}

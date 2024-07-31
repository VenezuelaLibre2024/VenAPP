package oc;

import android.content.Context;
import com.google.android.gms.tasks.OnSuccessListener;
import com.google.android.gms.tasks.TaskCompletionSource;

/* loaded from: classes.dex */
public final class z implements OnSuccessListener<com.google.firebase.auth.i> {

    /* renamed from: a */
    private final /* synthetic */ TaskCompletionSource f22496a;

    /* renamed from: b */
    private final /* synthetic */ Context f22497b;

    public z(v vVar, TaskCompletionSource taskCompletionSource, Context context) {
        this.f22496a = taskCompletionSource;
        this.f22497b = context;
    }

    @Override // com.google.android.gms.tasks.OnSuccessListener
    public final /* synthetic */ void onSuccess(com.google.firebase.auth.i iVar) {
        this.f22496a.setResult(iVar);
        v.d(this.f22497b);
    }
}

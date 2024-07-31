package oc;

import android.content.Context;
import com.google.android.gms.tasks.OnSuccessListener;
import com.google.android.gms.tasks.TaskCompletionSource;

/* loaded from: classes.dex */
public final class x implements OnSuccessListener<com.google.firebase.auth.i> {

    /* renamed from: a */
    private final /* synthetic */ TaskCompletionSource f22476a;

    /* renamed from: b */
    private final /* synthetic */ Context f22477b;

    public x(v vVar, TaskCompletionSource taskCompletionSource, Context context) {
        this.f22476a = taskCompletionSource;
        this.f22477b = context;
    }

    @Override // com.google.android.gms.tasks.OnSuccessListener
    public final /* synthetic */ void onSuccess(com.google.firebase.auth.i iVar) {
        this.f22476a.setResult(iVar);
        v.d(this.f22477b);
    }
}

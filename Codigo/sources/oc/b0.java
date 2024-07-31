package oc;

import android.content.Context;
import com.google.android.gms.tasks.OnSuccessListener;
import com.google.android.gms.tasks.TaskCompletionSource;

/* loaded from: classes.dex */
public final class b0 implements OnSuccessListener<com.google.firebase.auth.i> {

    /* renamed from: a */
    private final /* synthetic */ TaskCompletionSource f22343a;

    /* renamed from: b */
    private final /* synthetic */ Context f22344b;

    public b0(v vVar, TaskCompletionSource taskCompletionSource, Context context) {
        this.f22343a = taskCompletionSource;
        this.f22344b = context;
    }

    @Override // com.google.android.gms.tasks.OnSuccessListener
    public final /* synthetic */ void onSuccess(com.google.firebase.auth.i iVar) {
        this.f22343a.setResult(iVar);
        v.d(this.f22344b);
    }
}

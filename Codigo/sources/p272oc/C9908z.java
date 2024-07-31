package p272oc;

import android.content.Context;
import com.google.android.gms.tasks.OnSuccessListener;
import com.google.android.gms.tasks.TaskCompletionSource;
import com.google.firebase.auth.InterfaceC6076i;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: oc.z */
/* loaded from: classes.dex */
public final class C9908z implements OnSuccessListener<InterfaceC6076i> {

    /* renamed from: a */
    private final /* synthetic */ TaskCompletionSource f24429a;

    /* renamed from: b */
    private final /* synthetic */ Context f24430b;

    /* JADX INFO: Access modifiers changed from: package-private */
    public C9908z(C9896v c9896v, TaskCompletionSource taskCompletionSource, Context context) {
        this.f24429a = taskCompletionSource;
        this.f24430b = context;
    }

    @Override // com.google.android.gms.tasks.OnSuccessListener
    public final /* synthetic */ void onSuccess(InterfaceC6076i interfaceC6076i) {
        this.f24429a.setResult(interfaceC6076i);
        C9896v.m29602d(this.f24430b);
    }
}

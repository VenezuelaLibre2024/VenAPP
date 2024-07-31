package p272oc;

import android.content.Context;
import com.google.android.gms.tasks.OnSuccessListener;
import com.google.android.gms.tasks.TaskCompletionSource;
import com.google.firebase.auth.InterfaceC6076i;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: oc.x */
/* loaded from: classes.dex */
public final class C9902x implements OnSuccessListener<InterfaceC6076i> {

    /* renamed from: a */
    private final /* synthetic */ TaskCompletionSource f24409a;

    /* renamed from: b */
    private final /* synthetic */ Context f24410b;

    /* JADX INFO: Access modifiers changed from: package-private */
    public C9902x(C9896v c9896v, TaskCompletionSource taskCompletionSource, Context context) {
        this.f24409a = taskCompletionSource;
        this.f24410b = context;
    }

    @Override // com.google.android.gms.tasks.OnSuccessListener
    public final /* synthetic */ void onSuccess(InterfaceC6076i interfaceC6076i) {
        this.f24409a.setResult(interfaceC6076i);
        C9896v.m29602d(this.f24410b);
    }
}

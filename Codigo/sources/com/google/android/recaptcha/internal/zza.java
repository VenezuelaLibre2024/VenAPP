package com.google.android.recaptcha.internal;

import ck.v;
import com.google.android.gms.tasks.RuntimeExecutionException;
import com.google.android.gms.tasks.TaskCompletionSource;
import java.util.concurrent.CancellationException;
import kotlin.jvm.internal.o;
import ok.l;
import zk.r0;

/* loaded from: classes2.dex */
final class zza extends o implements l {
    final /* synthetic */ TaskCompletionSource zza;
    final /* synthetic */ r0 zzb;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zza(TaskCompletionSource taskCompletionSource, r0 r0Var) {
        super(1);
        this.zza = taskCompletionSource;
        this.zzb = r0Var;
    }

    @Override // ok.l
    public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
        Throwable th2 = (Throwable) obj;
        if (th2 instanceof CancellationException) {
            this.zza.setException((Exception) th2);
        } else {
            Throwable j10 = this.zzb.j();
            if (j10 == null) {
                this.zza.setResult(this.zzb.g());
            } else {
                TaskCompletionSource taskCompletionSource = this.zza;
                Exception exc = j10 instanceof Exception ? (Exception) j10 : null;
                if (exc == null) {
                    exc = new RuntimeExecutionException(j10);
                }
                taskCompletionSource.setException(exc);
            }
        }
        return v.f7137a;
    }
}

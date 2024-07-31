package com.google.android.play.core.integrity;

import android.content.Context;
import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcelable;
import android.util.Base64;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.TaskCompletionSource;
import com.google.android.gms.tasks.Tasks;
import com.google.android.play.integrity.internal.c0;
import com.google.android.play.integrity.internal.j0;
import java.util.ArrayList;

/* loaded from: classes2.dex */
final class ad {

    /* renamed from: a, reason: collision with root package name */
    final com.google.android.play.integrity.internal.d f10910a;

    /* renamed from: b, reason: collision with root package name */
    private final c0 f10911b;

    /* renamed from: c, reason: collision with root package name */
    private final String f10912c;

    /* JADX INFO: Access modifiers changed from: package-private */
    public ad(Context context, c0 c0Var) {
        this.f10912c = context.getPackageName();
        this.f10911b = c0Var;
        if (com.google.android.play.integrity.internal.h.a(context)) {
            this.f10910a = new com.google.android.play.integrity.internal.d(context, c0Var, "IntegrityService", ae.f10913a, new j0() { // from class: com.google.android.play.core.integrity.aa
                @Override // com.google.android.play.integrity.internal.j0
                public final Object a(IBinder iBinder) {
                    return com.google.android.play.integrity.internal.y.f2(iBinder);
                }
            }, null);
        } else {
            c0Var.a("Phonesky is not installed.", new Object[0]);
            this.f10910a = null;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static /* bridge */ /* synthetic */ Bundle a(ad adVar, byte[] bArr, Long l10, Parcelable parcelable) {
        Bundle bundle = new Bundle();
        bundle.putString("package.name", adVar.f10912c);
        bundle.putByteArray("nonce", bArr);
        bundle.putInt("playcore.integrity.version.major", 1);
        bundle.putInt("playcore.integrity.version.minor", 2);
        bundle.putInt("playcore.integrity.version.patch", 0);
        if (l10 != null) {
            bundle.putLong("cloud.prj", l10.longValue());
        }
        ArrayList arrayList = new ArrayList();
        com.google.android.play.integrity.internal.p.b(3, arrayList);
        bundle.putParcelableArrayList("event_timestamps", new ArrayList<>(com.google.android.play.integrity.internal.p.a(arrayList)));
        return bundle;
    }

    public final Task b(IntegrityTokenRequest integrityTokenRequest) {
        if (this.f10910a == null) {
            return Tasks.forException(new IntegrityServiceException(-2, null));
        }
        try {
            byte[] decode = Base64.decode(integrityTokenRequest.nonce(), 10);
            Long cloudProjectNumber = integrityTokenRequest.cloudProjectNumber();
            integrityTokenRequest.a();
            this.f10911b.c("requestIntegrityToken(%s)", integrityTokenRequest);
            TaskCompletionSource taskCompletionSource = new TaskCompletionSource();
            this.f10910a.t(new ab(this, taskCompletionSource, decode, cloudProjectNumber, null, taskCompletionSource, integrityTokenRequest), taskCompletionSource);
            return taskCompletionSource.getTask();
        } catch (IllegalArgumentException e10) {
            return Tasks.forException(new IntegrityServiceException(-13, e10));
        }
    }
}

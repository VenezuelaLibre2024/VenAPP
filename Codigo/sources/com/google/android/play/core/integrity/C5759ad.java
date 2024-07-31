package com.google.android.play.core.integrity;

import android.content.Context;
import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcelable;
import android.util.Base64;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.TaskCompletionSource;
import com.google.android.gms.tasks.Tasks;
import com.google.android.play.integrity.internal.AbstractBinderC5851y;
import com.google.android.play.integrity.internal.C5820c0;
import com.google.android.play.integrity.internal.C5821d;
import com.google.android.play.integrity.internal.C5829h;
import com.google.android.play.integrity.internal.C5842p;
import com.google.android.play.integrity.internal.InterfaceC5834j0;
import java.util.ArrayList;

/* renamed from: com.google.android.play.core.integrity.ad */
/* loaded from: classes2.dex */
final class C5759ad {

    /* renamed from: a */
    final C5821d f12125a;

    /* renamed from: b */
    private final C5820c0 f12126b;

    /* renamed from: c */
    private final String f12127c;

    /* JADX INFO: Access modifiers changed from: package-private */
    public C5759ad(Context context, C5820c0 c5820c0) {
        this.f12127c = context.getPackageName();
        this.f12126b = c5820c0;
        if (C5829h.m14687a(context)) {
            this.f12125a = new C5821d(context, c5820c0, "IntegrityService", C5760ae.f12128a, new InterfaceC5834j0() { // from class: com.google.android.play.core.integrity.aa
                @Override // com.google.android.play.integrity.internal.InterfaceC5834j0
                /* renamed from: a */
                public final Object mo14615a(IBinder iBinder) {
                    return AbstractBinderC5851y.m14704f2(iBinder);
                }
            }, null);
        } else {
            c5820c0.m14656a("Phonesky is not installed.", new Object[0]);
            this.f12125a = null;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a */
    public static /* bridge */ /* synthetic */ Bundle m14619a(C5759ad c5759ad, byte[] bArr, Long l10, Parcelable parcelable) {
        Bundle bundle = new Bundle();
        bundle.putString("package.name", c5759ad.f12127c);
        bundle.putByteArray("nonce", bArr);
        bundle.putInt("playcore.integrity.version.major", 1);
        bundle.putInt("playcore.integrity.version.minor", 2);
        bundle.putInt("playcore.integrity.version.patch", 0);
        if (l10 != null) {
            bundle.putLong("cloud.prj", l10.longValue());
        }
        ArrayList arrayList = new ArrayList();
        C5842p.m14696b(3, arrayList);
        bundle.putParcelableArrayList("event_timestamps", new ArrayList<>(C5842p.m14695a(arrayList)));
        return bundle;
    }

    /* renamed from: b */
    public final Task m14621b(IntegrityTokenRequest integrityTokenRequest) {
        if (this.f12125a == null) {
            return Tasks.forException(new IntegrityServiceException(-2, null));
        }
        try {
            byte[] decode = Base64.decode(integrityTokenRequest.nonce(), 10);
            Long cloudProjectNumber = integrityTokenRequest.cloudProjectNumber();
            integrityTokenRequest.mo14608a();
            this.f12126b.m14658c("requestIntegrityToken(%s)", integrityTokenRequest);
            TaskCompletionSource taskCompletionSource = new TaskCompletionSource();
            this.f12125a.m14681t(new C5757ab(this, taskCompletionSource, decode, cloudProjectNumber, null, taskCompletionSource, integrityTokenRequest), taskCompletionSource);
            return taskCompletionSource.getTask();
        } catch (IllegalArgumentException e10) {
            return Tasks.forException(new IntegrityServiceException(-13, e10));
        }
    }
}

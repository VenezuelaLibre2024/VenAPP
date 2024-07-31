package com.google.android.play.core.integrity;

import com.google.android.gms.tasks.SuccessContinuation;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.Tasks;
import com.google.android.play.core.integrity.StandardIntegrityManager;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: com.google.android.play.core.integrity.al */
/* loaded from: classes2.dex */
public final class C5767al implements StandardIntegrityManager {

    /* renamed from: a */
    private final C5779ax f12136a;

    /* renamed from: b */
    private final C5786bd f12137b;

    /* JADX INFO: Access modifiers changed from: package-private */
    public C5767al(C5779ax c5779ax, C5786bd c5786bd) {
        this.f12136a = c5779ax;
        this.f12137b = c5786bd;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a */
    public final /* synthetic */ Task m14625a(StandardIntegrityManager.PrepareIntegrityTokenRequest prepareIntegrityTokenRequest, Long l10) {
        final C5786bd c5786bd = this.f12137b;
        final long mo14609a = prepareIntegrityTokenRequest.mo14609a();
        final long longValue = l10.longValue();
        return Tasks.forResult(new StandardIntegrityManager.StandardIntegrityTokenProvider() { // from class: com.google.android.play.core.integrity.bc
            @Override // com.google.android.play.core.integrity.StandardIntegrityManager.StandardIntegrityTokenProvider
            public final Task request(StandardIntegrityManager.StandardIntegrityTokenRequest standardIntegrityTokenRequest) {
                return C5786bd.this.m14642a(mo14609a, longValue, standardIntegrityTokenRequest);
            }
        });
    }

    @Override // com.google.android.play.core.integrity.StandardIntegrityManager
    public final Task<StandardIntegrityManager.StandardIntegrityTokenProvider> prepareIntegrityToken(final StandardIntegrityManager.PrepareIntegrityTokenRequest prepareIntegrityTokenRequest) {
        return this.f12136a.m14637d(prepareIntegrityTokenRequest.mo14609a()).onSuccessTask(new SuccessContinuation() { // from class: com.google.android.play.core.integrity.ak
            @Override // com.google.android.gms.tasks.SuccessContinuation
            public final Task then(Object obj) {
                return C5767al.this.m14625a(prepareIntegrityTokenRequest, (Long) obj);
            }
        });
    }
}

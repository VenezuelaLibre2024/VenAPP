package p158ia;

import com.google.android.gms.common.api.internal.C5151k;
import p136ha.C7680h;
import p136ha.InterfaceC7673a;

/* renamed from: ia.c */
/* loaded from: classes.dex */
final class C7934c implements C5151k.b {

    /* renamed from: a */
    final /* synthetic */ C7680h f19299a;

    /* JADX INFO: Access modifiers changed from: package-private */
    public C7934c(BinderC7935d binderC7935d, C7680h c7680h) {
        this.f19299a = c7680h;
    }

    @Override // com.google.android.gms.common.api.internal.C5151k.b
    public final /* bridge */ /* synthetic */ void notifyListener(Object obj) {
        ((InterfaceC7673a) obj).m23385a(this.f19299a);
    }

    @Override // com.google.android.gms.common.api.internal.C5151k.b
    public final void onNotifyListenerFailed() {
    }
}

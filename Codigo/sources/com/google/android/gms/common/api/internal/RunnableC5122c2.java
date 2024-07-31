package com.google.android.gms.common.api.internal;

import android.app.Dialog;
import android.app.PendingIntent;
import ca.C1894b;
import com.google.android.gms.common.api.GoogleApiActivity;
import com.google.android.gms.common.internal.C5276s;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: com.google.android.gms.common.api.internal.c2 */
/* loaded from: classes.dex */
public final class RunnableC5122c2 implements Runnable {

    /* renamed from: a */
    private final C5114a2 f10449a;

    /* renamed from: b */
    final /* synthetic */ AbstractDialogInterfaceOnCancelListenerC5126d2 f10450b;

    /* JADX INFO: Access modifiers changed from: package-private */
    public RunnableC5122c2(AbstractDialogInterfaceOnCancelListenerC5126d2 abstractDialogInterfaceOnCancelListenerC5126d2, C5114a2 c5114a2) {
        this.f10450b = abstractDialogInterfaceOnCancelListenerC5126d2;
        this.f10449a = c5114a2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        if (this.f10450b.f10454a) {
            C1894b m12998b = this.f10449a.m12998b();
            if (m12998b.m10053x1()) {
                AbstractDialogInterfaceOnCancelListenerC5126d2 abstractDialogInterfaceOnCancelListenerC5126d2 = this.f10450b;
                abstractDialogInterfaceOnCancelListenerC5126d2.mLifecycleFragment.startActivityForResult(GoogleApiActivity.m12964a(abstractDialogInterfaceOnCancelListenerC5126d2.getActivity(), (PendingIntent) C5276s.m13324j(m12998b.m10052w1()), this.f10449a.m12997a(), false), 1);
                return;
            }
            AbstractDialogInterfaceOnCancelListenerC5126d2 abstractDialogInterfaceOnCancelListenerC5126d22 = this.f10450b;
            if (abstractDialogInterfaceOnCancelListenerC5126d22.f10457d.mo10068b(abstractDialogInterfaceOnCancelListenerC5126d22.getActivity(), m12998b.m10050u1(), null) != null) {
                AbstractDialogInterfaceOnCancelListenerC5126d2 abstractDialogInterfaceOnCancelListenerC5126d23 = this.f10450b;
                abstractDialogInterfaceOnCancelListenerC5126d23.f10457d.m10084w(abstractDialogInterfaceOnCancelListenerC5126d23.getActivity(), this.f10450b.mLifecycleFragment, m12998b.m10050u1(), 2, this.f10450b);
            } else {
                if (m12998b.m10050u1() != 18) {
                    this.f10450b.m13025a(m12998b, this.f10449a.m12997a());
                    return;
                }
                AbstractDialogInterfaceOnCancelListenerC5126d2 abstractDialogInterfaceOnCancelListenerC5126d24 = this.f10450b;
                Dialog m10079r = abstractDialogInterfaceOnCancelListenerC5126d24.f10457d.m10079r(abstractDialogInterfaceOnCancelListenerC5126d24.getActivity(), this.f10450b);
                AbstractDialogInterfaceOnCancelListenerC5126d2 abstractDialogInterfaceOnCancelListenerC5126d25 = this.f10450b;
                abstractDialogInterfaceOnCancelListenerC5126d25.f10457d.m10080s(abstractDialogInterfaceOnCancelListenerC5126d25.getActivity().getApplicationContext(), new C5118b2(this, m10079r));
            }
        }
    }
}

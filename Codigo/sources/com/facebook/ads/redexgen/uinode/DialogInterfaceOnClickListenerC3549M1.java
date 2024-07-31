package com.facebook.ads.redexgen.uinode;

import android.content.DialogInterface;
import android.widget.EditText;
import java.util.concurrent.Executor;

/* renamed from: com.facebook.ads.redexgen.X.M1 */
/* loaded from: assets/audience_network.dex */
public class DialogInterfaceOnClickListenerC3549M1 implements DialogInterface.OnClickListener {
    public final /* synthetic */ EditText A00;
    public final /* synthetic */ C4077UY A01;

    public DialogInterfaceOnClickListenerC3549M1(C4077UY c4077uy, EditText editText) {
        this.A01 = c4077uy;
        this.A00 = editText;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public final void onClick(DialogInterface dialogInterface, int i10) {
        Executor executor;
        executor = this.A01.A03;
        executor.execute(new C4078UZ(this, dialogInterface));
    }
}

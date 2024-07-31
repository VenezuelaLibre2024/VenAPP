package com.facebook.ads.redexgen.uinode;

import android.content.DialogInterface;
import java.util.Map;

/* renamed from: com.facebook.ads.redexgen.X.UZ */
/* loaded from: assets/audience_network.dex */
public class C4078UZ extends AbstractRunnableC3455KT {
    public static String[] A02 = {"r", "tRYI", "7UJuVMqBcP2QEoAe5I9ReZPElv0qEy55", "leQvAr8Bdm", "IrxDcEzjLLQBxw", "x58zC904VQqUCNnuzCjkyAfM", "58DZzAqOGTGaE", "1xO3"};
    public final /* synthetic */ DialogInterface A00;
    public final /* synthetic */ DialogInterfaceOnClickListenerC3549M1 A01;

    public C4078UZ(DialogInterfaceOnClickListenerC3549M1 dialogInterfaceOnClickListenerC3549M1, DialogInterface dialogInterface) {
        this.A01 = dialogInterfaceOnClickListenerC3549M1;
        this.A00 = dialogInterface;
    }

    @Override // com.facebook.ads.redexgen.uinode.AbstractRunnableC3455KT
    public final void A06() {
        InterfaceC3878RK interfaceC3878RK;
        InterfaceC3878RK interfaceC3878RK2;
        C4336Ym c4336Ym;
        Map<? extends String, ? extends String> A022;
        interfaceC3878RK = this.A01.A01.A02;
        if (interfaceC3878RK != null) {
            interfaceC3878RK2 = this.A01.A01.A02;
            c4336Ym = this.A01.A01.A00;
            String A03 = AbstractC3436K9.A03(c4336Ym);
            C3892RY c3892ry = new C3892RY();
            A022 = this.A01.A01.A02(this.A01.A00.getText().toString());
            interfaceC3878RK2.ADz(A03, c3892ry.A05(A022).A08());
        }
        DialogInterface dialogInterface = this.A00;
        if (A02[6].length() != 13) {
            throw new RuntimeException();
        }
        A02[6] = "1hADnGgCLejuT";
        dialogInterface.cancel();
    }
}

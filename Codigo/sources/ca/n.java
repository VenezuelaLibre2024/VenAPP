package ca;

import android.app.AlertDialog;
import android.app.Dialog;
import android.content.Context;
import android.content.DialogInterface;
import android.os.Bundle;

/* loaded from: classes.dex */
public class n extends androidx.fragment.app.d {
    private Dialog B;
    private DialogInterface.OnCancelListener C;
    private Dialog D;

    public static n q(Dialog dialog, DialogInterface.OnCancelListener onCancelListener) {
        n nVar = new n();
        Dialog dialog2 = (Dialog) com.google.android.gms.common.internal.s.k(dialog, "Cannot display null dialog");
        dialog2.setOnCancelListener(null);
        dialog2.setOnDismissListener(null);
        nVar.B = dialog2;
        if (onCancelListener != null) {
            nVar.C = onCancelListener;
        }
        return nVar;
    }

    @Override // androidx.fragment.app.d
    public Dialog j(Bundle bundle) {
        Dialog dialog = this.B;
        if (dialog != null) {
            return dialog;
        }
        n(false);
        if (this.D == null) {
            this.D = new AlertDialog.Builder((Context) com.google.android.gms.common.internal.s.j(getContext())).create();
        }
        return this.D;
    }

    @Override // androidx.fragment.app.d, android.content.DialogInterface.OnCancelListener
    public void onCancel(DialogInterface dialogInterface) {
        DialogInterface.OnCancelListener onCancelListener = this.C;
        if (onCancelListener != null) {
            onCancelListener.onCancel(dialogInterface);
        }
    }

    @Override // androidx.fragment.app.d
    public void p(androidx.fragment.app.n nVar, String str) {
        super.p(nVar, str);
    }
}

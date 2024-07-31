package ca;

import android.app.AlertDialog;
import android.app.Dialog;
import android.content.Context;
import android.content.DialogInterface;
import android.os.Bundle;
import androidx.fragment.app.AbstractC1272n;
import androidx.fragment.app.DialogInterfaceOnCancelListenerC1261d;
import com.google.android.gms.common.internal.C5276s;

/* renamed from: ca.n */
/* loaded from: classes.dex */
public class C1918n extends DialogInterfaceOnCancelListenerC1261d {

    /* renamed from: B */
    private Dialog f7947B;

    /* renamed from: C */
    private DialogInterface.OnCancelListener f7948C;

    /* renamed from: D */
    private Dialog f7949D;

    /* renamed from: q */
    public static C1918n m10120q(Dialog dialog, DialogInterface.OnCancelListener onCancelListener) {
        C1918n c1918n = new C1918n();
        Dialog dialog2 = (Dialog) C5276s.m13325k(dialog, "Cannot display null dialog");
        dialog2.setOnCancelListener(null);
        dialog2.setOnDismissListener(null);
        c1918n.f7947B = dialog2;
        if (onCancelListener != null) {
            c1918n.f7948C = onCancelListener;
        }
        return c1918n;
    }

    @Override // androidx.fragment.app.DialogInterfaceOnCancelListenerC1261d
    /* renamed from: j */
    public Dialog mo6921j(Bundle bundle) {
        Dialog dialog = this.f7947B;
        if (dialog != null) {
            return dialog;
        }
        m6924n(false);
        if (this.f7949D == null) {
            this.f7949D = new AlertDialog.Builder((Context) C5276s.m13324j(getContext())).create();
        }
        return this.f7949D;
    }

    @Override // androidx.fragment.app.DialogInterfaceOnCancelListenerC1261d, android.content.DialogInterface.OnCancelListener
    public void onCancel(DialogInterface dialogInterface) {
        DialogInterface.OnCancelListener onCancelListener = this.f7948C;
        if (onCancelListener != null) {
            onCancelListener.onCancel(dialogInterface);
        }
    }

    @Override // androidx.fragment.app.DialogInterfaceOnCancelListenerC1261d
    /* renamed from: p */
    public void mo6926p(AbstractC1272n abstractC1272n, String str) {
        super.mo6926p(abstractC1272n, str);
    }
}

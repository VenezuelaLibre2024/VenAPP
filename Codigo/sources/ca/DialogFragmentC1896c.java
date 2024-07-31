package ca;

import android.app.AlertDialog;
import android.app.Dialog;
import android.app.DialogFragment;
import android.app.FragmentManager;
import android.content.Context;
import android.content.DialogInterface;
import android.os.Bundle;
import com.google.android.gms.common.internal.C5276s;

/* renamed from: ca.c */
/* loaded from: classes.dex */
public class DialogFragmentC1896c extends DialogFragment {

    /* renamed from: a */
    private Dialog f7896a;

    /* renamed from: b */
    private DialogInterface.OnCancelListener f7897b;

    /* renamed from: c */
    private Dialog f7898c;

    /* renamed from: a */
    public static DialogFragmentC1896c m10055a(Dialog dialog, DialogInterface.OnCancelListener onCancelListener) {
        DialogFragmentC1896c dialogFragmentC1896c = new DialogFragmentC1896c();
        Dialog dialog2 = (Dialog) C5276s.m13325k(dialog, "Cannot display null dialog");
        dialog2.setOnCancelListener(null);
        dialog2.setOnDismissListener(null);
        dialogFragmentC1896c.f7896a = dialog2;
        if (onCancelListener != null) {
            dialogFragmentC1896c.f7897b = onCancelListener;
        }
        return dialogFragmentC1896c;
    }

    @Override // android.app.DialogFragment, android.content.DialogInterface.OnCancelListener
    public void onCancel(DialogInterface dialogInterface) {
        DialogInterface.OnCancelListener onCancelListener = this.f7897b;
        if (onCancelListener != null) {
            onCancelListener.onCancel(dialogInterface);
        }
    }

    @Override // android.app.DialogFragment
    public Dialog onCreateDialog(Bundle bundle) {
        Dialog dialog = this.f7896a;
        if (dialog != null) {
            return dialog;
        }
        setShowsDialog(false);
        if (this.f7898c == null) {
            this.f7898c = new AlertDialog.Builder((Context) C5276s.m13324j(getActivity())).create();
        }
        return this.f7898c;
    }

    @Override // android.app.DialogFragment
    public void show(FragmentManager fragmentManager, String str) {
        super.show(fragmentManager, str);
    }
}

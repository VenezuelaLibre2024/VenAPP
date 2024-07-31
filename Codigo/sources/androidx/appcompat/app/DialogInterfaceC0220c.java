package androidx.appcompat.app;

import android.content.Context;
import android.content.DialogInterface;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.util.TypedValue;
import android.view.ContextThemeWrapper;
import android.view.KeyEvent;
import android.view.View;
import android.widget.ListAdapter;
import android.widget.ListView;
import androidx.appcompat.app.AlertController;
import p111g.C7377a;

/* renamed from: androidx.appcompat.app.c */
/* loaded from: classes.dex */
public class DialogInterfaceC0220c extends DialogC0230m implements DialogInterface {

    /* renamed from: f */
    final AlertController f858f;

    /* renamed from: androidx.appcompat.app.c$a */
    /* loaded from: classes.dex */
    public static class a {

        /* renamed from: a */
        private final AlertController.C0215b f859a;

        /* renamed from: b */
        private final int f860b;

        public a(Context context) {
            this(context, DialogInterfaceC0220c.m904i(context, 0));
        }

        public a(Context context, int i10) {
            this.f859a = new AlertController.C0215b(new ContextThemeWrapper(context, DialogInterfaceC0220c.m904i(context, i10)));
            this.f860b = i10;
        }

        /* renamed from: a */
        public a m907a(ListAdapter listAdapter, DialogInterface.OnClickListener onClickListener) {
            AlertController.C0215b c0215b = this.f859a;
            c0215b.f840w = listAdapter;
            c0215b.f841x = onClickListener;
            return this;
        }

        /* renamed from: b */
        public a m908b(View view) {
            this.f859a.f824g = view;
            return this;
        }

        /* renamed from: c */
        public a m909c(Drawable drawable) {
            this.f859a.f821d = drawable;
            return this;
        }

        public DialogInterfaceC0220c create() {
            DialogInterfaceC0220c dialogInterfaceC0220c = new DialogInterfaceC0220c(this.f859a.f818a, this.f860b);
            this.f859a.m877a(dialogInterfaceC0220c.f858f);
            dialogInterfaceC0220c.setCancelable(this.f859a.f835r);
            if (this.f859a.f835r) {
                dialogInterfaceC0220c.setCanceledOnTouchOutside(true);
            }
            dialogInterfaceC0220c.setOnCancelListener(this.f859a.f836s);
            dialogInterfaceC0220c.setOnDismissListener(this.f859a.f837t);
            DialogInterface.OnKeyListener onKeyListener = this.f859a.f838u;
            if (onKeyListener != null) {
                dialogInterfaceC0220c.setOnKeyListener(onKeyListener);
            }
            return dialogInterfaceC0220c;
        }

        /* renamed from: d */
        public a m910d(CharSequence charSequence) {
            this.f859a.f825h = charSequence;
            return this;
        }

        /* renamed from: e */
        public a m911e(CharSequence charSequence, DialogInterface.OnClickListener onClickListener) {
            AlertController.C0215b c0215b = this.f859a;
            c0215b.f829l = charSequence;
            c0215b.f831n = onClickListener;
            return this;
        }

        /* renamed from: f */
        public a m912f(DialogInterface.OnCancelListener onCancelListener) {
            this.f859a.f836s = onCancelListener;
            return this;
        }

        /* renamed from: g */
        public a m913g(DialogInterface.OnKeyListener onKeyListener) {
            this.f859a.f838u = onKeyListener;
            return this;
        }

        public Context getContext() {
            return this.f859a.f818a;
        }

        /* renamed from: h */
        public a m914h(CharSequence charSequence, DialogInterface.OnClickListener onClickListener) {
            AlertController.C0215b c0215b = this.f859a;
            c0215b.f826i = charSequence;
            c0215b.f828k = onClickListener;
            return this;
        }

        /* renamed from: i */
        public a m915i(ListAdapter listAdapter, int i10, DialogInterface.OnClickListener onClickListener) {
            AlertController.C0215b c0215b = this.f859a;
            c0215b.f840w = listAdapter;
            c0215b.f841x = onClickListener;
            c0215b.f811I = i10;
            c0215b.f810H = true;
            return this;
        }

        public a setNegativeButton(int i10, DialogInterface.OnClickListener onClickListener) {
            AlertController.C0215b c0215b = this.f859a;
            c0215b.f829l = c0215b.f818a.getText(i10);
            this.f859a.f831n = onClickListener;
            return this;
        }

        public a setPositiveButton(int i10, DialogInterface.OnClickListener onClickListener) {
            AlertController.C0215b c0215b = this.f859a;
            c0215b.f826i = c0215b.f818a.getText(i10);
            this.f859a.f828k = onClickListener;
            return this;
        }

        public a setTitle(CharSequence charSequence) {
            this.f859a.f823f = charSequence;
            return this;
        }

        public a setView(View view) {
            AlertController.C0215b c0215b = this.f859a;
            c0215b.f843z = view;
            c0215b.f842y = 0;
            c0215b.f807E = false;
            return this;
        }
    }

    protected DialogInterfaceC0220c(Context context, int i10) {
        super(context, m904i(context, i10));
        this.f858f = new AlertController(getContext(), this, getWindow());
    }

    /* renamed from: i */
    static int m904i(Context context, int i10) {
        if (((i10 >>> 24) & 255) >= 1) {
            return i10;
        }
        TypedValue typedValue = new TypedValue();
        context.getTheme().resolveAttribute(C7377a.f16711o, typedValue, true);
        return typedValue.resourceId;
    }

    /* renamed from: h */
    public ListView m905h() {
        return this.f858f.m862d();
    }

    /* renamed from: j */
    public void m906j(View view) {
        this.f858f.m873r(view);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // androidx.appcompat.app.DialogC0230m, androidx.activity.DialogC0193h, android.app.Dialog
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        this.f858f.m863e();
    }

    @Override // android.app.Dialog, android.view.KeyEvent.Callback
    public boolean onKeyDown(int i10, KeyEvent keyEvent) {
        if (this.f858f.m864f(i10, keyEvent)) {
            return true;
        }
        return super.onKeyDown(i10, keyEvent);
    }

    @Override // android.app.Dialog, android.view.KeyEvent.Callback
    public boolean onKeyUp(int i10, KeyEvent keyEvent) {
        if (this.f858f.m865g(i10, keyEvent)) {
            return true;
        }
        return super.onKeyUp(i10, keyEvent);
    }

    @Override // androidx.appcompat.app.DialogC0230m, android.app.Dialog
    public void setTitle(CharSequence charSequence) {
        super.setTitle(charSequence);
        this.f858f.m871p(charSequence);
    }
}

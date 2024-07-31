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

/* loaded from: classes.dex */
public class c extends m implements DialogInterface {

    /* renamed from: f, reason: collision with root package name */
    final AlertController f759f;

    /* loaded from: classes.dex */
    public static class a {

        /* renamed from: a, reason: collision with root package name */
        private final AlertController.b f760a;

        /* renamed from: b, reason: collision with root package name */
        private final int f761b;

        public a(Context context) {
            this(context, c.i(context, 0));
        }

        public a(Context context, int i10) {
            this.f760a = new AlertController.b(new ContextThemeWrapper(context, c.i(context, i10)));
            this.f761b = i10;
        }

        public a a(ListAdapter listAdapter, DialogInterface.OnClickListener onClickListener) {
            AlertController.b bVar = this.f760a;
            bVar.f741w = listAdapter;
            bVar.f742x = onClickListener;
            return this;
        }

        public a b(View view) {
            this.f760a.f725g = view;
            return this;
        }

        public a c(Drawable drawable) {
            this.f760a.f722d = drawable;
            return this;
        }

        public c create() {
            c cVar = new c(this.f760a.f719a, this.f761b);
            this.f760a.a(cVar.f759f);
            cVar.setCancelable(this.f760a.f736r);
            if (this.f760a.f736r) {
                cVar.setCanceledOnTouchOutside(true);
            }
            cVar.setOnCancelListener(this.f760a.f737s);
            cVar.setOnDismissListener(this.f760a.f738t);
            DialogInterface.OnKeyListener onKeyListener = this.f760a.f739u;
            if (onKeyListener != null) {
                cVar.setOnKeyListener(onKeyListener);
            }
            return cVar;
        }

        public a d(CharSequence charSequence) {
            this.f760a.f726h = charSequence;
            return this;
        }

        public a e(CharSequence charSequence, DialogInterface.OnClickListener onClickListener) {
            AlertController.b bVar = this.f760a;
            bVar.f730l = charSequence;
            bVar.f732n = onClickListener;
            return this;
        }

        public a f(DialogInterface.OnCancelListener onCancelListener) {
            this.f760a.f737s = onCancelListener;
            return this;
        }

        public a g(DialogInterface.OnKeyListener onKeyListener) {
            this.f760a.f739u = onKeyListener;
            return this;
        }

        public Context getContext() {
            return this.f760a.f719a;
        }

        public a h(CharSequence charSequence, DialogInterface.OnClickListener onClickListener) {
            AlertController.b bVar = this.f760a;
            bVar.f727i = charSequence;
            bVar.f729k = onClickListener;
            return this;
        }

        public a i(ListAdapter listAdapter, int i10, DialogInterface.OnClickListener onClickListener) {
            AlertController.b bVar = this.f760a;
            bVar.f741w = listAdapter;
            bVar.f742x = onClickListener;
            bVar.I = i10;
            bVar.H = true;
            return this;
        }

        public a setNegativeButton(int i10, DialogInterface.OnClickListener onClickListener) {
            AlertController.b bVar = this.f760a;
            bVar.f730l = bVar.f719a.getText(i10);
            this.f760a.f732n = onClickListener;
            return this;
        }

        public a setPositiveButton(int i10, DialogInterface.OnClickListener onClickListener) {
            AlertController.b bVar = this.f760a;
            bVar.f727i = bVar.f719a.getText(i10);
            this.f760a.f729k = onClickListener;
            return this;
        }

        public a setTitle(CharSequence charSequence) {
            this.f760a.f724f = charSequence;
            return this;
        }

        public a setView(View view) {
            AlertController.b bVar = this.f760a;
            bVar.f744z = view;
            bVar.f743y = 0;
            bVar.E = false;
            return this;
        }
    }

    protected c(Context context, int i10) {
        super(context, i(context, i10));
        this.f759f = new AlertController(getContext(), this, getWindow());
    }

    static int i(Context context, int i10) {
        if (((i10 >>> 24) & 255) >= 1) {
            return i10;
        }
        TypedValue typedValue = new TypedValue();
        context.getTheme().resolveAttribute(g.a.f15275o, typedValue, true);
        return typedValue.resourceId;
    }

    public ListView h() {
        return this.f759f.d();
    }

    public void j(View view) {
        this.f759f.r(view);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // androidx.appcompat.app.m, androidx.activity.h, android.app.Dialog
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        this.f759f.e();
    }

    @Override // android.app.Dialog, android.view.KeyEvent.Callback
    public boolean onKeyDown(int i10, KeyEvent keyEvent) {
        if (this.f759f.f(i10, keyEvent)) {
            return true;
        }
        return super.onKeyDown(i10, keyEvent);
    }

    @Override // android.app.Dialog, android.view.KeyEvent.Callback
    public boolean onKeyUp(int i10, KeyEvent keyEvent) {
        if (this.f759f.g(i10, keyEvent)) {
            return true;
        }
        return super.onKeyUp(i10, keyEvent);
    }

    @Override // androidx.appcompat.app.m, android.app.Dialog
    public void setTitle(CharSequence charSequence) {
        super.setTitle(charSequence);
        this.f759f.p(charSequence);
    }
}

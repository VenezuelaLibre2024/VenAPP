package com.google.android.gms.dynamic;

import android.R;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.google.android.gms.common.internal.f0;
import com.google.android.gms.dynamic.c;
import java.util.LinkedList;

/* loaded from: classes.dex */
public abstract class a<T extends c> {

    /* renamed from: a, reason: collision with root package name */
    private c f9706a;

    /* renamed from: b, reason: collision with root package name */
    private Bundle f9707b;

    /* renamed from: c, reason: collision with root package name */
    private LinkedList f9708c;

    /* renamed from: d, reason: collision with root package name */
    private final e f9709d = new g(this);

    public static void i(FrameLayout frameLayout) {
        ca.f n10 = ca.f.n();
        Context context = frameLayout.getContext();
        int g10 = n10.g(context);
        String d10 = f0.d(context, g10);
        String c10 = f0.c(context, g10);
        LinearLayout linearLayout = new LinearLayout(frameLayout.getContext());
        linearLayout.setOrientation(1);
        linearLayout.setLayoutParams(new FrameLayout.LayoutParams(-2, -2));
        frameLayout.addView(linearLayout);
        TextView textView = new TextView(frameLayout.getContext());
        textView.setLayoutParams(new FrameLayout.LayoutParams(-2, -2));
        textView.setText(d10);
        linearLayout.addView(textView);
        Intent b10 = n10.b(context, g10, null);
        if (b10 != null) {
            Button button = new Button(context);
            button.setId(R.id.button1);
            button.setLayoutParams(new FrameLayout.LayoutParams(-2, -2));
            button.setText(c10);
            linearLayout.addView(button);
            button.setOnClickListener(new i(context, b10));
        }
    }

    private final void n(int i10) {
        while (!this.f9708c.isEmpty() && ((l) this.f9708c.getLast()).a() >= i10) {
            this.f9708c.removeLast();
        }
    }

    private final void o(Bundle bundle, l lVar) {
        c cVar = this.f9706a;
        if (cVar != null) {
            lVar.b(cVar);
            return;
        }
        if (this.f9708c == null) {
            this.f9708c = new LinkedList();
        }
        this.f9708c.add(lVar);
        if (bundle != null) {
            Bundle bundle2 = this.f9707b;
            if (bundle2 == null) {
                this.f9707b = (Bundle) bundle.clone();
            } else {
                bundle2.putAll(bundle);
            }
        }
        a(this.f9709d);
    }

    protected abstract void a(e<T> eVar);

    public T b() {
        return (T) this.f9706a;
    }

    public void c(Bundle bundle) {
        o(bundle, new h(this, bundle));
    }

    public void d() {
        c cVar = this.f9706a;
        if (cVar != null) {
            cVar.onDestroy();
        } else {
            n(1);
        }
    }

    public void e() {
        o(null, new k(this));
    }

    public void f(Bundle bundle) {
        c cVar = this.f9706a;
        if (cVar != null) {
            cVar.onSaveInstanceState(bundle);
            return;
        }
        Bundle bundle2 = this.f9707b;
        if (bundle2 != null) {
            bundle.putAll(bundle2);
        }
    }

    public void g() {
        o(null, new j(this));
    }

    public void h() {
        c cVar = this.f9706a;
        if (cVar != null) {
            cVar.onStop();
        } else {
            n(4);
        }
    }
}

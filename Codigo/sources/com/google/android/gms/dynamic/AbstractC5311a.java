package com.google.android.gms.dynamic;

import android.R;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.TextView;
import ca.C1902f;
import com.google.android.gms.common.internal.C5238f0;
import com.google.android.gms.dynamic.InterfaceC5313c;
import java.util.LinkedList;

/* renamed from: com.google.android.gms.dynamic.a */
/* loaded from: classes.dex */
public abstract class AbstractC5311a<T extends InterfaceC5313c> {

    /* renamed from: a */
    private InterfaceC5313c f10821a;

    /* renamed from: b */
    private Bundle f10822b;

    /* renamed from: c */
    private LinkedList f10823c;

    /* renamed from: d */
    private final InterfaceC5315e f10824d = new C5317g(this);

    /* renamed from: i */
    public static void m13395i(FrameLayout frameLayout) {
        C1902f m10067n = C1902f.m10067n();
        Context context = frameLayout.getContext();
        int mo10071g = m10067n.mo10071g(context);
        String m13256d = C5238f0.m13256d(context, mo10071g);
        String m13255c = C5238f0.m13255c(context, mo10071g);
        LinearLayout linearLayout = new LinearLayout(frameLayout.getContext());
        linearLayout.setOrientation(1);
        linearLayout.setLayoutParams(new FrameLayout.LayoutParams(-2, -2));
        frameLayout.addView(linearLayout);
        TextView textView = new TextView(frameLayout.getContext());
        textView.setLayoutParams(new FrameLayout.LayoutParams(-2, -2));
        textView.setText(m13256d);
        linearLayout.addView(textView);
        Intent mo10068b = m10067n.mo10068b(context, mo10071g, null);
        if (mo10068b != null) {
            Button button = new Button(context);
            button.setId(R.id.button1);
            button.setLayoutParams(new FrameLayout.LayoutParams(-2, -2));
            button.setText(m13255c);
            linearLayout.addView(button);
            button.setOnClickListener(new ViewOnClickListenerC5319i(context, mo10068b));
        }
    }

    /* renamed from: n */
    private final void m13400n(int i10) {
        while (!this.f10823c.isEmpty() && ((InterfaceC5322l) this.f10823c.getLast()).mo13414a() >= i10) {
            this.f10823c.removeLast();
        }
    }

    /* renamed from: o */
    private final void m13401o(Bundle bundle, InterfaceC5322l interfaceC5322l) {
        InterfaceC5313c interfaceC5313c = this.f10821a;
        if (interfaceC5313c != null) {
            interfaceC5322l.mo13415b(interfaceC5313c);
            return;
        }
        if (this.f10823c == null) {
            this.f10823c = new LinkedList();
        }
        this.f10823c.add(interfaceC5322l);
        if (bundle != null) {
            Bundle bundle2 = this.f10822b;
            if (bundle2 == null) {
                this.f10822b = (Bundle) bundle.clone();
            } else {
                bundle2.putAll(bundle);
            }
        }
        mo13402a(this.f10824d);
    }

    /* renamed from: a */
    protected abstract void mo13402a(InterfaceC5315e<T> interfaceC5315e);

    /* renamed from: b */
    public T m13403b() {
        return (T) this.f10821a;
    }

    /* renamed from: c */
    public void m13404c(Bundle bundle) {
        m13401o(bundle, new C5318h(this, bundle));
    }

    /* renamed from: d */
    public void m13405d() {
        InterfaceC5313c interfaceC5313c = this.f10821a;
        if (interfaceC5313c != null) {
            interfaceC5313c.onDestroy();
        } else {
            m13400n(1);
        }
    }

    /* renamed from: e */
    public void m13406e() {
        m13401o(null, new C5321k(this));
    }

    /* renamed from: f */
    public void m13407f(Bundle bundle) {
        InterfaceC5313c interfaceC5313c = this.f10821a;
        if (interfaceC5313c != null) {
            interfaceC5313c.onSaveInstanceState(bundle);
            return;
        }
        Bundle bundle2 = this.f10822b;
        if (bundle2 != null) {
            bundle.putAll(bundle2);
        }
    }

    /* renamed from: g */
    public void m13408g() {
        m13401o(null, new C5320j(this));
    }

    /* renamed from: h */
    public void m13409h() {
        InterfaceC5313c interfaceC5313c = this.f10821a;
        if (interfaceC5313c != null) {
            interfaceC5313c.onStop();
        } else {
            m13400n(4);
        }
    }
}

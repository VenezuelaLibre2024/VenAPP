package com.facebook.ads.redexgen.uinode;

import android.app.Activity;
import android.content.Context;
import android.content.ContextWrapper;
import com.facebook.ads.internal.context.Repairable;
import java.lang.ref.WeakReference;
import java.util.Map;
import java.util.WeakHashMap;
import java.util.concurrent.atomic.AtomicReference;

/* renamed from: com.facebook.ads.redexgen.X.Yn */
/* loaded from: assets/audience_network.dex */
public class C4337Yn extends C26937f {
    public static String[] A06 = {"X2XwTp9cKPrsKt8nnsNrr4kzY8H6fo9U", "SYDx4pa2oLtOnCxt4l9slcAsJVX17", "Ktbncp6BUHUyG8VpVa87zDZ4pVgXb", "697llskWaiD0", "zjkPaZGeICZRQbBHOdPJm8zqRs5ofq42", "OjtN7hHvLZrci2lMJuqCcc7IsxYWRGMj", "Pfr7ktMWLkOUKtldLLax33ooDo", "AIe8uS1x9EYXvM4HhYe86uhhSayJeZWe"};
    public WeakReference<Activity> A00;
    public WeakHashMap<Repairable, Boolean> A01;
    public final C26907c A02;
    public final AtomicReference<Object> A03;
    public final AtomicReference<Object> A04;
    public final AtomicReference<InterfaceC22640S> A05;

    public C4337Yn(Activity activity, InterfaceC26957h interfaceC26957h, InterfaceC22640S interfaceC22640S) {
        super(activity.getApplicationContext(), interfaceC26957h);
        this.A01 = new WeakHashMap<>();
        AtomicReference<InterfaceC22640S> atomicReference = new AtomicReference<>();
        this.A05 = atomicReference;
        this.A03 = new AtomicReference<>();
        this.A02 = new C26907c();
        this.A04 = new AtomicReference<>();
        atomicReference.set(interfaceC22640S);
        this.A00 = new WeakReference<>(activity);
    }

    public C4337Yn(Context context, InterfaceC26957h interfaceC26957h, InterfaceC22640S interfaceC22640S) {
        super(context.getApplicationContext(), interfaceC26957h);
        this.A01 = new WeakHashMap<>();
        AtomicReference<InterfaceC22640S> atomicReference = new AtomicReference<>();
        this.A05 = atomicReference;
        this.A03 = new AtomicReference<>();
        this.A02 = new C26907c();
        this.A04 = new AtomicReference<>();
        atomicReference.set(interfaceC22640S);
        Activity A00 = A00(context);
        if (A00 != null) {
            this.A00 = new WeakReference<>(A00);
        } else {
            this.A00 = new WeakReference<>(null);
        }
    }

    public static Activity A00(Context context) {
        while (true) {
            boolean z10 = context instanceof ContextWrapper;
            if (A06[3].length() != 12) {
                throw new RuntimeException();
            }
            A06[6] = "yJQbBA22nGzLcakEAa6nG1va8g";
            if (z10) {
                if (context instanceof Activity) {
                    return (Activity) context;
                }
                if ((context instanceof C4337Yn) && ((C4337Yn) context).A0D() != null) {
                    return ((C4337Yn) context).A0D();
                }
                context = ((ContextWrapper) context).getBaseContext();
            } else {
                return null;
            }
        }
    }

    public final Activity A0D() {
        return this.A00.get();
    }

    public InterfaceC22640S A0E() {
        InterfaceC22640S funnel = this.A05.get();
        if (funnel == null) {
            return new C4508bb();
        }
        return funnel;
    }

    public final C26907c A0F() {
        return this.A02;
    }

    public final Object A0G() {
        return this.A03.get();
    }

    public final Object A0H() {
        return this.A04.get();
    }

    public final void A0I(Activity activity) {
        this.A00 = new WeakReference<>(activity);
    }

    public final void A0J(InterfaceC22640S interfaceC22640S) {
        this.A05.set(interfaceC22640S);
    }

    public final void A0K(C4337Yn c4337Yn) {
        c4337Yn.A01.putAll(this.A01);
        this.A01 = c4337Yn.A01;
    }

    public final void A0L(Repairable repairable) {
        this.A01.put(repairable, true);
    }

    public final void A0M(Object obj) {
        this.A03.set(obj);
    }

    public final void A0N(Object obj) {
        this.A04.set(obj);
    }

    public final void A0O(Throwable th2) {
        for (Map.Entry<Repairable, Boolean> entry : this.A01.entrySet()) {
            if (A06[3].length() != 12) {
                throw new RuntimeException();
            }
            A06[7] = "uNK1zxgBt2FFcnYPdsvApaChXeSIkfOy";
            entry.getKey().repair(th2);
        }
    }
}

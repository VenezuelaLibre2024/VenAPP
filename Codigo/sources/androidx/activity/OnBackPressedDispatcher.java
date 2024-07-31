package androidx.activity;

import android.os.Build;
import android.window.OnBackInvokedCallback;
import android.window.OnBackInvokedDispatcher;
import androidx.activity.OnBackPressedDispatcher;
import androidx.lifecycle.f;
import ck.v;
import java.util.Collection;
import java.util.Iterator;
import java.util.ListIterator;

/* loaded from: classes.dex */
public final class OnBackPressedDispatcher {

    /* renamed from: a */
    private final Runnable f619a;

    /* renamed from: b */
    private final dk.h<l> f620b = new dk.h<>();

    /* renamed from: c */
    private ok.a<v> f621c;

    /* renamed from: d */
    private OnBackInvokedCallback f622d;

    /* renamed from: e */
    private OnBackInvokedDispatcher f623e;

    /* renamed from: f */
    private boolean f624f;

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes.dex */
    public final class LifecycleOnBackPressedCancellable implements androidx.lifecycle.i, androidx.activity.a {

        /* renamed from: a */
        private final androidx.lifecycle.f f625a;

        /* renamed from: b */
        private final l f626b;

        /* renamed from: c */
        private androidx.activity.a f627c;

        /* renamed from: d */
        final /* synthetic */ OnBackPressedDispatcher f628d;

        public LifecycleOnBackPressedCancellable(OnBackPressedDispatcher onBackPressedDispatcher, androidx.lifecycle.f lifecycle, l onBackPressedCallback) {
            kotlin.jvm.internal.n.e(lifecycle, "lifecycle");
            kotlin.jvm.internal.n.e(onBackPressedCallback, "onBackPressedCallback");
            this.f628d = onBackPressedDispatcher;
            this.f625a = lifecycle;
            this.f626b = onBackPressedCallback;
            lifecycle.a(this);
        }

        @Override // androidx.activity.a
        public void cancel() {
            this.f625a.c(this);
            this.f626b.removeCancellable(this);
            androidx.activity.a aVar = this.f627c;
            if (aVar != null) {
                aVar.cancel();
            }
            this.f627c = null;
        }

        @Override // androidx.lifecycle.i
        public void onStateChanged(androidx.lifecycle.k source, f.a event) {
            kotlin.jvm.internal.n.e(source, "source");
            kotlin.jvm.internal.n.e(event, "event");
            if (event == f.a.ON_START) {
                this.f627c = this.f628d.c(this.f626b);
                return;
            }
            if (event != f.a.ON_STOP) {
                if (event == f.a.ON_DESTROY) {
                    cancel();
                }
            } else {
                androidx.activity.a aVar = this.f627c;
                if (aVar != null) {
                    aVar.cancel();
                }
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public static final class a extends kotlin.jvm.internal.o implements ok.a<v> {
        a() {
            super(0);
        }

        public final void a() {
            OnBackPressedDispatcher.this.g();
        }

        @Override // ok.a
        public /* bridge */ /* synthetic */ v invoke() {
            a();
            return v.f7137a;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public static final class b extends kotlin.jvm.internal.o implements ok.a<v> {
        b() {
            super(0);
        }

        public final void a() {
            OnBackPressedDispatcher.this.e();
        }

        @Override // ok.a
        public /* bridge */ /* synthetic */ v invoke() {
            a();
            return v.f7137a;
        }
    }

    /* loaded from: classes.dex */
    public static final class c {

        /* renamed from: a */
        public static final c f631a = new c();

        private c() {
        }

        public static final void c(ok.a onBackInvoked) {
            kotlin.jvm.internal.n.e(onBackInvoked, "$onBackInvoked");
            onBackInvoked.invoke();
        }

        public final OnBackInvokedCallback b(ok.a<v> onBackInvoked) {
            kotlin.jvm.internal.n.e(onBackInvoked, "onBackInvoked");
            return new OnBackInvokedCallback() { // from class: androidx.activity.m
                public /* synthetic */ m() {
                }

                @Override // android.window.OnBackInvokedCallback
                public final void onBackInvoked() {
                    OnBackPressedDispatcher.c.c(ok.a.this);
                }
            };
        }

        public final void d(Object dispatcher, int i10, Object callback) {
            kotlin.jvm.internal.n.e(dispatcher, "dispatcher");
            kotlin.jvm.internal.n.e(callback, "callback");
            ((OnBackInvokedDispatcher) dispatcher).registerOnBackInvokedCallback(i10, (OnBackInvokedCallback) callback);
        }

        public final void e(Object dispatcher, Object callback) {
            kotlin.jvm.internal.n.e(dispatcher, "dispatcher");
            kotlin.jvm.internal.n.e(callback, "callback");
            ((OnBackInvokedDispatcher) dispatcher).unregisterOnBackInvokedCallback((OnBackInvokedCallback) callback);
        }
    }

    /* loaded from: classes.dex */
    public final class d implements androidx.activity.a {

        /* renamed from: a */
        private final l f632a;

        /* renamed from: b */
        final /* synthetic */ OnBackPressedDispatcher f633b;

        public d(OnBackPressedDispatcher onBackPressedDispatcher, l onBackPressedCallback) {
            kotlin.jvm.internal.n.e(onBackPressedCallback, "onBackPressedCallback");
            this.f633b = onBackPressedDispatcher;
            this.f632a = onBackPressedCallback;
        }

        @Override // androidx.activity.a
        public void cancel() {
            this.f633b.f620b.remove(this.f632a);
            this.f632a.removeCancellable(this);
            if (Build.VERSION.SDK_INT >= 33) {
                this.f632a.setEnabledChangedCallback$activity_release(null);
                this.f633b.g();
            }
        }
    }

    public OnBackPressedDispatcher(Runnable runnable) {
        this.f619a = runnable;
        if (Build.VERSION.SDK_INT >= 33) {
            this.f621c = new a();
            this.f622d = c.f631a.b(new b());
        }
    }

    public final void b(androidx.lifecycle.k owner, l onBackPressedCallback) {
        kotlin.jvm.internal.n.e(owner, "owner");
        kotlin.jvm.internal.n.e(onBackPressedCallback, "onBackPressedCallback");
        androidx.lifecycle.f lifecycle = owner.getLifecycle();
        if (lifecycle.b() == f.b.DESTROYED) {
            return;
        }
        onBackPressedCallback.addCancellable(new LifecycleOnBackPressedCancellable(this, lifecycle, onBackPressedCallback));
        if (Build.VERSION.SDK_INT >= 33) {
            g();
            onBackPressedCallback.setEnabledChangedCallback$activity_release(this.f621c);
        }
    }

    public final androidx.activity.a c(l onBackPressedCallback) {
        kotlin.jvm.internal.n.e(onBackPressedCallback, "onBackPressedCallback");
        this.f620b.add(onBackPressedCallback);
        d dVar = new d(this, onBackPressedCallback);
        onBackPressedCallback.addCancellable(dVar);
        if (Build.VERSION.SDK_INT >= 33) {
            g();
            onBackPressedCallback.setEnabledChangedCallback$activity_release(this.f621c);
        }
        return dVar;
    }

    public final boolean d() {
        dk.h<l> hVar = this.f620b;
        if ((hVar instanceof Collection) && hVar.isEmpty()) {
            return false;
        }
        Iterator<l> it = hVar.iterator();
        while (it.hasNext()) {
            if (it.next().isEnabled()) {
                return true;
            }
        }
        return false;
    }

    public final void e() {
        l lVar;
        dk.h<l> hVar = this.f620b;
        ListIterator<l> listIterator = hVar.listIterator(hVar.size());
        while (true) {
            if (!listIterator.hasPrevious()) {
                lVar = null;
                break;
            } else {
                lVar = listIterator.previous();
                if (lVar.isEnabled()) {
                    break;
                }
            }
        }
        l lVar2 = lVar;
        if (lVar2 != null) {
            lVar2.handleOnBackPressed();
            return;
        }
        Runnable runnable = this.f619a;
        if (runnable != null) {
            runnable.run();
        }
    }

    public final void f(OnBackInvokedDispatcher invoker) {
        kotlin.jvm.internal.n.e(invoker, "invoker");
        this.f623e = invoker;
        g();
    }

    public final void g() {
        boolean d10 = d();
        OnBackInvokedDispatcher onBackInvokedDispatcher = this.f623e;
        OnBackInvokedCallback onBackInvokedCallback = this.f622d;
        if (onBackInvokedDispatcher == null || onBackInvokedCallback == null) {
            return;
        }
        if (d10 && !this.f624f) {
            c.f631a.d(onBackInvokedDispatcher, 0, onBackInvokedCallback);
            this.f624f = true;
        } else {
            if (d10 || !this.f624f) {
                return;
            }
            c.f631a.e(onBackInvokedDispatcher, onBackInvokedCallback);
            this.f624f = false;
        }
    }
}

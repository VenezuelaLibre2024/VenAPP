package androidx.loader.app;

import android.os.Bundle;
import android.os.Looper;
import android.util.Log;
import androidx.collection.C0739i;
import androidx.core.util.C0978b;
import androidx.lifecycle.AbstractC1303g0;
import androidx.lifecycle.C1305h0;
import androidx.lifecycle.C1309j0;
import androidx.lifecycle.C1320r;
import androidx.lifecycle.InterfaceC1310k;
import androidx.lifecycle.InterfaceC1321s;
import androidx.loader.app.AbstractC1329a;
import com.google.android.libraries.barhopper.RecognitionOptions;
import java.io.FileDescriptor;
import java.io.PrintWriter;
import java.lang.reflect.Modifier;
import p169j1.C8938b;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: androidx.loader.app.b */
/* loaded from: classes.dex */
public class C1330b extends AbstractC1329a {

    /* renamed from: c */
    static boolean f5747c = false;

    /* renamed from: a */
    private final InterfaceC1310k f5748a;

    /* renamed from: b */
    private final c f5749b;

    /* renamed from: androidx.loader.app.b$a */
    /* loaded from: classes.dex */
    public static class a<D> extends C1320r<D> implements C8938b.a<D> {

        /* renamed from: a */
        private final int f5750a;

        /* renamed from: b */
        private final Bundle f5751b;

        /* renamed from: c */
        private final C8938b<D> f5752c;

        /* renamed from: d */
        private InterfaceC1310k f5753d;

        /* renamed from: e */
        private b<D> f5754e;

        /* renamed from: f */
        private C8938b<D> f5755f;

        a(int i10, Bundle bundle, C8938b<D> c8938b, C8938b<D> c8938b2) {
            this.f5750a = i10;
            this.f5751b = bundle;
            this.f5752c = c8938b;
            this.f5755f = c8938b2;
            c8938b.m26134q(i10, this);
        }

        @Override // p169j1.C8938b.a
        /* renamed from: a */
        public void mo7419a(C8938b<D> c8938b, D d10) {
            if (C1330b.f5747c) {
                Log.v("LoaderManager", "onLoadComplete: " + this);
            }
            if (Looper.myLooper() == Looper.getMainLooper()) {
                setValue(d10);
                return;
            }
            if (C1330b.f5747c) {
                Log.w("LoaderManager", "onLoadComplete was incorrectly called on a background thread");
            }
            postValue(d10);
        }

        /* renamed from: b */
        C8938b<D> m7420b(boolean z10) {
            if (C1330b.f5747c) {
                Log.v("LoaderManager", "  Destroying: " + this);
            }
            this.f5752c.m26122b();
            this.f5752c.m26121a();
            b<D> bVar = this.f5754e;
            if (bVar != null) {
                removeObserver(bVar);
                if (z10) {
                    bVar.m7427d();
                }
            }
            this.f5752c.m26139v(this);
            if ((bVar == null || bVar.m7426c()) && !z10) {
                return this.f5752c;
            }
            this.f5752c.m26135r();
            return this.f5755f;
        }

        /* renamed from: c */
        public void m7421c(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
            printWriter.print(str);
            printWriter.print("mId=");
            printWriter.print(this.f5750a);
            printWriter.print(" mArgs=");
            printWriter.println(this.f5751b);
            printWriter.print(str);
            printWriter.print("mLoader=");
            printWriter.println(this.f5752c);
            this.f5752c.mo26110g(str + "  ", fileDescriptor, printWriter, strArr);
            if (this.f5754e != null) {
                printWriter.print(str);
                printWriter.print("mCallbacks=");
                printWriter.println(this.f5754e);
                this.f5754e.m7425b(str + "  ", printWriter);
            }
            printWriter.print(str);
            printWriter.print("mData=");
            printWriter.println(m7422d().m26124d(getValue()));
            printWriter.print(str);
            printWriter.print("mStarted=");
            printWriter.println(hasActiveObservers());
        }

        /* renamed from: d */
        C8938b<D> m7422d() {
            return this.f5752c;
        }

        /* renamed from: e */
        void m7423e() {
            InterfaceC1310k interfaceC1310k = this.f5753d;
            b<D> bVar = this.f5754e;
            if (interfaceC1310k == null || bVar == null) {
                return;
            }
            super.removeObserver(bVar);
            observe(interfaceC1310k, bVar);
        }

        /* renamed from: f */
        C8938b<D> m7424f(InterfaceC1310k interfaceC1310k, AbstractC1329a.a<D> aVar) {
            b<D> bVar = new b<>(this.f5752c, aVar);
            observe(interfaceC1310k, bVar);
            b<D> bVar2 = this.f5754e;
            if (bVar2 != null) {
                removeObserver(bVar2);
            }
            this.f5753d = interfaceC1310k;
            this.f5754e = bVar;
            return this.f5752c;
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // androidx.lifecycle.LiveData
        public void onActive() {
            if (C1330b.f5747c) {
                Log.v("LoaderManager", "  Starting: " + this);
            }
            this.f5752c.m26137t();
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // androidx.lifecycle.LiveData
        public void onInactive() {
            if (C1330b.f5747c) {
                Log.v("LoaderManager", "  Stopping: " + this);
            }
            this.f5752c.m26138u();
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // androidx.lifecycle.LiveData
        public void removeObserver(InterfaceC1321s<? super D> interfaceC1321s) {
            super.removeObserver(interfaceC1321s);
            this.f5753d = null;
            this.f5754e = null;
        }

        @Override // androidx.lifecycle.C1320r, androidx.lifecycle.LiveData
        public void setValue(D d10) {
            super.setValue(d10);
            C8938b<D> c8938b = this.f5755f;
            if (c8938b != null) {
                c8938b.m26135r();
                this.f5755f = null;
            }
        }

        public String toString() {
            StringBuilder sb2 = new StringBuilder(64);
            sb2.append("LoaderInfo{");
            sb2.append(Integer.toHexString(System.identityHashCode(this)));
            sb2.append(" #");
            sb2.append(this.f5750a);
            sb2.append(" : ");
            C0978b.m4811a(this.f5752c, sb2);
            sb2.append("}}");
            return sb2.toString();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: androidx.loader.app.b$b */
    /* loaded from: classes.dex */
    public static class b<D> implements InterfaceC1321s<D> {

        /* renamed from: a */
        private final C8938b<D> f5756a;

        /* renamed from: b */
        private final AbstractC1329a.a<D> f5757b;

        /* renamed from: c */
        private boolean f5758c = false;

        b(C8938b<D> c8938b, AbstractC1329a.a<D> aVar) {
            this.f5756a = c8938b;
            this.f5757b = aVar;
        }

        @Override // androidx.lifecycle.InterfaceC1321s
        /* renamed from: a */
        public void mo2553a(D d10) {
            if (C1330b.f5747c) {
                Log.v("LoaderManager", "  onLoadFinished in " + this.f5756a + ": " + this.f5756a.m26124d(d10));
            }
            this.f5757b.mo7416b(this.f5756a, d10);
            this.f5758c = true;
        }

        /* renamed from: b */
        public void m7425b(String str, PrintWriter printWriter) {
            printWriter.print(str);
            printWriter.print("mDeliveredData=");
            printWriter.println(this.f5758c);
        }

        /* renamed from: c */
        boolean m7426c() {
            return this.f5758c;
        }

        /* renamed from: d */
        void m7427d() {
            if (this.f5758c) {
                if (C1330b.f5747c) {
                    Log.v("LoaderManager", "  Resetting: " + this.f5756a);
                }
                this.f5757b.mo7415a(this.f5756a);
            }
        }

        public String toString() {
            return this.f5757b.toString();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: androidx.loader.app.b$c */
    /* loaded from: classes.dex */
    public static class c extends AbstractC1303g0 {

        /* renamed from: f */
        private static final C1305h0.b f5759f = new a();

        /* renamed from: d */
        private C0739i<a> f5760d = new C0739i<>();

        /* renamed from: e */
        private boolean f5761e = false;

        /* renamed from: androidx.loader.app.b$c$a */
        /* loaded from: classes.dex */
        static class a implements C1305h0.b {
            a() {
            }

            @Override // androidx.lifecycle.C1305h0.b
            /* renamed from: b */
            public <T extends AbstractC1303g0> T mo7155b(Class<T> cls) {
                return new c();
            }
        }

        c() {
        }

        /* renamed from: h */
        static c m7428h(C1309j0 c1309j0) {
            return (c) new C1305h0(c1309j0, f5759f).m7337a(c.class);
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // androidx.lifecycle.AbstractC1303g0
        /* renamed from: d */
        public void mo7144d() {
            super.mo7144d();
            int m3724j = this.f5760d.m3724j();
            for (int i10 = 0; i10 < m3724j; i10++) {
                this.f5760d.m3725k(i10).m7420b(true);
            }
            this.f5760d.m3718b();
        }

        /* renamed from: f */
        public void m7429f(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
            if (this.f5760d.m3724j() > 0) {
                printWriter.print(str);
                printWriter.println("Loaders:");
                String str2 = str + "    ";
                for (int i10 = 0; i10 < this.f5760d.m3724j(); i10++) {
                    a m3725k = this.f5760d.m3725k(i10);
                    printWriter.print(str);
                    printWriter.print("  #");
                    printWriter.print(this.f5760d.m3722h(i10));
                    printWriter.print(": ");
                    printWriter.println(m3725k.toString());
                    m3725k.m7421c(str2, fileDescriptor, printWriter, strArr);
                }
            }
        }

        /* renamed from: g */
        void m7430g() {
            this.f5761e = false;
        }

        /* renamed from: i */
        <D> a<D> m7431i(int i10) {
            return this.f5760d.m3720e(i10);
        }

        /* renamed from: j */
        boolean m7432j() {
            return this.f5761e;
        }

        /* renamed from: k */
        void m7433k() {
            int m3724j = this.f5760d.m3724j();
            for (int i10 = 0; i10 < m3724j; i10++) {
                this.f5760d.m3725k(i10).m7423e();
            }
        }

        /* renamed from: l */
        void m7434l(int i10, a aVar) {
            this.f5760d.m3723i(i10, aVar);
        }

        /* renamed from: m */
        void m7435m() {
            this.f5761e = true;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public C1330b(InterfaceC1310k interfaceC1310k, C1309j0 c1309j0) {
        this.f5748a = interfaceC1310k;
        this.f5749b = c.m7428h(c1309j0);
    }

    /* renamed from: e */
    private <D> C8938b<D> m7418e(int i10, Bundle bundle, AbstractC1329a.a<D> aVar, C8938b<D> c8938b) {
        try {
            this.f5749b.m7435m();
            C8938b<D> mo7417c = aVar.mo7417c(i10, bundle);
            if (mo7417c == null) {
                throw new IllegalArgumentException("Object returned from onCreateLoader must not be null");
            }
            if (mo7417c.getClass().isMemberClass() && !Modifier.isStatic(mo7417c.getClass().getModifiers())) {
                throw new IllegalArgumentException("Object returned from onCreateLoader must not be a non-static inner member class: " + mo7417c);
            }
            a aVar2 = new a(i10, bundle, mo7417c, c8938b);
            if (f5747c) {
                Log.v("LoaderManager", "  Created new loader " + aVar2);
            }
            this.f5749b.m7434l(i10, aVar2);
            this.f5749b.m7430g();
            return aVar2.m7424f(this.f5748a, aVar);
        } catch (Throwable th2) {
            this.f5749b.m7430g();
            throw th2;
        }
    }

    @Override // androidx.loader.app.AbstractC1329a
    @Deprecated
    /* renamed from: a */
    public void mo7412a(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
        this.f5749b.m7429f(str, fileDescriptor, printWriter, strArr);
    }

    @Override // androidx.loader.app.AbstractC1329a
    /* renamed from: c */
    public <D> C8938b<D> mo7413c(int i10, Bundle bundle, AbstractC1329a.a<D> aVar) {
        if (this.f5749b.m7432j()) {
            throw new IllegalStateException("Called while creating a loader");
        }
        if (Looper.getMainLooper() != Looper.myLooper()) {
            throw new IllegalStateException("initLoader must be called on the main thread");
        }
        a<D> m7431i = this.f5749b.m7431i(i10);
        if (f5747c) {
            Log.v("LoaderManager", "initLoader in " + this + ": args=" + bundle);
        }
        if (m7431i == null) {
            return m7418e(i10, bundle, aVar, null);
        }
        if (f5747c) {
            Log.v("LoaderManager", "  Re-using existing loader " + m7431i);
        }
        return m7431i.m7424f(this.f5748a, aVar);
    }

    @Override // androidx.loader.app.AbstractC1329a
    /* renamed from: d */
    public void mo7414d() {
        this.f5749b.m7433k();
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder(RecognitionOptions.ITF);
        sb2.append("LoaderManager{");
        sb2.append(Integer.toHexString(System.identityHashCode(this)));
        sb2.append(" in ");
        C0978b.m4811a(this.f5748a, sb2);
        sb2.append("}}");
        return sb2.toString();
    }
}

package androidx.loader.app;

import android.os.Bundle;
import android.os.Looper;
import android.util.Log;
import androidx.collection.i;
import androidx.lifecycle.g0;
import androidx.lifecycle.h0;
import androidx.lifecycle.j0;
import androidx.lifecycle.k;
import androidx.lifecycle.r;
import androidx.lifecycle.s;
import androidx.loader.app.a;
import com.google.android.libraries.barhopper.RecognitionOptions;
import j1.b;
import java.io.FileDescriptor;
import java.io.PrintWriter;
import java.lang.reflect.Modifier;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public class b extends androidx.loader.app.a {

    /* renamed from: c, reason: collision with root package name */
    static boolean f4993c = false;

    /* renamed from: a, reason: collision with root package name */
    private final k f4994a;

    /* renamed from: b, reason: collision with root package name */
    private final c f4995b;

    /* loaded from: classes.dex */
    public static class a<D> extends r<D> implements b.a<D> {

        /* renamed from: a, reason: collision with root package name */
        private final int f4996a;

        /* renamed from: b, reason: collision with root package name */
        private final Bundle f4997b;

        /* renamed from: c, reason: collision with root package name */
        private final j1.b<D> f4998c;

        /* renamed from: d, reason: collision with root package name */
        private k f4999d;

        /* renamed from: e, reason: collision with root package name */
        private C0075b<D> f5000e;

        /* renamed from: f, reason: collision with root package name */
        private j1.b<D> f5001f;

        a(int i10, Bundle bundle, j1.b<D> bVar, j1.b<D> bVar2) {
            this.f4996a = i10;
            this.f4997b = bundle;
            this.f4998c = bVar;
            this.f5001f = bVar2;
            bVar.q(i10, this);
        }

        @Override // j1.b.a
        public void a(j1.b<D> bVar, D d10) {
            if (b.f4993c) {
                Log.v("LoaderManager", "onLoadComplete: " + this);
            }
            if (Looper.myLooper() == Looper.getMainLooper()) {
                setValue(d10);
                return;
            }
            if (b.f4993c) {
                Log.w("LoaderManager", "onLoadComplete was incorrectly called on a background thread");
            }
            postValue(d10);
        }

        j1.b<D> b(boolean z10) {
            if (b.f4993c) {
                Log.v("LoaderManager", "  Destroying: " + this);
            }
            this.f4998c.b();
            this.f4998c.a();
            C0075b<D> c0075b = this.f5000e;
            if (c0075b != null) {
                removeObserver(c0075b);
                if (z10) {
                    c0075b.d();
                }
            }
            this.f4998c.v(this);
            if ((c0075b == null || c0075b.c()) && !z10) {
                return this.f4998c;
            }
            this.f4998c.r();
            return this.f5001f;
        }

        public void c(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
            printWriter.print(str);
            printWriter.print("mId=");
            printWriter.print(this.f4996a);
            printWriter.print(" mArgs=");
            printWriter.println(this.f4997b);
            printWriter.print(str);
            printWriter.print("mLoader=");
            printWriter.println(this.f4998c);
            this.f4998c.g(str + "  ", fileDescriptor, printWriter, strArr);
            if (this.f5000e != null) {
                printWriter.print(str);
                printWriter.print("mCallbacks=");
                printWriter.println(this.f5000e);
                this.f5000e.b(str + "  ", printWriter);
            }
            printWriter.print(str);
            printWriter.print("mData=");
            printWriter.println(d().d(getValue()));
            printWriter.print(str);
            printWriter.print("mStarted=");
            printWriter.println(hasActiveObservers());
        }

        j1.b<D> d() {
            return this.f4998c;
        }

        void e() {
            k kVar = this.f4999d;
            C0075b<D> c0075b = this.f5000e;
            if (kVar == null || c0075b == null) {
                return;
            }
            super.removeObserver(c0075b);
            observe(kVar, c0075b);
        }

        j1.b<D> f(k kVar, a.InterfaceC0074a<D> interfaceC0074a) {
            C0075b<D> c0075b = new C0075b<>(this.f4998c, interfaceC0074a);
            observe(kVar, c0075b);
            C0075b<D> c0075b2 = this.f5000e;
            if (c0075b2 != null) {
                removeObserver(c0075b2);
            }
            this.f4999d = kVar;
            this.f5000e = c0075b;
            return this.f4998c;
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // androidx.lifecycle.LiveData
        public void onActive() {
            if (b.f4993c) {
                Log.v("LoaderManager", "  Starting: " + this);
            }
            this.f4998c.t();
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // androidx.lifecycle.LiveData
        public void onInactive() {
            if (b.f4993c) {
                Log.v("LoaderManager", "  Stopping: " + this);
            }
            this.f4998c.u();
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // androidx.lifecycle.LiveData
        public void removeObserver(s<? super D> sVar) {
            super.removeObserver(sVar);
            this.f4999d = null;
            this.f5000e = null;
        }

        @Override // androidx.lifecycle.r, androidx.lifecycle.LiveData
        public void setValue(D d10) {
            super.setValue(d10);
            j1.b<D> bVar = this.f5001f;
            if (bVar != null) {
                bVar.r();
                this.f5001f = null;
            }
        }

        public String toString() {
            StringBuilder sb2 = new StringBuilder(64);
            sb2.append("LoaderInfo{");
            sb2.append(Integer.toHexString(System.identityHashCode(this)));
            sb2.append(" #");
            sb2.append(this.f4996a);
            sb2.append(" : ");
            androidx.core.util.b.a(this.f4998c, sb2);
            sb2.append("}}");
            return sb2.toString();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: androidx.loader.app.b$b, reason: collision with other inner class name */
    /* loaded from: classes.dex */
    public static class C0075b<D> implements s<D> {

        /* renamed from: a, reason: collision with root package name */
        private final j1.b<D> f5002a;

        /* renamed from: b, reason: collision with root package name */
        private final a.InterfaceC0074a<D> f5003b;

        /* renamed from: c, reason: collision with root package name */
        private boolean f5004c = false;

        C0075b(j1.b<D> bVar, a.InterfaceC0074a<D> interfaceC0074a) {
            this.f5002a = bVar;
            this.f5003b = interfaceC0074a;
        }

        @Override // androidx.lifecycle.s
        public void a(D d10) {
            if (b.f4993c) {
                Log.v("LoaderManager", "  onLoadFinished in " + this.f5002a + ": " + this.f5002a.d(d10));
            }
            this.f5003b.b(this.f5002a, d10);
            this.f5004c = true;
        }

        public void b(String str, PrintWriter printWriter) {
            printWriter.print(str);
            printWriter.print("mDeliveredData=");
            printWriter.println(this.f5004c);
        }

        boolean c() {
            return this.f5004c;
        }

        void d() {
            if (this.f5004c) {
                if (b.f4993c) {
                    Log.v("LoaderManager", "  Resetting: " + this.f5002a);
                }
                this.f5003b.a(this.f5002a);
            }
        }

        public String toString() {
            return this.f5003b.toString();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public static class c extends g0 {

        /* renamed from: f, reason: collision with root package name */
        private static final h0.b f5005f = new a();

        /* renamed from: d, reason: collision with root package name */
        private i<a> f5006d = new i<>();

        /* renamed from: e, reason: collision with root package name */
        private boolean f5007e = false;

        /* loaded from: classes.dex */
        static class a implements h0.b {
            a() {
            }

            @Override // androidx.lifecycle.h0.b
            public <T extends g0> T b(Class<T> cls) {
                return new c();
            }
        }

        c() {
        }

        static c h(j0 j0Var) {
            return (c) new h0(j0Var, f5005f).a(c.class);
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // androidx.lifecycle.g0
        public void d() {
            super.d();
            int j10 = this.f5006d.j();
            for (int i10 = 0; i10 < j10; i10++) {
                this.f5006d.k(i10).b(true);
            }
            this.f5006d.b();
        }

        public void f(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
            if (this.f5006d.j() > 0) {
                printWriter.print(str);
                printWriter.println("Loaders:");
                String str2 = str + "    ";
                for (int i10 = 0; i10 < this.f5006d.j(); i10++) {
                    a k10 = this.f5006d.k(i10);
                    printWriter.print(str);
                    printWriter.print("  #");
                    printWriter.print(this.f5006d.h(i10));
                    printWriter.print(": ");
                    printWriter.println(k10.toString());
                    k10.c(str2, fileDescriptor, printWriter, strArr);
                }
            }
        }

        void g() {
            this.f5007e = false;
        }

        <D> a<D> i(int i10) {
            return this.f5006d.e(i10);
        }

        boolean j() {
            return this.f5007e;
        }

        void k() {
            int j10 = this.f5006d.j();
            for (int i10 = 0; i10 < j10; i10++) {
                this.f5006d.k(i10).e();
            }
        }

        void l(int i10, a aVar) {
            this.f5006d.i(i10, aVar);
        }

        void m() {
            this.f5007e = true;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public b(k kVar, j0 j0Var) {
        this.f4994a = kVar;
        this.f4995b = c.h(j0Var);
    }

    private <D> j1.b<D> e(int i10, Bundle bundle, a.InterfaceC0074a<D> interfaceC0074a, j1.b<D> bVar) {
        try {
            this.f4995b.m();
            j1.b<D> c10 = interfaceC0074a.c(i10, bundle);
            if (c10 == null) {
                throw new IllegalArgumentException("Object returned from onCreateLoader must not be null");
            }
            if (c10.getClass().isMemberClass() && !Modifier.isStatic(c10.getClass().getModifiers())) {
                throw new IllegalArgumentException("Object returned from onCreateLoader must not be a non-static inner member class: " + c10);
            }
            a aVar = new a(i10, bundle, c10, bVar);
            if (f4993c) {
                Log.v("LoaderManager", "  Created new loader " + aVar);
            }
            this.f4995b.l(i10, aVar);
            this.f4995b.g();
            return aVar.f(this.f4994a, interfaceC0074a);
        } catch (Throwable th2) {
            this.f4995b.g();
            throw th2;
        }
    }

    @Override // androidx.loader.app.a
    @Deprecated
    public void a(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
        this.f4995b.f(str, fileDescriptor, printWriter, strArr);
    }

    @Override // androidx.loader.app.a
    public <D> j1.b<D> c(int i10, Bundle bundle, a.InterfaceC0074a<D> interfaceC0074a) {
        if (this.f4995b.j()) {
            throw new IllegalStateException("Called while creating a loader");
        }
        if (Looper.getMainLooper() != Looper.myLooper()) {
            throw new IllegalStateException("initLoader must be called on the main thread");
        }
        a<D> i11 = this.f4995b.i(i10);
        if (f4993c) {
            Log.v("LoaderManager", "initLoader in " + this + ": args=" + bundle);
        }
        if (i11 == null) {
            return e(i10, bundle, interfaceC0074a, null);
        }
        if (f4993c) {
            Log.v("LoaderManager", "  Re-using existing loader " + i11);
        }
        return i11.f(this.f4994a, interfaceC0074a);
    }

    @Override // androidx.loader.app.a
    public void d() {
        this.f4995b.k();
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder(RecognitionOptions.ITF);
        sb2.append("LoaderManager{");
        sb2.append(Integer.toHexString(System.identityHashCode(this)));
        sb2.append(" in ");
        androidx.core.util.b.a(this.f4994a, sb2);
        sb2.append("}}");
        return sb2.toString();
    }
}

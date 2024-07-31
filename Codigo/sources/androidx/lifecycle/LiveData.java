package androidx.lifecycle;

import androidx.lifecycle.f;
import java.util.Iterator;
import java.util.Map;

/* loaded from: classes.dex */
public abstract class LiveData<T> {
    static final Object NOT_SET = new Object();
    static final int START_VERSION = -1;
    int mActiveCount;
    private boolean mChangingActiveState;
    private volatile Object mData;
    final Object mDataLock;
    private boolean mDispatchInvalidated;
    private boolean mDispatchingValue;
    private l.b<s<? super T>, LiveData<T>.c> mObservers;
    volatile Object mPendingData;
    private final Runnable mPostValueRunnable;
    private int mVersion;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public class LifecycleBoundObserver extends LiveData<T>.c implements i {

        /* renamed from: e */
        final k f4882e;

        LifecycleBoundObserver(k kVar, s<? super T> sVar) {
            super(sVar);
            this.f4882e = kVar;
        }

        @Override // androidx.lifecycle.LiveData.c
        void b() {
            this.f4882e.getLifecycle().c(this);
        }

        @Override // androidx.lifecycle.LiveData.c
        boolean c(k kVar) {
            return this.f4882e == kVar;
        }

        @Override // androidx.lifecycle.LiveData.c
        boolean d() {
            return this.f4882e.getLifecycle().b().h(f.b.STARTED);
        }

        @Override // androidx.lifecycle.i
        public void onStateChanged(k kVar, f.a aVar) {
            f.b b10 = this.f4882e.getLifecycle().b();
            if (b10 == f.b.DESTROYED) {
                LiveData.this.removeObserver(this.f4886a);
                return;
            }
            f.b bVar = null;
            while (bVar != b10) {
                a(d());
                bVar = b10;
                b10 = this.f4882e.getLifecycle().b();
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public class a implements Runnable {
        a() {
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // java.lang.Runnable
        public void run() {
            Object obj;
            synchronized (LiveData.this.mDataLock) {
                obj = LiveData.this.mPendingData;
                LiveData.this.mPendingData = LiveData.NOT_SET;
            }
            LiveData.this.setValue(obj);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes.dex */
    public class b extends LiveData<T>.c {
        b(s<? super T> sVar) {
            super(sVar);
        }

        @Override // androidx.lifecycle.LiveData.c
        boolean d() {
            return true;
        }
    }

    /* loaded from: classes.dex */
    public abstract class c {

        /* renamed from: a */
        final s<? super T> f4886a;

        /* renamed from: b */
        boolean f4887b;

        /* renamed from: c */
        int f4888c = -1;

        c(s<? super T> sVar) {
            this.f4886a = sVar;
        }

        void a(boolean z10) {
            if (z10 == this.f4887b) {
                return;
            }
            this.f4887b = z10;
            LiveData.this.changeActiveCounter(z10 ? 1 : -1);
            if (this.f4887b) {
                LiveData.this.dispatchingValue(this);
            }
        }

        void b() {
        }

        boolean c(k kVar) {
            return false;
        }

        abstract boolean d();
    }

    public LiveData() {
        this.mDataLock = new Object();
        this.mObservers = new l.b<>();
        this.mActiveCount = 0;
        Object obj = NOT_SET;
        this.mPendingData = obj;
        this.mPostValueRunnable = new a();
        this.mData = obj;
        this.mVersion = -1;
    }

    public LiveData(T t10) {
        this.mDataLock = new Object();
        this.mObservers = new l.b<>();
        this.mActiveCount = 0;
        this.mPendingData = NOT_SET;
        this.mPostValueRunnable = new a();
        this.mData = t10;
        this.mVersion = 0;
    }

    static void assertMainThread(String str) {
        if (k.c.h().c()) {
            return;
        }
        throw new IllegalStateException("Cannot invoke " + str + " on a background thread");
    }

    private void considerNotify(LiveData<T>.c cVar) {
        if (cVar.f4887b) {
            if (!cVar.d()) {
                cVar.a(false);
                return;
            }
            int i10 = cVar.f4888c;
            int i11 = this.mVersion;
            if (i10 >= i11) {
                return;
            }
            cVar.f4888c = i11;
            cVar.f4886a.a((Object) this.mData);
        }
    }

    void changeActiveCounter(int i10) {
        int i11 = this.mActiveCount;
        this.mActiveCount = i10 + i11;
        if (this.mChangingActiveState) {
            return;
        }
        this.mChangingActiveState = true;
        while (true) {
            try {
                int i12 = this.mActiveCount;
                if (i11 == i12) {
                    return;
                }
                boolean z10 = i11 == 0 && i12 > 0;
                boolean z11 = i11 > 0 && i12 == 0;
                if (z10) {
                    onActive();
                } else if (z11) {
                    onInactive();
                }
                i11 = i12;
            } finally {
                this.mChangingActiveState = false;
            }
        }
    }

    void dispatchingValue(LiveData<T>.c cVar) {
        if (this.mDispatchingValue) {
            this.mDispatchInvalidated = true;
            return;
        }
        this.mDispatchingValue = true;
        do {
            this.mDispatchInvalidated = false;
            if (cVar != null) {
                considerNotify(cVar);
                cVar = null;
            } else {
                l.b<s<? super T>, LiveData<T>.c>.d f10 = this.mObservers.f();
                while (f10.hasNext()) {
                    considerNotify((c) f10.next().getValue());
                    if (this.mDispatchInvalidated) {
                        break;
                    }
                }
            }
        } while (this.mDispatchInvalidated);
        this.mDispatchingValue = false;
    }

    public T getValue() {
        T t10 = (T) this.mData;
        if (t10 != NOT_SET) {
            return t10;
        }
        return null;
    }

    public int getVersion() {
        return this.mVersion;
    }

    public boolean hasActiveObservers() {
        return this.mActiveCount > 0;
    }

    public boolean hasObservers() {
        return this.mObservers.size() > 0;
    }

    public boolean isInitialized() {
        return this.mData != NOT_SET;
    }

    public void observe(k kVar, s<? super T> sVar) {
        assertMainThread("observe");
        if (kVar.getLifecycle().b() == f.b.DESTROYED) {
            return;
        }
        LifecycleBoundObserver lifecycleBoundObserver = new LifecycleBoundObserver(kVar, sVar);
        LiveData<T>.c l10 = this.mObservers.l(sVar, lifecycleBoundObserver);
        if (l10 != null && !l10.c(kVar)) {
            throw new IllegalArgumentException("Cannot add the same observer with different lifecycles");
        }
        if (l10 != null) {
            return;
        }
        kVar.getLifecycle().a(lifecycleBoundObserver);
    }

    public void observeForever(s<? super T> sVar) {
        assertMainThread("observeForever");
        b bVar = new b(sVar);
        LiveData<T>.c l10 = this.mObservers.l(sVar, bVar);
        if (l10 instanceof LifecycleBoundObserver) {
            throw new IllegalArgumentException("Cannot add the same observer with different lifecycles");
        }
        if (l10 != null) {
            return;
        }
        bVar.a(true);
    }

    public void onActive() {
    }

    public void onInactive() {
    }

    public void postValue(T t10) {
        boolean z10;
        synchronized (this.mDataLock) {
            z10 = this.mPendingData == NOT_SET;
            this.mPendingData = t10;
        }
        if (z10) {
            k.c.h().d(this.mPostValueRunnable);
        }
    }

    public void removeObserver(s<? super T> sVar) {
        assertMainThread("removeObserver");
        LiveData<T>.c m10 = this.mObservers.m(sVar);
        if (m10 == null) {
            return;
        }
        m10.b();
        m10.a(false);
    }

    public void removeObservers(k kVar) {
        assertMainThread("removeObservers");
        Iterator<Map.Entry<s<? super T>, LiveData<T>.c>> it = this.mObservers.iterator();
        while (it.hasNext()) {
            Map.Entry<s<? super T>, LiveData<T>.c> next = it.next();
            if (next.getValue().c(kVar)) {
                removeObserver(next.getKey());
            }
        }
    }

    public void setValue(T t10) {
        assertMainThread("setValue");
        this.mVersion++;
        this.mData = t10;
        dispatchingValue(null);
    }
}

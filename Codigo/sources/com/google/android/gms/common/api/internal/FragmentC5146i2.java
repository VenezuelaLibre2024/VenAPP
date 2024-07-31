package com.google.android.gms.common.api.internal;

import android.app.Activity;
import android.app.Fragment;
import android.content.Intent;
import android.os.Bundle;
import android.os.Looper;
import androidx.collection.C0731a;
import com.google.android.gms.internal.common.zzi;
import java.io.FileDescriptor;
import java.io.PrintWriter;
import java.lang.ref.WeakReference;
import java.util.Collections;
import java.util.Iterator;
import java.util.Map;
import java.util.WeakHashMap;

/* renamed from: com.google.android.gms.common.api.internal.i2 */
/* loaded from: classes.dex */
public final class FragmentC5146i2 extends Fragment implements InterfaceC5147j {

    /* renamed from: d */
    private static final WeakHashMap f10493d = new WeakHashMap();

    /* renamed from: a */
    private final Map f10494a = Collections.synchronizedMap(new C0731a());

    /* renamed from: b */
    private int f10495b = 0;

    /* renamed from: c */
    private Bundle f10496c;

    /* renamed from: f */
    public static FragmentC5146i2 m13077f(Activity activity) {
        FragmentC5146i2 fragmentC5146i2;
        WeakHashMap weakHashMap = f10493d;
        WeakReference weakReference = (WeakReference) weakHashMap.get(activity);
        if (weakReference != null && (fragmentC5146i2 = (FragmentC5146i2) weakReference.get()) != null) {
            return fragmentC5146i2;
        }
        try {
            FragmentC5146i2 fragmentC5146i22 = (FragmentC5146i2) activity.getFragmentManager().findFragmentByTag("LifecycleFragmentImpl");
            if (fragmentC5146i22 == null || fragmentC5146i22.isRemoving()) {
                fragmentC5146i22 = new FragmentC5146i2();
                activity.getFragmentManager().beginTransaction().add(fragmentC5146i22, "LifecycleFragmentImpl").commitAllowingStateLoss();
            }
            weakHashMap.put(activity, new WeakReference(fragmentC5146i22));
            return fragmentC5146i22;
        } catch (ClassCastException e10) {
            throw new IllegalStateException("Fragment with tag LifecycleFragmentImpl is not a LifecycleFragmentImpl", e10);
        }
    }

    @Override // com.google.android.gms.common.api.internal.InterfaceC5147j
    /* renamed from: a */
    public final void mo13078a(String str, LifecycleCallback lifecycleCallback) {
        if (this.f10494a.containsKey(str)) {
            throw new IllegalArgumentException("LifecycleCallback with tag " + str + " already added to this fragment.");
        }
        this.f10494a.put(str, lifecycleCallback);
        if (this.f10495b > 0) {
            new zzi(Looper.getMainLooper()).post(new RunnableC5142h2(this, lifecycleCallback, str));
        }
    }

    @Override // com.google.android.gms.common.api.internal.InterfaceC5147j
    /* renamed from: b */
    public final <T extends LifecycleCallback> T mo13079b(String str, Class<T> cls) {
        return cls.cast(this.f10494a.get(str));
    }

    @Override // com.google.android.gms.common.api.internal.InterfaceC5147j
    /* renamed from: c */
    public final Activity mo13080c() {
        return getActivity();
    }

    @Override // android.app.Fragment
    public final void dump(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
        super.dump(str, fileDescriptor, printWriter, strArr);
        Iterator it = this.f10494a.values().iterator();
        while (it.hasNext()) {
            ((LifecycleCallback) it.next()).dump(str, fileDescriptor, printWriter, strArr);
        }
    }

    @Override // android.app.Fragment
    public final void onActivityResult(int i10, int i11, Intent intent) {
        super.onActivityResult(i10, i11, intent);
        Iterator it = this.f10494a.values().iterator();
        while (it.hasNext()) {
            ((LifecycleCallback) it.next()).onActivityResult(i10, i11, intent);
        }
    }

    @Override // android.app.Fragment
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        this.f10495b = 1;
        this.f10496c = bundle;
        for (Map.Entry entry : this.f10494a.entrySet()) {
            ((LifecycleCallback) entry.getValue()).onCreate(bundle != null ? bundle.getBundle((String) entry.getKey()) : null);
        }
    }

    @Override // android.app.Fragment
    public final void onDestroy() {
        super.onDestroy();
        this.f10495b = 5;
        Iterator it = this.f10494a.values().iterator();
        while (it.hasNext()) {
            ((LifecycleCallback) it.next()).onDestroy();
        }
    }

    @Override // android.app.Fragment
    public final void onResume() {
        super.onResume();
        this.f10495b = 3;
        Iterator it = this.f10494a.values().iterator();
        while (it.hasNext()) {
            ((LifecycleCallback) it.next()).onResume();
        }
    }

    @Override // android.app.Fragment
    public final void onSaveInstanceState(Bundle bundle) {
        super.onSaveInstanceState(bundle);
        if (bundle == null) {
            return;
        }
        for (Map.Entry entry : this.f10494a.entrySet()) {
            Bundle bundle2 = new Bundle();
            ((LifecycleCallback) entry.getValue()).onSaveInstanceState(bundle2);
            bundle.putBundle((String) entry.getKey(), bundle2);
        }
    }

    @Override // android.app.Fragment
    public final void onStart() {
        super.onStart();
        this.f10495b = 2;
        Iterator it = this.f10494a.values().iterator();
        while (it.hasNext()) {
            ((LifecycleCallback) it.next()).onStart();
        }
    }

    @Override // android.app.Fragment
    public final void onStop() {
        super.onStop();
        this.f10495b = 4;
        Iterator it = this.f10494a.values().iterator();
        while (it.hasNext()) {
            ((LifecycleCallback) it.next()).onStop();
        }
    }
}

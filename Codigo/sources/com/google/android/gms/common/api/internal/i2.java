package com.google.android.gms.common.api.internal;

import android.app.Activity;
import android.app.Fragment;
import android.content.Intent;
import android.os.Bundle;
import android.os.Looper;
import com.google.android.gms.internal.common.zzi;
import java.io.FileDescriptor;
import java.io.PrintWriter;
import java.lang.ref.WeakReference;
import java.util.Collections;
import java.util.Iterator;
import java.util.Map;
import java.util.WeakHashMap;

/* loaded from: classes.dex */
public final class i2 extends Fragment implements j {

    /* renamed from: d */
    private static final WeakHashMap f9379d = new WeakHashMap();

    /* renamed from: a */
    private final Map f9380a = Collections.synchronizedMap(new androidx.collection.a());

    /* renamed from: b */
    private int f9381b = 0;

    /* renamed from: c */
    private Bundle f9382c;

    public static i2 f(Activity activity) {
        i2 i2Var;
        WeakHashMap weakHashMap = f9379d;
        WeakReference weakReference = (WeakReference) weakHashMap.get(activity);
        if (weakReference != null && (i2Var = (i2) weakReference.get()) != null) {
            return i2Var;
        }
        try {
            i2 i2Var2 = (i2) activity.getFragmentManager().findFragmentByTag("LifecycleFragmentImpl");
            if (i2Var2 == null || i2Var2.isRemoving()) {
                i2Var2 = new i2();
                activity.getFragmentManager().beginTransaction().add(i2Var2, "LifecycleFragmentImpl").commitAllowingStateLoss();
            }
            weakHashMap.put(activity, new WeakReference(i2Var2));
            return i2Var2;
        } catch (ClassCastException e10) {
            throw new IllegalStateException("Fragment with tag LifecycleFragmentImpl is not a LifecycleFragmentImpl", e10);
        }
    }

    @Override // com.google.android.gms.common.api.internal.j
    public final void a(String str, LifecycleCallback lifecycleCallback) {
        if (this.f9380a.containsKey(str)) {
            throw new IllegalArgumentException("LifecycleCallback with tag " + str + " already added to this fragment.");
        }
        this.f9380a.put(str, lifecycleCallback);
        if (this.f9381b > 0) {
            new zzi(Looper.getMainLooper()).post(new h2(this, lifecycleCallback, str));
        }
    }

    @Override // com.google.android.gms.common.api.internal.j
    public final <T extends LifecycleCallback> T b(String str, Class<T> cls) {
        return cls.cast(this.f9380a.get(str));
    }

    @Override // com.google.android.gms.common.api.internal.j
    public final Activity c() {
        return getActivity();
    }

    @Override // android.app.Fragment
    public final void dump(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
        super.dump(str, fileDescriptor, printWriter, strArr);
        Iterator it = this.f9380a.values().iterator();
        while (it.hasNext()) {
            ((LifecycleCallback) it.next()).dump(str, fileDescriptor, printWriter, strArr);
        }
    }

    @Override // android.app.Fragment
    public final void onActivityResult(int i10, int i11, Intent intent) {
        super.onActivityResult(i10, i11, intent);
        Iterator it = this.f9380a.values().iterator();
        while (it.hasNext()) {
            ((LifecycleCallback) it.next()).onActivityResult(i10, i11, intent);
        }
    }

    @Override // android.app.Fragment
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        this.f9381b = 1;
        this.f9382c = bundle;
        for (Map.Entry entry : this.f9380a.entrySet()) {
            ((LifecycleCallback) entry.getValue()).onCreate(bundle != null ? bundle.getBundle((String) entry.getKey()) : null);
        }
    }

    @Override // android.app.Fragment
    public final void onDestroy() {
        super.onDestroy();
        this.f9381b = 5;
        Iterator it = this.f9380a.values().iterator();
        while (it.hasNext()) {
            ((LifecycleCallback) it.next()).onDestroy();
        }
    }

    @Override // android.app.Fragment
    public final void onResume() {
        super.onResume();
        this.f9381b = 3;
        Iterator it = this.f9380a.values().iterator();
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
        for (Map.Entry entry : this.f9380a.entrySet()) {
            Bundle bundle2 = new Bundle();
            ((LifecycleCallback) entry.getValue()).onSaveInstanceState(bundle2);
            bundle.putBundle((String) entry.getKey(), bundle2);
        }
    }

    @Override // android.app.Fragment
    public final void onStart() {
        super.onStart();
        this.f9381b = 2;
        Iterator it = this.f9380a.values().iterator();
        while (it.hasNext()) {
            ((LifecycleCallback) it.next()).onStart();
        }
    }

    @Override // android.app.Fragment
    public final void onStop() {
        super.onStop();
        this.f9381b = 4;
        Iterator it = this.f9380a.values().iterator();
        while (it.hasNext()) {
            ((LifecycleCallback) it.next()).onStop();
        }
    }
}

package com.google.android.gms.common.api.internal;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.os.Looper;
import androidx.collection.C0731a;
import androidx.fragment.app.ActivityC1263e;
import androidx.fragment.app.Fragment;
import com.google.android.gms.internal.common.zzi;
import java.io.FileDescriptor;
import java.io.PrintWriter;
import java.lang.ref.WeakReference;
import java.util.Collections;
import java.util.Iterator;
import java.util.Map;
import java.util.WeakHashMap;

/* renamed from: com.google.android.gms.common.api.internal.k2 */
/* loaded from: classes.dex */
public final class C5154k2 extends Fragment implements InterfaceC5147j {

    /* renamed from: d */
    private static final WeakHashMap f10510d = new WeakHashMap();

    /* renamed from: a */
    private final Map f10511a = Collections.synchronizedMap(new C0731a());

    /* renamed from: b */
    private int f10512b = 0;

    /* renamed from: c */
    private Bundle f10513c;

    /* renamed from: f */
    public static C5154k2 m13089f(ActivityC1263e activityC1263e) {
        C5154k2 c5154k2;
        WeakHashMap weakHashMap = f10510d;
        WeakReference weakReference = (WeakReference) weakHashMap.get(activityC1263e);
        if (weakReference != null && (c5154k2 = (C5154k2) weakReference.get()) != null) {
            return c5154k2;
        }
        try {
            C5154k2 c5154k22 = (C5154k2) activityC1263e.getSupportFragmentManager().m7081h0("SupportLifecycleFragmentImpl");
            if (c5154k22 == null || c5154k22.isRemoving()) {
                c5154k22 = new C5154k2();
                activityC1263e.getSupportFragmentManager().m7092m().m7206d(c5154k22, "SupportLifecycleFragmentImpl").mo6842g();
            }
            weakHashMap.put(activityC1263e, new WeakReference(c5154k22));
            return c5154k22;
        } catch (ClassCastException e10) {
            throw new IllegalStateException("Fragment with tag SupportLifecycleFragmentImpl is not a SupportLifecycleFragmentImpl", e10);
        }
    }

    @Override // com.google.android.gms.common.api.internal.InterfaceC5147j
    /* renamed from: a */
    public final void mo13078a(String str, LifecycleCallback lifecycleCallback) {
        if (this.f10511a.containsKey(str)) {
            throw new IllegalArgumentException("LifecycleCallback with tag " + str + " already added to this fragment.");
        }
        this.f10511a.put(str, lifecycleCallback);
        if (this.f10512b > 0) {
            new zzi(Looper.getMainLooper()).post(new RunnableC5150j2(this, lifecycleCallback, str));
        }
    }

    @Override // com.google.android.gms.common.api.internal.InterfaceC5147j
    /* renamed from: b */
    public final <T extends LifecycleCallback> T mo13079b(String str, Class<T> cls) {
        return cls.cast(this.f10511a.get(str));
    }

    @Override // com.google.android.gms.common.api.internal.InterfaceC5147j
    /* renamed from: c */
    public final /* synthetic */ Activity mo13080c() {
        return getActivity();
    }

    @Override // androidx.fragment.app.Fragment
    public final void dump(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
        super.dump(str, fileDescriptor, printWriter, strArr);
        Iterator it = this.f10511a.values().iterator();
        while (it.hasNext()) {
            ((LifecycleCallback) it.next()).dump(str, fileDescriptor, printWriter, strArr);
        }
    }

    @Override // androidx.fragment.app.Fragment
    public final void onActivityResult(int i10, int i11, Intent intent) {
        super.onActivityResult(i10, i11, intent);
        Iterator it = this.f10511a.values().iterator();
        while (it.hasNext()) {
            ((LifecycleCallback) it.next()).onActivityResult(i10, i11, intent);
        }
    }

    @Override // androidx.fragment.app.Fragment
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        this.f10512b = 1;
        this.f10513c = bundle;
        for (Map.Entry entry : this.f10511a.entrySet()) {
            ((LifecycleCallback) entry.getValue()).onCreate(bundle != null ? bundle.getBundle((String) entry.getKey()) : null);
        }
    }

    @Override // androidx.fragment.app.Fragment
    public final void onDestroy() {
        super.onDestroy();
        this.f10512b = 5;
        Iterator it = this.f10511a.values().iterator();
        while (it.hasNext()) {
            ((LifecycleCallback) it.next()).onDestroy();
        }
    }

    @Override // androidx.fragment.app.Fragment
    public final void onResume() {
        super.onResume();
        this.f10512b = 3;
        Iterator it = this.f10511a.values().iterator();
        while (it.hasNext()) {
            ((LifecycleCallback) it.next()).onResume();
        }
    }

    @Override // androidx.fragment.app.Fragment
    public final void onSaveInstanceState(Bundle bundle) {
        super.onSaveInstanceState(bundle);
        if (bundle == null) {
            return;
        }
        for (Map.Entry entry : this.f10511a.entrySet()) {
            Bundle bundle2 = new Bundle();
            ((LifecycleCallback) entry.getValue()).onSaveInstanceState(bundle2);
            bundle.putBundle((String) entry.getKey(), bundle2);
        }
    }

    @Override // androidx.fragment.app.Fragment
    public final void onStart() {
        super.onStart();
        this.f10512b = 2;
        Iterator it = this.f10511a.values().iterator();
        while (it.hasNext()) {
            ((LifecycleCallback) it.next()).onStart();
        }
    }

    @Override // androidx.fragment.app.Fragment
    public final void onStop() {
        super.onStop();
        this.f10512b = 4;
        Iterator it = this.f10511a.values().iterator();
        while (it.hasNext()) {
            ((LifecycleCallback) it.next()).onStop();
        }
    }
}

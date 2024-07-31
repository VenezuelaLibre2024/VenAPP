package com.google.android.gms.common.api.internal;

import android.app.Activity;
import android.content.ContextWrapper;
import android.content.Intent;
import android.os.Bundle;
import androidx.annotation.Keep;
import java.io.FileDescriptor;
import java.io.PrintWriter;

/* loaded from: classes.dex */
public class LifecycleCallback {
    protected final j mLifecycleFragment;

    /* JADX INFO: Access modifiers changed from: protected */
    public LifecycleCallback(j jVar) {
        this.mLifecycleFragment = jVar;
    }

    @Keep
    private static j getChimeraLifecycleFragmentImpl(i iVar) {
        throw new IllegalStateException("Method not available in SDK.");
    }

    public static j getFragment(Activity activity) {
        return getFragment(new i(activity));
    }

    public static j getFragment(ContextWrapper contextWrapper) {
        throw new UnsupportedOperationException();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public static j getFragment(i iVar) {
        if (iVar.d()) {
            return k2.f(iVar.b());
        }
        if (iVar.c()) {
            return i2.f(iVar.a());
        }
        throw new IllegalArgumentException("Can't get fragment for unexpected activity.");
    }

    public void dump(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
    }

    public Activity getActivity() {
        Activity c10 = this.mLifecycleFragment.c();
        com.google.android.gms.common.internal.s.j(c10);
        return c10;
    }

    public void onActivityResult(int i10, int i11, Intent intent) {
    }

    public void onCreate(Bundle bundle) {
    }

    public void onDestroy() {
    }

    public void onResume() {
    }

    public void onSaveInstanceState(Bundle bundle) {
    }

    public void onStart() {
    }

    public void onStop() {
    }
}

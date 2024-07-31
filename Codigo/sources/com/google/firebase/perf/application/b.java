package com.google.firebase.perf.application;

import com.google.firebase.perf.application.a;
import java.lang.ref.WeakReference;

/* loaded from: classes.dex */
public abstract class b implements a.b {
    private final WeakReference<a.b> appStateCallback;
    private final a appStateMonitor;
    private xe.d currentAppState;
    private boolean isRegisteredForAppState;

    /* JADX INFO: Access modifiers changed from: protected */
    public b() {
        this(a.b());
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public b(a aVar) {
        this.isRegisteredForAppState = false;
        this.currentAppState = xe.d.APPLICATION_PROCESS_STATE_UNKNOWN;
        this.appStateMonitor = aVar;
        this.appStateCallback = new WeakReference<>(this);
    }

    public xe.d getAppState() {
        return this.currentAppState;
    }

    public WeakReference<a.b> getAppStateCallback() {
        return this.appStateCallback;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public void incrementTsnsCount(int i10) {
        this.appStateMonitor.e(i10);
    }

    @Override // com.google.firebase.perf.application.a.b
    public void onUpdateAppState(xe.d dVar) {
        xe.d dVar2 = this.currentAppState;
        xe.d dVar3 = xe.d.APPLICATION_PROCESS_STATE_UNKNOWN;
        if (dVar2 != dVar3) {
            if (dVar2 == dVar || dVar == dVar3) {
                return;
            } else {
                dVar = xe.d.FOREGROUND_BACKGROUND;
            }
        }
        this.currentAppState = dVar;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public void registerForAppState() {
        if (this.isRegisteredForAppState) {
            return;
        }
        this.currentAppState = this.appStateMonitor.a();
        this.appStateMonitor.k(this.appStateCallback);
        this.isRegisteredForAppState = true;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public void unregisterForAppState() {
        if (this.isRegisteredForAppState) {
            this.appStateMonitor.p(this.appStateCallback);
            this.isRegisteredForAppState = false;
        }
    }
}

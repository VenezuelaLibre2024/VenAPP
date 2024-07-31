package com.google.android.gms.common.api;

/* loaded from: classes.dex */
public class b extends Exception {

    @Deprecated
    protected final Status mStatus;

    public b(Status status) {
        super(status.v1() + ": " + (status.w1() != null ? status.w1() : ""));
        this.mStatus = status;
    }

    public Status getStatus() {
        return this.mStatus;
    }

    public int getStatusCode() {
        return this.mStatus.v1();
    }

    @Deprecated
    public String getStatusMessage() {
        return this.mStatus.w1();
    }
}

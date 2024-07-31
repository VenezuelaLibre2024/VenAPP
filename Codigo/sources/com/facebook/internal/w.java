package com.facebook.internal;

import java.util.Arrays;

/* loaded from: classes.dex */
public enum w {
    ContextChoose("context_choose"),
    JoinTournament("join_tournament");

    private final String rawValue;

    w(String str) {
        this.rawValue = str;
    }

    /* renamed from: values, reason: to resolve conflict with enum method */
    public static w[] valuesCustom() {
        w[] valuesCustom = values();
        return (w[]) Arrays.copyOf(valuesCustom, valuesCustom.length);
    }

    public final String h() {
        return this.rawValue;
    }
}

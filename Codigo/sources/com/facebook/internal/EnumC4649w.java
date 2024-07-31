package com.facebook.internal;

import java.util.Arrays;

/* renamed from: com.facebook.internal.w */
/* loaded from: classes.dex */
public enum EnumC4649w {
    ContextChoose("context_choose"),
    JoinTournament("join_tournament");

    private final String rawValue;

    EnumC4649w(String str) {
        this.rawValue = str;
    }

    /* renamed from: values, reason: to resolve conflict with enum method */
    public static EnumC4649w[] valuesCustom() {
        EnumC4649w[] valuesCustom = values();
        return (EnumC4649w[]) Arrays.copyOf(valuesCustom, valuesCustom.length);
    }

    /* renamed from: h */
    public final String m11461h() {
        return this.rawValue;
    }
}

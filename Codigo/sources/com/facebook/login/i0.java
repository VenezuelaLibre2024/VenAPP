package com.facebook.login;

import java.util.Arrays;

/* loaded from: classes.dex */
public enum i0 {
    FACEBOOK("facebook"),
    INSTAGRAM("instagram");

    public static final a Companion = new a(null);
    private final String targetApp;

    /* loaded from: classes.dex */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(kotlin.jvm.internal.g gVar) {
            this();
        }

        public final i0 a(String str) {
            i0[] valuesCustom = i0.valuesCustom();
            int length = valuesCustom.length;
            int i10 = 0;
            while (i10 < length) {
                i0 i0Var = valuesCustom[i10];
                i10++;
                if (kotlin.jvm.internal.n.a(i0Var.toString(), str)) {
                    return i0Var;
                }
            }
            return i0.FACEBOOK;
        }
    }

    i0(String str) {
        this.targetApp = str;
    }

    /* renamed from: values, reason: to resolve conflict with enum method */
    public static i0[] valuesCustom() {
        i0[] valuesCustom = values();
        return (i0[]) Arrays.copyOf(valuesCustom, valuesCustom.length);
    }

    @Override // java.lang.Enum
    public String toString() {
        return this.targetApp;
    }
}

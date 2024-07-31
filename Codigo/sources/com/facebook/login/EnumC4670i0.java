package com.facebook.login;

import java.util.Arrays;
import kotlin.jvm.internal.C9315g;
import kotlin.jvm.internal.C9322n;

/* renamed from: com.facebook.login.i0 */
/* loaded from: classes.dex */
public enum EnumC4670i0 {
    FACEBOOK("facebook"),
    INSTAGRAM("instagram");

    public static final a Companion = new a(null);
    private final String targetApp;

    /* renamed from: com.facebook.login.i0$a */
    /* loaded from: classes.dex */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(C9315g c9315g) {
            this();
        }

        /* renamed from: a */
        public final EnumC4670i0 m11571a(String str) {
            EnumC4670i0[] valuesCustom = EnumC4670i0.valuesCustom();
            int length = valuesCustom.length;
            int i10 = 0;
            while (i10 < length) {
                EnumC4670i0 enumC4670i0 = valuesCustom[i10];
                i10++;
                if (C9322n.m27777a(enumC4670i0.toString(), str)) {
                    return enumC4670i0;
                }
            }
            return EnumC4670i0.FACEBOOK;
        }
    }

    EnumC4670i0(String str) {
        this.targetApp = str;
    }

    /* renamed from: values, reason: to resolve conflict with enum method */
    public static EnumC4670i0[] valuesCustom() {
        EnumC4670i0[] valuesCustom = values();
        return (EnumC4670i0[]) Arrays.copyOf(valuesCustom, valuesCustom.length);
    }

    @Override // java.lang.Enum
    public String toString() {
        return this.targetApp;
    }
}

package com.facebook.internal;

import java.util.Arrays;
import java.util.EnumSet;
import java.util.Iterator;

/* loaded from: classes.dex */
public enum i0 {
    None(0),
    Enabled(1),
    RequireConfirm(2);

    private static final EnumSet<i0> ALL;
    public static final a Companion = new a(null);
    private final long value;

    /* loaded from: classes.dex */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(kotlin.jvm.internal.g gVar) {
            this();
        }

        public final EnumSet<i0> a(long j10) {
            EnumSet<i0> result = EnumSet.noneOf(i0.class);
            Iterator it = i0.ALL.iterator();
            while (it.hasNext()) {
                i0 i0Var = (i0) it.next();
                if ((i0Var.i() & j10) != 0) {
                    result.add(i0Var);
                }
            }
            kotlin.jvm.internal.n.d(result, "result");
            return result;
        }
    }

    static {
        EnumSet<i0> allOf = EnumSet.allOf(i0.class);
        kotlin.jvm.internal.n.d(allOf, "allOf(SmartLoginOption::class.java)");
        ALL = allOf;
    }

    i0(long j10) {
        this.value = j10;
    }

    /* renamed from: values, reason: to resolve conflict with enum method */
    public static i0[] valuesCustom() {
        i0[] valuesCustom = values();
        return (i0[]) Arrays.copyOf(valuesCustom, valuesCustom.length);
    }

    public final long i() {
        return this.value;
    }
}

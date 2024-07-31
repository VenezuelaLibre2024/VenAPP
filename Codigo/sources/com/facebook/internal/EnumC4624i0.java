package com.facebook.internal;

import java.util.Arrays;
import java.util.EnumSet;
import java.util.Iterator;
import kotlin.jvm.internal.C9315g;
import kotlin.jvm.internal.C9322n;

/* renamed from: com.facebook.internal.i0 */
/* loaded from: classes.dex */
public enum EnumC4624i0 {
    None(0),
    Enabled(1),
    RequireConfirm(2);

    private static final EnumSet<EnumC4624i0> ALL;
    public static final a Companion = new a(null);
    private final long value;

    /* renamed from: com.facebook.internal.i0$a */
    /* loaded from: classes.dex */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(C9315g c9315g) {
            this();
        }

        /* renamed from: a */
        public final EnumSet<EnumC4624i0> m11232a(long j10) {
            EnumSet<EnumC4624i0> result = EnumSet.noneOf(EnumC4624i0.class);
            Iterator it = EnumC4624i0.ALL.iterator();
            while (it.hasNext()) {
                EnumC4624i0 enumC4624i0 = (EnumC4624i0) it.next();
                if ((enumC4624i0.m11231i() & j10) != 0) {
                    result.add(enumC4624i0);
                }
            }
            C9322n.m27780d(result, "result");
            return result;
        }
    }

    static {
        EnumSet<EnumC4624i0> allOf = EnumSet.allOf(EnumC4624i0.class);
        C9322n.m27780d(allOf, "allOf(SmartLoginOption::class.java)");
        ALL = allOf;
    }

    EnumC4624i0(long j10) {
        this.value = j10;
    }

    /* renamed from: values, reason: to resolve conflict with enum method */
    public static EnumC4624i0[] valuesCustom() {
        EnumC4624i0[] valuesCustom = values();
        return (EnumC4624i0[]) Arrays.copyOf(valuesCustom, valuesCustom.length);
    }

    /* renamed from: i */
    public final long m11231i() {
        return this.value;
    }
}

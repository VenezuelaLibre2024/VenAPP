package dk;

import java.util.Collection;
import kotlin.jvm.internal.C9322n;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: dk.s */
/* loaded from: classes3.dex */
public class C7033s extends C7031r {
    /* renamed from: r */
    public static <T> int m20590r(Iterable<? extends T> iterable, int i10) {
        C9322n.m27781e(iterable, "<this>");
        return iterable instanceof Collection ? ((Collection) iterable).size() : i10;
    }
}

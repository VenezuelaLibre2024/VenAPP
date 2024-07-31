package dk;

import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import kotlin.jvm.internal.C9322n;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: dk.v */
/* loaded from: classes3.dex */
public class C7038v extends C7037u {
    /* renamed from: s */
    public static <T extends Comparable<? super T>> void m20595s(List<T> list) {
        C9322n.m27781e(list, "<this>");
        if (list.size() > 1) {
            Collections.sort(list);
        }
    }

    /* renamed from: t */
    public static <T> void m20596t(List<T> list, Comparator<? super T> comparator) {
        C9322n.m27781e(list, "<this>");
        C9322n.m27781e(comparator, "comparator");
        if (list.size() > 1) {
            Collections.sort(list, comparator);
        }
    }
}

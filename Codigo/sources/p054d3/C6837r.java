package p054d3;

import android.content.Context;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/* renamed from: d3.r */
/* loaded from: classes.dex */
public class C6837r {

    /* renamed from: a */
    private static ExecutorService f15104a;

    /* renamed from: a */
    public static ExecutorService m19753a(Context context) {
        if (f15104a == null) {
            f15104a = Executors.newFixedThreadPool(C6823d.m19715b(context));
        }
        return f15104a;
    }
}

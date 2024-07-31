package androidx.core.app;

import android.os.Bundle;
import androidx.core.app.o;
import androidx.core.graphics.drawable.IconCompat;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Set;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public class s0 {

    /* renamed from: a, reason: collision with root package name */
    private static final Object f3599a = new Object();

    /* renamed from: b, reason: collision with root package name */
    private static final Object f3600b = new Object();

    /* JADX INFO: Access modifiers changed from: package-private */
    public static Bundle a(o.a aVar) {
        Bundle bundle = new Bundle();
        IconCompat d10 = aVar.d();
        bundle.putInt("icon", d10 != null ? d10.m() : 0);
        bundle.putCharSequence("title", aVar.h());
        bundle.putParcelable("actionIntent", aVar.a());
        Bundle bundle2 = aVar.c() != null ? new Bundle(aVar.c()) : new Bundle();
        bundle2.putBoolean("android.support.allowGeneratedReplies", aVar.b());
        bundle.putBundle("extras", bundle2);
        bundle.putParcelableArray("remoteInputs", c(aVar.e()));
        bundle.putBoolean("showsUserInterface", aVar.g());
        bundle.putInt("semanticAction", aVar.f());
        return bundle;
    }

    private static Bundle b(u1 u1Var) {
        Bundle bundle = new Bundle();
        bundle.putString("resultKey", u1Var.i());
        bundle.putCharSequence("label", u1Var.h());
        bundle.putCharSequenceArray("choices", u1Var.e());
        bundle.putBoolean("allowFreeFormInput", u1Var.c());
        bundle.putBundle("extras", u1Var.g());
        Set<String> d10 = u1Var.d();
        if (d10 != null && !d10.isEmpty()) {
            ArrayList<String> arrayList = new ArrayList<>(d10.size());
            Iterator<String> it = d10.iterator();
            while (it.hasNext()) {
                arrayList.add(it.next());
            }
            bundle.putStringArrayList("allowedDataTypes", arrayList);
        }
        return bundle;
    }

    private static Bundle[] c(u1[] u1VarArr) {
        if (u1VarArr == null) {
            return null;
        }
        Bundle[] bundleArr = new Bundle[u1VarArr.length];
        for (int i10 = 0; i10 < u1VarArr.length; i10++) {
            bundleArr[i10] = b(u1VarArr[i10]);
        }
        return bundleArr;
    }
}

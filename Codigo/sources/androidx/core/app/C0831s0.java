package androidx.core.app;

import android.os.Bundle;
import androidx.core.app.C0818o;
import androidx.core.graphics.drawable.IconCompat;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Set;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: androidx.core.app.s0 */
/* loaded from: classes.dex */
public class C0831s0 {

    /* renamed from: a */
    private static final Object f4271a = new Object();

    /* renamed from: b */
    private static final Object f4272b = new Object();

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a */
    public static Bundle m4255a(C0818o.a aVar) {
        Bundle bundle = new Bundle();
        IconCompat m4077d = aVar.m4077d();
        bundle.putInt("icon", m4077d != null ? m4077d.m4513m() : 0);
        bundle.putCharSequence("title", aVar.m4081h());
        bundle.putParcelable("actionIntent", aVar.m4074a());
        Bundle bundle2 = aVar.m4076c() != null ? new Bundle(aVar.m4076c()) : new Bundle();
        bundle2.putBoolean("android.support.allowGeneratedReplies", aVar.m4075b());
        bundle.putBundle("extras", bundle2);
        bundle.putParcelableArray("remoteInputs", m4257c(aVar.m4078e()));
        bundle.putBoolean("showsUserInterface", aVar.m4080g());
        bundle.putInt("semanticAction", aVar.m4079f());
        return bundle;
    }

    /* renamed from: b */
    private static Bundle m4256b(C0838u1 c0838u1) {
        Bundle bundle = new Bundle();
        bundle.putString("resultKey", c0838u1.m4326i());
        bundle.putCharSequence("label", c0838u1.m4325h());
        bundle.putCharSequenceArray("choices", c0838u1.m4322e());
        bundle.putBoolean("allowFreeFormInput", c0838u1.m4320c());
        bundle.putBundle("extras", c0838u1.m4324g());
        Set<String> m4321d = c0838u1.m4321d();
        if (m4321d != null && !m4321d.isEmpty()) {
            ArrayList<String> arrayList = new ArrayList<>(m4321d.size());
            Iterator<String> it = m4321d.iterator();
            while (it.hasNext()) {
                arrayList.add(it.next());
            }
            bundle.putStringArrayList("allowedDataTypes", arrayList);
        }
        return bundle;
    }

    /* renamed from: c */
    private static Bundle[] m4257c(C0838u1[] c0838u1Arr) {
        if (c0838u1Arr == null) {
            return null;
        }
        Bundle[] bundleArr = new Bundle[c0838u1Arr.length];
        for (int i10 = 0; i10 < c0838u1Arr.length; i10++) {
            bundleArr[i10] = m4256b(c0838u1Arr[i10]);
        }
        return bundleArr;
    }
}

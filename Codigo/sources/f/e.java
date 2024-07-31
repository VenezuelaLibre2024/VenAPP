package f;

import android.content.Context;
import android.content.Intent;
import ck.m;
import ck.r;
import dk.j0;
import dk.k0;
import dk.z;
import f.a;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.g;
import kotlin.jvm.internal.n;
import uk.l;

/* loaded from: classes.dex */
public final class e extends f.a<String[], Map<String, Boolean>> {

    /* renamed from: a, reason: collision with root package name */
    public static final a f14841a = new a(null);

    /* loaded from: classes.dex */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(g gVar) {
            this();
        }

        public final Intent a(String[] input) {
            n.e(input, "input");
            Intent putExtra = new Intent("androidx.activity.result.contract.action.REQUEST_PERMISSIONS").putExtra("androidx.activity.result.contract.extra.PERMISSIONS", input);
            n.d(putExtra, "Intent(ACTION_REQUEST_PE…EXTRA_PERMISSIONS, input)");
            return putExtra;
        }
    }

    @Override // f.a
    /* renamed from: d, reason: merged with bridge method [inline-methods] */
    public Intent a(Context context, String[] input) {
        n.e(context, "context");
        n.e(input, "input");
        return f14841a.a(input);
    }

    @Override // f.a
    /* renamed from: e, reason: merged with bridge method [inline-methods] */
    public a.C0232a<Map<String, Boolean>> b(Context context, String[] input) {
        int e10;
        int b10;
        Map h10;
        n.e(context, "context");
        n.e(input, "input");
        boolean z10 = true;
        if (input.length == 0) {
            h10 = k0.h();
            return new a.C0232a<>(h10);
        }
        int length = input.length;
        int i10 = 0;
        while (true) {
            if (i10 >= length) {
                break;
            }
            if (!(androidx.core.content.a.checkSelfPermission(context, input[i10]) == 0)) {
                z10 = false;
                break;
            }
            i10++;
        }
        if (!z10) {
            return null;
        }
        e10 = j0.e(input.length);
        b10 = l.b(e10, 16);
        LinkedHashMap linkedHashMap = new LinkedHashMap(b10);
        for (String str : input) {
            m a10 = r.a(str, Boolean.TRUE);
            linkedHashMap.put(a10.c(), a10.d());
        }
        return new a.C0232a<>(linkedHashMap);
    }

    @Override // f.a
    /* renamed from: f, reason: merged with bridge method [inline-methods] */
    public Map<String, Boolean> c(int i10, Intent intent) {
        Map<String, Boolean> h10;
        List r10;
        List l02;
        Map<String, Boolean> q10;
        Map<String, Boolean> h11;
        Map<String, Boolean> h12;
        if (i10 != -1) {
            h12 = k0.h();
            return h12;
        }
        if (intent == null) {
            h11 = k0.h();
            return h11;
        }
        String[] stringArrayExtra = intent.getStringArrayExtra("androidx.activity.result.contract.extra.PERMISSIONS");
        int[] intArrayExtra = intent.getIntArrayExtra("androidx.activity.result.contract.extra.PERMISSION_GRANT_RESULTS");
        if (intArrayExtra == null || stringArrayExtra == null) {
            h10 = k0.h();
            return h10;
        }
        ArrayList arrayList = new ArrayList(intArrayExtra.length);
        for (int i11 : intArrayExtra) {
            arrayList.add(Boolean.valueOf(i11 == 0));
        }
        r10 = dk.m.r(stringArrayExtra);
        l02 = z.l0(r10, arrayList);
        q10 = k0.q(l02);
        return q10;
    }
}

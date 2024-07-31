package p091f;

import android.content.Context;
import android.content.Intent;
import androidx.core.content.C0854a;
import ck.C2028m;
import ck.C2033r;
import dk.C7016j0;
import dk.C7018k0;
import dk.C7021m;
import dk.C7042z;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.C9315g;
import kotlin.jvm.internal.C9322n;
import p091f.AbstractC7255a;
import uk.C11585l;

/* renamed from: f.e */
/* loaded from: classes.dex */
public final class C7259e extends AbstractC7255a<String[], Map<String, Boolean>> {

    /* renamed from: a */
    public static final a f16264a = new a(null);

    /* renamed from: f.e$a */
    /* loaded from: classes.dex */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(C9315g c9315g) {
            this();
        }

        /* renamed from: a */
        public final Intent m21724a(String[] input) {
            C9322n.m27781e(input, "input");
            Intent putExtra = new Intent("androidx.activity.result.contract.action.REQUEST_PERMISSIONS").putExtra("androidx.activity.result.contract.extra.PERMISSIONS", input);
            C9322n.m27780d(putExtra, "Intent(ACTION_REQUEST_PE…EXTRA_PERMISSIONS, input)");
            return putExtra;
        }
    }

    @Override // p091f.AbstractC7255a
    /* renamed from: d, reason: merged with bridge method [inline-methods] */
    public Intent mo7118a(Context context, String[] input) {
        C9322n.m27781e(context, "context");
        C9322n.m27781e(input, "input");
        return f16264a.m21724a(input);
    }

    @Override // p091f.AbstractC7255a
    /* renamed from: e, reason: merged with bridge method [inline-methods] */
    public AbstractC7255a.a<Map<String, Boolean>> mo21704b(Context context, String[] input) {
        int m20418e;
        int m36293b;
        Map m20421h;
        C9322n.m27781e(context, "context");
        C9322n.m27781e(input, "input");
        boolean z10 = true;
        if (input.length == 0) {
            m20421h = C7018k0.m20421h();
            return new AbstractC7255a.a<>(m20421h);
        }
        int length = input.length;
        int i10 = 0;
        while (true) {
            if (i10 >= length) {
                break;
            }
            if (!(C0854a.checkSelfPermission(context, input[i10]) == 0)) {
                z10 = false;
                break;
            }
            i10++;
        }
        if (!z10) {
            return null;
        }
        m20418e = C7016j0.m20418e(input.length);
        m36293b = C11585l.m36293b(m20418e, 16);
        LinkedHashMap linkedHashMap = new LinkedHashMap(m36293b);
        for (String str : input) {
            C2028m m10353a = C2033r.m10353a(str, Boolean.TRUE);
            linkedHashMap.put(m10353a.m10337c(), m10353a.m10338d());
        }
        return new AbstractC7255a.a<>(linkedHashMap);
    }

    @Override // p091f.AbstractC7255a
    /* renamed from: f, reason: merged with bridge method [inline-methods] */
    public Map<String, Boolean> mo7119c(int i10, Intent intent) {
        Map<String, Boolean> m20421h;
        List m20490r;
        List m20636l0;
        Map<String, Boolean> m20430q;
        Map<String, Boolean> m20421h2;
        Map<String, Boolean> m20421h3;
        if (i10 != -1) {
            m20421h3 = C7018k0.m20421h();
            return m20421h3;
        }
        if (intent == null) {
            m20421h2 = C7018k0.m20421h();
            return m20421h2;
        }
        String[] stringArrayExtra = intent.getStringArrayExtra("androidx.activity.result.contract.extra.PERMISSIONS");
        int[] intArrayExtra = intent.getIntArrayExtra("androidx.activity.result.contract.extra.PERMISSION_GRANT_RESULTS");
        if (intArrayExtra == null || stringArrayExtra == null) {
            m20421h = C7018k0.m20421h();
            return m20421h;
        }
        ArrayList arrayList = new ArrayList(intArrayExtra.length);
        for (int i11 : intArrayExtra) {
            arrayList.add(Boolean.valueOf(i11 == 0));
        }
        m20490r = C7021m.m20490r(stringArrayExtra);
        m20636l0 = C7042z.m20636l0(m20490r, arrayList);
        m20430q = C7018k0.m20430q(m20636l0);
        return m20430q;
    }
}

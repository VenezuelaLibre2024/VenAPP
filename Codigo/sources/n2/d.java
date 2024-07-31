package n2;

import f2.j;
import java.util.List;
import k2.i;
import k2.o;
import k2.u;
import k2.x;
import k2.z;
import kotlin.jvm.internal.n;

/* loaded from: classes.dex */
public final class d {

    /* renamed from: a */
    private static final String f21687a;

    static {
        String i10 = j.i("DiagnosticsWrkr");
        n.d(i10, "tagWithPrefix(\"DiagnosticsWrkr\")");
        f21687a = i10;
    }

    private static final String c(u uVar, String str, Integer num, String str2) {
        return '\n' + uVar.f20223a + "\t " + uVar.f20225c + "\t " + num + "\t " + uVar.f20224b.name() + "\t " + str + "\t " + str2 + '\t';
    }

    public static final String d(o oVar, z zVar, k2.j jVar, List<u> list) {
        String M;
        String M2;
        StringBuilder sb2 = new StringBuilder();
        sb2.append("\n Id \t Class Name\t Job Id\t State\t Unique Name\t Tags\t");
        for (u uVar : list) {
            i e10 = jVar.e(x.a(uVar));
            Integer valueOf = e10 != null ? Integer.valueOf(e10.f20196c) : null;
            M = dk.z.M(oVar.b(uVar.f20223a), ",", null, null, 0, null, null, 62, null);
            M2 = dk.z.M(zVar.a(uVar.f20223a), ",", null, null, 0, null, null, 62, null);
            sb2.append(c(uVar, M, valueOf, M2));
        }
        String sb3 = sb2.toString();
        n.d(sb3, "StringBuilder().apply(builderAction).toString()");
        return sb3;
    }
}

package p245n2;

import dk.C7042z;
import java.util.List;
import kotlin.jvm.internal.C9322n;
import p094f2.AbstractC7277j;
import p192k2.C9120i;
import p192k2.C9132u;
import p192k2.C9135x;
import p192k2.InterfaceC9121j;
import p192k2.InterfaceC9126o;
import p192k2.InterfaceC9137z;

/* renamed from: n2.d */
/* loaded from: classes.dex */
public final class C9634d {

    /* renamed from: a */
    private static final String f23620a;

    static {
        String m21769i = AbstractC7277j.m21769i("DiagnosticsWrkr");
        C9322n.m27780d(m21769i, "tagWithPrefix(\"DiagnosticsWrkr\")");
        f23620a = m21769i;
    }

    /* renamed from: c */
    private static final String m28845c(C9132u c9132u, String str, Integer num, String str2) {
        return '\n' + c9132u.f22005a + "\t " + c9132u.f22007c + "\t " + num + "\t " + c9132u.f22006b.name() + "\t " + str + "\t " + str2 + '\t';
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: d */
    public static final String m28846d(InterfaceC9126o interfaceC9126o, InterfaceC9137z interfaceC9137z, InterfaceC9121j interfaceC9121j, List<C9132u> list) {
        String m20611M;
        String m20611M2;
        StringBuilder sb2 = new StringBuilder();
        sb2.append("\n Id \t Class Name\t Job Id\t State\t Unique Name\t Tags\t");
        for (C9132u c9132u : list) {
            C9120i mo26867e = interfaceC9121j.mo26867e(C9135x.m26934a(c9132u));
            Integer valueOf = mo26867e != null ? Integer.valueOf(mo26867e.f21978c) : null;
            m20611M = C7042z.m20611M(interfaceC9126o.mo26880b(c9132u.f22005a), ",", null, null, 0, null, null, 62, null);
            m20611M2 = C7042z.m20611M(interfaceC9137z.mo26833a(c9132u.f22005a), ",", null, null, 0, null, null, 62, null);
            sb2.append(m28845c(c9132u, m20611M, valueOf, m20611M2));
        }
        String sb3 = sb2.toString();
        C9322n.m27780d(sb3, "StringBuilder().apply(builderAction).toString()");
        return sb3;
    }
}

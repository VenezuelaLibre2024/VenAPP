package p388ul;

import com.facebook.ads.AdError;
import java.util.Arrays;
import java.util.logging.Logger;
import kotlin.jvm.internal.C9308a0;
import kotlin.jvm.internal.C9322n;

/* renamed from: ul.b */
/* loaded from: classes3.dex */
public final class C11587b {
    /* renamed from: a */
    public static final /* synthetic */ void m36310a(AbstractC11586a abstractC11586a, C11589d c11589d, String str) {
        m36312c(abstractC11586a, c11589d, str);
    }

    /* renamed from: b */
    public static final String m36311b(long j10) {
        StringBuilder sb2;
        long j11;
        long j12;
        long j13;
        if (j10 > -999500000) {
            if (j10 > -999500) {
                if (j10 <= 0) {
                    sb2 = new StringBuilder();
                    j13 = j10 - 500;
                } else if (j10 < 999500) {
                    sb2 = new StringBuilder();
                    j13 = j10 + 500;
                } else if (j10 < 999500000) {
                    sb2 = new StringBuilder();
                    j12 = j10 + 500000;
                } else {
                    sb2 = new StringBuilder();
                    j11 = j10 + 500000000;
                }
                sb2.append(j13 / AdError.NETWORK_ERROR_CODE);
                sb2.append(" µs");
                String sb3 = sb2.toString();
                C9308a0 c9308a0 = C9308a0.f22565a;
                String format = String.format("%6s", Arrays.copyOf(new Object[]{sb3}, 1));
                C9322n.m27780d(format, "format(format, *args)");
                return format;
            }
            sb2 = new StringBuilder();
            j12 = j10 - 500000;
            sb2.append(j12 / 1000000);
            sb2.append(" ms");
            String sb32 = sb2.toString();
            C9308a0 c9308a02 = C9308a0.f22565a;
            String format2 = String.format("%6s", Arrays.copyOf(new Object[]{sb32}, 1));
            C9322n.m27780d(format2, "format(format, *args)");
            return format2;
        }
        sb2 = new StringBuilder();
        j11 = j10 - 500000000;
        sb2.append(j11 / 1000000000);
        sb2.append(" s ");
        String sb322 = sb2.toString();
        C9308a0 c9308a022 = C9308a0.f22565a;
        String format22 = String.format("%6s", Arrays.copyOf(new Object[]{sb322}, 1));
        C9322n.m27780d(format22, "format(format, *args)");
        return format22;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: c */
    public static final void m36312c(AbstractC11586a abstractC11586a, C11589d c11589d, String str) {
        Logger m36341a = C11590e.f30143h.m36341a();
        StringBuilder sb2 = new StringBuilder();
        sb2.append(c11589d.m36319f());
        sb2.append(' ');
        C9308a0 c9308a0 = C9308a0.f22565a;
        String format = String.format("%-22s", Arrays.copyOf(new Object[]{str}, 1));
        C9322n.m27780d(format, "format(format, *args)");
        sb2.append(format);
        sb2.append(": ");
        sb2.append(abstractC11586a.m36304b());
        m36341a.fine(sb2.toString());
    }
}

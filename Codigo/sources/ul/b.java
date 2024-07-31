package ul;

import com.facebook.ads.AdError;
import java.util.Arrays;
import java.util.logging.Logger;
import kotlin.jvm.internal.a0;
import kotlin.jvm.internal.n;

/* loaded from: classes3.dex */
public final class b {
    public static final /* synthetic */ void a(a aVar, d dVar, String str) {
        c(aVar, dVar, str);
    }

    public static final String b(long j10) {
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
                a0 a0Var = a0.f20743a;
                String format = String.format("%6s", Arrays.copyOf(new Object[]{sb3}, 1));
                n.d(format, "format(format, *args)");
                return format;
            }
            sb2 = new StringBuilder();
            j12 = j10 - 500000;
            sb2.append(j12 / 1000000);
            sb2.append(" ms");
            String sb32 = sb2.toString();
            a0 a0Var2 = a0.f20743a;
            String format2 = String.format("%6s", Arrays.copyOf(new Object[]{sb32}, 1));
            n.d(format2, "format(format, *args)");
            return format2;
        }
        sb2 = new StringBuilder();
        j11 = j10 - 500000000;
        sb2.append(j11 / 1000000000);
        sb2.append(" s ");
        String sb322 = sb2.toString();
        a0 a0Var22 = a0.f20743a;
        String format22 = String.format("%6s", Arrays.copyOf(new Object[]{sb322}, 1));
        n.d(format22, "format(format, *args)");
        return format22;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void c(a aVar, d dVar, String str) {
        Logger a10 = e.f27820h.a();
        StringBuilder sb2 = new StringBuilder();
        sb2.append(dVar.f());
        sb2.append(' ');
        a0 a0Var = a0.f20743a;
        String format = String.format("%-22s", Arrays.copyOf(new Object[]{str}, 1));
        n.d(format, "format(format, *args)");
        sb2.append(format);
        sb2.append(": ");
        sb2.append(aVar.b());
        a10.fine(sb2.toString());
    }
}

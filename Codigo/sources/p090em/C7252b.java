package p090em;

import dm.C7056b;
import dm.C7061e;
import kotlin.jvm.internal.C9322n;

/* renamed from: em.b */
/* loaded from: classes3.dex */
public final class C7252b {

    /* renamed from: a */
    private static final char[] f16253a = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'a', 'b', 'c', 'd', 'e', 'f'};

    /* JADX WARN: Removed duplicated region for block: B:174:0x0213 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:240:0x0047 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:267:0x0081 A[EDGE_INSN: B:267:0x0081->B:268:0x0081 BREAK  A[LOOP:1: B:249:0x0051->B:276:0x0088, LOOP_LABEL: LOOP:0: B:2:0x0008->B:43:0x0008], SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:30:0x00da A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:95:0x016a A[SYNTHETIC] */
    /* renamed from: c */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final int m21698c(byte[] r19, int r20) {
        /*
            Method dump skipped, instructions count: 550
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: p090em.C7252b.m21698c(byte[], int):int");
    }

    /* renamed from: d */
    public static final void m21699d(C7061e c7061e, C7056b buffer, int i10, int i11) {
        C9322n.m27781e(c7061e, "<this>");
        C9322n.m27781e(buffer, "buffer");
        buffer.write(c7061e.m20766n(), i10, i11);
    }

    /* renamed from: e */
    public static final int m21700e(char c10) {
        if ('0' <= c10 && c10 < ':') {
            return c10 - '0';
        }
        char c11 = 'a';
        if (!('a' <= c10 && c10 < 'g')) {
            c11 = 'A';
            if (!('A' <= c10 && c10 < 'G')) {
                throw new IllegalArgumentException("Unexpected hex digit: " + c10);
            }
        }
        return (c10 - c11) + 10;
    }

    /* renamed from: f */
    public static final char[] m21701f() {
        return f16253a;
    }
}

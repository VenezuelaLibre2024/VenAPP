package p314qg;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: qg.f */
/* loaded from: classes2.dex */
public final class C10481f implements InterfaceC10482g {
    /* renamed from: b */
    private static void m31443b(char c10, StringBuilder sb2) {
        if (c10 < ' ' || c10 > '?') {
            if (c10 < '@' || c10 > '^') {
                C10485j.m31472e(c10);
                return;
            }
            c10 = (char) (c10 - '@');
        }
        sb2.append(c10);
    }

    /* renamed from: c */
    private static String m31444c(CharSequence charSequence) {
        int length = charSequence.length();
        if (length == 0) {
            throw new IllegalStateException("StringBuilder must not be empty");
        }
        int charAt = (charSequence.charAt(0) << 18) + ((length >= 2 ? charSequence.charAt(1) : (char) 0) << '\f') + ((length >= 3 ? charSequence.charAt(2) : (char) 0) << 6) + (length >= 4 ? charSequence.charAt(3) : (char) 0);
        char c10 = (char) ((charAt >> 16) & 255);
        char c11 = (char) ((charAt >> 8) & 255);
        char c12 = (char) (charAt & 255);
        StringBuilder sb2 = new StringBuilder(3);
        sb2.append(c10);
        if (length >= 2) {
            sb2.append(c11);
        }
        if (length >= 3) {
            sb2.append(c12);
        }
        return sb2.toString();
    }

    /* renamed from: e */
    private static void m31445e(C10483h c10483h, CharSequence charSequence) {
        try {
            int length = charSequence.length();
            if (length == 0) {
                return;
            }
            boolean z10 = true;
            if (length == 1) {
                c10483h.m31462p();
                int m31537a = c10483h.m31454g().m31537a() - c10483h.m31448a();
                int m31453f = c10483h.m31453f();
                if (m31453f > m31537a) {
                    c10483h.m31463q(c10483h.m31448a() + 1);
                    m31537a = c10483h.m31454g().m31537a() - c10483h.m31448a();
                }
                if (m31453f <= m31537a && m31537a <= 2) {
                    return;
                }
            }
            if (length > 4) {
                throw new IllegalStateException("Count must not exceed 4");
            }
            int i10 = length - 1;
            String m31444c = m31444c(charSequence);
            if (!(!c10483h.m31455i()) || i10 > 2) {
                z10 = false;
            }
            if (i10 <= 2) {
                c10483h.m31463q(c10483h.m31448a() + i10);
                if (c10483h.m31454g().m31537a() - c10483h.m31448a() >= 3) {
                    c10483h.m31463q(c10483h.m31448a() + m31444c.length());
                    z10 = false;
                }
            }
            if (z10) {
                c10483h.m31457k();
                c10483h.f26031f -= i10;
            } else {
                c10483h.m31465s(m31444c);
            }
        } finally {
            c10483h.m31461o(0);
        }
    }

    @Override // p314qg.InterfaceC10482g
    /* renamed from: a */
    public void mo31420a(C10483h c10483h) {
        StringBuilder sb2 = new StringBuilder();
        while (true) {
            if (!c10483h.m31455i()) {
                break;
            }
            m31443b(c10483h.m31450c(), sb2);
            c10483h.f26031f++;
            if (sb2.length() >= 4) {
                c10483h.m31465s(m31444c(sb2));
                sb2.delete(0, 4);
                if (C10485j.m31481n(c10483h.m31451d(), c10483h.f26031f, m31446d()) != m31446d()) {
                    c10483h.m31461o(0);
                    break;
                }
            }
        }
        sb2.append((char) 31);
        m31445e(c10483h, sb2);
    }

    /* renamed from: d */
    public int m31446d() {
        return 4;
    }
}

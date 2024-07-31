package androidx.recyclerview.widget;

import androidx.recyclerview.widget.C1401a;
import java.util.List;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: androidx.recyclerview.widget.g */
/* loaded from: classes.dex */
public class C1407g {

    /* renamed from: a */
    final a f6244a;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: androidx.recyclerview.widget.g$a */
    /* loaded from: classes.dex */
    public interface a {
        /* renamed from: a */
        C1401a.b mo7976a(int i10, int i11, int i12, Object obj);

        /* renamed from: b */
        void mo7977b(C1401a.b bVar);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public C1407g(a aVar) {
        this.f6244a = aVar;
    }

    /* renamed from: a */
    private int m8055a(List<C1401a.b> list) {
        boolean z10 = false;
        for (int size = list.size() - 1; size >= 0; size--) {
            if (list.get(size).f6127a != 8) {
                z10 = true;
            } else if (z10) {
                return size;
            }
        }
        return -1;
    }

    /* renamed from: c */
    private void m8056c(List<C1401a.b> list, int i10, C1401a.b bVar, int i11, C1401a.b bVar2) {
        int i12 = bVar.f6130d;
        int i13 = bVar2.f6128b;
        int i14 = i12 < i13 ? -1 : 0;
        int i15 = bVar.f6128b;
        if (i15 < i13) {
            i14++;
        }
        if (i13 <= i15) {
            bVar.f6128b = i15 + bVar2.f6130d;
        }
        int i16 = bVar2.f6128b;
        if (i16 <= i12) {
            bVar.f6130d = i12 + bVar2.f6130d;
        }
        bVar2.f6128b = i16 + i14;
        list.set(i10, bVar2);
        list.set(i11, bVar);
    }

    /* renamed from: d */
    private void m8057d(List<C1401a.b> list, int i10, int i11) {
        C1401a.b bVar = list.get(i10);
        C1401a.b bVar2 = list.get(i11);
        int i12 = bVar2.f6127a;
        if (i12 == 1) {
            m8056c(list, i10, bVar, i11, bVar2);
        } else if (i12 == 2) {
            m8059e(list, i10, bVar, i11, bVar2);
        } else {
            if (i12 != 4) {
                return;
            }
            m8060f(list, i10, bVar, i11, bVar2);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: b */
    public void m8058b(List<C1401a.b> list) {
        while (true) {
            int m8055a = m8055a(list);
            if (m8055a == -1) {
                return;
            } else {
                m8057d(list, m8055a, m8055a + 1);
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:29:0x009e, code lost:
    
        if (r0 > r14.f6128b) goto L59;
     */
    /* JADX WARN: Code restructure failed: missing block: B:38:0x00ca, code lost:
    
        r12.f6130d = r0 - r14.f6130d;
     */
    /* JADX WARN: Code restructure failed: missing block: B:50:0x00c8, code lost:
    
        if (r0 >= r14.f6128b) goto L59;
     */
    /* renamed from: e */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    void m8059e(java.util.List<androidx.recyclerview.widget.C1401a.b> r10, int r11, androidx.recyclerview.widget.C1401a.b r12, int r13, androidx.recyclerview.widget.C1401a.b r14) {
        /*
            Method dump skipped, instructions count: 229
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.C1407g.m8059e(java.util.List, int, androidx.recyclerview.widget.a$b, int, androidx.recyclerview.widget.a$b):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0048  */
    /* JADX WARN: Removed duplicated region for block: B:12:0x0056  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x005b  */
    /* JADX WARN: Removed duplicated region for block: B:17:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:18:0x004c  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x002b  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0027  */
    /* renamed from: f */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    void m8060f(java.util.List<androidx.recyclerview.widget.C1401a.b> r9, int r10, androidx.recyclerview.widget.C1401a.b r11, int r12, androidx.recyclerview.widget.C1401a.b r13) {
        /*
            r8 = this;
            int r0 = r11.f6130d
            int r1 = r13.f6128b
            r2 = 4
            r3 = 1
            r4 = 0
            if (r0 >= r1) goto Ld
            int r1 = r1 - r3
            r13.f6128b = r1
            goto L20
        Ld:
            int r5 = r13.f6130d
            int r1 = r1 + r5
            if (r0 >= r1) goto L20
            int r5 = r5 - r3
            r13.f6130d = r5
            androidx.recyclerview.widget.g$a r0 = r8.f6244a
            int r1 = r11.f6128b
            java.lang.Object r5 = r13.f6129c
            androidx.recyclerview.widget.a$b r0 = r0.mo7976a(r2, r1, r3, r5)
            goto L21
        L20:
            r0 = r4
        L21:
            int r1 = r11.f6128b
            int r5 = r13.f6128b
            if (r1 > r5) goto L2b
            int r5 = r5 + r3
            r13.f6128b = r5
            goto L41
        L2b:
            int r6 = r13.f6130d
            int r7 = r5 + r6
            if (r1 >= r7) goto L41
            int r5 = r5 + r6
            int r5 = r5 - r1
            androidx.recyclerview.widget.g$a r4 = r8.f6244a
            int r1 = r1 + r3
            java.lang.Object r3 = r13.f6129c
            androidx.recyclerview.widget.a$b r4 = r4.mo7976a(r2, r1, r5, r3)
            int r1 = r13.f6130d
            int r1 = r1 - r5
            r13.f6130d = r1
        L41:
            r9.set(r12, r11)
            int r11 = r13.f6130d
            if (r11 <= 0) goto L4c
            r9.set(r10, r13)
            goto L54
        L4c:
            r9.remove(r10)
            androidx.recyclerview.widget.g$a r11 = r8.f6244a
            r11.mo7977b(r13)
        L54:
            if (r0 == 0) goto L59
            r9.add(r10, r0)
        L59:
            if (r4 == 0) goto L5e
            r9.add(r10, r4)
        L5e:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.C1407g.m8060f(java.util.List, int, androidx.recyclerview.widget.a$b, int, androidx.recyclerview.widget.a$b):void");
    }
}

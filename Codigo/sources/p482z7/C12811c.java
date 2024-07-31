package p482z7;

import android.net.Uri;
import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;
import p363t8.C11172r0;
import p377u7.C11446c;
import p377u7.InterfaceC11444a;

/* renamed from: z7.c */
/* loaded from: classes.dex */
public class C12811c implements InterfaceC11444a<C12811c> {

    /* renamed from: a */
    public final long f34910a;

    /* renamed from: b */
    public final long f34911b;

    /* renamed from: c */
    public final long f34912c;

    /* renamed from: d */
    public final boolean f34913d;

    /* renamed from: e */
    public final long f34914e;

    /* renamed from: f */
    public final long f34915f;

    /* renamed from: g */
    public final long f34916g;

    /* renamed from: h */
    public final long f34917h;

    /* renamed from: i */
    public final C12823o f34918i;

    /* renamed from: j */
    public final C12820l f34919j;

    /* renamed from: k */
    public final Uri f34920k;

    /* renamed from: l */
    public final C12816h f34921l;

    /* renamed from: m */
    private final List<C12815g> f34922m;

    public C12811c(long j10, long j11, long j12, boolean z10, long j13, long j14, long j15, long j16, C12816h c12816h, C12823o c12823o, C12820l c12820l, Uri uri, List<C12815g> list) {
        this.f34910a = j10;
        this.f34911b = j11;
        this.f34912c = j12;
        this.f34913d = z10;
        this.f34914e = j13;
        this.f34915f = j14;
        this.f34916g = j15;
        this.f34917h = j16;
        this.f34921l = c12816h;
        this.f34918i = c12823o;
        this.f34920k = uri;
        this.f34919j = c12820l;
        this.f34922m = list == null ? Collections.emptyList() : list;
    }

    /* renamed from: c */
    private static ArrayList<C12809a> m42457c(List<C12809a> list, LinkedList<C11446c> linkedList) {
        C11446c poll = linkedList.poll();
        int i10 = poll.f29633a;
        ArrayList<C12809a> arrayList = new ArrayList<>();
        do {
            int i11 = poll.f29634b;
            C12809a c12809a = list.get(i11);
            List<AbstractC12818j> list2 = c12809a.f34902c;
            ArrayList arrayList2 = new ArrayList();
            do {
                arrayList2.add(list2.get(poll.f29635c));
                poll = linkedList.poll();
                if (poll.f29633a != i10) {
                    break;
                }
            } while (poll.f29634b == i11);
            arrayList.add(new C12809a(c12809a.f34900a, c12809a.f34901b, arrayList2, c12809a.f34903d, c12809a.f34904e, c12809a.f34905f));
        } while (poll.f29633a == i10);
        linkedList.addFirst(poll);
        return arrayList;
    }

    @Override // p377u7.InterfaceC11444a
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public final C12811c mo9230a(List<C11446c> list) {
        LinkedList linkedList = new LinkedList(list);
        Collections.sort(linkedList);
        linkedList.add(new C11446c(-1, -1, -1));
        ArrayList arrayList = new ArrayList();
        long j10 = 0;
        int i10 = 0;
        while (true) {
            if (i10 >= m42460e()) {
                break;
            }
            if (((C11446c) linkedList.peek()).f29633a != i10) {
                long m42461f = m42461f(i10);
                if (m42461f != -9223372036854775807L) {
                    j10 += m42461f;
                }
            } else {
                C12815g m42459d = m42459d(i10);
                arrayList.add(new C12815g(m42459d.f34945a, m42459d.f34946b - j10, m42457c(m42459d.f34947c, linkedList), m42459d.f34948d));
            }
            i10++;
        }
        long j11 = this.f34911b;
        return new C12811c(this.f34910a, j11 != -9223372036854775807L ? j11 - j10 : -9223372036854775807L, this.f34912c, this.f34913d, this.f34914e, this.f34915f, this.f34916g, this.f34917h, this.f34921l, this.f34918i, this.f34919j, this.f34920k, arrayList);
    }

    /* renamed from: d */
    public final C12815g m42459d(int i10) {
        return this.f34922m.get(i10);
    }

    /* renamed from: e */
    public final int m42460e() {
        return this.f34922m.size();
    }

    /* renamed from: f */
    public final long m42461f(int i10) {
        long j10;
        if (i10 == this.f34922m.size() - 1) {
            j10 = this.f34911b;
            if (j10 == -9223372036854775807L) {
                return -9223372036854775807L;
            }
        } else {
            j10 = this.f34922m.get(i10 + 1).f34946b;
        }
        return j10 - this.f34922m.get(i10).f34946b;
    }

    /* renamed from: g */
    public final long m42462g(int i10) {
        return C11172r0.m34861C0(m42461f(i10));
    }
}

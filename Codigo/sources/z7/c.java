package z7;

import android.net.Uri;
import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;
import t8.r0;

/* loaded from: classes.dex */
public class c implements u7.a<c> {

    /* renamed from: a, reason: collision with root package name */
    public final long f32359a;

    /* renamed from: b, reason: collision with root package name */
    public final long f32360b;

    /* renamed from: c, reason: collision with root package name */
    public final long f32361c;

    /* renamed from: d, reason: collision with root package name */
    public final boolean f32362d;

    /* renamed from: e, reason: collision with root package name */
    public final long f32363e;

    /* renamed from: f, reason: collision with root package name */
    public final long f32364f;

    /* renamed from: g, reason: collision with root package name */
    public final long f32365g;

    /* renamed from: h, reason: collision with root package name */
    public final long f32366h;

    /* renamed from: i, reason: collision with root package name */
    public final o f32367i;

    /* renamed from: j, reason: collision with root package name */
    public final l f32368j;

    /* renamed from: k, reason: collision with root package name */
    public final Uri f32369k;

    /* renamed from: l, reason: collision with root package name */
    public final h f32370l;

    /* renamed from: m, reason: collision with root package name */
    private final List<g> f32371m;

    public c(long j10, long j11, long j12, boolean z10, long j13, long j14, long j15, long j16, h hVar, o oVar, l lVar, Uri uri, List<g> list) {
        this.f32359a = j10;
        this.f32360b = j11;
        this.f32361c = j12;
        this.f32362d = z10;
        this.f32363e = j13;
        this.f32364f = j14;
        this.f32365g = j15;
        this.f32366h = j16;
        this.f32370l = hVar;
        this.f32367i = oVar;
        this.f32369k = uri;
        this.f32368j = lVar;
        this.f32371m = list == null ? Collections.emptyList() : list;
    }

    private static ArrayList<a> c(List<a> list, LinkedList<u7.c> linkedList) {
        u7.c poll = linkedList.poll();
        int i10 = poll.f27330a;
        ArrayList<a> arrayList = new ArrayList<>();
        do {
            int i11 = poll.f27331b;
            a aVar = list.get(i11);
            List<j> list2 = aVar.f32351c;
            ArrayList arrayList2 = new ArrayList();
            do {
                arrayList2.add(list2.get(poll.f27332c));
                poll = linkedList.poll();
                if (poll.f27330a != i10) {
                    break;
                }
            } while (poll.f27331b == i11);
            arrayList.add(new a(aVar.f32349a, aVar.f32350b, arrayList2, aVar.f32352d, aVar.f32353e, aVar.f32354f));
        } while (poll.f27330a == i10);
        linkedList.addFirst(poll);
        return arrayList;
    }

    @Override // u7.a
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public final c a(List<u7.c> list) {
        LinkedList linkedList = new LinkedList(list);
        Collections.sort(linkedList);
        linkedList.add(new u7.c(-1, -1, -1));
        ArrayList arrayList = new ArrayList();
        long j10 = 0;
        int i10 = 0;
        while (true) {
            if (i10 >= e()) {
                break;
            }
            if (((u7.c) linkedList.peek()).f27330a != i10) {
                long f10 = f(i10);
                if (f10 != -9223372036854775807L) {
                    j10 += f10;
                }
            } else {
                g d10 = d(i10);
                arrayList.add(new g(d10.f32394a, d10.f32395b - j10, c(d10.f32396c, linkedList), d10.f32397d));
            }
            i10++;
        }
        long j11 = this.f32360b;
        return new c(this.f32359a, j11 != -9223372036854775807L ? j11 - j10 : -9223372036854775807L, this.f32361c, this.f32362d, this.f32363e, this.f32364f, this.f32365g, this.f32366h, this.f32370l, this.f32367i, this.f32368j, this.f32369k, arrayList);
    }

    public final g d(int i10) {
        return this.f32371m.get(i10);
    }

    public final int e() {
        return this.f32371m.size();
    }

    public final long f(int i10) {
        long j10;
        if (i10 == this.f32371m.size() - 1) {
            j10 = this.f32360b;
            if (j10 == -9223372036854775807L) {
                return -9223372036854775807L;
            }
        } else {
            j10 = this.f32371m.get(i10 + 1).f32395b;
        }
        return j10 - this.f32371m.get(i10).f32395b;
    }

    public final long g(int i10) {
        return r0.C0(f(i10));
    }
}

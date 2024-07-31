.class public final Lyl/f;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/io/Closeable;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lyl/f$a;,
        Lyl/f$d;,
        Lyl/f$c;,
        Lyl/f$b;
    }
.end annotation


# static fields
.field public static final N:Lyl/f$b;

.field private static final O:Lyl/m;


# instance fields
.field private A:J

.field private B:J

.field private C:J

.field private final D:Lyl/m;

.field private E:Lyl/m;

.field private F:J

.field private G:J

.field private H:J

.field private I:J

.field private final J:Ljava/net/Socket;

.field private final K:Lyl/j;

.field private final L:Lyl/f$d;

.field private final M:Ljava/util/Set;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Set<",
            "Ljava/lang/Integer;",
            ">;"
        }
    .end annotation
.end field

.field private final a:Z

.field private final b:Lyl/f$c;

.field private final c:Ljava/util/Map;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Map<",
            "Ljava/lang/Integer;",
            "Lyl/i;",
            ">;"
        }
    .end annotation
.end field

.field private final d:Ljava/lang/String;

.field private e:I

.field private f:I

.field private r:Z

.field private final s:Lul/e;

.field private final t:Lul/d;

.field private final u:Lul/d;

.field private final v:Lul/d;

.field private final w:Lyl/l;

.field private x:J

.field private y:J

.field private z:J


# direct methods
.method static constructor <clinit>()V
    .locals 3

    new-instance v0, Lyl/f$b;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lyl/f$b;-><init>(Lkotlin/jvm/internal/g;)V

    sput-object v0, Lyl/f;->N:Lyl/f$b;

    new-instance v0, Lyl/m;

    invoke-direct {v0}, Lyl/m;-><init>()V

    const/4 v1, 0x7

    const v2, 0xffff

    invoke-virtual {v0, v1, v2}, Lyl/m;->h(II)Lyl/m;

    const/4 v1, 0x5

    const/16 v2, 0x4000

    invoke-virtual {v0, v1, v2}, Lyl/m;->h(II)Lyl/m;

    sput-object v0, Lyl/f;->O:Lyl/m;

    return-void
.end method

.method public constructor <init>(Lyl/f$a;)V
    .locals 6

    const-string v0, "builder"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/n;->e(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    invoke-virtual {p1}, Lyl/f$a;->b()Z

    move-result v0

    iput-boolean v0, p0, Lyl/f;->a:Z

    invoke-virtual {p1}, Lyl/f$a;->d()Lyl/f$c;

    move-result-object v1

    iput-object v1, p0, Lyl/f;->b:Lyl/f$c;

    new-instance v1, Ljava/util/LinkedHashMap;

    invoke-direct {v1}, Ljava/util/LinkedHashMap;-><init>()V

    iput-object v1, p0, Lyl/f;->c:Ljava/util/Map;

    invoke-virtual {p1}, Lyl/f$a;->c()Ljava/lang/String;

    move-result-object v1

    iput-object v1, p0, Lyl/f;->d:Ljava/lang/String;

    invoke-virtual {p1}, Lyl/f$a;->b()Z

    move-result v2

    if-eqz v2, :cond_0

    const/4 v2, 0x3

    goto :goto_0

    :cond_0
    const/4 v2, 0x2

    :goto_0
    iput v2, p0, Lyl/f;->f:I

    invoke-virtual {p1}, Lyl/f$a;->j()Lul/e;

    move-result-object v2

    iput-object v2, p0, Lyl/f;->s:Lul/e;

    invoke-virtual {v2}, Lul/e;->i()Lul/d;

    move-result-object v3

    iput-object v3, p0, Lyl/f;->t:Lul/d;

    invoke-virtual {v2}, Lul/e;->i()Lul/d;

    move-result-object v4

    iput-object v4, p0, Lyl/f;->u:Lul/d;

    invoke-virtual {v2}, Lul/e;->i()Lul/d;

    move-result-object v2

    iput-object v2, p0, Lyl/f;->v:Lul/d;

    invoke-virtual {p1}, Lyl/f$a;->f()Lyl/l;

    move-result-object v2

    iput-object v2, p0, Lyl/f;->w:Lyl/l;

    new-instance v2, Lyl/m;

    invoke-direct {v2}, Lyl/m;-><init>()V

    invoke-virtual {p1}, Lyl/f$a;->b()Z

    move-result v4

    if-eqz v4, :cond_1

    const/4 v4, 0x7

    const/high16 v5, 0x1000000

    invoke-virtual {v2, v4, v5}, Lyl/m;->h(II)Lyl/m;

    :cond_1
    iput-object v2, p0, Lyl/f;->D:Lyl/m;

    sget-object v2, Lyl/f;->O:Lyl/m;

    iput-object v2, p0, Lyl/f;->E:Lyl/m;

    invoke-virtual {v2}, Lyl/m;->c()I

    move-result v2

    int-to-long v4, v2

    iput-wide v4, p0, Lyl/f;->I:J

    invoke-virtual {p1}, Lyl/f$a;->h()Ljava/net/Socket;

    move-result-object v2

    iput-object v2, p0, Lyl/f;->J:Ljava/net/Socket;

    new-instance v2, Lyl/j;

    invoke-virtual {p1}, Lyl/f$a;->g()Ldm/c;

    move-result-object v4

    invoke-direct {v2, v4, v0}, Lyl/j;-><init>(Ldm/c;Z)V

    iput-object v2, p0, Lyl/f;->K:Lyl/j;

    new-instance v2, Lyl/f$d;

    new-instance v4, Lyl/h;

    invoke-virtual {p1}, Lyl/f$a;->i()Ldm/d;

    move-result-object v5

    invoke-direct {v4, v5, v0}, Lyl/h;-><init>(Ldm/d;Z)V

    invoke-direct {v2, p0, v4}, Lyl/f$d;-><init>(Lyl/f;Lyl/h;)V

    iput-object v2, p0, Lyl/f;->L:Lyl/f$d;

    new-instance v0, Ljava/util/LinkedHashSet;

    invoke-direct {v0}, Ljava/util/LinkedHashSet;-><init>()V

    iput-object v0, p0, Lyl/f;->M:Ljava/util/Set;

    invoke-virtual {p1}, Lyl/f$a;->e()I

    move-result v0

    if-eqz v0, :cond_2

    sget-object v0, Ljava/util/concurrent/TimeUnit;->MILLISECONDS:Ljava/util/concurrent/TimeUnit;

    invoke-virtual {p1}, Lyl/f$a;->e()I

    move-result p1

    int-to-long v4, p1

    invoke-virtual {v0, v4, v5}, Ljava/util/concurrent/TimeUnit;->toNanos(J)J

    move-result-wide v4

    const-string p1, " ping"

    invoke-static {v1, p1}, Lkotlin/jvm/internal/n;->k(Ljava/lang/String;Ljava/lang/Object;)Ljava/lang/String;

    move-result-object p1

    new-instance v0, Lyl/f$j;

    invoke-direct {v0, p1, p0, v4, v5}, Lyl/f$j;-><init>(Ljava/lang/String;Lyl/f;J)V

    invoke-virtual {v3, v0, v4, v5}, Lul/d;->i(Lul/a;J)V

    :cond_2
    return-void
.end method

.method public static final synthetic B(Lyl/f;J)V
    .locals 0

    iput-wide p1, p0, Lyl/f;->A:J

    return-void
.end method

.method public static final synthetic E(Lyl/f;J)V
    .locals 0

    iput-wide p1, p0, Lyl/f;->x:J

    return-void
.end method

.method public static final synthetic H(Lyl/f;J)V
    .locals 0

    iput-wide p1, p0, Lyl/f;->y:J

    return-void
.end method

.method public static final synthetic I(Lyl/f;Z)V
    .locals 0

    iput-boolean p1, p0, Lyl/f;->r:Z

    return-void
.end method

.method private final I0(ILjava/util/List;Z)Lyl/i;
    .locals 10
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(I",
            "Ljava/util/List<",
            "Lyl/c;",
            ">;Z)",
            "Lyl/i;"
        }
    .end annotation

    xor-int/lit8 v6, p3, 0x1

    const/4 v4, 0x0

    iget-object v7, p0, Lyl/f;->K:Lyl/j;

    monitor-enter v7

    :try_start_0
    monitor-enter p0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_1

    :try_start_1
    invoke-virtual {p0}, Lyl/f;->h0()I

    move-result v0

    const v1, 0x3fffffff    # 1.9999999f

    if-le v0, v1, :cond_0

    sget-object v0, Lyl/b;->REFUSED_STREAM:Lyl/b;

    invoke-virtual {p0, v0}, Lyl/f;->u1(Lyl/b;)V

    :cond_0
    iget-boolean v0, p0, Lyl/f;->r:Z

    if-nez v0, :cond_7

    invoke-virtual {p0}, Lyl/f;->h0()I

    move-result v8

    invoke-virtual {p0}, Lyl/f;->h0()I

    move-result v0

    add-int/lit8 v0, v0, 0x2

    invoke-virtual {p0, v0}, Lyl/f;->j1(I)V

    new-instance v9, Lyl/i;

    const/4 v5, 0x0

    move-object v0, v9

    move v1, v8

    move-object v2, p0

    move v3, v6

    invoke-direct/range {v0 .. v5}, Lyl/i;-><init>(ILyl/f;ZZLql/t;)V

    const/4 v0, 0x1

    if-eqz p3, :cond_2

    invoke-virtual {p0}, Lyl/f;->D0()J

    move-result-wide v1

    invoke-virtual {p0}, Lyl/f;->B0()J

    move-result-wide v3

    cmp-long p3, v1, v3

    if-gez p3, :cond_2

    invoke-virtual {v9}, Lyl/i;->r()J

    move-result-wide v1

    invoke-virtual {v9}, Lyl/i;->q()J

    move-result-wide v3

    cmp-long p3, v1, v3

    if-ltz p3, :cond_1

    goto :goto_0

    :cond_1
    const/4 p3, 0x0

    goto :goto_1

    :cond_2
    :goto_0
    move p3, v0

    :goto_1
    invoke-virtual {v9}, Lyl/i;->u()Z

    move-result v1

    if-eqz v1, :cond_3

    invoke-virtual {p0}, Lyl/f;->z0()Ljava/util/Map;

    move-result-object v1

    invoke-static {v8}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    invoke-interface {v1, v2, v9}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    :cond_3
    sget-object v1, Lck/v;->a:Lck/v;
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    :try_start_2
    monitor-exit p0

    if-nez p1, :cond_4

    invoke-virtual {p0}, Lyl/f;->F0()Lyl/j;

    move-result-object p1

    invoke-virtual {p1, v6, v8, p2}, Lyl/j;->g(ZILjava/util/List;)V

    goto :goto_2

    :cond_4
    invoke-virtual {p0}, Lyl/f;->S()Z

    move-result v1

    xor-int/2addr v0, v1

    if-eqz v0, :cond_6

    invoke-virtual {p0}, Lyl/f;->F0()Lyl/j;

    move-result-object v0

    invoke-virtual {v0, p1, v8, p2}, Lyl/j;->i(IILjava/util/List;)V
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_1

    :goto_2
    monitor-exit v7

    if-eqz p3, :cond_5

    iget-object p1, p0, Lyl/f;->K:Lyl/j;

    invoke-virtual {p1}, Lyl/j;->flush()V

    :cond_5
    return-object v9

    :cond_6
    :try_start_3
    const-string p1, "client streams shouldn\'t have associated stream IDs"

    new-instance p2, Ljava/lang/IllegalArgumentException;

    invoke-virtual {p1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-direct {p2, p1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p2
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_1

    :cond_7
    :try_start_4
    new-instance p1, Lyl/a;

    invoke-direct {p1}, Lyl/a;-><init>()V

    throw p1
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_0

    :catchall_0
    move-exception p1

    :try_start_5
    monitor-exit p0

    throw p1
    :try_end_5
    .catchall {:try_start_5 .. :try_end_5} :catchall_1

    :catchall_1
    move-exception p1

    monitor-exit v7

    throw p1
.end method

.method public static final synthetic O(Lyl/f;J)V
    .locals 0

    iput-wide p1, p0, Lyl/f;->I:J

    return-void
.end method

.method private final R(Ljava/io/IOException;)V
    .locals 1

    sget-object v0, Lyl/b;->PROTOCOL_ERROR:Lyl/b;

    invoke-virtual {p0, v0, v0, p1}, Lyl/f;->Q(Lyl/b;Lyl/b;Ljava/io/IOException;)V

    return-void
.end method

.method public static final synthetic a(Lyl/f;Ljava/io/IOException;)V
    .locals 0

    invoke-direct {p0, p1}, Lyl/f;->R(Ljava/io/IOException;)V

    return-void
.end method

.method public static final synthetic b(Lyl/f;)J
    .locals 2

    iget-wide v0, p0, Lyl/f;->B:J

    return-wide v0
.end method

.method public static final synthetic e(Lyl/f;)Ljava/util/Set;
    .locals 0

    iget-object p0, p0, Lyl/f;->M:Ljava/util/Set;

    return-object p0
.end method

.method public static final synthetic f()Lyl/m;
    .locals 1

    sget-object v0, Lyl/f;->O:Lyl/m;

    return-object v0
.end method

.method public static final synthetic g(Lyl/f;)J
    .locals 2

    iget-wide v0, p0, Lyl/f;->A:J

    return-wide v0
.end method

.method public static final synthetic i(Lyl/f;)J
    .locals 2

    iget-wide v0, p0, Lyl/f;->x:J

    return-wide v0
.end method

.method public static final synthetic j(Lyl/f;)J
    .locals 2

    iget-wide v0, p0, Lyl/f;->y:J

    return-wide v0
.end method

.method public static final synthetic l(Lyl/f;)Lyl/l;
    .locals 0

    iget-object p0, p0, Lyl/f;->w:Lyl/l;

    return-object p0
.end method

.method public static final synthetic n(Lyl/f;)Lul/d;
    .locals 0

    iget-object p0, p0, Lyl/f;->v:Lul/d;

    return-object p0
.end method

.method public static final synthetic o(Lyl/f;)Lul/e;
    .locals 0

    iget-object p0, p0, Lyl/f;->s:Lul/e;

    return-object p0
.end method

.method public static final synthetic q(Lyl/f;)Lul/d;
    .locals 0

    iget-object p0, p0, Lyl/f;->t:Lul/d;

    return-object p0
.end method

.method public static final synthetic r(Lyl/f;)Z
    .locals 0

    iget-boolean p0, p0, Lyl/f;->r:Z

    return p0
.end method

.method public static synthetic w1(Lyl/f;ZLul/e;ILjava/lang/Object;)V
    .locals 0

    and-int/lit8 p4, p3, 0x1

    if-eqz p4, :cond_0

    const/4 p1, 0x1

    :cond_0
    and-int/lit8 p3, p3, 0x2

    if-eqz p3, :cond_1

    sget-object p2, Lul/e;->i:Lul/e;

    :cond_1
    invoke-virtual {p0, p1, p2}, Lyl/f;->v1(ZLul/e;)V

    return-void
.end method

.method public static final synthetic y(Lyl/f;J)V
    .locals 0

    iput-wide p1, p0, Lyl/f;->B:J

    return-void
.end method


# virtual methods
.method public final A1(ZII)V
    .locals 1

    :try_start_0
    iget-object v0, p0, Lyl/f;->K:Lyl/j;

    invoke-virtual {v0, p1, p2, p3}, Lyl/j;->h(ZII)V
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    :catch_0
    move-exception p1

    invoke-direct {p0, p1}, Lyl/f;->R(Ljava/io/IOException;)V

    :goto_0
    return-void
.end method

.method public final B0()J
    .locals 2

    iget-wide v0, p0, Lyl/f;->I:J

    return-wide v0
.end method

.method public final B1(ILyl/b;)V
    .locals 1

    const-string v0, "statusCode"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/n;->e(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, Lyl/f;->K:Lyl/j;

    invoke-virtual {v0, p1, p2}, Lyl/j;->j(ILyl/b;)V

    return-void
.end method

.method public final C1(ILyl/b;)V
    .locals 9

    const-string v0, "errorCode"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/n;->e(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, Lyl/f;->t:Lul/d;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    iget-object v2, p0, Lyl/f;->d:Ljava/lang/String;

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const/16 v2, 0x5b

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v2, "] writeSynReset"

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v4

    const/4 v5, 0x1

    new-instance v1, Lyl/f$k;

    move-object v3, v1

    move-object v6, p0

    move v7, p1

    move-object v8, p2

    invoke-direct/range {v3 .. v8}, Lyl/f$k;-><init>(Ljava/lang/String;ZLyl/f;ILyl/b;)V

    const-wide/16 p1, 0x0

    invoke-virtual {v0, v1, p1, p2}, Lul/d;->i(Lul/a;J)V

    return-void
.end method

.method public final D0()J
    .locals 2

    iget-wide v0, p0, Lyl/f;->H:J

    return-wide v0
.end method

.method public final D1(IJ)V
    .locals 10

    iget-object v0, p0, Lyl/f;->t:Lul/d;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    iget-object v2, p0, Lyl/f;->d:Ljava/lang/String;

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const/16 v2, 0x5b

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v2, "] windowUpdate"

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v4

    const/4 v5, 0x1

    new-instance v1, Lyl/f$l;

    move-object v3, v1

    move-object v6, p0

    move v7, p1

    move-wide v8, p2

    invoke-direct/range {v3 .. v9}, Lyl/f$l;-><init>(Ljava/lang/String;ZLyl/f;IJ)V

    const-wide/16 p1, 0x0

    invoke-virtual {v0, v1, p1, p2}, Lul/d;->i(Lul/a;J)V

    return-void
.end method

.method public final F0()Lyl/j;
    .locals 1

    iget-object v0, p0, Lyl/f;->K:Lyl/j;

    return-object v0
.end method

.method public final declared-synchronized H0(J)Z
    .locals 6

    monitor-enter p0

    :try_start_0
    iget-boolean v0, p0, Lyl/f;->r:Z
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    const/4 v1, 0x0

    if-eqz v0, :cond_0

    monitor-exit p0

    return v1

    :cond_0
    :try_start_1
    iget-wide v2, p0, Lyl/f;->A:J

    iget-wide v4, p0, Lyl/f;->z:J

    cmp-long v0, v2, v4

    if-gez v0, :cond_1

    iget-wide v2, p0, Lyl/f;->C:J
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    cmp-long p1, p1, v2

    if-ltz p1, :cond_1

    monitor-exit p0

    return v1

    :cond_1
    monitor-exit p0

    const/4 p1, 0x1

    return p1

    :catchall_0
    move-exception p1

    monitor-exit p0

    throw p1
.end method

.method public final J0(Ljava/util/List;Z)Lyl/i;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Lyl/c;",
            ">;Z)",
            "Lyl/i;"
        }
    .end annotation

    const-string v0, "requestHeaders"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/n;->e(Ljava/lang/Object;Ljava/lang/String;)V

    const/4 v0, 0x0

    invoke-direct {p0, v0, p1, p2}, Lyl/f;->I0(ILjava/util/List;Z)Lyl/i;

    move-result-object p1

    return-object p1
.end method

.method public final L0(ILdm/d;IZ)V
    .locals 9

    const-string v0, "source"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/n;->e(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v6, Ldm/b;

    invoke-direct {v6}, Ldm/b;-><init>()V

    int-to-long v0, p3

    invoke-interface {p2, v0, v1}, Ldm/d;->q0(J)V

    invoke-interface {p2, v6, v0, v1}, Ldm/x;->s1(Ldm/b;J)J

    iget-object p2, p0, Lyl/f;->u:Lul/d;

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    iget-object v1, p0, Lyl/f;->d:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const/16 v1, 0x5b

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v1, "] onData"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x1

    new-instance v0, Lyl/f$e;

    move-object v1, v0

    move-object v4, p0

    move v5, p1

    move v7, p3

    move v8, p4

    invoke-direct/range {v1 .. v8}, Lyl/f$e;-><init>(Ljava/lang/String;ZLyl/f;ILdm/b;IZ)V

    const-wide/16 p3, 0x0

    invoke-virtual {p2, v0, p3, p4}, Lul/d;->i(Lul/a;J)V

    return-void
.end method

.method public final Q(Lyl/b;Lyl/b;Ljava/io/IOException;)V
    .locals 3

    const-string v0, "connectionCode"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/n;->e(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "streamCode"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/n;->e(Ljava/lang/Object;Ljava/lang/String;)V

    sget-boolean v0, Lrl/d;->h:Z

    if-eqz v0, :cond_1

    invoke-static {p0}, Ljava/lang/Thread;->holdsLock(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_0

    goto :goto_0

    :cond_0
    new-instance p1, Ljava/lang/AssertionError;

    new-instance p2, Ljava/lang/StringBuilder;

    invoke-direct {p2}, Ljava/lang/StringBuilder;-><init>()V

    const-string p3, "Thread "

    invoke-virtual {p2, p3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-static {}, Ljava/lang/Thread;->currentThread()Ljava/lang/Thread;

    move-result-object p3

    invoke-virtual {p3}, Ljava/lang/Thread;->getName()Ljava/lang/String;

    move-result-object p3

    invoke-virtual {p2, p3}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string p3, " MUST NOT hold lock on "

    invoke-virtual {p2, p3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p2, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {p2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p2

    invoke-direct {p1, p2}, Ljava/lang/AssertionError;-><init>(Ljava/lang/Object;)V

    throw p1

    :cond_1
    :goto_0
    :try_start_0
    invoke-virtual {p0, p1}, Lyl/f;->u1(Lyl/b;)V
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0

    :catch_0
    monitor-enter p0

    :try_start_1
    invoke-virtual {p0}, Lyl/f;->z0()Ljava/util/Map;

    move-result-object p1

    invoke-interface {p1}, Ljava/util/Map;->isEmpty()Z

    move-result p1

    xor-int/lit8 p1, p1, 0x1

    const/4 v0, 0x0

    if-eqz p1, :cond_3

    invoke-virtual {p0}, Lyl/f;->z0()Ljava/util/Map;

    move-result-object p1

    invoke-interface {p1}, Ljava/util/Map;->values()Ljava/util/Collection;

    move-result-object p1

    new-array v1, v0, [Lyl/i;

    invoke-interface {p1, v1}, Ljava/util/Collection;->toArray([Ljava/lang/Object;)[Ljava/lang/Object;

    move-result-object p1

    if-eqz p1, :cond_2

    invoke-virtual {p0}, Lyl/f;->z0()Ljava/util/Map;

    move-result-object v1

    invoke-interface {v1}, Ljava/util/Map;->clear()V

    goto :goto_1

    :cond_2
    new-instance p1, Ljava/lang/NullPointerException;

    const-string p2, "null cannot be cast to non-null type kotlin.Array<T of kotlin.collections.ArraysKt__ArraysJVMKt.toTypedArray>"

    invoke-direct {p1, p2}, Ljava/lang/NullPointerException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_3
    const/4 p1, 0x0

    :goto_1
    sget-object v1, Lck/v;->a:Lck/v;
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    monitor-exit p0

    check-cast p1, [Lyl/i;

    if-nez p1, :cond_4

    goto :goto_3

    :cond_4
    array-length v1, p1

    :goto_2
    if-ge v0, v1, :cond_5

    aget-object v2, p1, v0

    :try_start_2
    invoke-virtual {v2, p2, p3}, Lyl/i;->d(Lyl/b;Ljava/io/IOException;)V
    :try_end_2
    .catch Ljava/io/IOException; {:try_start_2 .. :try_end_2} :catch_1

    :catch_1
    add-int/lit8 v0, v0, 0x1

    goto :goto_2

    :cond_5
    :goto_3
    :try_start_3
    invoke-virtual {p0}, Lyl/f;->F0()Lyl/j;

    move-result-object p1

    invoke-virtual {p1}, Lyl/j;->close()V
    :try_end_3
    .catch Ljava/io/IOException; {:try_start_3 .. :try_end_3} :catch_2

    :catch_2
    :try_start_4
    invoke-virtual {p0}, Lyl/f;->m0()Ljava/net/Socket;

    move-result-object p1

    invoke-virtual {p1}, Ljava/net/Socket;->close()V
    :try_end_4
    .catch Ljava/io/IOException; {:try_start_4 .. :try_end_4} :catch_3

    :catch_3
    iget-object p1, p0, Lyl/f;->t:Lul/d;

    invoke-virtual {p1}, Lul/d;->o()V

    iget-object p1, p0, Lyl/f;->u:Lul/d;

    invoke-virtual {p1}, Lul/d;->o()V

    iget-object p1, p0, Lyl/f;->v:Lul/d;

    invoke-virtual {p1}, Lul/d;->o()V

    return-void

    :catchall_0
    move-exception p1

    monitor-exit p0

    throw p1
.end method

.method public final R0(ILjava/util/List;Z)V
    .locals 10
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(I",
            "Ljava/util/List<",
            "Lyl/c;",
            ">;Z)V"
        }
    .end annotation

    const-string v0, "requestHeaders"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/n;->e(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, Lyl/f;->u:Lul/d;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    iget-object v2, p0, Lyl/f;->d:Ljava/lang/String;

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const/16 v2, 0x5b

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v2, "] onHeaders"

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v4

    const/4 v5, 0x1

    new-instance v1, Lyl/f$f;

    move-object v3, v1

    move-object v6, p0

    move v7, p1

    move-object v8, p2

    move v9, p3

    invoke-direct/range {v3 .. v9}, Lyl/f$f;-><init>(Ljava/lang/String;ZLyl/f;ILjava/util/List;Z)V

    const-wide/16 p1, 0x0

    invoke-virtual {v0, v1, p1, p2}, Lul/d;->i(Lul/a;J)V

    return-void
.end method

.method public final S()Z
    .locals 1

    iget-boolean v0, p0, Lyl/f;->a:Z

    return v0
.end method

.method public final T0(ILjava/util/List;)V
    .locals 9
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(I",
            "Ljava/util/List<",
            "Lyl/c;",
            ">;)V"
        }
    .end annotation

    const-string v0, "requestHeaders"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/n;->e(Ljava/lang/Object;Ljava/lang/String;)V

    monitor-enter p0

    :try_start_0
    iget-object v0, p0, Lyl/f;->M:Ljava/util/Set;

    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    invoke-interface {v0, v1}, Ljava/util/Set;->contains(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    sget-object p2, Lyl/b;->PROTOCOL_ERROR:Lyl/b;

    invoke-virtual {p0, p1, p2}, Lyl/f;->C1(ILyl/b;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    monitor-exit p0

    return-void

    :cond_0
    :try_start_1
    iget-object v0, p0, Lyl/f;->M:Ljava/util/Set;

    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    invoke-interface {v0, v1}, Ljava/util/Set;->add(Ljava/lang/Object;)Z
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    monitor-exit p0

    iget-object v0, p0, Lyl/f;->u:Lul/d;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    iget-object v2, p0, Lyl/f;->d:Ljava/lang/String;

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const/16 v2, 0x5b

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v2, "] onRequest"

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v4

    const/4 v5, 0x1

    new-instance v1, Lyl/f$g;

    move-object v3, v1

    move-object v6, p0

    move v7, p1

    move-object v8, p2

    invoke-direct/range {v3 .. v8}, Lyl/f$g;-><init>(Ljava/lang/String;ZLyl/f;ILjava/util/List;)V

    const-wide/16 p1, 0x0

    invoke-virtual {v0, v1, p1, p2}, Lul/d;->i(Lul/a;J)V

    return-void

    :catchall_0
    move-exception p1

    monitor-exit p0

    throw p1
.end method

.method public final U()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lyl/f;->d:Ljava/lang/String;

    return-object v0
.end method

.method public final W0(ILyl/b;)V
    .locals 9

    const-string v0, "errorCode"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/n;->e(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, Lyl/f;->u:Lul/d;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    iget-object v2, p0, Lyl/f;->d:Ljava/lang/String;

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const/16 v2, 0x5b

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v2, "] onReset"

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v4

    const/4 v5, 0x1

    new-instance v1, Lyl/f$h;

    move-object v3, v1

    move-object v6, p0

    move v7, p1

    move-object v8, p2

    invoke-direct/range {v3 .. v8}, Lyl/f$h;-><init>(Ljava/lang/String;ZLyl/f;ILyl/b;)V

    const-wide/16 p1, 0x0

    invoke-virtual {v0, v1, p1, p2}, Lul/d;->i(Lul/a;J)V

    return-void
.end method

.method public final Y0(I)Z
    .locals 1

    if-eqz p1, :cond_0

    const/4 v0, 0x1

    and-int/2addr p1, v0

    if-nez p1, :cond_0

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    return v0
.end method

.method public final a0()I
    .locals 1

    iget v0, p0, Lyl/f;->e:I

    return v0
.end method

.method public final declared-synchronized a1(I)Lyl/i;
    .locals 1

    monitor-enter p0

    :try_start_0
    iget-object v0, p0, Lyl/f;->c:Ljava/util/Map;

    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p1

    invoke-interface {v0, p1}, Ljava/util/Map;->remove(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lyl/i;

    invoke-virtual {p0}, Ljava/lang/Object;->notifyAll()V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    monitor-exit p0

    return-object p1

    :catchall_0
    move-exception p1

    monitor-exit p0

    throw p1
.end method

.method public final b1()V
    .locals 5

    monitor-enter p0

    :try_start_0
    iget-wide v0, p0, Lyl/f;->A:J

    iget-wide v2, p0, Lyl/f;->z:J
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    cmp-long v0, v0, v2

    if-gez v0, :cond_0

    monitor-exit p0

    return-void

    :cond_0
    const-wide/16 v0, 0x1

    add-long/2addr v2, v0

    :try_start_1
    iput-wide v2, p0, Lyl/f;->z:J

    invoke-static {}, Ljava/lang/System;->nanoTime()J

    move-result-wide v0

    const v2, 0x3b9aca00

    int-to-long v2, v2

    add-long/2addr v0, v2

    iput-wide v0, p0, Lyl/f;->C:J

    sget-object v0, Lck/v;->a:Lck/v;
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    monitor-exit p0

    iget-object v0, p0, Lyl/f;->t:Lul/d;

    iget-object v1, p0, Lyl/f;->d:Ljava/lang/String;

    const-string v2, " ping"

    invoke-static {v1, v2}, Lkotlin/jvm/internal/n;->k(Ljava/lang/String;Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v1

    new-instance v2, Lyl/f$i;

    const/4 v3, 0x1

    invoke-direct {v2, v1, v3, p0}, Lyl/f$i;-><init>(Ljava/lang/String;ZLyl/f;)V

    const-wide/16 v3, 0x0

    invoke-virtual {v0, v2, v3, v4}, Lul/d;->i(Lul/a;J)V

    return-void

    :catchall_0
    move-exception v0

    monitor-exit p0

    throw v0
.end method

.method public final c0()Lyl/f$c;
    .locals 1

    iget-object v0, p0, Lyl/f;->b:Lyl/f$c;

    return-object v0
.end method

.method public final c1(I)V
    .locals 0

    iput p1, p0, Lyl/f;->e:I

    return-void
.end method

.method public close()V
    .locals 3

    sget-object v0, Lyl/b;->NO_ERROR:Lyl/b;

    sget-object v1, Lyl/b;->CANCEL:Lyl/b;

    const/4 v2, 0x0

    invoke-virtual {p0, v0, v1, v2}, Lyl/f;->Q(Lyl/b;Lyl/b;Ljava/io/IOException;)V

    return-void
.end method

.method public final flush()V
    .locals 1

    iget-object v0, p0, Lyl/f;->K:Lyl/j;

    invoke-virtual {v0}, Lyl/j;->flush()V

    return-void
.end method

.method public final h0()I
    .locals 1

    iget v0, p0, Lyl/f;->f:I

    return v0
.end method

.method public final i0()Lyl/m;
    .locals 1

    iget-object v0, p0, Lyl/f;->D:Lyl/m;

    return-object v0
.end method

.method public final j0()Lyl/m;
    .locals 1

    iget-object v0, p0, Lyl/f;->E:Lyl/m;

    return-object v0
.end method

.method public final j1(I)V
    .locals 0

    iput p1, p0, Lyl/f;->f:I

    return-void
.end method

.method public final m0()Ljava/net/Socket;
    .locals 1

    iget-object v0, p0, Lyl/f;->J:Ljava/net/Socket;

    return-object v0
.end method

.method public final q1(Lyl/m;)V
    .locals 1

    const-string v0, "<set-?>"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/n;->e(Ljava/lang/Object;Ljava/lang/String;)V

    iput-object p1, p0, Lyl/f;->E:Lyl/m;

    return-void
.end method

.method public final u1(Lyl/b;)V
    .locals 4

    const-string v0, "statusCode"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/n;->e(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, Lyl/f;->K:Lyl/j;

    monitor-enter v0

    :try_start_0
    new-instance v1, Lkotlin/jvm/internal/w;

    invoke-direct {v1}, Lkotlin/jvm/internal/w;-><init>()V

    monitor-enter p0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_1

    :try_start_1
    iget-boolean v2, p0, Lyl/f;->r:Z
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    if-eqz v2, :cond_0

    :try_start_2
    monitor-exit p0
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_1

    monitor-exit v0

    return-void

    :cond_0
    const/4 v2, 0x1

    :try_start_3
    iput-boolean v2, p0, Lyl/f;->r:Z

    invoke-virtual {p0}, Lyl/f;->a0()I

    move-result v2

    iput v2, v1, Lkotlin/jvm/internal/w;->a:I

    sget-object v2, Lck/v;->a:Lck/v;
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_0

    :try_start_4
    monitor-exit p0

    invoke-virtual {p0}, Lyl/f;->F0()Lyl/j;

    move-result-object v2

    iget v1, v1, Lkotlin/jvm/internal/w;->a:I

    sget-object v3, Lrl/d;->a:[B

    invoke-virtual {v2, v1, p1, v3}, Lyl/j;->f(ILyl/b;[B)V
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_1

    monitor-exit v0

    return-void

    :catchall_0
    move-exception p1

    :try_start_5
    monitor-exit p0

    throw p1
    :try_end_5
    .catchall {:try_start_5 .. :try_end_5} :catchall_1

    :catchall_1
    move-exception p1

    monitor-exit v0

    throw p1
.end method

.method public final declared-synchronized v0(I)Lyl/i;
    .locals 1

    monitor-enter p0

    :try_start_0
    iget-object v0, p0, Lyl/f;->c:Ljava/util/Map;

    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p1

    invoke-interface {v0, p1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lyl/i;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    monitor-exit p0

    return-object p1

    :catchall_0
    move-exception p1

    monitor-exit p0

    throw p1
.end method

.method public final v1(ZLul/e;)V
    .locals 4

    const-string v0, "taskRunner"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/n;->e(Ljava/lang/Object;Ljava/lang/String;)V

    if-eqz p1, :cond_0

    iget-object p1, p0, Lyl/f;->K:Lyl/j;

    invoke-virtual {p1}, Lyl/j;->G()V

    iget-object p1, p0, Lyl/f;->K:Lyl/j;

    iget-object v0, p0, Lyl/f;->D:Lyl/m;

    invoke-virtual {p1, v0}, Lyl/j;->l(Lyl/m;)V

    iget-object p1, p0, Lyl/f;->D:Lyl/m;

    invoke-virtual {p1}, Lyl/m;->c()I

    move-result p1

    const v0, 0xffff

    if-eq p1, v0, :cond_0

    iget-object v1, p0, Lyl/f;->K:Lyl/j;

    sub-int/2addr p1, v0

    int-to-long v2, p1

    const/4 p1, 0x0

    invoke-virtual {v1, p1, v2, v3}, Lyl/j;->d(IJ)V

    :cond_0
    invoke-virtual {p2}, Lul/e;->i()Lul/d;

    move-result-object p1

    iget-object p2, p0, Lyl/f;->d:Ljava/lang/String;

    iget-object v0, p0, Lyl/f;->L:Lyl/f$d;

    new-instance v1, Lul/c;

    const/4 v2, 0x1

    invoke-direct {v1, p2, v2, v0}, Lul/c;-><init>(Ljava/lang/String;ZLok/a;)V

    const-wide/16 v2, 0x0

    invoke-virtual {p1, v1, v2, v3}, Lul/d;->i(Lul/a;J)V

    return-void
.end method

.method public final declared-synchronized x1(J)V
    .locals 2

    monitor-enter p0

    :try_start_0
    iget-wide v0, p0, Lyl/f;->F:J

    add-long/2addr v0, p1

    iput-wide v0, p0, Lyl/f;->F:J

    iget-wide p1, p0, Lyl/f;->G:J

    sub-long/2addr v0, p1

    iget-object p1, p0, Lyl/f;->D:Lyl/m;

    invoke-virtual {p1}, Lyl/m;->c()I

    move-result p1

    div-int/lit8 p1, p1, 0x2

    int-to-long p1, p1

    cmp-long p1, v0, p1

    if-ltz p1, :cond_0

    const/4 p1, 0x0

    invoke-virtual {p0, p1, v0, v1}, Lyl/f;->D1(IJ)V

    iget-wide p1, p0, Lyl/f;->G:J

    add-long/2addr p1, v0

    iput-wide p1, p0, Lyl/f;->G:J
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    :cond_0
    monitor-exit p0

    return-void

    :catchall_0
    move-exception p1

    monitor-exit p0

    throw p1
.end method

.method public final y1(IZLdm/b;J)V
    .locals 8

    const-wide/16 v0, 0x0

    cmp-long v2, p4, v0

    const/4 v3, 0x0

    if-nez v2, :cond_0

    iget-object p4, p0, Lyl/f;->K:Lyl/j;

    invoke-virtual {p4, p2, p1, p3, v3}, Lyl/j;->X0(ZILdm/b;I)V

    return-void

    :cond_0
    :goto_0
    cmp-long v2, p4, v0

    if-lez v2, :cond_4

    monitor-enter p0

    :goto_1
    :try_start_0
    invoke-virtual {p0}, Lyl/f;->D0()J

    move-result-wide v4

    invoke-virtual {p0}, Lyl/f;->B0()J

    move-result-wide v6

    cmp-long v2, v4, v6

    if-ltz v2, :cond_2

    invoke-virtual {p0}, Lyl/f;->z0()Ljava/util/Map;

    move-result-object v2

    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v4

    invoke-interface {v2, v4}, Ljava/util/Map;->containsKey(Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_1

    invoke-virtual {p0}, Ljava/lang/Object;->wait()V

    goto :goto_1

    :cond_1
    new-instance p1, Ljava/io/IOException;

    const-string p2, "stream closed"

    invoke-direct {p1, p2}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    throw p1
    :try_end_0
    .catch Ljava/lang/InterruptedException; {:try_start_0 .. :try_end_0} :catch_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    :cond_2
    :try_start_1
    invoke-virtual {p0}, Lyl/f;->B0()J

    move-result-wide v4

    invoke-virtual {p0}, Lyl/f;->D0()J

    move-result-wide v6

    sub-long/2addr v4, v6

    invoke-static {p4, p5, v4, v5}, Ljava/lang/Math;->min(JJ)J

    move-result-wide v4

    long-to-int v2, v4

    invoke-virtual {p0}, Lyl/f;->F0()Lyl/j;

    move-result-object v4

    invoke-virtual {v4}, Lyl/j;->p0()I

    move-result v4

    invoke-static {v2, v4}, Ljava/lang/Math;->min(II)I

    move-result v2

    invoke-virtual {p0}, Lyl/f;->D0()J

    move-result-wide v4

    int-to-long v6, v2

    add-long/2addr v4, v6

    iput-wide v4, p0, Lyl/f;->H:J

    sget-object v4, Lck/v;->a:Lck/v;
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    monitor-exit p0

    sub-long/2addr p4, v6

    iget-object v4, p0, Lyl/f;->K:Lyl/j;

    if-eqz p2, :cond_3

    cmp-long v5, p4, v0

    if-nez v5, :cond_3

    const/4 v5, 0x1

    goto :goto_2

    :cond_3
    move v5, v3

    :goto_2
    invoke-virtual {v4, v5, p1, p3, v2}, Lyl/j;->X0(ZILdm/b;I)V

    goto :goto_0

    :catchall_0
    move-exception p1

    goto :goto_3

    :catch_0
    :try_start_2
    invoke-static {}, Ljava/lang/Thread;->currentThread()Ljava/lang/Thread;

    move-result-object p1

    invoke-virtual {p1}, Ljava/lang/Thread;->interrupt()V

    new-instance p1, Ljava/io/InterruptedIOException;

    invoke-direct {p1}, Ljava/io/InterruptedIOException;-><init>()V

    throw p1
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    :goto_3
    monitor-exit p0

    throw p1

    :cond_4
    return-void
.end method

.method public final z0()Ljava/util/Map;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/Map<",
            "Ljava/lang/Integer;",
            "Lyl/i;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Lyl/f;->c:Ljava/util/Map;

    return-object v0
.end method

.method public final z1(IZLjava/util/List;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(IZ",
            "Ljava/util/List<",
            "Lyl/c;",
            ">;)V"
        }
    .end annotation

    const-string v0, "alternating"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/n;->e(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, Lyl/f;->K:Lyl/j;

    invoke-virtual {v0, p2, p1, p3}, Lyl/j;->g(ZILjava/util/List;)V

    return-void
.end method

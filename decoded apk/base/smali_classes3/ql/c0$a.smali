.class public Lql/c0$a;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lql/c0;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x9
    name = "a"
.end annotation


# instance fields
.field private a:Lql/a0;

.field private b:Lql/z;

.field private c:I

.field private d:Ljava/lang/String;

.field private e:Lql/s;

.field private f:Lql/t$a;

.field private g:Lql/d0;

.field private h:Lql/c0;

.field private i:Lql/c0;

.field private j:Lql/c0;

.field private k:J

.field private l:J

.field private m:Lvl/c;


# direct methods
.method public constructor <init>()V
    .locals 1

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/4 v0, -0x1

    iput v0, p0, Lql/c0$a;->c:I

    new-instance v0, Lql/t$a;

    invoke-direct {v0}, Lql/t$a;-><init>()V

    iput-object v0, p0, Lql/c0$a;->f:Lql/t$a;

    return-void
.end method

.method public constructor <init>(Lql/c0;)V
    .locals 2

    const-string v0, "response"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/n;->e(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/4 v0, -0x1

    iput v0, p0, Lql/c0$a;->c:I

    invoke-virtual {p1}, Lql/c0;->O()Lql/a0;

    move-result-object v0

    iput-object v0, p0, Lql/c0$a;->a:Lql/a0;

    invoke-virtual {p1}, Lql/c0;->H()Lql/z;

    move-result-object v0

    iput-object v0, p0, Lql/c0$a;->b:Lql/z;

    invoke-virtual {p1}, Lql/c0;->g()I

    move-result v0

    iput v0, p0, Lql/c0$a;->c:I

    invoke-virtual {p1}, Lql/c0;->r()Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lql/c0$a;->d:Ljava/lang/String;

    invoke-virtual {p1}, Lql/c0;->j()Lql/s;

    move-result-object v0

    iput-object v0, p0, Lql/c0$a;->e:Lql/s;

    invoke-virtual {p1}, Lql/c0;->o()Lql/t;

    move-result-object v0

    invoke-virtual {v0}, Lql/t;->k()Lql/t$a;

    move-result-object v0

    iput-object v0, p0, Lql/c0$a;->f:Lql/t$a;

    invoke-virtual {p1}, Lql/c0;->a()Lql/d0;

    move-result-object v0

    iput-object v0, p0, Lql/c0$a;->g:Lql/d0;

    invoke-virtual {p1}, Lql/c0;->y()Lql/c0;

    move-result-object v0

    iput-object v0, p0, Lql/c0$a;->h:Lql/c0;

    invoke-virtual {p1}, Lql/c0;->e()Lql/c0;

    move-result-object v0

    iput-object v0, p0, Lql/c0$a;->i:Lql/c0;

    invoke-virtual {p1}, Lql/c0;->E()Lql/c0;

    move-result-object v0

    iput-object v0, p0, Lql/c0$a;->j:Lql/c0;

    invoke-virtual {p1}, Lql/c0;->Q()J

    move-result-wide v0

    iput-wide v0, p0, Lql/c0$a;->k:J

    invoke-virtual {p1}, Lql/c0;->I()J

    move-result-wide v0

    iput-wide v0, p0, Lql/c0$a;->l:J

    invoke-virtual {p1}, Lql/c0;->i()Lvl/c;

    move-result-object p1

    iput-object p1, p0, Lql/c0$a;->m:Lvl/c;

    return-void
.end method

.method private final e(Lql/c0;)V
    .locals 1

    if-nez p1, :cond_0

    goto :goto_1

    :cond_0
    invoke-virtual {p1}, Lql/c0;->a()Lql/d0;

    move-result-object p1

    if-nez p1, :cond_1

    const/4 p1, 0x1

    goto :goto_0

    :cond_1
    const/4 p1, 0x0

    :goto_0
    if-eqz p1, :cond_2

    :goto_1
    return-void

    :cond_2
    new-instance p1, Ljava/lang/IllegalArgumentException;

    const-string v0, "priorResponse.body != null"

    invoke-virtual {v0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-direct {p1, v0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method private final f(Ljava/lang/String;Lql/c0;)V
    .locals 3

    if-nez p2, :cond_0

    goto :goto_4

    :cond_0
    invoke-virtual {p2}, Lql/c0;->a()Lql/d0;

    move-result-object v0

    const/4 v1, 0x1

    const/4 v2, 0x0

    if-nez v0, :cond_1

    move v0, v1

    goto :goto_0

    :cond_1
    move v0, v2

    :goto_0
    if-eqz v0, :cond_8

    invoke-virtual {p2}, Lql/c0;->y()Lql/c0;

    move-result-object v0

    if-nez v0, :cond_2

    move v0, v1

    goto :goto_1

    :cond_2
    move v0, v2

    :goto_1
    if-eqz v0, :cond_7

    invoke-virtual {p2}, Lql/c0;->e()Lql/c0;

    move-result-object v0

    if-nez v0, :cond_3

    move v0, v1

    goto :goto_2

    :cond_3
    move v0, v2

    :goto_2
    if-eqz v0, :cond_6

    invoke-virtual {p2}, Lql/c0;->E()Lql/c0;

    move-result-object p2

    if-nez p2, :cond_4

    goto :goto_3

    :cond_4
    move v1, v2

    :goto_3
    if-eqz v1, :cond_5

    :goto_4
    return-void

    :cond_5
    const-string p2, ".priorResponse != null"

    invoke-static {p1, p2}, Lkotlin/jvm/internal/n;->k(Ljava/lang/String;Ljava/lang/Object;)Ljava/lang/String;

    move-result-object p1

    new-instance p2, Ljava/lang/IllegalArgumentException;

    invoke-virtual {p1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-direct {p2, p1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p2

    :cond_6
    const-string p2, ".cacheResponse != null"

    invoke-static {p1, p2}, Lkotlin/jvm/internal/n;->k(Ljava/lang/String;Ljava/lang/Object;)Ljava/lang/String;

    move-result-object p1

    new-instance p2, Ljava/lang/IllegalArgumentException;

    invoke-virtual {p1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-direct {p2, p1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p2

    :cond_7
    const-string p2, ".networkResponse != null"

    invoke-static {p1, p2}, Lkotlin/jvm/internal/n;->k(Ljava/lang/String;Ljava/lang/Object;)Ljava/lang/String;

    move-result-object p1

    new-instance p2, Ljava/lang/IllegalArgumentException;

    invoke-virtual {p1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-direct {p2, p1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p2

    :cond_8
    const-string p2, ".body != null"

    invoke-static {p1, p2}, Lkotlin/jvm/internal/n;->k(Ljava/lang/String;Ljava/lang/Object;)Ljava/lang/String;

    move-result-object p1

    new-instance p2, Ljava/lang/IllegalArgumentException;

    invoke-virtual {p1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-direct {p2, p1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p2
.end method


# virtual methods
.method public final A(Lql/c0;)V
    .locals 0

    iput-object p1, p0, Lql/c0$a;->h:Lql/c0;

    return-void
.end method

.method public final B(Lql/c0;)V
    .locals 0

    iput-object p1, p0, Lql/c0$a;->j:Lql/c0;

    return-void
.end method

.method public final C(Lql/z;)V
    .locals 0

    iput-object p1, p0, Lql/c0$a;->b:Lql/z;

    return-void
.end method

.method public final D(J)V
    .locals 0

    iput-wide p1, p0, Lql/c0$a;->l:J

    return-void
.end method

.method public final E(Lql/a0;)V
    .locals 0

    iput-object p1, p0, Lql/c0$a;->a:Lql/a0;

    return-void
.end method

.method public final F(J)V
    .locals 0

    iput-wide p1, p0, Lql/c0$a;->k:J

    return-void
.end method

.method public a(Ljava/lang/String;Ljava/lang/String;)Lql/c0$a;
    .locals 1

    const-string v0, "name"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/n;->e(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "value"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/n;->e(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p0}, Lql/c0$a;->i()Lql/t$a;

    move-result-object v0

    invoke-virtual {v0, p1, p2}, Lql/t$a;->a(Ljava/lang/String;Ljava/lang/String;)Lql/t$a;

    return-object p0
.end method

.method public b(Lql/d0;)Lql/c0$a;
    .locals 0

    invoke-virtual {p0, p1}, Lql/c0$a;->u(Lql/d0;)V

    return-object p0
.end method

.method public c()Lql/c0;
    .locals 18

    move-object/from16 v0, p0

    iget v5, v0, Lql/c0$a;->c:I

    if-ltz v5, :cond_0

    const/4 v1, 0x1

    goto :goto_0

    :cond_0
    const/4 v1, 0x0

    :goto_0
    if-eqz v1, :cond_4

    iget-object v2, v0, Lql/c0$a;->a:Lql/a0;

    if-eqz v2, :cond_3

    iget-object v3, v0, Lql/c0$a;->b:Lql/z;

    if-eqz v3, :cond_2

    iget-object v4, v0, Lql/c0$a;->d:Ljava/lang/String;

    if-eqz v4, :cond_1

    iget-object v6, v0, Lql/c0$a;->e:Lql/s;

    iget-object v1, v0, Lql/c0$a;->f:Lql/t$a;

    invoke-virtual {v1}, Lql/t$a;->e()Lql/t;

    move-result-object v7

    iget-object v8, v0, Lql/c0$a;->g:Lql/d0;

    iget-object v9, v0, Lql/c0$a;->h:Lql/c0;

    iget-object v10, v0, Lql/c0$a;->i:Lql/c0;

    iget-object v11, v0, Lql/c0$a;->j:Lql/c0;

    iget-wide v12, v0, Lql/c0$a;->k:J

    iget-wide v14, v0, Lql/c0$a;->l:J

    iget-object v1, v0, Lql/c0$a;->m:Lvl/c;

    new-instance v17, Lql/c0;

    move-object/from16 v16, v1

    move-object/from16 v1, v17

    invoke-direct/range {v1 .. v16}, Lql/c0;-><init>(Lql/a0;Lql/z;Ljava/lang/String;ILql/s;Lql/t;Lql/d0;Lql/c0;Lql/c0;Lql/c0;JJLvl/c;)V

    return-object v17

    :cond_1
    new-instance v1, Ljava/lang/IllegalStateException;

    const-string v2, "message == null"

    invoke-virtual {v2}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-direct {v1, v2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v1

    :cond_2
    new-instance v1, Ljava/lang/IllegalStateException;

    const-string v2, "protocol == null"

    invoke-virtual {v2}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-direct {v1, v2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v1

    :cond_3
    new-instance v1, Ljava/lang/IllegalStateException;

    const-string v2, "request == null"

    invoke-virtual {v2}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-direct {v1, v2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v1

    :cond_4
    invoke-virtual/range {p0 .. p0}, Lql/c0$a;->h()I

    move-result v1

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    const-string v2, "code < 0: "

    invoke-static {v2, v1}, Lkotlin/jvm/internal/n;->k(Ljava/lang/String;Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v1

    new-instance v2, Ljava/lang/IllegalStateException;

    invoke-virtual {v1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-direct {v2, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v2
.end method

.method public d(Lql/c0;)Lql/c0$a;
    .locals 1

    const-string v0, "cacheResponse"

    invoke-direct {p0, v0, p1}, Lql/c0$a;->f(Ljava/lang/String;Lql/c0;)V

    invoke-virtual {p0, p1}, Lql/c0$a;->v(Lql/c0;)V

    return-object p0
.end method

.method public g(I)Lql/c0$a;
    .locals 0

    invoke-virtual {p0, p1}, Lql/c0$a;->w(I)V

    return-object p0
.end method

.method public final h()I
    .locals 1

    iget v0, p0, Lql/c0$a;->c:I

    return v0
.end method

.method public final i()Lql/t$a;
    .locals 1

    iget-object v0, p0, Lql/c0$a;->f:Lql/t$a;

    return-object v0
.end method

.method public j(Lql/s;)Lql/c0$a;
    .locals 0

    invoke-virtual {p0, p1}, Lql/c0$a;->x(Lql/s;)V

    return-object p0
.end method

.method public k(Ljava/lang/String;Ljava/lang/String;)Lql/c0$a;
    .locals 1

    const-string v0, "name"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/n;->e(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "value"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/n;->e(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p0}, Lql/c0$a;->i()Lql/t$a;

    move-result-object v0

    invoke-virtual {v0, p1, p2}, Lql/t$a;->h(Ljava/lang/String;Ljava/lang/String;)Lql/t$a;

    return-object p0
.end method

.method public l(Lql/t;)Lql/c0$a;
    .locals 1

    const-string v0, "headers"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/n;->e(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p1}, Lql/t;->k()Lql/t$a;

    move-result-object p1

    invoke-virtual {p0, p1}, Lql/c0$a;->y(Lql/t$a;)V

    return-object p0
.end method

.method public final m(Lvl/c;)V
    .locals 1

    const-string v0, "deferredTrailers"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/n;->e(Ljava/lang/Object;Ljava/lang/String;)V

    iput-object p1, p0, Lql/c0$a;->m:Lvl/c;

    return-void
.end method

.method public n(Ljava/lang/String;)Lql/c0$a;
    .locals 1

    const-string v0, "message"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/n;->e(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p0, p1}, Lql/c0$a;->z(Ljava/lang/String;)V

    return-object p0
.end method

.method public o(Lql/c0;)Lql/c0$a;
    .locals 1

    const-string v0, "networkResponse"

    invoke-direct {p0, v0, p1}, Lql/c0$a;->f(Ljava/lang/String;Lql/c0;)V

    invoke-virtual {p0, p1}, Lql/c0$a;->A(Lql/c0;)V

    return-object p0
.end method

.method public p(Lql/c0;)Lql/c0$a;
    .locals 0

    invoke-direct {p0, p1}, Lql/c0$a;->e(Lql/c0;)V

    invoke-virtual {p0, p1}, Lql/c0$a;->B(Lql/c0;)V

    return-object p0
.end method

.method public q(Lql/z;)Lql/c0$a;
    .locals 1

    const-string v0, "protocol"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/n;->e(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p0, p1}, Lql/c0$a;->C(Lql/z;)V

    return-object p0
.end method

.method public r(J)Lql/c0$a;
    .locals 0

    invoke-virtual {p0, p1, p2}, Lql/c0$a;->D(J)V

    return-object p0
.end method

.method public s(Lql/a0;)Lql/c0$a;
    .locals 1

    const-string v0, "request"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/n;->e(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p0, p1}, Lql/c0$a;->E(Lql/a0;)V

    return-object p0
.end method

.method public t(J)Lql/c0$a;
    .locals 0

    invoke-virtual {p0, p1, p2}, Lql/c0$a;->F(J)V

    return-object p0
.end method

.method public final u(Lql/d0;)V
    .locals 0

    iput-object p1, p0, Lql/c0$a;->g:Lql/d0;

    return-void
.end method

.method public final v(Lql/c0;)V
    .locals 0

    iput-object p1, p0, Lql/c0$a;->i:Lql/c0;

    return-void
.end method

.method public final w(I)V
    .locals 0

    iput p1, p0, Lql/c0$a;->c:I

    return-void
.end method

.method public final x(Lql/s;)V
    .locals 0

    iput-object p1, p0, Lql/c0$a;->e:Lql/s;

    return-void
.end method

.method public final y(Lql/t$a;)V
    .locals 1

    const-string v0, "<set-?>"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/n;->e(Ljava/lang/Object;Ljava/lang/String;)V

    iput-object p1, p0, Lql/c0$a;->f:Lql/t$a;

    return-void
.end method

.method public final z(Ljava/lang/String;)V
    .locals 0

    iput-object p1, p0, Lql/c0$a;->d:Ljava/lang/String;

    return-void
.end method

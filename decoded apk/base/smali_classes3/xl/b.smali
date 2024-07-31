.class public final Lxl/b;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lwl/d;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lxl/b$f;,
        Lxl/b$b;,
        Lxl/b$a;,
        Lxl/b$e;,
        Lxl/b$c;,
        Lxl/b$g;,
        Lxl/b$d;
    }
.end annotation


# static fields
.field public static final h:Lxl/b$d;


# instance fields
.field private final a:Lql/y;

.field private final b:Lvl/f;

.field private final c:Ldm/d;

.field private final d:Ldm/c;

.field private e:I

.field private final f:Lxl/a;

.field private g:Lql/t;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    new-instance v0, Lxl/b$d;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lxl/b$d;-><init>(Lkotlin/jvm/internal/g;)V

    sput-object v0, Lxl/b;->h:Lxl/b$d;

    return-void
.end method

.method public constructor <init>(Lql/y;Lvl/f;Ldm/d;Ldm/c;)V
    .locals 1

    const-string v0, "connection"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/n;->e(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "source"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/n;->e(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "sink"

    invoke-static {p4, v0}, Lkotlin/jvm/internal/n;->e(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lxl/b;->a:Lql/y;

    iput-object p2, p0, Lxl/b;->b:Lvl/f;

    iput-object p3, p0, Lxl/b;->c:Ldm/d;

    iput-object p4, p0, Lxl/b;->d:Ldm/c;

    new-instance p1, Lxl/a;

    invoke-direct {p1, p3}, Lxl/a;-><init>(Ldm/d;)V

    iput-object p1, p0, Lxl/b;->f:Lxl/a;

    return-void
.end method

.method public static final synthetic i(Lxl/b;Ldm/h;)V
    .locals 0

    invoke-direct {p0, p1}, Lxl/b;->r(Ldm/h;)V

    return-void
.end method

.method public static final synthetic j(Lxl/b;)Lql/y;
    .locals 0

    iget-object p0, p0, Lxl/b;->a:Lql/y;

    return-object p0
.end method

.method public static final synthetic k(Lxl/b;)Lxl/a;
    .locals 0

    iget-object p0, p0, Lxl/b;->f:Lxl/a;

    return-object p0
.end method

.method public static final synthetic l(Lxl/b;)Ldm/c;
    .locals 0

    iget-object p0, p0, Lxl/b;->d:Ldm/c;

    return-object p0
.end method

.method public static final synthetic m(Lxl/b;)Ldm/d;
    .locals 0

    iget-object p0, p0, Lxl/b;->c:Ldm/d;

    return-object p0
.end method

.method public static final synthetic n(Lxl/b;)I
    .locals 0

    iget p0, p0, Lxl/b;->e:I

    return p0
.end method

.method public static final synthetic o(Lxl/b;)Lql/t;
    .locals 0

    iget-object p0, p0, Lxl/b;->g:Lql/t;

    return-object p0
.end method

.method public static final synthetic p(Lxl/b;I)V
    .locals 0

    iput p1, p0, Lxl/b;->e:I

    return-void
.end method

.method public static final synthetic q(Lxl/b;Lql/t;)V
    .locals 0

    iput-object p1, p0, Lxl/b;->g:Lql/t;

    return-void
.end method

.method private final r(Ldm/h;)V
    .locals 2

    invoke-virtual {p1}, Ldm/h;->i()Ldm/y;

    move-result-object v0

    sget-object v1, Ldm/y;->e:Ldm/y;

    invoke-virtual {p1, v1}, Ldm/h;->j(Ldm/y;)Ldm/h;

    invoke-virtual {v0}, Ldm/y;->a()Ldm/y;

    invoke-virtual {v0}, Ldm/y;->b()Ldm/y;

    return-void
.end method

.method private final s(Lql/a0;)Z
    .locals 2

    const-string v0, "Transfer-Encoding"

    invoke-virtual {p1, v0}, Lql/a0;->d(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    const/4 v0, 0x1

    const-string v1, "chunked"

    invoke-static {v1, p1, v0}, Lxk/g;->r(Ljava/lang/String;Ljava/lang/String;Z)Z

    move-result p1

    return p1
.end method

.method private final t(Lql/c0;)Z
    .locals 3

    const/4 v0, 0x0

    const/4 v1, 0x2

    const-string v2, "Transfer-Encoding"

    invoke-static {p1, v2, v0, v1, v0}, Lql/c0;->n(Lql/c0;Ljava/lang/String;Ljava/lang/String;ILjava/lang/Object;)Ljava/lang/String;

    move-result-object p1

    const/4 v0, 0x1

    const-string v1, "chunked"

    invoke-static {v1, p1, v0}, Lxk/g;->r(Ljava/lang/String;Ljava/lang/String;Z)Z

    move-result p1

    return p1
.end method

.method private final u()Ldm/v;
    .locals 2

    iget v0, p0, Lxl/b;->e:I

    const/4 v1, 0x1

    if-ne v0, v1, :cond_0

    goto :goto_0

    :cond_0
    const/4 v1, 0x0

    :goto_0
    if-eqz v1, :cond_1

    const/4 v0, 0x2

    iput v0, p0, Lxl/b;->e:I

    new-instance v0, Lxl/b$b;

    invoke-direct {v0, p0}, Lxl/b$b;-><init>(Lxl/b;)V

    return-object v0

    :cond_1
    const-string v1, "state: "

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    invoke-static {v1, v0}, Lkotlin/jvm/internal/n;->k(Ljava/lang/String;Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v0

    new-instance v1, Ljava/lang/IllegalStateException;

    invoke-virtual {v0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-direct {v1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v1
.end method

.method private final v(Lql/u;)Ldm/x;
    .locals 2

    iget v0, p0, Lxl/b;->e:I

    const/4 v1, 0x4

    if-ne v0, v1, :cond_0

    const/4 v1, 0x1

    goto :goto_0

    :cond_0
    const/4 v1, 0x0

    :goto_0
    if-eqz v1, :cond_1

    const/4 v0, 0x5

    iput v0, p0, Lxl/b;->e:I

    new-instance v0, Lxl/b$c;

    invoke-direct {v0, p0, p1}, Lxl/b$c;-><init>(Lxl/b;Lql/u;)V

    return-object v0

    :cond_1
    const-string p1, "state: "

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    invoke-static {p1, v0}, Lkotlin/jvm/internal/n;->k(Ljava/lang/String;Ljava/lang/Object;)Ljava/lang/String;

    move-result-object p1

    new-instance v0, Ljava/lang/IllegalStateException;

    invoke-virtual {p1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-direct {v0, p1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0
.end method

.method private final w(J)Ldm/x;
    .locals 2

    iget v0, p0, Lxl/b;->e:I

    const/4 v1, 0x4

    if-ne v0, v1, :cond_0

    const/4 v1, 0x1

    goto :goto_0

    :cond_0
    const/4 v1, 0x0

    :goto_0
    if-eqz v1, :cond_1

    const/4 v0, 0x5

    iput v0, p0, Lxl/b;->e:I

    new-instance v0, Lxl/b$e;

    invoke-direct {v0, p0, p1, p2}, Lxl/b$e;-><init>(Lxl/b;J)V

    return-object v0

    :cond_1
    const-string p1, "state: "

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p2

    invoke-static {p1, p2}, Lkotlin/jvm/internal/n;->k(Ljava/lang/String;Ljava/lang/Object;)Ljava/lang/String;

    move-result-object p1

    new-instance p2, Ljava/lang/IllegalStateException;

    invoke-virtual {p1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-direct {p2, p1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p2
.end method

.method private final x()Ldm/v;
    .locals 2

    iget v0, p0, Lxl/b;->e:I

    const/4 v1, 0x1

    if-ne v0, v1, :cond_0

    goto :goto_0

    :cond_0
    const/4 v1, 0x0

    :goto_0
    if-eqz v1, :cond_1

    const/4 v0, 0x2

    iput v0, p0, Lxl/b;->e:I

    new-instance v0, Lxl/b$f;

    invoke-direct {v0, p0}, Lxl/b$f;-><init>(Lxl/b;)V

    return-object v0

    :cond_1
    const-string v1, "state: "

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    invoke-static {v1, v0}, Lkotlin/jvm/internal/n;->k(Ljava/lang/String;Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v0

    new-instance v1, Ljava/lang/IllegalStateException;

    invoke-virtual {v0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-direct {v1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v1
.end method

.method private final y()Ldm/x;
    .locals 2

    iget v0, p0, Lxl/b;->e:I

    const/4 v1, 0x4

    if-ne v0, v1, :cond_0

    const/4 v1, 0x1

    goto :goto_0

    :cond_0
    const/4 v1, 0x0

    :goto_0
    if-eqz v1, :cond_1

    const/4 v0, 0x5

    iput v0, p0, Lxl/b;->e:I

    invoke-virtual {p0}, Lxl/b;->b()Lvl/f;

    move-result-object v0

    invoke-virtual {v0}, Lvl/f;->y()V

    new-instance v0, Lxl/b$g;

    invoke-direct {v0, p0}, Lxl/b$g;-><init>(Lxl/b;)V

    return-object v0

    :cond_1
    const-string v1, "state: "

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    invoke-static {v1, v0}, Lkotlin/jvm/internal/n;->k(Ljava/lang/String;Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v0

    new-instance v1, Ljava/lang/IllegalStateException;

    invoke-virtual {v0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-direct {v1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v1
.end method


# virtual methods
.method public final A(Lql/t;Ljava/lang/String;)V
    .locals 6

    const-string v0, "headers"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/n;->e(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "requestLine"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/n;->e(Ljava/lang/Object;Ljava/lang/String;)V

    iget v0, p0, Lxl/b;->e:I

    const/4 v1, 0x0

    const/4 v2, 0x1

    if-nez v0, :cond_0

    move v3, v2

    goto :goto_0

    :cond_0
    move v3, v1

    :goto_0
    if-eqz v3, :cond_2

    iget-object v0, p0, Lxl/b;->d:Ldm/c;

    invoke-interface {v0, p2}, Ldm/c;->T(Ljava/lang/String;)Ldm/c;

    move-result-object p2

    const-string v0, "\r\n"

    invoke-interface {p2, v0}, Ldm/c;->T(Ljava/lang/String;)Ldm/c;

    invoke-virtual {p1}, Lql/t;->size()I

    move-result p2

    :goto_1
    if-ge v1, p2, :cond_1

    add-int/lit8 v3, v1, 0x1

    iget-object v4, p0, Lxl/b;->d:Ldm/c;

    invoke-virtual {p1, v1}, Lql/t;->d(I)Ljava/lang/String;

    move-result-object v5

    invoke-interface {v4, v5}, Ldm/c;->T(Ljava/lang/String;)Ldm/c;

    move-result-object v4

    const-string v5, ": "

    invoke-interface {v4, v5}, Ldm/c;->T(Ljava/lang/String;)Ldm/c;

    move-result-object v4

    invoke-virtual {p1, v1}, Lql/t;->l(I)Ljava/lang/String;

    move-result-object v1

    invoke-interface {v4, v1}, Ldm/c;->T(Ljava/lang/String;)Ldm/c;

    move-result-object v1

    invoke-interface {v1, v0}, Ldm/c;->T(Ljava/lang/String;)Ldm/c;

    move v1, v3

    goto :goto_1

    :cond_1
    iget-object p1, p0, Lxl/b;->d:Ldm/c;

    invoke-interface {p1, v0}, Ldm/c;->T(Ljava/lang/String;)Ldm/c;

    iput v2, p0, Lxl/b;->e:I

    return-void

    :cond_2
    const-string p1, "state: "

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p2

    invoke-static {p1, p2}, Lkotlin/jvm/internal/n;->k(Ljava/lang/String;Ljava/lang/Object;)Ljava/lang/String;

    move-result-object p1

    new-instance p2, Ljava/lang/IllegalStateException;

    invoke-virtual {p1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-direct {p2, p1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p2
.end method

.method public a()V
    .locals 1

    iget-object v0, p0, Lxl/b;->d:Ldm/c;

    invoke-interface {v0}, Ldm/c;->flush()V

    return-void
.end method

.method public b()Lvl/f;
    .locals 1

    iget-object v0, p0, Lxl/b;->b:Lvl/f;

    return-object v0
.end method

.method public c(Lql/c0;)J
    .locals 2

    const-string v0, "response"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/n;->e(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {p1}, Lwl/e;->b(Lql/c0;)Z

    move-result v0

    if-nez v0, :cond_0

    const-wide/16 v0, 0x0

    goto :goto_0

    :cond_0
    invoke-direct {p0, p1}, Lxl/b;->t(Lql/c0;)Z

    move-result v0

    if-eqz v0, :cond_1

    const-wide/16 v0, -0x1

    goto :goto_0

    :cond_1
    invoke-static {p1}, Lrl/d;->v(Lql/c0;)J

    move-result-wide v0

    :goto_0
    return-wide v0
.end method

.method public cancel()V
    .locals 1

    invoke-virtual {p0}, Lxl/b;->b()Lvl/f;

    move-result-object v0

    invoke-virtual {v0}, Lvl/f;->d()V

    return-void
.end method

.method public d(Lql/a0;J)Ldm/v;
    .locals 2

    const-string v0, "request"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/n;->e(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p1}, Lql/a0;->a()Lql/b0;

    move-result-object v0

    if-eqz v0, :cond_1

    invoke-virtual {p1}, Lql/a0;->a()Lql/b0;

    move-result-object v0

    invoke-virtual {v0}, Lql/b0;->d()Z

    move-result v0

    if-nez v0, :cond_0

    goto :goto_0

    :cond_0
    new-instance p1, Ljava/net/ProtocolException;

    const-string p2, "Duplex connections are not supported for HTTP/1"

    invoke-direct {p1, p2}, Ljava/net/ProtocolException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_1
    :goto_0
    invoke-direct {p0, p1}, Lxl/b;->s(Lql/a0;)Z

    move-result p1

    if-eqz p1, :cond_2

    invoke-direct {p0}, Lxl/b;->u()Ldm/v;

    move-result-object p1

    goto :goto_1

    :cond_2
    const-wide/16 v0, -0x1

    cmp-long p1, p2, v0

    if-eqz p1, :cond_3

    invoke-direct {p0}, Lxl/b;->x()Ldm/v;

    move-result-object p1

    :goto_1
    return-object p1

    :cond_3
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string p2, "Cannot stream a request body without chunked encoding or a known content length!"

    invoke-direct {p1, p2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public e(Z)Lql/c0$a;
    .locals 6

    iget v0, p0, Lxl/b;->e:I

    const/4 v1, 0x0

    const/4 v2, 0x3

    const/4 v3, 0x1

    if-eq v0, v3, :cond_1

    const/4 v4, 0x2

    if-eq v0, v4, :cond_1

    if-ne v0, v2, :cond_0

    goto :goto_0

    :cond_0
    move v4, v1

    goto :goto_1

    :cond_1
    :goto_0
    move v4, v3

    :goto_1
    if-eqz v4, :cond_6

    :try_start_0
    sget-object v0, Lwl/k;->d:Lwl/k$a;

    iget-object v4, p0, Lxl/b;->f:Lxl/a;

    invoke-virtual {v4}, Lxl/a;->b()Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v0, v4}, Lwl/k$a;->a(Ljava/lang/String;)Lwl/k;

    move-result-object v0

    new-instance v4, Lql/c0$a;

    invoke-direct {v4}, Lql/c0$a;-><init>()V

    iget-object v5, v0, Lwl/k;->a:Lql/z;

    invoke-virtual {v4, v5}, Lql/c0$a;->q(Lql/z;)Lql/c0$a;

    move-result-object v4

    iget v5, v0, Lwl/k;->b:I

    invoke-virtual {v4, v5}, Lql/c0$a;->g(I)Lql/c0$a;

    move-result-object v4

    iget-object v5, v0, Lwl/k;->c:Ljava/lang/String;

    invoke-virtual {v4, v5}, Lql/c0$a;->n(Ljava/lang/String;)Lql/c0$a;

    move-result-object v4

    iget-object v5, p0, Lxl/b;->f:Lxl/a;

    invoke-virtual {v5}, Lxl/a;->a()Lql/t;

    move-result-object v5

    invoke-virtual {v4, v5}, Lql/c0$a;->l(Lql/t;)Lql/c0$a;

    move-result-object v4

    const/16 v5, 0x64

    if-eqz p1, :cond_2

    iget p1, v0, Lwl/k;->b:I

    if-ne p1, v5, :cond_2

    const/4 v4, 0x0

    goto :goto_3

    :cond_2
    iget p1, v0, Lwl/k;->b:I

    if-ne p1, v5, :cond_3

    :goto_2
    iput v2, p0, Lxl/b;->e:I

    goto :goto_3

    :cond_3
    const/16 v0, 0x66

    if-gt v0, p1, :cond_4

    const/16 v0, 0xc8

    if-ge p1, v0, :cond_4

    move v1, v3

    :cond_4
    if-eqz v1, :cond_5

    goto :goto_2

    :cond_5
    const/4 p1, 0x4

    iput p1, p0, Lxl/b;->e:I
    :try_end_0
    .catch Ljava/io/EOFException; {:try_start_0 .. :try_end_0} :catch_0

    :goto_3
    return-object v4

    :catch_0
    move-exception p1

    invoke-virtual {p0}, Lxl/b;->b()Lvl/f;

    move-result-object v0

    invoke-virtual {v0}, Lvl/f;->z()Lql/e0;

    move-result-object v0

    invoke-virtual {v0}, Lql/e0;->a()Lql/a;

    move-result-object v0

    invoke-virtual {v0}, Lql/a;->l()Lql/u;

    move-result-object v0

    invoke-virtual {v0}, Lql/u;->o()Ljava/lang/String;

    move-result-object v0

    new-instance v1, Ljava/io/IOException;

    const-string v2, "unexpected end of stream on "

    invoke-static {v2, v0}, Lkotlin/jvm/internal/n;->k(Ljava/lang/String;Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v0

    invoke-direct {v1, v0, p1}, Ljava/io/IOException;-><init>(Ljava/lang/String;Ljava/lang/Throwable;)V

    throw v1

    :cond_6
    const-string p1, "state: "

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    invoke-static {p1, v0}, Lkotlin/jvm/internal/n;->k(Ljava/lang/String;Ljava/lang/Object;)Ljava/lang/String;

    move-result-object p1

    new-instance v0, Ljava/lang/IllegalStateException;

    invoke-virtual {p1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-direct {v0, p1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0
.end method

.method public f()V
    .locals 1

    iget-object v0, p0, Lxl/b;->d:Ldm/c;

    invoke-interface {v0}, Ldm/c;->flush()V

    return-void
.end method

.method public g(Lql/a0;)V
    .locals 3

    const-string v0, "request"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/n;->e(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object v0, Lwl/i;->a:Lwl/i;

    invoke-virtual {p0}, Lxl/b;->b()Lvl/f;

    move-result-object v1

    invoke-virtual {v1}, Lvl/f;->z()Lql/e0;

    move-result-object v1

    invoke-virtual {v1}, Lql/e0;->b()Ljava/net/Proxy;

    move-result-object v1

    invoke-virtual {v1}, Ljava/net/Proxy;->type()Ljava/net/Proxy$Type;

    move-result-object v1

    const-string v2, "connection.route().proxy.type()"

    invoke-static {v1, v2}, Lkotlin/jvm/internal/n;->d(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {v0, p1, v1}, Lwl/i;->a(Lql/a0;Ljava/net/Proxy$Type;)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p1}, Lql/a0;->e()Lql/t;

    move-result-object p1

    invoke-virtual {p0, p1, v0}, Lxl/b;->A(Lql/t;Ljava/lang/String;)V

    return-void
.end method

.method public h(Lql/c0;)Ldm/x;
    .locals 4

    const-string v0, "response"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/n;->e(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {p1}, Lwl/e;->b(Lql/c0;)Z

    move-result v0

    if-nez v0, :cond_0

    const-wide/16 v0, 0x0

    :goto_0
    invoke-direct {p0, v0, v1}, Lxl/b;->w(J)Ldm/x;

    move-result-object p1

    goto :goto_1

    :cond_0
    invoke-direct {p0, p1}, Lxl/b;->t(Lql/c0;)Z

    move-result v0

    if-eqz v0, :cond_1

    invoke-virtual {p1}, Lql/c0;->O()Lql/a0;

    move-result-object p1

    invoke-virtual {p1}, Lql/a0;->i()Lql/u;

    move-result-object p1

    invoke-direct {p0, p1}, Lxl/b;->v(Lql/u;)Ldm/x;

    move-result-object p1

    goto :goto_1

    :cond_1
    invoke-static {p1}, Lrl/d;->v(Lql/c0;)J

    move-result-wide v0

    const-wide/16 v2, -0x1

    cmp-long p1, v0, v2

    if-eqz p1, :cond_2

    goto :goto_0

    :cond_2
    invoke-direct {p0}, Lxl/b;->y()Ldm/x;

    move-result-object p1

    :goto_1
    return-object p1
.end method

.method public final z(Lql/c0;)V
    .locals 4

    const-string v0, "response"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/n;->e(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {p1}, Lrl/d;->v(Lql/c0;)J

    move-result-wide v0

    const-wide/16 v2, -0x1

    cmp-long p1, v0, v2

    if-nez p1, :cond_0

    return-void

    :cond_0
    invoke-direct {p0, v0, v1}, Lxl/b;->w(J)Ldm/x;

    move-result-object p1

    const v0, 0x7fffffff

    sget-object v1, Ljava/util/concurrent/TimeUnit;->MILLISECONDS:Ljava/util/concurrent/TimeUnit;

    invoke-static {p1, v0, v1}, Lrl/d;->L(Ldm/x;ILjava/util/concurrent/TimeUnit;)Z

    invoke-interface {p1}, Ldm/x;->close()V

    return-void
.end method

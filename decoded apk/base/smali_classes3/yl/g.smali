.class public final Lyl/g;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lwl/d;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lyl/g$a;
    }
.end annotation


# static fields
.field public static final g:Lyl/g$a;

.field private static final h:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation
.end field

.field private static final i:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation
.end field


# instance fields
.field private final a:Lvl/f;

.field private final b:Lwl/g;

.field private final c:Lyl/f;

.field private volatile d:Lyl/i;

.field private final e:Lql/z;

.field private volatile f:Z


# direct methods
.method static constructor <clinit>()V
    .locals 14

    new-instance v0, Lyl/g$a;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lyl/g$a;-><init>(Lkotlin/jvm/internal/g;)V

    sput-object v0, Lyl/g;->g:Lyl/g$a;

    const-string v2, "connection"

    const-string v3, "host"

    const-string v4, "keep-alive"

    const-string v5, "proxy-connection"

    const-string v6, "te"

    const-string v7, "transfer-encoding"

    const-string v8, "encoding"

    const-string v9, "upgrade"

    const-string v10, ":method"

    const-string v11, ":path"

    const-string v12, ":scheme"

    const-string v13, ":authority"

    filled-new-array/range {v2 .. v13}, [Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lrl/d;->w([Ljava/lang/Object;)Ljava/util/List;

    move-result-object v0

    sput-object v0, Lyl/g;->h:Ljava/util/List;

    const-string v1, "connection"

    const-string v2, "host"

    const-string v3, "keep-alive"

    const-string v4, "proxy-connection"

    const-string v5, "te"

    const-string v6, "transfer-encoding"

    const-string v7, "encoding"

    const-string v8, "upgrade"

    filled-new-array/range {v1 .. v8}, [Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lrl/d;->w([Ljava/lang/Object;)Ljava/util/List;

    move-result-object v0

    sput-object v0, Lyl/g;->i:Ljava/util/List;

    return-void
.end method

.method public constructor <init>(Lql/y;Lvl/f;Lwl/g;Lyl/f;)V
    .locals 1

    const-string v0, "client"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/n;->e(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "connection"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/n;->e(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "chain"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/n;->e(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "http2Connection"

    invoke-static {p4, v0}, Lkotlin/jvm/internal/n;->e(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p2, p0, Lyl/g;->a:Lvl/f;

    iput-object p3, p0, Lyl/g;->b:Lwl/g;

    iput-object p4, p0, Lyl/g;->c:Lyl/f;

    invoke-virtual {p1}, Lql/y;->z()Ljava/util/List;

    move-result-object p1

    sget-object p2, Lql/z;->H2_PRIOR_KNOWLEDGE:Lql/z;

    invoke-interface {p1, p2}, Ljava/util/List;->contains(Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_0

    goto :goto_0

    :cond_0
    sget-object p2, Lql/z;->HTTP_2:Lql/z;

    :goto_0
    iput-object p2, p0, Lyl/g;->e:Lql/z;

    return-void
.end method

.method public static final synthetic i()Ljava/util/List;
    .locals 1

    sget-object v0, Lyl/g;->h:Ljava/util/List;

    return-object v0
.end method

.method public static final synthetic j()Ljava/util/List;
    .locals 1

    sget-object v0, Lyl/g;->i:Ljava/util/List;

    return-object v0
.end method


# virtual methods
.method public a()V
    .locals 1

    iget-object v0, p0, Lyl/g;->d:Lyl/i;

    invoke-static {v0}, Lkotlin/jvm/internal/n;->b(Ljava/lang/Object;)V

    invoke-virtual {v0}, Lyl/i;->n()Ldm/v;

    move-result-object v0

    invoke-interface {v0}, Ldm/v;->close()V

    return-void
.end method

.method public b()Lvl/f;
    .locals 1

    iget-object v0, p0, Lyl/g;->a:Lvl/f;

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
    invoke-static {p1}, Lrl/d;->v(Lql/c0;)J

    move-result-wide v0

    :goto_0
    return-wide v0
.end method

.method public cancel()V
    .locals 2

    const/4 v0, 0x1

    iput-boolean v0, p0, Lyl/g;->f:Z

    iget-object v0, p0, Lyl/g;->d:Lyl/i;

    if-nez v0, :cond_0

    goto :goto_0

    :cond_0
    sget-object v1, Lyl/b;->CANCEL:Lyl/b;

    invoke-virtual {v0, v1}, Lyl/i;->f(Lyl/b;)V

    :goto_0
    return-void
.end method

.method public d(Lql/a0;J)Ldm/v;
    .locals 0

    const-string p2, "request"

    invoke-static {p1, p2}, Lkotlin/jvm/internal/n;->e(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object p1, p0, Lyl/g;->d:Lyl/i;

    invoke-static {p1}, Lkotlin/jvm/internal/n;->b(Ljava/lang/Object;)V

    invoke-virtual {p1}, Lyl/i;->n()Ldm/v;

    move-result-object p1

    return-object p1
.end method

.method public e(Z)Lql/c0$a;
    .locals 3

    iget-object v0, p0, Lyl/g;->d:Lyl/i;

    if-eqz v0, :cond_1

    invoke-virtual {v0}, Lyl/i;->E()Lql/t;

    move-result-object v0

    sget-object v1, Lyl/g;->g:Lyl/g$a;

    iget-object v2, p0, Lyl/g;->e:Lql/z;

    invoke-virtual {v1, v0, v2}, Lyl/g$a;->b(Lql/t;Lql/z;)Lql/c0$a;

    move-result-object v0

    if-eqz p1, :cond_0

    invoke-virtual {v0}, Lql/c0$a;->h()I

    move-result p1

    const/16 v1, 0x64

    if-ne p1, v1, :cond_0

    const/4 v0, 0x0

    :cond_0
    return-object v0

    :cond_1
    new-instance p1, Ljava/io/IOException;

    const-string v0, "stream wasn\'t created"

    invoke-direct {p1, v0}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public f()V
    .locals 1

    iget-object v0, p0, Lyl/g;->c:Lyl/f;

    invoke-virtual {v0}, Lyl/f;->flush()V

    return-void
.end method

.method public g(Lql/a0;)V
    .locals 3

    const-string v0, "request"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/n;->e(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, Lyl/g;->d:Lyl/i;

    if-eqz v0, :cond_0

    return-void

    :cond_0
    invoke-virtual {p1}, Lql/a0;->a()Lql/b0;

    move-result-object v0

    if-eqz v0, :cond_1

    const/4 v0, 0x1

    goto :goto_0

    :cond_1
    const/4 v0, 0x0

    :goto_0
    sget-object v1, Lyl/g;->g:Lyl/g$a;

    invoke-virtual {v1, p1}, Lyl/g$a;->a(Lql/a0;)Ljava/util/List;

    move-result-object p1

    iget-object v1, p0, Lyl/g;->c:Lyl/f;

    invoke-virtual {v1, p1, v0}, Lyl/f;->J0(Ljava/util/List;Z)Lyl/i;

    move-result-object p1

    iput-object p1, p0, Lyl/g;->d:Lyl/i;

    iget-boolean p1, p0, Lyl/g;->f:Z

    if-nez p1, :cond_2

    iget-object p1, p0, Lyl/g;->d:Lyl/i;

    invoke-static {p1}, Lkotlin/jvm/internal/n;->b(Ljava/lang/Object;)V

    invoke-virtual {p1}, Lyl/i;->v()Ldm/y;

    move-result-object p1

    iget-object v0, p0, Lyl/g;->b:Lwl/g;

    invoke-virtual {v0}, Lwl/g;->g()I

    move-result v0

    int-to-long v0, v0

    sget-object v2, Ljava/util/concurrent/TimeUnit;->MILLISECONDS:Ljava/util/concurrent/TimeUnit;

    invoke-virtual {p1, v0, v1, v2}, Ldm/y;->g(JLjava/util/concurrent/TimeUnit;)Ldm/y;

    iget-object p1, p0, Lyl/g;->d:Lyl/i;

    invoke-static {p1}, Lkotlin/jvm/internal/n;->b(Ljava/lang/Object;)V

    invoke-virtual {p1}, Lyl/i;->G()Ldm/y;

    move-result-object p1

    iget-object v0, p0, Lyl/g;->b:Lwl/g;

    invoke-virtual {v0}, Lwl/g;->i()I

    move-result v0

    int-to-long v0, v0

    invoke-virtual {p1, v0, v1, v2}, Ldm/y;->g(JLjava/util/concurrent/TimeUnit;)Ldm/y;

    return-void

    :cond_2
    iget-object p1, p0, Lyl/g;->d:Lyl/i;

    invoke-static {p1}, Lkotlin/jvm/internal/n;->b(Ljava/lang/Object;)V

    sget-object v0, Lyl/b;->CANCEL:Lyl/b;

    invoke-virtual {p1, v0}, Lyl/i;->f(Lyl/b;)V

    new-instance p1, Ljava/io/IOException;

    const-string v0, "Canceled"

    invoke-direct {p1, v0}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public h(Lql/c0;)Ldm/x;
    .locals 1

    const-string v0, "response"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/n;->e(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object p1, p0, Lyl/g;->d:Lyl/i;

    invoke-static {p1}, Lkotlin/jvm/internal/n;->b(Ljava/lang/Object;)V

    invoke-virtual {p1}, Lyl/i;->p()Lyl/i$c;

    move-result-object p1

    return-object p1
.end method

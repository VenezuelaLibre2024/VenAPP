.class Lwi/d;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field public static final a:Lxi/d;

.field public static final b:Lxi/d;

.field public static final c:Lxi/d;

.field public static final d:Lxi/d;

.field public static final e:Lxi/d;

.field public static final f:Lxi/d;


# direct methods
.method static constructor <clinit>()V
    .locals 3

    new-instance v0, Lxi/d;

    sget-object v1, Lxi/d;->g:Ldm/e;

    const-string v2, "https"

    invoke-direct {v0, v1, v2}, Lxi/d;-><init>(Ldm/e;Ljava/lang/String;)V

    sput-object v0, Lwi/d;->a:Lxi/d;

    new-instance v0, Lxi/d;

    const-string v2, "http"

    invoke-direct {v0, v1, v2}, Lxi/d;-><init>(Ldm/e;Ljava/lang/String;)V

    sput-object v0, Lwi/d;->b:Lxi/d;

    new-instance v0, Lxi/d;

    sget-object v1, Lxi/d;->e:Ldm/e;

    const-string v2, "POST"

    invoke-direct {v0, v1, v2}, Lxi/d;-><init>(Ldm/e;Ljava/lang/String;)V

    sput-object v0, Lwi/d;->c:Lxi/d;

    new-instance v0, Lxi/d;

    const-string v2, "GET"

    invoke-direct {v0, v1, v2}, Lxi/d;-><init>(Ldm/e;Ljava/lang/String;)V

    sput-object v0, Lwi/d;->d:Lxi/d;

    new-instance v0, Lxi/d;

    sget-object v1, Lio/grpc/internal/q0;->j:Lvi/w0$g;

    invoke-virtual {v1}, Lvi/w0$g;->d()Ljava/lang/String;

    move-result-object v1

    const-string v2, "application/grpc"

    invoke-direct {v0, v1, v2}, Lxi/d;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    sput-object v0, Lwi/d;->e:Lxi/d;

    new-instance v0, Lxi/d;

    const-string v1, "te"

    const-string v2, "trailers"

    invoke-direct {v0, v1, v2}, Lxi/d;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    sput-object v0, Lwi/d;->f:Lxi/d;

    return-void
.end method

.method private static a(Ljava/util/List;Lvi/w0;)Ljava/util/List;
    .locals 5
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Lxi/d;",
            ">;",
            "Lvi/w0;",
            ")",
            "Ljava/util/List<",
            "Lxi/d;",
            ">;"
        }
    .end annotation

    invoke-static {p1}, Lio/grpc/internal/l2;->d(Lvi/w0;)[[B

    move-result-object p1

    const/4 v0, 0x0

    move v1, v0

    :goto_0
    array-length v2, p1

    if-ge v1, v2, :cond_2

    aget-object v2, p1, v1

    invoke-static {v2}, Ldm/e;->u([B)Ldm/e;

    move-result-object v2

    invoke-virtual {v2}, Ldm/e;->B()I

    move-result v3

    if-eqz v3, :cond_1

    invoke-virtual {v2, v0}, Ldm/e;->m(I)B

    move-result v3

    const/16 v4, 0x3a

    if-ne v3, v4, :cond_0

    goto :goto_1

    :cond_0
    add-int/lit8 v3, v1, 0x1

    aget-object v3, p1, v3

    invoke-static {v3}, Ldm/e;->u([B)Ldm/e;

    move-result-object v3

    new-instance v4, Lxi/d;

    invoke-direct {v4, v2, v3}, Lxi/d;-><init>(Ldm/e;Ldm/e;)V

    invoke-interface {p0, v4}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    :cond_1
    :goto_1
    add-int/lit8 v1, v1, 0x2

    goto :goto_0

    :cond_2
    return-object p0
.end method

.method public static b(Lvi/w0;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZZ)Ljava/util/List;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lvi/w0;",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "ZZ)",
            "Ljava/util/List<",
            "Lxi/d;",
            ">;"
        }
    .end annotation

    const-string v0, "headers"

    invoke-static {p0, v0}, Leb/o;->p(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const-string v0, "defaultPath"

    invoke-static {p1, v0}, Leb/o;->p(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const-string v0, "authority"

    invoke-static {p2, v0}, Leb/o;->p(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    invoke-static {p0}, Lwi/d;->c(Lvi/w0;)V

    new-instance v0, Ljava/util/ArrayList;

    invoke-static {p0}, Lvi/k0;->a(Lvi/w0;)I

    move-result v1

    add-int/lit8 v1, v1, 0x7

    invoke-direct {v0, v1}, Ljava/util/ArrayList;-><init>(I)V

    if-eqz p5, :cond_0

    sget-object p5, Lwi/d;->b:Lxi/d;

    goto :goto_0

    :cond_0
    sget-object p5, Lwi/d;->a:Lxi/d;

    :goto_0
    invoke-interface {v0, p5}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    if-eqz p4, :cond_1

    sget-object p4, Lwi/d;->d:Lxi/d;

    goto :goto_1

    :cond_1
    sget-object p4, Lwi/d;->c:Lxi/d;

    :goto_1
    invoke-interface {v0, p4}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    new-instance p4, Lxi/d;

    sget-object p5, Lxi/d;->h:Ldm/e;

    invoke-direct {p4, p5, p2}, Lxi/d;-><init>(Ldm/e;Ljava/lang/String;)V

    invoke-interface {v0, p4}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    new-instance p2, Lxi/d;

    sget-object p4, Lxi/d;->f:Ldm/e;

    invoke-direct {p2, p4, p1}, Lxi/d;-><init>(Ldm/e;Ljava/lang/String;)V

    invoke-interface {v0, p2}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    new-instance p1, Lxi/d;

    sget-object p2, Lio/grpc/internal/q0;->l:Lvi/w0$g;

    invoke-virtual {p2}, Lvi/w0$g;->d()Ljava/lang/String;

    move-result-object p2

    invoke-direct {p1, p2, p3}, Lxi/d;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {v0, p1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    sget-object p1, Lwi/d;->e:Lxi/d;

    invoke-interface {v0, p1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    sget-object p1, Lwi/d;->f:Lxi/d;

    invoke-interface {v0, p1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    invoke-static {v0, p0}, Lwi/d;->a(Ljava/util/List;Lvi/w0;)Ljava/util/List;

    move-result-object p0

    return-object p0
.end method

.method private static c(Lvi/w0;)V
    .locals 1

    sget-object v0, Lio/grpc/internal/q0;->j:Lvi/w0$g;

    invoke-virtual {p0, v0}, Lvi/w0;->e(Lvi/w0$g;)V

    sget-object v0, Lio/grpc/internal/q0;->k:Lvi/w0$g;

    invoke-virtual {p0, v0}, Lvi/w0;->e(Lvi/w0$g;)V

    sget-object v0, Lio/grpc/internal/q0;->l:Lvi/w0$g;

    invoke-virtual {p0, v0}, Lvi/w0;->e(Lvi/w0$g;)V

    return-void
.end method

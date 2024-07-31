.class public Li0/h;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroidx/camera/core/impl/s;


# instance fields
.field private final a:Landroidx/camera/core/impl/s;

.field private final b:Landroidx/camera/core/impl/f2;

.field private final c:J


# direct methods
.method public constructor <init>(Landroidx/camera/core/impl/f2;J)V
    .locals 1

    const/4 v0, 0x0

    invoke-direct {p0, v0, p1, p2, p3}, Li0/h;-><init>(Landroidx/camera/core/impl/s;Landroidx/camera/core/impl/f2;J)V

    return-void
.end method

.method public constructor <init>(Landroidx/camera/core/impl/f2;Landroidx/camera/core/impl/s;)V
    .locals 2

    const-wide/16 v0, -0x1

    invoke-direct {p0, p2, p1, v0, v1}, Li0/h;-><init>(Landroidx/camera/core/impl/s;Landroidx/camera/core/impl/f2;J)V

    return-void
.end method

.method private constructor <init>(Landroidx/camera/core/impl/s;Landroidx/camera/core/impl/f2;J)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Li0/h;->a:Landroidx/camera/core/impl/s;

    iput-object p2, p0, Li0/h;->b:Landroidx/camera/core/impl/f2;

    iput-wide p3, p0, Li0/h;->c:J

    return-void
.end method


# virtual methods
.method public b()Landroidx/camera/core/impl/f2;
    .locals 1

    iget-object v0, p0, Li0/h;->b:Landroidx/camera/core/impl/f2;

    return-object v0
.end method

.method public c()J
    .locals 4

    iget-object v0, p0, Li0/h;->a:Landroidx/camera/core/impl/s;

    if-eqz v0, :cond_0

    invoke-interface {v0}, Landroidx/camera/core/impl/s;->c()J

    move-result-wide v0

    return-wide v0

    :cond_0
    iget-wide v0, p0, Li0/h;->c:J

    const-wide/16 v2, -0x1

    cmp-long v2, v0, v2

    if-eqz v2, :cond_1

    return-wide v0

    :cond_1
    new-instance v0, Ljava/lang/IllegalStateException;

    const-string v1, "No timestamp is available."

    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0
.end method

.method public d()Landroidx/camera/core/impl/r;
    .locals 1

    iget-object v0, p0, Li0/h;->a:Landroidx/camera/core/impl/s;

    if-eqz v0, :cond_0

    invoke-interface {v0}, Landroidx/camera/core/impl/s;->d()Landroidx/camera/core/impl/r;

    move-result-object v0

    goto :goto_0

    :cond_0
    sget-object v0, Landroidx/camera/core/impl/r;->UNKNOWN:Landroidx/camera/core/impl/r;

    :goto_0
    return-object v0
.end method

.method public f()Landroidx/camera/core/impl/p;
    .locals 1

    iget-object v0, p0, Li0/h;->a:Landroidx/camera/core/impl/s;

    if-eqz v0, :cond_0

    invoke-interface {v0}, Landroidx/camera/core/impl/s;->f()Landroidx/camera/core/impl/p;

    move-result-object v0

    goto :goto_0

    :cond_0
    sget-object v0, Landroidx/camera/core/impl/p;->UNKNOWN:Landroidx/camera/core/impl/p;

    :goto_0
    return-object v0
.end method

.method public g()Landroidx/camera/core/impl/q;
    .locals 1

    iget-object v0, p0, Li0/h;->a:Landroidx/camera/core/impl/s;

    if-eqz v0, :cond_0

    invoke-interface {v0}, Landroidx/camera/core/impl/s;->g()Landroidx/camera/core/impl/q;

    move-result-object v0

    goto :goto_0

    :cond_0
    sget-object v0, Landroidx/camera/core/impl/q;->UNKNOWN:Landroidx/camera/core/impl/q;

    :goto_0
    return-object v0
.end method

.method public h()Landroidx/camera/core/impl/n;
    .locals 1

    iget-object v0, p0, Li0/h;->a:Landroidx/camera/core/impl/s;

    if-eqz v0, :cond_0

    invoke-interface {v0}, Landroidx/camera/core/impl/s;->h()Landroidx/camera/core/impl/n;

    move-result-object v0

    goto :goto_0

    :cond_0
    sget-object v0, Landroidx/camera/core/impl/n;->UNKNOWN:Landroidx/camera/core/impl/n;

    :goto_0
    return-object v0
.end method

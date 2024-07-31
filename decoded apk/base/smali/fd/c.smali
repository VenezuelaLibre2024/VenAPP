.class public Lfd/c;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field private final a:Lgd/c;

.field private final b:Lgd/a;


# direct methods
.method public constructor <init>(Lgd/a;)V
    .locals 4

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    if-nez p1, :cond_0

    const/4 p1, 0x0

    iput-object p1, p0, Lfd/c;->b:Lgd/a;

    iput-object p1, p0, Lfd/c;->a:Lgd/c;

    return-void

    :cond_0
    invoke-virtual {p1}, Lgd/a;->u1()J

    move-result-wide v0

    const-wide/16 v2, 0x0

    cmp-long v0, v0, v2

    if-nez v0, :cond_1

    invoke-static {}, Lla/i;->d()Lla/f;

    move-result-object v0

    invoke-interface {v0}, Lla/f;->a()J

    move-result-wide v0

    invoke-virtual {p1, v0, v1}, Lgd/a;->A1(J)V

    :cond_1
    iput-object p1, p0, Lfd/c;->b:Lgd/a;

    new-instance v0, Lgd/c;

    invoke-direct {v0, p1}, Lgd/c;-><init>(Lgd/a;)V

    iput-object v0, p0, Lfd/c;->a:Lgd/c;

    return-void
.end method


# virtual methods
.method public a()J
    .locals 2

    iget-object v0, p0, Lfd/c;->b:Lgd/a;

    if-nez v0, :cond_0

    const-wide/16 v0, 0x0

    return-wide v0

    :cond_0
    invoke-virtual {v0}, Lgd/a;->u1()J

    move-result-wide v0

    return-wide v0
.end method

.method public b()Landroid/net/Uri;
    .locals 2

    iget-object v0, p0, Lfd/c;->b:Lgd/a;

    const/4 v1, 0x0

    if-nez v0, :cond_0

    return-object v1

    :cond_0
    invoke-virtual {v0}, Lgd/a;->v1()Ljava/lang/String;

    move-result-object v0

    if-eqz v0, :cond_1

    invoke-static {v0}, Landroid/net/Uri;->parse(Ljava/lang/String;)Landroid/net/Uri;

    move-result-object v0

    return-object v0

    :cond_1
    return-object v1
.end method

.method public c()I
    .locals 1

    iget-object v0, p0, Lfd/c;->b:Lgd/a;

    if-nez v0, :cond_0

    const/4 v0, 0x0

    return v0

    :cond_0
    invoke-virtual {v0}, Lgd/a;->y1()I

    move-result v0

    return v0
.end method

.method public d()Landroid/os/Bundle;
    .locals 1

    iget-object v0, p0, Lfd/c;->a:Lgd/c;

    if-nez v0, :cond_0

    new-instance v0, Landroid/os/Bundle;

    invoke-direct {v0}, Landroid/os/Bundle;-><init>()V

    return-object v0

    :cond_0
    invoke-virtual {v0}, Lgd/c;->a()Landroid/os/Bundle;

    move-result-object v0

    return-object v0
.end method

.class final Lt6/s;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lt8/u;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lt6/s$a;
    }
.end annotation


# instance fields
.field private final a:Lt8/j0;

.field private final b:Lt6/s$a;

.field private c:Lt6/q3;

.field private d:Lt8/u;

.field private e:Z

.field private f:Z


# direct methods
.method public constructor <init>(Lt6/s$a;Lt8/d;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lt6/s;->b:Lt6/s$a;

    new-instance p1, Lt8/j0;

    invoke-direct {p1, p2}, Lt8/j0;-><init>(Lt8/d;)V

    iput-object p1, p0, Lt6/s;->a:Lt8/j0;

    const/4 p1, 0x1

    iput-boolean p1, p0, Lt6/s;->e:Z

    return-void
.end method

.method private f(Z)Z
    .locals 1

    iget-object v0, p0, Lt6/s;->c:Lt6/q3;

    if-eqz v0, :cond_1

    invoke-interface {v0}, Lt6/q3;->e()Z

    move-result v0

    if-nez v0, :cond_1

    iget-object v0, p0, Lt6/s;->c:Lt6/q3;

    invoke-interface {v0}, Lt6/q3;->d()Z

    move-result v0

    if-nez v0, :cond_0

    if-nez p1, :cond_1

    iget-object p1, p0, Lt6/s;->c:Lt6/q3;

    invoke-interface {p1}, Lt6/q3;->i()Z

    move-result p1

    if-eqz p1, :cond_0

    goto :goto_0

    :cond_0
    const/4 p1, 0x0

    goto :goto_1

    :cond_1
    :goto_0
    const/4 p1, 0x1

    :goto_1
    return p1
.end method

.method private j(Z)V
    .locals 4

    invoke-direct {p0, p1}, Lt6/s;->f(Z)Z

    move-result p1

    if-eqz p1, :cond_1

    const/4 p1, 0x1

    iput-boolean p1, p0, Lt6/s;->e:Z

    iget-boolean p1, p0, Lt6/s;->f:Z

    if-eqz p1, :cond_0

    iget-object p1, p0, Lt6/s;->a:Lt8/j0;

    invoke-virtual {p1}, Lt8/j0;->d()V

    :cond_0
    return-void

    :cond_1
    iget-object p1, p0, Lt6/s;->d:Lt8/u;

    invoke-static {p1}, Lt8/a;->e(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lt8/u;

    invoke-interface {p1}, Lt8/u;->w()J

    move-result-wide v0

    iget-boolean v2, p0, Lt6/s;->e:Z

    if-eqz v2, :cond_3

    iget-object v2, p0, Lt6/s;->a:Lt8/j0;

    invoke-virtual {v2}, Lt8/j0;->w()J

    move-result-wide v2

    cmp-long v2, v0, v2

    if-gez v2, :cond_2

    iget-object p1, p0, Lt6/s;->a:Lt8/j0;

    invoke-virtual {p1}, Lt8/j0;->e()V

    return-void

    :cond_2
    const/4 v2, 0x0

    iput-boolean v2, p0, Lt6/s;->e:Z

    iget-boolean v2, p0, Lt6/s;->f:Z

    if-eqz v2, :cond_3

    iget-object v2, p0, Lt6/s;->a:Lt8/j0;

    invoke-virtual {v2}, Lt8/j0;->d()V

    :cond_3
    iget-object v2, p0, Lt6/s;->a:Lt8/j0;

    invoke-virtual {v2, v0, v1}, Lt8/j0;->a(J)V

    invoke-interface {p1}, Lt8/u;->c()Lt6/i3;

    move-result-object p1

    iget-object v0, p0, Lt6/s;->a:Lt8/j0;

    invoke-virtual {v0}, Lt8/j0;->c()Lt6/i3;

    move-result-object v0

    invoke-virtual {p1, v0}, Lt6/i3;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_4

    iget-object v0, p0, Lt6/s;->a:Lt8/j0;

    invoke-virtual {v0, p1}, Lt8/j0;->b(Lt6/i3;)V

    iget-object v0, p0, Lt6/s;->b:Lt6/s$a;

    invoke-interface {v0, p1}, Lt6/s$a;->onPlaybackParametersChanged(Lt6/i3;)V

    :cond_4
    return-void
.end method


# virtual methods
.method public a(Lt6/q3;)V
    .locals 1

    iget-object v0, p0, Lt6/s;->c:Lt6/q3;

    if-ne p1, v0, :cond_0

    const/4 p1, 0x0

    iput-object p1, p0, Lt6/s;->d:Lt8/u;

    iput-object p1, p0, Lt6/s;->c:Lt6/q3;

    const/4 p1, 0x1

    iput-boolean p1, p0, Lt6/s;->e:Z

    :cond_0
    return-void
.end method

.method public b(Lt6/i3;)V
    .locals 1

    iget-object v0, p0, Lt6/s;->d:Lt8/u;

    if-eqz v0, :cond_0

    invoke-interface {v0, p1}, Lt8/u;->b(Lt6/i3;)V

    iget-object p1, p0, Lt6/s;->d:Lt8/u;

    invoke-interface {p1}, Lt8/u;->c()Lt6/i3;

    move-result-object p1

    :cond_0
    iget-object v0, p0, Lt6/s;->a:Lt8/j0;

    invoke-virtual {v0, p1}, Lt8/j0;->b(Lt6/i3;)V

    return-void
.end method

.method public c()Lt6/i3;
    .locals 1

    iget-object v0, p0, Lt6/s;->d:Lt8/u;

    if-eqz v0, :cond_0

    invoke-interface {v0}, Lt8/u;->c()Lt6/i3;

    move-result-object v0

    goto :goto_0

    :cond_0
    iget-object v0, p0, Lt6/s;->a:Lt8/j0;

    invoke-virtual {v0}, Lt8/j0;->c()Lt6/i3;

    move-result-object v0

    :goto_0
    return-object v0
.end method

.method public d(Lt6/q3;)V
    .locals 2

    invoke-interface {p1}, Lt6/q3;->E()Lt8/u;

    move-result-object v0

    if-eqz v0, :cond_1

    iget-object v1, p0, Lt6/s;->d:Lt8/u;

    if-eq v0, v1, :cond_1

    if-nez v1, :cond_0

    iput-object v0, p0, Lt6/s;->d:Lt8/u;

    iput-object p1, p0, Lt6/s;->c:Lt6/q3;

    iget-object p1, p0, Lt6/s;->a:Lt8/j0;

    invoke-virtual {p1}, Lt8/j0;->c()Lt6/i3;

    move-result-object p1

    invoke-interface {v0, p1}, Lt8/u;->b(Lt6/i3;)V

    goto :goto_0

    :cond_0
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string v0, "Multiple renderer media clocks enabled."

    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    invoke-static {p1}, Lt6/x;->i(Ljava/lang/RuntimeException;)Lt6/x;

    move-result-object p1

    throw p1

    :cond_1
    :goto_0
    return-void
.end method

.method public e(J)V
    .locals 1

    iget-object v0, p0, Lt6/s;->a:Lt8/j0;

    invoke-virtual {v0, p1, p2}, Lt8/j0;->a(J)V

    return-void
.end method

.method public g()V
    .locals 1

    const/4 v0, 0x1

    iput-boolean v0, p0, Lt6/s;->f:Z

    iget-object v0, p0, Lt6/s;->a:Lt8/j0;

    invoke-virtual {v0}, Lt8/j0;->d()V

    return-void
.end method

.method public h()V
    .locals 1

    const/4 v0, 0x0

    iput-boolean v0, p0, Lt6/s;->f:Z

    iget-object v0, p0, Lt6/s;->a:Lt8/j0;

    invoke-virtual {v0}, Lt8/j0;->e()V

    return-void
.end method

.method public i(Z)J
    .locals 2

    invoke-direct {p0, p1}, Lt6/s;->j(Z)V

    invoke-virtual {p0}, Lt6/s;->w()J

    move-result-wide v0

    return-wide v0
.end method

.method public w()J
    .locals 2

    iget-boolean v0, p0, Lt6/s;->e:Z

    if-eqz v0, :cond_0

    iget-object v0, p0, Lt6/s;->a:Lt8/j0;

    invoke-virtual {v0}, Lt8/j0;->w()J

    move-result-wide v0

    goto :goto_0

    :cond_0
    iget-object v0, p0, Lt6/s;->d:Lt8/u;

    invoke-static {v0}, Lt8/a;->e(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lt8/u;

    invoke-interface {v0}, Lt8/u;->w()J

    move-result-wide v0

    :goto_0
    return-wide v0
.end method

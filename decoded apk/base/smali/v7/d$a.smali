.class final Lv7/d$a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lv7/v0;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lv7/d;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x12
    name = "a"
.end annotation


# instance fields
.field public final a:Lv7/v0;

.field private b:Z

.field final synthetic c:Lv7/d;


# direct methods
.method public constructor <init>(Lv7/d;Lv7/v0;)V
    .locals 0

    iput-object p1, p0, Lv7/d$a;->c:Lv7/d;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p2, p0, Lv7/d$a;->a:Lv7/v0;

    return-void
.end method


# virtual methods
.method public a()V
    .locals 1

    iget-object v0, p0, Lv7/d$a;->a:Lv7/v0;

    invoke-interface {v0}, Lv7/v0;->a()V

    return-void
.end method

.method public b()V
    .locals 1

    const/4 v0, 0x0

    iput-boolean v0, p0, Lv7/d$a;->b:Z

    return-void
.end method

.method public d()Z
    .locals 1

    iget-object v0, p0, Lv7/d$a;->c:Lv7/d;

    invoke-virtual {v0}, Lv7/d;->m()Z

    move-result v0

    if-nez v0, :cond_0

    iget-object v0, p0, Lv7/d$a;->a:Lv7/v0;

    invoke-interface {v0}, Lv7/v0;->d()Z

    move-result v0

    if-eqz v0, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    return v0
.end method

.method public p(J)I
    .locals 1

    iget-object v0, p0, Lv7/d$a;->c:Lv7/d;

    invoke-virtual {v0}, Lv7/d;->m()Z

    move-result v0

    if-eqz v0, :cond_0

    const/4 p1, -0x3

    return p1

    :cond_0
    iget-object v0, p0, Lv7/d$a;->a:Lv7/v0;

    invoke-interface {v0, p1, p2}, Lv7/v0;->p(J)I

    move-result p1

    return p1
.end method

.method public q(Lt6/v1;Lw6/g;I)I
    .locals 10

    iget-object v0, p0, Lv7/d$a;->c:Lv7/d;

    invoke-virtual {v0}, Lv7/d;->m()Z

    move-result v0

    const/4 v1, -0x3

    if-eqz v0, :cond_0

    return v1

    :cond_0
    iget-boolean v0, p0, Lv7/d$a;->b:Z

    const/4 v2, 0x4

    const/4 v3, -0x4

    if-eqz v0, :cond_1

    invoke-virtual {p2, v2}, Lw6/a;->w(I)V

    return v3

    :cond_1
    iget-object v0, p0, Lv7/d$a;->a:Lv7/v0;

    invoke-interface {v0, p1, p2, p3}, Lv7/v0;->q(Lt6/v1;Lw6/g;I)I

    move-result p3

    const/4 v0, -0x5

    const-wide/high16 v4, -0x8000000000000000L

    if-ne p3, v0, :cond_6

    iget-object p2, p1, Lt6/v1;->b:Lt6/u1;

    invoke-static {p2}, Lt8/a;->e(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p2

    check-cast p2, Lt6/u1;

    iget p3, p2, Lt6/u1;->M:I

    if-nez p3, :cond_2

    iget v1, p2, Lt6/u1;->N:I

    if-eqz v1, :cond_5

    :cond_2
    iget-object v1, p0, Lv7/d$a;->c:Lv7/d;

    iget-wide v2, v1, Lv7/d;->e:J

    const-wide/16 v6, 0x0

    cmp-long v2, v2, v6

    const/4 v3, 0x0

    if-eqz v2, :cond_3

    move p3, v3

    :cond_3
    iget-wide v1, v1, Lv7/d;->f:J

    cmp-long v1, v1, v4

    if-eqz v1, :cond_4

    goto :goto_0

    :cond_4
    iget v3, p2, Lt6/u1;->N:I

    :goto_0
    invoke-virtual {p2}, Lt6/u1;->c()Lt6/u1$b;

    move-result-object p2

    invoke-virtual {p2, p3}, Lt6/u1$b;->P(I)Lt6/u1$b;

    move-result-object p2

    invoke-virtual {p2, v3}, Lt6/u1$b;->Q(I)Lt6/u1$b;

    move-result-object p2

    invoke-virtual {p2}, Lt6/u1$b;->G()Lt6/u1;

    move-result-object p2

    iput-object p2, p1, Lt6/v1;->b:Lt6/u1;

    :cond_5
    return v0

    :cond_6
    iget-object p1, p0, Lv7/d$a;->c:Lv7/d;

    iget-wide v6, p1, Lv7/d;->f:J

    cmp-long v0, v6, v4

    if-eqz v0, :cond_9

    if-ne p3, v3, :cond_7

    iget-wide v8, p2, Lw6/g;->e:J

    cmp-long v0, v8, v6

    if-gez v0, :cond_8

    :cond_7
    if-ne p3, v1, :cond_9

    invoke-virtual {p1}, Lv7/d;->f()J

    move-result-wide v0

    cmp-long p1, v0, v4

    if-nez p1, :cond_9

    iget-boolean p1, p2, Lw6/g;->d:Z

    if-nez p1, :cond_9

    :cond_8
    invoke-virtual {p2}, Lw6/g;->n()V

    invoke-virtual {p2, v2}, Lw6/a;->w(I)V

    const/4 p1, 0x1

    iput-boolean p1, p0, Lv7/d$a;->b:Z

    return v3

    :cond_9
    return p3
.end method

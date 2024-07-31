.class public final Lk2/s;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lk2/r;


# instance fields
.field private final a:Lr1/u;

.field private final b:Lr1/i;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lr1/i<",
            "Lk2/q;",
            ">;"
        }
    .end annotation
.end field

.field private final c:Lr1/d0;

.field private final d:Lr1/d0;


# direct methods
.method public constructor <init>(Lr1/u;)V
    .locals 1

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lk2/s;->a:Lr1/u;

    new-instance v0, Lk2/s$a;

    invoke-direct {v0, p0, p1}, Lk2/s$a;-><init>(Lk2/s;Lr1/u;)V

    iput-object v0, p0, Lk2/s;->b:Lr1/i;

    new-instance v0, Lk2/s$b;

    invoke-direct {v0, p0, p1}, Lk2/s$b;-><init>(Lk2/s;Lr1/u;)V

    iput-object v0, p0, Lk2/s;->c:Lr1/d0;

    new-instance v0, Lk2/s$c;

    invoke-direct {v0, p0, p1}, Lk2/s$c;-><init>(Lk2/s;Lr1/u;)V

    iput-object v0, p0, Lk2/s;->d:Lr1/d0;

    return-void
.end method

.method public static d()Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Ljava/lang/Class<",
            "*>;>;"
        }
    .end annotation

    invoke-static {}, Ljava/util/Collections;->emptyList()Ljava/util/List;

    move-result-object v0

    return-object v0
.end method


# virtual methods
.method public a(Ljava/lang/String;)V
    .locals 2

    iget-object v0, p0, Lk2/s;->a:Lr1/u;

    invoke-virtual {v0}, Lr1/u;->d()V

    iget-object v0, p0, Lk2/s;->c:Lr1/d0;

    invoke-virtual {v0}, Lr1/d0;->b()Lv1/m;

    move-result-object v0

    const/4 v1, 0x1

    if-nez p1, :cond_0

    invoke-interface {v0, v1}, Lv1/k;->g1(I)V

    goto :goto_0

    :cond_0
    invoke-interface {v0, v1, p1}, Lv1/k;->x0(ILjava/lang/String;)V

    :goto_0
    iget-object p1, p0, Lk2/s;->a:Lr1/u;

    invoke-virtual {p1}, Lr1/u;->e()V

    :try_start_0
    invoke-interface {v0}, Lv1/m;->z()I

    iget-object p1, p0, Lk2/s;->a:Lr1/u;

    invoke-virtual {p1}, Lr1/u;->B()V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    iget-object p1, p0, Lk2/s;->a:Lr1/u;

    invoke-virtual {p1}, Lr1/u;->i()V

    iget-object p1, p0, Lk2/s;->c:Lr1/d0;

    invoke-virtual {p1, v0}, Lr1/d0;->h(Lv1/m;)V

    return-void

    :catchall_0
    move-exception p1

    iget-object v1, p0, Lk2/s;->a:Lr1/u;

    invoke-virtual {v1}, Lr1/u;->i()V

    iget-object v1, p0, Lk2/s;->c:Lr1/d0;

    invoke-virtual {v1, v0}, Lr1/d0;->h(Lv1/m;)V

    throw p1
.end method

.method public b()V
    .locals 3

    iget-object v0, p0, Lk2/s;->a:Lr1/u;

    invoke-virtual {v0}, Lr1/u;->d()V

    iget-object v0, p0, Lk2/s;->d:Lr1/d0;

    invoke-virtual {v0}, Lr1/d0;->b()Lv1/m;

    move-result-object v0

    iget-object v1, p0, Lk2/s;->a:Lr1/u;

    invoke-virtual {v1}, Lr1/u;->e()V

    :try_start_0
    invoke-interface {v0}, Lv1/m;->z()I

    iget-object v1, p0, Lk2/s;->a:Lr1/u;

    invoke-virtual {v1}, Lr1/u;->B()V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    iget-object v1, p0, Lk2/s;->a:Lr1/u;

    invoke-virtual {v1}, Lr1/u;->i()V

    iget-object v1, p0, Lk2/s;->d:Lr1/d0;

    invoke-virtual {v1, v0}, Lr1/d0;->h(Lv1/m;)V

    return-void

    :catchall_0
    move-exception v1

    iget-object v2, p0, Lk2/s;->a:Lr1/u;

    invoke-virtual {v2}, Lr1/u;->i()V

    iget-object v2, p0, Lk2/s;->d:Lr1/d0;

    invoke-virtual {v2, v0}, Lr1/d0;->h(Lv1/m;)V

    throw v1
.end method

.method public c(Lk2/q;)V
    .locals 1

    iget-object v0, p0, Lk2/s;->a:Lr1/u;

    invoke-virtual {v0}, Lr1/u;->d()V

    iget-object v0, p0, Lk2/s;->a:Lr1/u;

    invoke-virtual {v0}, Lr1/u;->e()V

    :try_start_0
    iget-object v0, p0, Lk2/s;->b:Lr1/i;

    invoke-virtual {v0, p1}, Lr1/i;->j(Ljava/lang/Object;)V

    iget-object p1, p0, Lk2/s;->a:Lr1/u;

    invoke-virtual {p1}, Lr1/u;->B()V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    iget-object p1, p0, Lk2/s;->a:Lr1/u;

    invoke-virtual {p1}, Lr1/u;->i()V

    return-void

    :catchall_0
    move-exception p1

    iget-object v0, p0, Lk2/s;->a:Lr1/u;

    invoke-virtual {v0}, Lr1/u;->i()V

    throw p1
.end method

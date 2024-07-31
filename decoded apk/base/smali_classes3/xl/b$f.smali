.class final Lxl/b$f;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ldm/v;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lxl/b;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x12
    name = "f"
.end annotation


# instance fields
.field private final a:Ldm/h;

.field private b:Z

.field final synthetic c:Lxl/b;


# direct methods
.method public constructor <init>(Lxl/b;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()V"
        }
    .end annotation

    const-string v0, "this$0"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/n;->e(Ljava/lang/Object;Ljava/lang/String;)V

    iput-object p1, p0, Lxl/b$f;->c:Lxl/b;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    new-instance v0, Ldm/h;

    invoke-static {p1}, Lxl/b;->l(Lxl/b;)Ldm/c;

    move-result-object p1

    invoke-interface {p1}, Ldm/v;->m()Ldm/y;

    move-result-object p1

    invoke-direct {v0, p1}, Ldm/h;-><init>(Ldm/y;)V

    iput-object v0, p0, Lxl/b$f;->a:Ldm/h;

    return-void
.end method


# virtual methods
.method public K0(Ldm/b;J)V
    .locals 7

    const-string v0, "source"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/n;->e(Ljava/lang/Object;Ljava/lang/String;)V

    iget-boolean v0, p0, Lxl/b$f;->b:Z

    xor-int/lit8 v0, v0, 0x1

    if-eqz v0, :cond_0

    invoke-virtual {p1}, Ldm/b;->size()J

    move-result-wide v1

    const-wide/16 v3, 0x0

    move-wide v5, p2

    invoke-static/range {v1 .. v6}, Lrl/d;->l(JJJ)V

    iget-object v0, p0, Lxl/b$f;->c:Lxl/b;

    invoke-static {v0}, Lxl/b;->l(Lxl/b;)Ldm/c;

    move-result-object v0

    invoke-interface {v0, p1, p2, p3}, Ldm/v;->K0(Ldm/b;J)V

    return-void

    :cond_0
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string p2, "closed"

    invoke-virtual {p2}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object p2

    invoke-direct {p1, p2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public close()V
    .locals 2

    iget-boolean v0, p0, Lxl/b$f;->b:Z

    if-eqz v0, :cond_0

    return-void

    :cond_0
    const/4 v0, 0x1

    iput-boolean v0, p0, Lxl/b$f;->b:Z

    iget-object v0, p0, Lxl/b$f;->c:Lxl/b;

    iget-object v1, p0, Lxl/b$f;->a:Ldm/h;

    invoke-static {v0, v1}, Lxl/b;->i(Lxl/b;Ldm/h;)V

    iget-object v0, p0, Lxl/b$f;->c:Lxl/b;

    const/4 v1, 0x3

    invoke-static {v0, v1}, Lxl/b;->p(Lxl/b;I)V

    return-void
.end method

.method public flush()V
    .locals 1

    iget-boolean v0, p0, Lxl/b$f;->b:Z

    if-eqz v0, :cond_0

    return-void

    :cond_0
    iget-object v0, p0, Lxl/b$f;->c:Lxl/b;

    invoke-static {v0}, Lxl/b;->l(Lxl/b;)Ldm/c;

    move-result-object v0

    invoke-interface {v0}, Ldm/c;->flush()V

    return-void
.end method

.method public m()Ldm/y;
    .locals 1

    iget-object v0, p0, Lxl/b$f;->a:Ldm/h;

    return-object v0
.end method

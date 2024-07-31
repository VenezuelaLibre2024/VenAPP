.class public abstract Li9/c0;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field private a:Ljava/lang/String;

.field private b:Ljava/util/List;

.field private c:Ljava/lang/String;

.field private d:La9/d;

.field private e:Ljava/lang/String;

.field private f:Ljava/lang/String;

.field private g:Ljava/lang/Double;

.field private h:Ljava/lang/String;

.field private i:Ljava/lang/String;

.field private j:Lx8/b0;

.field private k:Z

.field private l:Landroid/view/View;

.field private m:Landroid/view/View;

.field private n:Ljava/lang/Object;

.field private o:Landroid/os/Bundle;

.field private p:Z

.field private q:Z

.field private r:F


# direct methods
.method public constructor <init>()V
    .locals 1

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    new-instance v0, Landroid/os/Bundle;

    invoke-direct {v0}, Landroid/os/Bundle;-><init>()V

    iput-object v0, p0, Li9/c0;->o:Landroid/os/Bundle;

    return-void
.end method


# virtual methods
.method public final A(La9/d;)V
    .locals 0

    iput-object p1, p0, Li9/c0;->d:La9/d;

    return-void
.end method

.method public final B(Ljava/util/List;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "La9/d;",
            ">;)V"
        }
    .end annotation

    iput-object p1, p0, Li9/c0;->b:Ljava/util/List;

    return-void
.end method

.method public C(Landroid/view/View;)V
    .locals 0

    iput-object p1, p0, Li9/c0;->m:Landroid/view/View;

    return-void
.end method

.method public final D(Z)V
    .locals 0

    iput-boolean p1, p0, Li9/c0;->q:Z

    return-void
.end method

.method public final E(Z)V
    .locals 0

    iput-boolean p1, p0, Li9/c0;->p:Z

    return-void
.end method

.method public final F(Ljava/lang/String;)V
    .locals 0

    iput-object p1, p0, Li9/c0;->i:Ljava/lang/String;

    return-void
.end method

.method public final G(Ljava/lang/Double;)V
    .locals 0

    iput-object p1, p0, Li9/c0;->g:Ljava/lang/Double;

    return-void
.end method

.method public final H(Ljava/lang/String;)V
    .locals 0

    iput-object p1, p0, Li9/c0;->h:Ljava/lang/String;

    return-void
.end method

.method public I(Landroid/view/View;Ljava/util/Map;Ljava/util/Map;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroid/view/View;",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Landroid/view/View;",
            ">;",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Landroid/view/View;",
            ">;)V"
        }
    .end annotation

    return-void
.end method

.method public J(Landroid/view/View;)V
    .locals 0

    return-void
.end method

.method public final K()Landroid/view/View;
    .locals 1

    iget-object v0, p0, Li9/c0;->m:Landroid/view/View;

    return-object v0
.end method

.method public final L()Lx8/b0;
    .locals 1

    iget-object v0, p0, Li9/c0;->j:Lx8/b0;

    return-object v0
.end method

.method public final M()Ljava/lang/Object;
    .locals 1

    iget-object v0, p0, Li9/c0;->n:Ljava/lang/Object;

    return-object v0
.end method

.method public final N(Ljava/lang/Object;)V
    .locals 0

    iput-object p1, p0, Li9/c0;->n:Ljava/lang/Object;

    return-void
.end method

.method public final O(Lx8/b0;)V
    .locals 0

    iput-object p1, p0, Li9/c0;->j:Lx8/b0;

    return-void
.end method

.method public a()Landroid/view/View;
    .locals 1

    iget-object v0, p0, Li9/c0;->l:Landroid/view/View;

    return-object v0
.end method

.method public final b()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Li9/c0;->f:Ljava/lang/String;

    return-object v0
.end method

.method public final c()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Li9/c0;->c:Ljava/lang/String;

    return-object v0
.end method

.method public final d()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Li9/c0;->e:Ljava/lang/String;

    return-object v0
.end method

.method public e()F
    .locals 1

    const/4 v0, 0x0

    return v0
.end method

.method public f()F
    .locals 1

    const/4 v0, 0x0

    return v0
.end method

.method public final g()Landroid/os/Bundle;
    .locals 1

    iget-object v0, p0, Li9/c0;->o:Landroid/os/Bundle;

    return-object v0
.end method

.method public final h()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Li9/c0;->a:Ljava/lang/String;

    return-object v0
.end method

.method public final i()La9/d;
    .locals 1

    iget-object v0, p0, Li9/c0;->d:La9/d;

    return-object v0
.end method

.method public final j()Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "La9/d;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Li9/c0;->b:Ljava/util/List;

    return-object v0
.end method

.method public k()F
    .locals 1

    iget v0, p0, Li9/c0;->r:F

    return v0
.end method

.method public final l()Z
    .locals 1

    iget-boolean v0, p0, Li9/c0;->q:Z

    return v0
.end method

.method public final m()Z
    .locals 1

    iget-boolean v0, p0, Li9/c0;->p:Z

    return v0
.end method

.method public final n()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Li9/c0;->i:Ljava/lang/String;

    return-object v0
.end method

.method public final o()Ljava/lang/Double;
    .locals 1

    iget-object v0, p0, Li9/c0;->g:Ljava/lang/Double;

    return-object v0
.end method

.method public final p()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Li9/c0;->h:Ljava/lang/String;

    return-object v0
.end method

.method public q(Landroid/view/View;)V
    .locals 0

    return-void
.end method

.method public r()Z
    .locals 1

    iget-boolean v0, p0, Li9/c0;->k:Z

    return v0
.end method

.method public s()V
    .locals 0

    return-void
.end method

.method public t(Landroid/view/View;)V
    .locals 0

    iput-object p1, p0, Li9/c0;->l:Landroid/view/View;

    return-void
.end method

.method public final u(Ljava/lang/String;)V
    .locals 0

    iput-object p1, p0, Li9/c0;->f:Ljava/lang/String;

    return-void
.end method

.method public final v(Ljava/lang/String;)V
    .locals 0

    iput-object p1, p0, Li9/c0;->c:Ljava/lang/String;

    return-void
.end method

.method public final w(Ljava/lang/String;)V
    .locals 0

    iput-object p1, p0, Li9/c0;->e:Ljava/lang/String;

    return-void
.end method

.method public final x(Landroid/os/Bundle;)V
    .locals 0

    iput-object p1, p0, Li9/c0;->o:Landroid/os/Bundle;

    return-void
.end method

.method public y(Z)V
    .locals 0

    iput-boolean p1, p0, Li9/c0;->k:Z

    return-void
.end method

.method public final z(Ljava/lang/String;)V
    .locals 0

    iput-object p1, p0, Li9/c0;->a:Ljava/lang/String;

    return-void
.end method

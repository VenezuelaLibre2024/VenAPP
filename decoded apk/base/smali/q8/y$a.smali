.class public Lq8/y$a;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lq8/y;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x9
    name = "a"
.end annotation


# instance fields
.field private a:I

.field private b:I

.field private c:I

.field private d:I

.field private e:I

.field private f:I

.field private g:I

.field private h:I

.field private i:I

.field private j:I

.field private k:Z

.field private l:Lcom/google/common/collect/w;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lcom/google/common/collect/w<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation
.end field

.field private m:I

.field private n:Lcom/google/common/collect/w;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lcom/google/common/collect/w<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation
.end field

.field private o:I

.field private p:I

.field private q:I

.field private r:Lcom/google/common/collect/w;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lcom/google/common/collect/w<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation
.end field

.field private s:Lcom/google/common/collect/w;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lcom/google/common/collect/w<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation
.end field

.field private t:I

.field private u:I

.field private v:Z

.field private w:Z

.field private x:Z

.field private y:Ljava/util/HashMap;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/HashMap<",
            "Lv7/d1;",
            "Lq8/w;",
            ">;"
        }
    .end annotation
.end field

.field private z:Ljava/util/HashSet;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/HashSet<",
            "Ljava/lang/Integer;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>()V
    .locals 3
    .annotation runtime Ljava/lang/Deprecated;
    .end annotation

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const v0, 0x7fffffff

    iput v0, p0, Lq8/y$a;->a:I

    iput v0, p0, Lq8/y$a;->b:I

    iput v0, p0, Lq8/y$a;->c:I

    iput v0, p0, Lq8/y$a;->d:I

    iput v0, p0, Lq8/y$a;->i:I

    iput v0, p0, Lq8/y$a;->j:I

    const/4 v1, 0x1

    iput-boolean v1, p0, Lq8/y$a;->k:Z

    invoke-static {}, Lcom/google/common/collect/w;->v()Lcom/google/common/collect/w;

    move-result-object v1

    iput-object v1, p0, Lq8/y$a;->l:Lcom/google/common/collect/w;

    const/4 v1, 0x0

    iput v1, p0, Lq8/y$a;->m:I

    invoke-static {}, Lcom/google/common/collect/w;->v()Lcom/google/common/collect/w;

    move-result-object v2

    iput-object v2, p0, Lq8/y$a;->n:Lcom/google/common/collect/w;

    iput v1, p0, Lq8/y$a;->o:I

    iput v0, p0, Lq8/y$a;->p:I

    iput v0, p0, Lq8/y$a;->q:I

    invoke-static {}, Lcom/google/common/collect/w;->v()Lcom/google/common/collect/w;

    move-result-object v0

    iput-object v0, p0, Lq8/y$a;->r:Lcom/google/common/collect/w;

    invoke-static {}, Lcom/google/common/collect/w;->v()Lcom/google/common/collect/w;

    move-result-object v0

    iput-object v0, p0, Lq8/y$a;->s:Lcom/google/common/collect/w;

    iput v1, p0, Lq8/y$a;->t:I

    iput v1, p0, Lq8/y$a;->u:I

    iput-boolean v1, p0, Lq8/y$a;->v:Z

    iput-boolean v1, p0, Lq8/y$a;->w:Z

    iput-boolean v1, p0, Lq8/y$a;->x:Z

    new-instance v0, Ljava/util/HashMap;

    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    iput-object v0, p0, Lq8/y$a;->y:Ljava/util/HashMap;

    new-instance v0, Ljava/util/HashSet;

    invoke-direct {v0}, Ljava/util/HashSet;-><init>()V

    iput-object v0, p0, Lq8/y$a;->z:Ljava/util/HashSet;

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;)V
    .locals 1

    invoke-direct {p0}, Lq8/y$a;-><init>()V

    invoke-virtual {p0, p1}, Lq8/y$a;->E(Landroid/content/Context;)Lq8/y$a;

    const/4 v0, 0x1

    invoke-virtual {p0, p1, v0}, Lq8/y$a;->H(Landroid/content/Context;Z)Lq8/y$a;

    return-void
.end method

.method protected constructor <init>(Landroid/os/Bundle;)V
    .locals 6

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    invoke-static {}, Lq8/y;->b()Ljava/lang/String;

    move-result-object v0

    sget-object v1, Lq8/y;->L:Lq8/y;

    iget v2, v1, Lq8/y;->a:I

    invoke-virtual {p1, v0, v2}, Landroid/os/BaseBundle;->getInt(Ljava/lang/String;I)I

    move-result v0

    iput v0, p0, Lq8/y$a;->a:I

    invoke-static {}, Lq8/y;->c()Ljava/lang/String;

    move-result-object v0

    iget v2, v1, Lq8/y;->b:I

    invoke-virtual {p1, v0, v2}, Landroid/os/BaseBundle;->getInt(Ljava/lang/String;I)I

    move-result v0

    iput v0, p0, Lq8/y$a;->b:I

    invoke-static {}, Lq8/y;->n()Ljava/lang/String;

    move-result-object v0

    iget v2, v1, Lq8/y;->c:I

    invoke-virtual {p1, v0, v2}, Landroid/os/BaseBundle;->getInt(Ljava/lang/String;I)I

    move-result v0

    iput v0, p0, Lq8/y$a;->c:I

    invoke-static {}, Lq8/y;->u()Ljava/lang/String;

    move-result-object v0

    iget v2, v1, Lq8/y;->d:I

    invoke-virtual {p1, v0, v2}, Landroid/os/BaseBundle;->getInt(Ljava/lang/String;I)I

    move-result v0

    iput v0, p0, Lq8/y$a;->d:I

    invoke-static {}, Lq8/y;->v()Ljava/lang/String;

    move-result-object v0

    iget v2, v1, Lq8/y;->e:I

    invoke-virtual {p1, v0, v2}, Landroid/os/BaseBundle;->getInt(Ljava/lang/String;I)I

    move-result v0

    iput v0, p0, Lq8/y$a;->e:I

    invoke-static {}, Lq8/y;->w()Ljava/lang/String;

    move-result-object v0

    iget v2, v1, Lq8/y;->f:I

    invoke-virtual {p1, v0, v2}, Landroid/os/BaseBundle;->getInt(Ljava/lang/String;I)I

    move-result v0

    iput v0, p0, Lq8/y$a;->f:I

    invoke-static {}, Lq8/y;->x()Ljava/lang/String;

    move-result-object v0

    iget v2, v1, Lq8/y;->r:I

    invoke-virtual {p1, v0, v2}, Landroid/os/BaseBundle;->getInt(Ljava/lang/String;I)I

    move-result v0

    iput v0, p0, Lq8/y$a;->g:I

    invoke-static {}, Lq8/y;->y()Ljava/lang/String;

    move-result-object v0

    iget v2, v1, Lq8/y;->s:I

    invoke-virtual {p1, v0, v2}, Landroid/os/BaseBundle;->getInt(Ljava/lang/String;I)I

    move-result v0

    iput v0, p0, Lq8/y$a;->h:I

    invoke-static {}, Lq8/y;->z()Ljava/lang/String;

    move-result-object v0

    iget v2, v1, Lq8/y;->t:I

    invoke-virtual {p1, v0, v2}, Landroid/os/BaseBundle;->getInt(Ljava/lang/String;I)I

    move-result v0

    iput v0, p0, Lq8/y$a;->i:I

    invoke-static {}, Lq8/y;->A()Ljava/lang/String;

    move-result-object v0

    iget v2, v1, Lq8/y;->u:I

    invoke-virtual {p1, v0, v2}, Landroid/os/BaseBundle;->getInt(Ljava/lang/String;I)I

    move-result v0

    iput v0, p0, Lq8/y$a;->j:I

    invoke-static {}, Lq8/y;->d()Ljava/lang/String;

    move-result-object v0

    iget-boolean v2, v1, Lq8/y;->v:Z

    invoke-virtual {p1, v0, v2}, Landroid/os/BaseBundle;->getBoolean(Ljava/lang/String;Z)Z

    move-result v0

    iput-boolean v0, p0, Lq8/y$a;->k:Z

    invoke-static {}, Lq8/y;->e()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p1, v0}, Landroid/os/BaseBundle;->getStringArray(Ljava/lang/String;)[Ljava/lang/String;

    move-result-object v0

    const/4 v2, 0x0

    new-array v3, v2, [Ljava/lang/String;

    invoke-static {v0, v3}, Leb/i;->a(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Ljava/lang/String;

    invoke-static {v0}, Lcom/google/common/collect/w;->s([Ljava/lang/Object;)Lcom/google/common/collect/w;

    move-result-object v0

    iput-object v0, p0, Lq8/y$a;->l:Lcom/google/common/collect/w;

    invoke-static {}, Lq8/y;->f()Ljava/lang/String;

    move-result-object v0

    iget v3, v1, Lq8/y;->x:I

    invoke-virtual {p1, v0, v3}, Landroid/os/BaseBundle;->getInt(Ljava/lang/String;I)I

    move-result v0

    iput v0, p0, Lq8/y$a;->m:I

    invoke-static {}, Lq8/y;->g()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p1, v0}, Landroid/os/BaseBundle;->getStringArray(Ljava/lang/String;)[Ljava/lang/String;

    move-result-object v0

    new-array v3, v2, [Ljava/lang/String;

    invoke-static {v0, v3}, Leb/i;->a(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Ljava/lang/String;

    invoke-static {v0}, Lq8/y$a;->C([Ljava/lang/String;)Lcom/google/common/collect/w;

    move-result-object v0

    iput-object v0, p0, Lq8/y$a;->n:Lcom/google/common/collect/w;

    invoke-static {}, Lq8/y;->h()Ljava/lang/String;

    move-result-object v0

    iget v3, v1, Lq8/y;->z:I

    invoke-virtual {p1, v0, v3}, Landroid/os/BaseBundle;->getInt(Ljava/lang/String;I)I

    move-result v0

    iput v0, p0, Lq8/y$a;->o:I

    invoke-static {}, Lq8/y;->i()Ljava/lang/String;

    move-result-object v0

    iget v3, v1, Lq8/y;->A:I

    invoke-virtual {p1, v0, v3}, Landroid/os/BaseBundle;->getInt(Ljava/lang/String;I)I

    move-result v0

    iput v0, p0, Lq8/y$a;->p:I

    invoke-static {}, Lq8/y;->j()Ljava/lang/String;

    move-result-object v0

    iget v3, v1, Lq8/y;->B:I

    invoke-virtual {p1, v0, v3}, Landroid/os/BaseBundle;->getInt(Ljava/lang/String;I)I

    move-result v0

    iput v0, p0, Lq8/y$a;->q:I

    invoke-static {}, Lq8/y;->k()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p1, v0}, Landroid/os/BaseBundle;->getStringArray(Ljava/lang/String;)[Ljava/lang/String;

    move-result-object v0

    new-array v3, v2, [Ljava/lang/String;

    invoke-static {v0, v3}, Leb/i;->a(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Ljava/lang/String;

    invoke-static {v0}, Lcom/google/common/collect/w;->s([Ljava/lang/Object;)Lcom/google/common/collect/w;

    move-result-object v0

    iput-object v0, p0, Lq8/y$a;->r:Lcom/google/common/collect/w;

    invoke-static {}, Lq8/y;->l()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p1, v0}, Landroid/os/BaseBundle;->getStringArray(Ljava/lang/String;)[Ljava/lang/String;

    move-result-object v0

    new-array v3, v2, [Ljava/lang/String;

    invoke-static {v0, v3}, Leb/i;->a(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Ljava/lang/String;

    invoke-static {v0}, Lq8/y$a;->C([Ljava/lang/String;)Lcom/google/common/collect/w;

    move-result-object v0

    iput-object v0, p0, Lq8/y$a;->s:Lcom/google/common/collect/w;

    invoke-static {}, Lq8/y;->m()Ljava/lang/String;

    move-result-object v0

    iget v3, v1, Lq8/y;->E:I

    invoke-virtual {p1, v0, v3}, Landroid/os/BaseBundle;->getInt(Ljava/lang/String;I)I

    move-result v0

    iput v0, p0, Lq8/y$a;->t:I

    invoke-static {}, Lq8/y;->o()Ljava/lang/String;

    move-result-object v0

    iget v3, v1, Lq8/y;->F:I

    invoke-virtual {p1, v0, v3}, Landroid/os/BaseBundle;->getInt(Ljava/lang/String;I)I

    move-result v0

    iput v0, p0, Lq8/y$a;->u:I

    invoke-static {}, Lq8/y;->p()Ljava/lang/String;

    move-result-object v0

    iget-boolean v3, v1, Lq8/y;->G:Z

    invoke-virtual {p1, v0, v3}, Landroid/os/BaseBundle;->getBoolean(Ljava/lang/String;Z)Z

    move-result v0

    iput-boolean v0, p0, Lq8/y$a;->v:Z

    invoke-static {}, Lq8/y;->q()Ljava/lang/String;

    move-result-object v0

    iget-boolean v3, v1, Lq8/y;->H:Z

    invoke-virtual {p1, v0, v3}, Landroid/os/BaseBundle;->getBoolean(Ljava/lang/String;Z)Z

    move-result v0

    iput-boolean v0, p0, Lq8/y$a;->w:Z

    invoke-static {}, Lq8/y;->r()Ljava/lang/String;

    move-result-object v0

    iget-boolean v1, v1, Lq8/y;->I:Z

    invoke-virtual {p1, v0, v1}, Landroid/os/BaseBundle;->getBoolean(Ljava/lang/String;Z)Z

    move-result v0

    iput-boolean v0, p0, Lq8/y$a;->x:Z

    invoke-static {}, Lq8/y;->s()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p1, v0}, Landroid/os/Bundle;->getParcelableArrayList(Ljava/lang/String;)Ljava/util/ArrayList;

    move-result-object v0

    if-nez v0, :cond_0

    invoke-static {}, Lcom/google/common/collect/w;->v()Lcom/google/common/collect/w;

    move-result-object v0

    goto :goto_0

    :cond_0
    sget-object v1, Lq8/w;->e:Lt6/o$a;

    invoke-static {v1, v0}, Lt8/c;->b(Lt6/o$a;Ljava/util/List;)Lcom/google/common/collect/w;

    move-result-object v0

    :goto_0
    new-instance v1, Ljava/util/HashMap;

    invoke-direct {v1}, Ljava/util/HashMap;-><init>()V

    iput-object v1, p0, Lq8/y$a;->y:Ljava/util/HashMap;

    move v1, v2

    :goto_1
    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v3

    if-ge v1, v3, :cond_1

    invoke-interface {v0, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Lq8/w;

    iget-object v4, p0, Lq8/y$a;->y:Ljava/util/HashMap;

    iget-object v5, v3, Lq8/w;->a:Lv7/d1;

    invoke-virtual {v4, v5, v3}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    add-int/lit8 v1, v1, 0x1

    goto :goto_1

    :cond_1
    invoke-static {}, Lq8/y;->t()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p1, v0}, Landroid/os/BaseBundle;->getIntArray(Ljava/lang/String;)[I

    move-result-object p1

    new-array v0, v2, [I

    invoke-static {p1, v0}, Leb/i;->a(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, [I

    new-instance v0, Ljava/util/HashSet;

    invoke-direct {v0}, Ljava/util/HashSet;-><init>()V

    iput-object v0, p0, Lq8/y$a;->z:Ljava/util/HashSet;

    array-length v0, p1

    :goto_2
    if-ge v2, v0, :cond_2

    aget v1, p1, v2

    iget-object v3, p0, Lq8/y$a;->z:Ljava/util/HashSet;

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    invoke-virtual {v3, v1}, Ljava/util/HashSet;->add(Ljava/lang/Object;)Z

    add-int/lit8 v2, v2, 0x1

    goto :goto_2

    :cond_2
    return-void
.end method

.method protected constructor <init>(Lq8/y;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    invoke-direct {p0, p1}, Lq8/y$a;->B(Lq8/y;)V

    return-void
.end method

.method private B(Lq8/y;)V
    .locals 2

    iget v0, p1, Lq8/y;->a:I

    iput v0, p0, Lq8/y$a;->a:I

    iget v0, p1, Lq8/y;->b:I

    iput v0, p0, Lq8/y$a;->b:I

    iget v0, p1, Lq8/y;->c:I

    iput v0, p0, Lq8/y$a;->c:I

    iget v0, p1, Lq8/y;->d:I

    iput v0, p0, Lq8/y$a;->d:I

    iget v0, p1, Lq8/y;->e:I

    iput v0, p0, Lq8/y$a;->e:I

    iget v0, p1, Lq8/y;->f:I

    iput v0, p0, Lq8/y$a;->f:I

    iget v0, p1, Lq8/y;->r:I

    iput v0, p0, Lq8/y$a;->g:I

    iget v0, p1, Lq8/y;->s:I

    iput v0, p0, Lq8/y$a;->h:I

    iget v0, p1, Lq8/y;->t:I

    iput v0, p0, Lq8/y$a;->i:I

    iget v0, p1, Lq8/y;->u:I

    iput v0, p0, Lq8/y$a;->j:I

    iget-boolean v0, p1, Lq8/y;->v:Z

    iput-boolean v0, p0, Lq8/y$a;->k:Z

    iget-object v0, p1, Lq8/y;->w:Lcom/google/common/collect/w;

    iput-object v0, p0, Lq8/y$a;->l:Lcom/google/common/collect/w;

    iget v0, p1, Lq8/y;->x:I

    iput v0, p0, Lq8/y$a;->m:I

    iget-object v0, p1, Lq8/y;->y:Lcom/google/common/collect/w;

    iput-object v0, p0, Lq8/y$a;->n:Lcom/google/common/collect/w;

    iget v0, p1, Lq8/y;->z:I

    iput v0, p0, Lq8/y$a;->o:I

    iget v0, p1, Lq8/y;->A:I

    iput v0, p0, Lq8/y$a;->p:I

    iget v0, p1, Lq8/y;->B:I

    iput v0, p0, Lq8/y$a;->q:I

    iget-object v0, p1, Lq8/y;->C:Lcom/google/common/collect/w;

    iput-object v0, p0, Lq8/y$a;->r:Lcom/google/common/collect/w;

    iget-object v0, p1, Lq8/y;->D:Lcom/google/common/collect/w;

    iput-object v0, p0, Lq8/y$a;->s:Lcom/google/common/collect/w;

    iget v0, p1, Lq8/y;->E:I

    iput v0, p0, Lq8/y$a;->t:I

    iget v0, p1, Lq8/y;->F:I

    iput v0, p0, Lq8/y$a;->u:I

    iget-boolean v0, p1, Lq8/y;->G:Z

    iput-boolean v0, p0, Lq8/y$a;->v:Z

    iget-boolean v0, p1, Lq8/y;->H:Z

    iput-boolean v0, p0, Lq8/y$a;->w:Z

    iget-boolean v0, p1, Lq8/y;->I:Z

    iput-boolean v0, p0, Lq8/y$a;->x:Z

    new-instance v0, Ljava/util/HashSet;

    iget-object v1, p1, Lq8/y;->K:Lcom/google/common/collect/a0;

    invoke-direct {v0, v1}, Ljava/util/HashSet;-><init>(Ljava/util/Collection;)V

    iput-object v0, p0, Lq8/y$a;->z:Ljava/util/HashSet;

    new-instance v0, Ljava/util/HashMap;

    iget-object p1, p1, Lq8/y;->J:Lcom/google/common/collect/y;

    invoke-direct {v0, p1}, Ljava/util/HashMap;-><init>(Ljava/util/Map;)V

    iput-object v0, p0, Lq8/y$a;->y:Ljava/util/HashMap;

    return-void
.end method

.method private static C([Ljava/lang/String;)Lcom/google/common/collect/w;
    .locals 4
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "([",
            "Ljava/lang/String;",
            ")",
            "Lcom/google/common/collect/w<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation

    invoke-static {}, Lcom/google/common/collect/w;->p()Lcom/google/common/collect/w$a;

    move-result-object v0

    invoke-static {p0}, Lt8/a;->e(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p0

    check-cast p0, [Ljava/lang/String;

    array-length v1, p0

    const/4 v2, 0x0

    :goto_0
    if-ge v2, v1, :cond_0

    aget-object v3, p0, v2

    invoke-static {v3}, Lt8/a;->e(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ljava/lang/String;

    invoke-static {v3}, Lt8/r0;->E0(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v0, v3}, Lcom/google/common/collect/w$a;->h(Ljava/lang/Object;)Lcom/google/common/collect/w$a;

    add-int/lit8 v2, v2, 0x1

    goto :goto_0

    :cond_0
    invoke-virtual {v0}, Lcom/google/common/collect/w$a;->k()Lcom/google/common/collect/w;

    move-result-object p0

    return-object p0
.end method

.method private F(Landroid/content/Context;)V
    .locals 2

    sget v0, Lt8/r0;->a:I

    const/16 v1, 0x17

    if-ge v0, v1, :cond_0

    invoke-static {}, Landroid/os/Looper;->myLooper()Landroid/os/Looper;

    move-result-object v0

    if-nez v0, :cond_0

    return-void

    :cond_0
    const-string v0, "captioning"

    invoke-virtual {p1, v0}, Landroid/content/Context;->getSystemService(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Landroid/view/accessibility/CaptioningManager;

    if-eqz p1, :cond_2

    invoke-virtual {p1}, Landroid/view/accessibility/CaptioningManager;->isEnabled()Z

    move-result v0

    if-nez v0, :cond_1

    goto :goto_0

    :cond_1
    const/16 v0, 0x440

    iput v0, p0, Lq8/y$a;->t:I

    invoke-virtual {p1}, Landroid/view/accessibility/CaptioningManager;->getLocale()Ljava/util/Locale;

    move-result-object p1

    if-eqz p1, :cond_2

    invoke-static {p1}, Lt8/r0;->Y(Ljava/util/Locale;)Ljava/lang/String;

    move-result-object p1

    invoke-static {p1}, Lcom/google/common/collect/w;->w(Ljava/lang/Object;)Lcom/google/common/collect/w;

    move-result-object p1

    iput-object p1, p0, Lq8/y$a;->s:Lcom/google/common/collect/w;

    :cond_2
    :goto_0
    return-void
.end method

.method static synthetic a(Lq8/y$a;)I
    .locals 0

    iget p0, p0, Lq8/y$a;->a:I

    return p0
.end method

.method static synthetic b(Lq8/y$a;)I
    .locals 0

    iget p0, p0, Lq8/y$a;->b:I

    return p0
.end method

.method static synthetic c(Lq8/y$a;)I
    .locals 0

    iget p0, p0, Lq8/y$a;->c:I

    return p0
.end method

.method static synthetic d(Lq8/y$a;)I
    .locals 0

    iget p0, p0, Lq8/y$a;->d:I

    return p0
.end method

.method static synthetic e(Lq8/y$a;)I
    .locals 0

    iget p0, p0, Lq8/y$a;->e:I

    return p0
.end method

.method static synthetic f(Lq8/y$a;)I
    .locals 0

    iget p0, p0, Lq8/y$a;->f:I

    return p0
.end method

.method static synthetic g(Lq8/y$a;)I
    .locals 0

    iget p0, p0, Lq8/y$a;->g:I

    return p0
.end method

.method static synthetic h(Lq8/y$a;)I
    .locals 0

    iget p0, p0, Lq8/y$a;->h:I

    return p0
.end method

.method static synthetic i(Lq8/y$a;)I
    .locals 0

    iget p0, p0, Lq8/y$a;->i:I

    return p0
.end method

.method static synthetic j(Lq8/y$a;)I
    .locals 0

    iget p0, p0, Lq8/y$a;->j:I

    return p0
.end method

.method static synthetic k(Lq8/y$a;)Z
    .locals 0

    iget-boolean p0, p0, Lq8/y$a;->k:Z

    return p0
.end method

.method static synthetic l(Lq8/y$a;)Lcom/google/common/collect/w;
    .locals 0

    iget-object p0, p0, Lq8/y$a;->l:Lcom/google/common/collect/w;

    return-object p0
.end method

.method static synthetic m(Lq8/y$a;)I
    .locals 0

    iget p0, p0, Lq8/y$a;->m:I

    return p0
.end method

.method static synthetic n(Lq8/y$a;)Lcom/google/common/collect/w;
    .locals 0

    iget-object p0, p0, Lq8/y$a;->n:Lcom/google/common/collect/w;

    return-object p0
.end method

.method static synthetic o(Lq8/y$a;)I
    .locals 0

    iget p0, p0, Lq8/y$a;->o:I

    return p0
.end method

.method static synthetic p(Lq8/y$a;)I
    .locals 0

    iget p0, p0, Lq8/y$a;->p:I

    return p0
.end method

.method static synthetic q(Lq8/y$a;)I
    .locals 0

    iget p0, p0, Lq8/y$a;->q:I

    return p0
.end method

.method static synthetic r(Lq8/y$a;)Lcom/google/common/collect/w;
    .locals 0

    iget-object p0, p0, Lq8/y$a;->r:Lcom/google/common/collect/w;

    return-object p0
.end method

.method static synthetic s(Lq8/y$a;)Lcom/google/common/collect/w;
    .locals 0

    iget-object p0, p0, Lq8/y$a;->s:Lcom/google/common/collect/w;

    return-object p0
.end method

.method static synthetic t(Lq8/y$a;)I
    .locals 0

    iget p0, p0, Lq8/y$a;->t:I

    return p0
.end method

.method static synthetic u(Lq8/y$a;)I
    .locals 0

    iget p0, p0, Lq8/y$a;->u:I

    return p0
.end method

.method static synthetic v(Lq8/y$a;)Z
    .locals 0

    iget-boolean p0, p0, Lq8/y$a;->v:Z

    return p0
.end method

.method static synthetic w(Lq8/y$a;)Z
    .locals 0

    iget-boolean p0, p0, Lq8/y$a;->w:Z

    return p0
.end method

.method static synthetic x(Lq8/y$a;)Z
    .locals 0

    iget-boolean p0, p0, Lq8/y$a;->x:Z

    return p0
.end method

.method static synthetic y(Lq8/y$a;)Ljava/util/HashMap;
    .locals 0

    iget-object p0, p0, Lq8/y$a;->y:Ljava/util/HashMap;

    return-object p0
.end method

.method static synthetic z(Lq8/y$a;)Ljava/util/HashSet;
    .locals 0

    iget-object p0, p0, Lq8/y$a;->z:Ljava/util/HashSet;

    return-object p0
.end method


# virtual methods
.method public A()Lq8/y;
    .locals 1

    new-instance v0, Lq8/y;

    invoke-direct {v0, p0}, Lq8/y;-><init>(Lq8/y$a;)V

    return-object v0
.end method

.method protected D(Lq8/y;)Lq8/y$a;
    .locals 0

    invoke-direct {p0, p1}, Lq8/y$a;->B(Lq8/y;)V

    return-object p0
.end method

.method public E(Landroid/content/Context;)Lq8/y$a;
    .locals 2

    sget v0, Lt8/r0;->a:I

    const/16 v1, 0x13

    if-lt v0, v1, :cond_0

    invoke-direct {p0, p1}, Lq8/y$a;->F(Landroid/content/Context;)V

    :cond_0
    return-object p0
.end method

.method public G(IIZ)Lq8/y$a;
    .locals 0

    iput p1, p0, Lq8/y$a;->i:I

    iput p2, p0, Lq8/y$a;->j:I

    iput-boolean p3, p0, Lq8/y$a;->k:Z

    return-object p0
.end method

.method public H(Landroid/content/Context;Z)Lq8/y$a;
    .locals 1

    invoke-static {p1}, Lt8/r0;->O(Landroid/content/Context;)Landroid/graphics/Point;

    move-result-object p1

    iget v0, p1, Landroid/graphics/Point;->x:I

    iget p1, p1, Landroid/graphics/Point;->y:I

    invoke-virtual {p0, v0, p1, p2}, Lq8/y$a;->G(IIZ)Lq8/y$a;

    move-result-object p1

    return-object p1
.end method

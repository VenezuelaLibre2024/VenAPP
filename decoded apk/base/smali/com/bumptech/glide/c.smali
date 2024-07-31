.class public final Lcom/bumptech/glide/c;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/bumptech/glide/c$c;,
        Lcom/bumptech/glide/c$b;,
        Lcom/bumptech/glide/c$d;
    }
.end annotation


# instance fields
.field private final a:Ljava/util/Map;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Map<",
            "Ljava/lang/Class<",
            "*>;",
            "Lcom/bumptech/glide/l<",
            "**>;>;"
        }
    .end annotation
.end field

.field private final b:Lcom/bumptech/glide/e$a;

.field private c:Lj3/k;

.field private d:Lk3/d;

.field private e:Lk3/b;

.field private f:Ll3/h;

.field private g:Lm3/a;

.field private h:Lm3/a;

.field private i:Ll3/a$a;

.field private j:Ll3/i;

.field private k:Lcom/bumptech/glide/manager/d;

.field private l:I

.field private m:Lcom/bumptech/glide/b$a;

.field private n:Lcom/bumptech/glide/manager/q$b;

.field private o:Lm3/a;

.field private p:Z

.field private q:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Ly3/h<",
            "Ljava/lang/Object;",
            ">;>;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>()V
    .locals 1

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    new-instance v0, Landroidx/collection/a;

    invoke-direct {v0}, Landroidx/collection/a;-><init>()V

    iput-object v0, p0, Lcom/bumptech/glide/c;->a:Ljava/util/Map;

    new-instance v0, Lcom/bumptech/glide/e$a;

    invoke-direct {v0}, Lcom/bumptech/glide/e$a;-><init>()V

    iput-object v0, p0, Lcom/bumptech/glide/c;->b:Lcom/bumptech/glide/e$a;

    const/4 v0, 0x4

    iput v0, p0, Lcom/bumptech/glide/c;->l:I

    new-instance v0, Lcom/bumptech/glide/c$a;

    invoke-direct {v0, p0}, Lcom/bumptech/glide/c$a;-><init>(Lcom/bumptech/glide/c;)V

    iput-object v0, p0, Lcom/bumptech/glide/c;->m:Lcom/bumptech/glide/b$a;

    return-void
.end method


# virtual methods
.method a(Landroid/content/Context;Ljava/util/List;Lw3/a;)Lcom/bumptech/glide/b;
    .locals 17
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroid/content/Context;",
            "Ljava/util/List<",
            "Lw3/b;",
            ">;",
            "Lw3/a;",
            ")",
            "Lcom/bumptech/glide/b;"
        }
    .end annotation

    move-object/from16 v0, p0

    move-object/from16 v2, p1

    iget-object v1, v0, Lcom/bumptech/glide/c;->g:Lm3/a;

    if-nez v1, :cond_0

    invoke-static {}, Lm3/a;->h()Lm3/a;

    move-result-object v1

    iput-object v1, v0, Lcom/bumptech/glide/c;->g:Lm3/a;

    :cond_0
    iget-object v1, v0, Lcom/bumptech/glide/c;->h:Lm3/a;

    if-nez v1, :cond_1

    invoke-static {}, Lm3/a;->f()Lm3/a;

    move-result-object v1

    iput-object v1, v0, Lcom/bumptech/glide/c;->h:Lm3/a;

    :cond_1
    iget-object v1, v0, Lcom/bumptech/glide/c;->o:Lm3/a;

    if-nez v1, :cond_2

    invoke-static {}, Lm3/a;->d()Lm3/a;

    move-result-object v1

    iput-object v1, v0, Lcom/bumptech/glide/c;->o:Lm3/a;

    :cond_2
    iget-object v1, v0, Lcom/bumptech/glide/c;->j:Ll3/i;

    if-nez v1, :cond_3

    new-instance v1, Ll3/i$a;

    invoke-direct {v1, v2}, Ll3/i$a;-><init>(Landroid/content/Context;)V

    invoke-virtual {v1}, Ll3/i$a;->a()Ll3/i;

    move-result-object v1

    iput-object v1, v0, Lcom/bumptech/glide/c;->j:Ll3/i;

    :cond_3
    iget-object v1, v0, Lcom/bumptech/glide/c;->k:Lcom/bumptech/glide/manager/d;

    if-nez v1, :cond_4

    new-instance v1, Lcom/bumptech/glide/manager/f;

    invoke-direct {v1}, Lcom/bumptech/glide/manager/f;-><init>()V

    iput-object v1, v0, Lcom/bumptech/glide/c;->k:Lcom/bumptech/glide/manager/d;

    :cond_4
    iget-object v1, v0, Lcom/bumptech/glide/c;->d:Lk3/d;

    if-nez v1, :cond_6

    iget-object v1, v0, Lcom/bumptech/glide/c;->j:Ll3/i;

    invoke-virtual {v1}, Ll3/i;->b()I

    move-result v1

    if-lez v1, :cond_5

    new-instance v3, Lk3/k;

    int-to-long v4, v1

    invoke-direct {v3, v4, v5}, Lk3/k;-><init>(J)V

    iput-object v3, v0, Lcom/bumptech/glide/c;->d:Lk3/d;

    goto :goto_0

    :cond_5
    new-instance v1, Lk3/e;

    invoke-direct {v1}, Lk3/e;-><init>()V

    iput-object v1, v0, Lcom/bumptech/glide/c;->d:Lk3/d;

    :cond_6
    :goto_0
    iget-object v1, v0, Lcom/bumptech/glide/c;->e:Lk3/b;

    if-nez v1, :cond_7

    new-instance v1, Lk3/i;

    iget-object v3, v0, Lcom/bumptech/glide/c;->j:Ll3/i;

    invoke-virtual {v3}, Ll3/i;->a()I

    move-result v3

    invoke-direct {v1, v3}, Lk3/i;-><init>(I)V

    iput-object v1, v0, Lcom/bumptech/glide/c;->e:Lk3/b;

    :cond_7
    iget-object v1, v0, Lcom/bumptech/glide/c;->f:Ll3/h;

    if-nez v1, :cond_8

    new-instance v1, Ll3/g;

    iget-object v3, v0, Lcom/bumptech/glide/c;->j:Ll3/i;

    invoke-virtual {v3}, Ll3/i;->d()I

    move-result v3

    int-to-long v3, v3

    invoke-direct {v1, v3, v4}, Ll3/g;-><init>(J)V

    iput-object v1, v0, Lcom/bumptech/glide/c;->f:Ll3/h;

    :cond_8
    iget-object v1, v0, Lcom/bumptech/glide/c;->i:Ll3/a$a;

    if-nez v1, :cond_9

    new-instance v1, Ll3/f;

    invoke-direct {v1, v2}, Ll3/f;-><init>(Landroid/content/Context;)V

    iput-object v1, v0, Lcom/bumptech/glide/c;->i:Ll3/a$a;

    :cond_9
    iget-object v1, v0, Lcom/bumptech/glide/c;->c:Lj3/k;

    if-nez v1, :cond_a

    new-instance v1, Lj3/k;

    iget-object v4, v0, Lcom/bumptech/glide/c;->f:Ll3/h;

    iget-object v5, v0, Lcom/bumptech/glide/c;->i:Ll3/a$a;

    iget-object v6, v0, Lcom/bumptech/glide/c;->h:Lm3/a;

    iget-object v7, v0, Lcom/bumptech/glide/c;->g:Lm3/a;

    invoke-static {}, Lm3/a;->i()Lm3/a;

    move-result-object v8

    iget-object v9, v0, Lcom/bumptech/glide/c;->o:Lm3/a;

    iget-boolean v10, v0, Lcom/bumptech/glide/c;->p:Z

    move-object v3, v1

    invoke-direct/range {v3 .. v10}, Lj3/k;-><init>(Ll3/h;Ll3/a$a;Lm3/a;Lm3/a;Lm3/a;Lm3/a;Z)V

    iput-object v1, v0, Lcom/bumptech/glide/c;->c:Lj3/k;

    :cond_a
    iget-object v1, v0, Lcom/bumptech/glide/c;->q:Ljava/util/List;

    if-nez v1, :cond_b

    invoke-static {}, Ljava/util/Collections;->emptyList()Ljava/util/List;

    move-result-object v1

    goto :goto_1

    :cond_b
    invoke-static {v1}, Ljava/util/Collections;->unmodifiableList(Ljava/util/List;)Ljava/util/List;

    move-result-object v1

    :goto_1
    iput-object v1, v0, Lcom/bumptech/glide/c;->q:Ljava/util/List;

    iget-object v1, v0, Lcom/bumptech/glide/c;->b:Lcom/bumptech/glide/e$a;

    invoke-virtual {v1}, Lcom/bumptech/glide/e$a;->b()Lcom/bumptech/glide/e;

    move-result-object v15

    new-instance v7, Lcom/bumptech/glide/manager/q;

    iget-object v1, v0, Lcom/bumptech/glide/c;->n:Lcom/bumptech/glide/manager/q$b;

    invoke-direct {v7, v1, v15}, Lcom/bumptech/glide/manager/q;-><init>(Lcom/bumptech/glide/manager/q$b;Lcom/bumptech/glide/e;)V

    new-instance v16, Lcom/bumptech/glide/b;

    iget-object v3, v0, Lcom/bumptech/glide/c;->c:Lj3/k;

    iget-object v4, v0, Lcom/bumptech/glide/c;->f:Ll3/h;

    iget-object v5, v0, Lcom/bumptech/glide/c;->d:Lk3/d;

    iget-object v6, v0, Lcom/bumptech/glide/c;->e:Lk3/b;

    iget-object v8, v0, Lcom/bumptech/glide/c;->k:Lcom/bumptech/glide/manager/d;

    iget v9, v0, Lcom/bumptech/glide/c;->l:I

    iget-object v10, v0, Lcom/bumptech/glide/c;->m:Lcom/bumptech/glide/b$a;

    iget-object v11, v0, Lcom/bumptech/glide/c;->a:Ljava/util/Map;

    iget-object v12, v0, Lcom/bumptech/glide/c;->q:Ljava/util/List;

    move-object/from16 v1, v16

    move-object/from16 v2, p1

    move-object/from16 v13, p2

    move-object/from16 v14, p3

    invoke-direct/range {v1 .. v15}, Lcom/bumptech/glide/b;-><init>(Landroid/content/Context;Lj3/k;Ll3/h;Lk3/d;Lk3/b;Lcom/bumptech/glide/manager/q;Lcom/bumptech/glide/manager/d;ILcom/bumptech/glide/b$a;Ljava/util/Map;Ljava/util/List;Ljava/util/List;Lw3/a;Lcom/bumptech/glide/e;)V

    return-object v16
.end method

.method b(Lcom/bumptech/glide/manager/q$b;)V
    .locals 0

    iput-object p1, p0, Lcom/bumptech/glide/c;->n:Lcom/bumptech/glide/manager/q$b;

    return-void
.end method

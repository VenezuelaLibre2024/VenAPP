.class public final Lt6/c2$c;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lt6/c2;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "c"
.end annotation


# instance fields
.field private a:Ljava/lang/String;

.field private b:Landroid/net/Uri;

.field private c:Ljava/lang/String;

.field private d:Lt6/c2$d$a;

.field private e:Lt6/c2$f$a;

.field private f:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Lu7/c;",
            ">;"
        }
    .end annotation
.end field

.field private g:Ljava/lang/String;

.field private h:Lcom/google/common/collect/w;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lcom/google/common/collect/w<",
            "Lt6/c2$l;",
            ">;"
        }
    .end annotation
.end field

.field private i:Ljava/lang/Object;

.field private j:Lt6/h2;

.field private k:Lt6/c2$g$a;

.field private l:Lt6/c2$j;


# direct methods
.method public constructor <init>()V
    .locals 2

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    new-instance v0, Lt6/c2$d$a;

    invoke-direct {v0}, Lt6/c2$d$a;-><init>()V

    iput-object v0, p0, Lt6/c2$c;->d:Lt6/c2$d$a;

    new-instance v0, Lt6/c2$f$a;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lt6/c2$f$a;-><init>(Lt6/c2$a;)V

    iput-object v0, p0, Lt6/c2$c;->e:Lt6/c2$f$a;

    invoke-static {}, Ljava/util/Collections;->emptyList()Ljava/util/List;

    move-result-object v0

    iput-object v0, p0, Lt6/c2$c;->f:Ljava/util/List;

    invoke-static {}, Lcom/google/common/collect/w;->v()Lcom/google/common/collect/w;

    move-result-object v0

    iput-object v0, p0, Lt6/c2$c;->h:Lcom/google/common/collect/w;

    new-instance v0, Lt6/c2$g$a;

    invoke-direct {v0}, Lt6/c2$g$a;-><init>()V

    iput-object v0, p0, Lt6/c2$c;->k:Lt6/c2$g$a;

    sget-object v0, Lt6/c2$j;->d:Lt6/c2$j;

    iput-object v0, p0, Lt6/c2$c;->l:Lt6/c2$j;

    return-void
.end method

.method private constructor <init>(Lt6/c2;)V
    .locals 1

    invoke-direct {p0}, Lt6/c2$c;-><init>()V

    iget-object v0, p1, Lt6/c2;->f:Lt6/c2$d;

    invoke-virtual {v0}, Lt6/c2$d;->c()Lt6/c2$d$a;

    move-result-object v0

    iput-object v0, p0, Lt6/c2$c;->d:Lt6/c2$d$a;

    iget-object v0, p1, Lt6/c2;->a:Ljava/lang/String;

    iput-object v0, p0, Lt6/c2$c;->a:Ljava/lang/String;

    iget-object v0, p1, Lt6/c2;->e:Lt6/h2;

    iput-object v0, p0, Lt6/c2$c;->j:Lt6/h2;

    iget-object v0, p1, Lt6/c2;->d:Lt6/c2$g;

    invoke-virtual {v0}, Lt6/c2$g;->c()Lt6/c2$g$a;

    move-result-object v0

    iput-object v0, p0, Lt6/c2$c;->k:Lt6/c2$g$a;

    iget-object v0, p1, Lt6/c2;->s:Lt6/c2$j;

    iput-object v0, p0, Lt6/c2$c;->l:Lt6/c2$j;

    iget-object p1, p1, Lt6/c2;->b:Lt6/c2$h;

    if-eqz p1, :cond_1

    iget-object v0, p1, Lt6/c2$h;->e:Ljava/lang/String;

    iput-object v0, p0, Lt6/c2$c;->g:Ljava/lang/String;

    iget-object v0, p1, Lt6/c2$h;->b:Ljava/lang/String;

    iput-object v0, p0, Lt6/c2$c;->c:Ljava/lang/String;

    iget-object v0, p1, Lt6/c2$h;->a:Landroid/net/Uri;

    iput-object v0, p0, Lt6/c2$c;->b:Landroid/net/Uri;

    iget-object v0, p1, Lt6/c2$h;->d:Ljava/util/List;

    iput-object v0, p0, Lt6/c2$c;->f:Ljava/util/List;

    iget-object v0, p1, Lt6/c2$h;->f:Lcom/google/common/collect/w;

    iput-object v0, p0, Lt6/c2$c;->h:Lcom/google/common/collect/w;

    iget-object v0, p1, Lt6/c2$h;->h:Ljava/lang/Object;

    iput-object v0, p0, Lt6/c2$c;->i:Ljava/lang/Object;

    iget-object p1, p1, Lt6/c2$h;->c:Lt6/c2$f;

    if-eqz p1, :cond_0

    invoke-virtual {p1}, Lt6/c2$f;->b()Lt6/c2$f$a;

    move-result-object p1

    goto :goto_0

    :cond_0
    new-instance p1, Lt6/c2$f$a;

    const/4 v0, 0x0

    invoke-direct {p1, v0}, Lt6/c2$f$a;-><init>(Lt6/c2$a;)V

    :goto_0
    iput-object p1, p0, Lt6/c2$c;->e:Lt6/c2$f$a;

    :cond_1
    return-void
.end method

.method synthetic constructor <init>(Lt6/c2;Lt6/c2$a;)V
    .locals 0

    invoke-direct {p0, p1}, Lt6/c2$c;-><init>(Lt6/c2;)V

    return-void
.end method


# virtual methods
.method public a()Lt6/c2;
    .locals 21

    move-object/from16 v0, p0

    iget-object v1, v0, Lt6/c2$c;->e:Lt6/c2$f$a;

    invoke-static {v1}, Lt6/c2$f$a;->e(Lt6/c2$f$a;)Landroid/net/Uri;

    move-result-object v1

    if-eqz v1, :cond_1

    iget-object v1, v0, Lt6/c2$c;->e:Lt6/c2$f$a;

    invoke-static {v1}, Lt6/c2$f$a;->f(Lt6/c2$f$a;)Ljava/util/UUID;

    move-result-object v1

    if-eqz v1, :cond_0

    goto :goto_0

    :cond_0
    const/4 v1, 0x0

    goto :goto_1

    :cond_1
    :goto_0
    const/4 v1, 0x1

    :goto_1
    invoke-static {v1}, Lt8/a;->g(Z)V

    iget-object v3, v0, Lt6/c2$c;->b:Landroid/net/Uri;

    const/4 v1, 0x0

    if-eqz v3, :cond_3

    new-instance v12, Lt6/c2$i;

    iget-object v4, v0, Lt6/c2$c;->c:Ljava/lang/String;

    iget-object v2, v0, Lt6/c2$c;->e:Lt6/c2$f$a;

    invoke-static {v2}, Lt6/c2$f$a;->f(Lt6/c2$f$a;)Ljava/util/UUID;

    move-result-object v2

    if-eqz v2, :cond_2

    iget-object v1, v0, Lt6/c2$c;->e:Lt6/c2$f$a;

    invoke-virtual {v1}, Lt6/c2$f$a;->i()Lt6/c2$f;

    move-result-object v1

    :cond_2
    move-object v5, v1

    const/4 v6, 0x0

    iget-object v7, v0, Lt6/c2$c;->f:Ljava/util/List;

    iget-object v8, v0, Lt6/c2$c;->g:Ljava/lang/String;

    iget-object v9, v0, Lt6/c2$c;->h:Lcom/google/common/collect/w;

    iget-object v10, v0, Lt6/c2$c;->i:Ljava/lang/Object;

    const/4 v11, 0x0

    move-object v2, v12

    invoke-direct/range {v2 .. v11}, Lt6/c2$i;-><init>(Landroid/net/Uri;Ljava/lang/String;Lt6/c2$f;Lt6/c2$b;Ljava/util/List;Ljava/lang/String;Lcom/google/common/collect/w;Ljava/lang/Object;Lt6/c2$a;)V

    move-object/from16 v16, v12

    goto :goto_2

    :cond_3
    move-object/from16 v16, v1

    :goto_2
    new-instance v1, Lt6/c2;

    iget-object v2, v0, Lt6/c2$c;->a:Ljava/lang/String;

    if-eqz v2, :cond_4

    goto :goto_3

    :cond_4
    const-string v2, ""

    :goto_3
    move-object v14, v2

    iget-object v2, v0, Lt6/c2$c;->d:Lt6/c2$d$a;

    invoke-virtual {v2}, Lt6/c2$d$a;->g()Lt6/c2$e;

    move-result-object v15

    iget-object v2, v0, Lt6/c2$c;->k:Lt6/c2$g$a;

    invoke-virtual {v2}, Lt6/c2$g$a;->f()Lt6/c2$g;

    move-result-object v17

    iget-object v2, v0, Lt6/c2$c;->j:Lt6/h2;

    if-eqz v2, :cond_5

    goto :goto_4

    :cond_5
    sget-object v2, Lt6/h2;->T:Lt6/h2;

    :goto_4
    move-object/from16 v18, v2

    iget-object v2, v0, Lt6/c2$c;->l:Lt6/c2$j;

    const/16 v20, 0x0

    move-object v13, v1

    move-object/from16 v19, v2

    invoke-direct/range {v13 .. v20}, Lt6/c2;-><init>(Ljava/lang/String;Lt6/c2$e;Lt6/c2$i;Lt6/c2$g;Lt6/h2;Lt6/c2$j;Lt6/c2$a;)V

    return-object v1
.end method

.method public b(Ljava/lang/String;)Lt6/c2$c;
    .locals 0

    iput-object p1, p0, Lt6/c2$c;->g:Ljava/lang/String;

    return-object p0
.end method

.method public c(Lt6/c2$g;)Lt6/c2$c;
    .locals 0

    invoke-virtual {p1}, Lt6/c2$g;->c()Lt6/c2$g$a;

    move-result-object p1

    iput-object p1, p0, Lt6/c2$c;->k:Lt6/c2$g$a;

    return-object p0
.end method

.method public d(Ljava/lang/String;)Lt6/c2$c;
    .locals 0

    invoke-static {p1}, Lt8/a;->e(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ljava/lang/String;

    iput-object p1, p0, Lt6/c2$c;->a:Ljava/lang/String;

    return-object p0
.end method

.method public e(Ljava/util/List;)Lt6/c2$c;
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Lt6/c2$l;",
            ">;)",
            "Lt6/c2$c;"
        }
    .end annotation

    invoke-static {p1}, Lcom/google/common/collect/w;->r(Ljava/util/Collection;)Lcom/google/common/collect/w;

    move-result-object p1

    iput-object p1, p0, Lt6/c2$c;->h:Lcom/google/common/collect/w;

    return-object p0
.end method

.method public f(Ljava/lang/Object;)Lt6/c2$c;
    .locals 0

    iput-object p1, p0, Lt6/c2$c;->i:Ljava/lang/Object;

    return-object p0
.end method

.method public g(Landroid/net/Uri;)Lt6/c2$c;
    .locals 0

    iput-object p1, p0, Lt6/c2$c;->b:Landroid/net/Uri;

    return-object p0
.end method

.method public h(Ljava/lang/String;)Lt6/c2$c;
    .locals 0

    if-nez p1, :cond_0

    const/4 p1, 0x0

    goto :goto_0

    :cond_0
    invoke-static {p1}, Landroid/net/Uri;->parse(Ljava/lang/String;)Landroid/net/Uri;

    move-result-object p1

    :goto_0
    invoke-virtual {p0, p1}, Lt6/c2$c;->g(Landroid/net/Uri;)Lt6/c2$c;

    move-result-object p1

    return-object p1
.end method

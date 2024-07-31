.class public Lcom/google/firebase/storage/o;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/google/firebase/storage/o$b;,
        Lcom/google/firebase/storage/o$c;
    }
.end annotation


# instance fields
.field private a:Ljava/lang/String;

.field private b:Lcom/google/firebase/storage/f;

.field private c:Lcom/google/firebase/storage/p;

.field private d:Ljava/lang/String;

.field private e:Ljava/lang/String;

.field private f:Lcom/google/firebase/storage/o$c;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lcom/google/firebase/storage/o$c<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation
.end field

.field private g:Ljava/lang/String;

.field private h:Ljava/lang/String;

.field private i:Ljava/lang/String;

.field private j:J

.field private k:Ljava/lang/String;

.field private l:Lcom/google/firebase/storage/o$c;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lcom/google/firebase/storage/o$c<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation
.end field

.field private m:Lcom/google/firebase/storage/o$c;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lcom/google/firebase/storage/o$c<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation
.end field

.field private n:Lcom/google/firebase/storage/o$c;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lcom/google/firebase/storage/o$c<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation
.end field

.field private o:Lcom/google/firebase/storage/o$c;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lcom/google/firebase/storage/o$c<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation
.end field

.field private p:Lcom/google/firebase/storage/o$c;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lcom/google/firebase/storage/o$c<",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            ">;>;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>()V
    .locals 3

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/4 v0, 0x0

    iput-object v0, p0, Lcom/google/firebase/storage/o;->a:Ljava/lang/String;

    iput-object v0, p0, Lcom/google/firebase/storage/o;->b:Lcom/google/firebase/storage/f;

    iput-object v0, p0, Lcom/google/firebase/storage/o;->c:Lcom/google/firebase/storage/p;

    iput-object v0, p0, Lcom/google/firebase/storage/o;->d:Ljava/lang/String;

    iput-object v0, p0, Lcom/google/firebase/storage/o;->e:Ljava/lang/String;

    const-string v1, ""

    invoke-static {v1}, Lcom/google/firebase/storage/o$c;->c(Ljava/lang/Object;)Lcom/google/firebase/storage/o$c;

    move-result-object v2

    iput-object v2, p0, Lcom/google/firebase/storage/o;->f:Lcom/google/firebase/storage/o$c;

    iput-object v0, p0, Lcom/google/firebase/storage/o;->g:Ljava/lang/String;

    iput-object v0, p0, Lcom/google/firebase/storage/o;->h:Ljava/lang/String;

    iput-object v0, p0, Lcom/google/firebase/storage/o;->i:Ljava/lang/String;

    iput-object v0, p0, Lcom/google/firebase/storage/o;->k:Ljava/lang/String;

    invoke-static {v1}, Lcom/google/firebase/storage/o$c;->c(Ljava/lang/Object;)Lcom/google/firebase/storage/o$c;

    move-result-object v0

    iput-object v0, p0, Lcom/google/firebase/storage/o;->l:Lcom/google/firebase/storage/o$c;

    invoke-static {v1}, Lcom/google/firebase/storage/o$c;->c(Ljava/lang/Object;)Lcom/google/firebase/storage/o$c;

    move-result-object v0

    iput-object v0, p0, Lcom/google/firebase/storage/o;->m:Lcom/google/firebase/storage/o$c;

    invoke-static {v1}, Lcom/google/firebase/storage/o$c;->c(Ljava/lang/Object;)Lcom/google/firebase/storage/o$c;

    move-result-object v0

    iput-object v0, p0, Lcom/google/firebase/storage/o;->n:Lcom/google/firebase/storage/o$c;

    invoke-static {v1}, Lcom/google/firebase/storage/o$c;->c(Ljava/lang/Object;)Lcom/google/firebase/storage/o$c;

    move-result-object v0

    iput-object v0, p0, Lcom/google/firebase/storage/o;->o:Lcom/google/firebase/storage/o$c;

    invoke-static {}, Ljava/util/Collections;->emptyMap()Ljava/util/Map;

    move-result-object v0

    invoke-static {v0}, Lcom/google/firebase/storage/o$c;->c(Ljava/lang/Object;)Lcom/google/firebase/storage/o$c;

    move-result-object v0

    iput-object v0, p0, Lcom/google/firebase/storage/o;->p:Lcom/google/firebase/storage/o$c;

    return-void
.end method

.method private constructor <init>(Lcom/google/firebase/storage/o;Z)V
    .locals 3

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/4 v0, 0x0

    iput-object v0, p0, Lcom/google/firebase/storage/o;->a:Ljava/lang/String;

    iput-object v0, p0, Lcom/google/firebase/storage/o;->b:Lcom/google/firebase/storage/f;

    iput-object v0, p0, Lcom/google/firebase/storage/o;->c:Lcom/google/firebase/storage/p;

    iput-object v0, p0, Lcom/google/firebase/storage/o;->d:Ljava/lang/String;

    iput-object v0, p0, Lcom/google/firebase/storage/o;->e:Ljava/lang/String;

    const-string v1, ""

    invoke-static {v1}, Lcom/google/firebase/storage/o$c;->c(Ljava/lang/Object;)Lcom/google/firebase/storage/o$c;

    move-result-object v2

    iput-object v2, p0, Lcom/google/firebase/storage/o;->f:Lcom/google/firebase/storage/o$c;

    iput-object v0, p0, Lcom/google/firebase/storage/o;->g:Ljava/lang/String;

    iput-object v0, p0, Lcom/google/firebase/storage/o;->h:Ljava/lang/String;

    iput-object v0, p0, Lcom/google/firebase/storage/o;->i:Ljava/lang/String;

    iput-object v0, p0, Lcom/google/firebase/storage/o;->k:Ljava/lang/String;

    invoke-static {v1}, Lcom/google/firebase/storage/o$c;->c(Ljava/lang/Object;)Lcom/google/firebase/storage/o$c;

    move-result-object v0

    iput-object v0, p0, Lcom/google/firebase/storage/o;->l:Lcom/google/firebase/storage/o$c;

    invoke-static {v1}, Lcom/google/firebase/storage/o$c;->c(Ljava/lang/Object;)Lcom/google/firebase/storage/o$c;

    move-result-object v0

    iput-object v0, p0, Lcom/google/firebase/storage/o;->m:Lcom/google/firebase/storage/o$c;

    invoke-static {v1}, Lcom/google/firebase/storage/o$c;->c(Ljava/lang/Object;)Lcom/google/firebase/storage/o$c;

    move-result-object v0

    iput-object v0, p0, Lcom/google/firebase/storage/o;->n:Lcom/google/firebase/storage/o$c;

    invoke-static {v1}, Lcom/google/firebase/storage/o$c;->c(Ljava/lang/Object;)Lcom/google/firebase/storage/o$c;

    move-result-object v0

    iput-object v0, p0, Lcom/google/firebase/storage/o;->o:Lcom/google/firebase/storage/o$c;

    invoke-static {}, Ljava/util/Collections;->emptyMap()Ljava/util/Map;

    move-result-object v0

    invoke-static {v0}, Lcom/google/firebase/storage/o$c;->c(Ljava/lang/Object;)Lcom/google/firebase/storage/o$c;

    move-result-object v0

    iput-object v0, p0, Lcom/google/firebase/storage/o;->p:Lcom/google/firebase/storage/o$c;

    invoke-static {p1}, Lcom/google/android/gms/common/internal/s;->j(Ljava/lang/Object;)Ljava/lang/Object;

    iget-object v0, p1, Lcom/google/firebase/storage/o;->a:Ljava/lang/String;

    iput-object v0, p0, Lcom/google/firebase/storage/o;->a:Ljava/lang/String;

    iget-object v0, p1, Lcom/google/firebase/storage/o;->b:Lcom/google/firebase/storage/f;

    iput-object v0, p0, Lcom/google/firebase/storage/o;->b:Lcom/google/firebase/storage/f;

    iget-object v0, p1, Lcom/google/firebase/storage/o;->c:Lcom/google/firebase/storage/p;

    iput-object v0, p0, Lcom/google/firebase/storage/o;->c:Lcom/google/firebase/storage/p;

    iget-object v0, p1, Lcom/google/firebase/storage/o;->d:Ljava/lang/String;

    iput-object v0, p0, Lcom/google/firebase/storage/o;->d:Ljava/lang/String;

    iget-object v0, p1, Lcom/google/firebase/storage/o;->f:Lcom/google/firebase/storage/o$c;

    iput-object v0, p0, Lcom/google/firebase/storage/o;->f:Lcom/google/firebase/storage/o$c;

    iget-object v0, p1, Lcom/google/firebase/storage/o;->l:Lcom/google/firebase/storage/o$c;

    iput-object v0, p0, Lcom/google/firebase/storage/o;->l:Lcom/google/firebase/storage/o$c;

    iget-object v0, p1, Lcom/google/firebase/storage/o;->m:Lcom/google/firebase/storage/o$c;

    iput-object v0, p0, Lcom/google/firebase/storage/o;->m:Lcom/google/firebase/storage/o$c;

    iget-object v0, p1, Lcom/google/firebase/storage/o;->n:Lcom/google/firebase/storage/o$c;

    iput-object v0, p0, Lcom/google/firebase/storage/o;->n:Lcom/google/firebase/storage/o$c;

    iget-object v0, p1, Lcom/google/firebase/storage/o;->o:Lcom/google/firebase/storage/o$c;

    iput-object v0, p0, Lcom/google/firebase/storage/o;->o:Lcom/google/firebase/storage/o$c;

    iget-object v0, p1, Lcom/google/firebase/storage/o;->p:Lcom/google/firebase/storage/o$c;

    iput-object v0, p0, Lcom/google/firebase/storage/o;->p:Lcom/google/firebase/storage/o$c;

    if-eqz p2, :cond_0

    iget-object p2, p1, Lcom/google/firebase/storage/o;->k:Ljava/lang/String;

    iput-object p2, p0, Lcom/google/firebase/storage/o;->k:Ljava/lang/String;

    iget-wide v0, p1, Lcom/google/firebase/storage/o;->j:J

    iput-wide v0, p0, Lcom/google/firebase/storage/o;->j:J

    iget-object p2, p1, Lcom/google/firebase/storage/o;->i:Ljava/lang/String;

    iput-object p2, p0, Lcom/google/firebase/storage/o;->i:Ljava/lang/String;

    iget-object p2, p1, Lcom/google/firebase/storage/o;->h:Ljava/lang/String;

    iput-object p2, p0, Lcom/google/firebase/storage/o;->h:Ljava/lang/String;

    iget-object p2, p1, Lcom/google/firebase/storage/o;->g:Ljava/lang/String;

    iput-object p2, p0, Lcom/google/firebase/storage/o;->g:Ljava/lang/String;

    iget-object p1, p1, Lcom/google/firebase/storage/o;->e:Ljava/lang/String;

    iput-object p1, p0, Lcom/google/firebase/storage/o;->e:Ljava/lang/String;

    :cond_0
    return-void
.end method

.method synthetic constructor <init>(Lcom/google/firebase/storage/o;ZLcom/google/firebase/storage/o$a;)V
    .locals 0

    invoke-direct {p0, p1, p2}, Lcom/google/firebase/storage/o;-><init>(Lcom/google/firebase/storage/o;Z)V

    return-void
.end method

.method static synthetic a(Lcom/google/firebase/storage/o;Lcom/google/firebase/storage/o$c;)Lcom/google/firebase/storage/o$c;
    .locals 0

    iput-object p1, p0, Lcom/google/firebase/storage/o;->o:Lcom/google/firebase/storage/o$c;

    return-object p1
.end method

.method static synthetic b(Lcom/google/firebase/storage/o;Lcom/google/firebase/storage/p;)Lcom/google/firebase/storage/p;
    .locals 0

    iput-object p1, p0, Lcom/google/firebase/storage/o;->c:Lcom/google/firebase/storage/p;

    return-object p1
.end method

.method static synthetic c(Lcom/google/firebase/storage/o;Lcom/google/firebase/storage/o$c;)Lcom/google/firebase/storage/o$c;
    .locals 0

    iput-object p1, p0, Lcom/google/firebase/storage/o;->n:Lcom/google/firebase/storage/o$c;

    return-object p1
.end method

.method static synthetic d(Lcom/google/firebase/storage/o;Lcom/google/firebase/storage/o$c;)Lcom/google/firebase/storage/o$c;
    .locals 0

    iput-object p1, p0, Lcom/google/firebase/storage/o;->m:Lcom/google/firebase/storage/o$c;

    return-object p1
.end method

.method static synthetic e(Lcom/google/firebase/storage/o;Lcom/google/firebase/storage/o$c;)Lcom/google/firebase/storage/o$c;
    .locals 0

    iput-object p1, p0, Lcom/google/firebase/storage/o;->l:Lcom/google/firebase/storage/o$c;

    return-object p1
.end method

.method static synthetic f(Lcom/google/firebase/storage/o;)Lcom/google/firebase/storage/o$c;
    .locals 0

    iget-object p0, p0, Lcom/google/firebase/storage/o;->p:Lcom/google/firebase/storage/o$c;

    return-object p0
.end method

.method static synthetic g(Lcom/google/firebase/storage/o;Lcom/google/firebase/storage/o$c;)Lcom/google/firebase/storage/o$c;
    .locals 0

    iput-object p1, p0, Lcom/google/firebase/storage/o;->p:Lcom/google/firebase/storage/o$c;

    return-object p1
.end method

.method static synthetic h(Lcom/google/firebase/storage/o;Lcom/google/firebase/storage/o$c;)Lcom/google/firebase/storage/o$c;
    .locals 0

    iput-object p1, p0, Lcom/google/firebase/storage/o;->f:Lcom/google/firebase/storage/o$c;

    return-object p1
.end method

.method static synthetic i(Lcom/google/firebase/storage/o;Ljava/lang/String;)Ljava/lang/String;
    .locals 0

    iput-object p1, p0, Lcom/google/firebase/storage/o;->e:Ljava/lang/String;

    return-object p1
.end method

.method static synthetic j(Lcom/google/firebase/storage/o;Ljava/lang/String;)Ljava/lang/String;
    .locals 0

    iput-object p1, p0, Lcom/google/firebase/storage/o;->a:Ljava/lang/String;

    return-object p1
.end method

.method static synthetic k(Lcom/google/firebase/storage/o;Ljava/lang/String;)Ljava/lang/String;
    .locals 0

    iput-object p1, p0, Lcom/google/firebase/storage/o;->d:Ljava/lang/String;

    return-object p1
.end method

.method static synthetic l(Lcom/google/firebase/storage/o;Ljava/lang/String;)Ljava/lang/String;
    .locals 0

    iput-object p1, p0, Lcom/google/firebase/storage/o;->g:Ljava/lang/String;

    return-object p1
.end method

.method static synthetic m(Lcom/google/firebase/storage/o;Ljava/lang/String;)Ljava/lang/String;
    .locals 0

    iput-object p1, p0, Lcom/google/firebase/storage/o;->h:Ljava/lang/String;

    return-object p1
.end method

.method static synthetic n(Lcom/google/firebase/storage/o;Ljava/lang/String;)Ljava/lang/String;
    .locals 0

    iput-object p1, p0, Lcom/google/firebase/storage/o;->i:Ljava/lang/String;

    return-object p1
.end method

.method static synthetic o(Lcom/google/firebase/storage/o;J)J
    .locals 0

    iput-wide p1, p0, Lcom/google/firebase/storage/o;->j:J

    return-wide p1
.end method

.method static synthetic p(Lcom/google/firebase/storage/o;Ljava/lang/String;)Ljava/lang/String;
    .locals 0

    iput-object p1, p0, Lcom/google/firebase/storage/o;->k:Ljava/lang/String;

    return-object p1
.end method


# virtual methods
.method public A()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/google/firebase/storage/o;->e:Ljava/lang/String;

    return-object v0
.end method

.method public B()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/google/firebase/storage/o;->k:Ljava/lang/String;

    return-object v0
.end method

.method public C()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/google/firebase/storage/o;->g:Ljava/lang/String;

    return-object v0
.end method

.method public D()Ljava/lang/String;
    .locals 3

    invoke-virtual {p0}, Lcom/google/firebase/storage/o;->E()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v1

    if-eqz v1, :cond_0

    const/4 v0, 0x0

    return-object v0

    :cond_0
    const/16 v1, 0x2f

    invoke-virtual {v0, v1}, Ljava/lang/String;->lastIndexOf(I)I

    move-result v1

    const/4 v2, -0x1

    if-eq v1, v2, :cond_1

    add-int/lit8 v1, v1, 0x1

    invoke-virtual {v0, v1}, Ljava/lang/String;->substring(I)Ljava/lang/String;

    move-result-object v0

    :cond_1
    return-object v0
.end method

.method public E()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/google/firebase/storage/o;->a:Ljava/lang/String;

    if-eqz v0, :cond_0

    goto :goto_0

    :cond_0
    const-string v0, ""

    :goto_0
    return-object v0
.end method

.method public F()J
    .locals 2

    iget-wide v0, p0, Lcom/google/firebase/storage/o;->j:J

    return-wide v0
.end method

.method public G()J
    .locals 2

    iget-object v0, p0, Lcom/google/firebase/storage/o;->i:Ljava/lang/String;

    invoke-static {v0}, Lgf/i;->e(Ljava/lang/String;)J

    move-result-wide v0

    return-wide v0
.end method

.method q()Lorg/json/JSONObject;
    .locals 3

    new-instance v0, Ljava/util/HashMap;

    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    iget-object v1, p0, Lcom/google/firebase/storage/o;->f:Lcom/google/firebase/storage/o$c;

    invoke-virtual {v1}, Lcom/google/firebase/storage/o$c;->b()Z

    move-result v1

    if-eqz v1, :cond_0

    const-string v1, "contentType"

    invoke-virtual {p0}, Lcom/google/firebase/storage/o;->w()Ljava/lang/String;

    move-result-object v2

    invoke-interface {v0, v1, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    :cond_0
    iget-object v1, p0, Lcom/google/firebase/storage/o;->p:Lcom/google/firebase/storage/o$c;

    invoke-virtual {v1}, Lcom/google/firebase/storage/o$c;->b()Z

    move-result v1

    if-eqz v1, :cond_1

    new-instance v1, Lorg/json/JSONObject;

    iget-object v2, p0, Lcom/google/firebase/storage/o;->p:Lcom/google/firebase/storage/o$c;

    invoke-virtual {v2}, Lcom/google/firebase/storage/o$c;->a()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/util/Map;

    invoke-direct {v1, v2}, Lorg/json/JSONObject;-><init>(Ljava/util/Map;)V

    const-string v2, "metadata"

    invoke-interface {v0, v2, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    :cond_1
    iget-object v1, p0, Lcom/google/firebase/storage/o;->l:Lcom/google/firebase/storage/o$c;

    invoke-virtual {v1}, Lcom/google/firebase/storage/o$c;->b()Z

    move-result v1

    if-eqz v1, :cond_2

    const-string v1, "cacheControl"

    invoke-virtual {p0}, Lcom/google/firebase/storage/o;->s()Ljava/lang/String;

    move-result-object v2

    invoke-interface {v0, v1, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    :cond_2
    iget-object v1, p0, Lcom/google/firebase/storage/o;->m:Lcom/google/firebase/storage/o$c;

    invoke-virtual {v1}, Lcom/google/firebase/storage/o$c;->b()Z

    move-result v1

    if-eqz v1, :cond_3

    const-string v1, "contentDisposition"

    invoke-virtual {p0}, Lcom/google/firebase/storage/o;->t()Ljava/lang/String;

    move-result-object v2

    invoke-interface {v0, v1, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    :cond_3
    iget-object v1, p0, Lcom/google/firebase/storage/o;->n:Lcom/google/firebase/storage/o$c;

    invoke-virtual {v1}, Lcom/google/firebase/storage/o$c;->b()Z

    move-result v1

    if-eqz v1, :cond_4

    const-string v1, "contentEncoding"

    invoke-virtual {p0}, Lcom/google/firebase/storage/o;->u()Ljava/lang/String;

    move-result-object v2

    invoke-interface {v0, v1, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    :cond_4
    iget-object v1, p0, Lcom/google/firebase/storage/o;->o:Lcom/google/firebase/storage/o$c;

    invoke-virtual {v1}, Lcom/google/firebase/storage/o$c;->b()Z

    move-result v1

    if-eqz v1, :cond_5

    const-string v1, "contentLanguage"

    invoke-virtual {p0}, Lcom/google/firebase/storage/o;->v()Ljava/lang/String;

    move-result-object v2

    invoke-interface {v0, v1, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    :cond_5
    new-instance v1, Lorg/json/JSONObject;

    invoke-direct {v1, v0}, Lorg/json/JSONObject;-><init>(Ljava/util/Map;)V

    return-object v1
.end method

.method public r()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/google/firebase/storage/o;->d:Ljava/lang/String;

    return-object v0
.end method

.method public s()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/google/firebase/storage/o;->l:Lcom/google/firebase/storage/o$c;

    invoke-virtual {v0}, Lcom/google/firebase/storage/o$c;->a()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/String;

    return-object v0
.end method

.method public t()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/google/firebase/storage/o;->m:Lcom/google/firebase/storage/o$c;

    invoke-virtual {v0}, Lcom/google/firebase/storage/o$c;->a()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/String;

    return-object v0
.end method

.method public u()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/google/firebase/storage/o;->n:Lcom/google/firebase/storage/o$c;

    invoke-virtual {v0}, Lcom/google/firebase/storage/o$c;->a()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/String;

    return-object v0
.end method

.method public v()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/google/firebase/storage/o;->o:Lcom/google/firebase/storage/o$c;

    invoke-virtual {v0}, Lcom/google/firebase/storage/o$c;->a()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/String;

    return-object v0
.end method

.method public w()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/google/firebase/storage/o;->f:Lcom/google/firebase/storage/o$c;

    invoke-virtual {v0}, Lcom/google/firebase/storage/o$c;->a()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/String;

    return-object v0
.end method

.method public x()J
    .locals 2

    iget-object v0, p0, Lcom/google/firebase/storage/o;->h:Ljava/lang/String;

    invoke-static {v0}, Lgf/i;->e(Ljava/lang/String;)J

    move-result-wide v0

    return-wide v0
.end method

.method public y(Ljava/lang/String;)Ljava/lang/String;
    .locals 1

    invoke-static {p1}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-eqz v0, :cond_0

    const/4 p1, 0x0

    return-object p1

    :cond_0
    iget-object v0, p0, Lcom/google/firebase/storage/o;->p:Lcom/google/firebase/storage/o$c;

    invoke-virtual {v0}, Lcom/google/firebase/storage/o$c;->a()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/util/Map;

    invoke-interface {v0, p1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ljava/lang/String;

    return-object p1
.end method

.method public z()Ljava/util/Set;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/Set<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Lcom/google/firebase/storage/o;->p:Lcom/google/firebase/storage/o$c;

    invoke-virtual {v0}, Lcom/google/firebase/storage/o$c;->a()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/util/Map;

    invoke-interface {v0}, Ljava/util/Map;->keySet()Ljava/util/Set;

    move-result-object v0

    return-object v0
.end method

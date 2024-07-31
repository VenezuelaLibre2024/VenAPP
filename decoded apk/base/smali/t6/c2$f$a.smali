.class public final Lt6/c2$f$a;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lt6/c2$f;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "a"
.end annotation


# instance fields
.field private a:Ljava/util/UUID;

.field private b:Landroid/net/Uri;

.field private c:Lcom/google/common/collect/y;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lcom/google/common/collect/y<",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation
.end field

.field private d:Z

.field private e:Z

.field private f:Z

.field private g:Lcom/google/common/collect/w;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lcom/google/common/collect/w<",
            "Ljava/lang/Integer;",
            ">;"
        }
    .end annotation
.end field

.field private h:[B


# direct methods
.method private constructor <init>()V
    .locals 1
    .annotation runtime Ljava/lang/Deprecated;
    .end annotation

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    invoke-static {}, Lcom/google/common/collect/y;->k()Lcom/google/common/collect/y;

    move-result-object v0

    iput-object v0, p0, Lt6/c2$f$a;->c:Lcom/google/common/collect/y;

    invoke-static {}, Lcom/google/common/collect/w;->v()Lcom/google/common/collect/w;

    move-result-object v0

    iput-object v0, p0, Lt6/c2$f$a;->g:Lcom/google/common/collect/w;

    return-void
.end method

.method synthetic constructor <init>(Lt6/c2$a;)V
    .locals 0

    invoke-direct {p0}, Lt6/c2$f$a;-><init>()V

    return-void
.end method

.method private constructor <init>(Lt6/c2$f;)V
    .locals 1

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iget-object v0, p1, Lt6/c2$f;->a:Ljava/util/UUID;

    iput-object v0, p0, Lt6/c2$f$a;->a:Ljava/util/UUID;

    iget-object v0, p1, Lt6/c2$f;->c:Landroid/net/Uri;

    iput-object v0, p0, Lt6/c2$f$a;->b:Landroid/net/Uri;

    iget-object v0, p1, Lt6/c2$f;->e:Lcom/google/common/collect/y;

    iput-object v0, p0, Lt6/c2$f$a;->c:Lcom/google/common/collect/y;

    iget-boolean v0, p1, Lt6/c2$f;->f:Z

    iput-boolean v0, p0, Lt6/c2$f$a;->d:Z

    iget-boolean v0, p1, Lt6/c2$f;->g:Z

    iput-boolean v0, p0, Lt6/c2$f$a;->e:Z

    iget-boolean v0, p1, Lt6/c2$f;->h:Z

    iput-boolean v0, p0, Lt6/c2$f$a;->f:Z

    iget-object v0, p1, Lt6/c2$f;->j:Lcom/google/common/collect/w;

    iput-object v0, p0, Lt6/c2$f$a;->g:Lcom/google/common/collect/w;

    invoke-static {p1}, Lt6/c2$f;->a(Lt6/c2$f;)[B

    move-result-object p1

    iput-object p1, p0, Lt6/c2$f$a;->h:[B

    return-void
.end method

.method synthetic constructor <init>(Lt6/c2$f;Lt6/c2$a;)V
    .locals 0

    invoke-direct {p0, p1}, Lt6/c2$f$a;-><init>(Lt6/c2$f;)V

    return-void
.end method

.method static synthetic a(Lt6/c2$f$a;)Z
    .locals 0

    iget-boolean p0, p0, Lt6/c2$f$a;->d:Z

    return p0
.end method

.method static synthetic b(Lt6/c2$f$a;)Z
    .locals 0

    iget-boolean p0, p0, Lt6/c2$f$a;->e:Z

    return p0
.end method

.method static synthetic c(Lt6/c2$f$a;)Lcom/google/common/collect/w;
    .locals 0

    iget-object p0, p0, Lt6/c2$f$a;->g:Lcom/google/common/collect/w;

    return-object p0
.end method

.method static synthetic d(Lt6/c2$f$a;)[B
    .locals 0

    iget-object p0, p0, Lt6/c2$f$a;->h:[B

    return-object p0
.end method

.method static synthetic e(Lt6/c2$f$a;)Landroid/net/Uri;
    .locals 0

    iget-object p0, p0, Lt6/c2$f$a;->b:Landroid/net/Uri;

    return-object p0
.end method

.method static synthetic f(Lt6/c2$f$a;)Ljava/util/UUID;
    .locals 0

    iget-object p0, p0, Lt6/c2$f$a;->a:Ljava/util/UUID;

    return-object p0
.end method

.method static synthetic g(Lt6/c2$f$a;)Z
    .locals 0

    iget-boolean p0, p0, Lt6/c2$f$a;->f:Z

    return p0
.end method

.method static synthetic h(Lt6/c2$f$a;)Lcom/google/common/collect/y;
    .locals 0

    iget-object p0, p0, Lt6/c2$f$a;->c:Lcom/google/common/collect/y;

    return-object p0
.end method


# virtual methods
.method public i()Lt6/c2$f;
    .locals 2

    new-instance v0, Lt6/c2$f;

    const/4 v1, 0x0

    invoke-direct {v0, p0, v1}, Lt6/c2$f;-><init>(Lt6/c2$f$a;Lt6/c2$a;)V

    return-object v0
.end method

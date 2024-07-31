.class public final Lg8/f;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lt6/o;


# static fields
.field public static final c:Lg8/f;

.field private static final d:Ljava/lang/String;

.field private static final e:Ljava/lang/String;

.field public static final f:Lt6/o$a;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lt6/o$a<",
            "Lg8/f;",
            ">;"
        }
    .end annotation
.end field


# instance fields
.field public final a:Lcom/google/common/collect/w;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lcom/google/common/collect/w<",
            "Lg8/b;",
            ">;"
        }
    .end annotation
.end field

.field public final b:J


# direct methods
.method static constructor <clinit>()V
    .locals 4

    new-instance v0, Lg8/f;

    invoke-static {}, Lcom/google/common/collect/w;->v()Lcom/google/common/collect/w;

    move-result-object v1

    const-wide/16 v2, 0x0

    invoke-direct {v0, v1, v2, v3}, Lg8/f;-><init>(Ljava/util/List;J)V

    sput-object v0, Lg8/f;->c:Lg8/f;

    const/4 v0, 0x0

    invoke-static {v0}, Lt8/r0;->r0(I)Ljava/lang/String;

    move-result-object v0

    sput-object v0, Lg8/f;->d:Ljava/lang/String;

    const/4 v0, 0x1

    invoke-static {v0}, Lt8/r0;->r0(I)Ljava/lang/String;

    move-result-object v0

    sput-object v0, Lg8/f;->e:Ljava/lang/String;

    new-instance v0, Lg8/e;

    invoke-direct {v0}, Lg8/e;-><init>()V

    sput-object v0, Lg8/f;->f:Lt6/o$a;

    return-void
.end method

.method public constructor <init>(Ljava/util/List;J)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Lg8/b;",
            ">;J)V"
        }
    .end annotation

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    invoke-static {p1}, Lcom/google/common/collect/w;->r(Ljava/util/Collection;)Lcom/google/common/collect/w;

    move-result-object p1

    iput-object p1, p0, Lg8/f;->a:Lcom/google/common/collect/w;

    iput-wide p2, p0, Lg8/f;->b:J

    return-void
.end method

.method public static synthetic b(Landroid/os/Bundle;)Lg8/f;
    .locals 0

    invoke-static {p0}, Lg8/f;->d(Landroid/os/Bundle;)Lg8/f;

    move-result-object p0

    return-object p0
.end method

.method private static c(Ljava/util/List;)Lcom/google/common/collect/w;
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Lg8/b;",
            ">;)",
            "Lcom/google/common/collect/w<",
            "Lg8/b;",
            ">;"
        }
    .end annotation

    invoke-static {}, Lcom/google/common/collect/w;->p()Lcom/google/common/collect/w$a;

    move-result-object v0

    const/4 v1, 0x0

    :goto_0
    invoke-interface {p0}, Ljava/util/List;->size()I

    move-result v2

    if-ge v1, v2, :cond_1

    invoke-interface {p0, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lg8/b;

    iget-object v2, v2, Lg8/b;->d:Landroid/graphics/Bitmap;

    if-eqz v2, :cond_0

    goto :goto_1

    :cond_0
    invoke-interface {p0, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lg8/b;

    invoke-virtual {v0, v2}, Lcom/google/common/collect/w$a;->h(Ljava/lang/Object;)Lcom/google/common/collect/w$a;

    :goto_1
    add-int/lit8 v1, v1, 0x1

    goto :goto_0

    :cond_1
    invoke-virtual {v0}, Lcom/google/common/collect/w$a;->k()Lcom/google/common/collect/w;

    move-result-object p0

    return-object p0
.end method

.method private static final d(Landroid/os/Bundle;)Lg8/f;
    .locals 3

    sget-object v0, Lg8/f;->d:Ljava/lang/String;

    invoke-virtual {p0, v0}, Landroid/os/Bundle;->getParcelableArrayList(Ljava/lang/String;)Ljava/util/ArrayList;

    move-result-object v0

    if-nez v0, :cond_0

    invoke-static {}, Lcom/google/common/collect/w;->v()Lcom/google/common/collect/w;

    move-result-object v0

    goto :goto_0

    :cond_0
    sget-object v1, Lg8/b;->U:Lt6/o$a;

    invoke-static {v1, v0}, Lt8/c;->b(Lt6/o$a;Ljava/util/List;)Lcom/google/common/collect/w;

    move-result-object v0

    :goto_0
    sget-object v1, Lg8/f;->e:Ljava/lang/String;

    invoke-virtual {p0, v1}, Landroid/os/BaseBundle;->getLong(Ljava/lang/String;)J

    move-result-wide v1

    new-instance p0, Lg8/f;

    invoke-direct {p0, v0, v1, v2}, Lg8/f;-><init>(Ljava/util/List;J)V

    return-object p0
.end method


# virtual methods
.method public a()Landroid/os/Bundle;
    .locals 4

    new-instance v0, Landroid/os/Bundle;

    invoke-direct {v0}, Landroid/os/Bundle;-><init>()V

    sget-object v1, Lg8/f;->d:Ljava/lang/String;

    iget-object v2, p0, Lg8/f;->a:Lcom/google/common/collect/w;

    invoke-static {v2}, Lg8/f;->c(Ljava/util/List;)Lcom/google/common/collect/w;

    move-result-object v2

    invoke-static {v2}, Lt8/c;->d(Ljava/util/Collection;)Ljava/util/ArrayList;

    move-result-object v2

    invoke-virtual {v0, v1, v2}, Landroid/os/Bundle;->putParcelableArrayList(Ljava/lang/String;Ljava/util/ArrayList;)V

    sget-object v1, Lg8/f;->e:Ljava/lang/String;

    iget-wide v2, p0, Lg8/f;->b:J

    invoke-virtual {v0, v1, v2, v3}, Landroid/os/BaseBundle;->putLong(Ljava/lang/String;J)V

    return-object v0
.end method

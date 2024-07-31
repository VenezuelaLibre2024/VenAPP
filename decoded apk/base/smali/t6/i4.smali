.class public final Lt6/i4;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lt6/o;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lt6/i4$a;
    }
.end annotation


# static fields
.field public static final b:Lt6/i4;

.field private static final c:Ljava/lang/String;

.field public static final d:Lt6/o$a;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lt6/o$a<",
            "Lt6/i4;",
            ">;"
        }
    .end annotation
.end field


# instance fields
.field private final a:Lcom/google/common/collect/w;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lcom/google/common/collect/w<",
            "Lt6/i4$a;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method static constructor <clinit>()V
    .locals 2

    new-instance v0, Lt6/i4;

    invoke-static {}, Lcom/google/common/collect/w;->v()Lcom/google/common/collect/w;

    move-result-object v1

    invoke-direct {v0, v1}, Lt6/i4;-><init>(Ljava/util/List;)V

    sput-object v0, Lt6/i4;->b:Lt6/i4;

    const/4 v0, 0x0

    invoke-static {v0}, Lt8/r0;->r0(I)Ljava/lang/String;

    move-result-object v0

    sput-object v0, Lt6/i4;->c:Ljava/lang/String;

    new-instance v0, Lt6/g4;

    invoke-direct {v0}, Lt6/g4;-><init>()V

    sput-object v0, Lt6/i4;->d:Lt6/o$a;

    return-void
.end method

.method public constructor <init>(Ljava/util/List;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Lt6/i4$a;",
            ">;)V"
        }
    .end annotation

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    invoke-static {p1}, Lcom/google/common/collect/w;->r(Ljava/util/Collection;)Lcom/google/common/collect/w;

    move-result-object p1

    iput-object p1, p0, Lt6/i4;->a:Lcom/google/common/collect/w;

    return-void
.end method

.method public static synthetic b(Landroid/os/Bundle;)Lt6/i4;
    .locals 0

    invoke-static {p0}, Lt6/i4;->e(Landroid/os/Bundle;)Lt6/i4;

    move-result-object p0

    return-object p0
.end method

.method private static synthetic e(Landroid/os/Bundle;)Lt6/i4;
    .locals 1

    sget-object v0, Lt6/i4;->c:Ljava/lang/String;

    invoke-virtual {p0, v0}, Landroid/os/Bundle;->getParcelableArrayList(Ljava/lang/String;)Ljava/util/ArrayList;

    move-result-object p0

    if-nez p0, :cond_0

    invoke-static {}, Lcom/google/common/collect/w;->v()Lcom/google/common/collect/w;

    move-result-object p0

    goto :goto_0

    :cond_0
    sget-object v0, Lt6/i4$a;->u:Lt6/o$a;

    invoke-static {v0, p0}, Lt8/c;->b(Lt6/o$a;Ljava/util/List;)Lcom/google/common/collect/w;

    move-result-object p0

    :goto_0
    new-instance v0, Lt6/i4;

    invoke-direct {v0, p0}, Lt6/i4;-><init>(Ljava/util/List;)V

    return-object v0
.end method


# virtual methods
.method public a()Landroid/os/Bundle;
    .locals 3

    new-instance v0, Landroid/os/Bundle;

    invoke-direct {v0}, Landroid/os/Bundle;-><init>()V

    sget-object v1, Lt6/i4;->c:Ljava/lang/String;

    iget-object v2, p0, Lt6/i4;->a:Lcom/google/common/collect/w;

    invoke-static {v2}, Lt8/c;->d(Ljava/util/Collection;)Ljava/util/ArrayList;

    move-result-object v2

    invoke-virtual {v0, v1, v2}, Landroid/os/Bundle;->putParcelableArrayList(Ljava/lang/String;Ljava/util/ArrayList;)V

    return-object v0
.end method

.method public c()Lcom/google/common/collect/w;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lcom/google/common/collect/w<",
            "Lt6/i4$a;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Lt6/i4;->a:Lcom/google/common/collect/w;

    return-object v0
.end method

.method public d(I)Z
    .locals 4

    const/4 v0, 0x0

    move v1, v0

    :goto_0
    iget-object v2, p0, Lt6/i4;->a:Lcom/google/common/collect/w;

    invoke-virtual {v2}, Ljava/util/AbstractCollection;->size()I

    move-result v2

    if-ge v1, v2, :cond_1

    iget-object v2, p0, Lt6/i4;->a:Lcom/google/common/collect/w;

    invoke-interface {v2, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lt6/i4$a;

    invoke-virtual {v2}, Lt6/i4$a;->e()Z

    move-result v3

    if-eqz v3, :cond_0

    invoke-virtual {v2}, Lt6/i4$a;->d()I

    move-result v2

    if-ne v2, p1, :cond_0

    const/4 p1, 0x1

    return p1

    :cond_0
    add-int/lit8 v1, v1, 0x1

    goto :goto_0

    :cond_1
    return v0
.end method

.method public equals(Ljava/lang/Object;)Z
    .locals 2

    if-ne p0, p1, :cond_0

    const/4 p1, 0x1

    return p1

    :cond_0
    if-eqz p1, :cond_2

    const-class v0, Lt6/i4;

    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v1

    if-eq v0, v1, :cond_1

    goto :goto_0

    :cond_1
    check-cast p1, Lt6/i4;

    iget-object v0, p0, Lt6/i4;->a:Lcom/google/common/collect/w;

    iget-object p1, p1, Lt6/i4;->a:Lcom/google/common/collect/w;

    invoke-virtual {v0, p1}, Lcom/google/common/collect/w;->equals(Ljava/lang/Object;)Z

    move-result p1

    return p1

    :cond_2
    :goto_0
    const/4 p1, 0x0

    return p1
.end method

.method public hashCode()I
    .locals 1

    iget-object v0, p0, Lt6/i4;->a:Lcom/google/common/collect/w;

    invoke-virtual {v0}, Lcom/google/common/collect/w;->hashCode()I

    move-result v0

    return v0
.end method

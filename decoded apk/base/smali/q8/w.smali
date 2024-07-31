.class public final Lq8/w;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lt6/o;


# static fields
.field private static final c:Ljava/lang/String;

.field private static final d:Ljava/lang/String;

.field public static final e:Lt6/o$a;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lt6/o$a<",
            "Lq8/w;",
            ">;"
        }
    .end annotation
.end field


# instance fields
.field public final a:Lv7/d1;

.field public final b:Lcom/google/common/collect/w;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lcom/google/common/collect/w<",
            "Ljava/lang/Integer;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method static constructor <clinit>()V
    .locals 1

    const/4 v0, 0x0

    invoke-static {v0}, Lt8/r0;->r0(I)Ljava/lang/String;

    move-result-object v0

    sput-object v0, Lq8/w;->c:Ljava/lang/String;

    const/4 v0, 0x1

    invoke-static {v0}, Lt8/r0;->r0(I)Ljava/lang/String;

    move-result-object v0

    sput-object v0, Lq8/w;->d:Ljava/lang/String;

    new-instance v0, Lq8/v;

    invoke-direct {v0}, Lq8/v;-><init>()V

    sput-object v0, Lq8/w;->e:Lt6/o$a;

    return-void
.end method

.method public constructor <init>(Lv7/d1;Ljava/util/List;)V
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lv7/d1;",
            "Ljava/util/List<",
            "Ljava/lang/Integer;",
            ">;)V"
        }
    .end annotation

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    invoke-interface {p2}, Ljava/util/List;->isEmpty()Z

    move-result v0

    if-nez v0, :cond_1

    invoke-static {p2}, Ljava/util/Collections;->min(Ljava/util/Collection;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Integer;

    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    move-result v0

    if-ltz v0, :cond_0

    invoke-static {p2}, Ljava/util/Collections;->max(Ljava/util/Collection;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Integer;

    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    move-result v0

    iget v1, p1, Lv7/d1;->a:I

    if-ge v0, v1, :cond_0

    goto :goto_0

    :cond_0
    new-instance p1, Ljava/lang/IndexOutOfBoundsException;

    invoke-direct {p1}, Ljava/lang/IndexOutOfBoundsException;-><init>()V

    throw p1

    :cond_1
    :goto_0
    iput-object p1, p0, Lq8/w;->a:Lv7/d1;

    invoke-static {p2}, Lcom/google/common/collect/w;->r(Ljava/util/Collection;)Lcom/google/common/collect/w;

    move-result-object p1

    iput-object p1, p0, Lq8/w;->b:Lcom/google/common/collect/w;

    return-void
.end method

.method public static synthetic b(Landroid/os/Bundle;)Lq8/w;
    .locals 0

    invoke-static {p0}, Lq8/w;->d(Landroid/os/Bundle;)Lq8/w;

    move-result-object p0

    return-object p0
.end method

.method private static synthetic d(Landroid/os/Bundle;)Lq8/w;
    .locals 2

    sget-object v0, Lq8/w;->c:Ljava/lang/String;

    invoke-virtual {p0, v0}, Landroid/os/Bundle;->getBundle(Ljava/lang/String;)Landroid/os/Bundle;

    move-result-object v0

    invoke-static {v0}, Lt8/a;->e(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/os/Bundle;

    sget-object v1, Lv7/d1;->s:Lt6/o$a;

    invoke-interface {v1, v0}, Lt6/o$a;->a(Landroid/os/Bundle;)Lt6/o;

    move-result-object v0

    check-cast v0, Lv7/d1;

    sget-object v1, Lq8/w;->d:Ljava/lang/String;

    invoke-virtual {p0, v1}, Landroid/os/BaseBundle;->getIntArray(Ljava/lang/String;)[I

    move-result-object p0

    invoke-static {p0}, Lt8/a;->e(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p0

    check-cast p0, [I

    new-instance v1, Lq8/w;

    invoke-static {p0}, Lhb/e;->c([I)Ljava/util/List;

    move-result-object p0

    invoke-direct {v1, v0, p0}, Lq8/w;-><init>(Lv7/d1;Ljava/util/List;)V

    return-object v1
.end method


# virtual methods
.method public a()Landroid/os/Bundle;
    .locals 3

    new-instance v0, Landroid/os/Bundle;

    invoke-direct {v0}, Landroid/os/Bundle;-><init>()V

    sget-object v1, Lq8/w;->c:Ljava/lang/String;

    iget-object v2, p0, Lq8/w;->a:Lv7/d1;

    invoke-virtual {v2}, Lv7/d1;->a()Landroid/os/Bundle;

    move-result-object v2

    invoke-virtual {v0, v1, v2}, Landroid/os/Bundle;->putBundle(Ljava/lang/String;Landroid/os/Bundle;)V

    sget-object v1, Lq8/w;->d:Ljava/lang/String;

    iget-object v2, p0, Lq8/w;->b:Lcom/google/common/collect/w;

    invoke-static {v2}, Lhb/e;->l(Ljava/util/Collection;)[I

    move-result-object v2

    invoke-virtual {v0, v1, v2}, Landroid/os/BaseBundle;->putIntArray(Ljava/lang/String;[I)V

    return-object v0
.end method

.method public c()I
    .locals 1

    iget-object v0, p0, Lq8/w;->a:Lv7/d1;

    iget v0, v0, Lv7/d1;->c:I

    return v0
.end method

.method public equals(Ljava/lang/Object;)Z
    .locals 4

    const/4 v0, 0x1

    if-ne p0, p1, :cond_0

    return v0

    :cond_0
    const/4 v1, 0x0

    if-eqz p1, :cond_3

    const-class v2, Lq8/w;

    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v3

    if-eq v2, v3, :cond_1

    goto :goto_1

    :cond_1
    check-cast p1, Lq8/w;

    iget-object v2, p0, Lq8/w;->a:Lv7/d1;

    iget-object v3, p1, Lq8/w;->a:Lv7/d1;

    invoke-virtual {v2, v3}, Lv7/d1;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_2

    iget-object v2, p0, Lq8/w;->b:Lcom/google/common/collect/w;

    iget-object p1, p1, Lq8/w;->b:Lcom/google/common/collect/w;

    invoke-virtual {v2, p1}, Lcom/google/common/collect/w;->equals(Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_2

    goto :goto_0

    :cond_2
    move v0, v1

    :goto_0
    return v0

    :cond_3
    :goto_1
    return v1
.end method

.method public hashCode()I
    .locals 2

    iget-object v0, p0, Lq8/w;->a:Lv7/d1;

    invoke-virtual {v0}, Lv7/d1;->hashCode()I

    move-result v0

    iget-object v1, p0, Lq8/w;->b:Lcom/google/common/collect/w;

    invoke-virtual {v1}, Lcom/google/common/collect/w;->hashCode()I

    move-result v1

    mul-int/lit8 v1, v1, 0x1f

    add-int/2addr v0, v1

    return v0
.end method

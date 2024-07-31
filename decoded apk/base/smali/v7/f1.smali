.class public final Lv7/f1;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lt6/o;


# static fields
.field public static final d:Lv7/f1;

.field private static final e:Ljava/lang/String;

.field public static final f:Lt6/o$a;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lt6/o$a<",
            "Lv7/f1;",
            ">;"
        }
    .end annotation
.end field


# instance fields
.field public final a:I

.field private final b:Lcom/google/common/collect/w;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lcom/google/common/collect/w<",
            "Lv7/d1;",
            ">;"
        }
    .end annotation
.end field

.field private c:I


# direct methods
.method static constructor <clinit>()V
    .locals 3

    new-instance v0, Lv7/f1;

    const/4 v1, 0x0

    new-array v2, v1, [Lv7/d1;

    invoke-direct {v0, v2}, Lv7/f1;-><init>([Lv7/d1;)V

    sput-object v0, Lv7/f1;->d:Lv7/f1;

    invoke-static {v1}, Lt8/r0;->r0(I)Ljava/lang/String;

    move-result-object v0

    sput-object v0, Lv7/f1;->e:Ljava/lang/String;

    new-instance v0, Lv7/e1;

    invoke-direct {v0}, Lv7/e1;-><init>()V

    sput-object v0, Lv7/f1;->f:Lt6/o$a;

    return-void
.end method

.method public varargs constructor <init>([Lv7/d1;)V
    .locals 1

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    invoke-static {p1}, Lcom/google/common/collect/w;->s([Ljava/lang/Object;)Lcom/google/common/collect/w;

    move-result-object v0

    iput-object v0, p0, Lv7/f1;->b:Lcom/google/common/collect/w;

    array-length p1, p1

    iput p1, p0, Lv7/f1;->a:I

    invoke-direct {p0}, Lv7/f1;->f()V

    return-void
.end method

.method public static synthetic b(Landroid/os/Bundle;)Lv7/f1;
    .locals 0

    invoke-static {p0}, Lv7/f1;->e(Landroid/os/Bundle;)Lv7/f1;

    move-result-object p0

    return-object p0
.end method

.method private static synthetic e(Landroid/os/Bundle;)Lv7/f1;
    .locals 3

    sget-object v0, Lv7/f1;->e:Ljava/lang/String;

    invoke-virtual {p0, v0}, Landroid/os/Bundle;->getParcelableArrayList(Ljava/lang/String;)Ljava/util/ArrayList;

    move-result-object p0

    const/4 v0, 0x0

    if-nez p0, :cond_0

    new-instance p0, Lv7/f1;

    new-array v0, v0, [Lv7/d1;

    invoke-direct {p0, v0}, Lv7/f1;-><init>([Lv7/d1;)V

    return-object p0

    :cond_0
    new-instance v1, Lv7/f1;

    sget-object v2, Lv7/d1;->s:Lt6/o$a;

    invoke-static {v2, p0}, Lt8/c;->b(Lt6/o$a;Ljava/util/List;)Lcom/google/common/collect/w;

    move-result-object p0

    new-array v0, v0, [Lv7/d1;

    invoke-virtual {p0, v0}, Lcom/google/common/collect/u;->toArray([Ljava/lang/Object;)[Ljava/lang/Object;

    move-result-object p0

    check-cast p0, [Lv7/d1;

    invoke-direct {v1, p0}, Lv7/f1;-><init>([Lv7/d1;)V

    return-object v1
.end method

.method private f()V
    .locals 6

    const/4 v0, 0x0

    :goto_0
    iget-object v1, p0, Lv7/f1;->b:Lcom/google/common/collect/w;

    invoke-virtual {v1}, Ljava/util/AbstractCollection;->size()I

    move-result v1

    if-ge v0, v1, :cond_2

    add-int/lit8 v1, v0, 0x1

    move v2, v1

    :goto_1
    iget-object v3, p0, Lv7/f1;->b:Lcom/google/common/collect/w;

    invoke-virtual {v3}, Ljava/util/AbstractCollection;->size()I

    move-result v3

    if-ge v2, v3, :cond_1

    iget-object v3, p0, Lv7/f1;->b:Lcom/google/common/collect/w;

    invoke-interface {v3, v0}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Lv7/d1;

    iget-object v4, p0, Lv7/f1;->b:Lcom/google/common/collect/w;

    invoke-interface {v4, v2}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v4

    invoke-virtual {v3, v4}, Lv7/d1;->equals(Ljava/lang/Object;)Z

    move-result v3

    if-eqz v3, :cond_0

    new-instance v3, Ljava/lang/IllegalArgumentException;

    const-string v4, "Multiple identical TrackGroups added to one TrackGroupArray."

    invoke-direct {v3, v4}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    const-string v4, "TrackGroupArray"

    const-string v5, ""

    invoke-static {v4, v5, v3}, Lt8/s;->d(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    :cond_0
    add-int/lit8 v2, v2, 0x1

    goto :goto_1

    :cond_1
    move v0, v1

    goto :goto_0

    :cond_2
    return-void
.end method


# virtual methods
.method public a()Landroid/os/Bundle;
    .locals 3

    new-instance v0, Landroid/os/Bundle;

    invoke-direct {v0}, Landroid/os/Bundle;-><init>()V

    sget-object v1, Lv7/f1;->e:Ljava/lang/String;

    iget-object v2, p0, Lv7/f1;->b:Lcom/google/common/collect/w;

    invoke-static {v2}, Lt8/c;->d(Ljava/util/Collection;)Ljava/util/ArrayList;

    move-result-object v2

    invoke-virtual {v0, v1, v2}, Landroid/os/Bundle;->putParcelableArrayList(Ljava/lang/String;Ljava/util/ArrayList;)V

    return-object v0
.end method

.method public c(I)Lv7/d1;
    .locals 1

    iget-object v0, p0, Lv7/f1;->b:Lcom/google/common/collect/w;

    invoke-interface {v0, p1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lv7/d1;

    return-object p1
.end method

.method public d(Lv7/d1;)I
    .locals 1

    iget-object v0, p0, Lv7/f1;->b:Lcom/google/common/collect/w;

    invoke-virtual {v0, p1}, Lcom/google/common/collect/w;->indexOf(Ljava/lang/Object;)I

    move-result p1

    if-ltz p1, :cond_0

    goto :goto_0

    :cond_0
    const/4 p1, -0x1

    :goto_0
    return p1
.end method

.method public equals(Ljava/lang/Object;)Z
    .locals 4

    const/4 v0, 0x1

    if-ne p0, p1, :cond_0

    return v0

    :cond_0
    const/4 v1, 0x0

    if-eqz p1, :cond_3

    const-class v2, Lv7/f1;

    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v3

    if-eq v2, v3, :cond_1

    goto :goto_1

    :cond_1
    check-cast p1, Lv7/f1;

    iget v2, p0, Lv7/f1;->a:I

    iget v3, p1, Lv7/f1;->a:I

    if-ne v2, v3, :cond_2

    iget-object v2, p0, Lv7/f1;->b:Lcom/google/common/collect/w;

    iget-object p1, p1, Lv7/f1;->b:Lcom/google/common/collect/w;

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
    .locals 1

    iget v0, p0, Lv7/f1;->c:I

    if-nez v0, :cond_0

    iget-object v0, p0, Lv7/f1;->b:Lcom/google/common/collect/w;

    invoke-virtual {v0}, Lcom/google/common/collect/w;->hashCode()I

    move-result v0

    iput v0, p0, Lv7/f1;->c:I

    :cond_0
    iget v0, p0, Lv7/f1;->c:I

    return v0
.end method

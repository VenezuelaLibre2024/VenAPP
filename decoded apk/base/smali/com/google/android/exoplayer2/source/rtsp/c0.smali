.class final Lcom/google/android/exoplayer2/source/rtsp/c0;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/google/android/exoplayer2/source/rtsp/c0$b;
    }
.end annotation


# instance fields
.field public final a:Lcom/google/common/collect/y;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lcom/google/common/collect/y<",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation
.end field

.field public final b:Lcom/google/common/collect/w;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lcom/google/common/collect/w<",
            "Lcom/google/android/exoplayer2/source/rtsp/a;",
            ">;"
        }
    .end annotation
.end field

.field public final c:Ljava/lang/String;

.field public final d:Ljava/lang/String;

.field public final e:Ljava/lang/String;

.field public final f:I

.field public final g:Landroid/net/Uri;

.field public final h:Ljava/lang/String;

.field public final i:Ljava/lang/String;

.field public final j:Ljava/lang/String;

.field public final k:Ljava/lang/String;

.field public final l:Ljava/lang/String;


# direct methods
.method private constructor <init>(Lcom/google/android/exoplayer2/source/rtsp/c0$b;)V
    .locals 1

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    invoke-static {p1}, Lcom/google/android/exoplayer2/source/rtsp/c0$b;->a(Lcom/google/android/exoplayer2/source/rtsp/c0$b;)Ljava/util/HashMap;

    move-result-object v0

    invoke-static {v0}, Lcom/google/common/collect/y;->c(Ljava/util/Map;)Lcom/google/common/collect/y;

    move-result-object v0

    iput-object v0, p0, Lcom/google/android/exoplayer2/source/rtsp/c0;->a:Lcom/google/common/collect/y;

    invoke-static {p1}, Lcom/google/android/exoplayer2/source/rtsp/c0$b;->e(Lcom/google/android/exoplayer2/source/rtsp/c0$b;)Lcom/google/common/collect/w$a;

    move-result-object v0

    invoke-virtual {v0}, Lcom/google/common/collect/w$a;->k()Lcom/google/common/collect/w;

    move-result-object v0

    iput-object v0, p0, Lcom/google/android/exoplayer2/source/rtsp/c0;->b:Lcom/google/common/collect/w;

    invoke-static {p1}, Lcom/google/android/exoplayer2/source/rtsp/c0$b;->f(Lcom/google/android/exoplayer2/source/rtsp/c0$b;)Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lt8/r0;->j(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/String;

    iput-object v0, p0, Lcom/google/android/exoplayer2/source/rtsp/c0;->c:Ljava/lang/String;

    invoke-static {p1}, Lcom/google/android/exoplayer2/source/rtsp/c0$b;->g(Lcom/google/android/exoplayer2/source/rtsp/c0$b;)Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lt8/r0;->j(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/String;

    iput-object v0, p0, Lcom/google/android/exoplayer2/source/rtsp/c0;->d:Ljava/lang/String;

    invoke-static {p1}, Lcom/google/android/exoplayer2/source/rtsp/c0$b;->h(Lcom/google/android/exoplayer2/source/rtsp/c0$b;)Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lt8/r0;->j(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/String;

    iput-object v0, p0, Lcom/google/android/exoplayer2/source/rtsp/c0;->e:Ljava/lang/String;

    invoke-static {p1}, Lcom/google/android/exoplayer2/source/rtsp/c0$b;->i(Lcom/google/android/exoplayer2/source/rtsp/c0$b;)Landroid/net/Uri;

    move-result-object v0

    iput-object v0, p0, Lcom/google/android/exoplayer2/source/rtsp/c0;->g:Landroid/net/Uri;

    invoke-static {p1}, Lcom/google/android/exoplayer2/source/rtsp/c0$b;->j(Lcom/google/android/exoplayer2/source/rtsp/c0$b;)Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcom/google/android/exoplayer2/source/rtsp/c0;->h:Ljava/lang/String;

    invoke-static {p1}, Lcom/google/android/exoplayer2/source/rtsp/c0$b;->k(Lcom/google/android/exoplayer2/source/rtsp/c0$b;)I

    move-result v0

    iput v0, p0, Lcom/google/android/exoplayer2/source/rtsp/c0;->f:I

    invoke-static {p1}, Lcom/google/android/exoplayer2/source/rtsp/c0$b;->l(Lcom/google/android/exoplayer2/source/rtsp/c0$b;)Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcom/google/android/exoplayer2/source/rtsp/c0;->i:Ljava/lang/String;

    invoke-static {p1}, Lcom/google/android/exoplayer2/source/rtsp/c0$b;->b(Lcom/google/android/exoplayer2/source/rtsp/c0$b;)Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcom/google/android/exoplayer2/source/rtsp/c0;->j:Ljava/lang/String;

    invoke-static {p1}, Lcom/google/android/exoplayer2/source/rtsp/c0$b;->c(Lcom/google/android/exoplayer2/source/rtsp/c0$b;)Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcom/google/android/exoplayer2/source/rtsp/c0;->k:Ljava/lang/String;

    invoke-static {p1}, Lcom/google/android/exoplayer2/source/rtsp/c0$b;->d(Lcom/google/android/exoplayer2/source/rtsp/c0$b;)Ljava/lang/String;

    move-result-object p1

    iput-object p1, p0, Lcom/google/android/exoplayer2/source/rtsp/c0;->l:Ljava/lang/String;

    return-void
.end method

.method synthetic constructor <init>(Lcom/google/android/exoplayer2/source/rtsp/c0$b;Lcom/google/android/exoplayer2/source/rtsp/c0$a;)V
    .locals 0

    invoke-direct {p0, p1}, Lcom/google/android/exoplayer2/source/rtsp/c0;-><init>(Lcom/google/android/exoplayer2/source/rtsp/c0$b;)V

    return-void
.end method


# virtual methods
.method public equals(Ljava/lang/Object;)Z
    .locals 4

    const/4 v0, 0x1

    if-ne p0, p1, :cond_0

    return v0

    :cond_0
    const/4 v1, 0x0

    if-eqz p1, :cond_3

    const-class v2, Lcom/google/android/exoplayer2/source/rtsp/c0;

    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v3

    if-eq v2, v3, :cond_1

    goto/16 :goto_1

    :cond_1
    check-cast p1, Lcom/google/android/exoplayer2/source/rtsp/c0;

    iget v2, p0, Lcom/google/android/exoplayer2/source/rtsp/c0;->f:I

    iget v3, p1, Lcom/google/android/exoplayer2/source/rtsp/c0;->f:I

    if-ne v2, v3, :cond_2

    iget-object v2, p0, Lcom/google/android/exoplayer2/source/rtsp/c0;->a:Lcom/google/common/collect/y;

    iget-object v3, p1, Lcom/google/android/exoplayer2/source/rtsp/c0;->a:Lcom/google/common/collect/y;

    invoke-virtual {v2, v3}, Lcom/google/common/collect/y;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_2

    iget-object v2, p0, Lcom/google/android/exoplayer2/source/rtsp/c0;->b:Lcom/google/common/collect/w;

    iget-object v3, p1, Lcom/google/android/exoplayer2/source/rtsp/c0;->b:Lcom/google/common/collect/w;

    invoke-virtual {v2, v3}, Lcom/google/common/collect/w;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_2

    iget-object v2, p0, Lcom/google/android/exoplayer2/source/rtsp/c0;->d:Ljava/lang/String;

    iget-object v3, p1, Lcom/google/android/exoplayer2/source/rtsp/c0;->d:Ljava/lang/String;

    invoke-virtual {v2, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_2

    iget-object v2, p0, Lcom/google/android/exoplayer2/source/rtsp/c0;->c:Ljava/lang/String;

    iget-object v3, p1, Lcom/google/android/exoplayer2/source/rtsp/c0;->c:Ljava/lang/String;

    invoke-virtual {v2, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_2

    iget-object v2, p0, Lcom/google/android/exoplayer2/source/rtsp/c0;->e:Ljava/lang/String;

    iget-object v3, p1, Lcom/google/android/exoplayer2/source/rtsp/c0;->e:Ljava/lang/String;

    invoke-virtual {v2, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_2

    iget-object v2, p0, Lcom/google/android/exoplayer2/source/rtsp/c0;->l:Ljava/lang/String;

    iget-object v3, p1, Lcom/google/android/exoplayer2/source/rtsp/c0;->l:Ljava/lang/String;

    invoke-static {v2, v3}, Lt8/r0;->c(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_2

    iget-object v2, p0, Lcom/google/android/exoplayer2/source/rtsp/c0;->g:Landroid/net/Uri;

    iget-object v3, p1, Lcom/google/android/exoplayer2/source/rtsp/c0;->g:Landroid/net/Uri;

    invoke-static {v2, v3}, Lt8/r0;->c(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_2

    iget-object v2, p0, Lcom/google/android/exoplayer2/source/rtsp/c0;->j:Ljava/lang/String;

    iget-object v3, p1, Lcom/google/android/exoplayer2/source/rtsp/c0;->j:Ljava/lang/String;

    invoke-static {v2, v3}, Lt8/r0;->c(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_2

    iget-object v2, p0, Lcom/google/android/exoplayer2/source/rtsp/c0;->k:Ljava/lang/String;

    iget-object v3, p1, Lcom/google/android/exoplayer2/source/rtsp/c0;->k:Ljava/lang/String;

    invoke-static {v2, v3}, Lt8/r0;->c(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_2

    iget-object v2, p0, Lcom/google/android/exoplayer2/source/rtsp/c0;->h:Ljava/lang/String;

    iget-object v3, p1, Lcom/google/android/exoplayer2/source/rtsp/c0;->h:Ljava/lang/String;

    invoke-static {v2, v3}, Lt8/r0;->c(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_2

    iget-object v2, p0, Lcom/google/android/exoplayer2/source/rtsp/c0;->i:Ljava/lang/String;

    iget-object p1, p1, Lcom/google/android/exoplayer2/source/rtsp/c0;->i:Ljava/lang/String;

    invoke-static {v2, p1}, Lt8/r0;->c(Ljava/lang/Object;Ljava/lang/Object;)Z

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
    .locals 3

    iget-object v0, p0, Lcom/google/android/exoplayer2/source/rtsp/c0;->a:Lcom/google/common/collect/y;

    invoke-virtual {v0}, Lcom/google/common/collect/y;->hashCode()I

    move-result v0

    const/16 v1, 0xd9

    add-int/2addr v1, v0

    mul-int/lit8 v1, v1, 0x1f

    iget-object v0, p0, Lcom/google/android/exoplayer2/source/rtsp/c0;->b:Lcom/google/common/collect/w;

    invoke-virtual {v0}, Lcom/google/common/collect/w;->hashCode()I

    move-result v0

    add-int/2addr v1, v0

    mul-int/lit8 v1, v1, 0x1f

    iget-object v0, p0, Lcom/google/android/exoplayer2/source/rtsp/c0;->d:Ljava/lang/String;

    invoke-virtual {v0}, Ljava/lang/String;->hashCode()I

    move-result v0

    add-int/2addr v1, v0

    mul-int/lit8 v1, v1, 0x1f

    iget-object v0, p0, Lcom/google/android/exoplayer2/source/rtsp/c0;->c:Ljava/lang/String;

    invoke-virtual {v0}, Ljava/lang/String;->hashCode()I

    move-result v0

    add-int/2addr v1, v0

    mul-int/lit8 v1, v1, 0x1f

    iget-object v0, p0, Lcom/google/android/exoplayer2/source/rtsp/c0;->e:Ljava/lang/String;

    invoke-virtual {v0}, Ljava/lang/String;->hashCode()I

    move-result v0

    add-int/2addr v1, v0

    mul-int/lit8 v1, v1, 0x1f

    iget v0, p0, Lcom/google/android/exoplayer2/source/rtsp/c0;->f:I

    add-int/2addr v1, v0

    mul-int/lit8 v1, v1, 0x1f

    iget-object v0, p0, Lcom/google/android/exoplayer2/source/rtsp/c0;->l:Ljava/lang/String;

    const/4 v2, 0x0

    if-nez v0, :cond_0

    move v0, v2

    goto :goto_0

    :cond_0
    invoke-virtual {v0}, Ljava/lang/String;->hashCode()I

    move-result v0

    :goto_0
    add-int/2addr v1, v0

    mul-int/lit8 v1, v1, 0x1f

    iget-object v0, p0, Lcom/google/android/exoplayer2/source/rtsp/c0;->g:Landroid/net/Uri;

    if-nez v0, :cond_1

    move v0, v2

    goto :goto_1

    :cond_1
    invoke-virtual {v0}, Landroid/net/Uri;->hashCode()I

    move-result v0

    :goto_1
    add-int/2addr v1, v0

    mul-int/lit8 v1, v1, 0x1f

    iget-object v0, p0, Lcom/google/android/exoplayer2/source/rtsp/c0;->j:Ljava/lang/String;

    if-nez v0, :cond_2

    move v0, v2

    goto :goto_2

    :cond_2
    invoke-virtual {v0}, Ljava/lang/String;->hashCode()I

    move-result v0

    :goto_2
    add-int/2addr v1, v0

    mul-int/lit8 v1, v1, 0x1f

    iget-object v0, p0, Lcom/google/android/exoplayer2/source/rtsp/c0;->k:Ljava/lang/String;

    if-nez v0, :cond_3

    move v0, v2

    goto :goto_3

    :cond_3
    invoke-virtual {v0}, Ljava/lang/String;->hashCode()I

    move-result v0

    :goto_3
    add-int/2addr v1, v0

    mul-int/lit8 v1, v1, 0x1f

    iget-object v0, p0, Lcom/google/android/exoplayer2/source/rtsp/c0;->h:Ljava/lang/String;

    if-nez v0, :cond_4

    move v0, v2

    goto :goto_4

    :cond_4
    invoke-virtual {v0}, Ljava/lang/String;->hashCode()I

    move-result v0

    :goto_4
    add-int/2addr v1, v0

    mul-int/lit8 v1, v1, 0x1f

    iget-object v0, p0, Lcom/google/android/exoplayer2/source/rtsp/c0;->i:Ljava/lang/String;

    if-nez v0, :cond_5

    goto :goto_5

    :cond_5
    invoke-virtual {v0}, Ljava/lang/String;->hashCode()I

    move-result v2

    :goto_5
    add-int/2addr v1, v2

    return v1
.end method

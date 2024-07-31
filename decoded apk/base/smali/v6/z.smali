.class public abstract Lv6/z;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lv6/i;


# instance fields
.field protected b:Lv6/i$a;

.field protected c:Lv6/i$a;

.field private d:Lv6/i$a;

.field private e:Lv6/i$a;

.field private f:Ljava/nio/ByteBuffer;

.field private g:Ljava/nio/ByteBuffer;

.field private h:Z


# direct methods
.method public constructor <init>()V
    .locals 1

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    sget-object v0, Lv6/i;->a:Ljava/nio/ByteBuffer;

    iput-object v0, p0, Lv6/z;->f:Ljava/nio/ByteBuffer;

    iput-object v0, p0, Lv6/z;->g:Ljava/nio/ByteBuffer;

    sget-object v0, Lv6/i$a;->e:Lv6/i$a;

    iput-object v0, p0, Lv6/z;->d:Lv6/i$a;

    iput-object v0, p0, Lv6/z;->e:Lv6/i$a;

    iput-object v0, p0, Lv6/z;->b:Lv6/i$a;

    iput-object v0, p0, Lv6/z;->c:Lv6/i$a;

    return-void
.end method


# virtual methods
.method public a()Z
    .locals 2

    iget-object v0, p0, Lv6/z;->e:Lv6/i$a;

    sget-object v1, Lv6/i$a;->e:Lv6/i$a;

    if-eq v0, v1, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    return v0
.end method

.method public b()Ljava/nio/ByteBuffer;
    .locals 2

    iget-object v0, p0, Lv6/z;->g:Ljava/nio/ByteBuffer;

    sget-object v1, Lv6/i;->a:Ljava/nio/ByteBuffer;

    iput-object v1, p0, Lv6/z;->g:Ljava/nio/ByteBuffer;

    return-object v0
.end method

.method public final c(Lv6/i$a;)Lv6/i$a;
    .locals 0

    iput-object p1, p0, Lv6/z;->d:Lv6/i$a;

    invoke-virtual {p0, p1}, Lv6/z;->h(Lv6/i$a;)Lv6/i$a;

    move-result-object p1

    iput-object p1, p0, Lv6/z;->e:Lv6/i$a;

    invoke-virtual {p0}, Lv6/z;->a()Z

    move-result p1

    if-eqz p1, :cond_0

    iget-object p1, p0, Lv6/z;->e:Lv6/i$a;

    goto :goto_0

    :cond_0
    sget-object p1, Lv6/i$a;->e:Lv6/i$a;

    :goto_0
    return-object p1
.end method

.method public e()Z
    .locals 2

    iget-boolean v0, p0, Lv6/z;->h:Z

    if-eqz v0, :cond_0

    iget-object v0, p0, Lv6/z;->g:Ljava/nio/ByteBuffer;

    sget-object v1, Lv6/i;->a:Ljava/nio/ByteBuffer;

    if-ne v0, v1, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    return v0
.end method

.method public final f()V
    .locals 1

    const/4 v0, 0x1

    iput-boolean v0, p0, Lv6/z;->h:Z

    invoke-virtual {p0}, Lv6/z;->j()V

    return-void
.end method

.method public final flush()V
    .locals 1

    sget-object v0, Lv6/i;->a:Ljava/nio/ByteBuffer;

    iput-object v0, p0, Lv6/z;->g:Ljava/nio/ByteBuffer;

    const/4 v0, 0x0

    iput-boolean v0, p0, Lv6/z;->h:Z

    iget-object v0, p0, Lv6/z;->d:Lv6/i$a;

    iput-object v0, p0, Lv6/z;->b:Lv6/i$a;

    iget-object v0, p0, Lv6/z;->e:Lv6/i$a;

    iput-object v0, p0, Lv6/z;->c:Lv6/i$a;

    invoke-virtual {p0}, Lv6/z;->i()V

    return-void
.end method

.method protected final g()Z
    .locals 1

    iget-object v0, p0, Lv6/z;->g:Ljava/nio/ByteBuffer;

    invoke-virtual {v0}, Ljava/nio/Buffer;->hasRemaining()Z

    move-result v0

    return v0
.end method

.method protected abstract h(Lv6/i$a;)Lv6/i$a;
.end method

.method protected i()V
    .locals 0

    return-void
.end method

.method protected j()V
    .locals 0

    return-void
.end method

.method protected k()V
    .locals 0

    return-void
.end method

.method protected final l(I)Ljava/nio/ByteBuffer;
    .locals 1

    iget-object v0, p0, Lv6/z;->f:Ljava/nio/ByteBuffer;

    invoke-virtual {v0}, Ljava/nio/Buffer;->capacity()I

    move-result v0

    if-ge v0, p1, :cond_0

    invoke-static {p1}, Ljava/nio/ByteBuffer;->allocateDirect(I)Ljava/nio/ByteBuffer;

    move-result-object p1

    invoke-static {}, Ljava/nio/ByteOrder;->nativeOrder()Ljava/nio/ByteOrder;

    move-result-object v0

    invoke-virtual {p1, v0}, Ljava/nio/ByteBuffer;->order(Ljava/nio/ByteOrder;)Ljava/nio/ByteBuffer;

    move-result-object p1

    iput-object p1, p0, Lv6/z;->f:Ljava/nio/ByteBuffer;

    goto :goto_0

    :cond_0
    iget-object p1, p0, Lv6/z;->f:Ljava/nio/ByteBuffer;

    invoke-virtual {p1}, Ljava/nio/ByteBuffer;->clear()Ljava/nio/Buffer;

    :goto_0
    iget-object p1, p0, Lv6/z;->f:Ljava/nio/ByteBuffer;

    iput-object p1, p0, Lv6/z;->g:Ljava/nio/ByteBuffer;

    return-object p1
.end method

.method public final reset()V
    .locals 1

    invoke-virtual {p0}, Lv6/z;->flush()V

    sget-object v0, Lv6/i;->a:Ljava/nio/ByteBuffer;

    iput-object v0, p0, Lv6/z;->f:Ljava/nio/ByteBuffer;

    sget-object v0, Lv6/i$a;->e:Lv6/i$a;

    iput-object v0, p0, Lv6/z;->d:Lv6/i$a;

    iput-object v0, p0, Lv6/z;->e:Lv6/i$a;

    iput-object v0, p0, Lv6/z;->b:Lv6/i$a;

    iput-object v0, p0, Lv6/z;->c:Lv6/i$a;

    invoke-virtual {p0}, Lv6/z;->k()V

    return-void
.end method

.class public Lzk/z1;
.super Lzk/d2;
.source "SourceFile"

# interfaces
.implements Lzk/y;


# instance fields
.field private final c:Z


# direct methods
.method public constructor <init>(Lzk/w1;)V
    .locals 1

    const/4 v0, 0x1

    invoke-direct {p0, v0}, Lzk/d2;-><init>(Z)V

    invoke-virtual {p0, p1}, Lzk/d2;->b0(Lzk/w1;)V

    invoke-direct {p0}, Lzk/z1;->N0()Z

    move-result p1

    iput-boolean p1, p0, Lzk/z1;->c:Z

    return-void
.end method

.method private final N0()Z
    .locals 4

    invoke-virtual {p0}, Lzk/d2;->X()Lzk/s;

    move-result-object v0

    instance-of v1, v0, Lzk/t;

    const/4 v2, 0x0

    if-eqz v1, :cond_0

    check-cast v0, Lzk/t;

    goto :goto_0

    :cond_0
    move-object v0, v2

    :goto_0
    const/4 v1, 0x0

    if-eqz v0, :cond_4

    invoke-virtual {v0}, Lzk/c2;->w()Lzk/d2;

    move-result-object v0

    if-nez v0, :cond_1

    goto :goto_2

    :cond_1
    invoke-virtual {v0}, Lzk/d2;->T()Z

    move-result v3

    if-eqz v3, :cond_2

    const/4 v0, 0x1

    return v0

    :cond_2
    invoke-virtual {v0}, Lzk/d2;->X()Lzk/s;

    move-result-object v0

    instance-of v3, v0, Lzk/t;

    if-eqz v3, :cond_3

    check-cast v0, Lzk/t;

    goto :goto_1

    :cond_3
    move-object v0, v2

    :goto_1
    if-eqz v0, :cond_4

    invoke-virtual {v0}, Lzk/c2;->w()Lzk/d2;

    move-result-object v0

    if-nez v0, :cond_1

    :cond_4
    :goto_2
    return v1
.end method


# virtual methods
.method public T()Z
    .locals 1

    iget-boolean v0, p0, Lzk/z1;->c:Z

    return v0
.end method

.method public V()Z
    .locals 1

    const/4 v0, 0x1

    return v0
.end method
